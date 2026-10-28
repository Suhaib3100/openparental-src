package kotlin.reflect.jvm.internal.impl.name;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.List;

/* compiled from: FqName.java */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f77572c = new c("");

    /* renamed from: a, reason: collision with root package name */
    @l
    private final d f77573a;

    /* renamed from: b, reason: collision with root package name */
    private transient c f77574b;

    public c(@l String str) {
        if (str == null) {
            a(1);
        }
        this.f77573a = new d(str, this);
    }

    private static /* synthetic */ void a(int i4) {
        String s4;
        int i5;
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                s4 = ProtectedSandApp.s("痹\u0001");
                break;
            case 8:
            default:
                s4 = ProtectedSandApp.s("痸\u0001");
                break;
        }
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i5 = 2;
                break;
            case 8:
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        String s5 = ProtectedSandApp.s("痺\u0001");
        String s6 = ProtectedSandApp.s("痻\u0001");
        switch (i4) {
            case 1:
            case 2:
            case 3:
                objArr[0] = ProtectedSandApp.s("瘀\u0001");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = s5;
                break;
            case 8:
                objArr[0] = ProtectedSandApp.s("痿\u0001");
                break;
            case 12:
                objArr[0] = ProtectedSandApp.s("痾\u0001");
                break;
            case 13:
                objArr[0] = ProtectedSandApp.s("痽\u0001");
                break;
            case 14:
                objArr[0] = s6;
                break;
            default:
                objArr[0] = ProtectedSandApp.s("痼\u0001");
                break;
        }
        switch (i4) {
            case 4:
                objArr[1] = ProtectedSandApp.s("瘅\u0001");
                break;
            case 5:
                objArr[1] = ProtectedSandApp.s("瘄\u0001");
                break;
            case 6:
            case 7:
                objArr[1] = ProtectedSandApp.s("瘃\u0001");
                break;
            case 8:
            default:
                objArr[1] = s5;
                break;
            case 9:
                objArr[1] = s6;
                break;
            case 10:
                objArr[1] = ProtectedSandApp.s("瘂\u0001");
                break;
            case 11:
                objArr[1] = ProtectedSandApp.s("瘁\u0001");
                break;
        }
        switch (i4) {
            case 1:
            case 2:
            case 3:
                objArr[2] = ProtectedSandApp.s("瘊\u0001");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = ProtectedSandApp.s("瘉\u0001");
                break;
            case 12:
            case 13:
                objArr[2] = ProtectedSandApp.s("瘈\u0001");
                break;
            case 14:
                objArr[2] = ProtectedSandApp.s("瘇\u0001");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("瘆\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            case 8:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @l
    public static c k(@l f fVar) {
        if (fVar == null) {
            a(14);
        }
        return new c(d.m(fVar));
    }

    @l
    public String b() {
        String b5 = this.f77573a.b();
        if (b5 == null) {
            a(4);
        }
        return b5;
    }

    @l
    public c c(@l f fVar) {
        if (fVar == null) {
            a(8);
        }
        return new c(this.f77573a.c(fVar), this);
    }

    public boolean d() {
        return this.f77573a.e();
    }

    @l
    public c e() {
        c cVar = this.f77574b;
        if (cVar != null) {
            if (cVar == null) {
                a(6);
            }
            return cVar;
        }
        if (this.f77573a.e()) {
            throw new IllegalStateException(ProtectedSandApp.s("瘋\u0001"));
        }
        c cVar2 = new c(this.f77573a.g());
        this.f77574b = cVar2;
        return cVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f77573a.equals(((c) obj).f77573a);
    }

    @l
    public List<f> f() {
        List<f> h4 = this.f77573a.h();
        if (h4 == null) {
            a(11);
        }
        return h4;
    }

    @l
    public f g() {
        f i4 = this.f77573a.i();
        if (i4 == null) {
            a(9);
        }
        return i4;
    }

    @l
    public f h() {
        f j4 = this.f77573a.j();
        if (j4 == null) {
            a(10);
        }
        return j4;
    }

    public int hashCode() {
        return this.f77573a.hashCode();
    }

    public boolean i(@l f fVar) {
        if (fVar == null) {
            a(12);
        }
        return this.f77573a.k(fVar);
    }

    @l
    public d j() {
        d dVar = this.f77573a;
        if (dVar == null) {
            a(5);
        }
        return dVar;
    }

    public String toString() {
        return this.f77573a.toString();
    }

    public c(@l d dVar) {
        if (dVar == null) {
            a(2);
        }
        this.f77573a = dVar;
    }

    private c(@l d dVar, c cVar) {
        if (dVar == null) {
            a(3);
        }
        this.f77573a = dVar;
        this.f77574b = cVar;
    }
}
