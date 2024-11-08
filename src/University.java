public class University {
  private   String name;
  private String nameCity;
  private String phoneNumber;


    public University(){

    }
    private University(String name,String nameSiti,String phoneNumber){
        this.name = name;
        this.nameCity = nameSiti;
        this.phoneNumber = phoneNumber;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNameCity(){
        return nameCity ;
    }
    public void setNameCity(String nameCity){
        this.nameCity= nameCity;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}
