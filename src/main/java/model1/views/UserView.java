package model1.views;

import model1.presenters.UserPresenter;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class UserView extends ViewBase<UserPresenter> {

    private JFrame frame;

    // Setter
    private JTextField firstName, lastName;
    private JSpinner ageSpinner;

    // Getter
    private JLabel fullName;
    private JLabel ageLabel;

    public UserView() {
        frame = new JFrame("User Example");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setter
        {

            JPanel setterPanel = new JPanel();
            setterPanel.setBorder(new TitledBorder("Setter"));
            setterPanel.setLayout(new BoxLayout(setterPanel, BoxLayout.Y_AXIS));

            firstName = new JTextField();
            firstName.setColumns(25);
            firstName.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                    getPresenter().setFirstName(((JTextField) e.getSource()).getText());
                }

                @Override
                public void keyPressed(KeyEvent e) {
                }

                @Override
                public void keyReleased(KeyEvent e) {
                }
            });
            setterPanel.add(firstName);

            lastName = new JTextField();
            lastName.setColumns(25);
            lastName.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                    getPresenter().setLastName(((JTextField) e.getSource()).getText());
                }

                @Override
                public void keyPressed(KeyEvent e) {
                }

                @Override
                public void keyReleased(KeyEvent e) {
                }
            });
            setterPanel.add(lastName);

            ageSpinner = new JSpinner();
            ageSpinner.setValue(0);
            ageSpinner.addChangeListener(e -> getPresenter().setAge((Integer) ((JSpinner) e.getSource()).getValue()));
            setterPanel.add(ageSpinner);

            frame.add(setterPanel, BorderLayout.LINE_START);

        }

        // Getter
        {

            JPanel getterPanel = new JPanel();
            getterPanel.setBorder(new TitledBorder("Getter"));
            getterPanel.setLayout(new BoxLayout(getterPanel, BoxLayout.Y_AXIS));

            fullName = new JLabel();
            getterPanel.add(fullName);

            ageLabel = new JLabel();
            getterPanel.add(ageLabel);

            frame.add(getterPanel, BorderLayout.LINE_END);

        }
    }

    public void setFullName(String fullName) {
        this.fullName.setText(fullName);
    }

    public void setAge(int age) {
        this.ageLabel.setText(age + "");
    }

    @Override
    public void show() {
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void hide() {
        frame.setVisible(false);
    }

    @Override
    public void dispose() {
        frame.dispose();
    }
}
