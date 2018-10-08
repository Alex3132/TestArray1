package fr.operateurs.console;


import java.util.Scanner;

class TestFibonacci {
    void test(){ // function

        int valN = 0; // first number
        int valN_1 = 1;// second number
        int valN_2= valN+valN_1;// sum of 2 numbers

        System.out.println("Combien de rang voulez vous ? "); // We demamnd number of ranks
        Scanner sc = new Scanner(System.in); // scanner
        int total = sc.nextInt();

          for(int i=0;i<total;i++){
              valN = valN_1; // valN receive valN_1
              valN_1 = valN_2;
              valN_2= valN+valN_1;
              System.out.println(valN);// show result valN
          }


    }
}
