package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.n2;

/* compiled from: Share.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096Aø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/flow/f0;", "T", "Lkotlinx/coroutines/flow/i0;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/internal/p;", "Lkotlinx/coroutines/flow/j;", "collector", "", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/m;", "onBufferOverflow", "Lkotlinx/coroutines/flow/i;", "d", "Lkotlinx/coroutines/n2;", "o", "Lkotlinx/coroutines/n2;", "job", "", "c", "()Ljava/util/List;", "replayCache", "flow", "<init>", "(Lkotlinx/coroutines/flow/i0;Lkotlinx/coroutines/n2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class f0<T> implements i0<T>, c<T>, kotlinx.coroutines.flow.internal.p<T> {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final n2 job;

    /* renamed from: p, reason: collision with root package name */
    private final /* synthetic */ i0<T> f27976p;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(@d5.d i0<? extends T> i0Var, @d5.e n2 n2Var) {
        this.job = n2Var;
        this.f27976p = i0Var;
    }

    @Override // kotlinx.coroutines.flow.i0, kotlinx.coroutines.flow.i
    @d5.e
    public Object a(@d5.d j<? super T> jVar, @d5.d Continuation<?> continuation) {
        return this.f27976p.a(jVar, continuation);
    }

    @Override // kotlinx.coroutines.flow.i0
    @d5.d
    public List<T> c() {
        return this.f27976p.c();
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @d5.d
    public i<T> d(@d5.d CoroutineContext context, int capacity, @d5.d kotlinx.coroutines.channels.m onBufferOverflow) {
        return k0.e(this, context, capacity, onBufferOverflow);
    }
}
