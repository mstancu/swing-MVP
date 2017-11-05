package fxml_in_swing;

import java.awt.BorderLayout;
import java.io.IOException;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class Test {
    private JFrame frame = new JFrame("Java FX in Swing");

    private void startSwing() {
        frame.setLayout(new BorderLayout());
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JFXPanel jfxPanel = new JFXPanel();
        frame.add(swingPanel(), BorderLayout.SOUTH);
        frame.add(jfxPanel, BorderLayout.CENTER);

        frame.setVisible(true);
        Platform.runLater(() -> initFX(jfxPanel));
    }

    private JPanel swingPanel() {
        final JPanel swingButtonsPanel = new JPanel();
        final JButton okButton = new JButton("OK");
        okButton.addActionListener(event -> System.out.println("Swing says 'OK'"));
        final JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(event -> System.exit(0));
        swingButtonsPanel.add(okButton);
        swingButtonsPanel.add(exitButton);
        return swingButtonsPanel;
    }

    private void initFX(JFXPanel jfxPanel) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml_view.fxml"));
            Scene scene = new Scene(root, 250, 150);
            jfxPanel.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        SwingUtilities.invokeLater(() -> test.startSwing());
    }
}