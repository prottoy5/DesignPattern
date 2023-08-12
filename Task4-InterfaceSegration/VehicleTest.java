public class VehicleTest {   

    public static void main(String[] args)
    {
        Car car = VehicleBuilder.builderCar();
        car.setPrice(15.00); // Car's price is : 15.0
        car.start(); // Car's start time is : 10:00 AM
        car.stop(); // Car's stop time is : 12:00 PM


        Aeroplane aeroplane = VehicleBuilder.buildAeroPlane();
        aeroplane.setPrice(25.00); // Aeroplane's price is : 25.0
        aeroplane.start(); // Aeroplane's start time is : 6.00 PM
        aeroplane.stop(); // Aeroplane's stop time is : 2.00 AM
        aeroplane.fly(); // Aeroplane's fly time is : 8.00 PM   

    }
}







