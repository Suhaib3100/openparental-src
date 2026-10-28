package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.k2;

/* compiled from: Share.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096Aø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00028\u00008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lkotlinx/coroutines/flow/g0;", "T", "Lkotlinx/coroutines/flow/t0;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/internal/p;", "flow", "Lkotlinx/coroutines/k2;", "job", "<init>", "(Lkotlinx/coroutines/flow/t0;Lkotlinx/coroutines/k2;)V", "Lkotlinx/coroutines/flow/j;", "collector", "", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "Lkotlinx/coroutines/flow/i;", "d", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/flow/i;", "b", "Lkotlinx/coroutines/k2;", "", "e", "()Ljava/util/List;", "replayCache", "getValue", "()Ljava/lang/Object;", "value", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class g0<T> implements t0<T>, c<T>, kotlinx.coroutines.flow.internal.p<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final k2 job;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ t0<T> f80018c;

    /* JADX WARN: Multi-variable type inference failed */
    public g0(@fg.l t0<? extends T> t0Var, @fg.m k2 k2Var) {
        this.job = k2Var;
        this.f80018c = t0Var;
    }

    @Override // kotlinx.coroutines.flow.i0, kotlinx.coroutines.flow.i
    @fg.m
    public Object a(@fg.l j<? super T> jVar, @fg.l kotlin.coroutines.d<?> dVar) {
        return this.f80018c.a(jVar, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @fg.l
    public i<T> d(@fg.l kotlin.coroutines.g context, int capacity, @fg.l kotlinx.coroutines.channels.i onBufferOverflow) {
        return v0.d(this, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.i0
    @fg.l
    public List<T> e() {
        return this.f80018c.e();
    }

    @Override // kotlinx.coroutines.flow.t0
    public T getValue() {
        return this.f80018c.getValue();
    }
}
