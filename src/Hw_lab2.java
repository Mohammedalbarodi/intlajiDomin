/**
 * Created by Mohammed Albarodi on 07/03/2021.
 */
public class Hw_lab2 {

public <E>void C_3_17(E []arr,E x){

        int k=0;

        for (int i = 0; i <arr.length ; i++) {
            if (x==arr[i]){
                k++;
            }
        }
if (k>1){
            System.out.println("repeated ="+k);
        }
if (k==0){
            System.out.println("not fond =");
        }
if (k==1){
            System.out.println("not repeated");

        }}

    public <E>void C_3_18(E arr[]){
        for (int i = 0; i <arr.length ; i++) {
            int j, k = 0;
            for (j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    k++;
                }
            }
            if (k > 1 || arr[i] != arr[j - 1])
                System.out.println("repeat " + arr[i] + "= " + k);
        }}


}

