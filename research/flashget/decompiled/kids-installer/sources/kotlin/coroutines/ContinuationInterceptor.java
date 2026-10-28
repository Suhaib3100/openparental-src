package kotlin.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.l0;
import q3.p;

/* compiled from: ContinuationInterceptor.kt */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ(\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0096\u0002¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\bH&J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlin/coroutines/CoroutineContext$Element;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "minusKey", "Lkotlin/coroutines/CoroutineContext;", "releaseInterceptedContinuation", "", "Key", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.coroutines.e, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public interface ContinuationInterceptor extends CoroutineContext.b {

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    public static final b f23289d = b.f23290o;

    /* compiled from: ContinuationInterceptor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.coroutines.e$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public static <R> R a(@d5.d ContinuationInterceptor continuationInterceptor, R r5, @d5.d p<? super R, ? super CoroutineContext.b, ? extends R> pVar) {
            l0.p(pVar, ProtectedSandApp.s("㺟"));
            return (R) CoroutineContext.b.a.a(continuationInterceptor, r5, pVar);
        }

        @d5.e
        public static <E extends CoroutineContext.b> E b(@d5.d ContinuationInterceptor continuationInterceptor, @d5.d CoroutineContext.c<E> cVar) {
            l0.p(cVar, ProtectedSandApp.s("㺠"));
            if (!(cVar instanceof AbstractCoroutineContextKey)) {
                if (ContinuationInterceptor.f23289d != cVar) {
                    return null;
                }
                l0.n(continuationInterceptor, ProtectedSandApp.s("㺡"));
                return continuationInterceptor;
            }
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) cVar;
            if (!abstractCoroutineContextKey.a(continuationInterceptor.getKey())) {
                return null;
            }
            E e6 = (E) abstractCoroutineContextKey.b(continuationInterceptor);
            if (e6 instanceof CoroutineContext.b) {
                return e6;
            }
            return null;
        }

        @d5.d
        public static CoroutineContext c(@d5.d ContinuationInterceptor continuationInterceptor, @d5.d CoroutineContext.c<?> cVar) {
            l0.p(cVar, ProtectedSandApp.s("㺢"));
            if (!(cVar instanceof AbstractCoroutineContextKey)) {
                return ContinuationInterceptor.f23289d == cVar ? EmptyCoroutineContext.f23294o : continuationInterceptor;
            }
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) cVar;
            return (!abstractCoroutineContextKey.a(continuationInterceptor.getKey()) || abstractCoroutineContextKey.b(continuationInterceptor) == null) ? continuationInterceptor : EmptyCoroutineContext.f23294o;
        }

        @d5.d
        public static CoroutineContext d(@d5.d ContinuationInterceptor continuationInterceptor, @d5.d CoroutineContext coroutineContext) {
            l0.p(coroutineContext, ProtectedSandApp.s("㺣"));
            return CoroutineContext.b.a.d(continuationInterceptor, coroutineContext);
        }

        public static void e(@d5.d ContinuationInterceptor continuationInterceptor, @d5.d Continuation<?> continuation) {
            l0.p(continuation, ProtectedSandApp.s("㺤"));
        }
    }

    /* compiled from: ContinuationInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/ContinuationInterceptor$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlin/coroutines/ContinuationInterceptor;", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.coroutines.e$b */
    /* loaded from: classes5.dex */
    public static final class b implements CoroutineContext.c<ContinuationInterceptor> {

        /* renamed from: o, reason: collision with root package name */
        static final /* synthetic */ b f23290o = new b();

        private b() {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    @d5.e
    <E extends CoroutineContext.b> E b(@d5.d CoroutineContext.c<E> cVar);

    @Override // kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    @d5.d
    CoroutineContext c(@d5.d CoroutineContext.c<?> cVar);

    void o(@d5.d Continuation<?> continuation);

    @d5.d
    <T> Continuation<T> w(@d5.d Continuation<? super T> continuation);
}
