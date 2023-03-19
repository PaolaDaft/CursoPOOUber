class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        UberX uberX = new UberX("PD15", new Account("José Ubaldo", "JOUB16"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("DAFT25", new Account("Paola Josefa", "PAJO15"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}   