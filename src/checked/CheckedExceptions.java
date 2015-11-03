
package checked;

import java.io.*;

public class CheckedExceptions 
{
    public static void OpenFileChecked() throws IOException
    {
        FileReader reader = new FileReader ("nofile.txt");
        try
        {
           reader.close(); 
        }
        catch(IOException ioex)
        {
            throw ioex;
        }
    }
}
