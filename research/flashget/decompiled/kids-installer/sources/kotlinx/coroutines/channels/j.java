package kotlinx.coroutines.channels;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlinx.coroutines.d3;

/* compiled from: BroadcastChannel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0005"}, d2 = {"E", "", "capacity", "Lkotlinx/coroutines/channels/i;", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class j {
    @d3
    @d5.d
    public static final <E> i<E> a(int i5) {
        if (i5 == -2) {
            return new g(n.INSTANCE.a());
        }
        if (i5 == -1) {
            return new x();
        }
        if (i5 == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("峂"));
        }
        if (i5 != Integer.MAX_VALUE) {
            return new g(i5);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("峁"));
    }
}
