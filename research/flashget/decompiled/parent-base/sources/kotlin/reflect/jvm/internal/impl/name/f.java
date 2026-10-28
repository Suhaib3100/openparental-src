package kotlin.reflect.jvm.internal.impl.name;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;

/* compiled from: Name.java */
/* loaded from: classes7.dex */
public final class f implements Comparable<f> {

    /* renamed from: b, reason: collision with root package name */
    @l
    private final String f77583b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f77584c;

    private f(@l String str, boolean z4) {
        if (str == null) {
            a(0);
        }
        this.f77583b = str;
        this.f77584c = z4;
    }

    private static /* synthetic */ void a(int i4) {
        String s4 = (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4) ? ProtectedSandApp.s("瘫\u0001") : ProtectedSandApp.s("瘪\u0001");
        Object[] objArr = new Object[(i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4) ? 2 : 3];
        String s5 = ProtectedSandApp.s("瘬\u0001");
        if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4) {
            objArr[0] = s5;
        } else {
            objArr[0] = ProtectedSandApp.s("瘭\u0001");
        }
        if (i4 == 1) {
            objArr[1] = ProtectedSandApp.s("瘰\u0001");
        } else if (i4 == 2) {
            objArr[1] = ProtectedSandApp.s("瘯\u0001");
        } else if (i4 == 3 || i4 == 4) {
            objArr[1] = ProtectedSandApp.s("瘮\u0001");
        } else {
            objArr[1] = s5;
        }
        switch (i4) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = ProtectedSandApp.s("瘶\u0001");
                break;
            case 6:
                objArr[2] = ProtectedSandApp.s("瘵\u0001");
                break;
            case 7:
                objArr[2] = ProtectedSandApp.s("瘴\u0001");
                break;
            case 8:
                objArr[2] = ProtectedSandApp.s("瘳\u0001");
                break;
            case 9:
                objArr[2] = ProtectedSandApp.s("瘲\u0001");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("瘱\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @l
    public static f e(@l String str) {
        if (str == null) {
            a(9);
        }
        return str.startsWith(ProtectedSandApp.s("瘷\u0001")) ? i(str) : f(str);
    }

    @l
    public static f f(@l String str) {
        if (str == null) {
            a(5);
        }
        return new f(str, false);
    }

    public static boolean h(@l String str) {
        if (str == null) {
            a(6);
        }
        if (str.isEmpty() || str.startsWith(ProtectedSandApp.s("瘷\u0001"))) {
            return false;
        }
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    @l
    public static f i(@l String str) {
        if (str == null) {
            a(8);
        }
        if (str.startsWith(ProtectedSandApp.s("瘷\u0001"))) {
            return new f(str, true);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("瘸\u0001").concat(str));
    }

    @l
    public String b() {
        String str = this.f77583b;
        if (str == null) {
            a(1);
        }
        return str;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        return this.f77583b.compareTo(fVar.f77583b);
    }

    @l
    public String d() {
        if (this.f77584c) {
            throw new IllegalStateException(ProtectedSandApp.s("瘹\u0001") + this);
        }
        String b5 = b();
        if (b5 == null) {
            a(2);
        }
        return b5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f77584c == fVar.f77584c && this.f77583b.equals(fVar.f77583b);
    }

    public boolean g() {
        return this.f77584c;
    }

    public int hashCode() {
        return (this.f77583b.hashCode() * 31) + (this.f77584c ? 1 : 0);
    }

    public String toString() {
        return this.f77583b;
    }
}
