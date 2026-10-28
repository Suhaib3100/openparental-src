package androidx.compose.foundation;

import androidx.compose.runtime.x4;
import androidx.compose.ui.graphics.e6;
import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.graphics.g6;
import androidx.compose.ui.graphics.k5;
import androidx.compose.ui.graphics.r5;
import kotlin.Metadata;

/* compiled from: Border.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a0\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a.\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a>\u0010\u001d\u001a\u00020\u0012*\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a/\u0010$\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010'\u001a\u00020!2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b'\u0010(\u001a\u001e\u0010+\u001a\u00020)*\u00020)2\u0006\u0010*\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/foundation/c0;", "border", "Landroidx/compose/ui/graphics/e6;", "shape", "e", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/c0;Landroidx/compose/ui/graphics/e6;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/unit/h;", "width", "Landroidx/compose/ui/graphics/d2;", "color", "g", "(Landroidx/compose/ui/q;FJLandroidx/compose/ui/graphics/e6;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/graphics/t1;", "brush", "i", "(Landroidx/compose/ui/q;FLandroidx/compose/ui/graphics/t1;Landroidx/compose/ui/graphics/e6;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/draw/g;", "Landroidx/compose/ui/draw/m;", "l", "(Landroidx/compose/ui/draw/g;)Landroidx/compose/ui/draw/m;", "Li0/f;", "topLeft", "Li0/n;", "borderSize", "", "fillArea", "", "strokeWidthPx", "m", "(Landroidx/compose/ui/draw/g;Landroidx/compose/ui/graphics/t1;JJZF)Landroidx/compose/ui/draw/m;", "Landroidx/compose/ui/graphics/g5;", "targetPath", "Li0/l;", "roundedRect", "strokeWidth", "k", "(Landroidx/compose/ui/graphics/g5;Li0/l;FZ)Landroidx/compose/ui/graphics/g5;", "widthPx", "j", "(FLi0/l;)Li0/l;", "Li0/a;", "value", "n", "(JF)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z {

    /* compiled from: Border.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.c, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f9271b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
            cVar.G6();
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.c cVar) {
            cVar.G6();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Border.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.c, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.t1 f9272b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f9273c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f9274d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.drawscope.i f9275e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.graphics.t1 t1Var, long j4, long j5, androidx.compose.ui.graphics.drawscope.i iVar) {
            super(1);
            this.f9272b = t1Var;
            this.f9273c = j4;
            this.f9274d = j5;
            this.f9275e = iVar;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
            cVar.G6();
            androidx.compose.ui.graphics.drawscope.f.a4(cVar, this.f9272b, this.f9273c, this.f9274d, 0.0f, this.f9275e, null, 0, 104, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.c cVar) {
            a(cVar);
            return kotlin.k2.f75408a;
        }
    }

    public static final androidx.compose.ui.draw.m b(androidx.compose.ui.draw.g gVar) {
        return gVar.p(a.f9271b);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q e(@fg.l androidx.compose.ui.q qVar, @fg.l c0 c0Var, @fg.l e6 e6Var) {
        return i(qVar, c0Var.getWidth(), c0Var.getBrush(), e6Var);
    }

    public static /* synthetic */ androidx.compose.ui.q f(androidx.compose.ui.q qVar, c0 c0Var, e6 e6Var, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            e6Var = r5.a();
        }
        return e(qVar, c0Var, e6Var);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q g(@fg.l androidx.compose.ui.q qVar, float f4, long j4, @fg.l e6 e6Var) {
        return i(qVar, f4, new g6(j4, null), e6Var);
    }

    public static /* synthetic */ androidx.compose.ui.q h(androidx.compose.ui.q qVar, float f4, long j4, e6 e6Var, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            e6Var = r5.a();
        }
        return g(qVar, f4, j4, e6Var);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q i(@fg.l androidx.compose.ui.q qVar, float f4, @fg.l androidx.compose.ui.graphics.t1 t1Var, @fg.l e6 e6Var) {
        return qVar.w3(new BorderModifierNodeElement(f4, t1Var, e6Var, null));
    }

    private static final i0.l j(float f4, i0.l lVar) {
        return new i0.l(f4, f4, lVar.v() - f4, lVar.p() - f4, n(lVar.t(), f4), n(lVar.u(), f4), n(lVar.o(), f4), n(lVar.n(), f4), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g5 k(g5 g5Var, i0.l lVar, float f4, boolean z4) {
        g5Var.reset();
        g5Var.r(lVar);
        if (!z4) {
            g5 a5 = androidx.compose.ui.graphics.a1.a();
            a5.r(j(f4, lVar));
            k5.INSTANCE.getClass();
            g5Var.u(g5Var, a5, k5.f17900c);
        }
        return g5Var;
    }

    private static final androidx.compose.ui.draw.m l(androidx.compose.ui.draw.g gVar) {
        return gVar.p(a.f9271b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.draw.m m(androidx.compose.ui.draw.g gVar, androidx.compose.ui.graphics.t1 t1Var, long j4, long j5, boolean z4, float f4) {
        long j6;
        if (z4) {
            i0.f.INSTANCE.getClass();
            j6 = i0.f.f74147c;
        } else {
            j6 = j4;
        }
        return gVar.p(new b(t1Var, j6, z4 ? gVar.e() : j5, z4 ? androidx.compose.ui.graphics.drawscope.m.f17797a : new androidx.compose.ui.graphics.drawscope.n(f4, 0.0f, 0, 0, null, 30, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j4, float f4) {
        return i0.b.a(Math.max(0.0f, i0.a.m(j4) - f4), Math.max(0.0f, i0.a.o(j4) - f4));
    }
}
