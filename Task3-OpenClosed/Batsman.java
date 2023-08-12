public class Batsman extends Cricketer {
    private int runsScored;

    public Batsman(String name, int age, int runsScored) {
        super(name, age);
        this.runsScored = runsScored;
    }

    public int getRunsScored() {
        return runsScored;
    }

    @Override
    public void play() {
        System.out.println(getName() + " is batting and has scored " + runsScored + " runs.");
    }
}

    

