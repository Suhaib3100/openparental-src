package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: SnapshotState.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001+B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR*\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\u0001\u0010$\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010#R\u0017\u0010'\u001a\u00028\u00008G¢\u0006\f\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016R\u0014\u0010*\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Landroidx/compose/runtime/l4;", "T", "Landroidx/compose/runtime/snapshots/q0;", "Landroidx/compose/runtime/snapshots/a0;", "value", "Landroidx/compose/runtime/m4;", "policy", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/m4;)V", "Landroidx/compose/runtime/snapshots/r0;", "Lkotlin/k2;", "A", "(Landroidx/compose/runtime/snapshots/r0;)V", "previous", "current", "applied", "H", "(Landroidx/compose/runtime/snapshots/r0;Landroidx/compose/runtime/snapshots/r0;Landroidx/compose/runtime/snapshots/r0;)Landroidx/compose/runtime/snapshots/r0;", "", "toString", "()Ljava/lang/String;", "O", "()Ljava/lang/Object;", "Lkotlin/Function1;", "z", "()Lld/l;", "d", "Landroidx/compose/runtime/m4;", "e", "()Landroidx/compose/runtime/m4;", "Landroidx/compose/runtime/l4$a;", "Landroidx/compose/runtime/l4$a;", "next", "getValue", "setValue", "(Ljava/lang/Object;)V", "()V", "Q", "R", "debuggerDisplayValue", "F", "()Landroidx/compose/runtime/snapshots/r0;", "firstStateRecord", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 2)
@kotlin.jvm.internal.r1({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,307:1\n2283#2:308\n2204#2,2:309\n1714#2:311\n2206#2,5:313\n2283#2:318\n2283#2:319\n82#3:312\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n*L\n136#1:308\n138#1:309,2\n138#1:311\n138#1:313,5\n179#1:318\n215#1:319\n138#1:312\n*E\n"})
/* loaded from: classes.dex */
public class l4<T> extends androidx.compose.runtime.snapshots.q0 implements androidx.compose.runtime.snapshots.a0<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f16836f = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m4<T> policy;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private a<T> next;

    /* compiled from: SnapshotState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\u00028\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/l4$a;", "T", "Landroidx/compose/runtime/snapshots/r0;", "myValue", "<init>", "(Ljava/lang/Object;)V", "value", "Lkotlin/k2;", "c", "(Landroidx/compose/runtime/snapshots/r0;)V", "d", "()Landroidx/compose/runtime/snapshots/r0;", "Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "j", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a<T> extends androidx.compose.runtime.snapshots.r0 {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private T value;

        public a(T t4) {
            this.value = t4;
        }

        @Override // androidx.compose.runtime.snapshots.r0
        public void c(@fg.l androidx.compose.runtime.snapshots.r0 value) {
            kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.value = ((a) value).value;
        }

        @Override // androidx.compose.runtime.snapshots.r0
        @fg.l
        public androidx.compose.runtime.snapshots.r0 d() {
            return new a(this.value);
        }

        public final T i() {
            return this.value;
        }

        public final void j(T t4) {
            this.value = t4;
        }
    }

    /* compiled from: SnapshotState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<T, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l4<T> f16840b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l4<T> l4Var) {
            super(1);
            this.f16840b = l4Var;
        }

        public final void a(T t4) {
            this.f16840b.setValue(t4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Object obj) {
            a(obj);
            return kotlin.k2.f75408a;
        }
    }

    public l4(T t4, @fg.l m4<T> m4Var) {
        this.policy = m4Var;
        this.next = new a<>(t4);
    }

    public static /* synthetic */ void R() {
    }

    public static /* synthetic */ void T() {
    }

    @Override // androidx.compose.runtime.snapshots.p0
    public void A(@fg.l androidx.compose.runtime.snapshots.r0 value) {
        kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.next = (a) value;
    }

    @Override // androidx.compose.runtime.snapshots.p0
    @fg.l
    /* renamed from: F */
    public androidx.compose.runtime.snapshots.r0 getFirstStateRecord() {
        return this.next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.snapshots.p0
    @fg.m
    public androidx.compose.runtime.snapshots.r0 H(@fg.l androidx.compose.runtime.snapshots.r0 previous, @fg.l androidx.compose.runtime.snapshots.r0 current, @fg.l androidx.compose.runtime.snapshots.r0 applied) {
        kotlin.jvm.internal.l0.n(previous, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar = (a) previous;
        kotlin.jvm.internal.l0.n(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar2 = (a) current;
        kotlin.jvm.internal.l0.n(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar3 = (a) applied;
        if (e().c(aVar2.i(), aVar3.i())) {
            return current;
        }
        Object b5 = e().b(aVar.i(), aVar2.i(), aVar3.i());
        if (b5 == null) {
            return null;
        }
        androidx.compose.runtime.snapshots.r0 d5 = aVar3.d();
        kotlin.jvm.internal.l0.n(d5, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$2>");
        ((a) d5).j(b5);
        return d5;
    }

    @Override // androidx.compose.runtime.k2
    public T O() {
        return getValue();
    }

    @kd.i(name = "getDebuggerDisplayValue")
    public final T Q() {
        return (T) ((a) androidx.compose.runtime.snapshots.v.G(this.next)).i();
    }

    @Override // androidx.compose.runtime.snapshots.a0
    @fg.l
    public m4<T> e() {
        return this.policy;
    }

    @Override // androidx.compose.runtime.k2, androidx.compose.runtime.b5
    public T getValue() {
        return (T) ((a) androidx.compose.runtime.snapshots.v.c0(this.next, this)).i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.k2
    public void setValue(T t4) {
        androidx.compose.runtime.snapshots.m I;
        a aVar = (a) androidx.compose.runtime.snapshots.v.G(this.next);
        if (e().c(aVar.i(), t4)) {
            return;
        }
        a<T> aVar2 = this.next;
        androidx.compose.runtime.snapshots.v.M();
        synchronized (androidx.compose.runtime.snapshots.v.K()) {
            androidx.compose.runtime.snapshots.m.INSTANCE.getClass();
            I = androidx.compose.runtime.snapshots.v.I();
            ((a) androidx.compose.runtime.snapshots.v.X(aVar2, this, I, aVar)).j(t4);
            kotlin.k2 k2Var = kotlin.k2.f75408a;
        }
        androidx.compose.runtime.snapshots.v.U(I, this);
    }

    @fg.l
    public String toString() {
        return "MutableState(value=" + ((a) androidx.compose.runtime.snapshots.v.G(this.next)).i() + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.k2
    @fg.l
    public ld.l<T, kotlin.k2> z() {
        return new b(this);
    }
}
