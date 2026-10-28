package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ThreadContextElement.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"T", "Ljava/lang/ThreadLocal;", "value", "Lkotlinx/coroutines/r3;", "a", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)Lkotlinx/coroutines/r3;", "", "e", "(Ljava/lang/ThreadLocal;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/m2;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class s3 {
    @d5.d
    public static final <T> r3<T> a(@d5.d ThreadLocal<T> threadLocal, T t5) {
        return new kotlinx.coroutines.internal.x0(t5, threadLocal);
    }

    public static r3 b(ThreadLocal threadLocal, Object obj, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            obj = threadLocal.get();
        }
        return new kotlinx.coroutines.internal.x0(obj, threadLocal);
    }

    @d5.e
    public static final Object c(@d5.d ThreadLocal<?> threadLocal, @d5.d Continuation<? super kotlin.m2> continuation) {
        if (continuation.getContext().b(new kotlinx.coroutines.internal.y0(threadLocal)) != null) {
            return kotlin.m2.f23662a;
        }
        throw new IllegalStateException((ProtectedSandApp.s("帞") + threadLocal + ProtectedSandApp.s("帟") + continuation.getContext()).toString());
    }

    private static final Object d(ThreadLocal<?> threadLocal, Continuation<? super kotlin.m2> continuation) {
        throw null;
    }

    @d5.e
    public static final Object e(@d5.d ThreadLocal<?> threadLocal, @d5.d Continuation<? super Boolean> continuation) {
        return Boolean.valueOf(continuation.getContext().b(new kotlinx.coroutines.internal.y0(threadLocal)) != null);
    }

    private static final Object f(ThreadLocal<?> threadLocal, Continuation<? super Boolean> continuation) {
        throw null;
    }
}
