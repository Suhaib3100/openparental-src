package z3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Serializable;
import kotlin.jvm.internal.w;

/* compiled from: LookupLocation.kt */
/* loaded from: classes5.dex */
public final class e implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    public static final a f34405q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    private static final e f34406r = new e(-1, -1);

    /* renamed from: o, reason: collision with root package name */
    private final int f34407o;

    /* renamed from: p, reason: collision with root package name */
    private final int f34408p;

    /* compiled from: LookupLocation.kt */
    public static final class a {
        private a() {
        }

        @d5.d
        public final e a() {
            return e.f34406r;
        }

        public a(w wVar) {
        }
    }

    public e(int i5, int i6) {
        this.f34407o = i5;
        this.f34408p = i6;
    }

    public boolean equals(@d5.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f34407o == eVar.f34407o && this.f34408p == eVar.f34408p;
    }

    public int hashCode() {
        return Integer.hashCode(this.f34408p) + (Integer.hashCode(this.f34407o) * 31);
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("正") + this.f34407o + ProtectedSandApp.s("此") + this.f34408p + ')';
    }
}
