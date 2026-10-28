package kotlin.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.l0;
import q3.p;

/* compiled from: CoroutineContextImpl.kt */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)V", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.coroutines.a, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public abstract class AbstractCoroutineContextElement implements CoroutineContext.b {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final CoroutineContext.c<?> f23278o;

    public AbstractCoroutineContextElement(@d5.d CoroutineContext.c<?> cVar) {
        l0.p(cVar, ProtectedSandApp.s("綨"));
        this.f23278o = cVar;
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
        return this.f23278o;
    }

    @Override // kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    public <R> R n(R r5, @d5.d p<? super R, ? super CoroutineContext.b, ? extends R> pVar) {
        return (R) CoroutineContext.b.a.a(this, r5, pVar);
    }
}
