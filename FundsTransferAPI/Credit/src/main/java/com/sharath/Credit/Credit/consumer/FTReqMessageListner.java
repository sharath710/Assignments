package com.sharath.Credit.Credit.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;






@Component
public class FTReqMessageListner {
	
	@Value("${fundsTransferRequest.topic.name}")
	private String topicName;
	
	@KafkaListener(
	topicPartitions = @TopicPartition(topic="${fundstransfer.topic.name}",partitions= {"0","1","2","3","4"}),
	containerFactory = "fundsTransferReqKafkaListnerContainerFactory")
	
	public void FTMessageListner(com.sharath.Credit.Credit.payload.FundsTransferRequest req) {
		
		System.out.println("From Consumer...");
		System.out.println(req);
		
	}

}
