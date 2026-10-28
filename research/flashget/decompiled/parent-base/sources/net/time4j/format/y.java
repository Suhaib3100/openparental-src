package net.time4j.format;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.time4j.engine.n0;

/* compiled from: TimeSpanFormatter.java */
/* loaded from: classes7.dex */
public abstract class y<U, S extends n0<U>> {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f83114d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Class<U> f83115a;

    /* renamed from: b, reason: collision with root package name */
    private final List<b<U>> f83116b;

    /* renamed from: c, reason: collision with root package name */
    private final String f83117c;

    /* compiled from: TimeSpanFormatter.java */
    private static abstract class b<U> {

        /* renamed from: a, reason: collision with root package name */
        private final int f83118a;

        b(int i4) {
            this.f83118a = i4;
        }

        abstract int a();

        int b() {
            return this.f83118a;
        }

        boolean c(n0<? super U> n0Var) {
            return true;
        }

        abstract int d(Map<Object, Long> map, CharSequence charSequence, int i4);

        abstract void e(n0<? super U> n0Var, Appendable appendable) throws IOException;

        abstract b<U> f(int i4);
    }

    /* compiled from: TimeSpanFormatter.java */
    private static class c<U> extends b<U> {

        /* renamed from: b, reason: collision with root package name */
        private final int f83119b;

        /* renamed from: c, reason: collision with root package name */
        private final U f83120c;

        @Override // net.time4j.format.y.b
        int a() {
            return this.f83119b;
        }

        @Override // net.time4j.format.y.b
        boolean c(n0<? super U> n0Var) {
            return n0Var.e(this.f83120c) == 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        
            return ~r10;
         */
        @Override // net.time4j.format.y.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int d(java.util.Map<java.lang.Object, java.lang.Long> r8, java.lang.CharSequence r9, int r10) {
            /*
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r9.length()
                int r2 = r7.b()
                int r1 = r1 - r2
                int r2 = r7.f83119b
                int r2 = r2 + r10
                int r1 = java.lang.Math.min(r1, r2)
                r2 = r10
                r3 = r2
            L17:
                r4 = 48
                if (r2 >= r1) goto L2d
                char r5 = r9.charAt(r2)
                if (r5 < r4) goto L2d
                r6 = 57
                if (r5 > r6) goto L2d
                r0.append(r5)
                int r3 = r3 + 1
                int r2 = r2 + 1
                goto L17
            L2d:
                if (r3 != r10) goto L31
                int r8 = ~r10
                return r8
            L31:
                int r9 = r3 - r10
                r1 = 0
            L34:
                int r2 = 9 - r9
                if (r1 >= r2) goto L3e
                r0.append(r4)
                int r1 = r1 + 1
                goto L34
            L3e:
                java.lang.String r9 = r0.toString()
                long r0 = java.lang.Long.parseLong(r9)
                java.lang.Long r9 = java.lang.Long.valueOf(r0)
                U r0 = r7.f83120c
                java.lang.Object r8 = r8.put(r0, r9)
                if (r8 == 0) goto L5b
                boolean r8 = r8.equals(r9)
                if (r8 == 0) goto L59
                goto L5b
            L59:
                int r8 = ~r10
                return r8
            L5b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.y.c.d(java.util.Map, java.lang.CharSequence, int):int");
        }

        @Override // net.time4j.format.y.b
        void e(n0<? super U> n0Var, Appendable appendable) throws IOException {
            String valueOf = String.valueOf(n0Var.e(this.f83120c));
            int length = valueOf.length();
            if (length > 9) {
                throw new IllegalArgumentException(ProtectedSandApp.s("闸\u0001") + n0Var);
            }
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < 9 - length; i4++) {
                sb.append('0');
            }
            sb.append(valueOf);
            appendable.append(sb.toString().substring(0, this.f83119b));
        }

        @Override // net.time4j.format.y.b
        b<U> f(int i4) {
            return new c(i4, this.f83119b, this.f83120c);
        }

        private c(int i4, int i5, U u4) {
            super(i4);
            if (i5 < 1 || i5 > 9) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("闷\u0001"), i5));
            }
            this.f83119b = i5;
            this.f83120c = u4;
        }
    }

    /* compiled from: TimeSpanFormatter.java */
    private static class d<U> extends b<U> {

        /* renamed from: b, reason: collision with root package name */
        private final String f83121b;

        @Override // net.time4j.format.y.b
        int a() {
            return this.f83121b.length();
        }

        @Override // net.time4j.format.y.b
        int d(Map<Object, Long> map, CharSequence charSequence, int i4) {
            int length = this.f83121b.length() + i4;
            if (length > charSequence.length() - b()) {
                return ~i4;
            }
            for (int i5 = i4; i5 < length; i5++) {
                if (charSequence.charAt(i5) != this.f83121b.charAt(i5 - i4)) {
                    return ~i4;
                }
            }
            return length;
        }

        @Override // net.time4j.format.y.b
        void e(n0<? super U> n0Var, Appendable appendable) throws IOException {
            appendable.append(this.f83121b);
        }

        @Override // net.time4j.format.y.b
        b<U> f(int i4) {
            return new d(i4, this.f83121b);
        }

        private d(String str) {
            this(str, false);
        }

        d(String str, a aVar) {
            this(str, false);
        }

        private d(String str, boolean z4) {
            super(0);
            if (!z4 && str.isEmpty()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("闹\u0001"));
            }
            this.f83121b = str;
        }

        private d(int i4, String str) {
            super(i4);
            this.f83121b = str;
        }
    }

    /* compiled from: TimeSpanFormatter.java */
    private static class e<U> extends b<U> {

        /* renamed from: b, reason: collision with root package name */
        private final int f83122b;

        /* renamed from: c, reason: collision with root package name */
        private final int f83123c;

        /* renamed from: d, reason: collision with root package name */
        private final U f83124d;

        @Override // net.time4j.format.y.b
        int a() {
            return this.f83122b;
        }

        @Override // net.time4j.format.y.b
        boolean c(n0<? super U> n0Var) {
            return g(n0Var) == 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        
            return ~r11;
         */
        @Override // net.time4j.format.y.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int d(java.util.Map<java.lang.Object, java.lang.Long> r9, java.lang.CharSequence r10, int r11) {
            /*
                r8 = this;
                int r0 = r10.length()
                int r1 = r8.b()
                int r0 = r0 - r1
                r1 = 0
                r3 = r11
                r4 = r3
            Ld:
                if (r3 >= r0) goto L2e
                char r5 = r10.charAt(r3)
                r6 = 48
                if (r5 < r6) goto L2e
                r6 = 57
                if (r5 > r6) goto L2e
                int r6 = r3 - r11
                int r7 = r8.f83123c
                if (r6 < r7) goto L22
                goto L2e
            L22:
                int r5 = r5 + (-48)
                r6 = 10
                long r1 = r1 * r6
                long r5 = (long) r5
                long r1 = r1 + r5
                int r4 = r4 + 1
                int r3 = r3 + 1
                goto Ld
            L2e:
                if (r4 != r11) goto L32
                int r9 = ~r11
                return r9
            L32:
                java.lang.Long r10 = java.lang.Long.valueOf(r1)
                U r0 = r8.f83124d
                java.lang.Object r9 = r9.put(r0, r10)
                if (r9 == 0) goto L47
                boolean r9 = r9.equals(r10)
                if (r9 == 0) goto L45
                goto L47
            L45:
                int r9 = ~r11
                return r9
            L47:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.y.e.d(java.util.Map, java.lang.CharSequence, int):int");
        }

        @Override // net.time4j.format.y.b
        void e(n0<? super U> n0Var, Appendable appendable) throws IOException {
            String valueOf = String.valueOf(g(n0Var));
            if (valueOf.length() <= this.f83123c) {
                for (int length = this.f83122b - valueOf.length(); length > 0; length--) {
                    appendable.append('0');
                }
                appendable.append(valueOf);
                return;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("闾\u0001") + this.f83124d + ProtectedSandApp.s("闿\u0001") + n0Var + ProtectedSandApp.s("阀\u0001"));
        }

        @Override // net.time4j.format.y.b
        b<U> f(int i4) {
            return new e(i4, this.f83122b, this.f83123c, this.f83124d);
        }

        long g(n0<? super U> n0Var) {
            return n0Var.e(this.f83124d);
        }

        U h() {
            return this.f83124d;
        }

        private e(int i4, int i5, int i6, U u4) {
            super(i4);
            if (i5 < 1 || i5 > 18) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("闽\u0001"), i5));
            }
            if (i6 < i5) {
                throw new IllegalArgumentException(ProtectedSandApp.s("闼\u0001"));
            }
            if (i6 > 18) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("闻\u0001"), i6));
            }
            if (u4 == null) {
                throw new NullPointerException(ProtectedSandApp.s("闺\u0001"));
            }
            this.f83122b = i5;
            this.f83123c = i6;
            this.f83124d = u4;
        }
    }

    /* compiled from: TimeSpanFormatter.java */
    private static class f<U> extends b<U> {

        /* renamed from: b, reason: collision with root package name */
        private final List<b<U>> f83125b;

        @Override // net.time4j.format.y.b
        int a() {
            return 0;
        }

        @Override // net.time4j.format.y.b
        boolean c(n0<? super U> n0Var) {
            Iterator<b<U>> it = this.f83125b.iterator();
            while (it.hasNext()) {
                if (!it.next().c(n0Var)) {
                    return false;
                }
            }
            return true;
        }

        @Override // net.time4j.format.y.b
        int d(Map<Object, Long> map, CharSequence charSequence, int i4) {
            HashMap hashMap = new HashMap();
            int size = this.f83125b.size();
            int i5 = 0;
            int i6 = i4;
            while (i5 < size) {
                b<U> bVar = this.f83125b.get(i5);
                if (bVar == g.f83126b) {
                    break;
                }
                int d5 = bVar.d(hashMap, charSequence, i6);
                if (d5 < 0) {
                    while (true) {
                        i5++;
                        if (i5 >= size) {
                            i5 = -1;
                            break;
                        }
                        if (this.f83125b.get(i5) == g.f83126b) {
                            break;
                        }
                    }
                    if (i5 == -1) {
                        return i4;
                    }
                    hashMap.clear();
                } else {
                    i6 = d5;
                }
                i5++;
            }
            map.putAll(hashMap);
            return i6;
        }

        @Override // net.time4j.format.y.b
        void e(n0<? super U> n0Var, Appendable appendable) throws IOException {
            b<U> next;
            if (c(n0Var)) {
                return;
            }
            Iterator<b<U>> it = this.f83125b.iterator();
            while (it.hasNext() && (next = it.next()) != g.f83126b) {
                next.e(n0Var, appendable);
            }
        }

        @Override // net.time4j.format.y.b
        b<U> f(int i4) {
            ArrayList arrayList = new ArrayList(this.f83125b);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b bVar = (b) arrayList.get(size);
                arrayList.set(size, bVar.f(i4));
                i4 += bVar.a();
            }
            return new f(arrayList);
        }

        private f(List<b<U>> list) {
            super(0);
            if (list.isEmpty()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("阂\u0001"));
            }
            b<U> bVar = list.get(0);
            g gVar = g.f83126b;
            if (bVar == gVar || androidx.appcompat.view.menu.d.a(list, 1) == gVar) {
                throw new IllegalArgumentException(ProtectedSandApp.s("阁\u0001"));
            }
            this.f83125b = Collections.unmodifiableList(list);
        }
    }

    /* compiled from: TimeSpanFormatter.java */
    private static class g<U> extends b<U> {

        /* renamed from: b, reason: collision with root package name */
        static final g f83126b = new g(0);

        private g() {
            super(0);
        }

        static <U> b<U> g() {
            return f83126b;
        }

        @Override // net.time4j.format.y.b
        int a() {
            return 0;
        }

        @Override // net.time4j.format.y.b
        int d(Map<Object, Long> map, CharSequence charSequence, int i4) {
            return i4;
        }

        @Override // net.time4j.format.y.b
        void e(n0<? super U> n0Var, Appendable appendable) throws IOException {
        }

        @Override // net.time4j.format.y.b
        b<U> f(int i4) {
            return this;
        }
    }

    /* compiled from: TimeSpanFormatter.java */
    private static class h<U> extends b<U> {

        /* renamed from: b, reason: collision with root package name */
        private final e<U> f83127b;

        /* renamed from: c, reason: collision with root package name */
        private final b<U> f83128c;

        /* renamed from: d, reason: collision with root package name */
        private final p f83129d;

        /* renamed from: e, reason: collision with root package name */
        private final Map<n, String> f83130e;

        /* renamed from: f, reason: collision with root package name */
        private final int f83131f;

        @Override // net.time4j.format.y.b
        int a() {
            return this.f83131f;
        }

        @Override // net.time4j.format.y.b
        boolean c(n0<? super U> n0Var) {
            return this.f83127b.c(n0Var);
        }

        @Override // net.time4j.format.y.b
        int d(Map<Object, Long> map, CharSequence charSequence, int i4) {
            int d5 = this.f83127b.d(map, charSequence, i4);
            if (d5 < 0) {
                return d5;
            }
            int d6 = this.f83128c.d(map, charSequence, d5);
            if (d6 < 0) {
                return d6;
            }
            String str = this.f83130e.get(this.f83129d.e(map.get(this.f83127b.h()).longValue()));
            int length = str.length();
            int i5 = d6 + length;
            if (i5 > charSequence.length() - b()) {
                return ~i4;
            }
            for (int i6 = 0; i6 < length; i6++) {
                if (str.charAt(i6) != charSequence.charAt(d6 + i6)) {
                    return ~i4;
                }
            }
            return i5;
        }

        @Override // net.time4j.format.y.b
        void e(n0<? super U> n0Var, Appendable appendable) throws IOException {
            this.f83127b.e(n0Var, appendable);
            this.f83128c.e(n0Var, appendable);
            appendable.append(this.f83130e.get(this.f83129d.e(this.f83127b.g(n0Var))));
        }

        @Override // net.time4j.format.y.b
        b<U> f(int i4) {
            return new h(i4, this.f83127b, this.f83128c, this.f83129d, this.f83130e, this.f83131f);
        }

        private h(U u4, String str, p pVar, Map<n, String> map) {
            super(0);
            this.f83127b = new e<>(0, 1, 18, u4);
            this.f83128c = new d(str, true);
            this.f83129d = pVar;
            this.f83130e = map;
            int i4 = Integer.MAX_VALUE;
            for (String str2 : map.values()) {
                if (str2.length() < i4) {
                    i4 = str2.length();
                }
            }
            this.f83131f = i4;
        }

        private h(int i4, e<U> eVar, b<U> bVar, p pVar, Map<n, String> map, int i5) {
            super(i4);
            this.f83127b = eVar;
            this.f83128c = bVar;
            this.f83129d = pVar;
            this.f83130e = map;
            this.f83131f = i5;
        }
    }

    /* compiled from: TimeSpanFormatter.java */
    private static class i<U> extends b<U> {

        /* renamed from: b, reason: collision with root package name */
        private final char f83132b;

        /* renamed from: c, reason: collision with root package name */
        private final char f83133c;

        private i(char c5, char c6) {
            this(0, c5, c6);
        }

        @Override // net.time4j.format.y.b
        int a() {
            return 1;
        }

        @Override // net.time4j.format.y.b
        int d(Map<Object, Long> map, CharSequence charSequence, int i4) {
            if (i4 >= charSequence.length() - b()) {
                return ~i4;
            }
            char charAt = charSequence.charAt(i4);
            return (charAt == this.f83132b || charAt == this.f83133c) ? i4 + 1 : ~i4;
        }

        @Override // net.time4j.format.y.b
        void e(n0<? super U> n0Var, Appendable appendable) throws IOException {
            appendable.append(this.f83132b);
        }

        @Override // net.time4j.format.y.b
        b<U> f(int i4) {
            return new i(i4, this.f83132b, this.f83133c);
        }

        i(char c5, char c6, a aVar) {
            this(0, c5, c6);
        }

        private i(int i4, char c5, char c6) {
            super(i4);
            this.f83132b = c5;
            this.f83133c = c6;
        }
    }

    /* compiled from: TimeSpanFormatter.java */
    private static class j<U> extends b<U> {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f83134b;

        @Override // net.time4j.format.y.b
        int a() {
            return this.f83134b ? 1 : 0;
        }

        @Override // net.time4j.format.y.b
        int d(Map<Object, Long> map, CharSequence charSequence, int i4) {
            int i5;
            Long l4 = 1L;
            if (i4 >= charSequence.length() - b()) {
                if (this.f83134b) {
                    return ~i4;
                }
                Long put = map.put(y.f83114d, l4);
                return (put == null || put.longValue() == 1) ? i4 : ~i4;
            }
            char charAt = charSequence.charAt(i4);
            if (this.f83134b) {
                if (charAt != '+') {
                    if (charAt != '-') {
                        return ~i4;
                    }
                    l4 = -1L;
                }
            } else {
                if (charAt == '+') {
                    return ~i4;
                }
                if (charAt != '-') {
                    i5 = i4;
                    Long put2 = map.put(y.f83114d, l4);
                    return (put2 != null || put2.longValue() == l4.longValue()) ? i5 : ~i4;
                }
                l4 = -1L;
            }
            i5 = i4 + 1;
            Long put22 = map.put(y.f83114d, l4);
            if (put22 != null) {
            }
        }

        @Override // net.time4j.format.y.b
        void e(n0<? super U> n0Var, Appendable appendable) throws IOException {
            if (this.f83134b) {
                appendable.append(n0Var.d() ? '-' : '+');
            } else if (n0Var.d()) {
                appendable.append('-');
            }
        }

        @Override // net.time4j.format.y.b
        b<U> f(int i4) {
            return new j(i4, this.f83134b);
        }

        private j(boolean z4) {
            super(0);
            this.f83134b = z4;
        }

        private j(int i4, boolean z4) {
            super(i4);
            this.f83134b = z4;
        }
    }

    protected y(Class<U> cls, String str) {
        int i4;
        if (cls == null) {
            throw new NullPointerException(ProtectedSandApp.s("觞\u0001"));
        }
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ArrayList());
        boolean z4 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z5 = true;
            if (i5 >= length) {
                if (arrayList.size() > 1) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("觝\u0001"));
                }
                if (arrayList.isEmpty()) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("觜\u0001"));
                }
                List list = (List) arrayList.get(0);
                if (list.isEmpty()) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("觛\u0001"));
                }
                Object obj = list.get(0);
                g gVar = g.f83126b;
                if (obj == gVar || androidx.appcompat.view.menu.d.a(list, 1) == gVar) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("觚\u0001"));
                }
                int size = list.size();
                int a5 = ((b) list.get(size - 1)).a();
                for (int i7 = size - 2; i7 >= 0; i7--) {
                    b bVar = (b) list.get(i7);
                    if (bVar == g.f83126b) {
                        a5 = 0;
                    } else {
                        list.set(i7, bVar.f(a5));
                        a5 += bVar.a();
                    }
                }
                this.f83115a = cls;
                this.f83116b = Collections.unmodifiableList(list);
                this.f83117c = str;
                return;
            }
            char charAt = str.charAt(i5);
            if (charAt == '#') {
                i6++;
            } else if (l(charAt)) {
                int i10 = i5 + 1;
                while (i10 < length && str.charAt(i10) == charAt) {
                    i10++;
                }
                e(charAt, i10 - i5, i6, arrayList);
                i5 = i10 - 1;
                i6 = 0;
            } else {
                if (i6 > 0) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("觙\u0001"));
                }
                if (charAt == '\'') {
                    int i11 = i5 + 1;
                    i4 = i11;
                    while (i4 < length) {
                        if (str.charAt(i4) == '\'') {
                            int i12 = i4 + 1;
                            if (i12 >= length || str.charAt(i12) != '\'') {
                                break;
                            } else {
                                i4 = i12;
                            }
                        }
                        i4++;
                    }
                    if (i4 >= length) {
                        throw new IllegalArgumentException(ProtectedSandApp.s("觘\u0001").concat(str));
                    }
                    if (i11 == i4) {
                        b('\'', arrayList);
                    } else {
                        c(str.substring(i11, i4).replace(ProtectedSandApp.s("觖\u0001"), ProtectedSandApp.s("觗\u0001")), arrayList);
                    }
                } else if (charAt == '[') {
                    q(arrayList);
                } else if (charAt == ']') {
                    g(arrayList);
                } else {
                    if (charAt == '.') {
                        m(arrayList).add(new i('.', ',', (a) null));
                    } else if (charAt == ',') {
                        m(arrayList).add(new i(',', '.', (a) null));
                    } else if (charAt == '-') {
                        m(arrayList).add(new j(z4));
                    } else if (charAt == '+') {
                        m(arrayList).add(new j(z5));
                    } else if (charAt == '{') {
                        int i13 = i5 + 1;
                        i4 = i13;
                        while (i4 < length && str.charAt(i4) != '}') {
                            i4++;
                        }
                        d(str.substring(i13, i4), arrayList);
                    } else if (charAt == '|') {
                        m(arrayList).add(g.g());
                    } else {
                        b(charAt, arrayList);
                    }
                }
                i5 = i4;
            }
            i5++;
        }
    }

    private void b(char c5, List<List<b<U>>> list) {
        c(String.valueOf(c5), list);
    }

    private void c(String str, List<List<b<U>>> list) {
        m(list).add(new d(str, (a) null));
    }

    private void d(String str, List<List<b<U>>> list) {
        Locale locale;
        String[] split = str.split(ProtectedSandApp.s("觟\u0001"));
        int length = split.length;
        String s4 = ProtectedSandApp.s("觠\u0001");
        if (length > 9 || split.length < 4) {
            throw new IllegalArgumentException(s4.concat(str));
        }
        if (split[0].length() != 1) {
            throw new IllegalArgumentException(ProtectedSandApp.s("触\u0001").concat(str));
        }
        U k4 = k(split[0].charAt(0));
        String[] split2 = split[2].split(ProtectedSandApp.s("觡\u0001"));
        String str2 = split2[0];
        if (split2.length > 1) {
            String str3 = split2[1];
            if (split2.length > 2) {
                String str4 = split2[2];
                if (split2.length > 3) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("觢\u0001").concat(str));
                }
                locale = new Locale(str2, str3, str4);
            } else {
                locale = new Locale(str2, str3);
            }
        } else {
            locale = new Locale(str2);
        }
        EnumMap enumMap = new EnumMap(n.class);
        p h4 = p.h(locale, k.CARDINALS);
        for (int i4 = 3; i4 < split.length; i4++) {
            String[] split3 = split[i4].split(ProtectedSandApp.s("解\u0001"));
            if (split3.length != 2) {
                throw new IllegalArgumentException(s4.concat(str));
            }
            enumMap.put((EnumMap) n.valueOf(split3[0]), (n) split3[1]);
        }
        if (enumMap.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("觥\u0001").concat(str));
        }
        if (!enumMap.containsKey(n.OTHER)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("觤\u0001").concat(str));
        }
        m(list).add(new h(k4, split[1], h4, enumMap));
    }

    private void e(char c5, int i4, int i5, List<List<b<U>>> list) {
        U k4 = k(c5);
        List list2 = (List) androidx.appcompat.view.menu.d.a(list, 1);
        if (c5 != 'f') {
            list2.add(new e(0, i4, i4 + i5, k4));
        } else {
            if (i5 > 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("觧\u0001"));
            }
            list2.add(new c(0, i4, k(c5)));
        }
    }

    private static <U> void g(List<List<b<U>>> list) {
        int size = list.size();
        int i4 = size - 1;
        if (i4 < 1) {
            throw new IllegalArgumentException(ProtectedSandApp.s("觨\u0001"));
        }
        list.get(size - 2).add(new f(list.remove(i4)));
    }

    private static boolean l(char c5) {
        return (c5 >= 'A' && c5 <= 'Z') || (c5 >= 'a' && c5 <= 'z');
    }

    private static <U> List<b<U>> m(List<List<b<U>>> list) {
        return (List) androidx.appcompat.view.menu.d.a(list, 1);
    }

    private static <U> void q(List<List<b<U>>> list) {
        list.add(new ArrayList());
    }

    protected abstract S f(Map<U, Long> map, boolean z4);

    public String h(n0<? super U> n0Var) {
        StringBuilder sb = new StringBuilder();
        try {
            p(n0Var, sb);
            return sb.toString();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public String i() {
        return this.f83117c;
    }

    public Class<U> j() {
        return this.f83115a;
    }

    protected abstract U k(char c5);

    public S n(CharSequence charSequence) throws ParseException {
        return o(charSequence, 0);
    }

    public S o(CharSequence charSequence, int i4) throws ParseException {
        b<U> bVar;
        HashMap hashMap = new HashMap();
        int size = this.f83116b.size();
        boolean z4 = false;
        int i5 = 0;
        while (i5 < size && (bVar = this.f83116b.get(i5)) != g.f83126b) {
            int d5 = bVar.d(hashMap, charSequence, i4);
            if (d5 < 0) {
                while (true) {
                    i5++;
                    if (i5 >= size) {
                        i5 = -1;
                        break;
                    }
                    if (this.f83116b.get(i5) == g.f83126b) {
                        break;
                    }
                }
                if (i5 == -1) {
                    throw new ParseException(ProtectedSandApp.s("觩\u0001") + ((Object) charSequence), ~d5);
                }
                hashMap.clear();
            } else {
                i4 = d5;
            }
            i5++;
        }
        int length = charSequence.length();
        if (i4 < length) {
            throw new ParseException(ProtectedSandApp.s("觫\u0001") + ((Object) charSequence.subSequence(i4, length)) + ProtectedSandApp.s("觬\u0001") + ((Object) charSequence), i4);
        }
        Long l4 = (Long) hashMap.remove(f83114d);
        if (l4 != null && l4.longValue() < 0) {
            z4 = true;
        }
        HashMap hashMap2 = new HashMap();
        for (Object obj : hashMap.keySet()) {
            if (!this.f83115a.isInstance(obj)) {
                throw new ParseException(ProtectedSandApp.s("觪\u0001") + hashMap, i4);
            }
            hashMap2.put(this.f83115a.cast(obj), hashMap.get(obj));
        }
        return f(hashMap2, z4);
    }

    public void p(n0<? super U> n0Var, Appendable appendable) throws IOException {
        b<U> next;
        Iterator<b<U>> it = this.f83116b.iterator();
        while (it.hasNext() && (next = it.next()) != g.f83126b) {
            next.e(n0Var, appendable);
        }
    }
}
