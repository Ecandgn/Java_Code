package day19_arrays;

import java.util.Arrays;

public class C02_TumElemanlariArttırma {
    public static void main(String[] args) {

        /*
        Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
olusturun. Eski array’i yeni haliyle kaydedin ve yazdırın
         */
        int[] arr = {4, 7, 2};
     arr = elemanlariArtir(arr,2);
       System.out.println("array in son hali; " + Arrays.toString(arr));
    }

    public static  int[] elemanlariArtir(int[] arr, int artisMiktari) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + artisMiktari;
        }
        return arr;
    }

}

