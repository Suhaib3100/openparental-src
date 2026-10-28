package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/s1;", "Lkotlinx/coroutines/g2;", "", "toString", "", "o", "Z", "d", "()Z", "isActive", "Lkotlinx/coroutines/z2;", "x", "()Lkotlinx/coroutines/z2;", "list", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
final class s1 implements g2 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean isActive;

    public s1(boolean z5) {
        this.isActive = z5;
    }

    @Override // kotlinx.coroutines.g2
    /* renamed from: d, reason: from getter */
    public boolean getIsActive() {
        return this.isActive;
    }

    @d5.d
    public String toString() {
        return c1.c.a(new StringBuilder(ProtectedSandApp.s("帙")), this.isActive ? ProtectedSandApp.s("帚") : ProtectedSandApp.s("帛"), '}');
    }

    @Override // kotlinx.coroutines.g2
    @d5.e
    /* renamed from: x */
    public z2 getList() {
        return null;
    }
}
