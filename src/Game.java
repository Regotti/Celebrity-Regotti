import java.util.ArrayList;
import java.util.Scanner;

public class Game{

    static ArrayList<Celebrity> celebrities = new ArrayList<Celebrity>();
   
    public static void addCelebrity(){
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

        int x = (int)((Math.random()*10)+1);
        return celebrities.get(x);

    }

    
    
    



    

    



    public static boolean traitsChoice(Scanner input, Celebrity target){
        System.out.println(target.getName());

        int fails = 0;
        String[] guessableTraits = {null, "Age","Net Worth", "Occupation", "Hair Color", "Gender", "Are they dead?", "Height"};
        while(fails< 20){

                for(int i= 1; i < guessableTraits.length; i++){

                    System.out.println(i);
                    

                    if(i==0){
                        System.out.println("debug");
                        i++;
                    }

                    System.out.println("Guess the celebrity's "+ guessableTraits[i]);
                    
                    String response = input.nextLine();
                    

                    if(i==1){

                        if(Integer.parseInt(response) == (target.getAge())){
                            System.out.println(response + " is the correct " + guessableTraits[i]);
                        }
                        else{
                            System.out.println("WRONG");

                            fails ++;
                            i--;
                        }
                    }

                    if(i==2){
                        if(Integer.parseInt(response)==target.getNetWorth()){
                            System.out.println(response + " is the correct " + guessableTraits[i]);
                        }
                        else{
                            System.out.println("WRONG");
                            fails ++;
                            i--;
                        }
                    }
                    if(i==3){
                        if(response.equals(target.getOccupation())){
                            System.out.println(response + " is the correct " + guessableTraits[i]);
                        }
                        else{
                            System.out.println("WRONG");
                            fails ++;
                            i--;
                        }
                    }
                    if(i==4){
                        if(response.equals(target.getHairColor())){
                            System.out.println(response + " is the correct " + guessableTraits[i]);
                        }
                        else{
                            System.out.println("WRONG");
                            fails ++;
                            i--;
                        }
                    }
                    if(i==5){
                        if(response.equals(target.getGender())){
                            System.out.println(response + " is the correct " + guessableTraits[i]);
                        }
                        else{
                            System.out.println("WRONG");
                            fails ++;
                            i--;
                        }
                    }
                    if(i==6){
                        if(Boolean.parseBoolean(response)==target.getIsDead()){
                            System.out.println(response + " is the correct " + guessableTraits[i]);
                        }
                        else{
                            System.out.println("WRONG");
                            fails ++;
                            i--;
                        }
                    }
                    if(i==7){
                        if(Double.parseDouble(response)==target.getHeight()){
                            System.out.println(response + " is the correct " + guessableTraits[i]);
                            
                        }
                        else{
                            System.out.println("WRONG");
                            fails ++;
                            i--;
                            
                        }
                    }
                }
        System.out.println("Think you know the celebrity? Guess!");
        String response = input.nextLine();
        if(response.equals( target.getName())){
            System.out.println("Yes, the celebrity is "+ target.getName());
            
            return true;
            
        }
        else{
            
            fails ++;
            System.out.println("WRONG");
            
        }
    }
    return false;
}

   
       

    public static void main(String[] args){
        addCelebrity();
        Celebrity target = chooseCeleb();
        Scanner input = new Scanner(System.in);

        traitsChoice(input, target);
        
        

            




    }
}