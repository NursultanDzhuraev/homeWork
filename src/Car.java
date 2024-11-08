public class Car {
  private  String name;
  private   String color;
  private   double mileage;


    public Car(){

    }
    private Car(String name,String color,double mileage) {
        this.name = name;
        this.color = color;
        this.mileage = mileage;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getColor(){
        return  color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getMileage(){
        return mileage;
    }
    public void setMileage(double mileage){
        this.mileage = mileage;
    }
}
