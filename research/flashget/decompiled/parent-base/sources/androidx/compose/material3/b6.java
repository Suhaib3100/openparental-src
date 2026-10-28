package androidx.compose.material3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.sync.a;

/* compiled from: InternalMutatorMutex.kt */
@androidx.compose.runtime.x4
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\t2\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013¢\u0006\u0002\b\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00182\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017¢\u0006\u0004\b\u0019\u0010\u001aR(\u0010\u001f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/material3/b6;", "", "<init>", "()V", "Landroidx/compose/material3/b6$a;", "mutator", "Lkotlin/k2;", "i", "(Landroidx/compose/material3/b6$a;)V", "R", "Landroidx/compose/foundation/a2;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "block", "d", "(Landroidx/compose/foundation/a2;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/Function2;", "Lkotlin/u;", "f", "(Ljava/lang/Object;Landroidx/compose/foundation/a2;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "h", "(Lld/a;)Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/material3/InternalAtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "Lkotlinx/coroutines/sync/a;", "b", "Lkotlinx/coroutines/sync/a;", "mutex", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b6 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f9835c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AtomicReference<a> currentMutator = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.sync.a mutex = kotlinx.coroutines.sync.c.b(false, 1, null);

    /* compiled from: InternalMutatorMutex.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/b6$a;", "", "Landroidx/compose/foundation/a2;", "priority", "Lkotlinx/coroutines/k2;", "job", "<init>", "(Landroidx/compose/foundation/a2;Lkotlinx/coroutines/k2;)V", "other", "", "a", "(Landroidx/compose/material3/b6$a;)Z", "Lkotlin/k2;", "b", "()V", "Landroidx/compose/foundation/a2;", "d", "()Landroidx/compose/foundation/a2;", "Lkotlinx/coroutines/k2;", "c", "()Lkotlinx/coroutines/k2;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.foundation.a2 priority;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlinx.coroutines.k2 job;

        public a(@fg.l androidx.compose.foundation.a2 a2Var, @fg.l kotlinx.coroutines.k2 k2Var) {
            this.priority = a2Var;
            this.job = k2Var;
        }

        public final boolean a(@fg.l a other) {
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void b() {
            k2.a.b(this.job, null, 1, null);
        }

        @fg.l
        /* renamed from: c, reason: from getter */
        public final kotlinx.coroutines.k2 getJob() {
            return this.job;
        }

        @fg.l
        /* renamed from: d, reason: from getter */
        public final androidx.compose.foundation.a2 getPriority() {
            return this.priority;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: InternalMutatorMutex.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {177, 99}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/r0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material3/InternalMutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,171:1\n120#2,10:172\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material3/InternalMutatorMutex$mutate$2\n*L\n97#1:172,10\n*E\n"})
    static final class b<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super R>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f9840b;

        /* renamed from: c, reason: collision with root package name */
        Object f9841c;

        /* renamed from: d, reason: collision with root package name */
        Object f9842d;

        /* renamed from: e, reason: collision with root package name */
        int f9843e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f9844f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.a2 f9845g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b6 f9846h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.l<kotlin.coroutines.d<? super R>, Object> f9847i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.foundation.a2 a2Var, b6 b6Var, ld.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f9845g = a2Var;
            this.f9846h = b6Var;
            this.f9847i = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f9845g, this.f9846h, this.f9847i, dVar);
            bVar.f9844f = obj;
            return bVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.sync.a aVar;
            ld.l<kotlin.coroutines.d<? super R>, Object> lVar;
            a aVar2;
            b6 b6Var;
            a aVar3;
            Throwable th;
            b6 b6Var2;
            kotlinx.coroutines.sync.a aVar4;
            kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            ?? r12 = this.f9843e;
            try {
                try {
                    if (r12 == 0) {
                        kotlin.a1.n(obj);
                        kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f9844f;
                        androidx.compose.foundation.a2 a2Var = this.f9845g;
                        g.b c5 = r0Var.getCoroutineContext().c(kotlinx.coroutines.k2.INSTANCE);
                        kotlin.jvm.internal.l0.m(c5);
                        a aVar6 = new a(a2Var, (kotlinx.coroutines.k2) c5);
                        this.f9846h.i(aVar6);
                        aVar = this.f9846h.mutex;
                        ld.l<kotlin.coroutines.d<? super R>, Object> lVar2 = this.f9847i;
                        b6 b6Var3 = this.f9846h;
                        this.f9844f = aVar6;
                        this.f9840b = aVar;
                        this.f9841c = lVar2;
                        this.f9842d = b6Var3;
                        this.f9843e = 1;
                        if (aVar.f(null, this) == aVar5) {
                            return aVar5;
                        }
                        lVar = lVar2;
                        aVar2 = aVar6;
                        b6Var = b6Var3;
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            b6Var2 = (b6) this.f9841c;
                            aVar4 = (kotlinx.coroutines.sync.a) this.f9840b;
                            aVar3 = (a) this.f9844f;
                            try {
                                kotlin.a1.n(obj);
                                androidx.compose.animation.core.k1.a(b6Var2.currentMutator, aVar3, null);
                                aVar4.g(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                androidx.compose.animation.core.k1.a(b6Var2.currentMutator, aVar3, null);
                                throw th;
                            }
                        }
                        b6Var = (b6) this.f9842d;
                        lVar = (ld.l) this.f9841c;
                        kotlinx.coroutines.sync.a aVar7 = (kotlinx.coroutines.sync.a) this.f9840b;
                        aVar2 = (a) this.f9844f;
                        kotlin.a1.n(obj);
                        aVar = aVar7;
                    }
                    this.f9844f = aVar2;
                    this.f9840b = aVar;
                    this.f9841c = b6Var;
                    this.f9842d = null;
                    this.f9843e = 2;
                    Object invoke = lVar.invoke(this);
                    if (invoke == aVar5) {
                        return aVar5;
                    }
                    b6Var2 = b6Var;
                    aVar4 = aVar;
                    obj = invoke;
                    aVar3 = aVar2;
                    androidx.compose.animation.core.k1.a(b6Var2.currentMutator, aVar3, null);
                    aVar4.g(null);
                    return obj;
                } catch (Throwable th3) {
                    aVar3 = aVar2;
                    th = th3;
                    b6Var2 = b6Var;
                    androidx.compose.animation.core.k1.a(b6Var2.currentMutator, aVar3, null);
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
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.InternalMutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {177, 138}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/r0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material3/InternalMutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,171:1\n120#2,10:172\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material3/InternalMutatorMutex$mutateWith$2\n*L\n136#1:172,10\n*E\n"})
    static final class c<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super R>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f9848b;

        /* renamed from: c, reason: collision with root package name */
        Object f9849c;

        /* renamed from: d, reason: collision with root package name */
        Object f9850d;

        /* renamed from: e, reason: collision with root package name */
        Object f9851e;

        /* renamed from: f, reason: collision with root package name */
        int f9852f;

        /* renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f9853g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.a2 f9854h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ b6 f9855i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<T, kotlin.coroutines.d<? super R>, Object> f9856j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ T f9857k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.foundation.a2 a2Var, b6 b6Var, ld.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, T t4, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f9854h = a2Var;
            this.f9855i = b6Var;
            this.f9856j = pVar;
            this.f9857k = t4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f9854h, this.f9855i, this.f9856j, this.f9857k, dVar);
            cVar.f9853g = obj;
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
            b6 b6Var;
            a aVar3;
            Throwable th;
            b6 b6Var2;
            kotlinx.coroutines.sync.a aVar4;
            kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            ?? r12 = this.f9852f;
            try {
                try {
                    if (r12 == 0) {
                        kotlin.a1.n(obj);
                        kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f9853g;
                        androidx.compose.foundation.a2 a2Var = this.f9854h;
                        g.b c5 = r0Var.getCoroutineContext().c(kotlinx.coroutines.k2.INSTANCE);
                        kotlin.jvm.internal.l0.m(c5);
                        a aVar6 = new a(a2Var, (kotlinx.coroutines.k2) c5);
                        this.f9855i.i(aVar6);
                        aVar = this.f9855i.mutex;
                        pVar = this.f9856j;
                        Object obj3 = this.f9857k;
                        b6 b6Var3 = this.f9855i;
                        this.f9853g = aVar6;
                        this.f9848b = aVar;
                        this.f9849c = pVar;
                        this.f9850d = obj3;
                        this.f9851e = b6Var3;
                        this.f9852f = 1;
                        if (aVar.f(null, this) == aVar5) {
                            return aVar5;
                        }
                        obj2 = obj3;
                        aVar2 = aVar6;
                        b6Var = b6Var3;
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            b6Var2 = (b6) this.f9849c;
                            aVar4 = (kotlinx.coroutines.sync.a) this.f9848b;
                            aVar3 = (a) this.f9853g;
                            try {
                                kotlin.a1.n(obj);
                                androidx.compose.animation.core.k1.a(b6Var2.currentMutator, aVar3, null);
                                aVar4.g(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                androidx.compose.animation.core.k1.a(b6Var2.currentMutator, aVar3, null);
                                throw th;
                            }
                        }
                        b6Var = (b6) this.f9851e;
                        obj2 = this.f9850d;
                        pVar = (ld.p) this.f9849c;
                        kotlinx.coroutines.sync.a aVar7 = (kotlinx.coroutines.sync.a) this.f9848b;
                        aVar2 = (a) this.f9853g;
                        kotlin.a1.n(obj);
                        aVar = aVar7;
                    }
                    this.f9853g = aVar2;
                    this.f9848b = aVar;
                    this.f9849c = b6Var;
                    this.f9850d = null;
                    this.f9851e = null;
                    this.f9852f = 2;
                    Object invoke = pVar.invoke(obj2, this);
                    if (invoke == aVar5) {
                        return aVar5;
                    }
                    b6Var2 = b6Var;
                    aVar4 = aVar;
                    obj = invoke;
                    aVar3 = aVar2;
                    androidx.compose.animation.core.k1.a(b6Var2.currentMutator, aVar3, null);
                    aVar4.g(null);
                    return obj;
                } catch (Throwable th3) {
                    aVar3 = aVar2;
                    th = th3;
                    b6Var2 = b6Var;
                    androidx.compose.animation.core.k1.a(b6Var2.currentMutator, aVar3, null);
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

    public static /* synthetic */ Object e(b6 b6Var, androidx.compose.foundation.a2 a2Var, ld.l lVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            a2Var = androidx.compose.foundation.a2.Default;
        }
        return b6Var.d(a2Var, lVar, dVar);
    }

    public static /* synthetic */ Object g(b6 b6Var, Object obj, androidx.compose.foundation.a2 a2Var, ld.p pVar, kotlin.coroutines.d dVar, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            a2Var = androidx.compose.foundation.a2.Default;
        }
        return b6Var.f(obj, a2Var, pVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(a mutator) {
        a aVar;
        do {
            aVar = this.currentMutator.get();
            if (aVar != null && !mutator.a(aVar)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!androidx.compose.animation.core.k1.a(this.currentMutator, aVar, mutator));
        if (aVar != null) {
            aVar.b();
        }
    }

    @fg.m
    public final <R> Object d(@fg.l androidx.compose.foundation.a2 a2Var, @fg.l ld.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        return kotlinx.coroutines.s0.g(new b(a2Var, this, lVar, null), dVar);
    }

    @fg.m
    public final <T, R> Object f(T t4, @fg.l androidx.compose.foundation.a2 a2Var, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        return kotlinx.coroutines.s0.g(new c(a2Var, this, pVar, t4, null), dVar);
    }

    public final boolean h(@fg.l ld.a<kotlin.k2> block) {
        boolean c5 = a.C1262a.c(this.mutex, null, 1, null);
        if (c5) {
            try {
                block.invoke();
            } finally {
                a.C1262a.d(this.mutex, null, 1, null);
            }
        }
        return c5;
    }
}
