class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car();
        car.license = "PD15";
        car.driver = "José Ubaldo";
        car.passenger= 6;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "DAFT25";
        car2.driver = "Paola Josefa";
        car2.passenger = 3;
        car2.printDataCar();
    }
}   