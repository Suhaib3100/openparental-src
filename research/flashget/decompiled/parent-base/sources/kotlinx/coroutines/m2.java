package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\n\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/m2;", "Lkotlinx/coroutines/r2;", "Lkotlinx/coroutines/b0;", "Lkotlinx/coroutines/k2;", "parent", "<init>", "(Lkotlinx/coroutines/k2;)V", "", "W1", "()Z", "h", "", "exception", "e", "(Ljava/lang/Throwable;)Z", "d", "Z", "b1", "handlesException", "e1", "onCancelComplete", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.w0
/* loaded from: classes7.dex */
public class m2 extends r2 implements b0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean handlesException;

    public m2(@fg.m k2 k2Var) {
        super(true);
        l1(k2Var);
        this.handlesException = W1();
    }

    private final boolean W1() {
        r2 e02;
        v h12 = h1();
        w wVar = h12 instanceof w ? (w) h12 : null;
        if (wVar != null && (e02 = wVar.e0()) != null) {
            while (!e02.getHandlesException()) {
                v h13 = e02.h1();
                w wVar2 = h13 instanceof w ? (w) h13 : null;
                if (wVar2 != null && (e02 = wVar2.e0()) != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.r2
    /* renamed from: b1, reason: from getter */
    public boolean getHandlesException() {
        return this.handlesException;
    }

    @Override // kotlinx.coroutines.b0
    public boolean e(@fg.l Throwable exception) {
        return u1(new d0(exception, false, 2, null));
    }

    @Override // kotlinx.coroutines.r2
    public boolean e1() {
        return true;
    }

    @Override // kotlinx.coroutines.b0
    public boolean h() {
        return u1(kotlin.k2.f75408a);
    }
}
