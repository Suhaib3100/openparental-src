package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;

/* compiled from: CoroutineDispatcher.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH&J\u001c\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0017J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0012\u0010\u0014\u001a\u00020\r2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011J\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0087\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/coroutines/a;", "Lkotlin/coroutines/e;", "Lkotlin/coroutines/g;", "context", "", "B0", "", "parallelism", "E0", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/m2;", "y0", "A0", "T", "Lkotlin/coroutines/d;", "continuation", "w", "o", "other", "F0", "", "toString", "<init>", "()V", "p", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public abstract class o0 extends AbstractCoroutineContextElement implements ContinuationInterceptor {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: CoroutineDispatcher.kt */
    @ExperimentalStdlibApi
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/o0$a;", "Lkotlin/coroutines/b;", "Lkotlin/coroutines/e;", "Lkotlinx/coroutines/o0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.o0$a, reason: from kotlin metadata */
    public static final class Companion extends AbstractCoroutineContextKey<ContinuationInterceptor, o0> {

        /* compiled from: CoroutineDispatcher.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/coroutines/g$b;", "it", "Lkotlinx/coroutines/o0;", "a", "(Lkotlin/coroutines/g$b;)Lkotlinx/coroutines/o0;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.o0$a$a, reason: collision with other inner class name */
        static final class C0451a extends Lambda implements q3.l<CoroutineContext.b, o0> {

            /* renamed from: p, reason: collision with root package name */
            public static final C0451a f28826p = new C0451a();

            C0451a() {
                super(1);
            }

            @Override // q3.l
            @d5.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o0 N(@d5.d CoroutineContext.b bVar) {
                if (bVar instanceof o0) {
                    return (o0) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        private Companion() {
            super(ContinuationInterceptor.f23289d, C0451a.f28826p);
        }
    }

    public o0() {
        super(ContinuationInterceptor.f23289d);
    }

    @i2
    public void A0(@d5.d CoroutineContext coroutineContext, @d5.d Runnable runnable) {
        y0(coroutineContext, runnable);
    }

    public boolean B0(@d5.d CoroutineContext context) {
        return true;
    }

    @c2
    @d5.d
    public o0 E0(int parallelism) {
        kotlinx.coroutines.internal.t.a(parallelism);
        return new kotlinx.coroutines.internal.s(this, parallelism);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    @d5.d
    public final o0 F0(@d5.d o0 other) {
        return other;
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    @d5.e
    public <E extends CoroutineContext.b> E b(@d5.d CoroutineContext.c<E> cVar) {
        return (E) ContinuationInterceptor.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    @d5.d
    public CoroutineContext c(@d5.d CoroutineContext.c<?> cVar) {
        return ContinuationInterceptor.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final void o(@d5.d Continuation<?> continuation) {
        ((kotlinx.coroutines.internal.l) continuation).w();
    }

    @d5.d
    public String toString() {
        return z0.a(this) + '@' + z0.b(this);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    @d5.d
    public final <T> Continuation<T> w(@d5.d Continuation<? super T> continuation) {
        return new kotlinx.coroutines.internal.l(this, continuation);
    }

    public abstract void y0(@d5.d CoroutineContext coroutineContext, @d5.d Runnable runnable);
}
