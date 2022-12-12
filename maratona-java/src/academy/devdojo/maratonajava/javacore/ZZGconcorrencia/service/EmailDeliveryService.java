package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service;


import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Members;

public class EmailDeliveryService implements Runnable{
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting to delive emails");
        while (members.isOpen() || members.pedingEmails() > 0){
            try {
                String email = members.retrieveEmail();
                if (email == null) continue;
                System.out.println(threadName + " enviado email para "+email);
                Thread.sleep(2000);
                System.out.println(threadName + " enviou email com sucesso para "+email);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Todos emails foram enviados com sucesso");
    }
}
