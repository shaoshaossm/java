package Example4;

import java.util.Arrays;
import java.util.Random;

public class RandomTest02 {
    public static void main(String[] args) {
        Random random = new Random();

        int [] arr = new int[5];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=-1;

        }

        int index=0;
        while (index<arr.length){

            //生成随机数
            int num = random.nextInt(101);
            if (!contains(arr,num)){
                arr[index++] = num;

            }
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }


    public static boolean contains(int [] arr, int key){

        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == key){
                return true;
            }
        }

return false;

    }



}
