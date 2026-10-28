package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: NullabilityQualifierWithMigrationStatus.kt */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final h f76721a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f76722b;

    public i(@fg.l h hVar, boolean z4) {
        l0.p(hVar, ProtectedSandApp.s("犰\u0001"));
        this.f76721a = hVar;
        this.f76722b = z4;
    }

    public static /* synthetic */ i b(i iVar, h hVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            hVar = iVar.f76721a;
        }
        if ((i4 & 2) != 0) {
            z4 = iVar.f76722b;
        }
        return iVar.a(hVar, z4);
    }

    @fg.l
    public final i a(@fg.l h hVar, boolean z4) {
        l0.p(hVar, ProtectedSandApp.s("犰\u0001"));
        return new i(hVar, z4);
    }

    @fg.l
    public final h c() {
        return this.f76721a;
    }

    public final boolean d() {
        return this.f76722b;
    }

    public boolean equals(@fg.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f76721a == iVar.f76721a && this.f76722b == iVar.f76722b;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f76722b) + (this.f76721a.hashCode() * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("犱\u0001"));
        sb.append(this.f76721a);
        sb.append(ProtectedSandApp.s("犲\u0001"));
        return androidx.compose.animation.l.a(sb, this.f76722b, ')');
    }

    public /* synthetic */ i(h hVar, boolean z4, int i4, w wVar) {
        this(hVar, (i4 & 2) != 0 ? false : z4);
    }
}
