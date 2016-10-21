import javax.swing.*;
import java.awt.*;


public class Screen{

	public static void main(String [] args){
 	 new Thread(new Runnable(){
		public void run(){
		

WFrame f = new WFrame("Screen");



























		}
	}).start();

	}

}


class WFrame 		extends JFrame {


	public static final int squareSide = 150;
	public WFrame(String name){
		super(name);


	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();

		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize((int)width ,(int)height );
		setBackground(new Color(0, 0, 0, 0));

		JPanel frame1 = new JPanel();
		frame1.setBackground(new Color(0, 0, 0, 0));
 		add(frame1);
		while(true){
			setVisible(true);
	
			for(int i = 0; i< ((height/squareSide)+1); i++ ){
				for(int j = 0; j< (( width/squareSide)+1); j++ ){
					try{
						Thread.sleep(1);
					}catch(InterruptedException e){
						e.printStackTrace();
					} 
					JPanel panel = new JPanel();
					Color color = new Color((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255),200+(int)(Math.random() * 55));
					panel.setBackground(color );  
					panel.setLocation(j*squareSide,i*squareSide);
					panel.setSize(squareSide  ,squareSide  );
					frame1 .add(panel);
					repaint();
				}
			}

			try{
				Thread.sleep(15*1000);
				frame1.removeAll(); 
				setVisible(false);
			}catch(InterruptedException e){
				e.printStackTrace();
			} 

			try{
				Thread.sleep(15*60*1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			} 
		}}
}