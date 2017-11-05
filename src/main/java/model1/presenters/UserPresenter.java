package model1.presenters;

import model1.ModelChangedEvent;
import model1.model.User;
import model1.views.UserView;

public class UserPresenter extends PresenterBase<UserView, User> {

    public UserPresenter() {
        super(new UserView(), new User());
        getView().setPresenter(this);
    }

    @Override
    public void onModelChanged(ModelChangedEvent event) {
        switch (event.getVariableName().toLowerCase()) {
            case "firstname":
            case "lastname":
                updateFullName();
                break;
            case "age":
                updateAge();
        }
    }

    public void setFirstName(String firstName) {
        getModel().setFirstName(firstName);
    }

    public void setLastName(String lastName) {
        getModel().setLastName(lastName);
    }

    public void setAge(int age) {
        getModel().setAge(age);
    }

    private void updateFullName() {
        String fullName = getModel().getFirstName() + " " + getModel().getLastName();
        getView().setFullName(fullName);
    }

    private void updateAge() {
        getView().setAge(getModel().getAge());
    }

}