package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// BEGIN
public class App {

    public static ArrayList buildAppartmentsList(List <Home> appartments, int n) {
        List <Home> sorted = new ArrayList<>();
        for (Home obj: appartments) {
            sorted.add(obj);
        }
        sorted.sort(new Comparator<Home>() {
            @Override
            public int compare(Home obj1, Home obj2) {
                return Double.compare(obj1.getArea(), obj2.getArea());
            }
        });
        List <String> result = new ArrayList<>();
        for (Home obj: sorted) {
            result.add(obj.toString());
            if(result.size() == n) {
                break;
            }
        }
        return (ArrayList) result;

    }

    public static void main(String[] args) {


        List<Home> appart = new ArrayList<>(List.of(
                new Flat(41, 3, 10),
                new Cottage(125.5, 2),
                new Flat(80, 10, 2),
                new Cottage(150, 3)
        ));

        List<String> res = App.buildAppartmentsList(appart, 2);
        System.out.println(res);

    }
}
// END
