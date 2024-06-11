public class Main {
    public static void main(String[] args) {
        TransportFactory carFactory = new CarFactory();
        TransportFactory planeFactory = new PlaneFactory();
        TransportFactory shipFactory = new ShipFactory();

        Transport car = carFactory.createTransport("Title 1", "Producer 1", 2017);
        Transport plane = planeFactory.createTransport("Title 2", "Producer 2", 2019);
        Transport ship = shipFactory.createTransport("Title 3", "Producer 3", 2016);

        car.print();
        plane.print();
        ship.print();
    }
}

abstract class Transport{
    String title;
    String producer;
    int year;

    public Transport(String title, String producer, int year) {
        this.title = title;
        this.producer = producer;
        this.year = year;
    }

    public abstract void print();
}


abstract class TransportFactory{
    public abstract Transport createTransport(String title, String producer, int year);
}

class Car extends Transport{
    public Car(String title, String producer, int year) {
        super(title, producer, year);
    }

    public void print() {
        System.out.println("Машина едет");
    }
}

class Plane extends Transport{
    public Plane(String title, String producer, int year) {
        super(title, producer, year);
    }

    public void print() {
        System.out.println("Самолет летит");
    }
}

class Ship extends Transport{
    public Ship(String title, String producer, int year) {
        super(title, producer, year);
    }

    public void print() {
        System.out.println("Корабль идет");
    }
}


class CarFactory extends TransportFactory {
    public Transport createTransport(String title, String producer, int year){
        return new Car(title, producer, year);
    }
}


class PlaneFactory extends TransportFactory {
    public Transport createTransport(String title, String producer, int year){
        return new Plane(title, producer, year);
    }
}


class ShipFactory extends TransportFactory {
    public Transport createTransport(String title, String producer, int year){
        return new Ship(title, producer, year);
    }
}