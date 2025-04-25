public class _7_leapYear {
    public static void main(String[] args) {
        int y = 2012; // 2009

        if (y % 400 == 0) { // 400 dara nisshas e bibajjito hoyle
            System.out.println("Leap year");
        } else if (y % 4 == 0 && y % 100 != 0) { // 4 dara nisshas e bibajjito hoyle o 100 dara nisshas e bibajjito na
                                                 // hoyle
            System.out.println("Leap year");
        } else {
            System.out.println("Not leap year");
        }
    }
}
