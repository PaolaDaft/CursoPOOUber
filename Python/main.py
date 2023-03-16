from car import Car 

if __name__ == "__main__":
    print("HEYYYY")
    car = Car()
    car.license = "PD15"
    car.driver = "José Ubaldo"
    car.passenger= 6
    print(vars(car))

    car2 = Car()
    car2.license = "DAFT25"
    car2.driver = "Paola Josefa"
    car2.passenger = 3
    print(vars(car2))