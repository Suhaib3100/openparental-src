package androidx.compose.runtime.snapshots;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Snapshot.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00192\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ;\u0010\u001d\u001a\u00020\u00012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0019H\u0010¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0019H\u0010¢\u0006\u0004\b$\u0010#R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u0014\u0010+\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R$\u00102\u001a\u00020,2\u0006\u0010-\u001a\u00020,8V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00108\u001a\u0002032\u0006\u0010-\u001a\u0002038P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R4\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001092\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001098P@VX\u0090\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b(\u0010<R$\u0010@\u001a\u00020,2\u0006\u0010-\u001a\u00020,8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b>\u0010/\"\u0004\b?\u00101R\u0014\u0010B\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0010¨\u0006C"}, d2 = {"Landroidx/compose/runtime/snapshots/t0;", "Landroidx/compose/runtime/snapshots/e;", "parentSnapshot", "Lkotlin/Function1;", "", "Lkotlin/k2;", "specifiedReadObserver", "specifiedWriteObserver", "", "mergeParentObservers", "ownsParentSnapshot", "<init>", "(Landroidx/compose/runtime/snapshots/e;Lld/l;Lld/l;ZZ)V", "d", "()V", "p", "()Z", "Landroidx/compose/runtime/snapshots/n;", "M", "()Landroidx/compose/runtime/snapshots/n;", "Landroidx/compose/runtime/snapshots/p0;", "state", "v", "(Landroidx/compose/runtime/snapshots/p0;)V", "readObserver", "Landroidx/compose/runtime/snapshots/m;", "D", "(Lld/l;)Landroidx/compose/runtime/snapshots/m;", "writeObserver", "c0", "(Lld/l;Lld/l;)Landroidx/compose/runtime/snapshots/e;", "u", "snapshot", "", "h0", "(Landroidx/compose/runtime/snapshots/m;)Ljava/lang/Void;", "i0", "s", "Landroidx/compose/runtime/snapshots/e;", "t", "Z", "g0", "()Landroidx/compose/runtime/snapshots/e;", "currentSnapshot", "", "value", "g", "()I", "A", "(I)V", "id", "Landroidx/compose/runtime/snapshots/t;", "h", "()Landroidx/compose/runtime/snapshots/t;", "B", "(Landroidx/compose/runtime/snapshots/t;)V", "invalid", "Landroidx/compose/runtime/collection/d;", "i", "()Landroidx/compose/runtime/collection/d;", "(Landroidx/compose/runtime/collection/d;)V", "modified", "n", "C", "writeCount", "l", "readOnly", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t0 extends e {

    /* renamed from: v, reason: collision with root package name */
    public static final int f17157v = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final e parentSnapshot;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean mergeParentObservers;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final boolean ownsParentSnapshot;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t0(@fg.m androidx.compose.runtime.snapshots.e r3, @fg.m ld.l<java.lang.Object, kotlin.k2> r4, @fg.m ld.l<java.lang.Object, kotlin.k2> r5, boolean r6, boolean r7) {
        /*
            r2 = this;
            androidx.compose.runtime.snapshots.t$a r0 = androidx.compose.runtime.snapshots.t.INSTANCE
            r0.getClass()
            androidx.compose.runtime.snapshots.t r0 = androidx.compose.runtime.snapshots.t.c()
            if (r3 == 0) goto L11
            ld.l r1 = r3.k()
            if (r1 != 0) goto L1f
        L11:
            java.util.concurrent.atomic.AtomicReference r1 = androidx.compose.runtime.snapshots.v.f()
            java.lang.Object r1 = r1.get()
            androidx.compose.runtime.snapshots.c r1 = (androidx.compose.runtime.snapshots.c) r1
            ld.l r1 = r1.k()
        L1f:
            ld.l r4 = androidx.compose.runtime.snapshots.v.m(r4, r1, r6)
            if (r3 == 0) goto L2b
            ld.l r1 = r3.o()
            if (r1 != 0) goto L39
        L2b:
            java.util.concurrent.atomic.AtomicReference r1 = androidx.compose.runtime.snapshots.v.f()
            java.lang.Object r1 = r1.get()
            androidx.compose.runtime.snapshots.c r1 = (androidx.compose.runtime.snapshots.c) r1
            ld.l r1 = r1.o()
        L39:
            ld.l r5 = androidx.compose.runtime.snapshots.v.n(r5, r1)
            r1 = 0
            r2.<init>(r1, r0, r4, r5)
            r2.parentSnapshot = r3
            r2.mergeParentObservers = r6
            r2.ownsParentSnapshot = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.t0.<init>(androidx.compose.runtime.snapshots.e, ld.l, ld.l, boolean, boolean):void");
    }

    private final e g0() {
        AtomicReference atomicReference;
        e eVar = this.parentSnapshot;
        if (eVar != null) {
            return eVar;
        }
        atomicReference = v.f17178k;
        return (e) atomicReference.get();
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void A(int i4) {
        throw b.a();
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void B(@fg.l t tVar) {
        throw b.a();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    public void C(int i4) {
        g0().C(i4);
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    @fg.l
    public m D(@fg.m ld.l<Object, k2> readObserver) {
        m E;
        ld.l<Object, k2> P = v.P(readObserver, k(), false, 4, null);
        if (this.mergeParentObservers) {
            return g0().D(P);
        }
        E = v.E(g0().D(null), P, true);
        return E;
    }

    @Override // androidx.compose.runtime.snapshots.e
    @fg.l
    public n M() {
        return g0().M();
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void Z(@fg.m androidx.compose.runtime.collection.d<p0> dVar) {
        throw b.a();
    }

    @Override // androidx.compose.runtime.snapshots.e
    @fg.l
    public e c0(@fg.m ld.l<Object, k2> readObserver, @fg.m ld.l<Object, k2> writeObserver) {
        ld.l<Object, k2> Q;
        ld.l<Object, k2> P = v.P(readObserver, k(), false, 4, null);
        Q = v.Q(writeObserver, o());
        return !this.mergeParentObservers ? new t0(g0().c0(null, Q), P, Q, false, true) : g0().c0(P, Q);
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    public void d() {
        e eVar;
        z(true);
        if (!this.ownsParentSnapshot || (eVar = this.parentSnapshot) == null) {
            return;
        }
        eVar.d();
    }

    @Override // androidx.compose.runtime.snapshots.m
    /* renamed from: g */
    public int getId() {
        return g0().getId();
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.l
    /* renamed from: h */
    public t getInvalid() {
        return g0().getInvalid();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    @fg.l
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public Void s(@fg.l m snapshot) {
        throw b.a();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    @fg.m
    public androidx.compose.runtime.collection.d<p0> i() {
        return g0().i();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    @fg.l
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public Void t(@fg.l m snapshot) {
        throw b.a();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    public boolean l() {
        return g0().l();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    /* renamed from: n */
    public int getWriteCount() {
        return g0().getWriteCount();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    public boolean p() {
        return g0().p();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    public void u() {
        g0().u();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    public void v(@fg.l p0 state) {
        g0().v(state);
    }
}
