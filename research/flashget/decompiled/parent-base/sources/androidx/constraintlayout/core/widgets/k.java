package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.e;

/* compiled from: Optimizer.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f23042a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f23043b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f23044c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f23045d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f23046e = 8;

    /* renamed from: f, reason: collision with root package name */
    public static final int f23047f = 16;

    /* renamed from: g, reason: collision with root package name */
    public static final int f23048g = 32;

    /* renamed from: h, reason: collision with root package name */
    public static final int f23049h = 64;

    /* renamed from: i, reason: collision with root package name */
    public static final int f23050i = 128;

    /* renamed from: j, reason: collision with root package name */
    public static final int f23051j = 256;

    /* renamed from: k, reason: collision with root package name */
    public static final int f23052k = 512;

    /* renamed from: l, reason: collision with root package name */
    public static final int f23053l = 1024;

    /* renamed from: m, reason: collision with root package name */
    public static final int f23054m = 257;

    /* renamed from: n, reason: collision with root package name */
    static boolean[] f23055n = new boolean[3];

    /* renamed from: o, reason: collision with root package name */
    static final int f23056o = 0;

    /* renamed from: p, reason: collision with root package name */
    static final int f23057p = 1;

    /* renamed from: q, reason: collision with root package name */
    static final int f23058q = 2;

    static void a(f fVar, androidx.constraintlayout.core.f fVar2, e eVar) {
        eVar.f22971t = -1;
        eVar.f22973u = -1;
        e.b bVar = fVar.f22936b0[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f22936b0[0] == e.b.MATCH_PARENT) {
            int i4 = eVar.Q.f22903g;
            int m02 = fVar.m0() - eVar.S.f22903g;
            d dVar = eVar.Q;
            dVar.f22905i = fVar2.u(dVar);
            d dVar2 = eVar.S;
            dVar2.f22905i = fVar2.u(dVar2);
            fVar2.f(eVar.Q.f22905i, i4);
            fVar2.f(eVar.S.f22905i, m02);
            eVar.f22971t = 2;
            eVar.C1(i4, m02);
        }
        if (fVar.f22936b0[1] == bVar2 || eVar.f22936b0[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i5 = eVar.R.f22903g;
        int D = fVar.D() - eVar.T.f22903g;
        d dVar3 = eVar.R;
        dVar3.f22905i = fVar2.u(dVar3);
        d dVar4 = eVar.T;
        dVar4.f22905i = fVar2.u(dVar4);
        fVar2.f(eVar.R.f22905i, i5);
        fVar2.f(eVar.T.f22905i, D);
        if (eVar.f22960n0 > 0 || eVar.l0() == 8) {
            d dVar5 = eVar.U;
            dVar5.f22905i = fVar2.u(dVar5);
            fVar2.f(eVar.U.f22905i, eVar.f22960n0 + i5);
        }
        eVar.f22973u = 2;
        eVar.X1(i5, D);
    }

    public static final boolean b(int i4, int i5) {
        return (i4 & i5) == i5;
    }
}
