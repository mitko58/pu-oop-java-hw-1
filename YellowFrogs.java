import java.awt.*;

public class YellowFrogs {private int row;
    private int col;
    private String color;

    public YellowFrogs(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void render(Graphics g) {

        g.setColor(Color.YELLOW);
        g.fillRect(425,40,50,50);
        g.fillOval(325,40,50,50);
        g.fillOval(225,40,50,50);
        g.fillOval(125,40,50,50);
        g.fillOval(25,40,50,50);

        g.setColor(Color.GREEN);
        g.drawOval(325,40,50,50);
        g.drawOval(225,40,50,50);
        g.drawOval(125,40,50,50);
        g.drawOval(25,40,50,50);
    }

}
