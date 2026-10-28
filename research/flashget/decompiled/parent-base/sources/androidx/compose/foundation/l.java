package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.layout.i1;
import kotlin.Metadata;

/* compiled from: AndroidOverscroll.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/i2;", "b", "(Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/i2;", "Landroidx/compose/ui/q;", "a", "Landroidx/compose/ui/q;", "StretchOverscrollNonClippingLayer", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,595:1\n74#2:596\n74#2:597\n50#3:598\n49#3:599\n1116#4,6:600\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt\n*L\n66#1:596\n67#1:597\n69#1:598\n69#1:599\n69#1:600,6\n*E\n"})
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.ui.q f4760a;

    /* compiled from: AndroidOverscroll.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,595:1\n92#2:596\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$1\n*L\n569#1:596\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.o0, androidx.compose.ui.layout.l0, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f4761b = new a(3);

        /* compiled from: AndroidOverscroll.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.l$a$a, reason: collision with other inner class name */
        static final class C0087a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f4762b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f4763c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0087a(androidx.compose.ui.layout.i1 i1Var, int i4) {
                super(1);
                this.f4762b = i1Var;
                this.f4763c = i4;
            }

            public final void a(@fg.l i1.a aVar) {
                androidx.compose.ui.layout.i1 i1Var = this.f4762b;
                i1.a.u(aVar, i1Var, ((-this.f4763c) / 2) - ((i1Var.getWidth() - this.f4762b.W()) / 2), ((-this.f4763c) / 2) - ((this.f4762b.getHeight() - this.f4762b.v()) / 2), 0.0f, null, 12, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        a() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 R(androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.l0 l0Var, androidx.compose.ui.unit.b bVar) {
            return a(o0Var, l0Var, bVar.getValue());
        }

        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
            androidx.compose.ui.layout.i1 m02 = l0Var.m0(j4);
            int q22 = o0Var.q2(androidx.compose.ui.unit.h.g(m0.b() * 2));
            int W = m02.W() - q22;
            int i4 = W < 0 ? 0 : W;
            int v4 = m02.v() - q22;
            return androidx.compose.ui.layout.o0.x2(o0Var, i4, v4 < 0 ? 0 : v4, null, new C0087a(m02, q22), 4, null);
        }
    }

    /* compiled from: AndroidOverscroll.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,595:1\n92#2:596\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$2\n*L\n585#1:596\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.o0, androidx.compose.ui.layout.l0, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f4764b = new b(3);

        /* compiled from: AndroidOverscroll.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f4765b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f4766c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.layout.i1 i1Var, int i4) {
                super(1);
                this.f4765b = i1Var;
                this.f4766c = i4;
            }

            public final void a(@fg.l i1.a aVar) {
                androidx.compose.ui.layout.i1 i1Var = this.f4765b;
                int i4 = this.f4766c;
                i1.a.g(aVar, i1Var, i4 / 2, i4 / 2, 0.0f, 4, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        b() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 R(androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.l0 l0Var, androidx.compose.ui.unit.b bVar) {
            return a(o0Var, l0Var, bVar.getValue());
        }

        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
            androidx.compose.ui.layout.i1 m02 = l0Var.m0(j4);
            int q22 = o0Var.q2(androidx.compose.ui.unit.h.g(m0.b() * 2));
            return androidx.compose.ui.layout.o0.x2(o0Var, m02.getWidth() + q22, m02.getHeight() + q22, null, new a(m02, q22), 4, null);
        }
    }

    static {
        f4760a = Build.VERSION.SDK_INT >= 31 ? androidx.compose.ui.layout.d0.a(androidx.compose.ui.layout.d0.a(androidx.compose.ui.q.INSTANCE, a.f4761b), b.f4764b) : androidx.compose.ui.q.INSTANCE;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final i2 b(@fg.m androidx.compose.runtime.t tVar, int i4) {
        i2 i2Var;
        tVar.P(-1476348564);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1476348564, i4, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:64)");
        }
        Context context = (Context) tVar.x(androidx.compose.ui.platform.o0.g());
        g2 g2Var = (g2) tVar.x(h2.a());
        if (g2Var != null) {
            tVar.P(511388516);
            boolean q02 = tVar.q0(context) | tVar.q0(g2Var);
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new d(context, g2Var);
                tVar.E(Q);
            }
            tVar.p0();
            i2Var = (i2) Q;
        } else {
            i2Var = e2.f3652a;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return i2Var;
    }
}
