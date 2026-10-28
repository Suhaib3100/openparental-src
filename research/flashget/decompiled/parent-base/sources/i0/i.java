package i0;

import androidx.compose.animation.l0;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: Rect.kt */
@m1
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u00011B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010'J8\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b+\u0010\u001dJ\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u0010/\u001a\u00020\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010'R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u00102\u0012\u0004\b7\u00105\u001a\u0004\b6\u0010'R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u00102\u0012\u0004\b9\u00105\u001a\u0004\b8\u0010'R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u00102\u0012\u0004\b;\u00105\u001a\u0004\b:\u0010'R\u001a\u0010>\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u00105\u001a\u0004\b<\u0010'R\u001a\u0010A\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b@\u00105\u001a\u0004\b?\u0010'R \u0010F\u001a\u00020B8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bE\u00105\u001a\u0004\bC\u0010DR\u001a\u0010J\u001a\u00020\u001e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bI\u00105\u001a\u0004\bG\u0010HR\u001a\u0010M\u001a\u00020\u001e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bL\u00105\u001a\u0004\bK\u0010HR\u001a\u0010P\u001a\u00020\u001e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bO\u00105\u001a\u0004\bN\u0010HR\u0011\u0010R\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bQ\u0010'R\u0011\u0010T\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bS\u0010'R\u0017\u0010V\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bU\u0010DR\u0017\u0010X\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bW\u0010DR\u0017\u0010Y\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b2\u0010DR\u0017\u0010[\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bZ\u0010DR\u0017\u0010]\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\\\u0010DR\u0017\u0010_\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b^\u0010DR\u0017\u0010a\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b`\u0010DR\u0017\u0010c\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bb\u0010DR\u0017\u0010e\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bd\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006f"}, d2 = {"Li0/i;", "", "", "left", "top", "right", "bottom", "<init>", "(FFFF)V", "Li0/f;", "offset", "T", "(J)Li0/i;", "translateX", "translateY", "S", "(FF)Li0/i;", "delta", "I", "(F)Li0/i;", "i", "other", "K", "(Li0/i;)Li0/i;", "otherLeft", "otherTop", "otherRight", "otherBottom", "J", "(FFFF)Li0/i;", "", "R", "(Li0/i;)Z", "f", "(J)Z", "", "toString", "()Ljava/lang/String;", "b", "()F", "c", "d", "e", "g", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", "F", "t", "u", "()V", "B", "C", "x", "y", "j", "k", "G", "H", "width", "r", "s", "height", "Li0/n;", "z", "()J", "A", "size", "P", "()Z", "Q", "isInfinite", "N", "O", "isFinite", "L", "M", "isEmpty", "w", "minDimension", "v", "maxDimension", "E", "topLeft", "D", "topCenter", "topRight", "p", "centerLeft", "o", "center", "q", "centerRight", "m", "bottomLeft", "l", "bottomCenter", "n", "bottomRight", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class i {

    /* renamed from: f, reason: collision with root package name */
    public static final int f74152f = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float left;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float top;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float right;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float bottom;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final i f74153g = new i(0.0f, 0.0f, 0.0f, 0.0f);

    /* compiled from: Rect.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Li0/i$a;", "", "<init>", "()V", "Li0/i;", "Zero", "Li0/i;", "a", "()Li0/i;", "b", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i0.i$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @x4
        public static /* synthetic */ void b() {
        }

        @fg.l
        public final i a() {
            return i.f74153g;
        }

        public Companion(w wVar) {
        }
    }

    public i(float f4, float f5, float f6, float f7) {
        this.left = f4;
        this.top = f5;
        this.right = f6;
        this.bottom = f7;
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
    public static /* synthetic */ void M() {
    }

    @x4
    public static /* synthetic */ void O() {
    }

    @x4
    public static /* synthetic */ void Q() {
    }

    public static i h(i iVar, float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = iVar.left;
        }
        if ((i4 & 2) != 0) {
            f5 = iVar.top;
        }
        if ((i4 & 4) != 0) {
            f6 = iVar.right;
        }
        if ((i4 & 8) != 0) {
            f7 = iVar.bottom;
        }
        iVar.getClass();
        return new i(f4, f5, f6, f7);
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
    public final float getTop() {
        return this.top;
    }

    public final long D() {
        return g.a((G() / 2.0f) + this.left, this.top);
    }

    public final long E() {
        return g.a(this.left, this.top);
    }

    public final long F() {
        return g.a(this.right, this.top);
    }

    public final float G() {
        return this.right - this.left;
    }

    @x4
    @fg.l
    public final i I(float delta) {
        return new i(this.left - delta, this.top - delta, this.right + delta, this.bottom + delta);
    }

    @x4
    @fg.l
    public final i J(float otherLeft, float otherTop, float otherRight, float otherBottom) {
        return new i(Math.max(this.left, otherLeft), Math.max(this.top, otherTop), Math.min(this.right, otherRight), Math.min(this.bottom, otherBottom));
    }

    @x4
    @fg.l
    public final i K(@fg.l i other) {
        return new i(Math.max(this.left, other.left), Math.max(this.top, other.top), Math.min(this.right, other.right), Math.min(this.bottom, other.bottom));
    }

    public final boolean L() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final boolean N() {
        float f4 = this.left;
        if (!Float.isInfinite(f4) && !Float.isNaN(f4)) {
            float f5 = this.top;
            if (!Float.isInfinite(f5) && !Float.isNaN(f5)) {
                float f6 = this.right;
                if (!Float.isInfinite(f6) && !Float.isNaN(f6)) {
                    float f7 = this.bottom;
                    if (!Float.isInfinite(f7) && !Float.isNaN(f7)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean P() {
        return this.left >= Float.POSITIVE_INFINITY || this.top >= Float.POSITIVE_INFINITY || this.right >= Float.POSITIVE_INFINITY || this.bottom >= Float.POSITIVE_INFINITY;
    }

    public final boolean R(@fg.l i other) {
        return this.right > other.left && other.right > this.left && this.bottom > other.top && other.bottom > this.top;
    }

    @x4
    @fg.l
    public final i S(float translateX, float translateY) {
        return new i(this.left + translateX, this.top + translateY, this.right + translateX, this.bottom + translateY);
    }

    @x4
    @fg.l
    public final i T(long offset) {
        return new i(f.p(offset) + this.left, f.r(offset) + this.top, f.p(offset) + this.right, f.r(offset) + this.bottom);
    }

    /* renamed from: b, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    public final float c() {
        return this.top;
    }

    /* renamed from: d, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* renamed from: e, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return Float.compare(this.left, iVar.left) == 0 && Float.compare(this.top, iVar.top) == 0 && Float.compare(this.right, iVar.right) == 0 && Float.compare(this.bottom, iVar.bottom) == 0;
    }

    public final boolean f(long offset) {
        return f.p(offset) >= this.left && f.p(offset) < this.right && f.r(offset) >= this.top && f.r(offset) < this.bottom;
    }

    @fg.l
    public final i g(float left, float top2, float right, float bottom) {
        return new i(left, top2, right, bottom);
    }

    public int hashCode() {
        return Float.hashCode(this.bottom) + l0.a(this.right, l0.a(this.top, Float.hashCode(this.left) * 31, 31), 31);
    }

    @x4
    @fg.l
    public final i i(float delta) {
        return I(-delta);
    }

    public final float j() {
        return this.bottom;
    }

    public final long l() {
        return g.a((G() / 2.0f) + this.left, this.bottom);
    }

    public final long m() {
        return g.a(this.left, this.bottom);
    }

    public final long n() {
        return g.a(this.right, this.bottom);
    }

    public final long o() {
        return g.a((G() / 2.0f) + this.left, (r() / 2.0f) + this.top);
    }

    public final long p() {
        return g.a(this.left, (r() / 2.0f) + this.top);
    }

    public final long q() {
        return g.a(this.right, (r() / 2.0f) + this.top);
    }

    public final float r() {
        return this.bottom - this.top;
    }

    public final float t() {
        return this.left;
    }

    @fg.l
    public String toString() {
        return "Rect.fromLTRB(" + c.a(this.left, 1) + ", " + c.a(this.top, 1) + ", " + c.a(this.right, 1) + ", " + c.a(this.bottom, 1) + ')';
    }

    public final float v() {
        return Math.max(Math.abs(G()), Math.abs(r()));
    }

    public final float w() {
        return Math.min(Math.abs(G()), Math.abs(r()));
    }

    public final float x() {
        return this.right;
    }

    public final long z() {
        return o.a(G(), r());
    }
}
