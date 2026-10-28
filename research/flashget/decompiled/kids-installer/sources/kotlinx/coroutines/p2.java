package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.PublishedApi;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00038PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/p2;", "Lkotlinx/coroutines/u2;", "Lkotlinx/coroutines/d0;", "", "F1", "j", "", "exception", "k", "p", "Z", "P0", "()Z", "handlesException", "Q0", "onCancelComplete", "Lkotlinx/coroutines/n2;", "parent", "<init>", "(Lkotlinx/coroutines/n2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@PublishedApi
/* loaded from: classes6.dex */
public class p2 extends u2 implements d0 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean handlesException;

    public p2(@d5.e n2 n2Var) {
        super(true);
        W0(n2Var);
        this.handlesException = F1();
    }

    private final boolean F1() {
        u2 a12;
        x S0 = S0();
        y yVar = S0 instanceof y ? (y) S0 : null;
        if (yVar != null && (a12 = yVar.a1()) != null) {
            while (!a12.getHandlesException()) {
                x S02 = a12.S0();
                y yVar2 = S02 instanceof y ? (y) S02 : null;
                if (yVar2 != null && (a12 = yVar2.a1()) != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.u2
    /* renamed from: P0, reason: from getter */
    public boolean getHandlesException() {
        return this.handlesException;
    }

    @Override // kotlinx.coroutines.u2
    public boolean Q0() {
        return true;
    }

    @Override // kotlinx.coroutines.d0
    public boolean j() {
        return e1(kotlin.m2.f23662a);
    }

    @Override // kotlinx.coroutines.d0
    public boolean k(@d5.d Throwable exception) {
        return e1(new f0(exception, false, 2, null));
    }
}
