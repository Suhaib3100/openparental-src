package kotlinx.coroutines.flow;

import a0.c;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: StateFlow.kt */
@Metadata(d1 = {"\u0000>\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a4\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b\u001a6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000\"\u001a\u0010\u0019\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001c\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u0012\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, d2 = {"T", "value", "Lkotlinx/coroutines/flow/e0;", "a", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/e0;", "Lkotlin/Function1;", "function", "i", "(Lkotlinx/coroutines/flow/e0;Lq3/l;)Ljava/lang/Object;", "e", "Lkotlin/m2;", "h", "Lkotlinx/coroutines/flow/t0;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/m;", "onBufferOverflow", "Lkotlinx/coroutines/flow/i;", "d", "Lkotlinx/coroutines/internal/r0;", "Lkotlinx/coroutines/internal/r0;", "getNONE$annotations", "()V", "NONE", "b", "getPENDING$annotations", "PENDING", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final kotlinx.coroutines.internal.r0 f28499a = new kotlinx.coroutines.internal.r0(ProtectedSandApp.s("嶡"));

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final kotlinx.coroutines.internal.r0 f28500b = new kotlinx.coroutines.internal.r0(ProtectedSandApp.s("嶢"));

    @d5.d
    public static final <T> e0<T> a(T t5) {
        if (t5 == null) {
            t5 = (T) kotlinx.coroutines.flow.internal.s.f28115a;
        }
        return new u0(t5);
    }

    @d5.d
    public static final <T> i<T> d(@d5.d t0<? extends T> t0Var, @d5.d CoroutineContext coroutineContext, int i5, @d5.d kotlinx.coroutines.channels.m mVar) {
        boolean z5 = false;
        if (i5 >= 0 && i5 < 2) {
            z5 = true;
        }
        return ((z5 || i5 == -2) && mVar == kotlinx.coroutines.channels.m.DROP_OLDEST) ? t0Var : k0.e(t0Var, coroutineContext, i5, mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    public static final <T> T e(@d5.d e0<T> e0Var, @d5.d q3.l<? super T, ? extends T> lVar) {
        ?? r02;
        do {
            r02 = (Object) e0Var.getValue();
        } while (!e0Var.g(r02, lVar.N(r02)));
        return r02;
    }

    private static /* synthetic */ void f() {
    }

    private static /* synthetic */ void g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void h(@d5.d e0<T> e0Var, @d5.d q3.l<? super T, ? extends T> lVar) {
        c.C0000c.a aVar;
        do {
            aVar = (Object) e0Var.getValue();
        } while (!e0Var.g(aVar, lVar.N(aVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T i(@d5.d e0<T> e0Var, @d5.d q3.l<? super T, ? extends T> lVar) {
        c.C0000c.a aVar;
        T N;
        do {
            aVar = (Object) e0Var.getValue();
            N = lVar.N(aVar);
        } while (!e0Var.g(aVar, N));
        return N;
    }
}
