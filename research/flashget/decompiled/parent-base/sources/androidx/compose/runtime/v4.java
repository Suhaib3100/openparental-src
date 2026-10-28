package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/v4;", "", "Landroidx/compose/runtime/tooling/b;", "Landroidx/compose/runtime/x3;", "table", "Landroidx/compose/runtime/j1;", "group", "<init>", "(Landroidx/compose/runtime/x3;Landroidx/compose/runtime/j1;)V", "", "hasNext", "()Z", "d", "()Landroidx/compose/runtime/tooling/b;", "b", "Landroidx/compose/runtime/x3;", "c", "()Landroidx/compose/runtime/x3;", "Landroidx/compose/runtime/j1;", "()Landroidx/compose/runtime/j1;", "", "I", "version", "e", "index", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3745:1\n1#2:3746\n*E\n"})
/* loaded from: classes.dex */
final class v4 implements Iterator<androidx.compose.runtime.tooling.b>, md.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x3 table;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j1 group;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int version;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int index;

    public v4(@fg.l x3 x3Var, @fg.l j1 j1Var) {
        this.table = x3Var;
        this.group = j1Var;
        this.version = x3Var.getVersion();
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final j1 getGroup() {
        return this.group;
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
        Object obj;
        ArrayList<Object> f4 = this.group.f();
        if (f4 != null) {
            int i4 = this.index;
            this.index = i4 + 1;
            obj = f4.get(i4);
        } else {
            obj = null;
        }
        if (obj instanceof d) {
            return new y3(this.table, ((d) obj).getLocation(), this.version);
        }
        if (obj instanceof j1) {
            return new w4(this.table, (j1) obj);
        }
        throw u.a("Unexpected group information structure");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList<Object> f4 = this.group.f();
        return f4 != null && this.index < f4.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
