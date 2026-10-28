package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/i3;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlin/m2;", "run", "Lkotlinx/coroutines/o0;", "o", "Lkotlinx/coroutines/o0;", "dispatcher", "Lkotlinx/coroutines/q;", "p", "Lkotlinx/coroutines/q;", "continuation", "<init>", "(Lkotlinx/coroutines/o0;Lkotlinx/coroutines/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
final class i3 implements Runnable {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final o0 dispatcher;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final q<kotlin.m2> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public i3(@d5.d o0 o0Var, @d5.d q<? super kotlin.m2> qVar) {
        this.dispatcher = o0Var;
        this.continuation = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.continuation.W(this.dispatcher, kotlin.m2.f23662a);
    }
}
