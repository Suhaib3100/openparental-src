package kotlinx.coroutines.future;

import fg.l;
import fg.m;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.k2;
import kotlinx.coroutines.k2;

/* compiled from: Future.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00018\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/future/a;", "T", "Lkotlinx/coroutines/a;", "Ljava/util/function/BiFunction;", "", "Lkotlin/k2;", "Lkotlin/coroutines/g;", "context", "Ljava/util/concurrent/CompletableFuture;", "future", "<init>", "(Lkotlin/coroutines/g;Ljava/util/concurrent/CompletableFuture;)V", "value", "exception", "b2", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "Z1", "(Ljava/lang/Object;)V", "cause", "", "handled", "Y1", "(Ljava/lang/Throwable;Z)V", "e", "Ljava/util/concurrent/CompletableFuture;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class a<T> extends kotlinx.coroutines.a<T> implements BiFunction<T, Throwable, k2> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final CompletableFuture<T> future;

    public a(@l g gVar, @l CompletableFuture<T> completableFuture) {
        super(gVar, true, true);
        this.future = completableFuture;
    }

    @Override // kotlinx.coroutines.a
    protected void Y1(@l Throwable cause, boolean handled) {
        this.future.completeExceptionally(cause);
    }

    @Override // kotlinx.coroutines.a
    protected void Z1(T value) {
        this.future.complete(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ k2 apply(Object obj, Throwable th) {
        b2(obj, th);
        return k2.f75408a;
    }

    public void b2(@m T value, @m Throwable exception) {
        k2.a.b(this, null, 1, null);
    }
}
