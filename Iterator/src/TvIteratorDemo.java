
public class TvIteratorDemo {

	public static void main(String[] args) {
	 
		
		TVRepository tvRepository = new TVRepository();

	  
	  System.out.println("Disply Telivision list \n");
	  
	  
	      for(Iterator iter = tvRepository.getIterator(); iter.hasNext();){
	         String tv = (String)iter.next();
	         System.out.println( tv);
	      } 	
	   }
	
	
	
}
