//Will read the contents of a txt file (one integer per line) and print to 
    //console
    import java.net.*;
import java.io.*;
   

    public class WebPagesStats {
	
	public static void main(String[] args) throws IOException {
		try {   //find my website and the txt file
			URL ui = new URL("http://sites.google.com/site/"
					+ "stephenkofflercodingprojects/"
					+ "files-to-download/CBS%2020181223%20PAGEVIEWS.TXT");
			URLConnection u2 = ui.openConnection();   //open connection
			InputStream input = u2.getInputStream();  //get inputStream
			
			BufferedReader in;  // For reading from the connection's input stream.
		     in = new BufferedReader( new InputStreamReader(input) );
		     
		 
		     while(in.read() != -1 )  {
		    	 
		    	 System.out.println(in.read()); //Print each line of BufferedReader
		     }
			} 
		catch (IOException e) {//IO Exception if file not found
			
			e.printStackTrace();
		}
	}

	
}//end
//end
