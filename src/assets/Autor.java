package assets;

public class Autor {


    private String name;
    private String surname;
    private Integer dayofbirth;
    private String birthplace;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public Integer getDayofbirth(){
        return dayofbirth;
    }
    public void setDayofbirth(Integer dayofbirth){
        this.dayofbirth = dayofbirth;
    }
    public String getBirthplace(){
        return birthplace;
    }
    public void setBirthplace(String birthplace){
        this.birthplace = birthplace;
    }

}