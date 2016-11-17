import java.awt.*;
import java.util.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Wed Nov 16 15:44:16 ICT 2016
 */

/**
 * @author awge hsaerh
 */
public class Frame1 extends JFrame {
    public Frame1() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Long Do Thanh
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        separator1 = new JSeparator();
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        panel2 = new JPanel();
        separator2 = new JSeparator();
        java.util.List<JPanel> jPanels = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            jPanels.add(i,new JPanel());
            jPanels.get(i).setLayout(null);
            Dimension preferredSize = new Dimension();
            for(int j = 0; i < jPanels.get(i).getComponentCount(); j++) {
                Rectangle bounds = jPanels.get(0).getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = jPanels.get(0).getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            jPanels.get(i).setMinimumSize(preferredSize);
            jPanels.get(i).setPreferredSize(preferredSize);
            tabbedPane1.addTab(String.valueOf(i), jPanels.get(i));

        }


        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(list1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(15, 70, 205, 255);

        //---- separator1 ----
        separator1.setOrientation(SwingConstants.VERTICAL);
        contentPane.add(separator1);
        separator1.setBounds(230, 65, 20, 340);


        contentPane.add(tabbedPane1);
        tabbedPane1.setBounds(285, 70, 730, 255);
        contentPane.add(separator2);
        separator2.setBounds(0, -10, 1045, 12);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Long Do Thanh
    private JScrollPane scrollPane1;
    private JList list1;
    private JSeparator separator1;
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JPanel panel2;
    private JSeparator separator2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
