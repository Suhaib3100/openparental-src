package kotlinx.coroutines.channels;

import kotlin.Metadata;

/* compiled from: Channel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0004\u001a\u00020\u0003H¦Bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00028\u0000H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u0007\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/channels/n;", "E", "", "", "c", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "next", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface n<E> {

    /* compiled from: Channel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* compiled from: Channel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {589}, m = "next", n = {"$this"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.channels.n$a$a, reason: collision with other inner class name */
        static final class C1217a<E> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f79407b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f79408c;

            /* renamed from: d, reason: collision with root package name */
            int f79409d;

            C1217a(kotlin.coroutines.d<? super C1217a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f79408c = obj;
                this.f79409d |= Integer.MIN_VALUE;
                return a.a(null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @kd.i(name = "next")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object a(kotlinx.coroutines.channels.n r4, kotlin.coroutines.d r5) {
            /*
                boolean r0 = r5 instanceof kotlinx.coroutines.channels.n.a.C1217a
                if (r0 == 0) goto L13
                r0 = r5
                kotlinx.coroutines.channels.n$a$a r0 = (kotlinx.coroutines.channels.n.a.C1217a) r0
                int r1 = r0.f79409d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f79409d = r1
                goto L18
            L13:
                kotlinx.coroutines.channels.n$a$a r0 = new kotlinx.coroutines.channels.n$a$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f79408c
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f79409d
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2b
                java.lang.Object r4 = r0.f79407b
                kotlinx.coroutines.channels.n r4 = (kotlinx.coroutines.channels.n) r4
                kotlin.a1.n(r5)
                goto L45
            L2b:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "虗\u0001"
                java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
                r4.<init>(r5)
                throw r4
            L37:
                kotlin.a1.n(r5)
                r0.f79407b = r4
                r0.f79409d = r3
                java.lang.Object r5 = r4.c(r0)
                if (r5 != r1) goto L45
                return r1
            L45:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L52
                java.lang.Object r4 = r4.next()
                return r4
            L52:
                kotlinx.coroutines.channels.ClosedReceiveChannelException r4 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
                java.lang.String r5 = "虘\u0001"
                java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
                r4.<init>(r5)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.n.a.a(kotlinx.coroutines.channels.n, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    @kd.i(name = "next")
    /* synthetic */ Object b(kotlin.coroutines.d dVar);

    @fg.m
    Object c(@fg.l kotlin.coroutines.d<? super Boolean> dVar);

    E next();
}
