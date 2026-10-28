package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: CancellableContinuation.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J%\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\tH'¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0004H'¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH'¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u001a\u0010\u001bJ8\u0010\u001e\u001a\u00020\r2'\u0010\u001d\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\r*\u00020 2\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u00020\r*\u00020 2\u0006\u0010\u0011\u001a\u00020\tH'¢\u0006\u0004\b#\u0010$J<\u0010%\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00028\u00002#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH'¢\u0006\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0014\u0010+\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010(¨\u0006,"}, d2 = {"Lkotlinx/coroutines/p;", "T", "Lkotlin/coroutines/d;", "value", "", "idempotent", "p", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/k2;", "onCancellation", "i0", "(Ljava/lang/Object;Ljava/lang/Object;Lld/l;)Ljava/lang/Object;", "exception", "v", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "l0", "(Ljava/lang/Object;)V", "e0", "()V", "", "f", "(Ljava/lang/Throwable;)Z", "Lkotlinx/coroutines/CompletionHandler;", "handler", "k0", "(Lld/l;)V", "Lkotlinx/coroutines/m0;", "Z", "(Lkotlinx/coroutines/m0;Ljava/lang/Object;)V", "A", "(Lkotlinx/coroutines/m0;Ljava/lang/Throwable;)V", "W", "(Ljava/lang/Object;Lld/l;)V", "isActive", "()Z", "l", "isCompleted", "isCancelled", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface p<T> extends kotlin.coroutines.d<T> {

    /* compiled from: CancellableContinuation.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ boolean a(p pVar, Throwable th, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("蠪\u0001"));
            }
            if ((i4 & 1) != 0) {
                th = null;
            }
            return pVar.f(th);
        }

        public static /* synthetic */ Object b(p pVar, Object obj, Object obj2, int i4, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("蠫\u0001"));
            }
            if ((i4 & 2) != 0) {
                obj2 = null;
            }
            return pVar.p(obj, obj2);
        }
    }

    @z1
    void A(@fg.l m0 m0Var, @fg.l Throwable th);

    @z1
    void W(T value, @fg.m ld.l<? super Throwable, kotlin.k2> onCancellation);

    @z1
    void Z(@fg.l m0 m0Var, T t4);

    @f2
    void e0();

    boolean f(@fg.m Throwable cause);

    @fg.m
    @f2
    Object i0(T value, @fg.m Object idempotent, @fg.m ld.l<? super Throwable, kotlin.k2> onCancellation);

    boolean isActive();

    boolean isCancelled();

    void k0(@fg.l ld.l<? super Throwable, kotlin.k2> handler);

    boolean l();

    @f2
    void l0(@fg.l Object token);

    @fg.m
    @f2
    Object p(T value, @fg.m Object idempotent);

    @fg.m
    @f2
    Object v(@fg.l Throwable exception);
}
