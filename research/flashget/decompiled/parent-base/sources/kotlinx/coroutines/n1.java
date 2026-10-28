package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: CancellableContinuation.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/n1;", "Lkotlinx/coroutines/n;", "Lkotlinx/coroutines/m1;", "handle", "<init>", "(Lkotlinx/coroutines/m1;)V", "", "cause", "Lkotlin/k2;", "n", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "b", "Lkotlinx/coroutines/m1;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class n1 extends n {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m1 handle;

    public n1(@fg.l m1 m1Var) {
        this.handle = m1Var;
    }

    @Override // ld.l
    public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
        n(th);
        return kotlin.k2.f75408a;
    }

    @Override // kotlinx.coroutines.o
    public void n(@fg.m Throwable cause) {
        this.handle.dispose();
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("蠧\u0001") + this.handle + ']';
    }
}
