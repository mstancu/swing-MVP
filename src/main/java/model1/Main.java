package model1;

import model1.presenters.UserPresenter;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InterruptedException {
        SwingUtilities.invokeAndWait(() -> {
            UserPresenter presenter = new UserPresenter();
            presenter.getView().show();
        });

    }
}
