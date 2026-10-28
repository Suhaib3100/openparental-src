package kotlin.reflect.jvm.internal.impl.name;

import com.flashget.kidsdownloader.ProtectedSandApp;
import org.apache.commons.io.n;

/* compiled from: ClassId.java */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f25586d = false;

    /* renamed from: a, reason: collision with root package name */
    private final c f25587a;

    /* renamed from: b, reason: collision with root package name */
    private final c f25588b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25589c;

    public b(@d5.d c cVar, @d5.d c cVar2, boolean z5) {
        if (cVar == null) {
            a(1);
        }
        if (cVar2 == null) {
            a(2);
        }
        this.f25587a = cVar;
        this.f25588b = cVar2;
        this.f25589c = z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r10) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.name.b.a(int):void");
    }

    @d5.d
    public static b e(@d5.d String str) {
        if (str == null) {
            a(11);
        }
        return f(str, false);
    }

    @d5.d
    public static b f(@d5.d String str, boolean z5) {
        String str2;
        if (str == null) {
            a(12);
        }
        int lastIndexOf = str.lastIndexOf(ProtectedSandApp.s("乖"));
        if (lastIndexOf == -1) {
            str2 = "";
        } else {
            String replace = str.substring(0, lastIndexOf).replace(n.f32060b, org.apache.commons.io.k.f32026a);
            str = str.substring(lastIndexOf + 1);
            str2 = replace;
        }
        return new b(new c(str2), new c(str), z5);
    }

    @d5.d
    public static b m(@d5.d c cVar) {
        if (cVar == null) {
            a(0);
        }
        return new b(cVar.e(), cVar.g());
    }

    @d5.d
    public c b() {
        if (this.f25587a.d()) {
            c cVar = this.f25588b;
            if (cVar == null) {
                a(9);
            }
            return cVar;
        }
        return new c(this.f25587a.b() + ProtectedSandApp.s("乗") + this.f25588b.b());
    }

    @d5.d
    public String c() {
        if (this.f25587a.d()) {
            String b6 = this.f25588b.b();
            if (b6 == null) {
                a(13);
            }
            return b6;
        }
        String str = this.f25587a.b().replace(org.apache.commons.io.k.f32026a, n.f32060b) + ProtectedSandApp.s("乘") + this.f25588b.b();
        if (str == null) {
            a(14);
        }
        return str;
    }

    @d5.d
    public b d(@d5.d f fVar) {
        if (fVar == null) {
            a(8);
        }
        return new b(h(), this.f25588b.c(fVar), this.f25589c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f25587a.equals(bVar.f25587a) && this.f25588b.equals(bVar.f25588b) && this.f25589c == bVar.f25589c;
    }

    @d5.e
    public b g() {
        c e6 = this.f25588b.e();
        if (e6.d()) {
            return null;
        }
        return new b(h(), e6, this.f25589c);
    }

    @d5.d
    public c h() {
        c cVar = this.f25587a;
        if (cVar == null) {
            a(5);
        }
        return cVar;
    }

    public int hashCode() {
        return Boolean.valueOf(this.f25589c).hashCode() + ((this.f25588b.hashCode() + (this.f25587a.hashCode() * 31)) * 31);
    }

    @d5.d
    public c i() {
        c cVar = this.f25588b;
        if (cVar == null) {
            a(6);
        }
        return cVar;
    }

    @d5.d
    public f j() {
        f g5 = this.f25588b.g();
        if (g5 == null) {
            a(7);
        }
        return g5;
    }

    public boolean k() {
        return this.f25589c;
    }

    public boolean l() {
        return !this.f25588b.e().d();
    }

    public String toString() {
        if (!this.f25587a.d()) {
            return c();
        }
        return ProtectedSandApp.s("乙") + c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@d5.d c cVar, @d5.d f fVar) {
        this(cVar, c.k(fVar), false);
        if (cVar == null) {
            a(3);
        }
        if (fVar == null) {
            a(4);
        }
    }
}
