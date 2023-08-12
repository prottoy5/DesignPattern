
public class FootballerTest {
    public static void main(String[] args) {
        Footballer footballer = new ProfessionalFootballer();
        Coach coach = new Coach(footballer);
        coach.trainFootballer();
    }
} 

