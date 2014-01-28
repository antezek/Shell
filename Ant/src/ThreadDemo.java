// ThreadDemo.java
class ThreadDemo
{
   public static void main (String [] args)
   {
	  int i=0;
      MyThread mt = new MyThread ();
      mt.start ();
      while(true){
           System.out.println ("A: "+i++);
   }
}
}
class MyThread extends Thread
{
   public void run ()
   {
	  int i=0;
      while(true)
      {
    	  System.out.println ("B: "+i++); 
      }
   }
}