public class Hamming {

    String leftStrand;
    String rightStrand;
    public Hamming(String leftStrand, String rightStrand) {
    if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    public int getHammingDistance() {

        if(this.leftStrand.equals("") && this.rightStrand.equals("")){
            return 0;
        }
        
        if(
            this.leftStrand.equals("") && !this.rightStrand.equals("") ||
            !this.leftStrand.equals("") && this.rightStrand.equals("")){
            throw new IllegalArgumentException("strands must be of equal length");
        }
        
        int diff = 0;
        
        for(int i = 0; i< this.leftStrand.length(); i++) {
            if(this.leftStrand.charAt(i) != this.rightStrand.charAt(i)) {
                diff++;
            }
        }

        return diff;
    }
}
