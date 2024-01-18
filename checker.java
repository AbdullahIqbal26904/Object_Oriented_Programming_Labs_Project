public class checker {
    /*
    public static void main(String[] args){
        problem1 p1 = new problem1("Harry Potter and the Sorcerer ’s Stone","J.K. Rowling","1234567890",309);
        System.out.println(p1.summary());
    }
    */
/*
    public static void main(String[] args) {
        problem2 p1 = new problem2("Ford", "Mustang", 2020, "Red", 4, 2);
        problem2 p2 = new problem2("Honda", "Civic", 2019, "White", 4, 4);
        problem2 p3 = new problem2("Tesla", "ModelS", 2018, "Black", 4, 4);
        problem2 p4[] = {p1, p2, p3};
        for (int i = 0; i < p4.length; i++) {
            System.out.println("Car " + (i + 1));
            System.out.println(p4[i].summary());
        }
    }
    */
    public static void main(String[] args){

        pet p1 = new pet("Fido",5," Labrador");
        person p2 = new person("John",25,p1);
        System.out.println(p2.getDetails());
    }
}