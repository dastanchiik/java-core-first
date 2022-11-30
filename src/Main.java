public class Main {
    public static void main(String[] args) {
     animal();
    }
    public static void animal(){

     Cow cow = new Cow(300,3,"male","Masha");
     Cow cow1 = new Cow(233,4,"female","Targyl");
     Cow cow2 = new Cow(200,2,"female","krivaya");
     Cow cow3 = new Cow(200,2,"male","Misha");
     Cow cow4 = new Cow(400,5,"male","Tashbash");
     Cow[] cow5 = {cow,cow1,cow2,cow3,cow4};
     Cow[] cow6 = {cow4};
     Horse horse = new Horse(200,3,"male","Shumkar");
     Horse horse1 = new Horse(100,1,"female","Kashka");
     Horse[] horses = {horse,horse1};
     Horse[] horse2 = {horse};
     Sheep sheep = new Sheep(50,2,"male","Megamisha");
     Sheep sheep1 = new Sheep(40,2,"female","Meka");
     Sheep sheep2 = new Sheep(60,4,"female","Tolstushka");
     Sheep[] sheep3 = {sheep,sheep1,sheep2};
     Sheep[] sheep4 = {sheep};
     Farm farm = new Farm("Kok-jar",cow5,sheep3,horses);
     System.out.println(farm);
     Farm2 farm2 = new Farm2("Kok-Tash",cow6,sheep4,horse2);
     System.out.println(farm2);
    }
}