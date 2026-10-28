package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.t0;

/* compiled from: AbstractSharedFlow.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/internal/y;", "Lkotlinx/coroutines/flow/t0;", "", "Lkotlinx/coroutines/flow/j0;", "delta", "", "h0", "g0", "()Ljava/lang/Integer;", "value", "initialValue", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class y extends j0<Integer> implements t0<Integer> {
    public y(int i5) {
        super(1, Integer.MAX_VALUE, kotlinx.coroutines.channels.m.DROP_OLDEST);
        k(Integer.valueOf(i5));
    }

    @Override // kotlinx.coroutines.flow.t0
    @d5.d
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(S().intValue());
        }
        return valueOf;
    }

    public final boolean h0(int delta) {
        boolean k5;
        synchronized (this) {
            k5 = k(Integer.valueOf(S().intValue() + delta));
        }
        return k5;
    }
}
