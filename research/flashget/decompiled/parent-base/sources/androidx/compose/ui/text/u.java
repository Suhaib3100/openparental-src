package androidx.compose.ui.text;

import androidx.compose.foundation.w1;
import kotlin.Metadata;

/* compiled from: MultiParagraphIntrinsics.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/u;", "", "Landroidx/compose/ui/text/v;", "intrinsics", "", "startIndex", "endIndex", "<init>", "(Landroidx/compose/ui/text/v;II)V", "a", "()Landroidx/compose/ui/text/v;", "b", "()I", "c", "d", "(Landroidx/compose/ui/text/v;II)Landroidx/compose/ui/text/u;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/text/v;", "g", "I", "h", "f", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class u {

    /* renamed from: d, reason: collision with root package name */
    public static final int f21419d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final v intrinsics;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startIndex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int endIndex;

    public u(@fg.l v vVar, int i4, int i5) {
        this.intrinsics = vVar;
        this.startIndex = i4;
        this.endIndex = i5;
    }

    public static u e(u uVar, v vVar, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            vVar = uVar.intrinsics;
        }
        if ((i6 & 2) != 0) {
            i4 = uVar.startIndex;
        }
        if ((i6 & 4) != 0) {
            i5 = uVar.endIndex;
        }
        uVar.getClass();
        return new u(vVar, i4, i5);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final v getIntrinsics() {
        return this.intrinsics;
    }

    /* renamed from: b, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    /* renamed from: c, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    @fg.l
    public final u d(@fg.l v intrinsics, int startIndex, int endIndex) {
        return new u(intrinsics, startIndex, endIndex);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof u)) {
            return false;
        }
        u uVar = (u) other;
        return kotlin.jvm.internal.l0.g(this.intrinsics, uVar.intrinsics) && this.startIndex == uVar.startIndex && this.endIndex == uVar.endIndex;
    }

    public final int f() {
        return this.endIndex;
    }

    @fg.l
    public final v g() {
        return this.intrinsics;
    }

    public final int h() {
        return this.startIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.endIndex) + w1.a(this.startIndex, this.intrinsics.hashCode() * 31, 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.intrinsics);
        sb.append(", startIndex=");
        sb.append(this.startIndex);
        sb.append(", endIndex=");
        return androidx.view.e.a(sb, this.endIndex, ')');
    }
}
