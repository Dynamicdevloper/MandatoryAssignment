package in.ineuron;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 27; 
		getNthRoot(2, m); 

	}
	
	 private static double multiply(double number, int n) {
        double ans = 1.0;
        for(int i = 1;i<=n;i++) {
            ans = ans * number;
        }
        return ans; 
     }
	
	  private static void getNthRoot(int n, int m) {
	        double low = 1;
	        double high = m;
	        double eps = 1e-7; 
	        
	        while((high - low) > eps) {
	            double mid = (low + high) / 2.0; 
	            if(multiply(mid, n) < m) {
	                low = mid; 
	            }
	            else {
	                high = mid; 
	            }
	        }
	        
	        System.out.println(n+"th root of "+m+" is "+(int)low);  
	        
	    }

}
