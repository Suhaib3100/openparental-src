package net.time4j.i18n;

import androidx.compose.material3.j4;
import androidx.compose.runtime.changelist.j;
import androidx.fragment.app.y;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import java.util.MissingResourceException;
import net.time4j.format.n;
import net.time4j.format.s;
import net.time4j.format.x;
import net.time4j.g1;

/* compiled from: UnitPatternProviderSPI.java */
/* loaded from: classes7.dex */
public final class h implements s {

    /* compiled from: UnitPatternProviderSPI.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83292a;

        static {
            int[] iArr = new int[x.values().length];
            f83292a = iArr;
            try {
                iArr[x.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83292a[x.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83292a[x.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83292a[x.NARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static String F(char c5, x xVar, n nVar) {
        StringBuilder sb = new StringBuilder(3);
        sb.append(c5);
        int i4 = a.f83292a[xVar.ordinal()];
        if (i4 == 1) {
            sb.append('w');
        } else if (i4 == 2 || i4 == 3) {
            sb.append('s');
        } else {
            if (i4 != 4) {
                throw new UnsupportedOperationException(xVar.name());
            }
            sb.append('n');
        }
        sb.append(nVar.ordinal());
        return sb.toString();
    }

    private static String G(char c5, boolean z4, n nVar) {
        StringBuilder sb = new StringBuilder(3);
        sb.append(c5);
        sb.append(z4 ? '+' : '-');
        sb.append(nVar.ordinal());
        return sb.toString();
    }

    private static String H(x xVar, String str) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("靇\u0001"));
        int i4 = a.f83292a[xVar.ordinal()];
        if (i4 == 1) {
            sb.append('w');
        } else if (i4 == 2 || i4 == 3) {
            sb.append('s');
        } else {
            if (i4 != 4) {
                throw new UnsupportedOperationException(xVar.name());
            }
            sb.append('n');
        }
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    private String I(Locale locale, String str) {
        boolean z4 = true;
        e eVar = null;
        for (Locale locale2 : e.d(locale)) {
            e i4 = (!z4 || eVar == null) ? e.i(ProtectedSandApp.s("靈\u0001"), locale2) : eVar;
            if (z4) {
                if (locale2.equals(i4.f())) {
                    z4 = false;
                } else {
                    eVar = i4;
                }
            }
            if (i4.e().contains(str)) {
                return i4.g(str);
            }
        }
        return "";
    }

    private String J(Locale locale, String str, String str2, String str3, n nVar) {
        boolean z4 = true;
        e eVar = null;
        for (Locale locale2 : e.d(locale)) {
            e i4 = (!z4 || eVar == null) ? e.i(ProtectedSandApp.s("靉\u0001") + str, locale2) : eVar;
            if (z4) {
                if (locale2.equals(i4.f())) {
                    z4 = false;
                } else {
                    eVar = i4;
                }
            }
            if (i4.e().contains(str2)) {
                return i4.g(str2);
            }
            if (nVar != n.OTHER && i4.e().contains(str3)) {
                return i4.g(str3);
            }
        }
        throw new MissingResourceException(y.a(ProtectedSandApp.s("靊\u0001"), str, ProtectedSandApp.s("靋\u0001"), str2), j.a(str, ProtectedSandApp.s("靌\u0001")), str2);
    }

    private String K(Locale locale, char c5, boolean z4, n nVar) {
        return J(locale, ProtectedSandApp.s("靍\u0001"), G(c5, z4, nVar), G(c5, z4, n.OTHER), nVar);
    }

    private String L(Locale locale, char c5, x xVar, n nVar) {
        return J(locale, ProtectedSandApp.s("靎\u0001"), F(c5, xVar, nVar), F(c5, xVar, n.OTHER), nVar);
    }

    private static String M(String str, char c5, int i4) {
        int length = str.length();
        int i5 = length - 2;
        for (int i6 = 0; i6 < i5; i6++) {
            if (str.charAt(i6) == '{') {
                int i7 = i6 + 1;
                if (str.charAt(i7) == c5) {
                    int i10 = i6 + 2;
                    if (str.charAt(i10) == '}') {
                        StringBuilder sb = new StringBuilder(length + 8);
                        sb.append(str);
                        sb.replace(i7, i10, String.valueOf(i4));
                        return sb.toString();
                    }
                } else {
                    continue;
                }
            }
        }
        return str;
    }

    @Override // net.time4j.format.s
    public String A(g1 g1Var, Locale locale) {
        return I(locale, g1Var.name().substring(0, 3).toLowerCase() + ProtectedSandApp.s("靏\u0001"));
    }

    @Override // net.time4j.format.z
    public String B(Locale locale, x xVar, n nVar) {
        return L(locale, '6', xVar, nVar);
    }

    @Override // net.time4j.format.z
    public String C(Locale locale, boolean z4, n nVar) {
        return K(locale, 'N', z4, nVar);
    }

    @Override // net.time4j.format.s
    public String D(Locale locale, boolean z4, n nVar) {
        return K(locale, 'm', z4, nVar);
    }

    @Override // net.time4j.format.s
    public String E(Locale locale, boolean z4, n nVar) {
        return K(locale, 'n', z4, nVar);
    }

    @Override // net.time4j.format.s
    public String a(Locale locale, boolean z4, n nVar) {
        return K(locale, 'h', z4, nVar);
    }

    @Override // net.time4j.format.s
    public String b(Locale locale) {
        return J(locale, ProtectedSandApp.s("靍\u0001"), ProtectedSandApp.s("靐\u0001"), null, n.OTHER);
    }

    @Override // net.time4j.format.z
    public String c(Locale locale) {
        return J(locale, ProtectedSandApp.s("靍\u0001"), ProtectedSandApp.s("靑\u0001"), null, n.OTHER);
    }

    @Override // net.time4j.format.z
    public String d(Locale locale, boolean z4, n nVar) {
        return K(locale, 'S', z4, nVar);
    }

    @Override // net.time4j.format.z
    public String e(Locale locale, x xVar, n nVar) {
        return L(locale, 'N', xVar, nVar);
    }

    @Override // net.time4j.format.z
    public String f(Locale locale, boolean z4, n nVar) {
        return K(locale, 'M', z4, nVar);
    }

    @Override // net.time4j.format.z
    public String g(Locale locale, x xVar, n nVar) {
        return L(locale, 'H', xVar, nVar);
    }

    @Override // net.time4j.format.s
    public String h(Locale locale) {
        return J(locale, ProtectedSandApp.s("靍\u0001"), ProtectedSandApp.s("青\u0001"), null, n.OTHER);
    }

    @Override // net.time4j.format.z
    public String i(Locale locale, boolean z4, n nVar) {
        return K(locale, 'W', z4, nVar);
    }

    @Override // net.time4j.format.s
    public String j(g1 g1Var, Locale locale) {
        return I(locale, g1Var.name().substring(0, 3).toLowerCase() + ProtectedSandApp.s("靓\u0001"));
    }

    @Override // net.time4j.format.z
    public String k(Locale locale, x xVar, n nVar) {
        return L(locale, 'Y', xVar, nVar);
    }

    @Override // net.time4j.format.z
    public String l(Locale locale, x xVar, n nVar) {
        return L(locale, 'S', xVar, nVar);
    }

    @Override // net.time4j.format.z
    public String m(Locale locale, x xVar, n nVar) {
        return L(locale, 'M', xVar, nVar);
    }

    @Override // net.time4j.format.z
    public String n(Locale locale, x xVar, n nVar) {
        return L(locale, '9', xVar, nVar);
    }

    @Override // net.time4j.format.s
    public String o(Locale locale) {
        return J(locale, ProtectedSandApp.s("靍\u0001"), ProtectedSandApp.s("靔\u0001"), null, n.OTHER);
    }

    @Override // net.time4j.format.z
    public String p(Locale locale, x xVar, n nVar) {
        return L(locale, '3', xVar, nVar);
    }

    @Override // net.time4j.format.s
    public String q(Locale locale, boolean z4, n nVar) {
        return K(locale, 'y', z4, nVar);
    }

    @Override // net.time4j.format.z
    public String r(Locale locale, boolean z4, n nVar) {
        return K(locale, 'H', z4, nVar);
    }

    @Override // net.time4j.format.z
    public String s(Locale locale, x xVar, n nVar) {
        return L(locale, 'D', xVar, nVar);
    }

    @Override // net.time4j.format.z
    public String t(Locale locale, x xVar, int i4) {
        int i5;
        if (i4 < 2) {
            throw new IllegalArgumentException(ProtectedSandApp.s("静\u0001"));
        }
        e i6 = e.i(ProtectedSandApp.s("靕\u0001"), locale);
        String H = H(xVar, String.valueOf(i4));
        if (i6.c(H)) {
            return i6.g(H);
        }
        String g4 = i6.g(H(xVar, ProtectedSandApp.s("靖\u0001")));
        if (i4 == 2) {
            return g4;
        }
        String g5 = i6.g(H(xVar, ProtectedSandApp.s("靗\u0001")));
        String g6 = i6.g(H(xVar, ProtectedSandApp.s("靘\u0001")));
        String M = M(M(g4, '1', i4 - 1), '0', i4 - 2);
        int i7 = i4 - 3;
        String str = M;
        while (i7 >= 0) {
            String str2 = i7 == 0 ? g5 : g6;
            int length = str2.length();
            int i10 = length - 1;
            while (true) {
                if (i10 < 0) {
                    i5 = -1;
                    break;
                }
                if (i10 >= 2 && str2.charAt(i10) == '}' && str2.charAt(i10 - 1) == '1') {
                    i5 = i10 - 2;
                    if (str2.charAt(i5) == '{') {
                        break;
                    }
                }
                i10--;
            }
            if (i5 > -1) {
                M = str2.substring(0, i5) + str;
                if (i5 < length - 3) {
                    StringBuilder a5 = j4.a(M);
                    a5.append(str2.substring(i5 + 3));
                    M = a5.toString();
                }
            }
            if (i7 > 0) {
                str = M(M, '0', i7);
            }
            i7--;
        }
        return M;
    }

    @Override // net.time4j.format.z
    public String u(Locale locale, boolean z4, n nVar) {
        return K(locale, 'D', z4, nVar);
    }

    @Override // net.time4j.format.z
    public String v(Locale locale, x xVar, n nVar) {
        return L(locale, 'W', xVar, nVar);
    }

    @Override // net.time4j.format.s
    public String w(Locale locale, boolean z4, n nVar) {
        return K(locale, 'd', z4, nVar);
    }

    @Override // net.time4j.format.s
    public String x(Locale locale, boolean z4, n nVar) {
        return K(locale, 'w', z4, nVar);
    }

    @Override // net.time4j.format.s
    public String y(Locale locale, boolean z4, n nVar) {
        return K(locale, 's', z4, nVar);
    }

    @Override // net.time4j.format.z
    public String z(Locale locale, boolean z4, n nVar) {
        return K(locale, 'Y', z4, nVar);
    }
}
