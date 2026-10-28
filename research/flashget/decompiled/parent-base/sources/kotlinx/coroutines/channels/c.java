package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.x0;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.channels.d0;
import kotlinx.coroutines.r0;

/* compiled from: Actor.kt */
@a3
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/channels/c;", "E", "Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/channels/d0;", "Lkotlinx/coroutines/channels/l;", "a", "()Lkotlinx/coroutines/channels/l;", "channel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface c<E> extends r0, d0<E> {

    /* compiled from: Actor.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @fg.l
        public static <E> kotlinx.coroutines.selects.g<E> b(@fg.l c<E> cVar) {
            return d0.a.d(cVar);
        }

        @fg.m
        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @x0(expression = "tryReceive().getOrNull()", imports = {}))
        public static <E> E c(@fg.l c<E> cVar) {
            return (E) d0.a.h(cVar);
        }

        @fg.m
        @kotlin.internal.h
        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @x0(expression = "receiveCatching().getOrNull()", imports = {}))
        public static <E> Object d(@fg.l c<E> cVar, @fg.l kotlin.coroutines.d<? super E> dVar) {
            return d0.a.i(cVar, dVar);
        }
    }

    @fg.l
    l<E> a();
}
