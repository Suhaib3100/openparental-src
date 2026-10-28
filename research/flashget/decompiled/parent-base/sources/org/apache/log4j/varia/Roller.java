package org.apache.log4j.varia;

import android.support.v4.media.d;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/* loaded from: classes3.dex */
public class Roller {
    static Logger cat = Logger.getLogger(Roller.class);
    static String host;
    static int port;

    Roller() {
    }

    static void init(String str, String str2) {
        host = str;
        try {
            port = Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            usage(d.a("Second argument ", str2, " is not a valid integer."));
        }
    }

    public static void main(String[] strArr) {
        BasicConfigurator.configure();
        if (strArr.length == 2) {
            init(strArr[0], strArr[1]);
        } else {
            usage("Wrong number of arguments.");
        }
        roll();
    }

    static void roll() {
        try {
            Socket socket = new Socket(host, port);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream.writeUTF("RollOver");
            String readUTF = dataInputStream.readUTF();
            if ("OK".equals(readUTF)) {
                cat.info("Roll over signal acknowledged by remote appender.");
            } else {
                cat.warn("Unexpected return code " + readUTF + " from remote entity.");
                System.exit(2);
            }
        } catch (IOException e4) {
            cat.error("Could not send roll signal on host " + host + " port " + port + " .", e4);
            System.exit(2);
        }
        System.exit(0);
    }

    static void usage(String str) {
        PrintStream printStream = System.err;
        printStream.println(str);
        printStream.println("Usage: java " + Roller.class.getName() + "host_name port_number");
        System.exit(1);
    }
}
