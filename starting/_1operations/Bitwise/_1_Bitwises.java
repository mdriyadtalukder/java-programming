public class _1_Bitwises {
    public static void main(String[] args) {
        int a = 32;
        int b = 12;

        int c = a & b; // convert a and b into binary then multiply a value of a with a value of b
                       // according to order..2 ta same thkle 1.. but 2 tai 0 thkle 0.
        int d = a | b; // convert a and b into binary then addition a value of a with a value of b
                       // according to order... 2 tai 0 thkle just 0..
        int e = a ^ b; // convert a and b into binary then 1 will be if the value order pair will be
                       // 0,1 otherwise it will be 0..2 ta alada thkle 1..XOR
        int x = ~(a + b); // NOT..inverse krbe all values k..like 1 hbe 0 r 0 hbe 1...1001 will be 0110.
        int f = a >> 3; // convert a into binary then it will be back 3 index..so it means a k 2 dara 3
                        // bar vag dite hbe..it means koma
        int g = a << 3; // convert a into binary then it will be extend 3 index..so it means a er new
                        // value guli k 3 bar 2 tara gun krte hbe..it means bara

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(x);
    }
}
