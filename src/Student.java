import java.time.LocalDate;
import java.time.Period;

public class Student {

    String name;
    LocalDate brith;
    String phoneNumber;
    String nationality;

    public Student(){

    }
    public Student (String name,LocalDate brith,String phoneNumber,String nationality){
        this.name=name;
        this.brith=brith;
        this.phoneNumber=phoneNumber;
        this.nationality=nationality;
    }
    public int getAge(){
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(brith,currentDate);
        return age.getYears();
    }
}
