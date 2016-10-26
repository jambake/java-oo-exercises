package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class Javagram {

	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath;
		Picture picture = null;
		Scanner in = new Scanner(System.in);
		
		// prompt user for image to filter and validate input
		do {

			String imagePath = "path not set";

			// try to open the file
			try {

				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();

				String[] relPathParts = relPath.split(File.separator);
				imagePath = dir + File.separator + String.join(File.separator, Arrays.asList(relPathParts));

				picture = new Picture(imagePath);

			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}

		} while(picture == null);

		// TODO - prompt user for filter and validate input
		// TODO - pass filter ID int to getFilter, and get an instance of Filter back 
		Filter filter = getFilter(displayFilterMenu(in));			

		// filter and display image
		Picture processed = filter.process(picture);
		processed.show();

		System.out.println("Image successfully filtered");

		// save image, if desired

		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		String fileName = in.next();

		// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
		if (fileName.equals("exit")) {
			System.out.println("Image not saved");
		} else if (fileName.equals(fileName)) {
			System.out.println("Are you sure you would like to overwrite the original file name? (type 'y' for YES or 'n' for NO)");
		}
		if (in.next().equals("y")){
			String absFileName = dir + File.separator + fileName;
			processed.save(absFileName);
			System.out.println("Image saved to " + absFileName);
		} else {
			System.out.println("Please type new file name: ");
			fileName = in.next();
			String absFileName = dir + File.separator + fileName;
			processed.save(absFileName);
			System.out.println("Image saved to " + absFileName);
		}

		// close input scanner
		in.close();
	}
	// END OF MAIN //	

	private static int displayFilterMenu(Scanner in){
		System.out.println("Welcome to the Filter Menu!");
		System.out.println("Please select a filter to use:");
		System.out.println("1: Blue Filter");
		System.out.println("2: Red Filter");
		System.out.println("3: Green Filter");
		System.out.println("4: Invert Colors");
		System.out.println("5: Grayscale");
		int selection = in.nextInt();
		while (selection < 0 || selection > 5)
		{
			System.out.println("Invalid selection, please try again: ");
			selection = in.nextInt();
		}
		return selection;
	}

	// TODO - refactor this method to accept an int parameter, and return an instance of the Filter interface
	// TODO - refactor this method to thrown an exception if the int doesn't correspond to a filter

	private static Filter getFilter(int selection) {
		if(selection < 0 || selection > 5){
			throw new IllegalArgumentException();
		} else if (selection == 1){
			return new BlueFilter();
		} else if (selection == 2){
			return new RedFilter();
		} else if (selection == 3){
			return new GreenFilter();
		} else if (selection == 4){
			return new InvertFilter();
		} else {
			return new GrayscaleFilter();
		}
		
		
		// TODO - create some more filters, and add logic to return the appropriate one

	}

}