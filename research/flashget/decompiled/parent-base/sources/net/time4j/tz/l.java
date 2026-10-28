package net.time4j.tz;

import android.util.TimeUtils;
import androidx.compose.material3.z3;
import androidx.content.preferences.protobuf.m2;
import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.mmkv.MMKV;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Timezone.java */
/* loaded from: classes7.dex */
public abstract class l implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final o f83557e;

    /* renamed from: f, reason: collision with root package name */
    public static final o f83558f;

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f83559g;

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f83560h;

    /* renamed from: i, reason: collision with root package name */
    private static volatile e f83561i;

    /* renamed from: j, reason: collision with root package name */
    private static volatile l f83562j;

    /* renamed from: k, reason: collision with root package name */
    private static volatile boolean f83563k;

    /* renamed from: l, reason: collision with root package name */
    private static int f83564l;

    /* renamed from: p, reason: collision with root package name */
    private static final Map<String, k> f83568p;

    /* renamed from: q, reason: collision with root package name */
    private static final Map<String, k> f83569q;

    /* renamed from: r, reason: collision with root package name */
    private static final r f83570r;

    /* renamed from: s, reason: collision with root package name */
    private static final r f83571s;

    /* renamed from: t, reason: collision with root package name */
    private static final ConcurrentMap<String, c> f83572t;

    /* renamed from: u, reason: collision with root package name */
    private static final ReferenceQueue<l> f83573u;

    /* renamed from: v, reason: collision with root package name */
    private static final LinkedList<l> f83574v;

    /* renamed from: w, reason: collision with root package name */
    private static final ConcurrentMap<String, r> f83575w;

    /* renamed from: x, reason: collision with root package name */
    static final s f83576x;

    /* renamed from: y, reason: collision with root package name */
    private static final l f83577y;

    /* renamed from: z, reason: collision with root package name */
    static final /* synthetic */ boolean f83578z = false;

    /* renamed from: m, reason: collision with root package name */
    private static final String f83565m = ProtectedSandApp.s("顫\u0001");

    /* renamed from: n, reason: collision with root package name */
    private static final String f83566n = ProtectedSandApp.s("顬\u0001");

    /* renamed from: o, reason: collision with root package name */
    private static final String f83567o = ProtectedSandApp.s("顭\u0001");

    /* renamed from: b, reason: collision with root package name */
    private static final String f83554b = System.getProperty(ProtectedSandApp.s("顮\u0001"));

    /* renamed from: c, reason: collision with root package name */
    private static final String f83555c = System.getProperty(ProtectedSandApp.s("顯\u0001"));

    /* renamed from: d, reason: collision with root package name */
    private static final Comparator<k> f83556d = new a();

    /* compiled from: Timezone.java */
    static class a implements Comparator<k> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(k kVar, k kVar2) {
            return kVar.canonical().compareTo(kVar2.canonical());
        }
    }

    /* compiled from: Timezone.java */
    public static class b {
        private b() {
        }

        public static void a() {
            synchronized (l.class) {
                do {
                } while (l.f83573u.poll() != null);
                l.f83574v.clear();
            }
            e unused = l.f83561i = new e();
            l.f83572t.clear();
            if (l.f83560h) {
                l unused2 = l.f83562j = l.C();
            }
        }

        public static void b(boolean z4) {
            boolean unused = l.f83563k = z4;
            if (z4) {
                return;
            }
            l.f83572t.clear();
        }

        public static void c(int i4) {
            if (i4 < 0) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("飩\u0001"), i4));
            }
            while (true) {
                c cVar = (c) l.f83573u.poll();
                if (cVar == null) {
                    break;
                } else {
                    l.f83572t.remove(cVar.f83579a);
                }
            }
            synchronized (l.class) {
                try {
                    int unused = l.f83564l = i4 + 1;
                    int size = l.f83574v.size() - i4;
                    for (int i5 = 0; i5 < size; i5++) {
                        l.f83574v.removeLast();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: Timezone.java */
    private static class c extends SoftReference<l> {

        /* renamed from: a, reason: collision with root package name */
        private final String f83579a;

        c(l lVar, ReferenceQueue<l> referenceQueue) {
            super(lVar, referenceQueue);
            this.f83579a = lVar.G().canonical();
        }
    }

    /* compiled from: Timezone.java */
    private static class d implements r, s {
        private d() {
        }

        @Override // net.time4j.tz.r
        public s a() {
            return this;
        }

        @Override // net.time4j.tz.s
        public Set<String> b(Locale locale, boolean z4) {
            return Collections.emptySet();
        }

        @Override // net.time4j.tz.r
        public Map<String, String> c() {
            return Collections.emptyMap();
        }

        @Override // net.time4j.tz.s
        public String d(boolean z4, Locale locale) {
            return z4 ? ProtectedSandApp.s("飪\u0001") : ProtectedSandApp.s("飫\u0001");
        }

        @Override // net.time4j.tz.s
        public String e(String str, net.time4j.tz.d dVar, Locale locale) {
            if (locale == null) {
                throw new NullPointerException(ProtectedSandApp.s("飬\u0001"));
            }
            if (str.isEmpty()) {
                return "";
            }
            TimeZone i02 = h.i0(str);
            return i02.getID().equals(str) ? i02.getDisplayName(dVar.isDaylightSaving(), !dVar.isAbbreviation() ? 1 : 0, locale) : "";
        }

        @Override // net.time4j.tz.r
        public Set<String> f() {
            HashSet hashSet = new HashSet();
            hashSet.addAll(Arrays.asList(TimeZone.getAvailableIDs()));
            return hashSet;
        }

        @Override // net.time4j.tz.r
        public String g() {
            return "";
        }

        @Override // net.time4j.tz.r
        public String getLocation() {
            return "";
        }

        @Override // net.time4j.tz.r
        public String getName() {
            return ProtectedSandApp.s("飭\u0001");
        }

        @Override // net.time4j.tz.r
        public String getVersion() {
            return TimeUtils.getTimeZoneDatabaseVersion();
        }

        @Override // net.time4j.tz.r
        public m load(String str) {
            return null;
        }

        d(a aVar) {
        }
    }

    /* compiled from: Timezone.java */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final List<k> f83580a;

        /* renamed from: b, reason: collision with root package name */
        private final List<k> f83581b;

        e() {
            ArrayList arrayList = new ArrayList(1024);
            ArrayList arrayList2 = new ArrayList(1024);
            arrayList.add(p.f83649l);
            Iterator it = l.f83575w.entrySet().iterator();
            while (it.hasNext()) {
                r rVar = (r) ((Map.Entry) it.next()).getValue();
                if (rVar != l.f83570r || l.f83571s == l.f83570r) {
                    Iterator<String> it2 = rVar.f().iterator();
                    while (it2.hasNext()) {
                        k g02 = l.g0(it2.next());
                        if (!arrayList.contains(g02)) {
                            arrayList.add(g02);
                        }
                    }
                    arrayList2.addAll(arrayList);
                    Iterator<String> it3 = rVar.c().keySet().iterator();
                    while (it3.hasNext()) {
                        k g03 = l.g0(it3.next());
                        if (!arrayList2.contains(g03)) {
                            arrayList2.add(g03);
                        }
                    }
                }
            }
            Collections.sort(arrayList, l.f83556d);
            Collections.sort(arrayList2, l.f83556d);
            this.f83580a = Collections.unmodifiableList(arrayList);
            this.f83581b = Collections.unmodifiableList(arrayList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024f  */
    static {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.tz.l.<clinit>():void");
    }

    l() {
    }

    public static List<k> A(String str) {
        if (str.equals(ProtectedSandApp.s("颇\u0001"))) {
            return f83561i.f83581b;
        }
        r K = K(str);
        if (K == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = K.f().iterator();
        while (it.hasNext()) {
            arrayList.add(g0(it.next()));
        }
        Collections.sort(arrayList, f83556d);
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l C() {
        String id2 = TimeZone.getDefault().getID();
        l P = P(null, id2, false);
        return P == null ? new h(new net.time4j.tz.e(id2)) : P;
    }

    public static String E(k kVar, net.time4j.tz.d dVar, Locale locale) {
        String str;
        String canonical = kVar.canonical();
        int indexOf = canonical.indexOf(126);
        r rVar = f83571s;
        if (indexOf >= 0) {
            String substring = canonical.substring(0, indexOf);
            if (!substring.equals(ProtectedSandApp.s("顭\u0001")) && (rVar = f83575w.get(substring)) == null) {
                return canonical;
            }
            str = canonical.substring(indexOf + 1);
        } else {
            str = canonical;
        }
        s a5 = rVar.a();
        if (a5 == null) {
            a5 = f83576x;
        }
        String e4 = a5.e(str, dVar, locale);
        if (!e4.isEmpty()) {
            return e4;
        }
        s sVar = f83576x;
        if (a5 != sVar) {
            e4 = sVar.e(str, dVar, locale);
        }
        if (!e4.isEmpty()) {
            canonical = e4;
        }
        return canonical;
    }

    public static Set<k> J(Locale locale, boolean z4, String str) {
        r K = K(str);
        if (K == null) {
            return Collections.emptySet();
        }
        s a5 = K.a();
        if (a5 == null) {
            a5 = f83576x;
        }
        HashSet hashSet = new HashSet();
        Iterator<String> it = a5.b(locale, z4).iterator();
        while (it.hasNext()) {
            hashSet.add(g0(it.next()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static r K(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("颈\u0001"));
        }
        return str.equals(ProtectedSandApp.s("顭\u0001")) ? f83571s : f83575w.get(str);
    }

    public static String L() {
        StringBuilder sb = new StringBuilder(128);
        m2.a(l.class, sb, ProtectedSandApp.s("颉\u0001"));
        sb.append(f83571s.getName());
        sb.append(ProtectedSandApp.s("颊\u0001"));
        Iterator<String> it = f83575w.keySet().iterator();
        while (it.hasNext()) {
            r rVar = f83575w.get(it.next());
            if (rVar != null) {
                sb.append(ProtectedSandApp.s("颋\u0001"));
                sb.append(rVar.getName());
                String location = rVar.getLocation();
                if (!location.isEmpty()) {
                    sb.append(ProtectedSandApp.s("颌\u0001"));
                    sb.append(location);
                }
                String version = rVar.getVersion();
                if (!version.isEmpty()) {
                    sb.append(ProtectedSandApp.s("颍\u0001"));
                    sb.append(version);
                }
                sb.append(')');
            }
        }
        sb.append(ProtectedSandApp.s("颎\u0001"));
        return sb.toString();
    }

    public static Set<String> M() {
        return Collections.unmodifiableSet(f83575w.keySet());
    }

    private static l P(k kVar, String str, boolean z4) {
        l lVar;
        String str2;
        ConcurrentMap<String, c> concurrentMap = f83572t;
        c cVar = concurrentMap.get(str);
        if (cVar != null) {
            lVar = cVar.get();
            if (lVar == null) {
                concurrentMap.remove(cVar.f83579a);
            }
        } else {
            lVar = null;
        }
        if (lVar != null) {
            return lVar;
        }
        String str3 = "";
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                str2 = str;
                break;
            }
            if (str.charAt(i4) == '~') {
                str3 = str.substring(0, i4);
                str2 = str.substring(i4 + 1);
                break;
            }
            i4++;
        }
        if (str2.isEmpty()) {
            if (z4) {
                throw new IllegalArgumentException(ProtectedSandApp.s("颏\u0001"));
            }
            return null;
        }
        r rVar = f83571s;
        boolean z5 = str3.isEmpty() || str3.equals(ProtectedSandApp.s("顭\u0001"));
        if (!z5 && (rVar = f83575w.get(str3)) == null) {
            if (z4) {
                throw new IllegalArgumentException((str3.equals(ProtectedSandApp.s("顬\u0001")) ? ProtectedSandApp.s("颐\u0001") : ProtectedSandApp.s("频\u0001")).concat(str));
            }
            return null;
        }
        if (kVar == null) {
            if (z5) {
                kVar = g0(str2);
                if (kVar instanceof p) {
                    p pVar = (p) kVar;
                    pVar.getClass();
                    return j.i0(pVar);
                }
            } else {
                kVar = new net.time4j.tz.e(str);
            }
        }
        if (rVar == f83570r) {
            h hVar = new h(kVar, str2);
            if (!hVar.k0() || str2.equals(ProtectedSandApp.s("颃\u0001")) || str2.startsWith(ProtectedSandApp.s("颁\u0001")) || str2.equals(ProtectedSandApp.s("颀\u0001"))) {
                lVar = hVar;
            }
        } else {
            m load = rVar.load(str2);
            lVar = load == null ? S(rVar, kVar, str2) : new net.time4j.tz.c(kVar, load);
        }
        if (lVar == null) {
            if (!z4) {
                return null;
            }
            if (TimeZone.getDefault().getID().equals(str)) {
                return new h(new net.time4j.tz.e(str));
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("颒\u0001").concat(str));
        }
        if (!f83563k) {
            return lVar;
        }
        c putIfAbsent = f83572t.putIfAbsent(str, new c(lVar, f83573u));
        if (putIfAbsent != null) {
            l lVar2 = putIfAbsent.get();
            return lVar2 != null ? lVar2 : lVar;
        }
        synchronized (l.class) {
            try {
                f83574v.addFirst(lVar);
                while (true) {
                    LinkedList<l> linkedList = f83574v;
                    if (linkedList.size() >= f83564l) {
                        linkedList.removeLast();
                    }
                }
            } finally {
            }
        }
        return lVar;
    }

    private static l Q(k kVar, boolean z4) {
        if (!(kVar instanceof p)) {
            return P(kVar, kVar.canonical(), z4);
        }
        p pVar = (p) kVar;
        pVar.getClass();
        return j.i0(pVar);
    }

    public static String R(String str) {
        r K = K(str);
        return K == null ? "" : K.getVersion();
    }

    private static l S(r rVar, k kVar, String str) {
        Map<String, String> c5 = rVar.c();
        String str2 = str;
        m mVar = null;
        while (mVar == null) {
            str2 = c5.get(str2);
            if (str2 == null) {
                break;
            }
            mVar = rVar.load(str2);
        }
        if (mVar != null) {
            return new net.time4j.tz.c(kVar, mVar);
        }
        String g4 = rVar.g();
        if (g4.isEmpty()) {
            return null;
        }
        if (!g4.equals(rVar.getName())) {
            return new net.time4j.tz.a(kVar, P(null, z3.a(g4, ProtectedSandApp.s("颓\u0001"), str), true));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("颔\u0001") + rVar.getName());
    }

    private static List<Class<? extends k>> W(ClassLoader classLoader, String... strArr) throws ClassNotFoundException {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Class<?> cls = Class.forName(ProtectedSandApp.s("颕\u0001") + str, true, classLoader);
            if (k.class.isAssignableFrom(cls)) {
                arrayList.add(cls);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static k X(String str) {
        String str2;
        String str3;
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                str2 = "";
                str3 = str;
                break;
            }
            if (str.charAt(i4) == '~') {
                str2 = str.substring(0, i4);
                str3 = str.substring(i4 + 1);
                break;
            }
            i4++;
        }
        if (str3.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("题\u0001").concat(str));
        }
        r rVar = f83571s;
        if (!str2.isEmpty() && !str2.equals(ProtectedSandApp.s("顭\u0001")) && !str2.equals(ProtectedSandApp.s("颖\u0001")) && !str2.equals(ProtectedSandApp.s("颗\u0001")) && (rVar = f83575w.get(str2)) == null) {
            throw new IllegalArgumentException((str2.equals(ProtectedSandApp.s("顬\u0001")) ? ProtectedSandApp.s("颐\u0001") : ProtectedSandApp.s("频\u0001")).concat(str));
        }
        Map<String, String> c5 = rVar.c();
        while (true) {
            String str4 = c5.get(str3);
            if (str4 == null) {
                break;
            }
            str3 = str4;
        }
        Map<String, k> map = f83569q;
        return map.containsKey(str3) ? map.get(str3) : g0(str3);
    }

    public static k Y(k kVar) {
        return X(kVar.canonical());
    }

    public static l Z(String str) {
        return P(null, str, true);
    }

    public static l a0(String str, k kVar) {
        l P = P(null, str, false);
        if (P != null) {
            return P;
        }
        l Q = Q(kVar, false);
        return Q == null ? e0() : Q;
    }

    public static l b0(String str, m mVar) {
        return new net.time4j.tz.c(g0(str), mVar);
    }

    public static l c0(k kVar) {
        return Q(kVar, true);
    }

    public static l d0() {
        return new h();
    }

    public static l e0() {
        return (!f83560h || f83562j == null) ? f83577y : f83562j;
    }

    public static boolean f0(r rVar) {
        String name = rVar.getName();
        if (name.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("颜\u0001"));
        }
        if (name.equals(ProtectedSandApp.s("顬\u0001"))) {
            throw new IllegalArgumentException(ProtectedSandApp.s("颛\u0001"));
        }
        if (name.equals(ProtectedSandApp.s("顫\u0001"))) {
            throw new IllegalArgumentException(ProtectedSandApp.s("颚\u0001"));
        }
        if (name.equals(ProtectedSandApp.s("顭\u0001"))) {
            throw new IllegalArgumentException(ProtectedSandApp.s("颙\u0001"));
        }
        boolean z4 = f83575w.putIfAbsent(name, rVar) == null;
        if (z4) {
            f83561i = new e();
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static k g0(String str) {
        k kVar = f83568p.get(str);
        if (kVar != null) {
            return kVar;
        }
        if (str.startsWith(ProtectedSandApp.s("颃\u0001"))) {
            str = ProtectedSandApp.s("颂\u0001") + str.substring(3);
        }
        p s4 = p.s(str, false);
        return s4 == null ? new net.time4j.tz.e(str) : s4;
    }

    private static r x(r rVar, r rVar2) {
        String version = rVar.getVersion();
        if (!version.isEmpty()) {
            String str = f83555c;
            if (version.equals(str)) {
                return rVar;
            }
            if (str == null) {
                if (rVar2 == null || version.compareTo(rVar2.getVersion()) > 0) {
                    return rVar;
                }
                if (version.compareTo(rVar2.getVersion()) == 0 && !rVar.getLocation().contains(ProtectedSandApp.s("额\u0001"))) {
                    return rVar;
                }
            }
        }
        return rVar2;
    }

    private static void y(Map<String, k> map) {
        p pVar = p.f83649l;
        map.put(ProtectedSandApp.s("颞\u0001"), pVar);
        map.put(ProtectedSandApp.s("颟\u0001"), pVar);
        map.put(ProtectedSandApp.s("颠\u0001"), pVar);
        map.put(ProtectedSandApp.s("颡\u0001"), pVar);
        map.put(ProtectedSandApp.s("颢\u0001"), pVar);
        map.put(ProtectedSandApp.s("颣\u0001"), pVar);
        map.put(ProtectedSandApp.s("颤\u0001"), pVar);
        map.put(ProtectedSandApp.s("颥\u0001"), pVar);
        map.put(ProtectedSandApp.s("颦\u0001"), pVar);
        map.put(ProtectedSandApp.s("颧\u0001"), p.p(50400, 0));
        map.put(ProtectedSandApp.s("風\u0001"), p.p(46800, 0));
        map.put(ProtectedSandApp.s("颩\u0001"), p.p(43200, 0));
        map.put(ProtectedSandApp.s("颪\u0001"), p.p(39600, 0));
        map.put(ProtectedSandApp.s("颫\u0001"), p.p(36000, 0));
        map.put(ProtectedSandApp.s("颬\u0001"), p.p(32400, 0));
        map.put(ProtectedSandApp.s("颭\u0001"), p.p(28800, 0));
        map.put(ProtectedSandApp.s("颮\u0001"), p.p(25200, 0));
        map.put(ProtectedSandApp.s("颯\u0001"), p.p(21600, 0));
        map.put(ProtectedSandApp.s("颰\u0001"), p.p(18000, 0));
        map.put(ProtectedSandApp.s("颱\u0001"), p.p(14400, 0));
        map.put(ProtectedSandApp.s("颲\u0001"), p.p(10800, 0));
        map.put(ProtectedSandApp.s("颳\u0001"), p.p(7200, 0));
        map.put(ProtectedSandApp.s("颴\u0001"), p.p(MMKV.ExpireInHour, 0));
        map.put(ProtectedSandApp.s("颵\u0001"), p.p(-3600, 0));
        map.put(ProtectedSandApp.s("颶\u0001"), p.p(-7200, 0));
        map.put(ProtectedSandApp.s("颷\u0001"), p.p(-10800, 0));
        map.put(ProtectedSandApp.s("颸\u0001"), p.p(-14400, 0));
        map.put(ProtectedSandApp.s("颹\u0001"), p.p(-18000, 0));
        map.put(ProtectedSandApp.s("颺\u0001"), p.p(-21600, 0));
        map.put(ProtectedSandApp.s("颻\u0001"), p.p(-25200, 0));
        map.put(ProtectedSandApp.s("颼\u0001"), p.p(-28800, 0));
        map.put(ProtectedSandApp.s("颽\u0001"), p.p(-32400, 0));
        map.put(ProtectedSandApp.s("颾\u0001"), p.p(-36000, 0));
        map.put(ProtectedSandApp.s("颿\u0001"), p.p(-39600, 0));
        map.put(ProtectedSandApp.s("飀\u0001"), p.p(-43200, 0));
    }

    public static List<k> z() {
        return f83561i.f83580a;
    }

    public abstract p B(net.time4j.base.f fVar);

    public String D(net.time4j.tz.d dVar, Locale locale) {
        return E(G(), dVar, locale);
    }

    public abstract m F();

    public abstract k G();

    public abstract p H(net.time4j.base.a aVar, net.time4j.base.g gVar);

    public abstract p I(net.time4j.base.f fVar);

    public abstract p N(net.time4j.base.f fVar);

    public abstract o O();

    public abstract boolean T(net.time4j.base.f fVar);

    public abstract boolean U();

    public abstract boolean V(net.time4j.base.a aVar, net.time4j.base.g gVar);

    public void g(Appendable appendable) throws IOException {
        StringBuilder a5 = androidx.fragment.app.a.a(4096, ProtectedSandApp.s("飁\u0001"));
        String str = f83554b;
        String s4 = ProtectedSandApp.s("飂\u0001");
        String s5 = ProtectedSandApp.s("飃\u0001");
        l0.a(a5, str, s4, str, s5);
        a5.append(G().canonical());
        a5.append(str);
        if (U()) {
            a5.append(ProtectedSandApp.s("飄\u0001"));
            a5.append(str);
            a5.append(s5);
            a5.append(F().f());
            a5.append(str);
        } else {
            a5.append(ProtectedSandApp.s("飅\u0001"));
            a5.append(str);
            a5.append(s5);
            a5.append(O());
            a5.append(str);
            m F = F();
            a5.append(ProtectedSandApp.s("飆\u0001"));
            a5.append(str);
            if (F == null) {
                a5.append(ProtectedSandApp.s("飇\u0001"));
                a5.append(str);
            } else {
                F.g(a5);
            }
        }
        a5.append(ProtectedSandApp.s("飈\u0001"));
        a5.append(str);
        appendable.append(a5.toString());
    }

    public abstract l h0(o oVar);
}
