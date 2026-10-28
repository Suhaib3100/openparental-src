package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Snapshot.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/compose/runtime/snapshots/f;", "Landroidx/compose/runtime/snapshots/e;", "", "id", "Landroidx/compose/runtime/snapshots/t;", "invalid", "Lkotlin/Function1;", "", "Lkotlin/k2;", "readObserver", "writeObserver", "parent", "<init>", "(ILandroidx/compose/runtime/snapshots/t;Lld/l;Lld/l;Landroidx/compose/runtime/snapshots/e;)V", "g0", "()V", "d", "Landroidx/compose/runtime/snapshots/n;", "M", "()Landroidx/compose/runtime/snapshots/n;", "s", "Landroidx/compose/runtime/snapshots/e;", "h0", "()Landroidx/compose/runtime/snapshots/e;", "", "t", "Z", "deactivated", "Landroidx/compose/runtime/snapshots/m;", "m", "()Landroidx/compose/runtime/snapshots/m;", "root", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2294:1\n1714#2:2295\n82#3:2296\n1#4:2297\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n*L\n1412#1:2295\n1412#1:2296\n*E\n"})
/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: u, reason: collision with root package name */
    public static final int f17054u = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e parent;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean deactivated;

    public f(int i4, @fg.l t tVar, @fg.m ld.l<Object, k2> lVar, @fg.m ld.l<Object, k2> lVar2, @fg.l e eVar) {
        super(i4, tVar, lVar, lVar2);
        this.parent = eVar;
        eVar.s(this);
    }

    private final void g0() {
        if (this.deactivated) {
            return;
        }
        this.deactivated = true;
        this.parent.t(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:11:0x002e, B:13:0x0033, B:16:0x003a, B:21:0x0054, B:23:0x005c, B:24:0x006e, B:26:0x0076, B:27:0x007b, B:32:0x0062, B:33:0x006b), top: B:10:0x002e }] */
    @Override // androidx.compose.runtime.snapshots.e
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.snapshots.n M() {
        /*
            r7 = this;
            androidx.compose.runtime.snapshots.e r0 = r7.parent
            boolean r0 = r0.getApplied()
            if (r0 != 0) goto Lbf
            androidx.compose.runtime.snapshots.e r0 = r7.parent
            boolean r0 = r0.getDisposed()
            if (r0 == 0) goto L12
            goto Lbf
        L12:
            androidx.compose.runtime.collection.d r0 = r7.i()
            int r1 = r7.getId()
            r2 = 0
            if (r0 == 0) goto L28
            androidx.compose.runtime.snapshots.e r3 = r7.parent
            androidx.compose.runtime.snapshots.t r4 = r3.getInvalid()
            java.util.Map r3 = androidx.compose.runtime.snapshots.v.o(r3, r7, r4)
            goto L29
        L28:
            r3 = r2
        L29:
            java.lang.Object r4 = androidx.compose.runtime.snapshots.v.K()
            monitor-enter(r4)
            androidx.compose.runtime.snapshots.v.z(r7)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L6b
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L60
            if (r5 != 0) goto L3a
            goto L6b
        L3a:
            androidx.compose.runtime.snapshots.e r5 = r7.parent     // Catch: java.lang.Throwable -> L60
            int r5 = r5.getId()     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.e r6 = r7.parent     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.t r6 = r6.getInvalid()     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.n r3 = r7.R(r5, r3, r6)     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.n$b r5 = androidx.compose.runtime.snapshots.n.b.f17122b     // Catch: java.lang.Throwable -> L60
            boolean r5 = kotlin.jvm.internal.l0.g(r3, r5)     // Catch: java.lang.Throwable -> L60
            if (r5 != 0) goto L54
            monitor-exit(r4)
            return r3
        L54:
            androidx.compose.runtime.snapshots.e r3 = r7.parent     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.collection.d r3 = r3.i()     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L62
            r3.c(r0)     // Catch: java.lang.Throwable -> L60
            goto L6e
        L60:
            r0 = move-exception
            goto Lbd
        L62:
            androidx.compose.runtime.snapshots.e r3 = r7.parent     // Catch: java.lang.Throwable -> L60
            r3.Z(r0)     // Catch: java.lang.Throwable -> L60
            r7.Z(r2)     // Catch: java.lang.Throwable -> L60
            goto L6e
        L6b:
            r7.b()     // Catch: java.lang.Throwable -> L60
        L6e:
            androidx.compose.runtime.snapshots.e r0 = r7.parent     // Catch: java.lang.Throwable -> L60
            int r0 = r0.getId()     // Catch: java.lang.Throwable -> L60
            if (r0 >= r1) goto L7b
            androidx.compose.runtime.snapshots.e r0 = r7.parent     // Catch: java.lang.Throwable -> L60
            r0.L()     // Catch: java.lang.Throwable -> L60
        L7b:
            androidx.compose.runtime.snapshots.e r0 = r7.parent     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.t r2 = r0.getInvalid()     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.t r2 = r2.m(r1)     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.t r3 = r7.getPreviousIds()     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.t r2 = r2.l(r3)     // Catch: java.lang.Throwable -> L60
            r0.B(r2)     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.e r0 = r7.parent     // Catch: java.lang.Throwable -> L60
            r0.S(r1)     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.e r0 = r7.parent     // Catch: java.lang.Throwable -> L60
            int r1 = r7.F()     // Catch: java.lang.Throwable -> L60
            r0.U(r1)     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.e r0 = r7.parent     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.t r1 = r7.getPreviousIds()     // Catch: java.lang.Throwable -> L60
            r0.T(r1)     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.e r0 = r7.parent     // Catch: java.lang.Throwable -> L60
            int[] r1 = r7.getPreviousPinnedSnapshots()     // Catch: java.lang.Throwable -> L60
            r0.V(r1)     // Catch: java.lang.Throwable -> L60
            kotlin.k2 r0 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L60
            monitor-exit(r4)
            r0 = 1
            r7.X(r0)
            r7.g0()
            androidx.compose.runtime.snapshots.n$b r0 = androidx.compose.runtime.snapshots.n.b.f17122b
            return r0
        Lbd:
            monitor-exit(r4)
            throw r0
        Lbf:
            androidx.compose.runtime.snapshots.n$a r0 = new androidx.compose.runtime.snapshots.n$a
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.f.M():androidx.compose.runtime.snapshots.n");
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    public void d() {
        if (getDisposed()) {
            return;
        }
        super.d();
        g0();
    }

    @fg.l
    /* renamed from: h0, reason: from getter */
    public final e getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    @fg.l
    public m m() {
        return this.parent.m();
    }
}
