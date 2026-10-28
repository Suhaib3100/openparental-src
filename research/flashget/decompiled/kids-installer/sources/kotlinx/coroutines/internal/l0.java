package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: LockFreeLinkedList.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\b\u001a\u00060\u0004j\u0002`\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/internal/l0;", "", "", "toString", "Lkotlinx/coroutines/internal/y;", "Lkotlinx/coroutines/internal/Node;", "a", "Lkotlinx/coroutines/internal/y;", "ref", "<init>", "(Lkotlinx/coroutines/internal/y;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
final class l0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final y ref;

    public l0(@d5.d y yVar) {
        this.ref = yVar;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("巜") + this.ref + ']';
    }
}
