package androidx.compose.runtime.snapshots;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u001b\b\u0017\u0018\u0000 \u00132\u00020\u0001:\u0001lBE\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u0015\u001a\u00020\u00002\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u000eJ%\u0010\u001b\u001a\u00020\u00012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\bH\u0010¢\u0006\u0004\b!\u0010\u000eJ\u000f\u0010\"\u001a\u00020\bH\u0010¢\u0006\u0004\b\"\u0010\u000eJ\u000f\u0010#\u001a\u00020\bH\u0010¢\u0006\u0004\b#\u0010\u000eJ5\u0010)\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00022\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0018\u00010%2\u0006\u0010(\u001a\u00020\u0004H\u0000¢\u0006\u0004\b)\u0010*J$\u0010.\u001a\u00028\u0000\"\u0004\b\u0000\u0010+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0080\b¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\bH\u0000¢\u0006\u0004\b0\u0010\u000eJ\u0017\u00101\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b3\u00102J\u0017\u00106\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b6\u00107J\u0017\u0010+\u001a\u00020\b2\u0006\u00108\u001a\u00020\u0004H\u0000¢\u0006\u0004\b+\u00109J\u0017\u0010<\u001a\u00020\b2\u0006\u0010;\u001a\u00020:H\u0010¢\u0006\u0004\b<\u0010=R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\"\u0010I\u001a\u00020\u00028\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u00102R:\u0010Q\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010J2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010J8\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bD\u0010N\"\u0004\bO\u0010PR*\u0010X\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010R8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010^\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u00109R\"\u0010d\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u00107R\u0016\u00108\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\"\u0010h\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010O\u001a\u0004\be\u0010\u0014\"\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010\u0014R\u0014\u0010k\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010j¨\u0006m"}, d2 = {"Landroidx/compose/runtime/snapshots/e;", "Landroidx/compose/runtime/snapshots/m;", "", "id", "Landroidx/compose/runtime/snapshots/t;", "invalid", "Lkotlin/Function1;", "", "Lkotlin/k2;", "readObserver", "writeObserver", "<init>", "(ILandroidx/compose/runtime/snapshots/t;Lld/l;Lld/l;)V", "e0", "()V", "f0", "J", "W", "", "p", "()Z", "c0", "(Lld/l;Lld/l;)Landroidx/compose/runtime/snapshots/e;", "Landroidx/compose/runtime/snapshots/n;", "M", "()Landroidx/compose/runtime/snapshots/n;", "d", "D", "(Lld/l;)Landroidx/compose/runtime/snapshots/m;", "snapshot", "s", "(Landroidx/compose/runtime/snapshots/m;)V", "t", "u", "c", "x", "snapshotId", "", "Landroidx/compose/runtime/snapshots/r0;", "optimisticMerges", "invalidSnapshots", "R", "(ILjava/util/Map;Landroidx/compose/runtime/snapshots/t;)Landroidx/compose/runtime/snapshots/n;", "T", "Lkotlin/Function0;", "block", "K", "(Lld/a;)Ljava/lang/Object;", "L", "S", "(I)V", "U", "", "handles", "V", "([I)V", "snapshots", "(Landroidx/compose/runtime/snapshots/t;)V", "Landroidx/compose/runtime/snapshots/p0;", "state", "v", "(Landroidx/compose/runtime/snapshots/p0;)V", "g", "Lld/l;", "k", "()Lld/l;", "h", "o", "i", "I", "n", "()I", "C", "writeCount", "Landroidx/compose/runtime/collection/d;", "<set-?>", "j", "Landroidx/compose/runtime/collection/d;", "()Landroidx/compose/runtime/collection/d;", "Z", "(Landroidx/compose/runtime/collection/d;)V", "modified", "", "Ljava/util/List;", "O", "()Ljava/util/List;", "Y", "(Ljava/util/List;)V", "merged", "l", "Landroidx/compose/runtime/snapshots/t;", "P", "()Landroidx/compose/runtime/snapshots/t;", "a0", "previousIds", "m", "[I", "Q", "()[I", "b0", "previousPinnedSnapshots", "N", "X", "(Z)V", "applied", "readOnly", "()Landroidx/compose/runtime/snapshots/m;", "root", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,2294:1\n978#1,2:2295\n984#1,3:2299\n987#1,6:2304\n978#1,2:2346\n984#1,3:2350\n987#1,6:2355\n978#1,9:2392\n987#1,6:2403\n1714#2:2297\n1714#2:2302\n1714#2:2310\n1714#2:2324\n1714#2:2348\n1714#2:2353\n1714#2:2381\n1714#2:2390\n1714#2:2401\n1714#2:2409\n1714#2:2411\n82#3:2298\n82#3:2303\n82#3:2311\n82#3:2325\n82#3:2349\n82#3:2354\n82#3:2382\n82#3:2391\n82#3:2402\n82#3:2410\n82#3:2412\n33#4,6:2312\n33#4,6:2318\n33#4,6:2340\n33#4,4:2377\n38#4:2383\n33#4,6:2384\n108#5,7:2326\n108#5,7:2333\n108#5,7:2363\n108#5,7:2370\n1#6:2361\n192#7:2362\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n*L\n676#1:2295,2\n676#1:2299,3\n676#1:2304,6\n808#1:2346,2\n808#1:2350,3\n808#1:2355,6\n995#1:2392,9\n995#1:2403,6\n677#1:2297\n676#1:2302\n728#1:2310\n781#1:2324\n809#1:2348\n808#1:2353\n961#1:2381\n986#1:2390\n995#1:2401\n998#1:2409\n1022#1:2411\n677#1:2298\n676#1:2303\n728#1:2311\n781#1:2325\n809#1:2349\n808#1:2354\n961#1:2382\n986#1:2391\n995#1:2402\n998#1:2410\n1022#1:2412\n767#1:2312,6\n773#1:2318,6\n786#1:2340,6\n958#1:2377,4\n958#1:2383\n969#1:2384,6\n784#1:2326,7\n785#1:2333,7\n873#1:2363,7\n908#1:2370,7\n855#1:2362\n*E\n"})
/* loaded from: classes.dex */
public class e extends m {

    /* renamed from: q, reason: collision with root package name */
    public static final int f17042q = 8;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<Object, k2> readObserver;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<Object, k2> writeObserver;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int writeCount;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.runtime.collection.d<p0> modified;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private List<? extends p0> merged;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private t previousIds;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private int[] previousPinnedSnapshots;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int snapshots;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean applied;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private static final a f17041p = new a();

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    private static final int[] f17043r = new int[0];

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/e$a;", "", "<init>", "()V", "", "EmptyIntArray", "[I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public e(int i4, @fg.l t tVar, @fg.m ld.l<Object, k2> lVar, @fg.m ld.l<Object, k2> lVar2) {
        super(i4, tVar, null);
        this.readObserver = lVar;
        this.writeObserver = lVar2;
        t.INSTANCE.getClass();
        this.previousIds = t.f17146h;
        this.previousPinnedSnapshots = f17043r;
        this.snapshots = 1;
    }

    private final void J() {
        androidx.compose.runtime.collection.d<p0> i4 = i();
        if (i4 != null) {
            e0();
            Z(null);
            int id2 = getId();
            Object[] values = i4.getValues();
            int size = i4.size();
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = values[i5];
                kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                for (r0 firstStateRecord = ((p0) obj).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
                    if (firstStateRecord.getSnapshotId() == id2 || kotlin.collections.w.W1(this.previousIds, Integer.valueOf(firstStateRecord.getSnapshotId()))) {
                        firstStateRecord.h(0);
                    }
                }
            }
        }
        b();
    }

    private final void W() {
        int length = this.previousPinnedSnapshots.length;
        for (int i4 = 0; i4 < length; i4++) {
            v.e0(this.previousPinnedSnapshots[i4]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e d0(e eVar, ld.l lVar, ld.l lVar2, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if ((i4 & 1) != 0) {
            lVar = null;
        }
        if ((i4 & 2) != 0) {
            lVar2 = null;
        }
        return eVar.c0(lVar, lVar2);
    }

    private final void e0() {
        if (this.applied) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void f0() {
        int i4;
        if (this.applied) {
            i4 = ((m) this).pinningTrackingHandle;
            if (i4 < 0) {
                throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot");
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void C(int i4) {
        this.writeCount = i4;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.l
    public m D(@fg.m ld.l<Object, k2> readObserver) {
        int i4;
        g gVar;
        int i5;
        I();
        f0();
        int id2 = getId();
        S(getId());
        synchronized (v.K()) {
            i4 = v.f17173f;
            v.f17173f = i4 + 1;
            v.f17172e = v.f17172e.v(i4);
            gVar = new g(i4, v.A(getInvalid(), id2 + 1, i4), readObserver, this);
        }
        if (!this.applied && !getDisposed()) {
            int id3 = getId();
            synchronized (v.K()) {
                i5 = v.f17173f;
                v.f17173f = i5 + 1;
                A(i5);
                v.f17172e = v.f17172e.v(getId());
                k2 k2Var = k2.f75408a;
            }
            B(v.A(getInvalid(), id3 + 1, getId()));
        }
        return gVar;
    }

    public final <T> T K(@fg.l ld.a<? extends T> block) {
        int i4;
        S(getId());
        T invoke = block.invoke();
        if (!this.applied && !getDisposed()) {
            int id2 = getId();
            synchronized (v.K()) {
                i4 = v.f17173f;
                v.f17173f = i4 + 1;
                A(i4);
                v.f17172e = v.f17172e.v(getId());
                k2 k2Var = k2.f75408a;
            }
            B(v.A(getInvalid(), id2 + 1, getId()));
        }
        return invoke;
    }

    public final void L() {
        int i4;
        S(getId());
        k2 k2Var = k2.f75408a;
        if (this.applied || getDisposed()) {
            return;
        }
        int id2 = getId();
        synchronized (v.K()) {
            i4 = v.f17173f;
            v.f17173f = i4 + 1;
            A(i4);
            v.f17172e = v.f17172e.v(getId());
        }
        B(v.A(getInvalid(), id2 + 1, getId()));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0 A[LOOP:0: B:25:0x00be->B:26:0x00c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc A[LOOP:1: B:32:0x00da->B:33:0x00dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.snapshots.n M() {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.e.M():androidx.compose.runtime.snapshots.n");
    }

    /* renamed from: N, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    @fg.m
    public final List<p0> O() {
        return this.merged;
    }

    @fg.l
    /* renamed from: P, reason: from getter */
    public final t getPreviousIds() {
        return this.previousIds;
    }

    @fg.l
    /* renamed from: Q, reason: from getter */
    public final int[] getPreviousPinnedSnapshots() {
        return this.previousPinnedSnapshots;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0042, code lost:
    
        r15 = androidx.compose.runtime.snapshots.v.b0(r11, getId(), r2);
     */
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.snapshots.n R(int r19, @fg.m java.util.Map<androidx.compose.runtime.snapshots.r0, ? extends androidx.compose.runtime.snapshots.r0> r20, @fg.l androidx.compose.runtime.snapshots.t r21) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.e.R(int, java.util.Map, androidx.compose.runtime.snapshots.t):androidx.compose.runtime.snapshots.n");
    }

    public final void S(int id2) {
        synchronized (v.K()) {
            this.previousIds = this.previousIds.v(id2);
            k2 k2Var = k2.f75408a;
        }
    }

    public final void T(@fg.l t snapshots) {
        synchronized (v.K()) {
            this.previousIds = this.previousIds.s(snapshots);
            k2 k2Var = k2.f75408a;
        }
    }

    public final void U(int id2) {
        if (id2 >= 0) {
            this.previousPinnedSnapshots = kotlin.collections.l.q3(this.previousPinnedSnapshots, id2);
        }
    }

    public final void V(@fg.l int[] handles) {
        if (handles.length == 0) {
            return;
        }
        int[] iArr = this.previousPinnedSnapshots;
        if (iArr.length != 0) {
            handles = kotlin.collections.l.s3(iArr, handles);
        }
        this.previousPinnedSnapshots = handles;
    }

    public final void X(boolean z4) {
        this.applied = z4;
    }

    public final void Y(@fg.m List<? extends p0> list) {
        this.merged = list;
    }

    public void Z(@fg.m androidx.compose.runtime.collection.d<p0> dVar) {
        this.modified = dVar;
    }

    public final void a0(@fg.l t tVar) {
        this.previousIds = tVar;
    }

    public final void b0(@fg.l int[] iArr) {
        this.previousPinnedSnapshots = iArr;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void c() {
        v.f17172e = v.f17172e.m(getId()).l(this.previousIds);
    }

    @fg.l
    public e c0(@fg.m ld.l<Object, k2> readObserver, @fg.m ld.l<Object, k2> writeObserver) {
        int i4;
        f fVar;
        ld.l Q;
        int i5;
        I();
        f0();
        S(getId());
        synchronized (v.K()) {
            i4 = v.f17173f;
            v.f17173f = i4 + 1;
            v.f17172e = v.f17172e.v(i4);
            t invalid = getInvalid();
            B(invalid.v(i4));
            t A = v.A(invalid, getId() + 1, i4);
            ld.l P = v.P(readObserver, k(), false, 4, null);
            Q = v.Q(writeObserver, o());
            fVar = new f(i4, A, P, Q, this);
        }
        if (!this.applied && !getDisposed()) {
            int id2 = getId();
            synchronized (v.K()) {
                i5 = v.f17173f;
                v.f17173f = i5 + 1;
                A(i5);
                v.f17172e = v.f17172e.v(getId());
                k2 k2Var = k2.f75408a;
            }
            B(v.A(getInvalid(), id2 + 1, getId()));
        }
        return fVar;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void d() {
        if (getDisposed()) {
            return;
        }
        super.d();
        t(this);
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.m
    public androidx.compose.runtime.collection.d<p0> i() {
        return this.modified;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.m
    public ld.l<Object, k2> k() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public boolean l() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.l
    public m m() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.m
    /* renamed from: n, reason: from getter */
    public int getWriteCount() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.m
    public ld.l<Object, k2> o() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public boolean p() {
        androidx.compose.runtime.collection.d<p0> i4 = i();
        return i4 != null && i4.q();
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void s(@fg.l m snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void t(@fg.l m snapshot) {
        int i4 = this.snapshots;
        if (i4 <= 0) {
            throw new IllegalArgumentException("no pending nested snapshots");
        }
        int i5 = i4 - 1;
        this.snapshots = i5;
        if (i5 != 0 || this.applied) {
            return;
        }
        J();
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void u() {
        if (this.applied || getDisposed()) {
            return;
        }
        L();
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void v(@fg.l p0 state) {
        androidx.compose.runtime.collection.d<p0> i4 = i();
        if (i4 == null) {
            i4 = new androidx.compose.runtime.collection.d<>();
            Z(i4);
        }
        i4.add(state);
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void x() {
        W();
        w();
    }
}
