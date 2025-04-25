public class _5_ASCIIToCharacter {
    public static void main(String[] args){
        int ascii=72;
        char character=(char) ascii;
        System.out.println(character);

//by using loop
        for(int i=65;i<=90;i++){
            char ch=(char) i;
            System.out.println(ch);
        }
    }
}
