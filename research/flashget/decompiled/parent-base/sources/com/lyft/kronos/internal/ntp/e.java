package com.lyft.kronos.internal.ntp;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import jb.b;
import jb.c;

/* compiled from: SntpClient.java */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    private static final int f69965e = 48;

    /* renamed from: f, reason: collision with root package name */
    private static final int f69966f = 123;

    /* renamed from: g, reason: collision with root package name */
    private static final int f69967g = 4;

    /* renamed from: h, reason: collision with root package name */
    private static final int f69968h = 5;

    /* renamed from: i, reason: collision with root package name */
    private static final int f69969i = 3;

    /* renamed from: j, reason: collision with root package name */
    private static final int f69970j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static final int f69971k = 15;

    /* renamed from: l, reason: collision with root package name */
    public static final long f69972l = 2208988800L;

    /* renamed from: m, reason: collision with root package name */
    private static final long f69973m = 1000;

    /* renamed from: a, reason: collision with root package name */
    private final hb.c f69974a;

    /* renamed from: b, reason: collision with root package name */
    private final c f69975b;

    /* renamed from: c, reason: collision with root package name */
    private final com.lyft.kronos.internal.ntp.a f69976c;

    /* renamed from: d, reason: collision with root package name */
    private final jb.c f69977d = new c.a();

    /* compiled from: SntpClient.java */
    private static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    /* compiled from: SntpClient.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f69978a;

        /* renamed from: b, reason: collision with root package name */
        private final long f69979b;

        /* renamed from: c, reason: collision with root package name */
        private final long f69980c;

        /* renamed from: d, reason: collision with root package name */
        private final hb.c f69981d;

        b(long j4, long j5, long j6, hb.c cVar) {
            this.f69978a = j4;
            this.f69979b = j5;
            this.f69980c = j6;
            this.f69981d = cVar;
        }

        public long a() {
            return e() + this.f69978a + this.f69980c;
        }

        long b() {
            return this.f69978a;
        }

        long c() {
            return this.f69979b;
        }

        public long d() {
            return this.f69980c;
        }

        public long e() {
            return this.f69981d.f() - this.f69979b;
        }

        boolean f() {
            return Math.abs((this.f69978a - this.f69979b) - (this.f69981d.a() - this.f69981d.f())) < 1000;
        }
    }

    public e(hb.c cVar, c cVar2, com.lyft.kronos.internal.ntp.a aVar) {
        this.f69974a = cVar;
        this.f69975b = cVar2;
        this.f69976c = aVar;
    }

    private static void a(byte b5, byte b6, int i4, long j4) throws a {
        if (b5 == 3) {
            throw new a(ProtectedSandApp.s("ᠵ\u0001"));
        }
        if (b6 != 4 && b6 != 5) {
            throw new a(android.support.v4.media.a.a(ProtectedSandApp.s("ᠲ\u0001"), b6));
        }
        if (i4 == 0 || i4 > 15) {
            throw new a(android.support.v4.media.a.a(ProtectedSandApp.s("ᠴ\u0001"), i4));
        }
        if (j4 == 0) {
            throw new a(ProtectedSandApp.s("ᠳ\u0001"));
        }
    }

    private static long b(byte[] bArr, int i4) {
        int i5 = bArr[i4];
        int i6 = bArr[i4 + 1];
        int i7 = bArr[i4 + 2];
        int i10 = bArr[i4 + 3];
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        if ((i6 & 128) == 128) {
            i6 = (i6 & 127) + 128;
        }
        if ((i7 & 128) == 128) {
            i7 = (i7 & 127) + 128;
        }
        if ((i10 & 128) == 128) {
            i10 = (i10 & 127) + 128;
        }
        return (i5 << 24) + (i6 << 16) + (i7 << 8) + i10;
    }

    static long c(byte[] bArr, int i4) {
        long b5 = b(bArr, i4);
        return ((b(bArr, i4 + 4) * 1000) / 4294967296L) + ((b5 - f69972l) * 1000);
    }

    public b d(String str, Long l4) throws IOException {
        DatagramSocket datagramSocket = null;
        try {
            InetAddress a5 = this.f69975b.a(str);
            datagramSocket = this.f69976c.a();
            datagramSocket.setSoTimeout(l4.intValue());
            long a6 = this.f69974a.a();
            long f4 = this.f69974a.f();
            datagramSocket.send(this.f69976c.c(this.f69977d.a(new jb.b((byte) 0, (byte) 3, b.a.Client.getValue(), (byte) 0, (byte) 0, (byte) 0, p.f60679p, p.f60679p, p.f60679p, p.f60679p, p.f60679p, TimeUnit.MILLISECONDS.toSeconds(a6) + f69972l)).array(), a5, 123));
            ByteBuffer allocate = ByteBuffer.allocate(48);
            datagramSocket.receive(this.f69976c.b(allocate.array()));
            long f5 = this.f69974a.f();
            long j4 = (f5 - f4) + a6;
            jb.b b5 = this.f69977d.b(allocate);
            byte z4 = b5.z();
            byte r4 = b5.r();
            byte x4 = b5.x();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(((long) b5.p()) - f69972l);
            long millis2 = timeUnit.toMillis(((long) b5.t()) - f69972l);
            long millis3 = timeUnit.toMillis(((long) b5.y()) - f69972l);
            a(z4, r4, x4, millis3);
            b bVar = new b(j4, f5, ((millis3 - j4) + (millis2 - millis)) / 2, this.f69974a);
            datagramSocket.close();
            return bVar;
        } catch (Throwable th) {
            if (datagramSocket != null) {
                datagramSocket.close();
            }
            throw th;
        }
    }
}
