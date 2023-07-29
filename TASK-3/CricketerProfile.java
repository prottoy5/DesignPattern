//OpenClosed
public class CricketerProfile {
    public static void main(String[] args) {
        Cricketer cricketer1 = new Cricketer("Generic Cricketer", 25);
        cricketer1.play(); // Output: Generic Cricketer is playing cricket.

        Batsman batsman1 = new Batsman("Kane Williamson", 35, 18426);
        batsman1.play(); // Output: Kane Williamson is batting and has scored 18426 runs.

        Bowler bowler1 = new Bowler("Jasprit Bumrah", 28, 1347);
        bowler1.play(); // Output: Jasprit Bumrah is bowling and has taken 1347 wickets.
    }
}


