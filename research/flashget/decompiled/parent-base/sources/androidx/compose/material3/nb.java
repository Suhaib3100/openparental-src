package androidx.compose.material3;

import androidx.compose.foundation.layout.g3;
import kotlin.Metadata;

/* compiled from: AppBar.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@f5
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JD\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJD\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0006JD\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0006JD\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0006JD\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000eJ)\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJM\u0010#\u001a\u00020\u001b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010!H\u0007¢\u0006\u0004\b#\u0010$JM\u0010%\u001a\u00020\u001b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010!H\u0007¢\u0006\u0004\b%\u0010$R\u0018\u0010)\u001a\u00020\u0004*\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010-\u001a\u00020*8G¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0018\u0010/\u001a\u00020\u0004*\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010(R\u0018\u00101\u001a\u00020\u0004*\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u0010(R\u0018\u00103\u001a\u00020\u0004*\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Landroidx/compose/material3/nb;", "", "<init>", "()V", "Landroidx/compose/material3/mb;", "p", "(Landroidx/compose/runtime/t;I)Landroidx/compose/material3/mb;", "Landroidx/compose/ui/graphics/d2;", "containerColor", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "q", "(JJJJJLandroidx/compose/runtime/t;II)Landroidx/compose/material3/mb;", "o", "a", "b", "l", "m", "j", "k", "Landroidx/compose/material3/pb;", "state", "Lkotlin/Function0;", "", "canScroll", "Landroidx/compose/material3/ob;", "n", "(Landroidx/compose/material3/pb;Lld/a;Landroidx/compose/runtime/t;II)Landroidx/compose/material3/ob;", "Landroidx/compose/animation/core/k;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/z;", "flingAnimationSpec", "c", "(Landroidx/compose/material3/pb;Lld/a;Landroidx/compose/animation/core/k;Landroidx/compose/animation/core/z;Landroidx/compose/runtime/t;II)Landroidx/compose/material3/ob;", "d", "Landroidx/compose/material3/a3;", "h", "(Landroidx/compose/material3/a3;)Landroidx/compose/material3/mb;", "defaultTopAppBarColors", "Landroidx/compose/foundation/layout/n2;", "i", "(Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/layout/n2;", "windowInsets", "e", "defaultCenterAlignedTopAppBarColors", "g", "defaultMediumTopAppBarColors", "f", "defaultLargeTopAppBarColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class nb {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final nb f12894a = new nb();

    /* renamed from: b, reason: collision with root package name */
    public static final int f12895b = 0;

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f12896b = new a(0);

        a() {
            super(0);
        }

        @fg.l
        public final Boolean a() {
            return Boolean.TRUE;
        }

        @Override // ld.a
        public Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f12897b = new b(0);

        b() {
            super(0);
        }

        @fg.l
        public final Boolean a() {
            return Boolean.TRUE;
        }

        @Override // ld.a
        public Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f12898b = new c(0);

        c() {
            super(0);
        }

        @fg.l
        public final Boolean a() {
            return Boolean.TRUE;
        }

        @Override // ld.a
        public Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    private nb() {
    }

    @fg.l
    @androidx.compose.runtime.i
    public final mb a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(513940029);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(513940029, i4, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:798)");
        }
        mb e4 = e(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final mb b(long j4, long j5, long j6, long j7, long j10, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        tVar.P(1896017784);
        if ((i5 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j11 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j11 = j4;
        }
        if ((i5 & 2) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j12 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j12 = j5;
        }
        if ((i5 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j13 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j13 = j6;
        }
        if ((i5 & 8) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j14 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j14 = j7;
        }
        if ((i5 & 16) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j15 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j15 = j10;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1896017784, i4, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:818)");
        }
        mb b5 = e(p6.f13227a.a(tVar, 6)).b(j11, j12, j13, j14, j15);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return b5;
    }

    @fg.l
    @f5
    @androidx.compose.runtime.i
    public final ob c(@fg.m pb pbVar, @fg.m ld.a<Boolean> aVar, @fg.m androidx.compose.animation.core.k<Float> kVar, @fg.m androidx.compose.animation.core.z<Float> zVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(959086674);
        if ((i5 & 1) != 0) {
            pbVar = p.A(0.0f, 0.0f, 0.0f, tVar, 0, 7);
        }
        if ((i5 & 2) != 0) {
            aVar = a.f12896b;
        }
        if ((i5 & 4) != 0) {
            kVar = androidx.compose.animation.core.l.p(0.0f, 400.0f, null, 5, null);
        }
        if ((i5 & 8) != 0) {
            zVar = androidx.compose.animation.c1.b(tVar, 0);
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(959086674, i4, -1, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:994)");
        }
        c5 c5Var = new c5(pbVar, kVar, zVar, aVar);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5Var;
    }

    @fg.l
    @f5
    @androidx.compose.runtime.i
    public final ob d(@fg.m pb pbVar, @fg.m ld.a<Boolean> aVar, @fg.m androidx.compose.animation.core.k<Float> kVar, @fg.m androidx.compose.animation.core.z<Float> zVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-1757023234);
        if ((i5 & 1) != 0) {
            pbVar = p.A(0.0f, 0.0f, 0.0f, tVar, 0, 7);
        }
        if ((i5 & 2) != 0) {
            aVar = b.f12897b;
        }
        if ((i5 & 4) != 0) {
            kVar = androidx.compose.animation.core.l.p(0.0f, 400.0f, null, 5, null);
        }
        if ((i5 & 8) != 0) {
            zVar = androidx.compose.animation.c1.b(tVar, 0);
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1757023234, i4, -1, "androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior (AppBar.kt:1027)");
        }
        e5 e5Var = new e5(pbVar, kVar, zVar, aVar);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e5Var;
    }

    @fg.l
    public final mb e(@fg.l a3 a3Var) {
        mb defaultCenterAlignedTopAppBarColorsCached = a3Var.getDefaultCenterAlignedTopAppBarColorsCached();
        if (defaultCenterAlignedTopAppBarColorsCached == null) {
            c0.n1 n1Var = c0.n1.f37788a;
            defaultCenterAlignedTopAppBarColorsCached = new mb(b3.h(a3Var, n1Var.c()), androidx.compose.ui.graphics.d2.y(b3.h(a3Var, n1Var.c()), a3Var.getSurface()) ? b3.p(a3Var, c0.o1.f37834a.j()) : b3.h(a3Var, n1Var.c()), b3.h(a3Var, n1Var.j()), b3.h(a3Var, n1Var.h()), b3.h(a3Var, n1Var.m()), null);
            a3Var.G0(defaultCenterAlignedTopAppBarColorsCached);
        }
        return defaultCenterAlignedTopAppBarColorsCached;
    }

    @fg.l
    public final mb f(@fg.l a3 a3Var) {
        mb defaultLargeTopAppBarColorsCached = a3Var.getDefaultLargeTopAppBarColorsCached();
        if (defaultLargeTopAppBarColorsCached == null) {
            c0.l1 l1Var = c0.l1.f37676a;
            defaultLargeTopAppBarColorsCached = new mb(b3.h(a3Var, l1Var.a()), androidx.compose.ui.graphics.d2.y(b3.h(a3Var, l1Var.a()), a3Var.getSurface()) ? b3.p(a3Var, c0.o1.f37834a.j()) : b3.h(a3Var, l1Var.a()), b3.h(a3Var, l1Var.h()), b3.h(a3Var, l1Var.f()), b3.h(a3Var, l1Var.j()), null);
            a3Var.S0(defaultLargeTopAppBarColorsCached);
        }
        return defaultLargeTopAppBarColorsCached;
    }

    @fg.l
    public final mb g(@fg.l a3 a3Var) {
        mb defaultMediumTopAppBarColorsCached = a3Var.getDefaultMediumTopAppBarColorsCached();
        if (defaultMediumTopAppBarColorsCached == null) {
            c0.m1 m1Var = c0.m1.f37740a;
            defaultMediumTopAppBarColorsCached = new mb(b3.h(a3Var, m1Var.a()), androidx.compose.ui.graphics.d2.y(b3.h(a3Var, m1Var.a()), a3Var.getSurface()) ? b3.p(a3Var, c0.o1.f37834a.j()) : b3.h(a3Var, m1Var.a()), b3.h(a3Var, m1Var.h()), b3.h(a3Var, m1Var.f()), b3.h(a3Var, m1Var.j()), null);
            a3Var.T0(defaultMediumTopAppBarColorsCached);
        }
        return defaultMediumTopAppBarColorsCached;
    }

    @fg.l
    public final mb h(@fg.l a3 a3Var) {
        mb defaultTopAppBarColorsCached = a3Var.getDefaultTopAppBarColorsCached();
        if (defaultTopAppBarColorsCached == null) {
            c0.o1 o1Var = c0.o1.f37834a;
            defaultTopAppBarColorsCached = new mb(b3.h(a3Var, o1Var.a()), androidx.compose.ui.graphics.d2.y(b3.h(a3Var, o1Var.a()), a3Var.getSurface()) ? b3.p(a3Var, o1Var.j()) : b3.h(a3Var, o1Var.a()), b3.h(a3Var, o1Var.h()), b3.h(a3Var, o1Var.f()), b3.h(a3Var, o1Var.k()), null);
            a3Var.j1(defaultTopAppBarColorsCached);
        }
        return defaultTopAppBarColorsCached;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getWindowInsets")
    public final androidx.compose.foundation.layout.n2 i(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(2143182847);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(2143182847, i4, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:788)");
        }
        androidx.compose.foundation.layout.n2 a5 = ga.a(androidx.compose.foundation.layout.n2.INSTANCE, tVar, 6);
        g3.Companion companion = androidx.compose.foundation.layout.g3.INSTANCE;
        companion.getClass();
        int i5 = androidx.compose.foundation.layout.g3.f5051m;
        companion.getClass();
        androidx.compose.foundation.layout.n2 j4 = androidx.compose.foundation.layout.r2.j(a5, androidx.compose.foundation.layout.g3.f5047i | i5);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return j4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final mb j(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1744932393);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1744932393, i4, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:906)");
        }
        mb f4 = f(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return f4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final mb k(long j4, long j5, long j6, long j7, long j10, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        tVar.P(-1471507700);
        if ((i5 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j11 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j11 = j4;
        }
        if ((i5 & 2) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j12 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j12 = j5;
        }
        if ((i5 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j13 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j13 = j6;
        }
        if ((i5 & 8) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j14 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j14 = j7;
        }
        if ((i5 & 16) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j15 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j15 = j10;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1471507700, i4, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:927)");
        }
        mb b5 = f(p6.f13227a.a(tVar, 6)).b(j11, j12, j13, j14, j15);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return b5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final mb l(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1268886463);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1268886463, i4, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:853)");
        }
        mb g4 = g(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return g4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final mb m(long j4, long j5, long j6, long j7, long j10, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        tVar.P(-582474442);
        if ((i5 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j11 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j11 = j4;
        }
        if ((i5 & 2) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j12 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j12 = j5;
        }
        if ((i5 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j13 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j13 = j6;
        }
        if ((i5 & 8) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j14 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j14 = j7;
        }
        if ((i5 & 16) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j15 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j15 = j10;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-582474442, i4, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:874)");
        }
        mb b5 = g(p6.f13227a.a(tVar, 6)).b(j11, j12, j13, j14, j15);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return b5;
    }

    @fg.l
    @f5
    @androidx.compose.runtime.i
    public final ob n(@fg.m pb pbVar, @fg.m ld.a<Boolean> aVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(286497075);
        if ((i5 & 1) != 0) {
            pbVar = p.A(0.0f, 0.0f, 0.0f, tVar, 0, 7);
        }
        if ((i5 & 2) != 0) {
            aVar = c.f12898b;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(286497075, i4, -1, "androidx.compose.material3.TopAppBarDefaults.pinnedScrollBehavior (AppBar.kt:969)");
        }
        t7 t7Var = new t7(pbVar, aVar);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return t7Var;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.WARNING, message = "Use topAppBarColors instead.", replaceWith = @kotlin.x0(expression = "topAppBarColors(containerColor, scrolledContainerColor, navigationIconContentColor, titleContentColor, actionIconContentColor)", imports = {}))
    @androidx.compose.runtime.i
    public final mb o(long j4, long j5, long j6, long j7, long j10, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-1717201472);
        long k4 = (i5 & 1) != 0 ? b3.k(c0.o1.f37834a.a(), tVar, 6) : j4;
        long a5 = (i5 & 2) != 0 ? b3.a(p6.f13227a.a(tVar, 6), k4, c0.o1.f37834a.j(), tVar, ((i4 << 3) & 112) | 384) : j5;
        long k5 = (i5 & 4) != 0 ? b3.k(c0.o1.f37834a.h(), tVar, 6) : j6;
        long k6 = (i5 & 8) != 0 ? b3.k(c0.o1.f37834a.f(), tVar, 6) : j7;
        long k7 = (i5 & 16) != 0 ? b3.k(c0.o1.f37834a.k(), tVar, 6) : j10;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1717201472, i4, -1, "androidx.compose.material3.TopAppBarDefaults.smallTopAppBarColors (AppBar.kt:775)");
        }
        mb q4 = q(k4, a5, k5, k6, k7, tVar, i4 & 524286, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return q4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final mb p(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1388520854);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1388520854, i4, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:697)");
        }
        mb h4 = h(p6.f13227a.a(tVar, 6));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return h4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final mb q(long j4, long j5, long j6, long j7, long j10, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        tVar.P(2142919275);
        if ((i5 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j11 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j11 = j4;
        }
        if ((i5 & 2) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j12 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j12 = j5;
        }
        if ((i5 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j13 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j13 = j6;
        }
        if ((i5 & 8) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j14 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j14 = j7;
        }
        if ((i5 & 16) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j15 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j15 = j10;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(2142919275, i4, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:717)");
        }
        mb b5 = h(p6.f13227a.a(tVar, 6)).b(j11, j12, j13, j14, j15);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return b5;
    }
}
