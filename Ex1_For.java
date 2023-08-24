import java.util.Scanner;

public class Ex1_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        for (int i=1; i<=x; i++ ){ //Começa no 1; Enquanto i for menor que o X; i++
            if(i % 2 != 0){ // i % 2 = 0 seria par, mas como ele quer != 0 vai ter resto então é impar. 
                System.out.println(i);
            }
        }
        sc.close();
    }
}
