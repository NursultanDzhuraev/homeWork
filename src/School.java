public class School {
    private String name;
    private String number;
    private String phoneNumber;

    public School() {

    }

    public School(String name, String number, String phoneNumber) {
        this.name = name;
        this.number = number;
        this.phoneNumber = phoneNumber;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNumber(){
        return  number;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

}
