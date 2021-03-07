/**
 * Created by Mohammed Albarodi on 08/03/2021.
 */
public class Genric_Arrays <T,E>{

    public void merge(T[] arr, E[] arr2) {
        Object[] arr3=new Object[arr.length+arr2.length];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = (Object) arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr.length + i] = (Object) arr2[i];
        }
        for (int i = 0; i <arr3.length ; i++) {
            System.out.println(arr3[i]);
        }}

    public void  lnverse(T[] e){
        int n = e.length - 1;
        for (int i = 0; i < n / 2; i++) {
            T t = (T) e[i];
            e[i] = e[n];
            e[n] = t;
            n--;
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(e[i]);
        }}



}
