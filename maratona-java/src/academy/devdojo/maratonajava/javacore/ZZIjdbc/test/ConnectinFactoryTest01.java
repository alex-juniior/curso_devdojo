package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectinFactoryTest01 {
    public static void main(String[] args) {
       /*Logs log4j2
        log.info("info");
        log.debug("debug");
        log.warn("warn");
        log.error("error");
        log.trace("trace");*/
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("madhouse").build();
//        ProducerService.save(producer);
//        ProducerService.delete(5);
//        ProducerService.updated(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        log.info("Producers found '{} ", producers);

//        List<Producer> producers = ProducerService.findAByNamel("Mad");
//        log.info("Producers found '{} ", producers);

//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 pictures");
//        log.info("Producers found '{}' ", producers);
//        ProducerService.findByNameAndDelete("A-1 pictures");
//        List<Producer> producers = ProducerService.findByNamePrepareStatement("Dio");
//        log.info("Producers found '{}' ", producers);
//        ProducerService.updatedPrepareStatement(producerToUpdate);
        List<Producer> producers = ProducerService.findByNamePrepareStatement("NHK");
        log.info("Producers found '{}' ", producers);


    }
}
