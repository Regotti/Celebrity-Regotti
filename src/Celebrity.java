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

public class Game{

   
    

    static ArrayList<Celebrity> celebrities = new ArrayList<Celebrity>();
   
    public static void addCelebrity(String myName, int myAge, int myNetWorth, String myOccupation, String myHairColor, String myGender, boolean myIsDead, double myHeight){
        Celebrity jBiden = new Celebrity("Joe Biden",80, 80000000, "President", "White","Male",false, 5.9);
        celebrities.add(jBiden);
        Celebrity obama = new Celebrity("Obama", 61, 70000000, "Ex-president", "Black","Male",false, 6.2);
        celebrities.add(obama);
        Celebrity hFord = new Celebrity("Harrison Ford", 80, 930000000, "Actor", "Grey","Male",false, 6.1);
        celebrities.add(hFord);
        Celebrity dParton = new Celebrity("Dolly Parton", 77, 650000000, "Musician", "Blonde","Female",false, 5.0);
        celebrities.add(dParton);
        Celebrity rCuomo = new Celebrity("Rivers Cuomo", 52, 35000000, "Musician", "Black","Male",false, 5.6);
        celebrities.add(rCuomo);
        Celebrity mJackson = new Celebrity("Michael Jackson", 50, 1110000000, "Singer", "Black","Male",true, 5.9);
        celebrities.add(mJackson);
        Celebrity tSwift = new Celebrity("Taylor Swift", 33, 45000000, "Singer", "Blonde","Female",false, 5.11);
        celebrities.add(tSwift);
        Celebrity tBrady = new Celebrity("Tom Brady", 45, 25000000, "Football Player", "Brown","Male",false, 6.4);
        celebrities.add(tBrady);
        Celebrity wRyder = new Celebrity("Winona Ryder", 51, 18000000, "Actress", "Brown","Female",false, 5.3);
        celebrities.add(wRyder);
        Celebrity bMussolini = new Celebrity("Benito Mussolini", 61, 10000000, "Dictator", "Bald","Male",true, 5.7);
        celebrities.add(bMussolini);

    }
    public static Celebrity chooseCeleb(){

        int x = (int)((Math.random*10)+1);
        return celebrities[x];

    }

    
    
    



    

    



    public void traitsChoice(Scanner input){

        int fails = 0;
        String[] guessableTraits = {"Age","Net Worth", "Occupation", "Hair Color", "Gender", "Are they dead?", "Height"};
        while(fails< 20){

                for(int i= 0; i < guessableTraits.length; i++){

                    System.out.println("Guess the celebrity's "+ guessableTraits[i]);
                    
                    String response = input.nextLine();

                    if(guessableTraits[i].equals(guessableTraits[1])){

                        if(response != target.getAge){
                            fails ++;
                        }
                        else{
                            System.out.println(input + " is the correct " + guessableTraits[i]);
                        }
                    }

                    if(guessableTraits[i].equals(guessableTraits[2])){
                        if(response != target.getNetWorth){
                            fails ++;
                        }
                        else{
                            System.out.println(input + " is the correct " + guessableTraits[i]);
                        }
                    }
                    if(guessableTraits[i].equals(guessableTraits[3])){
                        if(response != target.getOccupation){
                            fails ++;
                        }
                        else{
                            System.out.println(input + " is the correct " + guessableTraits[i]);
                        }
                    }
                    if(guessableTraits[i].equals(guessableTraits[4])){
                        if(response != target.getHairColor){
                            fails ++;
                        }
                        else{
                            System.out.println(input + " is the correct " + guessableTraits[i]);
                        }
                    }
                    if(guessableTraits[i].equals(guessableTraits[5])){
                        if(response != target.getGender){
                            fails ++;
                        }
                        else{
                            System.out.println(input + " is the correct " + guessableTraits[i]);
                        }
                    }
                    if(guessableTraits[i].equals(guessableTraits[6])){
                        if(response != target.getIsDead){
                            fails ++;
                        }
                        else{
                            System.out.println(input + " is the correct " + guessableTraits[i]);
                        }
                    }
                    if(guessableTraits[i].equals(guessableTraits[7])){
                        if(response != target.getHeight){
                            fails ++;
                        }
                        else{
                            System.out.println(input + " is the correct " + guessableTraits[i]);
                        }
                    }
                }
        System.out.println("Think you know the celebrity? Guess!");
        String response = input.nextLine();
        if(response != target.getName){
            fails ++;
            System.out.println("WRONG");
        }
        else{
            System.out.println("Yes, the celebrity is "+ target.getName);
        }
    }
}

   
       

    public Celebrity main(String[] args){
        Celebrity target = chooseCeleb();
        Scanner input = new Scanner(System.in);

        traitsChoice();
        
        

            




    }
}