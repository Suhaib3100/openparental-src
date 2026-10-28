package androidx.room;

import android.os.CancellationSignal;
import androidx.annotation.c1;
import androidx.room.m0;
import com.android.internal.telephony.cdma.UserData;
import f3.c;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.z0;
import kotlinx.coroutines.k2;

/* compiled from: CoroutinesRoom.kt */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/room/j;", "", "<init>", "()V", "a", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: CoroutinesRoom.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JL\u0010\u0016\u001a\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00150\u0014\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/room/j$a;", "", "<init>", "()V", "R", "Landroidx/room/c2;", "db", "", "inTransaction", "Ljava/util/concurrent/Callable;", "callable", "c", "(Landroidx/room/c2;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "b", "(Landroidx/room/c2;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "", "tableNames", "Lkotlinx/coroutines/flow/i;", "Lkd/o;", "a", "(Landroidx/room/c2;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lkotlinx/coroutines/flow/i;", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nCoroutinesRoom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutinesRoom.kt\nandroidx/room/CoroutinesRoom$Companion\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,162:1\n314#2,11:163\n*S KotlinDebug\n*F\n+ 1 CoroutinesRoom.kt\nandroidx/room/CoroutinesRoom$Companion\n*L\n84#1:163,11\n*E\n"})
    /* renamed from: androidx.room.j$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: Add missing generic type declarations: [R] */
        /* compiled from: CoroutinesRoom.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "Lkotlinx/coroutines/flow/j;", "Lkd/o;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.j$a$a, reason: collision with other inner class name */
        static final class C0606a<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<R>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f33740b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f33741c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f33742d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ c2 f33743e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String[] f33744f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Callable<R> f33745g;

            /* compiled from: CoroutinesRoom.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.room.j$a$a$a, reason: collision with other inner class name */
            static final class C0607a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f33746b;

                /* renamed from: c, reason: collision with root package name */
                private /* synthetic */ Object f33747c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f33748d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ c2 f33749e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.j<R> f33750f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ String[] f33751g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Callable<R> f33752h;

                /* compiled from: CoroutinesRoom.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", i = {}, l = {128, UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.room.j$a$a$a$a, reason: collision with other inner class name */
                static final class C0608a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    Object f33753b;

                    /* renamed from: c, reason: collision with root package name */
                    int f33754c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ c2 f33755d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ b f33756e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.channels.l<kotlin.k2> f33757f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ Callable<R> f33758g;

                    /* renamed from: h, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.channels.l<R> f33759h;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0608a(c2 c2Var, b bVar, kotlinx.coroutines.channels.l<kotlin.k2> lVar, Callable<R> callable, kotlinx.coroutines.channels.l<R> lVar2, kotlin.coroutines.d<? super C0608a> dVar) {
                        super(2, dVar);
                        this.f33755d = c2Var;
                        this.f33756e = bVar;
                        this.f33757f = lVar;
                        this.f33758g = callable;
                        this.f33759h = lVar2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        return new C0608a(this.f33755d, this.f33756e, this.f33757f, this.f33758g, this.f33759h, dVar);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:11:0x0045 A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:7:0x0010, B:9:0x003b, B:14:0x0049, B:16:0x0051, B:25:0x0023, B:27:0x0035), top: B:2:0x0006 }] */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0064 -> B:8:0x0013). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r7) {
                        /*
                            r6 = this;
                            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                            int r1 = r6.f33754c
                            r2 = 2
                            r3 = 1
                            if (r1 == 0) goto L27
                            if (r1 == r3) goto L1f
                            if (r1 != r2) goto L17
                            java.lang.Object r1 = r6.f33753b
                            kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L15
                        L13:
                            r7 = r1
                            goto L3b
                        L15:
                            r7 = move-exception
                            goto L75
                        L17:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r0)
                            throw r7
                        L1f:
                            java.lang.Object r1 = r6.f33753b
                            kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L15
                            goto L49
                        L27:
                            kotlin.a1.n(r7)
                            androidx.room.c2 r7 = r6.f33755d
                            androidx.room.m0 r7 = r7.getInvalidationTracker()
                            androidx.room.j$a$a$a$b r1 = r6.f33756e
                            r7.c(r1)
                            kotlinx.coroutines.channels.l<kotlin.k2> r7 = r6.f33757f     // Catch: java.lang.Throwable -> L15
                            kotlinx.coroutines.channels.n r7 = r7.iterator()     // Catch: java.lang.Throwable -> L15
                        L3b:
                            r6.f33753b = r7     // Catch: java.lang.Throwable -> L15
                            r6.f33754c = r3     // Catch: java.lang.Throwable -> L15
                            java.lang.Object r1 = r7.c(r6)     // Catch: java.lang.Throwable -> L15
                            if (r1 != r0) goto L46
                            return r0
                        L46:
                            r5 = r1
                            r1 = r7
                            r7 = r5
                        L49:
                            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L15
                            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L15
                            if (r7 == 0) goto L67
                            r1.next()     // Catch: java.lang.Throwable -> L15
                            java.util.concurrent.Callable<R> r7 = r6.f33758g     // Catch: java.lang.Throwable -> L15
                            java.lang.Object r7 = r7.call()     // Catch: java.lang.Throwable -> L15
                            kotlinx.coroutines.channels.l<R> r4 = r6.f33759h     // Catch: java.lang.Throwable -> L15
                            r6.f33753b = r1     // Catch: java.lang.Throwable -> L15
                            r6.f33754c = r2     // Catch: java.lang.Throwable -> L15
                            java.lang.Object r7 = r4.f0(r7, r6)     // Catch: java.lang.Throwable -> L15
                            if (r7 != r0) goto L13
                            return r0
                        L67:
                            androidx.room.c2 r7 = r6.f33755d
                            androidx.room.m0 r7 = r7.getInvalidationTracker()
                            androidx.room.j$a$a$a$b r0 = r6.f33756e
                            r7.t(r0)
                            kotlin.k2 r7 = kotlin.k2.f75408a
                            return r7
                        L75:
                            androidx.room.c2 r0 = r6.f33755d
                            androidx.room.m0 r0 = r0.getInvalidationTracker()
                            androidx.room.j$a$a$a$b r1 = r6.f33756e
                            r0.t(r1)
                            throw r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.room.j.Companion.C0606a.C0607a.C0608a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // ld.p
                    @fg.m
                    public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                        return ((C0608a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                    }
                }

                /* compiled from: CoroutinesRoom.kt */
                @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/j$a$a$a$b", "Landroidx/room/m0$c;", "", "", "tables", "Lkotlin/k2;", "c", "(Ljava/util/Set;)V", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                /* renamed from: androidx.room.j$a$a$a$b */
                public static final class b extends m0.c {

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.channels.l<kotlin.k2> f33760b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(String[] strArr, kotlinx.coroutines.channels.l<kotlin.k2> lVar) {
                        super(strArr);
                        this.f33760b = lVar;
                    }

                    @Override // androidx.room.m0.c
                    public void c(@fg.l Set<String> tables) {
                        this.f33760b.M(kotlin.k2.f75408a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0607a(boolean z4, c2 c2Var, kotlinx.coroutines.flow.j<R> jVar, String[] strArr, Callable<R> callable, kotlin.coroutines.d<? super C0607a> dVar) {
                    super(2, dVar);
                    this.f33748d = z4;
                    this.f33749e = c2Var;
                    this.f33750f = jVar;
                    this.f33751g = strArr;
                    this.f33752h = callable;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    C0607a c0607a = new C0607a(this.f33748d, this.f33749e, this.f33750f, this.f33751g, this.f33752h, dVar);
                    c0607a.f33747c = obj;
                    return c0607a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.e b5;
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f33746b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f33747c;
                        kotlinx.coroutines.channels.l d5 = kotlinx.coroutines.channels.o.d(-1, null, null, 6, null);
                        b bVar = new b(this.f33751g, d5);
                        d5.M(kotlin.k2.f75408a);
                        q2 q2Var = (q2) r0Var.getCoroutineContext().c(q2.INSTANCE);
                        if (q2Var == null || (b5 = q2Var.getTransactionDispatcher()) == null) {
                            b5 = this.f33748d ? k.b(this.f33749e) : k.a(this.f33749e);
                        }
                        kotlinx.coroutines.channels.l d6 = kotlinx.coroutines.channels.o.d(0, null, null, 7, null);
                        kotlinx.coroutines.k.f(r0Var, b5, null, new C0608a(this.f33749e, bVar, d5, this.f33752h, d6, null), 2, null);
                        kotlinx.coroutines.flow.j<R> jVar = this.f33750f;
                        this.f33746b = 1;
                        if (kotlinx.coroutines.flow.k.l0(jVar, d6, this) == aVar) {
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

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((C0607a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0606a(boolean z4, c2 c2Var, String[] strArr, Callable<R> callable, kotlin.coroutines.d<? super C0606a> dVar) {
                super(2, dVar);
                this.f33742d = z4;
                this.f33743e = c2Var;
                this.f33744f = strArr;
                this.f33745g = callable;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l kotlinx.coroutines.flow.j<R> jVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((C0606a) create(jVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                C0606a c0606a = new C0606a(this.f33742d, this.f33743e, this.f33744f, this.f33745g, dVar);
                c0606a.f33741c = obj;
                return c0606a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f33740b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    C0607a c0607a = new C0607a(this.f33742d, this.f33743e, (kotlinx.coroutines.flow.j) this.f33741c, this.f33744f, this.f33745g, null);
                    this.f33740b = 1;
                    if (kotlinx.coroutines.s0.g(c0607a, this) == aVar) {
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

        /* JADX INFO: Add missing generic type declarations: [R] */
        /* compiled from: CoroutinesRoom.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/r0;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.j$a$b */
        static final class b<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super R>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f33761b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Callable<R> f33762c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Callable<R> callable, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f33762c = callable;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new b(this.f33762c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f33761b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                return this.f33762c.call();
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super R> dVar) {
                return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* compiled from: CoroutinesRoom.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.j$a$c */
        static final class c extends kotlin.jvm.internal.n0 implements ld.l<Throwable, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CancellationSignal f33763b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.k2 f33764c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(CancellationSignal cancellationSignal, kotlinx.coroutines.k2 k2Var) {
                super(1);
                this.f33763b = cancellationSignal;
                this.f33764c = k2Var;
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
                invoke2(th);
                return kotlin.k2.f75408a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@fg.m Throwable th) {
                CancellationSignal cancellationSignal = this.f33763b;
                if (cancellationSignal != null) {
                    c.a.a(cancellationSignal);
                }
                k2.a.b(this.f33764c, null, 1, null);
            }
        }

        /* compiled from: CoroutinesRoom.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.j$a$d */
        static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f33765b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Callable<R> f33766c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.p<R> f33767d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(Callable<R> callable, kotlinx.coroutines.p<? super R> pVar, kotlin.coroutines.d<? super d> dVar) {
                super(2, dVar);
                this.f33766c = callable;
                this.f33767d = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new d(this.f33766c, this.f33767d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f33765b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                try {
                    Object call = this.f33766c.call();
                    kotlin.coroutines.d dVar = this.f33767d;
                    z0.Companion companion = kotlin.z0.INSTANCE;
                    dVar.resumeWith(call);
                } catch (Throwable th) {
                    kotlin.coroutines.d dVar2 = this.f33767d;
                    z0.Companion companion2 = kotlin.z0.INSTANCE;
                    dVar2.resumeWith(kotlin.a1.a(th));
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((d) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        private Companion() {
        }

        @fg.l
        @kd.n
        public final <R> kotlinx.coroutines.flow.i<R> a(@fg.l c2 db2, boolean inTransaction, @fg.l String[] tableNames, @fg.l Callable<R> callable) {
            return kotlinx.coroutines.flow.k.J0(new C0606a(inTransaction, db2, tableNames, callable, null));
        }

        @fg.m
        @kd.n
        public final <R> Object b(@fg.l c2 c2Var, boolean z4, @fg.m CancellationSignal cancellationSignal, @fg.l Callable<R> callable, @fg.l kotlin.coroutines.d<? super R> dVar) {
            kotlin.coroutines.e b5;
            kotlinx.coroutines.k2 f4;
            if (c2Var.isOpenInternal() && c2Var.inTransaction()) {
                return callable.call();
            }
            q2 q2Var = (q2) dVar.getF75269b().c(q2.INSTANCE);
            if (q2Var == null || (b5 = q2Var.getTransactionDispatcher()) == null) {
                b5 = z4 ? k.b(c2Var) : k.a(c2Var);
            }
            kotlin.coroutines.e eVar = b5;
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            qVar.e0();
            f4 = kotlinx.coroutines.k.f(kotlinx.coroutines.b2.f79269b, eVar, null, new d(callable, qVar, null), 2, null);
            qVar.k0(new c(cancellationSignal, f4));
            Object y4 = qVar.y();
            if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y4;
        }

        @fg.m
        @kd.n
        public final <R> Object c(@fg.l c2 c2Var, boolean z4, @fg.l Callable<R> callable, @fg.l kotlin.coroutines.d<? super R> dVar) {
            kotlin.coroutines.e b5;
            if (c2Var.isOpenInternal() && c2Var.inTransaction()) {
                return callable.call();
            }
            q2 q2Var = (q2) dVar.getF75269b().c(q2.INSTANCE);
            if (q2Var == null || (b5 = q2Var.getTransactionDispatcher()) == null) {
                b5 = z4 ? k.b(c2Var) : k.a(c2Var);
            }
            return kotlinx.coroutines.i.h(b5, new b(callable, null), dVar);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private j() {
    }

    @fg.l
    @kd.n
    public static final <R> kotlinx.coroutines.flow.i<R> a(@fg.l c2 c2Var, boolean z4, @fg.l String[] strArr, @fg.l Callable<R> callable) {
        return INSTANCE.a(c2Var, z4, strArr, callable);
    }

    @fg.m
    @kd.n
    public static final <R> Object b(@fg.l c2 c2Var, boolean z4, @fg.m CancellationSignal cancellationSignal, @fg.l Callable<R> callable, @fg.l kotlin.coroutines.d<? super R> dVar) {
        return INSTANCE.b(c2Var, z4, cancellationSignal, callable, dVar);
    }

    @fg.m
    @kd.n
    public static final <R> Object c(@fg.l c2 c2Var, boolean z4, @fg.l Callable<R> callable, @fg.l kotlin.coroutines.d<? super R> dVar) {
        return INSTANCE.c(c2Var, z4, callable, dVar);
    }
}
