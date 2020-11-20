import java.util.*;

public class gameProject {
    
public static void main (String[] args) {

Scanner console = new Scanner (System.in);
Random r = new Random();

int money = 100;

// enter betting round
while (money>0) {
    // prompt for bet type
    System.out.println ("What kind of bet would you like to place? Enter 1 for even and 2 for odd.");
    int betType = console.nextInt();

    // prompt for bet amount
    System.out.println ("Place your bet! You currently have $" + money + ". How much do you want to bet? Enter as a whole number without $.");
    int bet = console.nextInt();

    //roll the die
    int roll = r.nextInt(6) + 1;
    System.out.println ("The die came up a " + roll);
      

    if (betType==1) {

        if (roll % 2 == 0) {
        System.out.println ("You Won!");
        money = money+bet;
    }

        else {
        System.out.println ("You Loose!");
        money = money-bet;
    
    }}

    if (betType==2) {

        if (roll % 2 == 1) {
        System.out.println ("You Won!");
        money = money+bet;
        }
    
        else {
            System.out.println ("You Loose!");
            money = money-bet;
        
        }
}

    System.out.println(money);
    // need to return money to main for next iteration
    }
}

}
