package ro.ubb.soa.eflocea.config;

//@Configuration
//@EnableKafka
//public class KafkaConfig {
//    @Bean
//    public Map<String, Object> producerConfigs() {
//        Map<String, Object> props = new HashMap<>();
//
//        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
//        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class.getName());
//        return props;
//    }
//
//    @Bean
//    public ProducerFactory<String, ChainsawStoreOrder> producerFactory() {
//        return new DefaultKafkaProducerFactory<>(producerConfigs());
//    }
//
//    @Bean
//    public KafkaTemplate<String, ChainsawStoreOrder> kafkaTemplate() {
//        KafkaTemplate<String, ChainsawStoreOrder> kafkaTemplate = new KafkaTemplate<>(producerFactory());
//        kafkaTemplate.setMessageConverter(new StringJsonMessageConverter());
//        kafkaTemplate.setDefaultTopic("order-topic");
//        return kafkaTemplate;
//    }
//}