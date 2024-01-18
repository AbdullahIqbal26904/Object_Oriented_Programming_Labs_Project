public class pet {
    private String Name;
    private String Breed;
    private int age;

    public pet(String Name, int age, String Breed){
        this.Name = Name;
        this.age=age;
        this.Breed=Breed;
    }
    public String getName(){
        return Name;
    }
    public int getAge (){
        return age;
    }
    public String getBreed(){
        return Breed;
    }
    public String getDetails(){
        return "Name: "+getName()+"\nBreed: "+getBreed()+"\nAge "+getAge();
    }

}
