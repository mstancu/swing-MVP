package model2;

interface View {

    Presenter getPresenter();

    void setPresenter(Presenter presenter);

    void updateModelFromView();

    void updateViewFromModel();

    void open();

    void close();

    void userRejected();
}
