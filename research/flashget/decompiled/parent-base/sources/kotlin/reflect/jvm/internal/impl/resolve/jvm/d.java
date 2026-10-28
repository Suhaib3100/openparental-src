package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;

/* compiled from: JvmClassName.java */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f77923a;

    /* renamed from: b, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.name.c f77924b;

    private d(@l String str) {
        if (str == null) {
            a(5);
        }
        this.f77923a = str;
    }

    private static /* synthetic */ void a(int i4) {
        String s4 = (i4 == 3 || i4 == 6 || i4 == 7 || i4 == 8) ? ProtectedSandApp.s("禧\u0001") : ProtectedSandApp.s("禦\u0001");
        Object[] objArr = new Object[(i4 == 3 || i4 == 6 || i4 == 7 || i4 == 8) ? 2 : 3];
        String s5 = ProtectedSandApp.s("禨\u0001");
        switch (i4) {
            case 1:
                objArr[0] = ProtectedSandApp.s("禫\u0001");
                break;
            case 2:
            case 4:
                objArr[0] = ProtectedSandApp.s("禪\u0001");
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = s5;
                break;
            case 5:
            default:
                objArr[0] = ProtectedSandApp.s("禩\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("禬\u0001");
        if (i4 == 3) {
            objArr[1] = s6;
        } else if (i4 == 6) {
            objArr[1] = ProtectedSandApp.s("禯\u0001");
        } else if (i4 == 7) {
            objArr[1] = ProtectedSandApp.s("禮\u0001");
        } else if (i4 != 8) {
            objArr[1] = s5;
        } else {
            objArr[1] = ProtectedSandApp.s("禭\u0001");
        }
        switch (i4) {
            case 1:
                objArr[2] = ProtectedSandApp.s("禲\u0001");
                break;
            case 2:
            case 4:
                objArr[2] = s6;
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = ProtectedSandApp.s("禱\u0001");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("禰\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        if (i4 != 3 && i4 != 6 && i4 != 7 && i4 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @l
    public static d b(@l kotlin.reflect.jvm.internal.impl.name.b bVar) {
        if (bVar == null) {
            a(1);
        }
        kotlin.reflect.jvm.internal.impl.name.c h4 = bVar.h();
        String replace = bVar.i().b().replace('.', '$');
        if (h4.d()) {
            return new d(replace);
        }
        return new d(h4.b().replace('.', '/') + ProtectedSandApp.s("禳\u0001") + replace);
    }

    @l
    public static d c(@l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (cVar == null) {
            a(2);
        }
        d dVar = new d(cVar.b().replace('.', '/'));
        dVar.f77924b = cVar;
        return dVar;
    }

    @l
    public static d d(@l String str) {
        if (str == null) {
            a(0);
        }
        return new d(str);
    }

    @l
    public kotlin.reflect.jvm.internal.impl.name.c e() {
        return new kotlin.reflect.jvm.internal.impl.name.c(this.f77923a.replace('/', '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f77923a.equals(((d) obj).f77923a);
    }

    @l
    public String f() {
        String str = this.f77923a;
        if (str == null) {
            a(8);
        }
        return str;
    }

    @l
    public kotlin.reflect.jvm.internal.impl.name.c g() {
        int lastIndexOf = this.f77923a.lastIndexOf(ProtectedSandApp.s("禳\u0001"));
        if (lastIndexOf != -1) {
            return new kotlin.reflect.jvm.internal.impl.name.c(this.f77923a.substring(0, lastIndexOf).replace('/', '.'));
        }
        kotlin.reflect.jvm.internal.impl.name.c cVar = kotlin.reflect.jvm.internal.impl.name.c.f77572c;
        if (cVar == null) {
            a(7);
        }
        return cVar;
    }

    public int hashCode() {
        return this.f77923a.hashCode();
    }

    public String toString() {
        return this.f77923a;
    }
}
