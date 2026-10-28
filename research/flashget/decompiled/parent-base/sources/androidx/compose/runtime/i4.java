package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: SnapshotFloatState.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001(B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR$\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u0007R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Landroidx/compose/runtime/i4;", "Landroidx/compose/runtime/snapshots/q0;", "Landroidx/compose/runtime/h2;", "Landroidx/compose/runtime/snapshots/a0;", "", "value", "<init>", "(F)V", "Q", "()Ljava/lang/Float;", "Lkotlin/Function1;", "Lkotlin/k2;", "z", "()Lld/l;", "Landroidx/compose/runtime/snapshots/r0;", "A", "(Landroidx/compose/runtime/snapshots/r0;)V", "previous", "current", "applied", "H", "(Landroidx/compose/runtime/snapshots/r0;Landroidx/compose/runtime/snapshots/r0;Landroidx/compose/runtime/snapshots/r0;)Landroidx/compose/runtime/snapshots/r0;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/i4$a;", "d", "Landroidx/compose/runtime/i4$a;", "next", "F", "()Landroidx/compose/runtime/snapshots/r0;", "firstStateRecord", "b", "()F", "E", "floatValue", "Landroidx/compose/runtime/m4;", "e", "()Landroidx/compose/runtime/m4;", "policy", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@kotlin.jvm.internal.r1({"SMAP\nSnapshotFloatState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFloatState.kt\nandroidx/compose/runtime/SnapshotMutableFloatStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 FloatingPointEquality.android.kt\nandroidx/compose/runtime/internal/FloatingPointEquality_androidKt\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,183:1\n2283#2:184\n2204#2,2:190\n1714#2:192\n2206#2,5:194\n2283#2:204\n41#3,5:185\n41#3,5:199\n82#4:193\n*S KotlinDebug\n*F\n+ 1 SnapshotFloatState.kt\nandroidx/compose/runtime/SnapshotMutableFloatStateImpl\n*L\n136#1:184\n138#1:190,2\n138#1:192\n138#1:194,5\n169#1:204\n137#1:185,5\n162#1:199,5\n138#1:193\n*E\n"})
/* loaded from: classes.dex */
public class i4 extends androidx.compose.runtime.snapshots.q0 implements h2, androidx.compose.runtime.snapshots.a0<Float> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f16557e = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private a next;

    /* compiled from: SnapshotFloatState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/i4$a;", "Landroidx/compose/runtime/snapshots/r0;", "", "value", "<init>", "(F)V", "Lkotlin/k2;", "c", "(Landroidx/compose/runtime/snapshots/r0;)V", "d", "()Landroidx/compose/runtime/snapshots/r0;", "F", "i", "()F", "j", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a extends androidx.compose.runtime.snapshots.r0 {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private float value;

        public a(float f4) {
            this.value = f4;
        }

        @Override // androidx.compose.runtime.snapshots.r0
        public void c(@fg.l androidx.compose.runtime.snapshots.r0 value) {
            kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.value = ((a) value).value;
        }

        @Override // androidx.compose.runtime.snapshots.r0
        @fg.l
        public androidx.compose.runtime.snapshots.r0 d() {
            return new a(this.value);
        }

        /* renamed from: i, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        public final void j(float f4) {
            this.value = f4;
        }
    }

    /* compiled from: SnapshotFloatState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Float, kotlin.k2> {
        b() {
            super(1);
        }

        public final void a(float f4) {
            i4.this.E(f4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Float f4) {
            a(f4.floatValue());
            return kotlin.k2.f75408a;
        }
    }

    public i4(float f4) {
        this.next = new a(f4);
    }

    @Override // androidx.compose.runtime.snapshots.p0
    public void A(@fg.l androidx.compose.runtime.snapshots.r0 value) {
        kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.next = (a) value;
    }

    @Override // androidx.compose.runtime.h2
    public void E(float f4) {
        androidx.compose.runtime.snapshots.m I;
        a aVar = (a) androidx.compose.runtime.snapshots.v.G(this.next);
        if (aVar.getValue() == f4) {
            return;
        }
        a aVar2 = this.next;
        androidx.compose.runtime.snapshots.v.M();
        synchronized (androidx.compose.runtime.snapshots.v.K()) {
            androidx.compose.runtime.snapshots.m.INSTANCE.getClass();
            I = androidx.compose.runtime.snapshots.v.I();
            ((a) androidx.compose.runtime.snapshots.v.X(aVar2, this, I, aVar)).j(f4);
            kotlin.k2 k2Var = kotlin.k2.f75408a;
        }
        androidx.compose.runtime.snapshots.v.U(I, this);
    }

    @Override // androidx.compose.runtime.snapshots.p0
    @fg.l
    public androidx.compose.runtime.snapshots.r0 F() {
        return this.next;
    }

    @Override // androidx.compose.runtime.snapshots.p0
    @fg.m
    public androidx.compose.runtime.snapshots.r0 H(@fg.l androidx.compose.runtime.snapshots.r0 previous, @fg.l androidx.compose.runtime.snapshots.r0 current, @fg.l androidx.compose.runtime.snapshots.r0 applied) {
        kotlin.jvm.internal.l0.n(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        kotlin.jvm.internal.l0.n(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        if (((a) current).getValue() == ((a) applied).getValue()) {
            return current;
        }
        return null;
    }

    @Override // androidx.compose.runtime.k2
    @fg.l
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public Float O() {
        return Float.valueOf(b());
    }

    @Override // androidx.compose.runtime.h2, androidx.compose.runtime.f1
    public float b() {
        return ((a) androidx.compose.runtime.snapshots.v.c0(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.a0
    @fg.l
    public m4<Float> e() {
        return s4.c();
    }

    @fg.l
    public String toString() {
        return "MutableFloatState(value=" + ((a) androidx.compose.runtime.snapshots.v.G(this.next)).getValue() + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.k2
    @fg.l
    public ld.l<Float, kotlin.k2> z() {
        return new b();
    }
}
