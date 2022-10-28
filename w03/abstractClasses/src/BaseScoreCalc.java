public abstract class BaseScoreCalc {
    public abstract void calculate();

    public final void gameOver(){
        System.out.println("GAME OVER!");
    }
}
