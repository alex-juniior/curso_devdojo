package academy.devdojo.maratonajava.javacore.ZZIjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProduceRepository;

import java.util.List;

public class ProducerService {

    public static void save(Producer producer) {
        ProduceRepository.save(producer);
    }

    public static void saveTransaction(List<Producer> producers){
        ProduceRepository.saveTransaction(producers);
    }

    public static void delete(Integer id) {
        requireValidId(id);
        ProduceRepository.delete(id);
    }

    public static void updated(Producer producer) {
        requireValidId(producer.getId());
        ProduceRepository.update(producer);
    }

    public static void updatedPrepareStatement(Producer producer) {
        requireValidId(producer.getId());
        ProduceRepository.updatePrepareStatement(producer);
    }

    public static List<Producer> findAll() {
        return ProduceRepository.findAll();
    }

    public static List<Producer> findAByName(String name) {

        return ProduceRepository.findByName(name);
    }
    public static List<Producer> findByNamePrepareStatement(String name) {

        return ProduceRepository.findByNamePrepareStatement(name);
    }
    public static List<Producer> findByNameCallableStatement(String name) {

        return ProduceRepository.findByNameCallableStatement(name);
    }

    public static void showProducerMetaData() {
        ProduceRepository.showProducerMetaData();
    }

    public static void showDriverMetaData() {
        ProduceRepository.showDriverMetaData();
    }

    public static void showTypeScrollWorking() {
        ProduceRepository.showTypeScrollWorking();
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {

        return ProduceRepository.findByNameAndUpdateToUpperCase(name);
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {

        return ProduceRepository.findByNameAndInsertWhenNotFound(name);
    }

    public static void findByNameAndDelete(String name) {
        ProduceRepository.findByNameAndDelete(name);
    }

    private static void requireValidId(Integer id) {
        if (id == null && id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
    }


}


