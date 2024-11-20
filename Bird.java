public class Bird implements Flyable {
    String name;
    int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public void fly() {
        System.out.println("Птица может летать");
    }
}
