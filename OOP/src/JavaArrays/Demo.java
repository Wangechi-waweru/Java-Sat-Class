package JavaArrays;



public class Demo {
    String[] cars = {"Benz ", "BMW ","Ford","Ford", "Audi", "Toyota"};

    public void LoopCars(){
        int count = cars.length;
        for (int i = 0; i<count; i++){
            System.out.println(cars[i]);
        }


    }
    public void changerCar(int index, String carname){
        cars [index] = carname;
        LoopCars(); //loop after changing the value.
    }
}
class Trial extends Demo{
    String name = "I am a trial class.";
//    Assignment: Create a method called LoopCars that loops in reverse order.
//    Get the length first then n-1
//    Read on Arrays in java.


}
class MyClass{
    public static void main(String[] args) {
        Demo myDemo = new Demo();
        Demo mytrial = new Trial();


        myDemo.LoopCars();
        mytrial.LoopCars();
        mytrial.changerCar(2,"Bentley");
        mytrial.LoopCars();

    }
}