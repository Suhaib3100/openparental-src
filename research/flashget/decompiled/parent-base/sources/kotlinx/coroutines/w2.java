package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/w2;", "Lkotlinx/coroutines/internal/w;", "Lkotlinx/coroutines/d2;", "<init>", "()V", "", "state", "h0", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "", "isActive", "()Z", "a", "()Lkotlinx/coroutines/w2;", "list", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1454:1\n341#2,6:1455\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n*L\n1364#1:1455,6\n*E\n"})
/* loaded from: classes7.dex */
public final class w2 extends kotlinx.coroutines.internal.w implements d2 {
    @Override // kotlinx.coroutines.d2
    @fg.l
    public w2 a() {
        return this;
    }

    @fg.l
    public final String h0(@fg.l String state) {
        StringBuilder a5 = androidx.appcompat.view.g.a(ProtectedSandApp.s("褔\u0001"), state, ProtectedSandApp.s("褕\u0001"));
        Object q4 = q();
        kotlin.jvm.internal.l0.n(q4, ProtectedSandApp.s("褖\u0001"));
        boolean z4 = true;
        for (kotlinx.coroutines.internal.y yVar = (kotlinx.coroutines.internal.y) q4; !kotlin.jvm.internal.l0.g(yVar, this); yVar = yVar.r()) {
            if (yVar instanceof q2) {
                q2 q2Var = (q2) yVar;
                if (z4) {
                    z4 = false;
                } else {
                    a5.append(ProtectedSandApp.s("褗\u0001"));
                }
                a5.append(q2Var);
            }
        }
        a5.append(ProtectedSandApp.s("褘\u0001"));
        String sb = a5.toString();
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("褙\u0001"));
        return sb;
    }

    @Override // kotlinx.coroutines.d2
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.y
    @fg.l
    public String toString() {
        return super.toString();
    }
}
