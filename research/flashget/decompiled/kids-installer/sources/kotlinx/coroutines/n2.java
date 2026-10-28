package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.Sequence;

/* compiled from: Job.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 -2\u00020\u0001:\u0001.J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&J\b\u0010\n\u001a\u00020\bH\u0017J\u0014\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u000bH'J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'J\u0013\u0010\u0011\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0019\u001a\u00020\u00182'\u0010\u0017\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0013j\u0002`\u0016H&JE\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052'\u0010\u0017\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0013j\u0002`\u0016H'J\u0011\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0097\u0002R\u0014\u0010!\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0014\u0010$\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00000%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lkotlinx/coroutines/n2;", "Lkotlin/coroutines/g$b;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "O", "", "start", "cause", "Lkotlin/m2;", "e", "cancel", "", "a", "Lkotlinx/coroutines/z;", "child", "Lkotlinx/coroutines/x;", "p0", "H", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/p1;", "m0", "onCancelling", "invokeImmediately", "P", "other", "Z", "d", "()Z", "isActive", "m", "isCompleted", "isCancelled", "Lkotlin/sequences/m;", "F", "()Lkotlin/sequences/m;", "children", "Lkotlinx/coroutines/selects/c;", "g0", "()Lkotlinx/coroutines/selects/c;", "onJoin", "g", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public interface n2 extends CoroutineContext.b {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = Companion.f28824o;

    /* compiled from: Job.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ void b(n2 n2Var, CancellationException cancellationException, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("帒"));
            }
            if ((i5 & 1) != 0) {
                cancellationException = null;
            }
            n2Var.e(cancellationException);
        }

        public static /* synthetic */ boolean c(n2 n2Var, Throwable th, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("帓"));
            }
            if ((i5 & 1) != 0) {
                th = null;
            }
            return n2Var.a(th);
        }

        public static <R> R d(@d5.d n2 n2Var, R r5, @d5.d q3.p<? super R, ? super CoroutineContext.b, ? extends R> pVar) {
            return (R) CoroutineContext.b.a.a(n2Var, r5, pVar);
        }

        @d5.e
        public static <E extends CoroutineContext.b> E e(@d5.d n2 n2Var, @d5.d CoroutineContext.c<E> cVar) {
            return (E) CoroutineContext.b.a.b(n2Var, cVar);
        }

        public static /* synthetic */ p1 f(n2 n2Var, boolean z5, boolean z6, q3.l lVar, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("帔"));
            }
            if ((i5 & 1) != 0) {
                z5 = false;
            }
            if ((i5 & 2) != 0) {
                z6 = true;
            }
            return n2Var.P(z5, z6, lVar);
        }

        @d5.d
        public static CoroutineContext g(@d5.d n2 n2Var, @d5.d CoroutineContext.c<?> cVar) {
            return CoroutineContext.b.a.c(n2Var, cVar);
        }

        @d5.d
        public static CoroutineContext h(@d5.d n2 n2Var, @d5.d CoroutineContext coroutineContext) {
            return CoroutineContext.b.a.d(n2Var, coroutineContext);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @d5.d
        public static n2 i(@d5.d n2 n2Var, @d5.d n2 n2Var2) {
            return n2Var2;
        }
    }

    /* compiled from: Job.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/n2$b;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/n2;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.n2$b, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion implements CoroutineContext.c<n2> {

        /* renamed from: o, reason: collision with root package name */
        static final /* synthetic */ Companion f28824o = new Companion();

        private Companion() {
        }
    }

    @d5.d
    Sequence<n2> F();

    @d5.e
    Object H(@d5.d Continuation<? super kotlin.m2> continuation);

    @d5.d
    @i2
    CancellationException O();

    @d5.d
    @i2
    p1 P(boolean z5, boolean z6, @d5.d q3.l<? super Throwable, kotlin.m2> lVar);

    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @d5.d
    n2 Z(@d5.d n2 other);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean a(Throwable cause);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    boolean d();

    void e(@d5.e CancellationException cancellationException);

    @d5.d
    kotlinx.coroutines.selects.c g0();

    boolean isCancelled();

    boolean m();

    @d5.d
    p1 m0(@d5.d q3.l<? super Throwable, kotlin.m2> lVar);

    @d5.d
    @i2
    x p0(@d5.d z child);

    boolean start();
}
