public class FootballPlayer {

    String name;
    int no;
    int numberOfGoals;
    int minutes;
    boolean inPlay;

    void play(int minutesToPlay){
        minutes+=minutesToPlay;
    }

    void score(){
        numberOfGoals++;
    }

}
