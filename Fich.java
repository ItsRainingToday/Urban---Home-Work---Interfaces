public class Fich implements Swimmable {
    String name;
    int age;

    public Fich(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println("Рыба можеть плавать");
    }
}
