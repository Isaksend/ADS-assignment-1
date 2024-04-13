public class taskDef {
    public static void main(String[] args) {
        String s = "delete";
        System.out.println(Countoccurance(s));
    }
    private static int Countoccurance(String s) {
        int n = 1;
        int counter = 0;
        String oneChar = "e";
        var indexLetter = s.charAt(n);
        if (oneChar.charAt(0) == indexLetter);{
            return counter+1;
        }
        Countoccurance(s);
        return counter;
    }
}
