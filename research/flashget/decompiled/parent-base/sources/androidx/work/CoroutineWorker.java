package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.r;
import com.android.internal.telephony.SmsConstants;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;

/* compiled from: CoroutineWorker.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u001b\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010&\u001a\b\u0012\u0004\u0012\u00020\t0!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010-\u001a\u00020'8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u001a\u001a\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/ListenableWorker$a;", "w", "()Lcom/google/common/util/concurrent/ListenableFuture;", "y", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/work/l;", "B", "Landroidx/work/f;", "data", "Lkotlin/k2;", "G", "(Landroidx/work/f;Lkotlin/coroutines/d;)Ljava/lang/Object;", "foregroundInfo", "F", "(Landroidx/work/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "d", "r", "()V", "Lkotlinx/coroutines/b0;", "g", "Lkotlinx/coroutines/b0;", "E", "()Lkotlinx/coroutines/b0;", "job", "Landroidx/work/impl/utils/futures/c;", "h", "Landroidx/work/impl/utils/futures/c;", "D", "()Landroidx/work/impl/utils/futures/c;", "future", "Lkotlinx/coroutines/m0;", "i", "Lkotlinx/coroutines/m0;", "z", "()Lkotlinx/coroutines/m0;", "A", "coroutineContext", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CoroutineWorker extends ListenableWorker {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.b0 job;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.work.impl.utils.futures.c<ListenableWorker.a> future;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m0 coroutineContext;

    /* compiled from: CoroutineWorker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
    static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.D().isCancelled()) {
                k2.a.b(CoroutineWorker.this.getJob(), null, 1, null);
            }
        }
    }

    /* compiled from: CoroutineWorker.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", i = {}, l = {SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f35888b;

        /* renamed from: c, reason: collision with root package name */
        int f35889c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q<l> f35890d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f35891e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q<l> qVar, CoroutineWorker coroutineWorker, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f35890d = qVar;
            this.f35891e = coroutineWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new b(this.f35890d, this.f35891e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            q qVar;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f35889c;
            if (i4 == 0) {
                a1.n(obj);
                q<l> qVar2 = this.f35890d;
                CoroutineWorker coroutineWorker = this.f35891e;
                this.f35888b = qVar2;
                this.f35889c = 1;
                Object B = coroutineWorker.B(this);
                if (B == aVar) {
                    return aVar;
                }
                qVar = qVar2;
                obj = B;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = (q) this.f35888b;
                a1.n(obj);
            }
            qVar.b(obj);
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: CoroutineWorker.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f35892b;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return CoroutineWorker.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f35892b;
            try {
                if (i4 == 0) {
                    a1.n(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.f35892b = 1;
                    obj = coroutineWorker.y(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                CoroutineWorker.this.D().p((ListenableWorker.a) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.D().q(th);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@fg.l Context appContext, @fg.l WorkerParameters params) {
        super(appContext, params);
        kotlinx.coroutines.b0 c5;
        l0.p(appContext, "appContext");
        l0.p(params, "params");
        c5 = p2.c(null, 1, null);
        this.job = c5;
        androidx.work.impl.utils.futures.c<ListenableWorker.a> u4 = androidx.work.impl.utils.futures.c.u();
        l0.o(u4, "create()");
        this.future = u4;
        u4.n2(new a(), k().d());
        this.coroutineContext = j1.a();
    }

    @kotlin.k(message = "use withContext(...) inside doWork() instead.")
    public static /* synthetic */ void A() {
    }

    static /* synthetic */ Object C(CoroutineWorker coroutineWorker, kotlin.coroutines.d dVar) {
        throw new IllegalStateException("Not implemented");
    }

    @fg.m
    public Object B(@fg.l kotlin.coroutines.d<? super l> dVar) {
        return C(this, dVar);
    }

    @fg.l
    public final androidx.work.impl.utils.futures.c<ListenableWorker.a> D() {
        return this.future;
    }

    @fg.l
    /* renamed from: E, reason: from getter */
    public final kotlinx.coroutines.b0 getJob() {
        return this.job;
    }

    @fg.m
    public final Object F(@fg.l l lVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object obj;
        ListenableFuture<Void> s4 = s(lVar);
        l0.o(s4, "setForegroundAsync(foregroundInfo)");
        if (s4.isDone()) {
            try {
                obj = s4.get();
            } catch (ExecutionException e4) {
                Throwable cause = e4.getCause();
                if (cause == null) {
                    throw e4;
                }
                throw cause;
            }
        } else {
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            qVar.e0();
            s4.n2(new r.a(qVar, s4), i.INSTANCE);
            qVar.k0(new r.b(s4));
            obj = qVar.y();
            if (obj == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
        }
        return obj == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? obj : kotlin.k2.f75408a;
    }

    @fg.m
    public final Object G(@fg.l f fVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object obj;
        ListenableFuture<Void> t4 = t(fVar);
        l0.o(t4, "setProgressAsync(data)");
        if (t4.isDone()) {
            try {
                obj = t4.get();
            } catch (ExecutionException e4) {
                Throwable cause = e4.getCause();
                if (cause == null) {
                    throw e4;
                }
                throw cause;
            }
        } else {
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            qVar.e0();
            t4.n2(new r.a(qVar, t4), i.INSTANCE);
            qVar.k0(new r.b(t4));
            obj = qVar.y();
            if (obj == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
        }
        return obj == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? obj : kotlin.k2.f75408a;
    }

    @Override // androidx.work.ListenableWorker
    @fg.l
    public final ListenableFuture<l> d() {
        kotlinx.coroutines.b0 c5;
        c5 = p2.c(null, 1, null);
        r0 a5 = s0.a(getCoroutineContext().O(c5));
        q qVar = new q(c5, null, 2, null);
        kotlinx.coroutines.k.f(a5, null, null, new b(qVar, this, null), 3, null);
        return qVar;
    }

    @Override // androidx.work.ListenableWorker
    public final void r() {
        this.future.cancel(false);
    }

    @Override // androidx.work.ListenableWorker
    @fg.l
    public final ListenableFuture<ListenableWorker.a> w() {
        kotlinx.coroutines.k.f(s0.a(getCoroutineContext().O(this.job)), null, null, new c(null), 3, null);
        return this.future;
    }

    @fg.m
    public abstract Object y(@fg.l kotlin.coroutines.d<? super ListenableWorker.a> dVar);

    @fg.l
    /* renamed from: z, reason: from getter */
    public m0 getCoroutineContext() {
        return this.coroutineContext;
    }
}
