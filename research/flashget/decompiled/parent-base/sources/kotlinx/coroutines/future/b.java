package kotlinx.coroutines.future;

import fg.m;
import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import kd.f;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.k2;
import kotlin.z0;

/* compiled from: Future.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00018\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/future/b;", "T", "Ljava/util/function/BiFunction;", "", "Lkotlin/k2;", "Lkotlin/coroutines/d;", "cont", "<init>", "(Lkotlin/coroutines/d;)V", "result", "exception", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/d;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class b<T> implements BiFunction<T, Throwable, k2> {

    @m
    @f
    public volatile kotlin.coroutines.d<? super T> cont;

    public b(@m kotlin.coroutines.d<? super T> dVar) {
        this.cont = dVar;
    }

    public void a(@m T result, @m Throwable exception) {
        Throwable cause;
        kotlin.coroutines.d<? super T> dVar = this.cont;
        if (dVar == null) {
            return;
        }
        if (exception == null) {
            z0.Companion companion = z0.INSTANCE;
            dVar.resumeWith(result);
            return;
        }
        CompletionException completionException = exception instanceof CompletionException ? (CompletionException) exception : null;
        if (completionException != null && (cause = completionException.getCause()) != null) {
            exception = cause;
        }
        z0.Companion companion2 = z0.INSTANCE;
        dVar.resumeWith(a1.a(exception));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ k2 apply(Object obj, Throwable th) {
        a(obj, th);
        return k2.f75408a;
    }
}
