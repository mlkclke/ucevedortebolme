import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı Giriniz :");
        int k = inp.nextInt();

        int a = 0;
        int b = 0;

        for (int i = 0 ; i <= k ; i++){
            if (i % 3 == 0 && i % 4 == 0){
                a += i;
                b++;
            }
        }
         double avarage = (double) a / b ;
        System.out.println("0'dan " + k + "sayısına kadar olan 3'e ve 4'e tam bölünen sayıların ortalaması " + avarage);

        
    }
}

