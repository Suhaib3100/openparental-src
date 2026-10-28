package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/q2;", "Lkotlinx/coroutines/f0;", "Lkotlinx/coroutines/m1;", "Lkotlinx/coroutines/d2;", "<init>", "()V", "Lkotlin/k2;", "dispose", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/r2;", "e", "Lkotlinx/coroutines/r2;", "e0", "()Lkotlinx/coroutines/r2;", "f0", "(Lkotlinx/coroutines/r2;)V", "job", "", "isActive", "()Z", "Lkotlinx/coroutines/w2;", "a", "()Lkotlinx/coroutines/w2;", "list", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class q2 extends f0 implements m1, d2 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public r2 job;

    @Override // kotlinx.coroutines.d2
    @fg.m
    /* renamed from: a */
    public w2 getList() {
        return null;
    }

    @Override // kotlinx.coroutines.m1
    public void dispose() {
        e0().K1(this);
    }

    @fg.l
    public final r2 e0() {
        r2 r2Var = this.job;
        if (r2Var != null) {
            return r2Var;
        }
        kotlin.jvm.internal.l0.S(ProtectedSandApp.s("薯\u0001"));
        return null;
    }

    public final void f0(@fg.l r2 r2Var) {
        this.job = r2Var;
    }

    @Override // kotlinx.coroutines.d2
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.y
    @fg.l
    public String toString() {
        return w0.a(this) + '@' + w0.b(this) + ProtectedSandApp.s("薰\u0001") + w0.b(e0()) + ']';
    }
}
