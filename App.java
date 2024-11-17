import javax.swing.JFrame;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int boardWidth = 600;
        int boardHeight = boardWidth; // Corrected typo from boardHeigth to boardHeight
        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Added missing closing parenthesis
    }
}
