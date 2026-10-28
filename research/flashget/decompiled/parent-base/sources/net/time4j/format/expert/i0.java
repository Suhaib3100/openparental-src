package net.time4j.format.expert;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.format.expert.l0;

/* compiled from: TimezoneNameProcessor.java */
/* loaded from: classes7.dex */
final class i0 implements i<net.time4j.tz.k> {

    /* renamed from: j, reason: collision with root package name */
    private static final int f82933j = 25;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f82935b;

    /* renamed from: c, reason: collision with root package name */
    private final i<net.time4j.tz.k> f82936c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<net.time4j.tz.k> f82937d;

    /* renamed from: e, reason: collision with root package name */
    private final net.time4j.format.g f82938e;

    /* renamed from: f, reason: collision with root package name */
    private final Locale f82939f;

    /* renamed from: g, reason: collision with root package name */
    private final int f82940g;

    /* renamed from: k, reason: collision with root package name */
    private static final String f82934k = ProtectedSandApp.s("钱\u0001");

    /* renamed from: h, reason: collision with root package name */
    private static final ConcurrentMap<Locale, a> f82931h = new ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    private static final ConcurrentMap<Locale, a> f82932i = new ConcurrentHashMap();

    /* compiled from: TimezoneNameProcessor.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final l0 f82941a;

        /* renamed from: b, reason: collision with root package name */
        private final l0 f82942b;

        a(l0 l0Var, l0 l0Var2) {
            this.f82941a = l0Var;
            this.f82942b = l0Var2;
        }

        void a(CharSequence charSequence, int i4, List<net.time4j.tz.k> list, List<net.time4j.tz.k> list2, int[] iArr) {
            String f4 = this.f82941a.f(charSequence, i4);
            int length = f4.length();
            iArr[0] = i4 + length;
            String f5 = this.f82942b.f(charSequence, i4);
            int length2 = f5.length();
            iArr[1] = i4 + length2;
            if (length2 > length) {
                list2.addAll(this.f82942b.b(f5));
                return;
            }
            if (length2 < length) {
                list.addAll(this.f82941a.b(f4));
            } else if (length > 0) {
                list.addAll(this.f82941a.b(f4));
                list2.addAll(this.f82942b.b(f5));
            }
        }
    }

    i0(boolean z4) {
        this.f82935b = z4;
        this.f82936c = new p(z4);
        this.f82937d = null;
        this.f82938e = net.time4j.format.g.SMART;
        this.f82939f = Locale.ROOT;
        this.f82940g = 0;
    }

    private l0 a(Locale locale, boolean z4) {
        net.time4j.tz.d d5 = d(z4);
        l0.b bVar = null;
        for (net.time4j.tz.k kVar : net.time4j.tz.l.z()) {
            String E = net.time4j.tz.l.E(kVar, d5, locale);
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
                if (kVar.canonical().startsWith(ProtectedSandApp.s("钲\u0001"))) {
                    arrayList.remove(kVar);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    private String c(CharSequence charSequence, int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        for (int i6 = i4; i6 < i5; i6++) {
            char charAt = charSequence.charAt(i6);
            if (!Character.isLetter(charAt) && (this.f82935b || i6 <= i4 || Character.isDigit(charAt))) {
                break;
            }
            sb.append(charAt);
        }
        return sb.toString().trim();
    }

    private net.time4j.tz.d d(boolean z4) {
        return z4 ? this.f82935b ? net.time4j.tz.d.SHORT_DAYLIGHT_TIME : net.time4j.tz.d.LONG_DAYLIGHT_TIME : this.f82935b ? net.time4j.tz.d.SHORT_STANDARD_TIME : net.time4j.tz.d.LONG_STANDARD_TIME;
    }

    private List<net.time4j.tz.k> e(List<net.time4j.tz.k> list, Locale locale, net.time4j.format.g gVar) {
        boolean z4;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        String s4 = ProtectedSandApp.s("钱\u0001");
        hashMap.put(s4, arrayList);
        Iterator<net.time4j.tz.k> it = list.iterator();
        while (true) {
            z4 = false;
            if (!it.hasNext()) {
                break;
            }
            String canonical = it.next().canonical();
            Set<net.time4j.tz.k> set = this.f82937d;
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

    private static String f(List<net.time4j.tz.k> list) {
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
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (this.f82935b == i0Var.f82935b) {
            Set<net.time4j.tz.k> set = this.f82937d;
            Set<net.time4j.tz.k> set2 = i0Var.f82937d;
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
        Set<net.time4j.tz.k> set = this.f82937d;
        return (set == null ? 0 : set.hashCode()) + (this.f82935b ? 1 : 0);
    }

    @Override // net.time4j.format.expert.i
    public boolean isNumerical() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v4 */
    @Override // net.time4j.format.expert.i
    public void parse(CharSequence charSequence, w wVar, net.time4j.engine.d dVar, x<?> xVar, boolean z4) {
        a aVar;
        List<net.time4j.tz.k> list;
        List<net.time4j.tz.k> list2;
        ?? r11;
        boolean z5;
        a putIfAbsent;
        int f4 = wVar.f();
        int length = charSequence.length();
        int intValue = z4 ? this.f82940g : ((Integer) dVar.b(net.time4j.format.a.f82797s, 0)).intValue();
        if (intValue > 0) {
            length -= intValue;
        }
        if (f4 >= length) {
            wVar.l(f4, ProtectedSandApp.s("钳\u0001"));
            return;
        }
        Locale locale = z4 ? this.f82939f : (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT);
        net.time4j.format.g gVar = z4 ? this.f82938e : (net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART);
        String c5 = c(charSequence, f4, length);
        if (c5.startsWith(ProtectedSandApp.s("钴\u0001")) || c5.startsWith(ProtectedSandApp.s("钵\u0001"))) {
            this.f82936c.parse(charSequence, wVar, dVar, xVar, z4);
            return;
        }
        ConcurrentMap<Locale, a> concurrentMap = this.f82935b ? f82931h : f82932i;
        a aVar2 = concurrentMap.get(locale);
        if (aVar2 == null) {
            aVar = new a(a(locale, false), a(locale, true));
            if (concurrentMap.size() < 25 && (putIfAbsent = concurrentMap.putIfAbsent(locale, aVar)) != null) {
                aVar = putIfAbsent;
            }
        } else {
            aVar = aVar2;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int[] iArr = new int[2];
        aVar.a(charSequence.subSequence(0, length), f4, arrayList, arrayList2, iArr);
        int size = arrayList2.size() + arrayList.size();
        List<net.time4j.tz.k> list3 = arrayList;
        List<net.time4j.tz.k> list4 = arrayList2;
        if (size == 0) {
            wVar.l(f4, ProtectedSandApp.s("钶\u0001") + c5 + ProtectedSandApp.s("钷\u0001"));
            return;
        }
        if (size > 1) {
            list3 = arrayList;
            list4 = arrayList2;
            if (!gVar.isStrict()) {
                List<net.time4j.tz.k> b5 = b(arrayList);
                List<net.time4j.tz.k> b6 = b(arrayList2);
                size = b6.size() + b5.size();
                list3 = b5;
                list4 = b6;
            }
        }
        if (size <= 1 || gVar.isLax()) {
            list = list3;
            list2 = list4;
        } else {
            net.time4j.tz.k kVar = (net.time4j.tz.k) dVar.b(net.time4j.format.a.f82782d, net.time4j.tz.p.f83649l);
            if (kVar instanceof net.time4j.tz.p) {
                list = list3;
                list2 = list4;
                z5 = false;
            } else {
                Iterator<net.time4j.tz.k> it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        list = list3;
                        list2 = list4;
                        z5 = false;
                        break;
                    } else {
                        net.time4j.tz.k next = it.next();
                        if (next.canonical().equals(kVar.canonical())) {
                            list = Collections.singletonList(next);
                            list2 = Collections.emptyList();
                            z5 = true;
                            break;
                        }
                    }
                }
                if (!z5) {
                    Iterator<net.time4j.tz.k> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        net.time4j.tz.k next2 = it2.next();
                        if (next2.canonical().equals(kVar.canonical())) {
                            list = Collections.emptyList();
                            list2 = Collections.singletonList(next2);
                            z5 = true;
                            break;
                        }
                    }
                }
            }
            if (!z5) {
                if (list.size() > 0) {
                    list = e(list, locale, gVar);
                }
                if (list2.size() > 0) {
                    list2 = e(list2, locale, gVar);
                }
            }
        }
        int size2 = list2.size() + list.size();
        if (size2 == 0) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<net.time4j.tz.k> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(it3.next().canonical());
            }
            Iterator<net.time4j.tz.k> it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList3.add(it4.next().canonical());
            }
            wVar.l(f4, ProtectedSandApp.s("钸\u0001") + c5 + ProtectedSandApp.s("钹\u0001") + locale + ProtectedSandApp.s("钺\u0001") + arrayList3);
            return;
        }
        if (list.size() > 0) {
            if ((size2 != 2 || list2.size() != 1 || !list.get(0).canonical().equals(list2.get(0).canonical())) && !list2.isEmpty()) {
                ArrayList arrayList4 = new ArrayList(list);
                arrayList4.addAll(list2);
                list = arrayList4;
            }
            r11 = 0;
        } else {
            list = list2;
            r11 = 1;
        }
        if (list.size() == 1 || gVar.isLax()) {
            xVar.R(f0.TIMEZONE_ID, list.get(0));
            xVar.R(net.time4j.engine.c0.DAYLIGHT_SAVING, Boolean.valueOf((boolean) r11));
            wVar.m(iArr[r11]);
        } else {
            StringBuilder a5 = androidx.appcompat.view.g.a(ProtectedSandApp.s("钻\u0001"), c5, ProtectedSandApp.s("钼\u0001"));
            a5.append(f(list));
            wVar.l(f4, a5.toString());
        }
    }

    @Override // net.time4j.format.expert.i
    public int print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, Set<h> set, boolean z4) throws IOException {
        boolean e4 = pVar.e();
        String s4 = ProtectedSandApp.s("钽\u0001");
        if (!e4) {
            throw new IllegalArgumentException(s4 + pVar);
        }
        net.time4j.tz.k v4 = pVar.v();
        if (v4 instanceof net.time4j.tz.p) {
            return this.f82936c.print(pVar, appendable, dVar, set, z4);
        }
        if (!(pVar instanceof net.time4j.base.f)) {
            throw new IllegalArgumentException(s4 + pVar);
        }
        net.time4j.tz.l c02 = net.time4j.tz.l.c0(v4);
        String D = c02.D(d(c02.T((net.time4j.base.f) net.time4j.base.f.class.cast(pVar))), z4 ? this.f82939f : (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT));
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
        return new i0(this.f82935b, this.f82936c, this.f82937d, (net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART), (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT), ((Integer) dVar.b(net.time4j.format.a.f82797s, 0)).intValue());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        m2.a(i0.class, sb, ProtectedSandApp.s("钾\u0001"));
        sb.append(this.f82935b);
        sb.append(ProtectedSandApp.s("钿\u0001"));
        sb.append(this.f82937d);
        sb.append(']');
        return sb.toString();
    }

    @Override // net.time4j.format.expert.i
    public i<net.time4j.tz.k> withElement(net.time4j.engine.q<net.time4j.tz.k> qVar) {
        return this;
    }

    i0(boolean z4, Set<net.time4j.tz.k> set) {
        this.f82935b = z4;
        this.f82936c = new p(z4);
        this.f82937d = Collections.unmodifiableSet(new LinkedHashSet(set));
        this.f82938e = net.time4j.format.g.SMART;
        this.f82939f = Locale.ROOT;
        this.f82940g = 0;
    }

    private i0(boolean z4, i<net.time4j.tz.k> iVar, Set<net.time4j.tz.k> set, net.time4j.format.g gVar, Locale locale, int i4) {
        this.f82935b = z4;
        this.f82936c = iVar;
        this.f82937d = set;
        this.f82938e = gVar;
        this.f82939f = locale;
        this.f82940g = i4;
    }
}
