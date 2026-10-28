package androidx.room;

import androidx.room.m0;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.z0;
import kotlinx.coroutines.k2;

/* compiled from: RoomDatabaseExt.kt */
@kd.i(name = "RoomDatabaseKt")
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aN\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n¢\u0006\u0002\b\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\b*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001a0\u0019*\u00020\u00012\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"R", "Landroidx/room/c2;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "g", "(Landroidx/room/c2;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "context", "Lkotlin/Function2;", "Lkotlinx/coroutines/r0;", "Lkotlin/u;", "transactionBlock", "f", "(Landroidx/room/c2;Lkotlin/coroutines/g;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/e;", "dispatcher", "c", "(Landroidx/room/c2;Lkotlin/coroutines/e;)Lkotlin/coroutines/g;", "", "", "tables", "", "emitInitialState", "Lkotlinx/coroutines/flow/i;", "", "d", "(Landroidx/room/c2;[Ljava/lang/String;Z)Lkotlinx/coroutines/flow/i;", "room-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nRoomDatabaseExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabaseExt.kt\nandroidx/room/RoomDatabaseKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,239:1\n314#2,11:240\n*S KotlinDebug\n*F\n+ 1 RoomDatabaseExt.kt\nandroidx/room/RoomDatabaseKt\n*L\n92#1:240,11\n*E\n"})
/* loaded from: classes3.dex */
public final class d2 {

    /* compiled from: RoomDatabaseExt.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1", f = "RoomDatabaseExt.kt", i = {}, l = {235}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "", "", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super Set<? extends String>>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f33579b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f33580c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f33581d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c2 f33582e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String[] f33583f;

        /* compiled from: RoomDatabaseExt.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d2$a$a, reason: collision with other inner class name */
        static final class C0601a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.k2 f33584b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0601a(kotlinx.coroutines.k2 k2Var) {
                super(0);
                this.f33584b = k2Var;
            }

            public final void a() {
                k2.a.b(this.f33584b, null, 1, null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
                a();
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: RoomDatabaseExt.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$job$1", f = "RoomDatabaseExt.kt", i = {}, l = {230}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f33585b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c2 f33586c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f33587d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f33588e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.b0<Set<String>> f33589f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String[] f33590g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ AtomicBoolean f33591h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(c2 c2Var, c cVar, boolean z4, kotlinx.coroutines.channels.b0<? super Set<String>> b0Var, String[] strArr, AtomicBoolean atomicBoolean, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f33586c = c2Var;
                this.f33587d = cVar;
                this.f33588e = z4;
                this.f33589f = b0Var;
                this.f33590g = strArr;
                this.f33591h = atomicBoolean;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new b(this.f33586c, this.f33587d, this.f33588e, this.f33589f, this.f33590g, this.f33591h, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f33585b;
                try {
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        this.f33586c.getInvalidationTracker().c(this.f33587d);
                        if (this.f33588e) {
                            this.f33589f.M(kotlin.collections.l.mz(this.f33590g));
                        }
                        this.f33591h.set(false);
                        this.f33585b = 1;
                        if (kotlinx.coroutines.c1.a(this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    throw new KotlinNothingValueException();
                } catch (Throwable th) {
                    this.f33586c.getInvalidationTracker().t(this.f33587d);
                    throw th;
                }
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* compiled from: RoomDatabaseExt.kt */
        @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/d2$a$c", "Landroidx/room/m0$c;", "", "", "tables", "Lkotlin/k2;", "c", "(Ljava/util/Set;)V", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c extends m0.c {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AtomicBoolean f33592b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.b0<Set<String>> f33593c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(String[] strArr, AtomicBoolean atomicBoolean, kotlinx.coroutines.channels.b0<? super Set<String>> b0Var) {
                super(strArr);
                this.f33592b = atomicBoolean;
                this.f33593c = b0Var;
            }

            @Override // androidx.room.m0.c
            public void c(@fg.l Set<String> tables) {
                if (this.f33592b.get()) {
                    return;
                }
                this.f33593c.M(tables);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z4, c2 c2Var, String[] strArr, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f33581d = z4;
            this.f33582e = c2Var;
            this.f33583f = strArr;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super Set<String>> b0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f33581d, this.f33582e, this.f33583f, dVar);
            aVar.f33580c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.e a5;
            kotlinx.coroutines.k2 f4;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f33579b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f33580c;
                AtomicBoolean atomicBoolean = new AtomicBoolean(this.f33581d);
                c cVar = new c(this.f33583f, atomicBoolean, b0Var);
                q2 q2Var = (q2) b0Var.getCoroutineContext().c(q2.INSTANCE);
                if (q2Var == null || (a5 = q2Var.getTransactionDispatcher()) == null) {
                    a5 = k.a(this.f33582e);
                }
                f4 = kotlinx.coroutines.k.f(b0Var, a5, null, new b(this.f33582e, cVar, this.f33581d, b0Var, this.f33583f, atomicBoolean, null), 2, null);
                C0601a c0601a = new C0601a(f4);
                this.f33579b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, c0601a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: RoomDatabaseExt.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/k2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.g f33594b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<R> f33595c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c2 f33596d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super R>, Object> f33597e;

        /* compiled from: RoomDatabaseExt.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", f = "RoomDatabaseExt.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f33598b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f33599c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c2 f33600d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.p<R> f33601e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super R>, Object> f33602f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c2 c2Var, kotlinx.coroutines.p<? super R> pVar, ld.p<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar2, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f33600d = c2Var;
                this.f33601e = pVar;
                this.f33602f = pVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f33600d, this.f33601e, this.f33602f, dVar);
                aVar.f33599c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.d dVar;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f33598b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    g.b c5 = ((kotlinx.coroutines.r0) this.f33599c).getCoroutineContext().c(kotlin.coroutines.e.INSTANCE);
                    kotlin.jvm.internal.l0.m(c5);
                    kotlin.coroutines.g c6 = d2.c(this.f33600d, (kotlin.coroutines.e) c5);
                    kotlin.coroutines.d dVar2 = this.f33601e;
                    z0.Companion companion = kotlin.z0.INSTANCE;
                    ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super R>, Object> pVar = this.f33602f;
                    this.f33599c = dVar2;
                    this.f33598b = 1;
                    obj = kotlinx.coroutines.i.h(c6, pVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    dVar = dVar2;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = (kotlin.coroutines.d) this.f33599c;
                    kotlin.a1.n(obj);
                }
                dVar.resumeWith(kotlin.z0.b(obj));
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(kotlin.coroutines.g gVar, kotlinx.coroutines.p<? super R> pVar, c2 c2Var, ld.p<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar2) {
            this.f33594b = gVar;
            this.f33595c = pVar;
            this.f33596d = c2Var;
            this.f33597e = pVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                kotlinx.coroutines.i.f(this.f33594b.d(kotlin.coroutines.e.INSTANCE), new a(this.f33596d, this.f33595c, this.f33597e, null));
            } catch (Throwable th) {
                this.f33595c.f(th);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: RoomDatabaseExt.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1", f = "RoomDatabaseExt.kt", i = {0}, l = {62}, m = "invokeSuspend", n = {"transactionElement"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/r0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class c<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super R>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f33603b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f33604c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c2 f33605d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<kotlin.coroutines.d<? super R>, Object> f33606e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(c2 c2Var, ld.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f33605d = c2Var;
            this.f33606e = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f33605d, this.f33606e, dVar);
            cVar.f33604c = obj;
            return cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.coroutines.intrinsics.a] */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            Throwable th;
            q2 q2Var;
            q2 q2Var2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f33603b;
            try {
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    g.b c5 = ((kotlinx.coroutines.r0) this.f33604c).getCoroutineContext().c(q2.INSTANCE);
                    kotlin.jvm.internal.l0.m(c5);
                    q2 q2Var3 = (q2) c5;
                    q2Var3.a();
                    try {
                        this.f33605d.beginTransaction();
                        try {
                            ld.l<kotlin.coroutines.d<? super R>, Object> lVar = this.f33606e;
                            this.f33604c = q2Var3;
                            this.f33603b = 1;
                            Object invoke = lVar.invoke(this);
                            if (invoke == q2Var2) {
                                return q2Var2;
                            }
                            q2Var = q2Var3;
                            obj = invoke;
                        } catch (Throwable th2) {
                            th = th2;
                            this.f33605d.endTransaction();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        q2Var2 = q2Var3;
                        th = th3;
                        q2Var2.p();
                        throw th;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q2Var = (q2) this.f33604c;
                    try {
                        kotlin.a1.n(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        this.f33605d.endTransaction();
                        throw th;
                    }
                }
                this.f33605d.setTransactionSuccessful();
                this.f33605d.endTransaction();
                q2Var.p();
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super R> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.coroutines.g c(c2 c2Var, kotlin.coroutines.e eVar) {
        q2 q2Var = new q2(eVar);
        return eVar.O(q2Var).O(new kotlinx.coroutines.internal.z0(Integer.valueOf(System.identityHashCode(q2Var)), c2Var.getSuspendingTransactionId()));
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<Set<String>> d(@fg.l c2 c2Var, @fg.l String[] strArr, boolean z4) {
        return kotlinx.coroutines.flow.k.s(new a(z4, c2Var, strArr, null));
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i e(c2 c2Var, String[] strArr, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        return d(c2Var, strArr, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R> Object f(c2 c2Var, kotlin.coroutines.g gVar, ld.p<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, kotlin.coroutines.d<? super R> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        try {
            c2Var.getTransactionExecutor().execute(new b(gVar, qVar, c2Var, pVar));
        } catch (RejectedExecutionException e4) {
            qVar.f(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e4));
        }
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    @fg.m
    public static final <R> Object g(@fg.l c2 c2Var, @fg.l ld.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        c cVar = new c(c2Var, lVar, null);
        q2 q2Var = (q2) dVar.getF75269b().c(q2.INSTANCE);
        kotlin.coroutines.e transactionDispatcher = q2Var != null ? q2Var.getTransactionDispatcher() : null;
        return transactionDispatcher != null ? kotlinx.coroutines.i.h(transactionDispatcher, cVar, dVar) : f(c2Var, dVar.getF75269b(), cVar, dVar);
    }
}
