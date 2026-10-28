package com.bumptech.glide.gifdecoder;

import android.util.Log;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: GifHeaderParser.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    private static final String f42945e = ProtectedSandApp.s("࠷");

    /* renamed from: f, reason: collision with root package name */
    private static final int f42946f = 255;

    /* renamed from: g, reason: collision with root package name */
    private static final int f42947g = 44;

    /* renamed from: h, reason: collision with root package name */
    private static final int f42948h = 33;

    /* renamed from: i, reason: collision with root package name */
    private static final int f42949i = 59;

    /* renamed from: j, reason: collision with root package name */
    private static final int f42950j = 249;

    /* renamed from: k, reason: collision with root package name */
    private static final int f42951k = 255;

    /* renamed from: l, reason: collision with root package name */
    private static final int f42952l = 254;

    /* renamed from: m, reason: collision with root package name */
    private static final int f42953m = 1;

    /* renamed from: n, reason: collision with root package name */
    private static final int f42954n = 28;

    /* renamed from: o, reason: collision with root package name */
    private static final int f42955o = 2;

    /* renamed from: p, reason: collision with root package name */
    private static final int f42956p = 1;

    /* renamed from: q, reason: collision with root package name */
    private static final int f42957q = 128;

    /* renamed from: r, reason: collision with root package name */
    private static final int f42958r = 64;

    /* renamed from: s, reason: collision with root package name */
    private static final int f42959s = 7;

    /* renamed from: t, reason: collision with root package name */
    private static final int f42960t = 128;

    /* renamed from: u, reason: collision with root package name */
    private static final int f42961u = 7;

    /* renamed from: v, reason: collision with root package name */
    static final int f42962v = 2;

    /* renamed from: w, reason: collision with root package name */
    static final int f42963w = 10;

    /* renamed from: x, reason: collision with root package name */
    private static final int f42964x = 256;

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f42966b;

    /* renamed from: c, reason: collision with root package name */
    private c f42967c;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f42965a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    private int f42968d = 0;

    private boolean b() {
        return this.f42967c.f42933b != 0;
    }

    private int e() {
        try {
            return this.f42966b.get() & 255;
        } catch (Exception unused) {
            this.f42967c.f42933b = 1;
            return 0;
        }
    }

    private void f() {
        this.f42967c.f42935d.f42919a = this.f42966b.getShort();
        this.f42967c.f42935d.f42920b = this.f42966b.getShort();
        this.f42967c.f42935d.f42921c = this.f42966b.getShort();
        this.f42967c.f42935d.f42922d = this.f42966b.getShort();
        int e4 = e();
        boolean z4 = (e4 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (e4 & 7) + 1);
        b bVar = this.f42967c.f42935d;
        bVar.f42923e = (e4 & 64) != 0;
        if (z4) {
            bVar.f42929k = h(pow);
        } else {
            bVar.f42929k = null;
        }
        this.f42967c.f42935d.f42928j = this.f42966b.position();
        t();
        if (b()) {
            return;
        }
        c cVar = this.f42967c;
        cVar.f42934c++;
        cVar.f42936e.add(cVar.f42935d);
    }

    private void g() {
        int e4 = e();
        this.f42968d = e4;
        if (e4 <= 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            try {
                int i5 = this.f42968d;
                if (i4 >= i5) {
                    return;
                }
                int i6 = i5 - i4;
                this.f42966b.get(this.f42965a, i4, i6);
                i4 += i6;
            } catch (Exception unused) {
                Log.isLoggable(ProtectedSandApp.s("࠷"), 3);
                this.f42967c.f42933b = 1;
                return;
            }
        }
    }

    @q0
    private int[] h(int i4) {
        byte[] bArr = new byte[i4 * 3];
        int[] iArr = null;
        try {
            this.f42966b.get(bArr);
            iArr = new int[256];
            int i5 = 0;
            int i6 = 0;
            while (i5 < i4) {
                int i7 = bArr[i6] & 255;
                int i10 = i6 + 2;
                int i11 = bArr[i6 + 1] & 255;
                i6 += 3;
                int i12 = i5 + 1;
                iArr[i5] = (i11 << 8) | (i7 << 16) | x1.f27484y | (bArr[i10] & 255);
                i5 = i12;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable(ProtectedSandApp.s("࠷"), 3);
            this.f42967c.f42933b = 1;
        }
        return iArr;
    }

    private void i() {
        j(Integer.MAX_VALUE);
    }

    private void j(int i4) {
        boolean z4 = false;
        while (!z4 && !b() && this.f42967c.f42934c <= i4) {
            int e4 = e();
            if (e4 == 33) {
                int e5 = e();
                if (e5 == 1) {
                    s();
                } else if (e5 == f42950j) {
                    this.f42967c.f42935d = new b();
                    k();
                } else if (e5 == f42952l) {
                    s();
                } else if (e5 != 255) {
                    s();
                } else {
                    g();
                    StringBuilder sb = new StringBuilder();
                    for (int i5 = 0; i5 < 11; i5++) {
                        sb.append((char) this.f42965a[i5]);
                    }
                    if (sb.toString().equals(ProtectedSandApp.s("࠸"))) {
                        n();
                    } else {
                        s();
                    }
                }
            } else if (e4 == 44) {
                c cVar = this.f42967c;
                if (cVar.f42935d == null) {
                    cVar.f42935d = new b();
                }
                f();
            } else if (e4 != 59) {
                this.f42967c.f42933b = 1;
            } else {
                z4 = true;
            }
        }
    }

    private void k() {
        e();
        int e4 = e();
        b bVar = this.f42967c.f42935d;
        int i4 = (e4 & 28) >> 2;
        bVar.f42925g = i4;
        if (i4 == 0) {
            bVar.f42925g = 1;
        }
        bVar.f42924f = (e4 & 1) != 0;
        short s4 = this.f42966b.getShort();
        if (s4 < 2) {
            s4 = 10;
        }
        b bVar2 = this.f42967c.f42935d;
        bVar2.f42927i = s4 * 10;
        bVar2.f42926h = e();
        e();
    }

    private void l() {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < 6; i4++) {
            sb.append((char) e());
        }
        if (!sb.toString().startsWith(ProtectedSandApp.s("࠹"))) {
            this.f42967c.f42933b = 1;
            return;
        }
        m();
        if (!this.f42967c.f42939h || b()) {
            return;
        }
        c cVar = this.f42967c;
        cVar.f42932a = h(cVar.f42940i);
        c cVar2 = this.f42967c;
        cVar2.f42943l = cVar2.f42932a[cVar2.f42941j];
    }

    private void m() {
        this.f42967c.f42937f = this.f42966b.getShort();
        this.f42967c.f42938g = this.f42966b.getShort();
        int e4 = e();
        c cVar = this.f42967c;
        cVar.f42939h = (e4 & 128) != 0;
        cVar.f42940i = (int) Math.pow(2.0d, (e4 & 7) + 1);
        this.f42967c.f42941j = e();
        this.f42967c.f42942k = e();
    }

    private void n() {
        do {
            g();
            byte[] bArr = this.f42965a;
            if (bArr[0] == 1) {
                this.f42967c.f42944m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f42968d <= 0) {
                return;
            }
        } while (!b());
    }

    private int o() {
        return this.f42966b.getShort();
    }

    private void p() {
        this.f42966b = null;
        Arrays.fill(this.f42965a, (byte) 0);
        this.f42967c = new c();
        this.f42968d = 0;
    }

    private void s() {
        int e4;
        do {
            e4 = e();
            this.f42966b.position(Math.min(this.f42966b.position() + e4, this.f42966b.limit()));
        } while (e4 > 0);
    }

    private void t() {
        e();
        s();
    }

    public void a() {
        this.f42966b = null;
        this.f42967c = null;
    }

    public boolean c() {
        l();
        if (!b()) {
            j(2);
        }
        return this.f42967c.f42934c > 1;
    }

    @o0
    public c d() {
        if (this.f42966b == null) {
            throw new IllegalStateException(ProtectedSandApp.s("࠺"));
        }
        if (b()) {
            return this.f42967c;
        }
        l();
        if (!b()) {
            i();
            c cVar = this.f42967c;
            if (cVar.f42934c < 0) {
                cVar.f42933b = 1;
            }
        }
        return this.f42967c;
    }

    public d q(@o0 ByteBuffer byteBuffer) {
        p();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f42966b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f42966b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public d r(@q0 byte[] bArr) {
        if (bArr != null) {
            q(ByteBuffer.wrap(bArr));
        } else {
            this.f42966b = null;
            this.f42967c.f42933b = 2;
        }
        return this;
    }
}
