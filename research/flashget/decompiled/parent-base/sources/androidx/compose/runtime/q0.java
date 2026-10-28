package androidx.compose.runtime;

import androidx.compose.runtime.r0;
import androidx.compose.runtime.snapshots.m;
import kotlin.Metadata;

/* compiled from: DerivedState.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00011B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJA\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0001\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0019\u0010(\u001a\u0004\u0018\u00018\u00008G¢\u0006\f\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0014\u0010+\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010\u0017\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010%R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Landroidx/compose/runtime/q0;", "T", "Landroidx/compose/runtime/snapshots/q0;", "Landroidx/compose/runtime/r0;", "Lkotlin/Function0;", "calculation", "Landroidx/compose/runtime/m4;", "policy", "<init>", "(Lld/a;Landroidx/compose/runtime/m4;)V", "Landroidx/compose/runtime/q0$a;", "readable", "Landroidx/compose/runtime/snapshots/m;", "snapshot", "", "forceDependencyReads", "R", "(Landroidx/compose/runtime/q0$a;Landroidx/compose/runtime/snapshots/m;ZLld/a;)Landroidx/compose/runtime/q0$a;", "", "()Ljava/lang/String;", "Landroidx/compose/runtime/snapshots/r0;", "Q", "(Landroidx/compose/runtime/snapshots/m;)Landroidx/compose/runtime/snapshots/r0;", "value", "Lkotlin/k2;", "A", "(Landroidx/compose/runtime/snapshots/r0;)V", "toString", "d", "Lld/a;", "e", "Landroidx/compose/runtime/m4;", "()Landroidx/compose/runtime/m4;", "f", "Landroidx/compose/runtime/q0$a;", "first", "U", "()Ljava/lang/Object;", "V", "()V", "debuggerDisplayValue", "F", "()Landroidx/compose/runtime/snapshots/r0;", "firstStateRecord", "getValue", "Landroidx/compose/runtime/r0$a;", "P", "()Landroidx/compose/runtime/r0$a;", "currentRecord", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n+ 2 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 7 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,396:1\n368#2,2:397\n370#2,2:410\n75#2,4:412\n373#2,2:442\n75#2,4:444\n368#2,2:448\n370#2,5:461\n460#3,11:399\n460#3,11:450\n401#4,4:416\n373#4,6:420\n383#4,3:427\n386#4,2:431\n406#4,2:433\n389#4,6:435\n408#4:441\n1810#5:426\n1672#5:430\n1714#6:466\n2283#6:468\n2283#6:469\n2283#6:470\n2283#6:471\n2283#6:472\n82#7:467\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n*L\n179#1:397,2\n179#1:410,2\n181#1:412,4\n179#1:442,2\n195#1:444,4\n197#1:448,2\n197#1:461,5\n179#1:399,11\n197#1:450,11\n183#1:416,4\n183#1:420,6\n183#1:427,3\n183#1:431,2\n183#1:433,2\n183#1:435,6\n183#1:441\n183#1:426\n183#1:430\n220#1:466\n266#1:468\n273#1:469\n278#1:470\n289#1:471\n297#1:472\n220#1:467\n*E\n"})
/* loaded from: classes.dex */
final class q0<T> extends androidx.compose.runtime.snapshots.q0 implements r0<T> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<T> calculation;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final m4<T> policy;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private a<T> first = new a<>();

    /* compiled from: DerivedState.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0007\u0018\u0000 7*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u00015B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00132\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001b\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR(\u0010(\u001a\b\u0012\u0004\u0012\u00020!0 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0016\u001a\u0004\b2\u0010\u0018\"\u0004\b3\u0010\u001aR\u0014\u00106\u001a\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010-¨\u00068"}, d2 = {"Landroidx/compose/runtime/q0$a;", "T", "Landroidx/compose/runtime/snapshots/r0;", "Landroidx/compose/runtime/r0$a;", "<init>", "()V", "value", "Lkotlin/k2;", "c", "(Landroidx/compose/runtime/snapshots/r0;)V", "d", "()Landroidx/compose/runtime/snapshots/r0;", "Landroidx/compose/runtime/r0;", "derivedState", "Landroidx/compose/runtime/snapshots/m;", "snapshot", "", "n", "(Landroidx/compose/runtime/r0;Landroidx/compose/runtime/snapshots/m;)Z", "", "o", "(Landroidx/compose/runtime/r0;Landroidx/compose/runtime/snapshots/m;)I", "I", "l", "()I", "s", "(I)V", "validSnapshotId", "e", "m", "t", "validSnapshotWriteCount", "Landroidx/collection/n2;", "Landroidx/compose/runtime/snapshots/p0;", "f", "Landroidx/collection/n2;", "b", "()Landroidx/collection/n2;", "p", "(Landroidx/collection/n2;)V", "dependencies", "", "g", "Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "q", "(Ljava/lang/Object;)V", "result", "h", "k", "r", "resultHash", "a", "currentValue", "i", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 0)
    @kotlin.jvm.internal.r1({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,396:1\n1714#2:397\n1714#2:399\n1714#2:401\n82#3:398\n82#3:400\n82#3:402\n368#4,2:403\n370#4,2:416\n373#4,2:444\n460#5,11:405\n401#6,4:418\n373#6,6:422\n383#6,3:429\n386#6,2:433\n406#6,2:435\n389#6,6:437\n408#6:443\n1810#7:428\n1672#7:432\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n*L\n110#1:397\n117#1:399\n128#1:401\n110#1:398\n117#1:400\n128#1:402\n130#1:403,2\n130#1:416,2\n130#1:444,2\n130#1:405,11\n131#1:418,4\n131#1:422,6\n131#1:429,3\n131#1:433,2\n131#1:435,2\n131#1:437,6\n131#1:443\n131#1:428\n131#1:432\n*E\n"})
    public static final class a<T> extends androidx.compose.runtime.snapshots.r0 implements r0.a<T> {

        /* renamed from: j, reason: collision with root package name */
        public static final int f16884j = 8;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int validSnapshotId;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int validSnapshotWriteCount;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private androidx.collection.n2<androidx.compose.runtime.snapshots.p0> dependencies = androidx.collection.o2.a();

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Object result = f16885k;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private int resultHash;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: k, reason: collision with root package name */
        @fg.l
        private static final Object f16885k = new Object();

        /* compiled from: DerivedState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/q0$a$a;", "", "<init>", "()V", "Unset", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.runtime.q0$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @fg.l
            public final Object a() {
                return a.f16885k;
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        @Override // androidx.compose.runtime.r0.a
        public T a() {
            return (T) this.result;
        }

        @Override // androidx.compose.runtime.r0.a
        @fg.l
        public androidx.collection.n2<androidx.compose.runtime.snapshots.p0> b() {
            return this.dependencies;
        }

        @Override // androidx.compose.runtime.snapshots.r0
        public void c(@fg.l androidx.compose.runtime.snapshots.r0 value) {
            kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            a aVar = (a) value;
            this.dependencies = aVar.dependencies;
            this.result = aVar.result;
            this.resultHash = aVar.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.r0
        @fg.l
        public androidx.compose.runtime.snapshots.r0 d() {
            return new a();
        }

        @fg.m
        /* renamed from: j, reason: from getter */
        public final Object getResult() {
            return this.result;
        }

        /* renamed from: k, reason: from getter */
        public final int getResultHash() {
            return this.resultHash;
        }

        /* renamed from: l, reason: from getter */
        public final int getValidSnapshotId() {
            return this.validSnapshotId;
        }

        /* renamed from: m, reason: from getter */
        public final int getValidSnapshotWriteCount() {
            return this.validSnapshotWriteCount;
        }

        public final boolean n(@fg.l r0<?> derivedState, @fg.l androidx.compose.runtime.snapshots.m snapshot) {
            boolean z4;
            boolean z5;
            synchronized (androidx.compose.runtime.snapshots.v.K()) {
                z4 = true;
                if (this.validSnapshotId == snapshot.getId()) {
                    if (this.validSnapshotWriteCount == snapshot.getWriteCount()) {
                        z5 = false;
                    }
                }
                z5 = true;
            }
            if (this.result == f16885k || (z5 && this.resultHash != o(derivedState, snapshot))) {
                z4 = false;
            }
            if (z4 && z5) {
                synchronized (androidx.compose.runtime.snapshots.v.K()) {
                    this.validSnapshotId = snapshot.getId();
                    this.validSnapshotWriteCount = snapshot.getWriteCount();
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                }
            }
            return z4;
        }

        public final int o(@fg.l r0<?> derivedState, @fg.l androidx.compose.runtime.snapshots.m snapshot) {
            androidx.collection.n2<androidx.compose.runtime.snapshots.p0> n2Var;
            int i4;
            int i5;
            synchronized (androidx.compose.runtime.snapshots.v.K()) {
                n2Var = this.dependencies;
            }
            char c5 = 7;
            if (!n2Var.y()) {
                return 7;
            }
            androidx.compose.runtime.collection.g<s0> b5 = p4.b();
            int size = b5.getSize();
            if (size > 0) {
                s0[] L = b5.L();
                int i6 = 0;
                do {
                    L[i6].b(derivedState);
                    i6++;
                } while (i6 < size);
            }
            try {
                Object[] objArr = n2Var.keys;
                int[] iArr = n2Var.values;
                long[] jArr = n2Var.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 7;
                    int i10 = 0;
                    while (true) {
                        long j4 = jArr[i10];
                        if ((((~j4) << c5) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8;
                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((j4 & 255) < 128) {
                                    int i14 = (i10 << 3) + i13;
                                    androidx.compose.runtime.snapshots.p0 p0Var = (androidx.compose.runtime.snapshots.p0) objArr[i14];
                                    if (iArr[i14] == 1) {
                                        androidx.compose.runtime.snapshots.r0 Q = p0Var instanceof q0 ? ((q0) p0Var).Q(snapshot) : androidx.compose.runtime.snapshots.v.H(p0Var.getFirstStateRecord(), snapshot);
                                        i7 = (((i7 * 31) + System.identityHashCode(Q)) * 31) + Q.getSnapshotId();
                                    }
                                    i5 = 8;
                                } else {
                                    i5 = i11;
                                }
                                j4 >>= i5;
                                i13++;
                                i11 = i5;
                            }
                            if (i12 != i11) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                        c5 = 7;
                    }
                    i4 = i7;
                } else {
                    i4 = 7;
                }
                kotlin.k2 k2Var = kotlin.k2.f75408a;
                int size2 = b5.getSize();
                if (size2 <= 0) {
                    return i4;
                }
                s0[] L2 = b5.L();
                int i15 = 0;
                do {
                    L2[i15].a(derivedState);
                    i15++;
                } while (i15 < size2);
                return i4;
            } catch (Throwable th) {
                int size3 = b5.getSize();
                if (size3 > 0) {
                    s0[] L3 = b5.L();
                    int i16 = 0;
                    do {
                        L3[i16].a(derivedState);
                        i16++;
                    } while (i16 < size3);
                }
                throw th;
            }
        }

        public void p(@fg.l androidx.collection.n2<androidx.compose.runtime.snapshots.p0> n2Var) {
            this.dependencies = n2Var;
        }

        public final void q(@fg.m Object obj) {
            this.result = obj;
        }

        public final void r(int i4) {
            this.resultHash = i4;
        }

        public final void s(int i4) {
            this.validSnapshotId = i4;
        }

        public final void t(int i4) {
            this.validSnapshotWriteCount = i4;
        }
    }

    /* compiled from: DerivedState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Object, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q0<T> f16891b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.internal.n f16892c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.collection.g2<androidx.compose.runtime.snapshots.p0> f16893d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f16894e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q0<T> q0Var, androidx.compose.runtime.internal.n nVar, androidx.collection.g2<androidx.compose.runtime.snapshots.p0> g2Var, int i4) {
            super(1);
            this.f16891b = q0Var;
            this.f16892c = nVar;
            this.f16893d = g2Var;
            this.f16894e = i4;
        }

        public final void a(@fg.l Object obj) {
            if (obj == this.f16891b) {
                throw new IllegalStateException("A derived state calculation cannot read itself");
            }
            if (obj instanceof androidx.compose.runtime.snapshots.p0) {
                int element = this.f16892c.getElement();
                androidx.collection.g2<androidx.compose.runtime.snapshots.p0> g2Var = this.f16893d;
                g2Var.l0(obj, Math.min(element - this.f16894e, g2Var.r(obj, Integer.MAX_VALUE)));
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Object obj) {
            a(obj);
            return kotlin.k2.f75408a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q0(@fg.l ld.a<? extends T> aVar, @fg.m m4<T> m4Var) {
        this.calculation = aVar;
        this.policy = m4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final a<T> R(a<T> readable, androidx.compose.runtime.snapshots.m snapshot, boolean forceDependencyReads, ld.a<? extends T> calculation) {
        u4 u4Var;
        m.Companion companion;
        u4 u4Var2;
        m4<T> m4Var;
        u4 u4Var3;
        u4 u4Var4;
        int i4;
        u4 u4Var5;
        a<T> aVar = readable;
        if (!aVar.n(this, snapshot)) {
            int i5 = 0;
            androidx.collection.g2 g2Var = new androidx.collection.g2(0, 1, null);
            u4Var = p4.f16878a;
            androidx.compose.runtime.internal.n nVar = (androidx.compose.runtime.internal.n) u4Var.a();
            if (nVar == null) {
                nVar = new androidx.compose.runtime.internal.n(0);
                u4Var3 = p4.f16878a;
                u4Var3.b(nVar);
            }
            int element = nVar.getElement();
            androidx.compose.runtime.collection.g<s0> b5 = p4.b();
            int size = b5.getSize();
            if (size > 0) {
                s0[] L = b5.L();
                int i6 = 0;
                while (true) {
                    L[i6].b(this);
                    int i7 = i6 + 1;
                    if (i7 >= size) {
                        break;
                    }
                    i6 = i7;
                }
            }
            try {
                nVar.b(element + 1);
                Object h4 = androidx.compose.runtime.snapshots.m.INSTANCE.h(new b(this, nVar, g2Var, element), null, calculation);
                nVar.b(element);
                int size2 = b5.getSize();
                if (size2 > 0) {
                    s0[] L2 = b5.L();
                    do {
                        L2[i5].a(this);
                        i5++;
                    } while (i5 < size2);
                }
                synchronized (androidx.compose.runtime.snapshots.v.K()) {
                    try {
                        companion = androidx.compose.runtime.snapshots.m.INSTANCE;
                        companion.getClass();
                        androidx.compose.runtime.snapshots.m I = androidx.compose.runtime.snapshots.v.I();
                        Object result = readable.getResult();
                        a.INSTANCE.getClass();
                        if (result == a.f16885k || (m4Var = this.policy) == 0 || !m4Var.c(h4, readable.getResult())) {
                            aVar = (a) androidx.compose.runtime.snapshots.v.S(this.first, this, I);
                            aVar.p(g2Var);
                            aVar.r(aVar.o(this, I));
                            aVar.s(snapshot.getId());
                            aVar.t(snapshot.getWriteCount());
                            aVar.q(h4);
                        } else {
                            aVar.p(g2Var);
                            aVar.r(aVar.o(this, I));
                            aVar.s(snapshot.getId());
                            aVar.t(snapshot.getWriteCount());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                u4Var2 = p4.f16878a;
                androidx.compose.runtime.internal.n nVar2 = (androidx.compose.runtime.internal.n) u4Var2.a();
                if (nVar2 != null && nVar2.getElement() == 0) {
                    companion.g();
                }
                return aVar;
            } catch (Throwable th2) {
                int size3 = b5.getSize();
                if (size3 > 0) {
                    s0[] L3 = b5.L();
                    int i10 = 0;
                    do {
                        L3[i10].a(this);
                        i10++;
                    } while (i10 < size3);
                }
                throw th2;
            }
        }
        if (forceDependencyReads) {
            androidx.compose.runtime.collection.g<s0> b6 = p4.b();
            int size4 = b6.getSize();
            if (size4 > 0) {
                s0[] L4 = b6.L();
                int i11 = 0;
                do {
                    L4[i11].b(this);
                    i11++;
                } while (i11 < size4);
            }
            try {
                androidx.collection.n2<androidx.compose.runtime.snapshots.p0> b7 = readable.b();
                u4Var4 = p4.f16878a;
                androidx.compose.runtime.internal.n nVar3 = (androidx.compose.runtime.internal.n) u4Var4.a();
                if (nVar3 == null) {
                    nVar3 = new androidx.compose.runtime.internal.n(0);
                    u4Var5 = p4.f16878a;
                    u4Var5.b(nVar3);
                }
                int element2 = nVar3.getElement();
                Object[] objArr = b7.keys;
                int[] iArr = b7.values;
                long[] jArr = b7.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j4 = jArr[i12];
                        long[] jArr2 = jArr;
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8;
                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                            int i15 = 0;
                            while (i15 < i14) {
                                if ((j4 & 255) < 128) {
                                    int i16 = (i12 << 3) + i15;
                                    androidx.compose.runtime.snapshots.p0 p0Var = (androidx.compose.runtime.snapshots.p0) objArr[i16];
                                    nVar3.b(element2 + iArr[i16]);
                                    ld.l<Object, kotlin.k2> k4 = snapshot.k();
                                    if (k4 != null) {
                                        k4.invoke(p0Var);
                                    }
                                    i4 = 8;
                                } else {
                                    i4 = i13;
                                }
                                j4 >>= i4;
                                i15++;
                                i13 = i4;
                            }
                            if (i14 != i13) {
                                break;
                            }
                        }
                        if (i12 == length) {
                            break;
                        }
                        i12++;
                        jArr = jArr2;
                    }
                }
                nVar3.b(element2);
                kotlin.k2 k2Var = kotlin.k2.f75408a;
                int size5 = b6.getSize();
                if (size5 > 0) {
                    s0[] L5 = b6.L();
                    int i17 = 0;
                    do {
                        L5[i17].a(this);
                        i17++;
                    } while (i17 < size5);
                }
            } catch (Throwable th3) {
                int size6 = b6.getSize();
                if (size6 > 0) {
                    s0[] L6 = b6.L();
                    int i18 = 0;
                    do {
                        L6[i18].a(this);
                        i18++;
                    } while (i18 < size6);
                }
                throw th3;
            }
        }
        return aVar;
    }

    private final String T() {
        a aVar = (a) androidx.compose.runtime.snapshots.v.G(this.first);
        androidx.compose.runtime.snapshots.m.INSTANCE.getClass();
        return aVar.n(this, androidx.compose.runtime.snapshots.v.I()) ? String.valueOf(aVar.getResult()) : "<Not calculated>";
    }

    public static /* synthetic */ void V() {
    }

    @Override // androidx.compose.runtime.snapshots.p0
    public void A(@fg.l androidx.compose.runtime.snapshots.r0 value) {
        kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.first = (a) value;
    }

    @Override // androidx.compose.runtime.snapshots.p0
    @fg.l
    /* renamed from: F */
    public androidx.compose.runtime.snapshots.r0 getFirstStateRecord() {
        return this.first;
    }

    @Override // androidx.compose.runtime.r0
    @fg.l
    public r0.a<T> P() {
        a<T> aVar = (a) androidx.compose.runtime.snapshots.v.G(this.first);
        androidx.compose.runtime.snapshots.m.INSTANCE.getClass();
        return R(aVar, androidx.compose.runtime.snapshots.v.I(), false, this.calculation);
    }

    @fg.l
    public final androidx.compose.runtime.snapshots.r0 Q(@fg.l androidx.compose.runtime.snapshots.m snapshot) {
        return R((a) androidx.compose.runtime.snapshots.v.H(this.first, snapshot), snapshot, false, this.calculation);
    }

    @fg.m
    @kd.i(name = "getDebuggerDisplayValue")
    public final T U() {
        a aVar = (a) androidx.compose.runtime.snapshots.v.G(this.first);
        androidx.compose.runtime.snapshots.m.INSTANCE.getClass();
        if (aVar.n(this, androidx.compose.runtime.snapshots.v.I())) {
            return (T) aVar.getResult();
        }
        return null;
    }

    @Override // androidx.compose.runtime.r0
    @fg.m
    public m4<T> e() {
        return this.policy;
    }

    @Override // androidx.compose.runtime.b5
    public T getValue() {
        m.Companion companion = androidx.compose.runtime.snapshots.m.INSTANCE;
        companion.getClass();
        ld.l<Object, kotlin.k2> k4 = androidx.compose.runtime.snapshots.v.I().k();
        if (k4 != null) {
            k4.invoke(this);
        }
        a<T> aVar = (a) androidx.compose.runtime.snapshots.v.G(this.first);
        companion.getClass();
        return (T) R(aVar, androidx.compose.runtime.snapshots.v.I(), true, this.calculation).getResult();
    }

    @fg.l
    public String toString() {
        return "DerivedState(value=" + T() + ")@" + hashCode();
    }
}
