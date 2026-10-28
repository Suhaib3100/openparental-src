package kotlin.reflect.jvm.internal.impl.metadata;

import com.android.internal.telephony.cdma.UserData;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: ProtoBuf.java */
/* loaded from: classes7.dex */
public final class a {

    /* compiled from: ProtoBuf.java */
    public enum j implements i.a {
        DECLARATION(0, 0),
        FAKE_OVERRIDE(1, 1),
        DELEGATION(2, 2),
        SYNTHESIZED(3, 3);

        private static i.b<j> internalValueMap = new C1131a();
        private final int value;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$j$a, reason: collision with other inner class name */
        static class C1131a implements i.b<j> {
            C1131a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            public j a(int i4) {
                return j.valueOf(i4);
            }

            public j b(int i4) {
                return j.valueOf(i4);
            }
        }

        j(int i4, int i5) {
            this.value = i5;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int getNumber() {
            return this.value;
        }

        public static j valueOf(int i4) {
            if (i4 == 0) {
                return DECLARATION;
            }
            if (i4 == 1) {
                return FAKE_OVERRIDE;
            }
            if (i4 == 2) {
                return DELEGATION;
            }
            if (i4 != 3) {
                return null;
            }
            return SYNTHESIZED;
        }
    }

    /* compiled from: ProtoBuf.java */
    public enum k implements i.a {
        FINAL(0, 0),
        OPEN(1, 1),
        ABSTRACT(2, 2),
        SEALED(3, 3);

        private static i.b<k> internalValueMap = new C1132a();
        private final int value;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$k$a, reason: collision with other inner class name */
        static class C1132a implements i.b<k> {
            C1132a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            public k a(int i4) {
                return k.valueOf(i4);
            }

            public k b(int i4) {
                return k.valueOf(i4);
            }
        }

        k(int i4, int i5) {
            this.value = i5;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int getNumber() {
            return this.value;
        }

        public static k valueOf(int i4) {
            if (i4 == 0) {
                return FINAL;
            }
            if (i4 == 1) {
                return OPEN;
            }
            if (i4 == 2) {
                return ABSTRACT;
            }
            if (i4 != 3) {
                return null;
            }
            return SEALED;
        }
    }

    /* compiled from: ProtoBuf.java */
    public enum x implements i.a {
        INTERNAL(0, 0),
        PRIVATE(1, 1),
        PROTECTED(2, 2),
        PUBLIC(3, 3),
        PRIVATE_TO_THIS(4, 4),
        LOCAL(5, 5);

        private static i.b<x> internalValueMap = new C1154a();
        private final int value;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$x$a, reason: collision with other inner class name */
        static class C1154a implements i.b<x> {
            C1154a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            public x a(int i4) {
                return x.valueOf(i4);
            }

            public x b(int i4) {
                return x.valueOf(i4);
            }
        }

        x(int i4, int i5) {
            this.value = i5;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int getNumber() {
            return this.value;
        }

        public static x valueOf(int i4) {
            if (i4 == 0) {
                return INTERNAL;
            }
            if (i4 == 1) {
                return PRIVATE;
            }
            if (i4 == 2) {
                return PROTECTED;
            }
            if (i4 == 3) {
                return PUBLIC;
            }
            if (i4 == 4) {
                return PRIVATE_TO_THIS;
            }
            if (i4 != 5) {
                return null;
            }
            return LOCAL;
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class c extends h.d<c> implements kotlin.reflect.jvm.internal.impl.metadata.e {
        private static final c L;
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<c> M = new C1119a();
        private int A;
        private List<Integer> B;
        private int C;
        private List<q> D;
        private List<Integer> E;
        private int F;
        private t G;
        private List<Integer> H;
        private w I;
        private byte J;
        private int K;

        /* renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77011d;

        /* renamed from: e, reason: collision with root package name */
        private int f77012e;

        /* renamed from: f, reason: collision with root package name */
        private int f77013f;

        /* renamed from: g, reason: collision with root package name */
        private int f77014g;

        /* renamed from: h, reason: collision with root package name */
        private int f77015h;

        /* renamed from: i, reason: collision with root package name */
        private List<s> f77016i;

        /* renamed from: j, reason: collision with root package name */
        private List<q> f77017j;

        /* renamed from: k, reason: collision with root package name */
        private List<Integer> f77018k;

        /* renamed from: l, reason: collision with root package name */
        private int f77019l;

        /* renamed from: m, reason: collision with root package name */
        private List<Integer> f77020m;

        /* renamed from: n, reason: collision with root package name */
        private int f77021n;

        /* renamed from: o, reason: collision with root package name */
        private List<q> f77022o;

        /* renamed from: p, reason: collision with root package name */
        private List<Integer> f77023p;

        /* renamed from: q, reason: collision with root package name */
        private int f77024q;

        /* renamed from: r, reason: collision with root package name */
        private List<d> f77025r;

        /* renamed from: s, reason: collision with root package name */
        private List<i> f77026s;

        /* renamed from: t, reason: collision with root package name */
        private List<n> f77027t;

        /* renamed from: u, reason: collision with root package name */
        private List<r> f77028u;

        /* renamed from: v, reason: collision with root package name */
        private List<g> f77029v;

        /* renamed from: w, reason: collision with root package name */
        private List<Integer> f77030w;

        /* renamed from: x, reason: collision with root package name */
        private int f77031x;

        /* renamed from: y, reason: collision with root package name */
        private int f77032y;

        /* renamed from: z, reason: collision with root package name */
        private q f77033z;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$c$a, reason: collision with other inner class name */
        static class C1119a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
            C1119a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public c c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new c(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<c, b> implements kotlin.reflect.jvm.internal.impl.metadata.e {

            /* renamed from: e, reason: collision with root package name */
            private int f77034e;

            /* renamed from: g, reason: collision with root package name */
            private int f77036g;

            /* renamed from: h, reason: collision with root package name */
            private int f77037h;

            /* renamed from: u, reason: collision with root package name */
            private int f77050u;

            /* renamed from: w, reason: collision with root package name */
            private int f77052w;

            /* renamed from: f, reason: collision with root package name */
            private int f77035f = 6;

            /* renamed from: i, reason: collision with root package name */
            private List<s> f77038i = Collections.emptyList();

            /* renamed from: j, reason: collision with root package name */
            private List<q> f77039j = Collections.emptyList();

            /* renamed from: k, reason: collision with root package name */
            private List<Integer> f77040k = Collections.emptyList();

            /* renamed from: l, reason: collision with root package name */
            private List<Integer> f77041l = Collections.emptyList();

            /* renamed from: m, reason: collision with root package name */
            private List<q> f77042m = Collections.emptyList();

            /* renamed from: n, reason: collision with root package name */
            private List<Integer> f77043n = Collections.emptyList();

            /* renamed from: o, reason: collision with root package name */
            private List<d> f77044o = Collections.emptyList();

            /* renamed from: p, reason: collision with root package name */
            private List<i> f77045p = Collections.emptyList();

            /* renamed from: q, reason: collision with root package name */
            private List<n> f77046q = Collections.emptyList();

            /* renamed from: r, reason: collision with root package name */
            private List<r> f77047r = Collections.emptyList();

            /* renamed from: s, reason: collision with root package name */
            private List<g> f77048s = Collections.emptyList();

            /* renamed from: t, reason: collision with root package name */
            private List<Integer> f77049t = Collections.emptyList();

            /* renamed from: v, reason: collision with root package name */
            private q f77051v = q.Y();

            /* renamed from: x, reason: collision with root package name */
            private List<Integer> f77053x = Collections.emptyList();

            /* renamed from: y, reason: collision with root package name */
            private List<q> f77054y = Collections.emptyList();

            /* renamed from: z, reason: collision with root package name */
            private List<Integer> f77055z = Collections.emptyList();
            private t A = t.u();
            private List<Integer> B = Collections.emptyList();
            private w C = w.r();

            private b() {
            }

            private static b D() {
                return new b();
            }

            private void E() {
                if ((this.f77034e & 512) != 512) {
                    this.f77044o = new ArrayList(this.f77044o);
                    this.f77034e |= 512;
                }
            }

            private void F() {
                if ((this.f77034e & 256) != 256) {
                    this.f77043n = new ArrayList(this.f77043n);
                    this.f77034e |= 256;
                }
            }

            private void G() {
                if ((this.f77034e & 128) != 128) {
                    this.f77042m = new ArrayList(this.f77042m);
                    this.f77034e |= 128;
                }
            }

            private void H() {
                if ((this.f77034e & 8192) != 8192) {
                    this.f77048s = new ArrayList(this.f77048s);
                    this.f77034e |= 8192;
                }
            }

            private void I() {
                if ((this.f77034e & 1024) != 1024) {
                    this.f77045p = new ArrayList(this.f77045p);
                    this.f77034e |= 1024;
                }
            }

            private void J() {
                if ((this.f77034e & 262144) != 262144) {
                    this.f77053x = new ArrayList(this.f77053x);
                    this.f77034e |= 262144;
                }
            }

            private void K() {
                if ((this.f77034e & 1048576) != 1048576) {
                    this.f77055z = new ArrayList(this.f77055z);
                    this.f77034e |= 1048576;
                }
            }

            private void M() {
                if ((this.f77034e & 524288) != 524288) {
                    this.f77054y = new ArrayList(this.f77054y);
                    this.f77034e |= 524288;
                }
            }

            private void N() {
                if ((this.f77034e & 64) != 64) {
                    this.f77041l = new ArrayList(this.f77041l);
                    this.f77034e |= 64;
                }
            }

            private void O() {
                if ((this.f77034e & 2048) != 2048) {
                    this.f77046q = new ArrayList(this.f77046q);
                    this.f77034e |= 2048;
                }
            }

            private void P() {
                if ((this.f77034e & 16384) != 16384) {
                    this.f77049t = new ArrayList(this.f77049t);
                    this.f77034e |= 16384;
                }
            }

            private void R() {
                if ((this.f77034e & 32) != 32) {
                    this.f77040k = new ArrayList(this.f77040k);
                    this.f77034e |= 32;
                }
            }

            private void S() {
                if ((this.f77034e & 16) != 16) {
                    this.f77039j = new ArrayList(this.f77039j);
                    this.f77034e |= 16;
                }
            }

            private void T() {
                if ((this.f77034e & 4096) != 4096) {
                    this.f77047r = new ArrayList(this.f77047r);
                    this.f77034e |= 4096;
                }
            }

            private void U() {
                if ((this.f77034e & 8) != 8) {
                    this.f77038i = new ArrayList(this.f77038i);
                    this.f77034e |= 8;
                }
            }

            private void V() {
                if ((this.f77034e & 4194304) != 4194304) {
                    this.B = new ArrayList(this.B);
                    this.f77034e |= 4194304;
                }
            }

            static b v() {
                return new b();
            }

            private void y0() {
            }

            public c A() {
                c cVar = new c(this);
                int i4 = this.f77034e;
                int i5 = (i4 & 1) != 1 ? 0 : 1;
                cVar.f77013f = this.f77035f;
                if ((i4 & 2) == 2) {
                    i5 |= 2;
                }
                cVar.f77014g = this.f77036g;
                if ((i4 & 4) == 4) {
                    i5 |= 4;
                }
                cVar.f77015h = this.f77037h;
                if ((this.f77034e & 8) == 8) {
                    this.f77038i = Collections.unmodifiableList(this.f77038i);
                    this.f77034e &= -9;
                }
                cVar.f77016i = this.f77038i;
                if ((this.f77034e & 16) == 16) {
                    this.f77039j = Collections.unmodifiableList(this.f77039j);
                    this.f77034e &= -17;
                }
                cVar.f77017j = this.f77039j;
                if ((this.f77034e & 32) == 32) {
                    this.f77040k = Collections.unmodifiableList(this.f77040k);
                    this.f77034e &= -33;
                }
                cVar.f77018k = this.f77040k;
                if ((this.f77034e & 64) == 64) {
                    this.f77041l = Collections.unmodifiableList(this.f77041l);
                    this.f77034e &= -65;
                }
                cVar.f77020m = this.f77041l;
                if ((this.f77034e & 128) == 128) {
                    this.f77042m = Collections.unmodifiableList(this.f77042m);
                    this.f77034e &= -129;
                }
                cVar.f77022o = this.f77042m;
                if ((this.f77034e & 256) == 256) {
                    this.f77043n = Collections.unmodifiableList(this.f77043n);
                    this.f77034e &= -257;
                }
                cVar.f77023p = this.f77043n;
                if ((this.f77034e & 512) == 512) {
                    this.f77044o = Collections.unmodifiableList(this.f77044o);
                    this.f77034e &= -513;
                }
                cVar.f77025r = this.f77044o;
                if ((this.f77034e & 1024) == 1024) {
                    this.f77045p = Collections.unmodifiableList(this.f77045p);
                    this.f77034e &= -1025;
                }
                cVar.f77026s = this.f77045p;
                if ((this.f77034e & 2048) == 2048) {
                    this.f77046q = Collections.unmodifiableList(this.f77046q);
                    this.f77034e &= -2049;
                }
                cVar.f77027t = this.f77046q;
                if ((this.f77034e & 4096) == 4096) {
                    this.f77047r = Collections.unmodifiableList(this.f77047r);
                    this.f77034e &= -4097;
                }
                cVar.f77028u = this.f77047r;
                if ((this.f77034e & 8192) == 8192) {
                    this.f77048s = Collections.unmodifiableList(this.f77048s);
                    this.f77034e &= -8193;
                }
                cVar.f77029v = this.f77048s;
                if ((this.f77034e & 16384) == 16384) {
                    this.f77049t = Collections.unmodifiableList(this.f77049t);
                    this.f77034e &= -16385;
                }
                cVar.f77030w = this.f77049t;
                if ((i4 & 32768) == 32768) {
                    i5 |= 8;
                }
                cVar.f77032y = this.f77050u;
                if ((i4 & 65536) == 65536) {
                    i5 |= 16;
                }
                cVar.f77033z = this.f77051v;
                if ((i4 & 131072) == 131072) {
                    i5 |= 32;
                }
                cVar.A = this.f77052w;
                if ((this.f77034e & 262144) == 262144) {
                    this.f77053x = Collections.unmodifiableList(this.f77053x);
                    this.f77034e &= -262145;
                }
                cVar.B = this.f77053x;
                if ((this.f77034e & 524288) == 524288) {
                    this.f77054y = Collections.unmodifiableList(this.f77054y);
                    this.f77034e &= -524289;
                }
                cVar.D = this.f77054y;
                if ((this.f77034e & 1048576) == 1048576) {
                    this.f77055z = Collections.unmodifiableList(this.f77055z);
                    this.f77034e &= -1048577;
                }
                cVar.E = this.f77055z;
                if ((i4 & 2097152) == 2097152) {
                    i5 |= 64;
                }
                cVar.G = this.A;
                if ((this.f77034e & 4194304) == 4194304) {
                    this.B = Collections.unmodifiableList(this.B);
                    this.f77034e &= -4194305;
                }
                cVar.H = this.B;
                if ((i4 & 8388608) == 8388608) {
                    i5 |= 128;
                }
                cVar.I = this.C;
                cVar.f77012e = i5;
                return cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: A0, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.c.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$c> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.c.M     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$c r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$c r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.c.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$c$b");
            }

            public b B0(q qVar) {
                if ((this.f77034e & 65536) != 65536 || this.f77051v == q.Y()) {
                    this.f77051v = qVar;
                } else {
                    this.f77051v = q.A0(this.f77051v).k(qVar).A();
                }
                this.f77034e |= 65536;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public b o() {
                return new b().k(A());
            }

            public b C0(t tVar) {
                if ((this.f77034e & 2097152) != 2097152 || this.A == t.u()) {
                    this.A = tVar;
                } else {
                    this.A = t.G(this.A).k(tVar).o();
                }
                this.f77034e |= 2097152;
                return this;
            }

            public b D0(w wVar) {
                if ((this.f77034e & 8388608) != 8388608 || this.C == w.r()) {
                    this.C = wVar;
                } else {
                    this.C = w.A(this.C).k(wVar).o();
                }
                this.f77034e |= 8388608;
                return this;
            }

            public b E0(int i4) {
                this.f77034e |= 4;
                this.f77037h = i4;
                return this;
            }

            public b F0(int i4) {
                this.f77034e |= 1;
                this.f77035f = i4;
                return this;
            }

            public b G0(int i4) {
                this.f77034e |= 2;
                this.f77036g = i4;
                return this;
            }

            public b H0(int i4) {
                this.f77034e |= 32768;
                this.f77050u = i4;
                return this;
            }

            public b I0(int i4) {
                this.f77034e |= 131072;
                this.f77052w = i4;
                return this;
            }

            public d W(int i4) {
                return this.f77044o.get(i4);
            }

            public int Y() {
                return this.f77044o.size();
            }

            public q Z(int i4) {
                return this.f77042m.get(i4);
            }

            public int a0() {
                return this.f77042m.size();
            }

            public c b0() {
                return c.A0();
            }

            public g c0(int i4) {
                return this.f77048s.get(i4);
            }

            public int d0() {
                return this.f77048s.size();
            }

            public i e0(int i4) {
                return this.f77045p.get(i4);
            }

            public int f0() {
                return this.f77045p.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public kotlin.reflect.jvm.internal.impl.protobuf.h z() {
                return c.A0();
            }

            public q g0() {
                return this.f77051v;
            }

            public q h0(int i4) {
                return this.f77054y.get(i4);
            }

            public int i0() {
                return this.f77054y.size();
            }

            public n k0(int i4) {
                return this.f77046q.get(i4);
            }

            public int l0() {
                return this.f77046q.size();
            }

            public q m0(int i4) {
                return this.f77039j.get(i4);
            }

            public int o0() {
                return this.f77039j.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                if (!v0()) {
                    return false;
                }
                for (int i4 = 0; i4 < this.f77038i.size(); i4++) {
                    if (!s0(i4).p()) {
                        return false;
                    }
                }
                for (int i5 = 0; i5 < this.f77039j.size(); i5++) {
                    if (!m0(i5).p()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < this.f77042m.size(); i6++) {
                    if (!Z(i6).p()) {
                        return false;
                    }
                }
                for (int i7 = 0; i7 < this.f77044o.size(); i7++) {
                    if (!W(i7).p()) {
                        return false;
                    }
                }
                for (int i10 = 0; i10 < this.f77045p.size(); i10++) {
                    if (!e0(i10).p()) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < this.f77046q.size(); i11++) {
                    if (!k0(i11).p()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < this.f77047r.size(); i12++) {
                    if (!p0(i12).p()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < this.f77048s.size(); i13++) {
                    if (!c0(i13).p()) {
                        return false;
                    }
                }
                if (w0() && !this.f77051v.p()) {
                    return false;
                }
                for (int i14 = 0; i14 < this.f77054y.size(); i14++) {
                    if (!h0(i14).p()) {
                        return false;
                    }
                }
                return (!x0() || this.A.p()) && s();
            }

            public r p0(int i4) {
                return this.f77047r.get(i4);
            }

            public int q0() {
                return this.f77047r.size();
            }

            public s s0(int i4) {
                return this.f77038i.get(i4);
            }

            public int t0() {
                return this.f77038i.size();
            }

            public t u0() {
                return this.A;
            }

            public boolean v0() {
                return (this.f77034e & 2) == 2;
            }

            public boolean w0() {
                return (this.f77034e & 65536) == 65536;
            }

            public boolean x0() {
                return (this.f77034e & 2097152) == 2097152;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public c a() {
                c A = A();
                if (A.p()) {
                    return A;
                }
                throw new UninitializedMessageException(A);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return c.A0();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: z0, reason: merged with bridge method [inline-methods] */
            public b k(c cVar) {
                if (cVar == c.A0()) {
                    return this;
                }
                if (cVar.n1()) {
                    F0(cVar.F0());
                }
                if (cVar.o1()) {
                    G0(cVar.G0());
                }
                if (cVar.m1()) {
                    E0(cVar.s0());
                }
                if (!cVar.f77016i.isEmpty()) {
                    if (this.f77038i.isEmpty()) {
                        this.f77038i = cVar.f77016i;
                        this.f77034e &= -9;
                    } else {
                        U();
                        this.f77038i.addAll(cVar.f77016i);
                    }
                }
                if (!cVar.f77017j.isEmpty()) {
                    if (this.f77039j.isEmpty()) {
                        this.f77039j = cVar.f77017j;
                        this.f77034e &= -17;
                    } else {
                        S();
                        this.f77039j.addAll(cVar.f77017j);
                    }
                }
                if (!cVar.f77018k.isEmpty()) {
                    if (this.f77040k.isEmpty()) {
                        this.f77040k = cVar.f77018k;
                        this.f77034e &= -33;
                    } else {
                        R();
                        this.f77040k.addAll(cVar.f77018k);
                    }
                }
                if (!cVar.f77020m.isEmpty()) {
                    if (this.f77041l.isEmpty()) {
                        this.f77041l = cVar.f77020m;
                        this.f77034e &= -65;
                    } else {
                        N();
                        this.f77041l.addAll(cVar.f77020m);
                    }
                }
                if (!cVar.f77022o.isEmpty()) {
                    if (this.f77042m.isEmpty()) {
                        this.f77042m = cVar.f77022o;
                        this.f77034e &= -129;
                    } else {
                        G();
                        this.f77042m.addAll(cVar.f77022o);
                    }
                }
                if (!cVar.f77023p.isEmpty()) {
                    if (this.f77043n.isEmpty()) {
                        this.f77043n = cVar.f77023p;
                        this.f77034e &= -257;
                    } else {
                        F();
                        this.f77043n.addAll(cVar.f77023p);
                    }
                }
                if (!cVar.f77025r.isEmpty()) {
                    if (this.f77044o.isEmpty()) {
                        this.f77044o = cVar.f77025r;
                        this.f77034e &= -513;
                    } else {
                        E();
                        this.f77044o.addAll(cVar.f77025r);
                    }
                }
                if (!cVar.f77026s.isEmpty()) {
                    if (this.f77045p.isEmpty()) {
                        this.f77045p = cVar.f77026s;
                        this.f77034e &= -1025;
                    } else {
                        I();
                        this.f77045p.addAll(cVar.f77026s);
                    }
                }
                if (!cVar.f77027t.isEmpty()) {
                    if (this.f77046q.isEmpty()) {
                        this.f77046q = cVar.f77027t;
                        this.f77034e &= -2049;
                    } else {
                        O();
                        this.f77046q.addAll(cVar.f77027t);
                    }
                }
                if (!cVar.f77028u.isEmpty()) {
                    if (this.f77047r.isEmpty()) {
                        this.f77047r = cVar.f77028u;
                        this.f77034e &= -4097;
                    } else {
                        T();
                        this.f77047r.addAll(cVar.f77028u);
                    }
                }
                if (!cVar.f77029v.isEmpty()) {
                    if (this.f77048s.isEmpty()) {
                        this.f77048s = cVar.f77029v;
                        this.f77034e &= -8193;
                    } else {
                        H();
                        this.f77048s.addAll(cVar.f77029v);
                    }
                }
                if (!cVar.f77030w.isEmpty()) {
                    if (this.f77049t.isEmpty()) {
                        this.f77049t = cVar.f77030w;
                        this.f77034e &= -16385;
                    } else {
                        P();
                        this.f77049t.addAll(cVar.f77030w);
                    }
                }
                if (cVar.p1()) {
                    H0(cVar.K0());
                }
                if (cVar.q1()) {
                    B0(cVar.L0());
                }
                if (cVar.r1()) {
                    I0(cVar.M0());
                }
                if (!cVar.B.isEmpty()) {
                    if (this.f77053x.isEmpty()) {
                        this.f77053x = cVar.B;
                        this.f77034e &= -262145;
                    } else {
                        J();
                        this.f77053x.addAll(cVar.B);
                    }
                }
                if (!cVar.D.isEmpty()) {
                    if (this.f77054y.isEmpty()) {
                        this.f77054y = cVar.D;
                        this.f77034e &= -524289;
                    } else {
                        M();
                        this.f77054y.addAll(cVar.D);
                    }
                }
                if (!cVar.E.isEmpty()) {
                    if (this.f77055z.isEmpty()) {
                        this.f77055z = cVar.E;
                        this.f77034e &= -1048577;
                    } else {
                        K();
                        this.f77055z.addAll(cVar.E);
                    }
                }
                if (cVar.s1()) {
                    C0(cVar.j1());
                }
                if (!cVar.H.isEmpty()) {
                    if (this.B.isEmpty()) {
                        this.B = cVar.H;
                        this.f77034e &= -4194305;
                    } else {
                        V();
                        this.B.addAll(cVar.H);
                    }
                }
                if (cVar.t1()) {
                    D0(cVar.l1());
                }
                u(cVar);
                l(i().c(cVar.f77011d));
                return this;
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$c$c, reason: collision with other inner class name */
        public enum EnumC1120c implements i.a {
            CLASS(0, 0),
            INTERFACE(1, 1),
            ENUM_CLASS(2, 2),
            ENUM_ENTRY(3, 3),
            ANNOTATION_CLASS(4, 4),
            OBJECT(5, 5),
            COMPANION_OBJECT(6, 6);

            private static i.b<EnumC1120c> internalValueMap = new C1121a();
            private final int value;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$c$c$a, reason: collision with other inner class name */
            static class C1121a implements i.b<EnumC1120c> {
                C1121a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                public EnumC1120c a(int i4) {
                    return EnumC1120c.valueOf(i4);
                }

                public EnumC1120c b(int i4) {
                    return EnumC1120c.valueOf(i4);
                }
            }

            EnumC1120c(int i4, int i5) {
                this.value = i5;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.value;
            }

            public static EnumC1120c valueOf(int i4) {
                switch (i4) {
                    case 0:
                        return CLASS;
                    case 1:
                        return INTERFACE;
                    case 2:
                        return ENUM_CLASS;
                    case 3:
                        return ENUM_ENTRY;
                    case 4:
                        return ANNOTATION_CLASS;
                    case 5:
                        return OBJECT;
                    case 6:
                        return COMPANION_OBJECT;
                    default:
                        return null;
                }
            }
        }

        static {
            c cVar = new c(true);
            L = cVar;
            cVar.u1();
        }

        public static c A0() {
            return L;
        }

        private void u1() {
            this.f77013f = 6;
            this.f77014g = 0;
            this.f77015h = 0;
            this.f77016i = Collections.emptyList();
            this.f77017j = Collections.emptyList();
            this.f77018k = Collections.emptyList();
            this.f77020m = Collections.emptyList();
            this.f77022o = Collections.emptyList();
            this.f77023p = Collections.emptyList();
            this.f77025r = Collections.emptyList();
            this.f77026s = Collections.emptyList();
            this.f77027t = Collections.emptyList();
            this.f77028u = Collections.emptyList();
            this.f77029v = Collections.emptyList();
            this.f77030w = Collections.emptyList();
            this.f77032y = 0;
            this.f77033z = q.Y();
            this.A = 0;
            this.B = Collections.emptyList();
            this.D = Collections.emptyList();
            this.E = Collections.emptyList();
            this.G = t.u();
            this.H = Collections.emptyList();
            this.I = w.r();
        }

        public static b v1() {
            return b.v();
        }

        public static b w1(c cVar) {
            return b.v().k(cVar);
        }

        public static c y1(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws IOException {
            return M.a(inputStream, fVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<c> B() {
            return M;
        }

        public c B0() {
            return L;
        }

        public g C0(int i4) {
            return this.f77029v.get(i4);
        }

        public int D0() {
            return this.f77029v.size();
        }

        public List<g> E0() {
            return this.f77029v;
        }

        public int F0() {
            return this.f77013f;
        }

        public int G0() {
            return this.f77014g;
        }

        public i H0(int i4) {
            return this.f77026s.get(i4);
        }

        public int I0() {
            return this.f77026s.size();
        }

        public List<i> J0() {
            return this.f77026s;
        }

        public int K0() {
            return this.f77032y;
        }

        public q L0() {
            return this.f77033z;
        }

        public int M0() {
            return this.A;
        }

        public int N0() {
            return this.B.size();
        }

        public List<Integer> O0() {
            return this.B;
        }

        public q P0(int i4) {
            return this.D.get(i4);
        }

        public int Q0() {
            return this.D.size();
        }

        public int R0() {
            return this.E.size();
        }

        public List<Integer> S0() {
            return this.E;
        }

        public List<q> T0() {
            return this.D;
        }

        public List<Integer> U0() {
            return this.f77020m;
        }

        public n V0(int i4) {
            return this.f77027t.get(i4);
        }

        public int W0() {
            return this.f77027t.size();
        }

        public List<n> X0() {
            return this.f77027t;
        }

        public List<Integer> Y0() {
            return this.f77030w;
        }

        public q Z0(int i4) {
            return this.f77017j.get(i4);
        }

        public int a1() {
            return this.f77017j.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            h.d<MessageType>.a x4 = x();
            if ((this.f77012e & 1) == 1) {
                codedOutputStream.a0(1, this.f77013f);
            }
            if (this.f77018k.size() > 0) {
                codedOutputStream.o0(18);
                codedOutputStream.o0(this.f77019l);
            }
            for (int i4 = 0; i4 < this.f77018k.size(); i4++) {
                codedOutputStream.b0(this.f77018k.get(i4).intValue());
            }
            if ((this.f77012e & 2) == 2) {
                codedOutputStream.a0(3, this.f77014g);
            }
            if ((this.f77012e & 4) == 4) {
                codedOutputStream.a0(4, this.f77015h);
            }
            for (int i5 = 0; i5 < this.f77016i.size(); i5++) {
                codedOutputStream.d0(5, this.f77016i.get(i5));
            }
            for (int i6 = 0; i6 < this.f77017j.size(); i6++) {
                codedOutputStream.d0(6, this.f77017j.get(i6));
            }
            if (this.f77020m.size() > 0) {
                codedOutputStream.o0(58);
                codedOutputStream.o0(this.f77021n);
            }
            for (int i7 = 0; i7 < this.f77020m.size(); i7++) {
                codedOutputStream.b0(this.f77020m.get(i7).intValue());
            }
            for (int i10 = 0; i10 < this.f77025r.size(); i10++) {
                codedOutputStream.d0(8, this.f77025r.get(i10));
            }
            for (int i11 = 0; i11 < this.f77026s.size(); i11++) {
                codedOutputStream.d0(9, this.f77026s.get(i11));
            }
            for (int i12 = 0; i12 < this.f77027t.size(); i12++) {
                codedOutputStream.d0(10, this.f77027t.get(i12));
            }
            for (int i13 = 0; i13 < this.f77028u.size(); i13++) {
                codedOutputStream.d0(11, this.f77028u.get(i13));
            }
            for (int i14 = 0; i14 < this.f77029v.size(); i14++) {
                codedOutputStream.d0(13, this.f77029v.get(i14));
            }
            if (this.f77030w.size() > 0) {
                codedOutputStream.o0(UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS);
                codedOutputStream.o0(this.f77031x);
            }
            for (int i15 = 0; i15 < this.f77030w.size(); i15++) {
                codedOutputStream.b0(this.f77030w.get(i15).intValue());
            }
            if ((this.f77012e & 8) == 8) {
                codedOutputStream.a0(17, this.f77032y);
            }
            if ((this.f77012e & 16) == 16) {
                codedOutputStream.d0(18, this.f77033z);
            }
            if ((this.f77012e & 32) == 32) {
                codedOutputStream.a0(19, this.A);
            }
            for (int i16 = 0; i16 < this.f77022o.size(); i16++) {
                codedOutputStream.d0(20, this.f77022o.get(i16));
            }
            if (this.f77023p.size() > 0) {
                codedOutputStream.o0(170);
                codedOutputStream.o0(this.f77024q);
            }
            for (int i17 = 0; i17 < this.f77023p.size(); i17++) {
                codedOutputStream.b0(this.f77023p.get(i17).intValue());
            }
            if (this.B.size() > 0) {
                codedOutputStream.o0(178);
                codedOutputStream.o0(this.C);
            }
            for (int i18 = 0; i18 < this.B.size(); i18++) {
                codedOutputStream.b0(this.B.get(i18).intValue());
            }
            for (int i19 = 0; i19 < this.D.size(); i19++) {
                codedOutputStream.d0(23, this.D.get(i19));
            }
            if (this.E.size() > 0) {
                codedOutputStream.o0(194);
                codedOutputStream.o0(this.F);
            }
            for (int i20 = 0; i20 < this.E.size(); i20++) {
                codedOutputStream.b0(this.E.get(i20).intValue());
            }
            if ((this.f77012e & 64) == 64) {
                codedOutputStream.d0(30, this.G);
            }
            for (int i21 = 0; i21 < this.H.size(); i21++) {
                codedOutputStream.a0(31, this.H.get(i21).intValue());
            }
            if ((this.f77012e & 128) == 128) {
                codedOutputStream.d0(32, this.I);
            }
            x4.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f77011d);
        }

        public List<Integer> b1() {
            return this.f77018k;
        }

        public List<q> c1() {
            return this.f77017j;
        }

        public r d1(int i4) {
            return this.f77028u.get(i4);
        }

        public int e1() {
            return this.f77028u.size();
        }

        public List<r> f1() {
            return this.f77028u;
        }

        public s g1(int i4) {
            return this.f77016i.get(i4);
        }

        public int h1() {
            return this.f77016i.size();
        }

        public List<s> i1() {
            return this.f77016i;
        }

        public t j1() {
            return this.G;
        }

        public List<Integer> k1() {
            return this.H;
        }

        public w l1() {
            return this.I;
        }

        public boolean m1() {
            return (this.f77012e & 4) == 4;
        }

        public boolean n1() {
            return (this.f77012e & 1) == 1;
        }

        public boolean o1() {
            return (this.f77012e & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.J;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            if (!o1()) {
                this.J = (byte) 0;
                return false;
            }
            for (int i4 = 0; i4 < this.f77016i.size(); i4++) {
                if (!g1(i4).p()) {
                    this.J = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < this.f77017j.size(); i5++) {
                if (!Z0(i5).p()) {
                    this.J = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < this.f77022o.size(); i6++) {
                if (!w0(i6).p()) {
                    this.J = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < this.f77025r.size(); i7++) {
                if (!t0(i7).p()) {
                    this.J = (byte) 0;
                    return false;
                }
            }
            for (int i10 = 0; i10 < this.f77026s.size(); i10++) {
                if (!H0(i10).p()) {
                    this.J = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < this.f77027t.size(); i11++) {
                if (!V0(i11).p()) {
                    this.J = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < this.f77028u.size(); i12++) {
                if (!d1(i12).p()) {
                    this.J = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < this.f77029v.size(); i13++) {
                if (!C0(i13).p()) {
                    this.J = (byte) 0;
                    return false;
                }
            }
            if (q1() && !this.f77033z.p()) {
                this.J = (byte) 0;
                return false;
            }
            for (int i14 = 0; i14 < this.D.size(); i14++) {
                if (!P0(i14).p()) {
                    this.J = (byte) 0;
                    return false;
                }
            }
            if (s1() && !this.G.p()) {
                this.J = (byte) 0;
                return false;
            }
            if (n()) {
                this.J = (byte) 1;
                return true;
            }
            this.J = (byte) 0;
            return false;
        }

        public boolean p1() {
            return (this.f77012e & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return w1(this);
        }

        public boolean q1() {
            return (this.f77012e & 16) == 16;
        }

        public boolean r1() {
            return (this.f77012e & 32) == 32;
        }

        public int s0() {
            return this.f77015h;
        }

        public boolean s1() {
            return (this.f77012e & 64) == 64;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.K;
            if (i4 != -1) {
                return i4;
            }
            int o4 = (this.f77012e & 1) == 1 ? CodedOutputStream.o(1, this.f77013f) : 0;
            int i5 = 0;
            for (int i6 = 0; i6 < this.f77018k.size(); i6++) {
                i5 += CodedOutputStream.p(this.f77018k.get(i6).intValue());
            }
            int i7 = o4 + i5;
            if (!this.f77018k.isEmpty()) {
                i7 = i7 + 1 + CodedOutputStream.p(i5);
            }
            this.f77019l = i5;
            if ((this.f77012e & 2) == 2) {
                i7 += CodedOutputStream.o(3, this.f77014g);
            }
            if ((this.f77012e & 4) == 4) {
                i7 += CodedOutputStream.o(4, this.f77015h);
            }
            for (int i10 = 0; i10 < this.f77016i.size(); i10++) {
                i7 += CodedOutputStream.s(5, this.f77016i.get(i10));
            }
            for (int i11 = 0; i11 < this.f77017j.size(); i11++) {
                i7 += CodedOutputStream.s(6, this.f77017j.get(i11));
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.f77020m.size(); i13++) {
                i12 += CodedOutputStream.p(this.f77020m.get(i13).intValue());
            }
            int i14 = i7 + i12;
            if (!this.f77020m.isEmpty()) {
                i14 = i14 + 1 + CodedOutputStream.p(i12);
            }
            this.f77021n = i12;
            for (int i15 = 0; i15 < this.f77025r.size(); i15++) {
                i14 += CodedOutputStream.s(8, this.f77025r.get(i15));
            }
            for (int i16 = 0; i16 < this.f77026s.size(); i16++) {
                i14 += CodedOutputStream.s(9, this.f77026s.get(i16));
            }
            for (int i17 = 0; i17 < this.f77027t.size(); i17++) {
                i14 += CodedOutputStream.s(10, this.f77027t.get(i17));
            }
            for (int i18 = 0; i18 < this.f77028u.size(); i18++) {
                i14 += CodedOutputStream.s(11, this.f77028u.get(i18));
            }
            for (int i19 = 0; i19 < this.f77029v.size(); i19++) {
                i14 += CodedOutputStream.s(13, this.f77029v.get(i19));
            }
            int i20 = 0;
            for (int i21 = 0; i21 < this.f77030w.size(); i21++) {
                i20 += CodedOutputStream.p(this.f77030w.get(i21).intValue());
            }
            int i22 = i14 + i20;
            if (!this.f77030w.isEmpty()) {
                i22 = i22 + 2 + CodedOutputStream.p(i20);
            }
            this.f77031x = i20;
            if ((this.f77012e & 8) == 8) {
                i22 += CodedOutputStream.o(17, this.f77032y);
            }
            if ((this.f77012e & 16) == 16) {
                i22 += CodedOutputStream.s(18, this.f77033z);
            }
            if ((this.f77012e & 32) == 32) {
                i22 += CodedOutputStream.o(19, this.A);
            }
            for (int i23 = 0; i23 < this.f77022o.size(); i23++) {
                i22 += CodedOutputStream.s(20, this.f77022o.get(i23));
            }
            int i24 = 0;
            for (int i25 = 0; i25 < this.f77023p.size(); i25++) {
                i24 += CodedOutputStream.p(this.f77023p.get(i25).intValue());
            }
            int i26 = i22 + i24;
            if (!this.f77023p.isEmpty()) {
                i26 = i26 + 2 + CodedOutputStream.p(i24);
            }
            this.f77024q = i24;
            int i27 = 0;
            for (int i28 = 0; i28 < this.B.size(); i28++) {
                i27 += CodedOutputStream.p(this.B.get(i28).intValue());
            }
            int i29 = i26 + i27;
            if (!this.B.isEmpty()) {
                i29 = i29 + 2 + CodedOutputStream.p(i27);
            }
            this.C = i27;
            for (int i30 = 0; i30 < this.D.size(); i30++) {
                i29 += CodedOutputStream.s(23, this.D.get(i30));
            }
            int i31 = 0;
            for (int i32 = 0; i32 < this.E.size(); i32++) {
                i31 += CodedOutputStream.p(this.E.get(i32).intValue());
            }
            int i33 = i29 + i31;
            if (!this.E.isEmpty()) {
                i33 = i33 + 2 + CodedOutputStream.p(i31);
            }
            this.F = i31;
            if ((this.f77012e & 64) == 64) {
                i33 += CodedOutputStream.s(30, this.G);
            }
            int i34 = 0;
            for (int i35 = 0; i35 < this.H.size(); i35++) {
                i34 += CodedOutputStream.p(this.H.get(i35).intValue());
            }
            int a5 = androidx.content.preferences.protobuf.n.a(this.H, 2, i33 + i34);
            if ((this.f77012e & 128) == 128) {
                a5 += CodedOutputStream.s(32, this.I);
            }
            int size = this.f77011d.size() + a5 + o();
            this.K = size;
            return size;
        }

        public d t0(int i4) {
            return this.f77025r.get(i4);
        }

        public boolean t1() {
            return (this.f77012e & 128) == 128;
        }

        public int u0() {
            return this.f77025r.size();
        }

        public List<d> v0() {
            return this.f77025r;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.v();
        }

        public q w0(int i4) {
            return this.f77022o.get(i4);
        }

        public int x0() {
            return this.f77022o.size();
        }

        public b x1() {
            return b.v();
        }

        public List<Integer> y0() {
            return this.f77023p;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return L;
        }

        public List<q> z0() {
            return this.f77022o;
        }

        public b z1() {
            return w1(this);
        }

        private c(h.c<c, ?> cVar) {
            super(cVar);
            this.f77019l = -1;
            this.f77021n = -1;
            this.f77024q = -1;
            this.f77031x = -1;
            this.C = -1;
            this.F = -1;
            this.J = (byte) -1;
            this.K = -1;
            this.f77011d = cVar.i();
        }

        private c(boolean z4) {
            this.f77019l = -1;
            this.f77021n = -1;
            this.f77024q = -1;
            this.f77031x = -1;
            this.C = -1;
            this.F = -1;
            this.J = (byte) -1;
            this.K = -1;
            this.f77011d = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v13 */
        /* JADX WARN: Type inference failed for: r8v15 */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v19 */
        /* JADX WARN: Type inference failed for: r8v21 */
        /* JADX WARN: Type inference failed for: r8v23 */
        /* JADX WARN: Type inference failed for: r8v25 */
        /* JADX WARN: Type inference failed for: r8v27 */
        /* JADX WARN: Type inference failed for: r8v29 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v31 */
        /* JADX WARN: Type inference failed for: r8v33 */
        /* JADX WARN: Type inference failed for: r8v35 */
        /* JADX WARN: Type inference failed for: r8v37 */
        /* JADX WARN: Type inference failed for: r8v39 */
        /* JADX WARN: Type inference failed for: r8v41 */
        /* JADX WARN: Type inference failed for: r8v43 */
        /* JADX WARN: Type inference failed for: r8v45 */
        /* JADX WARN: Type inference failed for: r8v47 */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v9 */
        private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            boolean z4;
            this.f77019l = -1;
            this.f77021n = -1;
            this.f77024q = -1;
            this.f77031x = -1;
            this.C = -1;
            this.F = -1;
            this.J = (byte) -1;
            this.K = -1;
            u1();
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z5 = false;
            char c5 = 0;
            while (!z5) {
                try {
                    try {
                        int K = eVar.K();
                        switch (K) {
                            case 0:
                                z4 = true;
                                z5 = true;
                                c5 = c5;
                            case 8:
                                z4 = true;
                                this.f77012e |= 1;
                                this.f77013f = eVar.s();
                                c5 = c5;
                            case 16:
                                int i4 = (c5 == true ? 1 : 0) & 32;
                                char c6 = c5;
                                if (i4 != 32) {
                                    this.f77018k = new ArrayList();
                                    c6 = (c5 == true ? 1 : 0) | ' ';
                                }
                                this.f77018k.add(Integer.valueOf(eVar.s()));
                                c5 = c6;
                                z4 = true;
                                c5 = c5;
                            case 18:
                                int j4 = eVar.j(eVar.A());
                                int i5 = (c5 == true ? 1 : 0) & 32;
                                char c7 = c5;
                                if (i5 != 32) {
                                    c7 = c5;
                                    if (eVar.e() > 0) {
                                        this.f77018k = new ArrayList();
                                        c7 = (c5 == true ? 1 : 0) | ' ';
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f77018k.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j4);
                                c5 = c7;
                                z4 = true;
                                c5 = c5;
                            case 24:
                                this.f77012e |= 2;
                                this.f77014g = eVar.s();
                                c5 = c5;
                                z4 = true;
                                c5 = c5;
                            case 32:
                                this.f77012e |= 4;
                                this.f77015h = eVar.s();
                                c5 = c5;
                                z4 = true;
                                c5 = c5;
                            case 42:
                                int i6 = (c5 == true ? 1 : 0) & 8;
                                char c10 = c5;
                                if (i6 != 8) {
                                    this.f77016i = new ArrayList();
                                    c10 = (c5 == true ? 1 : 0) | '\b';
                                }
                                this.f77016i.add(eVar.u(s.f77329p, fVar));
                                c5 = c10;
                                z4 = true;
                                c5 = c5;
                            case 50:
                                int i7 = (c5 == true ? 1 : 0) & 16;
                                char c11 = c5;
                                if (i7 != 16) {
                                    this.f77017j = new ArrayList();
                                    c11 = (c5 == true ? 1 : 0) | 16;
                                }
                                this.f77017j.add(eVar.u(q.f77256w, fVar));
                                c5 = c11;
                                z4 = true;
                                c5 = c5;
                            case 56:
                                int i10 = (c5 == true ? 1 : 0) & 64;
                                char c12 = c5;
                                if (i10 != 64) {
                                    this.f77020m = new ArrayList();
                                    c12 = (c5 == true ? 1 : 0) | '@';
                                }
                                this.f77020m.add(Integer.valueOf(eVar.s()));
                                c5 = c12;
                                z4 = true;
                                c5 = c5;
                            case 58:
                                int j5 = eVar.j(eVar.A());
                                int i11 = (c5 == true ? 1 : 0) & 64;
                                char c13 = c5;
                                if (i11 != 64) {
                                    c13 = c5;
                                    if (eVar.e() > 0) {
                                        this.f77020m = new ArrayList();
                                        c13 = (c5 == true ? 1 : 0) | '@';
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f77020m.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j5);
                                c5 = c13;
                                z4 = true;
                                c5 = c5;
                            case 66:
                                int i12 = (c5 == true ? 1 : 0) & 512;
                                char c14 = c5;
                                if (i12 != 512) {
                                    this.f77025r = new ArrayList();
                                    c14 = (c5 == true ? 1 : 0) | 512;
                                }
                                this.f77025r.add(eVar.u(d.f77057l, fVar));
                                c5 = c14;
                                z4 = true;
                                c5 = c5;
                            case 74:
                                int i13 = (c5 == true ? 1 : 0) & 1024;
                                char c15 = c5;
                                if (i13 != 1024) {
                                    this.f77026s = new ArrayList();
                                    c15 = (c5 == true ? 1 : 0) | 1024;
                                }
                                this.f77026s.add(eVar.u(i.f77123x, fVar));
                                c5 = c15;
                                z4 = true;
                                c5 = c5;
                            case 82:
                                int i14 = (c5 == true ? 1 : 0) & 2048;
                                char c16 = c5;
                                if (i14 != 2048) {
                                    this.f77027t = new ArrayList();
                                    c16 = (c5 == true ? 1 : 0) | 2048;
                                }
                                this.f77027t.add(eVar.u(n.f77191x, fVar));
                                c5 = c16;
                                z4 = true;
                                c5 = c5;
                            case 90:
                                int i15 = (c5 == true ? 1 : 0) & 4096;
                                char c17 = c5;
                                if (i15 != 4096) {
                                    this.f77028u = new ArrayList();
                                    c17 = (c5 == true ? 1 : 0) | 4096;
                                }
                                this.f77028u.add(eVar.u(r.f77304r, fVar));
                                c5 = c17;
                                z4 = true;
                                c5 = c5;
                            case 106:
                                int i16 = (c5 == true ? 1 : 0) & 8192;
                                char c18 = c5;
                                if (i16 != 8192) {
                                    this.f77029v = new ArrayList();
                                    c18 = (c5 == true ? 1 : 0) | 8192;
                                }
                                this.f77029v.add(eVar.u(g.f77093j, fVar));
                                c5 = c18;
                                z4 = true;
                                c5 = c5;
                            case 128:
                                int i17 = (c5 == true ? 1 : 0) & 16384;
                                char c19 = c5;
                                if (i17 != 16384) {
                                    this.f77030w = new ArrayList();
                                    c19 = (c5 == true ? 1 : 0) | 16384;
                                }
                                this.f77030w.add(Integer.valueOf(eVar.s()));
                                c5 = c19;
                                z4 = true;
                                c5 = c5;
                            case UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS /* 130 */:
                                int j6 = eVar.j(eVar.A());
                                int i18 = (c5 == true ? 1 : 0) & 16384;
                                char c20 = c5;
                                if (i18 != 16384) {
                                    c20 = c5;
                                    if (eVar.e() > 0) {
                                        this.f77030w = new ArrayList();
                                        c20 = (c5 == true ? 1 : 0) | 16384;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f77030w.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j6);
                                c5 = c20;
                                z4 = true;
                                c5 = c5;
                            case SyslogAppender.LOG_LOCAL1 /* 136 */:
                                this.f77012e |= 8;
                                this.f77032y = eVar.s();
                                c5 = c5;
                                z4 = true;
                                c5 = c5;
                            case 146:
                                q.c C0 = (this.f77012e & 16) == 16 ? this.f77033z.C0() : null;
                                q qVar = (q) eVar.u(q.f77256w, fVar);
                                this.f77033z = qVar;
                                if (C0 != null) {
                                    C0.k(qVar);
                                    this.f77033z = C0.A();
                                }
                                this.f77012e |= 16;
                                c5 = c5;
                                z4 = true;
                                c5 = c5;
                            case SyslogAppender.LOG_LOCAL3 /* 152 */:
                                this.f77012e |= 32;
                                this.A = eVar.s();
                                c5 = c5;
                                z4 = true;
                                c5 = c5;
                            case 162:
                                int i19 = (c5 == true ? 1 : 0) & 128;
                                char c21 = c5;
                                if (i19 != 128) {
                                    this.f77022o = new ArrayList();
                                    c21 = (c5 == true ? 1 : 0) | 128;
                                }
                                this.f77022o.add(eVar.u(q.f77256w, fVar));
                                c5 = c21;
                                z4 = true;
                                c5 = c5;
                            case SyslogAppender.LOG_LOCAL5 /* 168 */:
                                int i20 = (c5 == true ? 1 : 0) & 256;
                                char c22 = c5;
                                if (i20 != 256) {
                                    this.f77023p = new ArrayList();
                                    c22 = (c5 == true ? 1 : 0) | 256;
                                }
                                this.f77023p.add(Integer.valueOf(eVar.s()));
                                c5 = c22;
                                z4 = true;
                                c5 = c5;
                            case 170:
                                int j7 = eVar.j(eVar.A());
                                int i21 = (c5 == true ? 1 : 0) & 256;
                                char c23 = c5;
                                if (i21 != 256) {
                                    c23 = c5;
                                    if (eVar.e() > 0) {
                                        this.f77023p = new ArrayList();
                                        c23 = (c5 == true ? 1 : 0) | 256;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f77023p.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j7);
                                c5 = c23;
                                z4 = true;
                                c5 = c5;
                            case SyslogAppender.LOG_LOCAL6 /* 176 */:
                                int i22 = (c5 == true ? 1 : 0) & 262144;
                                char c24 = c5;
                                if (i22 != 262144) {
                                    this.B = new ArrayList();
                                    c24 = (c5 == true ? 1 : 0) | 0;
                                }
                                this.B.add(Integer.valueOf(eVar.s()));
                                c5 = c24;
                                z4 = true;
                                c5 = c5;
                            case 178:
                                int j10 = eVar.j(eVar.A());
                                int i23 = (c5 == true ? 1 : 0) & 262144;
                                char c25 = c5;
                                if (i23 != 262144) {
                                    c25 = c5;
                                    if (eVar.e() > 0) {
                                        this.B = new ArrayList();
                                        c25 = (c5 == true ? 1 : 0) | 0;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.B.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j10);
                                c5 = c25;
                                z4 = true;
                                c5 = c5;
                            case 186:
                                int i24 = (c5 == true ? 1 : 0) & 524288;
                                char c26 = c5;
                                if (i24 != 524288) {
                                    this.D = new ArrayList();
                                    c26 = (c5 == true ? 1 : 0) | 0;
                                }
                                this.D.add(eVar.u(q.f77256w, fVar));
                                c5 = c26;
                                z4 = true;
                                c5 = c5;
                            case 192:
                                int i25 = (c5 == true ? 1 : 0) & 1048576;
                                char c27 = c5;
                                if (i25 != 1048576) {
                                    this.E = new ArrayList();
                                    c27 = (c5 == true ? 1 : 0) | 0;
                                }
                                this.E.add(Integer.valueOf(eVar.s()));
                                c5 = c27;
                                z4 = true;
                                c5 = c5;
                            case 194:
                                int j11 = eVar.j(eVar.A());
                                int i26 = (c5 == true ? 1 : 0) & 1048576;
                                char c28 = c5;
                                if (i26 != 1048576) {
                                    c28 = c5;
                                    if (eVar.e() > 0) {
                                        this.E = new ArrayList();
                                        c28 = (c5 == true ? 1 : 0) | 0;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.E.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j11);
                                c5 = c28;
                                z4 = true;
                                c5 = c5;
                            case 242:
                                t.b I = (this.f77012e & 64) == 64 ? this.G.I() : null;
                                t tVar = (t) eVar.u(t.f77349j, fVar);
                                this.G = tVar;
                                if (I != null) {
                                    I.k(tVar);
                                    this.G = I.o();
                                }
                                this.f77012e |= 64;
                                c5 = c5;
                                z4 = true;
                                c5 = c5;
                            case 248:
                                int i27 = (c5 == true ? 1 : 0) & 4194304;
                                char c29 = c5;
                                if (i27 != 4194304) {
                                    this.H = new ArrayList();
                                    c29 = (c5 == true ? 1 : 0) | 0;
                                }
                                this.H.add(Integer.valueOf(eVar.s()));
                                c5 = c29;
                                z4 = true;
                                c5 = c5;
                            case 250:
                                int j12 = eVar.j(eVar.A());
                                int i28 = (c5 == true ? 1 : 0) & 4194304;
                                char c30 = c5;
                                if (i28 != 4194304) {
                                    c30 = c5;
                                    if (eVar.e() > 0) {
                                        this.H = new ArrayList();
                                        c30 = (c5 == true ? 1 : 0) | 0;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.H.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j12);
                                c5 = c30;
                                z4 = true;
                                c5 = c5;
                            case 258:
                                w.b D = (this.f77012e & 128) == 128 ? this.I.D() : null;
                                w wVar = (w) eVar.u(w.f77398h, fVar);
                                this.I = wVar;
                                if (D != null) {
                                    D.k(wVar);
                                    this.I = D.o();
                                }
                                this.f77012e |= 128;
                                c5 = c5;
                                z4 = true;
                                c5 = c5;
                            default:
                                c5 = c5;
                                if (!k(eVar, J, fVar, K)) {
                                    z5 = true;
                                    c5 = c5;
                                }
                                z4 = true;
                                c5 = c5;
                        }
                    } catch (Throwable th) {
                        if (((c5 == true ? 1 : 0) & 32) == 32) {
                            this.f77018k = Collections.unmodifiableList(this.f77018k);
                        }
                        if (((c5 == true ? 1 : 0) & 8) == 8) {
                            this.f77016i = Collections.unmodifiableList(this.f77016i);
                        }
                        if (((c5 == true ? 1 : 0) & 16) == 16) {
                            this.f77017j = Collections.unmodifiableList(this.f77017j);
                        }
                        if (((c5 == true ? 1 : 0) & 64) == 64) {
                            this.f77020m = Collections.unmodifiableList(this.f77020m);
                        }
                        if (((c5 == true ? 1 : 0) & 512) == 512) {
                            this.f77025r = Collections.unmodifiableList(this.f77025r);
                        }
                        if (((c5 == true ? 1 : 0) & 1024) == 1024) {
                            this.f77026s = Collections.unmodifiableList(this.f77026s);
                        }
                        if (((c5 == true ? 1 : 0) & 2048) == 2048) {
                            this.f77027t = Collections.unmodifiableList(this.f77027t);
                        }
                        if (((c5 == true ? 1 : 0) & 4096) == 4096) {
                            this.f77028u = Collections.unmodifiableList(this.f77028u);
                        }
                        if (((c5 == true ? 1 : 0) & 8192) == 8192) {
                            this.f77029v = Collections.unmodifiableList(this.f77029v);
                        }
                        if (((c5 == true ? 1 : 0) & 16384) == 16384) {
                            this.f77030w = Collections.unmodifiableList(this.f77030w);
                        }
                        if (((c5 == true ? 1 : 0) & 128) == 128) {
                            this.f77022o = Collections.unmodifiableList(this.f77022o);
                        }
                        if (((c5 == true ? 1 : 0) & 256) == 256) {
                            this.f77023p = Collections.unmodifiableList(this.f77023p);
                        }
                        if (((c5 == true ? 1 : 0) & 262144) == 262144) {
                            this.B = Collections.unmodifiableList(this.B);
                        }
                        if (((c5 == true ? 1 : 0) & 524288) == 524288) {
                            this.D = Collections.unmodifiableList(this.D);
                        }
                        if (((c5 == true ? 1 : 0) & 1048576) == 1048576) {
                            this.E = Collections.unmodifiableList(this.E);
                        }
                        if (((c5 == true ? 1 : 0) & 4194304) == 4194304) {
                            this.H = Collections.unmodifiableList(this.H);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f77011d = w4.e();
                            throw th2;
                        }
                        this.f77011d = w4.e();
                        h();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.i(this);
                } catch (IOException e5) {
                    throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                }
            }
            if (((c5 == true ? 1 : 0) & 32) == 32) {
                this.f77018k = Collections.unmodifiableList(this.f77018k);
            }
            if (((c5 == true ? 1 : 0) & 8) == 8) {
                this.f77016i = Collections.unmodifiableList(this.f77016i);
            }
            if (((c5 == true ? 1 : 0) & 16) == 16) {
                this.f77017j = Collections.unmodifiableList(this.f77017j);
            }
            if (((c5 == true ? 1 : 0) & 64) == 64) {
                this.f77020m = Collections.unmodifiableList(this.f77020m);
            }
            if (((c5 == true ? 1 : 0) & 512) == 512) {
                this.f77025r = Collections.unmodifiableList(this.f77025r);
            }
            if (((c5 == true ? 1 : 0) & 1024) == 1024) {
                this.f77026s = Collections.unmodifiableList(this.f77026s);
            }
            if (((c5 == true ? 1 : 0) & 2048) == 2048) {
                this.f77027t = Collections.unmodifiableList(this.f77027t);
            }
            if (((c5 == true ? 1 : 0) & 4096) == 4096) {
                this.f77028u = Collections.unmodifiableList(this.f77028u);
            }
            if (((c5 == true ? 1 : 0) & 8192) == 8192) {
                this.f77029v = Collections.unmodifiableList(this.f77029v);
            }
            if (((c5 == true ? 1 : 0) & 16384) == 16384) {
                this.f77030w = Collections.unmodifiableList(this.f77030w);
            }
            if (((c5 == true ? 1 : 0) & 128) == 128) {
                this.f77022o = Collections.unmodifiableList(this.f77022o);
            }
            if (((c5 == true ? 1 : 0) & 256) == 256) {
                this.f77023p = Collections.unmodifiableList(this.f77023p);
            }
            if (((c5 == true ? 1 : 0) & 262144) == 262144) {
                this.B = Collections.unmodifiableList(this.B);
            }
            if (((c5 == true ? 1 : 0) & 524288) == 524288) {
                this.D = Collections.unmodifiableList(this.D);
            }
            if (((c5 == true ? 1 : 0) & 1048576) == 1048576) {
                this.E = Collections.unmodifiableList(this.E);
            }
            if (((c5 == true ? 1 : 0) & 4194304) == 4194304) {
                this.H = Collections.unmodifiableList(this.H);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77011d = w4.e();
                throw th3;
            }
            this.f77011d = w4.e();
            h();
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class d extends h.d<d> implements kotlin.reflect.jvm.internal.impl.metadata.f {

        /* renamed from: k, reason: collision with root package name */
        private static final d f77056k;

        /* renamed from: l, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<d> f77057l = new C1122a();

        /* renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77058d;

        /* renamed from: e, reason: collision with root package name */
        private int f77059e;

        /* renamed from: f, reason: collision with root package name */
        private int f77060f;

        /* renamed from: g, reason: collision with root package name */
        private List<u> f77061g;

        /* renamed from: h, reason: collision with root package name */
        private List<Integer> f77062h;

        /* renamed from: i, reason: collision with root package name */
        private byte f77063i;

        /* renamed from: j, reason: collision with root package name */
        private int f77064j;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$d$a, reason: collision with other inner class name */
        static class C1122a extends kotlin.reflect.jvm.internal.impl.protobuf.b<d> {
            C1122a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public d c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new d(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<d, b> implements kotlin.reflect.jvm.internal.impl.metadata.f {

            /* renamed from: e, reason: collision with root package name */
            private int f77065e;

            /* renamed from: f, reason: collision with root package name */
            private int f77066f = 6;

            /* renamed from: g, reason: collision with root package name */
            private List<u> f77067g = Collections.emptyList();

            /* renamed from: h, reason: collision with root package name */
            private List<Integer> f77068h = Collections.emptyList();

            private b() {
            }

            private static b D() {
                return new b();
            }

            private void E() {
                if ((this.f77065e & 2) != 2) {
                    this.f77067g = new ArrayList(this.f77067g);
                    this.f77065e |= 2;
                }
            }

            private void F() {
                if ((this.f77065e & 4) != 4) {
                    this.f77068h = new ArrayList(this.f77068h);
                    this.f77065e |= 4;
                }
            }

            private void J() {
            }

            static b v() {
                return new b();
            }

            public d A() {
                d dVar = new d(this);
                int i4 = (this.f77065e & 1) != 1 ? 0 : 1;
                dVar.f77060f = this.f77066f;
                if ((this.f77065e & 2) == 2) {
                    this.f77067g = Collections.unmodifiableList(this.f77067g);
                    this.f77065e &= -3;
                }
                dVar.f77061g = this.f77067g;
                if ((this.f77065e & 4) == 4) {
                    this.f77068h = Collections.unmodifiableList(this.f77068h);
                    this.f77065e &= -5;
                }
                dVar.f77062h = this.f77068h;
                dVar.f77059e = i4;
                return dVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public b o() {
                return new b().k(A());
            }

            public d G() {
                return d.I();
            }

            public u H(int i4) {
                return this.f77067g.get(i4);
            }

            public int I() {
                return this.f77067g.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: K, reason: merged with bridge method [inline-methods] */
            public b k(d dVar) {
                if (dVar == d.I()) {
                    return this;
                }
                if (dVar.P()) {
                    N(dVar.K());
                }
                if (!dVar.f77061g.isEmpty()) {
                    if (this.f77067g.isEmpty()) {
                        this.f77067g = dVar.f77061g;
                        this.f77065e &= -3;
                    } else {
                        E();
                        this.f77067g.addAll(dVar.f77061g);
                    }
                }
                if (!dVar.f77062h.isEmpty()) {
                    if (this.f77068h.isEmpty()) {
                        this.f77068h = dVar.f77062h;
                        this.f77065e &= -5;
                    } else {
                        F();
                        this.f77068h.addAll(dVar.f77062h);
                    }
                }
                u(dVar);
                l(i().c(dVar.f77058d));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: M, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.d.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$d> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.d.f77057l     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$d r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.d) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$d r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.d) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.d.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$d$b");
            }

            public b N(int i4) {
                this.f77065e |= 1;
                this.f77066f = i4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public kotlin.reflect.jvm.internal.impl.protobuf.h z() {
                return d.I();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                for (int i4 = 0; i4 < this.f77067g.size(); i4++) {
                    if (!H(i4).p()) {
                        return false;
                    }
                }
                return s();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public d a() {
                d A = A();
                if (A.p()) {
                    return A;
                }
                throw new UninitializedMessageException(A);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return d.I();
            }
        }

        static {
            d dVar = new d(true);
            f77056k = dVar;
            dVar.Q();
        }

        public static d I() {
            return f77056k;
        }

        private void Q() {
            this.f77060f = 6;
            this.f77061g = Collections.emptyList();
            this.f77062h = Collections.emptyList();
        }

        public static b R() {
            return b.v();
        }

        public static b S(d dVar) {
            return b.v().k(dVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<d> B() {
            return f77057l;
        }

        public d J() {
            return f77056k;
        }

        public int K() {
            return this.f77060f;
        }

        public u L(int i4) {
            return this.f77061g.get(i4);
        }

        public int M() {
            return this.f77061g.size();
        }

        public List<u> N() {
            return this.f77061g;
        }

        public List<Integer> O() {
            return this.f77062h;
        }

        public boolean P() {
            return (this.f77059e & 1) == 1;
        }

        public b T() {
            return b.v();
        }

        public b U() {
            return S(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            h.d<MessageType>.a x4 = x();
            if ((this.f77059e & 1) == 1) {
                codedOutputStream.a0(1, this.f77060f);
            }
            for (int i4 = 0; i4 < this.f77061g.size(); i4++) {
                codedOutputStream.d0(2, this.f77061g.get(i4));
            }
            for (int i5 = 0; i5 < this.f77062h.size(); i5++) {
                codedOutputStream.a0(31, this.f77062h.get(i5).intValue());
            }
            x4.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f77058d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77063i;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            for (int i4 = 0; i4 < this.f77061g.size(); i4++) {
                if (!L(i4).p()) {
                    this.f77063i = (byte) 0;
                    return false;
                }
            }
            if (n()) {
                this.f77063i = (byte) 1;
                return true;
            }
            this.f77063i = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return S(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77064j;
            if (i4 != -1) {
                return i4;
            }
            int o4 = (this.f77059e & 1) == 1 ? CodedOutputStream.o(1, this.f77060f) : 0;
            for (int i5 = 0; i5 < this.f77061g.size(); i5++) {
                o4 += CodedOutputStream.s(2, this.f77061g.get(i5));
            }
            int i6 = 0;
            for (int i7 = 0; i7 < this.f77062h.size(); i7++) {
                i6 += CodedOutputStream.p(this.f77062h.get(i7).intValue());
            }
            int size = this.f77058d.size() + androidx.content.preferences.protobuf.n.a(this.f77062h, 2, o4 + i6) + o();
            this.f77064j = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.v();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return f77056k;
        }

        private d(h.c<d, ?> cVar) {
            super(cVar);
            this.f77063i = (byte) -1;
            this.f77064j = -1;
            this.f77058d = cVar.i();
        }

        private d(boolean z4) {
            this.f77063i = (byte) -1;
            this.f77064j = -1;
            this.f77058d = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77063i = (byte) -1;
            this.f77064j = -1;
            Q();
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
                                if (K == 8) {
                                    this.f77059e |= 1;
                                    this.f77060f = eVar.A();
                                } else if (K == 18) {
                                    if ((i4 & 2) != 2) {
                                        this.f77061g = new ArrayList();
                                        i4 |= 2;
                                    }
                                    this.f77061g.add(eVar.u(u.f77360o, fVar));
                                } else if (K == 248) {
                                    if ((i4 & 4) != 4) {
                                        this.f77062h = new ArrayList();
                                        i4 |= 4;
                                    }
                                    this.f77062h.add(Integer.valueOf(eVar.A()));
                                } else if (K != 250) {
                                    if (!k(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    int j4 = eVar.j(eVar.A());
                                    if ((i4 & 4) != 4 && eVar.e() > 0) {
                                        this.f77062h = new ArrayList();
                                        i4 |= 4;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f77062h.add(Integer.valueOf(eVar.A()));
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
                    if ((i4 & 2) == 2) {
                        this.f77061g = Collections.unmodifiableList(this.f77061g);
                    }
                    if ((i4 & 4) == 4) {
                        this.f77062h = Collections.unmodifiableList(this.f77062h);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f77058d = w4.e();
                        throw th2;
                    }
                    this.f77058d = w4.e();
                    h();
                    throw th;
                }
            }
            if ((i4 & 2) == 2) {
                this.f77061g = Collections.unmodifiableList(this.f77061g);
            }
            if ((i4 & 4) == 4) {
                this.f77062h = Collections.unmodifiableList(this.f77062h);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77058d = w4.e();
                throw th3;
            }
            this.f77058d = w4.e();
            h();
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class g extends h.d<g> implements kotlin.reflect.jvm.internal.impl.metadata.i {

        /* renamed from: i, reason: collision with root package name */
        private static final g f77092i;

        /* renamed from: j, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<g> f77093j = new C1127a();

        /* renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77094d;

        /* renamed from: e, reason: collision with root package name */
        private int f77095e;

        /* renamed from: f, reason: collision with root package name */
        private int f77096f;

        /* renamed from: g, reason: collision with root package name */
        private byte f77097g;

        /* renamed from: h, reason: collision with root package name */
        private int f77098h;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$g$a, reason: collision with other inner class name */
        static class C1127a extends kotlin.reflect.jvm.internal.impl.protobuf.b<g> {
            C1127a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public g c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new g(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<g, b> implements kotlin.reflect.jvm.internal.impl.metadata.i {

            /* renamed from: e, reason: collision with root package name */
            private int f77099e;

            /* renamed from: f, reason: collision with root package name */
            private int f77100f;

            private b() {
            }

            private static b D() {
                return new b();
            }

            private void F() {
            }

            static b v() {
                return new b();
            }

            public g A() {
                g gVar = new g(this);
                int i4 = (this.f77099e & 1) != 1 ? 0 : 1;
                gVar.f77096f = this.f77100f;
                gVar.f77095e = i4;
                return gVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b o() {
                return new b().k(A());
            }

            public g E() {
                return g.E();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: G, reason: merged with bridge method [inline-methods] */
            public b k(g gVar) {
                if (gVar == g.E()) {
                    return this;
                }
                if (gVar.H()) {
                    I(gVar.G());
                }
                u(gVar);
                l(i().c(gVar.f77094d));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: H, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.g.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$g> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.g.f77093j     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$g r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.g) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$g r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.g) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.g.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$g$b");
            }

            public b I(int i4) {
                this.f77099e |= 1;
                this.f77100f = i4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public kotlin.reflect.jvm.internal.impl.protobuf.h z() {
                return g.E();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                return s();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public g a() {
                g A = A();
                if (A.p()) {
                    return A;
                }
                throw new UninitializedMessageException(A);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return g.E();
            }
        }

        static {
            g gVar = new g(true);
            f77092i = gVar;
            gVar.f77096f = 0;
        }

        public static g E() {
            return f77092i;
        }

        private void I() {
            this.f77096f = 0;
        }

        public static b J() {
            return b.v();
        }

        public static b K(g gVar) {
            return b.v().k(gVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<g> B() {
            return f77093j;
        }

        public g F() {
            return f77092i;
        }

        public int G() {
            return this.f77096f;
        }

        public boolean H() {
            return (this.f77095e & 1) == 1;
        }

        public b L() {
            return b.v();
        }

        public b M() {
            return K(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            h.d<MessageType>.a x4 = x();
            if ((this.f77095e & 1) == 1) {
                codedOutputStream.a0(1, this.f77096f);
            }
            x4.a(200, codedOutputStream);
            codedOutputStream.i0(this.f77094d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77097g;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            if (n()) {
                this.f77097g = (byte) 1;
                return true;
            }
            this.f77097g = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return K(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77098h;
            if (i4 != -1) {
                return i4;
            }
            int size = this.f77094d.size() + ((this.f77095e & 1) == 1 ? CodedOutputStream.o(1, this.f77096f) : 0) + o();
            this.f77098h = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.v();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return f77092i;
        }

        private g(h.c<g, ?> cVar) {
            super(cVar);
            this.f77097g = (byte) -1;
            this.f77098h = -1;
            this.f77094d = cVar.i();
        }

        private g(boolean z4) {
            this.f77097g = (byte) -1;
            this.f77098h = -1;
            this.f77094d = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        private g(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77097g = (byte) -1;
            this.f77098h = -1;
            boolean z4 = false;
            this.f77096f = 0;
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            while (!z4) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K != 8) {
                                if (!k(eVar, J, fVar, K)) {
                                }
                            } else {
                                this.f77095e |= 1;
                                this.f77096f = eVar.A();
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
                        this.f77094d = w4.e();
                        throw th2;
                    }
                    this.f77094d = w4.e();
                    h();
                    throw th;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77094d = w4.e();
                throw th3;
            }
            this.f77094d = w4.e();
            h();
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class i extends h.d<i> implements kotlin.reflect.jvm.internal.impl.metadata.k {

        /* renamed from: w, reason: collision with root package name */
        private static final i f77122w;

        /* renamed from: x, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<i> f77123x = new C1130a();

        /* renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77124d;

        /* renamed from: e, reason: collision with root package name */
        private int f77125e;

        /* renamed from: f, reason: collision with root package name */
        private int f77126f;

        /* renamed from: g, reason: collision with root package name */
        private int f77127g;

        /* renamed from: h, reason: collision with root package name */
        private int f77128h;

        /* renamed from: i, reason: collision with root package name */
        private q f77129i;

        /* renamed from: j, reason: collision with root package name */
        private int f77130j;

        /* renamed from: k, reason: collision with root package name */
        private List<s> f77131k;

        /* renamed from: l, reason: collision with root package name */
        private q f77132l;

        /* renamed from: m, reason: collision with root package name */
        private int f77133m;

        /* renamed from: n, reason: collision with root package name */
        private List<q> f77134n;

        /* renamed from: o, reason: collision with root package name */
        private List<Integer> f77135o;

        /* renamed from: p, reason: collision with root package name */
        private int f77136p;

        /* renamed from: q, reason: collision with root package name */
        private List<u> f77137q;

        /* renamed from: r, reason: collision with root package name */
        private t f77138r;

        /* renamed from: s, reason: collision with root package name */
        private List<Integer> f77139s;

        /* renamed from: t, reason: collision with root package name */
        private e f77140t;

        /* renamed from: u, reason: collision with root package name */
        private byte f77141u;

        /* renamed from: v, reason: collision with root package name */
        private int f77142v;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$i$a, reason: collision with other inner class name */
        static class C1130a extends kotlin.reflect.jvm.internal.impl.protobuf.b<i> {
            C1130a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public i c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new i(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<i, b> implements kotlin.reflect.jvm.internal.impl.metadata.k {

            /* renamed from: e, reason: collision with root package name */
            private int f77143e;

            /* renamed from: h, reason: collision with root package name */
            private int f77146h;

            /* renamed from: j, reason: collision with root package name */
            private int f77148j;

            /* renamed from: m, reason: collision with root package name */
            private int f77151m;

            /* renamed from: f, reason: collision with root package name */
            private int f77144f = 6;

            /* renamed from: g, reason: collision with root package name */
            private int f77145g = 6;

            /* renamed from: i, reason: collision with root package name */
            private q f77147i = q.Y();

            /* renamed from: k, reason: collision with root package name */
            private List<s> f77149k = Collections.emptyList();

            /* renamed from: l, reason: collision with root package name */
            private q f77150l = q.Y();

            /* renamed from: n, reason: collision with root package name */
            private List<q> f77152n = Collections.emptyList();

            /* renamed from: o, reason: collision with root package name */
            private List<Integer> f77153o = Collections.emptyList();

            /* renamed from: p, reason: collision with root package name */
            private List<u> f77154p = Collections.emptyList();

            /* renamed from: q, reason: collision with root package name */
            private t f77155q = t.u();

            /* renamed from: r, reason: collision with root package name */
            private List<Integer> f77156r = Collections.emptyList();

            /* renamed from: s, reason: collision with root package name */
            private e f77157s = e.r();

            private b() {
            }

            private static b D() {
                return new b();
            }

            private void E() {
                if ((this.f77143e & 512) != 512) {
                    this.f77153o = new ArrayList(this.f77153o);
                    this.f77143e |= 512;
                }
            }

            private void F() {
                if ((this.f77143e & 256) != 256) {
                    this.f77152n = new ArrayList(this.f77152n);
                    this.f77143e |= 256;
                }
            }

            private void G() {
                if ((this.f77143e & 32) != 32) {
                    this.f77149k = new ArrayList(this.f77149k);
                    this.f77143e |= 32;
                }
            }

            private void H() {
                if ((this.f77143e & 1024) != 1024) {
                    this.f77154p = new ArrayList(this.f77154p);
                    this.f77143e |= 1024;
                }
            }

            private void I() {
                if ((this.f77143e & 4096) != 4096) {
                    this.f77156r = new ArrayList(this.f77156r);
                    this.f77143e |= 4096;
                }
            }

            private void c0() {
            }

            static b v() {
                return new b();
            }

            public i A() {
                i iVar = new i(this);
                int i4 = this.f77143e;
                int i5 = (i4 & 1) != 1 ? 0 : 1;
                iVar.f77126f = this.f77144f;
                if ((i4 & 2) == 2) {
                    i5 |= 2;
                }
                iVar.f77127g = this.f77145g;
                if ((i4 & 4) == 4) {
                    i5 |= 4;
                }
                iVar.f77128h = this.f77146h;
                if ((i4 & 8) == 8) {
                    i5 |= 8;
                }
                iVar.f77129i = this.f77147i;
                if ((i4 & 16) == 16) {
                    i5 |= 16;
                }
                iVar.f77130j = this.f77148j;
                if ((this.f77143e & 32) == 32) {
                    this.f77149k = Collections.unmodifiableList(this.f77149k);
                    this.f77143e &= -33;
                }
                iVar.f77131k = this.f77149k;
                if ((i4 & 64) == 64) {
                    i5 |= 32;
                }
                iVar.f77132l = this.f77150l;
                if ((i4 & 128) == 128) {
                    i5 |= 64;
                }
                iVar.f77133m = this.f77151m;
                if ((this.f77143e & 256) == 256) {
                    this.f77152n = Collections.unmodifiableList(this.f77152n);
                    this.f77143e &= -257;
                }
                iVar.f77134n = this.f77152n;
                if ((this.f77143e & 512) == 512) {
                    this.f77153o = Collections.unmodifiableList(this.f77153o);
                    this.f77143e &= -513;
                }
                iVar.f77135o = this.f77153o;
                if ((this.f77143e & 1024) == 1024) {
                    this.f77154p = Collections.unmodifiableList(this.f77154p);
                    this.f77143e &= -1025;
                }
                iVar.f77137q = this.f77154p;
                if ((i4 & 2048) == 2048) {
                    i5 |= 128;
                }
                iVar.f77138r = this.f77155q;
                if ((this.f77143e & 4096) == 4096) {
                    this.f77156r = Collections.unmodifiableList(this.f77156r);
                    this.f77143e &= -4097;
                }
                iVar.f77139s = this.f77156r;
                if ((i4 & 8192) == 8192) {
                    i5 |= 256;
                }
                iVar.f77140t = this.f77157s;
                iVar.f77125e = i5;
                return iVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b o() {
                return new b().k(A());
            }

            public q J(int i4) {
                return this.f77152n.get(i4);
            }

            public int K() {
                return this.f77152n.size();
            }

            public e M() {
                return this.f77157s;
            }

            public i N() {
                return i.b0();
            }

            public q O() {
                return this.f77150l;
            }

            public q P() {
                return this.f77147i;
            }

            public s R(int i4) {
                return this.f77149k.get(i4);
            }

            public int S() {
                return this.f77149k.size();
            }

            public t T() {
                return this.f77155q;
            }

            public u U(int i4) {
                return this.f77154p.get(i4);
            }

            public int V() {
                return this.f77154p.size();
            }

            public boolean W() {
                return (this.f77143e & 8192) == 8192;
            }

            public boolean Y() {
                return (this.f77143e & 4) == 4;
            }

            public boolean Z() {
                return (this.f77143e & 64) == 64;
            }

            public boolean a0() {
                return (this.f77143e & 8) == 8;
            }

            public boolean b0() {
                return (this.f77143e & 2048) == 2048;
            }

            public b d0(e eVar) {
                if ((this.f77143e & 8192) != 8192 || this.f77157s == e.r()) {
                    this.f77157s = eVar;
                } else {
                    this.f77157s = e.A(this.f77157s).k(eVar).o();
                }
                this.f77143e |= 8192;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: e0, reason: merged with bridge method [inline-methods] */
            public b k(i iVar) {
                if (iVar == i.b0()) {
                    return this;
                }
                if (iVar.u0()) {
                    k0(iVar.d0());
                }
                if (iVar.w0()) {
                    m0(iVar.f0());
                }
                if (iVar.v0()) {
                    l0(iVar.e0());
                }
                if (iVar.z0()) {
                    h0(iVar.i0());
                }
                if (iVar.A0()) {
                    p0(iVar.j0());
                }
                if (!iVar.f77131k.isEmpty()) {
                    if (this.f77149k.isEmpty()) {
                        this.f77149k = iVar.f77131k;
                        this.f77143e &= -33;
                    } else {
                        G();
                        this.f77149k.addAll(iVar.f77131k);
                    }
                }
                if (iVar.x0()) {
                    g0(iVar.g0());
                }
                if (iVar.y0()) {
                    o0(iVar.h0());
                }
                if (!iVar.f77134n.isEmpty()) {
                    if (this.f77152n.isEmpty()) {
                        this.f77152n = iVar.f77134n;
                        this.f77143e &= -257;
                    } else {
                        F();
                        this.f77152n.addAll(iVar.f77134n);
                    }
                }
                if (!iVar.f77135o.isEmpty()) {
                    if (this.f77153o.isEmpty()) {
                        this.f77153o = iVar.f77135o;
                        this.f77143e &= -513;
                    } else {
                        E();
                        this.f77153o.addAll(iVar.f77135o);
                    }
                }
                if (!iVar.f77137q.isEmpty()) {
                    if (this.f77154p.isEmpty()) {
                        this.f77154p = iVar.f77137q;
                        this.f77143e &= -1025;
                    } else {
                        H();
                        this.f77154p.addAll(iVar.f77137q);
                    }
                }
                if (iVar.B0()) {
                    i0(iVar.n0());
                }
                if (!iVar.f77139s.isEmpty()) {
                    if (this.f77156r.isEmpty()) {
                        this.f77156r = iVar.f77139s;
                        this.f77143e &= -4097;
                    } else {
                        I();
                        this.f77156r.addAll(iVar.f77139s);
                    }
                }
                if (iVar.t0()) {
                    d0(iVar.a0());
                }
                u(iVar);
                l(i().c(iVar.f77124d));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: f0, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.i.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$i> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.i.f77123x     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$i r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.i) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$i r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.i) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.i.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$i$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public kotlin.reflect.jvm.internal.impl.protobuf.h z() {
                return i.b0();
            }

            public b g0(q qVar) {
                if ((this.f77143e & 64) != 64 || this.f77150l == q.Y()) {
                    this.f77150l = qVar;
                } else {
                    this.f77150l = q.A0(this.f77150l).k(qVar).A();
                }
                this.f77143e |= 64;
                return this;
            }

            public b h0(q qVar) {
                if ((this.f77143e & 8) != 8 || this.f77147i == q.Y()) {
                    this.f77147i = qVar;
                } else {
                    this.f77147i = q.A0(this.f77147i).k(qVar).A();
                }
                this.f77143e |= 8;
                return this;
            }

            public b i0(t tVar) {
                if ((this.f77143e & 2048) != 2048 || this.f77155q == t.u()) {
                    this.f77155q = tVar;
                } else {
                    this.f77155q = t.G(this.f77155q).k(tVar).o();
                }
                this.f77143e |= 2048;
                return this;
            }

            public b k0(int i4) {
                this.f77143e |= 1;
                this.f77144f = i4;
                return this;
            }

            public b l0(int i4) {
                this.f77143e |= 4;
                this.f77146h = i4;
                return this;
            }

            public b m0(int i4) {
                this.f77143e |= 2;
                this.f77145g = i4;
                return this;
            }

            public b o0(int i4) {
                this.f77143e |= 128;
                this.f77151m = i4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                if (!Y()) {
                    return false;
                }
                if (a0() && !this.f77147i.p()) {
                    return false;
                }
                for (int i4 = 0; i4 < this.f77149k.size(); i4++) {
                    if (!R(i4).p()) {
                        return false;
                    }
                }
                if (Z() && !this.f77150l.p()) {
                    return false;
                }
                for (int i5 = 0; i5 < this.f77152n.size(); i5++) {
                    if (!J(i5).p()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < this.f77154p.size(); i6++) {
                    if (!U(i6).p()) {
                        return false;
                    }
                }
                if (!b0() || this.f77155q.p()) {
                    return (!W() || this.f77157s.p()) && s();
                }
                return false;
            }

            public b p0(int i4) {
                this.f77143e |= 16;
                this.f77148j = i4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public i a() {
                i A = A();
                if (A.p()) {
                    return A;
                }
                throw new UninitializedMessageException(A);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return i.b0();
            }
        }

        static {
            i iVar = new i(true);
            f77122w = iVar;
            iVar.C0();
        }

        private void C0() {
            this.f77126f = 6;
            this.f77127g = 6;
            this.f77128h = 0;
            this.f77129i = q.Y();
            this.f77130j = 0;
            this.f77131k = Collections.emptyList();
            this.f77132l = q.Y();
            this.f77133m = 0;
            this.f77134n = Collections.emptyList();
            this.f77135o = Collections.emptyList();
            this.f77137q = Collections.emptyList();
            this.f77138r = t.u();
            this.f77139s = Collections.emptyList();
            this.f77140t = e.r();
        }

        public static b D0() {
            return b.v();
        }

        public static b E0(i iVar) {
            return b.v().k(iVar);
        }

        public static i G0(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws IOException {
            return f77123x.a(inputStream, fVar);
        }

        public static i b0() {
            return f77122w;
        }

        public boolean A0() {
            return (this.f77125e & 16) == 16;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<i> B() {
            return f77123x;
        }

        public boolean B0() {
            return (this.f77125e & 128) == 128;
        }

        public b F0() {
            return b.v();
        }

        public b H0() {
            return E0(this);
        }

        public q W(int i4) {
            return this.f77134n.get(i4);
        }

        public int X() {
            return this.f77134n.size();
        }

        public List<Integer> Y() {
            return this.f77135o;
        }

        public List<q> Z() {
            return this.f77134n;
        }

        public e a0() {
            return this.f77140t;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            h.d<MessageType>.a x4 = x();
            if ((this.f77125e & 2) == 2) {
                codedOutputStream.a0(1, this.f77127g);
            }
            if ((this.f77125e & 4) == 4) {
                codedOutputStream.a0(2, this.f77128h);
            }
            if ((this.f77125e & 8) == 8) {
                codedOutputStream.d0(3, this.f77129i);
            }
            for (int i4 = 0; i4 < this.f77131k.size(); i4++) {
                codedOutputStream.d0(4, this.f77131k.get(i4));
            }
            if ((this.f77125e & 32) == 32) {
                codedOutputStream.d0(5, this.f77132l);
            }
            for (int i5 = 0; i5 < this.f77137q.size(); i5++) {
                codedOutputStream.d0(6, this.f77137q.get(i5));
            }
            if ((this.f77125e & 16) == 16) {
                codedOutputStream.a0(7, this.f77130j);
            }
            if ((this.f77125e & 64) == 64) {
                codedOutputStream.a0(8, this.f77133m);
            }
            if ((this.f77125e & 1) == 1) {
                codedOutputStream.a0(9, this.f77126f);
            }
            for (int i6 = 0; i6 < this.f77134n.size(); i6++) {
                codedOutputStream.d0(10, this.f77134n.get(i6));
            }
            if (this.f77135o.size() > 0) {
                codedOutputStream.o0(90);
                codedOutputStream.o0(this.f77136p);
            }
            for (int i7 = 0; i7 < this.f77135o.size(); i7++) {
                codedOutputStream.b0(this.f77135o.get(i7).intValue());
            }
            if ((this.f77125e & 128) == 128) {
                codedOutputStream.d0(30, this.f77138r);
            }
            for (int i10 = 0; i10 < this.f77139s.size(); i10++) {
                codedOutputStream.a0(31, this.f77139s.get(i10).intValue());
            }
            if ((this.f77125e & 256) == 256) {
                codedOutputStream.d0(32, this.f77140t);
            }
            x4.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f77124d);
        }

        public i c0() {
            return f77122w;
        }

        public int d0() {
            return this.f77126f;
        }

        public int e0() {
            return this.f77128h;
        }

        public int f0() {
            return this.f77127g;
        }

        public q g0() {
            return this.f77132l;
        }

        public int h0() {
            return this.f77133m;
        }

        public q i0() {
            return this.f77129i;
        }

        public int j0() {
            return this.f77130j;
        }

        public s k0(int i4) {
            return this.f77131k.get(i4);
        }

        public int l0() {
            return this.f77131k.size();
        }

        public List<s> m0() {
            return this.f77131k;
        }

        public t n0() {
            return this.f77138r;
        }

        public u o0(int i4) {
            return this.f77137q.get(i4);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77141u;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            if (!v0()) {
                this.f77141u = (byte) 0;
                return false;
            }
            if (z0() && !this.f77129i.p()) {
                this.f77141u = (byte) 0;
                return false;
            }
            for (int i4 = 0; i4 < this.f77131k.size(); i4++) {
                if (!k0(i4).p()) {
                    this.f77141u = (byte) 0;
                    return false;
                }
            }
            if (x0() && !this.f77132l.p()) {
                this.f77141u = (byte) 0;
                return false;
            }
            for (int i5 = 0; i5 < this.f77134n.size(); i5++) {
                if (!W(i5).p()) {
                    this.f77141u = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < this.f77137q.size(); i6++) {
                if (!o0(i6).p()) {
                    this.f77141u = (byte) 0;
                    return false;
                }
            }
            if (B0() && !this.f77138r.p()) {
                this.f77141u = (byte) 0;
                return false;
            }
            if (t0() && !this.f77140t.p()) {
                this.f77141u = (byte) 0;
                return false;
            }
            if (n()) {
                this.f77141u = (byte) 1;
                return true;
            }
            this.f77141u = (byte) 0;
            return false;
        }

        public int p0() {
            return this.f77137q.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return E0(this);
        }

        public List<u> q0() {
            return this.f77137q;
        }

        public List<Integer> s0() {
            return this.f77139s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77142v;
            if (i4 != -1) {
                return i4;
            }
            int o4 = (this.f77125e & 2) == 2 ? CodedOutputStream.o(1, this.f77127g) : 0;
            if ((this.f77125e & 4) == 4) {
                o4 += CodedOutputStream.o(2, this.f77128h);
            }
            if ((this.f77125e & 8) == 8) {
                o4 += CodedOutputStream.s(3, this.f77129i);
            }
            for (int i5 = 0; i5 < this.f77131k.size(); i5++) {
                o4 += CodedOutputStream.s(4, this.f77131k.get(i5));
            }
            if ((this.f77125e & 32) == 32) {
                o4 += CodedOutputStream.s(5, this.f77132l);
            }
            for (int i6 = 0; i6 < this.f77137q.size(); i6++) {
                o4 += CodedOutputStream.s(6, this.f77137q.get(i6));
            }
            if ((this.f77125e & 16) == 16) {
                o4 += CodedOutputStream.o(7, this.f77130j);
            }
            if ((this.f77125e & 64) == 64) {
                o4 += CodedOutputStream.o(8, this.f77133m);
            }
            if ((this.f77125e & 1) == 1) {
                o4 += CodedOutputStream.o(9, this.f77126f);
            }
            for (int i7 = 0; i7 < this.f77134n.size(); i7++) {
                o4 += CodedOutputStream.s(10, this.f77134n.get(i7));
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.f77135o.size(); i11++) {
                i10 += CodedOutputStream.p(this.f77135o.get(i11).intValue());
            }
            int i12 = o4 + i10;
            if (!this.f77135o.isEmpty()) {
                i12 = i12 + 1 + CodedOutputStream.p(i10);
            }
            this.f77136p = i10;
            if ((this.f77125e & 128) == 128) {
                i12 += CodedOutputStream.s(30, this.f77138r);
            }
            int i13 = 0;
            for (int i14 = 0; i14 < this.f77139s.size(); i14++) {
                i13 += CodedOutputStream.p(this.f77139s.get(i14).intValue());
            }
            int a5 = androidx.content.preferences.protobuf.n.a(this.f77139s, 2, i12 + i13);
            if ((this.f77125e & 256) == 256) {
                a5 += CodedOutputStream.s(32, this.f77140t);
            }
            int size = this.f77124d.size() + a5 + o();
            this.f77142v = size;
            return size;
        }

        public boolean t0() {
            return (this.f77125e & 256) == 256;
        }

        public boolean u0() {
            return (this.f77125e & 1) == 1;
        }

        public boolean v0() {
            return (this.f77125e & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.v();
        }

        public boolean w0() {
            return (this.f77125e & 2) == 2;
        }

        public boolean x0() {
            return (this.f77125e & 32) == 32;
        }

        public boolean y0() {
            return (this.f77125e & 64) == 64;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return f77122w;
        }

        public boolean z0() {
            return (this.f77125e & 8) == 8;
        }

        private i(h.c<i, ?> cVar) {
            super(cVar);
            this.f77136p = -1;
            this.f77141u = (byte) -1;
            this.f77142v = -1;
            this.f77124d = cVar.i();
        }

        private i(boolean z4) {
            this.f77136p = -1;
            this.f77141u = (byte) -1;
            this.f77142v = -1;
            this.f77124d = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r4v15 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        private i(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77136p = -1;
            this.f77141u = (byte) -1;
            this.f77142v = -1;
            C0();
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z4 = false;
            char c5 = 0;
            while (true) {
                ?? r5 = 1024;
                if (!z4) {
                    try {
                        try {
                            int K = eVar.K();
                            q.c cVar = null;
                            e.b bVar = null;
                            t.b bVar2 = null;
                            q.c cVar2 = null;
                            switch (K) {
                                case 0:
                                    z4 = true;
                                case 8:
                                    this.f77125e |= 2;
                                    this.f77127g = eVar.A();
                                case 16:
                                    this.f77125e |= 4;
                                    this.f77128h = eVar.A();
                                case 26:
                                    if ((this.f77125e & 8) == 8) {
                                        q qVar = this.f77129i;
                                        qVar.getClass();
                                        cVar = q.A0(qVar);
                                    }
                                    q qVar2 = (q) eVar.u(q.f77256w, fVar);
                                    this.f77129i = qVar2;
                                    if (cVar != null) {
                                        cVar.k(qVar2);
                                        this.f77129i = cVar.A();
                                    }
                                    this.f77125e |= 8;
                                case 34:
                                    int i4 = (c5 == true ? 1 : 0) & 32;
                                    c5 = c5;
                                    if (i4 != 32) {
                                        this.f77131k = new ArrayList();
                                        c5 = (c5 == true ? 1 : 0) | ' ';
                                    }
                                    this.f77131k.add(eVar.u(s.f77329p, fVar));
                                case 42:
                                    if ((this.f77125e & 32) == 32) {
                                        q qVar3 = this.f77132l;
                                        qVar3.getClass();
                                        cVar2 = q.A0(qVar3);
                                    }
                                    q qVar4 = (q) eVar.u(q.f77256w, fVar);
                                    this.f77132l = qVar4;
                                    if (cVar2 != null) {
                                        cVar2.k(qVar4);
                                        this.f77132l = cVar2.A();
                                    }
                                    this.f77125e |= 32;
                                case 50:
                                    int i5 = (c5 == true ? 1 : 0) & 1024;
                                    c5 = c5;
                                    if (i5 != 1024) {
                                        this.f77137q = new ArrayList();
                                        c5 = (c5 == true ? 1 : 0) | 1024;
                                    }
                                    this.f77137q.add(eVar.u(u.f77360o, fVar));
                                case 56:
                                    this.f77125e |= 16;
                                    this.f77130j = eVar.A();
                                case 64:
                                    this.f77125e |= 64;
                                    this.f77133m = eVar.A();
                                case 72:
                                    this.f77125e |= 1;
                                    this.f77126f = eVar.A();
                                case 82:
                                    int i6 = (c5 == true ? 1 : 0) & 256;
                                    c5 = c5;
                                    if (i6 != 256) {
                                        this.f77134n = new ArrayList();
                                        c5 = (c5 == true ? 1 : 0) | 256;
                                    }
                                    this.f77134n.add(eVar.u(q.f77256w, fVar));
                                case 88:
                                    int i7 = (c5 == true ? 1 : 0) & 512;
                                    c5 = c5;
                                    if (i7 != 512) {
                                        this.f77135o = new ArrayList();
                                        c5 = (c5 == true ? 1 : 0) | 512;
                                    }
                                    this.f77135o.add(Integer.valueOf(eVar.A()));
                                case 90:
                                    int j4 = eVar.j(eVar.A());
                                    int i10 = (c5 == true ? 1 : 0) & 512;
                                    c5 = c5;
                                    if (i10 != 512) {
                                        c5 = c5;
                                        if (eVar.e() > 0) {
                                            this.f77135o = new ArrayList();
                                            c5 = (c5 == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.f77135o.add(Integer.valueOf(eVar.A()));
                                    }
                                    eVar.i(j4);
                                case 242:
                                    if ((this.f77125e & 128) == 128) {
                                        t tVar = this.f77138r;
                                        tVar.getClass();
                                        bVar2 = t.G(tVar);
                                    }
                                    t tVar2 = (t) eVar.u(t.f77349j, fVar);
                                    this.f77138r = tVar2;
                                    if (bVar2 != null) {
                                        bVar2.k(tVar2);
                                        this.f77138r = bVar2.o();
                                    }
                                    this.f77125e |= 128;
                                case 248:
                                    int i11 = (c5 == true ? 1 : 0) & 4096;
                                    c5 = c5;
                                    if (i11 != 4096) {
                                        this.f77139s = new ArrayList();
                                        c5 = (c5 == true ? 1 : 0) | 4096;
                                    }
                                    this.f77139s.add(Integer.valueOf(eVar.A()));
                                case 250:
                                    int j5 = eVar.j(eVar.A());
                                    int i12 = (c5 == true ? 1 : 0) & 4096;
                                    c5 = c5;
                                    if (i12 != 4096) {
                                        c5 = c5;
                                        if (eVar.e() > 0) {
                                            this.f77139s = new ArrayList();
                                            c5 = (c5 == true ? 1 : 0) | 4096;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.f77139s.add(Integer.valueOf(eVar.A()));
                                    }
                                    eVar.i(j5);
                                case 258:
                                    if ((this.f77125e & 256) == 256) {
                                        e eVar2 = this.f77140t;
                                        eVar2.getClass();
                                        bVar = e.A(eVar2);
                                    }
                                    e eVar3 = (e) eVar.u(e.f77070h, fVar);
                                    this.f77140t = eVar3;
                                    if (bVar != null) {
                                        bVar.k(eVar3);
                                        this.f77140t = bVar.o();
                                    }
                                    this.f77125e |= 256;
                                default:
                                    r5 = k(eVar, J, fVar, K);
                                    if (r5 == 0) {
                                        z4 = true;
                                    }
                            }
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.i(this);
                        } catch (IOException e5) {
                            throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                        }
                    } catch (Throwable th) {
                        if (((c5 == true ? 1 : 0) & 32) == 32) {
                            this.f77131k = Collections.unmodifiableList(this.f77131k);
                        }
                        if (((c5 == true ? 1 : 0) & 1024) == r5) {
                            this.f77137q = Collections.unmodifiableList(this.f77137q);
                        }
                        if (((c5 == true ? 1 : 0) & 256) == 256) {
                            this.f77134n = Collections.unmodifiableList(this.f77134n);
                        }
                        if (((c5 == true ? 1 : 0) & 512) == 512) {
                            this.f77135o = Collections.unmodifiableList(this.f77135o);
                        }
                        if (((c5 == true ? 1 : 0) & 4096) == 4096) {
                            this.f77139s = Collections.unmodifiableList(this.f77139s);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f77124d = w4.e();
                            throw th2;
                        }
                        this.f77124d = w4.e();
                        h();
                        throw th;
                    }
                } else {
                    if (((c5 == true ? 1 : 0) & 32) == 32) {
                        this.f77131k = Collections.unmodifiableList(this.f77131k);
                    }
                    if (((c5 == true ? 1 : 0) & 1024) == 1024) {
                        this.f77137q = Collections.unmodifiableList(this.f77137q);
                    }
                    if (((c5 == true ? 1 : 0) & 256) == 256) {
                        this.f77134n = Collections.unmodifiableList(this.f77134n);
                    }
                    if (((c5 == true ? 1 : 0) & 512) == 512) {
                        this.f77135o = Collections.unmodifiableList(this.f77135o);
                    }
                    if (((c5 == true ? 1 : 0) & 4096) == 4096) {
                        this.f77139s = Collections.unmodifiableList(this.f77139s);
                    }
                    try {
                        J.I();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.f77124d = w4.e();
                        throw th3;
                    }
                    this.f77124d = w4.e();
                    h();
                    return;
                }
            }
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class l extends h.d<l> implements kotlin.reflect.jvm.internal.impl.metadata.m {

        /* renamed from: m, reason: collision with root package name */
        private static final l f77158m;

        /* renamed from: n, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<l> f77159n = new C1133a();

        /* renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77160d;

        /* renamed from: e, reason: collision with root package name */
        private int f77161e;

        /* renamed from: f, reason: collision with root package name */
        private List<i> f77162f;

        /* renamed from: g, reason: collision with root package name */
        private List<n> f77163g;

        /* renamed from: h, reason: collision with root package name */
        private List<r> f77164h;

        /* renamed from: i, reason: collision with root package name */
        private t f77165i;

        /* renamed from: j, reason: collision with root package name */
        private w f77166j;

        /* renamed from: k, reason: collision with root package name */
        private byte f77167k;

        /* renamed from: l, reason: collision with root package name */
        private int f77168l;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$l$a, reason: collision with other inner class name */
        static class C1133a extends kotlin.reflect.jvm.internal.impl.protobuf.b<l> {
            C1133a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public l c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new l(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<l, b> implements kotlin.reflect.jvm.internal.impl.metadata.m {

            /* renamed from: e, reason: collision with root package name */
            private int f77169e;

            /* renamed from: f, reason: collision with root package name */
            private List<i> f77170f = Collections.emptyList();

            /* renamed from: g, reason: collision with root package name */
            private List<n> f77171g = Collections.emptyList();

            /* renamed from: h, reason: collision with root package name */
            private List<r> f77172h = Collections.emptyList();

            /* renamed from: i, reason: collision with root package name */
            private t f77173i = t.u();

            /* renamed from: j, reason: collision with root package name */
            private w f77174j = w.r();

            private b() {
            }

            private static b D() {
                return new b();
            }

            private void E() {
                if ((this.f77169e & 1) != 1) {
                    this.f77170f = new ArrayList(this.f77170f);
                    this.f77169e |= 1;
                }
            }

            private void F() {
                if ((this.f77169e & 2) != 2) {
                    this.f77171g = new ArrayList(this.f77171g);
                    this.f77169e |= 2;
                }
            }

            private void G() {
                if ((this.f77169e & 4) != 4) {
                    this.f77172h = new ArrayList(this.f77172h);
                    this.f77169e |= 4;
                }
            }

            private void S() {
            }

            static b v() {
                return new b();
            }

            public l A() {
                l lVar = new l(this);
                int i4 = this.f77169e;
                if ((i4 & 1) == 1) {
                    this.f77170f = Collections.unmodifiableList(this.f77170f);
                    this.f77169e &= -2;
                }
                lVar.f77162f = this.f77170f;
                if ((this.f77169e & 2) == 2) {
                    this.f77171g = Collections.unmodifiableList(this.f77171g);
                    this.f77169e &= -3;
                }
                lVar.f77163g = this.f77171g;
                if ((this.f77169e & 4) == 4) {
                    this.f77172h = Collections.unmodifiableList(this.f77172h);
                    this.f77169e &= -5;
                }
                lVar.f77164h = this.f77172h;
                int i5 = (i4 & 8) != 8 ? 0 : 1;
                lVar.f77165i = this.f77173i;
                if ((i4 & 16) == 16) {
                    i5 |= 2;
                }
                lVar.f77166j = this.f77174j;
                lVar.f77161e = i5;
                return lVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b o() {
                return new b().k(A());
            }

            public l H() {
                return l.L();
            }

            public i I(int i4) {
                return this.f77170f.get(i4);
            }

            public int J() {
                return this.f77170f.size();
            }

            public n K(int i4) {
                return this.f77171g.get(i4);
            }

            public int M() {
                return this.f77171g.size();
            }

            public r N(int i4) {
                return this.f77172h.get(i4);
            }

            public int O() {
                return this.f77172h.size();
            }

            public t P() {
                return this.f77173i;
            }

            public boolean R() {
                return (this.f77169e & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: T, reason: merged with bridge method [inline-methods] */
            public b k(l lVar) {
                if (lVar == l.L()) {
                    return this;
                }
                if (!lVar.f77162f.isEmpty()) {
                    if (this.f77170f.isEmpty()) {
                        this.f77170f = lVar.f77162f;
                        this.f77169e &= -2;
                    } else {
                        E();
                        this.f77170f.addAll(lVar.f77162f);
                    }
                }
                if (!lVar.f77163g.isEmpty()) {
                    if (this.f77171g.isEmpty()) {
                        this.f77171g = lVar.f77163g;
                        this.f77169e &= -3;
                    } else {
                        F();
                        this.f77171g.addAll(lVar.f77163g);
                    }
                }
                if (!lVar.f77164h.isEmpty()) {
                    if (this.f77172h.isEmpty()) {
                        this.f77172h = lVar.f77164h;
                        this.f77169e &= -5;
                    } else {
                        G();
                        this.f77172h.addAll(lVar.f77164h);
                    }
                }
                if (lVar.Y()) {
                    V(lVar.W());
                }
                if (lVar.Z()) {
                    W(lVar.X());
                }
                u(lVar);
                l(i().c(lVar.f77160d));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: U, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.l.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$l> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.l.f77159n     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$l r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.l) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$l r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.l) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.l.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$l$b");
            }

            public b V(t tVar) {
                if ((this.f77169e & 8) != 8 || this.f77173i == t.u()) {
                    this.f77173i = tVar;
                } else {
                    this.f77173i = t.G(this.f77173i).k(tVar).o();
                }
                this.f77169e |= 8;
                return this;
            }

            public b W(w wVar) {
                if ((this.f77169e & 16) != 16 || this.f77174j == w.r()) {
                    this.f77174j = wVar;
                } else {
                    this.f77174j = w.A(this.f77174j).k(wVar).o();
                }
                this.f77169e |= 16;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public kotlin.reflect.jvm.internal.impl.protobuf.h z() {
                return l.L();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                for (int i4 = 0; i4 < this.f77170f.size(); i4++) {
                    if (!I(i4).p()) {
                        return false;
                    }
                }
                for (int i5 = 0; i5 < this.f77171g.size(); i5++) {
                    if (!K(i5).p()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < this.f77172h.size(); i6++) {
                    if (!N(i6).p()) {
                        return false;
                    }
                }
                return (!R() || this.f77173i.p()) && s();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public l a() {
                l A = A();
                if (A.p()) {
                    return A;
                }
                throw new UninitializedMessageException(A);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return l.L();
            }
        }

        static {
            l lVar = new l(true);
            f77158m = lVar;
            lVar.a0();
        }

        public static l L() {
            return f77158m;
        }

        private void a0() {
            this.f77162f = Collections.emptyList();
            this.f77163g = Collections.emptyList();
            this.f77164h = Collections.emptyList();
            this.f77165i = t.u();
            this.f77166j = w.r();
        }

        public static b b0() {
            return b.v();
        }

        public static b c0(l lVar) {
            return b.v().k(lVar);
        }

        public static l e0(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws IOException {
            return f77159n.a(inputStream, fVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<l> B() {
            return f77159n;
        }

        public l M() {
            return f77158m;
        }

        public i N(int i4) {
            return this.f77162f.get(i4);
        }

        public int O() {
            return this.f77162f.size();
        }

        public List<i> P() {
            return this.f77162f;
        }

        public n Q(int i4) {
            return this.f77163g.get(i4);
        }

        public int R() {
            return this.f77163g.size();
        }

        public List<n> S() {
            return this.f77163g;
        }

        public r T(int i4) {
            return this.f77164h.get(i4);
        }

        public int U() {
            return this.f77164h.size();
        }

        public List<r> V() {
            return this.f77164h;
        }

        public t W() {
            return this.f77165i;
        }

        public w X() {
            return this.f77166j;
        }

        public boolean Y() {
            return (this.f77161e & 1) == 1;
        }

        public boolean Z() {
            return (this.f77161e & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            h.d<MessageType>.a x4 = x();
            for (int i4 = 0; i4 < this.f77162f.size(); i4++) {
                codedOutputStream.d0(3, this.f77162f.get(i4));
            }
            for (int i5 = 0; i5 < this.f77163g.size(); i5++) {
                codedOutputStream.d0(4, this.f77163g.get(i5));
            }
            for (int i6 = 0; i6 < this.f77164h.size(); i6++) {
                codedOutputStream.d0(5, this.f77164h.get(i6));
            }
            if ((this.f77161e & 1) == 1) {
                codedOutputStream.d0(30, this.f77165i);
            }
            if ((this.f77161e & 2) == 2) {
                codedOutputStream.d0(32, this.f77166j);
            }
            x4.a(200, codedOutputStream);
            codedOutputStream.i0(this.f77160d);
        }

        public b d0() {
            return b.v();
        }

        public b f0() {
            return c0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77167k;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            for (int i4 = 0; i4 < this.f77162f.size(); i4++) {
                if (!N(i4).p()) {
                    this.f77167k = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < this.f77163g.size(); i5++) {
                if (!Q(i5).p()) {
                    this.f77167k = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < this.f77164h.size(); i6++) {
                if (!T(i6).p()) {
                    this.f77167k = (byte) 0;
                    return false;
                }
            }
            if (Y() && !this.f77165i.p()) {
                this.f77167k = (byte) 0;
                return false;
            }
            if (n()) {
                this.f77167k = (byte) 1;
                return true;
            }
            this.f77167k = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return c0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77168l;
            if (i4 != -1) {
                return i4;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f77162f.size(); i6++) {
                i5 += CodedOutputStream.s(3, this.f77162f.get(i6));
            }
            for (int i7 = 0; i7 < this.f77163g.size(); i7++) {
                i5 += CodedOutputStream.s(4, this.f77163g.get(i7));
            }
            for (int i10 = 0; i10 < this.f77164h.size(); i10++) {
                i5 += CodedOutputStream.s(5, this.f77164h.get(i10));
            }
            if ((this.f77161e & 1) == 1) {
                i5 += CodedOutputStream.s(30, this.f77165i);
            }
            if ((this.f77161e & 2) == 2) {
                i5 += CodedOutputStream.s(32, this.f77166j);
            }
            int size = this.f77160d.size() + i5 + o();
            this.f77168l = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.v();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return f77158m;
        }

        private l(h.c<l, ?> cVar) {
            super(cVar);
            this.f77167k = (byte) -1;
            this.f77168l = -1;
            this.f77160d = cVar.i();
        }

        private l(boolean z4) {
            this.f77167k = (byte) -1;
            this.f77168l = -1;
            this.f77160d = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v8 */
        private l(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77167k = (byte) -1;
            this.f77168l = -1;
            a0();
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z4 = false;
            char c5 = 0;
            while (!z4) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 26) {
                                int i4 = (c5 == true ? 1 : 0) & 1;
                                c5 = c5;
                                if (i4 != 1) {
                                    this.f77162f = new ArrayList();
                                    c5 = (c5 == true ? 1 : 0) | 1;
                                }
                                this.f77162f.add(eVar.u(i.f77123x, fVar));
                            } else if (K == 34) {
                                int i5 = (c5 == true ? 1 : 0) & 2;
                                c5 = c5;
                                if (i5 != 2) {
                                    this.f77163g = new ArrayList();
                                    c5 = (c5 == true ? 1 : 0) | 2;
                                }
                                this.f77163g.add(eVar.u(n.f77191x, fVar));
                            } else if (K != 42) {
                                w.b bVar = null;
                                t.b bVar2 = null;
                                if (K == 242) {
                                    if ((this.f77161e & 1) == 1) {
                                        t tVar = this.f77165i;
                                        tVar.getClass();
                                        bVar2 = t.G(tVar);
                                    }
                                    t tVar2 = (t) eVar.u(t.f77349j, fVar);
                                    this.f77165i = tVar2;
                                    if (bVar2 != null) {
                                        bVar2.k(tVar2);
                                        this.f77165i = bVar2.o();
                                    }
                                    this.f77161e |= 1;
                                } else if (K != 258) {
                                    if (!k(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    if ((this.f77161e & 2) == 2) {
                                        w wVar = this.f77166j;
                                        wVar.getClass();
                                        bVar = w.A(wVar);
                                    }
                                    w wVar2 = (w) eVar.u(w.f77398h, fVar);
                                    this.f77166j = wVar2;
                                    if (bVar != null) {
                                        bVar.k(wVar2);
                                        this.f77166j = bVar.o();
                                    }
                                    this.f77161e |= 2;
                                }
                            } else {
                                int i6 = (c5 == true ? 1 : 0) & 4;
                                c5 = c5;
                                if (i6 != 4) {
                                    this.f77164h = new ArrayList();
                                    c5 = (c5 == true ? 1 : 0) | 4;
                                }
                                this.f77164h.add(eVar.u(r.f77304r, fVar));
                            }
                        }
                        z4 = true;
                    } catch (Throwable th) {
                        if (((c5 == true ? 1 : 0) & 1) == 1) {
                            this.f77162f = Collections.unmodifiableList(this.f77162f);
                        }
                        if (((c5 == true ? 1 : 0) & 2) == 2) {
                            this.f77163g = Collections.unmodifiableList(this.f77163g);
                        }
                        if (((c5 == true ? 1 : 0) & 4) == 4) {
                            this.f77164h = Collections.unmodifiableList(this.f77164h);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f77160d = w4.e();
                            throw th2;
                        }
                        this.f77160d = w4.e();
                        h();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.i(this);
                } catch (IOException e5) {
                    throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                }
            }
            if (((c5 == true ? 1 : 0) & 1) == 1) {
                this.f77162f = Collections.unmodifiableList(this.f77162f);
            }
            if (((c5 == true ? 1 : 0) & 2) == 2) {
                this.f77163g = Collections.unmodifiableList(this.f77163g);
            }
            if (((c5 == true ? 1 : 0) & 4) == 4) {
                this.f77164h = Collections.unmodifiableList(this.f77164h);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77160d = w4.e();
                throw th3;
            }
            this.f77160d = w4.e();
            h();
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class m extends h.d<m> implements kotlin.reflect.jvm.internal.impl.metadata.l {

        /* renamed from: l, reason: collision with root package name */
        private static final m f77175l;

        /* renamed from: m, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<m> f77176m = new C1134a();

        /* renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77177d;

        /* renamed from: e, reason: collision with root package name */
        private int f77178e;

        /* renamed from: f, reason: collision with root package name */
        private p f77179f;

        /* renamed from: g, reason: collision with root package name */
        private o f77180g;

        /* renamed from: h, reason: collision with root package name */
        private l f77181h;

        /* renamed from: i, reason: collision with root package name */
        private List<c> f77182i;

        /* renamed from: j, reason: collision with root package name */
        private byte f77183j;

        /* renamed from: k, reason: collision with root package name */
        private int f77184k;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$m$a, reason: collision with other inner class name */
        static class C1134a extends kotlin.reflect.jvm.internal.impl.protobuf.b<m> {
            C1134a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public m c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new m(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<m, b> implements kotlin.reflect.jvm.internal.impl.metadata.l {

            /* renamed from: e, reason: collision with root package name */
            private int f77185e;

            /* renamed from: f, reason: collision with root package name */
            private p f77186f = p.r();

            /* renamed from: g, reason: collision with root package name */
            private o f77187g = o.r();

            /* renamed from: h, reason: collision with root package name */
            private l f77188h = l.L();

            /* renamed from: i, reason: collision with root package name */
            private List<c> f77189i = Collections.emptyList();

            private b() {
            }

            private static b D() {
                return new b();
            }

            private void E() {
                if ((this.f77185e & 8) != 8) {
                    this.f77189i = new ArrayList(this.f77189i);
                    this.f77185e |= 8;
                }
            }

            private void N() {
            }

            static b v() {
                return new b();
            }

            public m A() {
                m mVar = new m(this);
                int i4 = this.f77185e;
                int i5 = (i4 & 1) != 1 ? 0 : 1;
                mVar.f77179f = this.f77186f;
                if ((i4 & 2) == 2) {
                    i5 |= 2;
                }
                mVar.f77180g = this.f77187g;
                if ((i4 & 4) == 4) {
                    i5 |= 4;
                }
                mVar.f77181h = this.f77188h;
                if ((this.f77185e & 8) == 8) {
                    this.f77189i = Collections.unmodifiableList(this.f77189i);
                    this.f77185e &= -9;
                }
                mVar.f77182i = this.f77189i;
                mVar.f77178e = i5;
                return mVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b o() {
                return new b().k(A());
            }

            public c F(int i4) {
                return this.f77189i.get(i4);
            }

            public int G() {
                return this.f77189i.size();
            }

            public m H() {
                return m.L();
            }

            public l I() {
                return this.f77188h;
            }

            public o J() {
                return this.f77187g;
            }

            public boolean K() {
                return (this.f77185e & 4) == 4;
            }

            public boolean M() {
                return (this.f77185e & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: O, reason: merged with bridge method [inline-methods] */
            public b k(m mVar) {
                if (mVar == m.L()) {
                    return this;
                }
                if (mVar.S()) {
                    T(mVar.P());
                }
                if (mVar.R()) {
                    S(mVar.O());
                }
                if (mVar.Q()) {
                    R(mVar.N());
                }
                if (!mVar.f77182i.isEmpty()) {
                    if (this.f77189i.isEmpty()) {
                        this.f77189i = mVar.f77182i;
                        this.f77185e &= -9;
                    } else {
                        E();
                        this.f77189i.addAll(mVar.f77182i);
                    }
                }
                u(mVar);
                l(i().c(mVar.f77177d));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: P, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.m.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$m> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.m.f77176m     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$m r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.m) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$m r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.m) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.m.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$m$b");
            }

            public b R(l lVar) {
                if ((this.f77185e & 4) != 4 || this.f77188h == l.L()) {
                    this.f77188h = lVar;
                } else {
                    this.f77188h = l.c0(this.f77188h).k(lVar).A();
                }
                this.f77185e |= 4;
                return this;
            }

            public b S(o oVar) {
                if ((this.f77185e & 2) != 2 || this.f77187g == o.r()) {
                    this.f77187g = oVar;
                } else {
                    this.f77187g = o.A(this.f77187g).k(oVar).o();
                }
                this.f77185e |= 2;
                return this;
            }

            public b T(p pVar) {
                if ((this.f77185e & 1) != 1 || this.f77186f == p.r()) {
                    this.f77186f = pVar;
                } else {
                    this.f77186f = p.A(this.f77186f).k(pVar).o();
                }
                this.f77185e |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public kotlin.reflect.jvm.internal.impl.protobuf.h z() {
                return m.L();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                if (M() && !this.f77187g.p()) {
                    return false;
                }
                if (K() && !this.f77188h.p()) {
                    return false;
                }
                for (int i4 = 0; i4 < this.f77189i.size(); i4++) {
                    if (!F(i4).p()) {
                        return false;
                    }
                }
                return s();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public m a() {
                m A = A();
                if (A.p()) {
                    return A;
                }
                throw new UninitializedMessageException(A);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return m.L();
            }
        }

        static {
            m mVar = new m(true);
            f77175l = mVar;
            mVar.T();
        }

        public static m L() {
            return f77175l;
        }

        private void T() {
            this.f77179f = p.r();
            this.f77180g = o.r();
            this.f77181h = l.L();
            this.f77182i = Collections.emptyList();
        }

        public static b U() {
            return b.v();
        }

        public static b V(m mVar) {
            return b.v().k(mVar);
        }

        public static m X(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws IOException {
            return f77176m.a(inputStream, fVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<m> B() {
            return f77176m;
        }

        public c I(int i4) {
            return this.f77182i.get(i4);
        }

        public int J() {
            return this.f77182i.size();
        }

        public List<c> K() {
            return this.f77182i;
        }

        public m M() {
            return f77175l;
        }

        public l N() {
            return this.f77181h;
        }

        public o O() {
            return this.f77180g;
        }

        public p P() {
            return this.f77179f;
        }

        public boolean Q() {
            return (this.f77178e & 4) == 4;
        }

        public boolean R() {
            return (this.f77178e & 2) == 2;
        }

        public boolean S() {
            return (this.f77178e & 1) == 1;
        }

        public b W() {
            return b.v();
        }

        public b Y() {
            return V(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            h.d<MessageType>.a x4 = x();
            if ((this.f77178e & 1) == 1) {
                codedOutputStream.d0(1, this.f77179f);
            }
            if ((this.f77178e & 2) == 2) {
                codedOutputStream.d0(2, this.f77180g);
            }
            if ((this.f77178e & 4) == 4) {
                codedOutputStream.d0(3, this.f77181h);
            }
            for (int i4 = 0; i4 < this.f77182i.size(); i4++) {
                codedOutputStream.d0(4, this.f77182i.get(i4));
            }
            x4.a(200, codedOutputStream);
            codedOutputStream.i0(this.f77177d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77183j;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            if (R() && !this.f77180g.p()) {
                this.f77183j = (byte) 0;
                return false;
            }
            if (Q() && !this.f77181h.p()) {
                this.f77183j = (byte) 0;
                return false;
            }
            for (int i4 = 0; i4 < this.f77182i.size(); i4++) {
                if (!I(i4).p()) {
                    this.f77183j = (byte) 0;
                    return false;
                }
            }
            if (n()) {
                this.f77183j = (byte) 1;
                return true;
            }
            this.f77183j = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return V(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77184k;
            if (i4 != -1) {
                return i4;
            }
            int s4 = (this.f77178e & 1) == 1 ? CodedOutputStream.s(1, this.f77179f) : 0;
            if ((this.f77178e & 2) == 2) {
                s4 += CodedOutputStream.s(2, this.f77180g);
            }
            if ((this.f77178e & 4) == 4) {
                s4 += CodedOutputStream.s(3, this.f77181h);
            }
            for (int i5 = 0; i5 < this.f77182i.size(); i5++) {
                s4 += CodedOutputStream.s(4, this.f77182i.get(i5));
            }
            int size = this.f77177d.size() + s4 + o();
            this.f77184k = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.v();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return f77175l;
        }

        private m(h.c<m, ?> cVar) {
            super(cVar);
            this.f77183j = (byte) -1;
            this.f77184k = -1;
            this.f77177d = cVar.i();
        }

        private m(boolean z4) {
            this.f77183j = (byte) -1;
            this.f77184k = -1;
            this.f77177d = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private m(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77183j = (byte) -1;
            this.f77184k = -1;
            T();
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z4 = false;
            char c5 = 0;
            while (!z4) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            l.b bVar = null;
                            p.b bVar2 = null;
                            o.b bVar3 = null;
                            if (K == 10) {
                                if ((this.f77178e & 1) == 1) {
                                    p pVar = this.f77179f;
                                    pVar.getClass();
                                    bVar2 = p.A(pVar);
                                }
                                p pVar2 = (p) eVar.u(p.f77248h, fVar);
                                this.f77179f = pVar2;
                                if (bVar2 != null) {
                                    bVar2.k(pVar2);
                                    this.f77179f = bVar2.o();
                                }
                                this.f77178e |= 1;
                            } else if (K == 18) {
                                if ((this.f77178e & 2) == 2) {
                                    o oVar = this.f77180g;
                                    oVar.getClass();
                                    bVar3 = o.A(oVar);
                                }
                                o oVar2 = (o) eVar.u(o.f77227h, fVar);
                                this.f77180g = oVar2;
                                if (bVar3 != null) {
                                    bVar3.k(oVar2);
                                    this.f77180g = bVar3.o();
                                }
                                this.f77178e |= 2;
                            } else if (K == 26) {
                                if ((this.f77178e & 4) == 4) {
                                    l lVar = this.f77181h;
                                    lVar.getClass();
                                    bVar = l.c0(lVar);
                                }
                                l lVar2 = (l) eVar.u(l.f77159n, fVar);
                                this.f77181h = lVar2;
                                if (bVar != null) {
                                    bVar.k(lVar2);
                                    this.f77181h = bVar.A();
                                }
                                this.f77178e |= 4;
                            } else if (K != 34) {
                                if (!k(eVar, J, fVar, K)) {
                                }
                            } else {
                                int i4 = (c5 == true ? 1 : 0) & '\b';
                                c5 = c5;
                                if (i4 != 8) {
                                    this.f77182i = new ArrayList();
                                    c5 = '\b';
                                }
                                this.f77182i.add(eVar.u(c.M, fVar));
                            }
                        }
                        z4 = true;
                    } catch (Throwable th) {
                        if (((c5 == true ? 1 : 0) & '\b') == 8) {
                            this.f77182i = Collections.unmodifiableList(this.f77182i);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f77177d = w4.e();
                            throw th2;
                        }
                        this.f77177d = w4.e();
                        h();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.i(this);
                } catch (IOException e5) {
                    throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                }
            }
            if (((c5 == true ? 1 : 0) & '\b') == 8) {
                this.f77182i = Collections.unmodifiableList(this.f77182i);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77177d = w4.e();
                throw th3;
            }
            this.f77177d = w4.e();
            h();
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class n extends h.d<n> implements kotlin.reflect.jvm.internal.impl.metadata.n {

        /* renamed from: w, reason: collision with root package name */
        private static final n f77190w;

        /* renamed from: x, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<n> f77191x = new C1135a();

        /* renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77192d;

        /* renamed from: e, reason: collision with root package name */
        private int f77193e;

        /* renamed from: f, reason: collision with root package name */
        private int f77194f;

        /* renamed from: g, reason: collision with root package name */
        private int f77195g;

        /* renamed from: h, reason: collision with root package name */
        private int f77196h;

        /* renamed from: i, reason: collision with root package name */
        private q f77197i;

        /* renamed from: j, reason: collision with root package name */
        private int f77198j;

        /* renamed from: k, reason: collision with root package name */
        private List<s> f77199k;

        /* renamed from: l, reason: collision with root package name */
        private q f77200l;

        /* renamed from: m, reason: collision with root package name */
        private int f77201m;

        /* renamed from: n, reason: collision with root package name */
        private List<q> f77202n;

        /* renamed from: o, reason: collision with root package name */
        private List<Integer> f77203o;

        /* renamed from: p, reason: collision with root package name */
        private int f77204p;

        /* renamed from: q, reason: collision with root package name */
        private u f77205q;

        /* renamed from: r, reason: collision with root package name */
        private int f77206r;

        /* renamed from: s, reason: collision with root package name */
        private int f77207s;

        /* renamed from: t, reason: collision with root package name */
        private List<Integer> f77208t;

        /* renamed from: u, reason: collision with root package name */
        private byte f77209u;

        /* renamed from: v, reason: collision with root package name */
        private int f77210v;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$n$a, reason: collision with other inner class name */
        static class C1135a extends kotlin.reflect.jvm.internal.impl.protobuf.b<n> {
            C1135a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public n c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new n(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<n, b> implements kotlin.reflect.jvm.internal.impl.metadata.n {

            /* renamed from: e, reason: collision with root package name */
            private int f77211e;

            /* renamed from: h, reason: collision with root package name */
            private int f77214h;

            /* renamed from: j, reason: collision with root package name */
            private int f77216j;

            /* renamed from: m, reason: collision with root package name */
            private int f77219m;

            /* renamed from: q, reason: collision with root package name */
            private int f77223q;

            /* renamed from: r, reason: collision with root package name */
            private int f77224r;

            /* renamed from: f, reason: collision with root package name */
            private int f77212f = 518;

            /* renamed from: g, reason: collision with root package name */
            private int f77213g = 2054;

            /* renamed from: i, reason: collision with root package name */
            private q f77215i = q.Y();

            /* renamed from: k, reason: collision with root package name */
            private List<s> f77217k = Collections.emptyList();

            /* renamed from: l, reason: collision with root package name */
            private q f77218l = q.Y();

            /* renamed from: n, reason: collision with root package name */
            private List<q> f77220n = Collections.emptyList();

            /* renamed from: o, reason: collision with root package name */
            private List<Integer> f77221o = Collections.emptyList();

            /* renamed from: p, reason: collision with root package name */
            private u f77222p = u.J();

            /* renamed from: s, reason: collision with root package name */
            private List<Integer> f77225s = Collections.emptyList();

            private b() {
            }

            private static b D() {
                return new b();
            }

            private void E() {
                if ((this.f77211e & 512) != 512) {
                    this.f77221o = new ArrayList(this.f77221o);
                    this.f77211e |= 512;
                }
            }

            private void F() {
                if ((this.f77211e & 256) != 256) {
                    this.f77220n = new ArrayList(this.f77220n);
                    this.f77211e |= 256;
                }
            }

            private void G() {
                if ((this.f77211e & 32) != 32) {
                    this.f77217k = new ArrayList(this.f77217k);
                    this.f77211e |= 32;
                }
            }

            private void H() {
                if ((this.f77211e & 8192) != 8192) {
                    this.f77225s = new ArrayList(this.f77225s);
                    this.f77211e |= 8192;
                }
            }

            private void W() {
            }

            static b v() {
                return new b();
            }

            public n A() {
                n nVar = new n(this);
                int i4 = this.f77211e;
                int i5 = (i4 & 1) != 1 ? 0 : 1;
                nVar.f77194f = this.f77212f;
                if ((i4 & 2) == 2) {
                    i5 |= 2;
                }
                nVar.f77195g = this.f77213g;
                if ((i4 & 4) == 4) {
                    i5 |= 4;
                }
                nVar.f77196h = this.f77214h;
                if ((i4 & 8) == 8) {
                    i5 |= 8;
                }
                nVar.f77197i = this.f77215i;
                if ((i4 & 16) == 16) {
                    i5 |= 16;
                }
                nVar.f77198j = this.f77216j;
                if ((this.f77211e & 32) == 32) {
                    this.f77217k = Collections.unmodifiableList(this.f77217k);
                    this.f77211e &= -33;
                }
                nVar.f77199k = this.f77217k;
                if ((i4 & 64) == 64) {
                    i5 |= 32;
                }
                nVar.f77200l = this.f77218l;
                if ((i4 & 128) == 128) {
                    i5 |= 64;
                }
                nVar.f77201m = this.f77219m;
                if ((this.f77211e & 256) == 256) {
                    this.f77220n = Collections.unmodifiableList(this.f77220n);
                    this.f77211e &= -257;
                }
                nVar.f77202n = this.f77220n;
                if ((this.f77211e & 512) == 512) {
                    this.f77221o = Collections.unmodifiableList(this.f77221o);
                    this.f77211e &= -513;
                }
                nVar.f77203o = this.f77221o;
                if ((i4 & 1024) == 1024) {
                    i5 |= 128;
                }
                nVar.f77205q = this.f77222p;
                if ((i4 & 2048) == 2048) {
                    i5 |= 256;
                }
                nVar.f77206r = this.f77223q;
                if ((i4 & 4096) == 4096) {
                    i5 |= 512;
                }
                nVar.f77207s = this.f77224r;
                if ((this.f77211e & 8192) == 8192) {
                    this.f77225s = Collections.unmodifiableList(this.f77225s);
                    this.f77211e &= -8193;
                }
                nVar.f77208t = this.f77225s;
                nVar.f77193e = i5;
                return nVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b o() {
                return new b().k(A());
            }

            public q I(int i4) {
                return this.f77220n.get(i4);
            }

            public int J() {
                return this.f77220n.size();
            }

            public n K() {
                return n.Z();
            }

            public q M() {
                return this.f77218l;
            }

            public q N() {
                return this.f77215i;
            }

            public u O() {
                return this.f77222p;
            }

            public s P(int i4) {
                return this.f77217k.get(i4);
            }

            public int R() {
                return this.f77217k.size();
            }

            public boolean S() {
                return (this.f77211e & 4) == 4;
            }

            public boolean T() {
                return (this.f77211e & 64) == 64;
            }

            public boolean U() {
                return (this.f77211e & 8) == 8;
            }

            public boolean V() {
                return (this.f77211e & 1024) == 1024;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: Y, reason: merged with bridge method [inline-methods] */
            public b k(n nVar) {
                if (nVar == n.Z()) {
                    return this;
                }
                if (nVar.p0()) {
                    d0(nVar.b0());
                }
                if (nVar.t0()) {
                    g0(nVar.e0());
                }
                if (nVar.s0()) {
                    f0(nVar.d0());
                }
                if (nVar.w0()) {
                    b0(nVar.h0());
                }
                if (nVar.x0()) {
                    i0(nVar.i0());
                }
                if (!nVar.f77199k.isEmpty()) {
                    if (this.f77217k.isEmpty()) {
                        this.f77217k = nVar.f77199k;
                        this.f77211e &= -33;
                    } else {
                        G();
                        this.f77217k.addAll(nVar.f77199k);
                    }
                }
                if (nVar.u0()) {
                    a0(nVar.f0());
                }
                if (nVar.v0()) {
                    h0(nVar.g0());
                }
                if (!nVar.f77202n.isEmpty()) {
                    if (this.f77220n.isEmpty()) {
                        this.f77220n = nVar.f77202n;
                        this.f77211e &= -257;
                    } else {
                        F();
                        this.f77220n.addAll(nVar.f77202n);
                    }
                }
                if (!nVar.f77203o.isEmpty()) {
                    if (this.f77221o.isEmpty()) {
                        this.f77221o = nVar.f77203o;
                        this.f77211e &= -513;
                    } else {
                        E();
                        this.f77221o.addAll(nVar.f77203o);
                    }
                }
                if (nVar.z0()) {
                    c0(nVar.k0());
                }
                if (nVar.q0()) {
                    e0(nVar.c0());
                }
                if (nVar.y0()) {
                    k0(nVar.j0());
                }
                if (!nVar.f77208t.isEmpty()) {
                    if (this.f77225s.isEmpty()) {
                        this.f77225s = nVar.f77208t;
                        this.f77211e &= -8193;
                    } else {
                        H();
                        this.f77225s.addAll(nVar.f77208t);
                    }
                }
                u(nVar);
                l(i().c(nVar.f77192d));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: Z, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.n.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$n> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.n.f77191x     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$n r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.n) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$n r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.n) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.n.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$n$b");
            }

            public b a0(q qVar) {
                if ((this.f77211e & 64) != 64 || this.f77218l == q.Y()) {
                    this.f77218l = qVar;
                } else {
                    this.f77218l = q.A0(this.f77218l).k(qVar).A();
                }
                this.f77211e |= 64;
                return this;
            }

            public b b0(q qVar) {
                if ((this.f77211e & 8) != 8 || this.f77215i == q.Y()) {
                    this.f77215i = qVar;
                } else {
                    this.f77215i = q.A0(this.f77215i).k(qVar).A();
                }
                this.f77211e |= 8;
                return this;
            }

            public b c0(u uVar) {
                if ((this.f77211e & 1024) != 1024 || this.f77222p == u.J()) {
                    this.f77222p = uVar;
                } else {
                    this.f77222p = u.Z(this.f77222p).k(uVar).A();
                }
                this.f77211e |= 1024;
                return this;
            }

            public b d0(int i4) {
                this.f77211e |= 1;
                this.f77212f = i4;
                return this;
            }

            public b e0(int i4) {
                this.f77211e |= 2048;
                this.f77223q = i4;
                return this;
            }

            public b f0(int i4) {
                this.f77211e |= 4;
                this.f77214h = i4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public kotlin.reflect.jvm.internal.impl.protobuf.h z() {
                return n.Z();
            }

            public b g0(int i4) {
                this.f77211e |= 2;
                this.f77213g = i4;
                return this;
            }

            public b h0(int i4) {
                this.f77211e |= 128;
                this.f77219m = i4;
                return this;
            }

            public b i0(int i4) {
                this.f77211e |= 16;
                this.f77216j = i4;
                return this;
            }

            public b k0(int i4) {
                this.f77211e |= 4096;
                this.f77224r = i4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                if (!S()) {
                    return false;
                }
                if (U() && !this.f77215i.p()) {
                    return false;
                }
                for (int i4 = 0; i4 < this.f77217k.size(); i4++) {
                    if (!P(i4).p()) {
                        return false;
                    }
                }
                if (T() && !this.f77218l.p()) {
                    return false;
                }
                for (int i5 = 0; i5 < this.f77220n.size(); i5++) {
                    if (!I(i5).p()) {
                        return false;
                    }
                }
                return (!V() || this.f77222p.p()) && s();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public n a() {
                n A = A();
                if (A.p()) {
                    return A;
                }
                throw new UninitializedMessageException(A);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return n.Z();
            }
        }

        static {
            n nVar = new n(true);
            f77190w = nVar;
            nVar.A0();
        }

        private void A0() {
            this.f77194f = 518;
            this.f77195g = 2054;
            this.f77196h = 0;
            this.f77197i = q.Y();
            this.f77198j = 0;
            this.f77199k = Collections.emptyList();
            this.f77200l = q.Y();
            this.f77201m = 0;
            this.f77202n = Collections.emptyList();
            this.f77203o = Collections.emptyList();
            this.f77205q = u.J();
            this.f77206r = 0;
            this.f77207s = 0;
            this.f77208t = Collections.emptyList();
        }

        public static b B0() {
            return b.v();
        }

        public static b C0(n nVar) {
            return b.v().k(nVar);
        }

        public static n Z() {
            return f77190w;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<n> B() {
            return f77191x;
        }

        public b D0() {
            return b.v();
        }

        public b E0() {
            return C0(this);
        }

        public q V(int i4) {
            return this.f77202n.get(i4);
        }

        public int W() {
            return this.f77202n.size();
        }

        public List<Integer> X() {
            return this.f77203o;
        }

        public List<q> Y() {
            return this.f77202n;
        }

        public n a0() {
            return f77190w;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            h.d<MessageType>.a x4 = x();
            if ((this.f77193e & 2) == 2) {
                codedOutputStream.a0(1, this.f77195g);
            }
            if ((this.f77193e & 4) == 4) {
                codedOutputStream.a0(2, this.f77196h);
            }
            if ((this.f77193e & 8) == 8) {
                codedOutputStream.d0(3, this.f77197i);
            }
            for (int i4 = 0; i4 < this.f77199k.size(); i4++) {
                codedOutputStream.d0(4, this.f77199k.get(i4));
            }
            if ((this.f77193e & 32) == 32) {
                codedOutputStream.d0(5, this.f77200l);
            }
            if ((this.f77193e & 128) == 128) {
                codedOutputStream.d0(6, this.f77205q);
            }
            if ((this.f77193e & 256) == 256) {
                codedOutputStream.a0(7, this.f77206r);
            }
            if ((this.f77193e & 512) == 512) {
                codedOutputStream.a0(8, this.f77207s);
            }
            if ((this.f77193e & 16) == 16) {
                codedOutputStream.a0(9, this.f77198j);
            }
            if ((this.f77193e & 64) == 64) {
                codedOutputStream.a0(10, this.f77201m);
            }
            if ((this.f77193e & 1) == 1) {
                codedOutputStream.a0(11, this.f77194f);
            }
            for (int i5 = 0; i5 < this.f77202n.size(); i5++) {
                codedOutputStream.d0(12, this.f77202n.get(i5));
            }
            if (this.f77203o.size() > 0) {
                codedOutputStream.o0(106);
                codedOutputStream.o0(this.f77204p);
            }
            for (int i6 = 0; i6 < this.f77203o.size(); i6++) {
                codedOutputStream.b0(this.f77203o.get(i6).intValue());
            }
            for (int i7 = 0; i7 < this.f77208t.size(); i7++) {
                codedOutputStream.a0(31, this.f77208t.get(i7).intValue());
            }
            x4.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f77192d);
        }

        public int b0() {
            return this.f77194f;
        }

        public int c0() {
            return this.f77206r;
        }

        public int d0() {
            return this.f77196h;
        }

        public int e0() {
            return this.f77195g;
        }

        public q f0() {
            return this.f77200l;
        }

        public int g0() {
            return this.f77201m;
        }

        public q h0() {
            return this.f77197i;
        }

        public int i0() {
            return this.f77198j;
        }

        public int j0() {
            return this.f77207s;
        }

        public u k0() {
            return this.f77205q;
        }

        public s l0(int i4) {
            return this.f77199k.get(i4);
        }

        public int m0() {
            return this.f77199k.size();
        }

        public List<s> n0() {
            return this.f77199k;
        }

        public List<Integer> o0() {
            return this.f77208t;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77209u;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            if (!s0()) {
                this.f77209u = (byte) 0;
                return false;
            }
            if (w0() && !this.f77197i.p()) {
                this.f77209u = (byte) 0;
                return false;
            }
            for (int i4 = 0; i4 < this.f77199k.size(); i4++) {
                if (!l0(i4).p()) {
                    this.f77209u = (byte) 0;
                    return false;
                }
            }
            if (u0() && !this.f77200l.p()) {
                this.f77209u = (byte) 0;
                return false;
            }
            for (int i5 = 0; i5 < this.f77202n.size(); i5++) {
                if (!V(i5).p()) {
                    this.f77209u = (byte) 0;
                    return false;
                }
            }
            if (z0() && !this.f77205q.p()) {
                this.f77209u = (byte) 0;
                return false;
            }
            if (n()) {
                this.f77209u = (byte) 1;
                return true;
            }
            this.f77209u = (byte) 0;
            return false;
        }

        public boolean p0() {
            return (this.f77193e & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return C0(this);
        }

        public boolean q0() {
            return (this.f77193e & 256) == 256;
        }

        public boolean s0() {
            return (this.f77193e & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77210v;
            if (i4 != -1) {
                return i4;
            }
            int o4 = (this.f77193e & 2) == 2 ? CodedOutputStream.o(1, this.f77195g) : 0;
            if ((this.f77193e & 4) == 4) {
                o4 += CodedOutputStream.o(2, this.f77196h);
            }
            if ((this.f77193e & 8) == 8) {
                o4 += CodedOutputStream.s(3, this.f77197i);
            }
            for (int i5 = 0; i5 < this.f77199k.size(); i5++) {
                o4 += CodedOutputStream.s(4, this.f77199k.get(i5));
            }
            if ((this.f77193e & 32) == 32) {
                o4 += CodedOutputStream.s(5, this.f77200l);
            }
            if ((this.f77193e & 128) == 128) {
                o4 += CodedOutputStream.s(6, this.f77205q);
            }
            if ((this.f77193e & 256) == 256) {
                o4 += CodedOutputStream.o(7, this.f77206r);
            }
            if ((this.f77193e & 512) == 512) {
                o4 += CodedOutputStream.o(8, this.f77207s);
            }
            if ((this.f77193e & 16) == 16) {
                o4 += CodedOutputStream.o(9, this.f77198j);
            }
            if ((this.f77193e & 64) == 64) {
                o4 += CodedOutputStream.o(10, this.f77201m);
            }
            if ((this.f77193e & 1) == 1) {
                o4 += CodedOutputStream.o(11, this.f77194f);
            }
            for (int i6 = 0; i6 < this.f77202n.size(); i6++) {
                o4 += CodedOutputStream.s(12, this.f77202n.get(i6));
            }
            int i7 = 0;
            for (int i10 = 0; i10 < this.f77203o.size(); i10++) {
                i7 += CodedOutputStream.p(this.f77203o.get(i10).intValue());
            }
            int i11 = o4 + i7;
            if (!this.f77203o.isEmpty()) {
                i11 = i11 + 1 + CodedOutputStream.p(i7);
            }
            this.f77204p = i7;
            int i12 = 0;
            for (int i13 = 0; i13 < this.f77208t.size(); i13++) {
                i12 += CodedOutputStream.p(this.f77208t.get(i13).intValue());
            }
            int size = this.f77192d.size() + androidx.content.preferences.protobuf.n.a(this.f77208t, 2, i11 + i12) + o();
            this.f77210v = size;
            return size;
        }

        public boolean t0() {
            return (this.f77193e & 2) == 2;
        }

        public boolean u0() {
            return (this.f77193e & 32) == 32;
        }

        public boolean v0() {
            return (this.f77193e & 64) == 64;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.v();
        }

        public boolean w0() {
            return (this.f77193e & 8) == 8;
        }

        public boolean x0() {
            return (this.f77193e & 16) == 16;
        }

        public boolean y0() {
            return (this.f77193e & 512) == 512;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return f77190w;
        }

        public boolean z0() {
            return (this.f77193e & 128) == 128;
        }

        private n(h.c<n, ?> cVar) {
            super(cVar);
            this.f77204p = -1;
            this.f77209u = (byte) -1;
            this.f77210v = -1;
            this.f77192d = cVar.i();
        }

        private n(boolean z4) {
            this.f77204p = -1;
            this.f77209u = (byte) -1;
            this.f77210v = -1;
            this.f77192d = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        private n(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77204p = -1;
            this.f77209u = (byte) -1;
            this.f77210v = -1;
            A0();
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z4 = false;
            char c5 = 0;
            while (true) {
                ?? r5 = 256;
                if (!z4) {
                    try {
                        try {
                            int K = eVar.K();
                            q.c cVar = null;
                            u.b bVar = null;
                            q.c cVar2 = null;
                            switch (K) {
                                case 0:
                                    z4 = true;
                                case 8:
                                    this.f77193e |= 2;
                                    this.f77195g = eVar.A();
                                case 16:
                                    this.f77193e |= 4;
                                    this.f77196h = eVar.A();
                                case 26:
                                    if ((this.f77193e & 8) == 8) {
                                        q qVar = this.f77197i;
                                        qVar.getClass();
                                        cVar = q.A0(qVar);
                                    }
                                    q qVar2 = (q) eVar.u(q.f77256w, fVar);
                                    this.f77197i = qVar2;
                                    if (cVar != null) {
                                        cVar.k(qVar2);
                                        this.f77197i = cVar.A();
                                    }
                                    this.f77193e |= 8;
                                case 34:
                                    int i4 = (c5 == true ? 1 : 0) & 32;
                                    c5 = c5;
                                    if (i4 != 32) {
                                        this.f77199k = new ArrayList();
                                        c5 = (c5 == true ? 1 : 0) | ' ';
                                    }
                                    this.f77199k.add(eVar.u(s.f77329p, fVar));
                                case 42:
                                    if ((this.f77193e & 32) == 32) {
                                        q qVar3 = this.f77200l;
                                        qVar3.getClass();
                                        cVar2 = q.A0(qVar3);
                                    }
                                    q qVar4 = (q) eVar.u(q.f77256w, fVar);
                                    this.f77200l = qVar4;
                                    if (cVar2 != null) {
                                        cVar2.k(qVar4);
                                        this.f77200l = cVar2.A();
                                    }
                                    this.f77193e |= 32;
                                case 50:
                                    if ((this.f77193e & 128) == 128) {
                                        u uVar = this.f77205q;
                                        uVar.getClass();
                                        bVar = u.Z(uVar);
                                    }
                                    u uVar2 = (u) eVar.u(u.f77360o, fVar);
                                    this.f77205q = uVar2;
                                    if (bVar != null) {
                                        bVar.k(uVar2);
                                        this.f77205q = bVar.A();
                                    }
                                    this.f77193e |= 128;
                                case 56:
                                    this.f77193e |= 256;
                                    this.f77206r = eVar.A();
                                case 64:
                                    this.f77193e |= 512;
                                    this.f77207s = eVar.A();
                                case 72:
                                    this.f77193e |= 16;
                                    this.f77198j = eVar.A();
                                case 80:
                                    this.f77193e |= 64;
                                    this.f77201m = eVar.A();
                                case 88:
                                    this.f77193e |= 1;
                                    this.f77194f = eVar.A();
                                case 98:
                                    int i5 = (c5 == true ? 1 : 0) & 256;
                                    c5 = c5;
                                    if (i5 != 256) {
                                        this.f77202n = new ArrayList();
                                        c5 = (c5 == true ? 1 : 0) | 256;
                                    }
                                    this.f77202n.add(eVar.u(q.f77256w, fVar));
                                case 104:
                                    int i6 = (c5 == true ? 1 : 0) & 512;
                                    c5 = c5;
                                    if (i6 != 512) {
                                        this.f77203o = new ArrayList();
                                        c5 = (c5 == true ? 1 : 0) | 512;
                                    }
                                    this.f77203o.add(Integer.valueOf(eVar.A()));
                                case 106:
                                    int j4 = eVar.j(eVar.A());
                                    int i7 = (c5 == true ? 1 : 0) & 512;
                                    c5 = c5;
                                    if (i7 != 512) {
                                        c5 = c5;
                                        if (eVar.e() > 0) {
                                            this.f77203o = new ArrayList();
                                            c5 = (c5 == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.f77203o.add(Integer.valueOf(eVar.A()));
                                    }
                                    eVar.i(j4);
                                case 248:
                                    int i10 = (c5 == true ? 1 : 0) & 8192;
                                    c5 = c5;
                                    if (i10 != 8192) {
                                        this.f77208t = new ArrayList();
                                        c5 = (c5 == true ? 1 : 0) | 8192;
                                    }
                                    this.f77208t.add(Integer.valueOf(eVar.A()));
                                case 250:
                                    int j5 = eVar.j(eVar.A());
                                    int i11 = (c5 == true ? 1 : 0) & 8192;
                                    c5 = c5;
                                    if (i11 != 8192) {
                                        c5 = c5;
                                        if (eVar.e() > 0) {
                                            this.f77208t = new ArrayList();
                                            c5 = (c5 == true ? 1 : 0) | 8192;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.f77208t.add(Integer.valueOf(eVar.A()));
                                    }
                                    eVar.i(j5);
                                default:
                                    r5 = k(eVar, J, fVar, K);
                                    if (r5 == 0) {
                                        z4 = true;
                                    }
                            }
                        } catch (Throwable th) {
                            if (((c5 == true ? 1 : 0) & 32) == 32) {
                                this.f77199k = Collections.unmodifiableList(this.f77199k);
                            }
                            if (((c5 == true ? 1 : 0) & 256) == r5) {
                                this.f77202n = Collections.unmodifiableList(this.f77202n);
                            }
                            if (((c5 == true ? 1 : 0) & 512) == 512) {
                                this.f77203o = Collections.unmodifiableList(this.f77203o);
                            }
                            if (((c5 == true ? 1 : 0) & 8192) == 8192) {
                                this.f77208t = Collections.unmodifiableList(this.f77208t);
                            }
                            try {
                                J.I();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f77192d = w4.e();
                                throw th2;
                            }
                            this.f77192d = w4.e();
                            h();
                            throw th;
                        }
                    } catch (InvalidProtocolBufferException e4) {
                        throw e4.i(this);
                    } catch (IOException e5) {
                        throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                    }
                } else {
                    if (((c5 == true ? 1 : 0) & 32) == 32) {
                        this.f77199k = Collections.unmodifiableList(this.f77199k);
                    }
                    if (((c5 == true ? 1 : 0) & 256) == 256) {
                        this.f77202n = Collections.unmodifiableList(this.f77202n);
                    }
                    if (((c5 == true ? 1 : 0) & 512) == 512) {
                        this.f77203o = Collections.unmodifiableList(this.f77203o);
                    }
                    if (((c5 == true ? 1 : 0) & 8192) == 8192) {
                        this.f77208t = Collections.unmodifiableList(this.f77208t);
                    }
                    try {
                        J.I();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.f77192d = w4.e();
                        throw th3;
                    }
                    this.f77192d = w4.e();
                    h();
                    return;
                }
            }
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class q extends h.d<q> implements kotlin.reflect.jvm.internal.impl.metadata.t {

        /* renamed from: v, reason: collision with root package name */
        private static final q f77255v;

        /* renamed from: w, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<q> f77256w = new C1141a();

        /* renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77257d;

        /* renamed from: e, reason: collision with root package name */
        private int f77258e;

        /* renamed from: f, reason: collision with root package name */
        private List<b> f77259f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f77260g;

        /* renamed from: h, reason: collision with root package name */
        private int f77261h;

        /* renamed from: i, reason: collision with root package name */
        private q f77262i;

        /* renamed from: j, reason: collision with root package name */
        private int f77263j;

        /* renamed from: k, reason: collision with root package name */
        private int f77264k;

        /* renamed from: l, reason: collision with root package name */
        private int f77265l;

        /* renamed from: m, reason: collision with root package name */
        private int f77266m;

        /* renamed from: n, reason: collision with root package name */
        private int f77267n;

        /* renamed from: o, reason: collision with root package name */
        private q f77268o;

        /* renamed from: p, reason: collision with root package name */
        private int f77269p;

        /* renamed from: q, reason: collision with root package name */
        private q f77270q;

        /* renamed from: r, reason: collision with root package name */
        private int f77271r;

        /* renamed from: s, reason: collision with root package name */
        private int f77272s;

        /* renamed from: t, reason: collision with root package name */
        private byte f77273t;

        /* renamed from: u, reason: collision with root package name */
        private int f77274u;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$q$a, reason: collision with other inner class name */
        static class C1141a extends kotlin.reflect.jvm.internal.impl.protobuf.b<q> {
            C1141a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public q c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new q(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class c extends h.c<q, c> implements kotlin.reflect.jvm.internal.impl.metadata.t {

            /* renamed from: e, reason: collision with root package name */
            private int f77288e;

            /* renamed from: g, reason: collision with root package name */
            private boolean f77290g;

            /* renamed from: h, reason: collision with root package name */
            private int f77291h;

            /* renamed from: j, reason: collision with root package name */
            private int f77293j;

            /* renamed from: k, reason: collision with root package name */
            private int f77294k;

            /* renamed from: l, reason: collision with root package name */
            private int f77295l;

            /* renamed from: m, reason: collision with root package name */
            private int f77296m;

            /* renamed from: n, reason: collision with root package name */
            private int f77297n;

            /* renamed from: p, reason: collision with root package name */
            private int f77299p;

            /* renamed from: r, reason: collision with root package name */
            private int f77301r;

            /* renamed from: s, reason: collision with root package name */
            private int f77302s;

            /* renamed from: f, reason: collision with root package name */
            private List<b> f77289f = Collections.emptyList();

            /* renamed from: i, reason: collision with root package name */
            private q f77292i = q.Y();

            /* renamed from: o, reason: collision with root package name */
            private q f77298o = q.Y();

            /* renamed from: q, reason: collision with root package name */
            private q f77300q = q.Y();

            private c() {
            }

            private static c D() {
                return new c();
            }

            private void E() {
                if ((this.f77288e & 1) != 1) {
                    this.f77289f = new ArrayList(this.f77289f);
                    this.f77288e |= 1;
                }
            }

            private void P() {
            }

            static c v() {
                return new c();
            }

            public q A() {
                q qVar = new q(this);
                int i4 = this.f77288e;
                if ((i4 & 1) == 1) {
                    this.f77289f = Collections.unmodifiableList(this.f77289f);
                    this.f77288e &= -2;
                }
                qVar.f77259f = this.f77289f;
                int i5 = (i4 & 2) != 2 ? 0 : 1;
                qVar.f77260g = this.f77290g;
                if ((i4 & 4) == 4) {
                    i5 |= 2;
                }
                qVar.f77261h = this.f77291h;
                if ((i4 & 8) == 8) {
                    i5 |= 4;
                }
                qVar.f77262i = this.f77292i;
                if ((i4 & 16) == 16) {
                    i5 |= 8;
                }
                qVar.f77263j = this.f77293j;
                if ((i4 & 32) == 32) {
                    i5 |= 16;
                }
                qVar.f77264k = this.f77294k;
                if ((i4 & 64) == 64) {
                    i5 |= 32;
                }
                qVar.f77265l = this.f77295l;
                if ((i4 & 128) == 128) {
                    i5 |= 64;
                }
                qVar.f77266m = this.f77296m;
                if ((i4 & 256) == 256) {
                    i5 |= 128;
                }
                qVar.f77267n = this.f77297n;
                if ((i4 & 512) == 512) {
                    i5 |= 256;
                }
                qVar.f77268o = this.f77298o;
                if ((i4 & 1024) == 1024) {
                    i5 |= 512;
                }
                qVar.f77269p = this.f77299p;
                if ((i4 & 2048) == 2048) {
                    i5 |= 1024;
                }
                qVar.f77270q = this.f77300q;
                if ((i4 & 4096) == 4096) {
                    i5 |= 2048;
                }
                qVar.f77271r = this.f77301r;
                if ((i4 & 8192) == 8192) {
                    i5 |= 4096;
                }
                qVar.f77272s = this.f77302s;
                qVar.f77258e = i5;
                return qVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public c o() {
                return new c().k(A());
            }

            public q F() {
                return this.f77300q;
            }

            public b G(int i4) {
                return this.f77289f.get(i4);
            }

            public int H() {
                return this.f77289f.size();
            }

            public q I() {
                return q.Y();
            }

            public q J() {
                return this.f77292i;
            }

            public q K() {
                return this.f77298o;
            }

            public boolean M() {
                return (this.f77288e & 2048) == 2048;
            }

            public boolean N() {
                return (this.f77288e & 8) == 8;
            }

            public boolean O() {
                return (this.f77288e & 512) == 512;
            }

            public c R(q qVar) {
                if ((this.f77288e & 2048) != 2048 || this.f77300q == q.Y()) {
                    this.f77300q = qVar;
                } else {
                    this.f77300q = q.A0(this.f77300q).k(qVar).A();
                }
                this.f77288e |= 2048;
                return this;
            }

            public c S(q qVar) {
                if ((this.f77288e & 8) != 8 || this.f77292i == q.Y()) {
                    this.f77292i = qVar;
                } else {
                    this.f77292i = q.A0(this.f77292i).k(qVar).A();
                }
                this.f77288e |= 8;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: T, reason: merged with bridge method [inline-methods] */
            public c k(q qVar) {
                if (qVar == q.Y()) {
                    return this;
                }
                if (!qVar.f77259f.isEmpty()) {
                    if (this.f77289f.isEmpty()) {
                        this.f77289f = qVar.f77259f;
                        this.f77288e &= -2;
                    } else {
                        E();
                        this.f77289f.addAll(qVar.f77259f);
                    }
                }
                if (qVar.s0()) {
                    c0(qVar.e0());
                }
                if (qVar.o0()) {
                    a0(qVar.b0());
                }
                if (qVar.p0()) {
                    S(qVar.c0());
                }
                if (qVar.q0()) {
                    b0(qVar.d0());
                }
                if (qVar.m0()) {
                    Y(qVar.X());
                }
                if (qVar.w0()) {
                    f0(qVar.i0());
                }
                if (qVar.x0()) {
                    g0(qVar.j0());
                }
                if (qVar.v0()) {
                    e0(qVar.h0());
                }
                if (qVar.t0()) {
                    V(qVar.f0());
                }
                if (qVar.u0()) {
                    d0(qVar.g0());
                }
                if (qVar.k0()) {
                    R(qVar.S());
                }
                if (qVar.l0()) {
                    W(qVar.T());
                }
                if (qVar.n0()) {
                    Z(qVar.a0());
                }
                u(qVar);
                l(i().c(qVar.f77257d));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: U, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.q.c r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$q> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.q.f77256w     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$q r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.q) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$q r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.q) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.q.c.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$q$c");
            }

            public c V(q qVar) {
                if ((this.f77288e & 512) != 512 || this.f77298o == q.Y()) {
                    this.f77298o = qVar;
                } else {
                    this.f77298o = q.A0(this.f77298o).k(qVar).A();
                }
                this.f77288e |= 512;
                return this;
            }

            public c W(int i4) {
                this.f77288e |= 4096;
                this.f77301r = i4;
                return this;
            }

            public c Y(int i4) {
                this.f77288e |= 32;
                this.f77294k = i4;
                return this;
            }

            public c Z(int i4) {
                this.f77288e |= 8192;
                this.f77302s = i4;
                return this;
            }

            public c a0(int i4) {
                this.f77288e |= 4;
                this.f77291h = i4;
                return this;
            }

            public c b0(int i4) {
                this.f77288e |= 16;
                this.f77293j = i4;
                return this;
            }

            public c c0(boolean z4) {
                this.f77288e |= 2;
                this.f77290g = z4;
                return this;
            }

            public c d0(int i4) {
                this.f77288e |= 1024;
                this.f77299p = i4;
                return this;
            }

            public c e0(int i4) {
                this.f77288e |= 256;
                this.f77297n = i4;
                return this;
            }

            public c f0(int i4) {
                this.f77288e |= 64;
                this.f77295l = i4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public kotlin.reflect.jvm.internal.impl.protobuf.h z() {
                return q.Y();
            }

            public c g0(int i4) {
                this.f77288e |= 128;
                this.f77296m = i4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                for (int i4 = 0; i4 < this.f77289f.size(); i4++) {
                    if (!G(i4).p()) {
                        return false;
                    }
                }
                if (N() && !this.f77292i.p()) {
                    return false;
                }
                if (!O() || this.f77298o.p()) {
                    return (!M() || this.f77300q.p()) && s();
                }
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public q a() {
                q A = A();
                if (A.p()) {
                    return A;
                }
                throw new UninitializedMessageException(A);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return q.Y();
            }
        }

        static {
            q qVar = new q(true);
            f77255v = qVar;
            qVar.y0();
        }

        public static c A0(q qVar) {
            return c.v().k(qVar);
        }

        public static q Y() {
            return f77255v;
        }

        private void y0() {
            this.f77259f = Collections.emptyList();
            this.f77260g = false;
            this.f77261h = 0;
            q qVar = f77255v;
            this.f77262i = qVar;
            this.f77263j = 0;
            this.f77264k = 0;
            this.f77265l = 0;
            this.f77266m = 0;
            this.f77267n = 0;
            this.f77268o = qVar;
            this.f77269p = 0;
            this.f77270q = qVar;
            this.f77271r = 0;
            this.f77272s = 0;
        }

        public static c z0() {
            return c.v();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<q> B() {
            return f77256w;
        }

        public c B0() {
            return c.v();
        }

        public c C0() {
            return A0(this);
        }

        public q S() {
            return this.f77270q;
        }

        public int T() {
            return this.f77271r;
        }

        public b U(int i4) {
            return this.f77259f.get(i4);
        }

        public int V() {
            return this.f77259f.size();
        }

        public List<b> W() {
            return this.f77259f;
        }

        public int X() {
            return this.f77264k;
        }

        public q Z() {
            return f77255v;
        }

        public int a0() {
            return this.f77272s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            h.d<MessageType>.a x4 = x();
            if ((this.f77258e & 4096) == 4096) {
                codedOutputStream.a0(1, this.f77272s);
            }
            for (int i4 = 0; i4 < this.f77259f.size(); i4++) {
                codedOutputStream.d0(2, this.f77259f.get(i4));
            }
            if ((this.f77258e & 1) == 1) {
                codedOutputStream.L(3, this.f77260g);
            }
            if ((this.f77258e & 2) == 2) {
                codedOutputStream.a0(4, this.f77261h);
            }
            if ((this.f77258e & 4) == 4) {
                codedOutputStream.d0(5, this.f77262i);
            }
            if ((this.f77258e & 16) == 16) {
                codedOutputStream.a0(6, this.f77264k);
            }
            if ((this.f77258e & 32) == 32) {
                codedOutputStream.a0(7, this.f77265l);
            }
            if ((this.f77258e & 8) == 8) {
                codedOutputStream.a0(8, this.f77263j);
            }
            if ((this.f77258e & 64) == 64) {
                codedOutputStream.a0(9, this.f77266m);
            }
            if ((this.f77258e & 256) == 256) {
                codedOutputStream.d0(10, this.f77268o);
            }
            if ((this.f77258e & 512) == 512) {
                codedOutputStream.a0(11, this.f77269p);
            }
            if ((this.f77258e & 128) == 128) {
                codedOutputStream.a0(12, this.f77267n);
            }
            if ((this.f77258e & 1024) == 1024) {
                codedOutputStream.d0(13, this.f77270q);
            }
            if ((this.f77258e & 2048) == 2048) {
                codedOutputStream.a0(14, this.f77271r);
            }
            x4.a(200, codedOutputStream);
            codedOutputStream.i0(this.f77257d);
        }

        public int b0() {
            return this.f77261h;
        }

        public q c0() {
            return this.f77262i;
        }

        public int d0() {
            return this.f77263j;
        }

        public boolean e0() {
            return this.f77260g;
        }

        public q f0() {
            return this.f77268o;
        }

        public int g0() {
            return this.f77269p;
        }

        public int h0() {
            return this.f77267n;
        }

        public int i0() {
            return this.f77265l;
        }

        public int j0() {
            return this.f77266m;
        }

        public boolean k0() {
            return (this.f77258e & 1024) == 1024;
        }

        public boolean l0() {
            return (this.f77258e & 2048) == 2048;
        }

        public boolean m0() {
            return (this.f77258e & 16) == 16;
        }

        public boolean n0() {
            return (this.f77258e & 4096) == 4096;
        }

        public boolean o0() {
            return (this.f77258e & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77273t;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            for (int i4 = 0; i4 < this.f77259f.size(); i4++) {
                if (!U(i4).p()) {
                    this.f77273t = (byte) 0;
                    return false;
                }
            }
            if (p0() && !this.f77262i.p()) {
                this.f77273t = (byte) 0;
                return false;
            }
            if (t0() && !this.f77268o.p()) {
                this.f77273t = (byte) 0;
                return false;
            }
            if (k0() && !this.f77270q.p()) {
                this.f77273t = (byte) 0;
                return false;
            }
            if (n()) {
                this.f77273t = (byte) 1;
                return true;
            }
            this.f77273t = (byte) 0;
            return false;
        }

        public boolean p0() {
            return (this.f77258e & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return A0(this);
        }

        public boolean q0() {
            return (this.f77258e & 8) == 8;
        }

        public boolean s0() {
            return (this.f77258e & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77274u;
            if (i4 != -1) {
                return i4;
            }
            int o4 = (this.f77258e & 4096) == 4096 ? CodedOutputStream.o(1, this.f77272s) : 0;
            for (int i5 = 0; i5 < this.f77259f.size(); i5++) {
                o4 += CodedOutputStream.s(2, this.f77259f.get(i5));
            }
            if ((this.f77258e & 1) == 1) {
                o4 += CodedOutputStream.a(3, this.f77260g);
            }
            if ((this.f77258e & 2) == 2) {
                o4 += CodedOutputStream.o(4, this.f77261h);
            }
            if ((this.f77258e & 4) == 4) {
                o4 += CodedOutputStream.s(5, this.f77262i);
            }
            if ((this.f77258e & 16) == 16) {
                o4 += CodedOutputStream.o(6, this.f77264k);
            }
            if ((this.f77258e & 32) == 32) {
                o4 += CodedOutputStream.o(7, this.f77265l);
            }
            if ((this.f77258e & 8) == 8) {
                o4 += CodedOutputStream.o(8, this.f77263j);
            }
            if ((this.f77258e & 64) == 64) {
                o4 += CodedOutputStream.o(9, this.f77266m);
            }
            if ((this.f77258e & 256) == 256) {
                o4 += CodedOutputStream.s(10, this.f77268o);
            }
            if ((this.f77258e & 512) == 512) {
                o4 += CodedOutputStream.o(11, this.f77269p);
            }
            if ((this.f77258e & 128) == 128) {
                o4 += CodedOutputStream.o(12, this.f77267n);
            }
            if ((this.f77258e & 1024) == 1024) {
                o4 += CodedOutputStream.s(13, this.f77270q);
            }
            if ((this.f77258e & 2048) == 2048) {
                o4 += CodedOutputStream.o(14, this.f77271r);
            }
            int size = this.f77257d.size() + o4 + o();
            this.f77274u = size;
            return size;
        }

        public boolean t0() {
            return (this.f77258e & 256) == 256;
        }

        public boolean u0() {
            return (this.f77258e & 512) == 512;
        }

        public boolean v0() {
            return (this.f77258e & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return c.v();
        }

        public boolean w0() {
            return (this.f77258e & 32) == 32;
        }

        public boolean x0() {
            return (this.f77258e & 64) == 64;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return f77255v;
        }

        private q(h.c<q, ?> cVar) {
            super(cVar);
            this.f77273t = (byte) -1;
            this.f77274u = -1;
            this.f77257d = cVar.i();
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.r {

            /* renamed from: j, reason: collision with root package name */
            private static final b f77275j;

            /* renamed from: k, reason: collision with root package name */
            public static kotlin.reflect.jvm.internal.impl.protobuf.q<b> f77276k = new C1142a();

            /* renamed from: c, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f77277c;

            /* renamed from: d, reason: collision with root package name */
            private int f77278d;

            /* renamed from: e, reason: collision with root package name */
            private c f77279e;

            /* renamed from: f, reason: collision with root package name */
            private q f77280f;

            /* renamed from: g, reason: collision with root package name */
            private int f77281g;

            /* renamed from: h, reason: collision with root package name */
            private byte f77282h;

            /* renamed from: i, reason: collision with root package name */
            private int f77283i;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$q$b$a, reason: collision with other inner class name */
            static class C1142a extends kotlin.reflect.jvm.internal.impl.protobuf.b<b> {
                C1142a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                    return new b(eVar, fVar);
                }
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$q$b$b, reason: collision with other inner class name */
            public static final class C1143b extends h.b<b, C1143b> implements kotlin.reflect.jvm.internal.impl.metadata.r {

                /* renamed from: c, reason: collision with root package name */
                private int f77284c;

                /* renamed from: d, reason: collision with root package name */
                private c f77285d = c.INV;

                /* renamed from: e, reason: collision with root package name */
                private q f77286e = q.Y();

                /* renamed from: f, reason: collision with root package name */
                private int f77287f;

                private C1143b() {
                }

                private void A() {
                }

                static C1143b m() {
                    return new C1143b();
                }

                private static C1143b s() {
                    return new C1143b();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: C, reason: merged with bridge method [inline-methods] */
                public C1143b k(b bVar) {
                    if (bVar == b.u()) {
                        return this;
                    }
                    if (bVar.C()) {
                        F(bVar.x());
                    }
                    if (bVar.D()) {
                        E(bVar.y());
                    }
                    if (bVar.E()) {
                        G(bVar.A());
                    }
                    l(i().c(bVar.f77277c));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
                /* renamed from: D, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.a.q.b.C1143b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$q$b> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.q.b.f77276k     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.a$q$b r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.q.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        kotlin.reflect.jvm.internal.impl.metadata.a$q$b r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.q.b) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.q.b.C1143b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$q$b$b");
                }

                public C1143b E(q qVar) {
                    if ((this.f77284c & 2) != 2 || this.f77286e == q.Y()) {
                        this.f77286e = qVar;
                    } else {
                        this.f77286e = q.A0(this.f77286e).k(qVar).A();
                    }
                    this.f77284c |= 2;
                    return this;
                }

                public C1143b F(c cVar) {
                    cVar.getClass();
                    this.f77284c |= 1;
                    this.f77285d = cVar;
                    return this;
                }

                public C1143b G(int i4) {
                    this.f77284c |= 4;
                    this.f77287f = i4;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: g */
                public b z() {
                    return b.u();
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
                    int i4 = this.f77284c;
                    int i5 = (i4 & 1) != 1 ? 0 : 1;
                    bVar.f77279e = this.f77285d;
                    if ((i4 & 2) == 2) {
                        i5 |= 2;
                    }
                    bVar.f77280f = this.f77286e;
                    if ((i4 & 4) == 4) {
                        i5 |= 4;
                    }
                    bVar.f77281g = this.f77287f;
                    bVar.f77278d = i5;
                    return bVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                public final boolean p() {
                    return !y() || this.f77286e.p();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C1143b o() {
                    return new C1143b().k(o());
                }

                public b u() {
                    return b.u();
                }

                public q v() {
                    return this.f77286e;
                }

                public boolean y() {
                    return (this.f77284c & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
                public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                    return b.u();
                }
            }

            /* compiled from: ProtoBuf.java */
            public enum c implements i.a {
                IN(0, 0),
                OUT(1, 1),
                INV(2, 2),
                STAR(3, 3);

                private static i.b<c> internalValueMap = new C1144a();
                private final int value;

                /* compiled from: ProtoBuf.java */
                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$q$b$c$a, reason: collision with other inner class name */
                static class C1144a implements i.b<c> {
                    C1144a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                    public c a(int i4) {
                        return c.valueOf(i4);
                    }

                    public c b(int i4) {
                        return c.valueOf(i4);
                    }
                }

                c(int i4, int i5) {
                    this.value = i5;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                public final int getNumber() {
                    return this.value;
                }

                public static c valueOf(int i4) {
                    if (i4 == 0) {
                        return IN;
                    }
                    if (i4 == 1) {
                        return OUT;
                    }
                    if (i4 == 2) {
                        return INV;
                    }
                    if (i4 != 3) {
                        return null;
                    }
                    return STAR;
                }
            }

            static {
                b bVar = new b(true);
                f77275j = bVar;
                bVar.F();
            }

            private b(h.b bVar) {
                this.f77282h = (byte) -1;
                this.f77283i = -1;
                this.f77277c = bVar.i();
            }

            private void F() {
                this.f77279e = c.INV;
                this.f77280f = q.Y();
                this.f77281g = 0;
            }

            public static C1143b G() {
                return C1143b.m();
            }

            public static C1143b H(b bVar) {
                return C1143b.m().k(bVar);
            }

            public static b u() {
                return f77275j;
            }

            public int A() {
                return this.f77281g;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
            public kotlin.reflect.jvm.internal.impl.protobuf.q<b> B() {
                return f77276k;
            }

            public boolean C() {
                return (this.f77278d & 1) == 1;
            }

            public boolean D() {
                return (this.f77278d & 2) == 2;
            }

            public boolean E() {
                return (this.f77278d & 4) == 4;
            }

            public C1143b I() {
                return C1143b.m();
            }

            public C1143b J() {
                return H(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public void b(CodedOutputStream codedOutputStream) throws IOException {
                t();
                if ((this.f77278d & 1) == 1) {
                    codedOutputStream.S(1, this.f77279e.getNumber());
                }
                if ((this.f77278d & 2) == 2) {
                    codedOutputStream.d0(2, this.f77280f);
                }
                if ((this.f77278d & 4) == 4) {
                    codedOutputStream.a0(3, this.f77281g);
                }
                codedOutputStream.i0(this.f77277c);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                byte b5 = this.f77282h;
                if (b5 == 1) {
                    return true;
                }
                if (b5 == 0) {
                    return false;
                }
                if (!D() || this.f77280f.p()) {
                    this.f77282h = (byte) 1;
                    return true;
                }
                this.f77282h = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public o.a q() {
                return H(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public int t() {
                int i4 = this.f77283i;
                if (i4 != -1) {
                    return i4;
                }
                int h4 = (this.f77278d & 1) == 1 ? CodedOutputStream.h(1, this.f77279e.getNumber()) : 0;
                if ((this.f77278d & 2) == 2) {
                    h4 += CodedOutputStream.s(2, this.f77280f);
                }
                if ((this.f77278d & 4) == 4) {
                    h4 += CodedOutputStream.o(3, this.f77281g);
                }
                int size = this.f77277c.size() + h4;
                this.f77283i = size;
                return size;
            }

            public b v() {
                return f77275j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public o.a w() {
                return C1143b.m();
            }

            public c x() {
                return this.f77279e;
            }

            public q y() {
                return this.f77280f;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return f77275j;
            }

            private b(boolean z4) {
                this.f77282h = (byte) -1;
                this.f77283i = -1;
                this.f77277c = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
            }

            private b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                c cVar;
                this.f77282h = (byte) -1;
                this.f77283i = -1;
                F();
                d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
                CodedOutputStream J = CodedOutputStream.J(w4, 1);
                boolean z4 = false;
                while (!z4) {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K == 8) {
                                    int A = eVar.A();
                                    c valueOf = c.valueOf(A);
                                    if (valueOf == null) {
                                        J.o0(K);
                                        J.o0(A);
                                    } else {
                                        this.f77278d |= 1;
                                        this.f77279e = valueOf;
                                    }
                                } else if (K == 18) {
                                    if ((this.f77278d & 2) == 2) {
                                        q qVar = this.f77280f;
                                        qVar.getClass();
                                        cVar = q.A0(qVar);
                                    } else {
                                        cVar = null;
                                    }
                                    q qVar2 = (q) eVar.u(q.f77256w, fVar);
                                    this.f77280f = qVar2;
                                    if (cVar != null) {
                                        cVar.k(qVar2);
                                        this.f77280f = cVar.A();
                                    }
                                    this.f77278d |= 2;
                                } else if (K != 24) {
                                    if (!eVar.P(K, J)) {
                                    }
                                } else {
                                    this.f77278d |= 4;
                                    this.f77281g = eVar.A();
                                }
                            }
                            z4 = true;
                        } catch (Throwable th) {
                            try {
                                J.I();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f77277c = w4.e();
                                throw th2;
                            }
                            this.f77277c = w4.e();
                            throw th;
                        }
                    } catch (InvalidProtocolBufferException e4) {
                        throw e4.i(this);
                    } catch (IOException e5) {
                        throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                    }
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f77277c = w4.e();
                    throw th3;
                }
                this.f77277c = w4.e();
            }
        }

        private q(boolean z4) {
            this.f77273t = (byte) -1;
            this.f77274u = -1;
            this.f77257d = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private q(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77273t = (byte) -1;
            this.f77274u = -1;
            y0();
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z4 = false;
            boolean z5 = false;
            while (!z4) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            c cVar = null;
                            switch (K) {
                                case 0:
                                    z4 = true;
                                case 8:
                                    this.f77258e |= 4096;
                                    this.f77272s = eVar.A();
                                case 18:
                                    if (!z5) {
                                        this.f77259f = new ArrayList();
                                        z5 = true;
                                    }
                                    this.f77259f.add(eVar.u(b.f77276k, fVar));
                                case 24:
                                    this.f77258e |= 1;
                                    this.f77260g = eVar.k();
                                case 32:
                                    this.f77258e |= 2;
                                    this.f77261h = eVar.A();
                                case 42:
                                    if ((this.f77258e & 4) == 4) {
                                        q qVar = this.f77262i;
                                        qVar.getClass();
                                        cVar = A0(qVar);
                                    }
                                    q qVar2 = (q) eVar.u(f77256w, fVar);
                                    this.f77262i = qVar2;
                                    if (cVar != null) {
                                        cVar.k(qVar2);
                                        this.f77262i = cVar.A();
                                    }
                                    this.f77258e |= 4;
                                case 48:
                                    this.f77258e |= 16;
                                    this.f77264k = eVar.A();
                                case 56:
                                    this.f77258e |= 32;
                                    this.f77265l = eVar.A();
                                case 64:
                                    this.f77258e |= 8;
                                    this.f77263j = eVar.A();
                                case 72:
                                    this.f77258e |= 64;
                                    this.f77266m = eVar.A();
                                case 82:
                                    if ((this.f77258e & 256) == 256) {
                                        q qVar3 = this.f77268o;
                                        qVar3.getClass();
                                        cVar = A0(qVar3);
                                    }
                                    q qVar4 = (q) eVar.u(f77256w, fVar);
                                    this.f77268o = qVar4;
                                    if (cVar != null) {
                                        cVar.k(qVar4);
                                        this.f77268o = cVar.A();
                                    }
                                    this.f77258e |= 256;
                                case 88:
                                    this.f77258e |= 512;
                                    this.f77269p = eVar.A();
                                case 96:
                                    this.f77258e |= 128;
                                    this.f77267n = eVar.A();
                                case 106:
                                    if ((this.f77258e & 1024) == 1024) {
                                        q qVar5 = this.f77270q;
                                        qVar5.getClass();
                                        cVar = A0(qVar5);
                                    }
                                    q qVar6 = (q) eVar.u(f77256w, fVar);
                                    this.f77270q = qVar6;
                                    if (cVar != null) {
                                        cVar.k(qVar6);
                                        this.f77270q = cVar.A();
                                    }
                                    this.f77258e |= 1024;
                                case 112:
                                    this.f77258e |= 2048;
                                    this.f77271r = eVar.A();
                                default:
                                    if (!k(eVar, J, fVar, K)) {
                                        z4 = true;
                                    }
                            }
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.i(this);
                        }
                    } catch (IOException e5) {
                        throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if (z5) {
                        this.f77259f = Collections.unmodifiableList(this.f77259f);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f77257d = w4.e();
                        throw th2;
                    }
                    this.f77257d = w4.e();
                    h();
                    throw th;
                }
            }
            if (z5) {
                this.f77259f = Collections.unmodifiableList(this.f77259f);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77257d = w4.e();
                throw th3;
            }
            this.f77257d = w4.e();
            h();
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class r extends h.d<r> implements kotlin.reflect.jvm.internal.impl.metadata.s {

        /* renamed from: q, reason: collision with root package name */
        private static final r f77303q;

        /* renamed from: r, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<r> f77304r = new C1145a();

        /* renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77305d;

        /* renamed from: e, reason: collision with root package name */
        private int f77306e;

        /* renamed from: f, reason: collision with root package name */
        private int f77307f;

        /* renamed from: g, reason: collision with root package name */
        private int f77308g;

        /* renamed from: h, reason: collision with root package name */
        private List<s> f77309h;

        /* renamed from: i, reason: collision with root package name */
        private q f77310i;

        /* renamed from: j, reason: collision with root package name */
        private int f77311j;

        /* renamed from: k, reason: collision with root package name */
        private q f77312k;

        /* renamed from: l, reason: collision with root package name */
        private int f77313l;

        /* renamed from: m, reason: collision with root package name */
        private List<b> f77314m;

        /* renamed from: n, reason: collision with root package name */
        private List<Integer> f77315n;

        /* renamed from: o, reason: collision with root package name */
        private byte f77316o;

        /* renamed from: p, reason: collision with root package name */
        private int f77317p;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$r$a, reason: collision with other inner class name */
        static class C1145a extends kotlin.reflect.jvm.internal.impl.protobuf.b<r> {
            C1145a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public r c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new r(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<r, b> implements kotlin.reflect.jvm.internal.impl.metadata.s {

            /* renamed from: e, reason: collision with root package name */
            private int f77318e;

            /* renamed from: g, reason: collision with root package name */
            private int f77320g;

            /* renamed from: j, reason: collision with root package name */
            private int f77323j;

            /* renamed from: l, reason: collision with root package name */
            private int f77325l;

            /* renamed from: f, reason: collision with root package name */
            private int f77319f = 6;

            /* renamed from: h, reason: collision with root package name */
            private List<s> f77321h = Collections.emptyList();

            /* renamed from: i, reason: collision with root package name */
            private q f77322i = q.Y();

            /* renamed from: k, reason: collision with root package name */
            private q f77324k = q.Y();

            /* renamed from: m, reason: collision with root package name */
            private List<b> f77326m = Collections.emptyList();

            /* renamed from: n, reason: collision with root package name */
            private List<Integer> f77327n = Collections.emptyList();

            private b() {
            }

            private static b D() {
                return new b();
            }

            private void E() {
                if ((this.f77318e & 128) != 128) {
                    this.f77326m = new ArrayList(this.f77326m);
                    this.f77318e |= 128;
                }
            }

            private void F() {
                if ((this.f77318e & 4) != 4) {
                    this.f77321h = new ArrayList(this.f77321h);
                    this.f77318e |= 4;
                }
            }

            private void G() {
                if ((this.f77318e & 256) != 256) {
                    this.f77327n = new ArrayList(this.f77327n);
                    this.f77318e |= 256;
                }
            }

            private void T() {
            }

            static b v() {
                return new b();
            }

            public r A() {
                r rVar = new r(this);
                int i4 = this.f77318e;
                int i5 = (i4 & 1) != 1 ? 0 : 1;
                rVar.f77307f = this.f77319f;
                if ((i4 & 2) == 2) {
                    i5 |= 2;
                }
                rVar.f77308g = this.f77320g;
                if ((this.f77318e & 4) == 4) {
                    this.f77321h = Collections.unmodifiableList(this.f77321h);
                    this.f77318e &= -5;
                }
                rVar.f77309h = this.f77321h;
                if ((i4 & 8) == 8) {
                    i5 |= 4;
                }
                rVar.f77310i = this.f77322i;
                if ((i4 & 16) == 16) {
                    i5 |= 8;
                }
                rVar.f77311j = this.f77323j;
                if ((i4 & 32) == 32) {
                    i5 |= 16;
                }
                rVar.f77312k = this.f77324k;
                if ((i4 & 64) == 64) {
                    i5 |= 32;
                }
                rVar.f77313l = this.f77325l;
                if ((this.f77318e & 128) == 128) {
                    this.f77326m = Collections.unmodifiableList(this.f77326m);
                    this.f77318e &= -129;
                }
                rVar.f77314m = this.f77326m;
                if ((this.f77318e & 256) == 256) {
                    this.f77327n = Collections.unmodifiableList(this.f77327n);
                    this.f77318e &= -257;
                }
                rVar.f77315n = this.f77327n;
                rVar.f77306e = i5;
                return rVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b o() {
                return new b().k(A());
            }

            public b H(int i4) {
                return this.f77326m.get(i4);
            }

            public int I() {
                return this.f77326m.size();
            }

            public r J() {
                return r.S();
            }

            public q K() {
                return this.f77324k;
            }

            public s M(int i4) {
                return this.f77321h.get(i4);
            }

            public int N() {
                return this.f77321h.size();
            }

            public q O() {
                return this.f77322i;
            }

            public boolean P() {
                return (this.f77318e & 32) == 32;
            }

            public boolean R() {
                return (this.f77318e & 2) == 2;
            }

            public boolean S() {
                return (this.f77318e & 8) == 8;
            }

            public b U(q qVar) {
                if ((this.f77318e & 32) != 32 || this.f77324k == q.Y()) {
                    this.f77324k = qVar;
                } else {
                    this.f77324k = q.A0(this.f77324k).k(qVar).A();
                }
                this.f77318e |= 32;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: V, reason: merged with bridge method [inline-methods] */
            public b k(r rVar) {
                if (rVar == r.S()) {
                    return this;
                }
                if (rVar.g0()) {
                    a0(rVar.W());
                }
                if (rVar.h0()) {
                    b0(rVar.X());
                }
                if (!rVar.f77309h.isEmpty()) {
                    if (this.f77321h.isEmpty()) {
                        this.f77321h = rVar.f77309h;
                        this.f77318e &= -5;
                    } else {
                        F();
                        this.f77321h.addAll(rVar.f77309h);
                    }
                }
                if (rVar.i0()) {
                    Y(rVar.b0());
                }
                if (rVar.j0()) {
                    c0(rVar.c0());
                }
                if (rVar.e0()) {
                    U(rVar.U());
                }
                if (rVar.f0()) {
                    Z(rVar.V());
                }
                if (!rVar.f77314m.isEmpty()) {
                    if (this.f77326m.isEmpty()) {
                        this.f77326m = rVar.f77314m;
                        this.f77318e &= -129;
                    } else {
                        E();
                        this.f77326m.addAll(rVar.f77314m);
                    }
                }
                if (!rVar.f77315n.isEmpty()) {
                    if (this.f77327n.isEmpty()) {
                        this.f77327n = rVar.f77315n;
                        this.f77318e &= -257;
                    } else {
                        G();
                        this.f77327n.addAll(rVar.f77315n);
                    }
                }
                u(rVar);
                l(i().c(rVar.f77305d));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: W, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.r.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$r> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.r.f77304r     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$r r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.r) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$r r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.r) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.r.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$r$b");
            }

            public b Y(q qVar) {
                if ((this.f77318e & 8) != 8 || this.f77322i == q.Y()) {
                    this.f77322i = qVar;
                } else {
                    this.f77322i = q.A0(this.f77322i).k(qVar).A();
                }
                this.f77318e |= 8;
                return this;
            }

            public b Z(int i4) {
                this.f77318e |= 64;
                this.f77325l = i4;
                return this;
            }

            public b a0(int i4) {
                this.f77318e |= 1;
                this.f77319f = i4;
                return this;
            }

            public b b0(int i4) {
                this.f77318e |= 2;
                this.f77320g = i4;
                return this;
            }

            public b c0(int i4) {
                this.f77318e |= 16;
                this.f77323j = i4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public kotlin.reflect.jvm.internal.impl.protobuf.h z() {
                return r.S();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                if (!R()) {
                    return false;
                }
                for (int i4 = 0; i4 < this.f77321h.size(); i4++) {
                    if (!M(i4).p()) {
                        return false;
                    }
                }
                if (S() && !this.f77322i.p()) {
                    return false;
                }
                if (P() && !this.f77324k.p()) {
                    return false;
                }
                for (int i5 = 0; i5 < this.f77326m.size(); i5++) {
                    if (!H(i5).p()) {
                        return false;
                    }
                }
                return s();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public r a() {
                r A = A();
                if (A.p()) {
                    return A;
                }
                throw new UninitializedMessageException(A);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return r.S();
            }
        }

        static {
            r rVar = new r(true);
            f77303q = rVar;
            rVar.k0();
        }

        public static r S() {
            return f77303q;
        }

        private void k0() {
            this.f77307f = 6;
            this.f77308g = 0;
            this.f77309h = Collections.emptyList();
            this.f77310i = q.Y();
            this.f77311j = 0;
            this.f77312k = q.Y();
            this.f77313l = 0;
            this.f77314m = Collections.emptyList();
            this.f77315n = Collections.emptyList();
        }

        public static b l0() {
            return b.v();
        }

        public static b m0(r rVar) {
            return b.v().k(rVar);
        }

        public static r o0(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws IOException {
            return f77304r.d(inputStream, fVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<r> B() {
            return f77304r;
        }

        public b P(int i4) {
            return this.f77314m.get(i4);
        }

        public int Q() {
            return this.f77314m.size();
        }

        public List<b> R() {
            return this.f77314m;
        }

        public r T() {
            return f77303q;
        }

        public q U() {
            return this.f77312k;
        }

        public int V() {
            return this.f77313l;
        }

        public int W() {
            return this.f77307f;
        }

        public int X() {
            return this.f77308g;
        }

        public s Y(int i4) {
            return this.f77309h.get(i4);
        }

        public int Z() {
            return this.f77309h.size();
        }

        public List<s> a0() {
            return this.f77309h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            h.d<MessageType>.a x4 = x();
            if ((this.f77306e & 1) == 1) {
                codedOutputStream.a0(1, this.f77307f);
            }
            if ((this.f77306e & 2) == 2) {
                codedOutputStream.a0(2, this.f77308g);
            }
            for (int i4 = 0; i4 < this.f77309h.size(); i4++) {
                codedOutputStream.d0(3, this.f77309h.get(i4));
            }
            if ((this.f77306e & 4) == 4) {
                codedOutputStream.d0(4, this.f77310i);
            }
            if ((this.f77306e & 8) == 8) {
                codedOutputStream.a0(5, this.f77311j);
            }
            if ((this.f77306e & 16) == 16) {
                codedOutputStream.d0(6, this.f77312k);
            }
            if ((this.f77306e & 32) == 32) {
                codedOutputStream.a0(7, this.f77313l);
            }
            for (int i5 = 0; i5 < this.f77314m.size(); i5++) {
                codedOutputStream.d0(8, this.f77314m.get(i5));
            }
            for (int i6 = 0; i6 < this.f77315n.size(); i6++) {
                codedOutputStream.a0(31, this.f77315n.get(i6).intValue());
            }
            x4.a(200, codedOutputStream);
            codedOutputStream.i0(this.f77305d);
        }

        public q b0() {
            return this.f77310i;
        }

        public int c0() {
            return this.f77311j;
        }

        public List<Integer> d0() {
            return this.f77315n;
        }

        public boolean e0() {
            return (this.f77306e & 16) == 16;
        }

        public boolean f0() {
            return (this.f77306e & 32) == 32;
        }

        public boolean g0() {
            return (this.f77306e & 1) == 1;
        }

        public boolean h0() {
            return (this.f77306e & 2) == 2;
        }

        public boolean i0() {
            return (this.f77306e & 4) == 4;
        }

        public boolean j0() {
            return (this.f77306e & 8) == 8;
        }

        public b n0() {
            return b.v();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77316o;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            if (!h0()) {
                this.f77316o = (byte) 0;
                return false;
            }
            for (int i4 = 0; i4 < this.f77309h.size(); i4++) {
                if (!Y(i4).p()) {
                    this.f77316o = (byte) 0;
                    return false;
                }
            }
            if (i0() && !this.f77310i.p()) {
                this.f77316o = (byte) 0;
                return false;
            }
            if (e0() && !this.f77312k.p()) {
                this.f77316o = (byte) 0;
                return false;
            }
            for (int i5 = 0; i5 < this.f77314m.size(); i5++) {
                if (!P(i5).p()) {
                    this.f77316o = (byte) 0;
                    return false;
                }
            }
            if (n()) {
                this.f77316o = (byte) 1;
                return true;
            }
            this.f77316o = (byte) 0;
            return false;
        }

        public b p0() {
            return m0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return m0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77317p;
            if (i4 != -1) {
                return i4;
            }
            int o4 = (this.f77306e & 1) == 1 ? CodedOutputStream.o(1, this.f77307f) : 0;
            if ((this.f77306e & 2) == 2) {
                o4 += CodedOutputStream.o(2, this.f77308g);
            }
            for (int i5 = 0; i5 < this.f77309h.size(); i5++) {
                o4 += CodedOutputStream.s(3, this.f77309h.get(i5));
            }
            if ((this.f77306e & 4) == 4) {
                o4 += CodedOutputStream.s(4, this.f77310i);
            }
            if ((this.f77306e & 8) == 8) {
                o4 += CodedOutputStream.o(5, this.f77311j);
            }
            if ((this.f77306e & 16) == 16) {
                o4 += CodedOutputStream.s(6, this.f77312k);
            }
            if ((this.f77306e & 32) == 32) {
                o4 += CodedOutputStream.o(7, this.f77313l);
            }
            for (int i6 = 0; i6 < this.f77314m.size(); i6++) {
                o4 += CodedOutputStream.s(8, this.f77314m.get(i6));
            }
            int i7 = 0;
            for (int i10 = 0; i10 < this.f77315n.size(); i10++) {
                i7 += CodedOutputStream.p(this.f77315n.get(i10).intValue());
            }
            int size = this.f77305d.size() + androidx.content.preferences.protobuf.n.a(this.f77315n, 2, o4 + i7) + o();
            this.f77317p = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.v();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return f77303q;
        }

        private r(h.c<r, ?> cVar) {
            super(cVar);
            this.f77316o = (byte) -1;
            this.f77317p = -1;
            this.f77305d = cVar.i();
        }

        private r(boolean z4) {
            this.f77316o = (byte) -1;
            this.f77317p = -1;
            this.f77305d = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        private r(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77316o = (byte) -1;
            this.f77317p = -1;
            k0();
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z4 = false;
            int i4 = 0;
            while (true) {
                ?? r5 = 128;
                if (!z4) {
                    try {
                        try {
                            int K = eVar.K();
                            q.c cVar = null;
                            switch (K) {
                                case 0:
                                    z4 = true;
                                case 8:
                                    this.f77306e |= 1;
                                    this.f77307f = eVar.A();
                                case 16:
                                    this.f77306e |= 2;
                                    this.f77308g = eVar.A();
                                case 26:
                                    if ((i4 & 4) != 4) {
                                        this.f77309h = new ArrayList();
                                        i4 |= 4;
                                    }
                                    this.f77309h.add(eVar.u(s.f77329p, fVar));
                                case 34:
                                    if ((this.f77306e & 4) == 4) {
                                        q qVar = this.f77310i;
                                        qVar.getClass();
                                        cVar = q.A0(qVar);
                                    }
                                    q qVar2 = (q) eVar.u(q.f77256w, fVar);
                                    this.f77310i = qVar2;
                                    if (cVar != null) {
                                        cVar.k(qVar2);
                                        this.f77310i = cVar.A();
                                    }
                                    this.f77306e |= 4;
                                case 40:
                                    this.f77306e |= 8;
                                    this.f77311j = eVar.A();
                                case 50:
                                    if ((this.f77306e & 16) == 16) {
                                        q qVar3 = this.f77312k;
                                        qVar3.getClass();
                                        cVar = q.A0(qVar3);
                                    }
                                    q qVar4 = (q) eVar.u(q.f77256w, fVar);
                                    this.f77312k = qVar4;
                                    if (cVar != null) {
                                        cVar.k(qVar4);
                                        this.f77312k = cVar.A();
                                    }
                                    this.f77306e |= 16;
                                case 56:
                                    this.f77306e |= 32;
                                    this.f77313l = eVar.A();
                                case 66:
                                    if ((i4 & 128) != 128) {
                                        this.f77314m = new ArrayList();
                                        i4 |= 128;
                                    }
                                    this.f77314m.add(eVar.u(b.f76961j, fVar));
                                case 248:
                                    if ((i4 & 256) != 256) {
                                        this.f77315n = new ArrayList();
                                        i4 |= 256;
                                    }
                                    this.f77315n.add(Integer.valueOf(eVar.A()));
                                case 250:
                                    int j4 = eVar.j(eVar.A());
                                    if ((i4 & 256) != 256 && eVar.e() > 0) {
                                        this.f77315n = new ArrayList();
                                        i4 |= 256;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f77315n.add(Integer.valueOf(eVar.A()));
                                    }
                                    eVar.i(j4);
                                    break;
                                default:
                                    r5 = k(eVar, J, fVar, K);
                                    if (r5 == 0) {
                                        z4 = true;
                                    }
                            }
                        } catch (Throwable th) {
                            if ((i4 & 4) == 4) {
                                this.f77309h = Collections.unmodifiableList(this.f77309h);
                            }
                            if ((i4 & 128) == r5) {
                                this.f77314m = Collections.unmodifiableList(this.f77314m);
                            }
                            if ((i4 & 256) == 256) {
                                this.f77315n = Collections.unmodifiableList(this.f77315n);
                            }
                            try {
                                J.I();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f77305d = w4.e();
                                throw th2;
                            }
                            this.f77305d = w4.e();
                            h();
                            throw th;
                        }
                    } catch (InvalidProtocolBufferException e4) {
                        throw e4.i(this);
                    } catch (IOException e5) {
                        throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                    }
                } else {
                    if ((i4 & 4) == 4) {
                        this.f77309h = Collections.unmodifiableList(this.f77309h);
                    }
                    if ((i4 & 128) == 128) {
                        this.f77314m = Collections.unmodifiableList(this.f77314m);
                    }
                    if ((i4 & 256) == 256) {
                        this.f77315n = Collections.unmodifiableList(this.f77315n);
                    }
                    try {
                        J.I();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.f77305d = w4.e();
                        throw th3;
                    }
                    this.f77305d = w4.e();
                    h();
                    return;
                }
            }
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class s extends h.d<s> implements kotlin.reflect.jvm.internal.impl.metadata.u {

        /* renamed from: o, reason: collision with root package name */
        private static final s f77328o;

        /* renamed from: p, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<s> f77329p = new C1146a();

        /* renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77330d;

        /* renamed from: e, reason: collision with root package name */
        private int f77331e;

        /* renamed from: f, reason: collision with root package name */
        private int f77332f;

        /* renamed from: g, reason: collision with root package name */
        private int f77333g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f77334h;

        /* renamed from: i, reason: collision with root package name */
        private c f77335i;

        /* renamed from: j, reason: collision with root package name */
        private List<q> f77336j;

        /* renamed from: k, reason: collision with root package name */
        private List<Integer> f77337k;

        /* renamed from: l, reason: collision with root package name */
        private int f77338l;

        /* renamed from: m, reason: collision with root package name */
        private byte f77339m;

        /* renamed from: n, reason: collision with root package name */
        private int f77340n;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$s$a, reason: collision with other inner class name */
        static class C1146a extends kotlin.reflect.jvm.internal.impl.protobuf.b<s> {
            C1146a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public s c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new s(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<s, b> implements kotlin.reflect.jvm.internal.impl.metadata.u {

            /* renamed from: e, reason: collision with root package name */
            private int f77341e;

            /* renamed from: f, reason: collision with root package name */
            private int f77342f;

            /* renamed from: g, reason: collision with root package name */
            private int f77343g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f77344h;

            /* renamed from: i, reason: collision with root package name */
            private c f77345i = c.INV;

            /* renamed from: j, reason: collision with root package name */
            private List<q> f77346j = Collections.emptyList();

            /* renamed from: k, reason: collision with root package name */
            private List<Integer> f77347k = Collections.emptyList();

            private b() {
            }

            private static b D() {
                return new b();
            }

            private void E() {
                if ((this.f77341e & 32) != 32) {
                    this.f77347k = new ArrayList(this.f77347k);
                    this.f77341e |= 32;
                }
            }

            private void F() {
                if ((this.f77341e & 16) != 16) {
                    this.f77346j = new ArrayList(this.f77346j);
                    this.f77341e |= 16;
                }
            }

            private void M() {
            }

            static b v() {
                return new b();
            }

            public s A() {
                s sVar = new s(this);
                int i4 = this.f77341e;
                int i5 = (i4 & 1) != 1 ? 0 : 1;
                sVar.f77332f = this.f77342f;
                if ((i4 & 2) == 2) {
                    i5 |= 2;
                }
                sVar.f77333g = this.f77343g;
                if ((i4 & 4) == 4) {
                    i5 |= 4;
                }
                sVar.f77334h = this.f77344h;
                if ((i4 & 8) == 8) {
                    i5 |= 8;
                }
                sVar.f77335i = this.f77345i;
                if ((this.f77341e & 16) == 16) {
                    this.f77346j = Collections.unmodifiableList(this.f77346j);
                    this.f77341e &= -17;
                }
                sVar.f77336j = this.f77346j;
                if ((this.f77341e & 32) == 32) {
                    this.f77347k = Collections.unmodifiableList(this.f77347k);
                    this.f77341e &= -33;
                }
                sVar.f77337k = this.f77347k;
                sVar.f77331e = i5;
                return sVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b o() {
                return new b().k(A());
            }

            public s G() {
                return s.L();
            }

            public q H(int i4) {
                return this.f77346j.get(i4);
            }

            public int I() {
                return this.f77346j.size();
            }

            public boolean J() {
                return (this.f77341e & 1) == 1;
            }

            public boolean K() {
                return (this.f77341e & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: N, reason: merged with bridge method [inline-methods] */
            public b k(s sVar) {
                if (sVar == s.L()) {
                    return this;
                }
                if (sVar.V()) {
                    P(sVar.N());
                }
                if (sVar.W()) {
                    R(sVar.O());
                }
                if (sVar.X()) {
                    S(sVar.P());
                }
                if (sVar.Y()) {
                    T(sVar.U());
                }
                if (!sVar.f77336j.isEmpty()) {
                    if (this.f77346j.isEmpty()) {
                        this.f77346j = sVar.f77336j;
                        this.f77341e &= -17;
                    } else {
                        F();
                        this.f77346j.addAll(sVar.f77336j);
                    }
                }
                if (!sVar.f77337k.isEmpty()) {
                    if (this.f77347k.isEmpty()) {
                        this.f77347k = sVar.f77337k;
                        this.f77341e &= -33;
                    } else {
                        E();
                        this.f77347k.addAll(sVar.f77337k);
                    }
                }
                u(sVar);
                l(i().c(sVar.f77330d));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: O, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.s.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$s> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.s.f77329p     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$s r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.s) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$s r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.s) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.s.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$s$b");
            }

            public b P(int i4) {
                this.f77341e |= 1;
                this.f77342f = i4;
                return this;
            }

            public b R(int i4) {
                this.f77341e |= 2;
                this.f77343g = i4;
                return this;
            }

            public b S(boolean z4) {
                this.f77341e |= 4;
                this.f77344h = z4;
                return this;
            }

            public b T(c cVar) {
                cVar.getClass();
                this.f77341e |= 8;
                this.f77345i = cVar;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public kotlin.reflect.jvm.internal.impl.protobuf.h z() {
                return s.L();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                if (!J() || !K()) {
                    return false;
                }
                for (int i4 = 0; i4 < this.f77346j.size(); i4++) {
                    if (!H(i4).p()) {
                        return false;
                    }
                }
                return s();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public s a() {
                s A = A();
                if (A.p()) {
                    return A;
                }
                throw new UninitializedMessageException(A);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return s.L();
            }
        }

        /* compiled from: ProtoBuf.java */
        public enum c implements i.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2);

            private static i.b<c> internalValueMap = new C1147a();
            private final int value;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$s$c$a, reason: collision with other inner class name */
            static class C1147a implements i.b<c> {
                C1147a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                public c a(int i4) {
                    return c.valueOf(i4);
                }

                public c b(int i4) {
                    return c.valueOf(i4);
                }
            }

            c(int i4, int i5) {
                this.value = i5;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.value;
            }

            public static c valueOf(int i4) {
                if (i4 == 0) {
                    return IN;
                }
                if (i4 == 1) {
                    return OUT;
                }
                if (i4 != 2) {
                    return null;
                }
                return INV;
            }
        }

        static {
            s sVar = new s(true);
            f77328o = sVar;
            sVar.Z();
        }

        public static s L() {
            return f77328o;
        }

        private void Z() {
            this.f77332f = 0;
            this.f77333g = 0;
            this.f77334h = false;
            this.f77335i = c.INV;
            this.f77336j = Collections.emptyList();
            this.f77337k = Collections.emptyList();
        }

        public static b a0() {
            return b.v();
        }

        public static b b0(s sVar) {
            return b.v().k(sVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<s> B() {
            return f77329p;
        }

        public s M() {
            return f77328o;
        }

        public int N() {
            return this.f77332f;
        }

        public int O() {
            return this.f77333g;
        }

        public boolean P() {
            return this.f77334h;
        }

        public q Q(int i4) {
            return this.f77336j.get(i4);
        }

        public int R() {
            return this.f77336j.size();
        }

        public List<Integer> S() {
            return this.f77337k;
        }

        public List<q> T() {
            return this.f77336j;
        }

        public c U() {
            return this.f77335i;
        }

        public boolean V() {
            return (this.f77331e & 1) == 1;
        }

        public boolean W() {
            return (this.f77331e & 2) == 2;
        }

        public boolean X() {
            return (this.f77331e & 4) == 4;
        }

        public boolean Y() {
            return (this.f77331e & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            h.d<MessageType>.a x4 = x();
            if ((this.f77331e & 1) == 1) {
                codedOutputStream.a0(1, this.f77332f);
            }
            if ((this.f77331e & 2) == 2) {
                codedOutputStream.a0(2, this.f77333g);
            }
            if ((this.f77331e & 4) == 4) {
                codedOutputStream.L(3, this.f77334h);
            }
            if ((this.f77331e & 8) == 8) {
                codedOutputStream.S(4, this.f77335i.getNumber());
            }
            for (int i4 = 0; i4 < this.f77336j.size(); i4++) {
                codedOutputStream.d0(5, this.f77336j.get(i4));
            }
            if (this.f77337k.size() > 0) {
                codedOutputStream.o0(50);
                codedOutputStream.o0(this.f77338l);
            }
            for (int i5 = 0; i5 < this.f77337k.size(); i5++) {
                codedOutputStream.b0(this.f77337k.get(i5).intValue());
            }
            x4.a(1000, codedOutputStream);
            codedOutputStream.i0(this.f77330d);
        }

        public b c0() {
            return b.v();
        }

        public b d0() {
            return b0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77339m;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            if (!V()) {
                this.f77339m = (byte) 0;
                return false;
            }
            if (!W()) {
                this.f77339m = (byte) 0;
                return false;
            }
            for (int i4 = 0; i4 < this.f77336j.size(); i4++) {
                if (!Q(i4).p()) {
                    this.f77339m = (byte) 0;
                    return false;
                }
            }
            if (n()) {
                this.f77339m = (byte) 1;
                return true;
            }
            this.f77339m = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return b0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77340n;
            if (i4 != -1) {
                return i4;
            }
            int o4 = (this.f77331e & 1) == 1 ? CodedOutputStream.o(1, this.f77332f) : 0;
            if ((this.f77331e & 2) == 2) {
                o4 += CodedOutputStream.o(2, this.f77333g);
            }
            if ((this.f77331e & 4) == 4) {
                o4 += CodedOutputStream.a(3, this.f77334h);
            }
            if ((this.f77331e & 8) == 8) {
                o4 += CodedOutputStream.h(4, this.f77335i.getNumber());
            }
            for (int i5 = 0; i5 < this.f77336j.size(); i5++) {
                o4 += CodedOutputStream.s(5, this.f77336j.get(i5));
            }
            int i6 = 0;
            for (int i7 = 0; i7 < this.f77337k.size(); i7++) {
                i6 += CodedOutputStream.p(this.f77337k.get(i7).intValue());
            }
            int i10 = o4 + i6;
            if (!this.f77337k.isEmpty()) {
                i10 = i10 + 1 + CodedOutputStream.p(i6);
            }
            this.f77338l = i6;
            int size = this.f77330d.size() + i10 + o();
            this.f77340n = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.v();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return f77328o;
        }

        private s(h.c<s, ?> cVar) {
            super(cVar);
            this.f77338l = -1;
            this.f77339m = (byte) -1;
            this.f77340n = -1;
            this.f77330d = cVar.i();
        }

        private s(boolean z4) {
            this.f77338l = -1;
            this.f77339m = (byte) -1;
            this.f77340n = -1;
            this.f77330d = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private s(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77338l = -1;
            this.f77339m = (byte) -1;
            this.f77340n = -1;
            Z();
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
                                this.f77331e |= 1;
                                this.f77332f = eVar.A();
                            } else if (K == 16) {
                                this.f77331e |= 2;
                                this.f77333g = eVar.A();
                            } else if (K == 24) {
                                this.f77331e |= 4;
                                this.f77334h = eVar.k();
                            } else if (K == 32) {
                                int A = eVar.A();
                                c valueOf = c.valueOf(A);
                                if (valueOf == null) {
                                    J.o0(K);
                                    J.o0(A);
                                } else {
                                    this.f77331e |= 8;
                                    this.f77335i = valueOf;
                                }
                            } else if (K == 42) {
                                if ((i4 & 16) != 16) {
                                    this.f77336j = new ArrayList();
                                    i4 |= 16;
                                }
                                this.f77336j.add(eVar.u(q.f77256w, fVar));
                            } else if (K == 48) {
                                if ((i4 & 32) != 32) {
                                    this.f77337k = new ArrayList();
                                    i4 |= 32;
                                }
                                this.f77337k.add(Integer.valueOf(eVar.A()));
                            } else if (K != 50) {
                                if (!k(eVar, J, fVar, K)) {
                                }
                            } else {
                                int j4 = eVar.j(eVar.A());
                                if ((i4 & 32) != 32 && eVar.e() > 0) {
                                    this.f77337k = new ArrayList();
                                    i4 |= 32;
                                }
                                while (eVar.e() > 0) {
                                    this.f77337k.add(Integer.valueOf(eVar.A()));
                                }
                                eVar.i(j4);
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
                        this.f77336j = Collections.unmodifiableList(this.f77336j);
                    }
                    if ((i4 & 32) == 32) {
                        this.f77337k = Collections.unmodifiableList(this.f77337k);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f77330d = w4.e();
                        throw th2;
                    }
                    this.f77330d = w4.e();
                    h();
                    throw th;
                }
            }
            if ((i4 & 16) == 16) {
                this.f77336j = Collections.unmodifiableList(this.f77336j);
            }
            if ((i4 & 32) == 32) {
                this.f77337k = Collections.unmodifiableList(this.f77337k);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77330d = w4.e();
                throw th3;
            }
            this.f77330d = w4.e();
            h();
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class u extends h.d<u> implements kotlin.reflect.jvm.internal.impl.metadata.w {

        /* renamed from: n, reason: collision with root package name */
        private static final u f77359n;

        /* renamed from: o, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<u> f77360o = new C1149a();

        /* renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77361d;

        /* renamed from: e, reason: collision with root package name */
        private int f77362e;

        /* renamed from: f, reason: collision with root package name */
        private int f77363f;

        /* renamed from: g, reason: collision with root package name */
        private int f77364g;

        /* renamed from: h, reason: collision with root package name */
        private q f77365h;

        /* renamed from: i, reason: collision with root package name */
        private int f77366i;

        /* renamed from: j, reason: collision with root package name */
        private q f77367j;

        /* renamed from: k, reason: collision with root package name */
        private int f77368k;

        /* renamed from: l, reason: collision with root package name */
        private byte f77369l;

        /* renamed from: m, reason: collision with root package name */
        private int f77370m;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$u$a, reason: collision with other inner class name */
        static class C1149a extends kotlin.reflect.jvm.internal.impl.protobuf.b<u> {
            C1149a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public u c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new u(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<u, b> implements kotlin.reflect.jvm.internal.impl.metadata.w {

            /* renamed from: e, reason: collision with root package name */
            private int f77371e;

            /* renamed from: f, reason: collision with root package name */
            private int f77372f;

            /* renamed from: g, reason: collision with root package name */
            private int f77373g;

            /* renamed from: i, reason: collision with root package name */
            private int f77375i;

            /* renamed from: k, reason: collision with root package name */
            private int f77377k;

            /* renamed from: h, reason: collision with root package name */
            private q f77374h = q.Y();

            /* renamed from: j, reason: collision with root package name */
            private q f77376j = q.Y();

            private b() {
            }

            private static b D() {
                return new b();
            }

            private void K() {
            }

            static b v() {
                return new b();
            }

            public u A() {
                u uVar = new u(this);
                int i4 = this.f77371e;
                int i5 = (i4 & 1) != 1 ? 0 : 1;
                uVar.f77363f = this.f77372f;
                if ((i4 & 2) == 2) {
                    i5 |= 2;
                }
                uVar.f77364g = this.f77373g;
                if ((i4 & 4) == 4) {
                    i5 |= 4;
                }
                uVar.f77365h = this.f77374h;
                if ((i4 & 8) == 8) {
                    i5 |= 8;
                }
                uVar.f77366i = this.f77375i;
                if ((i4 & 16) == 16) {
                    i5 |= 16;
                }
                uVar.f77367j = this.f77376j;
                if ((i4 & 32) == 32) {
                    i5 |= 32;
                }
                uVar.f77368k = this.f77377k;
                uVar.f77362e = i5;
                return uVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b o() {
                return new b().k(A());
            }

            public u E() {
                return u.J();
            }

            public q F() {
                return this.f77374h;
            }

            public q G() {
                return this.f77376j;
            }

            public boolean H() {
                return (this.f77371e & 2) == 2;
            }

            public boolean I() {
                return (this.f77371e & 4) == 4;
            }

            public boolean J() {
                return (this.f77371e & 16) == 16;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: M, reason: merged with bridge method [inline-methods] */
            public b k(u uVar) {
                if (uVar == u.J()) {
                    return this;
                }
                if (uVar.R()) {
                    R(uVar.L());
                }
                if (uVar.S()) {
                    S(uVar.M());
                }
                if (uVar.T()) {
                    O(uVar.N());
                }
                if (uVar.U()) {
                    T(uVar.O());
                }
                if (uVar.V()) {
                    P(uVar.P());
                }
                if (uVar.W()) {
                    U(uVar.Q());
                }
                u(uVar);
                l(i().c(uVar.f77361d));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: N, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.u.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$u> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.u.f77360o     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$u r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.u) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$u r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.u) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.u.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$u$b");
            }

            public b O(q qVar) {
                if ((this.f77371e & 4) != 4 || this.f77374h == q.Y()) {
                    this.f77374h = qVar;
                } else {
                    this.f77374h = q.A0(this.f77374h).k(qVar).A();
                }
                this.f77371e |= 4;
                return this;
            }

            public b P(q qVar) {
                if ((this.f77371e & 16) != 16 || this.f77376j == q.Y()) {
                    this.f77376j = qVar;
                } else {
                    this.f77376j = q.A0(this.f77376j).k(qVar).A();
                }
                this.f77371e |= 16;
                return this;
            }

            public b R(int i4) {
                this.f77371e |= 1;
                this.f77372f = i4;
                return this;
            }

            public b S(int i4) {
                this.f77371e |= 2;
                this.f77373g = i4;
                return this;
            }

            public b T(int i4) {
                this.f77371e |= 8;
                this.f77375i = i4;
                return this;
            }

            public b U(int i4) {
                this.f77371e |= 32;
                this.f77377k = i4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public kotlin.reflect.jvm.internal.impl.protobuf.h z() {
                return u.J();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                if (!H()) {
                    return false;
                }
                if (!I() || this.f77374h.p()) {
                    return (!J() || this.f77376j.p()) && s();
                }
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public u a() {
                u A = A();
                if (A.p()) {
                    return A;
                }
                throw new UninitializedMessageException(A);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return u.J();
            }
        }

        static {
            u uVar = new u(true);
            f77359n = uVar;
            uVar.X();
        }

        public static u J() {
            return f77359n;
        }

        private void X() {
            this.f77363f = 0;
            this.f77364g = 0;
            this.f77365h = q.Y();
            this.f77366i = 0;
            this.f77367j = q.Y();
            this.f77368k = 0;
        }

        public static b Y() {
            return b.v();
        }

        public static b Z(u uVar) {
            return b.v().k(uVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<u> B() {
            return f77360o;
        }

        public u K() {
            return f77359n;
        }

        public int L() {
            return this.f77363f;
        }

        public int M() {
            return this.f77364g;
        }

        public q N() {
            return this.f77365h;
        }

        public int O() {
            return this.f77366i;
        }

        public q P() {
            return this.f77367j;
        }

        public int Q() {
            return this.f77368k;
        }

        public boolean R() {
            return (this.f77362e & 1) == 1;
        }

        public boolean S() {
            return (this.f77362e & 2) == 2;
        }

        public boolean T() {
            return (this.f77362e & 4) == 4;
        }

        public boolean U() {
            return (this.f77362e & 8) == 8;
        }

        public boolean V() {
            return (this.f77362e & 16) == 16;
        }

        public boolean W() {
            return (this.f77362e & 32) == 32;
        }

        public b a0() {
            return b.v();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            h.d<MessageType>.a x4 = x();
            if ((this.f77362e & 1) == 1) {
                codedOutputStream.a0(1, this.f77363f);
            }
            if ((this.f77362e & 2) == 2) {
                codedOutputStream.a0(2, this.f77364g);
            }
            if ((this.f77362e & 4) == 4) {
                codedOutputStream.d0(3, this.f77365h);
            }
            if ((this.f77362e & 16) == 16) {
                codedOutputStream.d0(4, this.f77367j);
            }
            if ((this.f77362e & 8) == 8) {
                codedOutputStream.a0(5, this.f77366i);
            }
            if ((this.f77362e & 32) == 32) {
                codedOutputStream.a0(6, this.f77368k);
            }
            x4.a(200, codedOutputStream);
            codedOutputStream.i0(this.f77361d);
        }

        public b b0() {
            return Z(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77369l;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            if (!S()) {
                this.f77369l = (byte) 0;
                return false;
            }
            if (T() && !this.f77365h.p()) {
                this.f77369l = (byte) 0;
                return false;
            }
            if (V() && !this.f77367j.p()) {
                this.f77369l = (byte) 0;
                return false;
            }
            if (n()) {
                this.f77369l = (byte) 1;
                return true;
            }
            this.f77369l = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return Z(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77370m;
            if (i4 != -1) {
                return i4;
            }
            int o4 = (this.f77362e & 1) == 1 ? CodedOutputStream.o(1, this.f77363f) : 0;
            if ((this.f77362e & 2) == 2) {
                o4 += CodedOutputStream.o(2, this.f77364g);
            }
            if ((this.f77362e & 4) == 4) {
                o4 += CodedOutputStream.s(3, this.f77365h);
            }
            if ((this.f77362e & 16) == 16) {
                o4 += CodedOutputStream.s(4, this.f77367j);
            }
            if ((this.f77362e & 8) == 8) {
                o4 += CodedOutputStream.o(5, this.f77366i);
            }
            if ((this.f77362e & 32) == 32) {
                o4 += CodedOutputStream.o(6, this.f77368k);
            }
            int size = this.f77361d.size() + o4 + o();
            this.f77370m = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.v();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return f77359n;
        }

        private u(h.c<u, ?> cVar) {
            super(cVar);
            this.f77369l = (byte) -1;
            this.f77370m = -1;
            this.f77361d = cVar.i();
        }

        private u(boolean z4) {
            this.f77369l = (byte) -1;
            this.f77370m = -1;
            this.f77361d = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        private u(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77369l = (byte) -1;
            this.f77370m = -1;
            X();
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z4 = false;
            while (!z4) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f77362e |= 1;
                                this.f77363f = eVar.A();
                            } else if (K != 16) {
                                q.c cVar = null;
                                if (K == 26) {
                                    if ((this.f77362e & 4) == 4) {
                                        q qVar = this.f77365h;
                                        qVar.getClass();
                                        cVar = q.A0(qVar);
                                    }
                                    q qVar2 = (q) eVar.u(q.f77256w, fVar);
                                    this.f77365h = qVar2;
                                    if (cVar != null) {
                                        cVar.k(qVar2);
                                        this.f77365h = cVar.A();
                                    }
                                    this.f77362e |= 4;
                                } else if (K == 34) {
                                    if ((this.f77362e & 16) == 16) {
                                        q qVar3 = this.f77367j;
                                        qVar3.getClass();
                                        cVar = q.A0(qVar3);
                                    }
                                    q qVar4 = (q) eVar.u(q.f77256w, fVar);
                                    this.f77367j = qVar4;
                                    if (cVar != null) {
                                        cVar.k(qVar4);
                                        this.f77367j = cVar.A();
                                    }
                                    this.f77362e |= 16;
                                } else if (K == 40) {
                                    this.f77362e |= 8;
                                    this.f77366i = eVar.A();
                                } else if (K != 48) {
                                    if (!k(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    this.f77362e |= 32;
                                    this.f77368k = eVar.A();
                                }
                            } else {
                                this.f77362e |= 2;
                                this.f77364g = eVar.A();
                            }
                        }
                        z4 = true;
                    } catch (Throwable th) {
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f77361d = w4.e();
                            throw th2;
                        }
                        this.f77361d = w4.e();
                        h();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.i(this);
                } catch (IOException e5) {
                    throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77361d = w4.e();
                throw th3;
            }
            this.f77361d = w4.e();
            h();
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class b extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.d {

        /* renamed from: i, reason: collision with root package name */
        private static final b f76960i;

        /* renamed from: j, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<b> f76961j = new C1111a();

        /* renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f76962c;

        /* renamed from: d, reason: collision with root package name */
        private int f76963d;

        /* renamed from: e, reason: collision with root package name */
        private int f76964e;

        /* renamed from: f, reason: collision with root package name */
        private List<C1112b> f76965f;

        /* renamed from: g, reason: collision with root package name */
        private byte f76966g;

        /* renamed from: h, reason: collision with root package name */
        private int f76967h;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$b$a, reason: collision with other inner class name */
        static class C1111a extends kotlin.reflect.jvm.internal.impl.protobuf.b<b> {
            C1111a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new b(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class c extends h.b<b, c> implements kotlin.reflect.jvm.internal.impl.metadata.d {

            /* renamed from: c, reason: collision with root package name */
            private int f77008c;

            /* renamed from: d, reason: collision with root package name */
            private int f77009d;

            /* renamed from: e, reason: collision with root package name */
            private List<C1112b> f77010e = Collections.emptyList();

            private c() {
            }

            private void D() {
            }

            static c m() {
                return new c();
            }

            private static c s() {
                return new c();
            }

            private void u() {
                if ((this.f77008c & 2) != 2) {
                    this.f77010e = new ArrayList(this.f77010e);
                    this.f77008c |= 2;
                }
            }

            public b A() {
                return b.y();
            }

            public boolean C() {
                return (this.f77008c & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            public c k(b bVar) {
                if (bVar == b.y()) {
                    return this;
                }
                if (bVar.D()) {
                    G(bVar.C());
                }
                if (!bVar.f76965f.isEmpty()) {
                    if (this.f77010e.isEmpty()) {
                        this.f77010e = bVar.f76965f;
                        this.f77008c &= -3;
                    } else {
                        u();
                        this.f77010e.addAll(bVar.f76965f);
                    }
                }
                l(i().c(bVar.f76962c));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: F, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.b.c r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$b> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.b.f76961j     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$b r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$b r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.b.c.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$b$c");
            }

            public c G(int i4) {
                this.f77008c |= 1;
                this.f77009d = i4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public b z() {
                return b.y();
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
                int i4 = (this.f77008c & 1) != 1 ? 0 : 1;
                bVar.f76964e = this.f77009d;
                if ((this.f77008c & 2) == 2) {
                    this.f77010e = Collections.unmodifiableList(this.f77010e);
                    this.f77008c &= -3;
                }
                bVar.f76965f = this.f77010e;
                bVar.f76963d = i4;
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                if (!C()) {
                    return false;
                }
                for (int i4 = 0; i4 < this.f77010e.size(); i4++) {
                    if (!v(i4).p()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public c o() {
                return new c().k(o());
            }

            public C1112b v(int i4) {
                return this.f77010e.get(i4);
            }

            public int y() {
                return this.f77010e.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return b.y();
            }
        }

        static {
            b bVar = new b(true);
            f76960i = bVar;
            bVar.E();
        }

        private b(h.b bVar) {
            this.f76966g = (byte) -1;
            this.f76967h = -1;
            this.f76962c = bVar.i();
        }

        private void E() {
            this.f76964e = 0;
            this.f76965f = Collections.emptyList();
        }

        public static c F() {
            return c.m();
        }

        public static c G(b bVar) {
            return c.m().k(bVar);
        }

        public static b y() {
            return f76960i;
        }

        public b A() {
            return f76960i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<b> B() {
            return f76961j;
        }

        public int C() {
            return this.f76964e;
        }

        public boolean D() {
            return (this.f76963d & 1) == 1;
        }

        public c H() {
            return c.m();
        }

        public c I() {
            return G(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            if ((this.f76963d & 1) == 1) {
                codedOutputStream.a0(1, this.f76964e);
            }
            for (int i4 = 0; i4 < this.f76965f.size(); i4++) {
                codedOutputStream.d0(2, this.f76965f.get(i4));
            }
            codedOutputStream.i0(this.f76962c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f76966g;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            if (!D()) {
                this.f76966g = (byte) 0;
                return false;
            }
            for (int i4 = 0; i4 < this.f76965f.size(); i4++) {
                if (!u(i4).p()) {
                    this.f76966g = (byte) 0;
                    return false;
                }
            }
            this.f76966g = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return G(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f76967h;
            if (i4 != -1) {
                return i4;
            }
            int o4 = (this.f76963d & 1) == 1 ? CodedOutputStream.o(1, this.f76964e) : 0;
            for (int i5 = 0; i5 < this.f76965f.size(); i5++) {
                o4 += CodedOutputStream.s(2, this.f76965f.get(i5));
            }
            int size = this.f76962c.size() + o4;
            this.f76967h = size;
            return size;
        }

        public C1112b u(int i4) {
            return this.f76965f.get(i4);
        }

        public int v() {
            return this.f76965f.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return c.m();
        }

        public List<C1112b> x() {
            return this.f76965f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return f76960i;
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$b$b, reason: collision with other inner class name */
        public static final class C1112b extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.c {

            /* renamed from: i, reason: collision with root package name */
            private static final C1112b f76968i;

            /* renamed from: j, reason: collision with root package name */
            public static kotlin.reflect.jvm.internal.impl.protobuf.q<C1112b> f76969j = new C1113a();

            /* renamed from: c, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f76970c;

            /* renamed from: d, reason: collision with root package name */
            private int f76971d;

            /* renamed from: e, reason: collision with root package name */
            private int f76972e;

            /* renamed from: f, reason: collision with root package name */
            private c f76973f;

            /* renamed from: g, reason: collision with root package name */
            private byte f76974g;

            /* renamed from: h, reason: collision with root package name */
            private int f76975h;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$b$b$a, reason: collision with other inner class name */
            static class C1113a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C1112b> {
                C1113a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C1112b c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                    return new C1112b(eVar, fVar);
                }
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$b$b$b, reason: collision with other inner class name */
            public static final class C1114b extends h.b<C1112b, C1114b> implements kotlin.reflect.jvm.internal.impl.metadata.c {

                /* renamed from: c, reason: collision with root package name */
                private int f76976c;

                /* renamed from: d, reason: collision with root package name */
                private int f76977d;

                /* renamed from: e, reason: collision with root package name */
                private c f76978e = c.M();

                private C1114b() {
                }

                private void C() {
                }

                static C1114b m() {
                    return new C1114b();
                }

                private static C1114b s() {
                    return new C1114b();
                }

                public boolean A() {
                    return (this.f76976c & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: D, reason: merged with bridge method [inline-methods] */
                public C1114b k(C1112b c1112b) {
                    if (c1112b == C1112b.s()) {
                        return this;
                    }
                    if (c1112b.y()) {
                        G(c1112b.v());
                    }
                    if (c1112b.A()) {
                        F(c1112b.x());
                    }
                    l(i().c(c1112b.f76970c));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
                /* renamed from: E, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.a.b.C1112b.C1114b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$b$b> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.b.C1112b.f76969j     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.a$b$b r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.b.C1112b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        kotlin.reflect.jvm.internal.impl.metadata.a$b$b r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.b.C1112b) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.b.C1112b.C1114b.d(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$b$b$b");
                }

                public C1114b F(c cVar) {
                    if ((this.f76976c & 2) != 2 || this.f76978e == c.M()) {
                        this.f76978e = cVar;
                    } else {
                        this.f76978e = c.h0(this.f76978e).k(cVar).o();
                    }
                    this.f76976c |= 2;
                    return this;
                }

                public C1114b G(int i4) {
                    this.f76976c |= 1;
                    this.f76977d = i4;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: g */
                public C1112b z() {
                    return C1112b.s();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public C1112b a() {
                    C1112b o4 = o();
                    if (o4.p()) {
                        return o4;
                    }
                    throw new UninitializedMessageException(o4);
                }

                public C1112b o() {
                    C1112b c1112b = new C1112b(this);
                    int i4 = this.f76976c;
                    int i5 = (i4 & 1) != 1 ? 0 : 1;
                    c1112b.f76972e = this.f76977d;
                    if ((i4 & 2) == 2) {
                        i5 |= 2;
                    }
                    c1112b.f76973f = this.f76978e;
                    c1112b.f76971d = i5;
                    return c1112b;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                public final boolean p() {
                    return y() && A() && this.f76978e.p();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public C1114b o() {
                    return new C1114b().k(o());
                }

                public C1112b u() {
                    return C1112b.s();
                }

                public c v() {
                    return this.f76978e;
                }

                public boolean y() {
                    return (this.f76976c & 1) == 1;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
                public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                    return C1112b.s();
                }
            }

            static {
                C1112b c1112b = new C1112b(true);
                f76968i = c1112b;
                c1112b.C();
            }

            private C1112b(h.b bVar) {
                this.f76974g = (byte) -1;
                this.f76975h = -1;
                this.f76970c = bVar.i();
            }

            private void C() {
                this.f76972e = 0;
                this.f76973f = c.M();
            }

            public static C1114b D() {
                return C1114b.m();
            }

            public static C1114b E(C1112b c1112b) {
                return C1114b.m().k(c1112b);
            }

            public static C1112b s() {
                return f76968i;
            }

            public boolean A() {
                return (this.f76971d & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
            public kotlin.reflect.jvm.internal.impl.protobuf.q<C1112b> B() {
                return f76969j;
            }

            public C1114b F() {
                return C1114b.m();
            }

            public C1114b G() {
                return E(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public void b(CodedOutputStream codedOutputStream) throws IOException {
                t();
                if ((this.f76971d & 1) == 1) {
                    codedOutputStream.a0(1, this.f76972e);
                }
                if ((this.f76971d & 2) == 2) {
                    codedOutputStream.d0(2, this.f76973f);
                }
                codedOutputStream.i0(this.f76970c);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                byte b5 = this.f76974g;
                if (b5 == 1) {
                    return true;
                }
                if (b5 == 0) {
                    return false;
                }
                if (!y()) {
                    this.f76974g = (byte) 0;
                    return false;
                }
                if (!A()) {
                    this.f76974g = (byte) 0;
                    return false;
                }
                if (this.f76973f.p()) {
                    this.f76974g = (byte) 1;
                    return true;
                }
                this.f76974g = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public o.a q() {
                return E(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public int t() {
                int i4 = this.f76975h;
                if (i4 != -1) {
                    return i4;
                }
                int o4 = (this.f76971d & 1) == 1 ? CodedOutputStream.o(1, this.f76972e) : 0;
                if ((this.f76971d & 2) == 2) {
                    o4 += CodedOutputStream.s(2, this.f76973f);
                }
                int size = this.f76970c.size() + o4;
                this.f76975h = size;
                return size;
            }

            public C1112b u() {
                return f76968i;
            }

            public int v() {
                return this.f76972e;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public o.a w() {
                return C1114b.m();
            }

            public c x() {
                return this.f76973f;
            }

            public boolean y() {
                return (this.f76971d & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return f76968i;
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$b$b$c */
            public static final class c extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.b {

                /* renamed from: r, reason: collision with root package name */
                private static final c f76979r;

                /* renamed from: s, reason: collision with root package name */
                public static kotlin.reflect.jvm.internal.impl.protobuf.q<c> f76980s = new C1115a();

                /* renamed from: c, reason: collision with root package name */
                private final kotlin.reflect.jvm.internal.impl.protobuf.d f76981c;

                /* renamed from: d, reason: collision with root package name */
                private int f76982d;

                /* renamed from: e, reason: collision with root package name */
                private EnumC1117c f76983e;

                /* renamed from: f, reason: collision with root package name */
                private long f76984f;

                /* renamed from: g, reason: collision with root package name */
                private float f76985g;

                /* renamed from: h, reason: collision with root package name */
                private double f76986h;

                /* renamed from: i, reason: collision with root package name */
                private int f76987i;

                /* renamed from: j, reason: collision with root package name */
                private int f76988j;

                /* renamed from: k, reason: collision with root package name */
                private int f76989k;

                /* renamed from: l, reason: collision with root package name */
                private b f76990l;

                /* renamed from: m, reason: collision with root package name */
                private List<c> f76991m;

                /* renamed from: n, reason: collision with root package name */
                private int f76992n;

                /* renamed from: o, reason: collision with root package name */
                private int f76993o;

                /* renamed from: p, reason: collision with root package name */
                private byte f76994p;

                /* renamed from: q, reason: collision with root package name */
                private int f76995q;

                /* compiled from: ProtoBuf.java */
                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$b$b$c$a, reason: collision with other inner class name */
                static class C1115a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
                    C1115a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public c c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                        return new c(eVar, fVar);
                    }
                }

                /* compiled from: ProtoBuf.java */
                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$b$b$c$b, reason: collision with other inner class name */
                public static final class C1116b extends h.b<c, C1116b> implements kotlin.reflect.jvm.internal.impl.metadata.b {

                    /* renamed from: c, reason: collision with root package name */
                    private int f76996c;

                    /* renamed from: e, reason: collision with root package name */
                    private long f76998e;

                    /* renamed from: f, reason: collision with root package name */
                    private float f76999f;

                    /* renamed from: g, reason: collision with root package name */
                    private double f77000g;

                    /* renamed from: h, reason: collision with root package name */
                    private int f77001h;

                    /* renamed from: i, reason: collision with root package name */
                    private int f77002i;

                    /* renamed from: j, reason: collision with root package name */
                    private int f77003j;

                    /* renamed from: m, reason: collision with root package name */
                    private int f77006m;

                    /* renamed from: n, reason: collision with root package name */
                    private int f77007n;

                    /* renamed from: d, reason: collision with root package name */
                    private EnumC1117c f76997d = EnumC1117c.BYTE;

                    /* renamed from: k, reason: collision with root package name */
                    private b f77004k = b.y();

                    /* renamed from: l, reason: collision with root package name */
                    private List<c> f77005l = Collections.emptyList();

                    private C1116b() {
                    }

                    private void E() {
                    }

                    static C1116b m() {
                        return new C1116b();
                    }

                    private static C1116b s() {
                        return new C1116b();
                    }

                    private void u() {
                        if ((this.f76996c & 256) != 256) {
                            this.f77005l = new ArrayList(this.f77005l);
                            this.f76996c |= 256;
                        }
                    }

                    public int A() {
                        return this.f77005l.size();
                    }

                    public c C() {
                        return c.M();
                    }

                    public boolean D() {
                        return (this.f76996c & 128) == 128;
                    }

                    public C1116b F(b bVar) {
                        if ((this.f76996c & 128) != 128 || this.f77004k == b.y()) {
                            this.f77004k = bVar;
                        } else {
                            this.f77004k = b.G(this.f77004k).k(bVar).o();
                        }
                        this.f76996c |= 128;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                    /* renamed from: G, reason: merged with bridge method [inline-methods] */
                    public C1116b k(c cVar) {
                        if (cVar == c.M()) {
                            return this;
                        }
                        if (cVar.e0()) {
                            S(cVar.U());
                        }
                        if (cVar.c0()) {
                            P(cVar.S());
                        }
                        if (cVar.b0()) {
                            O(cVar.R());
                        }
                        if (cVar.Y()) {
                            K(cVar.O());
                        }
                        if (cVar.d0()) {
                            R(cVar.T());
                        }
                        if (cVar.X()) {
                            J(cVar.L());
                        }
                        if (cVar.Z()) {
                            M(cVar.P());
                        }
                        if (cVar.V()) {
                            F(cVar.G());
                        }
                        if (!cVar.f76991m.isEmpty()) {
                            if (this.f77005l.isEmpty()) {
                                this.f77005l = cVar.f76991m;
                                this.f76996c &= -257;
                            } else {
                                u();
                                this.f77005l.addAll(cVar.f76991m);
                            }
                        }
                        if (cVar.W()) {
                            I(cVar.H());
                        }
                        if (cVar.a0()) {
                            N(cVar.Q());
                        }
                        l(i().c(cVar.f76981c));
                        return this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
                    /* renamed from: H, reason: merged with bridge method [inline-methods] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public kotlin.reflect.jvm.internal.impl.metadata.a.b.C1112b.c.C1116b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                        /*
                            r2 = this;
                            r0 = 0
                            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$b$b$c> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.b.C1112b.c.f76980s     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                            java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                            kotlin.reflect.jvm.internal.impl.metadata.a$b$b$c r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.b.C1112b.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                            kotlin.reflect.jvm.internal.impl.metadata.a$b$b$c r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.b.C1112b.c) r4     // Catch: java.lang.Throwable -> Lf
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
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.b.C1112b.c.C1116b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$b$b$c$b");
                    }

                    public C1116b I(int i4) {
                        this.f76996c |= 512;
                        this.f77006m = i4;
                        return this;
                    }

                    public C1116b J(int i4) {
                        this.f76996c |= 32;
                        this.f77002i = i4;
                        return this;
                    }

                    public C1116b K(double d5) {
                        this.f76996c |= 8;
                        this.f77000g = d5;
                        return this;
                    }

                    public C1116b M(int i4) {
                        this.f76996c |= 64;
                        this.f77003j = i4;
                        return this;
                    }

                    public C1116b N(int i4) {
                        this.f76996c |= 1024;
                        this.f77007n = i4;
                        return this;
                    }

                    public C1116b O(float f4) {
                        this.f76996c |= 4;
                        this.f76999f = f4;
                        return this;
                    }

                    public C1116b P(long j4) {
                        this.f76996c |= 2;
                        this.f76998e = j4;
                        return this;
                    }

                    public C1116b R(int i4) {
                        this.f76996c |= 16;
                        this.f77001h = i4;
                        return this;
                    }

                    public C1116b S(EnumC1117c enumC1117c) {
                        enumC1117c.getClass();
                        this.f76996c |= 1;
                        this.f76997d = enumC1117c;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                    /* renamed from: g */
                    public c z() {
                        return c.M();
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
                        int i4 = this.f76996c;
                        int i5 = (i4 & 1) != 1 ? 0 : 1;
                        cVar.f76983e = this.f76997d;
                        if ((i4 & 2) == 2) {
                            i5 |= 2;
                        }
                        cVar.f76984f = this.f76998e;
                        if ((i4 & 4) == 4) {
                            i5 |= 4;
                        }
                        cVar.f76985g = this.f76999f;
                        if ((i4 & 8) == 8) {
                            i5 |= 8;
                        }
                        cVar.f76986h = this.f77000g;
                        if ((i4 & 16) == 16) {
                            i5 |= 16;
                        }
                        cVar.f76987i = this.f77001h;
                        if ((i4 & 32) == 32) {
                            i5 |= 32;
                        }
                        cVar.f76988j = this.f77002i;
                        if ((i4 & 64) == 64) {
                            i5 |= 64;
                        }
                        cVar.f76989k = this.f77003j;
                        if ((i4 & 128) == 128) {
                            i5 |= 128;
                        }
                        cVar.f76990l = this.f77004k;
                        if ((this.f76996c & 256) == 256) {
                            this.f77005l = Collections.unmodifiableList(this.f77005l);
                            this.f76996c &= -257;
                        }
                        cVar.f76991m = this.f77005l;
                        if ((i4 & 512) == 512) {
                            i5 |= 256;
                        }
                        cVar.f76992n = this.f77006m;
                        if ((i4 & 1024) == 1024) {
                            i5 |= 512;
                        }
                        cVar.f76993o = this.f77007n;
                        cVar.f76982d = i5;
                        return cVar;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                    public final boolean p() {
                        if (D() && !this.f77004k.p()) {
                            return false;
                        }
                        for (int i4 = 0; i4 < this.f77005l.size(); i4++) {
                            if (!y(i4).p()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                    /* renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                    public C1116b o() {
                        return new C1116b().k(o());
                    }

                    public b v() {
                        return this.f77004k;
                    }

                    public c y(int i4) {
                        return this.f77005l.get(i4);
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
                    public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                        return c.M();
                    }
                }

                /* compiled from: ProtoBuf.java */
                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$b$b$c$c, reason: collision with other inner class name */
                public enum EnumC1117c implements i.a {
                    BYTE(0, 0),
                    CHAR(1, 1),
                    SHORT(2, 2),
                    INT(3, 3),
                    LONG(4, 4),
                    FLOAT(5, 5),
                    DOUBLE(6, 6),
                    BOOLEAN(7, 7),
                    STRING(8, 8),
                    CLASS(9, 9),
                    ENUM(10, 10),
                    ANNOTATION(11, 11),
                    ARRAY(12, 12);

                    private static i.b<EnumC1117c> internalValueMap = new C1118a();
                    private final int value;

                    /* compiled from: ProtoBuf.java */
                    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$b$b$c$c$a, reason: collision with other inner class name */
                    static class C1118a implements i.b<EnumC1117c> {
                        C1118a() {
                        }

                        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                        public EnumC1117c a(int i4) {
                            return EnumC1117c.valueOf(i4);
                        }

                        public EnumC1117c b(int i4) {
                            return EnumC1117c.valueOf(i4);
                        }
                    }

                    EnumC1117c(int i4, int i5) {
                        this.value = i5;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                    public final int getNumber() {
                        return this.value;
                    }

                    public static EnumC1117c valueOf(int i4) {
                        switch (i4) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }
                }

                static {
                    c cVar = new c(true);
                    f76979r = cVar;
                    cVar.f0();
                }

                private c(h.b bVar) {
                    this.f76994p = (byte) -1;
                    this.f76995q = -1;
                    this.f76981c = bVar.i();
                }

                public static c M() {
                    return f76979r;
                }

                private void f0() {
                    this.f76983e = EnumC1117c.BYTE;
                    this.f76984f = 0L;
                    this.f76985g = 0.0f;
                    this.f76986h = com.google.firebase.remoteconfig.p.f60679p;
                    this.f76987i = 0;
                    this.f76988j = 0;
                    this.f76989k = 0;
                    this.f76990l = b.y();
                    this.f76991m = Collections.emptyList();
                    this.f76992n = 0;
                    this.f76993o = 0;
                }

                public static C1116b g0() {
                    return C1116b.m();
                }

                public static C1116b h0(c cVar) {
                    return C1116b.m().k(cVar);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
                public kotlin.reflect.jvm.internal.impl.protobuf.q<c> B() {
                    return f76980s;
                }

                public b G() {
                    return this.f76990l;
                }

                public int H() {
                    return this.f76992n;
                }

                public c I(int i4) {
                    return this.f76991m.get(i4);
                }

                public int J() {
                    return this.f76991m.size();
                }

                public List<c> K() {
                    return this.f76991m;
                }

                public int L() {
                    return this.f76988j;
                }

                public c N() {
                    return f76979r;
                }

                public double O() {
                    return this.f76986h;
                }

                public int P() {
                    return this.f76989k;
                }

                public int Q() {
                    return this.f76993o;
                }

                public float R() {
                    return this.f76985g;
                }

                public long S() {
                    return this.f76984f;
                }

                public int T() {
                    return this.f76987i;
                }

                public EnumC1117c U() {
                    return this.f76983e;
                }

                public boolean V() {
                    return (this.f76982d & 128) == 128;
                }

                public boolean W() {
                    return (this.f76982d & 256) == 256;
                }

                public boolean X() {
                    return (this.f76982d & 32) == 32;
                }

                public boolean Y() {
                    return (this.f76982d & 8) == 8;
                }

                public boolean Z() {
                    return (this.f76982d & 64) == 64;
                }

                public boolean a0() {
                    return (this.f76982d & 512) == 512;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public void b(CodedOutputStream codedOutputStream) throws IOException {
                    t();
                    if ((this.f76982d & 1) == 1) {
                        codedOutputStream.S(1, this.f76983e.getNumber());
                    }
                    if ((this.f76982d & 2) == 2) {
                        codedOutputStream.t0(2, this.f76984f);
                    }
                    if ((this.f76982d & 4) == 4) {
                        codedOutputStream.W(3, this.f76985g);
                    }
                    if ((this.f76982d & 8) == 8) {
                        codedOutputStream.Q(4, this.f76986h);
                    }
                    if ((this.f76982d & 16) == 16) {
                        codedOutputStream.a0(5, this.f76987i);
                    }
                    if ((this.f76982d & 32) == 32) {
                        codedOutputStream.a0(6, this.f76988j);
                    }
                    if ((this.f76982d & 64) == 64) {
                        codedOutputStream.a0(7, this.f76989k);
                    }
                    if ((this.f76982d & 128) == 128) {
                        codedOutputStream.d0(8, this.f76990l);
                    }
                    for (int i4 = 0; i4 < this.f76991m.size(); i4++) {
                        codedOutputStream.d0(9, this.f76991m.get(i4));
                    }
                    if ((this.f76982d & 512) == 512) {
                        codedOutputStream.a0(10, this.f76993o);
                    }
                    if ((this.f76982d & 256) == 256) {
                        codedOutputStream.a0(11, this.f76992n);
                    }
                    codedOutputStream.i0(this.f76981c);
                }

                public boolean b0() {
                    return (this.f76982d & 4) == 4;
                }

                public boolean c0() {
                    return (this.f76982d & 2) == 2;
                }

                public boolean d0() {
                    return (this.f76982d & 16) == 16;
                }

                public boolean e0() {
                    return (this.f76982d & 1) == 1;
                }

                public C1116b i0() {
                    return C1116b.m();
                }

                public C1116b j0() {
                    return h0(this);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                public final boolean p() {
                    byte b5 = this.f76994p;
                    if (b5 == 1) {
                        return true;
                    }
                    if (b5 == 0) {
                        return false;
                    }
                    if (V() && !this.f76990l.p()) {
                        this.f76994p = (byte) 0;
                        return false;
                    }
                    for (int i4 = 0; i4 < this.f76991m.size(); i4++) {
                        if (!I(i4).p()) {
                            this.f76994p = (byte) 0;
                            return false;
                        }
                    }
                    this.f76994p = (byte) 1;
                    return true;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public o.a q() {
                    return h0(this);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public int t() {
                    int i4 = this.f76995q;
                    if (i4 != -1) {
                        return i4;
                    }
                    int h4 = (this.f76982d & 1) == 1 ? CodedOutputStream.h(1, this.f76983e.getNumber()) : 0;
                    if ((this.f76982d & 2) == 2) {
                        h4 += CodedOutputStream.A(2, this.f76984f);
                    }
                    if ((this.f76982d & 4) == 4) {
                        h4 += CodedOutputStream.l(3, this.f76985g);
                    }
                    if ((this.f76982d & 8) == 8) {
                        h4 += CodedOutputStream.f(4, this.f76986h);
                    }
                    if ((this.f76982d & 16) == 16) {
                        h4 += CodedOutputStream.o(5, this.f76987i);
                    }
                    if ((this.f76982d & 32) == 32) {
                        h4 += CodedOutputStream.o(6, this.f76988j);
                    }
                    if ((this.f76982d & 64) == 64) {
                        h4 += CodedOutputStream.o(7, this.f76989k);
                    }
                    if ((this.f76982d & 128) == 128) {
                        h4 += CodedOutputStream.s(8, this.f76990l);
                    }
                    for (int i5 = 0; i5 < this.f76991m.size(); i5++) {
                        h4 += CodedOutputStream.s(9, this.f76991m.get(i5));
                    }
                    if ((this.f76982d & 512) == 512) {
                        h4 += CodedOutputStream.o(10, this.f76993o);
                    }
                    if ((this.f76982d & 256) == 256) {
                        h4 += CodedOutputStream.o(11, this.f76992n);
                    }
                    int size = this.f76981c.size() + h4;
                    this.f76995q = size;
                    return size;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public o.a w() {
                    return C1116b.m();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                    return f76979r;
                }

                private c(boolean z4) {
                    this.f76994p = (byte) -1;
                    this.f76995q = -1;
                    this.f76981c = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
                private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                    c cVar;
                    this.f76994p = (byte) -1;
                    this.f76995q = -1;
                    f0();
                    d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
                    CodedOutputStream J = CodedOutputStream.J(w4, 1);
                    boolean z4 = false;
                    char c5 = 0;
                    while (true) {
                        ?? r5 = 256;
                        if (!z4) {
                            try {
                                try {
                                    int K = eVar.K();
                                    switch (K) {
                                        case 0:
                                            z4 = true;
                                        case 8:
                                            int A = eVar.A();
                                            EnumC1117c valueOf = EnumC1117c.valueOf(A);
                                            if (valueOf == null) {
                                                J.o0(K);
                                                J.o0(A);
                                            } else {
                                                this.f76982d |= 1;
                                                this.f76983e = valueOf;
                                            }
                                        case 16:
                                            this.f76982d |= 2;
                                            this.f76984f = eVar.H();
                                        case 29:
                                            this.f76982d |= 4;
                                            this.f76985g = eVar.q();
                                        case 33:
                                            this.f76982d |= 8;
                                            this.f76986h = eVar.m();
                                        case 40:
                                            this.f76982d |= 16;
                                            this.f76987i = eVar.A();
                                        case 48:
                                            this.f76982d |= 32;
                                            this.f76988j = eVar.A();
                                        case 56:
                                            this.f76982d |= 64;
                                            this.f76989k = eVar.A();
                                        case 66:
                                            if ((this.f76982d & 128) == 128) {
                                                b bVar = this.f76990l;
                                                bVar.getClass();
                                                cVar = b.G(bVar);
                                            } else {
                                                cVar = null;
                                            }
                                            b bVar2 = (b) eVar.u(b.f76961j, fVar);
                                            this.f76990l = bVar2;
                                            if (cVar != null) {
                                                cVar.k(bVar2);
                                                this.f76990l = cVar.o();
                                            }
                                            this.f76982d |= 128;
                                        case 74:
                                            if ((c5 & 256) != 256) {
                                                this.f76991m = new ArrayList();
                                                c5 = 256;
                                            }
                                            this.f76991m.add(eVar.u(f76980s, fVar));
                                        case 80:
                                            this.f76982d |= 512;
                                            this.f76993o = eVar.A();
                                        case 88:
                                            this.f76982d |= 256;
                                            this.f76992n = eVar.A();
                                        default:
                                            r5 = eVar.P(K, J);
                                            if (r5 == 0) {
                                                z4 = true;
                                            }
                                    }
                                } catch (InvalidProtocolBufferException e4) {
                                    throw e4.i(this);
                                } catch (IOException e5) {
                                    throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                                }
                            } catch (Throwable th) {
                                if ((c5 & 256) == r5) {
                                    this.f76991m = Collections.unmodifiableList(this.f76991m);
                                }
                                try {
                                    J.I();
                                } catch (IOException unused) {
                                } catch (Throwable th2) {
                                    this.f76981c = w4.e();
                                    throw th2;
                                }
                                this.f76981c = w4.e();
                                throw th;
                            }
                        } else {
                            if ((c5 & 256) == 256) {
                                this.f76991m = Collections.unmodifiableList(this.f76991m);
                            }
                            try {
                                J.I();
                            } catch (IOException unused2) {
                            } catch (Throwable th3) {
                                this.f76981c = w4.e();
                                throw th3;
                            }
                            this.f76981c = w4.e();
                            return;
                        }
                    }
                }
            }

            private C1112b(boolean z4) {
                this.f76974g = (byte) -1;
                this.f76975h = -1;
                this.f76970c = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
            }

            private C1112b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                c.C1116b c1116b;
                this.f76974g = (byte) -1;
                this.f76975h = -1;
                C();
                d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
                CodedOutputStream J = CodedOutputStream.J(w4, 1);
                boolean z4 = false;
                while (!z4) {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K == 8) {
                                    this.f76971d |= 1;
                                    this.f76972e = eVar.A();
                                } else if (K != 18) {
                                    if (!eVar.P(K, J)) {
                                    }
                                } else {
                                    if ((this.f76971d & 2) == 2) {
                                        c cVar = this.f76973f;
                                        cVar.getClass();
                                        c1116b = c.h0(cVar);
                                    } else {
                                        c1116b = null;
                                    }
                                    c cVar2 = (c) eVar.u(c.f76980s, fVar);
                                    this.f76973f = cVar2;
                                    if (c1116b != null) {
                                        c1116b.k(cVar2);
                                        this.f76973f = c1116b.o();
                                    }
                                    this.f76971d |= 2;
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
                            this.f76970c = w4.e();
                            throw th2;
                        }
                        this.f76970c = w4.e();
                        throw th;
                    }
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f76970c = w4.e();
                    throw th3;
                }
                this.f76970c = w4.e();
            }
        }

        private b(boolean z4) {
            this.f76966g = (byte) -1;
            this.f76967h = -1;
            this.f76962c = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f76966g = (byte) -1;
            this.f76967h = -1;
            E();
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z4 = false;
            char c5 = 0;
            while (!z4) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f76963d |= 1;
                                this.f76964e = eVar.A();
                            } else if (K != 18) {
                                if (!eVar.P(K, J)) {
                                }
                            } else {
                                if ((c5 & 2) != 2) {
                                    this.f76965f = new ArrayList();
                                    c5 = 2;
                                }
                                this.f76965f.add(eVar.u(C1112b.f76969j, fVar));
                            }
                        }
                        z4 = true;
                    } catch (Throwable th) {
                        if ((c5 & 2) == 2) {
                            this.f76965f = Collections.unmodifiableList(this.f76965f);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f76962c = w4.e();
                            throw th2;
                        }
                        this.f76962c = w4.e();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.i(this);
                } catch (IOException e5) {
                    throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                }
            }
            if ((c5 & 2) == 2) {
                this.f76965f = Collections.unmodifiableList(this.f76965f);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f76962c = w4.e();
                throw th3;
            }
            this.f76962c = w4.e();
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class o extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.p {

        /* renamed from: g, reason: collision with root package name */
        private static final o f77226g;

        /* renamed from: h, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<o> f77227h = new C1136a();

        /* renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77228c;

        /* renamed from: d, reason: collision with root package name */
        private List<c> f77229d;

        /* renamed from: e, reason: collision with root package name */
        private byte f77230e;

        /* renamed from: f, reason: collision with root package name */
        private int f77231f;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$o$a, reason: collision with other inner class name */
        static class C1136a extends kotlin.reflect.jvm.internal.impl.protobuf.b<o> {
            C1136a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public o c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new o(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.b<o, b> implements kotlin.reflect.jvm.internal.impl.metadata.p {

            /* renamed from: c, reason: collision with root package name */
            private int f77232c;

            /* renamed from: d, reason: collision with root package name */
            private List<c> f77233d = Collections.emptyList();

            private b() {
            }

            private void C() {
            }

            static b m() {
                return new b();
            }

            private static b s() {
                return new b();
            }

            private void u() {
                if ((this.f77232c & 1) != 1) {
                    this.f77233d = new ArrayList(this.f77233d);
                    this.f77232c |= 1;
                }
            }

            public int A() {
                return this.f77233d.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            public b k(o oVar) {
                if (oVar == o.r()) {
                    return this;
                }
                if (!oVar.f77229d.isEmpty()) {
                    if (this.f77233d.isEmpty()) {
                        this.f77233d = oVar.f77229d;
                        this.f77232c &= -2;
                    } else {
                        u();
                        this.f77233d.addAll(oVar.f77229d);
                    }
                }
                l(i().c(oVar.f77228c));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.o.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$o> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.o.f77227h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$o r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.o) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$o r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.o) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.o.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$o$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public o z() {
                return o.r();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public o a() {
                o o4 = o();
                if (o4.p()) {
                    return o4;
                }
                throw new UninitializedMessageException(o4);
            }

            public o o() {
                o oVar = new o(this);
                if ((this.f77232c & 1) == 1) {
                    this.f77233d = Collections.unmodifiableList(this.f77233d);
                    this.f77232c &= -2;
                }
                oVar.f77229d = this.f77233d;
                return oVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                for (int i4 = 0; i4 < this.f77233d.size(); i4++) {
                    if (!y(i4).p()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public b o() {
                return new b().k(o());
            }

            public o v() {
                return o.r();
            }

            public c y(int i4) {
                return this.f77233d.get(i4);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return o.r();
            }
        }

        static {
            o oVar = new o(true);
            f77226g = oVar;
            oVar.x();
        }

        private o(h.b bVar) {
            this.f77230e = (byte) -1;
            this.f77231f = -1;
            this.f77228c = bVar.i();
        }

        public static b A(o oVar) {
            return b.m().k(oVar);
        }

        public static o r() {
            return f77226g;
        }

        private void x() {
            this.f77229d = Collections.emptyList();
        }

        public static b y() {
            return b.m();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<o> B() {
            return f77227h;
        }

        public b C() {
            return b.m();
        }

        public b D() {
            return A(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            for (int i4 = 0; i4 < this.f77229d.size(); i4++) {
                codedOutputStream.d0(1, this.f77229d.get(i4));
            }
            codedOutputStream.i0(this.f77228c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77230e;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            for (int i4 = 0; i4 < this.f77229d.size(); i4++) {
                if (!u(i4).p()) {
                    this.f77230e = (byte) 0;
                    return false;
                }
            }
            this.f77230e = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return A(this);
        }

        public o s() {
            return f77226g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77231f;
            if (i4 != -1) {
                return i4;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f77229d.size(); i6++) {
                i5 += CodedOutputStream.s(1, this.f77229d.get(i6));
            }
            int size = this.f77228c.size() + i5;
            this.f77231f = size;
            return size;
        }

        public c u(int i4) {
            return this.f77229d.get(i4);
        }

        public int v() {
            return this.f77229d.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.m();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return f77226g;
        }

        /* compiled from: ProtoBuf.java */
        public static final class c extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.o {

            /* renamed from: j, reason: collision with root package name */
            private static final c f77234j;

            /* renamed from: k, reason: collision with root package name */
            public static kotlin.reflect.jvm.internal.impl.protobuf.q<c> f77235k = new C1137a();

            /* renamed from: c, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f77236c;

            /* renamed from: d, reason: collision with root package name */
            private int f77237d;

            /* renamed from: e, reason: collision with root package name */
            private int f77238e;

            /* renamed from: f, reason: collision with root package name */
            private int f77239f;

            /* renamed from: g, reason: collision with root package name */
            private EnumC1138c f77240g;

            /* renamed from: h, reason: collision with root package name */
            private byte f77241h;

            /* renamed from: i, reason: collision with root package name */
            private int f77242i;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$o$c$a, reason: collision with other inner class name */
            static class C1137a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
                C1137a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public c c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                    return new c(eVar, fVar);
                }
            }

            /* compiled from: ProtoBuf.java */
            public static final class b extends h.b<c, b> implements kotlin.reflect.jvm.internal.impl.metadata.o {

                /* renamed from: c, reason: collision with root package name */
                private int f77243c;

                /* renamed from: e, reason: collision with root package name */
                private int f77245e;

                /* renamed from: d, reason: collision with root package name */
                private int f77244d = -1;

                /* renamed from: f, reason: collision with root package name */
                private EnumC1138c f77246f = EnumC1138c.PACKAGE;

                private b() {
                }

                static b m() {
                    return new b();
                }

                private static b s() {
                    return new b();
                }

                private void y() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: A, reason: merged with bridge method [inline-methods] */
                public b k(c cVar) {
                    if (cVar == c.u()) {
                        return this;
                    }
                    if (cVar.D()) {
                        E(cVar.y());
                    }
                    if (cVar.E()) {
                        F(cVar.A());
                    }
                    if (cVar.C()) {
                        D(cVar.x());
                    }
                    l(i().c(cVar.f77236c));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
                /* renamed from: C, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.a.o.c.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$o$c> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.o.c.f77235k     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.a$o$c r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.o.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        kotlin.reflect.jvm.internal.impl.metadata.a$o$c r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.o.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.o.c.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$o$c$b");
                }

                public b D(EnumC1138c enumC1138c) {
                    enumC1138c.getClass();
                    this.f77243c |= 4;
                    this.f77246f = enumC1138c;
                    return this;
                }

                public b E(int i4) {
                    this.f77243c |= 1;
                    this.f77244d = i4;
                    return this;
                }

                public b F(int i4) {
                    this.f77243c |= 2;
                    this.f77245e = i4;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: g */
                public c z() {
                    return c.u();
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
                    int i4 = this.f77243c;
                    int i5 = (i4 & 1) != 1 ? 0 : 1;
                    cVar.f77238e = this.f77244d;
                    if ((i4 & 2) == 2) {
                        i5 |= 2;
                    }
                    cVar.f77239f = this.f77245e;
                    if ((i4 & 4) == 4) {
                        i5 |= 4;
                    }
                    cVar.f77240g = this.f77246f;
                    cVar.f77237d = i5;
                    return cVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                public final boolean p() {
                    return v();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public b o() {
                    return new b().k(o());
                }

                public c u() {
                    return c.u();
                }

                public boolean v() {
                    return (this.f77243c & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
                public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                    return c.u();
                }
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$o$c$c, reason: collision with other inner class name */
            public enum EnumC1138c implements i.a {
                CLASS(0, 0),
                PACKAGE(1, 1),
                LOCAL(2, 2);

                private static i.b<EnumC1138c> internalValueMap = new C1139a();
                private final int value;

                /* compiled from: ProtoBuf.java */
                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$o$c$c$a, reason: collision with other inner class name */
                static class C1139a implements i.b<EnumC1138c> {
                    C1139a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                    public EnumC1138c a(int i4) {
                        return EnumC1138c.valueOf(i4);
                    }

                    public EnumC1138c b(int i4) {
                        return EnumC1138c.valueOf(i4);
                    }
                }

                EnumC1138c(int i4, int i5) {
                    this.value = i5;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                public final int getNumber() {
                    return this.value;
                }

                public static EnumC1138c valueOf(int i4) {
                    if (i4 == 0) {
                        return CLASS;
                    }
                    if (i4 == 1) {
                        return PACKAGE;
                    }
                    if (i4 != 2) {
                        return null;
                    }
                    return LOCAL;
                }
            }

            static {
                c cVar = new c(true);
                f77234j = cVar;
                cVar.F();
            }

            private c(h.b bVar) {
                this.f77241h = (byte) -1;
                this.f77242i = -1;
                this.f77236c = bVar.i();
            }

            private void F() {
                this.f77238e = -1;
                this.f77239f = 0;
                this.f77240g = EnumC1138c.PACKAGE;
            }

            public static b G() {
                return b.m();
            }

            public static b H(c cVar) {
                return b.m().k(cVar);
            }

            public static c u() {
                return f77234j;
            }

            public int A() {
                return this.f77239f;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
            public kotlin.reflect.jvm.internal.impl.protobuf.q<c> B() {
                return f77235k;
            }

            public boolean C() {
                return (this.f77237d & 4) == 4;
            }

            public boolean D() {
                return (this.f77237d & 1) == 1;
            }

            public boolean E() {
                return (this.f77237d & 2) == 2;
            }

            public b I() {
                return b.m();
            }

            public b J() {
                return H(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public void b(CodedOutputStream codedOutputStream) throws IOException {
                t();
                if ((this.f77237d & 1) == 1) {
                    codedOutputStream.a0(1, this.f77238e);
                }
                if ((this.f77237d & 2) == 2) {
                    codedOutputStream.a0(2, this.f77239f);
                }
                if ((this.f77237d & 4) == 4) {
                    codedOutputStream.S(3, this.f77240g.getNumber());
                }
                codedOutputStream.i0(this.f77236c);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                byte b5 = this.f77241h;
                if (b5 == 1) {
                    return true;
                }
                if (b5 == 0) {
                    return false;
                }
                if (E()) {
                    this.f77241h = (byte) 1;
                    return true;
                }
                this.f77241h = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public o.a q() {
                return H(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public int t() {
                int i4 = this.f77242i;
                if (i4 != -1) {
                    return i4;
                }
                int o4 = (this.f77237d & 1) == 1 ? CodedOutputStream.o(1, this.f77238e) : 0;
                if ((this.f77237d & 2) == 2) {
                    o4 += CodedOutputStream.o(2, this.f77239f);
                }
                if ((this.f77237d & 4) == 4) {
                    o4 += CodedOutputStream.h(3, this.f77240g.getNumber());
                }
                int size = this.f77236c.size() + o4;
                this.f77242i = size;
                return size;
            }

            public c v() {
                return f77234j;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public o.a w() {
                return b.m();
            }

            public EnumC1138c x() {
                return this.f77240g;
            }

            public int y() {
                return this.f77238e;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return f77234j;
            }

            private c(boolean z4) {
                this.f77241h = (byte) -1;
                this.f77242i = -1;
                this.f77236c = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
            }

            private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                this.f77241h = (byte) -1;
                this.f77242i = -1;
                F();
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
                                        this.f77237d |= 1;
                                        this.f77238e = eVar.A();
                                    } else if (K == 16) {
                                        this.f77237d |= 2;
                                        this.f77239f = eVar.A();
                                    } else if (K != 24) {
                                        if (!eVar.P(K, J)) {
                                        }
                                    } else {
                                        int A = eVar.A();
                                        EnumC1138c valueOf = EnumC1138c.valueOf(A);
                                        if (valueOf == null) {
                                            J.o0(K);
                                            J.o0(A);
                                        } else {
                                            this.f77237d |= 4;
                                            this.f77240g = valueOf;
                                        }
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
                            this.f77236c = w4.e();
                            throw th2;
                        }
                        this.f77236c = w4.e();
                        throw th;
                    }
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f77236c = w4.e();
                    throw th3;
                }
                this.f77236c = w4.e();
            }
        }

        private o(boolean z4) {
            this.f77230e = (byte) -1;
            this.f77231f = -1;
            this.f77228c = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private o(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77230e = (byte) -1;
            this.f77231f = -1;
            x();
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z4 = false;
            boolean z5 = false;
            while (!z4) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K != 10) {
                                if (!eVar.P(K, J)) {
                                }
                            } else {
                                if (!z5) {
                                    this.f77229d = new ArrayList();
                                    z5 = true;
                                }
                                this.f77229d.add(eVar.u(c.f77235k, fVar));
                            }
                        }
                        z4 = true;
                    } catch (Throwable th) {
                        if (z5) {
                            this.f77229d = Collections.unmodifiableList(this.f77229d);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f77228c = w4.e();
                            throw th2;
                        }
                        this.f77228c = w4.e();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.i(this);
                } catch (IOException e5) {
                    throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                }
            }
            if (z5) {
                this.f77229d = Collections.unmodifiableList(this.f77229d);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77228c = w4.e();
                throw th3;
            }
            this.f77228c = w4.e();
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class e extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.g {

        /* renamed from: g, reason: collision with root package name */
        private static final e f77069g;

        /* renamed from: h, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<e> f77070h = new C1123a();

        /* renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77071c;

        /* renamed from: d, reason: collision with root package name */
        private List<f> f77072d;

        /* renamed from: e, reason: collision with root package name */
        private byte f77073e;

        /* renamed from: f, reason: collision with root package name */
        private int f77074f;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$e$a, reason: collision with other inner class name */
        static class C1123a extends kotlin.reflect.jvm.internal.impl.protobuf.b<e> {
            C1123a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public e c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new e(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.b<e, b> implements kotlin.reflect.jvm.internal.impl.metadata.g {

            /* renamed from: c, reason: collision with root package name */
            private int f77075c;

            /* renamed from: d, reason: collision with root package name */
            private List<f> f77076d = Collections.emptyList();

            private b() {
            }

            private void C() {
            }

            static b m() {
                return new b();
            }

            private static b s() {
                return new b();
            }

            private void u() {
                if ((this.f77075c & 1) != 1) {
                    this.f77076d = new ArrayList(this.f77076d);
                    this.f77075c |= 1;
                }
            }

            public int A() {
                return this.f77076d.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            public b k(e eVar) {
                if (eVar == e.r()) {
                    return this;
                }
                if (!eVar.f77072d.isEmpty()) {
                    if (this.f77076d.isEmpty()) {
                        this.f77076d = eVar.f77072d;
                        this.f77075c &= -2;
                    } else {
                        u();
                        this.f77076d.addAll(eVar.f77072d);
                    }
                }
                l(i().c(eVar.f77071c));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.e.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$e> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.e.f77070h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$e r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.e) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$e r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.e) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.e.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$e$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public e z() {
                return e.r();
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
                if ((this.f77075c & 1) == 1) {
                    this.f77076d = Collections.unmodifiableList(this.f77076d);
                    this.f77075c &= -2;
                }
                eVar.f77072d = this.f77076d;
                return eVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                for (int i4 = 0; i4 < this.f77076d.size(); i4++) {
                    if (!y(i4).p()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public b o() {
                return new b().k(o());
            }

            public e v() {
                return e.r();
            }

            public f y(int i4) {
                return this.f77076d.get(i4);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return e.r();
            }
        }

        static {
            e eVar = new e(true);
            f77069g = eVar;
            eVar.x();
        }

        private e(h.b bVar) {
            this.f77073e = (byte) -1;
            this.f77074f = -1;
            this.f77071c = bVar.i();
        }

        public static b A(e eVar) {
            return b.m().k(eVar);
        }

        public static e r() {
            return f77069g;
        }

        private void x() {
            this.f77072d = Collections.emptyList();
        }

        public static b y() {
            return b.m();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<e> B() {
            return f77070h;
        }

        public b C() {
            return b.m();
        }

        public b D() {
            return A(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            for (int i4 = 0; i4 < this.f77072d.size(); i4++) {
                codedOutputStream.d0(1, this.f77072d.get(i4));
            }
            codedOutputStream.i0(this.f77071c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77073e;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            for (int i4 = 0; i4 < this.f77072d.size(); i4++) {
                if (!u(i4).p()) {
                    this.f77073e = (byte) 0;
                    return false;
                }
            }
            this.f77073e = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return A(this);
        }

        public e s() {
            return f77069g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77074f;
            if (i4 != -1) {
                return i4;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f77072d.size(); i6++) {
                i5 += CodedOutputStream.s(1, this.f77072d.get(i6));
            }
            int size = this.f77071c.size() + i5;
            this.f77074f = size;
            return size;
        }

        public f u(int i4) {
            return this.f77072d.get(i4);
        }

        public int v() {
            return this.f77072d.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.m();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return f77069g;
        }

        private e(boolean z4) {
            this.f77073e = (byte) -1;
            this.f77074f = -1;
            this.f77071c = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private e(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77073e = (byte) -1;
            this.f77074f = -1;
            x();
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z4 = false;
            boolean z5 = false;
            while (!z4) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K != 10) {
                                if (!eVar.P(K, J)) {
                                }
                            } else {
                                if (!z5) {
                                    this.f77072d = new ArrayList();
                                    z5 = true;
                                }
                                this.f77072d.add(eVar.u(f.f77078l, fVar));
                            }
                        }
                        z4 = true;
                    } catch (Throwable th) {
                        if (z5) {
                            this.f77072d = Collections.unmodifiableList(this.f77072d);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f77071c = w4.e();
                            throw th2;
                        }
                        this.f77071c = w4.e();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.i(this);
                } catch (IOException e5) {
                    throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                }
            }
            if (z5) {
                this.f77072d = Collections.unmodifiableList(this.f77072d);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77071c = w4.e();
                throw th3;
            }
            this.f77071c = w4.e();
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class f extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.h {

        /* renamed from: k, reason: collision with root package name */
        private static final f f77077k;

        /* renamed from: l, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<f> f77078l = new C1124a();

        /* renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77079c;

        /* renamed from: d, reason: collision with root package name */
        private int f77080d;

        /* renamed from: e, reason: collision with root package name */
        private c f77081e;

        /* renamed from: f, reason: collision with root package name */
        private List<h> f77082f;

        /* renamed from: g, reason: collision with root package name */
        private h f77083g;

        /* renamed from: h, reason: collision with root package name */
        private d f77084h;

        /* renamed from: i, reason: collision with root package name */
        private byte f77085i;

        /* renamed from: j, reason: collision with root package name */
        private int f77086j;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$f$a, reason: collision with other inner class name */
        static class C1124a extends kotlin.reflect.jvm.internal.impl.protobuf.b<f> {
            C1124a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public f c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new f(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.b<f, b> implements kotlin.reflect.jvm.internal.impl.metadata.h {

            /* renamed from: c, reason: collision with root package name */
            private int f77087c;

            /* renamed from: d, reason: collision with root package name */
            private c f77088d = c.RETURNS_CONSTANT;

            /* renamed from: e, reason: collision with root package name */
            private List<h> f77089e = Collections.emptyList();

            /* renamed from: f, reason: collision with root package name */
            private h f77090f = h.G();

            /* renamed from: g, reason: collision with root package name */
            private d f77091g = d.AT_MOST_ONCE;

            private b() {
            }

            private void E() {
            }

            static b m() {
                return new b();
            }

            private static b s() {
                return new b();
            }

            private void u() {
                if ((this.f77087c & 2) != 2) {
                    this.f77089e = new ArrayList(this.f77089e);
                    this.f77087c |= 2;
                }
            }

            public h A(int i4) {
                return this.f77089e.get(i4);
            }

            public int C() {
                return this.f77089e.size();
            }

            public boolean D() {
                return (this.f77087c & 4) == 4;
            }

            public b F(h hVar) {
                if ((this.f77087c & 4) != 4 || this.f77090f == h.G()) {
                    this.f77090f = hVar;
                } else {
                    this.f77090f = h.V(this.f77090f).k(hVar).o();
                }
                this.f77087c |= 4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: G, reason: merged with bridge method [inline-methods] */
            public b k(f fVar) {
                if (fVar == f.y()) {
                    return this;
                }
                if (fVar.H()) {
                    I(fVar.E());
                }
                if (!fVar.f77082f.isEmpty()) {
                    if (this.f77089e.isEmpty()) {
                        this.f77089e = fVar.f77082f;
                        this.f77087c &= -3;
                    } else {
                        u();
                        this.f77089e.addAll(fVar.f77082f);
                    }
                }
                if (fVar.G()) {
                    F(fVar.x());
                }
                if (fVar.I()) {
                    J(fVar.F());
                }
                l(i().c(fVar.f77079c));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: H, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.f.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$f> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.f.f77078l     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$f r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.f) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$f r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.f) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.f.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$f$b");
            }

            public b I(c cVar) {
                cVar.getClass();
                this.f77087c |= 1;
                this.f77088d = cVar;
                return this;
            }

            public b J(d dVar) {
                dVar.getClass();
                this.f77087c |= 8;
                this.f77091g = dVar;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public f z() {
                return f.y();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public f a() {
                f o4 = o();
                if (o4.p()) {
                    return o4;
                }
                throw new UninitializedMessageException(o4);
            }

            public f o() {
                f fVar = new f(this);
                int i4 = this.f77087c;
                int i5 = (i4 & 1) != 1 ? 0 : 1;
                fVar.f77081e = this.f77088d;
                if ((this.f77087c & 2) == 2) {
                    this.f77089e = Collections.unmodifiableList(this.f77089e);
                    this.f77087c &= -3;
                }
                fVar.f77082f = this.f77089e;
                if ((i4 & 4) == 4) {
                    i5 |= 2;
                }
                fVar.f77083g = this.f77090f;
                if ((i4 & 8) == 8) {
                    i5 |= 4;
                }
                fVar.f77084h = this.f77091g;
                fVar.f77080d = i5;
                return fVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                for (int i4 = 0; i4 < this.f77089e.size(); i4++) {
                    if (!A(i4).p()) {
                        return false;
                    }
                }
                return !D() || this.f77090f.p();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public b o() {
                return new b().k(o());
            }

            public h v() {
                return this.f77090f;
            }

            public f y() {
                return f.y();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return f.y();
            }
        }

        /* compiled from: ProtoBuf.java */
        public enum c implements i.a {
            RETURNS_CONSTANT(0, 0),
            CALLS(1, 1),
            RETURNS_NOT_NULL(2, 2);

            private static i.b<c> internalValueMap = new C1125a();
            private final int value;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$f$c$a, reason: collision with other inner class name */
            static class C1125a implements i.b<c> {
                C1125a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                public c a(int i4) {
                    return c.valueOf(i4);
                }

                public c b(int i4) {
                    return c.valueOf(i4);
                }
            }

            c(int i4, int i5) {
                this.value = i5;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.value;
            }

            public static c valueOf(int i4) {
                if (i4 == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i4 == 1) {
                    return CALLS;
                }
                if (i4 != 2) {
                    return null;
                }
                return RETURNS_NOT_NULL;
            }
        }

        /* compiled from: ProtoBuf.java */
        public enum d implements i.a {
            AT_MOST_ONCE(0, 0),
            EXACTLY_ONCE(1, 1),
            AT_LEAST_ONCE(2, 2);

            private static i.b<d> internalValueMap = new C1126a();
            private final int value;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$f$d$a, reason: collision with other inner class name */
            static class C1126a implements i.b<d> {
                C1126a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                public d a(int i4) {
                    return d.valueOf(i4);
                }

                public d b(int i4) {
                    return d.valueOf(i4);
                }
            }

            d(int i4, int i5) {
                this.value = i5;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.value;
            }

            public static d valueOf(int i4) {
                if (i4 == 0) {
                    return AT_MOST_ONCE;
                }
                if (i4 == 1) {
                    return EXACTLY_ONCE;
                }
                if (i4 != 2) {
                    return null;
                }
                return AT_LEAST_ONCE;
            }
        }

        static {
            f fVar = new f(true);
            f77077k = fVar;
            fVar.J();
        }

        private f(h.b bVar) {
            this.f77085i = (byte) -1;
            this.f77086j = -1;
            this.f77079c = bVar.i();
        }

        private void J() {
            this.f77081e = c.RETURNS_CONSTANT;
            this.f77082f = Collections.emptyList();
            this.f77083g = h.G();
            this.f77084h = d.AT_MOST_ONCE;
        }

        public static b K() {
            return b.m();
        }

        public static b L(f fVar) {
            return b.m().k(fVar);
        }

        public static f y() {
            return f77077k;
        }

        public f A() {
            return f77077k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<f> B() {
            return f77078l;
        }

        public h C(int i4) {
            return this.f77082f.get(i4);
        }

        public int D() {
            return this.f77082f.size();
        }

        public c E() {
            return this.f77081e;
        }

        public d F() {
            return this.f77084h;
        }

        public boolean G() {
            return (this.f77080d & 2) == 2;
        }

        public boolean H() {
            return (this.f77080d & 1) == 1;
        }

        public boolean I() {
            return (this.f77080d & 4) == 4;
        }

        public b M() {
            return b.m();
        }

        public b N() {
            return L(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            if ((this.f77080d & 1) == 1) {
                codedOutputStream.S(1, this.f77081e.getNumber());
            }
            for (int i4 = 0; i4 < this.f77082f.size(); i4++) {
                codedOutputStream.d0(2, this.f77082f.get(i4));
            }
            if ((this.f77080d & 2) == 2) {
                codedOutputStream.d0(3, this.f77083g);
            }
            if ((this.f77080d & 4) == 4) {
                codedOutputStream.S(4, this.f77084h.getNumber());
            }
            codedOutputStream.i0(this.f77079c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77085i;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            for (int i4 = 0; i4 < this.f77082f.size(); i4++) {
                if (!C(i4).p()) {
                    this.f77085i = (byte) 0;
                    return false;
                }
            }
            if (!G() || this.f77083g.p()) {
                this.f77085i = (byte) 1;
                return true;
            }
            this.f77085i = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return L(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77086j;
            if (i4 != -1) {
                return i4;
            }
            int h4 = (this.f77080d & 1) == 1 ? CodedOutputStream.h(1, this.f77081e.getNumber()) : 0;
            for (int i5 = 0; i5 < this.f77082f.size(); i5++) {
                h4 += CodedOutputStream.s(2, this.f77082f.get(i5));
            }
            if ((this.f77080d & 2) == 2) {
                h4 += CodedOutputStream.s(3, this.f77083g);
            }
            if ((this.f77080d & 4) == 4) {
                h4 += CodedOutputStream.h(4, this.f77084h.getNumber());
            }
            int size = this.f77079c.size() + h4;
            this.f77086j = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.m();
        }

        public h x() {
            return this.f77083g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return f77077k;
        }

        private f(boolean z4) {
            this.f77085i = (byte) -1;
            this.f77086j = -1;
            this.f77079c = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            h.b bVar;
            this.f77085i = (byte) -1;
            this.f77086j = -1;
            J();
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z4 = false;
            char c5 = 0;
            while (!z4) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K == 8) {
                                    int A = eVar.A();
                                    c valueOf = c.valueOf(A);
                                    if (valueOf == null) {
                                        J.o0(K);
                                        J.o0(A);
                                    } else {
                                        this.f77080d |= 1;
                                        this.f77081e = valueOf;
                                    }
                                } else if (K == 18) {
                                    if ((c5 & 2) != 2) {
                                        this.f77082f = new ArrayList();
                                        c5 = 2;
                                    }
                                    this.f77082f.add(eVar.u(h.f77102o, fVar));
                                } else if (K == 26) {
                                    if ((this.f77080d & 2) == 2) {
                                        h hVar = this.f77083g;
                                        hVar.getClass();
                                        bVar = h.V(hVar);
                                    } else {
                                        bVar = null;
                                    }
                                    h hVar2 = (h) eVar.u(h.f77102o, fVar);
                                    this.f77083g = hVar2;
                                    if (bVar != null) {
                                        bVar.k(hVar2);
                                        this.f77083g = bVar.o();
                                    }
                                    this.f77080d |= 2;
                                } else if (K != 32) {
                                    if (!eVar.P(K, J)) {
                                    }
                                } else {
                                    int A2 = eVar.A();
                                    d valueOf2 = d.valueOf(A2);
                                    if (valueOf2 == null) {
                                        J.o0(K);
                                        J.o0(A2);
                                    } else {
                                        this.f77080d |= 4;
                                        this.f77084h = valueOf2;
                                    }
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
                    if ((c5 & 2) == 2) {
                        this.f77082f = Collections.unmodifiableList(this.f77082f);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f77079c = w4.e();
                        throw th2;
                    }
                    this.f77079c = w4.e();
                    throw th;
                }
            }
            if ((c5 & 2) == 2) {
                this.f77082f = Collections.unmodifiableList(this.f77082f);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77079c = w4.e();
                throw th3;
            }
            this.f77079c = w4.e();
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class h extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.j {

        /* renamed from: n, reason: collision with root package name */
        private static final h f77101n;

        /* renamed from: o, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<h> f77102o = new C1128a();

        /* renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77103c;

        /* renamed from: d, reason: collision with root package name */
        private int f77104d;

        /* renamed from: e, reason: collision with root package name */
        private int f77105e;

        /* renamed from: f, reason: collision with root package name */
        private int f77106f;

        /* renamed from: g, reason: collision with root package name */
        private c f77107g;

        /* renamed from: h, reason: collision with root package name */
        private q f77108h;

        /* renamed from: i, reason: collision with root package name */
        private int f77109i;

        /* renamed from: j, reason: collision with root package name */
        private List<h> f77110j;

        /* renamed from: k, reason: collision with root package name */
        private List<h> f77111k;

        /* renamed from: l, reason: collision with root package name */
        private byte f77112l;

        /* renamed from: m, reason: collision with root package name */
        private int f77113m;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$h$a, reason: collision with other inner class name */
        static class C1128a extends kotlin.reflect.jvm.internal.impl.protobuf.b<h> {
            C1128a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public h c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new h(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.b<h, b> implements kotlin.reflect.jvm.internal.impl.metadata.j {

            /* renamed from: c, reason: collision with root package name */
            private int f77114c;

            /* renamed from: d, reason: collision with root package name */
            private int f77115d;

            /* renamed from: e, reason: collision with root package name */
            private int f77116e;

            /* renamed from: h, reason: collision with root package name */
            private int f77119h;

            /* renamed from: f, reason: collision with root package name */
            private c f77117f = c.TRUE;

            /* renamed from: g, reason: collision with root package name */
            private q f77118g = q.Y();

            /* renamed from: i, reason: collision with root package name */
            private List<h> f77120i = Collections.emptyList();

            /* renamed from: j, reason: collision with root package name */
            private List<h> f77121j = Collections.emptyList();

            private b() {
            }

            private void H() {
            }

            static b m() {
                return new b();
            }

            private static b s() {
                return new b();
            }

            private void u() {
                if ((this.f77114c & 32) != 32) {
                    this.f77120i = new ArrayList(this.f77120i);
                    this.f77114c |= 32;
                }
            }

            private void v() {
                if ((this.f77114c & 64) != 64) {
                    this.f77121j = new ArrayList(this.f77121j);
                    this.f77114c |= 64;
                }
            }

            public int A() {
                return this.f77120i.size();
            }

            public h C() {
                return h.G();
            }

            public q D() {
                return this.f77118g;
            }

            public h E(int i4) {
                return this.f77121j.get(i4);
            }

            public int F() {
                return this.f77121j.size();
            }

            public boolean G() {
                return (this.f77114c & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: I, reason: merged with bridge method [inline-methods] */
            public b k(h hVar) {
                if (hVar == h.G()) {
                    return this;
                }
                if (hVar.P()) {
                    N(hVar.I());
                }
                if (hVar.S()) {
                    P(hVar.N());
                }
                if (hVar.O()) {
                    M(hVar.F());
                }
                if (hVar.Q()) {
                    K(hVar.J());
                }
                if (hVar.R()) {
                    O(hVar.K());
                }
                if (!hVar.f77110j.isEmpty()) {
                    if (this.f77120i.isEmpty()) {
                        this.f77120i = hVar.f77110j;
                        this.f77114c &= -33;
                    } else {
                        u();
                        this.f77120i.addAll(hVar.f77110j);
                    }
                }
                if (!hVar.f77111k.isEmpty()) {
                    if (this.f77121j.isEmpty()) {
                        this.f77121j = hVar.f77111k;
                        this.f77114c &= -65;
                    } else {
                        v();
                        this.f77121j.addAll(hVar.f77111k);
                    }
                }
                l(i().c(hVar.f77103c));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: J, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.h.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$h> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.h.f77102o     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$h r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.h) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$h r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.h) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.h.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$h$b");
            }

            public b K(q qVar) {
                if ((this.f77114c & 8) != 8 || this.f77118g == q.Y()) {
                    this.f77118g = qVar;
                } else {
                    this.f77118g = q.A0(this.f77118g).k(qVar).A();
                }
                this.f77114c |= 8;
                return this;
            }

            public b M(c cVar) {
                cVar.getClass();
                this.f77114c |= 4;
                this.f77117f = cVar;
                return this;
            }

            public b N(int i4) {
                this.f77114c |= 1;
                this.f77115d = i4;
                return this;
            }

            public b O(int i4) {
                this.f77114c |= 16;
                this.f77119h = i4;
                return this;
            }

            public b P(int i4) {
                this.f77114c |= 2;
                this.f77116e = i4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public h z() {
                return h.G();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public h a() {
                h o4 = o();
                if (o4.p()) {
                    return o4;
                }
                throw new UninitializedMessageException(o4);
            }

            public h o() {
                h hVar = new h(this);
                int i4 = this.f77114c;
                int i5 = (i4 & 1) != 1 ? 0 : 1;
                hVar.f77105e = this.f77115d;
                if ((i4 & 2) == 2) {
                    i5 |= 2;
                }
                hVar.f77106f = this.f77116e;
                if ((i4 & 4) == 4) {
                    i5 |= 4;
                }
                hVar.f77107g = this.f77117f;
                if ((i4 & 8) == 8) {
                    i5 |= 8;
                }
                hVar.f77108h = this.f77118g;
                if ((i4 & 16) == 16) {
                    i5 |= 16;
                }
                hVar.f77109i = this.f77119h;
                if ((this.f77114c & 32) == 32) {
                    this.f77120i = Collections.unmodifiableList(this.f77120i);
                    this.f77114c &= -33;
                }
                hVar.f77110j = this.f77120i;
                if ((this.f77114c & 64) == 64) {
                    this.f77121j = Collections.unmodifiableList(this.f77121j);
                    this.f77114c &= -65;
                }
                hVar.f77111k = this.f77121j;
                hVar.f77104d = i5;
                return hVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                if (G() && !this.f77118g.p()) {
                    return false;
                }
                for (int i4 = 0; i4 < this.f77120i.size(); i4++) {
                    if (!y(i4).p()) {
                        return false;
                    }
                }
                for (int i5 = 0; i5 < this.f77121j.size(); i5++) {
                    if (!E(i5).p()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public b o() {
                return new b().k(o());
            }

            public h y(int i4) {
                return this.f77120i.get(i4);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return h.G();
            }
        }

        /* compiled from: ProtoBuf.java */
        public enum c implements i.a {
            TRUE(0, 0),
            FALSE(1, 1),
            NULL(2, 2);

            private static i.b<c> internalValueMap = new C1129a();
            private final int value;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$h$c$a, reason: collision with other inner class name */
            static class C1129a implements i.b<c> {
                C1129a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                public c a(int i4) {
                    return c.valueOf(i4);
                }

                public c b(int i4) {
                    return c.valueOf(i4);
                }
            }

            c(int i4, int i5) {
                this.value = i5;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.value;
            }

            public static c valueOf(int i4) {
                if (i4 == 0) {
                    return TRUE;
                }
                if (i4 == 1) {
                    return FALSE;
                }
                if (i4 != 2) {
                    return null;
                }
                return NULL;
            }
        }

        static {
            h hVar = new h(true);
            f77101n = hVar;
            hVar.T();
        }

        private h(h.b bVar) {
            this.f77112l = (byte) -1;
            this.f77113m = -1;
            this.f77103c = bVar.i();
        }

        public static h G() {
            return f77101n;
        }

        private void T() {
            this.f77105e = 0;
            this.f77106f = 0;
            this.f77107g = c.TRUE;
            this.f77108h = q.Y();
            this.f77109i = 0;
            this.f77110j = Collections.emptyList();
            this.f77111k = Collections.emptyList();
        }

        public static b U() {
            return b.m();
        }

        public static b V(h hVar) {
            return b.m().k(hVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<h> B() {
            return f77102o;
        }

        public h D(int i4) {
            return this.f77110j.get(i4);
        }

        public int E() {
            return this.f77110j.size();
        }

        public c F() {
            return this.f77107g;
        }

        public h H() {
            return f77101n;
        }

        public int I() {
            return this.f77105e;
        }

        public q J() {
            return this.f77108h;
        }

        public int K() {
            return this.f77109i;
        }

        public h L(int i4) {
            return this.f77111k.get(i4);
        }

        public int M() {
            return this.f77111k.size();
        }

        public int N() {
            return this.f77106f;
        }

        public boolean O() {
            return (this.f77104d & 4) == 4;
        }

        public boolean P() {
            return (this.f77104d & 1) == 1;
        }

        public boolean Q() {
            return (this.f77104d & 8) == 8;
        }

        public boolean R() {
            return (this.f77104d & 16) == 16;
        }

        public boolean S() {
            return (this.f77104d & 2) == 2;
        }

        public b W() {
            return b.m();
        }

        public b X() {
            return V(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            if ((this.f77104d & 1) == 1) {
                codedOutputStream.a0(1, this.f77105e);
            }
            if ((this.f77104d & 2) == 2) {
                codedOutputStream.a0(2, this.f77106f);
            }
            if ((this.f77104d & 4) == 4) {
                codedOutputStream.S(3, this.f77107g.getNumber());
            }
            if ((this.f77104d & 8) == 8) {
                codedOutputStream.d0(4, this.f77108h);
            }
            if ((this.f77104d & 16) == 16) {
                codedOutputStream.a0(5, this.f77109i);
            }
            for (int i4 = 0; i4 < this.f77110j.size(); i4++) {
                codedOutputStream.d0(6, this.f77110j.get(i4));
            }
            for (int i5 = 0; i5 < this.f77111k.size(); i5++) {
                codedOutputStream.d0(7, this.f77111k.get(i5));
            }
            codedOutputStream.i0(this.f77103c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77112l;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            if (Q() && !this.f77108h.p()) {
                this.f77112l = (byte) 0;
                return false;
            }
            for (int i4 = 0; i4 < this.f77110j.size(); i4++) {
                if (!D(i4).p()) {
                    this.f77112l = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < this.f77111k.size(); i5++) {
                if (!L(i5).p()) {
                    this.f77112l = (byte) 0;
                    return false;
                }
            }
            this.f77112l = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return V(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77113m;
            if (i4 != -1) {
                return i4;
            }
            int o4 = (this.f77104d & 1) == 1 ? CodedOutputStream.o(1, this.f77105e) : 0;
            if ((this.f77104d & 2) == 2) {
                o4 += CodedOutputStream.o(2, this.f77106f);
            }
            if ((this.f77104d & 4) == 4) {
                o4 += CodedOutputStream.h(3, this.f77107g.getNumber());
            }
            if ((this.f77104d & 8) == 8) {
                o4 += CodedOutputStream.s(4, this.f77108h);
            }
            if ((this.f77104d & 16) == 16) {
                o4 += CodedOutputStream.o(5, this.f77109i);
            }
            for (int i5 = 0; i5 < this.f77110j.size(); i5++) {
                o4 += CodedOutputStream.s(6, this.f77110j.get(i5));
            }
            for (int i6 = 0; i6 < this.f77111k.size(); i6++) {
                o4 += CodedOutputStream.s(7, this.f77111k.get(i6));
            }
            int size = this.f77103c.size() + o4;
            this.f77113m = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.m();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return f77101n;
        }

        private h(boolean z4) {
            this.f77112l = (byte) -1;
            this.f77113m = -1;
            this.f77103c = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private h(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            q.c cVar;
            this.f77112l = (byte) -1;
            this.f77113m = -1;
            T();
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
                                this.f77104d |= 1;
                                this.f77105e = eVar.A();
                            } else if (K == 16) {
                                this.f77104d |= 2;
                                this.f77106f = eVar.A();
                            } else if (K == 24) {
                                int A = eVar.A();
                                c valueOf = c.valueOf(A);
                                if (valueOf == null) {
                                    J.o0(K);
                                    J.o0(A);
                                } else {
                                    this.f77104d |= 4;
                                    this.f77107g = valueOf;
                                }
                            } else if (K == 34) {
                                if ((this.f77104d & 8) == 8) {
                                    q qVar = this.f77108h;
                                    qVar.getClass();
                                    cVar = q.A0(qVar);
                                } else {
                                    cVar = null;
                                }
                                q qVar2 = (q) eVar.u(q.f77256w, fVar);
                                this.f77108h = qVar2;
                                if (cVar != null) {
                                    cVar.k(qVar2);
                                    this.f77108h = cVar.A();
                                }
                                this.f77104d |= 8;
                            } else if (K == 40) {
                                this.f77104d |= 16;
                                this.f77109i = eVar.A();
                            } else if (K == 50) {
                                if ((i4 & 32) != 32) {
                                    this.f77110j = new ArrayList();
                                    i4 |= 32;
                                }
                                this.f77110j.add(eVar.u(f77102o, fVar));
                            } else if (K != 58) {
                                if (!eVar.P(K, J)) {
                                }
                            } else {
                                if ((i4 & 64) != 64) {
                                    this.f77111k = new ArrayList();
                                    i4 |= 64;
                                }
                                this.f77111k.add(eVar.u(f77102o, fVar));
                            }
                        }
                        z4 = true;
                    } catch (Throwable th) {
                        if ((i4 & 32) == 32) {
                            this.f77110j = Collections.unmodifiableList(this.f77110j);
                        }
                        if ((i4 & 64) == 64) {
                            this.f77111k = Collections.unmodifiableList(this.f77111k);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f77103c = w4.e();
                            throw th2;
                        }
                        this.f77103c = w4.e();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.i(this);
                } catch (IOException e5) {
                    throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                }
            }
            if ((i4 & 32) == 32) {
                this.f77110j = Collections.unmodifiableList(this.f77110j);
            }
            if ((i4 & 64) == 64) {
                this.f77111k = Collections.unmodifiableList(this.f77111k);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77103c = w4.e();
                throw th3;
            }
            this.f77103c = w4.e();
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class p extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.q {

        /* renamed from: g, reason: collision with root package name */
        private static final p f77247g;

        /* renamed from: h, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<p> f77248h = new C1140a();

        /* renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77249c;

        /* renamed from: d, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.m f77250d;

        /* renamed from: e, reason: collision with root package name */
        private byte f77251e;

        /* renamed from: f, reason: collision with root package name */
        private int f77252f;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$p$a, reason: collision with other inner class name */
        static class C1140a extends kotlin.reflect.jvm.internal.impl.protobuf.b<p> {
            C1140a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public p c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new p(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.b<p, b> implements kotlin.reflect.jvm.internal.impl.metadata.q {

            /* renamed from: c, reason: collision with root package name */
            private int f77253c;

            /* renamed from: d, reason: collision with root package name */
            private kotlin.reflect.jvm.internal.impl.protobuf.m f77254d = kotlin.reflect.jvm.internal.impl.protobuf.l.f77736c;

            private b() {
            }

            static b m() {
                return new b();
            }

            private static b s() {
                return new b();
            }

            private void u() {
                if ((this.f77253c & 1) != 1) {
                    this.f77254d = new kotlin.reflect.jvm.internal.impl.protobuf.l(this.f77254d);
                    this.f77253c |= 1;
                }
            }

            private void y() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public b k(p pVar) {
                if (pVar == p.r()) {
                    return this;
                }
                if (!pVar.f77250d.isEmpty()) {
                    if (this.f77254d.isEmpty()) {
                        this.f77254d = pVar.f77250d;
                        this.f77253c &= -2;
                    } else {
                        u();
                        this.f77254d.addAll(pVar.f77250d);
                    }
                }
                l(i().c(pVar.f77249c));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.p.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$p> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.p.f77248h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$p r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.p) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$p r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.p) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.p.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$p$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public p z() {
                return p.r();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public p a() {
                p o4 = o();
                if (o4.p()) {
                    return o4;
                }
                throw new UninitializedMessageException(o4);
            }

            public p o() {
                p pVar = new p(this);
                if ((this.f77253c & 1) == 1) {
                    this.f77254d = this.f77254d.N();
                    this.f77253c &= -2;
                }
                pVar.f77250d = this.f77254d;
                return pVar;
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

            public p v() {
                return p.r();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return p.r();
            }
        }

        static {
            p pVar = new p(true);
            f77247g = pVar;
            pVar.f77250d = kotlin.reflect.jvm.internal.impl.protobuf.l.f77736c;
        }

        private p(h.b bVar) {
            this.f77251e = (byte) -1;
            this.f77252f = -1;
            this.f77249c = bVar.i();
        }

        public static b A(p pVar) {
            return b.m().k(pVar);
        }

        public static p r() {
            return f77247g;
        }

        private void x() {
            this.f77250d = kotlin.reflect.jvm.internal.impl.protobuf.l.f77736c;
        }

        public static b y() {
            return b.m();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<p> B() {
            return f77248h;
        }

        public b C() {
            return b.m();
        }

        public b D() {
            return A(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            for (int i4 = 0; i4 < this.f77250d.size(); i4++) {
                codedOutputStream.O(1, this.f77250d.B(i4));
            }
            codedOutputStream.i0(this.f77249c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77251e;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            this.f77251e = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return A(this);
        }

        public p s() {
            return f77247g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77252f;
            if (i4 != -1) {
                return i4;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f77250d.size(); i6++) {
                i5 += CodedOutputStream.e(this.f77250d.B(i6));
            }
            int size = this.f77249c.size() + this.f77250d.size() + i5;
            this.f77252f = size;
            return size;
        }

        public String u(int i4) {
            return this.f77250d.get(i4);
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.r v() {
            return this.f77250d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.m();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return f77247g;
        }

        private p(boolean z4) {
            this.f77251e = (byte) -1;
            this.f77252f = -1;
            this.f77249c = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        private p(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77251e = (byte) -1;
            this.f77252f = -1;
            this.f77250d = kotlin.reflect.jvm.internal.impl.protobuf.l.f77736c;
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z4 = false;
            boolean z5 = false;
            while (!z4) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K != 10) {
                                    if (!eVar.P(K, J)) {
                                    }
                                } else {
                                    kotlin.reflect.jvm.internal.impl.protobuf.d l4 = eVar.l();
                                    if (!z5) {
                                        this.f77250d = new kotlin.reflect.jvm.internal.impl.protobuf.l();
                                        z5 = true;
                                    }
                                    this.f77250d.L1(l4);
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
                    if (z5) {
                        this.f77250d = this.f77250d.N();
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f77249c = w4.e();
                        throw th2;
                    }
                    this.f77249c = w4.e();
                    throw th;
                }
            }
            if (z5) {
                this.f77250d = this.f77250d.N();
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77249c = w4.e();
                throw th3;
            }
            this.f77249c = w4.e();
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class t extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.v {

        /* renamed from: i, reason: collision with root package name */
        private static final t f77348i;

        /* renamed from: j, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<t> f77349j = new C1148a();

        /* renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77350c;

        /* renamed from: d, reason: collision with root package name */
        private int f77351d;

        /* renamed from: e, reason: collision with root package name */
        private List<q> f77352e;

        /* renamed from: f, reason: collision with root package name */
        private int f77353f;

        /* renamed from: g, reason: collision with root package name */
        private byte f77354g;

        /* renamed from: h, reason: collision with root package name */
        private int f77355h;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$t$a, reason: collision with other inner class name */
        static class C1148a extends kotlin.reflect.jvm.internal.impl.protobuf.b<t> {
            C1148a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public t c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new t(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.b<t, b> implements kotlin.reflect.jvm.internal.impl.metadata.v {

            /* renamed from: c, reason: collision with root package name */
            private int f77356c;

            /* renamed from: d, reason: collision with root package name */
            private List<q> f77357d = Collections.emptyList();

            /* renamed from: e, reason: collision with root package name */
            private int f77358e = -1;

            private b() {
            }

            private void C() {
            }

            static b m() {
                return new b();
            }

            private static b s() {
                return new b();
            }

            private void u() {
                if ((this.f77356c & 1) != 1) {
                    this.f77357d = new ArrayList(this.f77357d);
                    this.f77356c |= 1;
                }
            }

            public int A() {
                return this.f77357d.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            public b k(t tVar) {
                if (tVar == t.u()) {
                    return this;
                }
                if (!tVar.f77352e.isEmpty()) {
                    if (this.f77357d.isEmpty()) {
                        this.f77357d = tVar.f77352e;
                        this.f77356c &= -2;
                    } else {
                        u();
                        this.f77357d.addAll(tVar.f77352e);
                    }
                }
                if (tVar.D()) {
                    F(tVar.x());
                }
                l(i().c(tVar.f77350c));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.t.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$t> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.t.f77349j     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$t r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.t) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$t r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.t) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.t.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$t$b");
            }

            public b F(int i4) {
                this.f77356c |= 2;
                this.f77358e = i4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public t z() {
                return t.u();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public t a() {
                t o4 = o();
                if (o4.p()) {
                    return o4;
                }
                throw new UninitializedMessageException(o4);
            }

            public t o() {
                t tVar = new t(this);
                int i4 = this.f77356c;
                if ((i4 & 1) == 1) {
                    this.f77357d = Collections.unmodifiableList(this.f77357d);
                    this.f77356c &= -2;
                }
                tVar.f77352e = this.f77357d;
                int i5 = (i4 & 2) != 2 ? 0 : 1;
                tVar.f77353f = this.f77358e;
                tVar.f77351d = i5;
                return tVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean p() {
                for (int i4 = 0; i4 < this.f77357d.size(); i4++) {
                    if (!y(i4).p()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public b o() {
                return new b().k(o());
            }

            public t v() {
                return t.u();
            }

            public q y(int i4) {
                return this.f77357d.get(i4);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return t.u();
            }
        }

        static {
            t tVar = new t(true);
            f77348i = tVar;
            tVar.E();
        }

        private t(h.b bVar) {
            this.f77354g = (byte) -1;
            this.f77355h = -1;
            this.f77350c = bVar.i();
        }

        private void E() {
            this.f77352e = Collections.emptyList();
            this.f77353f = -1;
        }

        public static b F() {
            return b.m();
        }

        public static b G(t tVar) {
            return b.m().k(tVar);
        }

        public static t u() {
            return f77348i;
        }

        public int A() {
            return this.f77352e.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<t> B() {
            return f77349j;
        }

        public List<q> C() {
            return this.f77352e;
        }

        public boolean D() {
            return (this.f77351d & 1) == 1;
        }

        public b H() {
            return b.m();
        }

        public b I() {
            return G(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            for (int i4 = 0; i4 < this.f77352e.size(); i4++) {
                codedOutputStream.d0(1, this.f77352e.get(i4));
            }
            if ((this.f77351d & 1) == 1) {
                codedOutputStream.a0(2, this.f77353f);
            }
            codedOutputStream.i0(this.f77350c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77354g;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            for (int i4 = 0; i4 < this.f77352e.size(); i4++) {
                if (!y(i4).p()) {
                    this.f77354g = (byte) 0;
                    return false;
                }
            }
            this.f77354g = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return G(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77355h;
            if (i4 != -1) {
                return i4;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f77352e.size(); i6++) {
                i5 += CodedOutputStream.s(1, this.f77352e.get(i6));
            }
            if ((this.f77351d & 1) == 1) {
                i5 += CodedOutputStream.o(2, this.f77353f);
            }
            int size = this.f77350c.size() + i5;
            this.f77355h = size;
            return size;
        }

        public t v() {
            return f77348i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.m();
        }

        public int x() {
            return this.f77353f;
        }

        public q y(int i4) {
            return this.f77352e.get(i4);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return f77348i;
        }

        private t(boolean z4) {
            this.f77354g = (byte) -1;
            this.f77355h = -1;
            this.f77350c = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private t(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77354g = (byte) -1;
            this.f77355h = -1;
            E();
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z4 = false;
            boolean z5 = false;
            while (!z4) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K == 10) {
                                    if (!z5) {
                                        this.f77352e = new ArrayList();
                                        z5 = true;
                                    }
                                    this.f77352e.add(eVar.u(q.f77256w, fVar));
                                } else if (K != 16) {
                                    if (!eVar.P(K, J)) {
                                    }
                                } else {
                                    this.f77351d |= 1;
                                    this.f77353f = eVar.A();
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
                    if (z5) {
                        this.f77352e = Collections.unmodifiableList(this.f77352e);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f77350c = w4.e();
                        throw th2;
                    }
                    this.f77350c = w4.e();
                    throw th;
                }
            }
            if (z5) {
                this.f77352e = Collections.unmodifiableList(this.f77352e);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77350c = w4.e();
                throw th3;
            }
            this.f77350c = w4.e();
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class v extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.x {

        /* renamed from: m, reason: collision with root package name */
        private static final v f77378m;

        /* renamed from: n, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<v> f77379n = new C1150a();

        /* renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77380c;

        /* renamed from: d, reason: collision with root package name */
        private int f77381d;

        /* renamed from: e, reason: collision with root package name */
        private int f77382e;

        /* renamed from: f, reason: collision with root package name */
        private int f77383f;

        /* renamed from: g, reason: collision with root package name */
        private c f77384g;

        /* renamed from: h, reason: collision with root package name */
        private int f77385h;

        /* renamed from: i, reason: collision with root package name */
        private int f77386i;

        /* renamed from: j, reason: collision with root package name */
        private d f77387j;

        /* renamed from: k, reason: collision with root package name */
        private byte f77388k;

        /* renamed from: l, reason: collision with root package name */
        private int f77389l;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$v$a, reason: collision with other inner class name */
        static class C1150a extends kotlin.reflect.jvm.internal.impl.protobuf.b<v> {
            C1150a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public v c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new v(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.b<v, b> implements kotlin.reflect.jvm.internal.impl.metadata.x {

            /* renamed from: c, reason: collision with root package name */
            private int f77390c;

            /* renamed from: d, reason: collision with root package name */
            private int f77391d;

            /* renamed from: e, reason: collision with root package name */
            private int f77392e;

            /* renamed from: g, reason: collision with root package name */
            private int f77394g;

            /* renamed from: h, reason: collision with root package name */
            private int f77395h;

            /* renamed from: f, reason: collision with root package name */
            private c f77393f = c.ERROR;

            /* renamed from: i, reason: collision with root package name */
            private d f77396i = d.LANGUAGE_VERSION;

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
            public kotlin.reflect.jvm.internal.impl.metadata.a.v.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$v> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.v.f77379n     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$v r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.v) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$v r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.v) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.v.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$v$b");
            }

            public b C(int i4) {
                this.f77390c |= 8;
                this.f77394g = i4;
                return this;
            }

            public b D(c cVar) {
                cVar.getClass();
                this.f77390c |= 4;
                this.f77393f = cVar;
                return this;
            }

            public b E(int i4) {
                this.f77390c |= 16;
                this.f77395h = i4;
                return this;
            }

            public b F(int i4) {
                this.f77390c |= 1;
                this.f77391d = i4;
                return this;
            }

            public b G(int i4) {
                this.f77390c |= 2;
                this.f77392e = i4;
                return this;
            }

            public b H(d dVar) {
                dVar.getClass();
                this.f77390c |= 32;
                this.f77396i = dVar;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public v z() {
                return v.y();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public v a() {
                v o4 = o();
                if (o4.p()) {
                    return o4;
                }
                throw new UninitializedMessageException(o4);
            }

            public v o() {
                v vVar = new v(this);
                int i4 = this.f77390c;
                int i5 = (i4 & 1) != 1 ? 0 : 1;
                vVar.f77382e = this.f77391d;
                if ((i4 & 2) == 2) {
                    i5 |= 2;
                }
                vVar.f77383f = this.f77392e;
                if ((i4 & 4) == 4) {
                    i5 |= 4;
                }
                vVar.f77384g = this.f77393f;
                if ((i4 & 8) == 8) {
                    i5 |= 8;
                }
                vVar.f77385h = this.f77394g;
                if ((i4 & 16) == 16) {
                    i5 |= 16;
                }
                vVar.f77386i = this.f77395h;
                if ((i4 & 32) == 32) {
                    i5 |= 32;
                }
                vVar.f77387j = this.f77396i;
                vVar.f77381d = i5;
                return vVar;
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

            public v u() {
                return v.y();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public b k(v vVar) {
                if (vVar == v.y()) {
                    return this;
                }
                if (vVar.L()) {
                    F(vVar.F());
                }
                if (vVar.M()) {
                    G(vVar.G());
                }
                if (vVar.J()) {
                    D(vVar.D());
                }
                if (vVar.I()) {
                    C(vVar.C());
                }
                if (vVar.K()) {
                    E(vVar.E());
                }
                if (vVar.N()) {
                    H(vVar.H());
                }
                l(i().c(vVar.f77380c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return v.y();
            }
        }

        /* compiled from: ProtoBuf.java */
        public enum c implements i.a {
            WARNING(0, 0),
            ERROR(1, 1),
            HIDDEN(2, 2);

            private static i.b<c> internalValueMap = new C1151a();
            private final int value;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$v$c$a, reason: collision with other inner class name */
            static class C1151a implements i.b<c> {
                C1151a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                public c a(int i4) {
                    return c.valueOf(i4);
                }

                public c b(int i4) {
                    return c.valueOf(i4);
                }
            }

            c(int i4, int i5) {
                this.value = i5;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.value;
            }

            public static c valueOf(int i4) {
                if (i4 == 0) {
                    return WARNING;
                }
                if (i4 == 1) {
                    return ERROR;
                }
                if (i4 != 2) {
                    return null;
                }
                return HIDDEN;
            }
        }

        /* compiled from: ProtoBuf.java */
        public enum d implements i.a {
            LANGUAGE_VERSION(0, 0),
            COMPILER_VERSION(1, 1),
            API_VERSION(2, 2);

            private static i.b<d> internalValueMap = new C1152a();
            private final int value;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$v$d$a, reason: collision with other inner class name */
            static class C1152a implements i.b<d> {
                C1152a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                public d a(int i4) {
                    return d.valueOf(i4);
                }

                public d b(int i4) {
                    return d.valueOf(i4);
                }
            }

            d(int i4, int i5) {
                this.value = i5;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.value;
            }

            public static d valueOf(int i4) {
                if (i4 == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i4 == 1) {
                    return COMPILER_VERSION;
                }
                if (i4 != 2) {
                    return null;
                }
                return API_VERSION;
            }
        }

        static {
            v vVar = new v(true);
            f77378m = vVar;
            vVar.O();
        }

        private v(h.b bVar) {
            this.f77388k = (byte) -1;
            this.f77389l = -1;
            this.f77380c = bVar.i();
        }

        private void O() {
            this.f77382e = 0;
            this.f77383f = 0;
            this.f77384g = c.ERROR;
            this.f77385h = 0;
            this.f77386i = 0;
            this.f77387j = d.LANGUAGE_VERSION;
        }

        public static b P() {
            return b.m();
        }

        public static b Q(v vVar) {
            return b.m().k(vVar);
        }

        public static v y() {
            return f77378m;
        }

        public v A() {
            return f77378m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<v> B() {
            return f77379n;
        }

        public int C() {
            return this.f77385h;
        }

        public c D() {
            return this.f77384g;
        }

        public int E() {
            return this.f77386i;
        }

        public int F() {
            return this.f77382e;
        }

        public int G() {
            return this.f77383f;
        }

        public d H() {
            return this.f77387j;
        }

        public boolean I() {
            return (this.f77381d & 8) == 8;
        }

        public boolean J() {
            return (this.f77381d & 4) == 4;
        }

        public boolean K() {
            return (this.f77381d & 16) == 16;
        }

        public boolean L() {
            return (this.f77381d & 1) == 1;
        }

        public boolean M() {
            return (this.f77381d & 2) == 2;
        }

        public boolean N() {
            return (this.f77381d & 32) == 32;
        }

        public b R() {
            return b.m();
        }

        public b S() {
            return Q(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            if ((this.f77381d & 1) == 1) {
                codedOutputStream.a0(1, this.f77382e);
            }
            if ((this.f77381d & 2) == 2) {
                codedOutputStream.a0(2, this.f77383f);
            }
            if ((this.f77381d & 4) == 4) {
                codedOutputStream.S(3, this.f77384g.getNumber());
            }
            if ((this.f77381d & 8) == 8) {
                codedOutputStream.a0(4, this.f77385h);
            }
            if ((this.f77381d & 16) == 16) {
                codedOutputStream.a0(5, this.f77386i);
            }
            if ((this.f77381d & 32) == 32) {
                codedOutputStream.S(6, this.f77387j.getNumber());
            }
            codedOutputStream.i0(this.f77380c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77388k;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            this.f77388k = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return Q(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77389l;
            if (i4 != -1) {
                return i4;
            }
            int o4 = (this.f77381d & 1) == 1 ? CodedOutputStream.o(1, this.f77382e) : 0;
            if ((this.f77381d & 2) == 2) {
                o4 += CodedOutputStream.o(2, this.f77383f);
            }
            if ((this.f77381d & 4) == 4) {
                o4 += CodedOutputStream.h(3, this.f77384g.getNumber());
            }
            if ((this.f77381d & 8) == 8) {
                o4 += CodedOutputStream.o(4, this.f77385h);
            }
            if ((this.f77381d & 16) == 16) {
                o4 += CodedOutputStream.o(5, this.f77386i);
            }
            if ((this.f77381d & 32) == 32) {
                o4 += CodedOutputStream.h(6, this.f77387j.getNumber());
            }
            int size = this.f77380c.size() + o4;
            this.f77389l = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.m();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return f77378m;
        }

        private v(boolean z4) {
            this.f77388k = (byte) -1;
            this.f77389l = -1;
            this.f77380c = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        private v(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77388k = (byte) -1;
            this.f77389l = -1;
            O();
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z4 = false;
            while (!z4) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f77381d |= 1;
                                this.f77382e = eVar.A();
                            } else if (K == 16) {
                                this.f77381d |= 2;
                                this.f77383f = eVar.A();
                            } else if (K == 24) {
                                int A = eVar.A();
                                c valueOf = c.valueOf(A);
                                if (valueOf == null) {
                                    J.o0(K);
                                    J.o0(A);
                                } else {
                                    this.f77381d |= 4;
                                    this.f77384g = valueOf;
                                }
                            } else if (K == 32) {
                                this.f77381d |= 8;
                                this.f77385h = eVar.A();
                            } else if (K == 40) {
                                this.f77381d |= 16;
                                this.f77386i = eVar.A();
                            } else if (K != 48) {
                                if (!eVar.P(K, J)) {
                                }
                            } else {
                                int A2 = eVar.A();
                                d valueOf2 = d.valueOf(A2);
                                if (valueOf2 == null) {
                                    J.o0(K);
                                    J.o0(A2);
                                } else {
                                    this.f77381d |= 32;
                                    this.f77387j = valueOf2;
                                }
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
                        this.f77380c = w4.e();
                        throw th2;
                    }
                    this.f77380c = w4.e();
                    throw th;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77380c = w4.e();
                throw th3;
            }
            this.f77380c = w4.e();
        }
    }

    /* compiled from: ProtoBuf.java */
    public static final class w extends kotlin.reflect.jvm.internal.impl.protobuf.h implements y {

        /* renamed from: g, reason: collision with root package name */
        private static final w f77397g;

        /* renamed from: h, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<w> f77398h = new C1153a();

        /* renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f77399c;

        /* renamed from: d, reason: collision with root package name */
        private List<v> f77400d;

        /* renamed from: e, reason: collision with root package name */
        private byte f77401e;

        /* renamed from: f, reason: collision with root package name */
        private int f77402f;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$w$a, reason: collision with other inner class name */
        static class C1153a extends kotlin.reflect.jvm.internal.impl.protobuf.b<w> {
            C1153a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public w c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new w(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.b<w, b> implements y {

            /* renamed from: c, reason: collision with root package name */
            private int f77403c;

            /* renamed from: d, reason: collision with root package name */
            private List<v> f77404d = Collections.emptyList();

            private b() {
            }

            static b m() {
                return new b();
            }

            private static b s() {
                return new b();
            }

            private void u() {
                if ((this.f77403c & 1) != 1) {
                    this.f77404d = new ArrayList(this.f77404d);
                    this.f77403c |= 1;
                }
            }

            private void y() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public b k(w wVar) {
                if (wVar == w.r()) {
                    return this;
                }
                if (!wVar.f77400d.isEmpty()) {
                    if (this.f77404d.isEmpty()) {
                        this.f77404d = wVar.f77400d;
                        this.f77403c &= -2;
                    } else {
                        u();
                        this.f77404d.addAll(wVar.f77400d);
                    }
                }
                l(i().c(wVar.f77399c));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.w.b r0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$w> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.w.f77398h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$w r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.w) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$w r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.w) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.w.b.r0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$w$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: g */
            public w z() {
                return w.r();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public w a() {
                w o4 = o();
                if (o4.p()) {
                    return o4;
                }
                throw new UninitializedMessageException(o4);
            }

            public w o() {
                w wVar = new w(this);
                if ((this.f77403c & 1) == 1) {
                    this.f77404d = Collections.unmodifiableList(this.f77404d);
                    this.f77403c &= -2;
                }
                wVar.f77400d = this.f77404d;
                return wVar;
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

            public w v() {
                return w.r();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
                return w.r();
            }
        }

        static {
            w wVar = new w(true);
            f77397g = wVar;
            wVar.x();
        }

        private w(h.b bVar) {
            this.f77401e = (byte) -1;
            this.f77402f = -1;
            this.f77399c = bVar.i();
        }

        public static b A(w wVar) {
            return b.m().k(wVar);
        }

        public static w r() {
            return f77397g;
        }

        private void x() {
            this.f77400d = Collections.emptyList();
        }

        public static b y() {
            return b.m();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<w> B() {
            return f77398h;
        }

        public b C() {
            return b.m();
        }

        public b D() {
            return A(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void b(CodedOutputStream codedOutputStream) throws IOException {
            t();
            for (int i4 = 0; i4 < this.f77400d.size(); i4++) {
                codedOutputStream.d0(1, this.f77400d.get(i4));
            }
            codedOutputStream.i0(this.f77399c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean p() {
            byte b5 = this.f77401e;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            this.f77401e = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a q() {
            return A(this);
        }

        public w s() {
            return f77397g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int t() {
            int i4 = this.f77402f;
            if (i4 != -1) {
                return i4;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f77400d.size(); i6++) {
                i5 += CodedOutputStream.s(1, this.f77400d.get(i6));
            }
            int size = this.f77399c.size() + i5;
            this.f77402f = size;
            return size;
        }

        public int u() {
            return this.f77400d.size();
        }

        public List<v> v() {
            return this.f77400d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a w() {
            return b.m();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o z() {
            return f77397g;
        }

        private w(boolean z4) {
            this.f77401e = (byte) -1;
            this.f77402f = -1;
            this.f77399c = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private w(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f77401e = (byte) -1;
            this.f77402f = -1;
            x();
            d.b w4 = kotlin.reflect.jvm.internal.impl.protobuf.d.w();
            CodedOutputStream J = CodedOutputStream.J(w4, 1);
            boolean z4 = false;
            boolean z5 = false;
            while (!z4) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K != 10) {
                                if (!eVar.P(K, J)) {
                                }
                            } else {
                                if (!z5) {
                                    this.f77400d = new ArrayList();
                                    z5 = true;
                                }
                                this.f77400d.add(eVar.u(v.f77379n, fVar));
                            }
                        }
                        z4 = true;
                    } catch (Throwable th) {
                        if (z5) {
                            this.f77400d = Collections.unmodifiableList(this.f77400d);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f77399c = w4.e();
                            throw th2;
                        }
                        this.f77399c = w4.e();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.i(this);
                } catch (IOException e5) {
                    throw new InvalidProtocolBufferException(e5.getMessage()).i(this);
                }
            }
            if (z5) {
                this.f77400d = Collections.unmodifiableList(this.f77400d);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f77399c = w4.e();
                throw th3;
            }
            this.f77399c = w4.e();
        }
    }
}
