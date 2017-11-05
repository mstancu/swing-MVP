package model2;

interface Presenter {

    Model getModel();

    void setModel(Model model);

    View getView();

    void setView(View view);

    void setOnLogin(Runnable onLogin);

    void run();

    void login();
}
