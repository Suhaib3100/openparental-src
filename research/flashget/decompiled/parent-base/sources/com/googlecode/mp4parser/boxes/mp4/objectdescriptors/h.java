package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: ESDescriptor.java */
@g(tags = {3})
/* loaded from: classes6.dex */
public class h extends b {

    /* renamed from: r, reason: collision with root package name */
    private static Logger f63980r = Logger.getLogger(h.class.getName());

    /* renamed from: e, reason: collision with root package name */
    int f63981e;

    /* renamed from: f, reason: collision with root package name */
    int f63982f;

    /* renamed from: g, reason: collision with root package name */
    int f63983g;

    /* renamed from: h, reason: collision with root package name */
    int f63984h;

    /* renamed from: i, reason: collision with root package name */
    int f63985i;

    /* renamed from: k, reason: collision with root package name */
    String f63987k;

    /* renamed from: l, reason: collision with root package name */
    int f63988l;

    /* renamed from: m, reason: collision with root package name */
    int f63989m;

    /* renamed from: n, reason: collision with root package name */
    int f63990n;

    /* renamed from: o, reason: collision with root package name */
    e f63991o;

    /* renamed from: p, reason: collision with root package name */
    o f63992p;

    /* renamed from: j, reason: collision with root package name */
    int f63986j = 0;

    /* renamed from: q, reason: collision with root package name */
    List<b> f63993q = new ArrayList();

    public h() {
        this.f63958a = 3;
    }

    public void A(int i4) {
        this.f63982f = i4;
    }

    public void B(int i4) {
        this.f63985i = i4;
    }

    public void C(int i4) {
        this.f63983g = i4;
    }

    public void D(int i4) {
        this.f63986j = i4;
    }

    public void E(String str) {
        this.f63987k = str;
    }

    public void F(int i4) {
        this.f63990n = i4;
    }

    public void G(int i4) {
        this.f63984h = i4;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    int a() {
        int i4 = this.f63982f > 0 ? 5 : 3;
        if (this.f63983g > 0) {
            i4 += this.f63986j + 1;
        }
        if (this.f63984h > 0) {
            i4 += 2;
        }
        int b5 = this.f63992p.b() + this.f63991o.b() + i4;
        if (this.f63993q.size() <= 0) {
            return b5;
        }
        throw new RuntimeException(ProtectedSandApp.s("ጺ\u0001"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f63983g != hVar.f63983g || this.f63986j != hVar.f63986j || this.f63989m != hVar.f63989m || this.f63981e != hVar.f63981e || this.f63990n != hVar.f63990n || this.f63984h != hVar.f63984h || this.f63988l != hVar.f63988l || this.f63982f != hVar.f63982f || this.f63985i != hVar.f63985i) {
            return false;
        }
        String str = this.f63987k;
        if (str == null ? hVar.f63987k != null : !str.equals(hVar.f63987k)) {
            return false;
        }
        e eVar = this.f63991o;
        if (eVar == null ? hVar.f63991o != null : !eVar.equals(hVar.f63991o)) {
            return false;
        }
        List<b> list = this.f63993q;
        if (list == null ? hVar.f63993q != null : !list.equals(hVar.f63993q)) {
            return false;
        }
        o oVar = this.f63992p;
        o oVar2 = hVar.f63992p;
        return oVar == null ? oVar2 == null : oVar.equals(oVar2);
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public void f(ByteBuffer byteBuffer) throws IOException {
        this.f63981e = com.coremedia.iso.g.i(byteBuffer);
        int p4 = com.coremedia.iso.g.p(byteBuffer);
        int i4 = p4 >>> 7;
        this.f63982f = i4;
        this.f63983g = (p4 >>> 6) & 1;
        this.f63984h = (p4 >>> 5) & 1;
        this.f63985i = p4 & 31;
        if (i4 == 1) {
            this.f63989m = com.coremedia.iso.g.i(byteBuffer);
        }
        if (this.f63983g == 1) {
            int p5 = com.coremedia.iso.g.p(byteBuffer);
            this.f63986j = p5;
            this.f63987k = com.coremedia.iso.g.h(byteBuffer, p5);
        }
        if (this.f63984h == 1) {
            this.f63990n = com.coremedia.iso.g.i(byteBuffer);
        }
        while (byteBuffer.remaining() > 1) {
            b a5 = m.a(-1, byteBuffer);
            if (a5 instanceof e) {
                this.f63991o = (e) a5;
            } else if (a5 instanceof o) {
                this.f63992p = (o) a5;
            } else {
                this.f63993q.add(a5);
            }
        }
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public ByteBuffer g() {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[b()]);
        com.coremedia.iso.i.m(wrap, 3);
        h(wrap, a());
        com.coremedia.iso.i.f(wrap, this.f63981e);
        com.coremedia.iso.i.m(wrap, (this.f63982f << 7) | (this.f63983g << 6) | (this.f63984h << 5) | (this.f63985i & 31));
        if (this.f63982f > 0) {
            com.coremedia.iso.i.f(wrap, this.f63989m);
        }
        if (this.f63983g > 0) {
            com.coremedia.iso.i.m(wrap, this.f63986j);
            com.coremedia.iso.i.n(wrap, this.f63987k);
        }
        if (this.f63984h > 0) {
            com.coremedia.iso.i.f(wrap, this.f63990n);
        }
        ByteBuffer g4 = this.f63991o.g();
        ByteBuffer g5 = this.f63992p.g();
        wrap.put(g4.array());
        wrap.put(g5.array());
        return wrap;
    }

    public int hashCode() {
        int i4 = ((((((((((this.f63981e * 31) + this.f63982f) * 31) + this.f63983g) * 31) + this.f63984h) * 31) + this.f63985i) * 31) + this.f63986j) * 31;
        String str = this.f63987k;
        int hashCode = (((((((i4 + (str != null ? str.hashCode() : 0)) * 31) + this.f63988l) * 31) + this.f63989m) * 31) + this.f63990n) * 31;
        e eVar = this.f63991o;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        o oVar = this.f63992p;
        int hashCode3 = (hashCode2 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        List<b> list = this.f63993q;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public e i() {
        return this.f63991o;
    }

    public int j() {
        return this.f63989m;
    }

    public int k() {
        return this.f63981e;
    }

    public List<b> l() {
        return this.f63993q;
    }

    public int m() {
        return this.f63988l;
    }

    public o n() {
        return this.f63992p;
    }

    public int o() {
        return this.f63982f;
    }

    public int p() {
        return this.f63985i;
    }

    public int q() {
        return this.f63983g;
    }

    public int r() {
        return this.f63986j;
    }

    public String s() {
        return this.f63987k;
    }

    public int t() {
        return this.f63990n;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public String toString() {
        return ProtectedSandApp.s("ጻ\u0001") + this.f63981e + ProtectedSandApp.s("ጼ\u0001") + this.f63982f + ProtectedSandApp.s("ጽ\u0001") + this.f63983g + ProtectedSandApp.s("ጾ\u0001") + this.f63984h + ProtectedSandApp.s("ጿ\u0001") + this.f63985i + ProtectedSandApp.s("ፀ\u0001") + this.f63986j + ProtectedSandApp.s("ፁ\u0001") + this.f63987k + ProtectedSandApp.s("ፂ\u0001") + this.f63988l + ProtectedSandApp.s("ፃ\u0001") + this.f63989m + ProtectedSandApp.s("ፄ\u0001") + this.f63990n + ProtectedSandApp.s("ፅ\u0001") + this.f63991o + ProtectedSandApp.s("ፆ\u0001") + this.f63992p + '}';
    }

    public int u() {
        return this.f63984h;
    }

    public void v(e eVar) {
        this.f63991o = eVar;
    }

    public void w(int i4) {
        this.f63989m = i4;
    }

    public void x(int i4) {
        this.f63981e = i4;
    }

    public void y(int i4) {
        this.f63988l = i4;
    }

    public void z(o oVar) {
        this.f63992p = oVar;
    }
}
