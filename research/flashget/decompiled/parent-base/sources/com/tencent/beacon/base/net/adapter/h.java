package com.tencent.beacon.base.net.adapter;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.BResponse;
import com.tencent.beacon.base.net.NetException;
import com.tencent.beacon.base.net.RequestType;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.call.HttpRequestEntity;
import com.tencent.beacon.base.net.call.JceRequestEntity;
import com.tencent.beacon.pack.SocketRequestPackage;
import com.tencent.beacon.pack.SocketResponsePackage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.apache.log4j.Priority;

/* compiled from: SocketAdapter.java */
/* loaded from: classes6.dex */
public class h extends AbstractNetAdapter {

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.beacon.base.net.a.c<byte[], SocketResponsePackage> f71155a = new com.tencent.beacon.base.net.a.e();

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.beacon.base.net.a.c<JceRequestEntity, SocketRequestPackage> f71156b = new com.tencent.beacon.base.net.a.d();

    private h() {
    }

    public static AbstractNetAdapter a() {
        return new h();
    }

    @Override // com.tencent.beacon.base.net.adapter.AbstractNetAdapter
    public void request(HttpRequestEntity httpRequestEntity, Callback<BResponse> callback) {
    }

    private void a(Callback<byte[]> callback, String str, SocketResponsePackage socketResponsePackage) throws NetException {
        String str2 = socketResponsePackage.msg;
        if (str2 == null || !str2.equals(ProtectedSandApp.s("ヱ\u0001"))) {
            callback.onResponse(socketResponsePackage.body);
        } else {
            callback.onFailure(new com.tencent.beacon.base.net.d(str, ProtectedSandApp.s("ヲ\u0001"), socketResponsePackage.statusCode, ProtectedSandApp.s("ン\u0001")));
        }
    }

    @Override // com.tencent.beacon.base.net.adapter.AbstractNetAdapter
    public void request(JceRequestEntity jceRequestEntity, Callback<byte[]> callback) {
        String s4 = ProtectedSandApp.s("ワ\u0001");
        String s5 = ProtectedSandApp.s("ヴ\u0001");
        String s6 = ProtectedSandApp.s("ヵ\u0001");
        String s7 = ProtectedSandApp.s("ヶ\u0001");
        String s10 = ProtectedSandApp.s("ヷ\u0001");
        String domain = jceRequestEntity.getDomain();
        if (TextUtils.isEmpty(domain)) {
            return;
        }
        String name = jceRequestEntity.getType().name();
        Socket socket = null;
        try {
            try {
                try {
                    byte[] byteArray = this.f71156b.a(jceRequestEntity).toByteArray();
                    if (byteArray != null && byteArray.length > 65535) {
                        callback.onFailure(new com.tencent.beacon.base.net.d(name, ProtectedSandApp.s("ヸ\u0001"), -1, s10 + byteArray.length));
                        return;
                    }
                    Socket a5 = a(domain, jceRequestEntity.getPort());
                    com.tencent.beacon.base.util.c.a(s4, 0, s7 + jceRequestEntity.getContent().length, new Object[0]);
                    a(a5, this.f71156b.a(jceRequestEntity));
                    byte[] a6 = a(a5, jceRequestEntity.getType() == RequestType.EVENT);
                    String s11 = ProtectedSandApp.s("ヹ\u0001");
                    if (a6 != null && a6.length > 0) {
                        com.tencent.beacon.base.util.c.a(s4, 1, s6 + a6.length, new Object[0]);
                        SocketResponsePackage a7 = this.f71155a.a(a6);
                        if (a7 == null) {
                            callback.onFailure(new com.tencent.beacon.base.net.d(name, s11, -1, ProtectedSandApp.s("ヺ\u0001")));
                            if (a5 == null || a5.isClosed()) {
                                return;
                            }
                            try {
                                a5.close();
                                return;
                            } catch (IOException e4) {
                                com.tencent.beacon.base.util.c.a(e4);
                                return;
                            }
                        }
                        com.tencent.beacon.base.util.c.a(s4, 2, ProtectedSandApp.s("・\u0001"), Integer.valueOf(a7.statusCode), a7.header, a7.msg);
                        int i4 = a7.statusCode;
                        if (i4 == 200) {
                            a(callback, name, a7);
                        } else {
                            callback.onFailure(new com.tencent.beacon.base.net.d(name, s11, i4, s5 + a7.msg));
                        }
                        if (a5 == null || a5.isClosed()) {
                            return;
                        }
                        a5.close();
                        return;
                    }
                    callback.onFailure(new com.tencent.beacon.base.net.d(name, s11, -1, ProtectedSandApp.s("ー\u0001")));
                    if (a5 == null || a5.isClosed()) {
                        return;
                    }
                    try {
                        a5.close();
                    } catch (IOException e5) {
                        com.tencent.beacon.base.util.c.a(e5);
                    }
                } catch (IOException e6) {
                    com.tencent.beacon.base.util.c.a(e6);
                }
            } catch (ConnectException e7) {
                callback.onFailure(new com.tencent.beacon.base.net.d(name, ProtectedSandApp.s("\u3100\u0001"), -1, ProtectedSandApp.s("\u3102\u0001"), e7));
                if (0 != 0 && !socket.isClosed()) {
                    socket.close();
                }
            } catch (SocketTimeoutException e10) {
                callback.onFailure(new com.tencent.beacon.base.net.d(name, ProtectedSandApp.s("\u3100\u0001"), -1, ProtectedSandApp.s("\u3101\u0001"), e10));
                if (0 != 0 && !socket.isClosed()) {
                    socket.close();
                }
            } catch (Throwable th) {
                com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("ヽ\u0001"), th.getMessage());
                com.tencent.beacon.base.util.c.a(th);
                callback.onFailure(new com.tencent.beacon.base.net.d(name, ProtectedSandApp.s("ヾ\u0001"), -1, ProtectedSandApp.s("ヿ\u0001"), th));
                if (0 != 0 && !socket.isClosed()) {
                    socket.close();
                }
            }
        } catch (Throwable th2) {
            if (0 != 0 && !socket.isClosed()) {
                try {
                    socket.close();
                } catch (IOException e11) {
                    com.tencent.beacon.base.util.c.a(e11);
                }
            }
            throw th2;
        }
    }

    private byte[] a(Socket socket, boolean z4) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream = null;
        try {
            InputStream inputStream2 = socket.getInputStream();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = null;
            }
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (!z4) {
                    ByteBuffer allocate = ByteBuffer.allocate(byteArray.length - 4);
                    allocate.put(byteArray, 2, byteArray.length - 4);
                    byteArray = allocate.array();
                }
                byteArrayOutputStream.close();
                inputStream2.close();
                com.tencent.beacon.base.util.b.a(inputStream2, byteArrayOutputStream);
                return byteArray;
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStream2;
                try {
                    com.tencent.beacon.base.util.c.a(th);
                    com.tencent.beacon.base.util.b.a(inputStream, byteArrayOutputStream);
                    throw th;
                } catch (Throwable th3) {
                    com.tencent.beacon.base.util.b.a(inputStream, byteArrayOutputStream);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
    }

    private void a(Socket socket, SocketRequestPackage socketRequestPackage) throws IOException {
        com.tencent.beacon.pack.b bVar = new com.tencent.beacon.pack.b();
        socketRequestPackage.writeTo(bVar);
        OutputStream outputStream = socket.getOutputStream();
        byte[] b5 = bVar.b();
        outputStream.write(a(b5, b5.length));
        outputStream.flush();
    }

    private byte[] a(byte[] bArr, int i4) {
        int i5 = i4 + 4;
        ByteBuffer allocate = ByteBuffer.allocate(i5);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.putShort((short) (i5 & 65535));
        allocate.put(bArr);
        allocate.put((byte) 13);
        allocate.put((byte) 10);
        return allocate.array();
    }

    private Socket a(String str, int i4) throws IOException {
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ワ\u0001"), ProtectedSandApp.s("ヰ\u0001"), str, Integer.valueOf(i4));
        Socket socket = new Socket(InetAddress.getByName(str).getHostAddress(), i4);
        socket.setSoTimeout(Priority.WARN_INT);
        return socket;
    }
}
