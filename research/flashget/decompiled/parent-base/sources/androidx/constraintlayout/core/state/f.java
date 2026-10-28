package androidx.constraintlayout.core.state;

import java.util.HashMap;
import java.util.Set;

/* compiled from: Registry.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final f f22684b = new f();

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, g> f22685a = new HashMap<>();

    public static f c() {
        return f22684b;
    }

    public String a(String str) {
        g gVar = this.f22685a.get(str);
        if (gVar != null) {
            return gVar.g();
        }
        return null;
    }

    public String b(String str) {
        g gVar = this.f22685a.get(str);
        if (gVar != null) {
            return gVar.h();
        }
        return null;
    }

    public long d(String str) {
        g gVar = this.f22685a.get(str);
        if (gVar != null) {
            return gVar.e();
        }
        return Long.MAX_VALUE;
    }

    public Set<String> e() {
        return this.f22685a.keySet();
    }

    public void f(String str, g gVar) {
        this.f22685a.put(str, gVar);
    }

    public void g(String str, int i4) {
        g gVar = this.f22685a.get(str);
        if (gVar != null) {
            gVar.a(i4);
        }
    }

    public void h(String str, int i4) {
        g gVar = this.f22685a.get(str);
        if (gVar != null) {
            gVar.b(i4);
        }
    }

    public void i(String str, g gVar) {
        this.f22685a.remove(str);
    }

    public void j(String str, String str2) {
        g gVar = this.f22685a.get(str);
        if (gVar != null) {
            gVar.f(str2);
        }
    }

    public void k(String str, int i4, int i5) {
        g gVar = this.f22685a.get(str);
        if (gVar != null) {
            gVar.d(i4, i5);
        }
    }

    public void l(String str, float f4) {
        g gVar = this.f22685a.get(str);
        if (gVar != null) {
            gVar.c(f4);
        }
    }
}
