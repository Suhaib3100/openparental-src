package androidx.compose.ui.platform;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* compiled from: GlobalSnapshotManager.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/s1;", "", "<init>", "()V", "Lkotlin/k2;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "started", "c", "sent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final s1 f20124a = new s1();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final AtomicBoolean started = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final AtomicBoolean sent = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final int f20127d = 8;

    /* compiled from: GlobalSnapshotManager.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", i = {0}, l = {67}, m = "invokeSuspend", n = {"$this$consume$iv$iv"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nGlobalSnapshotManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,59:1\n105#2:60\n82#2,6:61\n106#2,2:67\n92#2:69\n88#2,3:70\n*S KotlinDebug\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n*L\n46#1:60\n46#1:61,6\n46#1:67,2\n46#1:69\n46#1:70,3\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f20128b;

        /* renamed from: c, reason: collision with root package name */
        Object f20129c;

        /* renamed from: d, reason: collision with root package name */
        int f20130d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.l<kotlin.k2> f20131e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlinx.coroutines.channels.l<kotlin.k2> lVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f20131e = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f20131e, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:6:0x0011, B:7:0x0036, B:9:0x003e, B:10:0x0029, B:14:0x0052, B:21:0x0024), top: B:2:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:6:0x0011, B:7:0x0036, B:9:0x003e, B:10:0x0029, B:14:0x0052, B:21:0x0024), top: B:2:0x0005 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0033 -> B:7:0x0036). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r5.f20130d
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r5.f20129c
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r3 = r5.f20128b
                kotlinx.coroutines.channels.d0 r3 = (kotlinx.coroutines.channels.d0) r3
                kotlin.a1.n(r6)     // Catch: java.lang.Throwable -> L15
                goto L36
            L15:
                r6 = move-exception
                goto L59
            L17:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1f:
                kotlin.a1.n(r6)
                kotlinx.coroutines.channels.l<kotlin.k2> r3 = r5.f20131e
                kotlinx.coroutines.channels.n r6 = r3.iterator()     // Catch: java.lang.Throwable -> L15
                r1 = r6
            L29:
                r5.f20128b = r3     // Catch: java.lang.Throwable -> L15
                r5.f20129c = r1     // Catch: java.lang.Throwable -> L15
                r5.f20130d = r2     // Catch: java.lang.Throwable -> L15
                java.lang.Object r6 = r1.c(r5)     // Catch: java.lang.Throwable -> L15
                if (r6 != r0) goto L36
                return r0
            L36:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L15
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L15
                if (r6 == 0) goto L52
                java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L15
                kotlin.k2 r6 = (kotlin.k2) r6     // Catch: java.lang.Throwable -> L15
                java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.s1.a()     // Catch: java.lang.Throwable -> L15
                r4 = 0
                r6.set(r4)     // Catch: java.lang.Throwable -> L15
                androidx.compose.runtime.snapshots.m$a r6 = androidx.compose.runtime.snapshots.m.INSTANCE     // Catch: java.lang.Throwable -> L15
                r6.q()     // Catch: java.lang.Throwable -> L15
                goto L29
            L52:
                kotlin.k2 r6 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L15
                r0 = 0
                kotlinx.coroutines.channels.r.b(r3, r0)
                return r6
            L59:
                throw r6     // Catch: java.lang.Throwable -> L5a
            L5a:
                r0 = move-exception
                kotlinx.coroutines.channels.r.b(r3, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.s1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: GlobalSnapshotManager.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Object, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.l<kotlin.k2> f20132b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlinx.coroutines.channels.l<kotlin.k2> lVar) {
            super(1);
            this.f20132b = lVar;
        }

        public final void a(@fg.l Object obj) {
            if (s1.sent.compareAndSet(false, true)) {
                this.f20132b.M(kotlin.k2.f75408a);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Object obj) {
            a(obj);
            return kotlin.k2.f75408a;
        }
    }

    private s1() {
    }

    public final void b() {
        if (started.compareAndSet(false, true)) {
            kotlinx.coroutines.channels.l d5 = kotlinx.coroutines.channels.o.d(1, null, null, 6, null);
            kotlinx.coroutines.k.f(kotlinx.coroutines.s0.a(u0.INSTANCE.b()), null, null, new a(d5, null), 3, null);
            androidx.compose.runtime.snapshots.m.INSTANCE.m(new b(d5));
        }
    }
}
