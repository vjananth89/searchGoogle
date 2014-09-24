import java.util.List;



 
public class searchResults{
	//This class is for creating getters and setters to capture the appropriate JSON data into 
	//objects. The objects are named exactly the same as the JSON data fields provided by Google.
	//It is important to set the name of the objects exactly the same for the GSON jar to identify
	//and populate data.
 
    public ResultsData responseData;
    public ResultsData getData() 
    { 
    	return responseData; 
    	
    }
    public void setData(ResultsData responseData)
    { 
    	
    	this.responseData = responseData;
    	
    }
    public String toString() 
    
    { 
    	
    	return "ResponseData[" + responseData + "]";
    	
    }
 
    static class ResultsData {
        public List<searchResult> results;
        public List<searchResult> getResult() 
        { 
        	return results; 
        	}
        public void setResult(List<searchResult> results) 
        {
        	this.results = results; 
        	}
        public String toString() { 
        	
        	return "Result[" + results + "]"; 
        	}
    }
 
    static class searchResult {
        public String url;
        public String title;
        
        public String getUrl() 
        { 
        	return url; 
        	
        	}
        public String getTitle() 
        { 
        	
        	return title; 
        	
        	}
        public void setUrl(String url) 
        {
        	
        	this.url = url; 
        	
        	}
        public void setTitle(String title) 
        { 
        	
        	this.title = title;
        	
        	}
        public String toString() 
        
        {
        	return "Result[url:" + url +",title:" + title + "]";
        	}
  
    }
    }