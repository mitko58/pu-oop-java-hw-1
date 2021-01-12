import java.awt.*;

public class GraySquares {
    private int row;
    private int col;
    private String color;

    public GraySquares(int row, int col) {
        this.row = row;
        this.col = col;

    }

    public void render(Graphics g) {

        g.setColor(Color.GRAY);
        g.fillRect(0,100,100,100);
        g.fillRect(100,100,100,100);
        g.fillRect(300,100,100,100);
        g.fillRect(400,100,100,100);
        g.fillRect(0,300,100,100);
        g.fillRect(100,300,100,100);
        g.fillRect(300,300,100,100);
        g.fillRect(400,300,100,100);

        g.setColor(Color.BLACK);
        g.drawRect(0,100,100,100);
        g.drawRect(100,100,100,100);
        g.drawRect(300,100,100,100);
        g.drawRect(400,100,100,100);
        g.drawRect(0,300,100,100);
        g.drawRect(100,300,100,100);
        g.drawRect(300,300,100,100);
        g.drawRect(400,300,100,100);

    }
}
