public class AvgCalc {
	
	private double[] nums;

    public AvgCalc(double[] array) throws Exception {
    	
        for (double i : array) {  // Checks every value in an array of Doubles
        	
        	if (i < 0 || i > 200) {
                throw new Exception("");
            }  // Throws exception if not a number within 0-200
        	
            if (Double.isNaN(i)) {
                throw new IllegalArgumentException();
            }  // Throws exception if input in array is not a number
            
        }
        
        this.nums = array;
    }

    public double avg() {
        double sum = 0;
        
        for (double i : nums) {
            sum += i;
        }
        
        return sum / nums.length;  // Method that calculates the average of the doubles
    }

}
