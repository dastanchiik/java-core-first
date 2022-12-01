package abstracts;

public class Person2 extends Person{

    private String gender;

    public Person2(String name, int age, double height,String gender) {
        super(name, age, height);
        this.gender = gender;
    }



    @Override
    public String toString() {
        return super.toString()+'\''+
                "gender='" + gender + '\'' +
                '}';
    }
}
