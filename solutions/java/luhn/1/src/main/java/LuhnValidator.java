class LuhnValidator {

    boolean isValid(String candidate) {
       if (candidate == null) return false;
        String validString = candidate.replaceAll("\\s+","");

        if(!validString.matches("\\d{2,}")) return false;

        int sum = 0;
        boolean doubleDigit = false;

        for(int i = validString.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(validString.charAt(i));
            if(doubleDigit) {
                digit *= 2;
                if (digit > 9) digit -= 9;
                
            }
            sum = sum + digit;
            doubleDigit = !doubleDigit;
        }
       
        return sum%10 == 0;
    }

}
