package androidx.work;

import androidx.annotation.c1;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import kotlin.z0;

/* compiled from: ListenableFuture.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087Hø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"R", "Lcom/google/common/util/concurrent/ListenableFuture;", "a", "(Lcom/google/common/util/concurrent/ListenableFuture;Lkotlin/coroutines/d;)Ljava/lang/Object;", "work-runtime-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class r {

    /* compiled from: ListenableFuture.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<R> f36606b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ListenableFuture<R> f36607c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.p<? super R> pVar, ListenableFuture<R> listenableFuture) {
            this.f36606b = pVar;
            this.f36607c = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                kotlin.coroutines.d dVar = this.f36606b;
                Object obj = this.f36607c.get();
                z0.Companion companion = z0.INSTANCE;
                dVar.resumeWith(obj);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    cause = th;
                }
                if (th instanceof CancellationException) {
                    this.f36606b.f(cause);
                    return;
                }
                kotlin.coroutines.d dVar2 = this.f36606b;
                z0.Companion companion2 = z0.INSTANCE;
                dVar2.resumeWith(a1.a(cause));
            }
        }
    }

    /* compiled from: ListenableFuture.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/k2;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    static final class b extends n0 implements ld.l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ListenableFuture<R> f36608b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ListenableFuture<R> listenableFuture) {
            super(1);
            this.f36608b = listenableFuture;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            this.f36608b.cancel(false);
        }
    }

    @fg.m
    @c1({c1.a.LIBRARY_GROUP})
    public static final <R> Object a(@fg.l ListenableFuture<R> listenableFuture, @fg.l kotlin.coroutines.d<? super R> dVar) {
        if (listenableFuture.isDone()) {
            try {
                return listenableFuture.get();
            } catch (ExecutionException e4) {
                Throwable cause = e4.getCause();
                if (cause == null) {
                    throw e4;
                }
                throw cause;
            }
        }
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        listenableFuture.n2(new a(qVar, listenableFuture), i.INSTANCE);
        qVar.k0(new b(listenableFuture));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    @c1({c1.a.LIBRARY_GROUP})
    private static final <R> Object b(ListenableFuture<R> listenableFuture, kotlin.coroutines.d<? super R> dVar) {
        if (listenableFuture.isDone()) {
            try {
                return listenableFuture.get();
            } catch (ExecutionException e4) {
                Throwable cause = e4.getCause();
                if (cause == null) {
                    throw e4;
                }
                throw cause;
            }
        }
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        listenableFuture.n2(new a(qVar, listenableFuture), i.INSTANCE);
        qVar.k0(new b(listenableFuture));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }
}
