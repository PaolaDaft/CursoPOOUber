class Car {

    constructor(license, driver) {
        this.id;
        this.license = license;
        this.driver = driver;
        this.passanger;
    }

    printDataCar = function () {
        console.log(this.driver)
        console.log(this.driver.name)
        console.log(this.driver.document)
    }
    /*printDataCar = () => {
        console.table(this.driver) //imprimirá una tabla con todos los datos
        console.log(this.driver.name)
        console.log(this.driver.document)
    } Sugerencia*/
}