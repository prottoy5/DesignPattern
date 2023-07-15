
public class Phone {

    private String model = "iphone 14 pro max";

    private void call() {

        System.out.println("calling......unknown");
    }

    void call(int number) {

        System.out.println("calling......" + number);
    }

    public void showModel() {

        System.out.println("Model for this phone is : " + model);
    }

}
