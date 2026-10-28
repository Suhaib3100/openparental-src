package androidx.compose.foundation;

import androidx.compose.runtime.g3;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.t3;
import androidx.compose.ui.graphics.m4;
import androidx.compose.ui.graphics.s4;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Image.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001ab\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aU\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001aU\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/s4;", "bitmap", "", "contentDescription", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/c;", "alignment", "Landroidx/compose/ui/layout/f;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/e2;", "colorFilter", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/s4;Ljava/lang/String;Landroidx/compose/ui/q;Landroidx/compose/ui/c;Landroidx/compose/ui/layout/f;FLandroidx/compose/ui/graphics/e2;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/graphics/m4;", "filterQuality", "d", "(Landroidx/compose/ui/graphics/s4;Ljava/lang/String;Landroidx/compose/ui/q;Landroidx/compose/ui/c;Landroidx/compose/ui/layout/f;FLandroidx/compose/ui/graphics/e2;ILandroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/graphics/vector/d;", "imageVector", "c", "(Landroidx/compose/ui/graphics/vector/d;Ljava/lang/String;Landroidx/compose/ui/q;Landroidx/compose/ui/c;Landroidx/compose/ui/layout/f;FLandroidx/compose/ui/graphics/e2;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/graphics/painter/e;", "painter", "b", "(Landroidx/compose/ui/graphics/painter/e;Ljava/lang/String;Landroidx/compose/ui/q;Landroidx/compose/ui/c;Landroidx/compose/ui/layout/f;FLandroidx/compose/ui/graphics/e2;Landroidx/compose/runtime/t;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,268:1\n36#2:269\n286#2,8:287\n294#2,2:307\n1116#3,6:270\n1116#3,6:276\n124#4,5:282\n130#4,5:295\n135#4:306\n137#4:309\n3737#5,6:300\n*S KotlinDebug\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n*L\n154#1:269\n256#1:287,8\n256#1:307,2\n154#1:270,6\n246#1:276,6\n256#1:282,5\n256#1:295,5\n256#1:306\n256#1:309\n256#1:300,6\n*E\n"})
/* loaded from: classes.dex */
public final class m1 {

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "androidx/compose/ui/layout/a0$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ReusableComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class a extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.node.g> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f6588b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ld.a aVar) {
            super(0);
            this.f6588b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.g, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final androidx.compose.ui.node.g invoke() {
            return this.f6588b.invoke();
        }
    }

    /* compiled from: Image.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "<anonymous parameter 0>", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    static final class b implements androidx.compose.ui.layout.m0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f6589a = new b();

        /* compiled from: Image.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f6590b = new a(1);

            a() {
                super(1);
            }

            public final void a(@fg.l i1.a aVar) {
            }

            @Override // ld.l
            public kotlin.k2 invoke(i1.a aVar) {
                return kotlin.k2.f75408a;
            }
        }

        b() {
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            return androidx.compose.ui.layout.o0.x2(o0Var, androidx.compose.ui.unit.b.r(j4), androidx.compose.ui.unit.b.q(j4), null, a.f6590b, 4, null);
        }
    }

    /* compiled from: Image.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.painter.e f6591b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f6592c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f6593d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.c f6594e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.f f6595f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f6596g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e2 f6597h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f6598i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f6599j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.graphics.painter.e eVar, String str, androidx.compose.ui.q qVar, androidx.compose.ui.c cVar, androidx.compose.ui.layout.f fVar, float f4, androidx.compose.ui.graphics.e2 e2Var, int i4, int i5) {
            super(2);
            this.f6591b = eVar;
            this.f6592c = str;
            this.f6593d = qVar;
            this.f6594e = cVar;
            this.f6595f = fVar;
            this.f6596g = f4;
            this.f6597h = e2Var;
            this.f6598i = i4;
            this.f6599j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            m1.b(this.f6591b, this.f6592c, this.f6593d, this.f6594e, this.f6595f, this.f6596g, this.f6597h, tVar, g3.b(this.f6598i | 1), this.f6599j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Image.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6600b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(1);
            this.f6600b = str;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.a1(zVar, this.f6600b);
            androidx.compose.ui.semantics.i.INSTANCE.getClass();
            androidx.compose.ui.semantics.w.l1(zVar, androidx.compose.ui.semantics.i.f20314h);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Consider usage of the Image composable that consumes an optional FilterQuality parameter", replaceWith = @kotlin.x0(expression = "Image(bitmap, contentDescription, modifier, alignment, contentScale, alpha, colorFilter, DefaultFilterQuality)", imports = {"androidx.compose.foundation", "androidx.compose.ui.graphics.DefaultAlpha", "androidx.compose.ui.Alignment", "androidx.compose.ui.graphics.drawscope.DrawScope.Companion.DefaultFilterQuality", "androidx.compose.ui.layout.ContentScale.Fit"}))
    @androidx.compose.runtime.i
    public static final void a(s4 s4Var, String str, androidx.compose.ui.q qVar, androidx.compose.ui.c cVar, androidx.compose.ui.layout.f fVar, float f4, androidx.compose.ui.graphics.e2 e2Var, androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-2123228673);
        androidx.compose.ui.q qVar2 = (i5 & 4) != 0 ? androidx.compose.ui.q.INSTANCE : qVar;
        androidx.compose.ui.c i6 = (i5 & 8) != 0 ? androidx.compose.ui.c.INSTANCE.i() : cVar;
        androidx.compose.ui.layout.f i7 = (i5 & 16) != 0 ? androidx.compose.ui.layout.f.INSTANCE.i() : fVar;
        float f5 = (i5 & 32) != 0 ? 1.0f : f4;
        androidx.compose.ui.graphics.e2 e2Var2 = (i5 & 64) != 0 ? null : e2Var;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-2123228673, i4, -1, "androidx.compose.foundation.Image (Image.kt:95)");
        }
        m4.INSTANCE.getClass();
        d(s4Var, str, qVar2, i6, i7, f5, e2Var2, m4.f17930d, tVar, (i4 & 112) | 8 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (i4 & 3670016), 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void b(@fg.l androidx.compose.ui.graphics.painter.e eVar, @fg.m String str, @fg.m androidx.compose.ui.q qVar, @fg.m androidx.compose.ui.c cVar, @fg.m androidx.compose.ui.layout.f fVar, float f4, @fg.m androidx.compose.ui.graphics.e2 e2Var, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        androidx.compose.ui.q qVar2;
        androidx.compose.runtime.t o4 = tVar.o(1142754848);
        androidx.compose.ui.q qVar3 = (i5 & 4) != 0 ? androidx.compose.ui.q.INSTANCE : qVar;
        androidx.compose.ui.c i6 = (i5 & 8) != 0 ? androidx.compose.ui.c.INSTANCE.i() : cVar;
        androidx.compose.ui.layout.f i7 = (i5 & 16) != 0 ? androidx.compose.ui.layout.f.INSTANCE.i() : fVar;
        float f5 = (i5 & 32) != 0 ? 1.0f : f4;
        androidx.compose.ui.graphics.e2 e2Var2 = (i5 & 64) != 0 ? null : e2Var;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1142754848, i4, -1, "androidx.compose.foundation.Image (Image.kt:243)");
        }
        if (str != null) {
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            o4.P(-1521136142);
            boolean q02 = o4.q0(str);
            Object Q = o4.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new d(str);
                o4.E(Q);
            }
            o4.p0();
            qVar2 = androidx.compose.ui.semantics.o.f(companion, false, (ld.l) Q, 1, null);
        } else {
            qVar2 = androidx.compose.ui.q.INSTANCE;
        }
        androidx.compose.ui.q b5 = androidx.compose.ui.draw.p.b(androidx.compose.ui.draw.h.b(qVar3.w3(qVar2)), eVar, false, i6, i7, f5, e2Var2, 2, null);
        b bVar = b.f6589a;
        o4.P(544976794);
        int j4 = androidx.compose.runtime.p.j(o4, 0);
        androidx.compose.ui.q l4 = androidx.compose.ui.i.l(o4, b5);
        androidx.compose.runtime.g0 B = o4.B();
        g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
        ld.a<androidx.compose.ui.node.g> a5 = companion2.a();
        o4.P(1405779621);
        if (o4.s() == null) {
            androidx.compose.runtime.p.n();
        }
        o4.W();
        if (o4.getInserting()) {
            o4.F(new a(a5));
        } else {
            o4.C();
        }
        m5.j(o4, bVar, companion2.f());
        m5.j(o4, B, companion2.h());
        m5.j(o4, l4, companion2.g());
        ld.p<androidx.compose.ui.node.g, Integer, kotlin.k2> b6 = companion2.b();
        if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
            androidx.compose.animation.d.a(j4, o4, j4, b6);
        }
        o4.H();
        o4.p0();
        o4.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new c(eVar, str, qVar3, i6, i7, f5, e2Var2, i4, i5));
        }
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void c(@fg.l androidx.compose.ui.graphics.vector.d dVar, @fg.m String str, @fg.m androidx.compose.ui.q qVar, @fg.m androidx.compose.ui.c cVar, @fg.m androidx.compose.ui.layout.f fVar, float f4, @fg.m androidx.compose.ui.graphics.e2 e2Var, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1595907091);
        androidx.compose.ui.q qVar2 = (i5 & 4) != 0 ? androidx.compose.ui.q.INSTANCE : qVar;
        androidx.compose.ui.c i6 = (i5 & 8) != 0 ? androidx.compose.ui.c.INSTANCE.i() : cVar;
        androidx.compose.ui.layout.f i7 = (i5 & 16) != 0 ? androidx.compose.ui.layout.f.INSTANCE.i() : fVar;
        float f5 = (i5 & 32) != 0 ? 1.0f : f4;
        androidx.compose.ui.graphics.e2 e2Var2 = (i5 & 64) != 0 ? null : e2Var;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1595907091, i4, -1, "androidx.compose.foundation.Image (Image.kt:197)");
        }
        b(androidx.compose.ui.graphics.vector.x.k(dVar, tVar, i4 & 14), str, qVar2, i6, i7, f5, e2Var2, tVar, androidx.compose.ui.graphics.vector.w.f18388o | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (i4 & 3670016), 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void d(@fg.l s4 s4Var, @fg.m String str, @fg.m androidx.compose.ui.q qVar, @fg.m androidx.compose.ui.c cVar, @fg.m androidx.compose.ui.layout.f fVar, float f4, @fg.m androidx.compose.ui.graphics.e2 e2Var, int i4, @fg.m androidx.compose.runtime.t tVar, int i5, int i6) {
        tVar.P(-1396260732);
        androidx.compose.ui.q qVar2 = (i6 & 4) != 0 ? androidx.compose.ui.q.INSTANCE : qVar;
        androidx.compose.ui.c i7 = (i6 & 8) != 0 ? androidx.compose.ui.c.INSTANCE.i() : cVar;
        androidx.compose.ui.layout.f i10 = (i6 & 16) != 0 ? androidx.compose.ui.layout.f.INSTANCE.i() : fVar;
        float f5 = (i6 & 32) != 0 ? 1.0f : f4;
        androidx.compose.ui.graphics.e2 e2Var2 = (i6 & 64) != 0 ? null : e2Var;
        int b5 = (i6 & 128) != 0 ? androidx.compose.ui.graphics.drawscope.f.INSTANCE.b() : i4;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1396260732, i5, -1, "androidx.compose.foundation.Image (Image.kt:152)");
        }
        tVar.P(1157296644);
        boolean q02 = tVar.q0(s4Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = androidx.compose.ui.graphics.painter.b.b(s4Var, 0L, 0L, b5, 6, null);
            tVar.E(Q);
        }
        tVar.p0();
        b((androidx.compose.ui.graphics.painter.a) Q, str, qVar2, i7, i10, f5, e2Var2, tVar, (i5 & 112) | 8 | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
    }
}
