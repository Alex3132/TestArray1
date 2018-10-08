package fr.operateurs.console;

import java.util.HashSet;
import java.util.Set;

class TestArray2 {
    void test() {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
       int somme = 0;
        Set<Integer> arraySet = new HashSet<Integer>(array.length); //
        int duplicateCount =0;

        for(int i=0;i<array.length;i++){
           somme+=+array[i];
       }
        int averageValue = somme / array.length;
        System.out.println(averageValue);

        for(int i=0;i<array.length;i++){
            if(array[i]==15){
                System.out.println("Il est là dans l'emplacement "+i);
            }
            if(!arraySet.add(array[i])){
                duplicateCount++;
            }

        }
        System.out.println(duplicateCount);


    }
}
