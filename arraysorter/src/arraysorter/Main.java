package arraysorter;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Main {

	public static ArrayList <Person> arrayListJe = new ArrayList <Person> ();
	
	
	
	public static void main(String[] args) {

		Random random = new Random();
		
		arrayListJe.add(new Person(random.nextInt(67), random.nextInt(5000), "Andre"));
		arrayListJe.add(new Person(random.nextInt(67), random.nextInt(5000), "Boris"));
		arrayListJe.add(new Person(random.nextInt(67), random.nextInt(5000), "Clint"));
		
		JFrame frame = new JFrame();
		frame.setSize(new Dimension (800, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(780,580));
		panel.setBackground(Color.GRAY);
		panel.setLayout(new FlowLayout());
		

		JButton sort = new JButton("sort");
		sort.setPreferredSize(new Dimension (100,100));
		panel.add(sort);
		
		JPanel contentPanel = new JPanel();
		contentPanel.setPreferredSize(new Dimension (750, 400));
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setLayout(new FlowLayout());

		
			JLabel text1 = new JLabel("First Person Name is " + arrayListJe.get(0).name + 
					"; their age is " + arrayListJe.get(0).age + " and their salary is " + arrayListJe.get(0).salary);
			
			JLabel text2 = new JLabel("Second Person Name is " + arrayListJe.get(1).name + 
					"; their age is " + arrayListJe.get(1).age + " and their salary is " + arrayListJe.get(1).salary);
			
			JLabel text3 = new JLabel("Third Person Name is " + arrayListJe.get(2).name + 
					"; their age is " + arrayListJe.get(2).age + " and their salary is " + arrayListJe.get(2).salary);
		
			JLabel blankSpace = new JLabel("<html> <br> <br> </html>");
			
		    Collections.sort(arrayListJe, new Comparator<Person>() {
		        @Override public int compare(Person p1, Person p2) {
		            return p1.age- p2.age;
		        }

		    });
		    
			JLabel text1b = new JLabel("First Sorted Person Name is " + arrayListJe.get(0).name + 
					"; their age is " + arrayListJe.get(0).age + " and their salary is " + arrayListJe.get(0).salary);
			
			JLabel text2b = new JLabel("Second Sorted Person Name is " + arrayListJe.get(1).name + 
					"; their age is " + arrayListJe.get(1).age + " and their salary is " + arrayListJe.get(1).salary);
			
			JLabel text3b = new JLabel("Third Sorted Person Name is " + arrayListJe.get(2).name + 
					"; their age is " + arrayListJe.get(2).age + " and their salary is " + arrayListJe.get(2).salary);
			
			
			contentPanel.add(text1);
			contentPanel.add(text2);
			contentPanel.add(text3);
			contentPanel.add(blankSpace);
			contentPanel.add(text1b);
			contentPanel.add(text2b);
			contentPanel.add(text3b);
			
		
		panel.add(contentPanel);
		
		sort.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				
				    Collections.sort(arrayListJe, new Comparator<Person>() {
				        @Override public int compare(Person p1, Person p2) {
				            return p2.age- p1.age;
				        }

				    });
				    
				    

				    text1b.setText(Integer.toString(arrayListJe.get(0).age));

				    
				    
				    System.out.println(arrayListJe.get(0).age);
				    System.out.println(arrayListJe.get(1).age);
				    System.out.println(arrayListJe.get(2).age);
				  
			  }
		});
		
		
		
		frame.setVisible(true);
		frame.add(panel);

	}

}
