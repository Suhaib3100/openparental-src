package kotlinx.coroutines.flow.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlinx.coroutines.f2;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/flow/internal/p;", "T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "d", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f2
/* loaded from: classes7.dex */
public interface p<T> extends kotlinx.coroutines.flow.i<T> {

    /* compiled from: ChannelFlow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ kotlinx.coroutines.flow.i a(p pVar, kotlin.coroutines.g gVar, int i4, kotlinx.coroutines.channels.i iVar, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("蜨\u0001"));
            }
            if ((i5 & 1) != 0) {
                gVar = kotlin.coroutines.i.f75057b;
            }
            if ((i5 & 2) != 0) {
                i4 = -3;
            }
            if ((i5 & 4) != 0) {
                iVar = kotlinx.coroutines.channels.i.SUSPEND;
            }
            return pVar.d(gVar, i4, iVar);
        }
    }

    @fg.l
    kotlinx.coroutines.flow.i<T> d(@fg.l kotlin.coroutines.g context, int capacity, @fg.l kotlinx.coroutines.channels.i onBufferOverflow);
}
