package fr.operateurs.console;

class TestArray1 {
    void test() {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};


        for (int i = 0; i < array.length; i++) {

            System.out.println("Dans l'ordre " +array[i]);
        }


        for (int i = array.length - 1; i > 0; i--) {

            System.out.println("Dans le désordre "+array[i]);
        }


        for (int i = 0; i < array.length; i++) {

            if (array[i] > 3) {
                System.out.println("Nombre au dessus de 3 : "+array[i]);
            }
        }

        for ( int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                System.out.println("Nombre pairs : " + array[i]);
            }

        }

        int minValue = 0;
        int maxValue = 0;

        for ( int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {

                minValue = array[i];

            } else if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
            System.out.println("Valeur min " + minValue);
            System.out.println("Valeur max "+maxValue);

            }
          }