import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.http.HttpStatus;

import com.orbitz.consul.Consul;
import com.orbitz.consul.HealthClient;
import com.orbitz.consul.model.health.ServiceHealth;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

import java.io.*;
import java.net.*;
import java.util.*;



public class ExampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
    		NetworkIpInterface myIp = new NetworkIpInterface("enp0s8");
            String ip = myIp.GetIpAddress(Inet4Address.class);
    		resp.getWriter().println(ip);


            Consul client = Consul.builder().build();
            HealthClient healthClient = client.healthClient();


            List<ServiceHealth> nodes = healthClient.getHealthyServiceInstances("Webserver").getResponse();
            resp.getWriter().println("Found " + nodes.size() + "services.");
            for(ServiceHealth node : nodes){
                String nodeString = "";
                nodeString += node.getNode().getAddress();
                nodeString += node.getService().getPort();
                resp.getWriter().println(nodeString);
            }
        }
        catch(Exception e) {
            resp.getWriter().println(e.getMessage());
        }


        resp.setStatus(HttpStatus.OK_200);

    }
}
