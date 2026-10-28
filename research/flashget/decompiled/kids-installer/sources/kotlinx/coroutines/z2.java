package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0006\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/z2;", "Lkotlinx/coroutines/internal/w;", "Lkotlinx/coroutines/g2;", "", "state", "d1", "toString", "", "d", "()Z", "isActive", "x", "()Lkotlinx/coroutines/z2;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class z2 extends kotlinx.coroutines.internal.w implements g2 {
    @Override // kotlinx.coroutines.g2
    public boolean d() {
        return true;
    }

    @d5.d
    public final String d1(@d5.d String state) {
        StringBuilder a6 = androidx.appcompat.view.g.a(ProtectedSandApp.s("醑"), state, ProtectedSandApp.s("醒"));
        boolean z5 = true;
        for (kotlinx.coroutines.internal.y yVar = (kotlinx.coroutines.internal.y) K0(); !kotlin.jvm.internal.l0.g(yVar, this); yVar = yVar.L0()) {
            if (yVar instanceof t2) {
                t2 t2Var = (t2) yVar;
                if (z5) {
                    z5 = false;
                } else {
                    a6.append(ProtectedSandApp.s("醓"));
                }
                a6.append(t2Var);
            }
        }
        a6.append(ProtectedSandApp.s("醔"));
        String sb = a6.toString();
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("醕"));
        return sb;
    }

    @Override // kotlinx.coroutines.internal.y
    @d5.d
    public String toString() {
        return super.toString();
    }

    @Override // kotlinx.coroutines.g2
    @d5.d
    public z2 x() {
        return this;
    }
}
