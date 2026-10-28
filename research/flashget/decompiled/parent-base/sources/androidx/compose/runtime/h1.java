package androidx.compose.runtime;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/h1;", "", "Landroidx/compose/runtime/tooling/b;", "Landroidx/compose/runtime/x3;", "table", "", "start", "end", "<init>", "(Landroidx/compose/runtime/x3;II)V", "Lkotlin/k2;", "e", "()V", "", "hasNext", "()Z", "d", "()Landroidx/compose/runtime/tooling/b;", "b", "Landroidx/compose/runtime/x3;", "c", "()Landroidx/compose/runtime/x3;", "I", "()I", "index", "version", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class h1 implements Iterator<androidx.compose.runtime.tooling.b>, md.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x3 table;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int end;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int version;

    public h1(@fg.l x3 x3Var, int i4, int i5) {
        this.table = x3Var;
        this.end = i5;
        this.index = i4;
        this.version = x3Var.getVersion();
        if (x3Var.getWriter()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void e() {
        if (this.table.getVersion() != this.version) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: b, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final x3 getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    @fg.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public androidx.compose.runtime.tooling.b next() {
        int V;
        e();
        int i4 = this.index;
        V = z3.V(this.table.getGroups(), i4);
        this.index = V + i4;
        return new y3(this.table, i4, this.version);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
