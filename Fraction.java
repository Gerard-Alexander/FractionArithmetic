package GroupProject122;

public class Fraction {
    /**
     * initialize instance variables
     */
    private int numerator;
    private int denominator;

    /**
     * create the constructor
     */
    public Fraction(){
        numerator= 0;
        denominator = 1;
    }
    /**
     * contructor with parameters
     */
    public Fraction(int wholeNumberVal){

    }
    public Fraction(int num , int den){
        numerator=num;
        denominator=den;
    }
    /**
     * create setters and getters for each instance variables
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator){
        this.denominator=denominator;
    }
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
//     method to create GCD
//     GCD is used to convert fractions into its simplest form
//     example: 2/4 = 1/2
//     we need the denominator of the 1st fraction and 2nd fraction, hence the parameters
    private int computeGCD(int denominator1, int denominator2){
        // in this code, we will utilize the euclid's algorithm to find gcd
        // by doing this, we need the remainders of denominators. so:
        int remainder;
        /**we will initialize the value of remainder to the second denominator
           because while the remainder is not yet equal to 0, the denominator1 will be the denominator2
           and denominator2 will be the remainder. so:
         */
        while (denominator2!=0) { //when denominator is not yet equal to 2, it means that it is not a common factor of two numbers
            remainder = denominator2;
            denominator2 = denominator1%denominator2; //this is to get the remainder of the two denominators. the variable name denominator2 is ok since it will be also the value of remainder
            denominator1 = remainder;
        }
        return denominator1; //we have to return the last value when the remainder became 0, hence denominator1
    }
    //this method will compute the least common denominator to make dissimilar fractions similar
    private int computeLCD(int denominator1 , int denominator2){
        //set the initial value of common factor to denominator 1
        // so that when the addition assignment operator will be helpful
        int commonFactor = denominator1;
        //loop until the remainder is not = 0.
        // when 0, this means that the final value is now the common factor or the LCD
        while ((denominator1%denominator2)!= 0)
            denominator1 += commonFactor; //addition assignment operator, it works by adding the commonFactor to denominator1 and making it the value of denominator 1
        return denominator1;
    }
    public void add(Fraction another){
//        denominator;
//        Fraction result = new Fraction();
//        result.setNumerator(numerator);
//        result.setDenominator(denominator);
//        // this code will be used then the fraction is a similar fraction
//       if (result.denominator == another.denominator){
//           result.numerator = result.numerator + another.numerator;
//       }
//       //this code will be used if the fraction is dissimilar
//       //this will utilize finding the lcm to make them similar
//       int lcm = (result.denominator<)
//
//
//        return;
    }
    public void subtract(Fraction another){
        return;
    }
    public void multiplyBy(Fraction another){
        return;
    }
    public void divideBy(Fraction another){
        return;
    }
}

