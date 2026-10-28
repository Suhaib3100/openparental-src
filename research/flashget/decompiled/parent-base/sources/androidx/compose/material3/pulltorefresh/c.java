package androidx.compose.material3.pulltorefresh;

import androidx.compose.foundation.layout.c2;
import androidx.compose.foundation.shape.p;
import androidx.compose.material3.f5;
import androidx.compose.material3.p6;
import androidx.compose.material3.v7;
import androidx.compose.runtime.g0;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.i;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.n;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v3;
import androidx.compose.runtime.x;
import androidx.compose.ui.graphics.e6;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.m0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.unit.h;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import ld.q;

/* compiled from: PullToRefresh.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/pulltorefresh/c;", "", "<init>", "()V", "Landroidx/compose/material3/pulltorefresh/e;", "state", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/graphics/d2;", "color", "Lkotlin/k2;", "a", "(Landroidx/compose/material3/pulltorefresh/e;Landroidx/compose/ui/q;JLandroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/graphics/e6;", "b", "Landroidx/compose/ui/graphics/e6;", "e", "()Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/ui/unit/h;", "c", "F", "d", "()F", "PositionalThreshold", "(Landroidx/compose/runtime/t;I)J", "containerColor", "contentColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 1)
@f5
@r1({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,558:1\n74#2:559\n154#3:560\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshDefaults\n*L\n166#1:559\n157#1:560\n*E\n"})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final c f13498a = new c();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private static final e6 shape = p.k();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float PositionalThreshold = h.g(80);

    /* renamed from: d, reason: collision with root package name */
    public static final int f13501d = 0;

    /* compiled from: PullToRefresh.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "refreshing", "Lkotlin/k2;", "a", "(ZLandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshDefaults$Indicator$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,558:1\n69#2,5:559\n74#2:592\n78#2:603\n78#3,11:564\n91#3:602\n456#4,8:575\n464#4,3:589\n467#4,3:599\n3737#5,6:583\n1116#6,6:593\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshDefaults$Indicator$1\n*L\n172#1:559,5\n172#1:592\n172#1:603\n172#1:564,11\n172#1:602\n172#1:575,8\n172#1:589,3\n172#1:599,3\n172#1:583,6\n184#1:593,6\n*E\n"})
    static final class a extends n0 implements q<Boolean, t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13502b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f13503c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f13504d;

        /* compiled from: PullToRefresh.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.pulltorefresh.c$a$a, reason: collision with other inner class name */
        static final class C0286a extends n0 implements ld.a<Float> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f13505b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0286a(e eVar) {
                super(0);
                this.f13505b = eVar;
            }

            @Override // ld.a
            @l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(this.f13505b.f());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.q qVar, long j4, e eVar) {
            super(3);
            this.f13502b = qVar;
            this.f13503c = j4;
            this.f13504d = eVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ k2 R(Boolean bool, t tVar, Integer num) {
            a(bool.booleanValue(), tVar, num.intValue());
            return k2.f75408a;
        }

        @n(applier = "androidx.compose.ui.UiComposable")
        @i
        public final void a(boolean z4, @m t tVar, int i4) {
            if ((i4 & 6) == 0) {
                i4 |= tVar.b(z4) ? 4 : 2;
            }
            if ((i4 & 19) == 18 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (x.b0()) {
                x.r0(-1378661396, i4, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous> (PullToRefresh.kt:171)");
            }
            androidx.compose.ui.q f4 = c2.f(this.f13502b, 0.0f, 1, null);
            androidx.compose.ui.c i5 = androidx.compose.ui.c.INSTANCE.i();
            long j4 = this.f13503c;
            e eVar = this.f13504d;
            tVar.P(733328855);
            m0 i6 = androidx.compose.foundation.layout.m.i(i5, false, tVar, 6);
            tVar.P(-1323940314);
            int j5 = androidx.compose.runtime.p.j(tVar, 0);
            g0 B = tVar.B();
            g.Companion companion = g.INSTANCE;
            ld.a<g> a5 = companion.a();
            q<v3<g>, t, Integer, k2> g4 = a0.g(f4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a5);
            } else {
                tVar.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion, tVar, i6, tVar, B);
            if (tVar.getInserting() || !l0.g(tVar.Q(), Integer.valueOf(j5))) {
                androidx.compose.animation.d.a(j5, tVar, j5, a6);
            }
            androidx.compose.animation.e.a(0, g4, v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.p pVar = androidx.compose.foundation.layout.p.f5235a;
            if (z4) {
                tVar.P(-1849687637);
                v7.c(c2.w(androidx.compose.ui.q.INSTANCE, d.q()), j4, d.f13514c, 0L, 0, tVar, 390, 24);
                tVar.p0();
            } else {
                tVar.P(-1849687390);
                tVar.P(-1849687301);
                boolean q02 = tVar.q0(eVar);
                Object Q = tVar.Q();
                if (q02 || Q == t.INSTANCE.a()) {
                    Q = new C0286a(eVar);
                    tVar.E(Q);
                }
                tVar.p0();
                d.b((ld.a) Q, j4, tVar, 0);
                tVar.p0();
            }
            if (androidx.compose.material3.t.a(tVar)) {
                x.q0();
            }
        }
    }

    /* compiled from: PullToRefresh.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends n0 implements ld.p<t, Integer, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f13507c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13508d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f13509e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f13510f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f13511g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e eVar, androidx.compose.ui.q qVar, long j4, int i4, int i5) {
            super(2);
            this.f13507c = eVar;
            this.f13508d = qVar;
            this.f13509e = j4;
            this.f13510f = i4;
            this.f13511g = i5;
        }

        public final void a(@m t tVar, int i4) {
            c.this.a(this.f13507c, this.f13508d, this.f13509e, tVar, g3.b(this.f13510f | 1), this.f13511g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    private c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0058  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@fg.l androidx.compose.material3.pulltorefresh.e r18, @fg.m androidx.compose.ui.q r19, long r20, @fg.m androidx.compose.runtime.t r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.c.a(androidx.compose.material3.pulltorefresh.e, androidx.compose.ui.q, long, androidx.compose.runtime.t, int, int):void");
    }

    @i
    @kd.i(name = "getContainerColor")
    public final long b(@m t tVar, int i4) {
        tVar.P(1066257972);
        if (x.b0()) {
            x.r0(1066257972, i4, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-containerColor> (PullToRefresh.kt:150)");
        }
        long surfaceContainerHigh = p6.f13227a.a(tVar, 6).getSurfaceContainerHigh();
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return surfaceContainerHigh;
    }

    @i
    @kd.i(name = "getContentColor")
    public final long c(@m t tVar, int i4) {
        tVar.P(813427380);
        if (x.b0()) {
            x.r0(813427380, i4, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-contentColor> (PullToRefresh.kt:153)");
        }
        long onSurfaceVariant = p6.f13227a.a(tVar, 6).getOnSurfaceVariant();
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return onSurfaceVariant;
    }

    public final float d() {
        return PositionalThreshold;
    }

    @l
    public final e6 e() {
        return shape;
    }
}
