package challenges.pin;

public class ValidatePin {
	
    public static boolean validate(String pin) {
    	
    	try {
    		Integer.valueOf(pin);
    	}
    	catch (NumberFormatException e) {
    		return false;
    	}
    	
        if (pin.length() < 4 || pin.length() > 6 || pin.length() == 5 || pin.isEmpty() || pin.contains("-") || pin.contains("+")) {
            return false;
        }
		return true;
    }
    
    public static void main(String[] args) {
        System.out.println(validate("1234"));
        System.out.println(validate("12345"));
        System.out.println(validate("123456"));
        System.out.println(validate("1234567"));
        System.out.println(validate("123"));
        System.out.println(validate(""));
        System.out.println(validate("-123"));
        System.out.println(validate("+123"));
        System.out.println(validate("abcd"));
        System.out.println(validate("1ab4"));
        System.out.println(validate("12" + " " + "34"));
        System.out.println(validate(" 1234"));
    }

}
