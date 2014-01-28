import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HelloThread extends Thread implements KeyListener,ActionListener {

	static Thread t;
	
    public void run() {
    	int i=0;
    	try{
    		System.out.println("!!List!!");
    		t.sleep(4000);
    		while(true){
    			System.out.println(i);
    			i++;
    		}
    	}catch(InterruptedException e) {
    		System.out.println("Interrupted!!");
    	}
    }

    public static void main(String args[]) {
    	t = new HelloThread();
        t.start();
        //t.interrupt();	//Interrrupted to execute the commands in the catch.
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}