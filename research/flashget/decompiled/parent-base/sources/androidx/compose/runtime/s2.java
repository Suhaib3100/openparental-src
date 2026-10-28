package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010!J\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b#\u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\"\u0010.\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010(\u001a\u0004\b$\u0010*\"\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R0\u00104\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020100j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000201`28\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00103RW\u0010:\u001a>\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000305j\b\u0012\u0004\u0012\u00020\u0003`600j\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000305j\b\u0012\u0004\u0012\u00020\u0003`6`28FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b+\u00109R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00030;8F¢\u0006\u0006\u001a\u0004\b7\u0010'¨\u0006="}, d2 = {"Landroidx/compose/runtime/s2;", "", "", "Landroidx/compose/runtime/u1;", "keyInfos", "", "startIndex", "<init>", "(Ljava/util/List;I)V", "key", "dataKey", "d", "(ILjava/lang/Object;)Landroidx/compose/runtime/u1;", "keyInfo", "", "h", "(Landroidx/compose/runtime/u1;)Z", "from", "to", "Lkotlin/k2;", "k", "(II)V", "count", "j", "(III)V", "insertIndex", "i", "(Landroidx/compose/runtime/u1;I)V", "group", "newCount", "n", "(II)Z", "m", "(Landroidx/compose/runtime/u1;)I", "g", "o", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "I", "e", "()I", "c", "l", "(I)V", "groupIndex", "usedKeys", "Ljava/util/HashMap;", "Landroidx/compose/runtime/g1;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "groupInfos", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "f", "Lkotlin/b0;", "()Ljava/util/HashMap;", "keyMap", "", "used", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4197:1\n1#2:4198\n1855#3,2:4199\n1855#3,2:4201\n1855#3,2:4203\n1855#3,2:4205\n1855#3,2:4207\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n*L\n153#1:4199,2\n159#1:4201,2\n169#1:4203,2\n175#1:4205,2\n195#1:4207,2\n*E\n"})
/* loaded from: classes.dex */
final class s2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<u1> keyInfos;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startIndex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int groupIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<u1> usedKeys;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final HashMap<Integer, g1> groupInfos;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0 keyMap;

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a>\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0000j\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004`\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/util/HashMap;", "", "Ljava/util/LinkedHashSet;", "Landroidx/compose/runtime/u1;", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "a", "()Ljava/util/HashMap;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<HashMap<Object, LinkedHashSet<u1>>> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap<Object, LinkedHashSet<u1>> invoke() {
            Object L;
            HashMap<Object, LinkedHashSet<u1>> l4 = x.l();
            s2 s2Var = s2.this;
            int size = s2Var.b().size();
            for (int i4 = 0; i4 < size; i4++) {
                u1 u1Var = s2Var.b().get(i4);
                L = x.L(u1Var);
                x.f0(l4, L, u1Var);
            }
            return l4;
        }
    }

    public s2(@fg.l List<u1> list, int i4) {
        this.keyInfos = list;
        this.startIndex = i4;
        if (i4 < 0) {
            throw new IllegalArgumentException("Invalid start index");
        }
        this.usedKeys = new ArrayList();
        HashMap<Integer, g1> hashMap = new HashMap<>();
        int size = list.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            u1 u1Var = this.keyInfos.get(i6);
            hashMap.put(Integer.valueOf(u1Var.getLocation()), new g1(i6, i5, u1Var.getNodes()));
            i5 += u1Var.getNodes();
        }
        this.groupInfos = hashMap;
        this.keyMap = kotlin.c0.c(new a());
    }

    /* renamed from: a, reason: from getter */
    public final int getGroupIndex() {
        return this.groupIndex;
    }

    @fg.l
    public final List<u1> b() {
        return this.keyInfos;
    }

    @fg.l
    public final HashMap<Object, LinkedHashSet<u1>> c() {
        return (HashMap) this.keyMap.getValue();
    }

    @fg.m
    public final u1 d(int key, @fg.m Object dataKey) {
        Object e02;
        e02 = x.e0(c(), dataKey != null ? new t1(Integer.valueOf(key), dataKey) : Integer.valueOf(key));
        return (u1) e02;
    }

    /* renamed from: e, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    @fg.l
    public final List<u1> f() {
        return this.usedKeys;
    }

    public final int g(@fg.l u1 keyInfo) {
        g1 g1Var = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (g1Var != null) {
            return g1Var.getNodeIndex();
        }
        return -1;
    }

    public final boolean h(@fg.l u1 keyInfo) {
        return this.usedKeys.add(keyInfo);
    }

    public final void i(@fg.l u1 keyInfo, int insertIndex) {
        this.groupInfos.put(Integer.valueOf(keyInfo.getLocation()), new g1(-1, insertIndex, 0));
    }

    public final void j(int from, int to, int count) {
        if (from > to) {
            for (g1 g1Var : this.groupInfos.values()) {
                int nodeIndex = g1Var.getNodeIndex();
                if (from <= nodeIndex && nodeIndex < from + count) {
                    g1Var.e((nodeIndex - from) + to);
                } else if (to <= nodeIndex && nodeIndex < from) {
                    g1Var.e(nodeIndex + count);
                }
            }
            return;
        }
        if (to > from) {
            for (g1 g1Var2 : this.groupInfos.values()) {
                int nodeIndex2 = g1Var2.getNodeIndex();
                if (from <= nodeIndex2 && nodeIndex2 < from + count) {
                    g1Var2.e((nodeIndex2 - from) + to);
                } else if (from + 1 <= nodeIndex2 && nodeIndex2 < to) {
                    g1Var2.e(nodeIndex2 - count);
                }
            }
        }
    }

    public final void k(int from, int to) {
        if (from > to) {
            for (g1 g1Var : this.groupInfos.values()) {
                int slotIndex = g1Var.getSlotIndex();
                if (slotIndex == from) {
                    g1Var.f(to);
                } else if (to <= slotIndex && slotIndex < from) {
                    g1Var.f(slotIndex + 1);
                }
            }
            return;
        }
        if (to > from) {
            for (g1 g1Var2 : this.groupInfos.values()) {
                int slotIndex2 = g1Var2.getSlotIndex();
                if (slotIndex2 == from) {
                    g1Var2.f(to);
                } else if (from + 1 <= slotIndex2 && slotIndex2 < to) {
                    g1Var2.f(slotIndex2 - 1);
                }
            }
        }
    }

    public final void l(int i4) {
        this.groupIndex = i4;
    }

    public final int m(@fg.l u1 keyInfo) {
        g1 g1Var = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (g1Var != null) {
            return g1Var.getSlotIndex();
        }
        return -1;
    }

    public final boolean n(int group, int newCount) {
        int nodeIndex;
        g1 g1Var = this.groupInfos.get(Integer.valueOf(group));
        if (g1Var == null) {
            return false;
        }
        int nodeIndex2 = g1Var.getNodeIndex();
        int nodeCount = newCount - g1Var.getNodeCount();
        g1Var.d(newCount);
        if (nodeCount == 0) {
            return true;
        }
        for (g1 g1Var2 : this.groupInfos.values()) {
            if (g1Var2.getNodeIndex() >= nodeIndex2 && !kotlin.jvm.internal.l0.g(g1Var2, g1Var) && (nodeIndex = g1Var2.getNodeIndex() + nodeCount) >= 0) {
                g1Var2.e(nodeIndex);
            }
        }
        return true;
    }

    public final int o(@fg.l u1 keyInfo) {
        g1 g1Var = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        return g1Var != null ? g1Var.getNodeCount() : keyInfo.getNodes();
    }
}
