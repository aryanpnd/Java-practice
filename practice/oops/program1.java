class Car{
    String name;
    String color;
    String fuelType;

    public void start(){
        System.out.println("started");
    }

    public void printDetails(){
        System.out.println("Car name : "+this.name);
        System.out.println("Car color : "+this.color);
        System.out.println("Car fuel type : "+this.fuelType);
    }
}

class Customer{
    String name;
    int age;

    void printCustomerDetails(){
        System.out.println("Customer name : "+this.name);
        System.out.println("Customer age : "+this.age);
    }
}

public class program1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.color="black";
        car.name = "alto";
        car.fuelType = "petrol";
        car.start();
        car.printDetails();

        Customer cust = new Customer();
        cust.name = "Aryan";        
        cust.age = 18;        
        cust.printCustomerDetails();
    }
}
