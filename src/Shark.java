public class Shark extends Animal{

    public Shark(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public String toString() {
        return "Shark:"+super.toString();
    }
}
