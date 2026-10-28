package org.apache.commons.io;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

/* compiled from: FileSystemUtils.java */
/* loaded from: classes5.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final i f31908a = new i();

    /* renamed from: b, reason: collision with root package name */
    private static final int f31909b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f31910c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f31911d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f31912e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f31913f = 3;

    /* renamed from: g, reason: collision with root package name */
    private static final int f31914g;

    /* renamed from: h, reason: collision with root package name */
    private static final String f31915h;

    static {
        String property;
        String str = "df";
        int i5 = -1;
        try {
            property = System.getProperty("os.name");
        } catch (Exception unused) {
        }
        if (property == null) {
            throw new IOException("os.name not found");
        }
        String lowerCase = property.toLowerCase(Locale.ENGLISH);
        if (lowerCase.indexOf("windows") != -1) {
            i5 = 1;
        } else {
            if (lowerCase.indexOf("linux") == -1 && lowerCase.indexOf("mpe/ix") == -1 && lowerCase.indexOf("freebsd") == -1 && lowerCase.indexOf("irix") == -1 && lowerCase.indexOf("digital unix") == -1 && lowerCase.indexOf("unix") == -1 && lowerCase.indexOf("mac os x") == -1) {
                if (lowerCase.indexOf("sun os") == -1 && lowerCase.indexOf("sunos") == -1 && lowerCase.indexOf("solaris") == -1) {
                    if (lowerCase.indexOf("hp-ux") == -1 && lowerCase.indexOf("aix") == -1) {
                        i5 = 0;
                    }
                    i5 = 3;
                }
                str = "/usr/xpg4/bin/df";
                i5 = 3;
            }
            i5 = 2;
        }
        f31914g = i5;
        f31915h = str;
    }

    @Deprecated
    public static long a(String str) throws IOException {
        return f31908a.f(str, f31914g, false, -1L);
    }

    public static long b() throws IOException {
        return c(-1L);
    }

    public static long c(long j5) throws IOException {
        return e(new File(".").getAbsolutePath(), j5);
    }

    public static long d(String str) throws IOException {
        return e(str, -1L);
    }

    public static long e(String str, long j5) throws IOException {
        return f31908a.f(str, f31914g, true, j5);
    }

    long f(String str, int i5, boolean z5, long j5) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("Path must not be empty");
        }
        if (i5 == 0) {
            throw new IllegalStateException("Unsupported operating system");
        }
        if (i5 == 1) {
            long h5 = h(str, j5);
            return z5 ? h5 / 1024 : h5;
        }
        if (i5 == 2) {
            return g(str, z5, false, j5);
        }
        if (i5 == 3) {
            return g(str, z5, true, j5);
        }
        throw new IllegalStateException("Exception caught when determining operating system");
    }

    long g(String str, boolean z5, boolean z6, long j5) throws IOException {
        if (str.length() == 0) {
            throw new IllegalArgumentException("Path must not be empty");
        }
        String str2 = z5 ? "-k" : "-";
        if (z6) {
            str2 = androidx.concurrent.futures.b.a(str2, "P");
        }
        List<String> l5 = l(str2.length() > 1 ? new String[]{f31915h, str2, str} : new String[]{f31915h, str}, 3, j5);
        if (l5.size() < 2) {
            throw new IOException("Command line '" + f31915h + "' did not return info as expected for path '" + str + "'- response was " + l5);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(l5.get(1), " ");
        if (stringTokenizer.countTokens() >= 4) {
            stringTokenizer.nextToken();
        } else {
            if (stringTokenizer.countTokens() != 1 || l5.size() < 3) {
                throw new IOException("Command line '" + f31915h + "' did not return data as expected for path '" + str + "'- check path is valid");
            }
            stringTokenizer = new StringTokenizer(l5.get(2), " ");
        }
        stringTokenizer.nextToken();
        stringTokenizer.nextToken();
        return j(stringTokenizer.nextToken(), str);
    }

    long h(String str, long j5) throws IOException {
        String B = k.B(str, false);
        if (B.length() > 0 && B.charAt(0) != '\"') {
            B = androidx.constraintlayout.solver.widgets.analyzer.e.a("\"", B, "\"");
        }
        List<String> l5 = l(new String[]{"cmd.exe", "/C", androidx.constraintlayout.motion.widget.g.a("dir /a /-c ", B)}, Integer.MAX_VALUE, j5);
        for (int size = l5.size() - 1; size >= 0; size--) {
            String str2 = l5.get(size);
            if (str2.length() > 0) {
                return k(str2, B);
            }
        }
        throw new IOException(androidx.constraintlayout.solver.widgets.analyzer.e.a("Command line 'dir /-c' did not return any info for path '", B, "'"));
    }

    Process i(String[] strArr) throws IOException {
        return Runtime.getRuntime().exec(strArr);
    }

    long j(String str, String str2) throws IOException {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong >= 0) {
                return parseLong;
            }
            throw new IOException("Command line '" + f31915h + "' did not find free space in response for path '" + str2 + "'- check path is valid");
        } catch (NumberFormatException e6) {
            throw new IOExceptionWithCause("Command line '" + f31915h + "' did not return numeric data as expected for path '" + str2 + "'- check path is valid", e6);
        }
    }

    long k(String str, String str2) throws IOException {
        int i5;
        int i6;
        int i7;
        int length = str.length();
        while (true) {
            length--;
            i5 = 0;
            if (length < 0) {
                i6 = 0;
                break;
            }
            if (Character.isDigit(str.charAt(length))) {
                i6 = length + 1;
                break;
            }
        }
        while (true) {
            if (length < 0) {
                i7 = 0;
                break;
            }
            char charAt = str.charAt(length);
            if (!Character.isDigit(charAt) && charAt != ',' && charAt != '.') {
                i7 = length + 1;
                break;
            }
            length--;
        }
        if (length < 0) {
            throw new IOException(androidx.constraintlayout.solver.widgets.analyzer.e.a("Command line 'dir /-c' did not return valid info for path '", str2, "'"));
        }
        StringBuilder sb = new StringBuilder(str.substring(i7, i6));
        while (i5 < sb.length()) {
            if (sb.charAt(i5) == ',' || sb.charAt(i5) == '.') {
                sb.deleteCharAt(i5);
                i5--;
            }
            i5++;
        }
        return j(sb.toString(), str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.BufferedReader, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.util.List<java.lang.String> l(java.lang.String[] r10, int r11, long r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.i.l(java.lang.String[], int, long):java.util.List");
    }
}
