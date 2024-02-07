package ro.ubb.soa.eflocea.services;

//
//@Service
//public class EmailProducer {
//
//    private final KafkaTemplate<String, ChainsawStoreOrder> kafkaTemplate;
//
//    @Autowired
//    public EmailProducer(KafkaTemplate<String, ChainsawStoreOrder> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    public void sendEmail(ChainsawStoreOrder order) {
//        kafkaTemplate.send("order-topic", order);
//    }
//}