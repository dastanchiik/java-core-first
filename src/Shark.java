public class Shark extends Animal implements Flyable{

    public Shark(String name, int age, String color) {
        super(name, age, color);
    }


    @Override
    public String toString() {
        return "Shark:"+super.toString();
    }

    @Override
    public void fly() {
        System.out.println("swimming fast");
    }
}
