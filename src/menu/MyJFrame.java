package menu;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MyJFrame extends JFrame{
    MyJFrame() {
        super();
        InitJFrame();
    }

    private void InitJFrame(){
        this.setTitle("Ma Fentre ");
        this.setSize(400,400);


        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Streaming");
        JMenuItem item1 = new JMenuItem("Tv Shows");
        JMenuItem item2 = new JMenuItem("movies");
        JMenuItem item3 = new JMenuItem("manga");

        menuBar.add(menu);
        menu.add(item1);
        menu.addSeparator();
        menu.add(item2);
        menu.addSeparator();
        menu.add(item3);


        JMenu menu2 = new JMenu("Games");
        JMenuItem item4 = new JMenuItem("Street Fighter");

        menuBar.add(menu2);
        menu2.add(item4);




        this.setJMenuBar(menuBar);


















    }

}
