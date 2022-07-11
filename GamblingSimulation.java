
public class GamblingSimulation {
		
    public static final int EveryDayStake = 100;
    public static final int bet = 1;

       	public static void main(String[] args) {
		
	    System.out.println("Welcome To Gambling Simulator");
		 
	    int random = (int)Math.floor(Math.random()*10) % 2;

	    if (random==bet) {

	    System.out.println("You Win.");
	    }
	    else
	    {
            System.out.println("You Loose.");
	    }
    
        }

}
