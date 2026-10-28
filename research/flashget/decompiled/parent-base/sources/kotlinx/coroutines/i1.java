package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/i1;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/m0;", "dispatcher", "<init>", "(Lkotlinx/coroutines/m0;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/k2;", "execute", "(Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "b", "Lkotlinx/coroutines/m0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class i1 implements Executor {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final m0 dispatcher;

    public i1(@fg.l m0 m0Var) {
        this.dispatcher = m0Var;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@fg.l Runnable block) {
        m0 m0Var = this.dispatcher;
        kotlin.coroutines.i iVar = kotlin.coroutines.i.f75057b;
        if (m0Var.c1(iVar)) {
            this.dispatcher.S0(iVar, block);
        } else {
            block.run();
        }
    }

    @fg.l
    public String toString() {
        return this.dispatcher.toString();
    }
}
