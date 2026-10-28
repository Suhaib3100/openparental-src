package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: SnapshotIntState.kt */
@x4
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\u00020\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/i2;", "Landroidx/compose/runtime/o1;", "Landroidx/compose/runtime/k2;", "", "value", "getValue", "()Ljava/lang/Integer;", "t", "(I)V", "f", "()I", "k", "intValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface i2 extends o1, k2<Integer> {

    /* compiled from: SnapshotIntState.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @fg.l
        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "intValue")
        @Deprecated
        public static Integer a(@fg.l i2 i2Var) {
            return Integer.valueOf(i2.p(i2Var));
        }

        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "intValue")
        @Deprecated
        public static void b(@fg.l i2 i2Var, int i4) {
            i2Var.k(i4);
        }
    }

    static void L(i2 i2Var, int i4) {
        i2Var.k(i4);
    }

    static /* synthetic */ int p(i2 i2Var) {
        return super.getValue().intValue();
    }

    @Override // androidx.compose.runtime.o1
    int f();

    void k(int i4);

    @Override // androidx.compose.runtime.k2
    /* bridge */ /* synthetic */ default void setValue(Integer num) {
        t(num.intValue());
    }

    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "intValue")
    default void t(int i4) {
        k(i4);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.o1, androidx.compose.runtime.b5
    @fg.l
    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "intValue")
    default Integer getValue() {
        return Integer.valueOf(f());
    }
}
