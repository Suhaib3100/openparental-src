package kotlinx.coroutines.future;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.q;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.v1;
import kotlinx.coroutines.y;
import kotlinx.coroutines.z0;
import ld.l;
import ld.p;

/* compiled from: Future.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a]\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b*\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0016\u001a\u00020\u0012*\u00020\u00112\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u0019\u0010\u001a\u001a#\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/t0;", "start", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "Ljava/util/concurrent/CompletableFuture;", "h", "(Lkotlinx/coroutines/r0;Lkotlin/coroutines/g;Lkotlinx/coroutines/t0;Lld/p;)Ljava/util/concurrent/CompletableFuture;", "Lkotlinx/coroutines/z0;", "c", "(Lkotlinx/coroutines/z0;)Ljava/util/concurrent/CompletableFuture;", "Lkotlinx/coroutines/k2;", "Lkotlin/k2;", "d", "(Lkotlinx/coroutines/k2;)Ljava/util/concurrent/CompletableFuture;", "future", "j", "(Lkotlinx/coroutines/k2;Ljava/util/concurrent/CompletableFuture;)V", "Ljava/util/concurrent/CompletionStage;", "e", "(Ljava/util/concurrent/CompletionStage;)Lkotlinx/coroutines/z0;", "g", "(Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,197:1\n1#2:198\n314#3,11:199\n*S KotlinDebug\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n*L\n172#1:199,11\n*E\n"})
/* loaded from: classes7.dex */
public final class e {

    /* compiled from: Future.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CompletableFuture<T> f80696b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z0<T> f80697c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(CompletableFuture<T> completableFuture, z0<? extends T> z0Var) {
            super(1);
            this.f80696b = completableFuture;
            this.f80697c = z0Var;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Throwable th) {
            try {
                this.f80696b.complete(this.f80697c.k());
            } catch (Throwable th2) {
                this.f80696b.completeExceptionally(th2);
            }
        }
    }

    /* compiled from: Future.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CompletableFuture<k2> f80698b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CompletableFuture<k2> completableFuture) {
            super(1);
            this.f80698b = completableFuture;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Throwable th) {
            if (th == null) {
                this.f80698b.complete(k2.f75408a);
            } else {
                this.f80698b.completeExceptionally(th);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Future.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00050\u0005\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "value", "", "exception", "", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class c<T> extends n0 implements p<T, Throwable, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y<T> f80699b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y<T> yVar) {
            super(2);
            this.f80699b = yVar;
        }

        @Override // ld.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t4, Throwable th) {
            boolean e4;
            Throwable cause;
            try {
                if (th == null) {
                    e4 = this.f80699b.I(t4);
                } else {
                    y<T> yVar = this.f80699b;
                    CompletionException completionException = th instanceof CompletionException ? (CompletionException) th : null;
                    if (completionException != null && (cause = completionException.getCause()) != null) {
                        th = cause;
                    }
                    e4 = yVar.e(th);
                }
                return Boolean.valueOf(e4);
            } catch (Throwable th2) {
                o0.b(i.f75057b, th2);
                return k2.f75408a;
            }
        }
    }

    /* compiled from: Future.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CompletableFuture<T> f80700b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.future.b<T> f80701c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CompletableFuture<T> completableFuture, kotlinx.coroutines.future.b<T> bVar) {
            super(1);
            this.f80700b = completableFuture;
            this.f80701c = bVar;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Throwable th) {
            this.f80700b.cancel(false);
            this.f80701c.cont = null;
        }
    }

    public static Object a(p pVar, Object obj, Throwable th) {
        return pVar.invoke(obj, th);
    }

    @fg.l
    public static final <T> CompletableFuture<T> c(@fg.l z0<? extends T> z0Var) {
        CompletableFuture<T> completableFuture = new CompletableFuture<>();
        j(z0Var, completableFuture);
        z0Var.F(new a(completableFuture, z0Var));
        return completableFuture;
    }

    @fg.l
    public static final CompletableFuture<k2> d(@fg.l kotlinx.coroutines.k2 k2Var) {
        CompletableFuture<k2> completableFuture = new CompletableFuture<>();
        j(k2Var, completableFuture);
        k2Var.F(new b(completableFuture));
        return completableFuture;
    }

    @fg.l
    public static final <T> z0<T> e(@fg.l CompletionStage<T> completionStage) {
        Throwable cause;
        CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (!completableFuture.isDone()) {
            y c5 = a0.c(null, 1, null);
            final c cVar = new c(c5);
            completionStage.handle(new BiFunction() { // from class: kotlinx.coroutines.future.c
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return p.this.invoke(obj, (Throwable) obj2);
                }
            });
            n2.x(c5, completableFuture);
            return c5;
        }
        try {
            return a0.a(completableFuture.get());
        } catch (Throwable th) {
            th = th;
            ExecutionException executionException = th instanceof ExecutionException ? (ExecutionException) th : null;
            if (executionException != null && (cause = executionException.getCause()) != null) {
                th = cause;
            }
            y c6 = a0.c(null, 1, null);
            c6.e(th);
            return c6;
        }
    }

    private static final Object f(p pVar, Object obj, Throwable th) {
        return pVar.invoke(obj, th);
    }

    @m
    public static final <T> Object g(@fg.l CompletionStage<T> completionStage, @fg.l kotlin.coroutines.d<? super T> dVar) {
        CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (completableFuture.isDone()) {
            try {
                return completableFuture.get();
            } catch (ExecutionException e4) {
                Throwable cause = e4.getCause();
                if (cause == null) {
                    throw e4;
                }
                throw cause;
            }
        }
        q qVar = new q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        kotlinx.coroutines.future.b bVar = new kotlinx.coroutines.future.b(qVar);
        completionStage.handle(bVar);
        qVar.k0(new d(completableFuture, bVar));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            h.c(dVar);
        }
        return y4;
    }

    @fg.l
    public static final <T> CompletableFuture<T> h(@fg.l r0 r0Var, @fg.l g gVar, @fg.l t0 t0Var, @fg.l p<? super r0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar) {
        if (t0Var.isLazy()) {
            throw new IllegalArgumentException((t0Var + ProtectedSandApp.s("螽\u0001")).toString());
        }
        g e4 = l0.e(r0Var, gVar);
        CompletableFuture<T> completableFuture = new CompletableFuture<>();
        kotlinx.coroutines.future.a aVar = new kotlinx.coroutines.future.a(e4, completableFuture);
        completableFuture.handle((BiFunction) aVar);
        t0Var.invoke(pVar, aVar, aVar);
        return completableFuture;
    }

    public static /* synthetic */ CompletableFuture i(r0 r0Var, g gVar, t0 t0Var, p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = i.f75057b;
        }
        if ((i4 & 2) != 0) {
            t0Var = t0.DEFAULT;
        }
        return h(r0Var, gVar, t0Var, pVar);
    }

    private static final void j(final kotlinx.coroutines.k2 k2Var, CompletableFuture<?> completableFuture) {
        completableFuture.handle(new BiFunction() { // from class: kotlinx.coroutines.future.d
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                k2 k4;
                k4 = e.k(kotlinx.coroutines.k2.this, obj, (Throwable) obj2);
                return k4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k2 k(kotlinx.coroutines.k2 k2Var, Object obj, Throwable th) {
        if (th != null) {
            r2 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r2 == null) {
                r2 = v1.a(ProtectedSandApp.s("螾\u0001"), th);
            }
        }
        k2Var.b(r2);
        return k2.f75408a;
    }
}
