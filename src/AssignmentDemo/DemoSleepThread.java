package AssignmentDemo;


	
	class DemoOfSleep implements Runnable{

		
		public void run() { 
			
			for(int i=1;i<=10;i++){ // Here by using for loop to print 10 times.
				
				System.out.println(i+ ": Welcome to AcadGild " );
				
				/**
				 * Here by Try and Catch block to handle exceptions also using Sleep method to hold a output for a mentioned particular time
				 */
				
				try{
					Thread.sleep(3000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	public class DemoSleepThread { //Here by creating DemoSleepThread. 

	public static void main(String[] args) { // Here by creating main method.
	
		// Here by Calling start method.
		
		Thread thrd= new Thread(new DemoOfSleep());
		thrd.start();

	}

}
