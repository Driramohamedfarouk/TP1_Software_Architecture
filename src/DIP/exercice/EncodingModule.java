package DIP.exercice;


public class EncodingModule
{
    private IFileEncoding fileEncoder  ;
    private INetworkDBEncoding dbEncoding  ;

    public IFileEncoding getFileEncoder() {
        return fileEncoder;
    }

    public INetworkDBEncoding getDbEncoding() {
        return dbEncoding;
    }
}

