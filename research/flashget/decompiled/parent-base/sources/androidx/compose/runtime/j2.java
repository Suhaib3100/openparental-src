package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: SnapshotLongState.kt */
@x4
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\u00020\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/j2;", "Landroidx/compose/runtime/z1;", "Landroidx/compose/runtime/k2;", "", "value", "getValue", "()Ljava/lang/Long;", "r", "(J)V", "c", "()J", "N", "longValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface j2 extends z1, k2<Long> {

    /* compiled from: SnapshotLongState.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @fg.l
        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "longValue")
        @Deprecated
        public static Long a(@fg.l j2 j2Var) {
            return Long.valueOf(j2.n(j2Var));
        }

        @androidx.compose.runtime.snapshots.a(preferredPropertyName = "longValue")
        @Deprecated
        public static void b(@fg.l j2 j2Var, long j4) {
            j2Var.N(j4);
        }
    }

    static void B(j2 j2Var, long j4) {
        j2Var.N(j4);
    }

    static /* synthetic */ long n(j2 j2Var) {
        return super.getValue().longValue();
    }

    void N(long j4);

    @Override // androidx.compose.runtime.z1
    long c();

    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "longValue")
    default void r(long j4) {
        N(j4);
    }

    @Override // androidx.compose.runtime.k2
    /* bridge */ /* synthetic */ default void setValue(Long l4) {
        r(l4.longValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.z1, androidx.compose.runtime.b5
    @fg.l
    @androidx.compose.runtime.snapshots.a(preferredPropertyName = "longValue")
    default Long getValue() {
        return Long.valueOf(c());
    }
}
