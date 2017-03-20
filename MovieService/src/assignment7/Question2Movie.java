package assignment7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Class to test the Movie class and its 3 extensions
 * Tests calculate methods and general instance variables.
 * @author Animesh Jain
 * */
public class Question2Movie {
	/**
	 * Class to test the Movie class and its 3 extensions
	 * Tests calculate methods and general instance variables.
	 * */
	
	Movie movie;
	Action action;
	Drama drama;
	Comedy comedy;


	/**
	 * Junit method to initialize data, run before the test cases 
	 */
	@Before
	public void initializeData() {
		//Effects: initializes data to all four objects 
		movie = new Movie();
		movie.setId(101);
		movie.setMovieTitle("My Generic Movie");
		movie.setMPAARating("PG");
		action = new Action();
		action.setId(222);
		action.setMovieTitle("The Dark Knight");
		action.setMPAARating("PG");
		comedy = new Comedy();
		comedy.setId(999);
		comedy.setMovieTitle("Mr Bean");
		comedy.setMPAARating("G");
		drama = new Drama();
		drama.setId(876);
		drama.setMovieTitle("Titanic");
		drama.setMPAARating("PG-13");

	}

	/**
	 * Test the correctness of MOvie class 
	 */
	@Test
	public void testMovie() {
		//Effects: Test the correctness of MOvie class 

		Assert.assertEquals("My Generic Movie", movie.getMovieTitle());
		Assert.assertEquals("PG", movie.getMPAARating());
		Assert.assertEquals("Failed", 20.0, movie.calcLateFees(10), 0D);
	}

	/**
	 * Test the correctness of Action class 
	 */
	@Test
	public void testActionMovie() {
		//Effects: Test the correctness of Action class 

		Assert.assertEquals("The Dark Knight", action.getMovieTitle());
		Assert.assertEquals("PG", action.getMPAARating());
		Assert.assertEquals("Failed", 30.0, action.calcLateFees(10), 0D);
	}

	/**
	 * Test the correctness of Comedy class 
	 */
	@Test
	public void testComedyMovie() {
		//Effects: Test the correctness of Comedy class
		Assert.assertEquals("Mr Bean", comedy.getMovieTitle());
		Assert.assertEquals("G", comedy.getMPAARating());
		Assert.assertEquals("Failed", 25.0, comedy.calcLateFees(10), 0D);
	}

	/**
	 * Test the correctness of Drama class
	 */
	@Test
	public void testDramaMovie() {
		//Effects: Test the correctness of Drama class
		Assert.assertEquals("Titanic", drama.getMovieTitle());
		Assert.assertEquals("PG-13", drama.getMPAARating());
		Assert.assertEquals("Failed", 20.0, drama.calcLateFees(10), 0D);
	}

	
	/**
	 * Test the correctness of Equals method in all classes 
	 */
	@Test
	public void testEquals() {
		//Effects: Test the correctness of Equals method in all classes
		Movie similarMovie = new Movie();
		similarMovie.setId(movie.getId());
		similarMovie.setMovieTitle(movie.getMovieTitle());
		similarMovie.setMPAARating(movie.getMPAARating());
		Assert.assertTrue("Test for Movie equals Failed", movie.equals(similarMovie));
		Action similarAction = new Action();
		similarAction.setId(action.getId());
		similarAction.setMovieTitle(action.getMovieTitle());
		similarAction.setMPAARating(action.getMPAARating());
		Assert.assertTrue("Test for Action Movie equals Failed", action.equals(similarAction));
		Comedy similarComedy = new Comedy();
		similarComedy.setId(comedy.getId());
		similarComedy.setMovieTitle(comedy.getMovieTitle());
		similarComedy.setMPAARating(comedy.getMPAARating());
		Assert.assertTrue("Test for Comedy Movie equals Failed", comedy.equals(similarComedy));
	}
	
	/**
	 *Method to print everything after tests are complete 
	 */
	@Test
	public void print()
	{
		//Effects: prints all the data after test
		System.out.println("Tests completed");
		System.out.println("Details:");
		System.out.println("Movie: "+movie.getMovieTitle());
		System.out.println("Late Fee (10 days)"+movie.calcLateFees(10));
		System.out.println("--");
		System.out.println("Action Movie: "+action.getMovieTitle());
		System.out.println("Late Fee (10 days)"+action.calcLateFees(10));
		System.out.println("--");
		System.out.println("Comedy Movie: "+comedy.getMovieTitle());
		System.out.println("Late Fee (10 days)"+comedy.calcLateFees(10));
		System.out.println("--");
		System.out.println("Drama Movie: "+drama.getMovieTitle());
		System.out.println("Late Fee (10 days)"+drama.calcLateFees(10));
		
		
	}
	
}
