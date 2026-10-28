package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.f2;
import androidx.compose.runtime.m1;
import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;
import kotlin.a2;

/* compiled from: TextSelectionColors.kt */
@m1
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/text/selection/x0;", "", "Landroidx/compose/ui/graphics/d2;", "handleColor", "backgroundColor", "<init>", "(JJLkotlin/jvm/internal/w;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f8182c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long handleColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long backgroundColor;

    public /* synthetic */ x0(long j4, long j5, kotlin.jvm.internal.w wVar) {
        this(j4, j5);
    }

    /* renamed from: a, reason: from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: b, reason: from getter */
    public final long getHandleColor() {
        return this.handleColor;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) other;
        return d2.y(this.handleColor, x0Var.handleColor) && a2.o(this.backgroundColor, x0Var.backgroundColor);
    }

    public int hashCode() {
        return a2.u(this.backgroundColor) + (d2.K(this.handleColor) * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        f2.a(this.handleColor, sb, ", selectionBackgroundColor=");
        sb.append((Object) d2.L(this.backgroundColor));
        sb.append(')');
        return sb.toString();
    }

    private x0(long j4, long j5) {
        this.handleColor = j4;
        this.backgroundColor = j5;
    }
}
