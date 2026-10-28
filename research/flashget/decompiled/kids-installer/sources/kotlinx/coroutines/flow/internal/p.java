package kotlinx.coroutines.flow.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.i2;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J,\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/flow/internal/p;", "T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/m;", "onBufferOverflow", "d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@i2
/* loaded from: classes5.dex */
public interface p<T> extends kotlinx.coroutines.flow.i<T> {

    /* compiled from: ChannelFlow.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ kotlinx.coroutines.flow.i a(p pVar, CoroutineContext coroutineContext, int i5, kotlinx.coroutines.channels.m mVar, int i6, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("嵙"));
            }
            if ((i6 & 1) != 0) {
                coroutineContext = EmptyCoroutineContext.f23294o;
            }
            if ((i6 & 2) != 0) {
                i5 = -3;
            }
            if ((i6 & 4) != 0) {
                mVar = kotlinx.coroutines.channels.m.SUSPEND;
            }
            return pVar.d(coroutineContext, i5, mVar);
        }
    }

    @d5.d
    kotlinx.coroutines.flow.i<T> d(@d5.d CoroutineContext context, int capacity, @d5.d kotlinx.coroutines.channels.m onBufferOverflow);
}
