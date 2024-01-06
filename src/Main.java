public class Main {
    public static void main(String[] args) {
        String a = "ciao";
        String b = "caao";
        System.out.println(checkIfSame(a, b));
    }

    public static StringBuilder checkIfSame(String a, String b) {

        if (a.equals(b)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Le due stringhe sono uguali");
            return sb;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Le due stringhe sono diverse");
            return sb2;
        }
    }
}