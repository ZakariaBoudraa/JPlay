package src;
import blobgame.Main;
import components.GameLauncher;
import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {

    public UI() {
        setTitle("JPlay");
        setSize(600, 400);
        setLayout(new GridLayout(1, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton blobgameButton = new JButton("Play BlobGame");
        JButton battlefieldButton = new JButton("Play Battlefield");
        blobgameButton.addActionListener(e -> Main.main(new String[]{}));
        battlefieldButton.addActionListener(e -> GameLauncher.main(new String[]{}));

        add(blobgameButton);
        add(battlefieldButton);

        SwingUtilities.invokeLater(() -> setVisible(true));
    }
}
