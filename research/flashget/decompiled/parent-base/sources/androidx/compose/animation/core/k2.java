package androidx.compose.animation.core;

import androidx.compose.ui.unit.h;
import androidx.compose.ui.unit.j;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.u;
import i0.f;
import i0.i;
import i0.n;
import kotlin.Metadata;

/* compiled from: VectorConverters.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\" \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010\" \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010\" \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010\" \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010\" \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010\" \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0010\" \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0010\" \u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0010\" \u0010+\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0010\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u0006*\u00020,8F¢\u0006\u0006\u001a\u0004\b*\u0010-\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u0006*\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0\u0006*\u0002028F¢\u0006\u0006\u001a\u0004\b#\u00103\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0006*\u0002048F¢\u0006\u0006\u001a\u0004\b\u0013\u00105\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0006*\u0002068F¢\u0006\u0006\u001a\u0004\b\u0016\u00107\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00190\u0006*\u0002088F¢\u0006\u0006\u001a\u0004\b&\u00109\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00190\u0006*\u00020:8F¢\u0006\u0006\u001a\u0004\b \u0010;\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00190\u0006*\u00020<8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010=\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00190\u0006*\u00020>8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010?¨\u0006@"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Lkotlin/Function1;", "convertToVector", "convertFromVector", "Landroidx/compose/animation/core/i2;", "a", "(Lld/l;Lld/l;)Landroidx/compose/animation/core/i2;", "", "start", "stop", "fraction", "k", "(FFF)F", "Landroidx/compose/animation/core/o;", "Landroidx/compose/animation/core/i2;", "FloatToVector", "", "b", "IntToVector", "Landroidx/compose/ui/unit/h;", "c", "DpToVector", "Landroidx/compose/ui/unit/j;", "Landroidx/compose/animation/core/p;", "d", "DpOffsetToVector", "Li0/n;", "e", "SizeToVector", "Li0/f;", "f", "OffsetToVector", "Landroidx/compose/ui/unit/q;", "g", "IntOffsetToVector", "Landroidx/compose/ui/unit/u;", "h", "IntSizeToVector", "Li0/i;", "Landroidx/compose/animation/core/r;", "i", "RectToVector", "Lkotlin/Float$Companion;", "(Lkotlin/jvm/internal/a0;)Landroidx/compose/animation/core/i2;", "VectorConverter", "Lkotlin/Int$Companion;", "j", "(Lkotlin/jvm/internal/j0;)Landroidx/compose/animation/core/i2;", "Li0/i$a;", "(Li0/i$a;)Landroidx/compose/animation/core/i2;", "Landroidx/compose/ui/unit/h$a;", "(Landroidx/compose/ui/unit/h$a;)Landroidx/compose/animation/core/i2;", "Landroidx/compose/ui/unit/j$a;", "(Landroidx/compose/ui/unit/j$a;)Landroidx/compose/animation/core/i2;", "Li0/n$a;", "(Li0/n$a;)Landroidx/compose/animation/core/i2;", "Li0/f$a;", "(Li0/f$a;)Landroidx/compose/animation/core/i2;", "Landroidx/compose/ui/unit/q$a;", "(Landroidx/compose/ui/unit/q$a;)Landroidx/compose/animation/core/i2;", "Landroidx/compose/ui/unit/u$a;", "(Landroidx/compose/ui/unit/u$a;)Landroidx/compose/animation/core/i2;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final i2<Float, androidx.compose.animation.core.o> f2782a = new j2(e.f2795b, f.f2796b);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final i2<Integer, androidx.compose.animation.core.o> f2783b = new j2(k.f2801b, l.f2802b);

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final i2<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> f2784c = new j2(c.f2793b, d.f2794b);

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final i2<androidx.compose.ui.unit.j, androidx.compose.animation.core.p> f2785d = new j2(a.f2791b, b.f2792b);

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final i2<i0.n, androidx.compose.animation.core.p> f2786e = new j2(q.f2807b, r.f2808b);

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final i2<i0.f, androidx.compose.animation.core.p> f2787f = new j2(m.f2803b, n.f2804b);

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final i2<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> f2788g = new j2(g.f2797b, h.f2798b);

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final i2<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> f2789h = new j2(i.f2799b, j.f2800b);

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final i2<i0.i, androidx.compose.animation.core.r> f2790i = new j2(o.f2805b, p.f2806b);

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/j;", "it", "Landroidx/compose/animation/core/p;", "a", "(J)Landroidx/compose/animation/core/p;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.j, androidx.compose.animation.core.p> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f2791b = new a(1);

        a() {
            super(1);
        }

        @fg.l
        public final androidx.compose.animation.core.p a(long j4) {
            return new androidx.compose.animation.core.p(androidx.compose.ui.unit.j.j(j4), androidx.compose.ui.unit.j.l(j4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.p invoke(androidx.compose.ui.unit.j jVar) {
            return a(jVar.getPackedValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/p;", "it", "Landroidx/compose/ui/unit/j;", "a", "(Landroidx/compose/animation/core/p;)J"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nVectorConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt$DpOffsetToVector$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,196:1\n174#2:197\n*S KotlinDebug\n*F\n+ 1 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt$DpOffsetToVector$2\n*L\n145#1:197\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.p, androidx.compose.ui.unit.j> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f2792b = new b(1);

        b() {
            super(1);
        }

        public final long a(@fg.l androidx.compose.animation.core.p pVar) {
            return androidx.compose.ui.unit.i.a(androidx.compose.ui.unit.h.g(pVar.getV1()), pVar.getV2());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.j invoke(androidx.compose.animation.core.p pVar) {
            return androidx.compose.ui.unit.j.c(a(pVar));
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/h;", "it", "Landroidx/compose/animation/core/o;", "a", "(F)Landroidx/compose/animation/core/o;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f2793b = new c(1);

        c() {
            super(1);
        }

        @fg.l
        public final androidx.compose.animation.core.o a(float f4) {
            return new androidx.compose.animation.core.o(f4);
        }

        @Override // ld.l
        public androidx.compose.animation.core.o invoke(androidx.compose.ui.unit.h hVar) {
            return new androidx.compose.animation.core.o(hVar.u());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/o;", "it", "Landroidx/compose/ui/unit/h;", "a", "(Landroidx/compose/animation/core/o;)F"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.o, androidx.compose.ui.unit.h> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f2794b = new d(1);

        d() {
            super(1);
        }

        public final float a(@fg.l androidx.compose.animation.core.o oVar) {
            return androidx.compose.ui.unit.h.g(oVar.getValue());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.h invoke(androidx.compose.animation.core.o oVar) {
            return androidx.compose.ui.unit.h.d(a(oVar));
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/animation/core/o;", "a", "(F)Landroidx/compose/animation/core/o;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<Float, androidx.compose.animation.core.o> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f2795b = new e(1);

        e() {
            super(1);
        }

        @fg.l
        public final androidx.compose.animation.core.o a(float f4) {
            return new androidx.compose.animation.core.o(f4);
        }

        @Override // ld.l
        public androidx.compose.animation.core.o invoke(Float f4) {
            return new androidx.compose.animation.core.o(f4.floatValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/o;", "it", "", "a", "(Landroidx/compose/animation/core/o;)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.o, Float> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f2796b = new f(1);

        f() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(@fg.l androidx.compose.animation.core.o oVar) {
            return Float.valueOf(oVar.getValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/q;", "it", "Landroidx/compose/animation/core/p;", "a", "(J)Landroidx/compose/animation/core/p;"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f2797b = new g(1);

        g() {
            super(1);
        }

        @fg.l
        public final androidx.compose.animation.core.p a(long j4) {
            return new androidx.compose.animation.core.p(androidx.compose.ui.unit.q.m(j4), (int) (j4 & 4294967295L));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.p invoke(androidx.compose.ui.unit.q qVar) {
            return a(qVar.getPackedValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/p;", "it", "Landroidx/compose/ui/unit/q;", "a", "(Landroidx/compose/animation/core/p;)J"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.p, androidx.compose.ui.unit.q> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f2798b = new h(1);

        h() {
            super(1);
        }

        public final long a(@fg.l androidx.compose.animation.core.p pVar) {
            return androidx.compose.ui.unit.r.a(kotlin.math.b.L0(pVar.getV1()), kotlin.math.b.L0(pVar.getV2()));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.q invoke(androidx.compose.animation.core.p pVar) {
            return androidx.compose.ui.unit.q.b(a(pVar));
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/u;", "it", "Landroidx/compose/animation/core/p;", "a", "(J)Landroidx/compose/animation/core/p;"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f2799b = new i(1);

        i() {
            super(1);
        }

        @fg.l
        public final androidx.compose.animation.core.p a(long j4) {
            return new androidx.compose.animation.core.p(androidx.compose.ui.unit.u.m(j4), (int) (j4 & 4294967295L));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.p invoke(androidx.compose.ui.unit.u uVar) {
            return a(uVar.getPackedValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/p;", "it", "Landroidx/compose/ui/unit/u;", "a", "(Landroidx/compose/animation/core/p;)J"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.p, androidx.compose.ui.unit.u> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f2800b = new j(1);

        j() {
            super(1);
        }

        public final long a(@fg.l androidx.compose.animation.core.p pVar) {
            return androidx.compose.ui.unit.v.a(kotlin.math.b.L0(pVar.getV1()), kotlin.math.b.L0(pVar.getV2()));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.u invoke(androidx.compose.animation.core.p pVar) {
            return androidx.compose.ui.unit.u.b(a(pVar));
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/animation/core/o;", "a", "(I)Landroidx/compose/animation/core/o;"}, k = 3, mv = {1, 8, 0})
    static final class k extends kotlin.jvm.internal.n0 implements ld.l<Integer, androidx.compose.animation.core.o> {

        /* renamed from: b, reason: collision with root package name */
        public static final k f2801b = new k(1);

        k() {
            super(1);
        }

        @fg.l
        public final androidx.compose.animation.core.o a(int i4) {
            return new androidx.compose.animation.core.o(i4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.o invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/o;", "it", "", "a", "(Landroidx/compose/animation/core/o;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.o, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f2802b = new l(1);

        l() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@fg.l androidx.compose.animation.core.o oVar) {
            return Integer.valueOf((int) oVar.getValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Landroidx/compose/animation/core/p;", "a", "(J)Landroidx/compose/animation/core/p;"}, k = 3, mv = {1, 8, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.l<i0.f, androidx.compose.animation.core.p> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f2803b = new m(1);

        m() {
            super(1);
        }

        @fg.l
        public final androidx.compose.animation.core.p a(long j4) {
            return new androidx.compose.animation.core.p(i0.f.p(j4), i0.f.r(j4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.p invoke(i0.f fVar) {
            return a(fVar.getPackedValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/p;", "it", "Li0/f;", "a", "(Landroidx/compose/animation/core/p;)J"}, k = 3, mv = {1, 8, 0})
    static final class n extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.p, i0.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final n f2804b = new n(1);

        n() {
            super(1);
        }

        public final long a(@fg.l androidx.compose.animation.core.p pVar) {
            return i0.g.a(pVar.getV1(), pVar.getV2());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ i0.f invoke(androidx.compose.animation.core.p pVar) {
            return i0.f.d(a(pVar));
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/i;", "it", "Landroidx/compose/animation/core/r;", "a", "(Li0/i;)Landroidx/compose/animation/core/r;"}, k = 3, mv = {1, 8, 0})
    static final class o extends kotlin.jvm.internal.n0 implements ld.l<i0.i, androidx.compose.animation.core.r> {

        /* renamed from: b, reason: collision with root package name */
        public static final o f2805b = new o(1);

        o() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.core.r invoke(@fg.l i0.i iVar) {
            return new androidx.compose.animation.core.r(iVar.t(), iVar.getTop(), iVar.x(), iVar.j());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/r;", "it", "Li0/i;", "a", "(Landroidx/compose/animation/core/r;)Li0/i;"}, k = 3, mv = {1, 8, 0})
    static final class p extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.r, i0.i> {

        /* renamed from: b, reason: collision with root package name */
        public static final p f2806b = new p(1);

        p() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0.i invoke(@fg.l androidx.compose.animation.core.r rVar) {
            return new i0.i(rVar.getV1(), rVar.getV2(), rVar.getV3(), rVar.getV4());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/n;", "it", "Landroidx/compose/animation/core/p;", "a", "(J)Landroidx/compose/animation/core/p;"}, k = 3, mv = {1, 8, 0})
    static final class q extends kotlin.jvm.internal.n0 implements ld.l<i0.n, androidx.compose.animation.core.p> {

        /* renamed from: b, reason: collision with root package name */
        public static final q f2807b = new q(1);

        q() {
            super(1);
        }

        @fg.l
        public final androidx.compose.animation.core.p a(long j4) {
            return new androidx.compose.animation.core.p(i0.n.t(j4), i0.n.m(j4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.p invoke(i0.n nVar) {
            return a(nVar.getPackedValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/p;", "it", "Li0/n;", "a", "(Landroidx/compose/animation/core/p;)J"}, k = 3, mv = {1, 8, 0})
    static final class r extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.p, i0.n> {

        /* renamed from: b, reason: collision with root package name */
        public static final r f2808b = new r(1);

        r() {
            super(1);
        }

        public final long a(@fg.l androidx.compose.animation.core.p pVar) {
            return i0.o.a(pVar.getV1(), pVar.getV2());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ i0.n invoke(androidx.compose.animation.core.p pVar) {
            return i0.n.c(a(pVar));
        }
    }

    @fg.l
    public static final <T, V extends s> i2<T, V> a(@fg.l ld.l<? super T, ? extends V> lVar, @fg.l ld.l<? super V, ? extends T> lVar2) {
        return new j2(lVar, lVar2);
    }

    @fg.l
    public static final i2<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> b(@fg.l h.Companion companion) {
        return f2784c;
    }

    @fg.l
    public static final i2<androidx.compose.ui.unit.j, androidx.compose.animation.core.p> c(@fg.l j.Companion companion) {
        return f2785d;
    }

    @fg.l
    public static final i2<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> d(@fg.l q.Companion companion) {
        return f2788g;
    }

    @fg.l
    public static final i2<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> e(@fg.l u.Companion companion) {
        return f2789h;
    }

    @fg.l
    public static final i2<i0.f, androidx.compose.animation.core.p> f(@fg.l f.Companion companion) {
        return f2787f;
    }

    @fg.l
    public static final i2<i0.i, androidx.compose.animation.core.r> g(@fg.l i.Companion companion) {
        return f2790i;
    }

    @fg.l
    public static final i2<i0.n, androidx.compose.animation.core.p> h(@fg.l n.Companion companion) {
        return f2786e;
    }

    @fg.l
    public static final i2<Float, androidx.compose.animation.core.o> i(@fg.l kotlin.jvm.internal.a0 a0Var) {
        return f2782a;
    }

    @fg.l
    public static final i2<Integer, androidx.compose.animation.core.o> j(@fg.l kotlin.jvm.internal.j0 j0Var) {
        return f2783b;
    }

    public static final float k(float f4, float f5, float f6) {
        return (f5 * f6) + ((1 - f6) * f4);
    }
}
