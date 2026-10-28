package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: NullabilityQualifierWithMigrationStatus.kt */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final h f24845a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24846b;

    public i(@d5.d h hVar, boolean z5) {
        l0.p(hVar, ProtectedSandApp.s("䫿"));
        this.f24845a = hVar;
        this.f24846b = z5;
    }

    public static /* synthetic */ i b(i iVar, h hVar, boolean z5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            hVar = iVar.f24845a;
        }
        if ((i5 & 2) != 0) {
            z5 = iVar.f24846b;
        }
        return iVar.a(hVar, z5);
    }

    @d5.d
    public final i a(@d5.d h hVar, boolean z5) {
        l0.p(hVar, ProtectedSandApp.s("䬀"));
        return new i(hVar, z5);
    }

    @d5.d
    public final h c() {
        return this.f24845a;
    }

    public final boolean d() {
        return this.f24846b;
    }

    public boolean equals(@d5.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f24845a == iVar.f24845a && this.f24846b == iVar.f24846b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f24845a.hashCode() * 31;
        boolean z5 = this.f24846b;
        int i5 = z5;
        if (z5 != 0) {
            i5 = 1;
        }
        return hashCode + i5;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("䬁") + this.f24845a + ProtectedSandApp.s("䬂") + this.f24846b + ')';
    }

    public /* synthetic */ i(h hVar, boolean z5, int i5, w wVar) {
        this(hVar, (i5 & 2) != 0 ? false : z5);
    }
}
