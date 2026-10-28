package com.google.zxing.aztec.encoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: State.java */
/* loaded from: classes6.dex */
final class f {

    /* renamed from: e, reason: collision with root package name */
    static final f f62638e = new f(g.f62643b, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final int f62639a;

    /* renamed from: b, reason: collision with root package name */
    private final g f62640b;

    /* renamed from: c, reason: collision with root package name */
    private final int f62641c;

    /* renamed from: d, reason: collision with root package name */
    private final int f62642d;

    private f(g gVar, int i4, int i5, int i6) {
        this.f62640b = gVar;
        this.f62639a = i4;
        this.f62641c = i5;
        this.f62642d = i6;
    }

    private static int b(f fVar) {
        int i4 = fVar.f62641c;
        if (i4 > 62) {
            return 21;
        }
        if (i4 > 31) {
            return 20;
        }
        return i4 > 0 ? 10 : 0;
    }

    f a(int i4) {
        g gVar = this.f62640b;
        int i5 = this.f62639a;
        int i6 = this.f62642d;
        if (i5 == 4 || i5 == 2) {
            int i7 = d.f62631h[i5][0];
            int i10 = 65535 & i7;
            int i11 = i7 >> 16;
            gVar.getClass();
            e eVar = new e(gVar, i10, i11);
            i6 += i11;
            i5 = 0;
            gVar = eVar;
        }
        int i12 = this.f62641c;
        f fVar = new f(gVar, i5, i12 + 1, i6 + ((i12 == 0 || i12 == 31) ? 18 : i12 == 62 ? 9 : 8));
        return fVar.f62641c == 2078 ? fVar.c(i4 + 1) : fVar;
    }

    f c(int i4) {
        int i5 = this.f62641c;
        if (i5 == 0) {
            return this;
        }
        g gVar = this.f62640b;
        gVar.getClass();
        return new f(new b(gVar, i4 - i5, i5), this.f62639a, 0, this.f62642d);
    }

    int d() {
        return this.f62641c;
    }

    int e() {
        return this.f62642d;
    }

    int f() {
        return this.f62639a;
    }

    g g() {
        return this.f62640b;
    }

    boolean h(f fVar) {
        int i4 = this.f62642d + (d.f62631h[this.f62639a][fVar.f62639a] >> 16);
        int i5 = this.f62641c;
        int i6 = fVar.f62641c;
        if (i5 < i6) {
            i4 += b(fVar) - b(this);
        } else if (i5 > i6 && i6 > 0) {
            i4 += 10;
        }
        return i4 <= fVar.f62642d;
    }

    f i(int i4, int i5) {
        int i6 = this.f62642d;
        g gVar = this.f62640b;
        int i7 = this.f62639a;
        if (i4 != i7) {
            int i10 = d.f62631h[i7][i4];
            int i11 = 65535 & i10;
            int i12 = i10 >> 16;
            gVar.getClass();
            i6 += i12;
            gVar = new e(gVar, i11, i12);
        }
        int i13 = i4 == 2 ? 4 : 5;
        gVar.getClass();
        return new f(new e(gVar, i5, i13), i4, 0, i6 + i13);
    }

    f j(int i4, int i5) {
        g gVar = this.f62640b;
        int i6 = this.f62639a;
        int i7 = i6 == 2 ? 4 : 5;
        int i10 = d.f62633j[i6][i4];
        gVar.getClass();
        return new f(new e(new e(gVar, i10, i7), i5, 5), this.f62639a, 0, this.f62642d + i7 + 5);
    }

    com.google.zxing.common.a k(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (g gVar = c(bArr.length).f62640b; gVar != null; gVar = gVar.d()) {
            linkedList.addFirst(gVar);
        }
        com.google.zxing.common.a aVar = new com.google.zxing.common.a();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((g) it.next()).c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format(ProtectedSandApp.s("ु\u0001"), d.f62625b[this.f62639a], Integer.valueOf(this.f62642d), Integer.valueOf(this.f62641c));
    }
}
