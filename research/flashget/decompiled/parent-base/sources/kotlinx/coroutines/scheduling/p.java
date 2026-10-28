package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.z1;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/scheduling/p;", "Lkotlinx/coroutines/m0;", "<init>", "()V", "Lkotlin/coroutines/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/k2;", "U0", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "S0", "", "parallelism", "e1", "(I)Lkotlinx/coroutines/m0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class p extends m0 {

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    public static final p f81015d = new p();

    private p() {
    }

    @Override // kotlinx.coroutines.m0
    public void S0(@fg.l kotlin.coroutines.g context, @fg.l Runnable block) {
        d.f80983j.l1(block, o.f81014j, false);
    }

    @Override // kotlinx.coroutines.m0
    @f2
    public void U0(@fg.l kotlin.coroutines.g context, @fg.l Runnable block) {
        d.f80983j.l1(block, o.f81014j, true);
    }

    @Override // kotlinx.coroutines.m0
    @fg.l
    @z1
    public m0 e1(int parallelism) {
        t.a(parallelism);
        return parallelism >= o.f81008d ? this : super.e1(parallelism);
    }
}
