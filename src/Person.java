import java.time.LocalDate;

public class Person {
  private   String name;
  private   int age;
  private   String phoneNumber;
  private   String nationality;

    public Person(){

    }
    private Person(String name,int age,String phoneNumber,String nationality) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return  age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getNationality(){
        return nationality;

    }public void setNationality(String nationality){
        this.nationality = nationality;
    }
}
