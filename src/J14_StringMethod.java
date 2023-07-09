public class J14_StringMethod {
    public static void main(String[] args) {
        String str = "Ravikant";
        System.out.println(str);

        int len = str.length();
        System.out.println(len);

        String str1 = str.toLowerCase();
        String str2 = str.toUpperCase();
        System.out.println(str1);
        System.out.println(str2);

        String tstr = " This is Ravikant  ";
        String tstr1 = tstr.trim();
        System.out.println(tstr);
        System.out.println(tstr1);

        String tstr2 = tstr.substring(9,13);
        System.out.println(tstr2);

        String tstr3 = tstr.replace('R', 'r');
        System.out.println(tstr3);

        System.out.println(str.startsWith("Ra"));
        System.out.println(str.endsWith("nt"));
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf('k'));
        System.out.println(str.indexOf('a',3));
        System.out.println(str.lastIndexOf('a', 7));
        System.out.println(str.equalsIgnoreCase("ravikant"));

        // If it not matched with any string then it will return -1
    }
}
