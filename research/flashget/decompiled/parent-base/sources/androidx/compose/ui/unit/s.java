package androidx.compose.ui.unit;

import androidx.compose.foundation.w1;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: IntRect.kt */
@m1
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001*B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J8\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010!J\u001a\u0010(\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u0012\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010!R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u0012\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010!R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0012\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010!R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u0012\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010!R\u001a\u00106\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010!R\u001a\u00109\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u0010-\u001a\u0004\b7\u0010!R \u0010>\u001a\u00020:8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b=\u0010-\u001a\u0004\b;\u0010<R\u001a\u0010B\u001a\u00020\u00188FX\u0087\u0004¢\u0006\f\u0012\u0004\bA\u0010-\u001a\u0004\b?\u0010@R\u0011\u0010D\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bC\u0010!R\u0011\u0010F\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bE\u0010!R\u0017\u0010H\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bG\u0010<R\u0017\u0010J\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bI\u0010<R\u0017\u0010L\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bK\u0010<R\u0017\u0010N\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bM\u0010<R\u0017\u0010P\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bO\u0010<R\u0017\u0010R\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bQ\u0010<R\u0017\u0010T\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bS\u0010<R\u0017\u0010V\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bU\u0010<R\u0017\u0010X\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bW\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Landroidx/compose/ui/unit/s;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "Landroidx/compose/ui/unit/q;", "offset", "O", "(J)Landroidx/compose/ui/unit/s;", "translateX", "translateY", "N", "(II)Landroidx/compose/ui/unit/s;", "delta", "I", "(I)Landroidx/compose/ui/unit/s;", "i", "other", "J", "(Landroidx/compose/ui/unit/s;)Landroidx/compose/ui/unit/s;", "", "M", "(Landroidx/compose/ui/unit/s;)Z", "f", "(J)Z", "", "toString", "()Ljava/lang/String;", "b", "()I", "c", "d", "e", "g", "(IIII)Landroidx/compose/ui/unit/s;", "hashCode", "equals", "(Ljava/lang/Object;)Z", "a", "t", "u", "()V", "B", "C", "x", "y", "j", "k", "G", "H", "width", "r", "s", "height", "Landroidx/compose/ui/unit/u;", "z", "()J", "A", "size", "K", "()Z", "L", "isEmpty", "w", "minDimension", "v", "maxDimension", "E", "topLeft", "D", "topCenter", "F", "topRight", "p", "centerLeft", "o", "center", "q", "centerRight", "m", "bottomLeft", "l", "bottomCenter", "n", "bottomRight", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class s {

    /* renamed from: f, reason: collision with root package name */
    public static final int f21522f = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int left;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int top;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int right;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int bottom;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final s f21523g = new s(0, 0, 0, 0);

    /* compiled from: IntRect.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/unit/s$a;", "", "<init>", "()V", "Landroidx/compose/ui/unit/s;", "Zero", "Landroidx/compose/ui/unit/s;", "a", "()Landroidx/compose/ui/unit/s;", "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.unit.s$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @x4
        public static /* synthetic */ void b() {
        }

        @fg.l
        public final s a() {
            return s.f21523g;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public s(int i4, int i5, int i6, int i7) {
        this.left = i4;
        this.top = i5;
        this.right = i6;
        this.bottom = i7;
    }

    @x4
    public static /* synthetic */ void A() {
    }

    @x4
    public static /* synthetic */ void C() {
    }

    @x4
    public static /* synthetic */ void H() {
    }

    @x4
    public static /* synthetic */ void L() {
    }

    public static s h(s sVar, int i4, int i5, int i6, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = sVar.left;
        }
        if ((i10 & 2) != 0) {
            i5 = sVar.top;
        }
        if ((i10 & 4) != 0) {
            i6 = sVar.right;
        }
        if ((i10 & 8) != 0) {
            i7 = sVar.bottom;
        }
        sVar.getClass();
        return new s(i4, i5, i6, i7);
    }

    @x4
    public static /* synthetic */ void k() {
    }

    @x4
    public static /* synthetic */ void s() {
    }

    @x4
    public static /* synthetic */ void u() {
    }

    @x4
    public static /* synthetic */ void y() {
    }

    /* renamed from: B, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    public final long D() {
        return r.a((G() / 2) + this.left, this.top);
    }

    public final long E() {
        return r.a(this.left, this.top);
    }

    public final long F() {
        return r.a(this.right, this.top);
    }

    public final int G() {
        return this.right - this.left;
    }

    @x4
    @fg.l
    public final s I(int delta) {
        return new s(this.left - delta, this.top - delta, this.right + delta, this.bottom + delta);
    }

    @x4
    @fg.l
    public final s J(@fg.l s other) {
        return new s(Math.max(this.left, other.left), Math.max(this.top, other.top), Math.min(this.right, other.right), Math.min(this.bottom, other.bottom));
    }

    public final boolean K() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final boolean M(@fg.l s other) {
        return this.right > other.left && other.right > this.left && this.bottom > other.top && other.bottom > this.top;
    }

    @x4
    @fg.l
    public final s N(int translateX, int translateY) {
        return new s(this.left + translateX, this.top + translateY, this.right + translateX, this.bottom + translateY);
    }

    @x4
    @fg.l
    public final s O(long offset) {
        int i4 = (int) (4294967295L & offset);
        return new s(q.m(offset) + this.left, this.top + i4, this.right + ((int) (offset >> 32)), this.bottom + i4);
    }

    /* renamed from: b, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    public final int c() {
        return this.top;
    }

    /* renamed from: d, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* renamed from: e, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof s)) {
            return false;
        }
        s sVar = (s) other;
        return this.left == sVar.left && this.top == sVar.top && this.right == sVar.right && this.bottom == sVar.bottom;
    }

    public final boolean f(long offset) {
        int i4;
        return q.m(offset) >= this.left && ((int) (offset >> 32)) < this.right && (i4 = (int) (offset & 4294967295L)) >= this.top && i4 < this.bottom;
    }

    @fg.l
    public final s g(int left, int top2, int right, int bottom) {
        return new s(left, top2, right, bottom);
    }

    public int hashCode() {
        return Integer.hashCode(this.bottom) + w1.a(this.right, w1.a(this.top, Integer.hashCode(this.left) * 31, 31), 31);
    }

    @x4
    @fg.l
    public final s i(int delta) {
        return I(-delta);
    }

    public final int j() {
        return this.bottom;
    }

    public final long l() {
        return r.a((G() / 2) + this.left, this.bottom);
    }

    public final long m() {
        return r.a(this.left, this.bottom);
    }

    public final long n() {
        return r.a(this.right, this.bottom);
    }

    public final long o() {
        return r.a((G() / 2) + this.left, (r() / 2) + this.top);
    }

    public final long p() {
        return r.a(this.left, (r() / 2) + this.top);
    }

    public final long q() {
        return r.a(this.right, (r() / 2) + this.top);
    }

    public final int r() {
        return this.bottom - this.top;
    }

    public final int t() {
        return this.left;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.left);
        sb.append(", ");
        sb.append(this.top);
        sb.append(", ");
        sb.append(this.right);
        sb.append(", ");
        return androidx.view.e.a(sb, this.bottom, ')');
    }

    public final int v() {
        return Math.max(Math.abs(G()), Math.abs(r()));
    }

    public final int w() {
        return Math.min(Math.abs(G()), Math.abs(r()));
    }

    public final int x() {
        return this.right;
    }

    public final long z() {
        return v.a(G(), r());
    }
}
