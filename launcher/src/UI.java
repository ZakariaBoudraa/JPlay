package src;
import blobgame.Main;
import components.GameLauncher;
import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {

    public UI() {
        setTitle("JPlay");
        setSize(800, 500);
        setLayout(new GridLayout(1, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JPanel blobPanel = new JPanel(new BorderLayout());
	ImageIcon blobIcon = loadImage("/resources/blob.png");
	JLabel blobLabel = new JLabel(blobIcon, SwingConstants.CENTER);
	JButton blobgameButton = new JButton("Play BlobGame");
	blobgameButton.addActionListener(e -> Main.main(new String[]{}));
	blobPanel.add(blobLabel, BorderLayout.CENTER);
        blobPanel.add(blobgameButton, BorderLayout.SOUTH);

	JPanel battlefieldPanel = new JPanel(new BorderLayout());
        ImageIcon battlefieldIcon = loadImage("/resources/battlefield.png");
        JLabel battlefieldLabel = new JLabel(battlefieldIcon, SwingConstants.CENTER);
	JButton battlefieldButton = new JButton("Play Battlefield");
        battlefieldButton.addActionListener(e -> GameLauncher.main(new String[]{}));
	battlefieldPanel.add(battlefieldLabel, BorderLayout.CENTER);
        battlefieldPanel.add(battlefieldButton, BorderLayout.SOUTH);

        add(blobPanel);
        add(battlefieldPanel);

        SwingUtilities.invokeLater(() -> setVisible(true));
    }

    private ImageIcon loadImage(String path) {
	ImageIcon icon = new ImageIcon(path);
        Image scaled = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        return new ImageIcon(scaled);
    }
}
