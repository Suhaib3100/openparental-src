package kotlin.reflect.jvm.internal.impl.name;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: Name.java */
/* loaded from: classes5.dex */
public final class f implements Comparable<f> {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final String f25601o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f25602p;

    private f(@d5.d String str, boolean z5) {
        if (str == null) {
            g(0);
        }
        this.f25601o = str;
        this.f25602p = z5;
    }

    private static /* synthetic */ void g(int i5) {
        String s5 = (i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4) ? ProtectedSandApp.s("亓") : ProtectedSandApp.s("互");
        Object[] objArr = new Object[(i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4) ? 2 : 3];
        String s6 = ProtectedSandApp.s("五");
        if (i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4) {
            objArr[0] = s6;
        } else {
            objArr[0] = ProtectedSandApp.s("井");
        }
        if (i5 == 1) {
            objArr[1] = ProtectedSandApp.s("亘");
        } else if (i5 == 2) {
            objArr[1] = ProtectedSandApp.s("亗");
        } else if (i5 == 3 || i5 == 4) {
            objArr[1] = ProtectedSandApp.s("亖");
        } else {
            objArr[1] = s6;
        }
        switch (i5) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = ProtectedSandApp.s("亝");
                break;
            case 6:
                objArr[2] = ProtectedSandApp.s("亜");
                break;
            case 7:
                objArr[2] = ProtectedSandApp.s("些");
                break;
            case 8:
                objArr[2] = ProtectedSandApp.s("亚");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("亙");
                break;
        }
        String format = String.format(s5, objArr);
        if (i5 != 1 && i5 != 2 && i5 != 3 && i5 != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @d5.d
    public static f o(@d5.d String str) {
        if (str == null) {
            g(8);
        }
        return str.startsWith(ProtectedSandApp.s("亞")) ? s(str) : p(str);
    }

    @d5.d
    public static f p(@d5.d String str) {
        if (str == null) {
            g(5);
        }
        return new f(str, false);
    }

    public static boolean r(@d5.d String str) {
        if (str == null) {
            g(6);
        }
        if (str.isEmpty() || str.startsWith(ProtectedSandApp.s("亟"))) {
            return false;
        }
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    @d5.d
    public static f s(@d5.d String str) {
        if (str == null) {
            g(7);
        }
        if (str.startsWith(ProtectedSandApp.s("亠"))) {
            return new f(str, true);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("亡").concat(str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f25602p == fVar.f25602p && this.f25601o.equals(fVar.f25601o);
    }

    @d5.d
    public String h() {
        String str = this.f25601o;
        if (str == null) {
            g(1);
        }
        return str;
    }

    public int hashCode() {
        return (this.f25601o.hashCode() * 31) + (this.f25602p ? 1 : 0);
    }

    @Override // java.lang.Comparable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        return this.f25601o.compareTo(fVar.f25601o);
    }

    @d5.d
    public String l() {
        if (this.f25602p) {
            throw new IllegalStateException(ProtectedSandApp.s("亢") + this);
        }
        String h5 = h();
        if (h5 == null) {
            g(2);
        }
        return h5;
    }

    public boolean q() {
        return this.f25602p;
    }

    public String toString() {
        return this.f25601o;
    }
}
