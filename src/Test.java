import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by air on 17-8-3.
 */
public class Test {

    public static void main(String[] args){

        int[] list = {5,4,8,6,10,2,1,3,7,9};

//        int[] list = {3,4,2,1};
//        maopao(list);
//        select(list);
//        charu(list);
        quick(list,0,9);
    }

    public static void maopao(int[] array){

        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }


    public static void select(int[] array){

        int temp,min;

        for (int i = 0; i < array.length-1; i++) {

            min = i;

            for (int j = i+1; j < array.length; j++) {
                if (array[min]>array[j]){
                    min = j;
                }
            }

            if (i!=min){
                System.out.println("i="+i+":: min="+min);
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
            System.out.println(i+": "+Arrays.toString(array));

        }


    }


    public static void charu(int[] array){
        int j,temp;

        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            j = i-1;
            for (;j>=0 && array[j]>temp;j--) {
                array[j+1] = array[j];
            }

            array[j+1] = temp;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void quick(int[] array,int start,int end){


        if (start<end){
            int key = array[start];
            int i = start,j,temp;
            for (j = start+1;  j<=end ; j++) {
                if (array[j]<key){
                    temp = array[j];
                    array[j] = array[i+1];
                    array[i+1] = temp;
                    i++;
                }
            }

            array[start] = array[i];
            array[i] = key;
            quick(array,start,i-1);
            quick(array,i+1,end);
        }

        System.out.println(Arrays.toString(array));
    }
}
