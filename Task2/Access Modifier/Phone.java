
public class Phone {

    private String model = "iphone 14 pro max";      

    private void call() {           //private

        System.out.println("calling......unknown");
    }

    void call(int number) {           //default

        System.out.println("calling......" + number);
    }

    public void showModel() {            //public

        System.out.println("Model for this phone is : " + model);
    }

    protected void display() {//protected
        System.out.println("Prottoy");
    }

}

