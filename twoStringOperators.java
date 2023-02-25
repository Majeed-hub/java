class twoStringOperators {
     public static void main(String[] args) {
       String str1= new String("Aimca") ;
        String str2= new String("Bhatkal");
        System.out.println("Total Character in "+str1 +" is = " +str1.length());
        System.out.println("Upper Case = "+str1.toUpperCase());
        System.out.println("Lower Case = "+str1.toLowerCase());
        System.out.println("After Concatination = "+str1.concat(str2));
        System.out.println("After Replacing A with L = "+str1.replace("A","L"));
        System.out.println("Character at 5 in Str2 = " + str2.charAt(5));
        System.out.println("Index Of t in str2 = " + str2.indexOf("t"));
        System.out.println("Substring of str1 = " + str1.substring(0, 3));
        System.out.println("Contains char i in str1? " + str1.contains("i"));
        System.out.println("Whether str1 ends with r? " + str1.endsWith("r"));
    }
}