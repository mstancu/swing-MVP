package model1;

import model1.model.ModelBase;

public class ModelChangedEvent {
    private ModelBase model;
    private String eventName;
    public ModelChangedEvent(ModelBase modelBase, String variable) {
        this.model = modelBase;
        this.eventName = variable;
    }

    public String getVariableName() {
        return eventName;
    }
}
