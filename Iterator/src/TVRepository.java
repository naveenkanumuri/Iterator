
public class TVRepository implements Container {
	
	 public String tvNames[] = {"MI Tv" , "Real me Tv" ,"Sony TV" , "Samsung Tv"};

	@Override
	public Iterator getIterator() {
		 
		return new TruckIterator();
	}

	private class TruckIterator implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < tvNames.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return tvNames[index++];
	         }
	         return null;
	      }		
	   }
	
	
	
}
