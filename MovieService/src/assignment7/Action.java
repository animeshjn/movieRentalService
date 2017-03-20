package assignment7;

/**
 * Action movie class, Sub class of Movie. 
 * calculates the late fees in a way different from the parent class
 * @author Animesh Jain 
 *
 */
public class Action extends Movie {
/*
 * Overview:
 * Action movie class, Sub class of Movie. 
 * calculates the late fees in a way different from the parent class
 * */
	//instances from the parent class
	//Constructor from the parent class
	//member methods from the parent class
	
	//Methods
	
	/* (non-Javadoc)
	 * @see assignment7.Movie#calcLateFees(int)
	 */
	@Override
	public double calcLateFees(int numberOfDays) {
		/**
		 * Requires: Number of days
		 * Modifies: -
		 * Effects: returns the calculated late fee based on numberOfDays 
		 */
		double perDayLateFee = 3.0;
		return perDayLateFee * numberOfDays;
	}

}
