public class asalMı {
    public void asalBul(int num) {
        boolean asal = false;
        if (num == 0) {
            asal = true;
            System.out.println("Asal");
        } else if (num % 2 == 0 | num % 3 == 0 | num % 5 == 0 | num % 7 == 0) {
            asal = false;
            System.out.println("Asal degil");
        } else {
            asal = true;
            System.out.println("Asal");
        }
    }
}
