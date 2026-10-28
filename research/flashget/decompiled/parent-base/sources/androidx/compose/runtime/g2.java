package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: SnapshotDoubleState.kt */
@x4
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\n\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\u00020\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/g2;", "Landroidx/compose/runtime/y0;", "Landroidx/compose/runtime/k2;", "", "value", "getValue", "()Ljava/lang/Double;", "v", "(D)V", "d", "()D", "w", "doubleValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface g2 extends y0, k2<Double> {

    /* compiled from: SnapshotDoubleState.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @fg.l
        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "doubleValue")
        @Deprecated
        public static Double a(@fg.l g2 g2Var) {
            return Double.valueOf(g2.J(g2Var));
        }

        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "doubleValue")
        @Deprecated
        public static void b(@fg.l g2 g2Var, double d5) {
            g2Var.w(d5);
        }
    }

    static /* synthetic */ double J(g2 g2Var) {
        return super.getValue().doubleValue();
    }

    static void g(g2 g2Var, double d5) {
        g2Var.w(d5);
    }

    @Override // androidx.compose.runtime.y0
    double d();

    @Override // androidx.compose.runtime.k2
    /* bridge */ /* synthetic */ default void setValue(Double d5) {
        v(d5.doubleValue());
    }

    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "doubleValue")
    default void v(double d5) {
        w(d5);
    }

    void w(double d5);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.y0, androidx.compose.runtime.b5
    @fg.l
    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "doubleValue")
    default Double getValue() {
        return Double.valueOf(d());
    }
}
