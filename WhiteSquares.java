import java.awt.*;

public class WhiteSquares {
    private int row;
    private int col;
    private String color;

    public WhiteSquares(int row, int col) {
        this.row = row;
        this.col = col;

    }

    public void render(Graphics g) {

        g.setColor(Color.WHITE);
        g.fillRect(0, 200, 100, 100);
        g.fillRect(100, 200, 100, 100);
        g.fillRect(200, 200, 100, 100);
        g.fillRect(300, 200, 100, 100);
        g.fillRect(400, 200, 100, 100);
        g.fillRect(200, 0, 100, 100);
        g.fillRect(200, 100, 100, 100);
        g.fillRect(200, 300, 100, 100);
        g.fillRect(200, 400, 100, 100);

        g.setColor(Color.BLACK);
        g.drawRect(0, 200, 100, 100);
        g.drawRect(100, 200, 100, 100);
        g.drawRect(200, 200, 100, 100);
        g.drawRect(300, 200, 100, 100);
        g.drawRect(400, 200, 100, 100);
        g.drawRect(200, 0, 100, 100);
        g.drawRect(200, 100, 100, 100);
        g.drawRect(200, 300, 100, 100);
        g.drawRect(200, 400, 100, 100);
    }
}