package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ListedekiElemanlarıToplama {
    /*
    verilen integeer bir listedeki
    tüm elemanları toplayıp sonucu yadırın.
     */
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(3,6,8,1,3,5,6));
        System.out.println(list); // [3, 6, 8, 1, 3, 5, 6]
    }
}
