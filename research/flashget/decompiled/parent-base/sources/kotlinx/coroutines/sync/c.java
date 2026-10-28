package kotlinx.coroutines.sync;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.internal.s0;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Mutex.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aD\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0005*\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r\"\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0013\"\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013\"\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013\"\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"", "locked", "Lkotlinx/coroutines/sync/a;", "a", "(Z)Lkotlinx/coroutines/sync/a;", "T", "", "owner", "Lkotlin/Function0;", "action", "e", "(Lkotlinx/coroutines/sync/a;Ljava/lang/Object;Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/s0;", "Lkotlinx/coroutines/internal/s0;", "NO_OWNER", "b", "ON_LOCK_ALREADY_LOCKED_BY_OWNER", "", "c", "I", "TRY_LOCK_SUCCESS", "d", "TRY_LOCK_FAILED", "TRY_LOCK_ALREADY_LOCKED_BY_OWNER", "f", "HOLDS_LOCK_UNLOCKED", "g", "HOLDS_LOCK_YES", "h", "HOLDS_LOCK_ANOTHER_OWNER", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final s0 f81113a = new s0(ProtectedSandApp.s("裪\u0001"));

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final s0 f81114b = new s0(ProtectedSandApp.s("裫\u0001"));

    /* renamed from: c, reason: collision with root package name */
    private static final int f81115c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f81116d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f81117e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f81118f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f81119g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f81120h = 2;

    /* compiled from: Mutex.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {125}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexKt$withLock$1\n*L\n1#1,310:1\n*E\n"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f81121b;

        /* renamed from: c, reason: collision with root package name */
        Object f81122c;

        /* renamed from: d, reason: collision with root package name */
        Object f81123d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f81124e;

        /* renamed from: f, reason: collision with root package name */
        int f81125f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f81124e = obj;
            this.f81125f |= Integer.MIN_VALUE;
            return c.e(null, null, null, this);
        }
    }

    @l
    public static final kotlinx.coroutines.sync.a a(boolean z4) {
        return new b(z4);
    }

    public static kotlinx.coroutines.sync.a b(boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return new b(z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(@fg.l kotlinx.coroutines.sync.a r4, @fg.m java.lang.Object r5, @fg.l ld.a<? extends T> r6, @fg.l kotlin.coroutines.d<? super T> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.sync.c.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.sync.c$a r0 = (kotlinx.coroutines.sync.c.a) r0
            int r1 = r0.f81125f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81125f = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.c$a r0 = new kotlinx.coroutines.sync.c$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f81124e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f81125f
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.f81123d
            r6 = r4
            ld.a r6 = (ld.a) r6
            java.lang.Object r5 = r0.f81122c
            java.lang.Object r4 = r0.f81121b
            kotlinx.coroutines.sync.a r4 = (kotlinx.coroutines.sync.a) r4
            kotlin.a1.n(r7)
            goto L50
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "裬\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L3e:
            kotlin.a1.n(r7)
            r0.f81121b = r4
            r0.f81122c = r5
            r0.f81123d = r6
            r0.f81125f = r3
            java.lang.Object r7 = r4.f(r5, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            java.lang.Object r6 = r6.invoke()     // Catch: java.lang.Throwable -> L58
            r4.g(r5)
            return r6
        L58:
            r6 = move-exception
            r4.g(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.c.e(kotlinx.coroutines.sync.a, java.lang.Object, ld.a, kotlin.coroutines.d):java.lang.Object");
    }

    private static final <T> Object f(kotlinx.coroutines.sync.a aVar, Object obj, ld.a<? extends T> aVar2, kotlin.coroutines.d<? super T> dVar) {
        aVar.f(obj, dVar);
        try {
            return aVar2.invoke();
        } finally {
            aVar.g(obj);
        }
    }

    public static Object g(kotlinx.coroutines.sync.a aVar, Object obj, ld.a aVar2, kotlin.coroutines.d dVar, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            obj = null;
        }
        aVar.f(obj, dVar);
        try {
            return aVar2.invoke();
        } finally {
            aVar.g(obj);
        }
    }
}
