

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
    /*    main.FakeShapeOne(10, 5);
        main.FakeShapeTwo(10, 5);
        main.FakeShapeTree(9, 0);
        main.FakeShapeFour(9, 0);
        main.FakeShapeFive(8);*/
        main.FakeShapeSix(8);
    }

    public void FakeShapeOne(int row, int col) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
                if (j == col - 1) {
                    System.out.println();
                }
            }
        }
    }

    public void FakeShapeTwo(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 | i == row - 1) {
                    System.out.print("*");
                } else {
                    if (j == 0 | j == col - 1) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public void FakeShapeTree(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public void FakeShapeFour(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = row; j > i; j--) {
                System.out.print("*");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void FakeShapeFive(int height) {
     for (int satir=0;satir<height;satir++){
         for (int sutun=0;sutun<satir;sutun++){
             System.out.print(" ");
         }
         for (int sutun=height;sutun>satir;sutun--){
             System.out.print("*");
         }
         System.out.println(" ");
     }
    }

    public void FakeShapeSix(int uzunluk){
        for (int satir = 0; satir < uzunluk; satir++) {
            System.out.print(satir+"  ");// hangi satırda olduğumuzu belirtmek için kullandık

            //Önce satir sayisi kadar bosluk sütunu ekliyoruz
            for (int sutun = 0; sutun < satir; sutun++) {
                System.out.print(" ");
            }

            //Sonra uzunluktan bulunduğumuz satır sayısını çıkararak yıldız sütununu ekliyoruz
            for (int sutun = uzunluk; sutun > satir; sutun--) {
                System.out.print("*");
            }

            // Bu for bloguna kadar üçgenin sol tarafını çiziyoruz bundan sonra sağ tarafını

            //uzunluktan bulunduğumuz satır sayısını çıkararak yıldız sütununu ekliyoruz
            //-1 şeklin görüntüsünü düzeltmek
            for (int sutun = uzunluk-1; sutun > satir; sutun--) {
                System.out.print("*");
            }
            System.out.print("\n");//her sütundan sonra alt satıra geçiriyoruz
        }
    }
}





