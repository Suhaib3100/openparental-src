package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlinx.coroutines.channels.g0;
import kotlinx.coroutines.d3;
import kotlinx.coroutines.u0;

/* compiled from: Actor.kt */
@d3
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/channels/f;", "E", "Lkotlinx/coroutines/u0;", "Lkotlinx/coroutines/channels/g0;", "Lkotlinx/coroutines/channels/n;", "g", "()Lkotlinx/coroutines/channels/n;", "channel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public interface f<E> extends u0, g0<E> {

    /* compiled from: Actor.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        @d5.d
        public static <E> kotlinx.coroutines.selects.d<E> b(@d5.d f<E> fVar) {
            return new g0.a.C0409a(fVar);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
        @d5.e
        public static <E> E c(@d5.d f<E> fVar) {
            return (E) g0.a.h(fVar);
        }

        @LowPriorityInOverloadResolution
        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
        @d5.e
        public static <E> Object d(@d5.d f<E> fVar, @d5.d Continuation<? super E> continuation) {
            return g0.a.i(fVar, continuation);
        }
    }

    @d5.d
    n<E> g();
}
