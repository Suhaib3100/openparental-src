package androidx.compose.runtime;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0011\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/compose/runtime/o0;", "", "", "", "Landroidx/compose/runtime/x3;", "table", "", "group", "<init>", "(Landroidx/compose/runtime/x3;I)V", "iterator", "()Ljava/util/Iterator;", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "b", "Landroidx/compose/runtime/x3;", "h", "()Landroidx/compose/runtime/x3;", "c", "I", "f", "()I", "start", "d", "end", "e", "i", "(I)V", "index", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/DataIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3745:1\n1#2:3746\n*E\n"})
/* loaded from: classes.dex */
final class o0 implements Iterable<Object>, Iterator<Object>, md.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x3 table;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int start;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int end;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int index;

    public o0(@fg.l x3 x3Var, int i4) {
        int N;
        this.table = x3Var;
        N = z3.N(x3Var.getGroups(), i4);
        this.start = N;
        int i5 = i4 + 1;
        this.end = i5 < x3Var.getGroupsSize() ? z3.N(x3Var.getGroups(), i5) : x3Var.getSlotsSize();
        this.index = N;
    }

    /* renamed from: b, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* renamed from: c, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: f, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final x3 getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    public final void i(int i4) {
        this.index = i4;
    }

    @Override // java.lang.Iterable
    @fg.l
    public Iterator<Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    @fg.m
    public Object next() {
        int i4 = this.index;
        Object obj = (i4 < 0 || i4 >= this.table.getSlots().length) ? null : this.table.getSlots()[this.index];
        this.index++;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
