import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuFrame extends JFrame
{

	
	public MenuFrame()
	{
		this.setBounds(100, 100, 600, 600);
		this.setLayout(null);
	
		JMenuBar bar = new JMenuBar();
		
		JWalkingMan man = new JWalkingMan();
		man.setBounds(100, 100, 100, 100);
		this.add(man);
		
		JMenu menu1 = new JMenu("Click this");
		JMenuItem option1 = new JMenuItem("WOWW");
		menu1.add(option1);
		JMenuItem option2 = new JMenuItem("click this");
		menu1.add(option2);
		JMenuItem option3 = new JMenuItem("???");
		menu1.add(option3);
		bar.add(menu1);
		
		JMenu menu2 = new JMenu("dont Click this");
		JMenuItem option4 = new JMenuItem("hmm");
		menu2.add(option4);
		JMenuItem option5 = new JMenuItem("this");
		menu2.add(option5);
		JMenuItem option6 = new JMenuItem("no");
		menu2.add(option6);
		bar.add(menu2);
		
		JMenu menu3 = new JMenu("mystery");
		JMenu cluster = new JMenu("Many options");
		menu3.add(cluster);
		JMenuItem option7 = new JMenuItem("stuff");
		cluster.add(option7);
		JMenuItem option8 = new JMenuItem("?!!??!");
		cluster.add(option8);
		bar.add(menu3);
		
		option1.addActionListener(new ActionListener ()
		{
			
			public void actionPerformed(ActionEvent arg0) 
			{
				man.setVisible(false);
			}

		});
		
		option8.addActionListener(new ActionListener ()
		{
			
			public void actionPerformed(ActionEvent arg0) 
			{
				man.setVisible(true);
			}

		});
		
		
		this.setJMenuBar(bar);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		new MenuFrame();
	}

}
