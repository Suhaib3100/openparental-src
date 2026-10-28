package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/t2;", "Lkotlinx/coroutines/h0;", "Lkotlinx/coroutines/p1;", "Lkotlinx/coroutines/g2;", "Lkotlin/m2;", "g", "", "toString", "Lkotlinx/coroutines/u2;", "r", "Lkotlinx/coroutines/u2;", "a1", "()Lkotlinx/coroutines/u2;", "b1", "(Lkotlinx/coroutines/u2;)V", "job", "", "d", "()Z", "isActive", "Lkotlinx/coroutines/z2;", "x", "()Lkotlinx/coroutines/z2;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public abstract class t2 extends h0 implements p1, g2 {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public u2 job;

    @d5.d
    public final u2 a1() {
        u2 u2Var = this.job;
        if (u2Var != null) {
            return u2Var;
        }
        kotlin.jvm.internal.l0.S(ProtectedSandApp.s("郊"));
        return null;
    }

    public final void b1(@d5.d u2 u2Var) {
        this.job = u2Var;
    }

    @Override // kotlinx.coroutines.g2
    public boolean d() {
        return true;
    }

    @Override // kotlinx.coroutines.p1
    public void g() {
        a1().s1(this);
    }

    @Override // kotlinx.coroutines.internal.y
    @d5.d
    public String toString() {
        return z0.a(this) + '@' + z0.b(this) + ProtectedSandApp.s("郋") + z0.b(a1()) + ']';
    }

    @Override // kotlinx.coroutines.g2
    @d5.e
    /* renamed from: x */
    public z2 getList() {
        return null;
    }
}
