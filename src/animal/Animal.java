package animal;

public abstract class Animal {
    private int weight;
    private int age;
    private String gender;

    public Animal() {
    }

    public Animal(int weight, int age, String gender) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "weight='" + weight + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}'+"\n";
    }
}
