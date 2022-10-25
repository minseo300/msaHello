package msahello.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import msahello.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import msahello.domain.*;


@Service
@Transactional
public class PolicyHandler{
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='HelloPlaced'")
    public void wheneverHelloPlaced_StartHello(@Payload HelloPlaced helloPlaced){

        HelloPlaced event = helloPlaced;
        System.out.println("\n\n##### listener StartHello : " + helloPlaced + "\n\n");


        

        // Sample Logic //

        

    }

}


