import javax.swing.*;
import java.awt.*;

public class Controls extends JPanel {
    public JCheckBox transparentCheckBox;
    public Controls() {
//        setBackground(Color.ORANGE);
        transparentCheckBox = new JCheckBox("transparent");
//        JCheckBox ortogonalCheckBox = new JCheckBox("transparent");
        add(transparentCheckBox);
//        add(ortogonalCheckBox);
    }
}