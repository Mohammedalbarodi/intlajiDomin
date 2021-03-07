import java.util.Random;

/**
 * Created by Mohammed Albarodi on 07/03/2021.
 */
public class Aray_lab2 {
   private <E> void remove(E arr[] ,int index ){
       if (index>=0&&index<arr.length){
           int j=index;
           while (j<arr.length-1){
               arr[j]=arr[j+1];
               j++;
           }arr[j]=null;
       }
   }


///////////////////////
public int seqsearch (int arr[], int value) {
    int i = 0;
    boolean flag = false;
    int index = i;
    while (!flag && i< arr.length) {
        if (arr[i] == value) {
            flag = true;
            index = i;}

        i++;
    }
    return  index;}
/////////////////////////////
private void insertionsort (int arr[]){
    for (int i = 1; i < arr.length; i++) {
        int car=arr[i];
        int j=i;
        while (j>0&&car<arr[j-1]){
            arr[j]=arr[j-1];
            j--;
        }
        arr[j]=car;}
}
////////////////////////////////
private void fillrandom(int arr[]){
    Random r=new Random();
    r.setSeed(System.currentTimeMillis());
    for (int i = 0; i <arr.length ; i++) {
        arr[i]=r.nextInt(10);}}
///////////////////////////////////

























}
