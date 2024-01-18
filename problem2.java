public class problem2 {
    public static void main(String[] args){
        problem2 p1 = new problem2( "Ford","Mustang",2020,"Red",4,2);
        problem2 p2 = new problem2( "Honda","Civic",2019,"White",4,4);
        problem2 p3 = new problem2( "Tesla","ModelS",2018,"Black",4,4);
        problem2 p4[] ={p1,p2,p3};
        for(int i=0; i< p4.length; i++){
            System.out.println("Car "+ (i+1));
            System.out.println(p4[i].summary());
        }
    }
    private String Make;
    private String Model;
    private int Year;
    private String Color;
    private int now;
    private int nod;

    public problem2(String  Make, String Model,  int Year,  String Color, int now,int nod){
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
        this.Color=Color;
        this.now=now;
        this.nod=nod;
    }
    public String getMake(){
        return Make;
    }
    public String getModel(){
        return Model;
    }
    public String getColor(){
        return Color;
    }
    public int getYear(){
        return Year;
    }
    public int getNow(){
        return now;
    }
    public int getNod(){
        return nod;
    }
    public String summary(){
        return "Make: "+getMake()+"\nModel: "+getModel()+"\nYear: "+getYear()+"\nColor: "+getColor()+"\nNumber of wheels: "+getNow()+"\nNumber of doors: "+getNod();
    }

}
