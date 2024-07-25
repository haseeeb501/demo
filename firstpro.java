package firstpro;

public class firstpro {
    public static void main(String[] args) {
    	        int[] array = {1, 2, 3, 4, 5};
    	        boolean sorted = true;
    	        for (int i = 1; i < array.length; i++) {
    	            if (array[i] < array[i - 1]) {
    	                sorted = false;
    	                break;
    	            }
    	        }
    	        System.out.println("Is sorted: " + sorted);
    	    }
    	}
