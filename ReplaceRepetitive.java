package exercise.pkg6;

import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceRepetitive {

    static String i;
    static String[] j;
    static String k;
    static ArrayList<String> list = new ArrayList<>();

    public static void Test1() {
        i = "I want to to go to the the zoo";
        j = i.split("\\s+");
        k = "";
        System.out.println("Input:I want to to go to the the zoo");
        System.out.print("Expect out:");
        repeat();
        System.out.println("Real output: I want REPEAT go to REPEAT zoo ");
        list.removeAll(list);
    }

    public static void Test2() {
        i = "I want to to go to swimming";

        j = i.split("\\s+");
        k = "";
        System.out.println("Input:I want to to go to swiming");
        System.out.print("Expect out: ");
        repeat();
        System.out.println("I REPEAT go to swimming ");
        list.removeAll(list);
    }

    public static void Test3() {
        i = "I go to the the school";

        j = i.split("\\s+");
        k = "";
        System.out.println("I go to the the school");
        System.out.print("Expect out:");
        repeat();
        System.out.println("Real output: I go to REPEAT school ");
        list.removeAll(list);
    }

    public static void Test4() {
        i = "Do you you want kill me";

        j = i.split("\\s+");
        k = "";
        System.out.println("Input:Do you you want kill me");
        System.out.print("Expect out:");
        repeat();
        System.out.println("Real output: Do REPEAT want kill me");
        list.removeAll(list);
    }

    public static void Test5() {
        i = "Hoang Huu Thien Thien Dong";

        j = i.split("\\s+");
        k = "";
        System.out.println("Input:");
        System.out.print("Expect out:Hoang Huu Thien Thien Dong");
        repeat();
        System.out.println("Real output:Hoang Huu REPEAT Dong ");
        list.removeAll(list);
    }

    public static void repeat() {

        for (int i = 0; i < j.length; i++) {
            if (i < j.length - 1 && j[i].equals(j[i + 1])) {
                j[i] = " ";
                j[i + 1] = "REPEAT";
                i++;
            }
            list.add(j[i]);
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Test1();
        Test2();
        Test3();
        Test4();
        Test5();
    }
}
