package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

import java.util.concurrent.*;

public class LinkedTranferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        //ConcurrentLinkedQueue, LinkedBlockingQueue, SynchronousQueue
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("alex"));
        System.out.println(tq.offer("junior"));
        System.out.println(tq.offer("junior", 10, TimeUnit.SECONDS));
        tq.put("DevDojo");
        if (tq.hasWaitingConsumer()){
            tq.transfer("DevDojo");
        }
        System.out.println(tq.tryTransfer("Academy"));
        System.out.println(tq.tryTransfer("Academy", 5 , TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}
