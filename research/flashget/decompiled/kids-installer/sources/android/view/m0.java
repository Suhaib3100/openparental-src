package android.view;

import d5.d;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.o0;
import p3.f;

/* compiled from: PausingDispatcher.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/m0;", "Lkotlinx/coroutines/o0;", "Lkotlin/coroutines/g;", "context", "", "B0", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/m2;", "y0", "Landroidx/lifecycle/k;", "q", "Landroidx/lifecycle/k;", "dispatchQueue", "<init>", "()V", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes4.dex */
public final class m0 extends o0 {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d
    @f
    public final k dispatchQueue = new k();

    @Override // kotlinx.coroutines.o0
    public boolean B0(@d CoroutineContext context) {
        l0.p(context, "context");
        if (m1.e().J0().B0(context)) {
            return true;
        }
        return !this.dispatchQueue.b();
    }

    @Override // kotlinx.coroutines.o0
    public void y0(@d CoroutineContext context, @d Runnable block) {
        l0.p(context, "context");
        l0.p(block, "block");
        this.dispatchQueue.c(context, block);
    }
}
