package model1.model;

import model1.IModelChangedListener;
import model1.ModelChangedEvent;

import java.util.LinkedList;
import java.util.List;

public abstract class ModelBase {

    private List<IModelChangedListener> listeners = new LinkedList<>();

    public void addModelChangedListener(IModelChangedListener listener) {
        listeners.add(listener);
    }

    public void removeModelChangedListener(IModelChangedListener listener) {
        listeners.remove(listener);
    }

    void onModelChanged(String variableChanged) {
        ModelChangedEvent event = new ModelChangedEvent(this, variableChanged);
        listeners.stream().forEach((listener) -> listener.onModelChanged(event));
    }

}