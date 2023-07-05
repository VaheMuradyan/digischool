import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        boolean t;

        //task51

        if((x / 100) + ((x % 100) / 10) == x % 10){
            t = true;
        }else {
            t = false;
        }
        System.out.println(t);

        //task52

        if((x / 100) == ((x % 100) / 10) || (x / 100) == (x % 10) || ((x % 100) / 10) == (x % 10)){
            t = true;
        }else{
            t = false;
        }
        System.out.println(t);

        //task53

        int k = 600;
        if(x > k){
            int z = (x / 100) + ((x % 100) / 10) + (x % 10);
            System.out.println(x / z);
        }else{
            double n = (x % 10) / x;
            System.out.println(n);
        }

        //task54

        if((x / 100) > ((x % 100) / 10) && (x / 100) > x % 10){
            System.out.println((x / 100));
        }else if((x % 100 / 10) > (x / 100) && ((x % 100) / 10) > x % 10){
            System.out.println((x % 100) / 10);
        }else{
            System.out.println(x % 10);
        }

        //task55

        if((x / 100) < ((x % 100) / 10) && (x / 100) < x % 10){
            System.out.println((x / 100));
        }else if((x % 100 / 10) < (x / 100) && ((x % 100) / 10) < x % 10){
            System.out.println((x % 100) / 10);
        }else{
            System.out.println(x % 10);
        }

        //task56

        if(x % 10 > (x % 100) / 10){
            int z = (x / 100) + ((x % 100) / 10) + (x % 10);
            System.out.println(x / z);
        }else{
            System.out.println(x);
        }

        //task57

        if(x > 300){
            System.out.println(((x % 100) / 10) / (x % 10));
        }else{
            System.out.println((x / 100) / (x % 10));
        }

        //task58

        char f;

        if((x / 100) + ((x % 100) / 10) < 5){
            f = 'a';
        }else{
            f = 'b';
        }
        System.out.println(f);

        //task59

        int a = x % 10;
        int b = (x / 10) % 10;
        int c = x / 100;

        if(a > b && a > c){
            System.out.println(a);
            if(b > c){
                System.out.println(b);
                System.out.println(c);
            }else{
                System.out.println(c);
                System.out.println(b);
            }
        }else if(b > a && b > c){
            System.out.println(b);
            if(a > c){
                System.out.println(a);
                System.out.println(c);
            }else{
                System.out.println(c);
                System.out.println(a);
            }
        }else if(c > a && c > b){
            System.out.println(c);
            if(a > b){
                System.out.println(a);
                System.out.println(b);
            }else{
                System.out.println(b);
                System.out.println(a);
            }
        }

        //task60

        if(a < b && a < c){
            System.out.println(a);
            if(b < c){
                System.out.println(b);
                System.out.println(c);
            }else{
                System.out.println(c);
                System.out.println(b);
            }
        }else if(b < a && b < c){
            System.out.println(b);
            if(a > c){
                System.out.println(a);
                System.out.println(c);
            }else{
                System.out.println(c);
                System.out.println(a);
            }
        }else if(c < a && c < b){
            System.out.println(c);
            if(a < b){
                System.out.println(a);
                System.out.println(b);
            }else{
                System.out.println(b);
                System.out.println(a);
            }
        }



    }
}
