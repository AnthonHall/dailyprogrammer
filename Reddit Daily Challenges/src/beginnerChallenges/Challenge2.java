package beginnerChallenges;

/*	
	An important part of programming is being able to apply your programs, so your challenge for today is to create a calculator application 
	that has use in your life. It might be an interest calculator, or it might be something that you can use in the classroom. For example, 
	if you were in physics class, you might want to make a F = M * A calc.
	EXTRA CREDIT: make the calculator have multiple functions! Not only should it be able to calculate F = M * A, but also A = F/M, and 
	M = F/A!
*/
public class Challenge2 {

	public static void main(String[] args) {
		float amps = 0;
		float volts = 0;
		float ohms = 0;
		
		//consume all the arguments
		for (int i = 0; i<(args.length-1); i++) {
			if (args[i].equals("amps")) {
				amps = Float.valueOf(args[++i]).floatValue();
			}
			if (args[i].equals("volts")) {
				volts = Float.valueOf(args[++i]).floatValue();
			}
			if (args[i].equals("ohms")) {
				ohms = Float.valueOf(args[++i]).floatValue();
			}
		}
		
		//calculate or check missing value
		if (volts == 0) {
			volts = amps * ohms;
			System.out.println("volts = " + volts);
		} else if (amps == 0) {
			amps = volts / ohms;
			System.out.println("amps = " + amps);
		} else if (ohms == 0) {
			ohms = volts / amps;
			System.out.println("ohms = " + ohms);
		} else if (volts == (amps * ohms)) {
			System.out.println("That checks out!");
		} else {
			System.out.println("That's just wrong. You get zapped!");
		}
			
	}
}
