package fr.operateurs.console;


import java.util.Arrays;

public class TestArrayTri {
    public void test(){
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        Arrays.sort(array);
        System.out.println("Tableau trié "+ Arrays.toString(array));
    }

}
