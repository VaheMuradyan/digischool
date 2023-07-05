import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y, z, k;
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        k = in.nextInt();
        //task 31
        if(x > y && x > z && x > k){
            System.out.println(x);
        }else if(y > x && y > z && y > k){
            System.out.println(y);
        }else if(z > x && z > y && z > k){
            System.out.println(z);
        }else{
            System.out.println(z);
        }

        //task32

        if(x < y && x < z && x < k){
            System.out.println(x);
        }else if(y < x && y < z && y < k){
            System.out.println(y);
        }else if(z < x && z < y && z < k){
            System.out.println(z);
        }else{
            System.out.println(z);
        }

        //task33

        if(x == 1 || y == 1 || z == 1 || k == 1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        //task34

        if((x + y == z + k) || (x + z == y + k) || (x + k == y + z)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        //task35

        if((x == (y + z + k)) || ( y == (x + z + k)) || (z == (x + y + k)) || (k == (x + y + z))){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        //task36

        if(x % 2 != 0 && y % 2 != 0){
            System.out.println(1);
        }else if(x % 2 != 0 && z % 2 != 0){
            System.out.println(1);
        }else if(x % 2 != 0 && k % 2 != 0) {
            System.out.println(1);
        }else if(y % 2 != 0 && z % 2 != 0){
            System.out.println(1);
        }else if(y % 2 != 0 && k % 2 != 0){
            System.out.println(1);
        }else if(z % 2 != 0 && k % 2 != 0){
            System.out.println(1);
        }else{
            System.out.println(2);
        }

        //task37

        if((x - y) == (y - z) && (y - z) == (z - k)){
            System.out.println(true);
        }


        double a, b, c, d;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        d = in.nextDouble();

        //task38

        if((a / b) == (b / c) && (b / c) == (c / d)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


        //task39

        int arr[] = {x, y, z, k};
        Arrays.sort(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }

        //task40

        for(int i = arr.length - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }




    }
}