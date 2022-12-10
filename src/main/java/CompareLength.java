public class CompareLength {


    public boolean checkFeetIntoYard(double yard, double feet) {

        if (feet == 3 * yard ) {
            return true;
        } else return false;
    }
    public boolean checkFeetIntoInches(double yard, double inches) {

        if (inches == 36 * yard) {
            return true;
        } else return false;
    }
}
