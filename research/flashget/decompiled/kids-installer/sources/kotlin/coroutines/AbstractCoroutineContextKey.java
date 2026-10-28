package kotlin.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.b;
import kotlin.jvm.internal.l0;
import q3.l;

/* compiled from: CoroutineContextImpl.kt */
@ExperimentalStdlibApi
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u0002H\u00012\b\u0012\u0004\u0012\u0002H\u00030\u0004B8\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012#\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0002\b\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R+\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlin/coroutines/AbstractCoroutineContextKey;", "B", "Lkotlin/coroutines/CoroutineContext$Element;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "baseKey", "safeCast", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "(Lkotlin/coroutines/CoroutineContext$Key;Lkotlin/jvm/functions/Function1;)V", "topmostKey", "isSubKey", "", "key", "isSubKey$kotlin_stdlib", "tryCast", "tryCast$kotlin_stdlib", "(Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext$Element;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.coroutines.b, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public abstract class AbstractCoroutineContextKey<B extends CoroutineContext.b, E extends B> implements CoroutineContext.c<E> {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final l<CoroutineContext.b, E> f23279o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final CoroutineContext.c<?> f23280p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.g$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, q3.l<? super kotlin.coroutines.g$b, ? extends E extends B>, q3.l<kotlin.coroutines.g$b, E extends B>] */
    public AbstractCoroutineContextKey(@d5.d CoroutineContext.c<B> cVar, @d5.d l<? super CoroutineContext.b, ? extends E> lVar) {
        l0.p(cVar, ProtectedSandApp.s("㺒"));
        l0.p(lVar, ProtectedSandApp.s("㺓"));
        this.f23279o = lVar;
        this.f23280p = cVar instanceof AbstractCoroutineContextKey ? (CoroutineContext.c<B>) ((AbstractCoroutineContextKey) cVar).f23280p : cVar;
    }

    public final boolean a(@d5.d CoroutineContext.c<?> cVar) {
        l0.p(cVar, ProtectedSandApp.s("㺔"));
        return cVar == this || this.f23280p == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/g$b;)TE; */
    @d5.e
    public final CoroutineContext.b b(@d5.d CoroutineContext.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("㺕"));
        return (CoroutineContext.b) this.f23279o.N(bVar);
    }
}
