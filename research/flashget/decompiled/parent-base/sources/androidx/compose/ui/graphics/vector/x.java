package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.e2;
import androidx.compose.ui.graphics.k1;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.graphics.vector.t;
import androidx.compose.ui.graphics.vector.z;
import androidx.compose.ui.platform.h1;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.x0;

/* compiled from: VectorPainter.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0096\u0001\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2@\u0010\u0011\u001a<\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a \u0001\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152@\u0010\u0011\u001a<\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010!\u001a\u00020\u000e*\u00020\u001d2\u0017\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\u001e¢\u0006\u0002\b\u001fH\u0082\b¢\u0006\u0004\b!\u0010\"\u001a&\u0010%\u001a\u00020$*\u00020#2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a*\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a$\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001aD\u0010/\u001a\u00020\u0012*\u00020\u00122\u0006\u0010'\u001a\u00020$2\u0006\u0010-\u001a\u00020$2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a'\u00105\u001a\u00020\u00122\u0006\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020\u00192\u0006\u00104\u001a\u000203H\u0000¢\u0006\u0004\b5\u00106\u001a\u001b\u00109\u001a\u000203*\u0002032\u0006\u00108\u001a\u000207H\u0000¢\u0006\u0004\b9\u0010:\u001a-\u0010?\u001a\u00020\u000e2\u0006\u0010;\u001a\u0002072\u0014\b\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020=0<H\u0007¢\u0006\u0004\b?\u0010@\"\u0014\u0010B\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010A\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"Landroidx/compose/ui/unit/h;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "", "name", "Landroidx/compose/ui/graphics/d2;", "tintColor", "Landroidx/compose/ui/graphics/k1;", "tintBlendMode", "Lkotlin/Function2;", "Lkotlin/r0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Landroidx/compose/ui/graphics/vector/q;", "content", "Landroidx/compose/ui/graphics/vector/w;", "l", "(FFFFLjava/lang/String;JILld/r;Landroidx/compose/runtime/t;II)Landroidx/compose/ui/graphics/vector/w;", "", "autoMirror", "m", "(FFFFLjava/lang/String;JIZLld/r;Landroidx/compose/runtime/t;II)Landroidx/compose/ui/graphics/vector/w;", "Landroidx/compose/ui/graphics/vector/d;", "image", "k", "(Landroidx/compose/ui/graphics/vector/d;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/vector/w;", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/Function1;", "Lkotlin/u;", "block", "h", "(Landroidx/compose/ui/graphics/drawscope/f;Lld/l;)V", "Landroidx/compose/ui/unit/d;", "Li0/n;", "i", "(Landroidx/compose/ui/unit/d;FF)J", "defaultSize", "j", "(JFF)J", "Landroidx/compose/ui/graphics/e2;", "e", "(JI)Landroidx/compose/ui/graphics/e2;", "viewportSize", "intrinsicColorFilter", "c", "(Landroidx/compose/ui/graphics/vector/w;JJLjava/lang/String;Landroidx/compose/ui/graphics/e2;Z)Landroidx/compose/ui/graphics/vector/w;", "density", "imageVector", "Landroidx/compose/ui/graphics/vector/c;", "root", "g", "(Landroidx/compose/ui/unit/d;Landroidx/compose/ui/graphics/vector/d;Landroidx/compose/ui/graphics/vector/c;)Landroidx/compose/ui/graphics/vector/w;", "Landroidx/compose/ui/graphics/vector/t;", "currentGroup", "f", "(Landroidx/compose/ui/graphics/vector/c;Landroidx/compose/ui/graphics/vector/t;)Landroidx/compose/ui/graphics/vector/c;", "group", "", "Landroidx/compose/ui/graphics/vector/s;", "configs", "a", "(Landroidx/compose/ui/graphics/vector/t;Ljava/util/Map;Landroidx/compose/runtime/t;II)V", "Ljava/lang/String;", "RootGroupName", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,516:1\n74#2:517\n74#2:543\n50#3:518\n49#3:519\n25#3:526\n67#3,3:533\n66#3:536\n50#3:544\n49#3:545\n1116#4,6:520\n1116#4,6:527\n1116#4,6:537\n1116#4,6:546\n174#5,6:552\n262#5,11:558\n646#6:569\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n*L\n129#1:517\n170#1:543\n132#1:518\n132#1:519\n135#1:526\n144#1:533,3\n144#1:536\n171#1:544\n171#1:545\n132#1:520,6\n135#1:527,6\n144#1:537,6\n171#1:546,6\n266#1:552,6\n266#1:558,11\n326#1:569\n*E\n"})
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final String f18398a = "VectorRootGroup";

    /* compiled from: VectorPainter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f18399b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<String, s> f18400c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(v vVar, Map<String, ? extends s> map) {
            super(2);
            this.f18399b = vVar;
            this.f18400c = map;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1450046638, i4, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:510)");
            }
            x.a((t) this.f18399b, this.f18400c, tVar, 64, 0);
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

    /* compiled from: VectorPainter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f18401b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<String, s> f18402c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f18403d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f18404e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(t tVar, Map<String, ? extends s> map, int i4, int i5) {
            super(2);
            this.f18401b = tVar;
            this.f18402c = map;
            this.f18403d = i4;
            this.f18404e = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            x.a(this.f18401b, this.f18402c, tVar, g3.b(this.f18403d | 1), this.f18404e);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: VectorPainter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/graphics/vector/x$c", "Landroidx/compose/ui/graphics/vector/s;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements s {
        c() {
        }
    }

    /* compiled from: VectorPainter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/graphics/vector/x$d", "Landroidx/compose/ui/graphics/vector/s;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements s {
        d() {
        }
    }

    /* compiled from: VectorPainter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.r<Float, Float, androidx.compose.runtime.t, Integer, k2> f18405b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f18406c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ld.r<? super Float, ? super Float, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar, long j4) {
            super(2);
            this.f18405b = rVar;
            this.f18406c = j4;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-824421385, i4, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter.<anonymous>.<anonymous>.<anonymous> (VectorPainter.kt:154)");
            }
            this.f18405b.i(Float.valueOf(i0.n.t(this.f18406c)), Float.valueOf(i0.n.m(this.f18406c)), tVar, 0);
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

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    @androidx.compose.runtime.i
    public static final void a(@fg.l t tVar, @fg.m Map<String, ? extends s> map, @fg.m androidx.compose.runtime.t tVar2, int i4, int i5) {
        int i6;
        Map<String, ? extends s> map2;
        androidx.compose.runtime.t tVar3;
        Map<String, ? extends s> map3;
        androidx.compose.runtime.t o4 = tVar2.o(-446179233);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (o4.q0(tVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i7 = i5 & 2;
        if (i7 != 0) {
            i6 |= 16;
        }
        if (i7 == 2 && (i6 & 91) == 18 && o4.p()) {
            o4.d0();
            map2 = map;
            tVar3 = o4;
        } else {
            Map<String, ? extends s> z4 = i7 != 0 ? z0.z() : map;
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-446179233, i6, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:426)");
            }
            tVar.getClass();
            t.a aVar = new t.a(tVar);
            while (aVar.hasNext()) {
                v next = aVar.next();
                if (next instanceof y) {
                    o4.P(-326282007);
                    y yVar = (y) next;
                    s sVar = z4.get(yVar.getName());
                    if (sVar == null) {
                        sVar = new c();
                    }
                    s sVar2 = sVar;
                    androidx.compose.runtime.t tVar4 = o4;
                    r.b((List) sVar2.b(z.c.f18427b, yVar.h()), yVar.getPathFillType(), yVar.getName(), (t1) sVar2.b(z.a.f18423b, yVar.getFill()), ((Number) sVar2.b(z.b.f18425b, Float.valueOf(yVar.getFillAlpha()))).floatValue(), (t1) sVar2.b(z.i.f18439b, yVar.getStroke()), ((Number) sVar2.b(z.j.f18441b, Float.valueOf(yVar.getStrokeAlpha()))).floatValue(), ((Number) sVar2.b(z.k.f18443b, Float.valueOf(yVar.getStrokeLineWidth()))).floatValue(), yVar.getStrokeLineCap(), yVar.getStrokeLineJoin(), yVar.getStrokeLineMiter(), ((Number) sVar2.b(z.p.f18453b, Float.valueOf(yVar.getTrimPathStart()))).floatValue(), ((Number) sVar2.b(z.n.f18449b, Float.valueOf(yVar.getTrimPathEnd()))).floatValue(), ((Number) sVar2.b(z.o.f18451b, Float.valueOf(yVar.getTrimPathOffset()))).floatValue(), tVar4, 8, 0, 0);
                    tVar4.p0();
                    aVar = aVar;
                    z4 = z4;
                    o4 = tVar4;
                } else {
                    t.a aVar2 = aVar;
                    Map<String, ? extends s> map4 = z4;
                    androidx.compose.runtime.t tVar5 = o4;
                    if (next instanceof t) {
                        tVar5.P(-326280149);
                        t tVar6 = (t) next;
                        map3 = map4;
                        s sVar3 = map3.get(tVar6.getName());
                        if (sVar3 == null) {
                            sVar3 = new d();
                        }
                        r.a(tVar6.getName(), ((Number) sVar3.b(z.f.f18433b, Float.valueOf(tVar6.getRotation()))).floatValue(), ((Number) sVar3.b(z.d.f18429b, Float.valueOf(tVar6.getPivotX()))).floatValue(), ((Number) sVar3.b(z.e.f18431b, Float.valueOf(tVar6.getPivotY()))).floatValue(), ((Number) sVar3.b(z.g.f18435b, Float.valueOf(tVar6.getScaleX()))).floatValue(), ((Number) sVar3.b(z.h.f18437b, Float.valueOf(tVar6.getScaleY()))).floatValue(), ((Number) sVar3.b(z.l.f18445b, Float.valueOf(tVar6.getTranslationX()))).floatValue(), ((Number) sVar3.b(z.m.f18447b, Float.valueOf(tVar6.getTranslationY()))).floatValue(), (List) sVar3.b(z.c.f18427b, tVar6.f()), androidx.compose.runtime.internal.c.b(tVar5, 1450046638, true, new a(next, map3)), tVar5, 939524096, 0);
                        tVar5.p0();
                    } else {
                        map3 = map4;
                        tVar5.P(-326278679);
                        tVar5.p0();
                    }
                    o4 = tVar5;
                    z4 = map3;
                    aVar = aVar2;
                }
            }
            map2 = z4;
            tVar3 = o4;
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = tVar3.t();
        if (t4 != null) {
            t4.a(new b(tVar, map2, i4, i5));
        }
    }

    @fg.l
    public static final w c(@fg.l w wVar, long j4, long j5, @fg.l String str, @fg.m e2 e2Var, boolean z4) {
        wVar.C(j4);
        wVar.x(z4);
        wVar.z(e2Var);
        wVar.D(j5);
        wVar.B(str);
        return wVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e2 e(long j4, int i4) {
        d2.INSTANCE.getClass();
        if (j4 != d2.f17778o) {
            return e2.INSTANCE.c(j4, i4);
        }
        return null;
    }

    @fg.l
    public static final androidx.compose.ui.graphics.vector.c f(@fg.l androidx.compose.ui.graphics.vector.c cVar, @fg.l t tVar) {
        int q4 = tVar.q();
        for (int i4 = 0; i4 < q4; i4++) {
            v c5 = tVar.c(i4);
            if (c5 instanceof y) {
                h hVar = new h();
                y yVar = (y) c5;
                hVar.w(yVar.h());
                hVar.x(yVar.getPathFillType());
                hVar.v(yVar.getName());
                hVar.t(yVar.getFill());
                hVar.u(yVar.getFillAlpha());
                hVar.y(yVar.getStroke());
                hVar.z(yVar.getStrokeAlpha());
                hVar.D(yVar.getStrokeLineWidth());
                hVar.A(yVar.getStrokeLineCap());
                hVar.B(yVar.getStrokeLineJoin());
                hVar.C(yVar.getStrokeLineMiter());
                hVar.G(yVar.getTrimPathStart());
                hVar.E(yVar.getTrimPathEnd());
                hVar.F(yVar.getTrimPathOffset());
                cVar.r(i4, hVar);
            } else if (c5 instanceof t) {
                androidx.compose.ui.graphics.vector.c cVar2 = new androidx.compose.ui.graphics.vector.c();
                t tVar2 = (t) c5;
                cVar2.A(tVar2.getName());
                cVar2.D(tVar2.getRotation());
                cVar2.E(tVar2.getScaleX());
                cVar2.F(tVar2.getScaleY());
                cVar2.G(tVar2.getTranslationX());
                cVar2.H(tVar2.getTranslationY());
                cVar2.B(tVar2.getPivotX());
                cVar2.C(tVar2.getPivotY());
                cVar2.z(tVar2.f());
                f(cVar2, tVar2);
                cVar.r(i4, cVar2);
            }
        }
        return cVar;
    }

    @fg.l
    public static final w g(@fg.l androidx.compose.ui.unit.d dVar, @fg.l androidx.compose.ui.graphics.vector.d dVar2, @fg.l androidx.compose.ui.graphics.vector.c cVar) {
        long i4 = i(dVar, dVar2.getDefaultWidth(), dVar2.getDefaultHeight());
        return c(new w(cVar), i4, j(i4, dVar2.getViewportWidth(), dVar2.getViewportHeight()), dVar2.getName(), e(dVar2.getTintColor(), dVar2.getTintBlendMode()), dVar2.getAutoMirror());
    }

    private static final void h(androidx.compose.ui.graphics.drawscope.f fVar, ld.l<? super androidx.compose.ui.graphics.drawscope.f, k2> lVar) {
        long c02 = fVar.c0();
        androidx.compose.ui.graphics.drawscope.d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        drawContext.getTransform().i(-1.0f, 1.0f, c02);
        lVar.invoke(fVar);
        drawContext.i().o();
        drawContext.j(e4);
    }

    private static final long i(androidx.compose.ui.unit.d dVar, float f4, float f5) {
        return i0.o.a(dVar.v5(f4), dVar.v5(f5));
    }

    private static final long j(long j4, float f4, float f5) {
        if (Float.isNaN(f4)) {
            f4 = i0.n.t(j4);
        }
        if (Float.isNaN(f5)) {
            f5 = i0.n.m(j4);
        }
        return i0.o.a(f4, f5);
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final w k(@fg.l androidx.compose.ui.graphics.vector.d dVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1413834416);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1413834416, i4, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:168)");
        }
        androidx.compose.ui.unit.d dVar2 = (androidx.compose.ui.unit.d) tVar.x(h1.i());
        Object valueOf = Integer.valueOf(dVar.getGenId());
        tVar.P(511388516);
        boolean q02 = tVar.q0(valueOf) | tVar.q0(dVar2);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            androidx.compose.ui.graphics.vector.c cVar = new androidx.compose.ui.graphics.vector.c();
            f(cVar, dVar.getRoot());
            k2 k2Var = k2.f75408a;
            Q = g(dVar2, dVar, cVar);
            tVar.E(Q);
        }
        tVar.p0();
        w wVar = (w) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return wVar;
    }

    @androidx.compose.runtime.k(index = -1)
    @kotlin.k(message = "Replace rememberVectorPainter graphicsLayer that consumes the auto mirror flag", replaceWith = @x0(expression = "rememberVectorPainter(defaultWidth, defaultHeight, viewportWidth, viewportHeight, name, tintColor, tintBlendMode, false, content)", imports = {"androidx.compose.ui.graphics.vector"}))
    @fg.l
    @androidx.compose.runtime.i
    public static final w l(float f4, float f5, float f6, float f7, @fg.m String str, long j4, int i4, @fg.l ld.r<? super Float, ? super Float, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar, @fg.m androidx.compose.runtime.t tVar, int i5, int i6) {
        long j5;
        int i7;
        tVar.P(-964365210);
        float f10 = (i6 & 4) != 0 ? Float.NaN : f6;
        float f11 = (i6 & 8) != 0 ? Float.NaN : f7;
        String str2 = (i6 & 16) != 0 ? "VectorRootGroup" : str;
        if ((i6 & 32) != 0) {
            d2.INSTANCE.getClass();
            j5 = d2.f17778o;
        } else {
            j5 = j4;
        }
        if ((i6 & 64) != 0) {
            k1.INSTANCE.getClass();
            i7 = k1.f17879h;
        } else {
            i7 = i4;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-964365210, i5, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:85)");
        }
        w m4 = m(f4, f5, f10, f11, str2, j5, i7, false, rVar, tVar, (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | ((i5 << 3) & 234881024), 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return m4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
    
        if (r10 == androidx.compose.runtime.t.INSTANCE.a()) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ff, code lost:
    
        if (r4 == r8.a()) goto L41;
     */
    @androidx.compose.runtime.k(index = -1)
    @fg.l
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.graphics.vector.w m(float r16, float r17, float r18, float r19, @fg.m java.lang.String r20, long r21, int r23, boolean r24, @fg.l ld.r<? super java.lang.Float, ? super java.lang.Float, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r25, @fg.m androidx.compose.runtime.t r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.x.m(float, float, float, float, java.lang.String, long, int, boolean, ld.r, androidx.compose.runtime.t, int, int):androidx.compose.ui.graphics.vector.w");
    }
}
