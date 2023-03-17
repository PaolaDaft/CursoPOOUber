from car import Car 
from account import Account
from uberX import UberX

if __name__ == "__main__":
    print("HEYYYY")

    car = Car("PD15", Account("José Ubaldo", "JOUB16"))
    print(vars(car))
    print(vars(car.driver))

    uberX = UberX("DAFT25", Account("Paola Josefa", "PAJO15"), "Dodge", "Attitude")
    print(vars(uberX))
    print(vars(uberX.driver))