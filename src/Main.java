// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
abstract class Vehicle
{
    abstract void start();
    abstract void stop();
}
class Car extends Vehicle
{
    void start()
    {
        System.out.println("Car Started...");
    }
    void stop()
    {
        System.out.println("Car Stopped...");
    }
}
class MotorCycle extends Vehicle
{
    void start()
    {
        System.out.println("MotorCycle Started...");
    }
    void stop()
    {
        System.out.println("MotorCycle Stopped...");
    }
}
public class Main {
    public static void main(String[] args) {
        MotorCycle motorCycle=new MotorCycle();
        Car car=new Car();

        motorCycle.start();
        motorCycle.stop();

        car.start();
        car.stop();
    }
}