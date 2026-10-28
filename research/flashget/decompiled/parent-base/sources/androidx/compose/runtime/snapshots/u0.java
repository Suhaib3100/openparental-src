package androidx.compose.runtime.snapshots;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Snapshot.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\u00020\u00012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0017\u0010\rJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001c\u0010\u001bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R(\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b&\u0010%R\u001a\u0010+\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R$\u00103\u001a\u00020.2\u0006\u0010/\u001a\u00020.8V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u00100\"\u0004\b1\u00102R$\u00108\u001a\u0002042\u0006\u0010/\u001a\u0002048P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b\u001f\u00105\"\u0004\b6\u00107R4\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001092\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001098P@VX\u0090\u000e¢\u0006\f\u001a\u0004\b!\u0010:\"\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u000f¨\u0006?"}, d2 = {"Landroidx/compose/runtime/snapshots/u0;", "Landroidx/compose/runtime/snapshots/m;", "previousSnapshot", "Lkotlin/Function1;", "", "Lkotlin/k2;", "specifiedReadObserver", "", "mergeParentObservers", "ownsPreviousSnapshot", "<init>", "(Landroidx/compose/runtime/snapshots/m;Lld/l;ZZ)V", "d", "()V", "p", "()Z", "Landroidx/compose/runtime/snapshots/p0;", "state", "v", "(Landroidx/compose/runtime/snapshots/p0;)V", "readObserver", "D", "(Lld/l;)Landroidx/compose/runtime/snapshots/m;", "u", "snapshot", "", "K", "(Landroidx/compose/runtime/snapshots/m;)Ljava/lang/Void;", "L", "g", "Landroidx/compose/runtime/snapshots/m;", "h", "Z", "i", "j", "Lld/l;", "k", "()Lld/l;", "o", "writeObserver", "l", "m", "()Landroidx/compose/runtime/snapshots/m;", "root", "J", "currentSnapshot", "", "value", "()I", "A", "(I)V", "id", "Landroidx/compose/runtime/snapshots/t;", "()Landroidx/compose/runtime/snapshots/t;", "B", "(Landroidx/compose/runtime/snapshots/t;)V", "invalid", "Landroidx/compose/runtime/collection/d;", "()Landroidx/compose/runtime/collection/d;", "M", "(Landroidx/compose/runtime/collection/d;)V", "modified", "readOnly", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u0 extends m {

    /* renamed from: m, reason: collision with root package name */
    public static final int f17161m = 8;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final m previousSnapshot;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean mergeParentObservers;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean ownsPreviousSnapshot;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<Object, k2> readObserver;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<Object, k2> writeObserver;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m root;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(@fg.m m mVar, @fg.m ld.l<Object, k2> lVar, boolean z4, boolean z5) {
        super(0, t.f17146h, null);
        AtomicReference atomicReference;
        ld.l<Object, k2> k4;
        ld.l<Object, k2> O;
        t.INSTANCE.getClass();
        this.previousSnapshot = mVar;
        this.mergeParentObservers = z4;
        this.ownsPreviousSnapshot = z5;
        if (mVar == null || (k4 = mVar.k()) == null) {
            atomicReference = v.f17178k;
            k4 = ((c) atomicReference.get()).k();
        }
        O = v.O(lVar, k4, z4);
        this.readObserver = O;
        this.root = this;
    }

    private final m J() {
        AtomicReference atomicReference;
        m mVar = this.previousSnapshot;
        if (mVar != null) {
            return mVar;
        }
        atomicReference = v.f17178k;
        return (m) atomicReference.get();
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void A(int i4) {
        throw b.a();
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void B(@fg.l t tVar) {
        throw b.a();
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.l
    public m D(@fg.m ld.l<Object, k2> readObserver) {
        m E;
        ld.l<Object, k2> P = v.P(readObserver, this.readObserver, false, 4, null);
        if (this.mergeParentObservers) {
            return J().D(P);
        }
        E = v.E(J().D(null), P, true);
        return E;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.l
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public Void s(@fg.l m snapshot) {
        throw b.a();
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.l
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public Void t(@fg.l m snapshot) {
        throw b.a();
    }

    public void M(@fg.m androidx.compose.runtime.collection.d<p0> dVar) {
        throw b.a();
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void d() {
        m mVar;
        z(true);
        if (!this.ownsPreviousSnapshot || (mVar = this.previousSnapshot) == null) {
            return;
        }
        mVar.d();
    }

    @Override // androidx.compose.runtime.snapshots.m
    /* renamed from: g */
    public int getId() {
        return J().getId();
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.l
    /* renamed from: h */
    public t getInvalid() {
        return J().getInvalid();
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.m
    public androidx.compose.runtime.collection.d<p0> i() {
        return J().i();
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.m
    public ld.l<Object, k2> k() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public boolean l() {
        return J().l();
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.l
    /* renamed from: m, reason: from getter */
    public m getRoot() {
        return this.root;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.m
    public ld.l<Object, k2> o() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public boolean p() {
        return J().p();
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void u() {
        J().u();
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void v(@fg.l p0 state) {
        J().v(state);
    }
}
