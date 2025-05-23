import java.util.Arrays;

public class ArrayUebungen {

    public static void main(String[] args) {
        char[] word = {'J', 'a', 'v', 'a'};

        for(char c : word) {
            System.out.print(c);
        }
    }

    //Aufgabe 1
    public static int getSum(int[] elements){

        int sum = 0;

        /*
        for (int i=0; i < elements.length; i++) {
            sum = sum + elements[i];
        }
         */
        // zähl"schleife" als Kurzform:

        for (int e : elements){         // für alle integer Werte 'e' aus dem Array 'elements'
            sum = sum + e;
        }
        return sum;

        /*
        int x=0;
        return x;
         */
    }

    //Aufgabe 2
    public static int getSum(int[] [] elements){

        int sum = 0;

        for (int[] e : elements){
            sum = sum + getSum(e);
        }

        return sum;
        /*int x=0;
        return x;
         */
    }

    //Aufgabe 3
    public static int[] concatenate(int[] arr1, int[] arr2){

        int n = arr1.length+arr2.length;
        int[] arrNew = new int[n];

        for (int i=0; i<arr1.length; i++){
            arrNew[i] = arr1[i];
        }
        for (int i=0; i<arr2.length; i++){
            arrNew[arr1.length+i] = arr2[i];
        }

        return arrNew;
    }

    //Aufgabe 4
    public static int[] filter(int[] arr, int min, int max){

        int n = 0;
        for (int e : arr) {
            if (e >= min && e <= max) {
                n++;
            }
        }
        int[] arrNew = new int[n];

        n = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] >= min && arr[i] <= max) {
                arrNew[n] = arr[i];
                n++;
            }
        }

        return arrNew;
    }
}