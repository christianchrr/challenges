package challenges.pronic;

public class Pronic {

	public static boolean isPronic(Integer num) {
		
		for (int i = 0; i <= num; i++) {
			if (i * (i + 1) == num) {
				return true;
			}
		}
		
		return false;
	}
	
    public static void main(String[] args) {
    	System.out.println(isPronic(0));
    	System.out.println(isPronic(2));
    	System.out.println(isPronic(7));
    	System.out.println(isPronic(110));
    	System.out.println(isPronic(136));
    	System.out.println(isPronic(156));
    }
}

