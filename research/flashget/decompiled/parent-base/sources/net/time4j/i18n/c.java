package net.time4j.i18n;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import net.time4j.format.m;
import net.time4j.format.w;
import net.time4j.format.x;

/* compiled from: IsoTextProviderSPI.java */
/* loaded from: classes7.dex */
public final class c implements w, pe.c {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f83274a;

    /* renamed from: b, reason: collision with root package name */
    private static final Set<Locale> f83275b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f83276c = ProtectedSandApp.s("霌\u0001");

    static {
        String[] split = e.i(ProtectedSandApp.s("霌\u0001"), Locale.ROOT).g(ProtectedSandApp.s("霍\u0001")).split(ProtectedSandApp.s("霎\u0001"));
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, split);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        f83274a = unmodifiableSet;
        HashSet hashSet2 = new HashSet();
        Iterator<String> it = unmodifiableSet.iterator();
        while (it.hasNext()) {
            hashSet2.add(new Locale(it.next()));
        }
        for (d dVar : d.values()) {
            hashSet2.add(new Locale(dVar.name()));
        }
        f83275b = Collections.unmodifiableSet(hashSet2);
    }

    private static String[] o(Locale locale, x xVar) throws MissingResourceException {
        x xVar2;
        e i4 = e.i(ProtectedSandApp.s("霌\u0001"), locale);
        String[] strArr = null;
        if (i4 != null) {
            if (xVar == x.SHORT) {
                xVar = x.ABBREVIATED;
            }
            strArr = s(i4, 5, q(i4, ProtectedSandApp.s("霏\u0001")), xVar, xVar == x.NARROW ? x.ABBREVIATED : null, m.FORMAT, 0);
            if (strArr == null && xVar != (xVar2 = x.ABBREVIATED)) {
                strArr = o(locale, xVar2);
            }
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException(ProtectedSandApp.s("霐\u0001") + locale, c.class.getName(), locale.toString());
    }

    private static e p(Locale locale) throws MissingResourceException {
        return e.i(ProtectedSandApp.s("霌\u0001"), locale);
    }

    private static String q(e eVar, String str) {
        String s4 = ProtectedSandApp.s("霑\u0001");
        return (eVar.c(s4) && ProtectedSandApp.s("霒\u0001").equals(eVar.g(s4))) ? str.substring(0, 1) : str;
    }

    static Set<String> r() {
        return f83274a;
    }

    private static String[] s(e eVar, int i4, String str, x xVar, x xVar2, m mVar, int i5) {
        String[] s4;
        String[] strArr = new String[i4];
        boolean z4 = str.length() == 1;
        for (int i6 = 0; i6 < i4; i6++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('(');
            if (z4) {
                char charAt = xVar.name().charAt(0);
                if (mVar != m.STANDALONE) {
                    charAt = Character.toLowerCase(charAt);
                }
                sb.append(charAt);
            } else {
                sb.append(xVar.name());
                if (mVar == m.STANDALONE) {
                    sb.append('|');
                    sb.append(mVar.name());
                }
            }
            sb.append(ProtectedSandApp.s("霓\u0001"));
            sb.append(i6 + i5);
            String sb2 = sb.toString();
            if (eVar.c(sb2)) {
                strArr[i6] = eVar.g(sb2);
            } else {
                if (xVar2 == null || (s4 = s(eVar, i4, str, xVar2, null, mVar, i5)) == null) {
                    return null;
                }
                strArr[i6] = s4[i6];
            }
        }
        return strArr;
    }

    private static String t(String str, x xVar, m mVar) {
        char charAt = xVar.name().charAt(0);
        if (mVar == m.FORMAT) {
            charAt = Character.toLowerCase(charAt);
        }
        return ProtectedSandApp.s("霔\u0001") + String.valueOf(charAt) + ProtectedSandApp.s("霓\u0001") + str;
    }

    private static String[] u(Locale locale, x xVar, m mVar) throws MissingResourceException {
        e i4 = e.i(ProtectedSandApp.s("霌\u0001"), locale);
        if (i4 != null) {
            if (xVar == x.SHORT) {
                xVar = x.ABBREVIATED;
            }
            String t4 = t(ProtectedSandApp.s("霕\u0001"), xVar, mVar);
            String t5 = t(ProtectedSandApp.s("霖\u0001"), xVar, mVar);
            if (i4.c(t4) && i4.c(t5)) {
                return new String[]{i4.g(t4), i4.g(t5)};
            }
            if (mVar == m.STANDALONE) {
                x xVar2 = x.ABBREVIATED;
                return xVar == xVar2 ? u(locale, xVar, m.FORMAT) : u(locale, xVar2, mVar);
            }
            x xVar3 = x.ABBREVIATED;
            if (xVar != xVar3) {
                return u(locale, xVar3, mVar);
            }
        }
        throw new MissingResourceException(ProtectedSandApp.s("霗\u0001") + locale, c.class.getName(), locale.toString());
    }

    private static String[] v(Locale locale, x xVar, m mVar) throws MissingResourceException {
        String[] strArr;
        e i4 = e.i(ProtectedSandApp.s("霌\u0001"), locale);
        if (i4 != null) {
            if (xVar == x.SHORT) {
                xVar = x.ABBREVIATED;
            }
            strArr = s(i4, 12, q(i4, ProtectedSandApp.s("霘\u0001")), xVar, null, mVar, 1);
            if (strArr == null) {
                m mVar2 = m.STANDALONE;
                if (mVar == mVar2) {
                    if (xVar != x.NARROW) {
                        strArr = v(locale, xVar, m.FORMAT);
                    }
                } else if (xVar == x.ABBREVIATED) {
                    strArr = v(locale, x.WIDE, m.FORMAT);
                } else if (xVar == x.NARROW) {
                    strArr = v(locale, xVar, mVar2);
                }
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException(ProtectedSandApp.s("霙\u0001") + locale, c.class.getName(), locale.toString());
    }

    private static String[] w(Locale locale, x xVar, m mVar) throws MissingResourceException {
        String[] strArr;
        e i4 = e.i(ProtectedSandApp.s("霌\u0001"), locale);
        if (i4 != null) {
            if (xVar == x.SHORT) {
                xVar = x.ABBREVIATED;
            }
            strArr = s(i4, 4, q(i4, ProtectedSandApp.s("霚\u0001")), xVar, null, mVar, 1);
            if (strArr == null) {
                m mVar2 = m.STANDALONE;
                if (mVar == mVar2) {
                    if (xVar != x.NARROW) {
                        strArr = w(locale, xVar, m.FORMAT);
                    }
                } else if (xVar == x.ABBREVIATED) {
                    strArr = w(locale, x.WIDE, m.FORMAT);
                } else if (xVar == x.NARROW) {
                    strArr = w(locale, xVar, mVar2);
                }
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException(ProtectedSandApp.s("霛\u0001") + locale, c.class.getName(), locale.toString());
    }

    private static char x(net.time4j.format.e eVar) {
        return Character.toLowerCase(eVar.name().charAt(0));
    }

    private static String[] y(Locale locale, x xVar, m mVar) throws MissingResourceException {
        String[] strArr;
        e i4 = e.i(ProtectedSandApp.s("霌\u0001"), locale);
        if (i4 != null) {
            strArr = s(i4, 7, q(i4, ProtectedSandApp.s("霜\u0001")), xVar, null, mVar, 1);
            if (strArr == null) {
                m mVar2 = m.STANDALONE;
                if (mVar != mVar2) {
                    x xVar2 = x.ABBREVIATED;
                    if (xVar == xVar2) {
                        strArr = y(locale, x.WIDE, m.FORMAT);
                    } else if (xVar == x.SHORT) {
                        strArr = y(locale, xVar2, m.FORMAT);
                    } else if (xVar == x.NARROW) {
                        strArr = y(locale, xVar, mVar2);
                    }
                } else if (xVar != x.NARROW) {
                    strArr = y(locale, xVar, m.FORMAT);
                }
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException(ProtectedSandApp.s("霝\u0001") + locale, c.class.getName(), locale.toString());
    }

    @Override // net.time4j.format.w
    public Locale[] a() {
        Set<Locale> set = f83275b;
        return (Locale[]) set.toArray(new Locale[set.size()]);
    }

    @Override // net.time4j.format.f
    public String b(net.time4j.format.e eVar, Locale locale) {
        return j(eVar, locale, false);
    }

    @Override // net.time4j.format.w
    public boolean c(Locale locale) {
        return f83274a.contains(d.getAlias(locale));
    }

    @Override // net.time4j.format.w
    public String[] d(String str, Locale locale, x xVar, m mVar) {
        return w(locale, xVar, mVar);
    }

    @Override // net.time4j.format.w
    public String[] e(String str, Locale locale, x xVar, m mVar, boolean z4) {
        return v(locale, xVar, mVar);
    }

    @Override // net.time4j.format.f
    public String f(net.time4j.format.e eVar, Locale locale) {
        return e.i(ProtectedSandApp.s("霌\u0001"), locale).g(ProtectedSandApp.s("霞\u0001") + x(eVar) + ProtectedSandApp.s("霟\u0001"));
    }

    @Override // net.time4j.format.w
    public String[] g(String str, Locale locale, x xVar) {
        return o(locale, xVar);
    }

    @Override // net.time4j.format.w
    public String[] h(String str, Locale locale, x xVar, m mVar) {
        return y(locale, xVar, mVar);
    }

    @Override // net.time4j.format.w
    public String[] i(String str, Locale locale, x xVar, m mVar) {
        return u(locale, xVar, mVar);
    }

    @Override // pe.c
    public String j(net.time4j.format.e eVar, Locale locale, boolean z4) {
        String str;
        if (z4 && eVar == net.time4j.format.e.FULL) {
            str = ProtectedSandApp.s("霠\u0001");
        } else {
            str = ProtectedSandApp.s("霞\u0001") + x(eVar) + ProtectedSandApp.s("霡\u0001");
        }
        return e.i(ProtectedSandApp.s("霌\u0001"), locale).g(str);
    }

    @Override // net.time4j.format.w
    public boolean k(String str) {
        return ProtectedSandApp.s("霢\u0001").equals(str);
    }

    @Override // net.time4j.format.w
    public String[] l() {
        return new String[]{ProtectedSandApp.s("霢\u0001")};
    }

    @Override // net.time4j.format.f
    public String m(Locale locale) {
        return e.i(ProtectedSandApp.s("霌\u0001"), locale).g(ProtectedSandApp.s("霣\u0001"));
    }

    @Override // net.time4j.format.f
    public String n(net.time4j.format.e eVar, net.time4j.format.e eVar2, Locale locale) {
        if (eVar.compareTo(eVar2) < 0) {
            eVar = eVar2;
        }
        return e.i(ProtectedSandApp.s("霌\u0001"), locale).g(ProtectedSandApp.s("霞\u0001") + x(eVar) + ProtectedSandApp.s("霤\u0001"));
    }

    public String toString() {
        return ProtectedSandApp.s("霥\u0001");
    }
}
