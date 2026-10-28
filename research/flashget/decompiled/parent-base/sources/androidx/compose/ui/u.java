package androidx.compose.ui;

import androidx.annotation.c1;
import androidx.compose.animation.core.k1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;

/* compiled from: SessionMutex.kt */
@l
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001!B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B1\b\u0002\u0012&\u0010\b\u001a\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u0005j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006`\u0007¢\u0006\u0004\b\t\u0010\nJ]\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\f21\u0010\u0014\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R4\u0010\b\u001a\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u0005j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0013\u0010%\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b#\u0010$\u0088\u0001\b\u0092\u0001\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u0005j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006`\u0007¨\u0006&"}, d2 = {"Landroidx/compose/ui/u;", "T", "", "b", "()Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/u$a;", "Landroidx/compose/ui/AtomicReference;", "currentSessionHolder", "c", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/concurrent/atomic/AtomicReference;", "R", "Lkotlin/Function1;", "Lkotlinx/coroutines/r0;", "sessionInitializer", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "data", "Lkotlin/coroutines/d;", "session", "j", "(Ljava/util/concurrent/atomic/AtomicReference;Lld/l;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "h", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/String;", "", "g", "(Ljava/util/concurrent/atomic/AtomicReference;)I", "other", "", "d", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)Z", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "f", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;", "currentSession", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kd.g
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class u<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AtomicReference<a<T>> currentSessionHolder;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SessionMutex.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/u$a;", "T", "", "Lkotlinx/coroutines/k2;", "job", "value", "<init>", "(Lkotlinx/coroutines/k2;Ljava/lang/Object;)V", "a", "Lkotlinx/coroutines/k2;", "()Lkotlinx/coroutines/k2;", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final k2 job;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final T value;

        public a(@fg.l k2 k2Var, T t4) {
            this.job = k2Var;
            this.value = t4;
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final k2 getJob() {
            return this.job;
        }

        public final T b() {
            return this.value;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SessionMutex.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", i = {0, 1}, l = {66, 68}, m = "invokeSuspend", n = {"newSession", "newSession"}, s = {"L$0", "L$0"})
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", "T", "Lkotlinx/coroutines/r0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super R>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f21457b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f21458c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<r0, T> f21459d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AtomicReference<a<T>> f21460e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<T, kotlin.coroutines.d<? super R>, Object> f21461f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.l<? super r0, ? extends T> lVar, AtomicReference<a<T>> atomicReference, ld.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f21459d = lVar;
            this.f21460e = atomicReference;
            this.f21461f = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f21459d, this.f21460e, this.f21461f, dVar);
            bVar.f21458c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            a<T> aVar;
            k2 job;
            a<T> aVar2;
            kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f21457b;
            try {
                if (i4 == 0) {
                    a1.n(obj);
                    r0 r0Var = (r0) this.f21458c;
                    aVar = new a<>(n2.B(r0Var.getCoroutineContext()), this.f21459d.invoke(r0Var));
                    a<T> andSet = this.f21460e.getAndSet(aVar);
                    if (andSet != null && (job = andSet.getJob()) != null) {
                        this.f21458c = aVar;
                        this.f21457b = 1;
                        if (n2.l(job, this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (a) this.f21458c;
                        try {
                            a1.n(obj);
                            k1.a(this.f21460e, aVar2, null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            k1.a(this.f21460e, aVar2, null);
                            throw th;
                        }
                    }
                    aVar = (a) this.f21458c;
                    a1.n(obj);
                }
                ld.p<T, kotlin.coroutines.d<? super R>, Object> pVar = this.f21461f;
                T b5 = aVar.b();
                this.f21458c = aVar;
                this.f21457b = 2;
                obj = pVar.invoke(b5, this);
                if (obj == aVar3) {
                    return aVar3;
                }
                aVar2 = aVar;
                k1.a(this.f21460e, aVar2, null);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                aVar2 = aVar;
                k1.a(this.f21460e, aVar2, null);
                throw th;
            }
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super R> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    private /* synthetic */ u(AtomicReference atomicReference) {
        this.currentSessionHolder = atomicReference;
    }

    public static final /* synthetic */ u a(AtomicReference atomicReference) {
        return new u(atomicReference);
    }

    @fg.l
    public static <T> AtomicReference<a<T>> b() {
        return new AtomicReference<>(null);
    }

    private static <T> AtomicReference<a<T>> c(AtomicReference<a<T>> atomicReference) {
        return atomicReference;
    }

    public static boolean d(AtomicReference<a<T>> atomicReference, Object obj) {
        return (obj instanceof u) && l0.g(atomicReference, ((u) obj).currentSessionHolder);
    }

    public static final boolean e(AtomicReference<a<T>> atomicReference, AtomicReference<a<T>> atomicReference2) {
        return l0.g(atomicReference, atomicReference2);
    }

    @fg.m
    public static final T f(AtomicReference<a<T>> atomicReference) {
        a<T> aVar = atomicReference.get();
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public static int g(AtomicReference<a<T>> atomicReference) {
        return atomicReference.hashCode();
    }

    public static String h(AtomicReference<a<T>> atomicReference) {
        return "SessionMutex(currentSessionHolder=" + atomicReference + ')';
    }

    @fg.m
    public static final <R> Object j(AtomicReference<a<T>> atomicReference, @fg.l ld.l<? super r0, ? extends T> lVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        return s0.g(new b(lVar, atomicReference, pVar, null), dVar);
    }

    public boolean equals(Object obj) {
        return d(this.currentSessionHolder, obj);
    }

    public int hashCode() {
        return this.currentSessionHolder.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final /* synthetic */ AtomicReference getCurrentSessionHolder() {
        return this.currentSessionHolder;
    }

    public String toString() {
        return h(this.currentSessionHolder);
    }
}
