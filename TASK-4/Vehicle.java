//InterfaceSegration.

interface Vehicle

{
    void setPrice(double price);
}

interface Movable
{
    void start();
    void stop();
}

interface Flyable
{
    void fly();
}

class Car implements Vehicle,Movable
{
    double price;

    @Override
    public void setPrice(double price)
    {
        this.price = price;
        System.out.println("Car's price is : " + price);
    }

    @Override
    public void start()
    {
        System.out.println("Car's start time is : 10:00 AM");
    }

    @Override
    public void stop()
    {
        System.out.println("Car's stop time is : 12:00 PM");
    }
}


class Aeroplane implements Vehicle, Movable, Flyable
{
    double price;

    @Override
    public void setPrice(double price)
    {
        this.price = price;
        System.out.println("Aeroplane's price is : " + price);
    }

    @Override
    public void start()
    {
        System.out.println("Aeroplane's start time is : 6.00 PM");
    }

    @Override
    public void stop()
    {
        System.out.println("Aeroplane's stop time is : 2.00 AM");
    }

    @Override
    public void fly()
    {
        System.out.println("Aeroplane's fly time is : 8.00 PM");
    }
}

 class VehicleBuilder
{
    public static Car builderCar()
    {

        Car car =new Car();
            //car.setPrice(15.00);
            //car.start();
        return car;
    }

    public static Aeroplane buildAeroPlane()
    {
        Aeroplane aeroplane = new Aeroplane();
            //aeroplane.setPrice(25.00);
            //aeroplane.start();
            //aeroplane.fly();
        return aeroplane;
    }
}

