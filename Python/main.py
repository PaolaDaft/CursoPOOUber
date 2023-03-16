from car import Car 
from account import Account

if __name__ == "__main__":
    print("HEYYYY")

    car = Car("PD15", Account("José Ubaldo", "JOUB16"))
    print(vars(car))
    print(vars(car.driver))