package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.drawscope.f;
import androidx.compose.ui.graphics.e2;
import androidx.compose.ui.graphics.m4;
import androidx.compose.ui.graphics.s4;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.u;
import androidx.compose.ui.unit.v;
import fg.l;
import fg.m;
import i0.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: BitmapPainter.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u0010&R(\u0010.\u001a\u00020(8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00100R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u00101R\u001a\u00104\u001a\u0002028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b'\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/ui/graphics/painter/a;", "Landroidx/compose/ui/graphics/painter/e;", "Landroidx/compose/ui/graphics/s4;", "image", "Landroidx/compose/ui/unit/q;", "srcOffset", "Landroidx/compose/ui/unit/u;", "srcSize", "<init>", "(Landroidx/compose/ui/graphics/s4;JJLkotlin/jvm/internal/w;)V", "n", "(JJ)J", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "k", "(Landroidx/compose/ui/graphics/drawscope/f;)V", "", "alpha", "", "a", "(F)Z", "Landroidx/compose/ui/graphics/e2;", "colorFilter", "b", "(Landroidx/compose/ui/graphics/e2;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "g", "Landroidx/compose/ui/graphics/s4;", "h", "J", "i", "Landroidx/compose/ui/graphics/m4;", "j", "I", "l", "m", "(I)V", "filterQuality", "size", "F", "Landroidx/compose/ui/graphics/e2;", "Li0/n;", "()J", "intrinsicSize", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private final s4 image;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long srcOffset;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long srcSize;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int filterQuality;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @m
    private e2 colorFilter;

    public /* synthetic */ a(s4 s4Var, long j4, long j5, w wVar) {
        this(s4Var, j4, j5);
    }

    private final long n(long srcOffset, long srcSize) {
        int i4;
        if (q.m(srcOffset) < 0 || ((int) (srcOffset & 4294967295L)) < 0 || u.m(srcSize) < 0 || (i4 = (int) (srcSize & 4294967295L)) < 0 || ((int) (srcSize >> 32)) > this.image.getWidth() || i4 > this.image.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return srcSize;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    protected boolean a(float alpha) {
        this.alpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    protected boolean b(@m e2 colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return l0.g(this.image, aVar.image) && q.j(this.srcOffset, aVar.srcOffset) && u.h(this.srcSize, aVar.srcSize) && m4.h(this.filterQuality, aVar.filterQuality);
    }

    public int hashCode() {
        return m4.j(this.filterQuality) + ((u.n(this.srcSize) + ((q.p(this.srcOffset) + (this.image.hashCode() * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public long i() {
        return v.f(this.size);
    }

    @Override // androidx.compose.ui.graphics.painter.e
    protected void k(@l f fVar) {
        f.u0(fVar, this.image, this.srcOffset, this.srcSize, 0L, v.a(kotlin.math.b.L0(n.t(fVar.e())), kotlin.math.b.L0(n.m(fVar.e()))), this.alpha, null, this.colorFilter, 0, this.filterQuality, 328, null);
    }

    /* renamed from: l, reason: from getter */
    public final int getFilterQuality() {
        return this.filterQuality;
    }

    public final void m(int i4) {
        this.filterQuality = i4;
    }

    @l
    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((Object) q.u(this.srcOffset)) + ", srcSize=" + ((Object) u.p(this.srcSize)) + ", filterQuality=" + ((Object) m4.k(this.filterQuality)) + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(androidx.compose.ui.graphics.s4 r7, long r8, long r10, int r12, kotlin.jvm.internal.w r13) {
        /*
            r6 = this;
            r13 = r12 & 2
            if (r13 == 0) goto Ld
            androidx.compose.ui.unit.q$a r8 = androidx.compose.ui.unit.q.INSTANCE
            r8.getClass()
            long r8 = androidx.compose.ui.unit.q.a()
        Ld:
            r2 = r8
            r8 = r12 & 4
            if (r8 == 0) goto L1e
            int r8 = r7.getWidth()
            int r9 = r7.getHeight()
            long r10 = androidx.compose.ui.unit.v.a(r8, r9)
        L1e:
            r4 = r10
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.painter.a.<init>(androidx.compose.ui.graphics.s4, long, long, int, kotlin.jvm.internal.w):void");
    }

    private a(s4 s4Var, long j4, long j5) {
        this.image = s4Var;
        this.srcOffset = j4;
        this.srcSize = j5;
        m4.INSTANCE.getClass();
        this.filterQuality = m4.f17930d;
        this.size = n(j4, j5);
        this.alpha = 1.0f;
    }
}
