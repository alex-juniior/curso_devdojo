package academy.devdojo.maratonajava.javacore.ZZAclasesinternas.test;

public class OuterClassesTest03 {
    private String name = "WIalliam";

    static class Nested {
        private String lastName = "Suane";

        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }

    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();

    }
}
