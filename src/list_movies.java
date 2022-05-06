import java.util.ArrayList;
import java.util.Scanner;

public class list_movies 
{

	public static void main(String[] args) 
	{
		
		ArrayList<Movies> movieList = new ArrayList<>();//adding cars to class/array list
		movieList.add(new Movies("Citizen Kane", "DRAMA"));
		movieList.add(new Movies("Casablanca", "DRAMA"));
		movieList.add(new Movies("The Silence Of The Lambs", "HORROR"));
		movieList.add(new Movies("E.T. The extra-terrestrial", "SCIFI"));
		movieList.add(new Movies("A Clockwork Orange", "SCIFI"));
		movieList.add(new Movies("Frankenstein", "HORROR"));
		movieList.add(new Movies("Fantasia", "ANIMATED"));
		movieList.add(new Movies("Snow White And The Seven Dwarfs", "ANIMATED"));
		movieList.add(new Movies("Pulp Fiction", "DRAMA"));
		movieList.add(new Movies("It", "HORROR"));
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to the Movie List Application!\n"
				+ "\n"
				+ "There are 10 movies in this list.\n"
				+ "The categories are:\n"
				+"\n"
				+ "ANIMATED\n"
				+ "DRAMA\n"
				+ "HORROR\n"
				+ "SCIFI\n");
	do {	
			System.out.println("What category are you interested in?:");
			String genre = scnr.nextLine();
			genre = genre.toLowerCase();
			String genre2 = genre.toUpperCase();
			System.out.println("Here are the movies in the category " + genre2 +":\n");
	
			for(Movies movies : movieList)
			{
				if(movies.getCategory().equalsIgnoreCase(genre))
				{
					System.out.print(movies.toString());
				}
			}
			
			System.out.println("\nContinue?(y or n):");	
			String userDecision = scnr.nextLine();
			System.out.println("\n");
			if(userDecision.equalsIgnoreCase("y"))
			{
				continue;
			}
			else
			{
				System.out.println("Goodbye!");
				break;
			}
		}while (true);
	
	scnr.close();
	
	}
}
