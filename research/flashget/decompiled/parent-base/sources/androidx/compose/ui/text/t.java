package androidx.compose.ui.text;

import androidx.compose.foundation.w1;
import androidx.compose.ui.graphics.g5;
import kotlin.Metadata;

/* compiled from: MultiParagraph.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u0011\u0010\u0011\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000fJ\u0011\u0010\u0012\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u000fJ\u0011\u0010\u0013\u001a\u00020\t*\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\t*\u00020\t¢\u0006\u0004\b\u0015\u0010\u0014J\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u00020\u001c*\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010 \u001a\u00020\u001f*\u00020\u001fø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b*\u0010)JV\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u0010$J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u00105\u001a\u0004\b6\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u00107\u001a\u0004\b8\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u00107\u001a\u0004\b9\u0010$R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00107\u001a\u0004\b:\u0010$\"\u0004\b;\u0010<R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00107\u001a\u0004\b=\u0010$\"\u0004\b>\u0010<R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010?\u001a\u0004\b@\u0010)\"\u0004\bA\u0010BR\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010?\u001a\u0004\bC\u0010)\"\u0004\bD\u0010BR\u0011\u0010F\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bE\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"Landroidx/compose/ui/text/t;", "", "Landroidx/compose/ui/text/s;", "paragraph", "", "startIndex", "endIndex", "startLineIndex", "endLineIndex", "", "top", "bottom", "<init>", "(Landroidx/compose/ui/text/s;IIIIFF)V", "C", "(I)I", "y", "D", "z", "A", "(F)F", "E", "Li0/f;", "B", "(J)J", "Li0/i;", "w", "(Li0/i;)Li0/i;", "Landroidx/compose/ui/graphics/g5;", "v", "(Landroidx/compose/ui/graphics/g5;)Landroidx/compose/ui/graphics/g5;", "Landroidx/compose/ui/text/t0;", "x", "a", "()Landroidx/compose/ui/text/s;", "b", "()I", "c", "d", "e", "f", "()F", "g", "h", "(Landroidx/compose/ui/text/s;IIIIFF)Landroidx/compose/ui/text/t;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/text/s;", "n", "I", "o", "k", "p", "t", "(I)V", "l", "s", "F", "q", "u", "(F)V", "j", "r", "m", "length", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class t {

    /* renamed from: h, reason: collision with root package name */
    public static final int f21408h = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final s paragraph;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startIndex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int endIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int startLineIndex;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int endLineIndex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float top;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float bottom;

    public t(@fg.l s sVar, int i4, int i5, int i6, int i7, float f4, float f5) {
        this.paragraph = sVar;
        this.startIndex = i4;
        this.endIndex = i5;
        this.startLineIndex = i6;
        this.endLineIndex = i7;
        this.top = f4;
        this.bottom = f5;
    }

    public static t i(t tVar, s sVar, int i4, int i5, int i6, int i7, float f4, float f5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sVar = tVar.paragraph;
        }
        if ((i10 & 2) != 0) {
            i4 = tVar.startIndex;
        }
        int i11 = i4;
        if ((i10 & 4) != 0) {
            i5 = tVar.endIndex;
        }
        int i12 = i5;
        if ((i10 & 8) != 0) {
            i6 = tVar.startLineIndex;
        }
        int i13 = i6;
        if ((i10 & 16) != 0) {
            i7 = tVar.endLineIndex;
        }
        int i14 = i7;
        if ((i10 & 32) != 0) {
            f4 = tVar.top;
        }
        float f6 = f4;
        if ((i10 & 64) != 0) {
            f5 = tVar.bottom;
        }
        tVar.getClass();
        return new t(sVar, i11, i12, i13, i14, f6, f5);
    }

    public final float A(float f4) {
        return f4 + this.top;
    }

    public final long B(long j4) {
        return i0.g.a(i0.f.p(j4), i0.f.r(j4) - this.top);
    }

    public final int C(int i4) {
        return kotlin.ranges.s.I(i4, this.startIndex, this.endIndex) - this.startIndex;
    }

    public final int D(int i4) {
        return i4 - this.startLineIndex;
    }

    public final float E(float f4) {
        return f4 - this.top;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final s getParagraph() {
        return this.paragraph;
    }

    /* renamed from: b, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    /* renamed from: c, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    /* renamed from: d, reason: from getter */
    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    /* renamed from: e, reason: from getter */
    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof t)) {
            return false;
        }
        t tVar = (t) other;
        return kotlin.jvm.internal.l0.g(this.paragraph, tVar.paragraph) && this.startIndex == tVar.startIndex && this.endIndex == tVar.endIndex && this.startLineIndex == tVar.startLineIndex && this.endLineIndex == tVar.endLineIndex && Float.compare(this.top, tVar.top) == 0 && Float.compare(this.bottom, tVar.bottom) == 0;
    }

    /* renamed from: f, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: g, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    @fg.l
    public final t h(@fg.l s paragraph, int startIndex, int endIndex, int startLineIndex, int endLineIndex, float top2, float bottom) {
        return new t(paragraph, startIndex, endIndex, startLineIndex, endLineIndex, top2, bottom);
    }

    public int hashCode() {
        return Float.hashCode(this.bottom) + androidx.compose.animation.l0.a(this.top, w1.a(this.endLineIndex, w1.a(this.startLineIndex, w1.a(this.endIndex, w1.a(this.startIndex, this.paragraph.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final float j() {
        return this.bottom;
    }

    public final int k() {
        return this.endIndex;
    }

    public final int l() {
        return this.endLineIndex;
    }

    public final int m() {
        return this.endIndex - this.startIndex;
    }

    @fg.l
    public final s n() {
        return this.paragraph;
    }

    public final int o() {
        return this.startIndex;
    }

    public final int p() {
        return this.startLineIndex;
    }

    public final float q() {
        return this.top;
    }

    public final void r(float f4) {
        this.bottom = f4;
    }

    public final void s(int i4) {
        this.endLineIndex = i4;
    }

    public final void t(int i4) {
        this.startLineIndex = i4;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.paragraph);
        sb.append(", startIndex=");
        sb.append(this.startIndex);
        sb.append(", endIndex=");
        sb.append(this.endIndex);
        sb.append(", startLineIndex=");
        sb.append(this.startLineIndex);
        sb.append(", endLineIndex=");
        sb.append(this.endLineIndex);
        sb.append(", top=");
        sb.append(this.top);
        sb.append(", bottom=");
        return androidx.compose.animation.b.a(sb, this.bottom, ')');
    }

    public final void u(float f4) {
        this.top = f4;
    }

    @fg.l
    public final g5 v(@fg.l g5 g5Var) {
        g5Var.n(i0.g.a(0.0f, this.top));
        return g5Var;
    }

    @fg.l
    public final i0.i w(@fg.l i0.i iVar) {
        return iVar.T(i0.g.a(0.0f, this.top));
    }

    public final long x(long j4) {
        int n4 = t0.n(j4);
        int i4 = this.startIndex;
        return u0.b(n4 + i4, ((int) (j4 & 4294967295L)) + i4);
    }

    public final int y(int i4) {
        return i4 + this.startIndex;
    }

    public final int z(int i4) {
        return i4 + this.startLineIndex;
    }

    public /* synthetic */ t(s sVar, int i4, int i5, int i6, int i7, float f4, float f5, int i10, kotlin.jvm.internal.w wVar) {
        this(sVar, i4, i5, (i10 & 8) != 0 ? -1 : i6, (i10 & 16) != 0 ? -1 : i7, (i10 & 32) != 0 ? -1.0f : f4, (i10 & 64) != 0 ? -1.0f : f5);
    }
}
