public class FootballPlayerTest {

    public static void main(String[] args) {

        FootballPlayer guti=new FootballPlayer();
        guti.no=10;
        guti.inPlay=true;
        guti.name="guti hernandez";
        guti.minutes=0;
        guti.numberOfGoals=0;

        guti.play(90);
        guti.score();
        guti.score();

        System.out.println("Number of goals Guti scored : " + guti.numberOfGoals);
        System.out.println("Guti played totaled " +guti.minutes);

        System.out.println("*****************************");

        System.out.println("Number of goals Guti scored : " + guti.numberOfGoals);
        System.out.println("Guti played totaled " +guti.minutes);



    }
}
