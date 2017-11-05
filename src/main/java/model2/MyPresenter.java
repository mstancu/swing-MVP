package model2;

class MyPresenter implements Presenter {

    private Model model;
    private View view;
    private Runnable onLogin;

    @Override
    public Model getModel() {
        return model;
    }

    @Override
    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public View getView() {
        return view;
    }

    @Override
    public void setView(View view) {
        this.view = view;
    }

    @Override
    public void setOnLogin(Runnable onLogin) {
        this.onLogin = onLogin;
    }

    @Override
    public void run() {
        model.setUser("previousUser");
        view.setPresenter(this);
        view.updateViewFromModel();
        view.open();
    }

    @Override
    public void login() {
        view.updateModelFromView();
        if (model.getUser().equalsIgnoreCase("root")) {
            view.close();
            view.setPresenter(null);// for memory sanity.
            onLogin.run();
        } else {
            view.userRejected();
        }
    }
}
