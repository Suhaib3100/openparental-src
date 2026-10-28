package org.apache.log4j.net;

import android.support.v4.media.d;
import java.io.File;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;
import org.apache.log4j.Hierarchy;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.spi.LoggerRepository;
import org.apache.log4j.spi.RootLogger;

/* loaded from: classes3.dex */
public class SocketServer {
    static String CONFIG_FILE_EXT = ".lcf";
    static String GENERIC = "generic";
    static Logger cat = Logger.getLogger(SocketServer.class);
    static int port;
    static SocketServer server;
    File dir;
    LoggerRepository genericHierarchy;
    Hashtable hierarchyMap = new Hashtable(11);

    public SocketServer(File file) {
        this.dir = file;
    }

    static void init(String str, String str2, String str3) {
        try {
            port = Integer.parseInt(str);
        } catch (NumberFormatException e4) {
            e4.printStackTrace();
            usage("Could not interpret port number [" + str + "].");
        }
        PropertyConfigurator.configure(str2);
        File file = new File(str3);
        if (!file.isDirectory()) {
            usage(d.a("[", str3, "] is not a directory."));
        }
        server = new SocketServer(file);
    }

    public static void main(String[] strArr) {
        if (strArr.length == 3) {
            init(strArr[0], strArr[1], strArr[2]);
        } else {
            usage("Wrong number of arguments.");
        }
        try {
            cat.info("Listening on port " + port);
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                cat.info("Waiting to accept a new client.");
                Socket accept = serverSocket.accept();
                InetAddress inetAddress = accept.getInetAddress();
                cat.info("Connected to client at " + inetAddress);
                LoggerRepository loggerRepository = (LoggerRepository) server.hierarchyMap.get(inetAddress);
                if (loggerRepository == null) {
                    loggerRepository = server.configureHierarchy(inetAddress);
                }
                cat.info("Starting new socket node.");
                new Thread(new SocketNode(accept, loggerRepository)).start();
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    static void usage(String str) {
        PrintStream printStream = System.err;
        printStream.println(str);
        printStream.println("Usage: java " + SocketServer.class.getName() + " port configFile directory");
        System.exit(1);
    }

    LoggerRepository configureHierarchy(InetAddress inetAddress) {
        cat.info("Locating configuration file for " + inetAddress);
        String inetAddress2 = inetAddress.toString();
        int indexOf = inetAddress2.indexOf("/");
        if (indexOf == -1) {
            cat.warn("Could not parse the inetAddress [" + inetAddress + "]. Using default hierarchy.");
            return genericHierarchy();
        }
        String substring = inetAddress2.substring(0, indexOf);
        File file = new File(this.dir, String.valueOf(substring) + CONFIG_FILE_EXT);
        if (file.exists()) {
            Hierarchy hierarchy = new Hierarchy(new RootLogger(Level.DEBUG));
            this.hierarchyMap.put(inetAddress, hierarchy);
            new PropertyConfigurator().doConfigure(file.getAbsolutePath(), hierarchy);
            return hierarchy;
        }
        cat.warn("Could not find config file [" + file + "].");
        return genericHierarchy();
    }

    LoggerRepository genericHierarchy() {
        if (this.genericHierarchy == null) {
            File file = new File(this.dir, String.valueOf(GENERIC) + CONFIG_FILE_EXT);
            if (file.exists()) {
                this.genericHierarchy = new Hierarchy(new RootLogger(Level.DEBUG));
                new PropertyConfigurator().doConfigure(file.getAbsolutePath(), this.genericHierarchy);
            } else {
                cat.warn("Could not find config file [" + file + "]. Will use the default hierarchy.");
                this.genericHierarchy = LogManager.getLoggerRepository();
            }
        }
        return this.genericHierarchy;
    }
}
