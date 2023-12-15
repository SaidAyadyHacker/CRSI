package main;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;
public class InfoServer {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) throws URISyntaxException {
        String Url_input;
        System.out.print("Enter URL plz : ");
        Url_input = reader.nextLine();
        URI url = new URI(Url_input);
        System.out.println("- Auth            : "+url.getAuthority());
        System.out.println("- Fragment        : "+url.getFragment());
        System.out.println("- Host            : "+url.getHost());
        System.out.println("- Path            : "+url.getPath());
        System.out.println("- Port            : "+url.getPort());
        System.out.println("- Query           : "+url.getQuery());
        System.out.println("- Scheme          : "+url.getScheme());
        System.out.println("- SchemeSpecific  : "+url.getSchemeSpecificPart());
        System.out.println("- User Info       : "+url.getUserInfo());
        System.out.println("- Url Is Absolute : "+url.isAbsolute());
        System.out.println("- Url Is Opaque   : "+url.isOpaque());
    }
}