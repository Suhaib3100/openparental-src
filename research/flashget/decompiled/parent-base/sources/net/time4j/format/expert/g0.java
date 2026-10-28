package net.time4j.format.expert;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.format.expert.l0;

/* compiled from: TimezoneGenericProcessor.java */
/* loaded from: classes7.dex */
final class g0 implements i<net.time4j.tz.k> {

    /* renamed from: i, reason: collision with root package name */
    private static final int f82920i = 25;

    /* renamed from: b, reason: collision with root package name */
    private final net.time4j.tz.d f82922b;

    /* renamed from: c, reason: collision with root package name */
    private final i<net.time4j.tz.k> f82923c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<net.time4j.tz.k> f82924d;

    /* renamed from: e, reason: collision with root package name */
    private final net.time4j.format.g f82925e;

    /* renamed from: f, reason: collision with root package name */
    private final Locale f82926f;

    /* renamed from: g, reason: collision with root package name */
    private final int f82927g;

    /* renamed from: j, reason: collision with root package name */
    private static final String f82921j = ProtectedSandApp.s("鑼\u0001");

    /* renamed from: h, reason: collision with root package name */
    private static final Map<net.time4j.tz.d, ConcurrentMap<Locale, l0>> f82919h = new EnumMap(net.time4j.tz.d.class);

    static {
        for (net.time4j.tz.d dVar : net.time4j.tz.d.values()) {
            f82919h.put(dVar, new ConcurrentHashMap());
        }
    }

    g0(net.time4j.tz.d dVar) {
        this.f82922b = dVar;
        this.f82923c = new p(dVar.isAbbreviation());
        this.f82924d = null;
        this.f82925e = net.time4j.format.g.SMART;
        this.f82926f = Locale.ROOT;
        this.f82927g = 0;
    }

    private l0 a(Locale locale) {
        l0.b bVar = null;
        for (net.time4j.tz.k kVar : net.time4j.tz.l.z()) {
            String E = net.time4j.tz.l.E(kVar, this.f82922b, locale);
            if (!E.equals(kVar.canonical())) {
                bVar = l0.d(bVar, E, kVar);
            }
        }
        return new l0(bVar);
    }

    private static List<net.time4j.tz.k> b(List<net.time4j.tz.k> list) {
        if (list.size() > 1) {
            ArrayList arrayList = new ArrayList(list);
            int size = list.size();
            for (int i4 = 1; i4 < size; i4++) {
                net.time4j.tz.k kVar = list.get(i4);
                if (kVar.canonical().startsWith(ProtectedSandApp.s("鑽\u0001"))) {
                    arrayList.remove(kVar);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    private static List<net.time4j.tz.k> c(l0 l0Var, CharSequence charSequence, int[] iArr) {
        String f4 = l0Var.f(charSequence, iArr[0]);
        List<net.time4j.tz.k> b5 = l0Var.b(f4);
        if (!b5.isEmpty()) {
            iArr[0] = f4.length() + iArr[0];
        }
        return b5;
    }

    private List<net.time4j.tz.k> d(List<net.time4j.tz.k> list, Locale locale, net.time4j.format.g gVar) {
        boolean z4;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        String s4 = ProtectedSandApp.s("鑼\u0001");
        hashMap.put(s4, arrayList);
        Iterator<net.time4j.tz.k> it = list.iterator();
        while (true) {
            z4 = false;
            if (!it.hasNext()) {
                break;
            }
            String canonical = it.next().canonical();
            Set<net.time4j.tz.k> set = this.f82924d;
            int indexOf = canonical.indexOf(126);
            String substring = indexOf >= 0 ? canonical.substring(0, indexOf) : s4;
            if (set == null) {
                set = net.time4j.tz.l.J(locale, gVar.isSmart(), substring);
            }
            Iterator<net.time4j.tz.k> it2 = set.iterator();
            while (true) {
                if (it2.hasNext()) {
                    net.time4j.tz.k next = it2.next();
                    if (next.canonical().equals(canonical)) {
                        List list2 = (List) hashMap.get(substring);
                        if (list2 == null) {
                            list2 = new ArrayList();
                            hashMap.put(substring, list2);
                        }
                        list2.add(next);
                    }
                }
            }
        }
        List<net.time4j.tz.k> list3 = (List) hashMap.get(s4);
        if (!list3.isEmpty()) {
            return list3;
        }
        hashMap.remove(s4);
        Iterator it3 = hashMap.keySet().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            List<net.time4j.tz.k> list4 = (List) hashMap.get((String) it3.next());
            if (!list4.isEmpty()) {
                z4 = true;
                list = list4;
                break;
            }
        }
        if (!z4) {
            list = Collections.emptyList();
        }
        return list;
    }

    private static String e(List<net.time4j.tz.k> list) {
        StringBuilder sb = new StringBuilder(list.size() * 16);
        sb.append('{');
        boolean z4 = true;
        for (net.time4j.tz.k kVar : list) {
            if (z4) {
                z4 = false;
            } else {
                sb.append(',');
            }
            sb.append(kVar.canonical());
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (this.f82922b == g0Var.f82922b) {
            Set<net.time4j.tz.k> set = this.f82924d;
            Set<net.time4j.tz.k> set2 = g0Var.f82924d;
            if (set == null) {
                if (set2 == null) {
                    return true;
                }
            } else if (set.equals(set2)) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.format.expert.i
    public net.time4j.engine.q<net.time4j.tz.k> getElement() {
        return f0.TIMEZONE_ID;
    }

    public int hashCode() {
        return this.f82922b.hashCode();
    }

    @Override // net.time4j.format.expert.i
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.i
    public void parse(CharSequence charSequence, w wVar, net.time4j.engine.d dVar, x<?> xVar, boolean z4) {
        List<net.time4j.tz.k> list;
        boolean z5;
        l0 putIfAbsent;
        int f4 = wVar.f();
        int length = charSequence.length();
        int intValue = z4 ? this.f82927g : ((Integer) dVar.b(net.time4j.format.a.f82797s, 0)).intValue();
        if (intValue > 0) {
            length -= intValue;
        }
        if (f4 >= length) {
            wVar.l(f4, ProtectedSandApp.s("鑾\u0001") + this.f82922b + ProtectedSandApp.s("鑿\u0001"));
            return;
        }
        Locale locale = z4 ? this.f82926f : (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT);
        net.time4j.format.g gVar = z4 ? this.f82925e : (net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART);
        String charSequence2 = charSequence.subSequence(f4, Math.min(f4 + 3, length)).toString();
        if (charSequence2.startsWith(ProtectedSandApp.s("钀\u0001")) || charSequence2.startsWith(ProtectedSandApp.s("钁\u0001"))) {
            this.f82923c.parse(charSequence, wVar, dVar, xVar, z4);
            return;
        }
        ConcurrentMap<Locale, l0> concurrentMap = f82919h.get(this.f82922b);
        l0 l0Var = concurrentMap.get(locale);
        if (l0Var == null) {
            l0Var = a(locale);
            if (concurrentMap.size() < 25 && (putIfAbsent = concurrentMap.putIfAbsent(locale, l0Var)) != null) {
                l0Var = putIfAbsent;
            }
        }
        int[] iArr = {f4};
        List<net.time4j.tz.k> c5 = c(l0Var, charSequence.subSequence(0, length), iArr);
        int size = c5.size();
        if (size == 0) {
            wVar.l(f4, ProtectedSandApp.s("钂\u0001").concat(charSequence2));
            return;
        }
        if (size > 1 && !gVar.isStrict()) {
            c5 = b(c5);
            size = c5.size();
        }
        if (size <= 1 || gVar.isLax()) {
            list = c5;
        } else {
            net.time4j.tz.k kVar = (net.time4j.tz.k) dVar.b(net.time4j.format.a.f82782d, net.time4j.tz.p.f83649l);
            if (kVar instanceof net.time4j.tz.p) {
                list = d(c5, locale, gVar);
            } else {
                Iterator<net.time4j.tz.k> it = c5.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        list = c5;
                        z5 = false;
                        break;
                    } else {
                        net.time4j.tz.k next = it.next();
                        if (next.canonical().equals(kVar.canonical())) {
                            list = Collections.singletonList(next);
                            z5 = true;
                            break;
                        }
                    }
                }
                if (!z5) {
                    list = d(list, locale, gVar);
                }
            }
        }
        int size2 = list.size();
        if (size2 != 0) {
            if (size2 == 1 || gVar.isLax()) {
                xVar.R(f0.TIMEZONE_ID, list.get(0));
                wVar.m(iArr[0]);
                return;
            }
            wVar.l(f4, ProtectedSandApp.s("钇\u0001") + this.f82922b + ProtectedSandApp.s("针\u0001") + charSequence2 + ProtectedSandApp.s("钉\u0001") + e(list));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<net.time4j.tz.k> it2 = c5.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().canonical());
        }
        wVar.l(f4, ProtectedSandApp.s("钃\u0001") + charSequence2 + ProtectedSandApp.s("钄\u0001") + locale + ProtectedSandApp.s("钅\u0001") + this.f82922b + ProtectedSandApp.s("钆\u0001") + arrayList);
    }

    @Override // net.time4j.format.expert.i
    public int print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, Set<h> set, boolean z4) throws IOException {
        net.time4j.tz.k kVar;
        if (pVar.e()) {
            kVar = pVar.v();
        } else {
            net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f82782d;
            if (!dVar.c(cVar)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("钊\u0001") + this.f82922b + ProtectedSandApp.s("钋\u0001") + pVar);
            }
            kVar = (net.time4j.tz.k) dVar.a(cVar);
        }
        if (kVar instanceof net.time4j.tz.p) {
            return this.f82923c.print(pVar, appendable, dVar, set, z4);
        }
        String D = net.time4j.tz.l.c0(kVar).D(this.f82922b, z4 ? this.f82926f : (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT));
        if (D.equals(kVar.canonical())) {
            return this.f82923c.print(pVar, appendable, dVar, set, z4);
        }
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        appendable.append(D);
        int length2 = D.length();
        if (length != -1 && length2 > 0 && set != null) {
            set.add(new h(f0.TIMEZONE_ID, length, length + length2));
        }
        return length2;
    }

    @Override // net.time4j.format.expert.i
    public i<net.time4j.tz.k> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i4) {
        return new g0(this.f82922b, this.f82923c, this.f82924d, (net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART), (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT), ((Integer) dVar.b(net.time4j.format.a.f82797s, 0)).intValue());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        m2.a(g0.class, sb, ProtectedSandApp.s("钌\u0001"));
        sb.append(this.f82922b);
        sb.append(ProtectedSandApp.s("钍\u0001"));
        sb.append(this.f82924d);
        sb.append(']');
        return sb.toString();
    }

    @Override // net.time4j.format.expert.i
    public i<net.time4j.tz.k> withElement(net.time4j.engine.q<net.time4j.tz.k> qVar) {
        return this;
    }

    g0(net.time4j.tz.d dVar, Set<net.time4j.tz.k> set) {
        this.f82922b = dVar;
        this.f82923c = new p(dVar.isAbbreviation());
        this.f82924d = Collections.unmodifiableSet(new LinkedHashSet(set));
        this.f82925e = net.time4j.format.g.SMART;
        this.f82926f = Locale.ROOT;
        this.f82927g = 0;
    }

    private g0(net.time4j.tz.d dVar, i<net.time4j.tz.k> iVar, Set<net.time4j.tz.k> set, net.time4j.format.g gVar, Locale locale, int i4) {
        this.f82922b = dVar;
        this.f82923c = iVar;
        this.f82924d = set;
        this.f82925e = gVar;
        this.f82926f = locale;
        this.f82927g = i4;
    }
}
