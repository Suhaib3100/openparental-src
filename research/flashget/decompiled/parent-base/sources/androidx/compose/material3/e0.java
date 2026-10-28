package androidx.compose.material3;

import androidx.compose.foundation.layout.g3;
import kotlin.Metadata;

/* compiled from: AppBar.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u001d8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001eR\u0011\u0010#\u001a\u00020 8G¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0017\u0010$\u001a\u00020\u001d8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/material3/e0;", "", "<init>", "()V", "Landroidx/compose/material3/g0;", "state", "Lkotlin/Function0;", "", "canScroll", "Landroidx/compose/animation/core/k;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/z;", "flingAnimationSpec", "Landroidx/compose/material3/f0;", "a", "(Landroidx/compose/material3/g0;Lld/a;Landroidx/compose/animation/core/k;Landroidx/compose/animation/core/z;Landroidx/compose/runtime/t;II)Landroidx/compose/material3/f0;", "Landroidx/compose/ui/unit/h;", "b", "F", "d", "()F", "ContainerElevation", "Landroidx/compose/foundation/layout/l1;", "c", "Landroidx/compose/foundation/layout/l1;", "e", "()Landroidx/compose/foundation/layout/l1;", "ContentPadding", "Landroidx/compose/ui/graphics/d2;", "(Landroidx/compose/runtime/t;I)J", "containerColor", "Landroidx/compose/foundation/layout/n2;", "f", "(Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/layout/n2;", "windowInsets", "bottomAppBarFabColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final e0 f10600a = new e0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerElevation = c0.c.f37060a.b();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 ContentPadding;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10603d = 0;

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f10604b = new a(0);

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

    static {
        float f4;
        float f5;
        f4 = p.f12961a;
        float x4 = p.x();
        f5 = p.f12961a;
        ContentPadding = androidx.compose.foundation.layout.j1.e(f4, x4, f5, 0.0f, 8, null);
    }

    private e0() {
    }

    @fg.l
    @f5
    @androidx.compose.runtime.i
    public final f0 a(@fg.m g0 g0Var, @fg.m ld.a<Boolean> aVar, @fg.m androidx.compose.animation.core.k<Float> kVar, @fg.m androidx.compose.animation.core.z<Float> zVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(457144034);
        if ((i5 & 1) != 0) {
            g0Var = p.z(0.0f, 0.0f, 0.0f, tVar, 0, 7);
        }
        if ((i5 & 2) != 0) {
            aVar = a.f10604b;
        }
        if ((i5 & 4) != 0) {
            kVar = androidx.compose.animation.core.l.p(0.0f, 400.0f, null, 5, null);
        }
        if ((i5 & 8) != 0) {
            zVar = androidx.compose.animation.c1.b(tVar, 0);
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(457144034, i4, -1, "androidx.compose.material3.BottomAppBarDefaults.exitAlwaysScrollBehavior (AppBar.kt:1348)");
        }
        d5 d5Var = new d5(g0Var, kVar, zVar, aVar);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return d5Var;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getBottomAppBarFabColor")
    public final long b(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1464561486);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1464561486, i4, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-bottomAppBarFabColor> (AppBar.kt:1323)");
        }
        long k4 = b3.k(c0.t.f38127a.a(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getContainerColor")
    public final long c(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-368340078);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-368340078, i4, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-containerColor> (AppBar.kt:1295)");
        }
        long k4 = b3.k(c0.c.f37060a.a(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    public final float d() {
        return ContainerElevation;
    }

    @fg.l
    public final androidx.compose.foundation.layout.l1 e() {
        return ContentPadding;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getWindowInsets")
    public final androidx.compose.foundation.layout.n2 f(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(688896409);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(688896409, i4, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-windowInsets> (AppBar.kt:1315)");
        }
        androidx.compose.foundation.layout.n2 a5 = ga.a(androidx.compose.foundation.layout.n2.INSTANCE, tVar, 6);
        g3.Companion companion = androidx.compose.foundation.layout.g3.INSTANCE;
        companion.getClass();
        int i5 = androidx.compose.foundation.layout.g3.f5051m;
        companion.getClass();
        androidx.compose.foundation.layout.n2 j4 = androidx.compose.foundation.layout.r2.j(a5, androidx.compose.foundation.layout.g3.f5048j | i5);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return j4;
    }
}
