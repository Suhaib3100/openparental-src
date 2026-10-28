package kotlin.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.l0;

/* compiled from: CoroutineContextImpl.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¨\u0006\b"}, d2 = {"getPolymorphicElement", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusPolymorphicKey", "Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.3")
    @d5.e
    public static final <E extends CoroutineContext.b> E a(@d5.d CoroutineContext.b bVar, @d5.d CoroutineContext.c<E> cVar) {
        l0.p(bVar, ProtectedSandApp.s("㺹"));
        l0.p(cVar, ProtectedSandApp.s("㺺"));
        if (!(cVar instanceof AbstractCoroutineContextKey)) {
            if (bVar.getKey() == cVar) {
                return bVar;
            }
            return null;
        }
        AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) cVar;
        if (!abstractCoroutineContextKey.a(bVar.getKey())) {
            return null;
        }
        E e6 = (E) abstractCoroutineContextKey.b(bVar);
        if (e6 instanceof CoroutineContext.b) {
            return e6;
        }
        return null;
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.3")
    @d5.d
    public static final CoroutineContext b(@d5.d CoroutineContext.b bVar, @d5.d CoroutineContext.c<?> cVar) {
        l0.p(bVar, ProtectedSandApp.s("㺻"));
        l0.p(cVar, ProtectedSandApp.s("㺼"));
        if (!(cVar instanceof AbstractCoroutineContextKey)) {
            return bVar.getKey() == cVar ? EmptyCoroutineContext.f23294o : bVar;
        }
        AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) cVar;
        return (!abstractCoroutineContextKey.a(bVar.getKey()) || abstractCoroutineContextKey.b(bVar) == null) ? bVar : EmptyCoroutineContext.f23294o;
    }
}
