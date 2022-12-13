public class Duck extends Animal implements Flyable{
    public Duck(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void fly() {
        System.out.println("swimming on water");
    }

    @Override
    public String toString() {
        return "Duck: "+super.toString();
    }
}




