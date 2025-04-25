public class _8_MathMethod {
    public static void main(String[] args) {
        /*
         * 
         * Basic Math Methods
         * Method Description Example
         * Math.abs(x) Absolute value Math.abs(-5) → 5
         * Math.max(a, b) Larger of two numbers Math.max(3, 7) → 7
         * Math.min(a, b) Smaller of two numbers Math.min(3, 7) → 3
         * Math.pow(a, b) a raised to the power of b Math.pow(2, 3) → 8.0
         * Math.sqrt(x) Square root Math.sqrt(25) → 5.0
         * Math.cbrt(x) Cube root Math.cbrt(27) → 3.0
         * Math.floor(x) Largest integer ≤ x Math.floor(5.8) → 5.0
         * Math.ceil(x) Smallest integer ≥ x Math.ceil(5.2) → 6.0
         * Math.round(x) Round to nearest integer Math.round(4.6) → 5
         * Math.random() Random number [0.0, 1.0) Math.random() → 0.675...
         * 
         */
        int a = -8;

        System.out.println(Math.abs(a));
        System.out.println(Math.max(67, 100));
        System.out.println(Math.min(67, 100));
        System.out.println(Math.pow(5, 2));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.log(64));
        System.out.println(Math.log10(64));
        System.out.println(Math.round(5.3));
        System.out.println(Math.round(5.5));
        System.out.println(Math.round(5.6));
        System.out.println(Math.ceil(5.6));
        System.out.println(Math.ceil(-5.6));
        System.out.println(Math.floor(5.6));
        System.out.println(Math.floor(-5.6));

        double random = 5 + Math.random() * (10 - 5);
        System.out.println("Random number between 5 and 10: " + random);

        int randomInt = (int) (1 + Math.random() * (100 - 1 + 1));
        System.out.println("Random integer between 1 and 100: " + randomInt);

        double r = 4 + Math.random() * (8 - 4);
        int rr = (int) (2 + Math.random() * (10 - 2 + 1));

        System.out.println(r);
        System.out.println(rr);

        /*
         * ✅ Trigonometric Methods (in Radians)
         * Method Description Example
         * Math.sin(x) Sine Math.sin(Math.PI / 2) → 1.0
         * Math.cos(x) Cosine Math.cos(0) → 1.0
         * Math.tan(x) Tangent Math.tan(Math.PI / 4) → 1.0
         * Math.asin(x) Inverse sine Math.asin(1.0) → 1.57...
         * Math.acos(x) Inverse cosine Math.acos(1.0) → 0.0
         * Math.atan(x) Inverse tangent Math.atan(1.0) → 0.785...f
         * ✅ Logarithmic and Exponential Methods
         * Method Description Examplef
         * Math.log(x) Natural log (base e) Math.log(Math.E) → 1.0
         * Math.log10(x) Base-10 log Math.log10(1000) → 3.0
         * Math.exp(x) e raised to x Math.exp(1) → 2.718...
         * ✅ Constants
         * Constant Description Value
         * Math.PI π 3.14159...
         * Math.E Euler's number 2.71828...
         * ✅ Special Methods
         * Method Description
         * Math.copySign(mag, sign) Gives mag with the sign of sign
         * Math.hypot(x, y) Calculates √(x² + y²) without overflow
         * Math.toRadians(deg) Degrees → Radians
         * Math.toDegrees(rad) Radians → Degrees
         * Math.ulp(x) Returns the size of the unit in the last place
         * Math.signum(x) Returns the sign of the number
         */
    }
}
