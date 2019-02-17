import Data.*;

import com.orbitz.consul.Consul;
import java.io.*;
import java.net.*;
import java.util.*;

class Simple{
    public static void main(String args[]) throws Exception {


        NetworkIpInterface myIp = new NetworkIpInterface("eth1");
        String ip = myIp.GetIpAddress(Inet4Address.class);

        System.out.println(ip);


        //String ip = "";
        //NetworkInterface iface = NetworkInterface.getByName("eth1");
        //Enumeration<InetAddress> addresses = iface.getInetAddresses();

        // while(addresses.hasMoreElements()) {
        //     InetAddress addr = addresses.nextElement();
        //
        //     if (addr instanceof Inet6Address) continue;
        //
        //     ip = addr.getHostAddress();
        //     System.out.println(iface.getDisplayName() + " " + ip);
        // }

        //Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        //for (NetworkInterface netint : Collections.list(nets))
            //displayInterfaceInformation(netint);

        IUser user = new User();
        user.SetFirstName("Tonnie");
        user.SetLastName("Boersma");
        System.out.println(user.GetFirstName() + " " + user.GetLastName());
    }
}
