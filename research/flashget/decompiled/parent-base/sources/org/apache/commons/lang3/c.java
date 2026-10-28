package org.apache.commons.lang3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;
import we.a;

/* compiled from: ArchUtils.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, we.a> f85804a = new HashMap();

    static {
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, we.a aVar) {
        Map<String, we.a> map = f85804a;
        if (map.containsKey(str)) {
            throw new IllegalStateException(android.support.v4.media.d.a("Key ", str, " already exists in processor map"));
        }
        map.put(str, aVar);
    }

    private static void c(final we.a aVar, String... strArr) {
        Stream.of((Object[]) strArr).forEach(new Consumer() { // from class: org.apache.commons.lang3.b
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c.b((String) obj, we.a.this);
            }
        });
    }

    public static we.a d() {
        return e(c1.N);
    }

    public static we.a e(String str) {
        return f85804a.get(str);
    }

    private static void f() {
        k();
        l();
        g();
        h();
        i();
        j();
    }

    private static void g() {
        c(new we.a(a.EnumC1404a.BIT_32, a.b.IA_64), "ia64_32", "ia64n");
    }

    private static void h() {
        c(new we.a(a.EnumC1404a.BIT_64, a.b.IA_64), "ia64", "ia64w");
    }

    private static void i() {
        c(new we.a(a.EnumC1404a.BIT_32, a.b.PPC), "ppc", "power", "powerpc", "power_pc", "power_rs");
    }

    private static void j() {
        c(new we.a(a.EnumC1404a.BIT_64, a.b.PPC), "ppc64", "power64", "powerpc64", "power_pc64", "power_rs64");
    }

    private static void k() {
        c(new we.a(a.EnumC1404a.BIT_32, a.b.X86), "x86", "i386", "i486", "i586", "i686", "pentium");
    }

    private static void l() {
        c(new we.a(a.EnumC1404a.BIT_64, a.b.X86), "x86_64", "amd64", "em64t", "universal");
    }
}
