package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* compiled from: DebugStrings.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lkotlin/coroutines/d;", "", "c", "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "a", "classSimpleName", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class z0 {
    @d5.d
    public static final String a(@d5.d Object obj) {
        return obj.getClass().getSimpleName();
    }

    @d5.d
    public static final String b(@d5.d Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @d5.d
    public static final String c(@d5.d Continuation<?> continuation) {
        Object a6;
        if (continuation instanceof kotlinx.coroutines.internal.l) {
            return continuation.toString();
        }
        try {
            Result.a aVar = Result.f27242p;
            a6 = continuation + '@' + b(continuation);
        } catch (Throwable th) {
            Result.a aVar2 = Result.f27242p;
            a6 = kotlin.a1.a(th);
        }
        if (Result.e(a6) != null) {
            a6 = continuation.getClass().getName() + '@' + b(continuation);
        }
        return (String) a6;
    }
}
