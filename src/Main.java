import java.util.Scanner;

public class Main {

    static int counter=0;
    static int sonuc=0;
    static void asal(int sayi,int i){
        if (i == sayi) {
            System.out.println(sayi+" asal sayıdır.");
            return;
        }
        else if (sayi%i==0){
            System.out.println(sayi+" asal sayi değildir.");
            return;
        }
        asal(sayi,i+1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:  ");
        int sayi=input.nextInt();
        asal(sayi,2);
    }
}
