public class Main {
    public static void main(String[] args) {
        String [][] codeLang = new String[3][3];
        codeLang[0][0]="HTML";
        codeLang[0][1]="CSS";
        codeLang[0][2]="JAVASCRİPT";
        codeLang[1][0]="PHP";
        codeLang[1][1]="JAVA";
        codeLang[1][2]="CSHARP";
        codeLang[2][0]="C++";
        codeLang[2][1]="PYTHON";
        codeLang[2][2]="KOTLIN";

        for(int i = 0; i <= 2 ; i++){
            for (int j = 0; j <= 2 ; j++){
                System.out.println(codeLang[i][j]);
            }
        }
    }
}