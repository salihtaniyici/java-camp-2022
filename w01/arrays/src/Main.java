public class Main {
    public static void main(String[] args) {

        System.out.println("Pharaohs List :");
        String[] pharaohs = new String[3];
        pharaohs[0] = "Tutankhamun";
        pharaohs[1] = "Neferneferuaten";
        pharaohs[2] = "Smenkhkare";

        // For
        for(int i = 0;i< pharaohs.length;i++){
            System.out.println(pharaohs[i]);
        }
        // For-Each
        System.out.println("Other for notation(For-Each)");
        for(String pharaoh : pharaohs){
            System.out.println(pharaoh);
        }



    }
}