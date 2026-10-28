package kotlin.reflect.jvm.internal.impl.name;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: FqName.java */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f25590c = new c("");

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final d f25591a;

    /* renamed from: b, reason: collision with root package name */
    private transient c f25592b;

    public c(@d5.d String str) {
        if (str == null) {
            a(1);
        }
        this.f25591a = new d(str, this);
    }

    private static /* synthetic */ void a(int i5) {
        String s5;
        int i6;
        switch (i5) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                s5 = ProtectedSandApp.s("乛");
                break;
            case 8:
            default:
                s5 = ProtectedSandApp.s("乚");
                break;
        }
        switch (i5) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i6 = 2;
                break;
            case 8:
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        String s6 = ProtectedSandApp.s("乜");
        String s7 = ProtectedSandApp.s("九");
        switch (i5) {
            case 1:
            case 2:
            case 3:
                objArr[0] = ProtectedSandApp.s("乡");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = s7;
                break;
            case 8:
                objArr[0] = ProtectedSandApp.s("习");
                break;
            case 12:
                objArr[0] = ProtectedSandApp.s("也");
                break;
            case 13:
                objArr[0] = s6;
                break;
            default:
                objArr[0] = ProtectedSandApp.s("乞");
                break;
        }
        switch (i5) {
            case 4:
                objArr[1] = ProtectedSandApp.s("书");
                break;
            case 5:
                objArr[1] = ProtectedSandApp.s("乥");
                break;
            case 6:
            case 7:
                objArr[1] = ProtectedSandApp.s("乤");
                break;
            case 8:
            default:
                objArr[1] = s7;
                break;
            case 9:
                objArr[1] = s6;
                break;
            case 10:
                objArr[1] = ProtectedSandApp.s("乣");
                break;
            case 11:
                objArr[1] = ProtectedSandApp.s("乢");
                break;
        }
        switch (i5) {
            case 1:
            case 2:
            case 3:
                objArr[2] = ProtectedSandApp.s("乫");
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
                objArr[2] = ProtectedSandApp.s("乪");
                break;
            case 12:
                objArr[2] = ProtectedSandApp.s("乩");
                break;
            case 13:
                objArr[2] = ProtectedSandApp.s("乨");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("乧");
                break;
        }
        String format = String.format(s5, objArr);
        switch (i5) {
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

    @d5.d
    public static c k(@d5.d f fVar) {
        if (fVar == null) {
            a(13);
        }
        return new c(d.m(fVar));
    }

    @d5.d
    public String b() {
        String b6 = this.f25591a.b();
        if (b6 == null) {
            a(4);
        }
        return b6;
    }

    @d5.d
    public c c(@d5.d f fVar) {
        if (fVar == null) {
            a(8);
        }
        return new c(this.f25591a.c(fVar), this);
    }

    public boolean d() {
        return this.f25591a.e();
    }

    @d5.d
    public c e() {
        c cVar = this.f25592b;
        if (cVar != null) {
            if (cVar == null) {
                a(6);
            }
            return cVar;
        }
        if (d()) {
            throw new IllegalStateException(ProtectedSandApp.s("乬"));
        }
        c cVar2 = new c(this.f25591a.g());
        this.f25592b = cVar2;
        return cVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f25591a.equals(((c) obj).f25591a);
    }

    @d5.d
    public List<f> f() {
        List<f> h5 = this.f25591a.h();
        if (h5 == null) {
            a(11);
        }
        return h5;
    }

    @d5.d
    public f g() {
        f i5 = this.f25591a.i();
        if (i5 == null) {
            a(9);
        }
        return i5;
    }

    @d5.d
    public f h() {
        f j5 = this.f25591a.j();
        if (j5 == null) {
            a(10);
        }
        return j5;
    }

    public int hashCode() {
        return this.f25591a.hashCode();
    }

    public boolean i(@d5.d f fVar) {
        if (fVar == null) {
            a(12);
        }
        return this.f25591a.k(fVar);
    }

    @d5.d
    public d j() {
        d dVar = this.f25591a;
        if (dVar == null) {
            a(5);
        }
        return dVar;
    }

    public String toString() {
        return this.f25591a.toString();
    }

    public c(@d5.d d dVar) {
        if (dVar == null) {
            a(2);
        }
        this.f25591a = dVar;
    }

    private c(@d5.d d dVar, c cVar) {
        if (dVar == null) {
            a(3);
        }
        this.f25591a = dVar;
        this.f25592b = cVar;
    }
}
