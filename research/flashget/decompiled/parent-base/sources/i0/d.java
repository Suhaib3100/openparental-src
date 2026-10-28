package i0;

import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: MutableRect.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\bJ\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001f\u0010\u0018R\u0012\u0010!\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b \u0010\u0016R\u0012\u0010\"\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010&\u001a\u00020#8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010)\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Li0/d;", "", "", "left", "top", "right", "bottom", "<init>", "(FFFF)V", "Lkotlin/k2;", "i", "Li0/f;", "offset", "", "a", "(J)Z", "k", "", "toString", "()Ljava/lang/String;", "F", "d", "()F", "m", "(F)V", "b", "g", "o", "c", "e", "n", "l", "h", "width", "height", "Li0/n;", "f", "()J", "size", "j", "()Z", "isEmpty", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMutableRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n1#1,102:1\n40#1,5:103\n*S KotlinDebug\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n51#1:103,5\n*E\n"})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final int f74141e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float left;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float top;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float right;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float bottom;

    public d(float f4, float f5, float f6, float f7) {
        this.left = f4;
        this.top = f5;
        this.right = f6;
        this.bottom = f7;
    }

    public final boolean a(long offset) {
        return f.p(offset) >= this.left && f.p(offset) < this.right && f.r(offset) >= this.top && f.r(offset) < this.bottom;
    }

    /* renamed from: b, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    public final float c() {
        return this.bottom - this.top;
    }

    /* renamed from: d, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* renamed from: e, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    public final long f() {
        return o.a(this.right - this.left, this.bottom - this.top);
    }

    /* renamed from: g, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    public final float h() {
        return this.right - this.left;
    }

    @x4
    public final void i(float left, float top2, float right, float bottom) {
        this.left = Math.max(left, this.left);
        this.top = Math.max(top2, this.top);
        this.right = Math.min(right, this.right);
        this.bottom = Math.min(bottom, this.bottom);
    }

    public final boolean j() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final void k(float left, float top2, float right, float bottom) {
        this.left = left;
        this.top = top2;
        this.right = right;
        this.bottom = bottom;
    }

    public final void l(float f4) {
        this.bottom = f4;
    }

    public final void m(float f4) {
        this.left = f4;
    }

    public final void n(float f4) {
        this.right = f4;
    }

    public final void o(float f4) {
        this.top = f4;
    }

    @fg.l
    public String toString() {
        return "MutableRect(" + c.a(this.left, 1) + ", " + c.a(this.top, 1) + ", " + c.a(this.right, 1) + ", " + c.a(this.bottom, 1) + ')';
    }
}
