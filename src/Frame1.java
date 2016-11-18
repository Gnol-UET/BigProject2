import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
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

    public void postATable() {
        user.addNewTable(newTableName);
        DefaultListModel defaultListModel = new DefaultListModel();
        for (int i = 0; i < user.getUserList().size(); i++) {
            defaultListModel.addElement(user.getUserList().get(i).getNameOfTable());
        }
        list1.setModel(defaultListModel);

    }

    private void addTableActionPerformed(ActionEvent e) {
        Frame2 frame2 = new Frame2(this);
        frame2.setVisible(true);

        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Long Do Thanh
        scrollPane1 = new JScrollPane();
        java.util.List<JPanel> jPanels = new ArrayList<>();
        list1 = new JList();
        list1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                JList list = (JList)evt.getSource();
                if (evt.getClickCount() == 2) {
                    jPanels.clear();
                    jPanels.removeAll(jPanels);
                    while (tabbedPane1.getTabCount() > 0)
                        tabbedPane1.remove(0);
                    // Double-click detected
                    int index = list.locationToIndex(evt.getPoint());
                    String ten = list.getModel().getElementAt(index).toString();
                    user.setCurrentTable(user.findATable(ten));
                    user.getCurrentTable().addJobToCurrentTable(new JobList("list1"));

                    user.setCurrentList(user.getCurrentTable().findAJobList("list1"));
                    for (int i = 0; i < user.getCurrentTable().getToDoList().size(); i++) {
                        jPanels.add(i, new JPanel());
                        jPanels.get(i).setLayout(null);
                        Dimension preferredSize = new Dimension();
                        for (int j = 0; i < jPanels.get(i).getComponentCount(); j++) {
                            Rectangle bounds = jPanels.get(0).getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = jPanels.get(0).getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        jPanels.get(i).setMinimumSize(preferredSize);
                        jPanels.get(i).setPreferredSize(preferredSize);
                        tabbedPane1.addTab(user.getCurrentTable().getToDoList().get(i).getName(), jPanels.get(i));

                    }

                    } else if (evt.getClickCount() == 3) {

                    // Triple-click detected
                    int index = list.locationToIndex(evt.getPoint());
                }
            }
        });
        separator1 = new JSeparator();
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        panel2 = new JPanel();
        separator2 = new JSeparator();
        button1 = new JButton();
        button2 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        user.addNewTable("bang1");
        user.setCurrentTable(user.findATable("bang1"));
        DefaultListModel defaultListModel = new DefaultListModel();
        for (int i = 0; i < user.getUserList().size(); i++) {
            defaultListModel.addElement(user.getUserList().get(i).getNameOfTable());
        }
        list1.setModel(defaultListModel);




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

        //---- button1 ----
        button1.setText("Add table");
        button1.addActionListener(e -> addTableActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(15, 340), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("Add list");
        button2.addActionListener(e -> addAListActionPerformed(e));
        contentPane.add(button2);
        button2.setBounds(235, 65, 45, 35);

        //---- label1 ----
        label1.setText("Table");
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(15, 25), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("Job list");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(240, 25), label2.getPreferredSize()));

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

    private void addAListActionPerformed(ActionEvent e) {

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
    private JButton button1;
    private JButton button2;
    private JLabel label1;
    private JLabel label2;
    User user = new User();
    User user2 = new User();
    public String newTableName = new String();


    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
