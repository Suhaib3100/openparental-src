package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: CoroutineContext.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/b4;", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "key", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class b4 implements CoroutineContext.b, CoroutineContext.c<b4> {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    public static final b4 f27277o = new b4();

    private b4() {
    }

    @Override // kotlin.coroutines.CoroutineContext
    @d5.d
    public CoroutineContext B(@d5.d CoroutineContext coroutineContext) {
        return CoroutineContext.b.a.d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    @d5.e
    public <E extends CoroutineContext.b> E b(@d5.d CoroutineContext.c<E> cVar) {
        return (E) CoroutineContext.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    @d5.d
    public CoroutineContext c(@d5.d CoroutineContext.c<?> cVar) {
        return CoroutineContext.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.b
    @d5.d
    public CoroutineContext.c<?> getKey() {
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    public <R> R n(R r5, @d5.d q3.p<? super R, ? super CoroutineContext.b, ? extends R> pVar) {
        return (R) CoroutineContext.b.a.a(this, r5, pVar);
    }
}
