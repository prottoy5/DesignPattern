public class VehicleTest {   //InterfaceSegration.

    public static void main(String[] args)
    {
        Car car = VehicleBuilder.builderCar();
        car.setPrice(15.00);
        car.start();
        car.stop();


        Aeroplane aeroplane = VehicleBuilder.buildAeroPlane();
        aeroplane.setPrice(25.00);
        aeroplane.start();
        aeroplane.stop();
        aeroplane.fly();       

    }
}

