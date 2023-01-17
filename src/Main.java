import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String>list = new HashSet<>();
        String[] arr = {"France\n" +
                "Finland\n" +
                "Panama\n" +
                "Portugal\n" +
                "Poland\n" +
                "Russia\n" +
                "New Zealand\n" +
                "Mexico\n" +
                "China\n" +
                "Afghanistan\n" +
                "Indonesia\n" +
                "Brazil\n" +
                "Russia\n" +
                "Brazil\n" +
                "Palau\n" +
                "Philippines\n" +
                "Czech Republic\n" +
                "Philippines\n" +
                "Indonesia\n" +
                "China\n" +
                "China\n" +
                "Cyprus\n" +
                "Czech Republic\n" +
                "Thailand\n" +
                "Philippines\n" +
                "China\n" +
                "Brazil\n" +
                "China\n" +
                "United States\n" +
                "Portugal\n" +
                "Portugal\n" +
                "Egypt\n" +
                "Thailand\n" +
                "Spain\n" +
                "China\n" +
                "Macedonia\n" +
                "Morocco\n" +
                "Russia\n" +
                "China\n" +
                "Pakistan\n" +
                "Philippines\n" +
                "China\n" +
                "China\n" +
                "Peru\n" +
                "Iran\n" +
                "United States\n" +
                "Indonesia\n" +
                "Latvia\n" +
                "Germany\n" +
                "Albania\n" +
                "China\n" +
                "China\n" +
                "Russia\n" +
                "Vietnam\n" +
                "Brazil\n" +
                "Germany\n" +
                "Taiwan\n" +
                "Russia\n" +
                "Russia\n" +
                "Brazil\n" +
                "Indonesia\n" +
                "Thailand\n" +
                "China\n" +
                "China\n" +
                "Indonesia\n" +
                "China\n" +
                "Argentina\n" +
                "Sweden\n" +
                "China\n" +
                "Russia\n" +
                "Indonesia\n" +
                "Thailand\n" +
                "Poland\n" +
                "Cameroon\n" +
                "Brazil\n" +
                "Morocco\n" +
                "Philippines\n" +
                "Russia\n" +
                "China\n" +
                "Peru\n" +
                "Indonesia\n" +
                "China\n" +
                "Poland\n" +
                "Sweden\n" +
                "Jordan\n" +
                "United States\n" +
                "Uruguay\n" +
                "Indonesia\n" +
                "France\n" +
                "China\n" +
                "Armenia\n" +
                "China\n" +
                "Sierra Leone\n" +
                "Greece\n" +
                "China\n" +
                "Indonesia\n" +
                "Russia\n" +
                "Indonesia\n" +
                "China\n" +
                "France\n" +
                "Myanmar\n" +
                "Belarus\n" +
                "Albania\n" +
                "Afghanistan\n" +
                "Russia\n" +
                "Iran\n" +
                "Brazil\n" +
                "Japan\n" +
                "China\n" +
                "Indonesia\n" +
                "Russia\n" +
                "Argentina\n" +
                "Norway\n" +
                "Brazil\n" +
                "Indonesia\n" +
                "Morocco\n" +
                "Malaysia\n" +
                "China\n" +
                "Netherlands\n" +
                "Indonesia\n" +
                "China\n" +
                "Nepal\n" +
                "Russia\n" +
                "Poland\n" +
                "Indonesia\n" +
                "China\n" +
                "Portugal\n" +
                "Indonesia\n" +
                "France\n" +
                "Cameroon\n" +
                "Sweden\n" +
                "Japan\n" +
                "Greece\n" +
                "France\n" +
                "China\n" +
                "Norway\n" +
                "Japan\n" +
                "United States\n" +
                "China\n" +
                "Sweden\n" +
                "Sudan\n" +
                "Russia\n" +
                "Peru\n" +
                "Democratic Republic of the Congo\n" +
                "Iran\n" +
                "Cambodia\n" +
                "Mongolia\n" +
                "United States\n" +
                "Poland\n" +
                "Brazil\n" +
                "Indonesia\n" +
                "China\n" +
                "France\n" +
                "Indonesia\n" +
                "Bosnia and Herzegovina\n" +
                "China\n" +
                "Afghanistan\n" +
                "China\n" +
                "Ukraine\n" +
                "Kenya\n" +
                "Philippines\n" +
                "Indonesia\n" +
                "Indonesia\n" +
                "Portugal\n" +
                "Brazil\n" +
                "Indonesia\n" +
                "Russia\n" +
                "China\n" +
                "Pakistan\n" +
                "Pakistan\n" +
                "Honduras\n" +
                "Norway\n" +
                "Poland\n" +
                "Portugal\n" +
                "China\n" +
                "China\n" +
                "Indonesia\n" +
                "China\n" +
                "Indonesia\n" +
                "Portugal\n" +
                "Russia\n" +
                "Greece\n" +
                "Nigeria\n" +
                "Russia\n" +
                "Japan\n" +
                "Latvia\n" +
                "China\n" +
                "China\n" +
                "El Salvador\n" +
                "United States\n" +
                "China\n" +
                "China\n" +
                "Kazakhstan\n" +
                "Peru\n" +
                "China\n" +
                "Honduras\n" +
                "Guatemala\n" +
                "China\n" +
                "Honduras\n" +
                "Indonesia\n" +
                "China\n" +
                "Philippines\n" +
                "Poland\n" +
                "China\n" +
                "China\n" +
                "Greece\n" +
                "Russia\n" +
                "Poland\n" +
                "France\n" +
                "Mexico\n" +
                "Indonesia\n" +
                "China\n" +
                "France\n" +
                "Indonesia\n" +
                "Indonesia\n" +
                "Honduras\n" +
                "Bangladesh\n" +
                "Jordan\n" +
                "China\n" +
                "Brazil\n" +
                "China\n" +
                "Russia\n" +
                "Tunisia\n" +
                "Japan\n" +
                "China\n" +
                "Indonesia\n" +
                "China\n" +
                "Thailand\n" +
                "Andorra\n" +
                "China\n" +
                "Brazil\n" +
                "Colombia\n" +
                "United States\n" +
                "France\n" +
                "Japan\n" +
                "Portugal\n" +
                "Portugal\n" +
                "China\n" +
                "Portugal\n" +
                "Russia\n" +
                "Brazil\n" +
                "Philippines\n" +
                "Lithuania\n" +
                "Nicaragua\n" +
                "Philippines\n" +
                "Indonesia\n" +
                "Serbia\n" +
                "Costa Rica\n" +
                "South Africa\n" +
                "China\n" +
                "Ethiopia\n" +
                "Philippines\n" +
                "Canada\n" +
                "Costa Rica\n" +
                "Brazil\n" +
                "Philippines\n" +
                "Lithuania\n" ,
                "Argentina\n" ,
                "Honduras\n" ,
                "China\n" ,
                "Madagascar\n" ,
                "China\n" ,
                "Costa Rica\n" ,
                "Denmark\n" ,
                "Philippines\n" ,
                "Mexico\n" ,
                "Ukraine\n" ,
                "Spain\n" ,
                "Sweden\n" ,
                "Brazil\n" ,
                "Indonesia\n" ,
                "Philippines\n" ,
                "Russia\n" ,
                "China\n" ,
                "Portugal\n" ,
                "Thailand\n"};
        for (int i = 0; i < 500; i++) {

    list.add(arr[i]);
        }
        System.out.println(list);
    }
}
