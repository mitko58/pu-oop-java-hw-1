import javax.swing.*;
import java.awt.*;

//Инициализираме дъската и я правим да може да бъде видима
public class Board extends JFrame {
        public Board(){

            this.setSize(500, 500);
            this.setVisible(true);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        }
        //Задаваме критерии на дъската и създаваме класове за всички видове правоъгълници(квадрати), които ще правим
        @Override
        public void paint(Graphics g) {
            super.paint(g);

            for(int row = 0; row < 5; row++) {
                for(int col = 0; col < 5; col++) {

                    RedSquares rs = new RedSquares(row, col);
                    rs.render(g);

                    BlackSquares bs = new BlackSquares(row, col);
                    bs.render(g);

                    GraySquares gs = new GraySquares(row,col);
                    gs.render(g);

                    WhiteSquares ws = new WhiteSquares(row, col);
                    ws.render(g);

                    GrayCircle grayCircle = new GrayCircle(row,col);
                    grayCircle.render(g);

                    GreenFrogs greenFrogs = new GreenFrogs(row,col);
                    greenFrogs.render(g);

                    YellowFrogs yellowFrogs = new YellowFrogs(row,col);
                    yellowFrogs.render(g);
                }
            }
        }
    }

