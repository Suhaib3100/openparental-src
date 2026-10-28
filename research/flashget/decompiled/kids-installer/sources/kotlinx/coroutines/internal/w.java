package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.m2;

/* compiled from: LockFreeLinkedList.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\fJ-\u0010\u0007\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0003\u0018\u0001*\u00060\u0001j\u0002`\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bJ\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0014J\u000f\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/internal/w;", "Lkotlinx/coroutines/internal/y;", "Lkotlinx/coroutines/internal/Node;", "T", "Lkotlin/Function1;", "Lkotlin/m2;", "block", "Z0", "", "b1", "R0", "c1", "()V", "", "a1", "()Z", "isEmpty", "P0", "isRemoved", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public class w extends y {
    @Override // kotlinx.coroutines.internal.y
    public boolean P0() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.y
    @d5.e
    protected y R0() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.y
    public /* bridge */ /* synthetic */ boolean S0() {
        return ((Boolean) b1()).booleanValue();
    }

    public final <T extends y> void Z0(q3.l<? super T, m2> lVar) {
        for (y yVar = (y) K0(); !kotlin.jvm.internal.l0.g(yVar, this); yVar = yVar.L0()) {
            kotlin.jvm.internal.l0.P();
            if (yVar instanceof y) {
                lVar.N(yVar);
            }
        }
    }

    public final boolean a1() {
        return K0() == this;
    }

    @d5.d
    public final Void b1() {
        throw new IllegalStateException(ProtectedSandApp.s("帆").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.y] */
    public final void c1() {
        w wVar = this;
        w wVar2 = (y) K0();
        while (!kotlin.jvm.internal.l0.g(wVar2, this)) {
            y L0 = wVar2.L0();
            wVar2.Y0(wVar, L0);
            wVar = wVar2;
            wVar2 = L0;
        }
        Y0(wVar, (y) K0());
    }
}
