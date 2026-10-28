package org.apache.commons.io;

import androidx.room.l0;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

/* compiled from: FileSystemUtils.java */
/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final h f85408a = new h();

    /* renamed from: b, reason: collision with root package name */
    private static final int f85409b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f85410c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f85411d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f85412e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f85413f = 3;

    /* renamed from: g, reason: collision with root package name */
    private static final int f85414g;

    /* renamed from: h, reason: collision with root package name */
    private static final String f85415h;

    static {
        String property;
        String str = "df";
        int i4 = -1;
        try {
            property = System.getProperty("os.name");
        } catch (Exception unused) {
        }
        if (property == null) {
            throw new IOException("os.name not found");
        }
        String lowerCase = property.toLowerCase(Locale.ENGLISH);
        if (lowerCase.indexOf("windows") != -1) {
            i4 = 1;
        } else {
            if (lowerCase.indexOf("linux") == -1 && lowerCase.indexOf("mpe/ix") == -1 && lowerCase.indexOf("freebsd") == -1 && lowerCase.indexOf("irix") == -1 && lowerCase.indexOf("digital unix") == -1 && lowerCase.indexOf("unix") == -1 && lowerCase.indexOf("mac os x") == -1) {
                if (lowerCase.indexOf("sun os") == -1 && lowerCase.indexOf("sunos") == -1 && lowerCase.indexOf("solaris") == -1) {
                    if (lowerCase.indexOf("hp-ux") == -1 && lowerCase.indexOf("aix") == -1) {
                        i4 = 0;
                    }
                    i4 = 3;
                }
                str = "/usr/xpg4/bin/df";
                i4 = 3;
            }
            i4 = 2;
        }
        f85414g = i4;
        f85415h = str;
    }

    @Deprecated
    public static long a(String str) throws IOException {
        return f85408a.f(str, f85414g, false, -1L);
    }

    public static long b() throws IOException {
        return c(-1L);
    }

    public static long c(long j4) throws IOException {
        return e(new File(".").getAbsolutePath(), j4);
    }

    public static long d(String str) throws IOException {
        return e(str, -1L);
    }

    public static long e(String str, long j4) throws IOException {
        return f85408a.f(str, f85414g, true, j4);
    }

    long f(String str, int i4, boolean z4, long j4) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("Path must not be empty");
        }
        if (i4 == 0) {
            throw new IllegalStateException("Unsupported operating system");
        }
        if (i4 == 1) {
            long h4 = h(str, j4);
            return z4 ? h4 / 1024 : h4;
        }
        if (i4 == 2) {
            return g(str, z4, false, j4);
        }
        if (i4 == 3) {
            return g(str, z4, true, j4);
        }
        throw new IllegalStateException("Exception caught when determining operating system");
    }

    long g(String str, boolean z4, boolean z5, long j4) throws IOException {
        if (str.length() == 0) {
            throw new IllegalArgumentException("Path must not be empty");
        }
        String str2 = z4 ? "-k" : "-";
        if (z5) {
            str2 = androidx.compose.runtime.changelist.j.a(str2, "P");
        }
        List<String> l4 = l(str2.length() > 1 ? new String[]{f85415h, str2, str} : new String[]{f85415h, str}, 3, j4);
        if (l4.size() < 2) {
            StringBuilder sb = new StringBuilder("Command line '");
            l0.a(sb, f85415h, "' did not return info as expected for path '", str, "'- response was ");
            sb.append(l4);
            throw new IOException(sb.toString());
        }
        StringTokenizer stringTokenizer = new StringTokenizer(l4.get(1), " ");
        if (stringTokenizer.countTokens() >= 4) {
            stringTokenizer.nextToken();
        } else {
            if (stringTokenizer.countTokens() != 1 || l4.size() < 3) {
                throw new IOException(androidx.fragment.app.c.a(new StringBuilder("Command line '"), f85415h, "' did not return data as expected for path '", str, "'- check path is valid"));
            }
            stringTokenizer = new StringTokenizer(l4.get(2), " ");
        }
        stringTokenizer.nextToken();
        stringTokenizer.nextToken();
        return j(stringTokenizer.nextToken(), str);
    }

    long h(String str, long j4) throws IOException {
        String B = j.B(str, false);
        if (B.length() > 0 && B.charAt(0) != '\"') {
            B = android.support.v4.media.d.a("\"", B, "\"");
        }
        List<String> l4 = l(new String[]{"cmd.exe", "/C", androidx.constraintlayout.core.motion.key.c.a("dir /a /-c ", B)}, Integer.MAX_VALUE, j4);
        for (int size = l4.size() - 1; size >= 0; size--) {
            String str2 = l4.get(size);
            if (str2.length() > 0) {
                return k(str2, B);
            }
        }
        throw new IOException(android.support.v4.media.d.a("Command line 'dir /-c' did not return any info for path '", B, "'"));
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
            throw new IOException("Command line '" + f85415h + "' did not find free space in response for path '" + str2 + "'- check path is valid");
        } catch (NumberFormatException e4) {
            throw new IOExceptionWithCause(androidx.fragment.app.c.a(new StringBuilder("Command line '"), f85415h, "' did not return numeric data as expected for path '", str2, "'- check path is valid"), e4);
        }
    }

    long k(String str, String str2) throws IOException {
        int i4;
        int i5;
        int i6;
        int length = str.length();
        while (true) {
            length--;
            i4 = 0;
            if (length < 0) {
                i5 = 0;
                break;
            }
            if (Character.isDigit(str.charAt(length))) {
                i5 = length + 1;
                break;
            }
        }
        while (true) {
            if (length < 0) {
                i6 = 0;
                break;
            }
            char charAt = str.charAt(length);
            if (!Character.isDigit(charAt) && charAt != ',' && charAt != '.') {
                i6 = length + 1;
                break;
            }
            length--;
        }
        if (length < 0) {
            throw new IOException(android.support.v4.media.d.a("Command line 'dir /-c' did not return valid info for path '", str2, "'"));
        }
        StringBuilder sb = new StringBuilder(str.substring(i6, i5));
        while (i4 < sb.length()) {
            if (sb.charAt(i4) == ',' || sb.charAt(i4) == '.') {
                sb.deleteCharAt(i4);
                i4--;
            }
            i4++;
        }
        return j(sb.toString(), str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
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
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.h.l(java.lang.String[], int, long):java.util.List");
    }
}
