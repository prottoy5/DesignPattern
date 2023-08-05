//Dependency Inversion
interface Footballer {
    void playFootball();
}

class ProfessionalFootballer implements Footballer { // Concrete implementation of the Footballer interface
    @Override
    public void playFootball() {
        System.out.println("Professional footballer is playing football.");
    }
}

class Coach { // High-level class that depends on the Footballer interface
    private Footballer footballer;

    public Coach(Footballer footballer) {
        this.footballer = footballer;
    }

    public void trainFootballer() {
        System.out.println("Coach is training the footballer.");
        footballer.playFootball();
    }
}


