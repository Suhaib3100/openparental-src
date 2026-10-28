package androidx.compose.foundation;

import androidx.compose.runtime.x4;
import com.android.internal.telephony.cdma.UserData;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlinx.coroutines.sync.a;

/* compiled from: MutatorMutex.kt */
@x4
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\t2\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013¢\u0006\u0002\b\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\u00020\u00182\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017H\u0086\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001d\u0010\u0003R(\u0010\"\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001ej\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroidx/compose/foundation/c2;", "", "<init>", "()V", "Landroidx/compose/foundation/c2$a;", "mutator", "Lkotlin/k2;", "j", "(Landroidx/compose/foundation/c2$a;)V", "R", "Landroidx/compose/foundation/a2;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "block", "d", "(Landroidx/compose/foundation/a2;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/Function2;", "Lkotlin/u;", "f", "(Ljava/lang/Object;Landroidx/compose/foundation/a2;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "i", "(Lld/a;)Z", "h", "()Z", "k", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/foundation/AtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "Lkotlinx/coroutines/sync/a;", "b", "Lkotlinx/coroutines/sync/a;", "mutex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f3546c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AtomicReference<a> currentMutator = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.sync.a mutex = kotlinx.coroutines.sync.c.b(false, 1, null);

    /* compiled from: MutatorMutex.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/c2$a;", "", "Landroidx/compose/foundation/a2;", "priority", "Lkotlinx/coroutines/k2;", "job", "<init>", "(Landroidx/compose/foundation/a2;Lkotlinx/coroutines/k2;)V", "other", "", "a", "(Landroidx/compose/foundation/c2$a;)Z", "Lkotlin/k2;", "b", "()V", "Landroidx/compose/foundation/a2;", "d", "()Landroidx/compose/foundation/a2;", "Lkotlinx/coroutines/k2;", "c", "()Lkotlinx/coroutines/k2;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final a2 priority;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlinx.coroutines.k2 job;

        public a(@fg.l a2 a2Var, @fg.l kotlinx.coroutines.k2 k2Var) {
            this.priority = a2Var;
            this.job = k2Var;
        }

        public final boolean a(@fg.l a other) {
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void b() {
            this.job.b(new b2());
        }

        @fg.l
        /* renamed from: c, reason: from getter */
        public final kotlinx.coroutines.k2 getJob() {
            return this.job;
        }

        @fg.l
        /* renamed from: d, reason: from getter */
        public final a2 getPriority() {
            return this.priority;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: MutatorMutex.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {220, UserData.IS91_MSG_TYPE_CLI}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/r0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,214:1\n120#2,10:215\n*S KotlinDebug\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutate$2\n*L\n130#1:215,10\n*E\n"})
    static final class b<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super R>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f3551b;

        /* renamed from: c, reason: collision with root package name */
        Object f3552c;

        /* renamed from: d, reason: collision with root package name */
        Object f3553d;

        /* renamed from: e, reason: collision with root package name */
        int f3554e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f3555f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a2 f3556g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ c2 f3557h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.l<kotlin.coroutines.d<? super R>, Object> f3558i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(a2 a2Var, c2 c2Var, ld.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f3556g = a2Var;
            this.f3557h = c2Var;
            this.f3558i = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f3556g, this.f3557h, this.f3558i, dVar);
            bVar.f3555f = obj;
            return bVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.sync.a aVar;
            ld.l<kotlin.coroutines.d<? super R>, Object> lVar;
            a aVar2;
            c2 c2Var;
            a aVar3;
            Throwable th;
            c2 c2Var2;
            kotlinx.coroutines.sync.a aVar4;
            kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            ?? r12 = this.f3554e;
            try {
                try {
                    if (r12 == 0) {
                        kotlin.a1.n(obj);
                        kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f3555f;
                        a2 a2Var = this.f3556g;
                        g.b c5 = r0Var.getCoroutineContext().c(kotlinx.coroutines.k2.INSTANCE);
                        kotlin.jvm.internal.l0.m(c5);
                        a aVar6 = new a(a2Var, (kotlinx.coroutines.k2) c5);
                        this.f3557h.j(aVar6);
                        aVar = this.f3557h.mutex;
                        ld.l<kotlin.coroutines.d<? super R>, Object> lVar2 = this.f3558i;
                        c2 c2Var3 = this.f3557h;
                        this.f3555f = aVar6;
                        this.f3551b = aVar;
                        this.f3552c = lVar2;
                        this.f3553d = c2Var3;
                        this.f3554e = 1;
                        if (aVar.f(null, this) == aVar5) {
                            return aVar5;
                        }
                        lVar = lVar2;
                        aVar2 = aVar6;
                        c2Var = c2Var3;
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c2Var2 = (c2) this.f3552c;
                            aVar4 = (kotlinx.coroutines.sync.a) this.f3551b;
                            aVar3 = (a) this.f3555f;
                            try {
                                kotlin.a1.n(obj);
                                androidx.compose.animation.core.k1.a(c2Var2.currentMutator, aVar3, null);
                                aVar4.g(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                androidx.compose.animation.core.k1.a(c2Var2.currentMutator, aVar3, null);
                                throw th;
                            }
                        }
                        c2Var = (c2) this.f3553d;
                        lVar = (ld.l) this.f3552c;
                        kotlinx.coroutines.sync.a aVar7 = (kotlinx.coroutines.sync.a) this.f3551b;
                        aVar2 = (a) this.f3555f;
                        kotlin.a1.n(obj);
                        aVar = aVar7;
                    }
                    this.f3555f = aVar2;
                    this.f3551b = aVar;
                    this.f3552c = c2Var;
                    this.f3553d = null;
                    this.f3554e = 2;
                    Object invoke = lVar.invoke(this);
                    if (invoke == aVar5) {
                        return aVar5;
                    }
                    c2Var2 = c2Var;
                    aVar4 = aVar;
                    obj = invoke;
                    aVar3 = aVar2;
                    androidx.compose.animation.core.k1.a(c2Var2.currentMutator, aVar3, null);
                    aVar4.g(null);
                    return obj;
                } catch (Throwable th3) {
                    aVar3 = aVar2;
                    th = th3;
                    c2Var2 = c2Var;
                    androidx.compose.animation.core.k1.a(c2Var2.currentMutator, aVar3, null);
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
    /* compiled from: MutatorMutex.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {220, 173}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/r0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,214:1\n120#2,10:215\n*S KotlinDebug\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutateWith$2\n*L\n171#1:215,10\n*E\n"})
    static final class c<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super R>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f3559b;

        /* renamed from: c, reason: collision with root package name */
        Object f3560c;

        /* renamed from: d, reason: collision with root package name */
        Object f3561d;

        /* renamed from: e, reason: collision with root package name */
        Object f3562e;

        /* renamed from: f, reason: collision with root package name */
        int f3563f;

        /* renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f3564g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a2 f3565h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ c2 f3566i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<T, kotlin.coroutines.d<? super R>, Object> f3567j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ T f3568k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(a2 a2Var, c2 c2Var, ld.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, T t4, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f3565h = a2Var;
            this.f3566i = c2Var;
            this.f3567j = pVar;
            this.f3568k = t4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f3565h, this.f3566i, this.f3567j, this.f3568k, dVar);
            cVar.f3564g = obj;
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
            c2 c2Var;
            a aVar3;
            Throwable th;
            c2 c2Var2;
            kotlinx.coroutines.sync.a aVar4;
            kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            ?? r12 = this.f3563f;
            try {
                try {
                    if (r12 == 0) {
                        kotlin.a1.n(obj);
                        kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f3564g;
                        a2 a2Var = this.f3565h;
                        g.b c5 = r0Var.getCoroutineContext().c(kotlinx.coroutines.k2.INSTANCE);
                        kotlin.jvm.internal.l0.m(c5);
                        a aVar6 = new a(a2Var, (kotlinx.coroutines.k2) c5);
                        this.f3566i.j(aVar6);
                        aVar = this.f3566i.mutex;
                        pVar = this.f3567j;
                        Object obj3 = this.f3568k;
                        c2 c2Var3 = this.f3566i;
                        this.f3564g = aVar6;
                        this.f3559b = aVar;
                        this.f3560c = pVar;
                        this.f3561d = obj3;
                        this.f3562e = c2Var3;
                        this.f3563f = 1;
                        if (aVar.f(null, this) == aVar5) {
                            return aVar5;
                        }
                        obj2 = obj3;
                        aVar2 = aVar6;
                        c2Var = c2Var3;
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c2Var2 = (c2) this.f3560c;
                            aVar4 = (kotlinx.coroutines.sync.a) this.f3559b;
                            aVar3 = (a) this.f3564g;
                            try {
                                kotlin.a1.n(obj);
                                androidx.compose.animation.core.k1.a(c2Var2.currentMutator, aVar3, null);
                                aVar4.g(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                androidx.compose.animation.core.k1.a(c2Var2.currentMutator, aVar3, null);
                                throw th;
                            }
                        }
                        c2Var = (c2) this.f3562e;
                        obj2 = this.f3561d;
                        pVar = (ld.p) this.f3560c;
                        kotlinx.coroutines.sync.a aVar7 = (kotlinx.coroutines.sync.a) this.f3559b;
                        aVar2 = (a) this.f3564g;
                        kotlin.a1.n(obj);
                        aVar = aVar7;
                    }
                    this.f3564g = aVar2;
                    this.f3559b = aVar;
                    this.f3560c = c2Var;
                    this.f3561d = null;
                    this.f3562e = null;
                    this.f3563f = 2;
                    Object invoke = pVar.invoke(obj2, this);
                    if (invoke == aVar5) {
                        return aVar5;
                    }
                    c2Var2 = c2Var;
                    aVar4 = aVar;
                    obj = invoke;
                    aVar3 = aVar2;
                    androidx.compose.animation.core.k1.a(c2Var2.currentMutator, aVar3, null);
                    aVar4.g(null);
                    return obj;
                } catch (Throwable th3) {
                    aVar3 = aVar2;
                    th = th3;
                    c2Var2 = c2Var;
                    androidx.compose.animation.core.k1.a(c2Var2.currentMutator, aVar3, null);
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

    public static /* synthetic */ Object e(c2 c2Var, a2 a2Var, ld.l lVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            a2Var = a2.Default;
        }
        return c2Var.d(a2Var, lVar, dVar);
    }

    public static /* synthetic */ Object g(c2 c2Var, Object obj, a2 a2Var, ld.p pVar, kotlin.coroutines.d dVar, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            a2Var = a2.Default;
        }
        return c2Var.f(obj, a2Var, pVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(a mutator) {
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
    public final <R> Object d(@fg.l a2 a2Var, @fg.l ld.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        return kotlinx.coroutines.s0.g(new b(a2Var, this, lVar, null), dVar);
    }

    @fg.m
    public final <T, R> Object f(T t4, @fg.l a2 a2Var, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        return kotlinx.coroutines.s0.g(new c(a2Var, this, pVar, t4, null), dVar);
    }

    @kotlin.w0
    public final boolean h() {
        return a.C1262a.c(this.mutex, null, 1, null);
    }

    public final boolean i(@fg.l ld.a<kotlin.k2> block) {
        boolean h4 = h();
        if (h4) {
            try {
                block.invoke();
            } finally {
                k();
            }
        }
        return h4;
    }

    @kotlin.w0
    public final void k() {
        a.C1262a.d(this.mutex, null, 1, null);
    }
}
