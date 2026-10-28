package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: ResultParser.java */
/* loaded from: classes6.dex */
public abstract class u {

    /* renamed from: e, reason: collision with root package name */
    private static final String f62752e = ProtectedSandApp.s("ृ\u0001");

    /* renamed from: a, reason: collision with root package name */
    private static final u[] f62748a = {new f(), new c(), new j(), new b(), new f0(), new e(), new g0(), new i(), new y(), new a0(), new v(), new x(), new n(), new k0(), new e0(), new d0(), new p(), new t(), new l(), new i0()};

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f62749b = Pattern.compile(ProtectedSandApp.s("ॄ\u0001"));

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f62750c = Pattern.compile(ProtectedSandApp.s("ॅ\u0001"));

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f62751d = Pattern.compile(ProtectedSandApp.s("ॆ\u0001"));

    /* renamed from: f, reason: collision with root package name */
    static final String[] f62753f = new String[0];

    private static void a(CharSequence charSequence, Map<String, String> map) {
        String[] split = f62751d.split(charSequence, 2);
        if (split.length == 2) {
            try {
                map.put(split[0], p(split[1]));
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    private static int b(CharSequence charSequence, int i4) {
        int i5 = 0;
        for (int i6 = i4 - 1; i6 >= 0 && charSequence.charAt(i6) == '\\'; i6--) {
            i5++;
        }
        return i5;
    }

    protected static String c(com.google.zxing.n nVar) {
        String g4 = nVar.g();
        return g4.startsWith(ProtectedSandApp.s("ृ\u0001")) ? g4.substring(1) : g4;
    }

    protected static boolean d(CharSequence charSequence, int i4) {
        return charSequence != null && i4 > 0 && i4 == charSequence.length() && f62749b.matcher(charSequence).matches();
    }

    protected static boolean e(CharSequence charSequence, int i4, int i5) {
        int i6;
        return charSequence != null && i5 > 0 && charSequence.length() >= (i6 = i5 + i4) && f62749b.matcher(charSequence.subSequence(i4, i6)).matches();
    }

    static String[] f(String str, String str2, char c5, boolean z4) {
        int length = str2.length();
        ArrayList arrayList = null;
        int i4 = 0;
        while (i4 < length) {
            int indexOf = str2.indexOf(str, i4);
            if (indexOf < 0) {
                break;
            }
            int length2 = str.length() + indexOf;
            boolean z5 = true;
            ArrayList arrayList2 = arrayList;
            int i5 = length2;
            while (z5) {
                int indexOf2 = str2.indexOf(c5, i5);
                if (indexOf2 < 0) {
                    i5 = str2.length();
                } else if (b(str2, indexOf2) % 2 != 0) {
                    i5 = indexOf2 + 1;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(3);
                    }
                    String o4 = o(str2.substring(length2, indexOf2));
                    if (z4) {
                        o4 = o4.trim();
                    }
                    if (!o4.isEmpty()) {
                        arrayList2.add(o4);
                    }
                    i5 = indexOf2 + 1;
                }
                z5 = false;
            }
            i4 = i5;
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(f62753f);
    }

    static String g(String str, String str2, char c5, boolean z4) {
        String[] f4 = f(str, str2, c5, z4);
        if (f4 == null) {
            return null;
        }
        return f4[0];
    }

    protected static void h(String str, StringBuilder sb) {
        if (str != null) {
            sb.append('\n');
            sb.append(str);
        }
    }

    protected static void i(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String str : strArr) {
                sb.append('\n');
                sb.append(str);
            }
        }
    }

    protected static String[] j(String str) {
        if (str == null) {
            return null;
        }
        return new String[]{str};
    }

    protected static int l(char c5) {
        if (c5 >= '0' && c5 <= '9') {
            return c5 - '0';
        }
        if (c5 >= 'a' && c5 <= 'f') {
            return c5 - 'W';
        }
        if (c5 < 'A' || c5 > 'F') {
            return -1;
        }
        return c5 - '7';
    }

    static Map<String, String> m(String str) {
        int indexOf = str.indexOf(63);
        if (indexOf < 0) {
            return null;
        }
        HashMap hashMap = new HashMap(3);
        for (String str2 : f62750c.split(str.substring(indexOf + 1))) {
            a(str2, hashMap);
        }
        return hashMap;
    }

    public static q n(com.google.zxing.n nVar) {
        for (u uVar : f62748a) {
            q k4 = uVar.k(nVar);
            if (k4 != null) {
                return k4;
            }
        }
        return new b0(nVar.g(), null);
    }

    protected static String o(String str) {
        int indexOf = str.indexOf(92);
        if (indexOf < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length - 1);
        sb.append(str.toCharArray(), 0, indexOf);
        boolean z4 = false;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (z4 || charAt != '\\') {
                sb.append(charAt);
                z4 = false;
            } else {
                z4 = true;
            }
            indexOf++;
        }
        return sb.toString();
    }

    static String p(String str) {
        try {
            return URLDecoder.decode(str, ProtectedSandApp.s("े\u0001"));
        } catch (UnsupportedEncodingException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public abstract q k(com.google.zxing.n nVar);
}
