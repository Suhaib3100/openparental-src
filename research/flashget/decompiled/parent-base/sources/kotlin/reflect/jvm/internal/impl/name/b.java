package kotlin.reflect.jvm.internal.impl.name;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;

/* compiled from: ClassId.java */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f77568d = false;

    /* renamed from: a, reason: collision with root package name */
    private final c f77569a;

    /* renamed from: b, reason: collision with root package name */
    private final c f77570b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f77571c;

    public b(@l c cVar, @l c cVar2, boolean z4) {
        if (cVar == null) {
            a(1);
        }
        if (cVar2 == null) {
            a(2);
        }
        this.f77569a = cVar;
        this.f77570b = cVar2;
        this.f77571c = z4;
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

    @l
    public static b e(@l String str) {
        if (str == null) {
            a(11);
        }
        return f(str, false);
    }

    @l
    public static b f(@l String str, boolean z4) {
        String str2;
        if (str == null) {
            a(12);
        }
        int lastIndexOf = str.lastIndexOf(ProtectedSandApp.s("痶\u0001"));
        if (lastIndexOf == -1) {
            str2 = "";
        } else {
            String replace = str.substring(0, lastIndexOf).replace('/', '.');
            str = str.substring(lastIndexOf + 1);
            str2 = replace;
        }
        return new b(new c(str2), new c(str), z4);
    }

    @l
    public static b m(@l c cVar) {
        if (cVar == null) {
            a(0);
        }
        return new b(cVar.e(), cVar.g());
    }

    @l
    public c b() {
        if (this.f77569a.d()) {
            c cVar = this.f77570b;
            if (cVar == null) {
                a(9);
            }
            return cVar;
        }
        return new c(this.f77569a.b() + ProtectedSandApp.s("痷\u0001") + this.f77570b.b());
    }

    @l
    public String c() {
        if (this.f77569a.d()) {
            String b5 = this.f77570b.b();
            if (b5 == null) {
                a(13);
            }
            return b5;
        }
        String str = this.f77569a.b().replace('.', '/') + ProtectedSandApp.s("痶\u0001") + this.f77570b.b();
        if (str == null) {
            a(14);
        }
        return str;
    }

    @l
    public b d(@l f fVar) {
        if (fVar == null) {
            a(8);
        }
        return new b(h(), this.f77570b.c(fVar), this.f77571c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f77569a.equals(bVar.f77569a) && this.f77570b.equals(bVar.f77570b) && this.f77571c == bVar.f77571c;
    }

    @m
    public b g() {
        c e4 = this.f77570b.e();
        if (e4.d()) {
            return null;
        }
        return new b(h(), e4, this.f77571c);
    }

    @l
    public c h() {
        c cVar = this.f77569a;
        if (cVar == null) {
            a(5);
        }
        return cVar;
    }

    public int hashCode() {
        return Boolean.valueOf(this.f77571c).hashCode() + ((this.f77570b.hashCode() + (this.f77569a.hashCode() * 31)) * 31);
    }

    @l
    public c i() {
        c cVar = this.f77570b;
        if (cVar == null) {
            a(6);
        }
        return cVar;
    }

    @l
    public f j() {
        f g4 = this.f77570b.g();
        if (g4 == null) {
            a(7);
        }
        return g4;
    }

    public boolean k() {
        return this.f77571c;
    }

    public boolean l() {
        return !this.f77570b.e().d();
    }

    public String toString() {
        if (!this.f77569a.d()) {
            return c();
        }
        return ProtectedSandApp.s("痶\u0001") + c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@l c cVar, @l f fVar) {
        this(cVar, c.k(fVar), false);
        if (cVar == null) {
            a(3);
        }
        if (fVar == null) {
            a(4);
        }
    }
}
