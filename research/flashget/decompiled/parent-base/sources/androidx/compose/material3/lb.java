package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.ui.node.g;
import kotlin.Metadata;

/* compiled from: Tooltip.android.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aq\u0010\u0011\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a@\u0010\u001b\u001a\u00020\u001a*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/p2;", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/material3/o2;", "caretProperties", "Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/ui/graphics/d2;", "contentColor", "containerColor", "Landroidx/compose/ui/unit/h;", "tonalElevation", "shadowElevation", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "a", "(Landroidx/compose/material3/p2;Landroidx/compose/ui/q;Landroidx/compose/material3/o2;Landroidx/compose/ui/graphics/e6;JJFFLld/p;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/draw/g;", "Landroidx/compose/ui/unit/d;", "density", "Landroid/content/res/Configuration;", "configuration", "Landroidx/compose/ui/layout/u;", "anchorLayoutCoordinates", "Landroidx/compose/ui/draw/m;", "c", "(Landroidx/compose/ui/draw/g;Landroidx/compose/ui/unit/d;Landroid/content/res/Configuration;JLandroidx/compose/material3/o2;Landroidx/compose/ui/layout/u;)Landroidx/compose/ui/draw/m;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.android.kt\nandroidx/compose/material3/Tooltip_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,185:1\n154#2:186\n154#2:195\n74#3:187\n74#3:188\n1116#4,6:189\n*S KotlinDebug\n*F\n+ 1 Tooltip.android.kt\nandroidx/compose/material3/Tooltip_androidKt\n*L\n185#1:186\n129#1:195\n71#1:187\n72#1:188\n73#1:189,6\n*E\n"})
/* loaded from: classes.dex */
public final class lb {

    /* compiled from: Tooltip.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.android.kt\nandroidx/compose/material3/Tooltip_androidKt$PlainTooltip$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,185:1\n68#2,6:186\n74#2:220\n78#2:225\n78#3,11:192\n91#3:224\n456#4,8:203\n464#4,3:217\n467#4,3:221\n3737#5,6:211\n*S KotlinDebug\n*F\n+ 1 Tooltip.android.kt\nandroidx/compose/material3/Tooltip_androidKt$PlainTooltip$1\n*L\n91#1:186,6\n91#1:220\n91#1:225\n91#1:192,11\n91#1:224\n91#1:203,8\n91#1:217,3\n91#1:221,3\n91#1:211,6\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f12466b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12467c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(long j4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f12466b = j4;
            this.f12467c = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-705895688, i4, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.android.kt:90)");
            }
            androidx.compose.ui.q j4 = androidx.compose.foundation.layout.j1.j(androidx.compose.foundation.layout.c2.A(androidx.compose.ui.q.INSTANCE, ib.s(), ib.r(), ib.o(), 0.0f, 8, null), ib.n());
            long j5 = this.f12466b;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f12467c;
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
            int j6 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(j4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a6);
            } else {
                tVar.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion, tVar, a5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j6))) {
                androidx.compose.animation.d.a(j6, tVar, j6, a7);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
            androidx.compose.runtime.f0.c(new androidx.compose.runtime.b3[]{p3.a().e(androidx.compose.ui.graphics.d2.n(j5)), xa.f().e(tb.a(p6.f13227a.c(tVar, 6), c0.s0.f38104a.d()))}, pVar, tVar, 0);
            tVar.p0();
            tVar.H();
            tVar.p0();
            tVar.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Tooltip.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p2 f12468b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12469c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ o2 f12470d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f12471e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f12472f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f12473g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f12474h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f12475i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f12476j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f12477k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f12478l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p2 p2Var, androidx.compose.ui.q qVar, o2 o2Var, androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, float f4, float f5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4, int i5) {
            super(2);
            this.f12468b = p2Var;
            this.f12469c = qVar;
            this.f12470d = o2Var;
            this.f12471e = e6Var;
            this.f12472f = j4;
            this.f12473g = j5;
            this.f12474h = f4;
            this.f12475i = f5;
            this.f12476j = pVar;
            this.f12477k = i4;
            this.f12478l = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            lb.a(this.f12468b, this.f12469c, this.f12470d, this.f12471e, this.f12472f, this.f12473g, this.f12474h, this.f12475i, this.f12476j, tVar, androidx.compose.runtime.g3.b(this.f12477k | 1), this.f12478l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Tooltip.android.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/draw/g;", "Landroidx/compose/ui/layout/u;", "anchorLayoutCoordinates", "Landroidx/compose/ui/draw/m;", "a", "(Landroidx/compose/ui/draw/g;Landroidx/compose/ui/layout/u;)Landroidx/compose/ui/draw/m;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.draw.g, androidx.compose.ui.layout.u, androidx.compose.ui.draw.m> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.d f12479b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Configuration f12480c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f12481d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ o2 f12482e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.unit.d dVar, Configuration configuration, long j4, o2 o2Var) {
            super(2);
            this.f12479b = dVar;
            this.f12480c = configuration;
            this.f12481d = j4;
            this.f12482e = o2Var;
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.draw.m invoke(@fg.l androidx.compose.ui.draw.g gVar, @fg.m androidx.compose.ui.layout.u uVar) {
            return lb.c(gVar, this.f12479b, this.f12480c, this.f12481d, this.f12482e, uVar);
        }
    }

    /* compiled from: Tooltip.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.c, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.u f12483b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.g5 f12484c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f12485d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.layout.u uVar, androidx.compose.ui.graphics.g5 g5Var, long j4) {
            super(1);
            this.f12483b = uVar;
            this.f12484c = g5Var;
            this.f12485d = j4;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
            if (this.f12483b != null) {
                cVar.G6();
                androidx.compose.ui.graphics.drawscope.f.N1(cVar, this.f12484c, this.f12485d, 0.0f, null, null, 0, 60, null);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.c cVar) {
            a(cVar);
            return kotlin.k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024b  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l androidx.compose.material3.p2 r31, @fg.m androidx.compose.ui.q r32, @fg.m androidx.compose.material3.o2 r33, @fg.m androidx.compose.ui.graphics.e6 r34, long r35, long r37, float r39, float r40, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r41, @fg.m androidx.compose.runtime.t r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.lb.a(androidx.compose.material3.p2, androidx.compose.ui.q, androidx.compose.material3.o2, androidx.compose.ui.graphics.e6, long, long, float, float, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @f5
    public static final androidx.compose.ui.draw.m c(androidx.compose.ui.draw.g gVar, androidx.compose.ui.unit.d dVar, Configuration configuration, long j4, o2 o2Var, androidx.compose.ui.layout.u uVar) {
        androidx.compose.ui.graphics.g5 a5 = androidx.compose.ui.graphics.a1.a();
        if (uVar != null) {
            int q22 = dVar.q2(o2Var.e());
            int q23 = dVar.q2(o2Var.f());
            int q24 = dVar.q2(androidx.compose.ui.unit.h.g(configuration.screenWidthDp));
            int q25 = dVar.q2(ib.q());
            i0.i c5 = androidx.compose.ui.layout.v.c(uVar);
            float t4 = c5.t();
            float x4 = c5.x();
            float top2 = c5.getTop();
            float f4 = 2;
            float f5 = (x4 + t4) / f4;
            float f6 = x4 - t4;
            float t5 = i0.n.t(gVar.e());
            float m4 = i0.n.m(gVar.e());
            boolean z4 = (top2 - m4) - ((float) q25) < 0.0f;
            if (z4) {
                m4 = 0.0f;
            }
            float f7 = q24;
            long a6 = (t5 / f4) + f5 > f7 ? i0.g.a(t5 - (f7 - f5), m4) : i0.g.a(f5 - Math.max(t4 - ((i0.n.t(gVar.e()) / f4) - (f6 / f4)), 0.0f), m4);
            if (z4) {
                a5.s(i0.f.p(a6), i0.f.r(a6));
                float f10 = q23 / 2;
                a5.z(i0.f.p(a6) + f10, i0.f.r(a6));
                a5.z(i0.f.p(a6), i0.f.r(a6) - q22);
                a5.z(i0.f.p(a6) - f10, i0.f.r(a6));
                a5.close();
            } else {
                a5.s(i0.f.p(a6), i0.f.r(a6));
                float f11 = q23 / 2;
                a5.z(i0.f.p(a6) + f11, i0.f.r(a6));
                a5.z(i0.f.p(a6), i0.f.r(a6) + q22);
                a5.z(i0.f.p(a6) - f11, i0.f.r(a6));
                a5.close();
            }
        }
        return gVar.p(new d(uVar, a5, j4));
    }
}
