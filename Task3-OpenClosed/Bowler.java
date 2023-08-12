
public class Bowler extends Cricketer {
    private int wicketsTaken;

    public Bowler(String name, int age, int wicketsTaken) {
        super(name, age);
        this.wicketsTaken = wicketsTaken;
    }

    public int getWicketsTaken() {
        return wicketsTaken;
    }

    @Override
    public void play() {
        System.out.println(getName() + " is bowling and has taken " + wicketsTaken + " wickets."); 
    }
}

