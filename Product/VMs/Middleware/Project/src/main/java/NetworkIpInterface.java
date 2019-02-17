import java.net.*;
import java.util.*;

public class NetworkIpInterface {

    private NetworkInterface networkInterface;

    public NetworkIpInterface(String interfaceName) throws Exception {
        networkInterface = NetworkInterface.getByName(interfaceName);
    }

    public NetworkInterface GetInterface() {
        return networkInterface;
    }

    public Boolean IsValid() {
        return !NotValid();
    }

    private Boolean NotValid() {
        return networkInterface == null;
    }

    public String GetIpAddress(Class<?> inetClass) {
        if (IsValid())
            for (InetAddress inetAddress : GetInetAddresses())
                if (inetAddress.getClass() == inetClass)
                    return inetAddress.getHostAddress();
        return "";
    }

    private List<InetAddress> GetInetAddresses() {
        if (NotValid())
            return new ArrayList<>();
        return Collections.list(networkInterface.getInetAddresses());
    }
}
