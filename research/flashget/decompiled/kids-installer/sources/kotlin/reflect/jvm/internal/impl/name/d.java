package kotlin.reflect.jvm.internal.impl.name;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.t;
import q3.l;

/* compiled from: FqNameUnsafe.java */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    private static final f f25593e = f.s(ProtectedSandApp.s("乭"));

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f25594f = Pattern.compile(ProtectedSandApp.s("乮"));

    /* renamed from: g, reason: collision with root package name */
    private static final l<String, f> f25595g = new a();

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final String f25596a;

    /* renamed from: b, reason: collision with root package name */
    private transient c f25597b;

    /* renamed from: c, reason: collision with root package name */
    private transient d f25598c;

    /* renamed from: d, reason: collision with root package name */
    private transient f f25599d;

    /* compiled from: FqNameUnsafe.java */
    /* loaded from: classes6.dex */
    static class a implements l<String, f> {
        a() {
        }

        @Override // q3.l
        public f N(String str) {
            return f.o(str);
        }

        public f a(String str) {
            return f.o(str);
        }
    }

    d(@d5.d String str, @d5.d c cVar) {
        if (str == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        this.f25596a = str;
        this.f25597b = cVar;
    }

    private static /* synthetic */ void a(int i5) {
        String s5;
        int i6;
        switch (i5) {
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
            case 17:
                s5 = ProtectedSandApp.s("买");
                break;
            case 9:
            case 15:
            case 16:
            default:
                s5 = ProtectedSandApp.s("乯");
                break;
        }
        switch (i5) {
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
            case 17:
                i6 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        String s6 = ProtectedSandApp.s("乱");
        String s7 = ProtectedSandApp.s("乲");
        if (i5 != 1) {
            switch (i5) {
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
                case 17:
                    objArr[0] = s7;
                    break;
                case 9:
                    objArr[0] = ProtectedSandApp.s("乵");
                    break;
                case 15:
                    objArr[0] = ProtectedSandApp.s("乴");
                    break;
                case 16:
                    objArr[0] = s6;
                    break;
                default:
                    objArr[0] = ProtectedSandApp.s("乳");
                    break;
            }
        } else {
            objArr[0] = ProtectedSandApp.s("乶");
        }
        switch (i5) {
            case 4:
                objArr[1] = ProtectedSandApp.s("乼");
                break;
            case 5:
            case 6:
                objArr[1] = ProtectedSandApp.s("乻");
                break;
            case 7:
            case 8:
                objArr[1] = ProtectedSandApp.s("乺");
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = s7;
                break;
            case 10:
            case 11:
                objArr[1] = s6;
                break;
            case 12:
            case 13:
                objArr[1] = ProtectedSandApp.s("乹");
                break;
            case 14:
                objArr[1] = ProtectedSandApp.s("乸");
                break;
            case 17:
                objArr[1] = ProtectedSandApp.s("乷");
                break;
        }
        switch (i5) {
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
            case 17:
                break;
            case 9:
                objArr[2] = ProtectedSandApp.s("亀");
                break;
            case 15:
                objArr[2] = ProtectedSandApp.s("乿");
                break;
            case 16:
                objArr[2] = ProtectedSandApp.s("乾");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("乽");
                break;
        }
        String format = String.format(s5, objArr);
        switch (i5) {
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
            case 17:
                throw new IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    private void d() {
        int lastIndexOf = this.f25596a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f25599d = f.o(this.f25596a.substring(lastIndexOf + 1));
            this.f25598c = new d(this.f25596a.substring(0, lastIndexOf));
        } else {
            this.f25599d = f.o(this.f25596a);
            this.f25598c = c.f25590c.j();
        }
    }

    @d5.d
    public static d m(@d5.d f fVar) {
        if (fVar == null) {
            a(16);
        }
        return new d(fVar.h(), c.f25590c.j(), fVar);
    }

    @d5.d
    public String b() {
        String str = this.f25596a;
        if (str == null) {
            a(4);
        }
        return str;
    }

    @d5.d
    public d c(@d5.d f fVar) {
        String str;
        if (fVar == null) {
            a(9);
        }
        if (e()) {
            str = fVar.h();
        } else {
            str = this.f25596a + ProtectedSandApp.s("亁") + fVar.h();
        }
        return new d(str, this, fVar);
    }

    public boolean e() {
        return this.f25596a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f25596a.equals(((d) obj).f25596a);
    }

    public boolean f() {
        return this.f25597b != null || b().indexOf(60) < 0;
    }

    @d5.d
    public d g() {
        d dVar = this.f25598c;
        if (dVar != null) {
            if (dVar == null) {
                a(7);
            }
            return dVar;
        }
        if (e()) {
            throw new IllegalStateException(ProtectedSandApp.s("亂"));
        }
        d();
        d dVar2 = this.f25598c;
        if (dVar2 == null) {
            a(8);
        }
        return dVar2;
    }

    @d5.d
    public List<f> h() {
        List<f> emptyList = e() ? Collections.emptyList() : t.ni(f25594f.split(this.f25596a), f25595g);
        if (emptyList == null) {
            a(14);
        }
        return emptyList;
    }

    public int hashCode() {
        return this.f25596a.hashCode();
    }

    @d5.d
    public f i() {
        f fVar = this.f25599d;
        if (fVar != null) {
            if (fVar == null) {
                a(10);
            }
            return fVar;
        }
        if (e()) {
            throw new IllegalStateException(ProtectedSandApp.s("亃"));
        }
        d();
        f fVar2 = this.f25599d;
        if (fVar2 == null) {
            a(11);
        }
        return fVar2;
    }

    @d5.d
    public f j() {
        if (e()) {
            f fVar = f25593e;
            if (fVar == null) {
                a(12);
            }
            return fVar;
        }
        f i5 = i();
        if (i5 == null) {
            a(13);
        }
        return i5;
    }

    public boolean k(@d5.d f fVar) {
        if (fVar == null) {
            a(15);
        }
        if (e()) {
            return false;
        }
        int indexOf = this.f25596a.indexOf(46);
        String str = this.f25596a;
        String h5 = fVar.h();
        if (indexOf == -1) {
            indexOf = this.f25596a.length();
        }
        return str.regionMatches(0, h5, 0, indexOf);
    }

    @d5.d
    public c l() {
        c cVar = this.f25597b;
        if (cVar != null) {
            if (cVar == null) {
                a(5);
            }
            return cVar;
        }
        c cVar2 = new c(this);
        this.f25597b = cVar2;
        return cVar2;
    }

    @d5.d
    public String toString() {
        String h5 = e() ? f25593e.h() : this.f25596a;
        if (h5 == null) {
            a(17);
        }
        return h5;
    }

    public d(@d5.d String str) {
        if (str == null) {
            a(2);
        }
        this.f25596a = str;
    }

    private d(@d5.d String str, d dVar, f fVar) {
        if (str == null) {
            a(3);
        }
        this.f25596a = str;
        this.f25598c = dVar;
        this.f25599d = fVar;
    }
}
