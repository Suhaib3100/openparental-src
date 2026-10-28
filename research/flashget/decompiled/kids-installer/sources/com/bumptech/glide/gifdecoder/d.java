package com.bumptech.glide.gifdecoder;

import android.util.Log;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.UByte;

/* compiled from: GifHeaderParser.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    private static final String f10846e = ProtectedSandApp.s("ë");

    /* renamed from: f, reason: collision with root package name */
    private static final int f10847f = 255;

    /* renamed from: g, reason: collision with root package name */
    private static final int f10848g = 44;

    /* renamed from: h, reason: collision with root package name */
    private static final int f10849h = 33;

    /* renamed from: i, reason: collision with root package name */
    private static final int f10850i = 59;

    /* renamed from: j, reason: collision with root package name */
    private static final int f10851j = 249;

    /* renamed from: k, reason: collision with root package name */
    private static final int f10852k = 255;

    /* renamed from: l, reason: collision with root package name */
    private static final int f10853l = 254;

    /* renamed from: m, reason: collision with root package name */
    private static final int f10854m = 1;

    /* renamed from: n, reason: collision with root package name */
    private static final int f10855n = 28;

    /* renamed from: o, reason: collision with root package name */
    private static final int f10856o = 2;

    /* renamed from: p, reason: collision with root package name */
    private static final int f10857p = 1;

    /* renamed from: q, reason: collision with root package name */
    private static final int f10858q = 128;

    /* renamed from: r, reason: collision with root package name */
    private static final int f10859r = 64;

    /* renamed from: s, reason: collision with root package name */
    private static final int f10860s = 7;

    /* renamed from: t, reason: collision with root package name */
    private static final int f10861t = 128;

    /* renamed from: u, reason: collision with root package name */
    private static final int f10862u = 7;

    /* renamed from: v, reason: collision with root package name */
    static final int f10863v = 2;

    /* renamed from: w, reason: collision with root package name */
    static final int f10864w = 10;

    /* renamed from: x, reason: collision with root package name */
    private static final int f10865x = 256;

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f10867b;

    /* renamed from: c, reason: collision with root package name */
    private c f10868c;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f10866a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    private int f10869d = 0;

    private boolean b() {
        return this.f10868c.f10834b != 0;
    }

    private int e() {
        try {
            return this.f10867b.get() & UByte.f27220r;
        } catch (Exception unused) {
            this.f10868c.f10834b = 1;
            return 0;
        }
    }

    private void f() {
        this.f10868c.f10836d.f10820a = o();
        this.f10868c.f10836d.f10821b = o();
        this.f10868c.f10836d.f10822c = o();
        this.f10868c.f10836d.f10823d = o();
        int e6 = e();
        boolean z5 = (e6 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (e6 & 7) + 1);
        b bVar = this.f10868c.f10836d;
        bVar.f10824e = (e6 & 64) != 0;
        if (z5) {
            bVar.f10830k = h(pow);
        } else {
            bVar.f10830k = null;
        }
        this.f10868c.f10836d.f10829j = this.f10867b.position();
        t();
        if (b()) {
            return;
        }
        c cVar = this.f10868c;
        cVar.f10835c++;
        cVar.f10837e.add(cVar.f10836d);
    }

    private void g() {
        int e6 = e();
        this.f10869d = e6;
        if (e6 <= 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            try {
                int i6 = this.f10869d;
                if (i5 >= i6) {
                    return;
                }
                int i7 = i6 - i5;
                this.f10867b.get(this.f10866a, i5, i7);
                i5 += i7;
            } catch (Exception unused) {
                Log.isLoggable(ProtectedSandApp.s("æ"), 3);
                this.f10868c.f10834b = 1;
                return;
            }
        }
    }

    @q0
    private int[] h(int i5) {
        byte[] bArr = new byte[i5 * 3];
        int[] iArr = null;
        try {
            this.f10867b.get(bArr);
            iArr = new int[256];
            int i6 = 0;
            int i7 = 0;
            while (i6 < i5) {
                int i8 = i7 + 1;
                int i9 = i8 + 1;
                int i10 = i9 + 1;
                int i11 = i6 + 1;
                iArr[i6] = ((bArr[i7] & UByte.f27220r) << 16) | y1.f5758t | ((bArr[i8] & UByte.f27220r) << 8) | (bArr[i9] & UByte.f27220r);
                i7 = i10;
                i6 = i11;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable(ProtectedSandApp.s("ç"), 3);
            this.f10868c.f10834b = 1;
        }
        return iArr;
    }

    private void i() {
        j(Integer.MAX_VALUE);
    }

    private void j(int i5) {
        boolean z5 = false;
        while (!z5 && !b() && this.f10868c.f10835c <= i5) {
            int e6 = e();
            if (e6 == 33) {
                int e7 = e();
                if (e7 == 1) {
                    s();
                } else if (e7 == f10851j) {
                    this.f10868c.f10836d = new b();
                    k();
                } else if (e7 == f10853l) {
                    s();
                } else if (e7 != 255) {
                    s();
                } else {
                    g();
                    StringBuilder sb = new StringBuilder();
                    for (int i6 = 0; i6 < 11; i6++) {
                        sb.append((char) this.f10866a[i6]);
                    }
                    if (sb.toString().equals(ProtectedSandApp.s("è"))) {
                        n();
                    } else {
                        s();
                    }
                }
            } else if (e6 == 44) {
                c cVar = this.f10868c;
                if (cVar.f10836d == null) {
                    cVar.f10836d = new b();
                }
                f();
            } else if (e6 != 59) {
                this.f10868c.f10834b = 1;
            } else {
                z5 = true;
            }
        }
    }

    private void k() {
        e();
        int e6 = e();
        b bVar = this.f10868c.f10836d;
        int i5 = (e6 & 28) >> 2;
        bVar.f10826g = i5;
        if (i5 == 0) {
            bVar.f10826g = 1;
        }
        bVar.f10825f = (e6 & 1) != 0;
        int o5 = o();
        if (o5 < 2) {
            o5 = 10;
        }
        b bVar2 = this.f10868c.f10836d;
        bVar2.f10828i = o5 * 10;
        bVar2.f10827h = e();
        e();
    }

    private void l() {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < 6; i5++) {
            sb.append((char) e());
        }
        if (!sb.toString().startsWith(ProtectedSandApp.s("é"))) {
            this.f10868c.f10834b = 1;
            return;
        }
        m();
        if (!this.f10868c.f10840h || b()) {
            return;
        }
        c cVar = this.f10868c;
        cVar.f10833a = h(cVar.f10841i);
        c cVar2 = this.f10868c;
        cVar2.f10844l = cVar2.f10833a[cVar2.f10842j];
    }

    private void m() {
        this.f10868c.f10838f = o();
        this.f10868c.f10839g = o();
        int e6 = e();
        c cVar = this.f10868c;
        cVar.f10840h = (e6 & 128) != 0;
        cVar.f10841i = (int) Math.pow(2.0d, (e6 & 7) + 1);
        this.f10868c.f10842j = e();
        this.f10868c.f10843k = e();
    }

    private void n() {
        do {
            g();
            byte[] bArr = this.f10866a;
            if (bArr[0] == 1) {
                this.f10868c.f10845m = ((bArr[2] & UByte.f27220r) << 8) | (bArr[1] & UByte.f27220r);
            }
            if (this.f10869d <= 0) {
                return;
            }
        } while (!b());
    }

    private int o() {
        return this.f10867b.getShort();
    }

    private void p() {
        this.f10867b = null;
        Arrays.fill(this.f10866a, (byte) 0);
        this.f10868c = new c();
        this.f10869d = 0;
    }

    private void s() {
        int e6;
        do {
            e6 = e();
            this.f10867b.position(Math.min(this.f10867b.position() + e6, this.f10867b.limit()));
        } while (e6 > 0);
    }

    private void t() {
        e();
        s();
    }

    public void a() {
        this.f10867b = null;
        this.f10868c = null;
    }

    public boolean c() {
        l();
        if (!b()) {
            j(2);
        }
        return this.f10868c.f10835c > 1;
    }

    @o0
    public c d() {
        if (this.f10867b == null) {
            throw new IllegalStateException(ProtectedSandApp.s("ê"));
        }
        if (b()) {
            return this.f10868c;
        }
        l();
        if (!b()) {
            i();
            c cVar = this.f10868c;
            if (cVar.f10835c < 0) {
                cVar.f10834b = 1;
            }
        }
        return this.f10868c;
    }

    public d q(@o0 ByteBuffer byteBuffer) {
        p();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f10867b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f10867b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public d r(@q0 byte[] bArr) {
        if (bArr != null) {
            q(ByteBuffer.wrap(bArr));
        } else {
            this.f10867b = null;
            this.f10868c.f10834b = 2;
        }
        return this;
    }
}
