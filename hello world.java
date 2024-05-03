public class a1_Assignment {
    
    //Program From https://github.com/shreyas5522/information-security/

    public static void main(String[] args) {
        String str = "Hello World";
        int len = str.length();
        char[] str1 = new char[len];
        char[] str2 = new char[len];
        char[] str3 = new char[len];

        for (int i = 0; i < len; i++) {
            str1[i] = (char) (str.charAt(i) & 127);
            str2[i] = (char) (str.charAt(i) ^ 127);
            str3[i] = (char) (str.charAt(i)|127);

        }

        System.out.println("AND operation: " + new String(str1));
        System.out.println("XOR operation: " + new String(str2));
        System.out.println("OR operation: " + new String(str3));
    }
}