package academy.devdojo.maratonajava.javacore.ZZAclasesinternas.test;

public class OuterClassesTest02 {
    private String name = "Midoriya";
//abstrat ou final
    void print(final String param){
        class LocalClass{
            String lastName = "Izuku";
            public void printLocal(){
//                System.out.println(param);
                System.out.println(name + " "+ lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("");
    }
}
