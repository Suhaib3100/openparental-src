package kotlinx.coroutines.sync;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.internal.r0;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Mutex.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001aD\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\u000f\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u0012\u0004\b\r\u0010\u000e\"\u001a\u0010\u0012\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u0012\u0004\b\u0011\u0010\u000e\"\u001a\u0010\u0015\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u0012\u0004\b\u0014\u0010\u000e\"\u001a\u0010\u0018\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0016\u0010\f\u0012\u0004\b\u0017\u0010\u000e\"\u001a\u0010\u001d\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u000e\"\u001a\u0010 \u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u0012\u0004\b\u001f\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"", "locked", "Lkotlinx/coroutines/sync/c;", "a", "T", "", "owner", "Lkotlin/Function0;", "action", "o", "(Lkotlinx/coroutines/sync/c;Ljava/lang/Object;Lq3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/r0;", "Lkotlinx/coroutines/internal/r0;", "getLOCK_FAIL$annotations", "()V", "LOCK_FAIL", "b", "getUNLOCK_FAIL$annotations", "UNLOCK_FAIL", "c", "getLOCKED$annotations", "LOCKED", "d", "getUNLOCKED$annotations", "UNLOCKED", "Lkotlinx/coroutines/sync/b;", "e", "Lkotlinx/coroutines/sync/b;", "getEMPTY_LOCKED$annotations", "EMPTY_LOCKED", "f", "getEMPTY_UNLOCKED$annotations", "EMPTY_UNLOCKED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final r0 f28967a = new r0(ProtectedSandApp.s("幬"));

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final r0 f28968b = new r0(ProtectedSandApp.s("幭"));

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final r0 f28969c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final r0 f28970d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final b f28971e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final b f28972f;

    /* compiled from: Mutex.kt */
    @DebugMetadata(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {112}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
    /* loaded from: classes6.dex */
    static final class a<T> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28973r;

        /* renamed from: s, reason: collision with root package name */
        Object f28974s;

        /* renamed from: t, reason: collision with root package name */
        Object f28975t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f28976u;

        /* renamed from: v, reason: collision with root package name */
        int f28977v;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28976u = obj;
            this.f28977v |= Integer.MIN_VALUE;
            return e.o(null, null, null, this);
        }
    }

    static {
        r0 r0Var = new r0(ProtectedSandApp.s("幮"));
        f28969c = r0Var;
        r0 r0Var2 = new r0(ProtectedSandApp.s("幯"));
        f28970d = r0Var2;
        f28971e = new b(r0Var);
        f28972f = new b(r0Var2);
    }

    @d5.d
    public static final c a(boolean z5) {
        return new d(z5);
    }

    public static c b(boolean z5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z5 = false;
        }
        return new d(z5);
    }

    private static /* synthetic */ void i() {
    }

    private static /* synthetic */ void j() {
    }

    private static /* synthetic */ void k() {
    }

    private static /* synthetic */ void l() {
    }

    private static /* synthetic */ void m() {
    }

    private static /* synthetic */ void n() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object o(@d5.d kotlinx.coroutines.sync.c r4, @d5.e java.lang.Object r5, @d5.d q3.a<? extends T> r6, @d5.d kotlin.coroutines.Continuation<? super T> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.sync.e.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.sync.e$a r0 = (kotlinx.coroutines.sync.e.a) r0
            int r1 = r0.f28977v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28977v = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.e$a r0 = new kotlinx.coroutines.sync.e$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f28976u
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28977v
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.f28975t
            r6 = r4
            q3.a r6 = (q3.a) r6
            java.lang.Object r5 = r0.f28974s
            java.lang.Object r4 = r0.f28973r
            kotlinx.coroutines.sync.c r4 = (kotlinx.coroutines.sync.c) r4
            kotlin.a1.n(r7)
            goto L50
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "幰"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L3e:
            kotlin.a1.n(r7)
            r0.f28973r = r4
            r0.f28974s = r5
            r0.f28975t = r6
            r0.f28977v = r3
            java.lang.Object r7 = r4.c(r5, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            java.lang.Object r6 = r6.n()     // Catch: java.lang.Throwable -> L58
            r4.d(r5)
            return r6
        L58:
            r6 = move-exception
            r4.d(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.e.o(kotlinx.coroutines.sync.c, java.lang.Object, q3.a, kotlin.coroutines.d):java.lang.Object");
    }

    private static final <T> Object p(c cVar, Object obj, q3.a<? extends T> aVar, Continuation<? super T> continuation) {
        cVar.c(obj, continuation);
        try {
            return aVar.n();
        } finally {
            cVar.d(obj);
        }
    }

    public static Object q(c cVar, Object obj, q3.a aVar, Continuation continuation, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            obj = null;
        }
        cVar.c(obj, continuation);
        try {
            return aVar.n();
        } finally {
            cVar.d(obj);
        }
    }
}
