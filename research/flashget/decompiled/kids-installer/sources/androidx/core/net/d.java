package androidx.core.net;

import android.net.TrafficStats;
import androidx.annotation.o0;
import androidx.annotation.u;
import androidx.annotation.x0;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

/* compiled from: TrafficStatsCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: TrafficStatsCompat.java */
    @x0(24)
    static class a {
        private a() {
        }

        @u
        static void a(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.tagDatagramSocket(datagramSocket);
        }

        @u
        static void b(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.untagDatagramSocket(datagramSocket);
        }
    }

    private d() {
    }

    @Deprecated
    public static void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    public static int b() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    public static void c(int i5) {
        TrafficStats.incrementOperationCount(i5);
    }

    @Deprecated
    public static void d(int i5, int i6) {
        TrafficStats.incrementOperationCount(i5, i6);
    }

    @Deprecated
    public static void e(int i5) {
        TrafficStats.setThreadStatsTag(i5);
    }

    public static void f(@o0 DatagramSocket datagramSocket) throws SocketException {
        a.a(datagramSocket);
    }

    @Deprecated
    public static void g(Socket socket) throws SocketException {
        TrafficStats.tagSocket(socket);
    }

    public static void h(@o0 DatagramSocket datagramSocket) throws SocketException {
        a.b(datagramSocket);
    }

    @Deprecated
    public static void i(Socket socket) throws SocketException {
        TrafficStats.untagSocket(socket);
    }
}
