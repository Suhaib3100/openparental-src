package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Surface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.r;
import com.tencent.liteav.videobase.videobase.e;
import com.tencent.liteav.videoproducer.encoder.e;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import com.tencent.liteav.videoproducer.producer.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f72615a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f72616b;

    /* renamed from: c, reason: collision with root package name */
    public CustomHandler f72617c;

    /* renamed from: d, reason: collision with root package name */
    public MediaCodec f72618d;

    /* renamed from: e, reason: collision with root package name */
    public e.a f72619e;

    /* renamed from: f, reason: collision with root package name */
    public VideoEncodeParams f72620f;

    /* renamed from: l, reason: collision with root package name */
    private final com.tencent.liteav.videobase.videobase.c f72626l;

    /* renamed from: y, reason: collision with root package name */
    private ServerVideoProducerConfig f72639y;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f72628n = null;

    /* renamed from: o, reason: collision with root package name */
    private boolean f72629o = true;

    /* renamed from: g, reason: collision with root package name */
    public long f72621g = 0;

    /* renamed from: h, reason: collision with root package name */
    public r f72622h = null;

    /* renamed from: p, reason: collision with root package name */
    private long f72630p = 0;

    /* renamed from: q, reason: collision with root package name */
    private long f72631q = 0;

    /* renamed from: r, reason: collision with root package name */
    private long f72632r = 0;

    /* renamed from: s, reason: collision with root package name */
    private int f72633s = -1;

    /* renamed from: i, reason: collision with root package name */
    public final Deque<Long> f72623i = new LinkedList();

    /* renamed from: t, reason: collision with root package name */
    private long f72634t = 0;

    /* renamed from: u, reason: collision with root package name */
    private long f72635u = 0;

    /* renamed from: v, reason: collision with root package name */
    private long f72636v = 0;

    /* renamed from: w, reason: collision with root package name */
    private long f72637w = Long.MIN_VALUE;

    /* renamed from: x, reason: collision with root package name */
    private boolean f72638x = false;

    /* renamed from: z, reason: collision with root package name */
    private double f72640z = p.f60679p;
    private long A = 0;
    private long B = 0;
    private long C = 0;
    private long D = 0;
    private long E = 0;
    private final Deque<Long> F = new LinkedList();
    private int G = 0;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicLong f72624j = new AtomicLong(0);
    private final List<Long> H = new ArrayList();
    private final AtomicLong I = new AtomicLong(0);

    /* renamed from: k, reason: collision with root package name */
    public final Runnable f72625k = c.a(this);

    /* renamed from: m, reason: collision with root package name */
    private final a.EnumC1005a f72627m = a.EnumC1005a.f72644a;

    public b(Bundle bundle, com.tencent.liteav.videobase.videobase.c cVar, String str) {
        this.f72626l = cVar;
        this.f72616b = bundle;
        StringBuilder a5 = androidx.constraintlayout.core.e.a(str, ProtectedSandApp.s("坮\u0001"));
        a5.append(hashCode());
        this.f72615a = a5.toString();
    }

    private void e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime <= TimeUnit.SECONDS.toMillis(2L) + this.A) {
            this.B++;
            return;
        }
        this.f72640z = (this.B * 1000.0d) / (elapsedRealtime - this.A);
        this.B = 1L;
        this.A = elapsedRealtime;
        Iterator<Long> it = this.H.iterator();
        long j4 = -1;
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            if (j4 < longValue) {
                j4 = longValue;
            }
        }
        this.I.set(j4);
        this.H.clear();
    }

    public final void a(ServerVideoProducerConfig serverVideoProducerConfig) {
        this.f72639y = serverVideoProducerConfig;
        LiteavLog.i(this.f72615a, ProtectedSandApp.s("垌\u0001") + this.f72639y);
    }

    public final void b() {
        if (this.f72622h != null) {
            LiteavLog.i(this.f72615a, ProtectedSandApp.s("垍\u0001"));
            this.f72622h.a();
            this.f72622h = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.encoder.b.c():void");
    }

    public final void d() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 19 || this.f72618d == null) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt(ProtectedSandApp.s("垞\u0001"), 0);
            this.f72618d.setParameters(bundle);
        } catch (Throwable th) {
            LiteavLog.e(this.f72615a, ProtectedSandApp.s("垟\u0001"), th);
        }
    }

    public final void a(int i4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i5 = 1; i5 <= 3; i5++) {
            this.F.addLast(Long.valueOf((i5 * 2000) + elapsedRealtime));
        }
        this.G = i4;
    }

    private static byte[] b(byte[] bArr) {
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(20);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = 1;
            if (i4 > length) {
                break;
            }
            int i10 = i4 + 2;
            if (i10 < length && bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i10] == 1) {
                i7 = 3;
            } else {
                int i11 = i4 + 3;
                if (i11 < length && bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i10] == 0 && bArr[i11] == 1) {
                    i7 = 4;
                }
            }
            if (i7 == 3 || i7 == 4 || i4 == length) {
                if (i6 != i4) {
                    arrayList.add(new int[]{i6, i4});
                    i5 += i4 - i6;
                }
                i6 = i4 + i7;
            }
            i4 += i7;
        }
        byte[] a5 = com.tencent.liteav.videobase.utils.d.a((arrayList.size() * 4) + i5);
        if (a5 == null) {
            return bArr;
        }
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            int i13 = iArr[1] - iArr[0];
            ByteBuffer order = ByteBuffer.wrap(new byte[4]).order(ByteOrder.BIG_ENDIAN);
            order.putInt(i13);
            System.arraycopy(order.array(), 0, a5, i12, 4);
            int i14 = i12 + 4;
            System.arraycopy(bArr, iArr[0], a5, i14, i13);
            i12 = i14 + i13;
        }
        return a5;
    }

    public final void a(MediaCodec mediaCodec, int i4) {
        if (mediaCodec == null || LiteavSystemInfo.getSystemOSVersionInt() < 19) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt(ProtectedSandApp.s("垊\u0001"), i4 * 1024);
            mediaCodec.setParameters(bundle);
        } catch (Throwable th) {
            LiteavLog.e(this.f72615a, ProtectedSandApp.s("型\u0001"), th);
        }
    }

    private void a(String str) {
        LiteavLog.e(this.f72615a, ProtectedSandApp.s("坲\u0001").concat(String.valueOf(str)));
        e.a aVar = this.f72619e;
        if (aVar != null) {
            aVar.onEncodedFail(e.a.f72343j);
        }
    }

    public final void a() {
        this.f72617c.removeMessages(10);
        a(this.f72618d);
        this.f72618d = null;
    }

    private MediaCodec b(String str) throws Throwable {
        String str2;
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType(str);
        try {
            str2 = createEncoderByType.getName();
        } catch (Throwable th) {
            LiteavLog.e(this.f72615a, ProtectedSandApp.s("坵\u0001"), th);
            str2 = null;
        }
        LiteavLog.i(this.f72615a, ProtectedSandApp.s("坶\u0001").concat(String.valueOf(str2)));
        if (str2 == null || !str2.equals(ProtectedSandApp.s("坷\u0001"))) {
            return createEncoderByType;
        }
        LiteavLog.w(this.f72615a, ProtectedSandApp.s("坸\u0001").concat(str2));
        a(createEncoderByType);
        throw new IOException(ProtectedSandApp.s("坹\u0001"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0149, code lost:
    
        r5 = r2.getInteger(com.flashget.parentalcontrol.ProtectedSandApp.s("垃\u0001"), -1);
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5 A[Catch: all -> 0x00dd, TRY_LEAVE, TryCatch #1 {all -> 0x00dd, blocks: (B:20:0x00b4, B:22:0x00ce, B:26:0x00e5, B:70:0x0191, B:71:0x019c), top: B:19:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0191 A[Catch: all -> 0x00dd, TRY_ENTER, TryCatch #1 {all -> 0x00dd, blocks: (B:20:0x00b4, B:22:0x00ce, B:26:0x00e5, B:70:0x0191, B:71:0x019c), top: B:19:0x00b4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.Surface a(com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r9) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.encoder.b.a(com.tencent.liteav.videoproducer.encoder.VideoEncodeParams):android.view.Surface");
    }

    private boolean a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return false;
        }
        try {
            LiteavLog.i(this.f72615a, ProtectedSandApp.s("坳\u0001"), mediaFormat);
            mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            return true;
        } catch (Throwable th) {
            LiteavLog.e(this.f72615a, ProtectedSandApp.s("坴\u0001"), th);
            return false;
        }
    }

    private static byte[] a(byte[] bArr) {
        byte[] a5;
        if (bArr.length > 5 && bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 0 && bArr[4] == 0 && bArr[5] == 0) {
            int i4 = 0;
            while (true) {
                int i5 = i4 + 3;
                if (i5 >= bArr.length) {
                    i4 = 0;
                    break;
                }
                byte b5 = bArr[i4];
                if ((b5 == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 0 && bArr[i5] == 1) || (b5 == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 1)) {
                    break;
                }
                i4++;
            }
            if (i4 == 0 || (a5 = com.tencent.liteav.videobase.utils.d.a(bArr.length - i4)) == null) {
                return bArr;
            }
            System.arraycopy(bArr, i4, a5, 0, a5.length);
            return a5;
        }
        return bArr;
    }

    private void a(MediaCodec mediaCodec) {
        if (mediaCodec == null) {
            return;
        }
        try {
            mediaCodec.stop();
        } catch (Throwable th) {
            LiteavLog.e(this.f72615a, ProtectedSandApp.s("坯\u0001"), th);
        }
        try {
            mediaCodec.release();
        } catch (Throwable th2) {
            LiteavLog.e(this.f72615a, ProtectedSandApp.s("坰\u0001"), th2);
        }
        LiteavLog.i(this.f72615a, ProtectedSandApp.s("坱\u0001"));
    }
}
