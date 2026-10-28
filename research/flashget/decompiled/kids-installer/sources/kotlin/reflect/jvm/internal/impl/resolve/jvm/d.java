package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.text.Typography;
import org.apache.commons.io.k;
import org.apache.commons.io.n;

/* compiled from: JvmClassName.java */
/* loaded from: classes5.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f25940a;

    /* renamed from: b, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.name.c f25941b;

    private d(@d5.d String str) {
        if (str == null) {
            a(5);
        }
        this.f25940a = str;
    }

    private static /* synthetic */ void a(int i5) {
        String s5 = (i5 == 3 || i5 == 6 || i5 == 7 || i5 == 8) ? ProtectedSandApp.s("剮") : ProtectedSandApp.s("剭");
        Object[] objArr = new Object[(i5 == 3 || i5 == 6 || i5 == 7 || i5 == 8) ? 2 : 3];
        String s6 = ProtectedSandApp.s("副");
        switch (i5) {
            case 1:
                objArr[0] = ProtectedSandApp.s("割");
                break;
            case 2:
            case 4:
                objArr[0] = ProtectedSandApp.s("剱");
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = s6;
                break;
            case 5:
            default:
                objArr[0] = ProtectedSandApp.s("剰");
                break;
        }
        String s7 = ProtectedSandApp.s("剳");
        if (i5 == 3) {
            objArr[1] = s7;
        } else if (i5 == 6) {
            objArr[1] = ProtectedSandApp.s("剶");
        } else if (i5 == 7) {
            objArr[1] = ProtectedSandApp.s("創");
        } else if (i5 != 8) {
            objArr[1] = s6;
        } else {
            objArr[1] = ProtectedSandApp.s("剴");
        }
        switch (i5) {
            case 1:
                objArr[2] = ProtectedSandApp.s("剹");
                break;
            case 2:
            case 4:
                objArr[2] = s7;
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = ProtectedSandApp.s("剸");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("剷");
                break;
        }
        String format = String.format(s5, objArr);
        if (i5 != 3 && i5 != 6 && i5 != 7 && i5 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @d5.d
    public static d b(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
        if (bVar == null) {
            a(1);
        }
        kotlin.reflect.jvm.internal.impl.name.c h5 = bVar.h();
        String replace = bVar.i().b().replace(k.f32026a, Typography.f27127c);
        if (h5.d()) {
            return new d(replace);
        }
        return new d(h5.b().replace(k.f32026a, n.f32060b) + ProtectedSandApp.s("剺") + replace);
    }

    @d5.d
    public static d c(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (cVar == null) {
            a(2);
        }
        d dVar = new d(cVar.b().replace(k.f32026a, n.f32060b));
        dVar.f25941b = cVar;
        return dVar;
    }

    @d5.d
    public static d d(@d5.d String str) {
        if (str == null) {
            a(0);
        }
        return new d(str);
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.c e() {
        return new kotlin.reflect.jvm.internal.impl.name.c(this.f25940a.replace(n.f32060b, k.f32026a));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f25940a.equals(((d) obj).f25940a);
    }

    @d5.d
    public String f() {
        String str = this.f25940a;
        if (str == null) {
            a(8);
        }
        return str;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.c g() {
        int lastIndexOf = this.f25940a.lastIndexOf(ProtectedSandApp.s("剻"));
        if (lastIndexOf != -1) {
            return new kotlin.reflect.jvm.internal.impl.name.c(this.f25940a.substring(0, lastIndexOf).replace(n.f32060b, k.f32026a));
        }
        kotlin.reflect.jvm.internal.impl.name.c cVar = kotlin.reflect.jvm.internal.impl.name.c.f25590c;
        if (cVar == null) {
            a(7);
        }
        return cVar;
    }

    public int hashCode() {
        return this.f25940a.hashCode();
    }

    public String toString() {
        return this.f25940a;
    }
}
