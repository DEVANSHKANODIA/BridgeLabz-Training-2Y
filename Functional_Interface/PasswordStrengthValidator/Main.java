interface SecurityUtils{static boolean strong(String p){return p.length()>=8;}}
public class Main{public static void main(String[]a){System.out.println(SecurityUtils.strong("pass1234"));}}