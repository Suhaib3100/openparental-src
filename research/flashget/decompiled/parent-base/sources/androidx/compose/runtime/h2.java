package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: SnapshotFloatState.kt */
@x4
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\u00020\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/h2;", "Landroidx/compose/runtime/f1;", "Landroidx/compose/runtime/k2;", "", "value", "getValue", "()Ljava/lang/Float;", "u", "(F)V", "b", "()F", "E", "floatValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface h2 extends f1, k2<Float> {

    /* compiled from: SnapshotFloatState.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @fg.l
        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "floatValue")
        @Deprecated
        public static Float a(@fg.l h2 h2Var) {
            return Float.valueOf(h2.C(h2Var));
        }

        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "floatValue")
        @Deprecated
        public static void b(@fg.l h2 h2Var, float f4) {
            h2Var.E(f4);
        }
    }

    static /* synthetic */ float C(h2 h2Var) {
        return super.getValue().floatValue();
    }

    static void x(h2 h2Var, float f4) {
        h2Var.E(f4);
    }

    void E(float f4);

    @Override // androidx.compose.runtime.f1
    float b();

    @Override // androidx.compose.runtime.k2
    /* bridge */ /* synthetic */ default void setValue(Float f4) {
        u(f4.floatValue());
    }

    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "floatValue")
    default void u(float f4) {
        E(f4);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.f1, androidx.compose.runtime.b5
    @fg.l
    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "floatValue")
    default Float getValue() {
        return Float.valueOf(b());
    }
}
