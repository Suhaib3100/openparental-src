package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: Scopes.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/internal/h;", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlin/coroutines/g;)V", "", "toString", "()Ljava/lang/String;", "b", "Lkotlin/coroutines/g;", "q", "()Lkotlin/coroutines/g;", "coroutineContext", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class h implements kotlinx.coroutines.r0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.g coroutineContext;

    public h(@fg.l kotlin.coroutines.g gVar) {
        this.coroutineContext = gVar;
    }

    @Override // kotlinx.coroutines.r0
    @fg.l
    /* renamed from: q, reason: from getter */
    public kotlin.coroutines.g getCoroutineContext() {
        return this.coroutineContext;
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("蟦\u0001") + this.coroutineContext + ')';
    }
}
