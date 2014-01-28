    //: c12:Echo.java
    // How to read from standard input.
    // {RunByHand}
    import java.io.*;

    public class Echo {
      public static void main(String[] args)
      throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        s = in.readLine();
          System.out.println(s);
        // An empty line or Ctrl-Z terminates the program
      }
    } ///:~
    