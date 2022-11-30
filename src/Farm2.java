import java.util.Arrays;

public class Farm2 {
    private String nameFarm2;
    private Cow[] cow;
    private Sheep[] sheep;
    private Horse[] horse;

    public Farm2( String nameFarm2, Cow[] cow, Sheep[] sheep, Horse[] horse) {
        this.nameFarm2 = nameFarm2;
        this.cow = cow;
        this.sheep = sheep;
        this.horse = horse;
    }

    @Override
    public String toString() {
        return "Farm2{" +
                "nameFarm2='" + nameFarm2 + '\'' +"\n"+
                ", cow=" + Arrays.toString(cow) +"\n"+
                ", sheep=" + Arrays.toString(sheep) +"\n"+
                ", horse=" + Arrays.toString(horse) +"\n";
    }
}