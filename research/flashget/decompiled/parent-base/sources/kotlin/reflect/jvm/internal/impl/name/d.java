package kotlin.reflect.jvm.internal.impl.name;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import ld.l;

/* compiled from: FqNameUnsafe.java */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    private static final f f77575e = f.i(ProtectedSandApp.s("瘌\u0001"));

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f77576f = Pattern.compile(ProtectedSandApp.s("瘍\u0001"));

    /* renamed from: g, reason: collision with root package name */
    private static final l<String, f> f77577g = new a();

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final String f77578a;

    /* renamed from: b, reason: collision with root package name */
    private transient c f77579b;

    /* renamed from: c, reason: collision with root package name */
    private transient d f77580c;

    /* renamed from: d, reason: collision with root package name */
    private transient f f77581d;

    /* compiled from: FqNameUnsafe.java */
    static class a implements l<String, f> {
        a() {
        }

        public f a(String str) {
            return f.e(str);
        }

        @Override // ld.l
        public f invoke(String str) {
            return f.e(str);
        }
    }

    d(@fg.l String str, @fg.l c cVar) {
        if (str == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        this.f77578a = str;
        this.f77579b = cVar;
    }

    private static /* synthetic */ void a(int i4) {
        String s4;
        int i5;
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                s4 = ProtectedSandApp.s("瘏\u0001");
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                s4 = ProtectedSandApp.s("瘎\u0001");
                break;
        }
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                i5 = 2;
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        String s5 = ProtectedSandApp.s("瘐\u0001");
        String s6 = ProtectedSandApp.s("瘑\u0001");
        if (i4 != 1) {
            switch (i4) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 18:
                    objArr[0] = s5;
                    break;
                case 9:
                    objArr[0] = ProtectedSandApp.s("瘕\u0001");
                    break;
                case 15:
                    objArr[0] = ProtectedSandApp.s("瘔\u0001");
                    break;
                case 16:
                    objArr[0] = ProtectedSandApp.s("瘓\u0001");
                    break;
                case 17:
                    objArr[0] = s6;
                    break;
                default:
                    objArr[0] = ProtectedSandApp.s("瘒\u0001");
                    break;
            }
        } else {
            objArr[0] = ProtectedSandApp.s("瘖\u0001");
        }
        switch (i4) {
            case 4:
                objArr[1] = ProtectedSandApp.s("瘜\u0001");
                break;
            case 5:
            case 6:
                objArr[1] = ProtectedSandApp.s("瘛\u0001");
                break;
            case 7:
            case 8:
                objArr[1] = ProtectedSandApp.s("瘚\u0001");
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                objArr[1] = s5;
                break;
            case 10:
            case 11:
                objArr[1] = s6;
                break;
            case 12:
            case 13:
                objArr[1] = ProtectedSandApp.s("瘙\u0001");
                break;
            case 14:
                objArr[1] = ProtectedSandApp.s("瘘\u0001");
                break;
            case 18:
                objArr[1] = ProtectedSandApp.s("瘗\u0001");
                break;
        }
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                break;
            case 9:
                objArr[2] = ProtectedSandApp.s("瘠\u0001");
                break;
            case 15:
            case 16:
                objArr[2] = ProtectedSandApp.s("瘟\u0001");
                break;
            case 17:
                objArr[2] = ProtectedSandApp.s("瘞\u0001");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("瘝\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                throw new IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    private void d() {
        int lastIndexOf = this.f77578a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f77581d = f.e(this.f77578a.substring(lastIndexOf + 1));
            this.f77580c = new d(this.f77578a.substring(0, lastIndexOf));
        } else {
            this.f77581d = f.e(this.f77578a);
            this.f77580c = c.f77572c.j();
        }
    }

    @fg.l
    public static d m(@fg.l f fVar) {
        if (fVar == null) {
            a(17);
        }
        return new d(fVar.b(), c.f77572c.j(), fVar);
    }

    @fg.l
    public String b() {
        String str = this.f77578a;
        if (str == null) {
            a(4);
        }
        return str;
    }

    @fg.l
    public d c(@fg.l f fVar) {
        String str;
        if (fVar == null) {
            a(9);
        }
        if (this.f77578a.isEmpty()) {
            str = fVar.b();
        } else {
            str = this.f77578a + ProtectedSandApp.s("瘡\u0001") + fVar.b();
        }
        return new d(str, this, fVar);
    }

    public boolean e() {
        return this.f77578a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f77578a.equals(((d) obj).f77578a);
    }

    public boolean f() {
        return this.f77579b != null || b().indexOf(60) < 0;
    }

    @fg.l
    public d g() {
        d dVar = this.f77580c;
        if (dVar != null) {
            if (dVar == null) {
                a(7);
            }
            return dVar;
        }
        if (this.f77578a.isEmpty()) {
            throw new IllegalStateException(ProtectedSandApp.s("瘢\u0001"));
        }
        d();
        d dVar2 = this.f77580c;
        if (dVar2 == null) {
            a(8);
        }
        return dVar2;
    }

    @fg.l
    public List<f> h() {
        List<f> emptyList = this.f77578a.isEmpty() ? Collections.emptyList() : kotlin.collections.l.ni(f77576f.split(this.f77578a), f77577g);
        if (emptyList == null) {
            a(14);
        }
        return emptyList;
    }

    public int hashCode() {
        return this.f77578a.hashCode();
    }

    @fg.l
    public f i() {
        f fVar = this.f77581d;
        if (fVar != null) {
            if (fVar == null) {
                a(10);
            }
            return fVar;
        }
        if (this.f77578a.isEmpty()) {
            throw new IllegalStateException(ProtectedSandApp.s("瘢\u0001"));
        }
        d();
        f fVar2 = this.f77581d;
        if (fVar2 == null) {
            a(11);
        }
        return fVar2;
    }

    @fg.l
    public f j() {
        if (this.f77578a.isEmpty()) {
            f fVar = f77575e;
            if (fVar == null) {
                a(12);
            }
            return fVar;
        }
        f i4 = i();
        if (i4 == null) {
            a(13);
        }
        return i4;
    }

    public boolean k(@fg.l f fVar) {
        if (fVar == null) {
            a(15);
        }
        if (this.f77578a.isEmpty()) {
            return false;
        }
        int indexOf = this.f77578a.indexOf(46);
        String b5 = fVar.b();
        String str = this.f77578a;
        if (indexOf == -1) {
            indexOf = Math.max(str.length(), b5.length());
        }
        return str.regionMatches(0, b5, 0, indexOf);
    }

    @fg.l
    public c l() {
        c cVar = this.f77579b;
        if (cVar != null) {
            if (cVar == null) {
                a(5);
            }
            return cVar;
        }
        c cVar2 = new c(this);
        this.f77579b = cVar2;
        return cVar2;
    }

    @fg.l
    public String toString() {
        String b5 = this.f77578a.isEmpty() ? f77575e.b() : this.f77578a;
        if (b5 == null) {
            a(18);
        }
        return b5;
    }

    public d(@fg.l String str) {
        if (str == null) {
            a(2);
        }
        this.f77578a = str;
    }

    private d(@fg.l String str, d dVar, f fVar) {
        if (str == null) {
            a(3);
        }
        this.f77578a = str;
        this.f77580c = dVar;
        this.f77581d = fVar;
    }
}
