package library.management.system;
/**
 *
 * @author ssajid.bese26mcs
 */
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("dE SIGNALIANS LIBRARY MANAGEMENT SYSTEM ");
            setBackground(new Color(173, 216, 230));
            setBounds(200, 0, 900, 600);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/logo.png"));
            Image i2 = i1.getImage().getScaledInstance(300, 306,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(350, 30,375, 388);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Times New Roman", Font.BOLD , 40));
            l3.setBounds(160, 10, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Times New Roman", Font.BOLD , 40));
            l4.setBounds(70, 60, 405, 70);
            contentPane.add(l4);

            JLabel l5 = new JLabel("By Group No.4 ");
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Times New Roman", Font.BOLD, 25));
            l5.setBounds(135, 140, 405, 40);
            contentPane.add(l5);



	JLabel back = new JLabel("Back");
	back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
		setVisible(false);
		Home home = new Home();
		home.setVisible(true);
                
            }
	});
	back.setForeground(new Color(204, 0, 102));
	back.setFont(new Font("Times New Roman", Font.BOLD, 18));
	ImageIcon bk = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/tenth.png"));
        Image i22 = bk.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        back.setIcon(i33);
	back.setBounds(20, 20, 96, 30);
	contentPane.add(back);

            
            JLabel l6 = new JLabel("Group Member names:");
            l6.setFont(new Font("Times New Roman", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Hamza Masood(Group Leader)");
            l7.setFont(new Font("Times New Roman", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("Talal Mahmood");
            l8.setFont(new Font("Times New Roman", Font.BOLD, 20));
            l8.setBounds(70, 290, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Shah Zaib Sajid");
            l9.setFont(new Font("Times New Roman", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 34);
            contentPane.add(l9);
            
             JLabel re = new JLabel("Muhammad Hasnain ");
            re.setFont(new Font("Times New Roman", Font.BOLD , 20));
           re.setBounds(70, 350, 600, 34);
            contentPane.add(re);
              JLabel re2 = new JLabel("Abdullah Mubashir ");
            re2.setFont(new Font("Times New Roman", Font.BOLD , 20));
           re2.setBounds(70, 380, 600, 34);
            contentPane.add(re2);
            
            
       


            JLabel l10 = new JLabel("By Students of MILITARY COLLEGE OF SIGNALS(MCS), NUST");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 450, 600, 34);
            contentPane.add(l10);
                
                
            contentPane.setBackground(Color.WHITE);
	}
        

}

