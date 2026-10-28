package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0005R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/d;", "", "", "loc", "<init>", "(I)V", "Landroidx/compose/runtime/x3;", "slots", "d", "(Landroidx/compose/runtime/x3;)I", "Landroidx/compose/runtime/a4;", "writer", "e", "(Landroidx/compose/runtime/a4;)I", "", "toString", "()Ljava/lang/String;", "a", "I", "()I", "c", "location", "", "b", "()Z", "valid", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final int f16144b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int location;

    public d(int i4) {
        this.location = i4;
    }

    /* renamed from: a, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    public final boolean b() {
        return this.location != Integer.MIN_VALUE;
    }

    public final void c(int i4) {
        this.location = i4;
    }

    public final int d(@fg.l x3 slots) {
        return slots.i(this);
    }

    public final int e(@fg.l a4 writer) {
        return writer.H(this);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return android.support.v4.media.b.a(sb, this.location, " }");
    }
}
