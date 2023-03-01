package demo2;

import javafx.event.ActionEvent;
import javafx.scene.text.Text;

public class SubDemo2 extends Thread {
    public Text lbMin;
    public Text lbSec;

    Integer min = 10;
    Integer sec = 0;

    boolean running = false;

    public void start(ActionEvent event) {
        if (!running) {
            running = true;
            new Thread(() -> {
                while (running) {
                    lbMin.setText(min.toString());
                    lbSec.setText(sec.toString());
                    sec--;
                    if (sec < 0) {
                        sec = 59;
                        min--;
                    }
                    if (min < 0) {
                        running = false;
                    }
                }
            }).start();
        }
    }

    public void pause(ActionEvent event) {
    }

    public void stop(ActionEvent event) {
    }
}
