import java.awt.*;

public class GrayCircle {
    private int row;
    private int col;
    private String color;

    public GrayCircle(int row, int col) {
        this.row = row;
        this.col = col;

    }

    public void render(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        g.fillOval(225,225,50,50);
    }
}
