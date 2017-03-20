package assignment7;
/**
 * 
 * Movie class stores the details of the movie Tracks the Motion
 * Picture Association of America (MPAA) rating (e.g., Rated G, PG-13, R),
 * ID Number, and movie title. Also, provides implementation method to calculateLate Fee
 * @author Animesh Jain
 *
 */

public class Movie {
	/**
	 * Overview:
	 * Movie class stores the details of the movie Tracks the Motion
	 * Picture Association of America (MPAA) rating (e.g., Rated G, PG-13, R),
	 * ID Number, and movie title.
	 * Rep Invariant:  MPAARating, movieTitle should not be null
	 * Abstract function:  MPAARating != null && movieTitle !=null
	 *
	 * */
	// instances
	private String MPAARating;
	private int id;
	private String movieTitle;
	// methods
	/**
	 * Method to return the MPAARating
	 * 
	*  @return The MPAARating set to this
	 */
	public String getMPAARating() {
		 /**
		  *  Requires:-
		  *  Modifies:-
		  *  Effect: Returns the MPAARating of this
		  */	
		return new String(MPAARating);
	}
	/**
	 * Method to set the MPAARating 
	 * @param mPAARating The MPAARating of the movie to be set
	 */
	public void setMPAARating(String mPAARating) {
		/**
		 * Requires: mPAARating to be set to this
		 * Modifies: this
		 * Effect: Sets the given rating as MPAARating of this
		 */
		MPAARating = new String(mPAARating);
	}
	
	/**
	 *  Method to get the Id 
	 *  @return id Id of the movie
	 */
	public int getId() {
		/**
		 *Requires:-
		 *Modifies: - 
		 *Effect: Returns the id of the movie 
		 *
		 */
		return new Integer(id);
	}

	/**Method to set the id number
	 * @param id to be set to this
	 * 
	 */
	public void setId(int id) {
		/**
		 * Requires: id to be set to this
		 * Modifies: this 
		 * Effects: Sets the given id number as id of this
		 */
		this.id = new Integer(id);
	}

	/**
	 * Method for retrieving the movie title
	 * @return the movie title set to this
	 */
	public String getMovieTitle() {
		/**
		 * Requires: this to be not null
		 * Modifies: this 
		 * Effects: Returns the movie title set to this
		 * 
		 */
		return new String(movieTitle);
	}

	/**
	 * Method to set the movie title
	 * @param movieTitle Title to be set to this
	 */
	public void setMovieTitle(String movieTitle) {
		/**
		 * Requires: Movie title to be set to this
		 * Modifies: this
		 * Effects: Sets the given title as Movie title of this
		 */
		this.movieTitle = new String(movieTitle);
	}

	/**
	 * Method to check if two movie objects are equal
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @return True if two Movie objects have same id 
	 */
	@Override
	public boolean equals(Object movie) {
		/**
		 * Requires:Movie object to be compared to this
		 * Modifies: -
		 * Effects: Returns true if two movie objects have same id
		 */
		Movie movieObject=null;
		try{
			movieObject = (Movie) movie;
		 }catch(ClassCastException e){
			 System.out.println("Two objects are not of same type "+e.getMessage());
			 
		 }
		catch(Exception e ){
			System.out.println("Other Exception: "+e.getMessage());
		}
		return movieObject.getId() == this.getId();
	}

	/**
	 * Method to calculate late fee based on number of days
	 * @param numberOfDays Number of days for which late fee is to be calculated
	 * @return calculated late fee based on given number of days
	 */
	public double calcLateFees(int numberOfDays) {
		/**
		 * Requires: Number of days
		 * Modifies: -
		 * Effects: returns the calculated late fee based on numberOfDays 
		 */
		if(!repOk())
			return 0.0;
		double perDayLateFee = 2.0;
		return perDayLateFee * numberOfDays;
	}
	
	/**
	 * Method to ensure Rep Invariant is OK
	 * @return True if Rep-Invariant is maintained
	 */
	public boolean repOk()
	{	
		//Effects: returns true if MPAARating and movieTitle are not null
		if(MPAARating!=null&&movieTitle!=null)
		return true;
		else
		return false;
	}
}
