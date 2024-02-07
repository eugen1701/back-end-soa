package ro.ubb.soa.eflocea.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class EmailKafkaConsumer {

    private final EmailService emailService;

    public EmailKafkaConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    @KafkaListener(topics = "order-topic", groupId = "email-group")
    public void listen(ChainsawStoreOrder order) {
        // Process the received order and send confirmation email
        String to = order.getEmailAddress();
        String subject = "Order Confirmation";
        String text = "Thank you for your order!\n\nOrder details:\n" + order.toString();

        emailService.sendOrderConfirmationEmail(to, subject, text);
    }
}