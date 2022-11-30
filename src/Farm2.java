import java.util.Arrays;

public class Farm2 {
    private String nameFarm2;
    private String ownerName;
    private Cow[] cow;
    private Sheep[] sheep;
    private Horse[] horse;

    public Farm2( String nameFarm2, Cow[] cow, Sheep[] sheep, Horse[] horse,String ownerName) {
        this.nameFarm2 = nameFarm2;
        this.cow = cow;
        this.sheep = sheep;
        this.horse = horse;
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "nameFarm 2='" + nameFarm2 + '\'' +
                ", ownerName='" + ownerName + '\'' +"\n"+
                ", cow=" + Arrays.toString(cow) +"\n"+
                ", sheep=" + Arrays.toString(sheep) +"\n"+
                ", horse=" + Arrays.toString(horse) +"\n"+
                '}';
}
}