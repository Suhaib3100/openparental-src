package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Scopes.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/j;", "Lkotlinx/coroutines/u0;", "", "toString", "Lkotlin/coroutines/g;", "o", "Lkotlin/coroutines/g;", "b0", "()Lkotlin/coroutines/g;", "coroutineContext", "context", "<init>", "(Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class j implements kotlinx.coroutines.u0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final CoroutineContext coroutineContext;

    public j(@d5.d CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
    }

    @Override // kotlinx.coroutines.u0
    @d5.d
    /* renamed from: b0, reason: from getter */
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("巚") + this.coroutineContext + ')';
    }
}
