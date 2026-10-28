package org.apache.commons.text.lookup;

import java.io.PrintStream;
import java.util.Locale;
import org.apache.commons.lang3.b1;

/* compiled from: JavaPlatformStringLookup.java */
/* loaded from: classes3.dex */
final class o extends a {

    /* renamed from: d, reason: collision with root package name */
    private static final String f86532d = "hardware";

    /* renamed from: e, reason: collision with root package name */
    private static final String f86533e = "locale";

    /* renamed from: f, reason: collision with root package name */
    private static final String f86534f = "os";

    /* renamed from: g, reason: collision with root package name */
    private static final String f86535g = "runtime";

    /* renamed from: h, reason: collision with root package name */
    private static final String f86536h = "version";

    /* renamed from: i, reason: collision with root package name */
    private static final String f86537i = "vm";

    /* renamed from: c, reason: collision with root package name */
    static final o f86531c = new o();

    private o() {
    }

    private String k(String str) {
        return b0.f86493f.lookup(str);
    }

    private String l(String str, String str2) {
        String lookup = b0.f86493f.lookup(str2);
        return b1.G0(lookup) ? "" : androidx.compose.runtime.changelist.j.a(str, lookup);
    }

    public static void n(String[] strArr) {
        PrintStream printStream = System.out;
        printStream.println(o.class);
        o oVar = f86531c;
        printStream.printf("%s = %s%n", "version", oVar.lookup("version"));
        printStream.printf("%s = %s%n", "runtime", oVar.lookup("runtime"));
        printStream.printf("%s = %s%n", "vm", oVar.lookup("vm"));
        printStream.printf("%s = %s%n", "os", oVar.lookup("os"));
        printStream.printf("%s = %s%n", "hardware", oVar.lookup("hardware"));
        printStream.printf("%s = %s%n", "locale", oVar.lookup("locale"));
    }

    String g() {
        return "processors: " + Runtime.getRuntime().availableProcessors() + ", architecture: " + b0.f86493f.lookup("os.arch") + l("-", "sun.arch.data.model") + l(", instruction sets: ", "sun.cpu.isalist");
    }

    String h() {
        return "default locale: " + Locale.getDefault() + ", platform encoding: " + b0.f86493f.lookup("file.encoding");
    }

    String i() {
        StringBuilder sb = new StringBuilder();
        k<String> kVar = b0.f86493f;
        sb.append(kVar.lookup("os.name"));
        sb.append(" ");
        sb.append(kVar.lookup("os.version"));
        sb.append(l(" ", "sun.os.patch.level"));
        sb.append(", architecture: ");
        sb.append(kVar.lookup("os.arch"));
        sb.append(l("-", "sun.arch.data.model"));
        return sb.toString();
    }

    String j() {
        StringBuilder sb = new StringBuilder();
        k<String> kVar = b0.f86493f;
        sb.append(kVar.lookup("java.runtime.name"));
        sb.append(" (build ");
        sb.append(kVar.lookup("java.runtime.version"));
        sb.append(") from ");
        sb.append(kVar.lookup("java.vendor"));
        return sb.toString();
    }

    @Override // org.apache.commons.text.lookup.t
    public String lookup(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "locale":
                return h();
            case "os":
                return i();
            case "vm":
                return m();
            case "hardware":
                return g();
            case "version":
                return "Java version " + b0.f86493f.lookup("java.version");
            case "runtime":
                return j();
            default:
                throw new IllegalArgumentException(str);
        }
    }

    String m() {
        StringBuilder sb = new StringBuilder();
        k<String> kVar = b0.f86493f;
        sb.append(kVar.lookup("java.vm.name"));
        sb.append(" (build ");
        sb.append(kVar.lookup("java.vm.version"));
        sb.append(", ");
        return android.support.v4.media.c.a(sb, kVar.lookup("java.vm.info"), ")");
    }
}
