package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/e3;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/m0;", "dispatcher", "Lkotlinx/coroutines/p;", "Lkotlin/k2;", "continuation", "<init>", "(Lkotlinx/coroutines/m0;Lkotlinx/coroutines/p;)V", "run", "()V", "b", "Lkotlinx/coroutines/m0;", "c", "Lkotlinx/coroutines/p;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nExecutors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Executors.kt\nkotlinx/coroutines/ResumeUndispatchedRunnable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
/* loaded from: classes7.dex */
final class e3 implements Runnable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m0 dispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final p<kotlin.k2> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public e3(@fg.l m0 m0Var, @fg.l p<? super kotlin.k2> pVar) {
        this.dispatcher = m0Var;
        this.continuation = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.continuation.Z(this.dispatcher, kotlin.k2.f75408a);
    }
}
