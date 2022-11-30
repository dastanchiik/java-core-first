import java.util.Arrays;

public class Farm {
    private String nameFarm;
    private String ownerName;

    private Cow[] cow;
    private Sheep[] sheep;
    private Horse[] horse;

    public Farm(String nameFarm,Cow[] cow, Sheep[] sheep, Horse[] horse,String ownerName) {
        this.nameFarm = nameFarm;
        this.cow = cow;
        this.sheep = sheep;
        this.horse = horse;
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "nameFarm='" + nameFarm + '\'' +
                ", ownerName='" + ownerName + '\'' +"\n"+
                ", cow=" + Arrays.toString(cow) +"\n"+
                ", sheep=" + Arrays.toString(sheep) +"\n"+
                ", horse=" + Arrays.toString(horse) +"\n"+
                '}';
    }
}