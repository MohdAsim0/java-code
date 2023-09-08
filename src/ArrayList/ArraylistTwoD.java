package ArrayList;
import java.util.*;

public class ArraylistTwoD {
    public static void main(String[] args) {

        ArrayList<String> foodList=new ArrayList<>();
        foodList.add("Samosa");
        foodList.add("Pasta");
        foodList.add("Chola");

        ArrayList<String> spicesList=new ArrayList<>();
        spicesList.add("dhania");
        spicesList.add("mirch");
        spicesList.add("garam masala");

        ArrayList<ArrayList<String>> groceryList=new ArrayList<>();
        groceryList.add(foodList);
        groceryList.add(spicesList);

//        System.out.println(foodList);
//        System.out.println(spicesList);
        System.out.println(groceryList);


    }
}
