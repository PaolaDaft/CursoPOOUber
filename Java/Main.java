class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        UberX uberX = new UberX("PD15", new Account("José Ubaldo", "JOUB16"), "Chevrolet", "Sonic");
        uberX.setPassenger(3);
        uberX.printDataCar();

        Car car2 = new Car("DAFT25", new Account("Paola Josefa", "PAJO15"));
        //car2.passenger = 3;
        car2.printDataCar();
    }
}   