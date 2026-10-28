package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/p1;", "Lkotlinx/coroutines/d2;", "", "isActive", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "b", "Z", "()Z", "Lkotlinx/coroutines/w2;", "a", "()Lkotlinx/coroutines/w2;", "list", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class p1 implements d2 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isActive;

    public p1(boolean z4) {
        this.isActive = z4;
    }

    @Override // kotlinx.coroutines.d2
    @fg.m
    /* renamed from: a */
    public w2 getList() {
        return null;
    }

    @Override // kotlinx.coroutines.d2
    /* renamed from: isActive, reason: from getter */
    public boolean getIsActive() {
        return this.isActive;
    }

    @fg.l
    public String toString() {
        return androidx.compose.foundation.layout.f3.a(new StringBuilder(ProtectedSandApp.s("蠱\u0001")), this.isActive ? ProtectedSandApp.s("蠲\u0001") : ProtectedSandApp.s("蠳\u0001"), '}');
    }
}
