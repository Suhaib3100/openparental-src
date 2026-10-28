package ud;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.Serializable;
import kotlin.jvm.internal.w;

/* compiled from: LookupLocation.kt */
/* loaded from: classes8.dex */
public final class e implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    @l
    public static final a f92760d = new a();

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final e f92761e = new e(-1, -1);

    /* renamed from: b, reason: collision with root package name */
    private final int f92762b;

    /* renamed from: c, reason: collision with root package name */
    private final int f92763c;

    /* compiled from: LookupLocation.kt */
    public static final class a {
        private a() {
        }

        @l
        public final e a() {
            return e.f92761e;
        }

        public a(w wVar) {
        }
    }

    public e(int i4, int i5) {
        this.f92762b = i4;
        this.f92763c = i5;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f92762b == eVar.f92762b && this.f92763c == eVar.f92763c;
    }

    public int hashCode() {
        return Integer.hashCode(this.f92763c) + (Integer.hashCode(this.f92762b) * 31);
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꌾ\u0001"));
        sb.append(this.f92762b);
        sb.append(ProtectedSandApp.s("ꌿ\u0001"));
        return androidx.view.e.a(sb, this.f92763c, ')');
    }
}
