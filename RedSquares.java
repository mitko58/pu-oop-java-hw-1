import java.awt.*;

public class RedSquares {
    private int row;
    private int col;
    private String color;

    public RedSquares(int row, int col) {
        this.row = row;
        this.col = col;
    }
    public void render(Graphics g) {

        g.setColor(Color.RED);
        g.fillRect(0, 0, 100, 100);
        g.fillRect(400,0,100,100);
        g.fillRect(100,400,100,100);
        g.fillRect(300,400,100,100);

        g.setColor(Color.BLACK);
        g.drawRect(0,0,100,100);
        g.drawRect(400,0,100,100);
        g.drawRect(100,400,100,100);
        g.drawRect(300,400,100,100);
    }
}
