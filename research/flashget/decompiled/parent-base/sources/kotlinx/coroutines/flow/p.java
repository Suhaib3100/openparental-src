package kotlinx.coroutines.flow;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlinx.coroutines.flow.internal.p;
import kotlinx.coroutines.k2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Context.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0010\u0010\u000b\u001a\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "b", "(Lkotlinx/coroutines/flow/i;ILkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/flow/i;", "a", "(Lkotlinx/coroutines/flow/i;I)Lkotlinx/coroutines/flow/i;", "g", "(Lkotlinx/coroutines/flow/i;)Lkotlinx/coroutines/flow/i;", "Lkotlin/coroutines/g;", "context", "h", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;)Lkotlinx/coroutines/flow/i;", "e", "Lkotlin/k2;", "f", "(Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes7.dex */
public final /* synthetic */ class p {
    @fg.l
    public static final <T> i<T> b(@fg.l i<? extends T> iVar, int i4, @fg.l kotlinx.coroutines.channels.i iVar2) {
        if (i4 < 0 && i4 != -2 && i4 != -1) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("蝖\u0001"), i4).toString());
        }
        if (i4 == -1 && iVar2 != kotlinx.coroutines.channels.i.SUSPEND) {
            throw new IllegalArgumentException(ProtectedSandApp.s("蝗\u0001"));
        }
        if (i4 == -1) {
            iVar2 = kotlinx.coroutines.channels.i.DROP_OLDEST;
            i4 = 0;
        }
        int i5 = i4;
        kotlinx.coroutines.channels.i iVar3 = iVar2;
        return iVar instanceof kotlinx.coroutines.flow.internal.p ? p.a.a((kotlinx.coroutines.flow.internal.p) iVar, null, i5, iVar3, 1, null) : new kotlinx.coroutines.flow.internal.h(iVar, null, i5, iVar3, 2, null);
    }

    public static /* synthetic */ i c(i iVar, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = -2;
        }
        return d(iVar, i4, null, 2, null);
    }

    public static i d(i iVar, int i4, kotlinx.coroutines.channels.i iVar2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = -2;
        }
        if ((i5 & 2) != 0) {
            iVar2 = kotlinx.coroutines.channels.i.SUSPEND;
        }
        return b(iVar, i4, iVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public static final <T> i<T> e(@fg.l i<? extends T> iVar) {
        return iVar instanceof c ? iVar : new d(iVar);
    }

    private static final void f(kotlin.coroutines.g gVar) {
        if (gVar.c(k2.INSTANCE) == null) {
            return;
        }
        throw new IllegalArgumentException((ProtectedSandApp.s("蝘\u0001") + gVar).toString());
    }

    @fg.l
    public static final <T> i<T> g(@fg.l i<? extends T> iVar) {
        return d(iVar, -1, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public static final <T> i<T> h(@fg.l i<? extends T> iVar, @fg.l kotlin.coroutines.g gVar) {
        f(gVar);
        return kotlin.jvm.internal.l0.g(gVar, kotlin.coroutines.i.f75057b) ? iVar : iVar instanceof kotlinx.coroutines.flow.internal.p ? p.a.a((kotlinx.coroutines.flow.internal.p) iVar, gVar, 0, null, 6, null) : new kotlinx.coroutines.flow.internal.h(iVar, gVar, 0, null, 12, null);
    }
}
