public class StringsBuffers {
    public static void main(String[] args) {

        //total 4 te method..
        StringBuffer st = new StringBuffer("Riyad");
        System.out.println(st.append(" Talukder"));
        System.out.println(st.append(677));
        System.out.println(st.append( 677.6655));
        System.out.println(st.reverse());
        System.out.println(st.delete(0,8)); //8-1=7..0-7 delete krbe
        st.setLength(5); //length 5 kre dise
        System.out.println(st); 
    }
}
