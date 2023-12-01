import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola, Java!");

        String myString = "Esto es una cadena de texto";
        myString = "Aquí cambio el valor de la cadena de texto";
        System.out.println(myString);

        final String myConstant = "Esto es una cadena de texto";

        Integer myInt = 7;
        myInt = myInt + 4;

        System.out.println(myInt);
        System.out.println(myInt - 1);

        Double myDouble = 6.5;
        System.out.println(myDouble);

        Float myFloat =6.5f;
        System.out.println(myFloat);

        System.out.println(myDouble + " " + myString + " " + myFloat + " " + myInt );

        Boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        myBoolean = null;
        System.out.println(myBoolean);

        myFloat = null;
        if (myFloat != null) {
        System.out.println(myFloat + 10);
        } else {
            System.out.println("My Float es nulo");
        }

        if (myInt == 11) {
            System.out.println("myInt == 11");
        } else if (myInt == 12) {
            System.out.println("myInt == 12");
        } else{
            System.out.println("El valor no es ni 11 ni 12");
        }

        List<String> myList = new ArrayList();
        myList.add(myString);
        myList.add(myInt.toString());
        System.out.println(myList);

        Map<String, String> myMap = new HashMap();
        myMap.put("string", myString);
        myMap.put("int", myInt.toString());
        System.out.println(myMap);
        System.out.println(myMap.get("int"));


        for (int i = 0; i < myList.size() ; i++) {
            myList.get(i);
            System.out.println(myList.get(i));

        }
        Main myMain = new Main();
        System.out.println(myMain.myFunction(5,2));
        System.out.println(myMain.myFunction(3,126389));
    }

    public int myFunction(int myFirstNumber, int mySecondNumber){
        return myFirstNumber + mySecondNumber;
    }

}
