import java.util.ArrayList;
import java.util.Scanner;

public class Celebrity {
    private String name;
    private int age;
    private int netWorth;
    private String occupation;
    private String hairColor;
    private String gender;
    private boolean isDead;
    private double height;


        Celebrity( String myName, int myAge, int myNetWorth, String myOccupation, String myHairColor, String myGender, boolean myIsDead, double myHeight){

            this.name = myName;
            this.age = myAge;
            this.netWorth =myNetWorth;
            this.occupation = myOccupation;
            this.hairColor = myHairColor;
            this.gender = myGender;
            this.isDead= myIsDead;
            this.height = myHeight;

        }

        public String getName(){return this.name;}
        public int getAge(){return this.age;}
        public int getNetWorth(){return this.netWorth;}
        public String getOccupation(){return this.occupation;}
        public String getHairColor(){return this.hairColor;}
        public String getGender(){return this.gender;}
        public boolean getIsDead(){return this.isDead;}
        public double getHeight(){return this.height;}
        
    }
