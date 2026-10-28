package kotlinx.coroutines.flow;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: SharedFlow.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a%\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"\u001a\u0010\u001c\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u0012\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"T", "", "replay", "extraBufferCapacity", "Lkotlinx/coroutines/channels/m;", "onBufferOverflow", "Lkotlinx/coroutines/flow/d0;", "a", "", "", "", "index", "f", "([Ljava/lang/Object;J)Ljava/lang/Object;", "item", "Lkotlin/m2;", "h", "([Ljava/lang/Object;JLjava/lang/Object;)V", "Lkotlinx/coroutines/flow/i0;", "Lkotlin/coroutines/g;", "context", "capacity", "Lkotlinx/coroutines/flow/i;", "e", "Lkotlinx/coroutines/internal/r0;", "Lkotlinx/coroutines/internal/r0;", "getNO_VALUE$annotations", "()V", "NO_VALUE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final kotlinx.coroutines.internal.r0 f28161a = new kotlinx.coroutines.internal.r0(ProtectedSandApp.s("嵠"));

    @d5.d
    public static final <T> d0<T> a(int i5, int i6, @d5.d kotlinx.coroutines.channels.m mVar) {
        boolean z5 = true;
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("嵣"), i5).toString());
        }
        if (!(i6 >= 0)) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("嵢"), i6).toString());
        }
        if (i5 <= 0 && i6 <= 0 && mVar != kotlinx.coroutines.channels.m.SUSPEND) {
            z5 = false;
        }
        if (!z5) {
            throw new IllegalArgumentException((ProtectedSandApp.s("嵡") + mVar).toString());
        }
        int i7 = i6 + i5;
        if (i7 < 0) {
            i7 = Integer.MAX_VALUE;
        }
        return new j0(i5, i7, mVar);
    }

    public static /* synthetic */ d0 b(int i5, int i6, kotlinx.coroutines.channels.m mVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        if ((i7 & 4) != 0) {
            mVar = kotlinx.coroutines.channels.m.SUSPEND;
        }
        return a(i5, i6, mVar);
    }

    @d5.d
    public static final <T> i<T> e(@d5.d i0<? extends T> i0Var, @d5.d CoroutineContext coroutineContext, int i5, @d5.d kotlinx.coroutines.channels.m mVar) {
        return ((i5 == 0 || i5 == -3) && mVar == kotlinx.coroutines.channels.m.SUSPEND) ? i0Var : new kotlinx.coroutines.flow.internal.h(i0Var, coroutineContext, i5, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j5) {
        return objArr[((int) j5) & (objArr.length - 1)];
    }

    public static /* synthetic */ void g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Object[] objArr, long j5, Object obj) {
        objArr[((int) j5) & (objArr.length - 1)] = obj;
    }
}
