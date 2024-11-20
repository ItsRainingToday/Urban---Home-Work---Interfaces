//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Swimmable human = new Human("Алексей",43);
        Swimmable fich = new Fich("Немо",2);
        Flyable bird = new Bird("Кеша",3);
        human.swim();
        fich.swim();
        bird.fly();
    }
}