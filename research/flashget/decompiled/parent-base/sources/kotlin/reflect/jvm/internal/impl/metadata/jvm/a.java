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
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final h.g<a.d, c> f77447a;

    /* renamed from: b, reason: collision with root package name */
    public static final h.g<a.i, c> f77448b;

    /* renamed from: c, reason: collision with root package name */
    public static final h.g<a.i, Integer> f77449c;

    /* renamed from: d, reason: collision with root package name */
    public static final h.g<a.n, d> f77450d;

    /* renamed from: e, reason: collision with root package name */
    public static final h.g<a.n, Integer> f77451e;

    /* renamed from: f, reason: collision with root package name */
    public static final h.g<a.q, List<a.b>> f77452f;

    /* renamed from: g, reason: collision with root package name */
    public static final h.g<a.q, Boolean> f77453g;

    /* renamed from: h, reason: collision with root package name */
    public static final h.g<a.s, List<a.b>> f77454h;

    /* renamed from: i, reason: collision with root package name */
    public static final h.g<a.c, Integer> f77455i;

    /* renamed from: j, reason: collision with root package name */
    public static final h.g<a.c, List<a.n>> f77456j;

    /* renamed from: k, reason: collision with root package name */
    public static final h.g<a.c, Integer> f77457k;

    /* renamed from: l, reason: collision with root package name */
    public static final h.g<a.c, Integer> f77458l;

    /* renamed from: m, reason: collision with root package name */
    public static final h.g<a.l, Integer> f77459m;

    /* renamed from: n, reason: collision with root package name */
    public static final h.g<a.l, List<a.n>> f77460n;

    static {
        a.d I = a.d.I();
        c s4 = c.s();
        c s5 = c.s();
        w.b bVar = w.b.MESSAGE;
        f77447a = h.j(I, s4, s5, null, 100, bVar, c.class);
        f77448b = h.j(a.i.b0(), c.s(), c.s(), null, 100, bVar, c.class);
        a.i b02 = a.i.b0();
        w.b bVar2 = w.b.INT32;
        f77449c = h.j(b02, 0, null, null, 101, bVar2, Integer.class);
        f77450d = h.j(a.n.Z(), d.x(), d.x(), null, 100, bVar, d.class);
        f77451e = h.j(a.n.Z(), 0, null, null, 101, bVar2, Integer.class);
        f77452f = h.i(a.q.Y(), a.b.y(), null, 100, bVar, false, a.b.class);
        f77453g = h.j(a.q.Y(), Boolean.FALSE, null, null, 101, w.b.BOOL, Boolean.class);
        f77454h = h.i(a.s.L(), a.b.y(), null, 100, bVar, false, a.b.class);
        f77455i = h.j(a.c.A0(), 0, null, null, 101, bVar2, Integer.class);
        f77456j = h.i(a.c.A0(), a.n.Z(), null, 102, bVar, false, a.n.class);
        f77457k = h.j(a.c.A0(), 0, null, null, 103, bVar2, Integer.class);
        f77458l = h.j(a.c.A0(), 0, null, null, 104, bVar2, Integer.class);
        f77459m = h.j(a.l.L(), 0, null, null, 101, bVar2, Integer.class);
        f77460n = h.i(a.l.L(), a.n.Z(), null, 102, bVar, false, a.n.class);
    }

    public static void a(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        fVar.a(f77447a);
        fVar.a(f77448b);
        fVar.a(f77449c);
        fVar.a(f77450d);
        fVar.a(f77451e);
        fVar.a(f77452f);
        fVar.a(f77453g);
        fVar.a(f77454h);
        fVar.a(f77455i);
        fVar.a(f77456j);
        fVar.a(f77457k);
        fVar.a(f77458l);
        fVar.a(f77459m);
        fVar.a(f77460n);
    }

    /* compiled from: JvmProtoBuf.java */
    public static final class b extends h implements kotlin.reflect.jvm.internal.impl.metadata.jvm.b {

        /* renamed from: i, reason: collision with root package name */
        private static final b f77461i;

        /* renamed from: j, reason: collision with root package name */
        public static q<b> f77462j = new C1158a();

        /* renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77463c;

        /* renamed from: d, reason: collision with root package name */
        private int f77464d;

        /* renamed from: e, reason: collision with root package name */
        private int f77465e;

        /* renamed from: f, reason: collision with root package name */
        private int f77466f;

        /* renamed from: g, reason: collision with root package name */
        private byte f77467g;

        /* renamed from: h, reason: collision with root package name */
        private int f77468h;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.a$b$a, reason: collision with other inner class name */
        static class C1158a extends kotlin.reflect.jvm.internal.impl.protobuf.b<b> {
            C1158a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new b(eVar, fVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.a$b$b, reason: collision with other inner class name */
        public static final class C1159b extends h.b<b, C1159b> implements kotlin.reflect.jvm.internal.impl.metadata.jvm.b {

            /* renamed from: c, reason: collision with root package name */
            private int f77469c;

            /* renamed from: d, reason: collision with root package name */
            private int f77470d;

            /* renamed from: e, reason: collision with root package name */
            private int f77471e;

            private C1159b() {
            }

            static C1159b m() {
                return new C1159b();
            }

            private static C1159b s() {
                return new C1159b();
            }

            private void v() {
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b.C1159b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.jvm.a$b> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b.f77462j     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.a$b r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.k(r3)
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
                    r2.k(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b.C1159b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.jvm.a$b$b");
            }

            public C1159b C(int i4) {
                this.f77469c |= 2;
                this.f77471e = i4;
                return this;
            }

            public C1159b D(int i4) {
                this.f77469c |= 1;
                this.f77470d = i4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public b z() {
                return b.s();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public b a() {
                b o4 = o();
                if (o4.p()) {
                    return o4;
                }
                throw new UninitializedMessageException(o4);
            }

            public b o() {
                b bVar = new b(this);
                int i4 = this.f77469c;
                int i5 = (i4 & 1) != 1 ? 0 : 1;
                bVar.f77465e = this.f77470d;
                if ((i4 & 2) == 2) {
                    i5 |= 2;
                }
                bVar.f77466f = this.f77471e;
                bVar.f77464d = i5;
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C1159b o() {
                return new C1159b().k(o());
            }

            public b u() {
                return b.s();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public C1159b k(b bVar) {
                if (bVar == b.s()) {
                    return this;
                }
                if (bVar.A()) {
                    D(bVar.x());
                }
                if (bVar.y()) {
                    C(bVar.v());
                }
                l(i().c(bVar.f77463c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public o z() {
                return b.s();
            }
        }

        static {
            b bVar = new b(true);
            f77461i = bVar;
            bVar.C();
        }

        private b(h.b bVar) {
            this.f77467g = (byte) -1;
            this.f77468h = -1;
            this.f77463c = bVar.i();
        }

        private void C() {
            this.f77465e = 0;
            this.f77466f = 0;
        }

        public static C1159b D() {
            return C1159b.m();
        }

        public static C1159b E(b bVar) {
            return C1159b.m().k(bVar);
        }

        public static b s() {
            return f77461i;
        }

        public boolean A() {
            return (this.f77464d & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public q<b> B() {
            return f77462j;
        }

        public C1159b F() {
            return C1159b.m();
        }

        public C1159b G() {
            return E(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            if ((this.f77464d & 1) == 1) {
                codedOutputStream.a0(1, this.f77465e);
            }
            if ((this.f77464d & 2) == 2) {
                codedOutputStream.a0(2, this.f77466f);
            }
            codedOutputStream.i0(this.f77463c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77467g;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            this.f77467g = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return E(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77468h;
            if (i4 != -1) {
                return i4;
            }
            int o4 = (this.f77464d & 1) == 1 ? CodedOutputStream.o(1, this.f77465e) : 0;
            if ((this.f77464d & 2) == 2) {
                o4 += CodedOutputStream.o(2, this.f77466f);
            }
            int size = this.f77463c.size() + o4;
            this.f77468h = size;
            return size;
        }

        public b u() {
            return f77461i;
        }

        public int v() {
            return this.f77466f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return C1159b.m();
        }

        public int x() {
            return this.f77465e;
        }

        public boolean y() {
            return (this.f77464d & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public o z() {
            return f77461i;
        }

        private b(boolean z4) {
            this.f77467g = (byte) -1;
            this.f77468h = -1;
            this.f77463c = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        private b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77467g = (byte) -1;
            this.f77468h = -1;
            C();
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z4 = false;
            while (!z4) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K == 8) {
                                    this.f77464d |= 1;
                                    this.f77465e = eVar.A();
                                } else if (K != 16) {
                                    if (!eVar.P(K, J)) {
                                    }
                                } else {
                                    this.f77464d |= 2;
                                    this.f77466f = eVar.A();
                                }
                            }
                            z4 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.i(this);
                        }
                    } catch (IOException e5) {
                        throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f77463c = w4.e();
                        throw th2;
                    }
                    this.f77463c = w4.e();
                    throw th;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77463c = w4.e();
                throw th3;
            }
            this.f77463c = w4.e();
        }
    }

    /* compiled from: JvmProtoBuf.java */
    public static final class c extends h implements kotlin.reflect.jvm.internal.impl.metadata.jvm.c {

        /* renamed from: i, reason: collision with root package name */
        private static final c f77472i;

        /* renamed from: j, reason: collision with root package name */
        public static q<c> f77473j = new C1160a();

        /* renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77474c;

        /* renamed from: d, reason: collision with root package name */
        private int f77475d;

        /* renamed from: e, reason: collision with root package name */
        private int f77476e;

        /* renamed from: f, reason: collision with root package name */
        private int f77477f;

        /* renamed from: g, reason: collision with root package name */
        private byte f77478g;

        /* renamed from: h, reason: collision with root package name */
        private int f77479h;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.a$c$a, reason: collision with other inner class name */
        static class C1160a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
            C1160a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public c c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new c(eVar, fVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        public static final class b extends h.b<c, b> implements kotlin.reflect.jvm.internal.impl.metadata.jvm.c {

            /* renamed from: c, reason: collision with root package name */
            private int f77480c;

            /* renamed from: d, reason: collision with root package name */
            private int f77481d;

            /* renamed from: e, reason: collision with root package name */
            private int f77482e;

            private b() {
            }

            static b m() {
                return new b();
            }

            private static b s() {
                return new b();
            }

            private void v() {
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.a.c.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.jvm.a$c> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.c.f77473j     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.a$c r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.a.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.k(r3)
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
                    r2.k(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.a.c.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.jvm.a$c$b");
            }

            public b C(int i4) {
                this.f77480c |= 2;
                this.f77482e = i4;
                return this;
            }

            public b D(int i4) {
                this.f77480c |= 1;
                this.f77481d = i4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public c z() {
                return c.s();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public c a() {
                c o4 = o();
                if (o4.p()) {
                    return o4;
                }
                throw new UninitializedMessageException(o4);
            }

            public c o() {
                c cVar = new c(this);
                int i4 = this.f77480c;
                int i5 = (i4 & 1) != 1 ? 0 : 1;
                cVar.f77476e = this.f77481d;
                if ((i4 & 2) == 2) {
                    i5 |= 2;
                }
                cVar.f77477f = this.f77482e;
                cVar.f77475d = i5;
                return cVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public b o() {
                return new b().k(o());
            }

            public c u() {
                return c.s();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public b k(c cVar) {
                if (cVar == c.s()) {
                    return this;
                }
                if (cVar.A()) {
                    D(cVar.x());
                }
                if (cVar.y()) {
                    C(cVar.v());
                }
                l(i().c(cVar.f77474c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public o z() {
                return c.s();
            }
        }

        static {
            c cVar = new c(true);
            f77472i = cVar;
            cVar.C();
        }

        private c(h.b bVar) {
            this.f77478g = (byte) -1;
            this.f77479h = -1;
            this.f77474c = bVar.i();
        }

        private void C() {
            this.f77476e = 0;
            this.f77477f = 0;
        }

        public static b D() {
            return b.m();
        }

        public static b E(c cVar) {
            return b.m().k(cVar);
        }

        public static c s() {
            return f77472i;
        }

        public boolean A() {
            return (this.f77475d & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public q<c> B() {
            return f77473j;
        }

        public b F() {
            return b.m();
        }

        public b G() {
            return E(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            if ((this.f77475d & 1) == 1) {
                codedOutputStream.a0(1, this.f77476e);
            }
            if ((this.f77475d & 2) == 2) {
                codedOutputStream.a0(2, this.f77477f);
            }
            codedOutputStream.i0(this.f77474c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77478g;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            this.f77478g = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return E(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77479h;
            if (i4 != -1) {
                return i4;
            }
            int o4 = (this.f77475d & 1) == 1 ? CodedOutputStream.o(1, this.f77476e) : 0;
            if ((this.f77475d & 2) == 2) {
                o4 += CodedOutputStream.o(2, this.f77477f);
            }
            int size = this.f77474c.size() + o4;
            this.f77479h = size;
            return size;
        }

        public c u() {
            return f77472i;
        }

        public int v() {
            return this.f77477f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.m();
        }

        public int x() {
            return this.f77476e;
        }

        public boolean y() {
            return (this.f77475d & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public o z() {
            return f77472i;
        }

        private c(boolean z4) {
            this.f77478g = (byte) -1;
            this.f77479h = -1;
            this.f77474c = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77478g = (byte) -1;
            this.f77479h = -1;
            C();
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z4 = false;
            while (!z4) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K == 8) {
                                    this.f77475d |= 1;
                                    this.f77476e = eVar.A();
                                } else if (K != 16) {
                                    if (!eVar.P(K, J)) {
                                    }
                                } else {
                                    this.f77475d |= 2;
                                    this.f77477f = eVar.A();
                                }
                            }
                            z4 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.i(this);
                        }
                    } catch (IOException e5) {
                        throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f77474c = w4.e();
                        throw th2;
                    }
                    this.f77474c = w4.e();
                    throw th;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77474c = w4.e();
                throw th3;
            }
            this.f77474c = w4.e();
        }
    }

    /* compiled from: JvmProtoBuf.java */
    public static final class d extends h implements kotlin.reflect.jvm.internal.impl.metadata.jvm.d {

        /* renamed from: l, reason: collision with root package name */
        private static final d f77483l;

        /* renamed from: m, reason: collision with root package name */
        public static q<d> f77484m = new C1161a();

        /* renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77485c;

        /* renamed from: d, reason: collision with root package name */
        private int f77486d;

        /* renamed from: e, reason: collision with root package name */
        private b f77487e;

        /* renamed from: f, reason: collision with root package name */
        private c f77488f;

        /* renamed from: g, reason: collision with root package name */
        private c f77489g;

        /* renamed from: h, reason: collision with root package name */
        private c f77490h;

        /* renamed from: i, reason: collision with root package name */
        private c f77491i;

        /* renamed from: j, reason: collision with root package name */
        private byte f77492j;

        /* renamed from: k, reason: collision with root package name */
        private int f77493k;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.a$d$a, reason: collision with other inner class name */
        static class C1161a extends kotlin.reflect.jvm.internal.impl.protobuf.b<d> {
            C1161a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public d c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new d(eVar, fVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        public static final class b extends h.b<d, b> implements kotlin.reflect.jvm.internal.impl.metadata.jvm.d {

            /* renamed from: c, reason: collision with root package name */
            private int f77494c;

            /* renamed from: d, reason: collision with root package name */
            private b f77495d = b.s();

            /* renamed from: e, reason: collision with root package name */
            private c f77496e = c.s();

            /* renamed from: f, reason: collision with root package name */
            private c f77497f = c.s();

            /* renamed from: g, reason: collision with root package name */
            private c f77498g = c.s();

            /* renamed from: h, reason: collision with root package name */
            private c f77499h = c.s();

            private b() {
            }

            static b m() {
                return new b();
            }

            private static b s() {
                return new b();
            }

            private void v() {
            }

            public b A(b bVar) {
                if ((this.f77494c & 1) != 1 || this.f77495d == b.s()) {
                    this.f77495d = bVar;
                } else {
                    this.f77495d = b.E(this.f77495d).k(bVar).o();
                }
                this.f77494c |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b k(d dVar) {
                if (dVar == d.x()) {
                    return this;
                }
                if (dVar.H()) {
                    A(dVar.C());
                }
                if (dVar.K()) {
                    G(dVar.F());
                }
                if (dVar.I()) {
                    E(dVar.D());
                }
                if (dVar.J()) {
                    F(dVar.E());
                }
                if (dVar.G()) {
                    y(dVar.A());
                }
                l(i().c(dVar.f77485c));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.a.d.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.jvm.a$d> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.d.f77484m     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.a$d r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.a.d) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.k(r3)
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
                    r2.k(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.a.d.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.jvm.a$d$b");
            }

            public b E(c cVar) {
                if ((this.f77494c & 4) != 4 || this.f77497f == c.s()) {
                    this.f77497f = cVar;
                } else {
                    this.f77497f = c.E(this.f77497f).k(cVar).o();
                }
                this.f77494c |= 4;
                return this;
            }

            public b F(c cVar) {
                if ((this.f77494c & 8) != 8 || this.f77498g == c.s()) {
                    this.f77498g = cVar;
                } else {
                    this.f77498g = c.E(this.f77498g).k(cVar).o();
                }
                this.f77494c |= 8;
                return this;
            }

            public b G(c cVar) {
                if ((this.f77494c & 2) != 2 || this.f77496e == c.s()) {
                    this.f77496e = cVar;
                } else {
                    this.f77496e = c.E(this.f77496e).k(cVar).o();
                }
                this.f77494c |= 2;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public d z() {
                return d.x();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public d a() {
                d o4 = o();
                if (o4.p()) {
                    return o4;
                }
                throw new UninitializedMessageException(o4);
            }

            public d o() {
                d dVar = new d(this);
                int i4 = this.f77494c;
                int i5 = (i4 & 1) != 1 ? 0 : 1;
                dVar.f77487e = this.f77495d;
                if ((i4 & 2) == 2) {
                    i5 |= 2;
                }
                dVar.f77488f = this.f77496e;
                if ((i4 & 4) == 4) {
                    i5 |= 4;
                }
                dVar.f77489g = this.f77497f;
                if ((i4 & 8) == 8) {
                    i5 |= 8;
                }
                dVar.f77490h = this.f77498g;
                if ((i4 & 16) == 16) {
                    i5 |= 16;
                }
                dVar.f77491i = this.f77499h;
                dVar.f77486d = i5;
                return dVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public b o() {
                return new b().k(o());
            }

            public d u() {
                return d.x();
            }

            public b y(c cVar) {
                if ((this.f77494c & 16) != 16 || this.f77499h == c.s()) {
                    this.f77499h = cVar;
                } else {
                    this.f77499h = c.E(this.f77499h).k(cVar).o();
                }
                this.f77494c |= 16;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public o z() {
                return d.x();
            }
        }

        static {
            d dVar = new d(true);
            f77483l = dVar;
            dVar.L();
        }

        private d(h.b bVar) {
            this.f77492j = (byte) -1;
            this.f77493k = -1;
            this.f77485c = bVar.i();
        }

        private void L() {
            this.f77487e = b.s();
            this.f77488f = c.s();
            this.f77489g = c.s();
            this.f77490h = c.s();
            this.f77491i = c.s();
        }

        public static b M() {
            return b.m();
        }

        public static b N(d dVar) {
            return b.m().k(dVar);
        }

        public static d x() {
            return f77483l;
        }

        public c A() {
            return this.f77491i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public q<d> B() {
            return f77484m;
        }

        public b C() {
            return this.f77487e;
        }

        public c D() {
            return this.f77489g;
        }

        public c E() {
            return this.f77490h;
        }

        public c F() {
            return this.f77488f;
        }

        public boolean G() {
            return (this.f77486d & 16) == 16;
        }

        public boolean H() {
            return (this.f77486d & 1) == 1;
        }

        public boolean I() {
            return (this.f77486d & 4) == 4;
        }

        public boolean J() {
            return (this.f77486d & 8) == 8;
        }

        public boolean K() {
            return (this.f77486d & 2) == 2;
        }

        public b O() {
            return b.m();
        }

        public b P() {
            return N(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            if ((this.f77486d & 1) == 1) {
                codedOutputStream.d0(1, this.f77487e);
            }
            if ((this.f77486d & 2) == 2) {
                codedOutputStream.d0(2, this.f77488f);
            }
            if ((this.f77486d & 4) == 4) {
                codedOutputStream.d0(3, this.f77489g);
            }
            if ((this.f77486d & 8) == 8) {
                codedOutputStream.d0(4, this.f77490h);
            }
            if ((this.f77486d & 16) == 16) {
                codedOutputStream.d0(5, this.f77491i);
            }
            codedOutputStream.i0(this.f77485c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77492j;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            this.f77492j = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return N(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77493k;
            if (i4 != -1) {
                return i4;
            }
            int s4 = (this.f77486d & 1) == 1 ? CodedOutputStream.s(1, this.f77487e) : 0;
            if ((this.f77486d & 2) == 2) {
                s4 += CodedOutputStream.s(2, this.f77488f);
            }
            if ((this.f77486d & 4) == 4) {
                s4 += CodedOutputStream.s(3, this.f77489g);
            }
            if ((this.f77486d & 8) == 8) {
                s4 += CodedOutputStream.s(4, this.f77490h);
            }
            if ((this.f77486d & 16) == 16) {
                s4 += CodedOutputStream.s(5, this.f77491i);
            }
            int size = this.f77485c.size() + s4;
            this.f77493k = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.m();
        }

        public d y() {
            return f77483l;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public o z() {
            return f77483l;
        }

        private d(boolean z4) {
            this.f77492j = (byte) -1;
            this.f77493k = -1;
            this.f77485c = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        private d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77492j = (byte) -1;
            this.f77493k = -1;
            L();
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z4 = false;
            while (!z4) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            c.b bVar = null;
                            b.C1159b c1159b = null;
                            c.b bVar2 = null;
                            c.b bVar3 = null;
                            c.b bVar4 = null;
                            if (K == 10) {
                                if ((this.f77486d & 1) == 1) {
                                    b bVar5 = this.f77487e;
                                    bVar5.getClass();
                                    c1159b = b.E(bVar5);
                                }
                                b bVar6 = (b) eVar.u(b.f77462j, fVar);
                                this.f77487e = bVar6;
                                if (c1159b != null) {
                                    c1159b.k(bVar6);
                                    this.f77487e = c1159b.o();
                                }
                                this.f77486d |= 1;
                            } else if (K == 18) {
                                if ((this.f77486d & 2) == 2) {
                                    c cVar = this.f77488f;
                                    cVar.getClass();
                                    bVar2 = c.E(cVar);
                                }
                                c cVar2 = (c) eVar.u(c.f77473j, fVar);
                                this.f77488f = cVar2;
                                if (bVar2 != null) {
                                    bVar2.k(cVar2);
                                    this.f77488f = bVar2.o();
                                }
                                this.f77486d |= 2;
                            } else if (K == 26) {
                                if ((this.f77486d & 4) == 4) {
                                    c cVar3 = this.f77489g;
                                    cVar3.getClass();
                                    bVar3 = c.E(cVar3);
                                }
                                c cVar4 = (c) eVar.u(c.f77473j, fVar);
                                this.f77489g = cVar4;
                                if (bVar3 != null) {
                                    bVar3.k(cVar4);
                                    this.f77489g = bVar3.o();
                                }
                                this.f77486d |= 4;
                            } else if (K == 34) {
                                if ((this.f77486d & 8) == 8) {
                                    c cVar5 = this.f77490h;
                                    cVar5.getClass();
                                    bVar4 = c.E(cVar5);
                                }
                                c cVar6 = (c) eVar.u(c.f77473j, fVar);
                                this.f77490h = cVar6;
                                if (bVar4 != null) {
                                    bVar4.k(cVar6);
                                    this.f77490h = bVar4.o();
                                }
                                this.f77486d |= 8;
                            } else if (K != 42) {
                                if (!eVar.P(K, J)) {
                                }
                            } else {
                                if ((this.f77486d & 16) == 16) {
                                    c cVar7 = this.f77491i;
                                    cVar7.getClass();
                                    bVar = c.E(cVar7);
                                }
                                c cVar8 = (c) eVar.u(c.f77473j, fVar);
                                this.f77491i = cVar8;
                                if (bVar != null) {
                                    bVar.k(cVar8);
                                    this.f77491i = bVar.o();
                                }
                                this.f77486d |= 16;
                            }
                        }
                        z4 = true;
                    } catch (InvalidProtocolBufferException e4) {
                        throw e4.i(this);
                    } catch (IOException e5) {
                        throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f77485c = w4.e();
                        throw th2;
                    }
                    this.f77485c = w4.e();
                    throw th;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77485c = w4.e();
                throw th3;
            }
            this.f77485c = w4.e();
        }
    }

    /* compiled from: JvmProtoBuf.java */
    public static final class e extends h implements f {

        /* renamed from: i, reason: collision with root package name */
        private static final e f77500i;

        /* renamed from: j, reason: collision with root package name */
        public static q<e> f77501j = new C1162a();

        /* renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77502c;

        /* renamed from: d, reason: collision with root package name */
        private List<c> f77503d;

        /* renamed from: e, reason: collision with root package name */
        private List<Integer> f77504e;

        /* renamed from: f, reason: collision with root package name */
        private int f77505f;

        /* renamed from: g, reason: collision with root package name */
        private byte f77506g;

        /* renamed from: h, reason: collision with root package name */
        private int f77507h;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e$a, reason: collision with other inner class name */
        static class C1162a extends kotlin.reflect.jvm.internal.impl.protobuf.b<e> {
            C1162a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public e c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new e(eVar, fVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        public static final class b extends h.b<e, b> implements f {

            /* renamed from: c, reason: collision with root package name */
            private int f77508c;

            /* renamed from: d, reason: collision with root package name */
            private List<c> f77509d = Collections.emptyList();

            /* renamed from: e, reason: collision with root package name */
            private List<Integer> f77510e = Collections.emptyList();

            private b() {
            }

            private void A() {
            }

            static b m() {
                return new b();
            }

            private static b s() {
                return new b();
            }

            private void u() {
                if ((this.f77508c & 2) != 2) {
                    this.f77510e = new ArrayList(this.f77510e);
                    this.f77508c |= 2;
                }
            }

            private void v() {
                if ((this.f77508c & 1) != 1) {
                    this.f77509d = new ArrayList(this.f77509d);
                    this.f77508c |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b k(e eVar) {
                if (eVar == e.u()) {
                    return this;
                }
                if (!eVar.f77503d.isEmpty()) {
                    if (this.f77509d.isEmpty()) {
                        this.f77509d = eVar.f77503d;
                        this.f77508c &= -2;
                    } else {
                        v();
                        this.f77509d.addAll(eVar.f77503d);
                    }
                }
                if (!eVar.f77504e.isEmpty()) {
                    if (this.f77510e.isEmpty()) {
                        this.f77510e = eVar.f77504e;
                        this.f77508c &= -3;
                    } else {
                        u();
                        this.f77510e.addAll(eVar.f77504e);
                    }
                }
                l(i().c(eVar.f77502c));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.f77501j     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.k(r3)
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
                    r2.k(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public e z() {
                return e.u();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public e a() {
                e o4 = o();
                if (o4.p()) {
                    return o4;
                }
                throw new UninitializedMessageException(o4);
            }

            public e o() {
                e eVar = new e(this);
                if ((this.f77508c & 1) == 1) {
                    this.f77509d = Collections.unmodifiableList(this.f77509d);
                    this.f77508c &= -2;
                }
                eVar.f77503d = this.f77509d;
                if ((this.f77508c & 2) == 2) {
                    this.f77510e = Collections.unmodifiableList(this.f77510e);
                    this.f77508c &= -3;
                }
                eVar.f77504e = this.f77510e;
                return eVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public b o() {
                return new b().k(o());
            }

            public e y() {
                return e.u();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public o z() {
                return e.u();
            }
        }

        static {
            e eVar = new e(true);
            f77500i = eVar;
            eVar.A();
        }

        private e(h.b bVar) {
            this.f77505f = -1;
            this.f77506g = (byte) -1;
            this.f77507h = -1;
            this.f77502c = bVar.i();
        }

        private void A() {
            this.f77503d = Collections.emptyList();
            this.f77504e = Collections.emptyList();
        }

        public static b C() {
            return b.m();
        }

        public static b D(e eVar) {
            return b.m().k(eVar);
        }

        public static e F(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws IOException {
            return f77501j.d(inputStream, fVar);
        }

        public static e u() {
            return f77500i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public q<e> B() {
            return f77501j;
        }

        public b E() {
            return b.m();
        }

        public b G() {
            return D(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            for (int i4 = 0; i4 < this.f77503d.size(); i4++) {
                codedOutputStream.d0(1, this.f77503d.get(i4));
            }
            if (this.f77504e.size() > 0) {
                codedOutputStream.o0(42);
                codedOutputStream.o0(this.f77505f);
            }
            for (int i5 = 0; i5 < this.f77504e.size(); i5++) {
                codedOutputStream.b0(this.f77504e.get(i5).intValue());
            }
            codedOutputStream.i0(this.f77502c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77506g;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            this.f77506g = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return D(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77507h;
            if (i4 != -1) {
                return i4;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f77503d.size(); i6++) {
                i5 += CodedOutputStream.s(1, this.f77503d.get(i6));
            }
            int i7 = 0;
            for (int i10 = 0; i10 < this.f77504e.size(); i10++) {
                i7 += CodedOutputStream.p(this.f77504e.get(i10).intValue());
            }
            int i11 = i5 + i7;
            if (!this.f77504e.isEmpty()) {
                i11 = i11 + 1 + CodedOutputStream.p(i7);
            }
            this.f77505f = i7;
            int size = this.f77502c.size() + i11;
            this.f77507h = size;
            return size;
        }

        public e v() {
            return f77500i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.m();
        }

        public List<Integer> x() {
            return this.f77504e;
        }

        public List<c> y() {
            return this.f77503d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public o z() {
            return f77500i;
        }

        /* compiled from: JvmProtoBuf.java */
        public static final class c extends h implements kotlin.reflect.jvm.internal.impl.metadata.jvm.e {

            /* renamed from: o, reason: collision with root package name */
            private static final c f77511o;

            /* renamed from: p, reason: collision with root package name */
            public static q<c> f77512p = new C1163a();

            /* renamed from: c, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f77513c;

            /* renamed from: d, reason: collision with root package name */
            private int f77514d;

            /* renamed from: e, reason: collision with root package name */
            private int f77515e;

            /* renamed from: f, reason: collision with root package name */
            private int f77516f;

            /* renamed from: g, reason: collision with root package name */
            private Object f77517g;

            /* renamed from: h, reason: collision with root package name */
            private EnumC1164c f77518h;

            /* renamed from: i, reason: collision with root package name */
            private List<Integer> f77519i;

            /* renamed from: j, reason: collision with root package name */
            private int f77520j;

            /* renamed from: k, reason: collision with root package name */
            private List<Integer> f77521k;

            /* renamed from: l, reason: collision with root package name */
            private int f77522l;

            /* renamed from: m, reason: collision with root package name */
            private byte f77523m;

            /* renamed from: n, reason: collision with root package name */
            private int f77524n;

            /* compiled from: JvmProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e$c$a, reason: collision with other inner class name */
            static class C1163a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
                C1163a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public c c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                    return new c(eVar, fVar);
                }
            }

            /* compiled from: JvmProtoBuf.java */
            public static final class b extends h.b<c, b> implements kotlin.reflect.jvm.internal.impl.metadata.jvm.e {

                /* renamed from: c, reason: collision with root package name */
                private int f77525c;

                /* renamed from: e, reason: collision with root package name */
                private int f77527e;

                /* renamed from: d, reason: collision with root package name */
                private int f77526d = 1;

                /* renamed from: f, reason: collision with root package name */
                private Object f77528f = "";

                /* renamed from: g, reason: collision with root package name */
                private EnumC1164c f77529g = EnumC1164c.NONE;

                /* renamed from: h, reason: collision with root package name */
                private List<Integer> f77530h = Collections.emptyList();

                /* renamed from: i, reason: collision with root package name */
                private List<Integer> f77531i = Collections.emptyList();

                private b() {
                }

                private void A() {
                }

                static b m() {
                    return new b();
                }

                private static b s() {
                    return new b();
                }

                private void u() {
                    if ((this.f77525c & 32) != 32) {
                        this.f77531i = new ArrayList(this.f77531i);
                        this.f77525c |= 32;
                    }
                }

                private void v() {
                    if ((this.f77525c & 16) != 16) {
                        this.f77530h = new ArrayList(this.f77530h);
                        this.f77525c |= 16;
                    }
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: C, reason: merged with bridge method [inline-methods] */
                public b k(c cVar) {
                    if (cVar == c.D()) {
                        return this;
                    }
                    if (cVar.Q()) {
                        G(cVar.H());
                    }
                    if (cVar.P()) {
                        F(cVar.G());
                    }
                    if (cVar.R()) {
                        this.f77525c |= 4;
                        this.f77528f = cVar.f77517g;
                    }
                    if (cVar.O()) {
                        E(cVar.F());
                    }
                    if (!cVar.f77519i.isEmpty()) {
                        if (this.f77530h.isEmpty()) {
                            this.f77530h = cVar.f77519i;
                            this.f77525c &= -17;
                        } else {
                            v();
                            this.f77530h.addAll(cVar.f77519i);
                        }
                    }
                    if (!cVar.f77521k.isEmpty()) {
                        if (this.f77531i.isEmpty()) {
                            this.f77531i = cVar.f77521k;
                            this.f77525c &= -33;
                        } else {
                            u();
                            this.f77531i.addAll(cVar.f77521k);
                        }
                    }
                    l(i().c(cVar.f77513c));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
                /* renamed from: D, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.c.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e$c> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.c.f77512p     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e$c r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        if (r3 == 0) goto Le
                        r2.k(r3)
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
                        r2.k(r0)
                    L20:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.c.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e$c$b");
                }

                public b E(EnumC1164c enumC1164c) {
                    enumC1164c.getClass();
                    this.f77525c |= 8;
                    this.f77529g = enumC1164c;
                    return this;
                }

                public b F(int i4) {
                    this.f77525c |= 2;
                    this.f77527e = i4;
                    return this;
                }

                public b G(int i4) {
                    this.f77525c |= 1;
                    this.f77526d = i4;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: g */
                public c z() {
                    return c.D();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public c a() {
                    c o4 = o();
                    if (o4.p()) {
                        return o4;
                    }
                    throw new UninitializedMessageException(o4);
                }

                public c o() {
                    c cVar = new c(this);
                    int i4 = this.f77525c;
                    int i5 = (i4 & 1) != 1 ? 0 : 1;
                    cVar.f77515e = this.f77526d;
                    if ((i4 & 2) == 2) {
                        i5 |= 2;
                    }
                    cVar.f77516f = this.f77527e;
                    if ((i4 & 4) == 4) {
                        i5 |= 4;
                    }
                    cVar.f77517g = this.f77528f;
                    if ((i4 & 8) == 8) {
                        i5 |= 8;
                    }
                    cVar.f77518h = this.f77529g;
                    if ((this.f77525c & 16) == 16) {
                        this.f77530h = Collections.unmodifiableList(this.f77530h);
                        this.f77525c &= -17;
                    }
                    cVar.f77519i = this.f77530h;
                    if ((this.f77525c & 32) == 32) {
                        this.f77531i = Collections.unmodifiableList(this.f77531i);
                        this.f77525c &= -33;
                    }
                    cVar.f77521k = this.f77531i;
                    cVar.f77514d = i5;
                    return cVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                public final boolean p() {
                    return true;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public b o() {
                    return new b().k(o());
                }

                public c y() {
                    return c.D();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
                public o z() {
                    return c.D();
                }
            }

            /* compiled from: JvmProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e$c$c, reason: collision with other inner class name */
            public enum EnumC1164c implements i.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);

                private static i.b<EnumC1164c> internalValueMap = new C1165a();
                private final int value;

                /* compiled from: JvmProtoBuf.java */
                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.a$e$c$c$a, reason: collision with other inner class name */
                static class C1165a implements i.b<EnumC1164c> {
                    C1165a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                    public EnumC1164c a(int i4) {
                        return EnumC1164c.valueOf(i4);
                    }

                    public EnumC1164c b(int i4) {
                        return EnumC1164c.valueOf(i4);
                    }
                }

                EnumC1164c(int i4, int i5) {
                    this.value = i5;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                public final int getNumber() {
                    return this.value;
                }

                public static EnumC1164c valueOf(int i4) {
                    if (i4 == 0) {
                        return NONE;
                    }
                    if (i4 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i4 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }
            }

            static {
                c cVar = new c(true);
                f77511o = cVar;
                cVar.S();
            }

            private c(h.b bVar) {
                this.f77520j = -1;
                this.f77522l = -1;
                this.f77523m = (byte) -1;
                this.f77524n = -1;
                this.f77513c = bVar.i();
            }

            public static c D() {
                return f77511o;
            }

            private void S() {
                this.f77515e = 1;
                this.f77516f = 0;
                this.f77517g = "";
                this.f77518h = EnumC1164c.NONE;
                this.f77519i = Collections.emptyList();
                this.f77521k = Collections.emptyList();
            }

            public static b T() {
                return b.m();
            }

            public static b U(c cVar) {
                return b.m().k(cVar);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
            public q<c> B() {
                return f77512p;
            }

            public c E() {
                return f77511o;
            }

            public EnumC1164c F() {
                return this.f77518h;
            }

            public int G() {
                return this.f77516f;
            }

            public int H() {
                return this.f77515e;
            }

            public int I() {
                return this.f77521k.size();
            }

            public List<Integer> J() {
                return this.f77521k;
            }

            public String K() {
                Object obj = this.f77517g;
                if (obj instanceof String) {
                    return (String) obj;
                }
                kotlin.reflect.jvm.internal.impl.protobuf.d dVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
                String H = dVar.H();
                if (dVar.r()) {
                    this.f77517g = H;
                }
                return H;
            }

            public kotlin.reflect.jvm.internal.impl.protobuf.d L() {
                Object obj = this.f77517g;
                if (!(obj instanceof String)) {
                    return (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
                }
                kotlin.reflect.jvm.internal.impl.protobuf.d j4 = kotlin.reflect.jvm.internal.impl.protobuf.d.j((String) obj);
                this.f77517g = j4;
                return j4;
            }

            public int M() {
                return this.f77519i.size();
            }

            public List<Integer> N() {
                return this.f77519i;
            }

            public boolean O() {
                return (this.f77514d & 8) == 8;
            }

            public boolean P() {
                return (this.f77514d & 2) == 2;
            }

            public boolean Q() {
                return (this.f77514d & 1) == 1;
            }

            public boolean R() {
                return (this.f77514d & 4) == 4;
            }

            public b V() {
                return b.m();
            }

            public b W() {
                return U(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public void b(CodedOutputStream codedOutputStream) throws IOException {
                t();
                if ((this.f77514d & 1) == 1) {
                    codedOutputStream.a0(1, this.f77515e);
                }
                if ((this.f77514d & 2) == 2) {
                    codedOutputStream.a0(2, this.f77516f);
                }
                if ((this.f77514d & 8) == 8) {
                    codedOutputStream.S(3, this.f77518h.getNumber());
                }
                if (this.f77519i.size() > 0) {
                    codedOutputStream.o0(34);
                    codedOutputStream.o0(this.f77520j);
                }
                for (int i4 = 0; i4 < this.f77519i.size(); i4++) {
                    codedOutputStream.b0(this.f77519i.get(i4).intValue());
                }
                if (this.f77521k.size() > 0) {
                    codedOutputStream.o0(42);
                    codedOutputStream.o0(this.f77522l);
                }
                for (int i5 = 0; i5 < this.f77521k.size(); i5++) {
                    codedOutputStream.b0(this.f77521k.get(i5).intValue());
                }
                if ((this.f77514d & 4) == 4) {
                    codedOutputStream.O(6, L());
                }
                codedOutputStream.i0(this.f77513c);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                byte b5 = this.f77523m;
                if (b5 == 1) {
                    return true;
                }
                if (b5 == 0) {
                    return false;
                }
                this.f77523m = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public o.a q() {
                return U(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public int t() {
                int i4 = this.f77524n;
                if (i4 != -1) {
                    return i4;
                }
                int o4 = (this.f77514d & 1) == 1 ? CodedOutputStream.o(1, this.f77515e) : 0;
                if ((this.f77514d & 2) == 2) {
                    o4 += CodedOutputStream.o(2, this.f77516f);
                }
                if ((this.f77514d & 8) == 8) {
                    o4 += CodedOutputStream.h(3, this.f77518h.getNumber());
                }
                int i5 = 0;
                for (int i6 = 0; i6 < this.f77519i.size(); i6++) {
                    i5 += CodedOutputStream.p(this.f77519i.get(i6).intValue());
                }
                int i7 = o4 + i5;
                if (!this.f77519i.isEmpty()) {
                    i7 = i7 + 1 + CodedOutputStream.p(i5);
                }
                this.f77520j = i5;
                int i10 = 0;
                for (int i11 = 0; i11 < this.f77521k.size(); i11++) {
                    i10 += CodedOutputStream.p(this.f77521k.get(i11).intValue());
                }
                int i12 = i7 + i10;
                if (!this.f77521k.isEmpty()) {
                    i12 = i12 + 1 + CodedOutputStream.p(i10);
                }
                this.f77522l = i10;
                if ((this.f77514d & 4) == 4) {
                    i12 += CodedOutputStream.d(6, L());
                }
                int size = this.f77513c.size() + i12;
                this.f77524n = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public o.a w() {
                return b.m();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public o z() {
                return f77511o;
            }

            private c(boolean z4) {
                this.f77520j = -1;
                this.f77522l = -1;
                this.f77523m = (byte) -1;
                this.f77524n = -1;
                this.f77513c = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
            }

            private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                this.f77520j = -1;
                this.f77522l = -1;
                this.f77523m = (byte) -1;
                this.f77524n = -1;
                S();
                d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
                CodedOutputStream J = CodedOutputStream.J(w4, 1);
                boolean z4 = false;
                int i4 = 0;
                while (!z4) {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K == 8) {
                                    this.f77514d |= 1;
                                    this.f77515e = eVar.A();
                                } else if (K == 16) {
                                    this.f77514d |= 2;
                                    this.f77516f = eVar.A();
                                } else if (K == 24) {
                                    int A = eVar.A();
                                    EnumC1164c valueOf = EnumC1164c.valueOf(A);
                                    if (valueOf == null) {
                                        J.o0(K);
                                        J.o0(A);
                                    } else {
                                        this.f77514d |= 8;
                                        this.f77518h = valueOf;
                                    }
                                } else if (K == 32) {
                                    if ((i4 & 16) != 16) {
                                        this.f77519i = new ArrayList();
                                        i4 |= 16;
                                    }
                                    this.f77519i.add(Integer.valueOf(eVar.A()));
                                } else if (K == 34) {
                                    int j4 = eVar.j(eVar.A());
                                    if ((i4 & 16) != 16 && eVar.e() > 0) {
                                        this.f77519i = new ArrayList();
                                        i4 |= 16;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f77519i.add(Integer.valueOf(eVar.A()));
                                    }
                                    eVar.i(j4);
                                } else if (K == 40) {
                                    if ((i4 & 32) != 32) {
                                        this.f77521k = new ArrayList();
                                        i4 |= 32;
                                    }
                                    this.f77521k.add(Integer.valueOf(eVar.A()));
                                } else if (K == 42) {
                                    int j5 = eVar.j(eVar.A());
                                    if ((i4 & 32) != 32 && eVar.e() > 0) {
                                        this.f77521k = new ArrayList();
                                        i4 |= 32;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f77521k.add(Integer.valueOf(eVar.A()));
                                    }
                                    eVar.i(j5);
                                } else if (K != 50) {
                                    if (!eVar.P(K, J)) {
                                    }
                                } else {
                                    kotlin.reflect.jvm.internal.impl.protobuf.d l4 = eVar.l();
                                    this.f77514d |= 4;
                                    this.f77517g = l4;
                                }
                            }
                            z4 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.i(this);
                        } catch (IOException e5) {
                            throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                        }
                    } catch (Throwable th) {
                        if ((i4 & 16) == 16) {
                            this.f77519i = Collections.unmodifiableList(this.f77519i);
                        }
                        if ((i4 & 32) == 32) {
                            this.f77521k = Collections.unmodifiableList(this.f77521k);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f77513c = w4.e();
                            throw th2;
                        }
                        this.f77513c = w4.e();
                        throw th;
                    }
                }
                if ((i4 & 16) == 16) {
                    this.f77519i = Collections.unmodifiableList(this.f77519i);
                }
                if ((i4 & 32) == 32) {
                    this.f77521k = Collections.unmodifiableList(this.f77521k);
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f77513c = w4.e();
                    throw th3;
                }
                this.f77513c = w4.e();
            }
        }

        private e(boolean z4) {
            this.f77505f = -1;
            this.f77506g = (byte) -1;
            this.f77507h = -1;
            this.f77502c = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private e(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77505f = -1;
            this.f77506g = (byte) -1;
            this.f77507h = -1;
            A();
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z4 = false;
            int i4 = 0;
            while (!z4) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K == 10) {
                                    if ((i4 & 1) != 1) {
                                        this.f77503d = new ArrayList();
                                        i4 |= 1;
                                    }
                                    this.f77503d.add(eVar.u(c.f77512p, fVar));
                                } else if (K == 40) {
                                    if ((i4 & 2) != 2) {
                                        this.f77504e = new ArrayList();
                                        i4 |= 2;
                                    }
                                    this.f77504e.add(Integer.valueOf(eVar.A()));
                                } else if (K != 42) {
                                    if (!eVar.P(K, J)) {
                                    }
                                } else {
                                    int j4 = eVar.j(eVar.A());
                                    if ((i4 & 2) != 2 && eVar.e() > 0) {
                                        this.f77504e = new ArrayList();
                                        i4 |= 2;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f77504e.add(Integer.valueOf(eVar.A()));
                                    }
                                    eVar.i(j4);
                                }
                            }
                            z4 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.i(this);
                        }
                    } catch (IOException e5) {
                        throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if ((i4 & 1) == 1) {
                        this.f77503d = Collections.unmodifiableList(this.f77503d);
                    }
                    if ((i4 & 2) == 2) {
                        this.f77504e = Collections.unmodifiableList(this.f77504e);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f77502c = w4.e();
                        throw th2;
                    }
                    this.f77502c = w4.e();
                    throw th;
                }
            }
            if ((i4 & 1) == 1) {
                this.f77503d = Collections.unmodifiableList(this.f77503d);
            }
            if ((i4 & 2) == 2) {
                this.f77504e = Collections.unmodifiableList(this.f77504e);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77502c = w4.e();
                throw th3;
            }
            this.f77502c = w4.e();
        }
    }
}
