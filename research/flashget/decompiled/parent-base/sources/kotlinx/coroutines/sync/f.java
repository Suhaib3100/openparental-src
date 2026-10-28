package kotlinx.coroutines.sync;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.internal.s0;
import kotlinx.coroutines.internal.x0;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Semaphore.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015\"\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015\"\u0014\u0010\u001c\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015\"\u0014\u0010\u001e\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"", "permits", "acquiredPermits", "Lkotlinx/coroutines/sync/d;", "a", "(II)Lkotlinx/coroutines/sync/d;", "T", "Lkotlin/Function0;", "action", "k", "(Lkotlinx/coroutines/sync/d;Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "id", "Lkotlinx/coroutines/sync/g;", "prev", "j", "(JLkotlinx/coroutines/sync/g;)Lkotlinx/coroutines/sync/g;", "I", "MAX_SPIN_CYCLES", "Lkotlinx/coroutines/internal/s0;", "b", "Lkotlinx/coroutines/internal/s0;", "PERMIT", "c", "TAKEN", "d", "BROKEN", "e", "CANCELLED", "f", "SEGMENT_SIZE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final int f81136a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final s0 f81137b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final s0 f81138c;

    /* renamed from: d, reason: collision with root package name */
    @l
    private static final s0 f81139d;

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final s0 f81140e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f81141f;

    /* compiled from: Semaphore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {86}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt$withPermit$1\n*L\n1#1,397:1\n*E\n"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f81142b;

        /* renamed from: c, reason: collision with root package name */
        Object f81143c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f81144d;

        /* renamed from: e, reason: collision with root package name */
        int f81145e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f81144d = obj;
            this.f81145e |= Integer.MIN_VALUE;
            return f.k(null, null, this);
        }
    }

    static {
        int e4;
        int e5;
        e4 = x0.e(ProtectedSandApp.s("裱\u0001"), 100, 0, 0, 12, null);
        f81136a = e4;
        f81137b = new s0(ProtectedSandApp.s("裲\u0001"));
        f81138c = new s0(ProtectedSandApp.s("裳\u0001"));
        f81139d = new s0(ProtectedSandApp.s("裴\u0001"));
        f81140e = new s0(ProtectedSandApp.s("裵\u0001"));
        e5 = x0.e(ProtectedSandApp.s("裶\u0001"), 16, 0, 0, 12, null);
        f81141f = e5;
    }

    @l
    public static final d a(int i4, int i5) {
        return new e(i4, i5);
    }

    public static d b(int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return new e(i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g j(long j4, g gVar) {
        return new g(j4, gVar, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object k(@fg.l kotlinx.coroutines.sync.d r4, @fg.l ld.a<? extends T> r5, @fg.l kotlin.coroutines.d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.sync.f.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.sync.f$a r0 = (kotlinx.coroutines.sync.f.a) r0
            int r1 = r0.f81145e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81145e = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.f$a r0 = new kotlinx.coroutines.sync.f$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f81144d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f81145e
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f81143c
            r5 = r4
            ld.a r5 = (ld.a) r5
            java.lang.Object r4 = r0.f81142b
            kotlinx.coroutines.sync.d r4 = (kotlinx.coroutines.sync.d) r4
            kotlin.a1.n(r6)
            goto L4c
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "裷\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.a1.n(r6)
            r0.f81142b = r4
            r0.f81143c = r5
            r0.f81145e = r3
            java.lang.Object r6 = r4.e(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> L54
            r4.release()
            return r5
        L54:
            r5 = move-exception
            r4.release()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.f.k(kotlinx.coroutines.sync.d, ld.a, kotlin.coroutines.d):java.lang.Object");
    }

    private static final <T> Object l(d dVar, ld.a<? extends T> aVar, kotlin.coroutines.d<? super T> dVar2) {
        dVar.e(dVar2);
        try {
            return aVar.invoke();
        } finally {
            dVar.release();
        }
    }
}
