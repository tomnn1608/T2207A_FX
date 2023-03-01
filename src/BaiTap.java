import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.awt.*;
import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

import javafx.scene.control.Button;

public class BaiTap implements Initializable {

    public TextField Name;
    public TextField Telephone;

    public static TextField stName;
    public static TextField stPhone;

    public ObservableList<Danhba> listDanhba = FXCollections.observableArrayList();


    public ListView<Danhba> ld;
    public static Danhba editStudent;

    public boolean ascending=true;

    public TableView<Danhba> tbview;
    public TableColumn<Danhba,String> name;
    public TableColumn<Danhba,String> telephone;
    public TableColumn<Danhba,Button>action;

    public void submit(ActionEvent actionEvent) {
        String n = Name.getText();
        String t = Telephone.getText();

        if (editStudent == null) {
            Danhba d = new Danhba(n, t);
            listDanhba.add(d);

        } else {
            for (Danhba d : listDanhba) {
                if (d.telephone.equals(editStudent.telephone)
                        && d.name.equals(editStudent.name)) {
                    d.setName(n);
                    d.setTelephone(t);
                }
            }
        }
        tbview.setItems(listDanhba);
        tbview.refresh();
        editStudent = null;
        clearInput();
    }

    void clearInput() {
        Name.clear();
        Telephone.clear();
    }

    public void edit(MouseEvent mouseEvent) {
        editStudent = ld.getSelectionModel().getSelectedItem();
        Name.setText(editStudent.getName());
        Telephone.setText(editStudent.getTelephone());
    }

    public void sort(MouseEvent mouseEvent) {
        if (ascending) {
            Collections.sort(listDanhba, new Comparator<Danhba>() {
                @Override
                public int compare(Danhba o1, Danhba o2) {
                    return o1.name.compareTo(o2.name);
                }
            });
        } else {
            Collections.sort(listDanhba, new Comparator<Danhba>() {
                @Override
                public int compare(Danhba o1, Danhba o2) {
                    return o2.name.compareTo(o1.name);
                }
            });
        }
        ascending = !ascending;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        telephone.setCellValueFactory(new PropertyValueFactory<>("phone"));
        action.setCellValueFactory(new PropertyValueFactory<>("edit"));

        stName = Name;
        stPhone = Telephone;
    }
}
