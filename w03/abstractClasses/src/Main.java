public class Main {
    public static void main(String[] args) {
        BaseScoreCalc baseScoreCalc = new MaleScoreCalc();
        baseScoreCalc.calculate();
        baseScoreCalc.gameOver();
    }
}