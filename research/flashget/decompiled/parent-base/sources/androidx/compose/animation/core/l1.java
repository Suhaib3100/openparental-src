package androidx.compose.animation.core;

import androidx.compose.runtime.x4;
import com.android.internal.telephony.cdma.UserData;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.g;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: InternalMutatorMutex.kt */
@x4
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\t2\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013¢\u0006\u0002\b\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0017j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/compose/animation/core/l1;", "", "<init>", "()V", "Landroidx/compose/animation/core/l1$a;", "mutator", "Lkotlin/k2;", "h", "(Landroidx/compose/animation/core/l1$a;)V", "R", "Landroidx/compose/animation/core/i1;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "block", "d", "(Landroidx/compose/animation/core/i1;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/Function2;", "Lkotlin/u;", "f", "(Ljava/lang/Object;Landroidx/compose/animation/core/i1;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/animation/core/AtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "Lkotlinx/coroutines/sync/a;", "b", "Lkotlinx/coroutines/sync/a;", "mutex", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f2809c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AtomicReference<a> currentMutator = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.sync.a mutex = kotlinx.coroutines.sync.c.b(false, 1, null);

    /* compiled from: InternalMutatorMutex.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/core/l1$a;", "", "Landroidx/compose/animation/core/i1;", "priority", "Lkotlinx/coroutines/k2;", "job", "<init>", "(Landroidx/compose/animation/core/i1;Lkotlinx/coroutines/k2;)V", "other", "", "a", "(Landroidx/compose/animation/core/l1$a;)Z", "Lkotlin/k2;", "b", "()V", "Landroidx/compose/animation/core/i1;", "d", "()Landroidx/compose/animation/core/i1;", "Lkotlinx/coroutines/k2;", "c", "()Lkotlinx/coroutines/k2;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i1 priority;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlinx.coroutines.k2 job;

        public a(@fg.l i1 i1Var, @fg.l kotlinx.coroutines.k2 k2Var) {
            this.priority = i1Var;
            this.job = k2Var;
        }

        public final boolean a(@fg.l a other) {
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void b() {
            this.job.b(new j1());
        }

        @fg.l
        /* renamed from: c, reason: from getter */
        public final kotlinx.coroutines.k2 getJob() {
            return this.job;
        }

        @fg.l
        /* renamed from: d, reason: from getter */
        public final i1 getPriority() {
            return this.priority;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: InternalMutatorMutex.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {SyslogAppender.LOG_LOCAL7, UserData.IS91_MSG_TYPE_CLI}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/r0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,178:1\n120#2,10:179\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutate$2\n*L\n130#1:179,10\n*E\n"})
    static final class b<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super R>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f2814b;

        /* renamed from: c, reason: collision with root package name */
        Object f2815c;

        /* renamed from: d, reason: collision with root package name */
        Object f2816d;

        /* renamed from: e, reason: collision with root package name */
        int f2817e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f2818f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i1 f2819g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ l1 f2820h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.l<kotlin.coroutines.d<? super R>, Object> f2821i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(i1 i1Var, l1 l1Var, ld.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f2819g = i1Var;
            this.f2820h = l1Var;
            this.f2821i = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f2819g, this.f2820h, this.f2821i, dVar);
            bVar.f2818f = obj;
            return bVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.sync.a aVar;
            ld.l<kotlin.coroutines.d<? super R>, Object> lVar;
            a aVar2;
            l1 l1Var;
            a aVar3;
            Throwable th;
            l1 l1Var2;
            kotlinx.coroutines.sync.a aVar4;
            kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            ?? r12 = this.f2817e;
            try {
                try {
                    if (r12 == 0) {
                        kotlin.a1.n(obj);
                        kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f2818f;
                        i1 i1Var = this.f2819g;
                        g.b c5 = r0Var.getCoroutineContext().c(kotlinx.coroutines.k2.INSTANCE);
                        kotlin.jvm.internal.l0.m(c5);
                        a aVar6 = new a(i1Var, (kotlinx.coroutines.k2) c5);
                        this.f2820h.h(aVar6);
                        aVar = this.f2820h.mutex;
                        ld.l<kotlin.coroutines.d<? super R>, Object> lVar2 = this.f2821i;
                        l1 l1Var3 = this.f2820h;
                        this.f2818f = aVar6;
                        this.f2814b = aVar;
                        this.f2815c = lVar2;
                        this.f2816d = l1Var3;
                        this.f2817e = 1;
                        if (aVar.f(null, this) == aVar5) {
                            return aVar5;
                        }
                        lVar = lVar2;
                        aVar2 = aVar6;
                        l1Var = l1Var3;
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            l1Var2 = (l1) this.f2815c;
                            aVar4 = (kotlinx.coroutines.sync.a) this.f2814b;
                            aVar3 = (a) this.f2818f;
                            try {
                                kotlin.a1.n(obj);
                                k1.a(l1Var2.currentMutator, aVar3, null);
                                aVar4.g(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                k1.a(l1Var2.currentMutator, aVar3, null);
                                throw th;
                            }
                        }
                        l1Var = (l1) this.f2816d;
                        lVar = (ld.l) this.f2815c;
                        kotlinx.coroutines.sync.a aVar7 = (kotlinx.coroutines.sync.a) this.f2814b;
                        aVar2 = (a) this.f2818f;
                        kotlin.a1.n(obj);
                        aVar = aVar7;
                    }
                    this.f2818f = aVar2;
                    this.f2814b = aVar;
                    this.f2815c = l1Var;
                    this.f2816d = null;
                    this.f2817e = 2;
                    Object invoke = lVar.invoke(this);
                    if (invoke == aVar5) {
                        return aVar5;
                    }
                    l1Var2 = l1Var;
                    aVar4 = aVar;
                    obj = invoke;
                    aVar3 = aVar2;
                    k1.a(l1Var2.currentMutator, aVar3, null);
                    aVar4.g(null);
                    return obj;
                } catch (Throwable th3) {
                    aVar3 = aVar2;
                    th = th3;
                    l1Var2 = l1Var;
                    k1.a(l1Var2.currentMutator, aVar3, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r12.g(null);
                throw th4;
            }
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super R> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: InternalMutatorMutex.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.MutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {SyslogAppender.LOG_LOCAL7, 171}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/r0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,178:1\n120#2,10:179\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutateWith$2\n*L\n169#1:179,10\n*E\n"})
    static final class c<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super R>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f2822b;

        /* renamed from: c, reason: collision with root package name */
        Object f2823c;

        /* renamed from: d, reason: collision with root package name */
        Object f2824d;

        /* renamed from: e, reason: collision with root package name */
        Object f2825e;

        /* renamed from: f, reason: collision with root package name */
        int f2826f;

        /* renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f2827g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ i1 f2828h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ l1 f2829i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<T, kotlin.coroutines.d<? super R>, Object> f2830j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ T f2831k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(i1 i1Var, l1 l1Var, ld.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, T t4, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f2828h = i1Var;
            this.f2829i = l1Var;
            this.f2830j = pVar;
            this.f2831k = t4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f2828h, this.f2829i, this.f2830j, this.f2831k, dVar);
            cVar.f2827g = obj;
            return cVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.sync.a aVar;
            ld.p pVar;
            Object obj2;
            a aVar2;
            l1 l1Var;
            a aVar3;
            Throwable th;
            l1 l1Var2;
            kotlinx.coroutines.sync.a aVar4;
            kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            ?? r12 = this.f2826f;
            try {
                try {
                    if (r12 == 0) {
                        kotlin.a1.n(obj);
                        kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f2827g;
                        i1 i1Var = this.f2828h;
                        g.b c5 = r0Var.getCoroutineContext().c(kotlinx.coroutines.k2.INSTANCE);
                        kotlin.jvm.internal.l0.m(c5);
                        a aVar6 = new a(i1Var, (kotlinx.coroutines.k2) c5);
                        this.f2829i.h(aVar6);
                        aVar = this.f2829i.mutex;
                        pVar = this.f2830j;
                        Object obj3 = this.f2831k;
                        l1 l1Var3 = this.f2829i;
                        this.f2827g = aVar6;
                        this.f2822b = aVar;
                        this.f2823c = pVar;
                        this.f2824d = obj3;
                        this.f2825e = l1Var3;
                        this.f2826f = 1;
                        if (aVar.f(null, this) == aVar5) {
                            return aVar5;
                        }
                        obj2 = obj3;
                        aVar2 = aVar6;
                        l1Var = l1Var3;
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            l1Var2 = (l1) this.f2823c;
                            aVar4 = (kotlinx.coroutines.sync.a) this.f2822b;
                            aVar3 = (a) this.f2827g;
                            try {
                                kotlin.a1.n(obj);
                                k1.a(l1Var2.currentMutator, aVar3, null);
                                aVar4.g(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                k1.a(l1Var2.currentMutator, aVar3, null);
                                throw th;
                            }
                        }
                        l1Var = (l1) this.f2825e;
                        obj2 = this.f2824d;
                        pVar = (ld.p) this.f2823c;
                        kotlinx.coroutines.sync.a aVar7 = (kotlinx.coroutines.sync.a) this.f2822b;
                        aVar2 = (a) this.f2827g;
                        kotlin.a1.n(obj);
                        aVar = aVar7;
                    }
                    this.f2827g = aVar2;
                    this.f2822b = aVar;
                    this.f2823c = l1Var;
                    this.f2824d = null;
                    this.f2825e = null;
                    this.f2826f = 2;
                    Object invoke = pVar.invoke(obj2, this);
                    if (invoke == aVar5) {
                        return aVar5;
                    }
                    l1Var2 = l1Var;
                    aVar4 = aVar;
                    obj = invoke;
                    aVar3 = aVar2;
                    k1.a(l1Var2.currentMutator, aVar3, null);
                    aVar4.g(null);
                    return obj;
                } catch (Throwable th3) {
                    aVar3 = aVar2;
                    th = th3;
                    l1Var2 = l1Var;
                    k1.a(l1Var2.currentMutator, aVar3, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r12.g(null);
                throw th4;
            }
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super R> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    public static /* synthetic */ Object e(l1 l1Var, i1 i1Var, ld.l lVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i1Var = i1.Default;
        }
        return l1Var.d(i1Var, lVar, dVar);
    }

    public static /* synthetic */ Object g(l1 l1Var, Object obj, i1 i1Var, ld.p pVar, kotlin.coroutines.d dVar, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            i1Var = i1.Default;
        }
        return l1Var.f(obj, i1Var, pVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(a mutator) {
        a aVar;
        do {
            aVar = this.currentMutator.get();
            if (aVar != null && !mutator.a(aVar)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!k1.a(this.currentMutator, aVar, mutator));
        if (aVar != null) {
            aVar.b();
        }
    }

    @fg.m
    public final <R> Object d(@fg.l i1 i1Var, @fg.l ld.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        return kotlinx.coroutines.s0.g(new b(i1Var, this, lVar, null), dVar);
    }

    @fg.m
    public final <T, R> Object f(T t4, @fg.l i1 i1Var, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        return kotlinx.coroutines.s0.g(new c(i1Var, this, pVar, t4, null), dVar);
    }
}
