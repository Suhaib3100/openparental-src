package androidx.window.core;

import android.graphics.Rect;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Bounds.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u001e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\"\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b#\u0010!¨\u0006%"}, d2 = {"Landroidx/window/core/b;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "Landroid/graphics/Rect;", "rect", "(Landroid/graphics/Rect;)V", "i", "()Landroid/graphics/Rect;", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "c", "b", "e", "d", "f", "width", "height", "g", "()Z", "isEmpty", "h", "isZero", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int left;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int top;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int right;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int bottom;

    public b(int i4, int i5, int i6, int i7) {
        this.left = i4;
        this.top = i5;
        this.right = i6;
        this.bottom = i7;
    }

    /* renamed from: a, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    public final int b() {
        return this.bottom - this.top;
    }

    /* renamed from: c, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* renamed from: d, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* renamed from: e, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!l0.g(b.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        b bVar = (b) other;
        return this.left == bVar.left && this.top == bVar.top && this.right == bVar.right && this.bottom == bVar.bottom;
    }

    public final int f() {
        return this.right - this.left;
    }

    public final boolean g() {
        return b() == 0 || f() == 0;
    }

    public final boolean h() {
        return b() == 0 && f() == 0;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    @l
    public final Rect i() {
        return new Rect(this.left, this.top, this.right, this.bottom);
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) b.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.left);
        sb.append(',');
        sb.append(this.top);
        sb.append(',');
        sb.append(this.right);
        sb.append(',');
        return android.support.v4.media.b.a(sb, this.bottom, "] }");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@l Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        l0.p(rect, "rect");
    }
}
