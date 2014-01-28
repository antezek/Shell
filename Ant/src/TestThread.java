import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


class TestThread {
	static SimpleThread sThread;
	
	 public static void inputCmd(){
		 String cmd;
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 ExecutorService executorService = Executors.newFixedThreadPool(2);
		 Future<?> threadT2=null;
		 try {
			 System.out.println("Enter cmd: ");
				cmd=in.readLine();
				if(cmd.equals("hello")){
					 threadT2 = executorService.submit(sThread);
					inputCmd();
				}else if(cmd==null){
					cmd="";
					System.out.println("cmd==null");
					threadT2.cancel(Boolean.TRUE);
			 		//System.exit(0);
				}
				/*
			 	while(cmd==null){
			 		
			 	}
			 	*/
			 	 in = new BufferedReader(new InputStreamReader(System.in));
			} catch (IOException e) {
					System.out.println("Error: ctrl + z detected");
			} catch (NullPointerException e){
					threadT2.cancel(Boolean.TRUE);
			}
	 }
	 public static void main(String[] args) {
		 String cmd;
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 	sThread = new SimpleThread();
		 	inputCmd(); 
	 }

}

//============

class SimpleThread extends Thread {
	//lets say this is T2
	static int count = 0;
	public void run() {
		TestThread tt = new TestThread();
		while (!Thread.currentThread().isInterrupted()) {
			try {
				Thread.sleep(1000);						//1sec period
				System.out.println("In thread "+ (count++));
			} catch (InterruptedException e) {
				System.out.println("The thread just got interupted");
				Thread.currentThread().interrupt();
				tt.inputCmd();
				return;
			}
		}
	}
}


/****
1. Pass the command over to T2 before start submit T2 for execution

****/
