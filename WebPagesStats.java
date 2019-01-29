
import java.net.*;
import java.io.*;
   

    public class WebPagesStats {
		
		public static void main(String[] args) throws IOException {
			
	
				
			try {   /*find my website and the txt file, Extract Siteowner name
					and the date from URL, count the number of visits per site
					and determine the most visited site. Print to console.*/
					
			//This block of code finds the file at the site and reads in contents.
			URL mySite = new URL("https://raw.githubusercontent.com/stephenkk/MediaAnalytics/master/CBS%2020181223%20PageViews.txt");
			URLConnection myConnection = mySite.openConnection();   //open connection
			InputStream input = myConnection.getInputStream();  //get inputStream
			BufferedReader in;  // For reading from the connection's input stream.
			in = new BufferedReader( new InputStreamReader(input) );
			
			//This block of code extracts the name and date from the URL and prints them
			String urlName = mySite.toString();
			String fileName = urlName.substring(urlName.lastIndexOf('/') + 1);
			String siteOwnerName = fileName.substring(0, fileName.indexOf('%'));
			System.out.print(siteOwnerName+ " ");
			String rawDate = fileName.substring(fileName.indexOf('0')+1,
					fileName.indexOf('0')+9);
			System.out.println(rawDate.substring(4,6)+"-"+rawDate.substring(6, 8)+ "-"+
					rawDate.substring(0,4));
			
			/*This block of reads each visit to a sub-page into an array,
			 counts the visits per sub-page and determines which one had the most visits. */
			String line="";
			int[] Visits = new int[100];
			int most = 0;
			int mostVisited = 0;
			int i = 0;
			while(line != null){	
				line = in.readLine();
					if(line != null) {
						Visits[Integer.parseInt(line)] = Visits[Integer.parseInt(line)] + 1;
							if (Visits[Integer.parseInt(line)] > most)  {	//compares visits to current index to most. 
								most = Visits[Integer.parseInt(line)];		//assigns contents of current index to most if Visits[i] > most
								mostVisited = Integer.parseInt(line);//index i saved to mostVisited if Visits[i] > most
							}
					}
				}
				//Print results to console
				for( i=0; i<100; i++){
					if(Visits[i]>0)
						System.out.println("Site " + i +" was visited " + Visits[i] + " times");
				}
				
				System.out.println("\nSite "+ mostVisited + " was most visited at " + most + " times");
				in.close();
				input.close(); //close InputStream and BufferedReader
			}
	
			
			
				catch (IOException e) {//IO Exception if file not found
					e.printStackTrace();
					}
		}
    }
    
		
