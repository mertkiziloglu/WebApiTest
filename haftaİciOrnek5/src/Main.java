
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // A= {4,8,3,1,18,9,21,20,5,17} dizisinde girilen sayının olup olmadığını bulunuz





          System.out.println("Dizinin ilk kac sayisi yer degissin : ");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        //boolean bulundu = false;
        int sayiDizisi[] = new int[]{4, 8, 3, 1, 18, 9, 20, 5, 17, 13};

        for (int i=0;i<sayi;i++){
            sayiDizisi[(sayiDizisi.length)-(i+1)]=sayiDizisi[i];
            sayiDizisi[i]=0;
        }
        for (int i=0;i<sayiDizisi.length;i++){
            System.out.print(sayiDizisi[i]+" ");
        }





        /*        for (int i = 0; i < A.length; i++) {
            if (A[i] == sayi) {
                bulundu = true;
                break;
            }
        }
        if (bulundu == false) {
            System.out.println("Dizide bu sayi yoktur.");
        } else {
            System.out.println("Dizide bu sayi vardir.");
        }


        for (int item:sayiDizisi) {
            if (item==sayi){
                System.out.println("Bulundu..");
                break;
            }
            else{
                System.out.println("simdilik bulamadi");
            }
        }


        int sonuc = Arrays.binarySearch(sayiDizisi, sayi);
        if (sonuc == -1) {
            System.out.println("Bulundu");
        } else {
            System.out.println("bulunmadı");
        }*/





    }
}