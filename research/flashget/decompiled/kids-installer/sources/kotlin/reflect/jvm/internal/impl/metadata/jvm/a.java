package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import kotlin.reflect.jvm.internal.impl.protobuf.w;

/* compiled from: JvmProtoBuf.java */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final h.g<a.d, c> f25469a;

    /* renamed from: b, reason: collision with root package name */
    public static final h.g<a.i, c> f25470b;

    /* renamed from: c, reason: collision with root package name */
    public static final h.g<a.i, Integer> f25471c;

    /* renamed from: d, reason: collision with root package name */
    public static final h.g<a.n, d> f25472d;

    /* renamed from: e, reason: collision with root package name */
    public static final h.g<a.n, Integer> f25473e;

    /* renamed from: f, reason: collision with root package name */
    public static final h.g<a.q, List<a.b>> f25474f;

    /* renamed from: g, reason: collision with root package name */
    public static final h.g<a.q, Boolean> f25475g;

    /* renamed from: h, reason: collision with root package name */
    public static final h.g<a.s, List<a.b>> f25476h;

    /* renamed from: i, reason: collision with root package name */
    public static final h.g<a.c, Integer> f25477i;

    /* renamed from: j, reason: collision with root package name */
    public static final h.g<a.c, List<a.n>> f25478j;

    /* renamed from: k, reason: collision with root package name */
    public static final h.g<a.c, Integer> f25479k;

    /* renamed from: l, reason: collision with root package name */
    public static final h.g<a.c, Integer> f25480l;

    /* renamed from: m, reason: collision with root package name */
    public static final h.g<a.l, Integer> f25481m;

    /* renamed from: n, reason: collision with root package name */
    public static final h.g<a.l, List<a.n>> f25482n;

    /* compiled from: JvmProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class e extends h implements f {

        /* renamed from: v, reason: collision with root package name */
        private static final e f25522v;

        /* renamed from: w, reason: collision with root package name */
        public static q<e> f25523w = new C0357a();

        /* renamed from: p, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25524p;

        /* renamed from: q, reason: collision with root package name */
        private List<c> f25525q;

        /* renamed from: r, reason: collision with root package name */
        private List<Integer> f25526r;

        /* renamed from: s, reason: collision with root package name */
        private int f25527s;

        /* renamed from: t, reason: collision with root package name */
        private byte f25528t;

        /* renamed from: u, reason: collision with root package name */
        private int f25529u;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e$a, reason: collision with other inner class name */
        static class C0357a extends kotlin.reflect.jvm.internal.impl.protobuf.b<e> {
            C0357a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public e b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new e(eVar, fVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        public static final class b extends h.b<e, b> implements f {

            /* renamed from: p, reason: collision with root package name */
            private int f25530p;

            /* renamed from: q, reason: collision with root package name */
            private List<c> f25531q = Collections.emptyList();

            /* renamed from: r, reason: collision with root package name */
            private List<Integer> f25532r = Collections.emptyList();

            private b() {
            }

            private void B() {
            }

            static b o() {
                return new b();
            }

            private static b v() {
                return new b();
            }

            private void w() {
                if ((this.f25530p & 2) != 2) {
                    this.f25532r = new ArrayList(this.f25532r);
                    this.f25530p |= 2;
                }
            }

            private void y() {
                if ((this.f25530p & 1) != 1) {
                    this.f25531q = new ArrayList(this.f25531q);
                    this.f25530p |= 1;
                }
            }

            public e A() {
                return e.t();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b j(e eVar) {
                if (eVar == e.t()) {
                    return this;
                }
                if (!eVar.f25525q.isEmpty()) {
                    if (this.f25531q.isEmpty()) {
                        this.f25531q = eVar.f25525q;
                        this.f25530p &= -2;
                    } else {
                        y();
                        this.f25531q.addAll(eVar.f25525q);
                    }
                }
                if (!eVar.f25526r.isEmpty()) {
                    if (this.f25532r.isEmpty()) {
                        this.f25532r = eVar.f25526r;
                        this.f25530p &= -3;
                    } else {
                        w();
                        this.f25532r.addAll(eVar.f25526r);
                    }
                }
                k(i().f(eVar.f25524p));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.f25523w     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.j(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.j(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public e m() {
                return e.t();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public o m() {
                return e.t();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public e build() {
                e q5 = q();
                if (q5.l()) {
                    return q5;
                }
                throw new UninitializedMessageException(q5);
            }

            public e q() {
                e eVar = new e(this);
                if ((this.f25530p & 1) == 1) {
                    this.f25531q = Collections.unmodifiableList(this.f25531q);
                    this.f25530p &= -2;
                }
                eVar.f25525q = this.f25531q;
                if ((this.f25530p & 2) == 2) {
                    this.f25532r = Collections.unmodifiableList(this.f25532r);
                    this.f25530p &= -3;
                }
                eVar.f25526r = this.f25532r;
                return eVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(q());
            }
        }

        static {
            e eVar = new e(true);
            f25522v = eVar;
            eVar.A();
        }

        private void A() {
            this.f25525q = Collections.emptyList();
            this.f25526r = Collections.emptyList();
        }

        public static b B() {
            return b.o();
        }

        public static b C(e eVar) {
            return b.o().j(eVar);
        }

        public static e E(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws IOException {
            return f25523w.c(inputStream, fVar);
        }

        public static e t() {
            return f25522v;
        }

        public b D() {
            return b.o();
        }

        public b F() {
            return C(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            for (int i5 = 0; i5 < this.f25525q.size(); i5++) {
                codedOutputStream.d0(1, this.f25525q.get(i5));
            }
            if (this.f25526r.size() > 0) {
                codedOutputStream.o0(42);
                codedOutputStream.o0(this.f25527s);
            }
            for (int i6 = 0; i6 < this.f25526r.size(); i6++) {
                codedOutputStream.b0(this.f25526r.get(i6).intValue());
            }
            codedOutputStream.i0(this.f25524p);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.f25528t;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            this.f25528t = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public o m() {
            return f25522v;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return C(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.f25529u;
            if (i5 != -1) {
                return i5;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < this.f25525q.size(); i7++) {
                i6 += CodedOutputStream.s(1, this.f25525q.get(i7));
            }
            int i8 = 0;
            for (int i9 = 0; i9 < this.f25526r.size(); i9++) {
                i8 += CodedOutputStream.p(this.f25526r.get(i9).intValue());
            }
            int i10 = i6 + i8;
            if (!this.f25526r.isEmpty()) {
                i10 = i10 + 1 + CodedOutputStream.p(i8);
            }
            this.f25527s = i8;
            int size = this.f25524p.size() + i10;
            this.f25529u = size;
            return size;
        }

        public e v() {
            return f25522v;
        }

        public List<Integer> w() {
            return this.f25526r;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.o();
        }

        public List<c> y() {
            return this.f25525q;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public q<e> z() {
            return f25523w;
        }

        /* compiled from: JvmProtoBuf.java */
        public static final class c extends h implements kotlin.reflect.jvm.internal.impl.metadata.jvm.e {
            private static final c B;
            public static q<c> C = new C0358a();
            private int A;

            /* renamed from: p, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f25533p;

            /* renamed from: q, reason: collision with root package name */
            private int f25534q;

            /* renamed from: r, reason: collision with root package name */
            private int f25535r;

            /* renamed from: s, reason: collision with root package name */
            private int f25536s;

            /* renamed from: t, reason: collision with root package name */
            private Object f25537t;

            /* renamed from: u, reason: collision with root package name */
            private EnumC0359c f25538u;

            /* renamed from: v, reason: collision with root package name */
            private List<Integer> f25539v;

            /* renamed from: w, reason: collision with root package name */
            private int f25540w;

            /* renamed from: x, reason: collision with root package name */
            private List<Integer> f25541x;

            /* renamed from: y, reason: collision with root package name */
            private int f25542y;

            /* renamed from: z, reason: collision with root package name */
            private byte f25543z;

            /* compiled from: JvmProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e$c$a, reason: collision with other inner class name */
            static class C0358a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
                C0358a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                    return new c(eVar, fVar);
                }
            }

            /* compiled from: JvmProtoBuf.java */
            public static final class b extends h.b<c, b> implements kotlin.reflect.jvm.internal.impl.metadata.jvm.e {

                /* renamed from: p, reason: collision with root package name */
                private int f25544p;

                /* renamed from: r, reason: collision with root package name */
                private int f25546r;

                /* renamed from: q, reason: collision with root package name */
                private int f25545q = 1;

                /* renamed from: s, reason: collision with root package name */
                private Object f25547s = "";

                /* renamed from: t, reason: collision with root package name */
                private EnumC0359c f25548t = EnumC0359c.NONE;

                /* renamed from: u, reason: collision with root package name */
                private List<Integer> f25549u = Collections.emptyList();

                /* renamed from: v, reason: collision with root package name */
                private List<Integer> f25550v = Collections.emptyList();

                private b() {
                }

                private void B() {
                }

                static b o() {
                    return new b();
                }

                private static b v() {
                    return new b();
                }

                private void w() {
                    if ((this.f25544p & 32) != 32) {
                        this.f25550v = new ArrayList(this.f25550v);
                        this.f25544p |= 32;
                    }
                }

                private void y() {
                    if ((this.f25544p & 16) != 16) {
                        this.f25549u = new ArrayList(this.f25549u);
                        this.f25544p |= 16;
                    }
                }

                public c A() {
                    return c.C();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: C, reason: merged with bridge method [inline-methods] */
                public b j(c cVar) {
                    if (cVar == c.C()) {
                        return this;
                    }
                    if (cVar.P()) {
                        G(cVar.G());
                    }
                    if (cVar.O()) {
                        F(cVar.F());
                    }
                    if (cVar.Q()) {
                        this.f25544p |= 4;
                        this.f25547s = cVar.f25537t;
                    }
                    if (cVar.N()) {
                        E(cVar.E());
                    }
                    if (!cVar.f25539v.isEmpty()) {
                        if (this.f25549u.isEmpty()) {
                            this.f25549u = cVar.f25539v;
                            this.f25544p &= -17;
                        } else {
                            y();
                            this.f25549u.addAll(cVar.f25539v);
                        }
                    }
                    if (!cVar.f25541x.isEmpty()) {
                        if (this.f25550v.isEmpty()) {
                            this.f25550v = cVar.f25541x;
                            this.f25544p &= -33;
                        } else {
                            w();
                            this.f25550v.addAll(cVar.f25541x);
                        }
                    }
                    k(i().f(cVar.f25533p));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
                /* renamed from: D, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.c.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e$c> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.c.C     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e$c r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        if (r3 == 0) goto Le
                        r2.j(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1b
                    L11:
                        r3 = move-exception
                        kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e$c r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.c) r4     // Catch: java.lang.Throwable -> Lf
                        throw r3     // Catch: java.lang.Throwable -> L19
                    L19:
                        r3 = move-exception
                        r0 = r4
                    L1b:
                        if (r0 == 0) goto L20
                        r2.j(r0)
                    L20:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.c.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e$c$b");
                }

                public b E(EnumC0359c enumC0359c) {
                    enumC0359c.getClass();
                    this.f25544p |= 8;
                    this.f25548t = enumC0359c;
                    return this;
                }

                public b F(int i5) {
                    this.f25544p |= 2;
                    this.f25546r = i5;
                    return this;
                }

                public b G(int i5) {
                    this.f25544p |= 1;
                    this.f25545q = i5;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: f */
                public c m() {
                    return c.C();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                public final boolean l() {
                    return true;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
                public o m() {
                    return c.C();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public c build() {
                    c q5 = q();
                    if (q5.l()) {
                        return q5;
                    }
                    throw new UninitializedMessageException(q5);
                }

                public c q() {
                    c cVar = new c(this);
                    int i5 = this.f25544p;
                    int i6 = (i5 & 1) != 1 ? 0 : 1;
                    cVar.f25535r = this.f25545q;
                    if ((i5 & 2) == 2) {
                        i6 |= 2;
                    }
                    cVar.f25536s = this.f25546r;
                    if ((i5 & 4) == 4) {
                        i6 |= 4;
                    }
                    cVar.f25537t = this.f25547s;
                    if ((i5 & 8) == 8) {
                        i6 |= 8;
                    }
                    cVar.f25538u = this.f25548t;
                    if ((this.f25544p & 16) == 16) {
                        this.f25549u = Collections.unmodifiableList(this.f25549u);
                        this.f25544p &= -17;
                    }
                    cVar.f25539v = this.f25549u;
                    if ((this.f25544p & 32) == 32) {
                        this.f25550v = Collections.unmodifiableList(this.f25550v);
                        this.f25544p &= -33;
                    }
                    cVar.f25541x = this.f25550v;
                    cVar.f25534q = i6;
                    return cVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public b q() {
                    return new b().j(q());
                }
            }

            /* compiled from: JvmProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e$c$c, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public enum EnumC0359c implements i.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);

                private static i.b<EnumC0359c> internalValueMap = new C0360a();
                private final int value;

                /* compiled from: JvmProtoBuf.java */
                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e$c$c$a, reason: collision with other inner class name */
                static class C0360a implements i.b<EnumC0359c> {
                    C0360a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                    public EnumC0359c a(int i5) {
                        return EnumC0359c.valueOf(i5);
                    }

                    public EnumC0359c b(int i5) {
                        return EnumC0359c.valueOf(i5);
                    }
                }

                EnumC0359c(int i5, int i6) {
                    this.value = i6;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                public final int getNumber() {
                    return this.value;
                }

                public static EnumC0359c valueOf(int i5) {
                    if (i5 == 0) {
                        return NONE;
                    }
                    if (i5 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i5 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }
            }

            static {
                c cVar = new c(true);
                B = cVar;
                cVar.R();
            }

            public static c C() {
                return B;
            }

            private void R() {
                this.f25535r = 1;
                this.f25536s = 0;
                this.f25537t = "";
                this.f25538u = EnumC0359c.NONE;
                this.f25539v = Collections.emptyList();
                this.f25541x = Collections.emptyList();
            }

            public static b S() {
                return b.o();
            }

            public static b T(c cVar) {
                return b.o().j(cVar);
            }

            public c D() {
                return B;
            }

            public EnumC0359c E() {
                return this.f25538u;
            }

            public int F() {
                return this.f25536s;
            }

            public int G() {
                return this.f25535r;
            }

            public int H() {
                return this.f25541x.size();
            }

            public List<Integer> I() {
                return this.f25541x;
            }

            public String J() {
                Object obj = this.f25537t;
                if (obj instanceof String) {
                    return (String) obj;
                }
                kotlin.reflect.jvm.internal.impl.protobuf.d dVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
                String E = dVar.E();
                if (dVar.t()) {
                    this.f25537t = E;
                }
                return E;
            }

            public kotlin.reflect.jvm.internal.impl.protobuf.d K() {
                Object obj = this.f25537t;
                if (!(obj instanceof String)) {
                    return (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
                }
                kotlin.reflect.jvm.internal.impl.protobuf.d o5 = kotlin.reflect.jvm.internal.impl.protobuf.d.o((String) obj);
                this.f25537t = o5;
                return o5;
            }

            public int L() {
                return this.f25539v.size();
            }

            public List<Integer> M() {
                return this.f25539v;
            }

            public boolean N() {
                return (this.f25534q & 8) == 8;
            }

            public boolean O() {
                return (this.f25534q & 2) == 2;
            }

            public boolean P() {
                return (this.f25534q & 1) == 1;
            }

            public boolean Q() {
                return (this.f25534q & 4) == 4;
            }

            public b U() {
                return b.o();
            }

            public b V() {
                return T(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public void a(CodedOutputStream codedOutputStream) throws IOException {
                u();
                if ((this.f25534q & 1) == 1) {
                    codedOutputStream.a0(1, this.f25535r);
                }
                if ((this.f25534q & 2) == 2) {
                    codedOutputStream.a0(2, this.f25536s);
                }
                if ((this.f25534q & 8) == 8) {
                    codedOutputStream.S(3, this.f25538u.getNumber());
                }
                if (this.f25539v.size() > 0) {
                    codedOutputStream.o0(34);
                    codedOutputStream.o0(this.f25540w);
                }
                for (int i5 = 0; i5 < this.f25539v.size(); i5++) {
                    codedOutputStream.b0(this.f25539v.get(i5).intValue());
                }
                if (this.f25541x.size() > 0) {
                    codedOutputStream.o0(42);
                    codedOutputStream.o0(this.f25542y);
                }
                for (int i6 = 0; i6 < this.f25541x.size(); i6++) {
                    codedOutputStream.b0(this.f25541x.get(i6).intValue());
                }
                if ((this.f25534q & 4) == 4) {
                    codedOutputStream.O(6, K());
                }
                codedOutputStream.i0(this.f25533p);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                byte b6 = this.f25543z;
                if (b6 == 1) {
                    return true;
                }
                if (b6 == 0) {
                    return false;
                }
                this.f25543z = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public o m() {
                return B;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public o.a n() {
                return T(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public int u() {
                int i5 = this.A;
                if (i5 != -1) {
                    return i5;
                }
                int o5 = (this.f25534q & 1) == 1 ? CodedOutputStream.o(1, this.f25535r) + 0 : 0;
                if ((this.f25534q & 2) == 2) {
                    o5 += CodedOutputStream.o(2, this.f25536s);
                }
                if ((this.f25534q & 8) == 8) {
                    o5 += CodedOutputStream.h(3, this.f25538u.getNumber());
                }
                int i6 = 0;
                for (int i7 = 0; i7 < this.f25539v.size(); i7++) {
                    i6 += CodedOutputStream.p(this.f25539v.get(i7).intValue());
                }
                int i8 = o5 + i6;
                if (!this.f25539v.isEmpty()) {
                    i8 = i8 + 1 + CodedOutputStream.p(i6);
                }
                this.f25540w = i6;
                int i9 = 0;
                for (int i10 = 0; i10 < this.f25541x.size(); i10++) {
                    i9 += CodedOutputStream.p(this.f25541x.get(i10).intValue());
                }
                int i11 = i8 + i9;
                if (!this.f25541x.isEmpty()) {
                    i11 = i11 + 1 + CodedOutputStream.p(i9);
                }
                this.f25542y = i9;
                if ((this.f25534q & 4) == 4) {
                    i11 += CodedOutputStream.d(6, K());
                }
                int size = this.f25533p.size() + i11;
                this.A = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public o.a x() {
                return b.o();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
            public q<c> z() {
                return C;
            }

            private c(h.b bVar) {
                super(bVar);
                this.f25540w = -1;
                this.f25542y = -1;
                this.f25543z = (byte) -1;
                this.A = -1;
                this.f25533p = bVar.i();
            }

            private c(boolean z5) {
                this.f25540w = -1;
                this.f25542y = -1;
                this.f25543z = (byte) -1;
                this.A = -1;
                this.f25533p = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
            }

            private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                this.f25540w = -1;
                this.f25542y = -1;
                this.f25543z = (byte) -1;
                this.A = -1;
                R();
                d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
                CodedOutputStream J = CodedOutputStream.J(x5, 1);
                boolean z5 = false;
                int i5 = 0;
                while (!z5) {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K == 8) {
                                    this.f25534q |= 1;
                                    this.f25535r = eVar.A();
                                } else if (K == 16) {
                                    this.f25534q |= 2;
                                    this.f25536s = eVar.A();
                                } else if (K == 24) {
                                    int A = eVar.A();
                                    EnumC0359c valueOf = EnumC0359c.valueOf(A);
                                    if (valueOf == null) {
                                        J.o0(K);
                                        J.o0(A);
                                    } else {
                                        this.f25534q |= 8;
                                        this.f25538u = valueOf;
                                    }
                                } else if (K == 32) {
                                    if ((i5 & 16) != 16) {
                                        this.f25539v = new ArrayList();
                                        i5 |= 16;
                                    }
                                    this.f25539v.add(Integer.valueOf(eVar.A()));
                                } else if (K == 34) {
                                    int j5 = eVar.j(eVar.A());
                                    if ((i5 & 16) != 16 && eVar.e() > 0) {
                                        this.f25539v = new ArrayList();
                                        i5 |= 16;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f25539v.add(Integer.valueOf(eVar.A()));
                                    }
                                    eVar.i(j5);
                                } else if (K == 40) {
                                    if ((i5 & 32) != 32) {
                                        this.f25541x = new ArrayList();
                                        i5 |= 32;
                                    }
                                    this.f25541x.add(Integer.valueOf(eVar.A()));
                                } else if (K == 42) {
                                    int j6 = eVar.j(eVar.A());
                                    if ((i5 & 32) != 32 && eVar.e() > 0) {
                                        this.f25541x = new ArrayList();
                                        i5 |= 32;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f25541x.add(Integer.valueOf(eVar.A()));
                                    }
                                    eVar.i(j6);
                                } else if (K != 50) {
                                    if (!eVar.P(K, J)) {
                                    }
                                } else {
                                    kotlin.reflect.jvm.internal.impl.protobuf.d l5 = eVar.l();
                                    this.f25534q |= 4;
                                    this.f25537t = l5;
                                }
                            }
                            z5 = true;
                        } catch (Throwable th) {
                            if ((i5 & 16) == 16) {
                                this.f25539v = Collections.unmodifiableList(this.f25539v);
                            }
                            if ((i5 & 32) == 32) {
                                this.f25541x = Collections.unmodifiableList(this.f25541x);
                            }
                            try {
                                J.I();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f25533p = x5.e();
                                throw th2;
                            }
                            this.f25533p = x5.e();
                            throw th;
                        }
                    } catch (InvalidProtocolBufferException e6) {
                        throw e6.i(this);
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                    }
                }
                if ((i5 & 16) == 16) {
                    this.f25539v = Collections.unmodifiableList(this.f25539v);
                }
                if ((i5 & 32) == 32) {
                    this.f25541x = Collections.unmodifiableList(this.f25541x);
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f25533p = x5.e();
                    throw th3;
                }
                this.f25533p = x5.e();
            }
        }

        private e(h.b bVar) {
            super(bVar);
            this.f25527s = -1;
            this.f25528t = (byte) -1;
            this.f25529u = -1;
            this.f25524p = bVar.i();
        }

        private e(boolean z5) {
            this.f25527s = -1;
            this.f25528t = (byte) -1;
            this.f25529u = -1;
            this.f25524p = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private e(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f25527s = -1;
            this.f25528t = (byte) -1;
            this.f25529u = -1;
            A();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            int i5 = 0;
            while (!z5) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 10) {
                                if ((i5 & 1) != 1) {
                                    this.f25525q = new ArrayList();
                                    i5 |= 1;
                                }
                                this.f25525q.add(eVar.u(c.C, fVar));
                            } else if (K == 40) {
                                if ((i5 & 2) != 2) {
                                    this.f25526r = new ArrayList();
                                    i5 |= 2;
                                }
                                this.f25526r.add(Integer.valueOf(eVar.A()));
                            } else if (K != 42) {
                                if (!eVar.P(K, J)) {
                                }
                            } else {
                                int j5 = eVar.j(eVar.A());
                                if ((i5 & 2) != 2 && eVar.e() > 0) {
                                    this.f25526r = new ArrayList();
                                    i5 |= 2;
                                }
                                while (eVar.e() > 0) {
                                    this.f25526r.add(Integer.valueOf(eVar.A()));
                                }
                                eVar.i(j5);
                            }
                        }
                        z5 = true;
                    } catch (Throwable th) {
                        if ((i5 & 1) == 1) {
                            this.f25525q = Collections.unmodifiableList(this.f25525q);
                        }
                        if ((i5 & 2) == 2) {
                            this.f25526r = Collections.unmodifiableList(this.f25526r);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f25524p = x5.e();
                            throw th2;
                        }
                        this.f25524p = x5.e();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e6) {
                    throw e6.i(this);
                } catch (IOException e7) {
                    throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                }
            }
            if ((i5 & 1) == 1) {
                this.f25525q = Collections.unmodifiableList(this.f25525q);
            }
            if ((i5 & 2) == 2) {
                this.f25526r = Collections.unmodifiableList(this.f25526r);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25524p = x5.e();
                throw th3;
            }
            this.f25524p = x5.e();
        }
    }

    static {
        a.d H = a.d.H();
        c s5 = c.s();
        c s6 = c.s();
        w.b bVar = w.b.MESSAGE;
        f25469a = h.i(H, s5, s6, null, 100, bVar, c.class);
        f25470b = h.i(a.i.b0(), c.s(), c.s(), null, 100, bVar, c.class);
        a.i b02 = a.i.b0();
        w.b bVar2 = w.b.INT32;
        f25471c = h.i(b02, 0, null, null, 101, bVar2, Integer.class);
        f25472d = h.i(a.n.Y(), d.w(), d.w(), null, 100, bVar, d.class);
        f25473e = h.i(a.n.Y(), 0, null, null, 101, bVar2, Integer.class);
        f25474f = h.h(a.q.X(), a.b.y(), null, 100, bVar, false, a.b.class);
        f25475g = h.i(a.q.X(), Boolean.FALSE, null, null, 101, w.b.BOOL, Boolean.class);
        f25476h = h.h(a.s.K(), a.b.y(), null, 100, bVar, false, a.b.class);
        f25477i = h.i(a.c.z0(), 0, null, null, 101, bVar2, Integer.class);
        f25478j = h.h(a.c.z0(), a.n.Y(), null, 102, bVar, false, a.n.class);
        f25479k = h.i(a.c.z0(), 0, null, null, 103, bVar2, Integer.class);
        f25480l = h.i(a.c.z0(), 0, null, null, 104, bVar2, Integer.class);
        f25481m = h.i(a.l.K(), 0, null, null, 101, bVar2, Integer.class);
        f25482n = h.h(a.l.K(), a.n.Y(), null, 102, bVar, false, a.n.class);
    }

    public static void a(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        fVar.a(f25469a);
        fVar.a(f25470b);
        fVar.a(f25471c);
        fVar.a(f25472d);
        fVar.a(f25473e);
        fVar.a(f25474f);
        fVar.a(f25475g);
        fVar.a(f25476h);
        fVar.a(f25477i);
        fVar.a(f25478j);
        fVar.a(f25479k);
        fVar.a(f25480l);
        fVar.a(f25481m);
        fVar.a(f25482n);
    }

    /* compiled from: JvmProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class b extends h implements kotlin.reflect.jvm.internal.impl.metadata.jvm.b {

        /* renamed from: v, reason: collision with root package name */
        private static final b f25483v;

        /* renamed from: w, reason: collision with root package name */
        public static q<b> f25484w = new C0353a();

        /* renamed from: p, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25485p;

        /* renamed from: q, reason: collision with root package name */
        private int f25486q;

        /* renamed from: r, reason: collision with root package name */
        private int f25487r;

        /* renamed from: s, reason: collision with root package name */
        private int f25488s;

        /* renamed from: t, reason: collision with root package name */
        private byte f25489t;

        /* renamed from: u, reason: collision with root package name */
        private int f25490u;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.a$b$a, reason: collision with other inner class name */
        static class C0353a extends kotlin.reflect.jvm.internal.impl.protobuf.b<b> {
            C0353a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new b(eVar, fVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.a$b$b, reason: collision with other inner class name */
        public static final class C0354b extends h.b<b, C0354b> implements kotlin.reflect.jvm.internal.impl.metadata.jvm.b {

            /* renamed from: p, reason: collision with root package name */
            private int f25491p;

            /* renamed from: q, reason: collision with root package name */
            private int f25492q;

            /* renamed from: r, reason: collision with root package name */
            private int f25493r;

            private C0354b() {
            }

            static C0354b o() {
                return new C0354b();
            }

            private static C0354b v() {
                return new C0354b();
            }

            private void y() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public C0354b j(b bVar) {
                if (bVar == b.s()) {
                    return this;
                }
                if (bVar.A()) {
                    D(bVar.w());
                }
                if (bVar.y()) {
                    C(bVar.v());
                }
                k(i().f(bVar.f25485p));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: B, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b.C0354b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.jvm.a$b> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b.f25484w     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.a$b r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.j(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.a$b r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.j(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b.C0354b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.jvm.a$b$b");
            }

            public C0354b C(int i5) {
                this.f25491p |= 2;
                this.f25493r = i5;
                return this;
            }

            public C0354b D(int i5) {
                this.f25491p |= 1;
                this.f25492q = i5;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public b m() {
                return b.s();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public o m() {
                return b.s();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public b build() {
                b q5 = q();
                if (q5.l()) {
                    return q5;
                }
                throw new UninitializedMessageException(q5);
            }

            public b q() {
                b bVar = new b(this);
                int i5 = this.f25491p;
                int i6 = (i5 & 1) != 1 ? 0 : 1;
                bVar.f25487r = this.f25492q;
                if ((i5 & 2) == 2) {
                    i6 |= 2;
                }
                bVar.f25488s = this.f25493r;
                bVar.f25486q = i6;
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C0354b q() {
                return new C0354b().j(q());
            }

            public b w() {
                return b.s();
            }
        }

        static {
            b bVar = new b(true);
            f25483v = bVar;
            bVar.B();
        }

        private void B() {
            this.f25487r = 0;
            this.f25488s = 0;
        }

        public static C0354b C() {
            return C0354b.o();
        }

        public static C0354b D(b bVar) {
            return C0354b.o().j(bVar);
        }

        public static b s() {
            return f25483v;
        }

        public boolean A() {
            return (this.f25486q & 1) == 1;
        }

        public C0354b E() {
            return C0354b.o();
        }

        public C0354b F() {
            return D(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            if ((this.f25486q & 1) == 1) {
                codedOutputStream.a0(1, this.f25487r);
            }
            if ((this.f25486q & 2) == 2) {
                codedOutputStream.a0(2, this.f25488s);
            }
            codedOutputStream.i0(this.f25485p);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.f25489t;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            this.f25489t = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public o m() {
            return f25483v;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return D(this);
        }

        public b t() {
            return f25483v;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.f25490u;
            if (i5 != -1) {
                return i5;
            }
            int o5 = (this.f25486q & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f25487r) : 0;
            if ((this.f25486q & 2) == 2) {
                o5 += CodedOutputStream.o(2, this.f25488s);
            }
            int size = this.f25485p.size() + o5;
            this.f25490u = size;
            return size;
        }

        public int v() {
            return this.f25488s;
        }

        public int w() {
            return this.f25487r;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return C0354b.o();
        }

        public boolean y() {
            return (this.f25486q & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public q<b> z() {
            return f25484w;
        }

        private b(h.b bVar) {
            super(bVar);
            this.f25489t = (byte) -1;
            this.f25490u = -1;
            this.f25485p = bVar.i();
        }

        private b(boolean z5) {
            this.f25489t = (byte) -1;
            this.f25490u = -1;
            this.f25485p = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        private b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f25489t = (byte) -1;
            this.f25490u = -1;
            B();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            while (!z5) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f25486q |= 1;
                                this.f25487r = eVar.A();
                            } else if (K != 16) {
                                if (!eVar.P(K, J)) {
                                }
                            } else {
                                this.f25486q |= 2;
                                this.f25488s = eVar.A();
                            }
                        }
                        z5 = true;
                    } catch (InvalidProtocolBufferException e6) {
                        throw e6.i(this);
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f25485p = x5.e();
                        throw th2;
                    }
                    this.f25485p = x5.e();
                    throw th;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25485p = x5.e();
                throw th3;
            }
            this.f25485p = x5.e();
        }
    }

    /* compiled from: JvmProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class c extends h implements kotlin.reflect.jvm.internal.impl.metadata.jvm.c {

        /* renamed from: v, reason: collision with root package name */
        private static final c f25494v;

        /* renamed from: w, reason: collision with root package name */
        public static q<c> f25495w = new C0355a();

        /* renamed from: p, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25496p;

        /* renamed from: q, reason: collision with root package name */
        private int f25497q;

        /* renamed from: r, reason: collision with root package name */
        private int f25498r;

        /* renamed from: s, reason: collision with root package name */
        private int f25499s;

        /* renamed from: t, reason: collision with root package name */
        private byte f25500t;

        /* renamed from: u, reason: collision with root package name */
        private int f25501u;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.a$c$a, reason: collision with other inner class name */
        static class C0355a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
            C0355a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new c(eVar, fVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        public static final class b extends h.b<c, b> implements kotlin.reflect.jvm.internal.impl.metadata.jvm.c {

            /* renamed from: p, reason: collision with root package name */
            private int f25502p;

            /* renamed from: q, reason: collision with root package name */
            private int f25503q;

            /* renamed from: r, reason: collision with root package name */
            private int f25504r;

            private b() {
            }

            static b o() {
                return new b();
            }

            private static b v() {
                return new b();
            }

            private void y() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public b j(c cVar) {
                if (cVar == c.s()) {
                    return this;
                }
                if (cVar.A()) {
                    D(cVar.w());
                }
                if (cVar.y()) {
                    C(cVar.v());
                }
                k(i().f(cVar.f25496p));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: B, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.a.c.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.jvm.a$c> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.c.f25495w     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.a$c r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.a.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.j(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.a$c r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.a.c) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.j(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.a.c.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.jvm.a$c$b");
            }

            public b C(int i5) {
                this.f25502p |= 2;
                this.f25504r = i5;
                return this;
            }

            public b D(int i5) {
                this.f25502p |= 1;
                this.f25503q = i5;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public c m() {
                return c.s();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public o m() {
                return c.s();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public c build() {
                c q5 = q();
                if (q5.l()) {
                    return q5;
                }
                throw new UninitializedMessageException(q5);
            }

            public c q() {
                c cVar = new c(this);
                int i5 = this.f25502p;
                int i6 = (i5 & 1) != 1 ? 0 : 1;
                cVar.f25498r = this.f25503q;
                if ((i5 & 2) == 2) {
                    i6 |= 2;
                }
                cVar.f25499s = this.f25504r;
                cVar.f25497q = i6;
                return cVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(q());
            }

            public c w() {
                return c.s();
            }
        }

        static {
            c cVar = new c(true);
            f25494v = cVar;
            cVar.B();
        }

        private void B() {
            this.f25498r = 0;
            this.f25499s = 0;
        }

        public static b C() {
            return b.o();
        }

        public static b D(c cVar) {
            return b.o().j(cVar);
        }

        public static c s() {
            return f25494v;
        }

        public boolean A() {
            return (this.f25497q & 1) == 1;
        }

        public b E() {
            return b.o();
        }

        public b F() {
            return D(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            if ((this.f25497q & 1) == 1) {
                codedOutputStream.a0(1, this.f25498r);
            }
            if ((this.f25497q & 2) == 2) {
                codedOutputStream.a0(2, this.f25499s);
            }
            codedOutputStream.i0(this.f25496p);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.f25500t;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            this.f25500t = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public o m() {
            return f25494v;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return D(this);
        }

        public c t() {
            return f25494v;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.f25501u;
            if (i5 != -1) {
                return i5;
            }
            int o5 = (this.f25497q & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f25498r) : 0;
            if ((this.f25497q & 2) == 2) {
                o5 += CodedOutputStream.o(2, this.f25499s);
            }
            int size = this.f25496p.size() + o5;
            this.f25501u = size;
            return size;
        }

        public int v() {
            return this.f25499s;
        }

        public int w() {
            return this.f25498r;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.o();
        }

        public boolean y() {
            return (this.f25497q & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public q<c> z() {
            return f25495w;
        }

        private c(h.b bVar) {
            super(bVar);
            this.f25500t = (byte) -1;
            this.f25501u = -1;
            this.f25496p = bVar.i();
        }

        private c(boolean z5) {
            this.f25500t = (byte) -1;
            this.f25501u = -1;
            this.f25496p = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f25500t = (byte) -1;
            this.f25501u = -1;
            B();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            while (!z5) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f25497q |= 1;
                                this.f25498r = eVar.A();
                            } else if (K != 16) {
                                if (!eVar.P(K, J)) {
                                }
                            } else {
                                this.f25497q |= 2;
                                this.f25499s = eVar.A();
                            }
                        }
                        z5 = true;
                    } catch (InvalidProtocolBufferException e6) {
                        throw e6.i(this);
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f25496p = x5.e();
                        throw th2;
                    }
                    this.f25496p = x5.e();
                    throw th;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25496p = x5.e();
                throw th3;
            }
            this.f25496p = x5.e();
        }
    }

    /* compiled from: JvmProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class d extends h implements kotlin.reflect.jvm.internal.impl.metadata.jvm.d {

        /* renamed from: y, reason: collision with root package name */
        private static final d f25505y;

        /* renamed from: z, reason: collision with root package name */
        public static q<d> f25506z = new C0356a();

        /* renamed from: p, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25507p;

        /* renamed from: q, reason: collision with root package name */
        private int f25508q;

        /* renamed from: r, reason: collision with root package name */
        private b f25509r;

        /* renamed from: s, reason: collision with root package name */
        private c f25510s;

        /* renamed from: t, reason: collision with root package name */
        private c f25511t;

        /* renamed from: u, reason: collision with root package name */
        private c f25512u;

        /* renamed from: v, reason: collision with root package name */
        private c f25513v;

        /* renamed from: w, reason: collision with root package name */
        private byte f25514w;

        /* renamed from: x, reason: collision with root package name */
        private int f25515x;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.a$d$a, reason: collision with other inner class name */
        static class C0356a extends kotlin.reflect.jvm.internal.impl.protobuf.b<d> {
            C0356a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public d b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new d(eVar, fVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        public static final class b extends h.b<d, b> implements kotlin.reflect.jvm.internal.impl.metadata.jvm.d {

            /* renamed from: p, reason: collision with root package name */
            private int f25516p;

            /* renamed from: q, reason: collision with root package name */
            private b f25517q = b.s();

            /* renamed from: r, reason: collision with root package name */
            private c f25518r = c.s();

            /* renamed from: s, reason: collision with root package name */
            private c f25519s = c.s();

            /* renamed from: t, reason: collision with root package name */
            private c f25520t = c.s();

            /* renamed from: u, reason: collision with root package name */
            private c f25521u = c.s();

            private b() {
            }

            static b o() {
                return new b();
            }

            private static b v() {
                return new b();
            }

            private void y() {
            }

            public b A(c cVar) {
                if ((this.f25516p & 16) != 16 || this.f25521u == c.s()) {
                    this.f25521u = cVar;
                } else {
                    this.f25521u = c.D(this.f25521u).j(cVar).q();
                }
                this.f25516p |= 16;
                return this;
            }

            public b B(b bVar) {
                if ((this.f25516p & 1) != 1 || this.f25517q == b.s()) {
                    this.f25517q = bVar;
                } else {
                    this.f25517q = b.D(this.f25517q).j(bVar).q();
                }
                this.f25516p |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b j(d dVar) {
                if (dVar == d.w()) {
                    return this;
                }
                if (dVar.G()) {
                    B(dVar.B());
                }
                if (dVar.J()) {
                    G(dVar.E());
                }
                if (dVar.H()) {
                    E(dVar.C());
                }
                if (dVar.I()) {
                    F(dVar.D());
                }
                if (dVar.F()) {
                    A(dVar.A());
                }
                k(i().f(dVar.f25507p));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.a.d.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.jvm.a$d> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.d.f25506z     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.a$d r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.a.d) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.j(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.a$d r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.a.d) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.j(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.a.d.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.jvm.a$d$b");
            }

            public b E(c cVar) {
                if ((this.f25516p & 4) != 4 || this.f25519s == c.s()) {
                    this.f25519s = cVar;
                } else {
                    this.f25519s = c.D(this.f25519s).j(cVar).q();
                }
                this.f25516p |= 4;
                return this;
            }

            public b F(c cVar) {
                if ((this.f25516p & 8) != 8 || this.f25520t == c.s()) {
                    this.f25520t = cVar;
                } else {
                    this.f25520t = c.D(this.f25520t).j(cVar).q();
                }
                this.f25516p |= 8;
                return this;
            }

            public b G(c cVar) {
                if ((this.f25516p & 2) != 2 || this.f25518r == c.s()) {
                    this.f25518r = cVar;
                } else {
                    this.f25518r = c.D(this.f25518r).j(cVar).q();
                }
                this.f25516p |= 2;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public d m() {
                return d.w();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public o m() {
                return d.w();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public d build() {
                d q5 = q();
                if (q5.l()) {
                    return q5;
                }
                throw new UninitializedMessageException(q5);
            }

            public d q() {
                d dVar = new d(this);
                int i5 = this.f25516p;
                int i6 = (i5 & 1) != 1 ? 0 : 1;
                dVar.f25509r = this.f25517q;
                if ((i5 & 2) == 2) {
                    i6 |= 2;
                }
                dVar.f25510s = this.f25518r;
                if ((i5 & 4) == 4) {
                    i6 |= 4;
                }
                dVar.f25511t = this.f25519s;
                if ((i5 & 8) == 8) {
                    i6 |= 8;
                }
                dVar.f25512u = this.f25520t;
                if ((i5 & 16) == 16) {
                    i6 |= 16;
                }
                dVar.f25513v = this.f25521u;
                dVar.f25508q = i6;
                return dVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(q());
            }

            public d w() {
                return d.w();
            }
        }

        static {
            d dVar = new d(true);
            f25505y = dVar;
            dVar.K();
        }

        private void K() {
            this.f25509r = b.s();
            this.f25510s = c.s();
            this.f25511t = c.s();
            this.f25512u = c.s();
            this.f25513v = c.s();
        }

        public static b L() {
            return b.o();
        }

        public static b M(d dVar) {
            return b.o().j(dVar);
        }

        public static d w() {
            return f25505y;
        }

        public c A() {
            return this.f25513v;
        }

        public b B() {
            return this.f25509r;
        }

        public c C() {
            return this.f25511t;
        }

        public c D() {
            return this.f25512u;
        }

        public c E() {
            return this.f25510s;
        }

        public boolean F() {
            return (this.f25508q & 16) == 16;
        }

        public boolean G() {
            return (this.f25508q & 1) == 1;
        }

        public boolean H() {
            return (this.f25508q & 4) == 4;
        }

        public boolean I() {
            return (this.f25508q & 8) == 8;
        }

        public boolean J() {
            return (this.f25508q & 2) == 2;
        }

        public b N() {
            return b.o();
        }

        public b O() {
            return M(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            if ((this.f25508q & 1) == 1) {
                codedOutputStream.d0(1, this.f25509r);
            }
            if ((this.f25508q & 2) == 2) {
                codedOutputStream.d0(2, this.f25510s);
            }
            if ((this.f25508q & 4) == 4) {
                codedOutputStream.d0(3, this.f25511t);
            }
            if ((this.f25508q & 8) == 8) {
                codedOutputStream.d0(4, this.f25512u);
            }
            if ((this.f25508q & 16) == 16) {
                codedOutputStream.d0(5, this.f25513v);
            }
            codedOutputStream.i0(this.f25507p);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.f25514w;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            this.f25514w = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public o m() {
            return f25505y;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return M(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.f25515x;
            if (i5 != -1) {
                return i5;
            }
            int s5 = (this.f25508q & 1) == 1 ? 0 + CodedOutputStream.s(1, this.f25509r) : 0;
            if ((this.f25508q & 2) == 2) {
                s5 += CodedOutputStream.s(2, this.f25510s);
            }
            if ((this.f25508q & 4) == 4) {
                s5 += CodedOutputStream.s(3, this.f25511t);
            }
            if ((this.f25508q & 8) == 8) {
                s5 += CodedOutputStream.s(4, this.f25512u);
            }
            if ((this.f25508q & 16) == 16) {
                s5 += CodedOutputStream.s(5, this.f25513v);
            }
            int size = this.f25507p.size() + s5;
            this.f25515x = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.o();
        }

        public d y() {
            return f25505y;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public q<d> z() {
            return f25506z;
        }

        private d(h.b bVar) {
            super(bVar);
            this.f25514w = (byte) -1;
            this.f25515x = -1;
            this.f25507p = bVar.i();
        }

        private d(boolean z5) {
            this.f25514w = (byte) -1;
            this.f25515x = -1;
            this.f25507p = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        private d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f25514w = (byte) -1;
            this.f25515x = -1;
            K();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            while (!z5) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                c.b bVar = null;
                                b.C0354b c0354b = null;
                                c.b bVar2 = null;
                                c.b bVar3 = null;
                                c.b bVar4 = null;
                                if (K == 10) {
                                    if ((this.f25508q & 1) == 1) {
                                        b bVar5 = this.f25509r;
                                        bVar5.getClass();
                                        c0354b = b.D(bVar5);
                                    }
                                    b bVar6 = (b) eVar.u(b.f25484w, fVar);
                                    this.f25509r = bVar6;
                                    if (c0354b != null) {
                                        c0354b.j(bVar6);
                                        this.f25509r = c0354b.q();
                                    }
                                    this.f25508q |= 1;
                                } else if (K == 18) {
                                    if ((this.f25508q & 2) == 2) {
                                        c cVar = this.f25510s;
                                        cVar.getClass();
                                        bVar2 = c.D(cVar);
                                    }
                                    c cVar2 = (c) eVar.u(c.f25495w, fVar);
                                    this.f25510s = cVar2;
                                    if (bVar2 != null) {
                                        bVar2.j(cVar2);
                                        this.f25510s = bVar2.q();
                                    }
                                    this.f25508q |= 2;
                                } else if (K == 26) {
                                    if ((this.f25508q & 4) == 4) {
                                        c cVar3 = this.f25511t;
                                        cVar3.getClass();
                                        bVar3 = c.D(cVar3);
                                    }
                                    c cVar4 = (c) eVar.u(c.f25495w, fVar);
                                    this.f25511t = cVar4;
                                    if (bVar3 != null) {
                                        bVar3.j(cVar4);
                                        this.f25511t = bVar3.q();
                                    }
                                    this.f25508q |= 4;
                                } else if (K == 34) {
                                    if ((this.f25508q & 8) == 8) {
                                        c cVar5 = this.f25512u;
                                        cVar5.getClass();
                                        bVar4 = c.D(cVar5);
                                    }
                                    c cVar6 = (c) eVar.u(c.f25495w, fVar);
                                    this.f25512u = cVar6;
                                    if (bVar4 != null) {
                                        bVar4.j(cVar6);
                                        this.f25512u = bVar4.q();
                                    }
                                    this.f25508q |= 8;
                                } else if (K != 42) {
                                    if (!eVar.P(K, J)) {
                                    }
                                } else {
                                    if ((this.f25508q & 16) == 16) {
                                        c cVar7 = this.f25513v;
                                        cVar7.getClass();
                                        bVar = c.D(cVar7);
                                    }
                                    c cVar8 = (c) eVar.u(c.f25495w, fVar);
                                    this.f25513v = cVar8;
                                    if (bVar != null) {
                                        bVar.j(cVar8);
                                        this.f25513v = bVar.q();
                                    }
                                    this.f25508q |= 16;
                                }
                            }
                            z5 = true;
                        } catch (IOException e6) {
                            throw new InvalidProtocolBufferException(e6.getMessage()).i(this);
                        }
                    } catch (InvalidProtocolBufferException e7) {
                        throw e7.i(this);
                    }
                } catch (Throwable th) {
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f25507p = x5.e();
                        throw th2;
                    }
                    this.f25507p = x5.e();
                    throw th;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25507p = x5.e();
                throw th3;
            }
            this.f25507p = x5.e();
        }
    }
}
