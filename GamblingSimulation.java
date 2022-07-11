
public class GamblingSimulation {
	
    public static final int EveryDayStake = 100;
    public static final int bet = 1;

	public static void main(String[] args) {
		
	System.out.println("Welcome To Gambling Simulator");

        int Stake = EveryDayStake;

        for(int i=0; i<=20; i++) {
        	
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
            System.out.println(Stake);

        }
        
            if (Stake<EveryDayStake) {
                System.out.println("After 20 days Player lost by "+(EveryDayStake - Stake)+" rupees ");
            }
            else
            {
                System.out.println("After 20 days Player won by " +(Stake - EveryDayStake)+" rupees ");
            }

	}

}
