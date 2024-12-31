import java.util.*;

public class Guess_no {
    int number;
    int noofguess;
    int guess;

    public Guess_no(){
        Random rand= new Random();
        this.number = rand.nextInt(100);
    }

    public int getnoofguess(){
        return this.noofguess;
    }

    public void setnoofguess(int g){
        this.noofguess = g;
    }

    public void userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your guess: ");
        guess = sc.nextInt();
    }

    public boolean isCorrectGuess(){
        if(guess == number){
            return true;
        }
        return false;
    }

    public void message(){
        if(guess > number){
            System.out.println("Wrong guess, guessed number is greater than the number to be guessed.");
        }
        if(guess < number){
            System.out.println("Wrong guess, guessed number is smaller than the number to be guessed.");
        }
        if(guess == number){
            System.out.println("Bingo!! You made the correct guess in your " + (getnoofguess() + 1) + "th attempt.");
        }
    }

    public static void main(String[] args) {
        Guess_no obj = new Guess_no();
        obj.setnoofguess(0);
        obj.userInput();
        while(!(obj.isCorrectGuess())){
            obj.message();
            obj.userInput();
            obj.setnoofguess(obj.getnoofguess()+1);
        }
        obj.message();
    }
}
