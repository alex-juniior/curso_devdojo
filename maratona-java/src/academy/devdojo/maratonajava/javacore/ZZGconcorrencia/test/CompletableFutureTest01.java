package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();

//        searchPricesSync(storeService);
//        searchPricesAsyncFuture(storeService);
        searchPricesAsyncCompletableFuture(storeService);

    }

    private static void searchPricesSync(StoreService storeService) {
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Strore 1"));
        System.out.println(storeService.getPriceSync("Strore 2"));
        System.out.println(storeService.getPriceSync("Strore 3"));
        System.out.println(storeService.getPriceSync("Strore 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }

    private static void searchPricesAsyncFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        Future<Double> pricesAsyncFuture = storeService.getPricesAsyncFuture("Strore 1");
        Future<Double> pricesAsyncFuture1 = storeService.getPricesAsyncFuture("Strore 2");
        Future<Double> pricesAsyncFuture2 = storeService.getPricesAsyncFuture("Strore 3");
        Future<Double> pricesAsyncFuture3 = storeService.getPricesAsyncFuture("Strore 4");
        try {
            System.out.println(pricesAsyncFuture.get());
            System.out.println(pricesAsyncFuture1.get());
            System.out.println(pricesAsyncFuture2.get());
            System.out.println(pricesAsyncFuture3.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
        StoreService.shutdown();
    }


    private static void searchCompletablePricesSync(StoreService storeService) {
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Strore 1"));
        System.out.println(storeService.getPriceSync("Strore 2"));
        System.out.println(storeService.getPriceSync("Strore 3"));
        System.out.println(storeService.getPriceSync("Strore 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        CompletableFuture<Double> pricesAsyncFuture = storeService.getPricesAsyncCompletableFuture("Strore 1");
        CompletableFuture<Double> pricesAsyncFuture1 = storeService.getPricesAsyncCompletableFuture("Strore 2");
        CompletableFuture<Double> pricesAsyncFuture2 = storeService.getPricesAsyncCompletableFuture("Strore 3");
        CompletableFuture<Double> pricesAsyncFuture3 = storeService.getPricesAsyncCompletableFuture("Strore 4");
        System.out.println(pricesAsyncFuture.join());
        System.out.println(pricesAsyncFuture1.join());
        System.out.println(pricesAsyncFuture2.join());
        System.out.println(pricesAsyncFuture3.join());
       
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
        StoreService.shutdown();
    }


}
