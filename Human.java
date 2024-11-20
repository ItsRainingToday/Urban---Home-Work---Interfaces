public class Human implements Swimmable{
    String name;
    int age;
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println("Человек может плавать брасов");
    }
}
