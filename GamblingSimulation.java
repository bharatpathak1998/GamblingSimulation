
public class GamblingSimulation {
	
    public static final int EveryDayStake = 100;
    public static final int bet = 1;

	public static void main(String[] args) {
		
	    System.out.println("Welcome To Gambling Simulator");

	    int Stake = EveryDayStake;
            int month = 1;

	    while (month <= 12) {
	    int day = 1;
	    System.out.println("Month" + month);
        
	    while (day <= 30) {
            Stake = EveryDayStake;

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
		
	    if (Stake < EveryDayStake) {
		System.out.println("Day "+day+" lost by "+(EveryDayStake - Stake)+" rupees ");
	    }
	    else
	    {
		System.out.println("Day "+day+" won by " +(Stake - EveryDayStake)+" rupees ");
	    }
		day++;
	    }
		month++;
		System.out.println();
	    }

	}

}
