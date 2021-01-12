import java.awt.*;

public class GreenFrogs {
    private int row;
    private int col;
    private String color;

    public GreenFrogs(int row, int col) {
        this.row = row;
        this.col = col;

    }

    public void render(Graphics g) {

        g.setColor(Color.GREEN);
        g.fillRect(25,425,50,50);
        g.fillOval(125,425,50,50);
        g.fillOval(225,425,50,50);
        g.fillOval(325,425,50,50);
        g.fillOval(425,425,50,50);


        g.setColor(Color.YELLOW);
        g.drawOval(125,425,50,50);
        g.drawOval(225,425,50,50);
        g.drawOval(325,425,50,50);
        g.drawOval(425,425,50,50);

    }
}
