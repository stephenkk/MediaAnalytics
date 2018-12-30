import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;

public class WebPagesStats {

	public static void main(String[] args) {

		String fileName = "CBS 20180601 PageViews.txt";
		int Visits[] = new int[101];
		int i = 1;
		Scanner reader;
		try {
			reader = new Scanner(new File("C:\\" + fileName));
			while (reader.hasNext()) {
				Visits[i] = reader.nextInt();
				i++;

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Read Company name from file name into String
		int j = 0;
		String companyName = "";
		while (fileName.charAt(j) != ' ') {
			companyName = companyName + fileName.charAt(j);
			j++;
		}
		System.out.println("Website name: " + companyName);

		// Extract Date from filename in YYYMMDD format
		j++;
		String date = "";
		while (fileName.charAt(j) != ' ') {
			date = date + fileName.charAt(j);
			j++;
		}

		// Print Date in YYYY-MM-DD format
		System.out.print("PageView Date: " + date.charAt(0));
		System.out.print(date.charAt(1));
		System.out.print(date.charAt(2));
		System.out.print(date.charAt(3));
		System.out.print("-");
		System.out.print(date.charAt(4));
		System.out.print(date.charAt(5));
		System.out.print("-");
		System.out.print(date.charAt(6));
		System.out.println(date.charAt(7));

		Arrays.sort(Visits); // Sort array
		//for (int z = 1; z < 100; z++)
			//System.out.print(Visits[z]);

		j = 1;
		int most = 1;
		int indexmost = 0;

		for (int index = 99; index > 0; index--) {
			if (Visits[index] == Visits[index - 1]) {
				j++;
				if (j > most) {
					most = j;
					indexmost = index;
				}
					
			}
			
			else {
				System.out.println("WebPage " + Visits[index] + " was " + "viewed " + j + " times.");
				j = 1;
			}
			
		}
		System.out.println("\nWebPage " + Visits[indexmost] + " was " + "viewed " + "the most at " + most + " times.");
	}
}