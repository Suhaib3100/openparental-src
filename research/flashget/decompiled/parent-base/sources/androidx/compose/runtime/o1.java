package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: SnapshotIntState.kt */
@x4
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/o1;", "Landroidx/compose/runtime/b5;", "", "getValue", "()Ljava/lang/Integer;", "value", "f", "()I", "intValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface o1 extends b5<Integer> {

    /* compiled from: SnapshotIntState.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @fg.l
        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "intValue")
        @Deprecated
        public static Integer a(@fg.l o1 o1Var) {
            return Integer.valueOf(o1.o(o1Var));
        }
    }

    static /* synthetic */ int o(o1 o1Var) {
        return super.getValue().intValue();
    }

    int f();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.b5
    @fg.l
    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "intValue")
    default Integer getValue() {
        return Integer.valueOf(f());
    }
}
