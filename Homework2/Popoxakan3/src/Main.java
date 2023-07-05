import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        //task24

        if(x == 2 && y == 2 && z != 2){
            System.out.println(true);
        }else if(x == 2 && z == 2 && y != 2){
            System.out.println(true);
        }else if(z == 2 && y == 2 && x != 2){
            System.out.println(false);
        }else{
            System.out.println(false);
        }

        //task27

        if(z - y == y - x){
            System.out.println(true);
        }else if(x - y == y - z){
            System.out.println(true);
        }else if(z - x == x - y){
            System.out.println(true);
        }else if(x - z == z - y){
            System.out.println(true);
        }else if(y - x == x - z){
            System.out.println(true);
        }else if(y - z == z - x){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        double a ,b, c;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        //task28

        if(c / b == b / a){
            System.out.println(true);
        }else if(c / a == a / b){
            System.out.println(true);
        }else if(b / a == a / c){
            System.out.println(true);
        }else if(b / c == c / a){
            System.out.println(true);
        }else if(a / c == c / b){
            System.out.println(true);
        }else if(a / b == b / c){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        //task29

        if(x > y && x > z){
            System.out.println(x + " ");
            if(y > z){
                System.out.println(y + " " + z);
            }else {
                System.out.println(z + " " + y);
            }
        }else if(y > x && y > z){
            System.out.println(y + " ");
            if(x > z){
                System.out.println(x + " " + z);
            }else{
                System.out.println(z + " " + x);
            }
        }else if(z > x && z > y){
            System.out.println(z + " ");
            if(x > y){
                System.out.println(x + " " + y);
            }else{
                System.out.println(y + " " + x);
            }
        }

        //task30

        if(x < y && x < z){
            System.out.println(x + " ");
            if(y < z){
                System.out.println(y + " " + z);
            }else {
                System.out.println(z + " " + y);
            }
        }else if(y < x && y < z){
            System.out.println(y + " ");
            if(x < z){
                System.out.println(x + " " + z);
            }else{
                System.out.println(z + " " + x);
            }
        }else if(z < x && z < y){
            System.out.println(z + " ");
            if(x < y){
                System.out.println(x + " " + y);
            }else{
                System.out.println(y + " " + x);
            }
        }
    }
}