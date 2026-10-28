package kotlinx.coroutines.flow;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.flow.internal.p;
import kotlinx.coroutines.n2;

/* compiled from: Context.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\n\u001a\u00020\t\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "", "capacity", "Lkotlinx/coroutines/channels/m;", "onBufferOverflow", "b", "a", "g", "Lkotlin/coroutines/g;", "context", "h", "e", "Lkotlin/m2;", "f", "(Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes5.dex */
final /* synthetic */ class p {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ i a(i iVar, int i5) {
        return d(iVar, i5, null, 2, null);
    }

    @d5.d
    public static final <T> i<T> b(@d5.d i<? extends T> iVar, int i5, @d5.d kotlinx.coroutines.channels.m mVar) {
        int i6;
        kotlinx.coroutines.channels.m mVar2;
        boolean z5 = true;
        if (!(i5 >= 0 || i5 == -2 || i5 == -1)) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("嵷"), i5).toString());
        }
        if (i5 == -1 && mVar != kotlinx.coroutines.channels.m.SUSPEND) {
            z5 = false;
        }
        if (!z5) {
            throw new IllegalArgumentException(ProtectedSandApp.s("嵶").toString());
        }
        if (i5 == -1) {
            mVar2 = kotlinx.coroutines.channels.m.DROP_OLDEST;
            i6 = 0;
        } else {
            i6 = i5;
            mVar2 = mVar;
        }
        return iVar instanceof kotlinx.coroutines.flow.internal.p ? p.a.a((kotlinx.coroutines.flow.internal.p) iVar, null, i6, mVar2, 1, null) : new kotlinx.coroutines.flow.internal.h(iVar, null, i6, mVar2, 2, null);
    }

    public static /* synthetic */ i c(i iVar, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = -2;
        }
        return a(iVar, i5);
    }

    public static i d(i iVar, int i5, kotlinx.coroutines.channels.m mVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = -2;
        }
        if ((i6 & 2) != 0) {
            mVar = kotlinx.coroutines.channels.m.SUSPEND;
        }
        return b(iVar, i5, mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.d
    public static final <T> i<T> e(@d5.d i<? extends T> iVar) {
        return iVar instanceof c ? iVar : new d(iVar);
    }

    private static final void f(CoroutineContext coroutineContext) {
        if (coroutineContext.b(n2.INSTANCE) == null) {
            return;
        }
        throw new IllegalArgumentException((ProtectedSandApp.s("嵸") + coroutineContext).toString());
    }

    @d5.d
    public static final <T> i<T> g(@d5.d i<? extends T> iVar) {
        return d(iVar, -1, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.d
    public static final <T> i<T> h(@d5.d i<? extends T> iVar, @d5.d CoroutineContext coroutineContext) {
        f(coroutineContext);
        return kotlin.jvm.internal.l0.g(coroutineContext, EmptyCoroutineContext.f23294o) ? iVar : iVar instanceof kotlinx.coroutines.flow.internal.p ? p.a.a((kotlinx.coroutines.flow.internal.p) iVar, coroutineContext, 0, null, 6, null) : new kotlinx.coroutines.flow.internal.h(iVar, coroutineContext, 0, null, 12, null);
    }
}
