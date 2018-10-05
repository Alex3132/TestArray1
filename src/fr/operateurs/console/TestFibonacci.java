package fr.operateurs.console;


import java.util.Scanner;

public class TestFibonacci {
    public void test(){
        //val1 = 0
        int valN = 0;
        //val2 = 1;
        int valN_1 = 1;
        int valN_2= valN+valN_1;

        System.out.println("Combien de rang voulez vous ? ");
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();

          for(int i=0;i<total;i++){
              valN = valN_1;
              valN_1 = valN_2;
              valN_2= valN+valN_1;
              System.out.println(valN);// show result valN
          }


    }
}
