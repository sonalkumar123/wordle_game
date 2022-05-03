import java.util.Scanner;
public class Wordle {
     public static void main(String[]args){
    
        String[] words = {"hello", "earth" , "sharp", "solid", "cable" };
        String word = words [(int)(Math.random()*words.length)];
                
                Scanner input = new Scanner(System.in);
                int g=6;
                String guss ="";
                while (!guss.equals(word)&&g>0){
                    System.out.println("\nYou have "+g+" gusses remaining");
                    guss= input.nextLine();
                    if(guss.length()!=5){
                        System.out.println("Must be five characters!");
                        continue;
                    }
                    for(int i=0;i<word.length();i++){
                        boolean didBreak =false;
                        for (int j=0;j<word.length();j++){
                            if(guss.charAt(i)==word.charAt(i)){
                                System.out.print("Y");
                                didBreak=true;
                                break;
                            }
                             if(guss.charAt(i)==word.charAt(i)){
                                System.out.print("Y");
                                didBreak=true;
                                break;
                            
                        }
                    }
                            
                        if(!didBreak){
                            System.out.print("x");
                        }
                }
                    g--;              
    }
            if (guss.equals(word)){
                System.out.println("\n You gussed it!");
            }
            else
                System.out.println("you failed! The word was:"+word);
    
}
}