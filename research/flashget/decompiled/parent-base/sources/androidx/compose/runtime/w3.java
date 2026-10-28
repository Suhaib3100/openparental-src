package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b.\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u000eJ\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u000eJ\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0014J\u0015\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\u0011J\u0015\u0010 \u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b \u0010\u0011J\u0015\u0010!\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\u000eJ\u0017\u0010\"\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010\u0014J\u0017\u0010#\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b#\u0010\u0014J\u001f\u0010%\u001a\u0004\u0018\u00010\u00012\u0006\u0010$\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020)¢\u0006\u0004\b,\u0010+J\r\u0010-\u001a\u00020)¢\u0006\u0004\b-\u0010+J\r\u0010.\u001a\u00020)¢\u0006\u0004\b.\u0010+J\r\u0010/\u001a\u00020)¢\u0006\u0004\b/\u0010+J\r\u00100\u001a\u00020\u0007¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020)¢\u0006\u0004\b2\u0010+J\u0015\u00103\u001a\u00020)2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020)2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b5\u00104J\r\u00106\u001a\u00020)¢\u0006\u0004\b6\u0010+J\u0013\u00109\u001a\b\u0012\u0004\u0012\u00020807¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u001b2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b>\u0010?R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001c\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010HR\u0014\u0010J\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R6\u0010O\u001a\"\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020L\u0018\u00010Kj\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020L\u0018\u0001`M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010NR$\u0010S\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\bQ\u0010RR$\u0010U\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u0010\u0019\u001a\u0004\bT\u00101R$\u0010W\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b9\u0010\u0019\u001a\u0004\bV\u00101R$\u0010Y\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\bX\u00101R\u0016\u0010Z\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010\u0019R\u0016\u0010[\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010\u0019R\u0016\u0010\\\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010\u0019R\u0011\u0010^\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b]\u00101R\u0011\u0010`\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b_\u00101R\u0011\u0010b\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\ba\u0010RR\u0011\u0010d\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bc\u00101R\u0011\u0010f\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\be\u0010RR\u0011\u0010h\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bg\u0010RR\u0011\u0010j\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bi\u00101R\u0011\u0010l\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bk\u00101R\u0011\u0010n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bm\u00101R\u0011\u0010p\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bo\u00101R\u0013\u0010r\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bq\u0010(R\u0013\u0010t\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bs\u0010(R\u0013\u0010v\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bu\u0010(R\u0011\u0010x\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bw\u00101R\u0011\u0010z\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\by\u00101¨\u0006{"}, d2 = {"Landroidx/compose/runtime/w3;", "", "Landroidx/compose/runtime/x3;", "table", "<init>", "(Landroidx/compose/runtime/x3;)V", "", "", "index", "R", "([II)Ljava/lang/Object;", "c", "T", "U", "(I)I", "", "O", "(I)Z", "S", "Q", "(I)Ljava/lang/Object;", "J", "D", "G", "L", "I", "C", "Landroidx/compose/runtime/d;", "anchor", "H", "(Landroidx/compose/runtime/d;)I", "K", "f", "V", "j", "E", "group", "F", "(II)Ljava/lang/Object;", "P", "()Ljava/lang/Object;", "Lkotlin/k2;", "d", "()V", "g", "e", "a0", "b0", "Y", "()I", "Z", "W", "(I)V", "X", "h", "", "Landroidx/compose/runtime/u1;", "i", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "a", "(I)Landroidx/compose/runtime/d;", "Landroidx/compose/runtime/x3;", "B", "()Landroidx/compose/runtime/x3;", "b", "[I", "groups", "groupsSize", "", "[Ljava/lang/Object;", "slots", "slotsSize", "Ljava/util/HashMap;", "Landroidx/compose/runtime/j1;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "sourceInformationMap", "<set-?>", "k", "()Z", "closed", "m", "currentGroup", "l", "currentEnd", "x", "parent", "emptyCount", "currentSlot", "currentSlotEnd", "z", "size", "A", "slot", "N", "isNode", "w", "nodeCount", "M", "isGroupEnd", "v", "inEmpty", "s", "groupSize", "o", "groupEnd", "p", "groupKey", "u", "groupSlotIndex", "r", "groupObjectKey", "n", "groupAux", "q", "groupNode", "y", "parentNodes", "t", "groupSlotCount", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n1#1,3745:1\n1#2:3746\n4178#3,5:3747\n4178#3,5:3752\n4178#3,5:3757\n4178#3,5:3762\n4178#3,5:3767\n3616#4,6:3772\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n*L\n1130#1:3747,5\n1140#1:3752,5\n1148#1:3757,5\n1167#1:3762,5\n1181#1:3767,5\n1223#1:3772,6\n*E\n"})
/* loaded from: classes.dex */
public final class w3 {

    /* renamed from: n, reason: collision with root package name */
    public static final int f17276n = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x3 table;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final int[] groups;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int groupsSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object[] slots;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int slotsSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private HashMap<d, j1> sourceInformationMap;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int currentGroup;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int currentEnd;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int parent;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int emptyCount;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int currentSlot;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int currentSlotEnd;

    public w3(@fg.l x3 x3Var) {
        this.table = x3Var;
        this.groups = x3Var.getGroups();
        int groupsSize = x3Var.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = x3Var.getSlots();
        this.slotsSize = x3Var.getSlotsSize();
        this.currentEnd = groupsSize;
        this.parent = -1;
    }

    private final Object R(int[] iArr, int i4) {
        boolean c02;
        int k02;
        c02 = z3.c0(iArr, i4);
        if (!c02) {
            return t.INSTANCE.a();
        }
        Object[] objArr = this.slots;
        k02 = z3.k0(iArr, i4);
        return objArr[k02];
    }

    private final Object T(int[] iArr, int i4) {
        boolean a02;
        int l02;
        a02 = z3.a0(iArr, i4);
        if (!a02) {
            return null;
        }
        Object[] objArr = this.slots;
        l02 = z3.l0(iArr, i4);
        return objArr[l02];
    }

    public static /* synthetic */ d b(w3 w3Var, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = w3Var.currentGroup;
        }
        return w3Var.a(i4);
    }

    private final Object c(int[] iArr, int i4) {
        boolean Y;
        int J;
        Y = z3.Y(iArr, i4);
        if (!Y) {
            return t.INSTANCE.a();
        }
        Object[] objArr = this.slots;
        J = z3.J(iArr, i4);
        return objArr[J];
    }

    public final int A() {
        int r02;
        int i4 = this.currentSlot;
        r02 = z3.r0(this.groups, this.parent);
        return i4 - r02;
    }

    @fg.l
    /* renamed from: B, reason: from getter */
    public final x3 getTable() {
        return this.table;
    }

    @fg.m
    public final Object C(int index) {
        return c(this.groups, index);
    }

    public final int D(int index) {
        int V;
        V = z3.V(this.groups, index);
        return V + index;
    }

    @fg.m
    public final Object E(int index) {
        return F(this.currentGroup, index);
    }

    @fg.m
    public final Object F(int group, int index) {
        int r02;
        r02 = z3.r0(this.groups, group);
        int i4 = group + 1;
        int i5 = r02 + index;
        return i5 < (i4 < this.groupsSize ? z3.N(this.groups, i4) : this.slotsSize) ? this.slots[i5] : t.INSTANCE.a();
    }

    public final int G(int index) {
        return this.groups[index * 5];
    }

    public final int H(@fg.l d anchor) {
        if (anchor.b()) {
            return this.groups[this.table.i(anchor) * 5];
        }
        return 0;
    }

    @fg.m
    public final Object I(int index) {
        return T(this.groups, index);
    }

    public final int J(int index) {
        int V;
        V = z3.V(this.groups, index);
        return V;
    }

    public final boolean K(int index) {
        boolean Z;
        Z = z3.Z(this.groups, index);
        return Z;
    }

    public final boolean L(int index) {
        boolean a02;
        a02 = z3.a0(this.groups, index);
        return a02;
    }

    public final boolean M() {
        return v() || this.currentGroup == this.currentEnd;
    }

    public final boolean N() {
        boolean c02;
        c02 = z3.c0(this.groups, this.currentGroup);
        return c02;
    }

    public final boolean O(int index) {
        boolean c02;
        c02 = z3.c0(this.groups, index);
        return c02;
    }

    @fg.m
    public final Object P() {
        int i4;
        if (this.emptyCount > 0 || (i4 = this.currentSlot) >= this.currentSlotEnd) {
            return t.INSTANCE.a();
        }
        Object[] objArr = this.slots;
        this.currentSlot = i4 + 1;
        return objArr[i4];
    }

    @fg.m
    public final Object Q(int index) {
        boolean c02;
        c02 = z3.c0(this.groups, index);
        if (c02) {
            return R(this.groups, index);
        }
        return null;
    }

    public final int S(int index) {
        int h02;
        h02 = z3.h0(this.groups, index);
        return h02;
    }

    public final int U(int index) {
        int m02;
        m02 = z3.m0(this.groups, index);
        return m02;
    }

    public final int V(int index) {
        int m02;
        if (index < 0 || index >= this.groupsSize) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Invalid group index ", index).toString());
        }
        m02 = z3.m0(this.groups, index);
        return m02;
    }

    public final void W(int index) {
        int V;
        if (!(this.emptyCount == 0)) {
            throw u.a("Cannot reposition while in an empty region");
        }
        this.currentGroup = index;
        int m02 = index < this.groupsSize ? z3.m0(this.groups, index) : -1;
        this.parent = m02;
        if (m02 < 0) {
            this.currentEnd = this.groupsSize;
        } else {
            V = z3.V(this.groups, m02);
            this.currentEnd = V + m02;
        }
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void X(int index) {
        int V;
        V = z3.V(this.groups, index);
        int i4 = V + index;
        int i5 = this.currentGroup;
        if (i5 >= index && i5 <= i4) {
            this.parent = index;
            this.currentEnd = i4;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            return;
        }
        x.x(("Index " + index + " is not a parent of " + i5).toString());
        throw new KotlinNothingValueException();
    }

    public final int Y() {
        boolean c02;
        int V;
        if (!(this.emptyCount == 0)) {
            throw u.a("Cannot skip while in an empty region");
        }
        c02 = z3.c0(this.groups, this.currentGroup);
        int h02 = c02 ? 1 : z3.h0(this.groups, this.currentGroup);
        int i4 = this.currentGroup;
        V = z3.V(this.groups, i4);
        this.currentGroup = V + i4;
        return h02;
    }

    public final void Z() {
        if (!(this.emptyCount == 0)) {
            throw u.a("Cannot skip the enclosing group while in an empty region");
        }
        this.currentGroup = this.currentEnd;
    }

    @fg.l
    public final d a(int index) {
        int p02;
        ArrayList<d> w4 = this.table.w();
        p02 = z3.p0(w4, index, this.groupsSize);
        if (p02 >= 0) {
            return w4.get(p02);
        }
        d dVar = new d(index);
        w4.add(-(p02 + 1), dVar);
        return dVar;
    }

    public final void a0() {
        int m02;
        int V;
        int r02;
        j1 j1Var;
        if (this.emptyCount <= 0) {
            int i4 = this.parent;
            int i5 = this.currentGroup;
            m02 = z3.m0(this.groups, i5);
            if (m02 != i4) {
                throw new IllegalArgumentException("Invalid slot table detected");
            }
            HashMap<d, j1> hashMap = this.sourceInformationMap;
            if (hashMap != null && (j1Var = hashMap.get(a(i4))) != null) {
                j1Var.l(this.table, i5);
            }
            this.parent = i5;
            V = z3.V(this.groups, i5);
            this.currentEnd = V + i5;
            int i6 = i5 + 1;
            this.currentGroup = i6;
            r02 = z3.r0(this.groups, i5);
            this.currentSlot = r02;
            this.currentSlotEnd = i5 >= this.groupsSize + (-1) ? this.slotsSize : z3.N(this.groups, i6);
        }
    }

    public final void b0() {
        boolean c02;
        if (this.emptyCount <= 0) {
            c02 = z3.c0(this.groups, this.currentGroup);
            if (!c02) {
                throw new IllegalArgumentException("Expected a node group");
            }
            a0();
        }
    }

    public final void d() {
        this.emptyCount++;
    }

    public final void e() {
        this.closed = true;
        this.table.l(this, this.sourceInformationMap);
    }

    public final boolean f(int index) {
        boolean L;
        L = z3.L(this.groups, index);
        return L;
    }

    public final void g() {
        int i4 = this.emptyCount;
        if (i4 <= 0) {
            throw new IllegalArgumentException("Unbalanced begin/end empty");
        }
        this.emptyCount = i4 - 1;
    }

    public final void h() {
        int m02;
        int V;
        int i4;
        if (this.emptyCount == 0) {
            if (!(this.currentGroup == this.currentEnd)) {
                throw u.a("endGroup() not called at the end of a group");
            }
            m02 = z3.m0(this.groups, this.parent);
            this.parent = m02;
            if (m02 < 0) {
                i4 = this.groupsSize;
            } else {
                V = z3.V(this.groups, m02);
                i4 = m02 + V;
            }
            this.currentEnd = i4;
        }
    }

    @fg.l
    public final List<u1> i() {
        boolean c02;
        int V;
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount > 0) {
            return arrayList;
        }
        int i4 = this.currentGroup;
        int i5 = 0;
        while (i4 < this.currentEnd) {
            int[] iArr = this.groups;
            int i6 = iArr[i4 * 5];
            Object T = T(iArr, i4);
            c02 = z3.c0(this.groups, i4);
            arrayList.add(new u1(i6, T, i4, c02 ? 1 : z3.h0(this.groups, i4), i5));
            V = z3.V(this.groups, i4);
            i4 += V;
            i5++;
        }
        return arrayList;
    }

    @fg.m
    public final Object j(int index) {
        int i4 = this.currentSlot + index;
        return i4 < this.currentSlotEnd ? this.slots[i4] : t.INSTANCE.a();
    }

    /* renamed from: k, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    /* renamed from: l, reason: from getter */
    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    /* renamed from: m, reason: from getter */
    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    @fg.m
    public final Object n() {
        int i4 = this.currentGroup;
        if (i4 < this.currentEnd) {
            return c(this.groups, i4);
        }
        return 0;
    }

    public final int o() {
        return this.currentEnd;
    }

    public final int p() {
        int i4 = this.currentGroup;
        if (i4 < this.currentEnd) {
            return this.groups[i4 * 5];
        }
        return 0;
    }

    @fg.m
    public final Object q() {
        int i4 = this.currentGroup;
        if (i4 < this.currentEnd) {
            return R(this.groups, i4);
        }
        return null;
    }

    @fg.m
    public final Object r() {
        int i4 = this.currentGroup;
        if (i4 < this.currentEnd) {
            return T(this.groups, i4);
        }
        return null;
    }

    public final int s() {
        int V;
        V = z3.V(this.groups, this.currentGroup);
        return V;
    }

    public final int t() {
        int r02;
        int i4 = this.currentGroup;
        r02 = z3.r0(this.groups, i4);
        int i5 = i4 + 1;
        return (i5 < this.groupsSize ? z3.N(this.groups, i5) : this.slotsSize) - r02;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.currentGroup);
        sb.append(", key=");
        sb.append(p());
        sb.append(", parent=");
        sb.append(this.parent);
        sb.append(", end=");
        return androidx.view.e.a(sb, this.currentEnd, ')');
    }

    public final int u() {
        int r02;
        int i4 = this.currentSlot;
        r02 = z3.r0(this.groups, this.parent);
        return i4 - r02;
    }

    public final boolean v() {
        return this.emptyCount > 0;
    }

    public final int w() {
        int h02;
        h02 = z3.h0(this.groups, this.currentGroup);
        return h02;
    }

    /* renamed from: x, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    public final int y() {
        int h02;
        int i4 = this.parent;
        if (i4 < 0) {
            return 0;
        }
        h02 = z3.h0(this.groups, i4);
        return h02;
    }

    /* renamed from: z, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }
}
