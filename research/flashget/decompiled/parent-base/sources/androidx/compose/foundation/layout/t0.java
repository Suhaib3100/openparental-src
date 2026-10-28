package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: WindowInsets.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/t0;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "b", "d", "c", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f5320e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int left;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int top;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int right;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int bottom;

    public t0(int i4, int i5, int i6, int i7) {
        this.left = i4;
        this.top = i5;
        this.right = i6;
        this.bottom = i7;
    }

    /* renamed from: a, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    /* renamed from: b, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* renamed from: c, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* renamed from: d, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) other;
        return this.left == t0Var.left && this.top == t0Var.top && this.right == t0Var.right && this.bottom == t0Var.bottom;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.left);
        sb.append(", top=");
        sb.append(this.top);
        sb.append(", right=");
        sb.append(this.right);
        sb.append(", bottom=");
        return androidx.view.e.a(sb, this.bottom, ')');
    }
}
