
import java.util.Arrays;
import java.util.Objects;

    public class Access_Specifer {
        private String fname;
        public String name;
        protected String lname;
        int height;
        public boolean flies ;
        private String[] equipment = { "utility belt", "sword" };
//Constructor Chaining

        public Access_Specifer(String fname, String lname, int height, boolean flies, String[] equipment) {
            this(fname,lname);
            this.height = height;
            this.flies = flies;
            this.equipment = equipment;
        }

        public Access_Specifer() {
            System.out.println("No argument constructor invoked");
        }
        public Access_Specifer(Access_Specifer obj) {
            fname=obj.fname;
            lname=obj.lname;
            flies=obj.flies;
            equipment = obj.getEquipment();
        }
        public Access_Specifer(String fname, String lname) {

            this.fname = fname;
            this.lname = lname;
        }

        public Access_Specifer(String name) {
            this.name = name;
        }

        public void SetEquipment(String one, String two)
        {
            equipment[0] = one;
            equipment[1] = two;
        }
        public String[] getEquipment(){
            return equipment;
        }

        @Override
        public String toString() {
            return "Access_Specifer{" + "\nfname=" + fname + ", \n lname=" + lname + ",\n height=" + height + ", \nflies=" + flies + ", \nEquipment:" + equipment[0] + " , " + equipment[1] + '}';
        }

        public static void main(String[] args){
            String[] temp = {"claws","tail"};
            Access_Specifer obj3 = new Access_Specifer("Angry","Man",200,false,temp);

            System.out.println("Object 3: "+obj3);
            System.out.println();
            Access_Specifer obj4= new Access_Specifer(obj3);
            System.out.println("Object 4: "+obj4);
            System.out.println();
            obj3.SetEquipment("Teeth","Rope");
            System.out.println("Object 4: "+obj4);
        }

    }
