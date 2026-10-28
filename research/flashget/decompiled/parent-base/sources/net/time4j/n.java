package net.time4j;

import androidx.compose.material3.z3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import net.time4j.engine.ChronoException;

/* compiled from: DayPeriod.java */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    private static final SortedMap<m0, String> f83391d;

    /* renamed from: e, reason: collision with root package name */
    private static n f83392e;

    /* renamed from: f, reason: collision with root package name */
    private static final net.time4j.engine.c<n> f83393f;

    /* renamed from: a, reason: collision with root package name */
    private final transient Locale f83394a;

    /* renamed from: b, reason: collision with root package name */
    private final transient String f83395b;

    /* renamed from: c, reason: collision with root package name */
    private final transient SortedMap<m0, String> f83396c;

    /* compiled from: DayPeriod.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83397a;

        static {
            int[] iArr = new int[net.time4j.format.x.values().length];
            f83397a = iArr;
            try {
                iArr[net.time4j.format.x.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83397a[net.time4j.format.x.NARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: DayPeriod.java */
    static class b extends net.time4j.engine.e<String> implements net.time4j.format.v<String>, net.time4j.engine.a0<net.time4j.engine.r<?>, String> {
        private static final long serialVersionUID = 5589976208326940032L;

        /* renamed from: b, reason: collision with root package name */
        private final transient boolean f83398b;

        /* renamed from: c, reason: collision with root package name */
        private final transient n f83399c;

        b(boolean z4, Locale locale, String str) {
            this(z4, n.u(locale, str));
        }

        private String S(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar, net.time4j.format.m mVar) {
            String str;
            Map map;
            String str2;
            String str3;
            String str4;
            String l4;
            net.time4j.format.m mVar2 = mVar;
            ArrayList arrayList = new ArrayList();
            boolean z4 = this.f83398b;
            String s4 = ProtectedSandApp.s("韜\u0001");
            String s5 = ProtectedSandApp.s("韝\u0001");
            String s6 = ProtectedSandApp.s("韞\u0001");
            String s7 = ProtectedSandApp.s("韟\u0001");
            if (z4) {
                arrayList.add(s5);
                arrayList.add(s4);
                arrayList.add(s7);
                arrayList.add(s6);
            } else {
                arrayList.addAll(new LinkedHashSet(this.f83399c.f83396c.values()));
                if (this.f83399c.r()) {
                    arrayList.add(s7);
                    arrayList.add(s6);
                }
            }
            Map s10 = this.f83399c.r() ? n.s(H(), z()) : null;
            net.time4j.format.x xVar = (net.time4j.format.x) dVar.b(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE);
            boolean booleanValue = ((Boolean) dVar.b(net.time4j.format.a.f82787i, Boolean.TRUE)).booleanValue();
            boolean booleanValue2 = ((Boolean) dVar.b(net.time4j.format.a.f82788j, Boolean.FALSE)).booleanValue();
            int index = parsePosition.getIndex();
            int length = charSequence.length();
            Iterator it = arrayList.iterator();
            String str5 = null;
            int i4 = 0;
            while (it.hasNext()) {
                Iterator it2 = it;
                String str6 = (String) it.next();
                if (this.f83399c.r()) {
                    if (this.f83398b) {
                        l4 = n.l(s10, xVar, mVar2, str6);
                        if (!s10.containsKey(l4)) {
                            if (str6.equals(s7)) {
                                l4 = n.l(s10, xVar, mVar2, s5);
                            } else if (str6.equals(s6)) {
                                l4 = n.l(s10, xVar, mVar2, s4);
                            }
                        }
                    } else {
                        l4 = n.l(s10, xVar, mVar2, str6);
                    }
                    str = s10.containsKey(l4) ? (String) s10.get(l4) : null;
                } else {
                    str = str6;
                }
                if (str != null) {
                    int length2 = str.length();
                    map = s10;
                    int i5 = index;
                    int i6 = 0;
                    boolean z5 = true;
                    while (z5 && i6 < length2) {
                        String str7 = s4;
                        int i7 = index + i6;
                        if (i7 >= length) {
                            str4 = s5;
                            z5 = false;
                        } else {
                            str4 = s5;
                            char charAt = charSequence.charAt(i7);
                            char charAt2 = str.charAt(i6);
                            boolean y4 = booleanValue ? y(charAt, charAt2) : charAt == charAt2;
                            if (y4) {
                                i5++;
                            }
                            z5 = y4;
                        }
                        i6++;
                        s4 = str7;
                        s5 = str4;
                    }
                    str2 = s4;
                    str3 = s5;
                    String s11 = ProtectedSandApp.s("韠\u0001");
                    if (booleanValue2 || length2 == 1) {
                        length2 = i5 - index;
                        if (i4 >= length2) {
                            if (str5 != null && i4 == length2) {
                                if (!this.f83398b) {
                                    str5 = z3.a(str5, s11, str6);
                                }
                                str5 = null;
                            }
                        }
                        i4 = length2;
                        str5 = str6;
                    } else if (z5) {
                        if (str5 != null) {
                            if (this.f83398b) {
                                i4 = length2;
                                str5 = null;
                            } else {
                                str5 = z3.a(str5, s11, str6);
                                i4 = length2;
                            }
                        }
                        i4 = length2;
                        str5 = str6;
                    }
                } else {
                    map = s10;
                    str2 = s4;
                    str3 = s5;
                }
                mVar2 = mVar;
                s10 = map;
                it = it2;
                s4 = str2;
                s5 = str3;
            }
            if (str5 == null) {
                parsePosition.setErrorIndex(index);
            } else {
                parsePosition.setIndex(index + i4);
            }
            return str5;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException(ProtectedSandApp.s("韡\u0001"));
        }

        private Object writeReplace() {
            return new SPX(this, 7);
        }

        private boolean y(char c5, char c6) {
            if (c5 >= 'a' && c5 <= 'z') {
                c5 = (char) (c5 - ' ');
            }
            if (c6 >= 'a' && c6 <= 'z') {
                c6 = (char) (c6 - ' ');
            }
            if (c5 >= 'A' && c5 <= 'Z') {
                return c5 == c6;
            }
            Locale H = H();
            return String.valueOf(c5).toUpperCase(H).equals(String.valueOf(c6).toUpperCase(H));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(net.time4j.engine.r<?> rVar) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(net.time4j.engine.r<?> rVar) {
            return null;
        }

        Object D() {
            return this.f83399c.f83396c;
        }

        @Override // net.time4j.engine.q
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public String getDefaultMaximum() {
            if (this.f83398b) {
                return ProtectedSandApp.s("韜\u0001");
            }
            return (String) this.f83399c.f83396c.get((m0) this.f83399c.f83396c.lastKey());
        }

        @Override // net.time4j.engine.q
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public String getDefaultMinimum() {
            if (this.f83398b) {
                return ProtectedSandApp.s("韝\u0001");
            }
            return (String) this.f83399c.f83396c.get((m0) this.f83399c.f83396c.firstKey());
        }

        Locale H() {
            return this.f83399c.f83394a;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public String getMaximum(net.time4j.engine.r<?> rVar) {
            return getDefaultMaximum();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public String getMinimum(net.time4j.engine.r<?> rVar) {
            return getDefaultMinimum();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public String getValue(net.time4j.engine.r<?> rVar) {
            m0 m0Var = (m0) rVar.r(m0.f83369t);
            if (this.f83398b) {
                return n.p(m0Var);
            }
            if (this.f83399c.r()) {
                Map s4 = n.s(H(), z());
                String s5 = m0Var.U0() ? ProtectedSandApp.s("韟\u0001") : m0Var.k(m0.a1(12)) ? ProtectedSandApp.s("韞\u0001") : null;
                if (s5 != null && s4.containsKey(n.l(s4, net.time4j.format.x.ABBREVIATED, net.time4j.format.m.FORMAT, s5))) {
                    return s5;
                }
            }
            return (String) this.f83399c.f83396c.get(this.f83399c.q(m0Var));
        }

        boolean M() {
            return this.f83398b;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public boolean j(net.time4j.engine.r<?> rVar, String str) {
            return false;
        }

        @Override // net.time4j.format.v
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public String parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            int index = parsePosition.getIndex();
            net.time4j.engine.c<net.time4j.format.m> cVar = net.time4j.format.a.f82786h;
            net.time4j.format.m mVar = net.time4j.format.m.FORMAT;
            net.time4j.format.m mVar2 = (net.time4j.format.m) dVar.b(cVar, mVar);
            String S = S(charSequence, parsePosition, dVar, mVar2);
            if (S != null || !((Boolean) dVar.b(net.time4j.format.a.f82789k, Boolean.TRUE)).booleanValue()) {
                return S;
            }
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            if (mVar2 == mVar) {
                mVar = net.time4j.format.m.STANDALONE;
            }
            return S(charSequence, parsePosition, dVar, mVar);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.r<?> withValue(net.time4j.engine.r<?> rVar, String str, boolean z4) {
            throw new IllegalArgumentException(ProtectedSandApp.s("韢\u0001"));
        }

        @Override // net.time4j.engine.e
        protected <T extends net.time4j.engine.r<T>> net.time4j.engine.a0<T, String> g(net.time4j.engine.x<T> xVar) {
            if (xVar.K(m0.f83369t)) {
                return this;
            }
            return null;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public char getSymbol() {
            return this.f83398b ? 'b' : 'B';
        }

        @Override // net.time4j.engine.q
        public Class<String> getType() {
            return String.class;
        }

        @Override // net.time4j.engine.q
        public boolean isDateElement() {
            return false;
        }

        @Override // net.time4j.engine.q
        public boolean isTimeElement() {
            return true;
        }

        @Override // net.time4j.engine.e
        protected boolean k(net.time4j.engine.e<?> eVar) {
            return this.f83399c.equals(((b) eVar).f83399c);
        }

        @Override // net.time4j.format.v
        public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException, ChronoException {
            net.time4j.format.x xVar = (net.time4j.format.x) dVar.b(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE);
            net.time4j.format.m mVar = (net.time4j.format.m) dVar.b(net.time4j.format.a.f82786h, net.time4j.format.m.FORMAT);
            appendable.append(this.f83398b ? this.f83399c.n(xVar, mVar).apply(pVar) : this.f83399c.k(xVar, mVar).apply(pVar));
        }

        @Override // net.time4j.engine.e
        public String toString() {
            StringBuilder sb = new StringBuilder(32);
            sb.append(name());
            sb.append('@');
            sb.append(this.f83399c);
            return sb.toString();
        }

        String z() {
            return this.f83399c.f83395b;
        }

        b(boolean z4, n nVar) {
            super(z4 ? ProtectedSandApp.s("韚\u0001") : ProtectedSandApp.s("韛\u0001"));
            this.f83398b = z4;
            this.f83399c = nVar;
        }
    }

    /* compiled from: DayPeriod.java */
    static class c implements net.time4j.engine.s {
        c() {
        }

        private static n e(Locale locale, net.time4j.engine.d dVar) {
            return dVar.c(n.f83393f) ? (n) dVar.a(n.f83393f) : n.u(locale, (String) dVar.b(net.time4j.format.a.f82780b, ProtectedSandApp.s("韣\u0001")));
        }

        private static int f(net.time4j.engine.r<?> rVar) {
            net.time4j.c<Integer, m0> cVar = m0.f83371v;
            if (rVar.w(cVar)) {
                int intValue = ((Integer) rVar.r(cVar)).intValue();
                if (intValue == 12) {
                    return 0;
                }
                return intValue;
            }
            q0<Integer, m0> q0Var = m0.f83373x;
            if (rVar.w(q0Var)) {
                return ((Integer) rVar.r(q0Var)).intValue();
            }
            return -1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x013e A[LOOP:0: B:12:0x0044->B:23:0x013e, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x012d A[EDGE_INSN: B:24:0x012d->B:25:0x012d BREAK  A[LOOP:0: B:12:0x0044->B:23:0x013e], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0128 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v2, types: [net.time4j.engine.r] */
        /* JADX WARN: Type inference failed for: r0v5, types: [net.time4j.engine.r, net.time4j.engine.r<?>] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        @Override // net.time4j.engine.s
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public net.time4j.engine.r<?> a(net.time4j.engine.r<?> r17, java.util.Locale r18, net.time4j.engine.d r19) {
            /*
                Method dump skipped, instructions count: 384
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.n.c.a(net.time4j.engine.r, java.util.Locale, net.time4j.engine.d):net.time4j.engine.r");
        }

        @Override // net.time4j.engine.s
        public Set<net.time4j.engine.q<?>> b(Locale locale, net.time4j.engine.d dVar) {
            n e4 = e(locale, dVar);
            HashSet hashSet = new HashSet();
            hashSet.add(new b(false, e4));
            if (!dVar.c(n.f83393f)) {
                hashSet.add(new b(true, e4));
            }
            return Collections.unmodifiableSet(hashSet);
        }

        @Override // net.time4j.engine.s
        public boolean c(net.time4j.engine.q<?> qVar) {
            return qVar instanceof b;
        }

        @Override // net.time4j.engine.s
        public boolean d(Class<?> cls) {
            return m0.class.isAssignableFrom(cls);
        }
    }

    /* compiled from: DayPeriod.java */
    private class d implements net.time4j.engine.t<net.time4j.engine.p, String> {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f83400a;

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.format.x f83401b;

        /* renamed from: c, reason: collision with root package name */
        private final net.time4j.format.m f83402c;

        d(boolean z4, net.time4j.format.x xVar, net.time4j.format.m mVar) {
            if (xVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("韪\u0001"));
            }
            if (mVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("韩\u0001"));
            }
            this.f83400a = z4;
            this.f83401b = xVar;
            this.f83402c = mVar;
        }

        @Override // net.time4j.engine.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(net.time4j.engine.p pVar) {
            m0 m0Var = (m0) pVar.r(m0.f83369t);
            n nVar = n.this;
            Locale locale = nVar.f83394a;
            boolean z4 = this.f83400a;
            String s4 = ProtectedSandApp.s("韫\u0001");
            String s5 = ProtectedSandApp.s("韬\u0001");
            if (z4) {
                String p4 = n.p(m0Var);
                if (!nVar.r()) {
                    return p4;
                }
                Map s6 = n.s(locale, nVar.f83395b);
                String l4 = n.l(s6, this.f83401b, this.f83402c, p4);
                if (!s6.containsKey(l4)) {
                    if (p4.equals(s5)) {
                        l4 = n.l(s6, this.f83401b, this.f83402c, ProtectedSandApp.s("韭\u0001"));
                    } else if (p4.equals(s4)) {
                        l4 = n.l(s6, this.f83401b, this.f83402c, ProtectedSandApp.s("韮\u0001"));
                    }
                }
                if (s6.containsKey(l4)) {
                    return (String) s6.get(l4);
                }
            } else {
                if (!nVar.r()) {
                    return (String) nVar.f83396c.get(nVar.q(m0Var));
                }
                Map s7 = n.s(locale, nVar.f83395b);
                if (m0Var.U0()) {
                    String l5 = n.l(s7, this.f83401b, this.f83402c, s5);
                    if (s7.containsKey(l5)) {
                        return (String) s7.get(l5);
                    }
                } else if (m0Var.k(m0.a1(12))) {
                    String l6 = n.l(s7, this.f83401b, this.f83402c, s4);
                    if (s7.containsKey(l6)) {
                        return (String) s7.get(l6);
                    }
                }
                String l7 = n.l(s7, this.f83401b, this.f83402c, (String) nVar.f83396c.get(nVar.q(m0Var)));
                if (s7.containsKey(l7)) {
                    return (String) s7.get(l7);
                }
            }
            c0 c0Var = (c0) m0Var.r(m0.f83370u);
            if (locale == null) {
                locale = Locale.ROOT;
            }
            return c0Var.getDisplayName(locale);
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        treeMap.put(m0.Y0(), ProtectedSandApp.s("韸\u0001"));
        treeMap.put(m0.a1(12), ProtectedSandApp.s("韹\u0001"));
        SortedMap<m0, String> unmodifiableSortedMap = Collections.unmodifiableSortedMap(treeMap);
        f83391d = unmodifiableSortedMap;
        f83392e = new n(Locale.ROOT, ProtectedSandApp.s("韺\u0001"), unmodifiableSortedMap);
        f83393f = net.time4j.format.a.e(ProtectedSandApp.s("韻\u0001"), n.class);
    }

    private n(Locale locale, String str, SortedMap<m0, String> sortedMap) {
        this.f83394a = locale;
        this.f83395b = str;
        this.f83396c = Collections.unmodifiableSortedMap(sortedMap);
    }

    private static boolean a(String str) {
        return str.charAt(0) == 'T' && str.length() == 5 && Character.isDigit(str.charAt(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String l(Map<String, String> map, net.time4j.format.x xVar, net.time4j.format.m mVar, String str) {
        if (xVar == net.time4j.format.x.SHORT) {
            xVar = net.time4j.format.x.ABBREVIATED;
        }
        String a5 = android.support.v4.media.c.a(new StringBuilder(), w(xVar, mVar), str);
        if (map.containsKey(a5)) {
            return a5;
        }
        if (mVar == net.time4j.format.m.STANDALONE) {
            net.time4j.format.x xVar2 = net.time4j.format.x.ABBREVIATED;
            return xVar == xVar2 ? l(map, xVar, net.time4j.format.m.FORMAT, str) : l(map, xVar2, mVar, str);
        }
        net.time4j.format.x xVar3 = net.time4j.format.x.ABBREVIATED;
        return xVar != xVar3 ? l(map, xVar3, mVar, str) : a5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String p(m0 m0Var) {
        int intValue = ((Integer) m0Var.r(m0.B)).intValue();
        return (intValue == 0 || intValue == 1440) ? ProtectedSandApp.s("韽\u0001") : intValue < 720 ? ProtectedSandApp.s("韸\u0001") : intValue == 720 ? ProtectedSandApp.s("韼\u0001") : ProtectedSandApp.s("韹\u0001");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r() {
        return this.f83394a != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> s(Locale locale, String str) {
        Map<String, String> o4 = net.time4j.format.b.d(str, locale).o();
        String s4 = ProtectedSandApp.s("韺\u0001");
        if (str.equals(s4)) {
            return o4;
        }
        return !ProtectedSandApp.s("響\u0001").equals(o4.get(ProtectedSandApp.s("韾\u0001"))) ? net.time4j.format.b.d(s4, locale).o() : o4;
    }

    public static n t(Locale locale) {
        return u(locale, ProtectedSandApp.s("韺\u0001"));
    }

    static n u(Locale locale, String str) {
        String language = locale.getLanguage();
        if (language.equals(ProtectedSandApp.s("頀\u0001"))) {
            locale = new Locale(ProtectedSandApp.s("頁\u0001"));
        }
        Map<String, String> s4 = s(locale, str);
        TreeMap treeMap = new TreeMap();
        for (String str2 : s4.keySet()) {
            if (a(str2)) {
                int parseInt = Integer.parseInt(str2.substring(1, 3));
                int parseInt2 = Integer.parseInt(str2.substring(3, 5));
                m0 Y0 = m0.Y0();
                String s5 = ProtectedSandApp.s("頂\u0001");
                if (parseInt != 24) {
                    if (parseInt < 0 || parseInt >= 24 || parseInt2 < 0 || parseInt2 >= 60) {
                        throw new IllegalStateException(s5.concat(str2));
                    }
                    Y0 = Y0.W((parseInt * 60) + parseInt2, j.MINUTES);
                } else if (parseInt2 != 0) {
                    throw new IllegalStateException(s5.concat(str2));
                }
                treeMap.put(Y0, s4.get(str2));
            }
        }
        if (treeMap.isEmpty() || language.isEmpty()) {
            return f83392e;
        }
        Iterator it = treeMap.keySet().iterator();
        String str3 = "";
        while (it.hasNext()) {
            String str4 = (String) treeMap.get((m0) it.next());
            if (str4.equals(str3)) {
                it.remove();
            } else {
                str3 = str4;
            }
        }
        return new n(locale, str, treeMap);
    }

    public static n v(Map<m0, String> map) {
        if (map.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("頄\u0001"));
        }
        TreeMap treeMap = new TreeMap(map);
        for (m0 m0Var : map.keySet()) {
            if (m0Var.u() == 24) {
                treeMap.put(m0.f83366q, map.get(m0Var));
                treeMap.remove(m0Var);
            } else if (map.get(m0Var).isEmpty()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("頃\u0001") + map);
            }
        }
        return new n(null, "", treeMap);
    }

    private static String w(net.time4j.format.x xVar, net.time4j.format.m mVar) {
        int i4 = a.f83397a[xVar.ordinal()];
        char c5 = i4 != 1 ? i4 != 2 ? 'a' : 'n' : 'w';
        if (mVar == net.time4j.format.m.STANDALONE) {
            c5 = Character.toUpperCase(c5);
        }
        return ProtectedSandApp.s("項\u0001") + c5 + ProtectedSandApp.s("順\u0001");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        Locale locale = this.f83394a;
        if (locale == null) {
            if (nVar.f83394a != null) {
                return false;
            }
        } else if (!locale.equals(nVar.f83394a)) {
            return false;
        }
        return this.f83396c.equals(nVar.f83396c) && this.f83395b.equals(nVar.f83395b);
    }

    public int hashCode() {
        return this.f83396c.hashCode();
    }

    public net.time4j.engine.t<net.time4j.engine.p, String> j() {
        return k(net.time4j.format.x.WIDE, net.time4j.format.m.FORMAT);
    }

    public net.time4j.engine.t<net.time4j.engine.p, String> k(net.time4j.format.x xVar, net.time4j.format.m mVar) {
        return new d(false, xVar, mVar);
    }

    public net.time4j.engine.t<net.time4j.engine.p, String> m() {
        return n(net.time4j.format.x.WIDE, net.time4j.format.m.FORMAT);
    }

    public net.time4j.engine.t<net.time4j.engine.p, String> n(net.time4j.format.x xVar, net.time4j.format.m mVar) {
        return new d(true, xVar, mVar);
    }

    public m0 o(m0 m0Var) {
        if (m0Var.u() == 24) {
            m0Var = m0.f83366q;
        }
        for (m0 m0Var2 : this.f83396c.keySet()) {
            if (m0Var.f(m0Var2)) {
                return m0Var2;
            }
        }
        return this.f83396c.firstKey();
    }

    public m0 q(m0 m0Var) {
        if (m0Var.u() == 24) {
            m0Var = m0.f83366q;
        }
        m0 lastKey = this.f83396c.lastKey();
        for (m0 m0Var2 : this.f83396c.keySet()) {
            if (m0Var.k(m0Var2)) {
                return m0Var2;
            }
            if (m0Var.f(m0Var2)) {
                break;
            }
            lastKey = m0Var2;
        }
        return lastKey;
    }

    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(64, ProtectedSandApp.s("頇\u0001"));
        if (r()) {
            a5.append(ProtectedSandApp.s("須\u0001"));
            a5.append(this.f83394a);
            a5.append(',');
            if (!this.f83395b.equals(ProtectedSandApp.s("韺\u0001"))) {
                a5.append(ProtectedSandApp.s("頉\u0001"));
                a5.append(this.f83395b);
                a5.append(',');
            }
        }
        a5.append(this.f83396c);
        a5.append(']');
        return a5.toString();
    }
}
