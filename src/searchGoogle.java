import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
 
public class searchGoogle {
 
	public static void main(String[] args) throws IOException {
        //Google's API to search and retrieve Title and URL upto 4 results
		String address = "http://ajax.googleapis.com/ajax/services/search/web?v=1.0&q=";
		String query;
		System.out.println("Please enter a keyword to search Google\n");
		Scanner in = new Scanner(System.in);
		query = in.nextLine();
		
		String charset = "UTF-8";
 
		URL url = new URL(address + URLEncoder.encode(query, charset));
		Reader reader = new InputStreamReader(url.openStream(), charset);
		//convert json data into java objects
		searchResults results = new Gson().fromJson(reader, searchResults.class);
		

 
		// Show title and URL of each results
		for(int i=0; i<1; i++){
			System.out.println("Title: " + results.getData().getResult().get(i).getTitle());
			System.out.println("URL: " + results.getData().getResult().get(i).getUrl() + "\n");
		}
	}
	

	 
	
}
 
 

 

 
