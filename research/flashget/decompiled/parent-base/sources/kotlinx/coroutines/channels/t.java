package kotlinx.coroutines.channels;

import com.android.internal.telephony.cdma.UserData;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.w0;
import kotlin.x0;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.channels.d0;
import kotlinx.coroutines.v1;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Channels.common.kt */
@Metadata(d1 = {"\u0000H\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aE\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0005H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aR\u0010\u000f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0005H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a7\u0010\u0013\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\u0003H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000b\u001a7\u0010\u0017\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\u0003H\u0087Hø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u001b\u001a\u00020\u0011*\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u001d8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"E", "R", "Lkotlinx/coroutines/channels/d;", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/d0;", "Lkotlin/u;", "block", "b", "(Lkotlinx/coroutines/channels/d;Lld/l;)Ljava/lang/Object;", "", "i", "(Lkotlinx/coroutines/channels/d0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/g;", "h", "(Lkotlinx/coroutines/channels/d0;)Lkotlinx/coroutines/selects/g;", "c", "(Lkotlinx/coroutines/channels/d0;Lld/l;)Ljava/lang/Object;", "Lkotlin/k2;", "action", "e", "(Lkotlinx/coroutines/channels/d0;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "j", "d", "(Lkotlinx/coroutines/channels/d;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "cause", "a", "(Lkotlinx/coroutines/channels/d0;Ljava/lang/Throwable;)V", "", "DEFAULT_CLOSE_MESSAGE", "Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
@r1({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,141:1\n82#1,11:142\n105#1:153\n82#1,6:154\n106#1,2:160\n92#1:162\n88#1,3:163\n33#1,5:166\n*S KotlinDebug\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n105#1:142,11\n116#1:153\n116#1:154,6\n116#1:160,2\n116#1:162\n116#1:163,3\n129#1:166,5\n*E\n"})
/* loaded from: classes7.dex */
final /* synthetic */ class t {

    /* compiled from: Channels.common.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {106}, m = "consumeEach", n = {"action", "$this$consume$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$consumeEach$1\n*L\n1#1,141:1\n*E\n"})
    static final class a<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79424b;

        /* renamed from: c, reason: collision with root package name */
        Object f79425c;

        /* renamed from: d, reason: collision with root package name */
        Object f79426d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f79427e;

        /* renamed from: f, reason: collision with root package name */
        int f79428f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79427e = obj;
            this.f79428f |= Integer.MIN_VALUE;
            return t.e(null, null, this);
        }
    }

    /* compiled from: Channels.common.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS}, m = "consumeEach", n = {"action", "channel$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$consumeEach$3\n*L\n1#1,141:1\n*E\n"})
    static final class b<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79429b;

        /* renamed from: c, reason: collision with root package name */
        Object f79430c;

        /* renamed from: d, reason: collision with root package name */
        Object f79431d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f79432e;

        /* renamed from: f, reason: collision with root package name */
        int f79433f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79432e = obj;
            this.f79433f |= Integer.MIN_VALUE;
            return t.d(null, null, this);
        }
    }

    /* compiled from: Channels.common.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {149}, m = "toList", n = {"$this$toList_u24lambda_u243", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79434b;

        /* renamed from: c, reason: collision with root package name */
        Object f79435c;

        /* renamed from: d, reason: collision with root package name */
        Object f79436d;

        /* renamed from: e, reason: collision with root package name */
        Object f79437e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f79438f;

        /* renamed from: g, reason: collision with root package name */
        int f79439g;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79438f = obj;
            this.f79439g |= Integer.MIN_VALUE;
            return t.j(null, this);
        }
    }

    @w0
    public static final void a(@fg.l d0<?> d0Var, @fg.m Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = v1.a(ProtectedSandApp.s("虥\u0001"), th);
            }
        }
        d0Var.b(r0);
    }

    @a3
    @kotlin.k(level = kotlin.m.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E, R> R b(@fg.l d<E> dVar, @fg.l ld.l<? super d0<? extends E>, ? extends R> lVar) {
        d0<E> w4 = dVar.w();
        try {
            return lVar.invoke(w4);
        } finally {
            d0.a.b(w4, null, 1, null);
        }
    }

    public static final <E, R> R c(@fg.l d0<? extends E> d0Var, @fg.l ld.l<? super d0<? extends E>, ? extends R> lVar) {
        try {
            R invoke = lVar.invoke(d0Var);
            a(d0Var, null);
            return invoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a(d0Var, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[Catch: all -> 0x0079, TryCatch #3 {all -> 0x0079, blocks: (B:15:0x0067, B:17:0x006f, B:29:0x007c), top: B:14:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #3 {all -> 0x0079, blocks: (B:15:0x0067, B:17:0x006f, B:29:0x007c), top: B:14:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0063 -> B:13:0x0036). Please report as a decompilation issue!!! */
    @fg.m
    @kotlin.k(level = kotlin.m.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object d(@fg.l kotlinx.coroutines.channels.d<E> r6, @fg.l ld.l<? super E, kotlin.k2> r7, @fg.l kotlin.coroutines.d<? super kotlin.k2> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.t.b
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.t$b r0 = (kotlinx.coroutines.channels.t.b) r0
            int r1 = r0.f79433f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79433f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.t$b r0 = new kotlinx.coroutines.channels.t$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f79432e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79433f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 != r4) goto L3a
            java.lang.Object r6 = r0.f79431d
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r7 = r0.f79430c
            kotlinx.coroutines.channels.d0 r7 = (kotlinx.coroutines.channels.d0) r7
            java.lang.Object r2 = r0.f79429b
            ld.l r2 = (ld.l) r2
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L38
            r5 = r0
            r0 = r7
            r7 = r2
        L36:
            r2 = r5
            goto L67
        L38:
            r6 = move-exception
            goto L89
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "虦\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L46:
            kotlin.a1.n(r8)
            kotlinx.coroutines.channels.d0 r6 = r6.w()
            kotlinx.coroutines.channels.n r8 = r6.iterator()     // Catch: java.lang.Throwable -> L85
            r5 = r8
            r8 = r6
            r6 = r5
        L54:
            r0.f79429b = r7     // Catch: java.lang.Throwable -> L82
            r0.f79430c = r8     // Catch: java.lang.Throwable -> L82
            r0.f79431d = r6     // Catch: java.lang.Throwable -> L82
            r0.f79433f = r4     // Catch: java.lang.Throwable -> L82
            java.lang.Object r2 = r6.c(r0)     // Catch: java.lang.Throwable -> L82
            if (r2 != r1) goto L63
            return r1
        L63:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L36
        L67:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L79
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L79
            if (r8 == 0) goto L7c
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L79
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L79
            r8 = r0
            r0 = r2
            goto L54
        L79:
            r6 = move-exception
            r7 = r0
            goto L89
        L7c:
            kotlin.k2 r6 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L79
            kotlinx.coroutines.channels.d0.a.b(r0, r3, r4, r3)
            return r6
        L82:
            r6 = move-exception
            r7 = r8
            goto L89
        L85:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L89:
            kotlinx.coroutines.channels.d0.a.b(r7, r3, r4, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.t.d(kotlinx.coroutines.channels.d, ld.l, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005e, B:14:0x0066, B:15:0x004c, B:20:0x006f), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005e, B:14:0x0066, B:15:0x004c, B:20:0x006f), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:12:0x005e). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object e(@fg.l kotlinx.coroutines.channels.d0<? extends E> r5, @fg.l ld.l<? super E, kotlin.k2> r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.t.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.t$a r0 = (kotlinx.coroutines.channels.t.a) r0
            int r1 = r0.f79428f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79428f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.t$a r0 = new kotlinx.coroutines.channels.t$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f79427e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79428f
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.f79426d
            kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
            java.lang.Object r6 = r0.f79425c
            kotlinx.coroutines.channels.d0 r6 = (kotlinx.coroutines.channels.d0) r6
            java.lang.Object r2 = r0.f79424b
            ld.l r2 = (ld.l) r2
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L33
            goto L5e
        L33:
            r5 = move-exception
            goto L7a
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "虦\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            r5.<init>(r6)
            throw r5
        L41:
            kotlin.a1.n(r7)
            kotlinx.coroutines.channels.n r7 = r5.iterator()     // Catch: java.lang.Throwable -> L76
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4c:
            r0.f79424b = r7     // Catch: java.lang.Throwable -> L33
            r0.f79425c = r6     // Catch: java.lang.Throwable -> L33
            r0.f79426d = r5     // Catch: java.lang.Throwable -> L33
            r0.f79428f = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r5.c(r0)     // Catch: java.lang.Throwable -> L33
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
            r2.invoke(r7)     // Catch: java.lang.Throwable -> L33
            r7 = r2
            goto L4c
        L6f:
            kotlin.k2 r5 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L33
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
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.t.e(kotlinx.coroutines.channels.d0, ld.l, kotlin.coroutines.d):java.lang.Object");
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    private static final <E> Object f(d<E> dVar, ld.l<? super E, k2> lVar, kotlin.coroutines.d<? super k2> dVar2) {
        d0<E> w4 = dVar.w();
        try {
            n<E> it = w4.iterator();
            while (((Boolean) it.c(null)).booleanValue()) {
                lVar.invoke(it.next());
            }
            k2 k2Var = k2.f75408a;
            d0.a.b(w4, null, 1, null);
            return k2Var;
        } catch (Throwable th) {
            d0.a.b(w4, null, 1, null);
            throw th;
        }
    }

    private static final <E> Object g(d0<? extends E> d0Var, ld.l<? super E, k2> lVar, kotlin.coroutines.d<? super k2> dVar) {
        try {
            n<? extends E> it = d0Var.iterator();
            while (((Boolean) it.c(null)).booleanValue()) {
                lVar.invoke(it.next());
            }
            k2 k2Var = k2.f75408a;
            a(d0Var, null);
            return k2Var;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a(d0Var, th);
                throw th2;
            }
        }
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final /* synthetic */ kotlinx.coroutines.selects.g h(d0 d0Var) {
        l0.n(d0Var, ProtectedSandApp.s("虧\u0001"));
        return d0Var.R();
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @x0(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final /* synthetic */ Object i(d0 d0Var, kotlin.coroutines.d dVar) {
        l0.n(d0Var, ProtectedSandApp.s("虨\u0001"));
        return d0Var.U(dVar);
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
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object j(@fg.l kotlinx.coroutines.channels.d0<? extends E> r7, @fg.l kotlin.coroutines.d<? super java.util.List<? extends E>> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.t.c
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.t$c r0 = (kotlinx.coroutines.channels.t.c) r0
            int r1 = r0.f79439g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79439g = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.t$c r0 = new kotlinx.coroutines.channels.t$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f79438f
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79439g
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.f79437e
            kotlinx.coroutines.channels.n r7 = (kotlinx.coroutines.channels.n) r7
            java.lang.Object r2 = r0.f79436d
            kotlinx.coroutines.channels.d0 r2 = (kotlinx.coroutines.channels.d0) r2
            java.lang.Object r4 = r0.f79435c
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.f79434b
            java.util.List r5 = (java.util.List) r5
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L37
            goto L6a
        L37:
            r7 = move-exception
            r8 = r2
            goto L8c
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "虦\u0001"
            java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
            r7.<init>(r8)
            throw r7
        L46:
            kotlin.a1.n(r8)
            kotlin.collections.builders.b r8 = new kotlin.collections.builders.b
            r8.<init>()
            kotlinx.coroutines.channels.n r2 = r7.iterator()     // Catch: java.lang.Throwable -> L88
            r4 = r8
            r5 = r4
            r8 = r7
            r7 = r2
        L56:
            r0.f79434b = r5     // Catch: java.lang.Throwable -> L86
            r0.f79435c = r4     // Catch: java.lang.Throwable -> L86
            r0.f79436d = r8     // Catch: java.lang.Throwable -> L86
            r0.f79437e = r7     // Catch: java.lang.Throwable -> L86
            r0.f79439g = r3     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = r7.c(r0)     // Catch: java.lang.Throwable -> L86
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
            kotlin.k2 r7 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L37
            r7 = 0
            a(r2, r7)
            java.util.List r7 = kotlin.collections.w.a(r5)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.t.j(kotlinx.coroutines.channels.d0, kotlin.coroutines.d):java.lang.Object");
    }
}
