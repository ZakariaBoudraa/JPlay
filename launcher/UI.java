import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {

    public UI() {
        setTitle("JPlay");
        setSize(300, 200);
        setLayout(new GridLayout(1, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton blobgameButton = new JButton("Play BlobGame");
        JButton battlefieldButton = new JButton("Play Battlefield");
        blobgameButton.addActionListener(e -> blobgame.Main.main(new String[]{}));
        battlefieldButton.addActionListener(e -> battlefield.Main.main(new String[]{}));

        add(blobgameButton);
        add(battlefieldButton);

        setVisible(true);
    }
}