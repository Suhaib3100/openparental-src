package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.t0;

/* compiled from: AbstractSharedFlow.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/flow/internal/y;", "Lkotlinx/coroutines/flow/t0;", "", "Lkotlinx/coroutines/flow/j0;", "initialValue", "<init>", "(I)V", "delta", "", "f0", "(I)Z", "e0", "()Ljava/lang/Integer;", "value", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,132:1\n28#2,4:133\n28#2,4:138\n20#3:137\n20#3:142\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n*L\n126#1:133,4\n128#1:138,4\n126#1:137\n128#1:142\n*E\n"})
/* loaded from: classes7.dex */
final class y extends j0<Integer> implements t0<Integer> {
    public y(int i4) {
        super(1, Integer.MAX_VALUE, kotlinx.coroutines.channels.i.DROP_OLDEST);
        b(Integer.valueOf(i4));
    }

    @Override // kotlinx.coroutines.flow.t0
    @fg.l
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(Q().intValue());
        }
        return valueOf;
    }

    public final boolean f0(int delta) {
        boolean b5;
        synchronized (this) {
            b5 = b(Integer.valueOf(Q().intValue() + delta));
        }
        return b5;
    }
}
