package kotlinx.coroutines.channels;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.k2;
import kotlin.x0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.internal.r0;

/* compiled from: Channel.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0013\u001a\u00020\u00042#\u0010\u0012\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u000fH&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\f8&X§\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R&\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lkotlinx/coroutines/channels/e0;", "E", "", "element", "Lkotlin/k2;", "f0", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/p;", "M", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "", "b0", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "handler", "d0", "(Lld/l;)V", "offer", "(Ljava/lang/Object;)Z", "g0", "()Z", "isClosedForSend$annotations", "()V", "isClosedForSend", "Lkotlinx/coroutines/selects/i;", "r", "()Lkotlinx/coroutines/selects/i;", "onSend", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface e0<E> {

    /* compiled from: Channel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ boolean a(e0 e0Var, Throwable th, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("蘐\u0001"));
            }
            if ((i4 & 1) != 0) {
                th = null;
            }
            return e0Var.b0(th);
        }

        @e1
        public static /* synthetic */ void b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @x0(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@fg.l e0<? super E> e0Var, E e4) {
            Object M = e0Var.M(e4);
            if (p.m(M)) {
                return true;
            }
            Throwable f4 = p.f(M);
            if (f4 == null) {
                return false;
            }
            throw r0.o(f4);
        }
    }

    @fg.l
    Object M(E element);

    boolean b0(@fg.m Throwable cause);

    void d0(@fg.l ld.l<? super Throwable, k2> handler);

    @fg.m
    Object f0(E e4, @fg.l kotlin.coroutines.d<? super k2> dVar);

    boolean g0();

    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @x0(expression = "trySend(element).isSuccess", imports = {}))
    boolean offer(E element);

    @fg.l
    kotlinx.coroutines.selects.i<E, e0<E>> r();
}
