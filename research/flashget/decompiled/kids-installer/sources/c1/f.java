package c1;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: InstallEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/flashget/kidsdownloader/event/InstallStatusEvent;", "", "action", "Lcom/flashget/kidsdownloader/event/InstallAction;", "(Lcom/flashget/kidsdownloader/event/InstallAction;)V", "getAction", "()Lcom/flashget/kidsdownloader/event/InstallAction;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Install_intlRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final e f10672a;

    public f(@d5.d e eVar) {
        l0.p(eVar, ProtectedSandApp.s("\u008a"));
        this.f10672a = eVar;
    }

    public static /* synthetic */ f c(f fVar, e eVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            eVar = fVar.f10672a;
        }
        return fVar.b(eVar);
    }

    @d5.d
    /* renamed from: a, reason: from getter */
    public final e getF10672a() {
        return this.f10672a;
    }

    @d5.d
    public final f b(@d5.d e eVar) {
        l0.p(eVar, ProtectedSandApp.s("\u008b"));
        return new f(eVar);
    }

    @d5.d
    public final e d() {
        return this.f10672a;
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof f) && this.f10672a == ((f) other).f10672a;
    }

    public int hashCode() {
        return this.f10672a.hashCode();
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("\u008c") + this.f10672a + ')';
    }
}
