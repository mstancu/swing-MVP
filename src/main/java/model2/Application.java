
package model2;
import javax.swing.JOptionPane;


public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            Model model = new MyModel();
            Presenter presenter = new MyPresenter();
            presenter.setModel(model);
            View view = new MyView();
            presenter.setView(view);
            presenter.setOnLogin(() -> JOptionPane.showMessageDialog(null, "Welcome user!"));
            presenter.run();
        });
    }
}