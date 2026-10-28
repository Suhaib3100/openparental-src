package androidx.compose.runtime.snapshots;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Snapshot.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0010\u001a\u00020\u00012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0013¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/snapshots/c;", "Landroidx/compose/runtime/snapshots/e;", "", "id", "Landroidx/compose/runtime/snapshots/t;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/t;)V", "Lkotlin/Function1;", "", "Lkotlin/k2;", "readObserver", "Landroidx/compose/runtime/snapshots/m;", "D", "(Lld/l;)Landroidx/compose/runtime/snapshots/m;", "writeObserver", "c0", "(Lld/l;Lld/l;)Landroidx/compose/runtime/snapshots/e;", "u", "()V", "snapshot", "", "h0", "(Landroidx/compose/runtime/snapshots/m;)Ljava/lang/Void;", "g0", "Landroidx/compose/runtime/snapshots/n;", "M", "()Landroidx/compose/runtime/snapshots/n;", "d", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2294:1\n1714#2:2295\n1714#2:2297\n82#3:2296\n82#3:2298\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n*L\n1322#1:2295\n1368#1:2297\n1322#1:2296\n1368#1:2298\n*E\n"})
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: s, reason: collision with root package name */
    public static final int f17027s = 0;

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,2294:1\n33#2,6:2295\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$1$1$1\n*L\n1325#1:2295,6\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Object, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<ld.l<Object, k2>> f17028b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends ld.l<Object, k2>> list) {
            super(1);
            this.f17028b = list;
        }

        public final void a(@fg.l Object obj) {
            List<ld.l<Object, k2>> list = this.f17028b;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                list.get(i4).invoke(obj);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Object obj) {
            a(obj);
            return k2.f75408a;
        }
    }

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/t;", "invalid", "Landroidx/compose/runtime/snapshots/e;", "a", "(Landroidx/compose/runtime/snapshots/t;)Landroidx/compose/runtime/snapshots/e;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedMutableSnapshot$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2294:1\n1714#2:2295\n82#3:2296\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedMutableSnapshot$1\n*L\n1345#1:2295\n1345#1:2296\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<t, e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Object, k2> f17029b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Object, k2> f17030c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ld.l<Object, k2> lVar, ld.l<Object, k2> lVar2) {
            super(1);
            this.f17029b = lVar;
            this.f17030c = lVar2;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke(@fg.l t tVar) {
            int i4;
            synchronized (v.K()) {
                i4 = v.f17173f;
                v.f17173f = i4 + 1;
            }
            return new e(i4, tVar, this.f17029b, this.f17030c);
        }
    }

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/t;", "invalid", "Landroidx/compose/runtime/snapshots/j;", "a", "(Landroidx/compose/runtime/snapshots/t;)Landroidx/compose/runtime/snapshots/j;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedSnapshot$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2294:1\n1714#2:2295\n82#3:2296\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedSnapshot$1\n*L\n1334#1:2295\n1334#1:2296\n*E\n"})
    /* renamed from: androidx.compose.runtime.snapshots.c$c, reason: collision with other inner class name */
    static final class C0323c extends kotlin.jvm.internal.n0 implements ld.l<t, j> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Object, k2> f17031b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0323c(ld.l<Object, k2> lVar) {
            super(1);
            this.f17031b = lVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j invoke(@fg.l t tVar) {
            int i4;
            synchronized (v.K()) {
                i4 = v.f17173f;
                v.f17173f = i4 + 1;
            }
            return new j(i4, tVar, this.f17031b);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(int r4, @fg.l androidx.compose.runtime.snapshots.t r5) {
        /*
            r3 = this;
            java.lang.Object r0 = androidx.compose.runtime.snapshots.v.K()
            monitor-enter(r0)
            java.util.List r1 = androidx.compose.runtime.snapshots.v.h()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = kotlin.collections.w.k5(r1)     // Catch: java.lang.Throwable -> L17
            ld.l r2 = (ld.l) r2     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L19
            androidx.compose.runtime.snapshots.c$a r2 = new androidx.compose.runtime.snapshots.c$a     // Catch: java.lang.Throwable -> L17
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r4 = move-exception
            goto L1f
        L19:
            monitor-exit(r0)
            r0 = 0
            r3.<init>(r4, r5, r0, r2)
            return
        L1f:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.c.<init>(int, androidx.compose.runtime.snapshots.t):void");
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    @fg.l
    public m D(@fg.m ld.l<Object, k2> readObserver) {
        m i02;
        i02 = v.i0(new C0323c(readObserver));
        return i02;
    }

    @Override // androidx.compose.runtime.snapshots.e
    @fg.l
    public n M() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // androidx.compose.runtime.snapshots.e
    @fg.l
    public e c0(@fg.m ld.l<Object, k2> readObserver, @fg.m ld.l<Object, k2> writeObserver) {
        m i02;
        i02 = v.i0(new b(readObserver, writeObserver));
        return (e) i02;
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    public void d() {
        synchronized (v.K()) {
            w();
            k2 k2Var = k2.f75408a;
        }
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    @fg.l
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public Void s(@fg.l m snapshot) {
        throw androidx.compose.runtime.snapshots.b.a();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    @fg.l
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public Void t(@fg.l m snapshot) {
        throw androidx.compose.runtime.snapshots.b.a();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    public void u() {
        v.C();
    }
}
