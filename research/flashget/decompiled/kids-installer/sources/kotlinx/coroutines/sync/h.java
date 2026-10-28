package kotlinx.coroutines.sync;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.internal.r0;
import kotlinx.coroutines.internal.v0;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Semaphore.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000\u001a8\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0005*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002\"\u001a\u0010\u0012\u001a\u00020\u00008\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0017\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0011\"\u001a\u0010\u001a\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u0012\u0004\b\u0019\u0010\u0011\"\u001a\u0010\u001d\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u0012\u0004\b\u001c\u0010\u0011\"\u001a\u0010 \u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u0012\u0004\b\u001f\u0010\u0011\"\u001a\u0010#\u001a\u00020\u00008\u0002X\u0083\u0004¢\u0006\f\n\u0004\b!\u0010\u000f\u0012\u0004\b\"\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"", "permits", "acquiredPermits", "Lkotlinx/coroutines/sync/f;", "a", "T", "Lkotlin/Function0;", "action", "q", "(Lkotlinx/coroutines/sync/f;Lq3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "id", "Lkotlinx/coroutines/sync/i;", "prev", "j", "I", "getMAX_SPIN_CYCLES$annotations", "()V", "MAX_SPIN_CYCLES", "Lkotlinx/coroutines/internal/r0;", "b", "Lkotlinx/coroutines/internal/r0;", "getPERMIT$annotations", "PERMIT", "c", "getTAKEN$annotations", "TAKEN", "d", "getBROKEN$annotations", "BROKEN", "e", "getCANCELLED$annotations", "CANCELLED", "f", "getSEGMENT_SIZE$annotations", "SEGMENT_SIZE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final int f28986a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final r0 f28987b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final r0 f28988c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final r0 f28989d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final r0 f28990e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f28991f;

    /* compiled from: Semaphore.kt */
    @DebugMetadata(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {85}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
    /* loaded from: classes6.dex */
    static final class a<T> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28992r;

        /* renamed from: s, reason: collision with root package name */
        Object f28993s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f28994t;

        /* renamed from: u, reason: collision with root package name */
        int f28995u;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28994t = obj;
            this.f28995u |= Integer.MIN_VALUE;
            return h.q(null, null, this);
        }
    }

    static {
        int d6;
        int d7;
        d6 = v0.d(ProtectedSandApp.s("幹"), 100, 0, 0, 12, null);
        f28986a = d6;
        f28987b = new r0(ProtectedSandApp.s("幺"));
        f28988c = new r0(ProtectedSandApp.s("幻"));
        f28989d = new r0(ProtectedSandApp.s("幼"));
        f28990e = new r0(ProtectedSandApp.s("幽"));
        d7 = v0.d(ProtectedSandApp.s("幾"), 16, 0, 0, 12, null);
        f28991f = d7;
    }

    @d5.d
    public static final f a(int i5, int i6) {
        return new g(i5, i6);
    }

    public static f b(int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        return new g(i5, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i j(long j5, i iVar) {
        return new i(j5, iVar, 0);
    }

    private static /* synthetic */ void k() {
    }

    private static /* synthetic */ void l() {
    }

    private static /* synthetic */ void m() {
    }

    private static /* synthetic */ void n() {
    }

    private static /* synthetic */ void o() {
    }

    private static /* synthetic */ void p() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object q(@d5.d kotlinx.coroutines.sync.f r4, @d5.d q3.a<? extends T> r5, @d5.d kotlin.coroutines.Continuation<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.sync.h.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.sync.h$a r0 = (kotlinx.coroutines.sync.h.a) r0
            int r1 = r0.f28995u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28995u = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.h$a r0 = new kotlinx.coroutines.sync.h$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f28994t
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28995u
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f28993s
            r5 = r4
            q3.a r5 = (q3.a) r5
            java.lang.Object r4 = r0.f28992r
            kotlinx.coroutines.sync.f r4 = (kotlinx.coroutines.sync.f) r4
            kotlin.a1.n(r6)
            goto L4c
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "广"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.a1.n(r6)
            r0.f28992r = r4
            r0.f28993s = r5
            r0.f28995u = r3
            java.lang.Object r6 = r4.b(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            java.lang.Object r5 = r5.n()     // Catch: java.lang.Throwable -> L54
            r4.release()
            return r5
        L54:
            r5 = move-exception
            r4.release()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.h.q(kotlinx.coroutines.sync.f, q3.a, kotlin.coroutines.d):java.lang.Object");
    }

    private static final <T> Object r(f fVar, q3.a<? extends T> aVar, Continuation<? super T> continuation) {
        fVar.b(continuation);
        try {
            return aVar.n();
        } finally {
            fVar.release();
        }
    }
}
