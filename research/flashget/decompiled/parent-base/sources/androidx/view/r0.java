package androidx.view;

import fg.l;
import kd.f;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.m0;

/* compiled from: PausingDispatcher.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/r0;", "Lkotlinx/coroutines/m0;", "<init>", "()V", "Lkotlin/coroutines/g;", "context", "", "c1", "(Lkotlin/coroutines/g;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/k2;", "S0", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "Landroidx/lifecycle/n;", "d", "Landroidx/lifecycle/n;", "dispatchQueue", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r0 extends m0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    @f
    public final C1438n dispatchQueue = new C1438n();

    @Override // kotlinx.coroutines.m0
    public void S0(@l g context, @l Runnable block) {
        l0.p(context, "context");
        l0.p(block, "block");
        this.dispatchQueue.c(context, block);
    }

    @Override // kotlinx.coroutines.m0
    public boolean c1(@l g context) {
        l0.p(context, "context");
        if (j1.e().j1().c1(context)) {
            return true;
        }
        return !this.dispatchQueue.b();
    }
}
