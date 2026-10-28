package q0;

import androidx.compose.foundation.w1;
import androidx.compose.runtime.internal.u;
import androidx.view.e;
import fg.l;
import fg.m;
import kotlin.Metadata;

/* compiled from: SegmentBreaker.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b \u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b!\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lq0/a;", "", "", "startOffset", "endOffset", "left", "top", "right", "bottom", "<init>", "(IIIIII)V", "a", "()I", "b", "c", "d", "e", "f", "g", "(IIIIII)Lq0/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "m", "j", "k", "n", "l", "i", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class a {

    /* renamed from: g, reason: collision with root package name */
    public static final int f89510g = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int startOffset;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int endOffset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int left;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int top;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int right;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int bottom;

    public a(int i4, int i5, int i6, int i7, int i10, int i11) {
        this.startOffset = i4;
        this.endOffset = i5;
        this.left = i6;
        this.top = i7;
        this.right = i10;
        this.bottom = i11;
    }

    public static a h(a aVar, int i4, int i5, int i6, int i7, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i4 = aVar.startOffset;
        }
        if ((i12 & 2) != 0) {
            i5 = aVar.endOffset;
        }
        int i13 = i5;
        if ((i12 & 4) != 0) {
            i6 = aVar.left;
        }
        int i14 = i6;
        if ((i12 & 8) != 0) {
            i7 = aVar.top;
        }
        int i15 = i7;
        if ((i12 & 16) != 0) {
            i10 = aVar.right;
        }
        int i16 = i10;
        if ((i12 & 32) != 0) {
            i11 = aVar.bottom;
        }
        aVar.getClass();
        return new a(i4, i13, i14, i15, i16, i11);
    }

    /* renamed from: a, reason: from getter */
    public final int getStartOffset() {
        return this.startOffset;
    }

    /* renamed from: b, reason: from getter */
    public final int getEndOffset() {
        return this.endOffset;
    }

    /* renamed from: c, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* renamed from: d, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* renamed from: e, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return this.startOffset == aVar.startOffset && this.endOffset == aVar.endOffset && this.left == aVar.left && this.top == aVar.top && this.right == aVar.right && this.bottom == aVar.bottom;
    }

    /* renamed from: f, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    @l
    public final a g(int startOffset, int endOffset, int left, int top2, int right, int bottom) {
        return new a(startOffset, endOffset, left, top2, right, bottom);
    }

    public int hashCode() {
        return Integer.hashCode(this.bottom) + w1.a(this.right, w1.a(this.top, w1.a(this.left, w1.a(this.endOffset, Integer.hashCode(this.startOffset) * 31, 31), 31), 31), 31);
    }

    public final int i() {
        return this.bottom;
    }

    public final int j() {
        return this.endOffset;
    }

    public final int k() {
        return this.left;
    }

    public final int l() {
        return this.right;
    }

    public final int m() {
        return this.startOffset;
    }

    public final int n() {
        return this.top;
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder("Segment(startOffset=");
        sb.append(this.startOffset);
        sb.append(", endOffset=");
        sb.append(this.endOffset);
        sb.append(", left=");
        sb.append(this.left);
        sb.append(", top=");
        sb.append(this.top);
        sb.append(", right=");
        sb.append(this.right);
        sb.append(", bottom=");
        return e.a(sb, this.bottom, ')');
    }
}
