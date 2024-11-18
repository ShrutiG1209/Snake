import javax.swing.*;

public class App {
    public static void main(String[] args) {
        String playerName = JOptionPane.showInputDialog("Enter your name to start the game:");
        if (playerName == null || playerName.trim().isEmpty()) {
            playerName = "Player";
        }

        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame frame = new JFrame("Snake Game");
        SnakeGame game = new SnakeGame(boardWidth, boardHeight, playerName);

        frame.add(game);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
