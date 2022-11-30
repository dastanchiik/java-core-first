public class Sheep extends Animal{
    private String nickName;

    public Sheep(int weight, int age, String gender, String nickName) {
        super(weight, age, gender);
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return
                "nickName='" + nickName + '\''+
                super.toString() ;
    }
}
