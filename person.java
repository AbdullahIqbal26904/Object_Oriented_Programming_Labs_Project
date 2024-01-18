
public class person {
    public static void main(String[] args){

        pet p1 = new pet("Fido",5," Labrador");
        person p2 = new person("John",25,p1);
        System.out.println(p2.getDetails());
    }
    private String Name;
    private int Age;
    private pet pet;

    public person(String Name, int Age, pet pet){
        this.Name = Name;
        this.Age=Age;
        this.pet=pet;
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
    public pet getPet(){
        return pet;
    }
    public String getDetails(){
        return "Name: "+getName()+"\nAge "+getAge()+"\n"+pet.getDetails();
    }
}

