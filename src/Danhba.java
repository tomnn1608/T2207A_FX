import javafx.scene.control.Button;

public class Danhba {
    String name;
    String telephone;
    Button edit;

    public Danhba(String name, String telephone) {
        this.name = name;
        this.telephone = telephone;
        this.edit = new Button("Edit");
        this.edit.setOnAction((event) ->{
            BaiTap.editStudent = this;
            BaiTap.stName.setText(this.name);
            BaiTap.stPhone.setText(this.telephone);
        });
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String toString(){
        return this.name+ "--"+this.telephone;
    }

    public Button getEdit() {
        return edit;
    }

    public void setEdit(Button edit) {
        this.edit = edit;
    }
}
