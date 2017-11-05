package model1.views;

import model1.presenters.PresenterBase;

public abstract class ViewBase<P extends PresenterBase> {

    private P presenter;

    public P getPresenter() {
        return presenter;
    }

    public void setPresenter(P presenter) {
        this.presenter = presenter;
    }

    public abstract void show();

    public abstract void hide();

    public abstract void dispose();

}
