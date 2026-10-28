package kotlin.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.l0;
import q3.p;

/* compiled from: CoroutineContextImpl.kt */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J5\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u0002H\b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\rJ(\u0010\u000e\u001a\u0004\u0018\u0001H\u000f\"\b\b\u0000\u0010\u000f*\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0011H\u0096\u0002¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0014\u0010\u0015\u001a\u00020\u00012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0016J\u0011\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlin/coroutines/EmptyCoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "serialVersionUID", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "hashCode", "", "minusKey", "plus", "context", "readResolve", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.coroutines.i, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class EmptyCoroutineContext implements CoroutineContext, Serializable {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    public static final EmptyCoroutineContext f23294o = new EmptyCoroutineContext();

    /* renamed from: p, reason: collision with root package name */
    private static final long f23295p = 0;

    private EmptyCoroutineContext() {
    }

    private final Object f() {
        return f23294o;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @d5.d
    public CoroutineContext B(@d5.d CoroutineContext coroutineContext) {
        l0.p(coroutineContext, ProtectedSandApp.s("㺽"));
        return coroutineContext;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @d5.e
    public <E extends CoroutineContext.b> E b(@d5.d CoroutineContext.c<E> cVar) {
        l0.p(cVar, ProtectedSandApp.s("㺾"));
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @d5.d
    public CoroutineContext c(@d5.d CoroutineContext.c<?> cVar) {
        l0.p(cVar, ProtectedSandApp.s("㺿"));
        return this;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R n(R r5, @d5.d p<? super R, ? super CoroutineContext.b, ? extends R> pVar) {
        l0.p(pVar, ProtectedSandApp.s("㻀"));
        return r5;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("㻁");
    }
}
