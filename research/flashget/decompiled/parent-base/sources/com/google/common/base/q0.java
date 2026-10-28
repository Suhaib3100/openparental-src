package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: Splitter.java */
@o
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.common.base.f f55014a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f55015b;

    /* renamed from: c, reason: collision with root package name */
    private final h f55016c;

    /* renamed from: d, reason: collision with root package name */
    private final int f55017d;

    /* compiled from: Splitter.java */
    class a implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.f f55018a;

        /* compiled from: Splitter.java */
        /* renamed from: com.google.common.base.q0$a$a, reason: collision with other inner class name */
        class C0831a extends g {
            C0831a(q0 q0Var, CharSequence charSequence) {
                super(q0Var, charSequence);
            }

            @Override // com.google.common.base.q0.g
            int e(int i4) {
                return i4 + 1;
            }

            @Override // com.google.common.base.q0.g
            int f(int i4) {
                return a.this.f55018a.o(this.f55031d, i4);
            }
        }

        a(com.google.common.base.f fVar) {
            this.f55018a = fVar;
        }

        @Override // com.google.common.base.q0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(q0 q0Var, CharSequence charSequence) {
            return new C0831a(q0Var, charSequence);
        }
    }

    /* compiled from: Splitter.java */
    class b implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f55020a;

        /* compiled from: Splitter.java */
        class a extends g {
            a(q0 q0Var, CharSequence charSequence) {
                super(q0Var, charSequence);
            }

            @Override // com.google.common.base.q0.g
            public int e(int i4) {
                return b.this.f55020a.length() + i4;
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
            
                r6 = r6 + 1;
             */
            @Override // com.google.common.base.q0.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public int f(int r6) {
                /*
                    r5 = this;
                    com.google.common.base.q0$b r0 = com.google.common.base.q0.b.this
                    java.lang.String r0 = r0.f55020a
                    int r0 = r0.length()
                    java.lang.CharSequence r1 = r5.f55031d
                    int r1 = r1.length()
                    int r1 = r1 - r0
                Lf:
                    if (r6 > r1) goto L2d
                    r2 = 0
                L12:
                    if (r2 >= r0) goto L2c
                    java.lang.CharSequence r3 = r5.f55031d
                    int r4 = r2 + r6
                    char r3 = r3.charAt(r4)
                    com.google.common.base.q0$b r4 = com.google.common.base.q0.b.this
                    java.lang.String r4 = r4.f55020a
                    char r4 = r4.charAt(r2)
                    if (r3 == r4) goto L29
                    int r6 = r6 + 1
                    goto Lf
                L29:
                    int r2 = r2 + 1
                    goto L12
                L2c:
                    return r6
                L2d:
                    r6 = -1
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.q0.b.a.f(int):int");
            }
        }

        b(String str) {
            this.f55020a = str;
        }

        @Override // com.google.common.base.q0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(q0 q0Var, CharSequence charSequence) {
            return new a(q0Var, charSequence);
        }
    }

    /* compiled from: Splitter.java */
    class c implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f55022a;

        /* compiled from: Splitter.java */
        class a extends g {

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ k f55023i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, q0 q0Var, CharSequence charSequence, k kVar) {
                super(q0Var, charSequence);
                this.f55023i = kVar;
            }

            @Override // com.google.common.base.q0.g
            public int e(int i4) {
                return this.f55023i.a();
            }

            @Override // com.google.common.base.q0.g
            public int f(int i4) {
                if (this.f55023i.c(i4)) {
                    return this.f55023i.f();
                }
                return -1;
            }
        }

        c(l lVar) {
            this.f55022a = lVar;
        }

        @Override // com.google.common.base.q0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(q0 q0Var, CharSequence charSequence) {
            return new a(this, q0Var, charSequence, this.f55022a.d(charSequence));
        }
    }

    /* compiled from: Splitter.java */
    class d implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f55024a;

        /* compiled from: Splitter.java */
        class a extends g {
            a(q0 q0Var, CharSequence charSequence) {
                super(q0Var, charSequence);
            }

            @Override // com.google.common.base.q0.g
            public int e(int i4) {
                return i4;
            }

            @Override // com.google.common.base.q0.g
            public int f(int i4) {
                int i5 = i4 + d.this.f55024a;
                if (i5 < this.f55031d.length()) {
                    return i5;
                }
                return -1;
            }
        }

        d(int i4) {
            this.f55024a = i4;
        }

        @Override // com.google.common.base.q0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(q0 q0Var, CharSequence charSequence) {
            return new a(q0Var, charSequence);
        }
    }

    /* compiled from: Splitter.java */
    class e implements Iterable<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f55026b;

        e(CharSequence charSequence) {
            this.f55026b = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return q0.a(q0.this, this.f55026b);
        }

        public String toString() {
            c0 p4 = c0.p(ProtectedSandApp.s("\uf33a"));
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            StringBuilder f4 = p4.f(sb, this);
            f4.append(']');
            return f4.toString();
        }
    }

    /* compiled from: Splitter.java */
    @d9.a
    public static final class f {

        /* renamed from: c, reason: collision with root package name */
        private static final String f55028c = ProtectedSandApp.s("\uf33b");

        /* renamed from: a, reason: collision with root package name */
        private final q0 f55029a;

        /* renamed from: b, reason: collision with root package name */
        private final q0 f55030b;

        /* synthetic */ f(q0 q0Var, q0 q0Var2, a aVar) {
            this(q0Var, q0Var2);
        }

        public Map<String, String> a(CharSequence charSequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.f55029a.n(charSequence)) {
                Iterator a5 = q0.a(this.f55030b, str);
                boolean hasNext = a5.hasNext();
                String s4 = ProtectedSandApp.s("\uf33b");
                l0.u(hasNext, s4, str);
                String str2 = (String) a5.next();
                l0.u(!linkedHashMap.containsKey(str2), ProtectedSandApp.s("\uf33c"), str2);
                l0.u(a5.hasNext(), s4, str);
                linkedHashMap.put(str2, (String) a5.next());
                l0.u(!a5.hasNext(), s4, str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }

        private f(q0 q0Var, q0 q0Var2) {
            this.f55029a = q0Var;
            q0Var2.getClass();
            this.f55030b = q0Var2;
        }
    }

    /* compiled from: Splitter.java */
    private static abstract class g extends com.google.common.base.b<String> {

        /* renamed from: d, reason: collision with root package name */
        final CharSequence f55031d;

        /* renamed from: e, reason: collision with root package name */
        final com.google.common.base.f f55032e;

        /* renamed from: f, reason: collision with root package name */
        final boolean f55033f;

        /* renamed from: g, reason: collision with root package name */
        int f55034g = 0;

        /* renamed from: h, reason: collision with root package name */
        int f55035h;

        protected g(q0 q0Var, CharSequence charSequence) {
            this.f55032e = q0Var.f55014a;
            this.f55033f = q0Var.f55015b;
            this.f55035h = q0Var.f55017d;
            this.f55031d = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.b
        @zc.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a() {
            int f4;
            int i4 = this.f55034g;
            while (true) {
                int i5 = this.f55034g;
                if (i5 == -1) {
                    return b();
                }
                f4 = f(i5);
                if (f4 == -1) {
                    f4 = this.f55031d.length();
                    this.f55034g = -1;
                } else {
                    this.f55034g = e(f4);
                }
                int i6 = this.f55034g;
                if (i6 == i4) {
                    int i7 = i6 + 1;
                    this.f55034g = i7;
                    if (i7 > this.f55031d.length()) {
                        this.f55034g = -1;
                    }
                } else {
                    while (i4 < f4 && this.f55032e.B(this.f55031d.charAt(i4))) {
                        i4++;
                    }
                    while (f4 > i4 && this.f55032e.B(this.f55031d.charAt(f4 - 1))) {
                        f4--;
                    }
                    if (!this.f55033f || i4 != f4) {
                        break;
                    }
                    i4 = this.f55034g;
                }
            }
            int i10 = this.f55035h;
            if (i10 == 1) {
                f4 = this.f55031d.length();
                this.f55034g = -1;
                while (f4 > i4 && this.f55032e.B(this.f55031d.charAt(f4 - 1))) {
                    f4--;
                }
            } else {
                this.f55035h = i10 - 1;
            }
            return this.f55031d.subSequence(i4, f4).toString();
        }

        abstract int e(int i4);

        abstract int f(int i4);
    }

    /* compiled from: Splitter.java */
    private interface h {
        Iterator<String> a(q0 q0Var, CharSequence charSequence);
    }

    private q0(h hVar, boolean z4, com.google.common.base.f fVar, int i4) {
        this.f55016c = hVar;
        this.f55015b = z4;
        this.f55014a = fVar;
        this.f55017d = i4;
    }

    static Iterator a(q0 q0Var, CharSequence charSequence) {
        return q0Var.f55016c.a(q0Var, charSequence);
    }

    public static q0 e(int i4) {
        l0.e(i4 > 0, ProtectedSandApp.s("\uf33d"));
        return new q0(new d(i4));
    }

    public static q0 h(char c5) {
        return i(new f.m(c5));
    }

    public static q0 i(com.google.common.base.f fVar) {
        fVar.getClass();
        return new q0(new a(fVar));
    }

    private static q0 j(l lVar) {
        l0.u(!lVar.d("").d(), ProtectedSandApp.s("\uf33e"), lVar);
        return new q0(new c(lVar));
    }

    public static q0 k(String str) {
        l0.e(str.length() != 0, ProtectedSandApp.s("\uf33f"));
        return str.length() == 1 ? h(str.charAt(0)) : new q0(new b(str));
    }

    @d9.c
    public static q0 l(Pattern pattern) {
        return j(new b0(pattern));
    }

    @d9.c
    public static q0 m(String str) {
        return j(k0.b(str));
    }

    private Iterator<String> p(CharSequence charSequence) {
        return this.f55016c.a(this, charSequence);
    }

    public q0 f(int i4) {
        l0.k(i4 > 0, ProtectedSandApp.s("\uf340"), i4);
        return new q0(this.f55016c, this.f55015b, this.f55014a, i4);
    }

    public q0 g() {
        return new q0(this.f55016c, true, this.f55014a, this.f55017d);
    }

    public Iterable<String> n(CharSequence charSequence) {
        charSequence.getClass();
        return new e(charSequence);
    }

    public List<String> o(CharSequence charSequence) {
        charSequence.getClass();
        Iterator<String> a5 = this.f55016c.a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (a5.hasNext()) {
            arrayList.add(a5.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public q0 q() {
        return r(f.c0.f54913g);
    }

    public q0 r(com.google.common.base.f fVar) {
        fVar.getClass();
        return new q0(this.f55016c, this.f55015b, fVar, this.f55017d);
    }

    @d9.a
    public f s(char c5) {
        return t(h(c5));
    }

    @d9.a
    public f t(q0 q0Var) {
        return new f(this, q0Var, null);
    }

    @d9.a
    public f u(String str) {
        return t(k(str));
    }

    private q0(h hVar) {
        this(hVar, false, f.y.f54938d, Integer.MAX_VALUE);
    }
}
