package kotlinx.coroutines.channels;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.x0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.internal.r0;
import kotlinx.coroutines.z1;

/* compiled from: Channel.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\u0018\u0010\bJ\u0015\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00158&X§\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u00158&X§\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R#\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050 8&X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b$\u0010\"R\"\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000 8VX\u0097\u0004¢\u0006\f\u0012\u0004\b'\u0010\u0013\u001a\u0004\b&\u0010\"\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Lkotlinx/coroutines/channels/d0;", "E", "", "a0", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/p;", "V", "T", "()Ljava/lang/Object;", "Lkotlinx/coroutines/channels/n;", "iterator", "()Lkotlinx/coroutines/channels/n;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/k2;", "b", "(Ljava/util/concurrent/CancellationException;)V", "cancel", "()V", "", "", "f", "(Ljava/lang/Throwable;)Z", "poll", "U", "j", "()Z", "isClosedForReceive$annotations", "isClosedForReceive", "isEmpty", "isEmpty$annotations", "Lkotlinx/coroutines/selects/g;", "P", "()Lkotlinx/coroutines/selects/g;", "onReceive", "Q", "onReceiveCatching", "R", "getOnReceiveOrNull$annotations", "onReceiveOrNull", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface d0<E> {

    /* compiled from: Channel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* compiled from: Channel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {372}, m = "receiveOrNull", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.channels.d0$a$a, reason: collision with other inner class name */
        static final class C1215a<E> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f79281b;

            /* renamed from: c, reason: collision with root package name */
            int f79282c;

            C1215a(kotlin.coroutines.d<? super C1215a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f79281b = obj;
                this.f79282c |= Integer.MIN_VALUE;
                return a.i(null, this);
            }
        }

        public static /* synthetic */ void b(d0 d0Var, CancellationException cancellationException, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("薴\u0001"));
            }
            if ((i4 & 1) != 0) {
                cancellationException = null;
            }
            d0Var.b(cancellationException);
        }

        public static /* synthetic */ boolean c(d0 d0Var, Throwable th, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("薴\u0001"));
            }
            if ((i4 & 1) != 0) {
                th = null;
            }
            return d0Var.f(th);
        }

        @fg.l
        public static <E> kotlinx.coroutines.selects.g<E> d(@fg.l d0<? extends E> d0Var) {
            l0.n(d0Var, ProtectedSandApp.s("薵\u0001"));
            return ((j) d0Var).R();
        }

        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @x0(expression = "onReceiveCatching", imports = {}))
        public static /* synthetic */ void e() {
        }

        @e1
        public static /* synthetic */ void f() {
        }

        @z1
        public static /* synthetic */ void g() {
        }

        @fg.m
        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @x0(expression = "tryReceive().getOrNull()", imports = {}))
        public static <E> E h(@fg.l d0<? extends E> d0Var) {
            Object T = d0Var.T();
            if (p.m(T)) {
                return (E) p.i(T);
            }
            Throwable f4 = p.f(T);
            if (f4 == null) {
                return null;
            }
            throw r0.o(f4);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @fg.m
        @kotlin.internal.h
        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.x0(expression = "receiveCatching().getOrNull()", imports = {}))
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static <E> java.lang.Object i(@fg.l kotlinx.coroutines.channels.d0<? extends E> r4, @fg.l kotlin.coroutines.d<? super E> r5) {
            /*
                boolean r0 = r5 instanceof kotlinx.coroutines.channels.d0.a.C1215a
                if (r0 == 0) goto L13
                r0 = r5
                kotlinx.coroutines.channels.d0$a$a r0 = (kotlinx.coroutines.channels.d0.a.C1215a) r0
                int r1 = r0.f79282c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f79282c = r1
                goto L18
            L13:
                kotlinx.coroutines.channels.d0$a$a r0 = new kotlinx.coroutines.channels.d0$a$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f79281b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f79282c
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L2d
                kotlin.a1.n(r5)
                kotlinx.coroutines.channels.p r5 = (kotlinx.coroutines.channels.p) r5
                java.lang.Object r4 = r5.getHolder()
                goto L45
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "薶\u0001"
                java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
                r4.<init>(r5)
                throw r4
            L39:
                kotlin.a1.n(r5)
                r0.f79282c = r3
                java.lang.Object r4 = r4.V(r0)
                if (r4 != r1) goto L45
                return r1
            L45:
                java.lang.Object r4 = kotlinx.coroutines.channels.p.h(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.d0.a.i(kotlinx.coroutines.channels.d0, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @fg.l
    kotlinx.coroutines.selects.g<E> P();

    @fg.l
    kotlinx.coroutines.selects.g<p<E>> Q();

    @fg.l
    kotlinx.coroutines.selects.g<E> R();

    @fg.l
    Object T();

    @fg.m
    @kotlin.internal.h
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @x0(expression = "receiveCatching().getOrNull()", imports = {}))
    Object U(@fg.l kotlin.coroutines.d<? super E> dVar);

    @fg.m
    Object V(@fg.l kotlin.coroutines.d<? super p<? extends E>> dVar);

    @fg.m
    Object a0(@fg.l kotlin.coroutines.d<? super E> dVar);

    void b(@fg.m CancellationException cause);

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean f(Throwable cause);

    boolean isEmpty();

    @fg.l
    n<E> iterator();

    boolean j();

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @x0(expression = "tryReceive().getOrNull()", imports = {}))
    E poll();
}
