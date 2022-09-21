public class Main {
    public static void main(String[] args) {

        String satteliteMsg = "OMG aliens really exist!!   ";

        System.out.println("Length :"+satteliteMsg.length());
        System.out.println(satteliteMsg.charAt(2));
        System.out.println(satteliteMsg.concat(" HEELLPP!"));
        System.out.println(satteliteMsg.startsWith("O"));
        System.out.println(satteliteMsg.endsWith("E"));
        char[] aliens = new char[23];
        satteliteMsg.getChars(0,5,aliens,0);
        System.out.println(aliens);
        System.out.println(satteliteMsg.indexOf('a'));
        System.out.println(satteliteMsg.lastIndexOf("exist"));

        // PART 2
        System.out.println(satteliteMsg.replace(' ','-'));
        System.out.println(satteliteMsg.substring(0,3));

        for (String word:satteliteMsg.split(" ")){
            System.out.println(word);
        }

        System.out.println(satteliteMsg.toLowerCase());
        System.out.println(satteliteMsg.toUpperCase());
        System.out.println(satteliteMsg.trim());
    }
}