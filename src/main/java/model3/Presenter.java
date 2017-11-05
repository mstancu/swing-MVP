package model3;

public class Presenter {

    private View view;
    private Model model;

    Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void login(String pass) {
        String result = "Incorrect password";

        if (model.getPassword().equals(pass)) {
            result = "Correct password";
        }
        view.updateStatusLabel(result);
    }
}

