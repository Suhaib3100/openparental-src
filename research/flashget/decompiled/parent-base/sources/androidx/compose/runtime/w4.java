package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\f\u0010\u001cR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010#\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010%\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0018R\u0014\u0010'\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Landroidx/compose/runtime/w4;", "Landroidx/compose/runtime/tooling/b;", "", "Landroidx/compose/runtime/x3;", "table", "Landroidx/compose/runtime/j1;", "sourceInformation", "<init>", "(Landroidx/compose/runtime/x3;Landroidx/compose/runtime/j1;)V", "", "iterator", "()Ljava/util/Iterator;", "b", "Landroidx/compose/runtime/x3;", "i", "()Landroidx/compose/runtime/x3;", "c", "Landroidx/compose/runtime/j1;", "h", "()Landroidx/compose/runtime/j1;", "", "d", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "e", "Ljava/lang/Iterable;", "()Ljava/lang/Iterable;", "data", "f", "compositionGroups", "", "D", "()Ljava/lang/String;", "sourceInfo", "A", "node", "", "isEmpty", "()Z", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class w4 implements androidx.compose.runtime.tooling.b, Iterable<androidx.compose.runtime.tooling.b>, md.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x3 table;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j1 sourceInformation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object key;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Iterable<Object> data = kotlin.collections.j0.f74919b;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Iterable<androidx.compose.runtime.tooling.b> compositionGroups = this;

    public w4(@fg.l x3 x3Var, @fg.l j1 j1Var) {
        this.table = x3Var;
        this.sourceInformation = j1Var;
        this.key = Integer.valueOf(j1Var.getKey());
    }

    @Override // androidx.compose.runtime.tooling.b
    @fg.m
    public Object A() {
        return null;
    }

    @Override // androidx.compose.runtime.tooling.b
    @fg.m
    public String D() {
        return this.sourceInformation.getSourceInformation();
    }

    @Override // androidx.compose.runtime.tooling.b
    @fg.l
    public Iterable<Object> b() {
        return this.data;
    }

    @Override // androidx.compose.runtime.tooling.a
    @fg.l
    public Iterable<androidx.compose.runtime.tooling.b> f() {
        return this.compositionGroups;
    }

    @Override // androidx.compose.runtime.tooling.b
    @fg.l
    public Object getKey() {
        return this.key;
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final j1 getSourceInformation() {
        return this.sourceInformation;
    }

    @fg.l
    /* renamed from: i, reason: from getter */
    public final x3 getTable() {
        return this.table;
    }

    @Override // androidx.compose.runtime.tooling.a
    public boolean isEmpty() {
        ArrayList<Object> f4 = this.sourceInformation.f();
        boolean z4 = false;
        if (f4 != null && !f4.isEmpty()) {
            z4 = true;
        }
        return !z4;
    }

    @Override // java.lang.Iterable
    @fg.l
    public Iterator<androidx.compose.runtime.tooling.b> iterator() {
        return new v4(this.table, this.sourceInformation);
    }
}
