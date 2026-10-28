package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.g;

/* compiled from: Job.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 82\u00020\u0001:\u0001\u000bJ\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u001f\u001a\u00020\u001e2'\u0010\u001d\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0019j\u0002`\u001cH&¢\u0006\u0004\b\u001f\u0010 JL\u0010#\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u00062'\u0010\u001d\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0019j\u0002`\u001cH'¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0000H\u0097\u0002¢\u0006\u0004\b&\u0010'R\u001c\u0010+\u001a\u0004\u0018\u00010\u00008&X§\u0004¢\u0006\f\u0012\u0004\b*\u0010\u000e\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\bR\u0014\u0010.\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\bR\u0014\u0010/\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\bR\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0000008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, d2 = {"Lkotlinx/coroutines/k2;", "Lkotlin/coroutines/g$b;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "x", "()Ljava/util/concurrent/CancellationException;", "", "start", "()Z", "cause", "Lkotlin/k2;", "b", "(Ljava/util/concurrent/CancellationException;)V", "cancel", "()V", "", "f", "(Ljava/lang/Throwable;)Z", "Lkotlinx/coroutines/x;", "child", "Lkotlinx/coroutines/v;", "N0", "(Lkotlinx/coroutines/x;)Lkotlinx/coroutines/v;", "j0", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/m1;", "F", "(Lld/l;)Lkotlinx/coroutines/m1;", "onCancelling", "invokeImmediately", "K0", "(ZZLld/l;)Lkotlinx/coroutines/m1;", "other", "E", "(Lkotlinx/coroutines/k2;)Lkotlinx/coroutines/k2;", "getParent", "()Lkotlinx/coroutines/k2;", "getParent$annotations", "parent", "isActive", "l", "isCompleted", "isCancelled", "Lkotlin/sequences/m;", "o", "()Lkotlin/sequences/m;", "children", "Lkotlinx/coroutines/selects/e;", "r0", "()Lkotlinx/coroutines/selects/e;", "onJoin", "p2", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface k2 extends g.b {

    /* renamed from: p2, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f80855b;

    /* compiled from: Job.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void b(k2 k2Var, CancellationException cancellationException, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("蠠\u0001"));
            }
            if ((i4 & 1) != 0) {
                cancellationException = null;
            }
            k2Var.b(cancellationException);
        }

        public static /* synthetic */ boolean c(k2 k2Var, Throwable th, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("蠠\u0001"));
            }
            if ((i4 & 1) != 0) {
                th = null;
            }
            return k2Var.f(th);
        }

        public static <R> R d(@fg.l k2 k2Var, R r4, @fg.l ld.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(k2Var, r4, pVar);
        }

        @fg.m
        public static <E extends g.b> E e(@fg.l k2 k2Var, @fg.l g.c<E> cVar) {
            return (E) g.b.a.b(k2Var, cVar);
        }

        @z1
        public static /* synthetic */ void f() {
        }

        public static /* synthetic */ m1 g(k2 k2Var, boolean z4, boolean z5, ld.l lVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("蠡\u0001"));
            }
            if ((i4 & 1) != 0) {
                z4 = false;
            }
            if ((i4 & 2) != 0) {
                z5 = true;
            }
            return k2Var.K0(z4, z5, lVar);
        }

        @fg.l
        public static kotlin.coroutines.g h(@fg.l k2 k2Var, @fg.l g.c<?> cVar) {
            return g.b.a.c(k2Var, cVar);
        }

        @fg.l
        public static kotlin.coroutines.g i(@fg.l k2 k2Var, @fg.l kotlin.coroutines.g gVar) {
            return g.b.a.d(k2Var, gVar);
        }

        @fg.l
        @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static k2 j(@fg.l k2 k2Var, @fg.l k2 k2Var2) {
            return k2Var2;
        }
    }

    /* compiled from: Job.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/k2$b;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/k2;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.k2$b, reason: from kotlin metadata */
    public static final class Companion implements g.c<k2> {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f80855b = new Companion();

        private Companion() {
        }
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    k2 E(@fg.l k2 other);

    @fg.l
    m1 F(@fg.l ld.l<? super Throwable, kotlin.k2> handler);

    @fg.l
    @f2
    m1 K0(boolean onCancelling, boolean invokeImmediately, @fg.l ld.l<? super Throwable, kotlin.k2> handler);

    @fg.l
    @f2
    v N0(@fg.l x child);

    void b(@fg.m CancellationException cause);

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean f(Throwable cause);

    @fg.m
    k2 getParent();

    boolean isActive();

    boolean isCancelled();

    @fg.m
    Object j0(@fg.l kotlin.coroutines.d<? super kotlin.k2> dVar);

    boolean l();

    @fg.l
    kotlin.sequences.m<k2> o();

    @fg.l
    kotlinx.coroutines.selects.e r0();

    boolean start();

    @fg.l
    @f2
    CancellationException x();
}
