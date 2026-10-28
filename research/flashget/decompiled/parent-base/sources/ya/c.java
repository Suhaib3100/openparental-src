package ya;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ChromaFormat.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    public static c f93296d = new c(0, 0, 0);

    /* renamed from: e, reason: collision with root package name */
    public static c f93297e = new c(1, 2, 2);

    /* renamed from: f, reason: collision with root package name */
    public static c f93298f = new c(2, 2, 1);

    /* renamed from: g, reason: collision with root package name */
    public static c f93299g = new c(3, 1, 1);

    /* renamed from: a, reason: collision with root package name */
    private int f93300a;

    /* renamed from: b, reason: collision with root package name */
    private int f93301b;

    /* renamed from: c, reason: collision with root package name */
    private int f93302c;

    public c(int i4, int i5, int i6) {
        this.f93300a = i4;
        this.f93301b = i5;
        this.f93302c = i6;
    }

    public static c a(int i4) {
        c cVar = f93296d;
        if (i4 == cVar.f93300a) {
            return cVar;
        }
        c cVar2 = f93297e;
        if (i4 == cVar2.f93300a) {
            return cVar2;
        }
        c cVar3 = f93298f;
        if (i4 == cVar3.f93300a) {
            return cVar3;
        }
        c cVar4 = f93299g;
        if (i4 == cVar4.f93300a) {
            return cVar4;
        }
        return null;
    }

    public int b() {
        return this.f93300a;
    }

    public int c() {
        return this.f93302c;
    }

    public int d() {
        return this.f93301b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("㣞\u0001"));
        sb.append(this.f93300a);
        sb.append(ProtectedSandApp.s("㣟\u0001"));
        sb.append(this.f93301b);
        sb.append(ProtectedSandApp.s("㣠\u0001"));
        return androidx.view.e.a(sb, this.f93302c, '}');
    }
}
