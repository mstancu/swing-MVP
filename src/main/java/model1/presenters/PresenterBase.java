package model1.presenters;

import model1.IModelChangedListener;
import model1.model.ModelBase;
import model1.views.ViewBase;

public abstract class PresenterBase<V extends ViewBase, M extends ModelBase> implements IModelChangedListener {

    private V view;
    private M model;

    PresenterBase(V view, M model) {
        this.view = view;
        this.model = model;
        model.addModelChangedListener(this);
    }

    public V getView() {
        return view;
    }

    public M getModel() {
        return model;
    }

}