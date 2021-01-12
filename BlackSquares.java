import java.awt.*;

public class BlackSquares {
    private int row;
    private int col;
    private String color;

    public BlackSquares(int row, int col) {
        this.row = row;
        this.col = col;
    }
    public void render(Graphics g) {

        g.setColor(Color.BLACK);
        g.fillRect(100, 0, 100, 100);
        g.fillRect(300,0,100,100);
        g.fillRect(0,400,100,100);
        g.fillRect(400,400,100,100);

        g.setColor(Color.BLACK);
        g.drawRect(100,0,100,100);
        g.drawRect(300,0,100,100);
        g.drawRect(0,400,100,100);
        g.drawRect(400,400,100,100);

    }
}
