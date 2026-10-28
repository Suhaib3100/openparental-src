package kotlinx.coroutines.channels;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.m2;
import kotlinx.coroutines.channels.g0;
import kotlinx.coroutines.d3;
import kotlinx.coroutines.y1;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Channels.common.kt */
@Metadata(d1 = {"\u0000H\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aE\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0005H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a$\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007\u001aR\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0005H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0012\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0003H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000b\u001a7\u0010\u0016\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0003H\u0087Hø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001a\u0010\u001a\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0001\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"E", "R", "Lkotlinx/coroutines/channels/i;", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/g0;", "Lkotlin/u;", "block", "b", "(Lkotlinx/coroutines/channels/i;Lq3/l;)Ljava/lang/Object;", "", "i", "(Lkotlinx/coroutines/channels/g0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/d;", "h", "c", "(Lkotlinx/coroutines/channels/g0;Lq3/l;)Ljava/lang/Object;", "Lkotlin/m2;", "action", "e", "(Lkotlinx/coroutines/channels/g0;Lq3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "j", "d", "(Lkotlinx/coroutines/channels/i;Lq3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "cause", "a", "", "DEFAULT_CLOSE_MESSAGE", "Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes5.dex */
final /* synthetic */ class u {

    /* compiled from: Channels.common.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {104}, m = "consumeEach", n = {"action", "$this$consume$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
    /* loaded from: classes6.dex */
    static final class a<E> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27399r;

        /* renamed from: s, reason: collision with root package name */
        Object f27400s;

        /* renamed from: t, reason: collision with root package name */
        Object f27401t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f27402u;

        /* renamed from: v, reason: collision with root package name */
        int f27403v;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27402u = obj;
            this.f27403v |= Integer.MIN_VALUE;
            return u.e(null, null, this);
        }
    }

    /* compiled from: Channels.common.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {129}, m = "consumeEach", n = {"action", "channel$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
    /* loaded from: classes6.dex */
    static final class b<E> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27404r;

        /* renamed from: s, reason: collision with root package name */
        Object f27405s;

        /* renamed from: t, reason: collision with root package name */
        Object f27406t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f27407u;

        /* renamed from: v, reason: collision with root package name */
        int f27408v;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27407u = obj;
            this.f27408v |= Integer.MIN_VALUE;
            return u.d(null, null, this);
        }
    }

    /* compiled from: Channels.common.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {148}, m = "toList", n = {"$this$toList_u24lambda_u2d3", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class c<E> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27409r;

        /* renamed from: s, reason: collision with root package name */
        Object f27410s;

        /* renamed from: t, reason: collision with root package name */
        Object f27411t;

        /* renamed from: u, reason: collision with root package name */
        Object f27412u;

        /* renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f27413v;

        /* renamed from: w, reason: collision with root package name */
        int f27414w;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27413v = obj;
            this.f27414w |= Integer.MIN_VALUE;
            return u.j(null, this);
        }
    }

    @PublishedApi
    public static final void a(@d5.d g0<?> g0Var, @d5.e Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = y1.a(ProtectedSandApp.s("峙"), th);
            }
        }
        g0Var.e(r0);
    }

    @d3
    public static final <E, R> R b(@d5.d i<E> iVar, @d5.d q3.l<? super g0<? extends E>, ? extends R> lVar) {
        g0<E> S = iVar.S();
        try {
            return lVar.N(S);
        } finally {
            g0.a.b(S, null, 1, null);
        }
    }

    public static final <E, R> R c(@d5.d g0<? extends E> g0Var, @d5.d q3.l<? super g0<? extends E>, ? extends R> lVar) {
        try {
            R N = lVar.N(g0Var);
            a(g0Var, null);
            return N;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a(g0Var, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:15:0x0068, B:17:0x0070, B:29:0x007b), top: B:14:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:15:0x0068, B:17:0x0070, B:29:0x007b), top: B:14:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0064 -> B:13:0x0036). Please report as a decompilation issue!!! */
    @kotlinx.coroutines.d3
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object d(@d5.d kotlinx.coroutines.channels.i<E> r6, @d5.d q3.l<? super E, kotlin.m2> r7, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.u.b
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.u$b r0 = (kotlinx.coroutines.channels.u.b) r0
            int r1 = r0.f27408v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27408v = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$b r0 = new kotlinx.coroutines.channels.u$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27407u
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27408v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 != r4) goto L3b
            java.lang.Object r6 = r0.f27406t
            kotlinx.coroutines.channels.p r6 = (kotlinx.coroutines.channels.p) r6
            java.lang.Object r7 = r0.f27405s
            kotlinx.coroutines.channels.g0 r7 = (kotlinx.coroutines.channels.g0) r7
            java.lang.Object r2 = r0.f27404r
            q3.l r2 = (q3.l) r2
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L39
            r5 = r0
            r0 = r7
            r7 = r2
        L36:
            r2 = r1
            r1 = r5
            goto L68
        L39:
            r6 = move-exception
            goto L8b
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "峚"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L47:
            kotlin.a1.n(r8)
            kotlinx.coroutines.channels.g0 r6 = r6.S()
            kotlinx.coroutines.channels.p r8 = r6.iterator()     // Catch: java.lang.Throwable -> L87
            r5 = r8
            r8 = r6
            r6 = r5
        L55:
            r0.f27404r = r7     // Catch: java.lang.Throwable -> L84
            r0.f27405s = r8     // Catch: java.lang.Throwable -> L84
            r0.f27406t = r6     // Catch: java.lang.Throwable -> L84
            r0.f27408v = r4     // Catch: java.lang.Throwable -> L84
            java.lang.Object r2 = r6.a(r0)     // Catch: java.lang.Throwable -> L84
            if (r2 != r1) goto L64
            return r1
        L64:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L36
        L68:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L81
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L81
            if (r8 == 0) goto L7b
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L81
            r7.N(r8)     // Catch: java.lang.Throwable -> L81
            r8 = r0
            r0 = r1
            r1 = r2
            goto L55
        L7b:
            kotlin.m2 r6 = kotlin.m2.f23662a     // Catch: java.lang.Throwable -> L81
            kotlinx.coroutines.channels.g0.a.b(r0, r3, r4, r3)
            return r6
        L81:
            r6 = move-exception
            r7 = r0
            goto L8b
        L84:
            r6 = move-exception
            r7 = r8
            goto L8b
        L87:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L8b:
            kotlinx.coroutines.channels.g0.a.b(r7, r3, r4, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.d(kotlinx.coroutines.channels.i, q3.l, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005e, B:14:0x0066, B:15:0x004c, B:20:0x006f), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005e, B:14:0x0066, B:15:0x004c, B:20:0x006f), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:12:0x005e). Please report as a decompilation issue!!! */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object e(@d5.d kotlinx.coroutines.channels.g0<? extends E> r5, @d5.d q3.l<? super E, kotlin.m2> r6, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.u.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.u$a r0 = (kotlinx.coroutines.channels.u.a) r0
            int r1 = r0.f27403v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27403v = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$a r0 = new kotlinx.coroutines.channels.u$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27402u
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27403v
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.f27401t
            kotlinx.coroutines.channels.p r5 = (kotlinx.coroutines.channels.p) r5
            java.lang.Object r6 = r0.f27400s
            kotlinx.coroutines.channels.g0 r6 = (kotlinx.coroutines.channels.g0) r6
            java.lang.Object r2 = r0.f27399r
            q3.l r2 = (q3.l) r2
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L33
            goto L5e
        L33:
            r5 = move-exception
            goto L7a
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "峛"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r5.<init>(r6)
            throw r5
        L41:
            kotlin.a1.n(r7)
            kotlinx.coroutines.channels.p r7 = r5.iterator()     // Catch: java.lang.Throwable -> L76
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4c:
            r0.f27399r = r7     // Catch: java.lang.Throwable -> L33
            r0.f27400s = r6     // Catch: java.lang.Throwable -> L33
            r0.f27401t = r5     // Catch: java.lang.Throwable -> L33
            r0.f27403v = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r5.a(r0)     // Catch: java.lang.Throwable -> L33
            if (r2 != r1) goto L5b
            return r1
        L5b:
            r4 = r2
            r2 = r7
            r7 = r4
        L5e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L33
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L6f
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L33
            r2.N(r7)     // Catch: java.lang.Throwable -> L33
            r7 = r2
            goto L4c
        L6f:
            kotlin.m2 r5 = kotlin.m2.f23662a     // Catch: java.lang.Throwable -> L33
            r7 = 0
            a(r6, r7)
            return r5
        L76:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L7a:
            throw r5     // Catch: java.lang.Throwable -> L7b
        L7b:
            r7 = move-exception
            a(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.e(kotlinx.coroutines.channels.g0, q3.l, kotlin.coroutines.d):java.lang.Object");
    }

    @d3
    private static final <E> Object f(i<E> iVar, q3.l<? super E, m2> lVar, Continuation<? super m2> continuation) {
        g0<E> S = iVar.S();
        try {
            p<E> it = S.iterator();
            while (((Boolean) it.a(null)).booleanValue()) {
                lVar.N(it.next());
            }
            return m2.f23662a;
        } finally {
            g0.a.b(S, null, 1, null);
        }
    }

    private static final <E> Object g(g0<? extends E> g0Var, q3.l<? super E, m2> lVar, Continuation<? super m2> continuation) {
        try {
            p<? extends E> it = g0Var.iterator();
            while (((Boolean) it.a(null)).booleanValue()) {
                lVar.N(it.next());
            }
            m2 m2Var = m2.f23662a;
            a(g0Var, null);
            return m2Var;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a(g0Var, th);
                throw th2;
            }
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    @d5.d
    public static final <E> kotlinx.coroutines.selects.d<E> h(@d5.d g0<? extends E> g0Var) {
        return g0Var.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @d5.e
    public static final <E> Object i(@d5.d g0<? extends E> g0Var, @d5.d Continuation<? super E> continuation) {
        return g0Var.C(continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x006a, B:14:0x0072, B:29:0x007b), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x006a, B:14:0x0072, B:29:0x007b), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0067 -> B:12:0x006a). Please report as a decompilation issue!!! */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object j(@d5.d kotlinx.coroutines.channels.g0<? extends E> r7, @d5.d kotlin.coroutines.Continuation<? super java.util.List<? extends E>> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.u.c
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.u$c r0 = (kotlinx.coroutines.channels.u.c) r0
            int r1 = r0.f27414w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27414w = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$c r0 = new kotlinx.coroutines.channels.u$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27413v
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27414w
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.f27412u
            kotlinx.coroutines.channels.p r7 = (kotlinx.coroutines.channels.p) r7
            java.lang.Object r2 = r0.f27411t
            kotlinx.coroutines.channels.g0 r2 = (kotlinx.coroutines.channels.g0) r2
            java.lang.Object r4 = r0.f27410s
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.f27409r
            java.util.List r5 = (java.util.List) r5
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L37
            goto L6a
        L37:
            r7 = move-exception
            r8 = r2
            goto L8c
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "峜"
            java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
            r7.<init>(r8)
            throw r7
        L46:
            kotlin.a1.n(r8)
            kotlin.collections.builders.b r8 = new kotlin.collections.builders.b
            r8.<init>()
            kotlinx.coroutines.channels.p r2 = r7.iterator()     // Catch: java.lang.Throwable -> L88
            r4 = r8
            r5 = r4
            r8 = r7
            r7 = r2
        L56:
            r0.f27409r = r5     // Catch: java.lang.Throwable -> L86
            r0.f27410s = r4     // Catch: java.lang.Throwable -> L86
            r0.f27411t = r8     // Catch: java.lang.Throwable -> L86
            r0.f27412u = r7     // Catch: java.lang.Throwable -> L86
            r0.f27414w = r3     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = r7.a(r0)     // Catch: java.lang.Throwable -> L86
            if (r2 != r1) goto L67
            return r1
        L67:
            r6 = r2
            r2 = r8
            r8 = r6
        L6a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L37
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r8 == 0) goto L7b
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L37
            r4.add(r8)     // Catch: java.lang.Throwable -> L37
            r8 = r2
            goto L56
        L7b:
            kotlin.m2 r7 = kotlin.m2.f23662a     // Catch: java.lang.Throwable -> L37
            r7 = 0
            a(r2, r7)
            java.util.List r7 = kotlin.collections.y.a(r5)
            return r7
        L86:
            r7 = move-exception
            goto L8c
        L88:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L8c:
            throw r7     // Catch: java.lang.Throwable -> L8d
        L8d:
            r0 = move-exception
            a(r8, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.j(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }
}
