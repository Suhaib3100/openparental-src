package net.time4j.calendar.service;

import androidx.compose.material3.j4;
import androidx.fragment.app.y;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import net.time4j.format.m;
import net.time4j.format.w;
import net.time4j.format.x;

/* compiled from: GenericTextProviderSPI.java */
/* loaded from: classes7.dex */
public final class d implements w {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f82638a = new String[0];

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f82639b;

    /* renamed from: c, reason: collision with root package name */
    private static final Set<String> f82640c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set<Locale> f82641d;

    static {
        String[] split = net.time4j.i18n.e.i(ProtectedSandApp.s("鈛\u0001"), Locale.ROOT).g(ProtectedSandApp.s("鈜\u0001")).split(ProtectedSandApp.s("鈝\u0001"));
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, split);
        hashSet.add("");
        Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        f82640c = unmodifiableSet;
        HashSet hashSet2 = new HashSet();
        for (String str : unmodifiableSet) {
            if (str.isEmpty()) {
                hashSet2.add(Locale.ROOT);
            } else {
                hashSet2.add(new Locale(str));
            }
        }
        f82641d = Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(ProtectedSandApp.s("鈞\u0001"));
        hashSet3.add(ProtectedSandApp.s("鈟\u0001"));
        hashSet3.add(ProtectedSandApp.s("鈠\u0001"));
        hashSet3.add(ProtectedSandApp.s("鈡\u0001"));
        hashSet3.add(ProtectedSandApp.s("鈢\u0001"));
        hashSet3.add(ProtectedSandApp.s("鈣\u0001"));
        hashSet3.add(ProtectedSandApp.s("鈤\u0001"));
        hashSet3.add(ProtectedSandApp.s("鈥\u0001"));
        hashSet3.add(ProtectedSandApp.s("鈦\u0001"));
        hashSet3.add(ProtectedSandApp.s("鈧\u0001"));
        hashSet3.add(ProtectedSandApp.s("鈨\u0001"));
        hashSet3.add(ProtectedSandApp.s("鈩\u0001"));
        hashSet3.add(ProtectedSandApp.s("鈪\u0001"));
        hashSet3.add(ProtectedSandApp.s("鈫\u0001"));
        hashSet3.add(ProtectedSandApp.s("鈬\u0001"));
        hashSet3.add(ProtectedSandApp.s("鈭\u0001"));
        f82639b = Collections.unmodifiableSet(hashSet3);
    }

    private static int b(String str) {
        if (str.equals(ProtectedSandApp.s("鈤\u0001"))) {
            return 6;
        }
        return (str.equals(ProtectedSandApp.s("鈢\u0001")) || str.equals(ProtectedSandApp.s("鈥\u0001")) || str.equals(ProtectedSandApp.s("鈬\u0001")) || str.equals(ProtectedSandApp.s("鈞\u0001")) || str.equals(ProtectedSandApp.s("鈮\u0001"))) ? 2 : 1;
    }

    private static int f(String str) {
        return (str.equals(ProtectedSandApp.s("鈠\u0001")) || str.equals(ProtectedSandApp.s("鈢\u0001")) || str.equals(ProtectedSandApp.s("鈥\u0001")) || str.equals(ProtectedSandApp.s("鈦\u0001"))) ? 13 : 12;
    }

    static net.time4j.i18n.e j(String str, Locale locale) {
        String a5 = y.a(ProtectedSandApp.s("鈯\u0001"), str, ProtectedSandApp.s("鈰\u0001"), str);
        if (!f82640c.contains(net.time4j.i18n.d.getAlias(locale))) {
            locale = Locale.ROOT;
        }
        return net.time4j.i18n.e.i(a5, locale);
    }

    private static ClassLoader m() {
        return d.class.getClassLoader();
    }

    private static String n(net.time4j.i18n.e eVar, String str) {
        String s4 = ProtectedSandApp.s("鈱\u0001");
        return (eVar.c(s4) && ProtectedSandApp.s("鈲\u0001").equals(eVar.g(s4))) ? str.substring(0, 1) : str;
    }

    private static String[] o(net.time4j.i18n.e eVar, String str, String str2, int i4, String str3, x xVar, m mVar, boolean z4, int i5) {
        String[] strArr = new String[i4];
        boolean z5 = str3.length() == 1;
        for (int i6 = 0; i6 < i4; i6++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append('(');
            if (z5) {
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
                if (z4) {
                    sb.append(ProtectedSandApp.s("鈳\u0001"));
                }
            }
            sb.append(ProtectedSandApp.s("鈴\u0001"));
            sb.append(i6 + i5);
            if (z4 && i6 == 6 && str.equals(ProtectedSandApp.s("鈦\u0001"))) {
                sb.append('L');
            }
            String sb2 = sb.toString();
            if (!eVar.c(sb2)) {
                return null;
            }
            String g4 = eVar.g(sb2);
            if (z4 && str.equals(ProtectedSandApp.s("鈟\u0001"))) {
                g4 = p(g4, str2, xVar, mVar);
            }
            strArr[i6] = g4;
        }
        return strArr;
    }

    private static String p(String str, String str2, x xVar, m mVar) {
        boolean equals = str2.equals(ProtectedSandApp.s("鈵\u0001"));
        String s4 = ProtectedSandApp.s("鈶\u0001");
        if (equals) {
            return xVar == x.NARROW ? androidx.constraintlayout.core.motion.key.c.a(s4, str) : androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("鈷\u0001"), str);
        }
        if (str2.equals(ProtectedSandApp.s("鈸\u0001")) || str2.equals(ProtectedSandApp.s("鈹\u0001")) || str2.equals(ProtectedSandApp.s("鈺\u0001")) || str2.equals(ProtectedSandApp.s("鈻\u0001")) || str2.equals(ProtectedSandApp.s("鈼\u0001")) || str2.equals(ProtectedSandApp.s("鈽\u0001"))) {
            return xVar == x.NARROW ? androidx.constraintlayout.core.motion.key.c.a(s4, str) : androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("鉈\u0001"), str);
        }
        boolean equals2 = str2.equals(ProtectedSandApp.s("鈾\u0001"));
        String s5 = ProtectedSandApp.s("鈿\u0001");
        if (equals2) {
            return androidx.constraintlayout.core.motion.key.c.a(s5, str);
        }
        if (str2.equals(ProtectedSandApp.s("鉀\u0001"))) {
            return androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("鉁\u0001"), str);
        }
        if (str2.equals(ProtectedSandApp.s("鉂\u0001"))) {
            return androidx.constraintlayout.core.motion.key.c.a(s5, str);
        }
        if (!str2.equals(ProtectedSandApp.s("鉃\u0001"))) {
            return androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("鉇\u0001"), str);
        }
        if (xVar == x.NARROW) {
            return androidx.compose.runtime.changelist.j.a(str, ProtectedSandApp.s("鉄\u0001"));
        }
        StringBuilder a5 = j4.a(str);
        a5.append(mVar == m.STANDALONE ? ProtectedSandApp.s("鉅\u0001") : ProtectedSandApp.s("鉆\u0001"));
        return a5.toString();
    }

    @Override // net.time4j.format.w
    public Locale[] a() {
        Set<Locale> set = f82641d;
        return (Locale[]) set.toArray(new Locale[set.size()]);
    }

    @Override // net.time4j.format.w
    public boolean c(Locale locale) {
        return true;
    }

    @Override // net.time4j.format.w
    public String[] d(String str, Locale locale, x xVar, m mVar) {
        return f82638a;
    }

    @Override // net.time4j.format.w
    public String[] e(String str, Locale locale, x xVar, m mVar, boolean z4) {
        String str2 = str;
        x xVar2 = xVar;
        if (str2.equals(ProtectedSandApp.s("鈬\u0001")) || str2.equals(ProtectedSandApp.s("鈞\u0001"))) {
            List<String> b5 = net.time4j.format.b.f(locale).n(xVar2, mVar).b();
            return (String[]) b5.toArray(new String[b5.size()]);
        }
        if (str2.equals(ProtectedSandApp.s("鈩\u0001"))) {
            return new String[]{ProtectedSandApp.s("鉋\u0001"), ProtectedSandApp.s("鉌\u0001"), ProtectedSandApp.s("鉍\u0001"), ProtectedSandApp.s("鉎\u0001"), ProtectedSandApp.s("鉏\u0001"), ProtectedSandApp.s("鉐\u0001"), ProtectedSandApp.s("鉑\u0001"), ProtectedSandApp.s("鉒\u0001"), ProtectedSandApp.s("鉓\u0001"), ProtectedSandApp.s("鉔\u0001"), ProtectedSandApp.s("鉕\u0001"), ProtectedSandApp.s("鉉\u0001"), ProtectedSandApp.s("鉊\u0001")};
        }
        if (str2.equals(ProtectedSandApp.s("鈡\u0001")) || str2.equals(ProtectedSandApp.s("鈭\u0001"))) {
            str2 = ProtectedSandApp.s("鈟\u0001");
        } else if (str2.equals(ProtectedSandApp.s("鈤\u0001"))) {
            str2 = ProtectedSandApp.s("鈧\u0001");
        } else if (str2.equals(ProtectedSandApp.s("鈪\u0001"))) {
            return (String[]) net.time4j.format.b.f(locale).n(xVar2, mVar).b().toArray(new String[12]);
        }
        String str3 = str2;
        net.time4j.i18n.e j4 = j(str3, locale);
        if (xVar2 == x.SHORT) {
            xVar2 = x.ABBREVIATED;
        }
        x xVar3 = xVar2;
        String[] o4 = o(j4, str3, locale.getLanguage(), f(str3), n(j4, ProtectedSandApp.s("鉖\u0001")), xVar3, mVar, z4, 1);
        if (o4 == null) {
            m mVar2 = m.STANDALONE;
            if (mVar == mVar2) {
                if (xVar3 != x.NARROW) {
                    o4 = e(str3, locale, xVar3, m.FORMAT, z4);
                }
            } else if (xVar3 == x.ABBREVIATED) {
                o4 = e(str3, locale, x.WIDE, m.FORMAT, z4);
            } else if (xVar3 == x.NARROW) {
                o4 = e(str3, locale, xVar3, mVar2, z4);
            }
        }
        if (o4 != null) {
            return o4;
        }
        throw new MissingResourceException(ProtectedSandApp.s("鉗\u0001"), d.class.getName(), locale.toString());
    }

    @Override // net.time4j.format.w
    public String[] g(String str, Locale locale, x xVar) {
        x xVar2;
        if (str.equals(ProtectedSandApp.s("鈟\u0001")) || str.equals(ProtectedSandApp.s("鈭\u0001"))) {
            return f82638a;
        }
        if (str.equals(ProtectedSandApp.s("鈩\u0001"))) {
            return xVar == x.NARROW ? new String[]{ProtectedSandApp.s("鉚\u0001"), ProtectedSandApp.s("鉛\u0001"), ProtectedSandApp.s("鉘\u0001"), ProtectedSandApp.s("鉙\u0001")} : new String[]{ProtectedSandApp.s("鉞\u0001"), ProtectedSandApp.s("鉟\u0001"), ProtectedSandApp.s("鉜\u0001"), ProtectedSandApp.s("鉝\u0001")};
        }
        String s4 = ProtectedSandApp.s("鈡\u0001");
        if (str.equals(s4) || str.equals(ProtectedSandApp.s("鈪\u0001"))) {
            String[] g4 = g(ProtectedSandApp.s("鈮\u0001"), locale, xVar);
            return new String[]{str.equals(s4) ? g4[0] : g4[1]};
        }
        net.time4j.i18n.e j4 = j(str, locale);
        if (xVar == x.SHORT) {
            xVar = x.ABBREVIATED;
        }
        String[] o4 = o(j4, str, locale.getLanguage(), b(str), n(j4, ProtectedSandApp.s("鉠\u0001")), xVar, m.FORMAT, false, 0);
        if (o4 == null && xVar != (xVar2 = x.ABBREVIATED)) {
            o4 = g(str, locale, xVar2);
        }
        if (o4 != null) {
            return o4;
        }
        throw new MissingResourceException(ProtectedSandApp.s("鉡\u0001"), d.class.getName(), locale.toString());
    }

    @Override // net.time4j.format.w
    public String[] h(String str, Locale locale, x xVar, m mVar) {
        return f82638a;
    }

    @Override // net.time4j.format.w
    public String[] i(String str, Locale locale, x xVar, m mVar) {
        return f82638a;
    }

    @Override // net.time4j.format.w
    public boolean k(String str) {
        return f82639b.contains(str);
    }

    @Override // net.time4j.format.w
    public String[] l() {
        Set<String> set = f82639b;
        return (String[]) set.toArray(new String[set.size()]);
    }

    public String toString() {
        return ProtectedSandApp.s("鉢\u0001");
    }
}
