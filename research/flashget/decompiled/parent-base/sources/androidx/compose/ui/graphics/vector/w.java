package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.i2;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.e2;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: VectorPainter.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R1\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010!\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R+\u00106\u001a\u0002002\u0006\u0010\u0014\u001a\u0002008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R(\u0010E\u001a\u0004\u0018\u00010\u000f2\b\u0010@\u001a\u0004\u0018\u00010\u000f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR*\u0010H\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u00138@@@X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bF\u0010\u0018\"\u0004\bG\u0010\u001aR$\u0010N\u001a\u00020I2\u0006\u0010@\u001a\u00020I8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010Q\u001a\u00020O8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bP\u00103R\u001a\u0010R\u001a\u00020\u00138VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b#\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, d2 = {"Landroidx/compose/ui/graphics/vector/w;", "Landroidx/compose/ui/graphics/painter/e;", "Landroidx/compose/ui/graphics/vector/c;", "root", "<init>", "(Landroidx/compose/ui/graphics/vector/c;)V", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "k", "(Landroidx/compose/ui/graphics/drawscope/f;)V", "", "alpha", "", "a", "(F)Z", "Landroidx/compose/ui/graphics/e2;", "colorFilter", "b", "(Landroidx/compose/ui/graphics/e2;)Z", "Li0/n;", "<set-?>", "g", "Landroidx/compose/runtime/k2;", "u", "()J", "C", "(J)V", "size", "h", "o", "()Z", "x", "(Z)V", "autoMirror", "Landroidx/compose/ui/graphics/vector/p;", "i", "Landroidx/compose/ui/graphics/vector/p;", "v", "()Landroidx/compose/ui/graphics/vector/p;", "vector", "Landroidx/compose/runtime/y;", "j", "Landroidx/compose/runtime/y;", "q", "()Landroidx/compose/runtime/y;", "y", "(Landroidx/compose/runtime/y;)V", "composition", "", "Landroidx/compose/runtime/i2;", "s", "()I", "A", "(I)V", "invalidateCount", "l", "F", "currentAlpha", "m", "Landroidx/compose/ui/graphics/e2;", "currentColorFilter", "n", "I", "drawCount", "value", "r", "()Landroidx/compose/ui/graphics/e2;", "z", "(Landroidx/compose/ui/graphics/e2;)V", "intrinsicColorFilter", "w", "D", "viewportSize", "", "t", "()Ljava/lang/String;", "B", "(Ljava/lang/String;)V", "name", "Landroidx/compose/ui/graphics/t4;", "p", "bitmapConfig", "intrinsicSize", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,516:1\n81#2:517\n107#2,2:518\n81#2:520\n107#2,2:521\n75#3:523\n108#3,2:524\n266#4:526\n267#4:544\n174#5,6:527\n262#5,11:533\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n*L\n189#1:517\n189#1:518,2\n191#1:520\n191#1:521,2\n228#1:523\n228#1:524,2\n242#1:526\n242#1:544\n242#1:527,6\n242#1:533,11\n*E\n"})
/* loaded from: classes.dex */
public final class w extends androidx.compose.ui.graphics.painter.e {

    /* renamed from: o, reason: collision with root package name */
    public static final int f18388o = 8;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 size;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 autoMirror;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final p vector;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.runtime.y composition;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i2 invalidateCount;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float currentAlpha;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private e2 currentColorFilter;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int drawCount;

    /* compiled from: VectorPainter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<kotlin.k2> {
        a() {
            super(0);
        }

        public final void a() {
            if (w.this.drawCount == w.m(w.this)) {
                w wVar = w.this;
                wVar.A(w.m(wVar) + 1);
            }
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(int i4) {
        this.invalidateCount.k(i4);
    }

    public static final int m(w wVar) {
        return wVar.invalidateCount.f();
    }

    private final int s() {
        return this.invalidateCount.f();
    }

    public final void B(@fg.l String str) {
        this.vector.r(str);
    }

    public final void C(long j4) {
        this.size.setValue(i0.n.c(j4));
    }

    public final void D(long j4) {
        this.vector.s(j4);
    }

    @Override // androidx.compose.ui.graphics.painter.e
    protected boolean a(float alpha) {
        this.currentAlpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    protected boolean b(@fg.m e2 colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    /* renamed from: i */
    public long getIntrinsicSize() {
        return u();
    }

    @Override // androidx.compose.ui.graphics.painter.e
    protected void k(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
        p pVar = this.vector;
        e2 e2Var = this.currentColorFilter;
        if (e2Var == null) {
            e2Var = pVar.k();
        }
        if (o() && fVar.getLayoutDirection() == androidx.compose.ui.unit.w.Rtl) {
            long c02 = fVar.c0();
            androidx.compose.ui.graphics.drawscope.d drawContext = fVar.getDrawContext();
            long e4 = drawContext.e();
            drawContext.i().C();
            drawContext.getTransform().i(-1.0f, 1.0f, c02);
            pVar.i(fVar, this.currentAlpha, e2Var);
            drawContext.i().o();
            drawContext.j(e4);
        } else {
            pVar.i(fVar, this.currentAlpha, e2Var);
        }
        this.drawCount = this.invalidateCount.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean o() {
        return ((Boolean) this.autoMirror.getValue()).booleanValue();
    }

    public final int p() {
        return this.vector.j();
    }

    @fg.m
    /* renamed from: q, reason: from getter */
    public final androidx.compose.runtime.y getComposition() {
        return this.composition;
    }

    @fg.m
    public final e2 r() {
        return this.vector.k();
    }

    @fg.l
    public final String t() {
        return this.vector.getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long u() {
        return ((i0.n) this.size.getValue()).getPackedValue();
    }

    @fg.l
    /* renamed from: v, reason: from getter */
    public final p getVector() {
        return this.vector;
    }

    public final long w() {
        return this.vector.o();
    }

    public final void x(boolean z4) {
        this.autoMirror.setValue(Boolean.valueOf(z4));
    }

    public final void y(@fg.m androidx.compose.runtime.y yVar) {
        this.composition = yVar;
    }

    public final void z(@fg.m e2 e2Var) {
        this.vector.p(e2Var);
    }

    public w(@fg.l c cVar) {
        k2 g4;
        k2 g5;
        i0.n.INSTANCE.getClass();
        g4 = t4.g(i0.n.c(i0.n.f74171c), null, 2, null);
        this.size = g4;
        g5 = t4.g(Boolean.FALSE, null, 2, null);
        this.autoMirror = g5;
        p pVar = new p(cVar);
        pVar.q(new a());
        this.vector = pVar;
        this.invalidateCount = androidx.compose.runtime.b.c(0);
        this.currentAlpha = 1.0f;
        this.drawCount = -1;
    }

    public /* synthetic */ w(c cVar, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? new c() : cVar);
    }
}
