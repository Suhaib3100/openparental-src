package com.tencent.beacon.base.net.adapter;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;
import com.tencent.beacon.pack.RequestPackageV2;
import com.tencent.beacon.pack.SocketRequestPackage;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: QuicAdapter.java */
/* loaded from: classes6.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static com.tencent.beacon.d.b f71153a;

    /* compiled from: QuicAdapter.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final g f71154a = new g();
    }

    public static g a() {
        return a.f71154a;
    }

    private g() {
        f71153a = com.tencent.beacon.d.b.b();
    }

    public byte[] a(RequestPackageV2 requestPackageV2) {
        try {
            if (f71153a.c() != 1) {
                if (f71153a.c() == 2) {
                    return com.tencent.beacon.base.util.b.b(requestPackageV2.toByteArray(), 2);
                }
                return null;
            }
            SocketRequestPackage socketRequestPackage = new SocketRequestPackage(com.tencent.beacon.base.net.b.d.e(), requestPackageV2.toByteArray());
            com.tencent.beacon.pack.b bVar = new com.tencent.beacon.pack.b();
            socketRequestPackage.writeTo(bVar);
            byte[] b5 = bVar.b();
            return com.tencent.beacon.base.util.b.b(a(b5, b5.length), 2);
        } catch (Throwable th) {
            String format = String.format(ProtectedSandApp.s("レ\u0001"), th.getMessage());
            com.tencent.beacon.base.util.c.b(format, new Object[0]);
            com.tencent.beacon.base.util.c.a(th);
            j.e().a(f71153a.c() == 1 ? ProtectedSandApp.s("ロ\u0001") : ProtectedSandApp.s("ヮ\u0001"), format);
            return null;
        }
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
}
