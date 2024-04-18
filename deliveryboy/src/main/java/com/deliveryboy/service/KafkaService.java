package com.deliveryboy.service;

import com.deliveryboy.config.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    private Logger logger = LoggerFactory.getLogger(KafkaService.class);

    private static int times = 0;

    public Boolean updateLocation(String location){
        kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
        logger.info("message produced-"+times++);
        return true;
    }
}
