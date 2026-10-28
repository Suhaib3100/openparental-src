package androidx.core.net;

import android.net.TrafficStats;
import androidx.annotation.o0;
import androidx.annotation.x0;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

/* compiled from: TrafficStatsCompat.java */
/* loaded from: classes3.dex */
public final class d {

    /* compiled from: TrafficStatsCompat.java */
    @x0(24)
    static class a {
        private a() {
        }

        static void a(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.tagDatagramSocket(datagramSocket);
        }

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
    public static void c(int i4) {
        TrafficStats.incrementOperationCount(i4);
    }

    @Deprecated
    public static void d(int i4, int i5) {
        TrafficStats.incrementOperationCount(i4, i5);
    }

    @Deprecated
    public static void e(int i4) {
        TrafficStats.setThreadStatsTag(i4);
    }

    public static void f(@o0 DatagramSocket datagramSocket) throws SocketException {
        TrafficStats.tagDatagramSocket(datagramSocket);
    }

    @Deprecated
    public static void g(Socket socket) throws SocketException {
        TrafficStats.tagSocket(socket);
    }

    public static void h(@o0 DatagramSocket datagramSocket) throws SocketException {
        TrafficStats.untagDatagramSocket(datagramSocket);
    }

    @Deprecated
    public static void i(Socket socket) throws SocketException {
        TrafficStats.untagSocket(socket);
    }
}
