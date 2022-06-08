package com.sharath.Debit.Debit.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

@Configuration
@EnableKafka

public class KafkaConsumerConfig {
	
	@Value(value="${fundstransfer.topic.name}")
	private String topicName;
	
	
	@Value(value="${kafka.bootStrapAddress}")
	private String bootStrapAddress;
	
	public ConsumerFactory<String, com.sharath.Debit.Debit.payload.FundsTransferRequest> fundsTransferConsumerFactory(){
		
		Map<String, Object> props = new HashMap<>();
		
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootStrapAddress);
		props.put(ConsumerConfig.GROUP_ID_CONFIG, "fundsTransferReq");
		
		JsonDeserializer<com.sharath.Debit.Debit.payload.FundsTransferRequest> customerReqJsonDeserializer = new JsonDeserializer<>(com.sharath.Debit.Debit.payload.FundsTransferRequest.class);
		customerReqJsonDeserializer.addTrustedPackages("*");
		
		return new DefaultKafkaConsumerFactory<>(props,new StringDeserializer(),customerReqJsonDeserializer);
	
	}
	
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String,com.sharath.Debit.Debit.payload.FundsTransferRequest> fundsTransferReqKafkaListnerContainerFactory(){
		ConcurrentKafkaListenerContainerFactory<String, com.sharath.Debit.Debit.payload.FundsTransferRequest> factory = new ConcurrentKafkaListenerContainerFactory<>();
		
		factory.setConsumerFactory(fundsTransferConsumerFactory());
		
		return factory;
		
		
	}
	

}
