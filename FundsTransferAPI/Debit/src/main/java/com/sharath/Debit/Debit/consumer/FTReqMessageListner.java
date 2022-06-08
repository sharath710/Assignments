package com.sharath.Debit.Debit.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.sharath.Debit.Debit.payload.FundsTransferRequest;




@Component
public class FTReqMessageListner {
	
	@Value("${fundsTransferRequest.topic.name}")
	private String topicName;
	
	@KafkaListener(
	topicPartitions = @TopicPartition(topic="${fundstransfer.topic.name}",partitions= {"0","1","2","3","4"}),
	containerFactory = "fundsTransferReqKafkaListnerContainerFactory")
	
	public void FTMessageListner(FundsTransferRequest req) {
		
		System.out.println("From Consumer...");
		System.out.println(req);
		
	}

}
