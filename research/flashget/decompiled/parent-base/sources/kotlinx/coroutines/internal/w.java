package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: LockFreeLinkedList.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\t\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0005\u0018\u0001*\u00060\u0001j\u0002`\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u0003R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/internal/w;", "Lkotlinx/coroutines/internal/y;", "<init>", "()V", "Lkotlinx/coroutines/internal/Node;", "T", "Lkotlin/Function1;", "Lkotlin/k2;", "block", "Z", "(Lld/l;)V", "", "f0", "()Ljava/lang/Void;", "C", "()Lkotlinx/coroutines/internal/y;", "g0", "", "e0", "()Z", "isEmpty", "v", "isRemoved", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class w extends y {
    @Override // kotlinx.coroutines.internal.y
    @fg.m
    protected y C() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.y
    public /* bridge */ /* synthetic */ boolean D() {
        return ((Boolean) f0()).booleanValue();
    }

    public final <T extends y> void Z(ld.l<? super T, k2> block) {
        Object q4 = q();
        kotlin.jvm.internal.l0.n(q4, ProtectedSandApp.s("蠎\u0001"));
        for (y yVar = (y) q4; !kotlin.jvm.internal.l0.g(yVar, this); yVar = yVar.r()) {
            kotlin.jvm.internal.l0.P();
            if (yVar != null) {
                block.invoke(yVar);
            }
        }
    }

    public final boolean e0() {
        return q() == this;
    }

    @fg.l
    public final Void f0() {
        throw new IllegalStateException(ProtectedSandApp.s("蠏\u0001"));
    }

    public final void g0() {
        Object q4 = q();
        String s4 = ProtectedSandApp.s("蠎\u0001");
        kotlin.jvm.internal.l0.n(q4, s4);
        for (y yVar = (y) q4; !kotlin.jvm.internal.l0.g(yVar, this); yVar = yVar.r()) {
        }
        Object q5 = q();
        kotlin.jvm.internal.l0.n(q5, s4);
    }

    @Override // kotlinx.coroutines.internal.y
    public boolean v() {
        return false;
    }
}
