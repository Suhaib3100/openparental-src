package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.x0;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.r0;

/* compiled from: Produce.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "E", "Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/channels/e0;", "a", "()Lkotlinx/coroutines/channels/e0;", "channel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface b0<E> extends r0, e0<E> {

    /* compiled from: Produce.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @x0(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean a(@fg.l b0<? super E> b0Var, E e4) {
            return e0.a.c(b0Var, e4);
        }
    }

    @fg.l
    e0<E> a();
}
