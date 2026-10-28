package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: SnapshotStateExtensions.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/l5;", "Landroidx/compose/runtime/z1;", "Landroidx/compose/runtime/b5;", "", "baseState", "<init>", "(Landroidx/compose/runtime/b5;)V", "", "toString", "()Ljava/lang/String;", "b", "Landroidx/compose/runtime/b5;", "c", "()J", "longValue", "getValue", "()Ljava/lang/Long;", "value", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l5 implements z1 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f16841c = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5<Long> baseState;

    public l5(@fg.l b5<Long> b5Var) {
        this.baseState = b5Var;
    }

    @Override // androidx.compose.runtime.z1
    public long c() {
        return this.baseState.getValue().longValue();
    }

    @fg.l
    public String toString() {
        return "UnboxedLongState(baseState=" + this.baseState + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.z1, androidx.compose.runtime.b5
    @fg.l
    public Long getValue() {
        return this.baseState.getValue();
    }
}
