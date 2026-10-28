package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Channel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0004\u001a\u00020\u0003H¦Bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00028\u0000H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u0007\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/channels/p;", "E", "", "", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "next", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public interface p<E> {

    /* compiled from: Channel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {

        /* compiled from: Channel.kt */
        @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {584}, m = "next", n = {"this"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.channels.p$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        static final class C0411a<E> extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            Object f27384r;

            /* renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f27385s;

            /* renamed from: t, reason: collision with root package name */
            int f27386t;

            C0411a(Continuation<? super C0411a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f27385s = obj;
                this.f27386t |= Integer.MIN_VALUE;
                return a.a(null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @p3.i(name = "next")
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object a(kotlinx.coroutines.channels.p r4, kotlin.coroutines.Continuation r5) {
            /*
                boolean r0 = r5 instanceof kotlinx.coroutines.channels.p.a.C0411a
                if (r0 == 0) goto L13
                r0 = r5
                kotlinx.coroutines.channels.p$a$a r0 = (kotlinx.coroutines.channels.p.a.C0411a) r0
                int r1 = r0.f27386t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f27386t = r1
                goto L18
            L13:
                kotlinx.coroutines.channels.p$a$a r0 = new kotlinx.coroutines.channels.p$a$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f27385s
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f27386t
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2b
                java.lang.Object r4 = r0.f27384r
                kotlinx.coroutines.channels.p r4 = (kotlinx.coroutines.channels.p) r4
                kotlin.a1.n(r5)
                goto L45
            L2b:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "峑"
                java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
                r4.<init>(r5)
                throw r4
            L37:
                kotlin.a1.n(r5)
                r0.f27384r = r4
                r0.f27386t = r3
                java.lang.Object r5 = r4.a(r0)
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
                java.lang.String r5 = "峒"
                java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
                r4.<init>(r5)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.p.a.a(kotlinx.coroutines.channels.p, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @d5.e
    Object a(@d5.d Continuation<? super Boolean> continuation);

    @p3.i(name = "next")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    /* synthetic */ Object b(Continuation continuation);

    E next();
}
