// TODO: Step 2 - Import file input statements here
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args) throws IOException
	{
		// Open the csv file and create a scanner and plant list
		FileInputStream forage = new FileInputStream("Forage.csv");
		Scanner forageScanner = new Scanner(forage);
		ArrayList<Plant> plants = new ArrayList<>();

		// Add a new Plant object parsed from each line of the csv file
		while (forageScanner.hasNextLine()) {
			String line = forageScanner.nextLine();
			Plant newPlant = new Plant(line);
			plants.add(newPlant);
		}

		// Close the scanner and file
		forageScanner.close();
		forage.close();

		// Print the parsed plants
		for (Plant plant : plants) {
			System.out.println(plant.toString());
			System.out.println();
		}
	}
}