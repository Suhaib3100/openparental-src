package com.mp4parser.iso14496.part15;

import androidx.compose.ui.graphics.l6;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: HevcDecoderConfigurationRecord.java */
/* loaded from: classes6.dex */
public class b {
    boolean A;

    /* renamed from: a, reason: collision with root package name */
    int f70036a;

    /* renamed from: b, reason: collision with root package name */
    int f70037b;

    /* renamed from: c, reason: collision with root package name */
    boolean f70038c;

    /* renamed from: d, reason: collision with root package name */
    int f70039d;

    /* renamed from: e, reason: collision with root package name */
    long f70040e;

    /* renamed from: f, reason: collision with root package name */
    long f70041f;

    /* renamed from: g, reason: collision with root package name */
    int f70042g;

    /* renamed from: i, reason: collision with root package name */
    int f70044i;

    /* renamed from: k, reason: collision with root package name */
    int f70046k;

    /* renamed from: m, reason: collision with root package name */
    int f70048m;

    /* renamed from: o, reason: collision with root package name */
    int f70050o;

    /* renamed from: q, reason: collision with root package name */
    int f70052q;

    /* renamed from: r, reason: collision with root package name */
    int f70053r;

    /* renamed from: s, reason: collision with root package name */
    int f70054s;

    /* renamed from: t, reason: collision with root package name */
    int f70055t;

    /* renamed from: u, reason: collision with root package name */
    boolean f70056u;

    /* renamed from: v, reason: collision with root package name */
    int f70057v;

    /* renamed from: x, reason: collision with root package name */
    boolean f70059x;

    /* renamed from: y, reason: collision with root package name */
    boolean f70060y;

    /* renamed from: z, reason: collision with root package name */
    boolean f70061z;

    /* renamed from: h, reason: collision with root package name */
    int f70043h = 15;

    /* renamed from: j, reason: collision with root package name */
    int f70045j = 63;

    /* renamed from: l, reason: collision with root package name */
    int f70047l = 63;

    /* renamed from: n, reason: collision with root package name */
    int f70049n = 31;

    /* renamed from: p, reason: collision with root package name */
    int f70051p = 31;

    /* renamed from: w, reason: collision with root package name */
    List<a> f70058w = new ArrayList();

    /* compiled from: HevcDecoderConfigurationRecord.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f70062a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f70063b;

        /* renamed from: c, reason: collision with root package name */
        public int f70064c;

        /* renamed from: d, reason: collision with root package name */
        public List<byte[]> f70065d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f70062a != aVar.f70062a || this.f70064c != aVar.f70064c || this.f70063b != aVar.f70063b) {
                return false;
            }
            ListIterator<byte[]> listIterator = this.f70065d.listIterator();
            ListIterator<byte[]> listIterator2 = aVar.f70065d.listIterator();
            while (listIterator.hasNext() && listIterator2.hasNext()) {
                byte[] next = listIterator.next();
                byte[] next2 = listIterator2.next();
                if (next == null) {
                    if (next2 != null) {
                        return false;
                    }
                } else if (!Arrays.equals(next, next2)) {
                    return false;
                }
            }
            return (listIterator.hasNext() || listIterator2.hasNext()) ? false : true;
        }

        public int hashCode() {
            int i4 = (((((this.f70062a ? 1 : 0) * 31) + (this.f70063b ? 1 : 0)) * 31) + this.f70064c) * 31;
            List<byte[]> list = this.f70065d;
            return i4 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return ProtectedSandApp.s("ᥭ\u0001") + this.f70064c + ProtectedSandApp.s("\u196e\u0001") + this.f70063b + ProtectedSandApp.s("\u196f\u0001") + this.f70062a + ProtectedSandApp.s("ᥰ\u0001") + this.f70065d.size() + '}';
        }
    }

    public void A(int i4) {
        this.f70052q = i4;
    }

    public void B(int i4) {
        this.f70050o = i4;
    }

    public void C(int i4) {
        this.f70048m = i4;
    }

    public void D(int i4) {
        this.f70036a = i4;
    }

    public void E(int i4) {
        this.f70054s = i4;
    }

    public void F(boolean z4) {
        this.f70059x = z4;
    }

    public void G(long j4) {
        this.f70041f = j4;
    }

    public void H(int i4) {
        this.f70042g = i4;
    }

    public void I(long j4) {
        this.f70040e = j4;
    }

    public void J(int i4) {
        this.f70039d = i4;
    }

    public void K(int i4) {
        this.f70037b = i4;
    }

    public void L(boolean z4) {
        this.f70038c = z4;
    }

    public void M(boolean z4) {
        this.f70061z = z4;
    }

    public void N(int i4) {
        this.f70057v = i4;
    }

    public void O(int i4) {
        this.f70044i = i4;
    }

    public void P(boolean z4) {
        this.f70060y = z4;
    }

    public void Q(int i4) {
        this.f70055t = i4;
    }

    public void R(int i4) {
        this.f70046k = i4;
    }

    public void S(boolean z4) {
        this.A = z4;
    }

    public void T(boolean z4) {
        this.f70056u = z4;
    }

    public void U(ByteBuffer byteBuffer) {
        i.m(byteBuffer, this.f70036a);
        i.m(byteBuffer, (this.f70037b << 6) + (this.f70038c ? 32 : 0) + this.f70039d);
        byteBuffer.putInt((int) this.f70040e);
        long j4 = this.f70041f;
        if (this.f70059x) {
            j4 |= 140737488355328L;
        }
        if (this.f70060y) {
            j4 |= 70368744177664L;
        }
        if (this.f70061z) {
            j4 |= 35184372088832L;
        }
        if (this.A) {
            j4 |= 17592186044416L;
        }
        i.k(byteBuffer, j4);
        i.m(byteBuffer, this.f70042g);
        i.f(byteBuffer, (this.f70043h << 12) + this.f70044i);
        i.m(byteBuffer, (this.f70045j << 2) + this.f70046k);
        i.m(byteBuffer, (this.f70047l << 2) + this.f70048m);
        i.m(byteBuffer, (this.f70049n << 3) + this.f70050o);
        i.m(byteBuffer, (this.f70051p << 3) + this.f70052q);
        i.f(byteBuffer, this.f70053r);
        i.m(byteBuffer, (this.f70054s << 6) + (this.f70055t << 3) + (this.f70056u ? 4 : 0) + this.f70057v);
        i.m(byteBuffer, this.f70058w.size());
        for (a aVar : this.f70058w) {
            i.m(byteBuffer, (aVar.f70062a ? 128 : 0) + (aVar.f70063b ? 64 : 0) + aVar.f70064c);
            i.f(byteBuffer, aVar.f70065d.size());
            for (byte[] bArr : aVar.f70065d) {
                i.f(byteBuffer, bArr.length);
                byteBuffer.put(bArr);
            }
        }
    }

    public List<a> a() {
        return this.f70058w;
    }

    public int b() {
        return this.f70053r;
    }

    public int c() {
        return this.f70052q;
    }

    public int d() {
        return this.f70050o;
    }

    public int e() {
        return this.f70048m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f70053r != bVar.f70053r || this.f70052q != bVar.f70052q || this.f70050o != bVar.f70050o || this.f70048m != bVar.f70048m || this.f70036a != bVar.f70036a || this.f70054s != bVar.f70054s || this.f70041f != bVar.f70041f || this.f70042g != bVar.f70042g || this.f70040e != bVar.f70040e || this.f70039d != bVar.f70039d || this.f70037b != bVar.f70037b || this.f70038c != bVar.f70038c || this.f70057v != bVar.f70057v || this.f70044i != bVar.f70044i || this.f70055t != bVar.f70055t || this.f70046k != bVar.f70046k || this.f70043h != bVar.f70043h || this.f70045j != bVar.f70045j || this.f70047l != bVar.f70047l || this.f70049n != bVar.f70049n || this.f70051p != bVar.f70051p || this.f70056u != bVar.f70056u) {
            return false;
        }
        List<a> list = this.f70058w;
        List<a> list2 = bVar.f70058w;
        return list == null ? list2 == null : list.equals(list2);
    }

    public int f() {
        return this.f70036a;
    }

    public int g() {
        return this.f70054s;
    }

    public long h() {
        return this.f70041f;
    }

    public int hashCode() {
        int i4 = ((((((this.f70036a * 31) + this.f70037b) * 31) + (this.f70038c ? 1 : 0)) * 31) + this.f70039d) * 31;
        long j4 = this.f70040e;
        int i5 = (i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f70041f;
        int i6 = (((((((((((((((((((((((((((((((((i5 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f70042g) * 31) + this.f70043h) * 31) + this.f70044i) * 31) + this.f70045j) * 31) + this.f70046k) * 31) + this.f70047l) * 31) + this.f70048m) * 31) + this.f70049n) * 31) + this.f70050o) * 31) + this.f70051p) * 31) + this.f70052q) * 31) + this.f70053r) * 31) + this.f70054s) * 31) + this.f70055t) * 31) + (this.f70056u ? 1 : 0)) * 31) + this.f70057v) * 31;
        List<a> list = this.f70058w;
        return i6 + (list != null ? list.hashCode() : 0);
    }

    public int i() {
        return this.f70042g;
    }

    public long j() {
        return this.f70040e;
    }

    public int k() {
        return this.f70039d;
    }

    public int l() {
        return this.f70037b;
    }

    public int m() {
        return this.f70057v;
    }

    public int n() {
        return this.f70044i;
    }

    public int o() {
        return this.f70055t;
    }

    public int p() {
        return this.f70046k;
    }

    public int q() {
        Iterator<a> it = this.f70058w.iterator();
        int i4 = 23;
        while (it.hasNext()) {
            i4 += 3;
            Iterator<byte[]> it2 = it.next().f70065d.iterator();
            while (it2.hasNext()) {
                i4 = i4 + 2 + it2.next().length;
            }
        }
        return i4;
    }

    public boolean r() {
        return this.f70059x;
    }

    public boolean s() {
        return this.f70038c;
    }

    public boolean t() {
        return this.f70061z;
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᥱ\u0001"));
        sb.append(this.f70036a);
        sb.append(ProtectedSandApp.s("ᥲ\u0001"));
        sb.append(this.f70037b);
        sb.append(ProtectedSandApp.s("ᥳ\u0001"));
        sb.append(this.f70038c);
        sb.append(ProtectedSandApp.s("ᥴ\u0001"));
        sb.append(this.f70039d);
        sb.append(ProtectedSandApp.s("\u1975\u0001"));
        sb.append(this.f70040e);
        sb.append(ProtectedSandApp.s("\u1976\u0001"));
        sb.append(this.f70041f);
        sb.append(ProtectedSandApp.s("\u1977\u0001"));
        sb.append(this.f70042g);
        String str5 = "";
        if (this.f70043h != 15) {
            str = ProtectedSandApp.s("\u1978\u0001") + this.f70043h;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(ProtectedSandApp.s("\u1979\u0001"));
        sb.append(this.f70044i);
        if (this.f70045j != 63) {
            str2 = ProtectedSandApp.s("\u197a\u0001") + this.f70045j;
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append(ProtectedSandApp.s("\u197b\u0001"));
        sb.append(this.f70046k);
        if (this.f70047l != 63) {
            str3 = ProtectedSandApp.s("\u197c\u0001") + this.f70047l;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(ProtectedSandApp.s("\u197d\u0001"));
        sb.append(this.f70048m);
        if (this.f70049n != 31) {
            str4 = ProtectedSandApp.s("\u197e\u0001") + this.f70049n;
        } else {
            str4 = "";
        }
        sb.append(str4);
        sb.append(ProtectedSandApp.s("\u197f\u0001"));
        sb.append(this.f70050o);
        if (this.f70051p != 31) {
            str5 = ProtectedSandApp.s("ᦀ\u0001") + this.f70051p;
        }
        sb.append(str5);
        sb.append(ProtectedSandApp.s("ᦁ\u0001"));
        sb.append(this.f70052q);
        sb.append(ProtectedSandApp.s("ᦂ\u0001"));
        sb.append(this.f70053r);
        sb.append(ProtectedSandApp.s("ᦃ\u0001"));
        sb.append(this.f70054s);
        sb.append(ProtectedSandApp.s("ᦄ\u0001"));
        sb.append(this.f70055t);
        sb.append(ProtectedSandApp.s("ᦅ\u0001"));
        sb.append(this.f70056u);
        sb.append(ProtectedSandApp.s("ᦆ\u0001"));
        sb.append(this.f70057v);
        sb.append(ProtectedSandApp.s("ᦇ\u0001"));
        return l6.a(sb, this.f70058w, '}');
    }

    public boolean u() {
        return this.f70060y;
    }

    public boolean v() {
        return this.A;
    }

    public boolean w() {
        return this.f70056u;
    }

    public void x(ByteBuffer byteBuffer) {
        this.f70036a = g.p(byteBuffer);
        int p4 = g.p(byteBuffer);
        this.f70037b = (p4 & 192) >> 6;
        this.f70038c = (p4 & 32) > 0;
        this.f70039d = p4 & 31;
        this.f70040e = g.l(byteBuffer);
        long n4 = g.n(byteBuffer);
        this.f70041f = n4;
        this.f70059x = ((n4 >> 44) & 8) > 0;
        this.f70060y = ((n4 >> 44) & 4) > 0;
        this.f70061z = ((n4 >> 44) & 2) > 0;
        this.A = ((n4 >> 44) & 1) > 0;
        this.f70041f = n4 & 140737488355327L;
        this.f70042g = g.p(byteBuffer);
        int i4 = g.i(byteBuffer);
        this.f70043h = (61440 & i4) >> 12;
        this.f70044i = i4 & org.apache.tools.zip.d.f86736x2;
        int p5 = g.p(byteBuffer);
        this.f70045j = (p5 & 252) >> 2;
        this.f70046k = p5 & 3;
        int p6 = g.p(byteBuffer);
        this.f70047l = (p6 & 252) >> 2;
        this.f70048m = p6 & 3;
        int p7 = g.p(byteBuffer);
        this.f70049n = (p7 & 248) >> 3;
        this.f70050o = p7 & 7;
        int p10 = g.p(byteBuffer);
        this.f70051p = (p10 & 248) >> 3;
        this.f70052q = p10 & 7;
        this.f70053r = g.i(byteBuffer);
        int p11 = g.p(byteBuffer);
        this.f70054s = (p11 & 192) >> 6;
        this.f70055t = (p11 & 56) >> 3;
        this.f70056u = (p11 & 4) > 0;
        this.f70057v = p11 & 3;
        int p12 = g.p(byteBuffer);
        this.f70058w = new ArrayList();
        for (int i5 = 0; i5 < p12; i5++) {
            a aVar = new a();
            int p13 = g.p(byteBuffer);
            aVar.f70062a = (p13 & 128) > 0;
            aVar.f70063b = (p13 & 64) > 0;
            aVar.f70064c = p13 & 63;
            int i6 = g.i(byteBuffer);
            aVar.f70065d = new ArrayList();
            for (int i7 = 0; i7 < i6; i7++) {
                byte[] bArr = new byte[g.i(byteBuffer)];
                byteBuffer.get(bArr);
                aVar.f70065d.add(bArr);
            }
            this.f70058w.add(aVar);
        }
    }

    public void y(List<a> list) {
        this.f70058w = list;
    }

    public void z(int i4) {
        this.f70053r = i4;
    }
}
