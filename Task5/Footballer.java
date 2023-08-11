// Dependency Inversion
interface Footballer {
    void playFootball();
}

// Concrete implementation of the Footballer interface
class ProfessionalFootballer implements Footballer { 
    @Override
    public void playFootball() {
        System.out.println("Professional footballer is playing football.");
    }
}

// High-level class that depends on the Footballer interface
class Coach { 
    private Footballer footballer;

    public Coach(Footballer footballer) {
        this.footballer = footballer;
    }

    public void trainFootballer() {
        System.out.println("Coach is training the footballer.");
        footballer.playFootball();
    }
}


