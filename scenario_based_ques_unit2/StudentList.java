package scenario_based_ques_unit2;

import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {

        String[] arr = new String[3];

        arr[0] = "Amit";
        arr[1] = "Neha";
        arr[2] = "Rahul";

        ArrayList<String> list = new ArrayList<>();

        list.add("Amit");
        list.add("Neha");
        list.add("Rahul");

        list.add("Priya");
        list.remove("Neha");

        System.out.println("Array Size: " + arr.length);
        System.out.println("ArrayList Size: " + list.size());

        System.out.println("Array Elements:");
        for (String s : arr) {
            System.out.println(s);
        }

        System.out.println("ArrayList Elements:");
        for (String s : list) {
            System.out.println(s);
        }
    }
}

