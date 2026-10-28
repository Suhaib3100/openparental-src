package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.h;
import androidx.compose.runtime.x4;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: SnapshotStateMap.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0007\n\u0002\u0010\u001f\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001QB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\f\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00072#\u0010\u000b\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0002\b\nH\u0082\b¢\u0006\u0004\b\f\u0010\rJ;\u0010\u000e\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00072#\u0010\u000b\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0002\b\nH\u0082\b¢\u0006\u0004\b\u000e\u0010\rJ6\u0010\u000f\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00072\u001e\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u00020\bH\u0082\b¢\u0006\u0004\b\u000f\u0010\rJ<\u0010\u0012\u001a\u00020\u00112*\u0010\u000b\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\bH\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u001a\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010\u0006J!\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010&J%\u0010(\u001a\u00020\u00112\u0014\u0010'\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010!J\u0017\u0010+\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00028\u0001H\u0000¢\u0006\u0004\b+\u0010\u001eJ0\u0010.\u001a\u00020\u001c2\u001e\u0010-\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,\u0012\u0004\u0012\u00020\u001c0\bH\u0080\b¢\u0006\u0004\b.\u0010/J0\u00101\u001a\u00020\u001c2\u001e\u0010-\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100\u0012\u0004\u0012\u00020\u001c0\bH\u0080\b¢\u0006\u0004\b1\u0010/J0\u00102\u001a\u00020\u001c2\u001e\u0010-\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100\u0012\u0004\u0012\u00020\u001c0\bH\u0080\b¢\u0006\u0004\b2\u0010/R$\u00107\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u00148\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b2\u00104\u001a\u0004\b5\u00106R,\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00109\u001a\u0004\b:\u0010;R \u0010?\u001a\b\u0012\u0004\u0012\u00028\u0000088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010;R \u0010E\u001a\b\u0012\u0004\u0012\u00028\u00010@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR&\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t8@X\u0080\u0004¢\u0006\f\u0012\u0004\bH\u0010\u0006\u001a\u0004\bF\u0010GR&\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00188AX\u0080\u0004¢\u0006\f\u0012\u0004\bA\u0010\u0006\u001a\u0004\b=\u0010\u001aR\u0014\u0010N\u001a\u00020K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020K8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bO\u0010M¨\u0006R"}, d2 = {"Landroidx/compose/runtime/snapshots/d0;", "K", "V", "Landroidx/compose/runtime/snapshots/p0;", "", "<init>", "()V", "R", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/d0$a;", "Lkotlin/u;", "block", "v", "(Lld/l;)Ljava/lang/Object;", "w", "p", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "Lkotlin/k2;", "u", "(Lld/l;)V", "Landroidx/compose/runtime/snapshots/r0;", "value", "A", "(Landroidx/compose/runtime/snapshots/r0;)V", "", "t", "()Ljava/util/Map;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "clear", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "from", "putAll", "(Ljava/util/Map;)V", "remove", "r", "", "predicate", "q", "(Lld/l;)Z", "", "c", "b", "<set-?>", "Landroidx/compose/runtime/snapshots/r0;", "F", "()Landroidx/compose/runtime/snapshots/r0;", "firstStateRecord", "", "Ljava/util/Set;", "f", "()Ljava/util/Set;", "entries", "d", "h", "keys", "", "e", "Ljava/util/Collection;", "o", "()Ljava/util/Collection;", "values", "j", "()Landroidx/compose/runtime/snapshots/d0$a;", "l", "readable", "debuggerDisplayValue", "", "m", "()I", "size", "i", "modification", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x4
@r1({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n154#1:361\n121#1:362\n155#1,2:364\n125#1:366\n157#1,3:373\n162#1:379\n128#1,5:380\n133#1:386\n121#1:387\n134#1,7:389\n125#1:396\n141#1,6:402\n149#1,3:411\n128#1,5:414\n133#1:420\n121#1:421\n134#1,7:423\n125#1:430\n141#1,6:436\n149#1,3:445\n128#1,5:448\n133#1:454\n121#1:455\n134#1,7:457\n125#1:464\n141#1,6:470\n149#1,3:479\n128#1,5:485\n133#1:491\n121#1:492\n134#1,7:494\n125#1:501\n141#1,6:507\n149#1,3:516\n121#1:519\n121#1:532\n125#1:534\n121#1:545\n125#1:547\n2283#2:363\n2176#2,2:367\n1714#2:369\n2178#2,2:371\n2180#2,3:376\n2283#2:388\n2176#2,2:397\n1714#2:399\n2178#2,2:400\n2180#2,3:408\n2283#2:422\n2176#2,2:431\n1714#2:433\n2178#2,2:434\n2180#2,3:442\n2283#2:456\n2176#2,2:465\n1714#2:467\n2178#2,2:468\n2180#2,3:476\n2283#2:493\n2176#2,2:502\n1714#2:504\n2178#2,2:505\n2180#2,3:513\n2283#2:520\n2283#2:521\n2176#2,2:522\n1714#2:524\n2178#2,5:526\n2283#2:533\n2176#2,2:535\n1714#2:537\n2178#2,2:539\n2180#2,3:542\n2283#2:546\n2176#2,2:548\n1714#2:550\n2178#2,2:552\n2180#2,3:555\n82#3:370\n82#3:385\n82#3:419\n82#3:453\n82#3:490\n82#3:525\n82#3:531\n82#3:538\n82#3:541\n82#3:551\n82#3:554\n288#4,2:482\n1#5:484\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n*L\n69#1:361\n69#1:362\n69#1:364,2\n69#1:366\n69#1:373,3\n69#1:379\n70#1:380,5\n70#1:386\n70#1:387\n70#1:389,7\n70#1:396\n70#1:402,6\n70#1:411,3\n71#1:414,5\n71#1:420\n71#1:421\n71#1:423,7\n71#1:430\n71#1:436,6\n71#1:445,3\n72#1:448,5\n72#1:454\n72#1:455\n72#1:457,7\n72#1:464\n72#1:470,6\n72#1:479,3\n85#1:485,5\n85#1:491\n85#1:492\n85#1:494,7\n85#1:501\n85#1:507,6\n85#1:516,3\n117#1:519\n133#1:532\n140#1:534\n154#1:545\n156#1:547\n69#1:363\n69#1:367,2\n69#1:369\n69#1:371,2\n69#1:376,3\n70#1:388\n70#1:397,2\n70#1:399\n70#1:400,2\n70#1:408,3\n71#1:422\n71#1:431,2\n71#1:433\n71#1:434,2\n71#1:442,3\n72#1:456\n72#1:465,2\n72#1:467\n72#1:468,2\n72#1:476,3\n85#1:493\n85#1:502,2\n85#1:504\n85#1:505,2\n85#1:513,3\n117#1:520\n121#1:521\n125#1:522,2\n125#1:524\n125#1:526,5\n133#1:533\n140#1:535,2\n140#1:537\n140#1:539,2\n140#1:542,3\n154#1:546\n156#1:548,2\n156#1:550\n156#1:552,2\n156#1:555,3\n69#1:370\n70#1:385\n71#1:419\n72#1:453\n85#1:490\n125#1:525\n132#1:531\n140#1:538\n141#1:541\n156#1:551\n157#1:554\n77#1:482,2\n*E\n"})
/* loaded from: classes.dex */
public final class d0<K, V> implements p0, Map<K, V>, md.g {

    /* renamed from: f, reason: collision with root package name */
    public static final int f17033f = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private r0 firstStateRecord = new a(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.INSTANCE.a());

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Set<Map.Entry<K, V>> entries = new w(this);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Set<K> keys = new x(this);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Collection<V> values = new z(this);

    /* compiled from: SnapshotStateMap.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001d\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rR.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0007R\"\u0010\u0019\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/snapshots/d0$a;", "K", "V", "Landroidx/compose/runtime/snapshots/r0;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "map", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;)V", "value", "Lkotlin/k2;", "c", "(Landroidx/compose/runtime/snapshots/r0;)V", "d", "()Landroidx/compose/runtime/snapshots/r0;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "i", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "k", "", "e", "I", "j", "()I", "l", "(I)V", "modification", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 0)
    @r1({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,360:1\n82#2:361\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n*L\n174#1:361\n*E\n"})
    public static final class a<K, V> extends r0 {

        /* renamed from: f, reason: collision with root package name */
        public static final int f17038f = 8;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> map;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int modification;

        public a(@fg.l androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> hVar) {
            this.map = hVar;
        }

        @Override // androidx.compose.runtime.snapshots.r0
        public void c(@fg.l r0 value) {
            Object obj;
            kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            a aVar = (a) value;
            obj = e0.f17053a;
            synchronized (obj) {
                this.map = aVar.map;
                this.modification = aVar.modification;
                k2 k2Var = k2.f75408a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.r0
        @fg.l
        public r0 d() {
            return new a(this.map);
        }

        @fg.l
        public final androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> i() {
            return this.map;
        }

        /* renamed from: j, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        public final void k(@fg.l androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> hVar) {
            this.map = hVar;
        }

        public final void l(int i4) {
            this.modification = i4;
        }
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void l() {
    }

    private final <R> R p(ld.l<? super Map<K, V>, ? extends R> block) {
        Object obj;
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> i4;
        int modification;
        R invoke;
        m I;
        Object obj2;
        boolean z4;
        do {
            obj = e0.f17053a;
            synchronized (obj) {
                r0 r0Var = this.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) v.G((a) r0Var);
                i4 = aVar.i();
                modification = aVar.getModification();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i4);
            h.a<K, V> g4 = i4.g();
            invoke = block.invoke(g4);
            androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> a5 = g4.a();
            if (kotlin.jvm.internal.l0.g(a5, i4)) {
                break;
            }
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj2 = e0.f17053a;
                synchronized (obj2) {
                    if (aVar3.getModification() == modification) {
                        aVar3.k(a5);
                        z4 = true;
                        aVar3.l(aVar3.getModification() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            v.U(I, this);
        } while (!z4);
        return invoke;
    }

    private final void u(ld.l<? super androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V>, ? extends androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V>> block) {
        m I;
        Object obj;
        r0 r0Var = this.firstStateRecord;
        kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) v.G((a) r0Var);
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> invoke = block.invoke(aVar.i());
        if (invoke != aVar.i()) {
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj = e0.f17053a;
                synchronized (obj) {
                    aVar3.k(invoke);
                    aVar3.l(aVar3.getModification() + 1);
                }
            }
            v.U(I, this);
        }
    }

    private final <R> R v(ld.l<? super a<K, V>, ? extends R> block) {
        r0 r0Var = this.firstStateRecord;
        kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return block.invoke(v.G((a) r0Var));
    }

    private final <R> R w(ld.l<? super a<K, V>, ? extends R> block) {
        m I;
        R invoke;
        r0 r0Var = this.firstStateRecord;
        kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) r0Var;
        v.M();
        synchronized (v.K()) {
            m.INSTANCE.getClass();
            I = v.I();
            invoke = block.invoke(v.r0(aVar, this, I));
        }
        v.U(I, this);
        return invoke;
    }

    @Override // androidx.compose.runtime.snapshots.p0
    public void A(@fg.l r0 value) {
        kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.firstStateRecord = (a) value;
    }

    @Override // androidx.compose.runtime.snapshots.p0
    @fg.l
    /* renamed from: F, reason: from getter */
    public r0 getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public final boolean b(@fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Iterator<E> it = ((androidx.compose.runtime.external.kotlinx.collections.immutable.e) j().i().entrySet()).iterator();
        while (it.hasNext()) {
            if (!predicate.invoke((Map.Entry) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(@fg.l ld.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Iterator<E> it = ((androidx.compose.runtime.external.kotlinx.collections.immutable.e) j().i().entrySet()).iterator();
        while (it.hasNext()) {
            if (predicate.invoke((Map.Entry) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        m I;
        Object obj;
        r0 r0Var = this.firstStateRecord;
        kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) v.G((a) r0Var);
        aVar.i();
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, V> a5 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.INSTANCE.a();
        if (a5 != aVar.i()) {
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj = e0.f17053a;
                synchronized (obj) {
                    aVar3.k(a5);
                    aVar3.l(aVar3.getModification() + 1);
                }
            }
            v.U(I, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return j().i().containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return j().i().containsValue(value);
    }

    @fg.l
    @kd.i(name = "getDebuggerDisplayValue")
    public final Map<K, V> d() {
        r0 r0Var = this.firstStateRecord;
        kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return ((a) v.G((a) r0Var)).i();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.entries;
    }

    @fg.l
    public Set<Map.Entry<K, V>> f() {
        return this.entries;
    }

    @Override // java.util.Map
    @fg.m
    public V get(Object key) {
        return j().i().get(key);
    }

    @fg.l
    public Set<K> h() {
        return this.keys;
    }

    public final int i() {
        return j().getModification();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return j().i().isEmpty();
    }

    @fg.l
    public final a<K, V> j() {
        r0 r0Var = this.firstStateRecord;
        kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) v.c0((a) r0Var, this);
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.keys;
    }

    public int m() {
        return j().i().size();
    }

    @fg.l
    public Collection<V> o() {
        return this.values;
    }

    @Override // java.util.Map
    @fg.m
    public V put(K key, V value) {
        Object obj;
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> i4;
        int modification;
        V put;
        m I;
        Object obj2;
        boolean z4;
        do {
            obj = e0.f17053a;
            synchronized (obj) {
                r0 r0Var = this.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) v.G((a) r0Var);
                i4 = aVar.i();
                modification = aVar.getModification();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i4);
            h.a<K, V> g4 = i4.g();
            put = g4.put(key, value);
            androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> a5 = g4.a();
            if (kotlin.jvm.internal.l0.g(a5, i4)) {
                break;
            }
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj2 = e0.f17053a;
                synchronized (obj2) {
                    if (aVar3.getModification() == modification) {
                        aVar3.k(a5);
                        z4 = true;
                        aVar3.l(aVar3.getModification() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            v.U(I, this);
        } while (!z4);
        return put;
    }

    @Override // java.util.Map
    public void putAll(@fg.l Map<? extends K, ? extends V> from) {
        Object obj;
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> i4;
        int modification;
        m I;
        Object obj2;
        boolean z4;
        do {
            obj = e0.f17053a;
            synchronized (obj) {
                r0 r0Var = this.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) v.G((a) r0Var);
                i4 = aVar.i();
                modification = aVar.getModification();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i4);
            h.a<K, V> g4 = i4.g();
            g4.putAll(from);
            androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> a5 = g4.a();
            if (kotlin.jvm.internal.l0.g(a5, i4)) {
                return;
            }
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj2 = e0.f17053a;
                synchronized (obj2) {
                    if (aVar3.getModification() == modification) {
                        aVar3.k(a5);
                        z4 = true;
                        aVar3.l(aVar3.getModification() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            v.U(I, this);
        } while (!z4);
    }

    public final boolean q(@fg.l ld.l<? super Map.Entry<K, V>, Boolean> predicate) {
        Object obj;
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> i4;
        int modification;
        boolean z4;
        m I;
        Object obj2;
        boolean z5 = false;
        do {
            obj = e0.f17053a;
            synchronized (obj) {
                r0 r0Var = this.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) v.G((a) r0Var);
                i4 = aVar.i();
                modification = aVar.getModification();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i4);
            h.a<K, V> g4 = i4.g();
            Iterator<Map.Entry<K, V>> it = this.entries.iterator();
            while (true) {
                z4 = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it.next();
                if (predicate.invoke(next).booleanValue()) {
                    g4.remove(next.getKey());
                    z5 = true;
                }
            }
            k2 k2Var2 = k2.f75408a;
            androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> a5 = g4.a();
            if (kotlin.jvm.internal.l0.g(a5, i4)) {
                break;
            }
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj2 = e0.f17053a;
                synchronized (obj2) {
                    if (aVar3.getModification() == modification) {
                        aVar3.k(a5);
                        aVar3.l(aVar3.getModification() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            v.U(I, this);
        } while (!z4);
        return z5;
    }

    public final boolean r(V value) {
        Object obj;
        Iterator<T> it = this.entries.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.l0.g(((Map.Entry) obj).getValue(), value)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    @fg.m
    public V remove(Object key) {
        Object obj;
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> i4;
        int modification;
        V remove;
        m I;
        Object obj2;
        boolean z4;
        do {
            obj = e0.f17053a;
            synchronized (obj) {
                r0 r0Var = this.firstStateRecord;
                kotlin.jvm.internal.l0.n(r0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) v.G((a) r0Var);
                i4 = aVar.i();
                modification = aVar.getModification();
                k2 k2Var = k2.f75408a;
            }
            kotlin.jvm.internal.l0.m(i4);
            h.a<K, V> g4 = i4.g();
            remove = g4.remove(key);
            androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> a5 = g4.a();
            if (kotlin.jvm.internal.l0.g(a5, i4)) {
                break;
            }
            r0 r0Var2 = this.firstStateRecord;
            kotlin.jvm.internal.l0.n(r0Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) r0Var2;
            v.M();
            synchronized (v.K()) {
                m.INSTANCE.getClass();
                I = v.I();
                a aVar3 = (a) v.r0(aVar2, this, I);
                obj2 = e0.f17053a;
                synchronized (obj2) {
                    if (aVar3.getModification() == modification) {
                        aVar3.k(a5);
                        z4 = true;
                        aVar3.l(aVar3.getModification() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            v.U(I, this);
        } while (!z4);
        return remove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m();
    }

    @fg.l
    public final Map<K, V> t() {
        return j().i();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.values;
    }
}
