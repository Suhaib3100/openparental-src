package org.java_websocket_new;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import org.java_websocket_new.framing.d;

/* compiled from: WebSocket.java */
/* loaded from: classes6.dex */
public interface d {
    public static final int E2 = 80;
    public static final int F2 = 443;

    /* compiled from: WebSocket.java */
    public enum a {
        NOT_YET_CONNECTED,
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            int length = valuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(valuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    /* compiled from: WebSocket.java */
    public enum b {
        CLIENT,
        SERVER;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            int length = valuesCustom.length;
            b[] bVarArr = new b[length];
            System.arraycopy(valuesCustom, 0, bVarArr, 0, length);
            return bVarArr;
        }
    }

    boolean C();

    InetSocketAddress D();

    void E(int i4, String str);

    void G(org.java_websocket_new.framing.d dVar);

    void a(String str) throws NotYetConnectedException;

    void b(int i4, String str);

    void c(byte[] bArr) throws IllegalArgumentException, NotYetConnectedException;

    void close();

    String d();

    boolean f();

    org.java_websocket_new.drafts.a i();

    boolean isClosed();

    boolean isConnecting();

    boolean isOpen();

    void j(ByteBuffer byteBuffer) throws IllegalArgumentException, NotYetConnectedException;

    boolean k();

    InetSocketAddress s();

    a u();

    void v(int i4);

    void y(d.a aVar, ByteBuffer byteBuffer, boolean z4);
}
