import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import javax.rmi.CORBA.Tie;
import java.util.ArrayList;

public class ThongTin1 {

    public TextField nguoinhan;
    public TextField tieude;
    public TextArea noidung;
    public Text danhsach;

    public void submit(ActionEvent actionEvent) {
        String nn = nguoinhan.getText();
        String td = tieude.getText();
        String Nn = noidung.getText();
        clearInput();

        String txt = danhsach.getText();
        txt += "\n";
        txt += "Nguoinhan:" + nn + "\n" + "Tieude:" + td +"\n"+"Noidung"+Nn;
        danhsach.setText(txt);

    }
    void clearInput(){
        nguoinhan.clear();
        tieude.clear();
        noidung.clear();
    }
}
