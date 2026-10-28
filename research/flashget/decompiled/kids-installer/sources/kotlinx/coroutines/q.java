package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CancellableContinuation.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J%\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\tH'J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0004H'J\b\u0010\u0015\u001a\u00020\rH'J\u0014\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tH&J1\u0010\u001a\u001a\u00020\r2'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u0018H&J\u001b\u0010\u001c\u001a\u00020\r*\u00020\u001b2\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u0001\u001a\u00020\r*\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\tH'J<\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00028\u00002#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH'¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0014\u0010%\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010!¨\u0006&"}, d2 = {"Lkotlinx/coroutines/q;", "T", "Lkotlin/coroutines/d;", "value", "", "idempotent", "r", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/m2;", "onCancellation", "u", "(Ljava/lang/Object;Ljava/lang/Object;Lq3/l;)Ljava/lang/Object;", "exception", "J", "token", "v0", "X", "", "a", "Lkotlinx/coroutines/CompletionHandler;", "handler", "K", "Lkotlinx/coroutines/o0;", "W", "(Lkotlinx/coroutines/o0;Ljava/lang/Object;)V", "y", "(Ljava/lang/Object;Lq3/l;)V", "d", "()Z", "isActive", "m", "isCompleted", "isCancelled", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public interface q<T> extends Continuation<T> {

    /* compiled from: CancellableContinuation.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ boolean a(q qVar, Throwable th, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("帖"));
            }
            if ((i5 & 1) != 0) {
                th = null;
            }
            return qVar.a(th);
        }

        public static /* synthetic */ Object b(q qVar, Object obj, Object obj2, int i5, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("帗"));
            }
            if ((i5 & 2) != 0) {
                obj2 = null;
            }
            return qVar.r(obj, obj2);
        }
    }

    @d5.e
    @i2
    Object J(@d5.d Throwable exception);

    void K(@d5.d q3.l<? super Throwable, kotlin.m2> lVar);

    @c2
    void T(@d5.d o0 o0Var, @d5.d Throwable th);

    @c2
    void W(@d5.d o0 o0Var, T t5);

    @i2
    void X();

    boolean a(@d5.e Throwable cause);

    boolean d();

    boolean isCancelled();

    boolean m();

    @d5.e
    @i2
    Object r(T value, @d5.e Object idempotent);

    @d5.e
    @i2
    Object u(T value, @d5.e Object idempotent, @d5.e q3.l<? super Throwable, kotlin.m2> onCancellation);

    @i2
    void v0(@d5.d Object obj);

    @c2
    void y(T value, @d5.e q3.l<? super Throwable, kotlin.m2> onCancellation);
}
