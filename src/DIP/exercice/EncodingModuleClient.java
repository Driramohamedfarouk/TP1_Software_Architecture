package DIP.exercice;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodingModule();
        encodingModule.getFileEncoder().encodeWithFiles();
        encodingModule.getDbEncoding().encodeBasedOnNetworkAndDatabase();
    }
}
