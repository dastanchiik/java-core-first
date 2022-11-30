import java.util.Arrays;

public class Farm {
    private String nameFarm;

    private Cow[] cow;
    private Sheep[] sheep;
    private Horse[] horse;

    public Farm(String nameFarm,Cow[] cow, Sheep[] sheep, Horse[] horse) {
        this.nameFarm = nameFarm;
        this.cow = cow;
        this.sheep = sheep;
        this.horse = horse;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "nameFarm='" + nameFarm + '\'' +"\n"+
                " cow=" + Arrays.toString(cow) +"\n"+
                " sheep=" + Arrays.toString(sheep) +"\n"+
                " horse=" + Arrays.toString(horse) +"\n";
    }
}