package academy.devdojo.maratonajava.javacore.ZZAclasesinternas.test;

class Animal{
    public void walk(){
        System.out.println("Animal walking");
    }
}

public class AnonymouwsClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();

    }
}
