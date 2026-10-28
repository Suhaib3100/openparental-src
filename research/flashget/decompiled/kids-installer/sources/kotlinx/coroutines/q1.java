package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: CancellableContinuation.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/q1;", "Lkotlinx/coroutines/o;", "", "cause", "Lkotlin/m2;", "a", "", "toString", "Lkotlinx/coroutines/p1;", "o", "Lkotlinx/coroutines/p1;", "handle", "<init>", "(Lkotlinx/coroutines/p1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class q1 extends o {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final p1 handle;

    public q1(@d5.d p1 p1Var) {
        this.handle = p1Var;
    }

    @Override // q3.l
    public /* bridge */ /* synthetic */ kotlin.m2 N(Throwable th) {
        a(th);
        return kotlin.m2.f23662a;
    }

    @Override // kotlinx.coroutines.p
    public void a(@d5.e Throwable th) {
        this.handle.g();
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("酈") + this.handle + ']';
    }
}
