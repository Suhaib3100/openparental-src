package kotlinx.coroutines.internal;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: CoroutineExceptionHandlerImpl.common.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/g;", "context", "", "exception", "Lkotlin/k2;", "a", "(Lkotlin/coroutines/g;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class j {
    public static final void a(@fg.l kotlin.coroutines.g gVar, @fg.l Throwable th) {
        Iterator<kotlinx.coroutines.n0> it = i.b().iterator();
        while (it.hasNext()) {
            try {
                it.next().N(gVar, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                i.c(kotlinx.coroutines.o0.c(th, th2));
            }
        }
        try {
            kotlin.o.a(th, new DiagnosticCoroutineContextException(gVar));
        } catch (Throwable unused2) {
        }
        i.c(th);
    }
}
