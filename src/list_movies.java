import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class list_movies {

	public static void main(String[] args) {

		ArrayList<Movies> movieList = new ArrayList<>();// adding cars to class/array list
		
		//***list before I added moviesIO***
		
		//movieList.add(new Movies("Citizen Kane", "DRAMA"));
		//movieList.add(new Movies("Casablanca", "DRAMA"));
		//movieList.add(new Movies("The Silence Of The Lambs", "HORROR"));
		//movieList.add(new Movies("E.T. The extra-terrestrial", "SCIFI"));
		//movieList.add(new Movies("A Clockwork Orange", "SCIFI"));
		//movieList.add(new Movies("Frankenstein", "HORROR"));
		//movieList.add(new Movies("Fantasia", "ANIMATED"));
		//movieList.add(new Movies("Snow White And The Seven Dwarfs", "ANIMATED"));
		//movieList.add(new Movies("Pulp Fiction", "DRAMA"));
		//movieList.add(new Movies("It", "HORROR"));
		
		for (int i = 1; i <= 100; i++) {//add movies from MoviesIO
			movieList.add(MoviesIO.getMovies(i));
		}

		Collections.sort(movieList, movieComparator);// sorting by alphabetical

		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to the Movie List Application!\n" + "\n" + "There are 10 movies in this list.\n"
				+ "The categories are:\n" + "\n" + "1 = ANIMATED\n" + "2 = DRAMA\n" + "3 = HORROR\n" + "4 = SCIFI\n");
		do {// main loop
			String genre = "";
			do {// do while loop for number / genre system
				System.out.println("What category are you interested in? (enter 1-4):");
				int choice = scnr.nextInt();
				if (choice == 1) {
					genre = "animated";
					break;
				} else if (choice == 2) {
					genre = "drama";
					break;
				} else if (choice == 3) {
					genre = "horror";
					break;
				} else if (choice == 4) {
					genre = "scifi";
					break;
				} else {
					System.out.println("Thats not a valid choice, try again.");
					continue;
				}
			} while (true);

			String genre2 = genre.toUpperCase();
			System.out.println("Here are the movies in the category " + genre2 + ":\n");

			for (Movies movies : movieList) {
				if (movies.getCategory().equalsIgnoreCase(genre)) {
					System.out.print(movies.toString());
				}
			}

			scnr.nextLine();
			System.out.println("\nContinue?(y or n):");
			String userDecision = scnr.nextLine();
			System.out.println("\n");
			if (userDecision.equalsIgnoreCase("y")) {
				continue;
			} 
			else if (userDecision.equalsIgnoreCase("n")){
				System.out.println("Goodbye!");
				break;
			}
			else {
				System.out.println("Thats not a valid option, goodbye!");
				break;
			}
		} while (true);

		scnr.close();

	}

	public static final Comparator<Movies> movieComparator = new Comparator<Movies>() // sorting by alphabetical
	{
		public int compare(Movies a1, Movies a2) {
			return a1.getTitle().compareTo(a2.getTitle());
		}
	};
}
