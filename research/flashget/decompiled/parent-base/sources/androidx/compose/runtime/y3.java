package androidx.compose.runtime;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010&\u001a\u0004\u0018\u00010#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010(\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010!R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010)R\u0014\u0010,\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010!R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010)R\u0014\u00100\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001aR\u0014\u00102\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u001a¨\u00063"}, d2 = {"Landroidx/compose/runtime/y3;", "Landroidx/compose/runtime/tooling/b;", "", "Landroidx/compose/runtime/x3;", "table", "", "group", "version", "<init>", "(Landroidx/compose/runtime/x3;II)V", "Lkotlin/k2;", "l", "()V", "", "iterator", "()Ljava/util/Iterator;", "", "identityToFind", "c", "(Ljava/lang/Object;)Landroidx/compose/runtime/tooling/b;", "b", "Landroidx/compose/runtime/x3;", "i", "()Landroidx/compose/runtime/x3;", "I", "h", "()I", "d", "j", "", "isEmpty", "()Z", "getKey", "()Ljava/lang/Object;", "key", "", "D", "()Ljava/lang/String;", "sourceInfo", "A", "node", "()Ljava/lang/Iterable;", "data", "O", "identity", "f", "compositionGroups", "G", "groupSize", "P", "slotsSize", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3745:1\n150#2,8:3746\n1#3:3754\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n*L\n3277#1:3746,8\n*E\n"})
/* loaded from: classes.dex */
final class y3 implements androidx.compose.runtime.tooling.b, Iterable<androidx.compose.runtime.tooling.b>, md.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x3 table;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int group;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int version;

    public y3(@fg.l x3 x3Var, int i4, int i5) {
        this.table = x3Var;
        this.group = i4;
        this.version = i5;
    }

    private final void l() {
        if (this.table.getVersion() != this.version) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // androidx.compose.runtime.tooling.b
    @fg.m
    public Object A() {
        boolean c02;
        int k02;
        c02 = z3.c0(this.table.getGroups(), this.group);
        if (!c02) {
            return null;
        }
        Object[] slots = this.table.getSlots();
        k02 = z3.k0(this.table.getGroups(), this.group);
        return slots[k02];
    }

    @Override // androidx.compose.runtime.tooling.b
    @fg.m
    public String D() {
        boolean Y;
        HashMap<d, j1> S;
        j1 j1Var;
        int J;
        Y = z3.Y(this.table.getGroups(), this.group);
        if (Y) {
            Object[] slots = this.table.getSlots();
            J = z3.J(this.table.getGroups(), this.group);
            Object obj = slots[J];
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }
        d q02 = this.table.q0(this.group);
        if (q02 == null || (S = this.table.S()) == null || (j1Var = S.get(q02)) == null) {
            return null;
        }
        return j1Var.getSourceInformation();
    }

    @Override // androidx.compose.runtime.tooling.b
    public int G() {
        int V;
        V = z3.V(this.table.getGroups(), this.group);
        return V;
    }

    @Override // androidx.compose.runtime.tooling.b
    @fg.l
    public Object O() {
        l();
        w3 d02 = this.table.d0();
        try {
            return d02.a(this.group);
        } finally {
            d02.e();
        }
    }

    @Override // androidx.compose.runtime.tooling.b
    public int P() {
        int N;
        int G = this.group + G();
        int N2 = G < this.table.getGroupsSize() ? z3.N(this.table.getGroups(), G) : this.table.getSlotsSize();
        N = z3.N(this.table.getGroups(), this.group);
        return N2 - N;
    }

    @Override // androidx.compose.runtime.tooling.b
    @fg.l
    public Iterable<Object> b() {
        return new o0(this.table, this.group);
    }

    @Override // androidx.compose.runtime.tooling.a
    @fg.m
    public androidx.compose.runtime.tooling.b c(@fg.l Object identityToFind) {
        int i4;
        int i5;
        int V;
        d dVar = identityToFind instanceof d ? (d) identityToFind : null;
        if (dVar == null || !this.table.f0(dVar) || (i4 = this.table.i(dVar)) < (i5 = this.group)) {
            return null;
        }
        int i6 = i4 - i5;
        V = z3.V(this.table.getGroups(), this.group);
        if (i6 < V) {
            return new y3(this.table, i4, this.version);
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.a
    @fg.l
    public Iterable<androidx.compose.runtime.tooling.b> f() {
        return this;
    }

    @Override // androidx.compose.runtime.tooling.b
    @fg.l
    public Object getKey() {
        boolean a02;
        int l02;
        a02 = z3.a0(this.table.getGroups(), this.group);
        if (!a02) {
            return Integer.valueOf(this.table.getGroups()[this.group * 5]);
        }
        Object[] slots = this.table.getSlots();
        l02 = z3.l0(this.table.getGroups(), this.group);
        Object obj = slots[l02];
        kotlin.jvm.internal.l0.m(obj);
        return obj;
    }

    /* renamed from: h, reason: from getter */
    public final int getGroup() {
        return this.group;
    }

    @fg.l
    /* renamed from: i, reason: from getter */
    public final x3 getTable() {
        return this.table;
    }

    @Override // androidx.compose.runtime.tooling.a
    public boolean isEmpty() {
        int V;
        V = z3.V(this.table.getGroups(), this.group);
        return V == 0;
    }

    @Override // java.lang.Iterable
    @fg.l
    public Iterator<androidx.compose.runtime.tooling.b> iterator() {
        int V;
        l();
        j1 p02 = this.table.p0(this.group);
        if (p02 != null) {
            return new v4(this.table, p02);
        }
        x3 x3Var = this.table;
        int i4 = this.group;
        V = z3.V(x3Var.getGroups(), this.group);
        return new h1(x3Var, i4 + 1, V + i4);
    }

    /* renamed from: j, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public /* synthetic */ y3(x3 x3Var, int i4, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this(x3Var, i4, (i6 & 4) != 0 ? x3Var.getVersion() : i5);
    }
}
