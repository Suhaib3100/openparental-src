package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.e;

/* compiled from: Optimizer.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2620a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f2621b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2622c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f2623d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f2624e = 8;

    /* renamed from: f, reason: collision with root package name */
    public static final int f2625f = 16;

    /* renamed from: g, reason: collision with root package name */
    public static final int f2626g = 32;

    /* renamed from: h, reason: collision with root package name */
    public static final int f2627h = 64;

    /* renamed from: i, reason: collision with root package name */
    public static final int f2628i = 128;

    /* renamed from: j, reason: collision with root package name */
    public static final int f2629j = 256;

    /* renamed from: k, reason: collision with root package name */
    public static final int f2630k = 512;

    /* renamed from: l, reason: collision with root package name */
    public static final int f2631l = 1024;

    /* renamed from: m, reason: collision with root package name */
    public static final int f2632m = 257;

    /* renamed from: n, reason: collision with root package name */
    static boolean[] f2633n = new boolean[3];

    /* renamed from: o, reason: collision with root package name */
    static final int f2634o = 0;

    /* renamed from: p, reason: collision with root package name */
    static final int f2635p = 1;

    /* renamed from: q, reason: collision with root package name */
    static final int f2636q = 2;

    static void a(f fVar, androidx.constraintlayout.solver.g gVar, e eVar) {
        eVar.f2536n = -1;
        eVar.f2538o = -1;
        e.b bVar = fVar.U[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.U[0] == e.b.MATCH_PARENT) {
            int i5 = eVar.J.f2492g;
            int j02 = fVar.j0() - eVar.L.f2492g;
            d dVar = eVar.J;
            dVar.f2494i = gVar.u(dVar);
            d dVar2 = eVar.L;
            dVar2.f2494i = gVar.u(dVar2);
            gVar.f(eVar.J.f2494i, i5);
            gVar.f(eVar.L.f2494i, j02);
            eVar.f2536n = 2;
            eVar.h1(i5, j02);
        }
        if (fVar.U[1] == bVar2 || eVar.U[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i6 = eVar.K.f2492g;
        int D = fVar.D() - eVar.M.f2492g;
        d dVar3 = eVar.K;
        dVar3.f2494i = gVar.u(dVar3);
        d dVar4 = eVar.M;
        dVar4.f2494i = gVar.u(dVar4);
        gVar.f(eVar.K.f2494i, i6);
        gVar.f(eVar.M.f2494i, D);
        if (eVar.f2523g0 > 0 || eVar.i0() == 8) {
            d dVar5 = eVar.N;
            dVar5.f2494i = gVar.u(dVar5);
            gVar.f(eVar.N.f2494i, eVar.f2523g0 + i6);
        }
        eVar.f2538o = 2;
        eVar.C1(i6, D);
    }

    public static final boolean b(int i5, int i6) {
        return (i5 & i6) == i6;
    }
}
