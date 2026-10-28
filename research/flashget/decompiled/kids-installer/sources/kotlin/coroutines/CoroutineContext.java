package kotlin.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import q3.p;

/* compiled from: CoroutineContext.kt */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J5\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00030\u0006H&¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH¦\u0002¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH&J\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002¨\u0006\u0013"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "plus", "context", "Element", "Key", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.coroutines.g, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public interface CoroutineContext {

    /* compiled from: CoroutineContext.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.coroutines.g$a */
    public static final class a {

        /* compiled from: CoroutineContext.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.coroutines.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        static final class C0255a extends Lambda implements p<CoroutineContext, b, CoroutineContext> {

            /* renamed from: p, reason: collision with root package name */
            public static final C0255a f23293p = new C0255a();

            C0255a() {
                super(2);
            }

            @Override // q3.p
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CoroutineContext g0(@d5.d CoroutineContext coroutineContext, @d5.d b bVar) {
                CombinedContext combinedContext;
                l0.p(coroutineContext, ProtectedSandApp.s("綮"));
                l0.p(bVar, ProtectedSandApp.s("綯"));
                CoroutineContext c6 = coroutineContext.c(bVar.getKey());
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f23294o;
                if (c6 == emptyCoroutineContext) {
                    return bVar;
                }
                ContinuationInterceptor.b bVar2 = ContinuationInterceptor.f23289d;
                ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) c6.b(bVar2);
                if (continuationInterceptor == null) {
                    combinedContext = new CombinedContext(c6, bVar);
                } else {
                    CoroutineContext c7 = c6.c(bVar2);
                    if (c7 == emptyCoroutineContext) {
                        return new CombinedContext(bVar, continuationInterceptor);
                    }
                    combinedContext = new CombinedContext(new CombinedContext(c7, bVar), continuationInterceptor);
                }
                return combinedContext;
            }
        }

        @d5.d
        public static CoroutineContext a(@d5.d CoroutineContext coroutineContext, @d5.d CoroutineContext coroutineContext2) {
            l0.p(coroutineContext2, ProtectedSandApp.s("㺳"));
            return coroutineContext2 == EmptyCoroutineContext.f23294o ? coroutineContext : (CoroutineContext) coroutineContext2.n(coroutineContext, C0255a.f23293p);
        }
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J5\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\r0\u0003H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.coroutines.g$b */
    public interface b extends CoroutineContext {

        /* compiled from: CoroutineContext.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.coroutines.g$b$a */
        public static final class a {
            public static <R> R a(@d5.d b bVar, R r5, @d5.d p<? super R, ? super b, ? extends R> pVar) {
                l0.p(pVar, ProtectedSandApp.s("㺴"));
                return pVar.g0(r5, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @d5.e
            public static <E extends b> E b(@d5.d b bVar, @d5.d c<E> cVar) {
                l0.p(cVar, ProtectedSandApp.s("㺵"));
                if (!l0.g(bVar.getKey(), cVar)) {
                    return null;
                }
                l0.n(bVar, ProtectedSandApp.s("㺶"));
                return bVar;
            }

            @d5.d
            public static CoroutineContext c(@d5.d b bVar, @d5.d c<?> cVar) {
                l0.p(cVar, ProtectedSandApp.s("㺷"));
                return l0.g(bVar.getKey(), cVar) ? EmptyCoroutineContext.f23294o : bVar;
            }

            @d5.d
            public static CoroutineContext d(@d5.d b bVar, @d5.d CoroutineContext coroutineContext) {
                l0.p(coroutineContext, ProtectedSandApp.s("㺸"));
                return a.a(bVar, coroutineContext);
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        @d5.e
        <E extends b> E b(@d5.d c<E> cVar);

        @Override // kotlin.coroutines.CoroutineContext
        @d5.d
        CoroutineContext c(@d5.d c<?> cVar);

        @d5.d
        c<?> getKey();

        @Override // kotlin.coroutines.CoroutineContext
        <R> R n(R r5, @d5.d p<? super R, ? super b, ? extends R> pVar);
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Key;", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.coroutines.g$c */
    public interface c<E extends b> {
    }

    @d5.d
    CoroutineContext B(@d5.d CoroutineContext coroutineContext);

    @d5.e
    <E extends b> E b(@d5.d c<E> cVar);

    @d5.d
    CoroutineContext c(@d5.d c<?> cVar);

    <R> R n(R r5, @d5.d p<? super R, ? super b, ? extends R> pVar);
}
