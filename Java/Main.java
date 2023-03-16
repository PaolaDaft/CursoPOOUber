class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car("PD15", new Account("José Ubaldo", "JOUB16"));
        car.passenger= 6;
        car.printDataCar();

        Car car2 = new Car("DAFT25", new Account("Paola Josefa", "PAJO15"));
        car2.passenger = 3;
        car2.printDataCar();
    }
}   