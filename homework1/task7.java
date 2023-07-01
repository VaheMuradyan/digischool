import java.util.Scanner;

class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        do{
            System.out.print("input N = ");
            N = in.nextInt();
        }while(N < 0 || N > 21);
        System.out.println("Output");
        for(int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }
}
