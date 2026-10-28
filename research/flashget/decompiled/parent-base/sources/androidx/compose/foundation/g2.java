package androidx.compose.foundation;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: OverscrollConfiguration.android.kt */
@x4
@z0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/g2;", "", "Landroidx/compose/ui/graphics/d2;", "glowColor", "Landroidx/compose/foundation/layout/l1;", "drawPadding", "<init>", "(JLandroidx/compose/foundation/layout/l1;Lkotlin/jvm/internal/w;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "()J", "Landroidx/compose/foundation/layout/l1;", "()Landroidx/compose/foundation/layout/l1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f3725c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long glowColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.layout.l1 drawPadding;

    public /* synthetic */ g2(long j4, androidx.compose.foundation.layout.l1 l1Var, kotlin.jvm.internal.w wVar) {
        this(j4, l1Var);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final androidx.compose.foundation.layout.l1 getDrawPadding() {
        return this.drawPadding;
    }

    /* renamed from: b, reason: from getter */
    public final long getGlowColor() {
        return this.glowColor;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.l0.g(g2.class, other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l0.n(other, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        g2 g2Var = (g2) other;
        return androidx.compose.ui.graphics.d2.y(this.glowColor, g2Var.glowColor) && kotlin.jvm.internal.l0.g(this.drawPadding, g2Var.drawPadding);
    }

    public int hashCode() {
        return this.drawPadding.hashCode() + (androidx.compose.ui.graphics.d2.K(this.glowColor) * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        f2.a(this.glowColor, sb, ", drawPadding=");
        sb.append(this.drawPadding);
        sb.append(')');
        return sb.toString();
    }

    private g2(long j4, androidx.compose.foundation.layout.l1 l1Var) {
        this.glowColor = j4;
        this.drawPadding = l1Var;
    }

    public /* synthetic */ g2(long j4, androidx.compose.foundation.layout.l1 l1Var, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? androidx.compose.ui.graphics.f2.d(4284900966L) : j4, (i4 & 2) != 0 ? androidx.compose.foundation.layout.j1.c(0.0f, 0.0f, 3, null) : l1Var);
    }
}
