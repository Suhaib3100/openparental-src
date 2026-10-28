package androidx.compose.ui.text.input;

import kotlin.Metadata;

/* compiled from: EditCommand.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/input/y0;", "Landroidx/compose/ui/text/input/p;", "", "start", "end", "<init>", "(II)V", "Landroidx/compose/ui/text/input/s;", "buffer", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/s;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "c", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y0 implements p {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21140c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int start;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int end;

    public y0(int i4, int i5) {
        this.start = i4;
        this.end = i5;
    }

    @Override // androidx.compose.ui.text.input.p
    public void a(@fg.l s buffer) {
        int I = kotlin.ranges.s.I(this.start, 0, buffer.i());
        int I2 = kotlin.ranges.s.I(this.end, 0, buffer.i());
        if (I < I2) {
            buffer.r(I, I2);
        } else {
            buffer.r(I2, I);
        }
    }

    /* renamed from: b, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* renamed from: c, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) other;
        return this.start == y0Var.start && this.end == y0Var.end;
    }

    public int hashCode() {
        return (this.start * 31) + this.end;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.start);
        sb.append(", end=");
        return androidx.view.e.a(sb, this.end, ')');
    }
}
