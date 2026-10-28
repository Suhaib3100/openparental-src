package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.c2;
import androidx.compose.foundation.layout.f2;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import androidx.compose.ui.graphics.e2;
import androidx.compose.ui.graphics.s4;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: AndroidCursorHandle.android.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\u0002*\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u000f\"\u001a\u0010\u0014\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0015\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Li0/f;", "handlePosition", "Landroidx/compose/ui/q;", "modifier", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "a", "(JLandroidx/compose/ui/q;Lld/p;Landroidx/compose/runtime/t;I)V", "b", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)V", "c", "(Landroidx/compose/ui/q;)Landroidx/compose/ui/q;", "", "F", "Sqrt2", "Landroidx/compose/ui/unit/h;", "d", "()F", "CursorHandleHeight", "e", "CursorHandleWidth", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,82:1\n1116#2,6:83\n154#3:89\n88#4:90\n71#4:91\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n*L\n45#1:83,6\n35#1:89\n36#1:90\n36#1:91\n*E\n"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final float f7092a = 1.4142135f;

    /* renamed from: b, reason: collision with root package name */
    private static final float f7093b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f7094c;

    /* compiled from: AndroidCursorHandle.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/f;", "a", "()J"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.a$a, reason: collision with other inner class name */
    static final class C0125a implements androidx.compose.foundation.text.selection.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f7095b;

        C0125a(long j4) {
            this.f7095b = j4;
        }

        @Override // androidx.compose.foundation.text.selection.n
        public final long a() {
            return this.f7095b;
        }
    }

    /* compiled from: AndroidCursorHandle.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f7096b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7097c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, androidx.compose.ui.q qVar) {
            super(2);
            this.f7096b = pVar;
            this.f7097c = qVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1458480226, i4, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:47)");
            }
            if (this.f7096b == null) {
                tVar.P(1275643845);
                a.b(this.f7097c, tVar, 0);
                tVar.p0();
            } else {
                tVar.P(1275643915);
                this.f7096b.invoke(tVar, 0);
                tVar.p0();
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidCursorHandle.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f7098b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7099c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f7100d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7101e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(long j4, androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, int i4) {
            super(2);
            this.f7098b = j4;
            this.f7099c = qVar;
            this.f7100d = pVar;
            this.f7101e = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a.a(this.f7098b, this.f7099c, this.f7100d, tVar, g3.b(this.f7101e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidCursorHandle.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7102b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7103c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.q qVar, int i4) {
            super(2);
            this.f7102b = qVar;
            this.f7103c = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a.b(this.f7102b, tVar, g3.b(this.f7103c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidCursorHandle.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,82:1\n74#2:83\n1116#3,6:84\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1\n*L\n63#1:83\n65#1:84,6\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f7104b = new e(3);

        /* compiled from: AndroidCursorHandle.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/draw/g;", "Landroidx/compose/ui/draw/m;", "a", "(Landroidx/compose/ui/draw/g;)Landroidx/compose/ui/draw/m;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.a$e$a, reason: collision with other inner class name */
        static final class C0126a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.draw.g, androidx.compose.ui.draw.m> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f7105b;

            /* compiled from: AndroidCursorHandle.android.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, k = 3, mv = {1, 8, 0})
            @r1({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,82:1\n262#2,11:83\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1$1\n*L\n72#1:83,11\n*E\n"})
            /* renamed from: androidx.compose.foundation.text.a$e$a$a, reason: collision with other inner class name */
            static final class C0127a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.c, k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ float f7106b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ s4 f7107c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ e2 f7108d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0127a(float f4, s4 s4Var, e2 e2Var) {
                    super(1);
                    this.f7106b = f4;
                    this.f7107c = s4Var;
                    this.f7108d = e2Var;
                }

                public final void a(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
                    cVar.G6();
                    float f4 = this.f7106b;
                    s4 s4Var = this.f7107c;
                    e2 e2Var = this.f7108d;
                    androidx.compose.ui.graphics.drawscope.d drawContext = cVar.getDrawContext();
                    long e4 = drawContext.e();
                    drawContext.i().C();
                    androidx.compose.ui.graphics.drawscope.j transform = drawContext.getTransform();
                    androidx.compose.ui.graphics.drawscope.j.d(transform, f4, 0.0f, 2, null);
                    i0.f.INSTANCE.getClass();
                    transform.j(45.0f, i0.f.f74147c);
                    androidx.compose.ui.graphics.drawscope.f.E3(cVar, s4Var, 0L, 0.0f, null, e2Var, 0, 46, null);
                    drawContext.i().o();
                    drawContext.j(e4);
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.graphics.drawscope.c cVar) {
                    a(cVar);
                    return k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0126a(long j4) {
                super(1);
                this.f7105b = j4;
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.draw.m invoke(@fg.l androidx.compose.ui.draw.g gVar) {
                float t4 = i0.n.t(gVar.e()) / 2.0f;
                return gVar.p(new C0127a(t4, androidx.compose.foundation.text.selection.a.d(gVar, t4), e2.Companion.d(e2.INSTANCE, this.f7105b, 0, 2, null)));
            }
        }

        e() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(qVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-2126899193);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-2126899193, i4, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:62)");
            }
            long handleColor = ((androidx.compose.foundation.text.selection.x0) tVar.x(androidx.compose.foundation.text.selection.y0.c())).getHandleColor();
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            tVar.P(2068318685);
            boolean g4 = tVar.g(handleColor);
            Object Q = tVar.Q();
            if (g4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new C0126a(handleColor);
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.ui.q w32 = qVar.w3(androidx.compose.ui.draw.l.c(companion, (ld.l) Q));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return w32;
        }
    }

    static {
        float g4 = androidx.compose.ui.unit.h.g(25);
        f7093b = g4;
        f7094c = (g4 * 2.0f) / 2.4142137f;
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void a(long j4, @fg.l androidx.compose.ui.q qVar, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-5185995);
        if ((i4 & 14) == 0) {
            i5 = (o4.g(j4) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 112) == 0) {
            i5 |= o4.q0(qVar) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i5 |= o4.S(pVar) ? 256 : 128;
        }
        if ((i5 & 731) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-5185995, i5, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:42)");
            }
            o4.P(2068318109);
            boolean g4 = o4.g(j4);
            Object Q = o4.Q();
            if (g4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new C0125a(j4);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.foundation.text.selection.a.a((androidx.compose.foundation.text.selection.n) Q, androidx.compose.foundation.text.selection.i.TopMiddle, androidx.compose.runtime.internal.c.b(o4, -1458480226, true, new b(pVar, qVar)), o4, 432);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new c(j4, qVar, pVar, i4));
        }
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void b(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(694251107);
        if ((i4 & 14) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 11) == 2 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(694251107, i5, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:57)");
            }
            f2.a(c(c2.y(qVar, f7094c, f7093b)), o4, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new d(qVar, i4));
        }
    }

    @fg.l
    public static final androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar) {
        return androidx.compose.ui.i.j(qVar, null, e.f7104b, 1, null);
    }

    public static final float d() {
        return f7093b;
    }

    public static final float e() {
        return f7094c;
    }
}
