
public class GamblingSimulation {
	
    public static final int EveryDayStake = 100;
    public static final int bet = 1;

   	public static void main(String[] args) {
        		
	    System.out.println("Welcome To Gambling Simulator");
		
	    int Stake = EveryDayStake;

	    while (Stake > 50 && Stake < 150) {
	    int random = (int) Math.floor(Math.random() * 10) % 2;

	    if (random == bet) {
		Stake = Stake + 1;
		System.out.println("You Win.");
	    }
	    else
	    {
		Stake = Stake - 1;
		System.out.println("You Loose.");
	    }
	    }
	    if (Stake==50) {
		System.out.println("Player Resigned Due to Loosing " +Stake);
	    }
	    else
	    {
		System.out.println("Player Resigned Due to Winning " +Stake);
	    }

	}

}
