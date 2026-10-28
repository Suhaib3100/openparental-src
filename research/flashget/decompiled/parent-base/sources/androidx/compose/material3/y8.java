package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: SheetDefaults.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aB\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001aC\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/z8;", "sheetState", "Landroidx/compose/foundation/gestures/j0;", "orientation", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "velocity", "Lkotlin/k2;", "onFling", "Landroidx/compose/ui/input/nestedscroll/a;", "a", "(Landroidx/compose/material3/z8;Landroidx/compose/foundation/gestures/j0;Lld/l;)Landroidx/compose/ui/input/nestedscroll/a;", "", "skipPartiallyExpanded", "Landroidx/compose/material3/a9;", "confirmValueChange", "initialValue", "skipHiddenState", "c", "(ZLld/l;Landroidx/compose/material3/a9;ZLandroidx/compose/runtime/t;II)Landroidx/compose/material3/z8;", "Landroidx/compose/ui/unit/h;", "F", "DragHandleVerticalPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,503:1\n74#2:504\n1116#3,6:505\n154#4:511\n*S KotlinDebug\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n*L\n483#1:504\n491#1:505,6\n502#1:511\n*E\n"})
/* loaded from: classes.dex */
public final class y8 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f15818a = androidx.compose.ui.unit.h.g(22);

    /* compiled from: SheetDefaults.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0003H\u0003¢\u0006\u0004\b\t\u0010\bJ\"\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"androidx/compose/material3/y8$a", "Landroidx/compose/ui/input/nestedscroll/a;", "", "Li0/f;", "b", "(F)J", "Landroidx/compose/ui/unit/c0;", "c", "(J)F", "a", "available", "Landroidx/compose/ui/input/nestedscroll/f;", "source", "i5", "(JI)J", "consumed", "H2", "(JJI)J", "F5", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "w0", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements androidx.compose.ui.input.nestedscroll.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z8 f15819b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Float, kotlin.k2> f15820c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.j0 f15821d;

        /* JADX WARN: Multi-variable type inference failed */
        a(z8 z8Var, ld.l<? super Float, kotlin.k2> lVar, androidx.compose.foundation.gestures.j0 j0Var) {
            this.f15819b = z8Var;
            this.f15820c = lVar;
            this.f15821d = j0Var;
        }

        @kd.i(name = "offsetToFloat")
        private final float a(long j4) {
            return this.f15821d == androidx.compose.foundation.gestures.j0.Horizontal ? i0.f.p(j4) : i0.f.r(j4);
        }

        private final long b(float f4) {
            androidx.compose.foundation.gestures.j0 j0Var = this.f15821d;
            float f5 = j0Var == androidx.compose.foundation.gestures.j0.Horizontal ? f4 : 0.0f;
            if (j0Var != androidx.compose.foundation.gestures.j0.Vertical) {
                f4 = 0.0f;
            }
            return i0.g.a(f5, f4);
        }

        @kd.i(name = "velocityToFloat")
        private final float c(long j4) {
            return this.f15821d == androidx.compose.foundation.gestures.j0.Horizontal ? androidx.compose.ui.unit.c0.l(j4) : androidx.compose.ui.unit.c0.n(j4);
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        @fg.m
        public Object F5(long j4, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            float c5 = c(j4);
            float r4 = this.f15819b.r();
            float d5 = this.f15819b.e().p().d();
            if (c5 >= 0.0f || r4 <= d5) {
                androidx.compose.ui.unit.c0.INSTANCE.getClass();
                j4 = androidx.compose.ui.unit.c0.f21491c;
            } else {
                this.f15820c.invoke(new Float(c5));
            }
            return androidx.compose.ui.unit.c0.b(j4);
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long H2(long consumed, long available, int source) {
            androidx.compose.ui.input.nestedscroll.f.INSTANCE.getClass();
            if (androidx.compose.ui.input.nestedscroll.f.h(source, androidx.compose.ui.input.nestedscroll.f.f18687c)) {
                return b(this.f15819b.e().o(a(available)));
            }
            i0.f.INSTANCE.getClass();
            return i0.f.f74147c;
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long i5(long available, int source) {
            float a5 = a(available);
            if (a5 < 0.0f) {
                androidx.compose.ui.input.nestedscroll.f.INSTANCE.getClass();
                if (androidx.compose.ui.input.nestedscroll.f.h(source, androidx.compose.ui.input.nestedscroll.f.f18687c)) {
                    return b(this.f15819b.e().o(a5));
                }
            }
            i0.f.INSTANCE.getClass();
            return i0.f.f74147c;
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        @fg.m
        public Object w0(long j4, long j5, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            this.f15820c.invoke(new Float(c(j5)));
            return androidx.compose.ui.unit.c0.b(j5);
        }
    }

    /* compiled from: SheetDefaults.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<a9, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f15822b = new b(1);

        b() {
            super(1);
        }

        @fg.l
        public final Boolean a(@fg.l a9 a9Var) {
            return Boolean.TRUE;
        }

        @Override // ld.l
        public Boolean invoke(a9 a9Var) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: SheetDefaults.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material3/z8;", "a", "()Landroidx/compose/material3/z8;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<z8> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f15823b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.d f15824c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a9 f15825d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<a9, Boolean> f15826e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f15827f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(boolean z4, androidx.compose.ui.unit.d dVar, a9 a9Var, ld.l<? super a9, Boolean> lVar, boolean z5) {
            super(0);
            this.f15823b = z4;
            this.f15824c = dVar;
            this.f15825d = a9Var;
            this.f15826e = lVar;
            this.f15827f = z5;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z8 invoke() {
            return new z8(this.f15823b, this.f15824c, this.f15825d, this.f15826e, this.f15827f);
        }
    }

    @fg.l
    public static final androidx.compose.ui.input.nestedscroll.a a(@fg.l z8 z8Var, @fg.l androidx.compose.foundation.gestures.j0 j0Var, @fg.l ld.l<? super Float, kotlin.k2> lVar) {
        return new a(z8Var, lVar, j0Var);
    }

    @fg.l
    @f5
    @androidx.compose.runtime.i
    public static final z8 c(boolean z4, @fg.m ld.l<? super a9, Boolean> lVar, @fg.m a9 a9Var, boolean z5, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1032784200);
        boolean z6 = (i5 & 1) != 0 ? false : z4;
        ld.l<? super a9, Boolean> lVar2 = (i5 & 2) != 0 ? b.f15822b : lVar;
        a9 a9Var2 = (i5 & 4) != 0 ? a9.Hidden : a9Var;
        boolean z7 = (i5 & 8) != 0 ? false : z5;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1032784200, i4, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:480)");
        }
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) tVar.x(androidx.compose.ui.platform.h1.i());
        Object[] objArr = {Boolean.valueOf(z6), lVar2};
        androidx.compose.runtime.saveable.l<z8, a9> b5 = z8.INSTANCE.b(z6, lVar2, dVar);
        tVar.P(1097108455);
        boolean q02 = ((((i4 & 14) ^ 6) > 4 && tVar.b(z6)) || (i4 & 6) == 4) | tVar.q0(dVar) | ((((i4 & 896) ^ 384) > 256 && tVar.q0(a9Var2)) || (i4 & 384) == 256) | ((((i4 & 112) ^ 48) > 32 && tVar.q0(lVar2)) || (i4 & 48) == 32) | ((((i4 & 7168) ^ 3072) > 2048 && tVar.b(z7)) || (i4 & 3072) == 2048);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new c(z6, dVar, a9Var2, lVar2, z7);
            tVar.E(Q);
        }
        tVar.p0();
        z8 z8Var = (z8) androidx.compose.runtime.saveable.d.d(objArr, b5, null, (ld.a) Q, tVar, 0, 4);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return z8Var;
    }
}
