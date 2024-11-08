import javax.xml.namespace.QName;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        School school1 = new School();
        school1.setName("Раззаков");
        school1.setNumber("82");
        school1.setPhoneNumber("+996222828282");

        School school2 = new School();
        school2.setName("Кок-таш");
        school2.setNumber("31");
        school2.setPhoneNumber("+996222313131");

        School school3 = new School();
        school3.setName("Кызыл жылдыз");
        school3.setNumber("45");
        school3.setPhoneNumber("+996222454545");


        Car car = new Car();
        car.setName("BMV");
        car.setColor("yellow");
        car.setMileage(155.5f);

        Car car1 = new Car();
        car1.setName("Audi");
        car1.setColor("black");
        car1.setMileage(108.5f);

        Car car2 = new Car();
        car2.setName("BID");
        car2.setColor("white");
        car2.setMileage(109.5f);

        Person person = new Person();
        person.setName("Nursultan");
        person.setAge(29);
        person.setPhoneNumber("+996900998877");
        person.setNationality("kyrgyz");

        Person person1 = new Person();
        person1.setName("Aibek");
        person1.setAge(19);
        person1.setPhoneNumber("+996900112233");
        person1.setNationality("kyrgyz");

        Person person2 = new Person();
        person2.setName("Kanchoro");
        person2.setAge(18);
        person2.setPhoneNumber("+996900445566");
        person2.setNationality("kyrgyz");


        University university = new University();
        university.setName("KNU");
        university.setNameCity("Bishkek");
        university.setPhoneNumber("+996700123456");

        University university1 = new University();
        university1.setName("BGU");
        university1.setNameCity("Bishkek");
        university1.setPhoneNumber("+996701654321");

        University university2 = new University();
        university2.setName("OSU");
        university2.setNameCity("Osh");
        university2.setPhoneNumber("+996777112233");



        School[] schools = {school1,school2,school3};
        for (School school : schools) {
            System.out.println("Name  "+school.getName()+"\n"
            +"Number  "+school.getNumber()+"\n"
            +"PhoneNumber  "+school.getPhoneNumber()+"\n"+"------------------------");
        }
        Car[] cars = {car,car1,car2};
        for (Car car3 : cars) {
            System.out.println("Name  "+car3.getName()+"\n"
                    +"Color  "+car3.getColor()+"\n"
                    +"Mileage  "+car3.getMileage()+"\n"+"------------------------");
        }
        Person[] people = {person,person1,person2};
        for (Person person3 : people) {
            System.out.println("Name  "+person3.getName()+"\n"
                    +"Number  "+person3.getAge()+"\n"
                    +"PhoneNumber  "+person3.getPhoneNumber()+"\n"
                     +"Nationality  "+person3.getNationality()+"\n"+"------------------------");

        }
        University[] universities = {university,university1,university2};
        for (University university3 : universities) {
            System.out.println("Name  "+university3.getName()+"\n"
                    +"Number  "+university3.getNameCity()+"\n"
                    +"PhoneNumber  "+university3.getPhoneNumber()+"\n"+"------------------------");

        }



        //   Student student = new Student("Nursultan", LocalDate.of(1995, 3, 10), "+996998100395", "kyrgyz");
     //   Student student1 = new Student("Nursultan1", LocalDate.of(1995, 3, 10), "+996998100395", "kyrgyz1");
     //   Student student2 = new Student("Nursultan2", LocalDate.of(1995, 3, 10), "+996998100395", "kyrgyz2");//  Student[] students = {student, student1, student2};
     //   for (Student student3 : students) {
       //     System.out.println("name " + student.name + "\n"
         //           + "date Of Birth " + student.brith + "\n"
          //          + "phone number " + student.phoneNumber + "\n"
            //        + "nationality " + student.nationality + "\n"
              //      + "Student age " + student.getAge() + "\n");
      //  }
    }
}