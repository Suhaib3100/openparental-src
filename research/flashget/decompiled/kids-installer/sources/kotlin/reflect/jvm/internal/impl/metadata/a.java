package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.o;
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
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: ProtoBuf.java */
    public enum j implements i.a {
        DECLARATION(0, 0),
        FAKE_OVERRIDE(1, 1),
        DELEGATION(2, 2),
        SYNTHESIZED(3, 3);

        private static i.b<j> internalValueMap = new C0326a();
        private final int value;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$j$a, reason: collision with other inner class name */
        static class C0326a implements i.b<j> {
            C0326a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            public j a(int i5) {
                return j.valueOf(i5);
            }

            public j b(int i5) {
                return j.valueOf(i5);
            }
        }

        j(int i5, int i6) {
            this.value = i6;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int getNumber() {
            return this.value;
        }

        public static j valueOf(int i5) {
            if (i5 == 0) {
                return DECLARATION;
            }
            if (i5 == 1) {
                return FAKE_OVERRIDE;
            }
            if (i5 == 2) {
                return DELEGATION;
            }
            if (i5 != 3) {
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

        private static i.b<k> internalValueMap = new C0327a();
        private final int value;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$k$a, reason: collision with other inner class name */
        static class C0327a implements i.b<k> {
            C0327a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            public k a(int i5) {
                return k.valueOf(i5);
            }

            public k b(int i5) {
                return k.valueOf(i5);
            }
        }

        k(int i5, int i6) {
            this.value = i6;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int getNumber() {
            return this.value;
        }

        public static k valueOf(int i5) {
            if (i5 == 0) {
                return FINAL;
            }
            if (i5 == 1) {
                return OPEN;
            }
            if (i5 == 2) {
                return ABSTRACT;
            }
            if (i5 != 3) {
                return null;
            }
            return SEALED;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class o extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.p {

        /* renamed from: t, reason: collision with root package name */
        private static final o f25276t;

        /* renamed from: u, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<o> f25277u = new C0331a();

        /* renamed from: p, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25278p;

        /* renamed from: q, reason: collision with root package name */
        private List<c> f25279q;

        /* renamed from: r, reason: collision with root package name */
        private byte f25280r;

        /* renamed from: s, reason: collision with root package name */
        private int f25281s;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$o$a, reason: collision with other inner class name */
        static class C0331a extends kotlin.reflect.jvm.internal.impl.protobuf.b<o> {
            C0331a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public o b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new o(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.b<o, b> implements kotlin.reflect.jvm.internal.impl.metadata.p {

            /* renamed from: p, reason: collision with root package name */
            private int f25282p;

            /* renamed from: q, reason: collision with root package name */
            private List<c> f25283q = Collections.emptyList();

            private b() {
            }

            private void C() {
            }

            static b o() {
                return new b();
            }

            private static b v() {
                return new b();
            }

            private void w() {
                if ((this.f25282p & 1) != 1) {
                    this.f25283q = new ArrayList(this.f25283q);
                    this.f25282p |= 1;
                }
            }

            public c A(int i5) {
                return this.f25283q.get(i5);
            }

            public int B() {
                return this.f25283q.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            public b j(o oVar) {
                if (oVar == o.r()) {
                    return this;
                }
                if (!oVar.f25279q.isEmpty()) {
                    if (this.f25283q.isEmpty()) {
                        this.f25283q = oVar.f25279q;
                        this.f25282p &= -2;
                    } else {
                        w();
                        this.f25283q.addAll(oVar.f25279q);
                    }
                }
                k(i().f(oVar.f25278p));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.o.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$o> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.o.f25277u     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$o r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.o) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$o r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.o) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.o.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$o$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public o m() {
                return o.r();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                for (int i5 = 0; i5 < B(); i5++) {
                    if (!A(i5).l()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return o.r();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public o build() {
                o q5 = q();
                if (q5.l()) {
                    return q5;
                }
                throw new UninitializedMessageException(q5);
            }

            public o q() {
                o oVar = new o(this);
                if ((this.f25282p & 1) == 1) {
                    this.f25283q = Collections.unmodifiableList(this.f25283q);
                    this.f25282p &= -2;
                }
                oVar.f25279q = this.f25283q;
                return oVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(q());
            }

            public o y() {
                return o.r();
            }
        }

        static {
            o oVar = new o(true);
            f25276t = oVar;
            oVar.w();
        }

        public static b A(o oVar) {
            return b.o().j(oVar);
        }

        public static o r() {
            return f25276t;
        }

        private void w() {
            this.f25279q = Collections.emptyList();
        }

        public static b y() {
            return b.o();
        }

        public b B() {
            return b.o();
        }

        public b C() {
            return A(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            for (int i5 = 0; i5 < this.f25279q.size(); i5++) {
                codedOutputStream.d0(1, this.f25279q.get(i5));
            }
            codedOutputStream.i0(this.f25278p);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.f25280r;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            for (int i5 = 0; i5 < v(); i5++) {
                if (!t(i5).l()) {
                    this.f25280r = (byte) 0;
                    return false;
                }
            }
            this.f25280r = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return f25276t;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return A(this);
        }

        public o s() {
            return f25276t;
        }

        public c t(int i5) {
            return this.f25279q.get(i5);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.f25281s;
            if (i5 != -1) {
                return i5;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < this.f25279q.size(); i7++) {
                i6 += CodedOutputStream.s(1, this.f25279q.get(i7));
            }
            int size = this.f25278p.size() + i6;
            this.f25281s = size;
            return size;
        }

        public int v() {
            return this.f25279q.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.o();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<o> z() {
            return f25277u;
        }

        /* compiled from: ProtoBuf.java */
        public static final class c extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.o {

            /* renamed from: w, reason: collision with root package name */
            private static final c f25284w;

            /* renamed from: x, reason: collision with root package name */
            public static kotlin.reflect.jvm.internal.impl.protobuf.q<c> f25285x = new C0332a();

            /* renamed from: p, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f25286p;

            /* renamed from: q, reason: collision with root package name */
            private int f25287q;

            /* renamed from: r, reason: collision with root package name */
            private int f25288r;

            /* renamed from: s, reason: collision with root package name */
            private int f25289s;

            /* renamed from: t, reason: collision with root package name */
            private EnumC0333c f25290t;

            /* renamed from: u, reason: collision with root package name */
            private byte f25291u;

            /* renamed from: v, reason: collision with root package name */
            private int f25292v;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$o$c$a, reason: collision with other inner class name */
            static class C0332a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
                C0332a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                    return new c(eVar, fVar);
                }
            }

            /* compiled from: ProtoBuf.java */
            public static final class b extends h.b<c, b> implements kotlin.reflect.jvm.internal.impl.metadata.o {

                /* renamed from: p, reason: collision with root package name */
                private int f25293p;

                /* renamed from: r, reason: collision with root package name */
                private int f25295r;

                /* renamed from: q, reason: collision with root package name */
                private int f25294q = -1;

                /* renamed from: s, reason: collision with root package name */
                private EnumC0333c f25296s = EnumC0333c.PACKAGE;

                private b() {
                }

                private void A() {
                }

                static b o() {
                    return new b();
                }

                private static b v() {
                    return new b();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: B, reason: merged with bridge method [inline-methods] */
                public b j(c cVar) {
                    if (cVar == c.t()) {
                        return this;
                    }
                    if (cVar.C()) {
                        E(cVar.y());
                    }
                    if (cVar.D()) {
                        F(cVar.A());
                    }
                    if (cVar.B()) {
                        D(cVar.w());
                    }
                    k(i().f(cVar.f25286p));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
                /* renamed from: C, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.a.o.c.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$o$c> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.o.c.f25285x     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.a$o$c r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.o.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        kotlin.reflect.jvm.internal.impl.metadata.a$o$c r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.o.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.o.c.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$o$c$b");
                }

                public b D(EnumC0333c enumC0333c) {
                    enumC0333c.getClass();
                    this.f25293p |= 4;
                    this.f25296s = enumC0333c;
                    return this;
                }

                public b E(int i5) {
                    this.f25293p |= 1;
                    this.f25294q = i5;
                    return this;
                }

                public b F(int i5) {
                    this.f25293p |= 2;
                    this.f25295r = i5;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: f */
                public c m() {
                    return c.t();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                public final boolean l() {
                    return y();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
                public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                    return c.t();
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
                    int i5 = this.f25293p;
                    int i6 = (i5 & 1) != 1 ? 0 : 1;
                    cVar.f25288r = this.f25294q;
                    if ((i5 & 2) == 2) {
                        i6 |= 2;
                    }
                    cVar.f25289s = this.f25295r;
                    if ((i5 & 4) == 4) {
                        i6 |= 4;
                    }
                    cVar.f25290t = this.f25296s;
                    cVar.f25287q = i6;
                    return cVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public b q() {
                    return new b().j(q());
                }

                public c w() {
                    return c.t();
                }

                public boolean y() {
                    return (this.f25293p & 2) == 2;
                }
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$o$c$c, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public enum EnumC0333c implements i.a {
                CLASS(0, 0),
                PACKAGE(1, 1),
                LOCAL(2, 2);

                private static i.b<EnumC0333c> internalValueMap = new C0334a();
                private final int value;

                /* compiled from: ProtoBuf.java */
                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$o$c$c$a, reason: collision with other inner class name */
                static class C0334a implements i.b<EnumC0333c> {
                    C0334a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                    public EnumC0333c a(int i5) {
                        return EnumC0333c.valueOf(i5);
                    }

                    public EnumC0333c b(int i5) {
                        return EnumC0333c.valueOf(i5);
                    }
                }

                EnumC0333c(int i5, int i6) {
                    this.value = i6;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                public final int getNumber() {
                    return this.value;
                }

                public static EnumC0333c valueOf(int i5) {
                    if (i5 == 0) {
                        return CLASS;
                    }
                    if (i5 == 1) {
                        return PACKAGE;
                    }
                    if (i5 != 2) {
                        return null;
                    }
                    return LOCAL;
                }
            }

            static {
                c cVar = new c(true);
                f25284w = cVar;
                cVar.E();
            }

            private void E() {
                this.f25288r = -1;
                this.f25289s = 0;
                this.f25290t = EnumC0333c.PACKAGE;
            }

            public static b F() {
                return b.o();
            }

            public static b G(c cVar) {
                return b.o().j(cVar);
            }

            public static c t() {
                return f25284w;
            }

            public int A() {
                return this.f25289s;
            }

            public boolean B() {
                return (this.f25287q & 4) == 4;
            }

            public boolean C() {
                return (this.f25287q & 1) == 1;
            }

            public boolean D() {
                return (this.f25287q & 2) == 2;
            }

            public b H() {
                return b.o();
            }

            public b I() {
                return G(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public void a(CodedOutputStream codedOutputStream) throws IOException {
                u();
                if ((this.f25287q & 1) == 1) {
                    codedOutputStream.a0(1, this.f25288r);
                }
                if ((this.f25287q & 2) == 2) {
                    codedOutputStream.a0(2, this.f25289s);
                }
                if ((this.f25287q & 4) == 4) {
                    codedOutputStream.S(3, this.f25290t.getNumber());
                }
                codedOutputStream.i0(this.f25286p);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                byte b6 = this.f25291u;
                if (b6 == 1) {
                    return true;
                }
                if (b6 == 0) {
                    return false;
                }
                if (D()) {
                    this.f25291u = (byte) 1;
                    return true;
                }
                this.f25291u = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return f25284w;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public o.a n() {
                return G(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public int u() {
                int i5 = this.f25292v;
                if (i5 != -1) {
                    return i5;
                }
                int o5 = (this.f25287q & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f25288r) : 0;
                if ((this.f25287q & 2) == 2) {
                    o5 += CodedOutputStream.o(2, this.f25289s);
                }
                if ((this.f25287q & 4) == 4) {
                    o5 += CodedOutputStream.h(3, this.f25290t.getNumber());
                }
                int size = this.f25286p.size() + o5;
                this.f25292v = size;
                return size;
            }

            public c v() {
                return f25284w;
            }

            public EnumC0333c w() {
                return this.f25290t;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public o.a x() {
                return b.o();
            }

            public int y() {
                return this.f25288r;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
            public kotlin.reflect.jvm.internal.impl.protobuf.q<c> z() {
                return f25285x;
            }

            private c(h.b bVar) {
                super(bVar);
                this.f25291u = (byte) -1;
                this.f25292v = -1;
                this.f25286p = bVar.i();
            }

            private c(boolean z5) {
                this.f25291u = (byte) -1;
                this.f25292v = -1;
                this.f25286p = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
            }

            private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                this.f25291u = (byte) -1;
                this.f25292v = -1;
                E();
                d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
                CodedOutputStream J = CodedOutputStream.J(x5, 1);
                boolean z5 = false;
                while (!z5) {
                    try {
                        try {
                            try {
                                int K = eVar.K();
                                if (K != 0) {
                                    if (K == 8) {
                                        this.f25287q |= 1;
                                        this.f25288r = eVar.A();
                                    } else if (K == 16) {
                                        this.f25287q |= 2;
                                        this.f25289s = eVar.A();
                                    } else if (K != 24) {
                                        if (!eVar.P(K, J)) {
                                        }
                                    } else {
                                        int A = eVar.A();
                                        EnumC0333c valueOf = EnumC0333c.valueOf(A);
                                        if (valueOf == null) {
                                            J.o0(K);
                                            J.o0(A);
                                        } else {
                                            this.f25287q |= 4;
                                            this.f25290t = valueOf;
                                        }
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
                            this.f25286p = x5.e();
                            throw th2;
                        }
                        this.f25286p = x5.e();
                        throw th;
                    }
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f25286p = x5.e();
                    throw th3;
                }
                this.f25286p = x5.e();
            }
        }

        private o(h.b bVar) {
            super(bVar);
            this.f25280r = (byte) -1;
            this.f25281s = -1;
            this.f25278p = bVar.i();
        }

        private o(boolean z5) {
            this.f25280r = (byte) -1;
            this.f25281s = -1;
            this.f25278p = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private o(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f25280r = (byte) -1;
            this.f25281s = -1;
            w();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            boolean z6 = false;
            while (!z5) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K != 10) {
                                if (!eVar.P(K, J)) {
                                }
                            } else {
                                if (!(z6 & true)) {
                                    this.f25279q = new ArrayList();
                                    z6 |= true;
                                }
                                this.f25279q.add(eVar.u(c.f25285x, fVar));
                            }
                        }
                        z5 = true;
                    } catch (InvalidProtocolBufferException e6) {
                        throw e6.i(this);
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if (z6 & true) {
                        this.f25279q = Collections.unmodifiableList(this.f25279q);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f25278p = x5.e();
                        throw th2;
                    }
                    this.f25278p = x5.e();
                    throw th;
                }
            }
            if (z6 & true) {
                this.f25279q = Collections.unmodifiableList(this.f25279q);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25278p = x5.e();
                throw th3;
            }
            this.f25278p = x5.e();
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class q extends h.d<q> implements kotlin.reflect.jvm.internal.impl.metadata.t {
        private static final q I;
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<q> J = new C0336a();
        private int A;
        private q B;
        private int C;
        private q D;
        private int E;
        private int F;
        private byte G;
        private int H;

        /* renamed from: q, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25305q;

        /* renamed from: r, reason: collision with root package name */
        private int f25306r;

        /* renamed from: s, reason: collision with root package name */
        private List<b> f25307s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f25308t;

        /* renamed from: u, reason: collision with root package name */
        private int f25309u;

        /* renamed from: v, reason: collision with root package name */
        private q f25310v;

        /* renamed from: w, reason: collision with root package name */
        private int f25311w;

        /* renamed from: x, reason: collision with root package name */
        private int f25312x;

        /* renamed from: y, reason: collision with root package name */
        private int f25313y;

        /* renamed from: z, reason: collision with root package name */
        private int f25314z;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$q$a, reason: collision with other inner class name */
        static class C0336a extends kotlin.reflect.jvm.internal.impl.protobuf.b<q> {
            C0336a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public q b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new q(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class c extends h.c<q, c> implements kotlin.reflect.jvm.internal.impl.metadata.t {
            private int A;
            private int C;
            private int E;
            private int F;

            /* renamed from: r, reason: collision with root package name */
            private int f25328r;

            /* renamed from: t, reason: collision with root package name */
            private boolean f25330t;

            /* renamed from: u, reason: collision with root package name */
            private int f25331u;

            /* renamed from: w, reason: collision with root package name */
            private int f25333w;

            /* renamed from: x, reason: collision with root package name */
            private int f25334x;

            /* renamed from: y, reason: collision with root package name */
            private int f25335y;

            /* renamed from: z, reason: collision with root package name */
            private int f25336z;

            /* renamed from: s, reason: collision with root package name */
            private List<b> f25329s = Collections.emptyList();

            /* renamed from: v, reason: collision with root package name */
            private q f25332v = q.X();
            private q B = q.X();
            private q D = q.X();

            private c() {
            }

            private static c D() {
                return new c();
            }

            private void E() {
                if ((this.f25328r & 1) != 1) {
                    this.f25329s = new ArrayList(this.f25329s);
                    this.f25328r |= 1;
                }
            }

            private void S() {
            }

            static c y() {
                return new c();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public q build() {
                q B = B();
                if (B.l()) {
                    return B;
                }
                throw new UninitializedMessageException(B);
            }

            public q B() {
                q qVar = new q(this);
                int i5 = this.f25328r;
                if ((i5 & 1) == 1) {
                    this.f25329s = Collections.unmodifiableList(this.f25329s);
                    this.f25328r &= -2;
                }
                qVar.f25307s = this.f25329s;
                int i6 = (i5 & 2) != 2 ? 0 : 1;
                qVar.f25308t = this.f25330t;
                if ((i5 & 4) == 4) {
                    i6 |= 2;
                }
                qVar.f25309u = this.f25331u;
                if ((i5 & 8) == 8) {
                    i6 |= 4;
                }
                qVar.f25310v = this.f25332v;
                if ((i5 & 16) == 16) {
                    i6 |= 8;
                }
                qVar.f25311w = this.f25333w;
                if ((i5 & 32) == 32) {
                    i6 |= 16;
                }
                qVar.f25312x = this.f25334x;
                if ((i5 & 64) == 64) {
                    i6 |= 32;
                }
                qVar.f25313y = this.f25335y;
                if ((i5 & 128) == 128) {
                    i6 |= 64;
                }
                qVar.f25314z = this.f25336z;
                if ((i5 & 256) == 256) {
                    i6 |= 128;
                }
                qVar.A = this.A;
                if ((i5 & 512) == 512) {
                    i6 |= 256;
                }
                qVar.B = this.B;
                if ((i5 & 1024) == 1024) {
                    i6 |= 512;
                }
                qVar.C = this.C;
                if ((i5 & 2048) == 2048) {
                    i6 |= 1024;
                }
                qVar.D = this.D;
                if ((i5 & 4096) == 4096) {
                    i6 |= 2048;
                }
                qVar.E = this.E;
                if ((i5 & 8192) == 8192) {
                    i6 |= 4096;
                }
                qVar.F = this.F;
                qVar.f25306r = i6;
                return qVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public c q() {
                return new c().j(B());
            }

            public q F() {
                return this.D;
            }

            public b G(int i5) {
                return this.f25329s.get(i5);
            }

            public int I() {
                return this.f25329s.size();
            }

            public q J() {
                return q.X();
            }

            public q K() {
                return this.f25332v;
            }

            public q L() {
                return this.B;
            }

            public boolean M() {
                return (this.f25328r & 2048) == 2048;
            }

            public boolean N() {
                return (this.f25328r & 8) == 8;
            }

            public boolean Q() {
                return (this.f25328r & 512) == 512;
            }

            public c T(q qVar) {
                if ((this.f25328r & 2048) != 2048 || this.D == q.X()) {
                    this.D = qVar;
                } else {
                    this.D = q.z0(this.D).j(qVar).B();
                }
                this.f25328r |= 2048;
                return this;
            }

            public c V(q qVar) {
                if ((this.f25328r & 8) != 8 || this.f25332v == q.X()) {
                    this.f25332v = qVar;
                } else {
                    this.f25332v = q.z0(this.f25332v).j(qVar).B();
                }
                this.f25328r |= 8;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: W, reason: merged with bridge method [inline-methods] */
            public c j(q qVar) {
                if (qVar == q.X()) {
                    return this;
                }
                if (!qVar.f25307s.isEmpty()) {
                    if (this.f25329s.isEmpty()) {
                        this.f25329s = qVar.f25307s;
                        this.f25328r &= -2;
                    } else {
                        E();
                        this.f25329s.addAll(qVar.f25307s);
                    }
                }
                if (qVar.r0()) {
                    h0(qVar.e0());
                }
                if (qVar.o0()) {
                    e0(qVar.b0());
                }
                if (qVar.p0()) {
                    V(qVar.c0());
                }
                if (qVar.q0()) {
                    g0(qVar.d0());
                }
                if (qVar.m0()) {
                    c0(qVar.W());
                }
                if (qVar.v0()) {
                    k0(qVar.i0());
                }
                if (qVar.w0()) {
                    l0(qVar.j0());
                }
                if (qVar.u0()) {
                    j0(qVar.h0());
                }
                if (qVar.s0()) {
                    a0(qVar.f0());
                }
                if (qVar.t0()) {
                    i0(qVar.g0());
                }
                if (qVar.k0()) {
                    T(qVar.R());
                }
                if (qVar.l0()) {
                    b0(qVar.S());
                }
                if (qVar.n0()) {
                    d0(qVar.a0());
                }
                w(qVar);
                k(i().f(qVar.f25305q));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: Y, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.q.c c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$q> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.q.J     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$q r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.q) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$q r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.q) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.q.c.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$q$c");
            }

            public c a0(q qVar) {
                if ((this.f25328r & 512) != 512 || this.B == q.X()) {
                    this.B = qVar;
                } else {
                    this.B = q.z0(this.B).j(qVar).B();
                }
                this.f25328r |= 512;
                return this;
            }

            public c b0(int i5) {
                this.f25328r |= 4096;
                this.E = i5;
                return this;
            }

            public c c0(int i5) {
                this.f25328r |= 32;
                this.f25334x = i5;
                return this;
            }

            public c d0(int i5) {
                this.f25328r |= 8192;
                this.F = i5;
                return this;
            }

            public c e0(int i5) {
                this.f25328r |= 4;
                this.f25331u = i5;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public kotlin.reflect.jvm.internal.impl.protobuf.h m() {
                return q.X();
            }

            public c g0(int i5) {
                this.f25328r |= 16;
                this.f25333w = i5;
                return this;
            }

            public c h0(boolean z5) {
                this.f25328r |= 2;
                this.f25330t = z5;
                return this;
            }

            public c i0(int i5) {
                this.f25328r |= 1024;
                this.C = i5;
                return this;
            }

            public c j0(int i5) {
                this.f25328r |= 256;
                this.A = i5;
                return this;
            }

            public c k0(int i5) {
                this.f25328r |= 64;
                this.f25335y = i5;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                for (int i5 = 0; i5 < I(); i5++) {
                    if (!G(i5).l()) {
                        return false;
                    }
                }
                if (N() && !this.f25332v.l()) {
                    return false;
                }
                if (!Q() || this.B.l()) {
                    return (!M() || this.D.l()) && v();
                }
                return false;
            }

            public c l0(int i5) {
                this.f25328r |= 128;
                this.f25336z = i5;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return q.X();
            }
        }

        static {
            q qVar = new q(true);
            I = qVar;
            qVar.x0();
        }

        public static q X() {
            return I;
        }

        private void x0() {
            this.f25307s = Collections.emptyList();
            this.f25308t = false;
            this.f25309u = 0;
            q qVar = I;
            this.f25310v = qVar;
            this.f25311w = 0;
            this.f25312x = 0;
            this.f25313y = 0;
            this.f25314z = 0;
            this.A = 0;
            this.B = qVar;
            this.C = 0;
            this.D = qVar;
            this.E = 0;
            this.F = 0;
        }

        public static c y0() {
            return c.y();
        }

        public static c z0(q qVar) {
            return c.y().j(qVar);
        }

        public c A0() {
            return c.y();
        }

        public c B0() {
            return z0(this);
        }

        public q R() {
            return this.D;
        }

        public int S() {
            return this.E;
        }

        public b T(int i5) {
            return this.f25307s.get(i5);
        }

        public int U() {
            return this.f25307s.size();
        }

        public List<b> V() {
            return this.f25307s;
        }

        public int W() {
            return this.f25312x;
        }

        public q Y() {
            return I;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            h.d<MessageType>.a w5 = w();
            if ((this.f25306r & 4096) == 4096) {
                codedOutputStream.a0(1, this.F);
            }
            for (int i5 = 0; i5 < this.f25307s.size(); i5++) {
                codedOutputStream.d0(2, this.f25307s.get(i5));
            }
            if ((this.f25306r & 1) == 1) {
                codedOutputStream.L(3, this.f25308t);
            }
            if ((this.f25306r & 2) == 2) {
                codedOutputStream.a0(4, this.f25309u);
            }
            if ((this.f25306r & 4) == 4) {
                codedOutputStream.d0(5, this.f25310v);
            }
            if ((this.f25306r & 16) == 16) {
                codedOutputStream.a0(6, this.f25312x);
            }
            if ((this.f25306r & 32) == 32) {
                codedOutputStream.a0(7, this.f25313y);
            }
            if ((this.f25306r & 8) == 8) {
                codedOutputStream.a0(8, this.f25311w);
            }
            if ((this.f25306r & 64) == 64) {
                codedOutputStream.a0(9, this.f25314z);
            }
            if ((this.f25306r & 256) == 256) {
                codedOutputStream.d0(10, this.B);
            }
            if ((this.f25306r & 512) == 512) {
                codedOutputStream.a0(11, this.C);
            }
            if ((this.f25306r & 128) == 128) {
                codedOutputStream.a0(12, this.A);
            }
            if ((this.f25306r & 1024) == 1024) {
                codedOutputStream.d0(13, this.D);
            }
            if ((this.f25306r & 2048) == 2048) {
                codedOutputStream.a0(14, this.E);
            }
            w5.a(o.f.f9512b, codedOutputStream);
            codedOutputStream.i0(this.f25305q);
        }

        public int a0() {
            return this.F;
        }

        public int b0() {
            return this.f25309u;
        }

        public q c0() {
            return this.f25310v;
        }

        public int d0() {
            return this.f25311w;
        }

        public boolean e0() {
            return this.f25308t;
        }

        public q f0() {
            return this.B;
        }

        public int g0() {
            return this.C;
        }

        public int h0() {
            return this.A;
        }

        public int i0() {
            return this.f25313y;
        }

        public int j0() {
            return this.f25314z;
        }

        public boolean k0() {
            return (this.f25306r & 1024) == 1024;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.G;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            for (int i5 = 0; i5 < U(); i5++) {
                if (!T(i5).l()) {
                    this.G = (byte) 0;
                    return false;
                }
            }
            if (p0() && !this.f25310v.l()) {
                this.G = (byte) 0;
                return false;
            }
            if (s0() && !this.B.l()) {
                this.G = (byte) 0;
                return false;
            }
            if (k0() && !this.D.l()) {
                this.G = (byte) 0;
                return false;
            }
            if (p()) {
                this.G = (byte) 1;
                return true;
            }
            this.G = (byte) 0;
            return false;
        }

        public boolean l0() {
            return (this.f25306r & 2048) == 2048;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return I;
        }

        public boolean m0() {
            return (this.f25306r & 16) == 16;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return z0(this);
        }

        public boolean n0() {
            return (this.f25306r & 4096) == 4096;
        }

        public boolean o0() {
            return (this.f25306r & 2) == 2;
        }

        public boolean p0() {
            return (this.f25306r & 4) == 4;
        }

        public boolean q0() {
            return (this.f25306r & 8) == 8;
        }

        public boolean r0() {
            return (this.f25306r & 1) == 1;
        }

        public boolean s0() {
            return (this.f25306r & 256) == 256;
        }

        public boolean t0() {
            return (this.f25306r & 512) == 512;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.H;
            if (i5 != -1) {
                return i5;
            }
            int o5 = (this.f25306r & 4096) == 4096 ? CodedOutputStream.o(1, this.F) + 0 : 0;
            for (int i6 = 0; i6 < this.f25307s.size(); i6++) {
                o5 += CodedOutputStream.s(2, this.f25307s.get(i6));
            }
            if ((this.f25306r & 1) == 1) {
                o5 += CodedOutputStream.a(3, this.f25308t);
            }
            if ((this.f25306r & 2) == 2) {
                o5 += CodedOutputStream.o(4, this.f25309u);
            }
            if ((this.f25306r & 4) == 4) {
                o5 += CodedOutputStream.s(5, this.f25310v);
            }
            if ((this.f25306r & 16) == 16) {
                o5 += CodedOutputStream.o(6, this.f25312x);
            }
            if ((this.f25306r & 32) == 32) {
                o5 += CodedOutputStream.o(7, this.f25313y);
            }
            if ((this.f25306r & 8) == 8) {
                o5 += CodedOutputStream.o(8, this.f25311w);
            }
            if ((this.f25306r & 64) == 64) {
                o5 += CodedOutputStream.o(9, this.f25314z);
            }
            if ((this.f25306r & 256) == 256) {
                o5 += CodedOutputStream.s(10, this.B);
            }
            if ((this.f25306r & 512) == 512) {
                o5 += CodedOutputStream.o(11, this.C);
            }
            if ((this.f25306r & 128) == 128) {
                o5 += CodedOutputStream.o(12, this.A);
            }
            if ((this.f25306r & 1024) == 1024) {
                o5 += CodedOutputStream.s(13, this.D);
            }
            if ((this.f25306r & 2048) == 2048) {
                o5 += CodedOutputStream.o(14, this.E);
            }
            int size = this.f25305q.size() + o5 + q();
            this.H = size;
            return size;
        }

        public boolean u0() {
            return (this.f25306r & 128) == 128;
        }

        public boolean v0() {
            return (this.f25306r & 32) == 32;
        }

        public boolean w0() {
            return (this.f25306r & 64) == 64;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return c.y();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<q> z() {
            return J;
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.r {

            /* renamed from: w, reason: collision with root package name */
            private static final b f25315w;

            /* renamed from: x, reason: collision with root package name */
            public static kotlin.reflect.jvm.internal.impl.protobuf.q<b> f25316x = new C0337a();

            /* renamed from: p, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f25317p;

            /* renamed from: q, reason: collision with root package name */
            private int f25318q;

            /* renamed from: r, reason: collision with root package name */
            private c f25319r;

            /* renamed from: s, reason: collision with root package name */
            private q f25320s;

            /* renamed from: t, reason: collision with root package name */
            private int f25321t;

            /* renamed from: u, reason: collision with root package name */
            private byte f25322u;

            /* renamed from: v, reason: collision with root package name */
            private int f25323v;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$q$b$a, reason: collision with other inner class name */
            static class C0337a extends kotlin.reflect.jvm.internal.impl.protobuf.b<b> {
                C0337a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public b b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                    return new b(eVar, fVar);
                }
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$q$b$b, reason: collision with other inner class name */
            public static final class C0338b extends h.b<b, C0338b> implements kotlin.reflect.jvm.internal.impl.metadata.r {

                /* renamed from: p, reason: collision with root package name */
                private int f25324p;

                /* renamed from: q, reason: collision with root package name */
                private c f25325q = c.INV;

                /* renamed from: r, reason: collision with root package name */
                private q f25326r = q.X();

                /* renamed from: s, reason: collision with root package name */
                private int f25327s;

                private C0338b() {
                }

                private void B() {
                }

                static C0338b o() {
                    return new C0338b();
                }

                private static C0338b v() {
                    return new C0338b();
                }

                public boolean A() {
                    return (this.f25324p & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: C, reason: merged with bridge method [inline-methods] */
                public C0338b j(b bVar) {
                    if (bVar == b.t()) {
                        return this;
                    }
                    if (bVar.B()) {
                        F(bVar.w());
                    }
                    if (bVar.C()) {
                        E(bVar.y());
                    }
                    if (bVar.D()) {
                        G(bVar.A());
                    }
                    k(i().f(bVar.f25317p));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
                /* renamed from: D, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.a.q.b.C0338b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$q$b> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.q.b.f25316x     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.a$q$b r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.q.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        kotlin.reflect.jvm.internal.impl.metadata.a$q$b r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.q.b) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.q.b.C0338b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$q$b$b");
                }

                public C0338b E(q qVar) {
                    if ((this.f25324p & 2) != 2 || this.f25326r == q.X()) {
                        this.f25326r = qVar;
                    } else {
                        this.f25326r = q.z0(this.f25326r).j(qVar).B();
                    }
                    this.f25324p |= 2;
                    return this;
                }

                public C0338b F(c cVar) {
                    cVar.getClass();
                    this.f25324p |= 1;
                    this.f25325q = cVar;
                    return this;
                }

                public C0338b G(int i5) {
                    this.f25324p |= 4;
                    this.f25327s = i5;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: f */
                public b m() {
                    return b.t();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                public final boolean l() {
                    return !A() || this.f25326r.l();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
                public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                    return b.t();
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
                    int i5 = this.f25324p;
                    int i6 = (i5 & 1) != 1 ? 0 : 1;
                    bVar.f25319r = this.f25325q;
                    if ((i5 & 2) == 2) {
                        i6 |= 2;
                    }
                    bVar.f25320s = this.f25326r;
                    if ((i5 & 4) == 4) {
                        i6 |= 4;
                    }
                    bVar.f25321t = this.f25327s;
                    bVar.f25318q = i6;
                    return bVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public C0338b q() {
                    return new C0338b().j(q());
                }

                public b w() {
                    return b.t();
                }

                public q y() {
                    return this.f25326r;
                }
            }

            /* compiled from: ProtoBuf.java */
            /* loaded from: classes5.dex */
            public enum c implements i.a {
                IN(0, 0),
                OUT(1, 1),
                INV(2, 2),
                STAR(3, 3);

                private static i.b<c> internalValueMap = new C0339a();
                private final int value;

                /* compiled from: ProtoBuf.java */
                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$q$b$c$a, reason: collision with other inner class name */
                static class C0339a implements i.b<c> {
                    C0339a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                    public c a(int i5) {
                        return c.valueOf(i5);
                    }

                    public c b(int i5) {
                        return c.valueOf(i5);
                    }
                }

                c(int i5, int i6) {
                    this.value = i6;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                public final int getNumber() {
                    return this.value;
                }

                public static c valueOf(int i5) {
                    if (i5 == 0) {
                        return IN;
                    }
                    if (i5 == 1) {
                        return OUT;
                    }
                    if (i5 == 2) {
                        return INV;
                    }
                    if (i5 != 3) {
                        return null;
                    }
                    return STAR;
                }
            }

            static {
                b bVar = new b(true);
                f25315w = bVar;
                bVar.E();
            }

            private void E() {
                this.f25319r = c.INV;
                this.f25320s = q.X();
                this.f25321t = 0;
            }

            public static C0338b F() {
                return C0338b.o();
            }

            public static C0338b G(b bVar) {
                return C0338b.o().j(bVar);
            }

            public static b t() {
                return f25315w;
            }

            public int A() {
                return this.f25321t;
            }

            public boolean B() {
                return (this.f25318q & 1) == 1;
            }

            public boolean C() {
                return (this.f25318q & 2) == 2;
            }

            public boolean D() {
                return (this.f25318q & 4) == 4;
            }

            public C0338b H() {
                return C0338b.o();
            }

            public C0338b I() {
                return G(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public void a(CodedOutputStream codedOutputStream) throws IOException {
                u();
                if ((this.f25318q & 1) == 1) {
                    codedOutputStream.S(1, this.f25319r.getNumber());
                }
                if ((this.f25318q & 2) == 2) {
                    codedOutputStream.d0(2, this.f25320s);
                }
                if ((this.f25318q & 4) == 4) {
                    codedOutputStream.a0(3, this.f25321t);
                }
                codedOutputStream.i0(this.f25317p);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                byte b6 = this.f25322u;
                if (b6 == 1) {
                    return true;
                }
                if (b6 == 0) {
                    return false;
                }
                if (!C() || this.f25320s.l()) {
                    this.f25322u = (byte) 1;
                    return true;
                }
                this.f25322u = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return f25315w;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public o.a n() {
                return G(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public int u() {
                int i5 = this.f25323v;
                if (i5 != -1) {
                    return i5;
                }
                int h5 = (this.f25318q & 1) == 1 ? 0 + CodedOutputStream.h(1, this.f25319r.getNumber()) : 0;
                if ((this.f25318q & 2) == 2) {
                    h5 += CodedOutputStream.s(2, this.f25320s);
                }
                if ((this.f25318q & 4) == 4) {
                    h5 += CodedOutputStream.o(3, this.f25321t);
                }
                int size = this.f25317p.size() + h5;
                this.f25323v = size;
                return size;
            }

            public b v() {
                return f25315w;
            }

            public c w() {
                return this.f25319r;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public o.a x() {
                return C0338b.o();
            }

            public q y() {
                return this.f25320s;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
            public kotlin.reflect.jvm.internal.impl.protobuf.q<b> z() {
                return f25316x;
            }

            private b(h.b bVar) {
                super(bVar);
                this.f25322u = (byte) -1;
                this.f25323v = -1;
                this.f25317p = bVar.i();
            }

            private b(boolean z5) {
                this.f25322u = (byte) -1;
                this.f25323v = -1;
                this.f25317p = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
            }

            private b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                c cVar;
                this.f25322u = (byte) -1;
                this.f25323v = -1;
                E();
                d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
                CodedOutputStream J = CodedOutputStream.J(x5, 1);
                boolean z5 = false;
                while (!z5) {
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
                                        this.f25318q |= 1;
                                        this.f25319r = valueOf;
                                    }
                                } else if (K == 18) {
                                    if ((this.f25318q & 2) == 2) {
                                        q qVar = this.f25320s;
                                        qVar.getClass();
                                        cVar = q.z0(qVar);
                                    } else {
                                        cVar = null;
                                    }
                                    q qVar2 = (q) eVar.u(q.J, fVar);
                                    this.f25320s = qVar2;
                                    if (cVar != null) {
                                        cVar.j(qVar2);
                                        this.f25320s = cVar.B();
                                    }
                                    this.f25318q |= 2;
                                } else if (K != 24) {
                                    if (!eVar.P(K, J)) {
                                    }
                                } else {
                                    this.f25318q |= 4;
                                    this.f25321t = eVar.A();
                                }
                            }
                            z5 = true;
                        } catch (Throwable th) {
                            try {
                                J.I();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f25317p = x5.e();
                                throw th2;
                            }
                            this.f25317p = x5.e();
                            throw th;
                        }
                    } catch (InvalidProtocolBufferException e6) {
                        throw e6.i(this);
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                    }
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f25317p = x5.e();
                    throw th3;
                }
                this.f25317p = x5.e();
            }
        }

        private q(h.c<q, ?> cVar) {
            super(cVar);
            this.G = (byte) -1;
            this.H = -1;
            this.f25305q = cVar.i();
        }

        private q(boolean z5) {
            this.G = (byte) -1;
            this.H = -1;
            this.f25305q = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private q(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.G = (byte) -1;
            this.H = -1;
            x0();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J2 = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            boolean z6 = false;
            while (!z5) {
                try {
                    try {
                        int K = eVar.K();
                        c cVar = null;
                        switch (K) {
                            case 0:
                                z5 = true;
                            case 8:
                                this.f25306r |= 4096;
                                this.F = eVar.A();
                            case 18:
                                if (!(z6 & true)) {
                                    this.f25307s = new ArrayList();
                                    z6 |= true;
                                }
                                this.f25307s.add(eVar.u(b.f25316x, fVar));
                            case 24:
                                this.f25306r |= 1;
                                this.f25308t = eVar.k();
                            case 32:
                                this.f25306r |= 2;
                                this.f25309u = eVar.A();
                            case 42:
                                if ((this.f25306r & 4) == 4) {
                                    q qVar = this.f25310v;
                                    qVar.getClass();
                                    cVar = z0(qVar);
                                }
                                q qVar2 = (q) eVar.u(J, fVar);
                                this.f25310v = qVar2;
                                if (cVar != null) {
                                    cVar.j(qVar2);
                                    this.f25310v = cVar.B();
                                }
                                this.f25306r |= 4;
                            case 48:
                                this.f25306r |= 16;
                                this.f25312x = eVar.A();
                            case 56:
                                this.f25306r |= 32;
                                this.f25313y = eVar.A();
                            case 64:
                                this.f25306r |= 8;
                                this.f25311w = eVar.A();
                            case 72:
                                this.f25306r |= 64;
                                this.f25314z = eVar.A();
                            case 82:
                                if ((this.f25306r & 256) == 256) {
                                    q qVar3 = this.B;
                                    qVar3.getClass();
                                    cVar = z0(qVar3);
                                }
                                q qVar4 = (q) eVar.u(J, fVar);
                                this.B = qVar4;
                                if (cVar != null) {
                                    cVar.j(qVar4);
                                    this.B = cVar.B();
                                }
                                this.f25306r |= 256;
                            case 88:
                                this.f25306r |= 512;
                                this.C = eVar.A();
                            case 96:
                                this.f25306r |= 128;
                                this.A = eVar.A();
                            case 106:
                                if ((this.f25306r & 1024) == 1024) {
                                    q qVar5 = this.D;
                                    qVar5.getClass();
                                    cVar = z0(qVar5);
                                }
                                q qVar6 = (q) eVar.u(J, fVar);
                                this.D = qVar6;
                                if (cVar != null) {
                                    cVar.j(qVar6);
                                    this.D = cVar.B();
                                }
                                this.f25306r |= 1024;
                            case 112:
                                this.f25306r |= 2048;
                                this.E = eVar.A();
                            default:
                                if (!j(eVar, J2, fVar, K)) {
                                    z5 = true;
                                }
                        }
                    } catch (Throwable th) {
                        if (z6 & true) {
                            this.f25307s = Collections.unmodifiableList(this.f25307s);
                        }
                        try {
                            J2.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f25305q = x5.e();
                            throw th2;
                        }
                        this.f25305q = x5.e();
                        g();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e6) {
                    throw e6.i(this);
                } catch (IOException e7) {
                    throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                }
            }
            if (z6 & true) {
                this.f25307s = Collections.unmodifiableList(this.f25307s);
            }
            try {
                J2.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25305q = x5.e();
                throw th3;
            }
            this.f25305q = x5.e();
            g();
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

        private static i.b<x> internalValueMap = new C0349a();
        private final int value;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$x$a, reason: collision with other inner class name */
        static class C0349a implements i.b<x> {
            C0349a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            public x a(int i5) {
                return x.valueOf(i5);
            }

            public x b(int i5) {
                return x.valueOf(i5);
            }
        }

        x(int i5, int i6) {
            this.value = i6;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int getNumber() {
            return this.value;
        }

        public static x valueOf(int i5) {
            if (i5 == 0) {
                return INTERNAL;
            }
            if (i5 == 1) {
                return PRIVATE;
            }
            if (i5 == 2) {
                return PROTECTED;
            }
            if (i5 == 3) {
                return PUBLIC;
            }
            if (i5 == 4) {
                return PRIVATE_TO_THIS;
            }
            if (i5 != 5) {
                return null;
            }
            return LOCAL;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class b extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.d {

        /* renamed from: v, reason: collision with root package name */
        private static final b f25080v;

        /* renamed from: w, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<b> f25081w = new C0306a();

        /* renamed from: p, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25082p;

        /* renamed from: q, reason: collision with root package name */
        private int f25083q;

        /* renamed from: r, reason: collision with root package name */
        private int f25084r;

        /* renamed from: s, reason: collision with root package name */
        private List<C0307b> f25085s;

        /* renamed from: t, reason: collision with root package name */
        private byte f25086t;

        /* renamed from: u, reason: collision with root package name */
        private int f25087u;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$b$a, reason: collision with other inner class name */
        static class C0306a extends kotlin.reflect.jvm.internal.impl.protobuf.b<b> {
            C0306a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new b(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$b$b, reason: collision with other inner class name */
        public static final class C0307b extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.c {

            /* renamed from: v, reason: collision with root package name */
            private static final C0307b f25088v;

            /* renamed from: w, reason: collision with root package name */
            public static kotlin.reflect.jvm.internal.impl.protobuf.q<C0307b> f25089w = new C0308a();

            /* renamed from: p, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f25090p;

            /* renamed from: q, reason: collision with root package name */
            private int f25091q;

            /* renamed from: r, reason: collision with root package name */
            private int f25092r;

            /* renamed from: s, reason: collision with root package name */
            private c f25093s;

            /* renamed from: t, reason: collision with root package name */
            private byte f25094t;

            /* renamed from: u, reason: collision with root package name */
            private int f25095u;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$b$b$a, reason: collision with other inner class name */
            static class C0308a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C0307b> {
                C0308a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C0307b b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                    return new C0307b(eVar, fVar);
                }
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$b$b$b, reason: collision with other inner class name */
            public static final class C0309b extends h.b<C0307b, C0309b> implements kotlin.reflect.jvm.internal.impl.metadata.c {

                /* renamed from: p, reason: collision with root package name */
                private int f25096p;

                /* renamed from: q, reason: collision with root package name */
                private int f25097q;

                /* renamed from: r, reason: collision with root package name */
                private c f25098r = c.L();

                private C0309b() {
                }

                private void C() {
                }

                static C0309b o() {
                    return new C0309b();
                }

                private static C0309b v() {
                    return new C0309b();
                }

                public boolean A() {
                    return (this.f25096p & 1) == 1;
                }

                public boolean B() {
                    return (this.f25096p & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: D, reason: merged with bridge method [inline-methods] */
                public C0309b j(C0307b c0307b) {
                    if (c0307b == C0307b.s()) {
                        return this;
                    }
                    if (c0307b.y()) {
                        G(c0307b.v());
                    }
                    if (c0307b.A()) {
                        F(c0307b.w());
                    }
                    k(i().f(c0307b.f25090p));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
                /* renamed from: E, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.a.b.C0307b.C0309b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$b$b> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.b.C0307b.f25089w     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.a$b$b r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.b.C0307b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        kotlin.reflect.jvm.internal.impl.metadata.a$b$b r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.b.C0307b) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.b.C0307b.C0309b.Z(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$b$b$b");
                }

                public C0309b F(c cVar) {
                    if ((this.f25096p & 2) != 2 || this.f25098r == c.L()) {
                        this.f25098r = cVar;
                    } else {
                        this.f25098r = c.h0(this.f25098r).j(cVar).q();
                    }
                    this.f25096p |= 2;
                    return this;
                }

                public C0309b G(int i5) {
                    this.f25096p |= 1;
                    this.f25097q = i5;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: f */
                public C0307b m() {
                    return C0307b.s();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                public final boolean l() {
                    return A() && B() && this.f25098r.l();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
                public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                    return C0307b.s();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public C0307b build() {
                    C0307b q5 = q();
                    if (q5.l()) {
                        return q5;
                    }
                    throw new UninitializedMessageException(q5);
                }

                public C0307b q() {
                    C0307b c0307b = new C0307b(this);
                    int i5 = this.f25096p;
                    int i6 = (i5 & 1) != 1 ? 0 : 1;
                    c0307b.f25092r = this.f25097q;
                    if ((i5 & 2) == 2) {
                        i6 |= 2;
                    }
                    c0307b.f25093s = this.f25098r;
                    c0307b.f25091q = i6;
                    return c0307b;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public C0309b q() {
                    return new C0309b().j(q());
                }

                public C0307b w() {
                    return C0307b.s();
                }

                public c y() {
                    return this.f25098r;
                }
            }

            static {
                C0307b c0307b = new C0307b(true);
                f25088v = c0307b;
                c0307b.B();
            }

            private void B() {
                this.f25092r = 0;
                this.f25093s = c.L();
            }

            public static C0309b C() {
                return C0309b.o();
            }

            public static C0309b D(C0307b c0307b) {
                return C0309b.o().j(c0307b);
            }

            public static C0307b s() {
                return f25088v;
            }

            public boolean A() {
                return (this.f25091q & 2) == 2;
            }

            public C0309b E() {
                return C0309b.o();
            }

            public C0309b F() {
                return D(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public void a(CodedOutputStream codedOutputStream) throws IOException {
                u();
                if ((this.f25091q & 1) == 1) {
                    codedOutputStream.a0(1, this.f25092r);
                }
                if ((this.f25091q & 2) == 2) {
                    codedOutputStream.d0(2, this.f25093s);
                }
                codedOutputStream.i0(this.f25090p);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                byte b6 = this.f25094t;
                if (b6 == 1) {
                    return true;
                }
                if (b6 == 0) {
                    return false;
                }
                if (!y()) {
                    this.f25094t = (byte) 0;
                    return false;
                }
                if (!A()) {
                    this.f25094t = (byte) 0;
                    return false;
                }
                if (this.f25093s.l()) {
                    this.f25094t = (byte) 1;
                    return true;
                }
                this.f25094t = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return f25088v;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public o.a n() {
                return D(this);
            }

            public C0307b t() {
                return f25088v;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public int u() {
                int i5 = this.f25095u;
                if (i5 != -1) {
                    return i5;
                }
                int o5 = (this.f25091q & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f25092r) : 0;
                if ((this.f25091q & 2) == 2) {
                    o5 += CodedOutputStream.s(2, this.f25093s);
                }
                int size = this.f25090p.size() + o5;
                this.f25095u = size;
                return size;
            }

            public int v() {
                return this.f25092r;
            }

            public c w() {
                return this.f25093s;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public o.a x() {
                return C0309b.o();
            }

            public boolean y() {
                return (this.f25091q & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
            public kotlin.reflect.jvm.internal.impl.protobuf.q<C0307b> z() {
                return f25089w;
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$b$b$c */
            public static final class c extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.b {
                private static final c E;
                public static kotlin.reflect.jvm.internal.impl.protobuf.q<c> F = new C0310a();
                private int A;
                private int B;
                private byte C;
                private int D;

                /* renamed from: p, reason: collision with root package name */
                private final kotlin.reflect.jvm.internal.impl.protobuf.d f25099p;

                /* renamed from: q, reason: collision with root package name */
                private int f25100q;

                /* renamed from: r, reason: collision with root package name */
                private EnumC0312c f25101r;

                /* renamed from: s, reason: collision with root package name */
                private long f25102s;

                /* renamed from: t, reason: collision with root package name */
                private float f25103t;

                /* renamed from: u, reason: collision with root package name */
                private double f25104u;

                /* renamed from: v, reason: collision with root package name */
                private int f25105v;

                /* renamed from: w, reason: collision with root package name */
                private int f25106w;

                /* renamed from: x, reason: collision with root package name */
                private int f25107x;

                /* renamed from: y, reason: collision with root package name */
                private b f25108y;

                /* renamed from: z, reason: collision with root package name */
                private List<c> f25109z;

                /* compiled from: ProtoBuf.java */
                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$b$b$c$a, reason: collision with other inner class name */
                static class C0310a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
                    C0310a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                        return new c(eVar, fVar);
                    }
                }

                /* compiled from: ProtoBuf.java */
                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$b$b$c$b, reason: collision with other inner class name */
                public static final class C0311b extends h.b<c, C0311b> implements kotlin.reflect.jvm.internal.impl.metadata.b {
                    private int A;

                    /* renamed from: p, reason: collision with root package name */
                    private int f25110p;

                    /* renamed from: r, reason: collision with root package name */
                    private long f25112r;

                    /* renamed from: s, reason: collision with root package name */
                    private float f25113s;

                    /* renamed from: t, reason: collision with root package name */
                    private double f25114t;

                    /* renamed from: u, reason: collision with root package name */
                    private int f25115u;

                    /* renamed from: v, reason: collision with root package name */
                    private int f25116v;

                    /* renamed from: w, reason: collision with root package name */
                    private int f25117w;

                    /* renamed from: z, reason: collision with root package name */
                    private int f25120z;

                    /* renamed from: q, reason: collision with root package name */
                    private EnumC0312c f25111q = EnumC0312c.BYTE;

                    /* renamed from: x, reason: collision with root package name */
                    private b f25118x = b.y();

                    /* renamed from: y, reason: collision with root package name */
                    private List<c> f25119y = Collections.emptyList();

                    private C0311b() {
                    }

                    private void E() {
                    }

                    static C0311b o() {
                        return new C0311b();
                    }

                    private static C0311b v() {
                        return new C0311b();
                    }

                    private void w() {
                        if ((this.f25110p & 256) != 256) {
                            this.f25119y = new ArrayList(this.f25119y);
                            this.f25110p |= 256;
                        }
                    }

                    public c A(int i5) {
                        return this.f25119y.get(i5);
                    }

                    public int B() {
                        return this.f25119y.size();
                    }

                    public c C() {
                        return c.L();
                    }

                    public boolean D() {
                        return (this.f25110p & 128) == 128;
                    }

                    public C0311b F(b bVar) {
                        if ((this.f25110p & 128) != 128 || this.f25118x == b.y()) {
                            this.f25118x = bVar;
                        } else {
                            this.f25118x = b.F(this.f25118x).j(bVar).q();
                        }
                        this.f25110p |= 128;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                    /* renamed from: G, reason: merged with bridge method [inline-methods] */
                    public C0311b j(c cVar) {
                        if (cVar == c.L()) {
                            return this;
                        }
                        if (cVar.e0()) {
                            V(cVar.T());
                        }
                        if (cVar.c0()) {
                            S(cVar.R());
                        }
                        if (cVar.b0()) {
                            Q(cVar.Q());
                        }
                        if (cVar.X()) {
                            L(cVar.N());
                        }
                        if (cVar.d0()) {
                            T(cVar.S());
                        }
                        if (cVar.W()) {
                            K(cVar.K());
                        }
                        if (cVar.Y()) {
                            M(cVar.O());
                        }
                        if (cVar.U()) {
                            F(cVar.F());
                        }
                        if (!cVar.f25109z.isEmpty()) {
                            if (this.f25119y.isEmpty()) {
                                this.f25119y = cVar.f25109z;
                                this.f25110p &= -257;
                            } else {
                                w();
                                this.f25119y.addAll(cVar.f25109z);
                            }
                        }
                        if (cVar.V()) {
                            J(cVar.G());
                        }
                        if (cVar.a0()) {
                            N(cVar.P());
                        }
                        k(i().f(cVar.f25099p));
                        return this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
                    /* renamed from: I, reason: merged with bridge method [inline-methods] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public kotlin.reflect.jvm.internal.impl.metadata.a.b.C0307b.c.C0311b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                        /*
                            r2 = this;
                            r0 = 0
                            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$b$b$c> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.b.C0307b.c.F     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                            java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                            kotlin.reflect.jvm.internal.impl.metadata.a$b$b$c r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.b.C0307b.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                            kotlin.reflect.jvm.internal.impl.metadata.a$b$b$c r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.b.C0307b.c) r4     // Catch: java.lang.Throwable -> Lf
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
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.b.C0307b.c.C0311b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$b$b$c$b");
                    }

                    public C0311b J(int i5) {
                        this.f25110p |= 512;
                        this.f25120z = i5;
                        return this;
                    }

                    public C0311b K(int i5) {
                        this.f25110p |= 32;
                        this.f25116v = i5;
                        return this;
                    }

                    public C0311b L(double d6) {
                        this.f25110p |= 8;
                        this.f25114t = d6;
                        return this;
                    }

                    public C0311b M(int i5) {
                        this.f25110p |= 64;
                        this.f25117w = i5;
                        return this;
                    }

                    public C0311b N(int i5) {
                        this.f25110p |= 1024;
                        this.A = i5;
                        return this;
                    }

                    public C0311b Q(float f6) {
                        this.f25110p |= 4;
                        this.f25113s = f6;
                        return this;
                    }

                    public C0311b S(long j5) {
                        this.f25110p |= 2;
                        this.f25112r = j5;
                        return this;
                    }

                    public C0311b T(int i5) {
                        this.f25110p |= 16;
                        this.f25115u = i5;
                        return this;
                    }

                    public C0311b V(EnumC0312c enumC0312c) {
                        enumC0312c.getClass();
                        this.f25110p |= 1;
                        this.f25111q = enumC0312c;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                    /* renamed from: f */
                    public c m() {
                        return c.L();
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                    public final boolean l() {
                        if (D() && !this.f25118x.l()) {
                            return false;
                        }
                        for (int i5 = 0; i5 < B(); i5++) {
                            if (!A(i5).l()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
                    public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                        return c.L();
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
                        int i5 = this.f25110p;
                        int i6 = (i5 & 1) != 1 ? 0 : 1;
                        cVar.f25101r = this.f25111q;
                        if ((i5 & 2) == 2) {
                            i6 |= 2;
                        }
                        cVar.f25102s = this.f25112r;
                        if ((i5 & 4) == 4) {
                            i6 |= 4;
                        }
                        cVar.f25103t = this.f25113s;
                        if ((i5 & 8) == 8) {
                            i6 |= 8;
                        }
                        cVar.f25104u = this.f25114t;
                        if ((i5 & 16) == 16) {
                            i6 |= 16;
                        }
                        cVar.f25105v = this.f25115u;
                        if ((i5 & 32) == 32) {
                            i6 |= 32;
                        }
                        cVar.f25106w = this.f25116v;
                        if ((i5 & 64) == 64) {
                            i6 |= 64;
                        }
                        cVar.f25107x = this.f25117w;
                        if ((i5 & 128) == 128) {
                            i6 |= 128;
                        }
                        cVar.f25108y = this.f25118x;
                        if ((this.f25110p & 256) == 256) {
                            this.f25119y = Collections.unmodifiableList(this.f25119y);
                            this.f25110p &= -257;
                        }
                        cVar.f25109z = this.f25119y;
                        if ((i5 & 512) == 512) {
                            i6 |= 256;
                        }
                        cVar.A = this.f25120z;
                        if ((i5 & 1024) == 1024) {
                            i6 |= 512;
                        }
                        cVar.B = this.A;
                        cVar.f25100q = i6;
                        return cVar;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                    /* renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                    public C0311b q() {
                        return new C0311b().j(q());
                    }

                    public b y() {
                        return this.f25118x;
                    }
                }

                /* compiled from: ProtoBuf.java */
                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$b$b$c$c, reason: collision with other inner class name */
                /* loaded from: classes5.dex */
                public enum EnumC0312c implements i.a {
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

                    private static i.b<EnumC0312c> internalValueMap = new C0313a();
                    private final int value;

                    /* compiled from: ProtoBuf.java */
                    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$b$b$c$c$a, reason: collision with other inner class name */
                    static class C0313a implements i.b<EnumC0312c> {
                        C0313a() {
                        }

                        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                        public EnumC0312c a(int i5) {
                            return EnumC0312c.valueOf(i5);
                        }

                        public EnumC0312c b(int i5) {
                            return EnumC0312c.valueOf(i5);
                        }
                    }

                    EnumC0312c(int i5, int i6) {
                        this.value = i6;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                    public final int getNumber() {
                        return this.value;
                    }

                    public static EnumC0312c valueOf(int i5) {
                        switch (i5) {
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
                    E = cVar;
                    cVar.f0();
                }

                public static c L() {
                    return E;
                }

                private void f0() {
                    this.f25101r = EnumC0312c.BYTE;
                    this.f25102s = 0L;
                    this.f25103t = 0.0f;
                    this.f25104u = com.google.firebase.remoteconfig.p.f18289o;
                    this.f25105v = 0;
                    this.f25106w = 0;
                    this.f25107x = 0;
                    this.f25108y = b.y();
                    this.f25109z = Collections.emptyList();
                    this.A = 0;
                    this.B = 0;
                }

                public static C0311b g0() {
                    return C0311b.o();
                }

                public static C0311b h0(c cVar) {
                    return C0311b.o().j(cVar);
                }

                public b F() {
                    return this.f25108y;
                }

                public int G() {
                    return this.A;
                }

                public c H(int i5) {
                    return this.f25109z.get(i5);
                }

                public int I() {
                    return this.f25109z.size();
                }

                public List<c> J() {
                    return this.f25109z;
                }

                public int K() {
                    return this.f25106w;
                }

                public c M() {
                    return E;
                }

                public double N() {
                    return this.f25104u;
                }

                public int O() {
                    return this.f25107x;
                }

                public int P() {
                    return this.B;
                }

                public float Q() {
                    return this.f25103t;
                }

                public long R() {
                    return this.f25102s;
                }

                public int S() {
                    return this.f25105v;
                }

                public EnumC0312c T() {
                    return this.f25101r;
                }

                public boolean U() {
                    return (this.f25100q & 128) == 128;
                }

                public boolean V() {
                    return (this.f25100q & 256) == 256;
                }

                public boolean W() {
                    return (this.f25100q & 32) == 32;
                }

                public boolean X() {
                    return (this.f25100q & 8) == 8;
                }

                public boolean Y() {
                    return (this.f25100q & 64) == 64;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public void a(CodedOutputStream codedOutputStream) throws IOException {
                    u();
                    if ((this.f25100q & 1) == 1) {
                        codedOutputStream.S(1, this.f25101r.getNumber());
                    }
                    if ((this.f25100q & 2) == 2) {
                        codedOutputStream.t0(2, this.f25102s);
                    }
                    if ((this.f25100q & 4) == 4) {
                        codedOutputStream.W(3, this.f25103t);
                    }
                    if ((this.f25100q & 8) == 8) {
                        codedOutputStream.Q(4, this.f25104u);
                    }
                    if ((this.f25100q & 16) == 16) {
                        codedOutputStream.a0(5, this.f25105v);
                    }
                    if ((this.f25100q & 32) == 32) {
                        codedOutputStream.a0(6, this.f25106w);
                    }
                    if ((this.f25100q & 64) == 64) {
                        codedOutputStream.a0(7, this.f25107x);
                    }
                    if ((this.f25100q & 128) == 128) {
                        codedOutputStream.d0(8, this.f25108y);
                    }
                    for (int i5 = 0; i5 < this.f25109z.size(); i5++) {
                        codedOutputStream.d0(9, this.f25109z.get(i5));
                    }
                    if ((this.f25100q & 512) == 512) {
                        codedOutputStream.a0(10, this.B);
                    }
                    if ((this.f25100q & 256) == 256) {
                        codedOutputStream.a0(11, this.A);
                    }
                    codedOutputStream.i0(this.f25099p);
                }

                public boolean a0() {
                    return (this.f25100q & 512) == 512;
                }

                public boolean b0() {
                    return (this.f25100q & 4) == 4;
                }

                public boolean c0() {
                    return (this.f25100q & 2) == 2;
                }

                public boolean d0() {
                    return (this.f25100q & 16) == 16;
                }

                public boolean e0() {
                    return (this.f25100q & 1) == 1;
                }

                public C0311b i0() {
                    return C0311b.o();
                }

                public C0311b j0() {
                    return h0(this);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                public final boolean l() {
                    byte b6 = this.C;
                    if (b6 == 1) {
                        return true;
                    }
                    if (b6 == 0) {
                        return false;
                    }
                    if (U() && !this.f25108y.l()) {
                        this.C = (byte) 0;
                        return false;
                    }
                    for (int i5 = 0; i5 < I(); i5++) {
                        if (!H(i5).l()) {
                            this.C = (byte) 0;
                            return false;
                        }
                    }
                    this.C = (byte) 1;
                    return true;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                    return E;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public o.a n() {
                    return h0(this);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public int u() {
                    int i5 = this.D;
                    if (i5 != -1) {
                        return i5;
                    }
                    int h5 = (this.f25100q & 1) == 1 ? CodedOutputStream.h(1, this.f25101r.getNumber()) + 0 : 0;
                    if ((this.f25100q & 2) == 2) {
                        h5 += CodedOutputStream.A(2, this.f25102s);
                    }
                    if ((this.f25100q & 4) == 4) {
                        h5 += CodedOutputStream.l(3, this.f25103t);
                    }
                    if ((this.f25100q & 8) == 8) {
                        h5 += CodedOutputStream.f(4, this.f25104u);
                    }
                    if ((this.f25100q & 16) == 16) {
                        h5 += CodedOutputStream.o(5, this.f25105v);
                    }
                    if ((this.f25100q & 32) == 32) {
                        h5 += CodedOutputStream.o(6, this.f25106w);
                    }
                    if ((this.f25100q & 64) == 64) {
                        h5 += CodedOutputStream.o(7, this.f25107x);
                    }
                    if ((this.f25100q & 128) == 128) {
                        h5 += CodedOutputStream.s(8, this.f25108y);
                    }
                    for (int i6 = 0; i6 < this.f25109z.size(); i6++) {
                        h5 += CodedOutputStream.s(9, this.f25109z.get(i6));
                    }
                    if ((this.f25100q & 512) == 512) {
                        h5 += CodedOutputStream.o(10, this.B);
                    }
                    if ((this.f25100q & 256) == 256) {
                        h5 += CodedOutputStream.o(11, this.A);
                    }
                    int size = this.f25099p.size() + h5;
                    this.D = size;
                    return size;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public o.a x() {
                    return C0311b.o();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
                public kotlin.reflect.jvm.internal.impl.protobuf.q<c> z() {
                    return F;
                }

                private c(h.b bVar) {
                    super(bVar);
                    this.C = (byte) -1;
                    this.D = -1;
                    this.f25099p = bVar.i();
                }

                private c(boolean z5) {
                    this.C = (byte) -1;
                    this.D = -1;
                    this.f25099p = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
                }

                /* JADX WARN: Multi-variable type inference failed */
                private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                    c cVar;
                    this.C = (byte) -1;
                    this.D = -1;
                    f0();
                    d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
                    CodedOutputStream J = CodedOutputStream.J(x5, 1);
                    boolean z5 = false;
                    int i5 = 0;
                    while (!z5) {
                        try {
                            try {
                                try {
                                    int K = eVar.K();
                                    switch (K) {
                                        case 0:
                                            z5 = true;
                                        case 8:
                                            int A = eVar.A();
                                            EnumC0312c valueOf = EnumC0312c.valueOf(A);
                                            if (valueOf == null) {
                                                J.o0(K);
                                                J.o0(A);
                                            } else {
                                                this.f25100q |= 1;
                                                this.f25101r = valueOf;
                                            }
                                        case 16:
                                            this.f25100q |= 2;
                                            this.f25102s = eVar.H();
                                        case 29:
                                            this.f25100q |= 4;
                                            this.f25103t = eVar.q();
                                        case 33:
                                            this.f25100q |= 8;
                                            this.f25104u = eVar.m();
                                        case 40:
                                            this.f25100q |= 16;
                                            this.f25105v = eVar.A();
                                        case 48:
                                            this.f25100q |= 32;
                                            this.f25106w = eVar.A();
                                        case 56:
                                            this.f25100q |= 64;
                                            this.f25107x = eVar.A();
                                        case 66:
                                            if ((this.f25100q & 128) == 128) {
                                                b bVar = this.f25108y;
                                                bVar.getClass();
                                                cVar = b.F(bVar);
                                            } else {
                                                cVar = null;
                                            }
                                            b bVar2 = (b) eVar.u(b.f25081w, fVar);
                                            this.f25108y = bVar2;
                                            if (cVar != null) {
                                                cVar.j(bVar2);
                                                this.f25108y = cVar.q();
                                            }
                                            this.f25100q |= 128;
                                        case 74:
                                            if ((i5 & 256) != 256) {
                                                this.f25109z = new ArrayList();
                                                i5 |= 256;
                                            }
                                            this.f25109z.add(eVar.u(F, fVar));
                                        case 80:
                                            this.f25100q |= 512;
                                            this.B = eVar.A();
                                        case 88:
                                            this.f25100q |= 256;
                                            this.A = eVar.A();
                                        default:
                                            if (!eVar.P(K, J)) {
                                                z5 = true;
                                            }
                                    }
                                } catch (IOException e6) {
                                    throw new InvalidProtocolBufferException(e6.getMessage()).i(this);
                                }
                            } catch (InvalidProtocolBufferException e7) {
                                throw e7.i(this);
                            }
                        } catch (Throwable th) {
                            if ((i5 & 256) == 256) {
                                this.f25109z = Collections.unmodifiableList(this.f25109z);
                            }
                            try {
                                J.I();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f25099p = x5.e();
                                throw th2;
                            }
                            this.f25099p = x5.e();
                            throw th;
                        }
                    }
                    if ((i5 & 256) == 256) {
                        this.f25109z = Collections.unmodifiableList(this.f25109z);
                    }
                    try {
                        J.I();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.f25099p = x5.e();
                        throw th3;
                    }
                    this.f25099p = x5.e();
                }
            }

            private C0307b(h.b bVar) {
                super(bVar);
                this.f25094t = (byte) -1;
                this.f25095u = -1;
                this.f25090p = bVar.i();
            }

            private C0307b(boolean z5) {
                this.f25094t = (byte) -1;
                this.f25095u = -1;
                this.f25090p = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
            }

            private C0307b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                c.C0311b c0311b;
                this.f25094t = (byte) -1;
                this.f25095u = -1;
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
                                    this.f25091q |= 1;
                                    this.f25092r = eVar.A();
                                } else if (K != 18) {
                                    if (!eVar.P(K, J)) {
                                    }
                                } else {
                                    if ((this.f25091q & 2) == 2) {
                                        c cVar = this.f25093s;
                                        cVar.getClass();
                                        c0311b = c.h0(cVar);
                                    } else {
                                        c0311b = null;
                                    }
                                    c cVar2 = (c) eVar.u(c.F, fVar);
                                    this.f25093s = cVar2;
                                    if (c0311b != null) {
                                        c0311b.j(cVar2);
                                        this.f25093s = c0311b.q();
                                    }
                                    this.f25091q |= 2;
                                }
                            }
                            z5 = true;
                        } catch (Throwable th) {
                            try {
                                J.I();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f25090p = x5.e();
                                throw th2;
                            }
                            this.f25090p = x5.e();
                            throw th;
                        }
                    } catch (InvalidProtocolBufferException e6) {
                        throw e6.i(this);
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                    }
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f25090p = x5.e();
                    throw th3;
                }
                this.f25090p = x5.e();
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class c extends h.b<b, c> implements kotlin.reflect.jvm.internal.impl.metadata.d {

            /* renamed from: p, reason: collision with root package name */
            private int f25121p;

            /* renamed from: q, reason: collision with root package name */
            private int f25122q;

            /* renamed from: r, reason: collision with root package name */
            private List<C0307b> f25123r = Collections.emptyList();

            private c() {
            }

            private void D() {
            }

            static c o() {
                return new c();
            }

            private static c v() {
                return new c();
            }

            private void w() {
                if ((this.f25121p & 2) != 2) {
                    this.f25123r = new ArrayList(this.f25123r);
                    this.f25121p |= 2;
                }
            }

            public int A() {
                return this.f25123r.size();
            }

            public b B() {
                return b.y();
            }

            public boolean C() {
                return (this.f25121p & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            public c j(b bVar) {
                if (bVar == b.y()) {
                    return this;
                }
                if (bVar.C()) {
                    G(bVar.B());
                }
                if (!bVar.f25085s.isEmpty()) {
                    if (this.f25123r.isEmpty()) {
                        this.f25123r = bVar.f25085s;
                        this.f25121p &= -3;
                    } else {
                        w();
                        this.f25123r.addAll(bVar.f25085s);
                    }
                }
                k(i().f(bVar.f25082p));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: F, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.b.c c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$b> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.b.f25081w     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$b r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$b r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.b.c.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$b$c");
            }

            public c G(int i5) {
                this.f25121p |= 1;
                this.f25122q = i5;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public b m() {
                return b.y();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                if (!C()) {
                    return false;
                }
                for (int i5 = 0; i5 < A(); i5++) {
                    if (!y(i5).l()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return b.y();
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
                int i5 = (this.f25121p & 1) != 1 ? 0 : 1;
                bVar.f25084r = this.f25122q;
                if ((this.f25121p & 2) == 2) {
                    this.f25123r = Collections.unmodifiableList(this.f25123r);
                    this.f25121p &= -3;
                }
                bVar.f25085s = this.f25123r;
                bVar.f25083q = i5;
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public c q() {
                return new c().j(q());
            }

            public C0307b y(int i5) {
                return this.f25123r.get(i5);
            }
        }

        static {
            b bVar = new b(true);
            f25080v = bVar;
            bVar.D();
        }

        private void D() {
            this.f25084r = 0;
            this.f25085s = Collections.emptyList();
        }

        public static c E() {
            return c.o();
        }

        public static c F(b bVar) {
            return c.o().j(bVar);
        }

        public static b y() {
            return f25080v;
        }

        public b A() {
            return f25080v;
        }

        public int B() {
            return this.f25084r;
        }

        public boolean C() {
            return (this.f25083q & 1) == 1;
        }

        public c G() {
            return c.o();
        }

        public c H() {
            return F(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            if ((this.f25083q & 1) == 1) {
                codedOutputStream.a0(1, this.f25084r);
            }
            for (int i5 = 0; i5 < this.f25085s.size(); i5++) {
                codedOutputStream.d0(2, this.f25085s.get(i5));
            }
            codedOutputStream.i0(this.f25082p);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.f25086t;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            if (!C()) {
                this.f25086t = (byte) 0;
                return false;
            }
            for (int i5 = 0; i5 < v(); i5++) {
                if (!t(i5).l()) {
                    this.f25086t = (byte) 0;
                    return false;
                }
            }
            this.f25086t = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return f25080v;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return F(this);
        }

        public C0307b t(int i5) {
            return this.f25085s.get(i5);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.f25087u;
            if (i5 != -1) {
                return i5;
            }
            int o5 = (this.f25083q & 1) == 1 ? CodedOutputStream.o(1, this.f25084r) + 0 : 0;
            for (int i6 = 0; i6 < this.f25085s.size(); i6++) {
                o5 += CodedOutputStream.s(2, this.f25085s.get(i6));
            }
            int size = this.f25082p.size() + o5;
            this.f25087u = size;
            return size;
        }

        public int v() {
            return this.f25085s.size();
        }

        public List<C0307b> w() {
            return this.f25085s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return c.o();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<b> z() {
            return f25081w;
        }

        private b(h.b bVar) {
            super(bVar);
            this.f25086t = (byte) -1;
            this.f25087u = -1;
            this.f25082p = bVar.i();
        }

        private b(boolean z5) {
            this.f25086t = (byte) -1;
            this.f25087u = -1;
            this.f25082p = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f25086t = (byte) -1;
            this.f25087u = -1;
            D();
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
                                this.f25083q |= 1;
                                this.f25084r = eVar.A();
                            } else if (K != 18) {
                                if (!eVar.P(K, J)) {
                                }
                            } else {
                                if ((i5 & 2) != 2) {
                                    this.f25085s = new ArrayList();
                                    i5 |= 2;
                                }
                                this.f25085s.add(eVar.u(C0307b.f25089w, fVar));
                            }
                        }
                        z5 = true;
                    } catch (Throwable th) {
                        if ((i5 & 2) == 2) {
                            this.f25085s = Collections.unmodifiableList(this.f25085s);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f25082p = x5.e();
                            throw th2;
                        }
                        this.f25082p = x5.e();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e6) {
                    throw e6.i(this);
                } catch (IOException e7) {
                    throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                }
            }
            if ((i5 & 2) == 2) {
                this.f25085s = Collections.unmodifiableList(this.f25085s);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25082p = x5.e();
                throw th3;
            }
            this.f25082p = x5.e();
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class c extends h.d<c> implements kotlin.reflect.jvm.internal.impl.metadata.e {
        private static final c Y;
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<c> Z = new C0314a();
        private int A;
        private List<q> B;
        private List<Integer> C;
        private int D;
        private List<d> E;
        private List<i> F;
        private List<n> G;
        private List<r> H;
        private List<g> I;
        private List<Integer> J;
        private int K;
        private int L;
        private q M;
        private int N;
        private List<Integer> O;
        private int P;
        private List<q> Q;
        private List<Integer> R;
        private int S;
        private t T;
        private List<Integer> U;
        private w V;
        private byte W;
        private int X;

        /* renamed from: q, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25124q;

        /* renamed from: r, reason: collision with root package name */
        private int f25125r;

        /* renamed from: s, reason: collision with root package name */
        private int f25126s;

        /* renamed from: t, reason: collision with root package name */
        private int f25127t;

        /* renamed from: u, reason: collision with root package name */
        private int f25128u;

        /* renamed from: v, reason: collision with root package name */
        private List<s> f25129v;

        /* renamed from: w, reason: collision with root package name */
        private List<q> f25130w;

        /* renamed from: x, reason: collision with root package name */
        private List<Integer> f25131x;

        /* renamed from: y, reason: collision with root package name */
        private int f25132y;

        /* renamed from: z, reason: collision with root package name */
        private List<Integer> f25133z;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$c$a, reason: collision with other inner class name */
        static class C0314a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
            C0314a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new c(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<c, b> implements kotlin.reflect.jvm.internal.impl.metadata.e {
            private int H;
            private int J;

            /* renamed from: r, reason: collision with root package name */
            private int f25134r;

            /* renamed from: t, reason: collision with root package name */
            private int f25136t;

            /* renamed from: u, reason: collision with root package name */
            private int f25137u;

            /* renamed from: s, reason: collision with root package name */
            private int f25135s = 6;

            /* renamed from: v, reason: collision with root package name */
            private List<s> f25138v = Collections.emptyList();

            /* renamed from: w, reason: collision with root package name */
            private List<q> f25139w = Collections.emptyList();

            /* renamed from: x, reason: collision with root package name */
            private List<Integer> f25140x = Collections.emptyList();

            /* renamed from: y, reason: collision with root package name */
            private List<Integer> f25141y = Collections.emptyList();

            /* renamed from: z, reason: collision with root package name */
            private List<q> f25142z = Collections.emptyList();
            private List<Integer> A = Collections.emptyList();
            private List<d> B = Collections.emptyList();
            private List<i> C = Collections.emptyList();
            private List<n> D = Collections.emptyList();
            private List<r> E = Collections.emptyList();
            private List<g> F = Collections.emptyList();
            private List<Integer> G = Collections.emptyList();
            private q I = q.X();
            private List<Integer> K = Collections.emptyList();
            private List<q> L = Collections.emptyList();
            private List<Integer> M = Collections.emptyList();
            private t N = t.t();
            private List<Integer> O = Collections.emptyList();
            private w P = w.r();

            private b() {
            }

            private void C0() {
            }

            private static b D() {
                return new b();
            }

            private void E() {
                if ((this.f25134r & 512) != 512) {
                    this.B = new ArrayList(this.B);
                    this.f25134r |= 512;
                }
            }

            private void F() {
                if ((this.f25134r & 256) != 256) {
                    this.A = new ArrayList(this.A);
                    this.f25134r |= 256;
                }
            }

            private void G() {
                if ((this.f25134r & 128) != 128) {
                    this.f25142z = new ArrayList(this.f25142z);
                    this.f25134r |= 128;
                }
            }

            private void I() {
                if ((this.f25134r & 8192) != 8192) {
                    this.F = new ArrayList(this.F);
                    this.f25134r |= 8192;
                }
            }

            private void J() {
                if ((this.f25134r & 1024) != 1024) {
                    this.C = new ArrayList(this.C);
                    this.f25134r |= 1024;
                }
            }

            private void K() {
                if ((this.f25134r & 262144) != 262144) {
                    this.K = new ArrayList(this.K);
                    this.f25134r |= 262144;
                }
            }

            private void L() {
                if ((this.f25134r & 1048576) != 1048576) {
                    this.M = new ArrayList(this.M);
                    this.f25134r |= 1048576;
                }
            }

            private void M() {
                if ((this.f25134r & 524288) != 524288) {
                    this.L = new ArrayList(this.L);
                    this.f25134r |= 524288;
                }
            }

            private void N() {
                if ((this.f25134r & 64) != 64) {
                    this.f25141y = new ArrayList(this.f25141y);
                    this.f25134r |= 64;
                }
            }

            private void Q() {
                if ((this.f25134r & 2048) != 2048) {
                    this.D = new ArrayList(this.D);
                    this.f25134r |= 2048;
                }
            }

            private void S() {
                if ((this.f25134r & 16384) != 16384) {
                    this.G = new ArrayList(this.G);
                    this.f25134r |= 16384;
                }
            }

            private void T() {
                if ((this.f25134r & 32) != 32) {
                    this.f25140x = new ArrayList(this.f25140x);
                    this.f25134r |= 32;
                }
            }

            private void V() {
                if ((this.f25134r & 16) != 16) {
                    this.f25139w = new ArrayList(this.f25139w);
                    this.f25134r |= 16;
                }
            }

            private void W() {
                if ((this.f25134r & 4096) != 4096) {
                    this.E = new ArrayList(this.E);
                    this.f25134r |= 4096;
                }
            }

            private void Y() {
                if ((this.f25134r & 8) != 8) {
                    this.f25138v = new ArrayList(this.f25138v);
                    this.f25134r |= 8;
                }
            }

            private void a0() {
                if ((this.f25134r & 4194304) != 4194304) {
                    this.O = new ArrayList(this.O);
                    this.f25134r |= 4194304;
                }
            }

            static b y() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public c build() {
                c B = B();
                if (B.l()) {
                    return B;
                }
                throw new UninitializedMessageException(B);
            }

            public boolean A0() {
                return (this.f25134r & 65536) == 65536;
            }

            public c B() {
                c cVar = new c(this);
                int i5 = this.f25134r;
                int i6 = (i5 & 1) != 1 ? 0 : 1;
                cVar.f25126s = this.f25135s;
                if ((i5 & 2) == 2) {
                    i6 |= 2;
                }
                cVar.f25127t = this.f25136t;
                if ((i5 & 4) == 4) {
                    i6 |= 4;
                }
                cVar.f25128u = this.f25137u;
                if ((this.f25134r & 8) == 8) {
                    this.f25138v = Collections.unmodifiableList(this.f25138v);
                    this.f25134r &= -9;
                }
                cVar.f25129v = this.f25138v;
                if ((this.f25134r & 16) == 16) {
                    this.f25139w = Collections.unmodifiableList(this.f25139w);
                    this.f25134r &= -17;
                }
                cVar.f25130w = this.f25139w;
                if ((this.f25134r & 32) == 32) {
                    this.f25140x = Collections.unmodifiableList(this.f25140x);
                    this.f25134r &= -33;
                }
                cVar.f25131x = this.f25140x;
                if ((this.f25134r & 64) == 64) {
                    this.f25141y = Collections.unmodifiableList(this.f25141y);
                    this.f25134r &= -65;
                }
                cVar.f25133z = this.f25141y;
                if ((this.f25134r & 128) == 128) {
                    this.f25142z = Collections.unmodifiableList(this.f25142z);
                    this.f25134r &= -129;
                }
                cVar.B = this.f25142z;
                if ((this.f25134r & 256) == 256) {
                    this.A = Collections.unmodifiableList(this.A);
                    this.f25134r &= -257;
                }
                cVar.C = this.A;
                if ((this.f25134r & 512) == 512) {
                    this.B = Collections.unmodifiableList(this.B);
                    this.f25134r &= -513;
                }
                cVar.E = this.B;
                if ((this.f25134r & 1024) == 1024) {
                    this.C = Collections.unmodifiableList(this.C);
                    this.f25134r &= -1025;
                }
                cVar.F = this.C;
                if ((this.f25134r & 2048) == 2048) {
                    this.D = Collections.unmodifiableList(this.D);
                    this.f25134r &= -2049;
                }
                cVar.G = this.D;
                if ((this.f25134r & 4096) == 4096) {
                    this.E = Collections.unmodifiableList(this.E);
                    this.f25134r &= -4097;
                }
                cVar.H = this.E;
                if ((this.f25134r & 8192) == 8192) {
                    this.F = Collections.unmodifiableList(this.F);
                    this.f25134r &= -8193;
                }
                cVar.I = this.F;
                if ((this.f25134r & 16384) == 16384) {
                    this.G = Collections.unmodifiableList(this.G);
                    this.f25134r &= -16385;
                }
                cVar.J = this.G;
                if ((i5 & 32768) == 32768) {
                    i6 |= 8;
                }
                cVar.L = this.H;
                if ((i5 & 65536) == 65536) {
                    i6 |= 16;
                }
                cVar.M = this.I;
                if ((i5 & 131072) == 131072) {
                    i6 |= 32;
                }
                cVar.N = this.J;
                if ((this.f25134r & 262144) == 262144) {
                    this.K = Collections.unmodifiableList(this.K);
                    this.f25134r &= -262145;
                }
                cVar.O = this.K;
                if ((this.f25134r & 524288) == 524288) {
                    this.L = Collections.unmodifiableList(this.L);
                    this.f25134r &= -524289;
                }
                cVar.Q = this.L;
                if ((this.f25134r & 1048576) == 1048576) {
                    this.M = Collections.unmodifiableList(this.M);
                    this.f25134r &= -1048577;
                }
                cVar.R = this.M;
                if ((i5 & 2097152) == 2097152) {
                    i6 |= 64;
                }
                cVar.T = this.N;
                if ((this.f25134r & 4194304) == 4194304) {
                    this.O = Collections.unmodifiableList(this.O);
                    this.f25134r &= -4194305;
                }
                cVar.U = this.O;
                if ((i5 & 8388608) == 8388608) {
                    i6 |= 128;
                }
                cVar.V = this.P;
                cVar.f25125r = i6;
                return cVar;
            }

            public boolean B0() {
                return (this.f25134r & 2097152) == 2097152;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(B());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: D0, reason: merged with bridge method [inline-methods] */
            public b j(c cVar) {
                if (cVar == c.z0()) {
                    return this;
                }
                if (cVar.m1()) {
                    J0(cVar.E0());
                }
                if (cVar.n1()) {
                    K0(cVar.F0());
                }
                if (cVar.l1()) {
                    I0(cVar.r0());
                }
                if (!cVar.f25129v.isEmpty()) {
                    if (this.f25138v.isEmpty()) {
                        this.f25138v = cVar.f25129v;
                        this.f25134r &= -9;
                    } else {
                        Y();
                        this.f25138v.addAll(cVar.f25129v);
                    }
                }
                if (!cVar.f25130w.isEmpty()) {
                    if (this.f25139w.isEmpty()) {
                        this.f25139w = cVar.f25130w;
                        this.f25134r &= -17;
                    } else {
                        V();
                        this.f25139w.addAll(cVar.f25130w);
                    }
                }
                if (!cVar.f25131x.isEmpty()) {
                    if (this.f25140x.isEmpty()) {
                        this.f25140x = cVar.f25131x;
                        this.f25134r &= -33;
                    } else {
                        T();
                        this.f25140x.addAll(cVar.f25131x);
                    }
                }
                if (!cVar.f25133z.isEmpty()) {
                    if (this.f25141y.isEmpty()) {
                        this.f25141y = cVar.f25133z;
                        this.f25134r &= -65;
                    } else {
                        N();
                        this.f25141y.addAll(cVar.f25133z);
                    }
                }
                if (!cVar.B.isEmpty()) {
                    if (this.f25142z.isEmpty()) {
                        this.f25142z = cVar.B;
                        this.f25134r &= -129;
                    } else {
                        G();
                        this.f25142z.addAll(cVar.B);
                    }
                }
                if (!cVar.C.isEmpty()) {
                    if (this.A.isEmpty()) {
                        this.A = cVar.C;
                        this.f25134r &= -257;
                    } else {
                        F();
                        this.A.addAll(cVar.C);
                    }
                }
                if (!cVar.E.isEmpty()) {
                    if (this.B.isEmpty()) {
                        this.B = cVar.E;
                        this.f25134r &= -513;
                    } else {
                        E();
                        this.B.addAll(cVar.E);
                    }
                }
                if (!cVar.F.isEmpty()) {
                    if (this.C.isEmpty()) {
                        this.C = cVar.F;
                        this.f25134r &= -1025;
                    } else {
                        J();
                        this.C.addAll(cVar.F);
                    }
                }
                if (!cVar.G.isEmpty()) {
                    if (this.D.isEmpty()) {
                        this.D = cVar.G;
                        this.f25134r &= -2049;
                    } else {
                        Q();
                        this.D.addAll(cVar.G);
                    }
                }
                if (!cVar.H.isEmpty()) {
                    if (this.E.isEmpty()) {
                        this.E = cVar.H;
                        this.f25134r &= -4097;
                    } else {
                        W();
                        this.E.addAll(cVar.H);
                    }
                }
                if (!cVar.I.isEmpty()) {
                    if (this.F.isEmpty()) {
                        this.F = cVar.I;
                        this.f25134r &= -8193;
                    } else {
                        I();
                        this.F.addAll(cVar.I);
                    }
                }
                if (!cVar.J.isEmpty()) {
                    if (this.G.isEmpty()) {
                        this.G = cVar.J;
                        this.f25134r &= -16385;
                    } else {
                        S();
                        this.G.addAll(cVar.J);
                    }
                }
                if (cVar.o1()) {
                    L0(cVar.J0());
                }
                if (cVar.p1()) {
                    F0(cVar.K0());
                }
                if (cVar.q1()) {
                    M0(cVar.L0());
                }
                if (!cVar.O.isEmpty()) {
                    if (this.K.isEmpty()) {
                        this.K = cVar.O;
                        this.f25134r &= -262145;
                    } else {
                        K();
                        this.K.addAll(cVar.O);
                    }
                }
                if (!cVar.Q.isEmpty()) {
                    if (this.L.isEmpty()) {
                        this.L = cVar.Q;
                        this.f25134r &= -524289;
                    } else {
                        M();
                        this.L.addAll(cVar.Q);
                    }
                }
                if (!cVar.R.isEmpty()) {
                    if (this.M.isEmpty()) {
                        this.M = cVar.R;
                        this.f25134r &= -1048577;
                    } else {
                        L();
                        this.M.addAll(cVar.R);
                    }
                }
                if (cVar.r1()) {
                    G0(cVar.i1());
                }
                if (!cVar.U.isEmpty()) {
                    if (this.O.isEmpty()) {
                        this.O = cVar.U;
                        this.f25134r &= -4194305;
                    } else {
                        a0();
                        this.O.addAll(cVar.U);
                    }
                }
                if (cVar.s1()) {
                    H0(cVar.k1());
                }
                w(cVar);
                k(i().f(cVar.f25124q));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: E0, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.c.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$c> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.c.Z     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$c r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$c r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.c.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$c$b");
            }

            public b F0(q qVar) {
                if ((this.f25134r & 65536) != 65536 || this.I == q.X()) {
                    this.I = qVar;
                } else {
                    this.I = q.z0(this.I).j(qVar).B();
                }
                this.f25134r |= 65536;
                return this;
            }

            public b G0(t tVar) {
                if ((this.f25134r & 2097152) != 2097152 || this.N == t.t()) {
                    this.N = tVar;
                } else {
                    this.N = t.F(this.N).j(tVar).q();
                }
                this.f25134r |= 2097152;
                return this;
            }

            public b H0(w wVar) {
                if ((this.f25134r & 8388608) != 8388608 || this.P == w.r()) {
                    this.P = wVar;
                } else {
                    this.P = w.A(this.P).j(wVar).q();
                }
                this.f25134r |= 8388608;
                return this;
            }

            public b I0(int i5) {
                this.f25134r |= 4;
                this.f25137u = i5;
                return this;
            }

            public b J0(int i5) {
                this.f25134r |= 1;
                this.f25135s = i5;
                return this;
            }

            public b K0(int i5) {
                this.f25134r |= 2;
                this.f25136t = i5;
                return this;
            }

            public b L0(int i5) {
                this.f25134r |= 32768;
                this.H = i5;
                return this;
            }

            public b M0(int i5) {
                this.f25134r |= 131072;
                this.J = i5;
                return this;
            }

            public d b0(int i5) {
                return this.B.get(i5);
            }

            public int c0() {
                return this.B.size();
            }

            public q d0(int i5) {
                return this.f25142z.get(i5);
            }

            public int e0() {
                return this.f25142z.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public kotlin.reflect.jvm.internal.impl.protobuf.h m() {
                return c.z0();
            }

            public c g0() {
                return c.z0();
            }

            public g h0(int i5) {
                return this.F.get(i5);
            }

            public int i0() {
                return this.F.size();
            }

            public i j0(int i5) {
                return this.C.get(i5);
            }

            public int k0() {
                return this.C.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                if (!z0()) {
                    return false;
                }
                for (int i5 = 0; i5 < w0(); i5++) {
                    if (!v0(i5).l()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < s0(); i6++) {
                    if (!r0(i6).l()) {
                        return false;
                    }
                }
                for (int i7 = 0; i7 < e0(); i7++) {
                    if (!d0(i7).l()) {
                        return false;
                    }
                }
                for (int i8 = 0; i8 < c0(); i8++) {
                    if (!b0(i8).l()) {
                        return false;
                    }
                }
                for (int i9 = 0; i9 < k0(); i9++) {
                    if (!j0(i9).l()) {
                        return false;
                    }
                }
                for (int i10 = 0; i10 < q0(); i10++) {
                    if (!o0(i10).l()) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < u0(); i11++) {
                    if (!t0(i11).l()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < i0(); i12++) {
                    if (!h0(i12).l()) {
                        return false;
                    }
                }
                if (A0() && !this.I.l()) {
                    return false;
                }
                for (int i13 = 0; i13 < n0(); i13++) {
                    if (!m0(i13).l()) {
                        return false;
                    }
                }
                return (!B0() || this.N.l()) && v();
            }

            public q l0() {
                return this.I;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return c.z0();
            }

            public q m0(int i5) {
                return this.L.get(i5);
            }

            public int n0() {
                return this.L.size();
            }

            public n o0(int i5) {
                return this.D.get(i5);
            }

            public int q0() {
                return this.D.size();
            }

            public q r0(int i5) {
                return this.f25139w.get(i5);
            }

            public int s0() {
                return this.f25139w.size();
            }

            public r t0(int i5) {
                return this.E.get(i5);
            }

            public int u0() {
                return this.E.size();
            }

            public s v0(int i5) {
                return this.f25138v.get(i5);
            }

            public int w0() {
                return this.f25138v.size();
            }

            public t x0() {
                return this.N;
            }

            public boolean z0() {
                return (this.f25134r & 2) == 2;
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$c$c, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public enum EnumC0315c implements i.a {
            CLASS(0, 0),
            INTERFACE(1, 1),
            ENUM_CLASS(2, 2),
            ENUM_ENTRY(3, 3),
            ANNOTATION_CLASS(4, 4),
            OBJECT(5, 5),
            COMPANION_OBJECT(6, 6);

            private static i.b<EnumC0315c> internalValueMap = new C0316a();
            private final int value;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$c$c$a, reason: collision with other inner class name */
            static class C0316a implements i.b<EnumC0315c> {
                C0316a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                public EnumC0315c a(int i5) {
                    return EnumC0315c.valueOf(i5);
                }

                public EnumC0315c b(int i5) {
                    return EnumC0315c.valueOf(i5);
                }
            }

            EnumC0315c(int i5, int i6) {
                this.value = i6;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.value;
            }

            public static EnumC0315c valueOf(int i5) {
                switch (i5) {
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
            Y = cVar;
            cVar.t1();
        }

        private void t1() {
            this.f25126s = 6;
            this.f25127t = 0;
            this.f25128u = 0;
            this.f25129v = Collections.emptyList();
            this.f25130w = Collections.emptyList();
            this.f25131x = Collections.emptyList();
            this.f25133z = Collections.emptyList();
            this.B = Collections.emptyList();
            this.C = Collections.emptyList();
            this.E = Collections.emptyList();
            this.F = Collections.emptyList();
            this.G = Collections.emptyList();
            this.H = Collections.emptyList();
            this.I = Collections.emptyList();
            this.J = Collections.emptyList();
            this.L = 0;
            this.M = q.X();
            this.N = 0;
            this.O = Collections.emptyList();
            this.Q = Collections.emptyList();
            this.R = Collections.emptyList();
            this.T = t.t();
            this.U = Collections.emptyList();
            this.V = w.r();
        }

        public static b u1() {
            return b.y();
        }

        public static b v1(c cVar) {
            return b.y().j(cVar);
        }

        public static c x1(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws IOException {
            return Z.a(inputStream, fVar);
        }

        public static c z0() {
            return Y;
        }

        public c A0() {
            return Y;
        }

        public g B0(int i5) {
            return this.I.get(i5);
        }

        public int C0() {
            return this.I.size();
        }

        public List<g> D0() {
            return this.I;
        }

        public int E0() {
            return this.f25126s;
        }

        public int F0() {
            return this.f25127t;
        }

        public i G0(int i5) {
            return this.F.get(i5);
        }

        public int H0() {
            return this.F.size();
        }

        public List<i> I0() {
            return this.F;
        }

        public int J0() {
            return this.L;
        }

        public q K0() {
            return this.M;
        }

        public int L0() {
            return this.N;
        }

        public int M0() {
            return this.O.size();
        }

        public List<Integer> N0() {
            return this.O;
        }

        public q O0(int i5) {
            return this.Q.get(i5);
        }

        public int P0() {
            return this.Q.size();
        }

        public int Q0() {
            return this.R.size();
        }

        public List<Integer> R0() {
            return this.R;
        }

        public List<q> S0() {
            return this.Q;
        }

        public List<Integer> T0() {
            return this.f25133z;
        }

        public n U0(int i5) {
            return this.G.get(i5);
        }

        public int V0() {
            return this.G.size();
        }

        public List<n> W0() {
            return this.G;
        }

        public List<Integer> X0() {
            return this.J;
        }

        public q Y0(int i5) {
            return this.f25130w.get(i5);
        }

        public int Z0() {
            return this.f25130w.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            h.d<MessageType>.a w5 = w();
            if ((this.f25125r & 1) == 1) {
                codedOutputStream.a0(1, this.f25126s);
            }
            if (this.f25131x.size() > 0) {
                codedOutputStream.o0(18);
                codedOutputStream.o0(this.f25132y);
            }
            for (int i5 = 0; i5 < this.f25131x.size(); i5++) {
                codedOutputStream.b0(this.f25131x.get(i5).intValue());
            }
            if ((this.f25125r & 2) == 2) {
                codedOutputStream.a0(3, this.f25127t);
            }
            if ((this.f25125r & 4) == 4) {
                codedOutputStream.a0(4, this.f25128u);
            }
            for (int i6 = 0; i6 < this.f25129v.size(); i6++) {
                codedOutputStream.d0(5, this.f25129v.get(i6));
            }
            for (int i7 = 0; i7 < this.f25130w.size(); i7++) {
                codedOutputStream.d0(6, this.f25130w.get(i7));
            }
            if (this.f25133z.size() > 0) {
                codedOutputStream.o0(58);
                codedOutputStream.o0(this.A);
            }
            for (int i8 = 0; i8 < this.f25133z.size(); i8++) {
                codedOutputStream.b0(this.f25133z.get(i8).intValue());
            }
            for (int i9 = 0; i9 < this.E.size(); i9++) {
                codedOutputStream.d0(8, this.E.get(i9));
            }
            for (int i10 = 0; i10 < this.F.size(); i10++) {
                codedOutputStream.d0(9, this.F.get(i10));
            }
            for (int i11 = 0; i11 < this.G.size(); i11++) {
                codedOutputStream.d0(10, this.G.get(i11));
            }
            for (int i12 = 0; i12 < this.H.size(); i12++) {
                codedOutputStream.d0(11, this.H.get(i12));
            }
            for (int i13 = 0; i13 < this.I.size(); i13++) {
                codedOutputStream.d0(13, this.I.get(i13));
            }
            if (this.J.size() > 0) {
                codedOutputStream.o0(130);
                codedOutputStream.o0(this.K);
            }
            for (int i14 = 0; i14 < this.J.size(); i14++) {
                codedOutputStream.b0(this.J.get(i14).intValue());
            }
            if ((this.f25125r & 8) == 8) {
                codedOutputStream.a0(17, this.L);
            }
            if ((this.f25125r & 16) == 16) {
                codedOutputStream.d0(18, this.M);
            }
            if ((this.f25125r & 32) == 32) {
                codedOutputStream.a0(19, this.N);
            }
            for (int i15 = 0; i15 < this.B.size(); i15++) {
                codedOutputStream.d0(20, this.B.get(i15));
            }
            if (this.C.size() > 0) {
                codedOutputStream.o0(170);
                codedOutputStream.o0(this.D);
            }
            for (int i16 = 0; i16 < this.C.size(); i16++) {
                codedOutputStream.b0(this.C.get(i16).intValue());
            }
            if (this.O.size() > 0) {
                codedOutputStream.o0(178);
                codedOutputStream.o0(this.P);
            }
            for (int i17 = 0; i17 < this.O.size(); i17++) {
                codedOutputStream.b0(this.O.get(i17).intValue());
            }
            for (int i18 = 0; i18 < this.Q.size(); i18++) {
                codedOutputStream.d0(23, this.Q.get(i18));
            }
            if (this.R.size() > 0) {
                codedOutputStream.o0(194);
                codedOutputStream.o0(this.S);
            }
            for (int i19 = 0; i19 < this.R.size(); i19++) {
                codedOutputStream.b0(this.R.get(i19).intValue());
            }
            if ((this.f25125r & 64) == 64) {
                codedOutputStream.d0(30, this.T);
            }
            for (int i20 = 0; i20 < this.U.size(); i20++) {
                codedOutputStream.a0(31, this.U.get(i20).intValue());
            }
            if ((this.f25125r & 128) == 128) {
                codedOutputStream.d0(32, this.V);
            }
            w5.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f25124q);
        }

        public List<Integer> a1() {
            return this.f25131x;
        }

        public List<q> b1() {
            return this.f25130w;
        }

        public r c1(int i5) {
            return this.H.get(i5);
        }

        public int d1() {
            return this.H.size();
        }

        public List<r> e1() {
            return this.H;
        }

        public s f1(int i5) {
            return this.f25129v.get(i5);
        }

        public int g1() {
            return this.f25129v.size();
        }

        public List<s> h1() {
            return this.f25129v;
        }

        public t i1() {
            return this.T;
        }

        public List<Integer> j1() {
            return this.U;
        }

        public w k1() {
            return this.V;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.W;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            if (!n1()) {
                this.W = (byte) 0;
                return false;
            }
            for (int i5 = 0; i5 < g1(); i5++) {
                if (!f1(i5).l()) {
                    this.W = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < Z0(); i6++) {
                if (!Y0(i6).l()) {
                    this.W = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < w0(); i7++) {
                if (!v0(i7).l()) {
                    this.W = (byte) 0;
                    return false;
                }
            }
            for (int i8 = 0; i8 < t0(); i8++) {
                if (!s0(i8).l()) {
                    this.W = (byte) 0;
                    return false;
                }
            }
            for (int i9 = 0; i9 < H0(); i9++) {
                if (!G0(i9).l()) {
                    this.W = (byte) 0;
                    return false;
                }
            }
            for (int i10 = 0; i10 < V0(); i10++) {
                if (!U0(i10).l()) {
                    this.W = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < d1(); i11++) {
                if (!c1(i11).l()) {
                    this.W = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < C0(); i12++) {
                if (!B0(i12).l()) {
                    this.W = (byte) 0;
                    return false;
                }
            }
            if (p1() && !this.M.l()) {
                this.W = (byte) 0;
                return false;
            }
            for (int i13 = 0; i13 < P0(); i13++) {
                if (!O0(i13).l()) {
                    this.W = (byte) 0;
                    return false;
                }
            }
            if (r1() && !this.T.l()) {
                this.W = (byte) 0;
                return false;
            }
            if (p()) {
                this.W = (byte) 1;
                return true;
            }
            this.W = (byte) 0;
            return false;
        }

        public boolean l1() {
            return (this.f25125r & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return Y;
        }

        public boolean m1() {
            return (this.f25125r & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return v1(this);
        }

        public boolean n1() {
            return (this.f25125r & 2) == 2;
        }

        public boolean o1() {
            return (this.f25125r & 8) == 8;
        }

        public boolean p1() {
            return (this.f25125r & 16) == 16;
        }

        public boolean q1() {
            return (this.f25125r & 32) == 32;
        }

        public int r0() {
            return this.f25128u;
        }

        public boolean r1() {
            return (this.f25125r & 64) == 64;
        }

        public d s0(int i5) {
            return this.E.get(i5);
        }

        public boolean s1() {
            return (this.f25125r & 128) == 128;
        }

        public int t0() {
            return this.E.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.X;
            if (i5 != -1) {
                return i5;
            }
            int o5 = (this.f25125r & 1) == 1 ? CodedOutputStream.o(1, this.f25126s) + 0 : 0;
            int i6 = 0;
            for (int i7 = 0; i7 < this.f25131x.size(); i7++) {
                i6 += CodedOutputStream.p(this.f25131x.get(i7).intValue());
            }
            int i8 = o5 + i6;
            if (!this.f25131x.isEmpty()) {
                i8 = i8 + 1 + CodedOutputStream.p(i6);
            }
            this.f25132y = i6;
            if ((this.f25125r & 2) == 2) {
                i8 += CodedOutputStream.o(3, this.f25127t);
            }
            if ((this.f25125r & 4) == 4) {
                i8 += CodedOutputStream.o(4, this.f25128u);
            }
            for (int i9 = 0; i9 < this.f25129v.size(); i9++) {
                i8 += CodedOutputStream.s(5, this.f25129v.get(i9));
            }
            for (int i10 = 0; i10 < this.f25130w.size(); i10++) {
                i8 += CodedOutputStream.s(6, this.f25130w.get(i10));
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.f25133z.size(); i12++) {
                i11 += CodedOutputStream.p(this.f25133z.get(i12).intValue());
            }
            int i13 = i8 + i11;
            if (!this.f25133z.isEmpty()) {
                i13 = i13 + 1 + CodedOutputStream.p(i11);
            }
            this.A = i11;
            for (int i14 = 0; i14 < this.E.size(); i14++) {
                i13 += CodedOutputStream.s(8, this.E.get(i14));
            }
            for (int i15 = 0; i15 < this.F.size(); i15++) {
                i13 += CodedOutputStream.s(9, this.F.get(i15));
            }
            for (int i16 = 0; i16 < this.G.size(); i16++) {
                i13 += CodedOutputStream.s(10, this.G.get(i16));
            }
            for (int i17 = 0; i17 < this.H.size(); i17++) {
                i13 += CodedOutputStream.s(11, this.H.get(i17));
            }
            for (int i18 = 0; i18 < this.I.size(); i18++) {
                i13 += CodedOutputStream.s(13, this.I.get(i18));
            }
            int i19 = 0;
            for (int i20 = 0; i20 < this.J.size(); i20++) {
                i19 += CodedOutputStream.p(this.J.get(i20).intValue());
            }
            int i21 = i13 + i19;
            if (!this.J.isEmpty()) {
                i21 = i21 + 2 + CodedOutputStream.p(i19);
            }
            this.K = i19;
            if ((this.f25125r & 8) == 8) {
                i21 += CodedOutputStream.o(17, this.L);
            }
            if ((this.f25125r & 16) == 16) {
                i21 += CodedOutputStream.s(18, this.M);
            }
            if ((this.f25125r & 32) == 32) {
                i21 += CodedOutputStream.o(19, this.N);
            }
            for (int i22 = 0; i22 < this.B.size(); i22++) {
                i21 += CodedOutputStream.s(20, this.B.get(i22));
            }
            int i23 = 0;
            for (int i24 = 0; i24 < this.C.size(); i24++) {
                i23 += CodedOutputStream.p(this.C.get(i24).intValue());
            }
            int i25 = i21 + i23;
            if (!this.C.isEmpty()) {
                i25 = i25 + 2 + CodedOutputStream.p(i23);
            }
            this.D = i23;
            int i26 = 0;
            for (int i27 = 0; i27 < this.O.size(); i27++) {
                i26 += CodedOutputStream.p(this.O.get(i27).intValue());
            }
            int i28 = i25 + i26;
            if (!this.O.isEmpty()) {
                i28 = i28 + 2 + CodedOutputStream.p(i26);
            }
            this.P = i26;
            for (int i29 = 0; i29 < this.Q.size(); i29++) {
                i28 += CodedOutputStream.s(23, this.Q.get(i29));
            }
            int i30 = 0;
            for (int i31 = 0; i31 < this.R.size(); i31++) {
                i30 += CodedOutputStream.p(this.R.get(i31).intValue());
            }
            int i32 = i28 + i30;
            if (!this.R.isEmpty()) {
                i32 = i32 + 2 + CodedOutputStream.p(i30);
            }
            this.S = i30;
            if ((this.f25125r & 64) == 64) {
                i32 += CodedOutputStream.s(30, this.T);
            }
            int i33 = 0;
            for (int i34 = 0; i34 < this.U.size(); i34++) {
                i33 += CodedOutputStream.p(this.U.get(i34).intValue());
            }
            int size = (this.U.size() * 2) + i32 + i33;
            if ((this.f25125r & 128) == 128) {
                size += CodedOutputStream.s(32, this.V);
            }
            int size2 = this.f25124q.size() + size + q();
            this.X = size2;
            return size2;
        }

        public List<d> u0() {
            return this.E;
        }

        public q v0(int i5) {
            return this.B.get(i5);
        }

        public int w0() {
            return this.B.size();
        }

        public b w1() {
            return b.y();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.y();
        }

        public List<Integer> x0() {
            return this.C;
        }

        public List<q> y0() {
            return this.B;
        }

        public b y1() {
            return v1(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<c> z() {
            return Z;
        }

        private c(h.c<c, ?> cVar) {
            super(cVar);
            this.f25132y = -1;
            this.A = -1;
            this.D = -1;
            this.K = -1;
            this.P = -1;
            this.S = -1;
            this.W = (byte) -1;
            this.X = -1;
            this.f25124q = cVar.i();
        }

        private c(boolean z5) {
            this.f25132y = -1;
            this.A = -1;
            this.D = -1;
            this.K = -1;
            this.P = -1;
            this.S = -1;
            this.W = (byte) -1;
            this.X = -1;
            this.f25124q = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
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
            boolean z5;
            this.f25132y = -1;
            this.A = -1;
            this.D = -1;
            this.K = -1;
            this.P = -1;
            this.S = -1;
            this.W = (byte) -1;
            this.X = -1;
            t1();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            boolean z6 = false;
            char c6 = 0;
            while (!z6) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            switch (K) {
                                case 0:
                                    z5 = true;
                                    z6 = z5;
                                case 8:
                                    z5 = true;
                                    this.f25125r |= 1;
                                    this.f25126s = eVar.s();
                                case 16:
                                    int i5 = (c6 == true ? 1 : 0) & 32;
                                    char c7 = c6;
                                    if (i5 != 32) {
                                        this.f25131x = new ArrayList();
                                        c7 = (c6 == true ? 1 : 0) | ' ';
                                    }
                                    this.f25131x.add(Integer.valueOf(eVar.s()));
                                    c6 = c7;
                                    z5 = true;
                                case 18:
                                    int j5 = eVar.j(eVar.A());
                                    int i6 = (c6 == true ? 1 : 0) & 32;
                                    char c8 = c6;
                                    if (i6 != 32) {
                                        c8 = c6;
                                        if (eVar.e() > 0) {
                                            this.f25131x = new ArrayList();
                                            c8 = (c6 == true ? 1 : 0) | ' ';
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.f25131x.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j5);
                                    c6 = c8;
                                    z5 = true;
                                case 24:
                                    this.f25125r |= 2;
                                    this.f25127t = eVar.s();
                                    c6 = c6;
                                    z5 = true;
                                case 32:
                                    this.f25125r |= 4;
                                    this.f25128u = eVar.s();
                                    c6 = c6;
                                    z5 = true;
                                case 42:
                                    int i7 = (c6 == true ? 1 : 0) & 8;
                                    char c9 = c6;
                                    if (i7 != 8) {
                                        this.f25129v = new ArrayList();
                                        c9 = (c6 == true ? 1 : 0) | '\b';
                                    }
                                    this.f25129v.add(eVar.u(s.C, fVar));
                                    c6 = c9;
                                    z5 = true;
                                case 50:
                                    int i8 = (c6 == true ? 1 : 0) & 16;
                                    char c10 = c6;
                                    if (i8 != 16) {
                                        this.f25130w = new ArrayList();
                                        c10 = (c6 == true ? 1 : 0) | 16;
                                    }
                                    this.f25130w.add(eVar.u(q.J, fVar));
                                    c6 = c10;
                                    z5 = true;
                                case 56:
                                    int i9 = (c6 == true ? 1 : 0) & 64;
                                    char c11 = c6;
                                    if (i9 != 64) {
                                        this.f25133z = new ArrayList();
                                        c11 = (c6 == true ? 1 : 0) | '@';
                                    }
                                    this.f25133z.add(Integer.valueOf(eVar.s()));
                                    c6 = c11;
                                    z5 = true;
                                case 58:
                                    int j6 = eVar.j(eVar.A());
                                    int i10 = (c6 == true ? 1 : 0) & 64;
                                    char c12 = c6;
                                    if (i10 != 64) {
                                        c12 = c6;
                                        if (eVar.e() > 0) {
                                            this.f25133z = new ArrayList();
                                            c12 = (c6 == true ? 1 : 0) | '@';
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.f25133z.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j6);
                                    c6 = c12;
                                    z5 = true;
                                case 66:
                                    int i11 = (c6 == true ? 1 : 0) & 512;
                                    char c13 = c6;
                                    if (i11 != 512) {
                                        this.E = new ArrayList();
                                        c13 = (c6 == true ? 1 : 0) | 512;
                                    }
                                    this.E.add(eVar.u(d.f25144y, fVar));
                                    c6 = c13;
                                    z5 = true;
                                case 74:
                                    int i12 = (c6 == true ? 1 : 0) & 1024;
                                    char c14 = c6;
                                    if (i12 != 1024) {
                                        this.F = new ArrayList();
                                        c14 = (c6 == true ? 1 : 0) | 1024;
                                    }
                                    this.F.add(eVar.u(i.K, fVar));
                                    c6 = c14;
                                    z5 = true;
                                case 82:
                                    int i13 = (c6 == true ? 1 : 0) & 2048;
                                    char c15 = c6;
                                    if (i13 != 2048) {
                                        this.G = new ArrayList();
                                        c15 = (c6 == true ? 1 : 0) | 2048;
                                    }
                                    this.G.add(eVar.u(n.K, fVar));
                                    c6 = c15;
                                    z5 = true;
                                case 90:
                                    int i14 = (c6 == true ? 1 : 0) & 4096;
                                    char c16 = c6;
                                    if (i14 != 4096) {
                                        this.H = new ArrayList();
                                        c16 = (c6 == true ? 1 : 0) | 4096;
                                    }
                                    this.H.add(eVar.u(r.E, fVar));
                                    c6 = c16;
                                    z5 = true;
                                case 106:
                                    int i15 = (c6 == true ? 1 : 0) & 8192;
                                    char c17 = c6;
                                    if (i15 != 8192) {
                                        this.I = new ArrayList();
                                        c17 = (c6 == true ? 1 : 0) | 8192;
                                    }
                                    this.I.add(eVar.u(g.f25180w, fVar));
                                    c6 = c17;
                                    z5 = true;
                                case 128:
                                    int i16 = (c6 == true ? 1 : 0) & 16384;
                                    char c18 = c6;
                                    if (i16 != 16384) {
                                        this.J = new ArrayList();
                                        c18 = (c6 == true ? 1 : 0) | 16384;
                                    }
                                    this.J.add(Integer.valueOf(eVar.s()));
                                    c6 = c18;
                                    z5 = true;
                                case 130:
                                    int j7 = eVar.j(eVar.A());
                                    int i17 = (c6 == true ? 1 : 0) & 16384;
                                    char c19 = c6;
                                    if (i17 != 16384) {
                                        c19 = c6;
                                        if (eVar.e() > 0) {
                                            this.J = new ArrayList();
                                            c19 = (c6 == true ? 1 : 0) | 16384;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.J.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j7);
                                    c6 = c19;
                                    z5 = true;
                                case SyslogAppender.LOG_LOCAL1 /* 136 */:
                                    this.f25125r |= 8;
                                    this.L = eVar.s();
                                    c6 = c6;
                                    z5 = true;
                                case 146:
                                    q.c B0 = (this.f25125r & 16) == 16 ? this.M.B0() : null;
                                    q qVar = (q) eVar.u(q.J, fVar);
                                    this.M = qVar;
                                    if (B0 != null) {
                                        B0.j(qVar);
                                        this.M = B0.B();
                                    }
                                    this.f25125r |= 16;
                                    c6 = c6;
                                    z5 = true;
                                case SyslogAppender.LOG_LOCAL3 /* 152 */:
                                    this.f25125r |= 32;
                                    this.N = eVar.s();
                                    c6 = c6;
                                    z5 = true;
                                case 162:
                                    int i18 = (c6 == true ? 1 : 0) & 128;
                                    char c20 = c6;
                                    if (i18 != 128) {
                                        this.B = new ArrayList();
                                        c20 = (c6 == true ? 1 : 0) | 128;
                                    }
                                    this.B.add(eVar.u(q.J, fVar));
                                    c6 = c20;
                                    z5 = true;
                                case SyslogAppender.LOG_LOCAL5 /* 168 */:
                                    int i19 = (c6 == true ? 1 : 0) & 256;
                                    char c21 = c6;
                                    if (i19 != 256) {
                                        this.C = new ArrayList();
                                        c21 = (c6 == true ? 1 : 0) | 256;
                                    }
                                    this.C.add(Integer.valueOf(eVar.s()));
                                    c6 = c21;
                                    z5 = true;
                                case 170:
                                    int j8 = eVar.j(eVar.A());
                                    int i20 = (c6 == true ? 1 : 0) & 256;
                                    char c22 = c6;
                                    if (i20 != 256) {
                                        c22 = c6;
                                        if (eVar.e() > 0) {
                                            this.C = new ArrayList();
                                            c22 = (c6 == true ? 1 : 0) | 256;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.C.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j8);
                                    c6 = c22;
                                    z5 = true;
                                case SyslogAppender.LOG_LOCAL6 /* 176 */:
                                    int i21 = (c6 == true ? 1 : 0) & 262144;
                                    char c23 = c6;
                                    if (i21 != 262144) {
                                        this.O = new ArrayList();
                                        c23 = (c6 == true ? 1 : 0) | 0;
                                    }
                                    this.O.add(Integer.valueOf(eVar.s()));
                                    c6 = c23;
                                    z5 = true;
                                case 178:
                                    int j9 = eVar.j(eVar.A());
                                    int i22 = (c6 == true ? 1 : 0) & 262144;
                                    char c24 = c6;
                                    if (i22 != 262144) {
                                        c24 = c6;
                                        if (eVar.e() > 0) {
                                            this.O = new ArrayList();
                                            c24 = (c6 == true ? 1 : 0) | 0;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.O.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j9);
                                    c6 = c24;
                                    z5 = true;
                                case 186:
                                    int i23 = (c6 == true ? 1 : 0) & 524288;
                                    char c25 = c6;
                                    if (i23 != 524288) {
                                        this.Q = new ArrayList();
                                        c25 = (c6 == true ? 1 : 0) | 0;
                                    }
                                    this.Q.add(eVar.u(q.J, fVar));
                                    c6 = c25;
                                    z5 = true;
                                case 192:
                                    int i24 = (c6 == true ? 1 : 0) & 1048576;
                                    char c26 = c6;
                                    if (i24 != 1048576) {
                                        this.R = new ArrayList();
                                        c26 = (c6 == true ? 1 : 0) | 0;
                                    }
                                    this.R.add(Integer.valueOf(eVar.s()));
                                    c6 = c26;
                                    z5 = true;
                                case 194:
                                    int j10 = eVar.j(eVar.A());
                                    int i25 = (c6 == true ? 1 : 0) & 1048576;
                                    char c27 = c6;
                                    if (i25 != 1048576) {
                                        c27 = c6;
                                        if (eVar.e() > 0) {
                                            this.R = new ArrayList();
                                            c27 = (c6 == true ? 1 : 0) | 0;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.R.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j10);
                                    c6 = c27;
                                    z5 = true;
                                case 242:
                                    t.b H = (this.f25125r & 64) == 64 ? this.T.H() : null;
                                    t tVar = (t) eVar.u(t.f25374w, fVar);
                                    this.T = tVar;
                                    if (H != null) {
                                        H.j(tVar);
                                        this.T = H.q();
                                    }
                                    this.f25125r |= 64;
                                    c6 = c6;
                                    z5 = true;
                                case 248:
                                    int i26 = (c6 == true ? 1 : 0) & 4194304;
                                    char c28 = c6;
                                    if (i26 != 4194304) {
                                        this.U = new ArrayList();
                                        c28 = (c6 == true ? 1 : 0) | 0;
                                    }
                                    this.U.add(Integer.valueOf(eVar.s()));
                                    c6 = c28;
                                    z5 = true;
                                case o.f.f9513c /* 250 */:
                                    int j11 = eVar.j(eVar.A());
                                    int i27 = (c6 == true ? 1 : 0) & 4194304;
                                    char c29 = c6;
                                    if (i27 != 4194304) {
                                        c29 = c6;
                                        if (eVar.e() > 0) {
                                            this.U = new ArrayList();
                                            c29 = (c6 == true ? 1 : 0) | 0;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.U.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j11);
                                    c6 = c29;
                                    z5 = true;
                                case 258:
                                    w.b C = (this.f25125r & 128) == 128 ? this.V.C() : null;
                                    w wVar = (w) eVar.u(w.f25420u, fVar);
                                    this.V = wVar;
                                    if (C != null) {
                                        C.j(wVar);
                                        this.V = C.q();
                                    }
                                    this.f25125r |= 128;
                                    c6 = c6;
                                    z5 = true;
                                default:
                                    z5 = true;
                                    c6 = j(eVar, J, fVar, K) ? c6 : c6;
                                    z6 = z5;
                            }
                        } catch (InvalidProtocolBufferException e6) {
                            throw e6.i(this);
                        }
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if (((c6 == true ? 1 : 0) & 32) == 32) {
                        this.f25131x = Collections.unmodifiableList(this.f25131x);
                    }
                    if (((c6 == true ? 1 : 0) & 8) == 8) {
                        this.f25129v = Collections.unmodifiableList(this.f25129v);
                    }
                    if (((c6 == true ? 1 : 0) & 16) == 16) {
                        this.f25130w = Collections.unmodifiableList(this.f25130w);
                    }
                    if (((c6 == true ? 1 : 0) & 64) == 64) {
                        this.f25133z = Collections.unmodifiableList(this.f25133z);
                    }
                    if (((c6 == true ? 1 : 0) & 512) == 512) {
                        this.E = Collections.unmodifiableList(this.E);
                    }
                    if (((c6 == true ? 1 : 0) & 1024) == 1024) {
                        this.F = Collections.unmodifiableList(this.F);
                    }
                    if (((c6 == true ? 1 : 0) & 2048) == 2048) {
                        this.G = Collections.unmodifiableList(this.G);
                    }
                    if (((c6 == true ? 1 : 0) & 4096) == 4096) {
                        this.H = Collections.unmodifiableList(this.H);
                    }
                    if (((c6 == true ? 1 : 0) & 8192) == 8192) {
                        this.I = Collections.unmodifiableList(this.I);
                    }
                    if (((c6 == true ? 1 : 0) & 16384) == 16384) {
                        this.J = Collections.unmodifiableList(this.J);
                    }
                    if (((c6 == true ? 1 : 0) & 128) == 128) {
                        this.B = Collections.unmodifiableList(this.B);
                    }
                    if (((c6 == true ? 1 : 0) & 256) == 256) {
                        this.C = Collections.unmodifiableList(this.C);
                    }
                    if (((c6 == true ? 1 : 0) & 262144) == 262144) {
                        this.O = Collections.unmodifiableList(this.O);
                    }
                    if (((c6 == true ? 1 : 0) & 524288) == 524288) {
                        this.Q = Collections.unmodifiableList(this.Q);
                    }
                    if (((c6 == true ? 1 : 0) & 1048576) == 1048576) {
                        this.R = Collections.unmodifiableList(this.R);
                    }
                    if (((c6 == true ? 1 : 0) & 4194304) == 4194304) {
                        this.U = Collections.unmodifiableList(this.U);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f25124q = x5.e();
                        throw th2;
                    }
                    this.f25124q = x5.e();
                    g();
                    throw th;
                }
            }
            if (((c6 == true ? 1 : 0) & 32) == 32) {
                this.f25131x = Collections.unmodifiableList(this.f25131x);
            }
            if (((c6 == true ? 1 : 0) & 8) == 8) {
                this.f25129v = Collections.unmodifiableList(this.f25129v);
            }
            if (((c6 == true ? 1 : 0) & 16) == 16) {
                this.f25130w = Collections.unmodifiableList(this.f25130w);
            }
            if (((c6 == true ? 1 : 0) & 64) == 64) {
                this.f25133z = Collections.unmodifiableList(this.f25133z);
            }
            if (((c6 == true ? 1 : 0) & 512) == 512) {
                this.E = Collections.unmodifiableList(this.E);
            }
            if (((c6 == true ? 1 : 0) & 1024) == 1024) {
                this.F = Collections.unmodifiableList(this.F);
            }
            if (((c6 == true ? 1 : 0) & 2048) == 2048) {
                this.G = Collections.unmodifiableList(this.G);
            }
            if (((c6 == true ? 1 : 0) & 4096) == 4096) {
                this.H = Collections.unmodifiableList(this.H);
            }
            if (((c6 == true ? 1 : 0) & 8192) == 8192) {
                this.I = Collections.unmodifiableList(this.I);
            }
            if (((c6 == true ? 1 : 0) & 16384) == 16384) {
                this.J = Collections.unmodifiableList(this.J);
            }
            if (((c6 == true ? 1 : 0) & 128) == 128) {
                this.B = Collections.unmodifiableList(this.B);
            }
            if (((c6 == true ? 1 : 0) & 256) == 256) {
                this.C = Collections.unmodifiableList(this.C);
            }
            if (((c6 == true ? 1 : 0) & 262144) == 262144) {
                this.O = Collections.unmodifiableList(this.O);
            }
            if (((c6 == true ? 1 : 0) & 524288) == 524288) {
                this.Q = Collections.unmodifiableList(this.Q);
            }
            if (((c6 == true ? 1 : 0) & 1048576) == 1048576) {
                this.R = Collections.unmodifiableList(this.R);
            }
            if (((c6 == true ? 1 : 0) & 4194304) == 4194304) {
                this.U = Collections.unmodifiableList(this.U);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25124q = x5.e();
                throw th3;
            }
            this.f25124q = x5.e();
            g();
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class d extends h.d<d> implements kotlin.reflect.jvm.internal.impl.metadata.f {

        /* renamed from: x, reason: collision with root package name */
        private static final d f25143x;

        /* renamed from: y, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<d> f25144y = new C0317a();

        /* renamed from: q, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25145q;

        /* renamed from: r, reason: collision with root package name */
        private int f25146r;

        /* renamed from: s, reason: collision with root package name */
        private int f25147s;

        /* renamed from: t, reason: collision with root package name */
        private List<u> f25148t;

        /* renamed from: u, reason: collision with root package name */
        private List<Integer> f25149u;

        /* renamed from: v, reason: collision with root package name */
        private byte f25150v;

        /* renamed from: w, reason: collision with root package name */
        private int f25151w;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$d$a, reason: collision with other inner class name */
        static class C0317a extends kotlin.reflect.jvm.internal.impl.protobuf.b<d> {
            C0317a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public d b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new d(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<d, b> implements kotlin.reflect.jvm.internal.impl.metadata.f {

            /* renamed from: r, reason: collision with root package name */
            private int f25152r;

            /* renamed from: s, reason: collision with root package name */
            private int f25153s = 6;

            /* renamed from: t, reason: collision with root package name */
            private List<u> f25154t = Collections.emptyList();

            /* renamed from: u, reason: collision with root package name */
            private List<Integer> f25155u = Collections.emptyList();

            private b() {
            }

            private static b D() {
                return new b();
            }

            private void E() {
                if ((this.f25152r & 2) != 2) {
                    this.f25154t = new ArrayList(this.f25154t);
                    this.f25152r |= 2;
                }
            }

            private void F() {
                if ((this.f25152r & 4) != 4) {
                    this.f25155u = new ArrayList(this.f25155u);
                    this.f25152r |= 4;
                }
            }

            private void K() {
            }

            static b y() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public d build() {
                d B = B();
                if (B.l()) {
                    return B;
                }
                throw new UninitializedMessageException(B);
            }

            public d B() {
                d dVar = new d(this);
                int i5 = (this.f25152r & 1) != 1 ? 0 : 1;
                dVar.f25147s = this.f25153s;
                if ((this.f25152r & 2) == 2) {
                    this.f25154t = Collections.unmodifiableList(this.f25154t);
                    this.f25152r &= -3;
                }
                dVar.f25148t = this.f25154t;
                if ((this.f25152r & 4) == 4) {
                    this.f25155u = Collections.unmodifiableList(this.f25155u);
                    this.f25152r &= -5;
                }
                dVar.f25149u = this.f25155u;
                dVar.f25146r = i5;
                return dVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(B());
            }

            public d G() {
                return d.H();
            }

            public u I(int i5) {
                return this.f25154t.get(i5);
            }

            public int J() {
                return this.f25154t.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: L, reason: merged with bridge method [inline-methods] */
            public b j(d dVar) {
                if (dVar == d.H()) {
                    return this;
                }
                if (dVar.O()) {
                    N(dVar.J());
                }
                if (!dVar.f25148t.isEmpty()) {
                    if (this.f25154t.isEmpty()) {
                        this.f25154t = dVar.f25148t;
                        this.f25152r &= -3;
                    } else {
                        E();
                        this.f25154t.addAll(dVar.f25148t);
                    }
                }
                if (!dVar.f25149u.isEmpty()) {
                    if (this.f25155u.isEmpty()) {
                        this.f25155u = dVar.f25149u;
                        this.f25152r &= -5;
                    } else {
                        F();
                        this.f25155u.addAll(dVar.f25149u);
                    }
                }
                w(dVar);
                k(i().f(dVar.f25145q));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: M, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.d.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$d> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.d.f25144y     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$d r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.d) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$d r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.d) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.d.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$d$b");
            }

            public b N(int i5) {
                this.f25152r |= 1;
                this.f25153s = i5;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public kotlin.reflect.jvm.internal.impl.protobuf.h m() {
                return d.H();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                for (int i5 = 0; i5 < J(); i5++) {
                    if (!I(i5).l()) {
                        return false;
                    }
                }
                return v();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return d.H();
            }
        }

        static {
            d dVar = new d(true);
            f25143x = dVar;
            dVar.P();
        }

        public static d H() {
            return f25143x;
        }

        private void P() {
            this.f25147s = 6;
            this.f25148t = Collections.emptyList();
            this.f25149u = Collections.emptyList();
        }

        public static b Q() {
            return b.y();
        }

        public static b R(d dVar) {
            return b.y().j(dVar);
        }

        public d I() {
            return f25143x;
        }

        public int J() {
            return this.f25147s;
        }

        public u K(int i5) {
            return this.f25148t.get(i5);
        }

        public int L() {
            return this.f25148t.size();
        }

        public List<u> M() {
            return this.f25148t;
        }

        public List<Integer> N() {
            return this.f25149u;
        }

        public boolean O() {
            return (this.f25146r & 1) == 1;
        }

        public b S() {
            return b.y();
        }

        public b T() {
            return R(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            h.d<MessageType>.a w5 = w();
            if ((this.f25146r & 1) == 1) {
                codedOutputStream.a0(1, this.f25147s);
            }
            for (int i5 = 0; i5 < this.f25148t.size(); i5++) {
                codedOutputStream.d0(2, this.f25148t.get(i5));
            }
            for (int i6 = 0; i6 < this.f25149u.size(); i6++) {
                codedOutputStream.a0(31, this.f25149u.get(i6).intValue());
            }
            w5.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f25145q);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.f25150v;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            for (int i5 = 0; i5 < L(); i5++) {
                if (!K(i5).l()) {
                    this.f25150v = (byte) 0;
                    return false;
                }
            }
            if (p()) {
                this.f25150v = (byte) 1;
                return true;
            }
            this.f25150v = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return f25143x;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return R(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.f25151w;
            if (i5 != -1) {
                return i5;
            }
            int o5 = (this.f25146r & 1) == 1 ? CodedOutputStream.o(1, this.f25147s) + 0 : 0;
            for (int i6 = 0; i6 < this.f25148t.size(); i6++) {
                o5 += CodedOutputStream.s(2, this.f25148t.get(i6));
            }
            int i7 = 0;
            for (int i8 = 0; i8 < this.f25149u.size(); i8++) {
                i7 += CodedOutputStream.p(this.f25149u.get(i8).intValue());
            }
            int size = this.f25145q.size() + (this.f25149u.size() * 2) + o5 + i7 + q();
            this.f25151w = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.y();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<d> z() {
            return f25144y;
        }

        private d(h.c<d, ?> cVar) {
            super(cVar);
            this.f25150v = (byte) -1;
            this.f25151w = -1;
            this.f25145q = cVar.i();
        }

        private d(boolean z5) {
            this.f25150v = (byte) -1;
            this.f25151w = -1;
            this.f25145q = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f25150v = (byte) -1;
            this.f25151w = -1;
            P();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            int i5 = 0;
            while (!z5) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K == 8) {
                                    this.f25146r |= 1;
                                    this.f25147s = eVar.A();
                                } else if (K == 18) {
                                    if ((i5 & 2) != 2) {
                                        this.f25148t = new ArrayList();
                                        i5 |= 2;
                                    }
                                    this.f25148t.add(eVar.u(u.B, fVar));
                                } else if (K == 248) {
                                    if ((i5 & 4) != 4) {
                                        this.f25149u = new ArrayList();
                                        i5 |= 4;
                                    }
                                    this.f25149u.add(Integer.valueOf(eVar.A()));
                                } else if (K != 250) {
                                    if (!j(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    int j5 = eVar.j(eVar.A());
                                    if ((i5 & 4) != 4 && eVar.e() > 0) {
                                        this.f25149u = new ArrayList();
                                        i5 |= 4;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f25149u.add(Integer.valueOf(eVar.A()));
                                    }
                                    eVar.i(j5);
                                }
                            }
                            z5 = true;
                        } catch (InvalidProtocolBufferException e6) {
                            throw e6.i(this);
                        }
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if ((i5 & 2) == 2) {
                        this.f25148t = Collections.unmodifiableList(this.f25148t);
                    }
                    if ((i5 & 4) == 4) {
                        this.f25149u = Collections.unmodifiableList(this.f25149u);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f25145q = x5.e();
                        throw th2;
                    }
                    this.f25145q = x5.e();
                    g();
                    throw th;
                }
            }
            if ((i5 & 2) == 2) {
                this.f25148t = Collections.unmodifiableList(this.f25148t);
            }
            if ((i5 & 4) == 4) {
                this.f25149u = Collections.unmodifiableList(this.f25149u);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25145q = x5.e();
                throw th3;
            }
            this.f25145q = x5.e();
            g();
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class e extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.g {

        /* renamed from: t, reason: collision with root package name */
        private static final e f25156t;

        /* renamed from: u, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<e> f25157u = new C0318a();

        /* renamed from: p, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25158p;

        /* renamed from: q, reason: collision with root package name */
        private List<f> f25159q;

        /* renamed from: r, reason: collision with root package name */
        private byte f25160r;

        /* renamed from: s, reason: collision with root package name */
        private int f25161s;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$e$a, reason: collision with other inner class name */
        static class C0318a extends kotlin.reflect.jvm.internal.impl.protobuf.b<e> {
            C0318a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public e b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new e(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.b<e, b> implements kotlin.reflect.jvm.internal.impl.metadata.g {

            /* renamed from: p, reason: collision with root package name */
            private int f25162p;

            /* renamed from: q, reason: collision with root package name */
            private List<f> f25163q = Collections.emptyList();

            private b() {
            }

            private void C() {
            }

            static b o() {
                return new b();
            }

            private static b v() {
                return new b();
            }

            private void w() {
                if ((this.f25162p & 1) != 1) {
                    this.f25163q = new ArrayList(this.f25163q);
                    this.f25162p |= 1;
                }
            }

            public f A(int i5) {
                return this.f25163q.get(i5);
            }

            public int B() {
                return this.f25163q.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            public b j(e eVar) {
                if (eVar == e.r()) {
                    return this;
                }
                if (!eVar.f25159q.isEmpty()) {
                    if (this.f25163q.isEmpty()) {
                        this.f25163q = eVar.f25159q;
                        this.f25162p &= -2;
                    } else {
                        w();
                        this.f25163q.addAll(eVar.f25159q);
                    }
                }
                k(i().f(eVar.f25158p));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.e.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$e> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.e.f25157u     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$e r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.e) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$e r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.e) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.e.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$e$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public e m() {
                return e.r();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                for (int i5 = 0; i5 < B(); i5++) {
                    if (!A(i5).l()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return e.r();
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
                if ((this.f25162p & 1) == 1) {
                    this.f25163q = Collections.unmodifiableList(this.f25163q);
                    this.f25162p &= -2;
                }
                eVar.f25159q = this.f25163q;
                return eVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(q());
            }

            public e y() {
                return e.r();
            }
        }

        static {
            e eVar = new e(true);
            f25156t = eVar;
            eVar.w();
        }

        public static b A(e eVar) {
            return b.o().j(eVar);
        }

        public static e r() {
            return f25156t;
        }

        private void w() {
            this.f25159q = Collections.emptyList();
        }

        public static b y() {
            return b.o();
        }

        public b B() {
            return b.o();
        }

        public b C() {
            return A(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            for (int i5 = 0; i5 < this.f25159q.size(); i5++) {
                codedOutputStream.d0(1, this.f25159q.get(i5));
            }
            codedOutputStream.i0(this.f25158p);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.f25160r;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            for (int i5 = 0; i5 < v(); i5++) {
                if (!t(i5).l()) {
                    this.f25160r = (byte) 0;
                    return false;
                }
            }
            this.f25160r = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return f25156t;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return A(this);
        }

        public e s() {
            return f25156t;
        }

        public f t(int i5) {
            return this.f25159q.get(i5);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.f25161s;
            if (i5 != -1) {
                return i5;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < this.f25159q.size(); i7++) {
                i6 += CodedOutputStream.s(1, this.f25159q.get(i7));
            }
            int size = this.f25158p.size() + i6;
            this.f25161s = size;
            return size;
        }

        public int v() {
            return this.f25159q.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.o();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<e> z() {
            return f25157u;
        }

        private e(h.b bVar) {
            super(bVar);
            this.f25160r = (byte) -1;
            this.f25161s = -1;
            this.f25158p = bVar.i();
        }

        private e(boolean z5) {
            this.f25160r = (byte) -1;
            this.f25161s = -1;
            this.f25158p = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private e(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f25160r = (byte) -1;
            this.f25161s = -1;
            w();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            boolean z6 = false;
            while (!z5) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K != 10) {
                                if (!eVar.P(K, J)) {
                                }
                            } else {
                                if (!(z6 & true)) {
                                    this.f25159q = new ArrayList();
                                    z6 |= true;
                                }
                                this.f25159q.add(eVar.u(f.f25165y, fVar));
                            }
                        }
                        z5 = true;
                    } catch (InvalidProtocolBufferException e6) {
                        throw e6.i(this);
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if (z6 & true) {
                        this.f25159q = Collections.unmodifiableList(this.f25159q);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f25158p = x5.e();
                        throw th2;
                    }
                    this.f25158p = x5.e();
                    throw th;
                }
            }
            if (z6 & true) {
                this.f25159q = Collections.unmodifiableList(this.f25159q);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25158p = x5.e();
                throw th3;
            }
            this.f25158p = x5.e();
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class f extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.h {

        /* renamed from: x, reason: collision with root package name */
        private static final f f25164x;

        /* renamed from: y, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<f> f25165y = new C0319a();

        /* renamed from: p, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25166p;

        /* renamed from: q, reason: collision with root package name */
        private int f25167q;

        /* renamed from: r, reason: collision with root package name */
        private c f25168r;

        /* renamed from: s, reason: collision with root package name */
        private List<h> f25169s;

        /* renamed from: t, reason: collision with root package name */
        private h f25170t;

        /* renamed from: u, reason: collision with root package name */
        private d f25171u;

        /* renamed from: v, reason: collision with root package name */
        private byte f25172v;

        /* renamed from: w, reason: collision with root package name */
        private int f25173w;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$f$a, reason: collision with other inner class name */
        static class C0319a extends kotlin.reflect.jvm.internal.impl.protobuf.b<f> {
            C0319a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public f b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new f(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.b<f, b> implements kotlin.reflect.jvm.internal.impl.metadata.h {

            /* renamed from: p, reason: collision with root package name */
            private int f25174p;

            /* renamed from: q, reason: collision with root package name */
            private c f25175q = c.RETURNS_CONSTANT;

            /* renamed from: r, reason: collision with root package name */
            private List<h> f25176r = Collections.emptyList();

            /* renamed from: s, reason: collision with root package name */
            private h f25177s = h.F();

            /* renamed from: t, reason: collision with root package name */
            private d f25178t = d.AT_MOST_ONCE;

            private b() {
            }

            private void E() {
            }

            static b o() {
                return new b();
            }

            private static b v() {
                return new b();
            }

            private void w() {
                if ((this.f25174p & 2) != 2) {
                    this.f25176r = new ArrayList(this.f25176r);
                    this.f25174p |= 2;
                }
            }

            public f A() {
                return f.y();
            }

            public h B(int i5) {
                return this.f25176r.get(i5);
            }

            public int C() {
                return this.f25176r.size();
            }

            public boolean D() {
                return (this.f25174p & 4) == 4;
            }

            public b F(h hVar) {
                if ((this.f25174p & 4) != 4 || this.f25177s == h.F()) {
                    this.f25177s = hVar;
                } else {
                    this.f25177s = h.U(this.f25177s).j(hVar).q();
                }
                this.f25174p |= 4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: G, reason: merged with bridge method [inline-methods] */
            public b j(f fVar) {
                if (fVar == f.y()) {
                    return this;
                }
                if (fVar.G()) {
                    J(fVar.D());
                }
                if (!fVar.f25169s.isEmpty()) {
                    if (this.f25176r.isEmpty()) {
                        this.f25176r = fVar.f25169s;
                        this.f25174p &= -3;
                    } else {
                        w();
                        this.f25176r.addAll(fVar.f25169s);
                    }
                }
                if (fVar.F()) {
                    F(fVar.w());
                }
                if (fVar.H()) {
                    K(fVar.E());
                }
                k(i().f(fVar.f25166p));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: I, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.f.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$f> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.f.f25165y     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$f r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.f) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$f r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.f) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.f.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$f$b");
            }

            public b J(c cVar) {
                cVar.getClass();
                this.f25174p |= 1;
                this.f25175q = cVar;
                return this;
            }

            public b K(d dVar) {
                dVar.getClass();
                this.f25174p |= 8;
                this.f25178t = dVar;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public f m() {
                return f.y();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                for (int i5 = 0; i5 < C(); i5++) {
                    if (!B(i5).l()) {
                        return false;
                    }
                }
                return !D() || this.f25177s.l();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return f.y();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public f build() {
                f q5 = q();
                if (q5.l()) {
                    return q5;
                }
                throw new UninitializedMessageException(q5);
            }

            public f q() {
                f fVar = new f(this);
                int i5 = this.f25174p;
                int i6 = (i5 & 1) != 1 ? 0 : 1;
                fVar.f25168r = this.f25175q;
                if ((this.f25174p & 2) == 2) {
                    this.f25176r = Collections.unmodifiableList(this.f25176r);
                    this.f25174p &= -3;
                }
                fVar.f25169s = this.f25176r;
                if ((i5 & 4) == 4) {
                    i6 |= 2;
                }
                fVar.f25170t = this.f25177s;
                if ((i5 & 8) == 8) {
                    i6 |= 4;
                }
                fVar.f25171u = this.f25178t;
                fVar.f25167q = i6;
                return fVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(q());
            }

            public h y() {
                return this.f25177s;
            }
        }

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes5.dex */
        public enum c implements i.a {
            RETURNS_CONSTANT(0, 0),
            CALLS(1, 1),
            RETURNS_NOT_NULL(2, 2);

            private static i.b<c> internalValueMap = new C0320a();
            private final int value;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$f$c$a, reason: collision with other inner class name */
            static class C0320a implements i.b<c> {
                C0320a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                public c a(int i5) {
                    return c.valueOf(i5);
                }

                public c b(int i5) {
                    return c.valueOf(i5);
                }
            }

            c(int i5, int i6) {
                this.value = i6;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.value;
            }

            public static c valueOf(int i5) {
                if (i5 == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i5 == 1) {
                    return CALLS;
                }
                if (i5 != 2) {
                    return null;
                }
                return RETURNS_NOT_NULL;
            }
        }

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes5.dex */
        public enum d implements i.a {
            AT_MOST_ONCE(0, 0),
            EXACTLY_ONCE(1, 1),
            AT_LEAST_ONCE(2, 2);

            private static i.b<d> internalValueMap = new C0321a();
            private final int value;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$f$d$a, reason: collision with other inner class name */
            static class C0321a implements i.b<d> {
                C0321a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                public d a(int i5) {
                    return d.valueOf(i5);
                }

                public d b(int i5) {
                    return d.valueOf(i5);
                }
            }

            d(int i5, int i6) {
                this.value = i6;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.value;
            }

            public static d valueOf(int i5) {
                if (i5 == 0) {
                    return AT_MOST_ONCE;
                }
                if (i5 == 1) {
                    return EXACTLY_ONCE;
                }
                if (i5 != 2) {
                    return null;
                }
                return AT_LEAST_ONCE;
            }
        }

        static {
            f fVar = new f(true);
            f25164x = fVar;
            fVar.I();
        }

        private void I() {
            this.f25168r = c.RETURNS_CONSTANT;
            this.f25169s = Collections.emptyList();
            this.f25170t = h.F();
            this.f25171u = d.AT_MOST_ONCE;
        }

        public static b J() {
            return b.o();
        }

        public static b K(f fVar) {
            return b.o().j(fVar);
        }

        public static f y() {
            return f25164x;
        }

        public f A() {
            return f25164x;
        }

        public h B(int i5) {
            return this.f25169s.get(i5);
        }

        public int C() {
            return this.f25169s.size();
        }

        public c D() {
            return this.f25168r;
        }

        public d E() {
            return this.f25171u;
        }

        public boolean F() {
            return (this.f25167q & 2) == 2;
        }

        public boolean G() {
            return (this.f25167q & 1) == 1;
        }

        public boolean H() {
            return (this.f25167q & 4) == 4;
        }

        public b L() {
            return b.o();
        }

        public b M() {
            return K(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            if ((this.f25167q & 1) == 1) {
                codedOutputStream.S(1, this.f25168r.getNumber());
            }
            for (int i5 = 0; i5 < this.f25169s.size(); i5++) {
                codedOutputStream.d0(2, this.f25169s.get(i5));
            }
            if ((this.f25167q & 2) == 2) {
                codedOutputStream.d0(3, this.f25170t);
            }
            if ((this.f25167q & 4) == 4) {
                codedOutputStream.S(4, this.f25171u.getNumber());
            }
            codedOutputStream.i0(this.f25166p);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.f25172v;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            for (int i5 = 0; i5 < C(); i5++) {
                if (!B(i5).l()) {
                    this.f25172v = (byte) 0;
                    return false;
                }
            }
            if (!F() || this.f25170t.l()) {
                this.f25172v = (byte) 1;
                return true;
            }
            this.f25172v = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return f25164x;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return K(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.f25173w;
            if (i5 != -1) {
                return i5;
            }
            int h5 = (this.f25167q & 1) == 1 ? CodedOutputStream.h(1, this.f25168r.getNumber()) + 0 : 0;
            for (int i6 = 0; i6 < this.f25169s.size(); i6++) {
                h5 += CodedOutputStream.s(2, this.f25169s.get(i6));
            }
            if ((this.f25167q & 2) == 2) {
                h5 += CodedOutputStream.s(3, this.f25170t);
            }
            if ((this.f25167q & 4) == 4) {
                h5 += CodedOutputStream.h(4, this.f25171u.getNumber());
            }
            int size = this.f25166p.size() + h5;
            this.f25173w = size;
            return size;
        }

        public h w() {
            return this.f25170t;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.o();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<f> z() {
            return f25165y;
        }

        private f(h.b bVar) {
            super(bVar);
            this.f25172v = (byte) -1;
            this.f25173w = -1;
            this.f25166p = bVar.i();
        }

        private f(boolean z5) {
            this.f25172v = (byte) -1;
            this.f25173w = -1;
            this.f25166p = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            h.b bVar;
            this.f25172v = (byte) -1;
            this.f25173w = -1;
            I();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            int i5 = 0;
            while (!z5) {
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
                                        this.f25167q |= 1;
                                        this.f25168r = valueOf;
                                    }
                                } else if (K == 18) {
                                    if ((i5 & 2) != 2) {
                                        this.f25169s = new ArrayList();
                                        i5 |= 2;
                                    }
                                    this.f25169s.add(eVar.u(h.B, fVar));
                                } else if (K == 26) {
                                    if ((this.f25167q & 2) == 2) {
                                        h hVar = this.f25170t;
                                        hVar.getClass();
                                        bVar = h.U(hVar);
                                    } else {
                                        bVar = null;
                                    }
                                    h hVar2 = (h) eVar.u(h.B, fVar);
                                    this.f25170t = hVar2;
                                    if (bVar != null) {
                                        bVar.j(hVar2);
                                        this.f25170t = bVar.q();
                                    }
                                    this.f25167q |= 2;
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
                                        this.f25167q |= 4;
                                        this.f25171u = valueOf2;
                                    }
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
                    if ((i5 & 2) == 2) {
                        this.f25169s = Collections.unmodifiableList(this.f25169s);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f25166p = x5.e();
                        throw th2;
                    }
                    this.f25166p = x5.e();
                    throw th;
                }
            }
            if ((i5 & 2) == 2) {
                this.f25169s = Collections.unmodifiableList(this.f25169s);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25166p = x5.e();
                throw th3;
            }
            this.f25166p = x5.e();
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class g extends h.d<g> implements kotlin.reflect.jvm.internal.impl.metadata.i {

        /* renamed from: v, reason: collision with root package name */
        private static final g f25179v;

        /* renamed from: w, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<g> f25180w = new C0322a();

        /* renamed from: q, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25181q;

        /* renamed from: r, reason: collision with root package name */
        private int f25182r;

        /* renamed from: s, reason: collision with root package name */
        private int f25183s;

        /* renamed from: t, reason: collision with root package name */
        private byte f25184t;

        /* renamed from: u, reason: collision with root package name */
        private int f25185u;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$g$a, reason: collision with other inner class name */
        static class C0322a extends kotlin.reflect.jvm.internal.impl.protobuf.b<g> {
            C0322a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public g b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new g(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<g, b> implements kotlin.reflect.jvm.internal.impl.metadata.i {

            /* renamed from: r, reason: collision with root package name */
            private int f25186r;

            /* renamed from: s, reason: collision with root package name */
            private int f25187s;

            private b() {
            }

            private static b D() {
                return new b();
            }

            private void F() {
            }

            static b y() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public g build() {
                g B = B();
                if (B.l()) {
                    return B;
                }
                throw new UninitializedMessageException(B);
            }

            public g B() {
                g gVar = new g(this);
                int i5 = (this.f25186r & 1) != 1 ? 0 : 1;
                gVar.f25183s = this.f25187s;
                gVar.f25182r = i5;
                return gVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(B());
            }

            public g E() {
                return g.D();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: G, reason: merged with bridge method [inline-methods] */
            public b j(g gVar) {
                if (gVar == g.D()) {
                    return this;
                }
                if (gVar.G()) {
                    J(gVar.F());
                }
                w(gVar);
                k(i().f(gVar.f25181q));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: I, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.g.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$g> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.g.f25180w     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$g r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.g) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$g r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.g) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.g.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$g$b");
            }

            public b J(int i5) {
                this.f25186r |= 1;
                this.f25187s = i5;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public kotlin.reflect.jvm.internal.impl.protobuf.h m() {
                return g.D();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                return v();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return g.D();
            }
        }

        static {
            g gVar = new g(true);
            f25179v = gVar;
            gVar.f25183s = 0;
        }

        public static g D() {
            return f25179v;
        }

        private void H() {
            this.f25183s = 0;
        }

        public static b I() {
            return b.y();
        }

        public static b J(g gVar) {
            return b.y().j(gVar);
        }

        public g E() {
            return f25179v;
        }

        public int F() {
            return this.f25183s;
        }

        public boolean G() {
            return (this.f25182r & 1) == 1;
        }

        public b K() {
            return b.y();
        }

        public b L() {
            return J(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            h.d<MessageType>.a w5 = w();
            if ((this.f25182r & 1) == 1) {
                codedOutputStream.a0(1, this.f25183s);
            }
            w5.a(o.f.f9512b, codedOutputStream);
            codedOutputStream.i0(this.f25181q);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.f25184t;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            if (p()) {
                this.f25184t = (byte) 1;
                return true;
            }
            this.f25184t = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return f25179v;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return J(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.f25185u;
            if (i5 != -1) {
                return i5;
            }
            int size = this.f25181q.size() + ((this.f25182r & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f25183s) : 0) + q();
            this.f25185u = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.y();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<g> z() {
            return f25180w;
        }

        private g(h.c<g, ?> cVar) {
            super(cVar);
            this.f25184t = (byte) -1;
            this.f25185u = -1;
            this.f25181q = cVar.i();
        }

        private g(boolean z5) {
            this.f25184t = (byte) -1;
            this.f25185u = -1;
            this.f25181q = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        private g(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f25184t = (byte) -1;
            this.f25185u = -1;
            boolean z5 = false;
            this.f25183s = 0;
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            while (!z5) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K != 8) {
                                if (!j(eVar, J, fVar, K)) {
                                }
                            } else {
                                this.f25182r |= 1;
                                this.f25183s = eVar.A();
                            }
                        }
                        z5 = true;
                    } catch (Throwable th) {
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f25181q = x5.e();
                            throw th2;
                        }
                        this.f25181q = x5.e();
                        g();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e6) {
                    throw e6.i(this);
                } catch (IOException e7) {
                    throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25181q = x5.e();
                throw th3;
            }
            this.f25181q = x5.e();
            g();
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class h extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.j {
        private static final h A;
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<h> B = new C0323a();

        /* renamed from: p, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25188p;

        /* renamed from: q, reason: collision with root package name */
        private int f25189q;

        /* renamed from: r, reason: collision with root package name */
        private int f25190r;

        /* renamed from: s, reason: collision with root package name */
        private int f25191s;

        /* renamed from: t, reason: collision with root package name */
        private c f25192t;

        /* renamed from: u, reason: collision with root package name */
        private q f25193u;

        /* renamed from: v, reason: collision with root package name */
        private int f25194v;

        /* renamed from: w, reason: collision with root package name */
        private List<h> f25195w;

        /* renamed from: x, reason: collision with root package name */
        private List<h> f25196x;

        /* renamed from: y, reason: collision with root package name */
        private byte f25197y;

        /* renamed from: z, reason: collision with root package name */
        private int f25198z;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$h$a, reason: collision with other inner class name */
        static class C0323a extends kotlin.reflect.jvm.internal.impl.protobuf.b<h> {
            C0323a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public h b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new h(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.b<h, b> implements kotlin.reflect.jvm.internal.impl.metadata.j {

            /* renamed from: p, reason: collision with root package name */
            private int f25199p;

            /* renamed from: q, reason: collision with root package name */
            private int f25200q;

            /* renamed from: r, reason: collision with root package name */
            private int f25201r;

            /* renamed from: u, reason: collision with root package name */
            private int f25204u;

            /* renamed from: s, reason: collision with root package name */
            private c f25202s = c.TRUE;

            /* renamed from: t, reason: collision with root package name */
            private q f25203t = q.X();

            /* renamed from: v, reason: collision with root package name */
            private List<h> f25205v = Collections.emptyList();

            /* renamed from: w, reason: collision with root package name */
            private List<h> f25206w = Collections.emptyList();

            private b() {
            }

            private void I() {
            }

            static b o() {
                return new b();
            }

            private static b v() {
                return new b();
            }

            private void w() {
                if ((this.f25199p & 32) != 32) {
                    this.f25205v = new ArrayList(this.f25205v);
                    this.f25199p |= 32;
                }
            }

            private void y() {
                if ((this.f25199p & 64) != 64) {
                    this.f25206w = new ArrayList(this.f25206w);
                    this.f25199p |= 64;
                }
            }

            public h A(int i5) {
                return this.f25205v.get(i5);
            }

            public int B() {
                return this.f25205v.size();
            }

            public h C() {
                return h.F();
            }

            public q D() {
                return this.f25203t;
            }

            public h E(int i5) {
                return this.f25206w.get(i5);
            }

            public int F() {
                return this.f25206w.size();
            }

            public boolean G() {
                return (this.f25199p & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: J, reason: merged with bridge method [inline-methods] */
            public b j(h hVar) {
                if (hVar == h.F()) {
                    return this;
                }
                if (hVar.O()) {
                    N(hVar.H());
                }
                if (hVar.R()) {
                    S(hVar.M());
                }
                if (hVar.N()) {
                    M(hVar.E());
                }
                if (hVar.P()) {
                    L(hVar.I());
                }
                if (hVar.Q()) {
                    Q(hVar.J());
                }
                if (!hVar.f25195w.isEmpty()) {
                    if (this.f25205v.isEmpty()) {
                        this.f25205v = hVar.f25195w;
                        this.f25199p &= -33;
                    } else {
                        w();
                        this.f25205v.addAll(hVar.f25195w);
                    }
                }
                if (!hVar.f25196x.isEmpty()) {
                    if (this.f25206w.isEmpty()) {
                        this.f25206w = hVar.f25196x;
                        this.f25199p &= -65;
                    } else {
                        y();
                        this.f25206w.addAll(hVar.f25196x);
                    }
                }
                k(i().f(hVar.f25188p));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: K, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.h.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$h> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.h.B     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$h r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.h) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$h r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.h) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.h.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$h$b");
            }

            public b L(q qVar) {
                if ((this.f25199p & 8) != 8 || this.f25203t == q.X()) {
                    this.f25203t = qVar;
                } else {
                    this.f25203t = q.z0(this.f25203t).j(qVar).B();
                }
                this.f25199p |= 8;
                return this;
            }

            public b M(c cVar) {
                cVar.getClass();
                this.f25199p |= 4;
                this.f25202s = cVar;
                return this;
            }

            public b N(int i5) {
                this.f25199p |= 1;
                this.f25200q = i5;
                return this;
            }

            public b Q(int i5) {
                this.f25199p |= 16;
                this.f25204u = i5;
                return this;
            }

            public b S(int i5) {
                this.f25199p |= 2;
                this.f25201r = i5;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public h m() {
                return h.F();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                if (G() && !this.f25203t.l()) {
                    return false;
                }
                for (int i5 = 0; i5 < B(); i5++) {
                    if (!A(i5).l()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < F(); i6++) {
                    if (!E(i6).l()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return h.F();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public h build() {
                h q5 = q();
                if (q5.l()) {
                    return q5;
                }
                throw new UninitializedMessageException(q5);
            }

            public h q() {
                h hVar = new h(this);
                int i5 = this.f25199p;
                int i6 = (i5 & 1) != 1 ? 0 : 1;
                hVar.f25190r = this.f25200q;
                if ((i5 & 2) == 2) {
                    i6 |= 2;
                }
                hVar.f25191s = this.f25201r;
                if ((i5 & 4) == 4) {
                    i6 |= 4;
                }
                hVar.f25192t = this.f25202s;
                if ((i5 & 8) == 8) {
                    i6 |= 8;
                }
                hVar.f25193u = this.f25203t;
                if ((i5 & 16) == 16) {
                    i6 |= 16;
                }
                hVar.f25194v = this.f25204u;
                if ((this.f25199p & 32) == 32) {
                    this.f25205v = Collections.unmodifiableList(this.f25205v);
                    this.f25199p &= -33;
                }
                hVar.f25195w = this.f25205v;
                if ((this.f25199p & 64) == 64) {
                    this.f25206w = Collections.unmodifiableList(this.f25206w);
                    this.f25199p &= -65;
                }
                hVar.f25196x = this.f25206w;
                hVar.f25189q = i6;
                return hVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(q());
            }
        }

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes5.dex */
        public enum c implements i.a {
            TRUE(0, 0),
            FALSE(1, 1),
            NULL(2, 2);

            private static i.b<c> internalValueMap = new C0324a();
            private final int value;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$h$c$a, reason: collision with other inner class name */
            static class C0324a implements i.b<c> {
                C0324a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                public c a(int i5) {
                    return c.valueOf(i5);
                }

                public c b(int i5) {
                    return c.valueOf(i5);
                }
            }

            c(int i5, int i6) {
                this.value = i6;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.value;
            }

            public static c valueOf(int i5) {
                if (i5 == 0) {
                    return TRUE;
                }
                if (i5 == 1) {
                    return FALSE;
                }
                if (i5 != 2) {
                    return null;
                }
                return NULL;
            }
        }

        static {
            h hVar = new h(true);
            A = hVar;
            hVar.S();
        }

        public static h F() {
            return A;
        }

        private void S() {
            this.f25190r = 0;
            this.f25191s = 0;
            this.f25192t = c.TRUE;
            this.f25193u = q.X();
            this.f25194v = 0;
            this.f25195w = Collections.emptyList();
            this.f25196x = Collections.emptyList();
        }

        public static b T() {
            return b.o();
        }

        public static b U(h hVar) {
            return b.o().j(hVar);
        }

        public h C(int i5) {
            return this.f25195w.get(i5);
        }

        public int D() {
            return this.f25195w.size();
        }

        public c E() {
            return this.f25192t;
        }

        public h G() {
            return A;
        }

        public int H() {
            return this.f25190r;
        }

        public q I() {
            return this.f25193u;
        }

        public int J() {
            return this.f25194v;
        }

        public h K(int i5) {
            return this.f25196x.get(i5);
        }

        public int L() {
            return this.f25196x.size();
        }

        public int M() {
            return this.f25191s;
        }

        public boolean N() {
            return (this.f25189q & 4) == 4;
        }

        public boolean O() {
            return (this.f25189q & 1) == 1;
        }

        public boolean P() {
            return (this.f25189q & 8) == 8;
        }

        public boolean Q() {
            return (this.f25189q & 16) == 16;
        }

        public boolean R() {
            return (this.f25189q & 2) == 2;
        }

        public b V() {
            return b.o();
        }

        public b W() {
            return U(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            if ((this.f25189q & 1) == 1) {
                codedOutputStream.a0(1, this.f25190r);
            }
            if ((this.f25189q & 2) == 2) {
                codedOutputStream.a0(2, this.f25191s);
            }
            if ((this.f25189q & 4) == 4) {
                codedOutputStream.S(3, this.f25192t.getNumber());
            }
            if ((this.f25189q & 8) == 8) {
                codedOutputStream.d0(4, this.f25193u);
            }
            if ((this.f25189q & 16) == 16) {
                codedOutputStream.a0(5, this.f25194v);
            }
            for (int i5 = 0; i5 < this.f25195w.size(); i5++) {
                codedOutputStream.d0(6, this.f25195w.get(i5));
            }
            for (int i6 = 0; i6 < this.f25196x.size(); i6++) {
                codedOutputStream.d0(7, this.f25196x.get(i6));
            }
            codedOutputStream.i0(this.f25188p);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.f25197y;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            if (P() && !this.f25193u.l()) {
                this.f25197y = (byte) 0;
                return false;
            }
            for (int i5 = 0; i5 < D(); i5++) {
                if (!C(i5).l()) {
                    this.f25197y = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < L(); i6++) {
                if (!K(i6).l()) {
                    this.f25197y = (byte) 0;
                    return false;
                }
            }
            this.f25197y = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return A;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return U(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.f25198z;
            if (i5 != -1) {
                return i5;
            }
            int o5 = (this.f25189q & 1) == 1 ? CodedOutputStream.o(1, this.f25190r) + 0 : 0;
            if ((this.f25189q & 2) == 2) {
                o5 += CodedOutputStream.o(2, this.f25191s);
            }
            if ((this.f25189q & 4) == 4) {
                o5 += CodedOutputStream.h(3, this.f25192t.getNumber());
            }
            if ((this.f25189q & 8) == 8) {
                o5 += CodedOutputStream.s(4, this.f25193u);
            }
            if ((this.f25189q & 16) == 16) {
                o5 += CodedOutputStream.o(5, this.f25194v);
            }
            for (int i6 = 0; i6 < this.f25195w.size(); i6++) {
                o5 += CodedOutputStream.s(6, this.f25195w.get(i6));
            }
            for (int i7 = 0; i7 < this.f25196x.size(); i7++) {
                o5 += CodedOutputStream.s(7, this.f25196x.get(i7));
            }
            int size = this.f25188p.size() + o5;
            this.f25198z = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.o();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<h> z() {
            return B;
        }

        private h(h.b bVar) {
            super(bVar);
            this.f25197y = (byte) -1;
            this.f25198z = -1;
            this.f25188p = bVar.i();
        }

        private h(boolean z5) {
            this.f25197y = (byte) -1;
            this.f25198z = -1;
            this.f25188p = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private h(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            q.c cVar;
            this.f25197y = (byte) -1;
            this.f25198z = -1;
            S();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            int i5 = 0;
            while (!z5) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K == 8) {
                                    this.f25189q |= 1;
                                    this.f25190r = eVar.A();
                                } else if (K == 16) {
                                    this.f25189q |= 2;
                                    this.f25191s = eVar.A();
                                } else if (K == 24) {
                                    int A2 = eVar.A();
                                    c valueOf = c.valueOf(A2);
                                    if (valueOf == null) {
                                        J.o0(K);
                                        J.o0(A2);
                                    } else {
                                        this.f25189q |= 4;
                                        this.f25192t = valueOf;
                                    }
                                } else if (K == 34) {
                                    if ((this.f25189q & 8) == 8) {
                                        q qVar = this.f25193u;
                                        qVar.getClass();
                                        cVar = q.z0(qVar);
                                    } else {
                                        cVar = null;
                                    }
                                    q qVar2 = (q) eVar.u(q.J, fVar);
                                    this.f25193u = qVar2;
                                    if (cVar != null) {
                                        cVar.j(qVar2);
                                        this.f25193u = cVar.B();
                                    }
                                    this.f25189q |= 8;
                                } else if (K == 40) {
                                    this.f25189q |= 16;
                                    this.f25194v = eVar.A();
                                } else if (K == 50) {
                                    if ((i5 & 32) != 32) {
                                        this.f25195w = new ArrayList();
                                        i5 |= 32;
                                    }
                                    this.f25195w.add(eVar.u(B, fVar));
                                } else if (K != 58) {
                                    if (!eVar.P(K, J)) {
                                    }
                                } else {
                                    if ((i5 & 64) != 64) {
                                        this.f25196x = new ArrayList();
                                        i5 |= 64;
                                    }
                                    this.f25196x.add(eVar.u(B, fVar));
                                }
                            }
                            z5 = true;
                        } catch (InvalidProtocolBufferException e6) {
                            throw e6.i(this);
                        }
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if ((i5 & 32) == 32) {
                        this.f25195w = Collections.unmodifiableList(this.f25195w);
                    }
                    if ((i5 & 64) == 64) {
                        this.f25196x = Collections.unmodifiableList(this.f25196x);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f25188p = x5.e();
                        throw th2;
                    }
                    this.f25188p = x5.e();
                    throw th;
                }
            }
            if ((i5 & 32) == 32) {
                this.f25195w = Collections.unmodifiableList(this.f25195w);
            }
            if ((i5 & 64) == 64) {
                this.f25196x = Collections.unmodifiableList(this.f25196x);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25188p = x5.e();
                throw th3;
            }
            this.f25188p = x5.e();
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class i extends h.d<i> implements kotlin.reflect.jvm.internal.impl.metadata.k {
        private static final i J;
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<i> K = new C0325a();
        private List<q> A;
        private List<Integer> B;
        private int C;
        private List<u> D;
        private t E;
        private List<Integer> F;
        private e G;
        private byte H;
        private int I;

        /* renamed from: q, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25207q;

        /* renamed from: r, reason: collision with root package name */
        private int f25208r;

        /* renamed from: s, reason: collision with root package name */
        private int f25209s;

        /* renamed from: t, reason: collision with root package name */
        private int f25210t;

        /* renamed from: u, reason: collision with root package name */
        private int f25211u;

        /* renamed from: v, reason: collision with root package name */
        private q f25212v;

        /* renamed from: w, reason: collision with root package name */
        private int f25213w;

        /* renamed from: x, reason: collision with root package name */
        private List<s> f25214x;

        /* renamed from: y, reason: collision with root package name */
        private q f25215y;

        /* renamed from: z, reason: collision with root package name */
        private int f25216z;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$i$a, reason: collision with other inner class name */
        static class C0325a extends kotlin.reflect.jvm.internal.impl.protobuf.b<i> {
            C0325a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public i b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new i(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<i, b> implements kotlin.reflect.jvm.internal.impl.metadata.k {

            /* renamed from: r, reason: collision with root package name */
            private int f25217r;

            /* renamed from: u, reason: collision with root package name */
            private int f25220u;

            /* renamed from: w, reason: collision with root package name */
            private int f25222w;

            /* renamed from: z, reason: collision with root package name */
            private int f25225z;

            /* renamed from: s, reason: collision with root package name */
            private int f25218s = 6;

            /* renamed from: t, reason: collision with root package name */
            private int f25219t = 6;

            /* renamed from: v, reason: collision with root package name */
            private q f25221v = q.X();

            /* renamed from: x, reason: collision with root package name */
            private List<s> f25223x = Collections.emptyList();

            /* renamed from: y, reason: collision with root package name */
            private q f25224y = q.X();
            private List<q> A = Collections.emptyList();
            private List<Integer> B = Collections.emptyList();
            private List<u> C = Collections.emptyList();
            private t D = t.t();
            private List<Integer> E = Collections.emptyList();
            private e F = e.r();

            private b() {
            }

            private static b D() {
                return new b();
            }

            private void E() {
                if ((this.f25217r & 512) != 512) {
                    this.B = new ArrayList(this.B);
                    this.f25217r |= 512;
                }
            }

            private void F() {
                if ((this.f25217r & 256) != 256) {
                    this.A = new ArrayList(this.A);
                    this.f25217r |= 256;
                }
            }

            private void G() {
                if ((this.f25217r & 32) != 32) {
                    this.f25223x = new ArrayList(this.f25223x);
                    this.f25217r |= 32;
                }
            }

            private void I() {
                if ((this.f25217r & 1024) != 1024) {
                    this.C = new ArrayList(this.C);
                    this.f25217r |= 1024;
                }
            }

            private void J() {
                if ((this.f25217r & 4096) != 4096) {
                    this.E = new ArrayList(this.E);
                    this.f25217r |= 4096;
                }
            }

            private void h0() {
            }

            static b y() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public i build() {
                i B = B();
                if (B.l()) {
                    return B;
                }
                throw new UninitializedMessageException(B);
            }

            public i B() {
                i iVar = new i(this);
                int i5 = this.f25217r;
                int i6 = (i5 & 1) != 1 ? 0 : 1;
                iVar.f25209s = this.f25218s;
                if ((i5 & 2) == 2) {
                    i6 |= 2;
                }
                iVar.f25210t = this.f25219t;
                if ((i5 & 4) == 4) {
                    i6 |= 4;
                }
                iVar.f25211u = this.f25220u;
                if ((i5 & 8) == 8) {
                    i6 |= 8;
                }
                iVar.f25212v = this.f25221v;
                if ((i5 & 16) == 16) {
                    i6 |= 16;
                }
                iVar.f25213w = this.f25222w;
                if ((this.f25217r & 32) == 32) {
                    this.f25223x = Collections.unmodifiableList(this.f25223x);
                    this.f25217r &= -33;
                }
                iVar.f25214x = this.f25223x;
                if ((i5 & 64) == 64) {
                    i6 |= 32;
                }
                iVar.f25215y = this.f25224y;
                if ((i5 & 128) == 128) {
                    i6 |= 64;
                }
                iVar.f25216z = this.f25225z;
                if ((this.f25217r & 256) == 256) {
                    this.A = Collections.unmodifiableList(this.A);
                    this.f25217r &= -257;
                }
                iVar.A = this.A;
                if ((this.f25217r & 512) == 512) {
                    this.B = Collections.unmodifiableList(this.B);
                    this.f25217r &= -513;
                }
                iVar.B = this.B;
                if ((this.f25217r & 1024) == 1024) {
                    this.C = Collections.unmodifiableList(this.C);
                    this.f25217r &= -1025;
                }
                iVar.D = this.C;
                if ((i5 & 2048) == 2048) {
                    i6 |= 128;
                }
                iVar.E = this.D;
                if ((this.f25217r & 4096) == 4096) {
                    this.E = Collections.unmodifiableList(this.E);
                    this.f25217r &= -4097;
                }
                iVar.F = this.E;
                if ((i5 & 8192) == 8192) {
                    i6 |= 256;
                }
                iVar.G = this.F;
                iVar.f25208r = i6;
                return iVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(B());
            }

            public q K(int i5) {
                return this.A.get(i5);
            }

            public int L() {
                return this.A.size();
            }

            public e M() {
                return this.F;
            }

            public i N() {
                return i.b0();
            }

            public q Q() {
                return this.f25224y;
            }

            public q S() {
                return this.f25221v;
            }

            public s T(int i5) {
                return this.f25223x.get(i5);
            }

            public int V() {
                return this.f25223x.size();
            }

            public t W() {
                return this.D;
            }

            public u Y(int i5) {
                return this.C.get(i5);
            }

            public int a0() {
                return this.C.size();
            }

            public boolean b0() {
                return (this.f25217r & 8192) == 8192;
            }

            public boolean c0() {
                return (this.f25217r & 4) == 4;
            }

            public boolean d0() {
                return (this.f25217r & 64) == 64;
            }

            public boolean e0() {
                return (this.f25217r & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public kotlin.reflect.jvm.internal.impl.protobuf.h m() {
                return i.b0();
            }

            public boolean g0() {
                return (this.f25217r & 2048) == 2048;
            }

            public b i0(e eVar) {
                if ((this.f25217r & 8192) != 8192 || this.F == e.r()) {
                    this.F = eVar;
                } else {
                    this.F = e.A(this.F).j(eVar).q();
                }
                this.f25217r |= 8192;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: j0, reason: merged with bridge method [inline-methods] */
            public b j(i iVar) {
                if (iVar == i.b0()) {
                    return this;
                }
                if (iVar.t0()) {
                    o0(iVar.d0());
                }
                if (iVar.v0()) {
                    r0(iVar.f0());
                }
                if (iVar.u0()) {
                    q0(iVar.e0());
                }
                if (iVar.y0()) {
                    m0(iVar.i0());
                }
                if (iVar.z0()) {
                    t0(iVar.j0());
                }
                if (!iVar.f25214x.isEmpty()) {
                    if (this.f25223x.isEmpty()) {
                        this.f25223x = iVar.f25214x;
                        this.f25217r &= -33;
                    } else {
                        G();
                        this.f25223x.addAll(iVar.f25214x);
                    }
                }
                if (iVar.w0()) {
                    l0(iVar.g0());
                }
                if (iVar.x0()) {
                    s0(iVar.h0());
                }
                if (!iVar.A.isEmpty()) {
                    if (this.A.isEmpty()) {
                        this.A = iVar.A;
                        this.f25217r &= -257;
                    } else {
                        F();
                        this.A.addAll(iVar.A);
                    }
                }
                if (!iVar.B.isEmpty()) {
                    if (this.B.isEmpty()) {
                        this.B = iVar.B;
                        this.f25217r &= -513;
                    } else {
                        E();
                        this.B.addAll(iVar.B);
                    }
                }
                if (!iVar.D.isEmpty()) {
                    if (this.C.isEmpty()) {
                        this.C = iVar.D;
                        this.f25217r &= -1025;
                    } else {
                        I();
                        this.C.addAll(iVar.D);
                    }
                }
                if (iVar.A0()) {
                    n0(iVar.n0());
                }
                if (!iVar.F.isEmpty()) {
                    if (this.E.isEmpty()) {
                        this.E = iVar.F;
                        this.f25217r &= -4097;
                    } else {
                        J();
                        this.E.addAll(iVar.F);
                    }
                }
                if (iVar.s0()) {
                    i0(iVar.a0());
                }
                w(iVar);
                k(i().f(iVar.f25207q));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: k0, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.i.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$i> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.i.K     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$i r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.i) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$i r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.i) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.i.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$i$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                if (!c0()) {
                    return false;
                }
                if (e0() && !this.f25221v.l()) {
                    return false;
                }
                for (int i5 = 0; i5 < V(); i5++) {
                    if (!T(i5).l()) {
                        return false;
                    }
                }
                if (d0() && !this.f25224y.l()) {
                    return false;
                }
                for (int i6 = 0; i6 < L(); i6++) {
                    if (!K(i6).l()) {
                        return false;
                    }
                }
                for (int i7 = 0; i7 < a0(); i7++) {
                    if (!Y(i7).l()) {
                        return false;
                    }
                }
                if (!g0() || this.D.l()) {
                    return (!b0() || this.F.l()) && v();
                }
                return false;
            }

            public b l0(q qVar) {
                if ((this.f25217r & 64) != 64 || this.f25224y == q.X()) {
                    this.f25224y = qVar;
                } else {
                    this.f25224y = q.z0(this.f25224y).j(qVar).B();
                }
                this.f25217r |= 64;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return i.b0();
            }

            public b m0(q qVar) {
                if ((this.f25217r & 8) != 8 || this.f25221v == q.X()) {
                    this.f25221v = qVar;
                } else {
                    this.f25221v = q.z0(this.f25221v).j(qVar).B();
                }
                this.f25217r |= 8;
                return this;
            }

            public b n0(t tVar) {
                if ((this.f25217r & 2048) != 2048 || this.D == t.t()) {
                    this.D = tVar;
                } else {
                    this.D = t.F(this.D).j(tVar).q();
                }
                this.f25217r |= 2048;
                return this;
            }

            public b o0(int i5) {
                this.f25217r |= 1;
                this.f25218s = i5;
                return this;
            }

            public b q0(int i5) {
                this.f25217r |= 4;
                this.f25220u = i5;
                return this;
            }

            public b r0(int i5) {
                this.f25217r |= 2;
                this.f25219t = i5;
                return this;
            }

            public b s0(int i5) {
                this.f25217r |= 128;
                this.f25225z = i5;
                return this;
            }

            public b t0(int i5) {
                this.f25217r |= 16;
                this.f25222w = i5;
                return this;
            }
        }

        static {
            i iVar = new i(true);
            J = iVar;
            iVar.B0();
        }

        private void B0() {
            this.f25209s = 6;
            this.f25210t = 6;
            this.f25211u = 0;
            this.f25212v = q.X();
            this.f25213w = 0;
            this.f25214x = Collections.emptyList();
            this.f25215y = q.X();
            this.f25216z = 0;
            this.A = Collections.emptyList();
            this.B = Collections.emptyList();
            this.D = Collections.emptyList();
            this.E = t.t();
            this.F = Collections.emptyList();
            this.G = e.r();
        }

        public static b C0() {
            return b.y();
        }

        public static b D0(i iVar) {
            return b.y().j(iVar);
        }

        public static i F0(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws IOException {
            return K.a(inputStream, fVar);
        }

        public static i b0() {
            return J;
        }

        public boolean A0() {
            return (this.f25208r & 128) == 128;
        }

        public b E0() {
            return b.y();
        }

        public b G0() {
            return D0(this);
        }

        public q V(int i5) {
            return this.A.get(i5);
        }

        public int W() {
            return this.A.size();
        }

        public List<Integer> X() {
            return this.B;
        }

        public List<q> Y() {
            return this.A;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            h.d<MessageType>.a w5 = w();
            if ((this.f25208r & 2) == 2) {
                codedOutputStream.a0(1, this.f25210t);
            }
            if ((this.f25208r & 4) == 4) {
                codedOutputStream.a0(2, this.f25211u);
            }
            if ((this.f25208r & 8) == 8) {
                codedOutputStream.d0(3, this.f25212v);
            }
            for (int i5 = 0; i5 < this.f25214x.size(); i5++) {
                codedOutputStream.d0(4, this.f25214x.get(i5));
            }
            if ((this.f25208r & 32) == 32) {
                codedOutputStream.d0(5, this.f25215y);
            }
            for (int i6 = 0; i6 < this.D.size(); i6++) {
                codedOutputStream.d0(6, this.D.get(i6));
            }
            if ((this.f25208r & 16) == 16) {
                codedOutputStream.a0(7, this.f25213w);
            }
            if ((this.f25208r & 64) == 64) {
                codedOutputStream.a0(8, this.f25216z);
            }
            if ((this.f25208r & 1) == 1) {
                codedOutputStream.a0(9, this.f25209s);
            }
            for (int i7 = 0; i7 < this.A.size(); i7++) {
                codedOutputStream.d0(10, this.A.get(i7));
            }
            if (this.B.size() > 0) {
                codedOutputStream.o0(90);
                codedOutputStream.o0(this.C);
            }
            for (int i8 = 0; i8 < this.B.size(); i8++) {
                codedOutputStream.b0(this.B.get(i8).intValue());
            }
            if ((this.f25208r & 128) == 128) {
                codedOutputStream.d0(30, this.E);
            }
            for (int i9 = 0; i9 < this.F.size(); i9++) {
                codedOutputStream.a0(31, this.F.get(i9).intValue());
            }
            if ((this.f25208r & 256) == 256) {
                codedOutputStream.d0(32, this.G);
            }
            w5.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f25207q);
        }

        public e a0() {
            return this.G;
        }

        public i c0() {
            return J;
        }

        public int d0() {
            return this.f25209s;
        }

        public int e0() {
            return this.f25211u;
        }

        public int f0() {
            return this.f25210t;
        }

        public q g0() {
            return this.f25215y;
        }

        public int h0() {
            return this.f25216z;
        }

        public q i0() {
            return this.f25212v;
        }

        public int j0() {
            return this.f25213w;
        }

        public s k0(int i5) {
            return this.f25214x.get(i5);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.H;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            if (!u0()) {
                this.H = (byte) 0;
                return false;
            }
            if (y0() && !this.f25212v.l()) {
                this.H = (byte) 0;
                return false;
            }
            for (int i5 = 0; i5 < l0(); i5++) {
                if (!k0(i5).l()) {
                    this.H = (byte) 0;
                    return false;
                }
            }
            if (w0() && !this.f25215y.l()) {
                this.H = (byte) 0;
                return false;
            }
            for (int i6 = 0; i6 < W(); i6++) {
                if (!V(i6).l()) {
                    this.H = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < p0(); i7++) {
                if (!o0(i7).l()) {
                    this.H = (byte) 0;
                    return false;
                }
            }
            if (A0() && !this.E.l()) {
                this.H = (byte) 0;
                return false;
            }
            if (s0() && !this.G.l()) {
                this.H = (byte) 0;
                return false;
            }
            if (p()) {
                this.H = (byte) 1;
                return true;
            }
            this.H = (byte) 0;
            return false;
        }

        public int l0() {
            return this.f25214x.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return J;
        }

        public List<s> m0() {
            return this.f25214x;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return D0(this);
        }

        public t n0() {
            return this.E;
        }

        public u o0(int i5) {
            return this.D.get(i5);
        }

        public int p0() {
            return this.D.size();
        }

        public List<u> q0() {
            return this.D;
        }

        public List<Integer> r0() {
            return this.F;
        }

        public boolean s0() {
            return (this.f25208r & 256) == 256;
        }

        public boolean t0() {
            return (this.f25208r & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.I;
            if (i5 != -1) {
                return i5;
            }
            int o5 = (this.f25208r & 2) == 2 ? CodedOutputStream.o(1, this.f25210t) + 0 : 0;
            if ((this.f25208r & 4) == 4) {
                o5 += CodedOutputStream.o(2, this.f25211u);
            }
            if ((this.f25208r & 8) == 8) {
                o5 += CodedOutputStream.s(3, this.f25212v);
            }
            for (int i6 = 0; i6 < this.f25214x.size(); i6++) {
                o5 += CodedOutputStream.s(4, this.f25214x.get(i6));
            }
            if ((this.f25208r & 32) == 32) {
                o5 += CodedOutputStream.s(5, this.f25215y);
            }
            for (int i7 = 0; i7 < this.D.size(); i7++) {
                o5 += CodedOutputStream.s(6, this.D.get(i7));
            }
            if ((this.f25208r & 16) == 16) {
                o5 += CodedOutputStream.o(7, this.f25213w);
            }
            if ((this.f25208r & 64) == 64) {
                o5 += CodedOutputStream.o(8, this.f25216z);
            }
            if ((this.f25208r & 1) == 1) {
                o5 += CodedOutputStream.o(9, this.f25209s);
            }
            for (int i8 = 0; i8 < this.A.size(); i8++) {
                o5 += CodedOutputStream.s(10, this.A.get(i8));
            }
            int i9 = 0;
            for (int i10 = 0; i10 < this.B.size(); i10++) {
                i9 += CodedOutputStream.p(this.B.get(i10).intValue());
            }
            int i11 = o5 + i9;
            if (!this.B.isEmpty()) {
                i11 = i11 + 1 + CodedOutputStream.p(i9);
            }
            this.C = i9;
            if ((this.f25208r & 128) == 128) {
                i11 += CodedOutputStream.s(30, this.E);
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.F.size(); i13++) {
                i12 += CodedOutputStream.p(this.F.get(i13).intValue());
            }
            int size = (this.F.size() * 2) + i11 + i12;
            if ((this.f25208r & 256) == 256) {
                size += CodedOutputStream.s(32, this.G);
            }
            int size2 = this.f25207q.size() + size + q();
            this.I = size2;
            return size2;
        }

        public boolean u0() {
            return (this.f25208r & 4) == 4;
        }

        public boolean v0() {
            return (this.f25208r & 2) == 2;
        }

        public boolean w0() {
            return (this.f25208r & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.y();
        }

        public boolean x0() {
            return (this.f25208r & 64) == 64;
        }

        public boolean y0() {
            return (this.f25208r & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<i> z() {
            return K;
        }

        public boolean z0() {
            return (this.f25208r & 16) == 16;
        }

        private i(h.c<i, ?> cVar) {
            super(cVar);
            this.C = -1;
            this.H = (byte) -1;
            this.I = -1;
            this.f25207q = cVar.i();
        }

        private i(boolean z5) {
            this.C = -1;
            this.H = (byte) -1;
            this.I = -1;
            this.f25207q = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
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
            this.C = -1;
            this.H = (byte) -1;
            this.I = -1;
            B0();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J2 = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            char c6 = 0;
            while (true) {
                ?? r5 = 32;
                if (!z5) {
                    try {
                        try {
                            int K2 = eVar.K();
                            q.c cVar = null;
                            e.b bVar = null;
                            t.b bVar2 = null;
                            q.c cVar2 = null;
                            switch (K2) {
                                case 0:
                                    z5 = true;
                                case 8:
                                    this.f25208r |= 2;
                                    this.f25210t = eVar.A();
                                case 16:
                                    this.f25208r |= 4;
                                    this.f25211u = eVar.A();
                                case 26:
                                    if ((this.f25208r & 8) == 8) {
                                        q qVar = this.f25212v;
                                        qVar.getClass();
                                        cVar = q.z0(qVar);
                                    }
                                    q qVar2 = (q) eVar.u(q.J, fVar);
                                    this.f25212v = qVar2;
                                    if (cVar != null) {
                                        cVar.j(qVar2);
                                        this.f25212v = cVar.B();
                                    }
                                    this.f25208r |= 8;
                                case 34:
                                    int i5 = (c6 == true ? 1 : 0) & 32;
                                    c6 = c6;
                                    if (i5 != 32) {
                                        this.f25214x = new ArrayList();
                                        c6 = (c6 == true ? 1 : 0) | ' ';
                                    }
                                    this.f25214x.add(eVar.u(s.C, fVar));
                                case 42:
                                    if ((this.f25208r & 32) == 32) {
                                        q qVar3 = this.f25215y;
                                        qVar3.getClass();
                                        cVar2 = q.z0(qVar3);
                                    }
                                    q qVar4 = (q) eVar.u(q.J, fVar);
                                    this.f25215y = qVar4;
                                    if (cVar2 != null) {
                                        cVar2.j(qVar4);
                                        this.f25215y = cVar2.B();
                                    }
                                    this.f25208r |= 32;
                                case 50:
                                    int i6 = (c6 == true ? 1 : 0) & 1024;
                                    c6 = c6;
                                    if (i6 != 1024) {
                                        this.D = new ArrayList();
                                        c6 = (c6 == true ? 1 : 0) | 1024;
                                    }
                                    this.D.add(eVar.u(u.B, fVar));
                                case 56:
                                    this.f25208r |= 16;
                                    this.f25213w = eVar.A();
                                case 64:
                                    this.f25208r |= 64;
                                    this.f25216z = eVar.A();
                                case 72:
                                    this.f25208r |= 1;
                                    this.f25209s = eVar.A();
                                case 82:
                                    int i7 = (c6 == true ? 1 : 0) & 256;
                                    c6 = c6;
                                    if (i7 != 256) {
                                        this.A = new ArrayList();
                                        c6 = (c6 == true ? 1 : 0) | 256;
                                    }
                                    this.A.add(eVar.u(q.J, fVar));
                                case 88:
                                    int i8 = (c6 == true ? 1 : 0) & 512;
                                    c6 = c6;
                                    if (i8 != 512) {
                                        this.B = new ArrayList();
                                        c6 = (c6 == true ? 1 : 0) | 512;
                                    }
                                    this.B.add(Integer.valueOf(eVar.A()));
                                case 90:
                                    int j5 = eVar.j(eVar.A());
                                    int i9 = (c6 == true ? 1 : 0) & 512;
                                    c6 = c6;
                                    if (i9 != 512) {
                                        c6 = c6;
                                        if (eVar.e() > 0) {
                                            this.B = new ArrayList();
                                            c6 = (c6 == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.B.add(Integer.valueOf(eVar.A()));
                                    }
                                    eVar.i(j5);
                                case 242:
                                    if ((this.f25208r & 128) == 128) {
                                        t tVar = this.E;
                                        tVar.getClass();
                                        bVar2 = t.F(tVar);
                                    }
                                    t tVar2 = (t) eVar.u(t.f25374w, fVar);
                                    this.E = tVar2;
                                    if (bVar2 != null) {
                                        bVar2.j(tVar2);
                                        this.E = bVar2.q();
                                    }
                                    this.f25208r |= 128;
                                case 248:
                                    int i10 = (c6 == true ? 1 : 0) & 4096;
                                    c6 = c6;
                                    if (i10 != 4096) {
                                        this.F = new ArrayList();
                                        c6 = (c6 == true ? 1 : 0) | 4096;
                                    }
                                    this.F.add(Integer.valueOf(eVar.A()));
                                case o.f.f9513c /* 250 */:
                                    int j6 = eVar.j(eVar.A());
                                    int i11 = (c6 == true ? 1 : 0) & 4096;
                                    c6 = c6;
                                    if (i11 != 4096) {
                                        c6 = c6;
                                        if (eVar.e() > 0) {
                                            this.F = new ArrayList();
                                            c6 = (c6 == true ? 1 : 0) | 4096;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.F.add(Integer.valueOf(eVar.A()));
                                    }
                                    eVar.i(j6);
                                case 258:
                                    if ((this.f25208r & 256) == 256) {
                                        e eVar2 = this.G;
                                        eVar2.getClass();
                                        bVar = e.A(eVar2);
                                    }
                                    e eVar3 = (e) eVar.u(e.f25157u, fVar);
                                    this.G = eVar3;
                                    if (bVar != null) {
                                        bVar.j(eVar3);
                                        this.G = bVar.q();
                                    }
                                    this.f25208r |= 256;
                                default:
                                    r5 = j(eVar, J2, fVar, K2);
                                    if (r5 == 0) {
                                        z5 = true;
                                    }
                            }
                        } catch (InvalidProtocolBufferException e6) {
                            throw e6.i(this);
                        } catch (IOException e7) {
                            throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                        }
                    } catch (Throwable th) {
                        if (((c6 == true ? 1 : 0) & 32) == r5) {
                            this.f25214x = Collections.unmodifiableList(this.f25214x);
                        }
                        if (((c6 == true ? 1 : 0) & 1024) == 1024) {
                            this.D = Collections.unmodifiableList(this.D);
                        }
                        if (((c6 == true ? 1 : 0) & 256) == 256) {
                            this.A = Collections.unmodifiableList(this.A);
                        }
                        if (((c6 == true ? 1 : 0) & 512) == 512) {
                            this.B = Collections.unmodifiableList(this.B);
                        }
                        if (((c6 == true ? 1 : 0) & 4096) == 4096) {
                            this.F = Collections.unmodifiableList(this.F);
                        }
                        try {
                            J2.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f25207q = x5.e();
                            throw th2;
                        }
                        this.f25207q = x5.e();
                        g();
                        throw th;
                    }
                } else {
                    if (((c6 == true ? 1 : 0) & 32) == 32) {
                        this.f25214x = Collections.unmodifiableList(this.f25214x);
                    }
                    if (((c6 == true ? 1 : 0) & 1024) == 1024) {
                        this.D = Collections.unmodifiableList(this.D);
                    }
                    if (((c6 == true ? 1 : 0) & 256) == 256) {
                        this.A = Collections.unmodifiableList(this.A);
                    }
                    if (((c6 == true ? 1 : 0) & 512) == 512) {
                        this.B = Collections.unmodifiableList(this.B);
                    }
                    if (((c6 == true ? 1 : 0) & 4096) == 4096) {
                        this.F = Collections.unmodifiableList(this.F);
                    }
                    try {
                        J2.I();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.f25207q = x5.e();
                        throw th3;
                    }
                    this.f25207q = x5.e();
                    g();
                    return;
                }
            }
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class l extends h.d<l> implements kotlin.reflect.jvm.internal.impl.metadata.m {
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<l> A = new C0328a();

        /* renamed from: z, reason: collision with root package name */
        private static final l f25226z;

        /* renamed from: q, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25227q;

        /* renamed from: r, reason: collision with root package name */
        private int f25228r;

        /* renamed from: s, reason: collision with root package name */
        private List<i> f25229s;

        /* renamed from: t, reason: collision with root package name */
        private List<n> f25230t;

        /* renamed from: u, reason: collision with root package name */
        private List<r> f25231u;

        /* renamed from: v, reason: collision with root package name */
        private t f25232v;

        /* renamed from: w, reason: collision with root package name */
        private w f25233w;

        /* renamed from: x, reason: collision with root package name */
        private byte f25234x;

        /* renamed from: y, reason: collision with root package name */
        private int f25235y;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$l$a, reason: collision with other inner class name */
        static class C0328a extends kotlin.reflect.jvm.internal.impl.protobuf.b<l> {
            C0328a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public l b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new l(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<l, b> implements kotlin.reflect.jvm.internal.impl.metadata.m {

            /* renamed from: r, reason: collision with root package name */
            private int f25236r;

            /* renamed from: s, reason: collision with root package name */
            private List<i> f25237s = Collections.emptyList();

            /* renamed from: t, reason: collision with root package name */
            private List<n> f25238t = Collections.emptyList();

            /* renamed from: u, reason: collision with root package name */
            private List<r> f25239u = Collections.emptyList();

            /* renamed from: v, reason: collision with root package name */
            private t f25240v = t.t();

            /* renamed from: w, reason: collision with root package name */
            private w f25241w = w.r();

            private b() {
            }

            private static b D() {
                return new b();
            }

            private void E() {
                if ((this.f25236r & 1) != 1) {
                    this.f25237s = new ArrayList(this.f25237s);
                    this.f25236r |= 1;
                }
            }

            private void F() {
                if ((this.f25236r & 2) != 2) {
                    this.f25238t = new ArrayList(this.f25238t);
                    this.f25236r |= 2;
                }
            }

            private void G() {
                if ((this.f25236r & 4) != 4) {
                    this.f25239u = new ArrayList(this.f25239u);
                    this.f25236r |= 4;
                }
            }

            private void V() {
            }

            static b y() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public l build() {
                l B = B();
                if (B.l()) {
                    return B;
                }
                throw new UninitializedMessageException(B);
            }

            public l B() {
                l lVar = new l(this);
                int i5 = this.f25236r;
                if ((i5 & 1) == 1) {
                    this.f25237s = Collections.unmodifiableList(this.f25237s);
                    this.f25236r &= -2;
                }
                lVar.f25229s = this.f25237s;
                if ((this.f25236r & 2) == 2) {
                    this.f25238t = Collections.unmodifiableList(this.f25238t);
                    this.f25236r &= -3;
                }
                lVar.f25230t = this.f25238t;
                if ((this.f25236r & 4) == 4) {
                    this.f25239u = Collections.unmodifiableList(this.f25239u);
                    this.f25236r &= -5;
                }
                lVar.f25231u = this.f25239u;
                int i6 = (i5 & 8) != 8 ? 0 : 1;
                lVar.f25232v = this.f25240v;
                if ((i5 & 16) == 16) {
                    i6 |= 2;
                }
                lVar.f25233w = this.f25241w;
                lVar.f25228r = i6;
                return lVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(B());
            }

            public l I() {
                return l.K();
            }

            public i J(int i5) {
                return this.f25237s.get(i5);
            }

            public int K() {
                return this.f25237s.size();
            }

            public n L(int i5) {
                return this.f25238t.get(i5);
            }

            public int M() {
                return this.f25238t.size();
            }

            public r N(int i5) {
                return this.f25239u.get(i5);
            }

            public int Q() {
                return this.f25239u.size();
            }

            public t S() {
                return this.f25240v;
            }

            public boolean T() {
                return (this.f25236r & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: W, reason: merged with bridge method [inline-methods] */
            public b j(l lVar) {
                if (lVar == l.K()) {
                    return this;
                }
                if (!lVar.f25229s.isEmpty()) {
                    if (this.f25237s.isEmpty()) {
                        this.f25237s = lVar.f25229s;
                        this.f25236r &= -2;
                    } else {
                        E();
                        this.f25237s.addAll(lVar.f25229s);
                    }
                }
                if (!lVar.f25230t.isEmpty()) {
                    if (this.f25238t.isEmpty()) {
                        this.f25238t = lVar.f25230t;
                        this.f25236r &= -3;
                    } else {
                        F();
                        this.f25238t.addAll(lVar.f25230t);
                    }
                }
                if (!lVar.f25231u.isEmpty()) {
                    if (this.f25239u.isEmpty()) {
                        this.f25239u = lVar.f25231u;
                        this.f25236r &= -5;
                    } else {
                        G();
                        this.f25239u.addAll(lVar.f25231u);
                    }
                }
                if (lVar.X()) {
                    a0(lVar.V());
                }
                if (lVar.Y()) {
                    b0(lVar.W());
                }
                w(lVar);
                k(i().f(lVar.f25227q));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: Y, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.l.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$l> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.l.A     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$l r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.l) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$l r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.l) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.l.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$l$b");
            }

            public b a0(t tVar) {
                if ((this.f25236r & 8) != 8 || this.f25240v == t.t()) {
                    this.f25240v = tVar;
                } else {
                    this.f25240v = t.F(this.f25240v).j(tVar).q();
                }
                this.f25236r |= 8;
                return this;
            }

            public b b0(w wVar) {
                if ((this.f25236r & 16) != 16 || this.f25241w == w.r()) {
                    this.f25241w = wVar;
                } else {
                    this.f25241w = w.A(this.f25241w).j(wVar).q();
                }
                this.f25236r |= 16;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public kotlin.reflect.jvm.internal.impl.protobuf.h m() {
                return l.K();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                for (int i5 = 0; i5 < K(); i5++) {
                    if (!J(i5).l()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < M(); i6++) {
                    if (!L(i6).l()) {
                        return false;
                    }
                }
                for (int i7 = 0; i7 < Q(); i7++) {
                    if (!N(i7).l()) {
                        return false;
                    }
                }
                return (!T() || this.f25240v.l()) && v();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return l.K();
            }
        }

        static {
            l lVar = new l(true);
            f25226z = lVar;
            lVar.a0();
        }

        public static l K() {
            return f25226z;
        }

        private void a0() {
            this.f25229s = Collections.emptyList();
            this.f25230t = Collections.emptyList();
            this.f25231u = Collections.emptyList();
            this.f25232v = t.t();
            this.f25233w = w.r();
        }

        public static b b0() {
            return b.y();
        }

        public static b c0(l lVar) {
            return b.y().j(lVar);
        }

        public static l e0(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws IOException {
            return A.a(inputStream, fVar);
        }

        public l L() {
            return f25226z;
        }

        public i M(int i5) {
            return this.f25229s.get(i5);
        }

        public int N() {
            return this.f25229s.size();
        }

        public List<i> O() {
            return this.f25229s;
        }

        public n P(int i5) {
            return this.f25230t.get(i5);
        }

        public int Q() {
            return this.f25230t.size();
        }

        public List<n> R() {
            return this.f25230t;
        }

        public r S(int i5) {
            return this.f25231u.get(i5);
        }

        public int T() {
            return this.f25231u.size();
        }

        public List<r> U() {
            return this.f25231u;
        }

        public t V() {
            return this.f25232v;
        }

        public w W() {
            return this.f25233w;
        }

        public boolean X() {
            return (this.f25228r & 1) == 1;
        }

        public boolean Y() {
            return (this.f25228r & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            h.d<MessageType>.a w5 = w();
            for (int i5 = 0; i5 < this.f25229s.size(); i5++) {
                codedOutputStream.d0(3, this.f25229s.get(i5));
            }
            for (int i6 = 0; i6 < this.f25230t.size(); i6++) {
                codedOutputStream.d0(4, this.f25230t.get(i6));
            }
            for (int i7 = 0; i7 < this.f25231u.size(); i7++) {
                codedOutputStream.d0(5, this.f25231u.get(i7));
            }
            if ((this.f25228r & 1) == 1) {
                codedOutputStream.d0(30, this.f25232v);
            }
            if ((this.f25228r & 2) == 2) {
                codedOutputStream.d0(32, this.f25233w);
            }
            w5.a(o.f.f9512b, codedOutputStream);
            codedOutputStream.i0(this.f25227q);
        }

        public b d0() {
            return b.y();
        }

        public b f0() {
            return c0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.f25234x;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            for (int i5 = 0; i5 < N(); i5++) {
                if (!M(i5).l()) {
                    this.f25234x = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < Q(); i6++) {
                if (!P(i6).l()) {
                    this.f25234x = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < T(); i7++) {
                if (!S(i7).l()) {
                    this.f25234x = (byte) 0;
                    return false;
                }
            }
            if (X() && !this.f25232v.l()) {
                this.f25234x = (byte) 0;
                return false;
            }
            if (p()) {
                this.f25234x = (byte) 1;
                return true;
            }
            this.f25234x = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return f25226z;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return c0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.f25235y;
            if (i5 != -1) {
                return i5;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < this.f25229s.size(); i7++) {
                i6 += CodedOutputStream.s(3, this.f25229s.get(i7));
            }
            for (int i8 = 0; i8 < this.f25230t.size(); i8++) {
                i6 += CodedOutputStream.s(4, this.f25230t.get(i8));
            }
            for (int i9 = 0; i9 < this.f25231u.size(); i9++) {
                i6 += CodedOutputStream.s(5, this.f25231u.get(i9));
            }
            if ((this.f25228r & 1) == 1) {
                i6 += CodedOutputStream.s(30, this.f25232v);
            }
            if ((this.f25228r & 2) == 2) {
                i6 += CodedOutputStream.s(32, this.f25233w);
            }
            int size = this.f25227q.size() + i6 + q();
            this.f25235y = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.y();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<l> z() {
            return A;
        }

        private l(h.c<l, ?> cVar) {
            super(cVar);
            this.f25234x = (byte) -1;
            this.f25235y = -1;
            this.f25227q = cVar.i();
        }

        private l(boolean z5) {
            this.f25234x = (byte) -1;
            this.f25235y = -1;
            this.f25227q = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v8 */
        private l(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f25234x = (byte) -1;
            this.f25235y = -1;
            a0();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            char c6 = 0;
            while (!z5) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K == 26) {
                                    int i5 = (c6 == true ? 1 : 0) & 1;
                                    c6 = c6;
                                    if (i5 != 1) {
                                        this.f25229s = new ArrayList();
                                        c6 = (c6 == true ? 1 : 0) | 1;
                                    }
                                    this.f25229s.add(eVar.u(i.K, fVar));
                                } else if (K == 34) {
                                    int i6 = (c6 == true ? 1 : 0) & 2;
                                    c6 = c6;
                                    if (i6 != 2) {
                                        this.f25230t = new ArrayList();
                                        c6 = (c6 == true ? 1 : 0) | 2;
                                    }
                                    this.f25230t.add(eVar.u(n.K, fVar));
                                } else if (K != 42) {
                                    w.b bVar = null;
                                    t.b bVar2 = null;
                                    if (K == 242) {
                                        if ((this.f25228r & 1) == 1) {
                                            t tVar = this.f25232v;
                                            tVar.getClass();
                                            bVar2 = t.F(tVar);
                                        }
                                        t tVar2 = (t) eVar.u(t.f25374w, fVar);
                                        this.f25232v = tVar2;
                                        if (bVar2 != null) {
                                            bVar2.j(tVar2);
                                            this.f25232v = bVar2.q();
                                        }
                                        this.f25228r |= 1;
                                    } else if (K != 258) {
                                        if (!j(eVar, J, fVar, K)) {
                                        }
                                    } else {
                                        if ((this.f25228r & 2) == 2) {
                                            w wVar = this.f25233w;
                                            wVar.getClass();
                                            bVar = w.A(wVar);
                                        }
                                        w wVar2 = (w) eVar.u(w.f25420u, fVar);
                                        this.f25233w = wVar2;
                                        if (bVar != null) {
                                            bVar.j(wVar2);
                                            this.f25233w = bVar.q();
                                        }
                                        this.f25228r |= 2;
                                    }
                                } else {
                                    int i7 = (c6 == true ? 1 : 0) & 4;
                                    c6 = c6;
                                    if (i7 != 4) {
                                        this.f25231u = new ArrayList();
                                        c6 = (c6 == true ? 1 : 0) | 4;
                                    }
                                    this.f25231u.add(eVar.u(r.E, fVar));
                                }
                            }
                            z5 = true;
                        } catch (InvalidProtocolBufferException e6) {
                            throw e6.i(this);
                        }
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if (((c6 == true ? 1 : 0) & 1) == 1) {
                        this.f25229s = Collections.unmodifiableList(this.f25229s);
                    }
                    if (((c6 == true ? 1 : 0) & 2) == 2) {
                        this.f25230t = Collections.unmodifiableList(this.f25230t);
                    }
                    if (((c6 == true ? 1 : 0) & 4) == 4) {
                        this.f25231u = Collections.unmodifiableList(this.f25231u);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f25227q = x5.e();
                        throw th2;
                    }
                    this.f25227q = x5.e();
                    g();
                    throw th;
                }
            }
            if (((c6 == true ? 1 : 0) & 1) == 1) {
                this.f25229s = Collections.unmodifiableList(this.f25229s);
            }
            if (((c6 == true ? 1 : 0) & 2) == 2) {
                this.f25230t = Collections.unmodifiableList(this.f25230t);
            }
            if (((c6 == true ? 1 : 0) & 4) == 4) {
                this.f25231u = Collections.unmodifiableList(this.f25231u);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25227q = x5.e();
                throw th3;
            }
            this.f25227q = x5.e();
            g();
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class m extends h.d<m> implements kotlin.reflect.jvm.internal.impl.metadata.l {

        /* renamed from: y, reason: collision with root package name */
        private static final m f25242y;

        /* renamed from: z, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<m> f25243z = new C0329a();

        /* renamed from: q, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25244q;

        /* renamed from: r, reason: collision with root package name */
        private int f25245r;

        /* renamed from: s, reason: collision with root package name */
        private p f25246s;

        /* renamed from: t, reason: collision with root package name */
        private o f25247t;

        /* renamed from: u, reason: collision with root package name */
        private l f25248u;

        /* renamed from: v, reason: collision with root package name */
        private List<c> f25249v;

        /* renamed from: w, reason: collision with root package name */
        private byte f25250w;

        /* renamed from: x, reason: collision with root package name */
        private int f25251x;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$m$a, reason: collision with other inner class name */
        static class C0329a extends kotlin.reflect.jvm.internal.impl.protobuf.b<m> {
            C0329a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public m b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new m(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<m, b> implements kotlin.reflect.jvm.internal.impl.metadata.l {

            /* renamed from: r, reason: collision with root package name */
            private int f25252r;

            /* renamed from: s, reason: collision with root package name */
            private p f25253s = p.r();

            /* renamed from: t, reason: collision with root package name */
            private o f25254t = o.r();

            /* renamed from: u, reason: collision with root package name */
            private l f25255u = l.K();

            /* renamed from: v, reason: collision with root package name */
            private List<c> f25256v = Collections.emptyList();

            private b() {
            }

            private static b D() {
                return new b();
            }

            private void E() {
                if ((this.f25252r & 8) != 8) {
                    this.f25256v = new ArrayList(this.f25256v);
                    this.f25252r |= 8;
                }
            }

            private void N() {
            }

            static b y() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public m build() {
                m B = B();
                if (B.l()) {
                    return B;
                }
                throw new UninitializedMessageException(B);
            }

            public m B() {
                m mVar = new m(this);
                int i5 = this.f25252r;
                int i6 = (i5 & 1) != 1 ? 0 : 1;
                mVar.f25246s = this.f25253s;
                if ((i5 & 2) == 2) {
                    i6 |= 2;
                }
                mVar.f25247t = this.f25254t;
                if ((i5 & 4) == 4) {
                    i6 |= 4;
                }
                mVar.f25248u = this.f25255u;
                if ((this.f25252r & 8) == 8) {
                    this.f25256v = Collections.unmodifiableList(this.f25256v);
                    this.f25252r &= -9;
                }
                mVar.f25249v = this.f25256v;
                mVar.f25245r = i6;
                return mVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(B());
            }

            public c F(int i5) {
                return this.f25256v.get(i5);
            }

            public int G() {
                return this.f25256v.size();
            }

            public m I() {
                return m.K();
            }

            public l J() {
                return this.f25255u;
            }

            public o K() {
                return this.f25254t;
            }

            public boolean L() {
                return (this.f25252r & 4) == 4;
            }

            public boolean M() {
                return (this.f25252r & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: Q, reason: merged with bridge method [inline-methods] */
            public b j(m mVar) {
                if (mVar == m.K()) {
                    return this;
                }
                if (mVar.R()) {
                    W(mVar.O());
                }
                if (mVar.Q()) {
                    V(mVar.N());
                }
                if (mVar.P()) {
                    T(mVar.M());
                }
                if (!mVar.f25249v.isEmpty()) {
                    if (this.f25256v.isEmpty()) {
                        this.f25256v = mVar.f25249v;
                        this.f25252r &= -9;
                    } else {
                        E();
                        this.f25256v.addAll(mVar.f25249v);
                    }
                }
                w(mVar);
                k(i().f(mVar.f25244q));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: S, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.m.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$m> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.m.f25243z     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$m r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.m) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$m r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.m) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.m.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$m$b");
            }

            public b T(l lVar) {
                if ((this.f25252r & 4) != 4 || this.f25255u == l.K()) {
                    this.f25255u = lVar;
                } else {
                    this.f25255u = l.c0(this.f25255u).j(lVar).B();
                }
                this.f25252r |= 4;
                return this;
            }

            public b V(o oVar) {
                if ((this.f25252r & 2) != 2 || this.f25254t == o.r()) {
                    this.f25254t = oVar;
                } else {
                    this.f25254t = o.A(this.f25254t).j(oVar).q();
                }
                this.f25252r |= 2;
                return this;
            }

            public b W(p pVar) {
                if ((this.f25252r & 1) != 1 || this.f25253s == p.r()) {
                    this.f25253s = pVar;
                } else {
                    this.f25253s = p.A(this.f25253s).j(pVar).q();
                }
                this.f25252r |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public kotlin.reflect.jvm.internal.impl.protobuf.h m() {
                return m.K();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                if (M() && !this.f25254t.l()) {
                    return false;
                }
                if (L() && !this.f25255u.l()) {
                    return false;
                }
                for (int i5 = 0; i5 < G(); i5++) {
                    if (!F(i5).l()) {
                        return false;
                    }
                }
                return v();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return m.K();
            }
        }

        static {
            m mVar = new m(true);
            f25242y = mVar;
            mVar.S();
        }

        public static m K() {
            return f25242y;
        }

        private void S() {
            this.f25246s = p.r();
            this.f25247t = o.r();
            this.f25248u = l.K();
            this.f25249v = Collections.emptyList();
        }

        public static b T() {
            return b.y();
        }

        public static b U(m mVar) {
            return b.y().j(mVar);
        }

        public static m W(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws IOException {
            return f25243z.a(inputStream, fVar);
        }

        public c H(int i5) {
            return this.f25249v.get(i5);
        }

        public int I() {
            return this.f25249v.size();
        }

        public List<c> J() {
            return this.f25249v;
        }

        public m L() {
            return f25242y;
        }

        public l M() {
            return this.f25248u;
        }

        public o N() {
            return this.f25247t;
        }

        public p O() {
            return this.f25246s;
        }

        public boolean P() {
            return (this.f25245r & 4) == 4;
        }

        public boolean Q() {
            return (this.f25245r & 2) == 2;
        }

        public boolean R() {
            return (this.f25245r & 1) == 1;
        }

        public b V() {
            return b.y();
        }

        public b X() {
            return U(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            h.d<MessageType>.a w5 = w();
            if ((this.f25245r & 1) == 1) {
                codedOutputStream.d0(1, this.f25246s);
            }
            if ((this.f25245r & 2) == 2) {
                codedOutputStream.d0(2, this.f25247t);
            }
            if ((this.f25245r & 4) == 4) {
                codedOutputStream.d0(3, this.f25248u);
            }
            for (int i5 = 0; i5 < this.f25249v.size(); i5++) {
                codedOutputStream.d0(4, this.f25249v.get(i5));
            }
            w5.a(o.f.f9512b, codedOutputStream);
            codedOutputStream.i0(this.f25244q);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.f25250w;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            if (Q() && !this.f25247t.l()) {
                this.f25250w = (byte) 0;
                return false;
            }
            if (P() && !this.f25248u.l()) {
                this.f25250w = (byte) 0;
                return false;
            }
            for (int i5 = 0; i5 < I(); i5++) {
                if (!H(i5).l()) {
                    this.f25250w = (byte) 0;
                    return false;
                }
            }
            if (p()) {
                this.f25250w = (byte) 1;
                return true;
            }
            this.f25250w = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return f25242y;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return U(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.f25251x;
            if (i5 != -1) {
                return i5;
            }
            int s5 = (this.f25245r & 1) == 1 ? CodedOutputStream.s(1, this.f25246s) + 0 : 0;
            if ((this.f25245r & 2) == 2) {
                s5 += CodedOutputStream.s(2, this.f25247t);
            }
            if ((this.f25245r & 4) == 4) {
                s5 += CodedOutputStream.s(3, this.f25248u);
            }
            for (int i6 = 0; i6 < this.f25249v.size(); i6++) {
                s5 += CodedOutputStream.s(4, this.f25249v.get(i6));
            }
            int size = this.f25244q.size() + s5 + q();
            this.f25251x = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.y();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<m> z() {
            return f25243z;
        }

        private m(h.c<m, ?> cVar) {
            super(cVar);
            this.f25250w = (byte) -1;
            this.f25251x = -1;
            this.f25244q = cVar.i();
        }

        private m(boolean z5) {
            this.f25250w = (byte) -1;
            this.f25251x = -1;
            this.f25244q = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v4 */
        private m(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f25250w = (byte) -1;
            this.f25251x = -1;
            S();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            char c6 = 0;
            while (!z5) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            l.b bVar = null;
                            p.b bVar2 = null;
                            o.b bVar3 = null;
                            if (K == 10) {
                                if ((this.f25245r & 1) == 1) {
                                    p pVar = this.f25246s;
                                    pVar.getClass();
                                    bVar2 = p.A(pVar);
                                }
                                p pVar2 = (p) eVar.u(p.f25298u, fVar);
                                this.f25246s = pVar2;
                                if (bVar2 != null) {
                                    bVar2.j(pVar2);
                                    this.f25246s = bVar2.q();
                                }
                                this.f25245r |= 1;
                            } else if (K == 18) {
                                if ((this.f25245r & 2) == 2) {
                                    o oVar = this.f25247t;
                                    oVar.getClass();
                                    bVar3 = o.A(oVar);
                                }
                                o oVar2 = (o) eVar.u(o.f25277u, fVar);
                                this.f25247t = oVar2;
                                if (bVar3 != null) {
                                    bVar3.j(oVar2);
                                    this.f25247t = bVar3.q();
                                }
                                this.f25245r |= 2;
                            } else if (K == 26) {
                                if ((this.f25245r & 4) == 4) {
                                    l lVar = this.f25248u;
                                    lVar.getClass();
                                    bVar = l.c0(lVar);
                                }
                                l lVar2 = (l) eVar.u(l.A, fVar);
                                this.f25248u = lVar2;
                                if (bVar != null) {
                                    bVar.j(lVar2);
                                    this.f25248u = bVar.B();
                                }
                                this.f25245r |= 4;
                            } else if (K != 34) {
                                if (!j(eVar, J, fVar, K)) {
                                }
                            } else {
                                int i5 = (c6 == true ? 1 : 0) & 8;
                                c6 = c6;
                                if (i5 != 8) {
                                    this.f25249v = new ArrayList();
                                    c6 = (c6 == true ? 1 : 0) | '\b';
                                }
                                this.f25249v.add(eVar.u(c.Z, fVar));
                            }
                        }
                        z5 = true;
                    } catch (InvalidProtocolBufferException e6) {
                        throw e6.i(this);
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if (((c6 == true ? 1 : 0) & 8) == 8) {
                        this.f25249v = Collections.unmodifiableList(this.f25249v);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f25244q = x5.e();
                        throw th2;
                    }
                    this.f25244q = x5.e();
                    g();
                    throw th;
                }
            }
            if (((c6 == true ? 1 : 0) & 8) == 8) {
                this.f25249v = Collections.unmodifiableList(this.f25249v);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25244q = x5.e();
                throw th3;
            }
            this.f25244q = x5.e();
            g();
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class n extends h.d<n> implements kotlin.reflect.jvm.internal.impl.metadata.n {
        private static final n J;
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<n> K = new C0330a();
        private List<q> A;
        private List<Integer> B;
        private int C;
        private u D;
        private int E;
        private int F;
        private List<Integer> G;
        private byte H;
        private int I;

        /* renamed from: q, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25257q;

        /* renamed from: r, reason: collision with root package name */
        private int f25258r;

        /* renamed from: s, reason: collision with root package name */
        private int f25259s;

        /* renamed from: t, reason: collision with root package name */
        private int f25260t;

        /* renamed from: u, reason: collision with root package name */
        private int f25261u;

        /* renamed from: v, reason: collision with root package name */
        private q f25262v;

        /* renamed from: w, reason: collision with root package name */
        private int f25263w;

        /* renamed from: x, reason: collision with root package name */
        private List<s> f25264x;

        /* renamed from: y, reason: collision with root package name */
        private q f25265y;

        /* renamed from: z, reason: collision with root package name */
        private int f25266z;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$n$a, reason: collision with other inner class name */
        static class C0330a extends kotlin.reflect.jvm.internal.impl.protobuf.b<n> {
            C0330a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public n b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new n(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<n, b> implements kotlin.reflect.jvm.internal.impl.metadata.n {
            private int D;
            private int E;

            /* renamed from: r, reason: collision with root package name */
            private int f25267r;

            /* renamed from: u, reason: collision with root package name */
            private int f25270u;

            /* renamed from: w, reason: collision with root package name */
            private int f25272w;

            /* renamed from: z, reason: collision with root package name */
            private int f25275z;

            /* renamed from: s, reason: collision with root package name */
            private int f25268s = 518;

            /* renamed from: t, reason: collision with root package name */
            private int f25269t = 2054;

            /* renamed from: v, reason: collision with root package name */
            private q f25271v = q.X();

            /* renamed from: x, reason: collision with root package name */
            private List<s> f25273x = Collections.emptyList();

            /* renamed from: y, reason: collision with root package name */
            private q f25274y = q.X();
            private List<q> A = Collections.emptyList();
            private List<Integer> B = Collections.emptyList();
            private u C = u.I();
            private List<Integer> F = Collections.emptyList();

            private b() {
            }

            private static b D() {
                return new b();
            }

            private void E() {
                if ((this.f25267r & 512) != 512) {
                    this.B = new ArrayList(this.B);
                    this.f25267r |= 512;
                }
            }

            private void F() {
                if ((this.f25267r & 256) != 256) {
                    this.A = new ArrayList(this.A);
                    this.f25267r |= 256;
                }
            }

            private void G() {
                if ((this.f25267r & 32) != 32) {
                    this.f25273x = new ArrayList(this.f25273x);
                    this.f25267r |= 32;
                }
            }

            private void I() {
                if ((this.f25267r & 8192) != 8192) {
                    this.F = new ArrayList(this.F);
                    this.f25267r |= 8192;
                }
            }

            private void b0() {
            }

            static b y() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public n build() {
                n B = B();
                if (B.l()) {
                    return B;
                }
                throw new UninitializedMessageException(B);
            }

            public n B() {
                n nVar = new n(this);
                int i5 = this.f25267r;
                int i6 = (i5 & 1) != 1 ? 0 : 1;
                nVar.f25259s = this.f25268s;
                if ((i5 & 2) == 2) {
                    i6 |= 2;
                }
                nVar.f25260t = this.f25269t;
                if ((i5 & 4) == 4) {
                    i6 |= 4;
                }
                nVar.f25261u = this.f25270u;
                if ((i5 & 8) == 8) {
                    i6 |= 8;
                }
                nVar.f25262v = this.f25271v;
                if ((i5 & 16) == 16) {
                    i6 |= 16;
                }
                nVar.f25263w = this.f25272w;
                if ((this.f25267r & 32) == 32) {
                    this.f25273x = Collections.unmodifiableList(this.f25273x);
                    this.f25267r &= -33;
                }
                nVar.f25264x = this.f25273x;
                if ((i5 & 64) == 64) {
                    i6 |= 32;
                }
                nVar.f25265y = this.f25274y;
                if ((i5 & 128) == 128) {
                    i6 |= 64;
                }
                nVar.f25266z = this.f25275z;
                if ((this.f25267r & 256) == 256) {
                    this.A = Collections.unmodifiableList(this.A);
                    this.f25267r &= -257;
                }
                nVar.A = this.A;
                if ((this.f25267r & 512) == 512) {
                    this.B = Collections.unmodifiableList(this.B);
                    this.f25267r &= -513;
                }
                nVar.B = this.B;
                if ((i5 & 1024) == 1024) {
                    i6 |= 128;
                }
                nVar.D = this.C;
                if ((i5 & 2048) == 2048) {
                    i6 |= 256;
                }
                nVar.E = this.D;
                if ((i5 & 4096) == 4096) {
                    i6 |= 512;
                }
                nVar.F = this.E;
                if ((this.f25267r & 8192) == 8192) {
                    this.F = Collections.unmodifiableList(this.F);
                    this.f25267r &= -8193;
                }
                nVar.G = this.F;
                nVar.f25258r = i6;
                return nVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(B());
            }

            public q J(int i5) {
                return this.A.get(i5);
            }

            public int K() {
                return this.A.size();
            }

            public n L() {
                return n.Y();
            }

            public q M() {
                return this.f25274y;
            }

            public q N() {
                return this.f25271v;
            }

            public u Q() {
                return this.C;
            }

            public s S(int i5) {
                return this.f25273x.get(i5);
            }

            public int T() {
                return this.f25273x.size();
            }

            public boolean V() {
                return (this.f25267r & 4) == 4;
            }

            public boolean W() {
                return (this.f25267r & 64) == 64;
            }

            public boolean Y() {
                return (this.f25267r & 8) == 8;
            }

            public boolean a0() {
                return (this.f25267r & 1024) == 1024;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: c0, reason: merged with bridge method [inline-methods] */
            public b j(n nVar) {
                if (nVar == n.Y()) {
                    return this;
                }
                if (nVar.p0()) {
                    i0(nVar.b0());
                }
                if (nVar.s0()) {
                    l0(nVar.e0());
                }
                if (nVar.r0()) {
                    k0(nVar.d0());
                }
                if (nVar.v0()) {
                    g0(nVar.h0());
                }
                if (nVar.w0()) {
                    n0(nVar.i0());
                }
                if (!nVar.f25264x.isEmpty()) {
                    if (this.f25273x.isEmpty()) {
                        this.f25273x = nVar.f25264x;
                        this.f25267r &= -33;
                    } else {
                        G();
                        this.f25273x.addAll(nVar.f25264x);
                    }
                }
                if (nVar.t0()) {
                    e0(nVar.f0());
                }
                if (nVar.u0()) {
                    m0(nVar.g0());
                }
                if (!nVar.A.isEmpty()) {
                    if (this.A.isEmpty()) {
                        this.A = nVar.A;
                        this.f25267r &= -257;
                    } else {
                        F();
                        this.A.addAll(nVar.A);
                    }
                }
                if (!nVar.B.isEmpty()) {
                    if (this.B.isEmpty()) {
                        this.B = nVar.B;
                        this.f25267r &= -513;
                    } else {
                        E();
                        this.B.addAll(nVar.B);
                    }
                }
                if (nVar.y0()) {
                    h0(nVar.k0());
                }
                if (nVar.q0()) {
                    j0(nVar.c0());
                }
                if (nVar.x0()) {
                    o0(nVar.j0());
                }
                if (!nVar.G.isEmpty()) {
                    if (this.F.isEmpty()) {
                        this.F = nVar.G;
                        this.f25267r &= -8193;
                    } else {
                        I();
                        this.F.addAll(nVar.G);
                    }
                }
                w(nVar);
                k(i().f(nVar.f25257q));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: d0, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.n.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$n> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.n.K     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$n r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.n) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$n r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.n) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.n.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$n$b");
            }

            public b e0(q qVar) {
                if ((this.f25267r & 64) != 64 || this.f25274y == q.X()) {
                    this.f25274y = qVar;
                } else {
                    this.f25274y = q.z0(this.f25274y).j(qVar).B();
                }
                this.f25267r |= 64;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public kotlin.reflect.jvm.internal.impl.protobuf.h m() {
                return n.Y();
            }

            public b g0(q qVar) {
                if ((this.f25267r & 8) != 8 || this.f25271v == q.X()) {
                    this.f25271v = qVar;
                } else {
                    this.f25271v = q.z0(this.f25271v).j(qVar).B();
                }
                this.f25267r |= 8;
                return this;
            }

            public b h0(u uVar) {
                if ((this.f25267r & 1024) != 1024 || this.C == u.I()) {
                    this.C = uVar;
                } else {
                    this.C = u.Y(this.C).j(uVar).B();
                }
                this.f25267r |= 1024;
                return this;
            }

            public b i0(int i5) {
                this.f25267r |= 1;
                this.f25268s = i5;
                return this;
            }

            public b j0(int i5) {
                this.f25267r |= 2048;
                this.D = i5;
                return this;
            }

            public b k0(int i5) {
                this.f25267r |= 4;
                this.f25270u = i5;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                if (!V()) {
                    return false;
                }
                if (Y() && !this.f25271v.l()) {
                    return false;
                }
                for (int i5 = 0; i5 < T(); i5++) {
                    if (!S(i5).l()) {
                        return false;
                    }
                }
                if (W() && !this.f25274y.l()) {
                    return false;
                }
                for (int i6 = 0; i6 < K(); i6++) {
                    if (!J(i6).l()) {
                        return false;
                    }
                }
                return (!a0() || this.C.l()) && v();
            }

            public b l0(int i5) {
                this.f25267r |= 2;
                this.f25269t = i5;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return n.Y();
            }

            public b m0(int i5) {
                this.f25267r |= 128;
                this.f25275z = i5;
                return this;
            }

            public b n0(int i5) {
                this.f25267r |= 16;
                this.f25272w = i5;
                return this;
            }

            public b o0(int i5) {
                this.f25267r |= 4096;
                this.E = i5;
                return this;
            }
        }

        static {
            n nVar = new n(true);
            J = nVar;
            nVar.z0();
        }

        public static b A0() {
            return b.y();
        }

        public static b B0(n nVar) {
            return b.y().j(nVar);
        }

        public static n Y() {
            return J;
        }

        private void z0() {
            this.f25259s = 518;
            this.f25260t = 2054;
            this.f25261u = 0;
            this.f25262v = q.X();
            this.f25263w = 0;
            this.f25264x = Collections.emptyList();
            this.f25265y = q.X();
            this.f25266z = 0;
            this.A = Collections.emptyList();
            this.B = Collections.emptyList();
            this.D = u.I();
            this.E = 0;
            this.F = 0;
            this.G = Collections.emptyList();
        }

        public b C0() {
            return b.y();
        }

        public b D0() {
            return B0(this);
        }

        public q U(int i5) {
            return this.A.get(i5);
        }

        public int V() {
            return this.A.size();
        }

        public List<Integer> W() {
            return this.B;
        }

        public List<q> X() {
            return this.A;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            h.d<MessageType>.a w5 = w();
            if ((this.f25258r & 2) == 2) {
                codedOutputStream.a0(1, this.f25260t);
            }
            if ((this.f25258r & 4) == 4) {
                codedOutputStream.a0(2, this.f25261u);
            }
            if ((this.f25258r & 8) == 8) {
                codedOutputStream.d0(3, this.f25262v);
            }
            for (int i5 = 0; i5 < this.f25264x.size(); i5++) {
                codedOutputStream.d0(4, this.f25264x.get(i5));
            }
            if ((this.f25258r & 32) == 32) {
                codedOutputStream.d0(5, this.f25265y);
            }
            if ((this.f25258r & 128) == 128) {
                codedOutputStream.d0(6, this.D);
            }
            if ((this.f25258r & 256) == 256) {
                codedOutputStream.a0(7, this.E);
            }
            if ((this.f25258r & 512) == 512) {
                codedOutputStream.a0(8, this.F);
            }
            if ((this.f25258r & 16) == 16) {
                codedOutputStream.a0(9, this.f25263w);
            }
            if ((this.f25258r & 64) == 64) {
                codedOutputStream.a0(10, this.f25266z);
            }
            if ((this.f25258r & 1) == 1) {
                codedOutputStream.a0(11, this.f25259s);
            }
            for (int i6 = 0; i6 < this.A.size(); i6++) {
                codedOutputStream.d0(12, this.A.get(i6));
            }
            if (this.B.size() > 0) {
                codedOutputStream.o0(106);
                codedOutputStream.o0(this.C);
            }
            for (int i7 = 0; i7 < this.B.size(); i7++) {
                codedOutputStream.b0(this.B.get(i7).intValue());
            }
            for (int i8 = 0; i8 < this.G.size(); i8++) {
                codedOutputStream.a0(31, this.G.get(i8).intValue());
            }
            w5.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f25257q);
        }

        public n a0() {
            return J;
        }

        public int b0() {
            return this.f25259s;
        }

        public int c0() {
            return this.E;
        }

        public int d0() {
            return this.f25261u;
        }

        public int e0() {
            return this.f25260t;
        }

        public q f0() {
            return this.f25265y;
        }

        public int g0() {
            return this.f25266z;
        }

        public q h0() {
            return this.f25262v;
        }

        public int i0() {
            return this.f25263w;
        }

        public int j0() {
            return this.F;
        }

        public u k0() {
            return this.D;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.H;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            if (!r0()) {
                this.H = (byte) 0;
                return false;
            }
            if (v0() && !this.f25262v.l()) {
                this.H = (byte) 0;
                return false;
            }
            for (int i5 = 0; i5 < m0(); i5++) {
                if (!l0(i5).l()) {
                    this.H = (byte) 0;
                    return false;
                }
            }
            if (t0() && !this.f25265y.l()) {
                this.H = (byte) 0;
                return false;
            }
            for (int i6 = 0; i6 < V(); i6++) {
                if (!U(i6).l()) {
                    this.H = (byte) 0;
                    return false;
                }
            }
            if (y0() && !this.D.l()) {
                this.H = (byte) 0;
                return false;
            }
            if (p()) {
                this.H = (byte) 1;
                return true;
            }
            this.H = (byte) 0;
            return false;
        }

        public s l0(int i5) {
            return this.f25264x.get(i5);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return J;
        }

        public int m0() {
            return this.f25264x.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return B0(this);
        }

        public List<s> n0() {
            return this.f25264x;
        }

        public List<Integer> o0() {
            return this.G;
        }

        public boolean p0() {
            return (this.f25258r & 1) == 1;
        }

        public boolean q0() {
            return (this.f25258r & 256) == 256;
        }

        public boolean r0() {
            return (this.f25258r & 4) == 4;
        }

        public boolean s0() {
            return (this.f25258r & 2) == 2;
        }

        public boolean t0() {
            return (this.f25258r & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.I;
            if (i5 != -1) {
                return i5;
            }
            int o5 = (this.f25258r & 2) == 2 ? CodedOutputStream.o(1, this.f25260t) + 0 : 0;
            if ((this.f25258r & 4) == 4) {
                o5 += CodedOutputStream.o(2, this.f25261u);
            }
            if ((this.f25258r & 8) == 8) {
                o5 += CodedOutputStream.s(3, this.f25262v);
            }
            for (int i6 = 0; i6 < this.f25264x.size(); i6++) {
                o5 += CodedOutputStream.s(4, this.f25264x.get(i6));
            }
            if ((this.f25258r & 32) == 32) {
                o5 += CodedOutputStream.s(5, this.f25265y);
            }
            if ((this.f25258r & 128) == 128) {
                o5 += CodedOutputStream.s(6, this.D);
            }
            if ((this.f25258r & 256) == 256) {
                o5 += CodedOutputStream.o(7, this.E);
            }
            if ((this.f25258r & 512) == 512) {
                o5 += CodedOutputStream.o(8, this.F);
            }
            if ((this.f25258r & 16) == 16) {
                o5 += CodedOutputStream.o(9, this.f25263w);
            }
            if ((this.f25258r & 64) == 64) {
                o5 += CodedOutputStream.o(10, this.f25266z);
            }
            if ((this.f25258r & 1) == 1) {
                o5 += CodedOutputStream.o(11, this.f25259s);
            }
            for (int i7 = 0; i7 < this.A.size(); i7++) {
                o5 += CodedOutputStream.s(12, this.A.get(i7));
            }
            int i8 = 0;
            for (int i9 = 0; i9 < this.B.size(); i9++) {
                i8 += CodedOutputStream.p(this.B.get(i9).intValue());
            }
            int i10 = o5 + i8;
            if (!this.B.isEmpty()) {
                i10 = i10 + 1 + CodedOutputStream.p(i8);
            }
            this.C = i8;
            int i11 = 0;
            for (int i12 = 0; i12 < this.G.size(); i12++) {
                i11 += CodedOutputStream.p(this.G.get(i12).intValue());
            }
            int size = this.f25257q.size() + (this.G.size() * 2) + i10 + i11 + q();
            this.I = size;
            return size;
        }

        public boolean u0() {
            return (this.f25258r & 64) == 64;
        }

        public boolean v0() {
            return (this.f25258r & 8) == 8;
        }

        public boolean w0() {
            return (this.f25258r & 16) == 16;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.y();
        }

        public boolean x0() {
            return (this.f25258r & 512) == 512;
        }

        public boolean y0() {
            return (this.f25258r & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<n> z() {
            return K;
        }

        private n(h.c<n, ?> cVar) {
            super(cVar);
            this.C = -1;
            this.H = (byte) -1;
            this.I = -1;
            this.f25257q = cVar.i();
        }

        private n(boolean z5) {
            this.C = -1;
            this.H = (byte) -1;
            this.I = -1;
            this.f25257q = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v14 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        private n(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.C = -1;
            this.H = (byte) -1;
            this.I = -1;
            z0();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J2 = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            char c6 = 0;
            while (true) {
                ?? r5 = 32;
                if (!z5) {
                    try {
                        try {
                            int K2 = eVar.K();
                            q.c cVar = null;
                            u.b bVar = null;
                            q.c cVar2 = null;
                            switch (K2) {
                                case 0:
                                    z5 = true;
                                case 8:
                                    this.f25258r |= 2;
                                    this.f25260t = eVar.A();
                                case 16:
                                    this.f25258r |= 4;
                                    this.f25261u = eVar.A();
                                case 26:
                                    if ((this.f25258r & 8) == 8) {
                                        q qVar = this.f25262v;
                                        qVar.getClass();
                                        cVar = q.z0(qVar);
                                    }
                                    q qVar2 = (q) eVar.u(q.J, fVar);
                                    this.f25262v = qVar2;
                                    if (cVar != null) {
                                        cVar.j(qVar2);
                                        this.f25262v = cVar.B();
                                    }
                                    this.f25258r |= 8;
                                case 34:
                                    int i5 = (c6 == true ? 1 : 0) & 32;
                                    c6 = c6;
                                    if (i5 != 32) {
                                        this.f25264x = new ArrayList();
                                        c6 = (c6 == true ? 1 : 0) | ' ';
                                    }
                                    this.f25264x.add(eVar.u(s.C, fVar));
                                case 42:
                                    if ((this.f25258r & 32) == 32) {
                                        q qVar3 = this.f25265y;
                                        qVar3.getClass();
                                        cVar2 = q.z0(qVar3);
                                    }
                                    q qVar4 = (q) eVar.u(q.J, fVar);
                                    this.f25265y = qVar4;
                                    if (cVar2 != null) {
                                        cVar2.j(qVar4);
                                        this.f25265y = cVar2.B();
                                    }
                                    this.f25258r |= 32;
                                case 50:
                                    if ((this.f25258r & 128) == 128) {
                                        u uVar = this.D;
                                        uVar.getClass();
                                        bVar = u.Y(uVar);
                                    }
                                    u uVar2 = (u) eVar.u(u.B, fVar);
                                    this.D = uVar2;
                                    if (bVar != null) {
                                        bVar.j(uVar2);
                                        this.D = bVar.B();
                                    }
                                    this.f25258r |= 128;
                                case 56:
                                    this.f25258r |= 256;
                                    this.E = eVar.A();
                                case 64:
                                    this.f25258r |= 512;
                                    this.F = eVar.A();
                                case 72:
                                    this.f25258r |= 16;
                                    this.f25263w = eVar.A();
                                case 80:
                                    this.f25258r |= 64;
                                    this.f25266z = eVar.A();
                                case 88:
                                    this.f25258r |= 1;
                                    this.f25259s = eVar.A();
                                case 98:
                                    int i6 = (c6 == true ? 1 : 0) & 256;
                                    c6 = c6;
                                    if (i6 != 256) {
                                        this.A = new ArrayList();
                                        c6 = (c6 == true ? 1 : 0) | 256;
                                    }
                                    this.A.add(eVar.u(q.J, fVar));
                                case 104:
                                    int i7 = (c6 == true ? 1 : 0) & 512;
                                    c6 = c6;
                                    if (i7 != 512) {
                                        this.B = new ArrayList();
                                        c6 = (c6 == true ? 1 : 0) | 512;
                                    }
                                    this.B.add(Integer.valueOf(eVar.A()));
                                case 106:
                                    int j5 = eVar.j(eVar.A());
                                    int i8 = (c6 == true ? 1 : 0) & 512;
                                    c6 = c6;
                                    if (i8 != 512) {
                                        c6 = c6;
                                        if (eVar.e() > 0) {
                                            this.B = new ArrayList();
                                            c6 = (c6 == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.B.add(Integer.valueOf(eVar.A()));
                                    }
                                    eVar.i(j5);
                                case 248:
                                    int i9 = (c6 == true ? 1 : 0) & 8192;
                                    c6 = c6;
                                    if (i9 != 8192) {
                                        this.G = new ArrayList();
                                        c6 = (c6 == true ? 1 : 0) | 8192;
                                    }
                                    this.G.add(Integer.valueOf(eVar.A()));
                                case o.f.f9513c /* 250 */:
                                    int j6 = eVar.j(eVar.A());
                                    int i10 = (c6 == true ? 1 : 0) & 8192;
                                    c6 = c6;
                                    if (i10 != 8192) {
                                        c6 = c6;
                                        if (eVar.e() > 0) {
                                            this.G = new ArrayList();
                                            c6 = (c6 == true ? 1 : 0) | 8192;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.G.add(Integer.valueOf(eVar.A()));
                                    }
                                    eVar.i(j6);
                                default:
                                    r5 = j(eVar, J2, fVar, K2);
                                    if (r5 == 0) {
                                        z5 = true;
                                    }
                            }
                        } catch (InvalidProtocolBufferException e6) {
                            throw e6.i(this);
                        } catch (IOException e7) {
                            throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                        }
                    } catch (Throwable th) {
                        if (((c6 == true ? 1 : 0) & 32) == r5) {
                            this.f25264x = Collections.unmodifiableList(this.f25264x);
                        }
                        if (((c6 == true ? 1 : 0) & 256) == 256) {
                            this.A = Collections.unmodifiableList(this.A);
                        }
                        if (((c6 == true ? 1 : 0) & 512) == 512) {
                            this.B = Collections.unmodifiableList(this.B);
                        }
                        if (((c6 == true ? 1 : 0) & 8192) == 8192) {
                            this.G = Collections.unmodifiableList(this.G);
                        }
                        try {
                            J2.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f25257q = x5.e();
                            throw th2;
                        }
                        this.f25257q = x5.e();
                        g();
                        throw th;
                    }
                } else {
                    if (((c6 == true ? 1 : 0) & 32) == 32) {
                        this.f25264x = Collections.unmodifiableList(this.f25264x);
                    }
                    if (((c6 == true ? 1 : 0) & 256) == 256) {
                        this.A = Collections.unmodifiableList(this.A);
                    }
                    if (((c6 == true ? 1 : 0) & 512) == 512) {
                        this.B = Collections.unmodifiableList(this.B);
                    }
                    if (((c6 == true ? 1 : 0) & 8192) == 8192) {
                        this.G = Collections.unmodifiableList(this.G);
                    }
                    try {
                        J2.I();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.f25257q = x5.e();
                        throw th3;
                    }
                    this.f25257q = x5.e();
                    g();
                    return;
                }
            }
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class p extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.q {

        /* renamed from: t, reason: collision with root package name */
        private static final p f25297t;

        /* renamed from: u, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<p> f25298u = new C0335a();

        /* renamed from: p, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25299p;

        /* renamed from: q, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.m f25300q;

        /* renamed from: r, reason: collision with root package name */
        private byte f25301r;

        /* renamed from: s, reason: collision with root package name */
        private int f25302s;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$p$a, reason: collision with other inner class name */
        static class C0335a extends kotlin.reflect.jvm.internal.impl.protobuf.b<p> {
            C0335a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public p b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new p(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.b<p, b> implements kotlin.reflect.jvm.internal.impl.metadata.q {

            /* renamed from: p, reason: collision with root package name */
            private int f25303p;

            /* renamed from: q, reason: collision with root package name */
            private kotlin.reflect.jvm.internal.impl.protobuf.m f25304q = kotlin.reflect.jvm.internal.impl.protobuf.l.f25754p;

            private b() {
            }

            private void A() {
            }

            static b o() {
                return new b();
            }

            private static b v() {
                return new b();
            }

            private void w() {
                if ((this.f25303p & 1) != 1) {
                    this.f25304q = new kotlin.reflect.jvm.internal.impl.protobuf.l(this.f25304q);
                    this.f25303p |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: B, reason: merged with bridge method [inline-methods] */
            public b j(p pVar) {
                if (pVar == p.r()) {
                    return this;
                }
                if (!pVar.f25300q.isEmpty()) {
                    if (this.f25304q.isEmpty()) {
                        this.f25304q = pVar.f25300q;
                        this.f25303p &= -2;
                    } else {
                        w();
                        this.f25304q.addAll(pVar.f25300q);
                    }
                }
                k(i().f(pVar.f25299p));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.p.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$p> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.p.f25298u     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$p r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.p) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$p r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.p) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.p.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$p$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public p m() {
                return p.r();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return p.r();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public p build() {
                p q5 = q();
                if (q5.l()) {
                    return q5;
                }
                throw new UninitializedMessageException(q5);
            }

            public p q() {
                p pVar = new p(this);
                if ((this.f25303p & 1) == 1) {
                    this.f25304q = this.f25304q.l();
                    this.f25303p &= -2;
                }
                pVar.f25300q = this.f25304q;
                return pVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(q());
            }

            public p y() {
                return p.r();
            }
        }

        static {
            p pVar = new p(true);
            f25297t = pVar;
            pVar.f25300q = kotlin.reflect.jvm.internal.impl.protobuf.l.f25754p;
        }

        public static b A(p pVar) {
            return b.o().j(pVar);
        }

        public static p r() {
            return f25297t;
        }

        private void w() {
            this.f25300q = kotlin.reflect.jvm.internal.impl.protobuf.l.f25754p;
        }

        public static b y() {
            return b.o();
        }

        public b B() {
            return b.o();
        }

        public b C() {
            return A(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            for (int i5 = 0; i5 < this.f25300q.size(); i5++) {
                codedOutputStream.O(1, this.f25300q.k(i5));
            }
            codedOutputStream.i0(this.f25299p);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.f25301r;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            this.f25301r = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return f25297t;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return A(this);
        }

        public p s() {
            return f25297t;
        }

        public String t(int i5) {
            return this.f25300q.get(i5);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.f25302s;
            if (i5 != -1) {
                return i5;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < this.f25300q.size(); i7++) {
                i6 += CodedOutputStream.e(this.f25300q.k(i7));
            }
            int size = this.f25299p.size() + (this.f25300q.size() * 1) + 0 + i6;
            this.f25302s = size;
            return size;
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.r v() {
            return this.f25300q;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.o();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<p> z() {
            return f25298u;
        }

        private p(h.b bVar) {
            super(bVar);
            this.f25301r = (byte) -1;
            this.f25302s = -1;
            this.f25299p = bVar.i();
        }

        private p(boolean z5) {
            this.f25301r = (byte) -1;
            this.f25302s = -1;
            this.f25299p = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        private p(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f25301r = (byte) -1;
            this.f25302s = -1;
            this.f25300q = kotlin.reflect.jvm.internal.impl.protobuf.l.f25754p;
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            boolean z6 = false;
            while (!z5) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K != 10) {
                                    if (!eVar.P(K, J)) {
                                    }
                                } else {
                                    kotlin.reflect.jvm.internal.impl.protobuf.d l5 = eVar.l();
                                    if (!(z6 & true)) {
                                        this.f25300q = new kotlin.reflect.jvm.internal.impl.protobuf.l();
                                        z6 |= true;
                                    }
                                    this.f25300q.i1(l5);
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
                    if (z6 & true) {
                        this.f25300q = this.f25300q.l();
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f25299p = x5.e();
                        throw th2;
                    }
                    this.f25299p = x5.e();
                    throw th;
                }
            }
            if (z6 & true) {
                this.f25300q = this.f25300q.l();
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25299p = x5.e();
                throw th3;
            }
            this.f25299p = x5.e();
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class r extends h.d<r> implements kotlin.reflect.jvm.internal.impl.metadata.s {
        private static final r D;
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<r> E = new C0340a();
        private List<Integer> A;
        private byte B;
        private int C;

        /* renamed from: q, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25337q;

        /* renamed from: r, reason: collision with root package name */
        private int f25338r;

        /* renamed from: s, reason: collision with root package name */
        private int f25339s;

        /* renamed from: t, reason: collision with root package name */
        private int f25340t;

        /* renamed from: u, reason: collision with root package name */
        private List<s> f25341u;

        /* renamed from: v, reason: collision with root package name */
        private q f25342v;

        /* renamed from: w, reason: collision with root package name */
        private int f25343w;

        /* renamed from: x, reason: collision with root package name */
        private q f25344x;

        /* renamed from: y, reason: collision with root package name */
        private int f25345y;

        /* renamed from: z, reason: collision with root package name */
        private List<b> f25346z;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$r$a, reason: collision with other inner class name */
        static class C0340a extends kotlin.reflect.jvm.internal.impl.protobuf.b<r> {
            C0340a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public r b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new r(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<r, b> implements kotlin.reflect.jvm.internal.impl.metadata.s {

            /* renamed from: r, reason: collision with root package name */
            private int f25347r;

            /* renamed from: t, reason: collision with root package name */
            private int f25349t;

            /* renamed from: w, reason: collision with root package name */
            private int f25352w;

            /* renamed from: y, reason: collision with root package name */
            private int f25354y;

            /* renamed from: s, reason: collision with root package name */
            private int f25348s = 6;

            /* renamed from: u, reason: collision with root package name */
            private List<s> f25350u = Collections.emptyList();

            /* renamed from: v, reason: collision with root package name */
            private q f25351v = q.X();

            /* renamed from: x, reason: collision with root package name */
            private q f25353x = q.X();

            /* renamed from: z, reason: collision with root package name */
            private List<b> f25355z = Collections.emptyList();
            private List<Integer> A = Collections.emptyList();

            private b() {
            }

            private static b D() {
                return new b();
            }

            private void E() {
                if ((this.f25347r & 128) != 128) {
                    this.f25355z = new ArrayList(this.f25355z);
                    this.f25347r |= 128;
                }
            }

            private void F() {
                if ((this.f25347r & 4) != 4) {
                    this.f25350u = new ArrayList(this.f25350u);
                    this.f25347r |= 4;
                }
            }

            private void G() {
                if ((this.f25347r & 256) != 256) {
                    this.A = new ArrayList(this.A);
                    this.f25347r |= 256;
                }
            }

            private void W() {
            }

            static b y() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public r build() {
                r B = B();
                if (B.l()) {
                    return B;
                }
                throw new UninitializedMessageException(B);
            }

            public r B() {
                r rVar = new r(this);
                int i5 = this.f25347r;
                int i6 = (i5 & 1) != 1 ? 0 : 1;
                rVar.f25339s = this.f25348s;
                if ((i5 & 2) == 2) {
                    i6 |= 2;
                }
                rVar.f25340t = this.f25349t;
                if ((this.f25347r & 4) == 4) {
                    this.f25350u = Collections.unmodifiableList(this.f25350u);
                    this.f25347r &= -5;
                }
                rVar.f25341u = this.f25350u;
                if ((i5 & 8) == 8) {
                    i6 |= 4;
                }
                rVar.f25342v = this.f25351v;
                if ((i5 & 16) == 16) {
                    i6 |= 8;
                }
                rVar.f25343w = this.f25352w;
                if ((i5 & 32) == 32) {
                    i6 |= 16;
                }
                rVar.f25344x = this.f25353x;
                if ((i5 & 64) == 64) {
                    i6 |= 32;
                }
                rVar.f25345y = this.f25354y;
                if ((this.f25347r & 128) == 128) {
                    this.f25355z = Collections.unmodifiableList(this.f25355z);
                    this.f25347r &= -129;
                }
                rVar.f25346z = this.f25355z;
                if ((this.f25347r & 256) == 256) {
                    this.A = Collections.unmodifiableList(this.A);
                    this.f25347r &= -257;
                }
                rVar.A = this.A;
                rVar.f25338r = i6;
                return rVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(B());
            }

            public b I(int i5) {
                return this.f25355z.get(i5);
            }

            public int J() {
                return this.f25355z.size();
            }

            public r K() {
                return r.R();
            }

            public q L() {
                return this.f25353x;
            }

            public s M(int i5) {
                return this.f25350u.get(i5);
            }

            public int N() {
                return this.f25350u.size();
            }

            public q Q() {
                return this.f25351v;
            }

            public boolean S() {
                return (this.f25347r & 32) == 32;
            }

            public boolean T() {
                return (this.f25347r & 2) == 2;
            }

            public boolean V() {
                return (this.f25347r & 8) == 8;
            }

            public b Y(q qVar) {
                if ((this.f25347r & 32) != 32 || this.f25353x == q.X()) {
                    this.f25353x = qVar;
                } else {
                    this.f25353x = q.z0(this.f25353x).j(qVar).B();
                }
                this.f25347r |= 32;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: a0, reason: merged with bridge method [inline-methods] */
            public b j(r rVar) {
                if (rVar == r.R()) {
                    return this;
                }
                if (rVar.g0()) {
                    e0(rVar.V());
                }
                if (rVar.h0()) {
                    g0(rVar.W());
                }
                if (!rVar.f25341u.isEmpty()) {
                    if (this.f25350u.isEmpty()) {
                        this.f25350u = rVar.f25341u;
                        this.f25347r &= -5;
                    } else {
                        F();
                        this.f25350u.addAll(rVar.f25341u);
                    }
                }
                if (rVar.i0()) {
                    c0(rVar.b0());
                }
                if (rVar.j0()) {
                    h0(rVar.c0());
                }
                if (rVar.e0()) {
                    Y(rVar.T());
                }
                if (rVar.f0()) {
                    d0(rVar.U());
                }
                if (!rVar.f25346z.isEmpty()) {
                    if (this.f25355z.isEmpty()) {
                        this.f25355z = rVar.f25346z;
                        this.f25347r &= -129;
                    } else {
                        E();
                        this.f25355z.addAll(rVar.f25346z);
                    }
                }
                if (!rVar.A.isEmpty()) {
                    if (this.A.isEmpty()) {
                        this.A = rVar.A;
                        this.f25347r &= -257;
                    } else {
                        G();
                        this.A.addAll(rVar.A);
                    }
                }
                w(rVar);
                k(i().f(rVar.f25337q));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: b0, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.r.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$r> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.r.E     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$r r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.r) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$r r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.r) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.r.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$r$b");
            }

            public b c0(q qVar) {
                if ((this.f25347r & 8) != 8 || this.f25351v == q.X()) {
                    this.f25351v = qVar;
                } else {
                    this.f25351v = q.z0(this.f25351v).j(qVar).B();
                }
                this.f25347r |= 8;
                return this;
            }

            public b d0(int i5) {
                this.f25347r |= 64;
                this.f25354y = i5;
                return this;
            }

            public b e0(int i5) {
                this.f25347r |= 1;
                this.f25348s = i5;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public kotlin.reflect.jvm.internal.impl.protobuf.h m() {
                return r.R();
            }

            public b g0(int i5) {
                this.f25347r |= 2;
                this.f25349t = i5;
                return this;
            }

            public b h0(int i5) {
                this.f25347r |= 16;
                this.f25352w = i5;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                if (!T()) {
                    return false;
                }
                for (int i5 = 0; i5 < N(); i5++) {
                    if (!M(i5).l()) {
                        return false;
                    }
                }
                if (V() && !this.f25351v.l()) {
                    return false;
                }
                if (S() && !this.f25353x.l()) {
                    return false;
                }
                for (int i6 = 0; i6 < J(); i6++) {
                    if (!I(i6).l()) {
                        return false;
                    }
                }
                return v();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return r.R();
            }
        }

        static {
            r rVar = new r(true);
            D = rVar;
            rVar.k0();
        }

        public static r R() {
            return D;
        }

        private void k0() {
            this.f25339s = 6;
            this.f25340t = 0;
            this.f25341u = Collections.emptyList();
            this.f25342v = q.X();
            this.f25343w = 0;
            this.f25344x = q.X();
            this.f25345y = 0;
            this.f25346z = Collections.emptyList();
            this.A = Collections.emptyList();
        }

        public static b l0() {
            return b.y();
        }

        public static b m0(r rVar) {
            return b.y().j(rVar);
        }

        public static r o0(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws IOException {
            return E.c(inputStream, fVar);
        }

        public b O(int i5) {
            return this.f25346z.get(i5);
        }

        public int P() {
            return this.f25346z.size();
        }

        public List<b> Q() {
            return this.f25346z;
        }

        public r S() {
            return D;
        }

        public q T() {
            return this.f25344x;
        }

        public int U() {
            return this.f25345y;
        }

        public int V() {
            return this.f25339s;
        }

        public int W() {
            return this.f25340t;
        }

        public s X(int i5) {
            return this.f25341u.get(i5);
        }

        public int Y() {
            return this.f25341u.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            h.d<MessageType>.a w5 = w();
            if ((this.f25338r & 1) == 1) {
                codedOutputStream.a0(1, this.f25339s);
            }
            if ((this.f25338r & 2) == 2) {
                codedOutputStream.a0(2, this.f25340t);
            }
            for (int i5 = 0; i5 < this.f25341u.size(); i5++) {
                codedOutputStream.d0(3, this.f25341u.get(i5));
            }
            if ((this.f25338r & 4) == 4) {
                codedOutputStream.d0(4, this.f25342v);
            }
            if ((this.f25338r & 8) == 8) {
                codedOutputStream.a0(5, this.f25343w);
            }
            if ((this.f25338r & 16) == 16) {
                codedOutputStream.d0(6, this.f25344x);
            }
            if ((this.f25338r & 32) == 32) {
                codedOutputStream.a0(7, this.f25345y);
            }
            for (int i6 = 0; i6 < this.f25346z.size(); i6++) {
                codedOutputStream.d0(8, this.f25346z.get(i6));
            }
            for (int i7 = 0; i7 < this.A.size(); i7++) {
                codedOutputStream.a0(31, this.A.get(i7).intValue());
            }
            w5.a(o.f.f9512b, codedOutputStream);
            codedOutputStream.i0(this.f25337q);
        }

        public List<s> a0() {
            return this.f25341u;
        }

        public q b0() {
            return this.f25342v;
        }

        public int c0() {
            return this.f25343w;
        }

        public List<Integer> d0() {
            return this.A;
        }

        public boolean e0() {
            return (this.f25338r & 16) == 16;
        }

        public boolean f0() {
            return (this.f25338r & 32) == 32;
        }

        public boolean g0() {
            return (this.f25338r & 1) == 1;
        }

        public boolean h0() {
            return (this.f25338r & 2) == 2;
        }

        public boolean i0() {
            return (this.f25338r & 4) == 4;
        }

        public boolean j0() {
            return (this.f25338r & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.B;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            if (!h0()) {
                this.B = (byte) 0;
                return false;
            }
            for (int i5 = 0; i5 < Y(); i5++) {
                if (!X(i5).l()) {
                    this.B = (byte) 0;
                    return false;
                }
            }
            if (i0() && !this.f25342v.l()) {
                this.B = (byte) 0;
                return false;
            }
            if (e0() && !this.f25344x.l()) {
                this.B = (byte) 0;
                return false;
            }
            for (int i6 = 0; i6 < P(); i6++) {
                if (!O(i6).l()) {
                    this.B = (byte) 0;
                    return false;
                }
            }
            if (p()) {
                this.B = (byte) 1;
                return true;
            }
            this.B = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return D;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return m0(this);
        }

        public b n0() {
            return b.y();
        }

        public b p0() {
            return m0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.C;
            if (i5 != -1) {
                return i5;
            }
            int o5 = (this.f25338r & 1) == 1 ? CodedOutputStream.o(1, this.f25339s) + 0 : 0;
            if ((this.f25338r & 2) == 2) {
                o5 += CodedOutputStream.o(2, this.f25340t);
            }
            for (int i6 = 0; i6 < this.f25341u.size(); i6++) {
                o5 += CodedOutputStream.s(3, this.f25341u.get(i6));
            }
            if ((this.f25338r & 4) == 4) {
                o5 += CodedOutputStream.s(4, this.f25342v);
            }
            if ((this.f25338r & 8) == 8) {
                o5 += CodedOutputStream.o(5, this.f25343w);
            }
            if ((this.f25338r & 16) == 16) {
                o5 += CodedOutputStream.s(6, this.f25344x);
            }
            if ((this.f25338r & 32) == 32) {
                o5 += CodedOutputStream.o(7, this.f25345y);
            }
            for (int i7 = 0; i7 < this.f25346z.size(); i7++) {
                o5 += CodedOutputStream.s(8, this.f25346z.get(i7));
            }
            int i8 = 0;
            for (int i9 = 0; i9 < this.A.size(); i9++) {
                i8 += CodedOutputStream.p(this.A.get(i9).intValue());
            }
            int size = this.f25337q.size() + (this.A.size() * 2) + o5 + i8 + q();
            this.C = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.y();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<r> z() {
            return E;
        }

        private r(h.c<r, ?> cVar) {
            super(cVar);
            this.B = (byte) -1;
            this.C = -1;
            this.f25337q = cVar.i();
        }

        private r(boolean z5) {
            this.B = (byte) -1;
            this.C = -1;
            this.f25337q = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        private r(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.B = (byte) -1;
            this.C = -1;
            k0();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            int i5 = 0;
            while (true) {
                ?? r5 = 4;
                if (!z5) {
                    try {
                        try {
                            int K = eVar.K();
                            q.c cVar = null;
                            switch (K) {
                                case 0:
                                    z5 = true;
                                case 8:
                                    this.f25338r |= 1;
                                    this.f25339s = eVar.A();
                                case 16:
                                    this.f25338r |= 2;
                                    this.f25340t = eVar.A();
                                case 26:
                                    if ((i5 & 4) != 4) {
                                        this.f25341u = new ArrayList();
                                        i5 |= 4;
                                    }
                                    this.f25341u.add(eVar.u(s.C, fVar));
                                case 34:
                                    if ((this.f25338r & 4) == 4) {
                                        q qVar = this.f25342v;
                                        qVar.getClass();
                                        cVar = q.z0(qVar);
                                    }
                                    q qVar2 = (q) eVar.u(q.J, fVar);
                                    this.f25342v = qVar2;
                                    if (cVar != null) {
                                        cVar.j(qVar2);
                                        this.f25342v = cVar.B();
                                    }
                                    this.f25338r |= 4;
                                case 40:
                                    this.f25338r |= 8;
                                    this.f25343w = eVar.A();
                                case 50:
                                    if ((this.f25338r & 16) == 16) {
                                        q qVar3 = this.f25344x;
                                        qVar3.getClass();
                                        cVar = q.z0(qVar3);
                                    }
                                    q qVar4 = (q) eVar.u(q.J, fVar);
                                    this.f25344x = qVar4;
                                    if (cVar != null) {
                                        cVar.j(qVar4);
                                        this.f25344x = cVar.B();
                                    }
                                    this.f25338r |= 16;
                                case 56:
                                    this.f25338r |= 32;
                                    this.f25345y = eVar.A();
                                case 66:
                                    if ((i5 & 128) != 128) {
                                        this.f25346z = new ArrayList();
                                        i5 |= 128;
                                    }
                                    this.f25346z.add(eVar.u(b.f25081w, fVar));
                                case 248:
                                    if ((i5 & 256) != 256) {
                                        this.A = new ArrayList();
                                        i5 |= 256;
                                    }
                                    this.A.add(Integer.valueOf(eVar.A()));
                                case o.f.f9513c /* 250 */:
                                    int j5 = eVar.j(eVar.A());
                                    if ((i5 & 256) != 256 && eVar.e() > 0) {
                                        this.A = new ArrayList();
                                        i5 |= 256;
                                    }
                                    while (eVar.e() > 0) {
                                        this.A.add(Integer.valueOf(eVar.A()));
                                    }
                                    eVar.i(j5);
                                    break;
                                default:
                                    r5 = j(eVar, J, fVar, K);
                                    if (r5 == 0) {
                                        z5 = true;
                                    }
                            }
                        } catch (Throwable th) {
                            if ((i5 & 4) == r5) {
                                this.f25341u = Collections.unmodifiableList(this.f25341u);
                            }
                            if ((i5 & 128) == 128) {
                                this.f25346z = Collections.unmodifiableList(this.f25346z);
                            }
                            if ((i5 & 256) == 256) {
                                this.A = Collections.unmodifiableList(this.A);
                            }
                            try {
                                J.I();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f25337q = x5.e();
                                throw th2;
                            }
                            this.f25337q = x5.e();
                            g();
                            throw th;
                        }
                    } catch (InvalidProtocolBufferException e6) {
                        throw e6.i(this);
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                    }
                } else {
                    if ((i5 & 4) == 4) {
                        this.f25341u = Collections.unmodifiableList(this.f25341u);
                    }
                    if ((i5 & 128) == 128) {
                        this.f25346z = Collections.unmodifiableList(this.f25346z);
                    }
                    if ((i5 & 256) == 256) {
                        this.A = Collections.unmodifiableList(this.A);
                    }
                    try {
                        J.I();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.f25337q = x5.e();
                        throw th3;
                    }
                    this.f25337q = x5.e();
                    g();
                    return;
                }
            }
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class s extends h.d<s> implements kotlin.reflect.jvm.internal.impl.metadata.u {
        private static final s B;
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<s> C = new C0341a();
        private int A;

        /* renamed from: q, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25356q;

        /* renamed from: r, reason: collision with root package name */
        private int f25357r;

        /* renamed from: s, reason: collision with root package name */
        private int f25358s;

        /* renamed from: t, reason: collision with root package name */
        private int f25359t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f25360u;

        /* renamed from: v, reason: collision with root package name */
        private c f25361v;

        /* renamed from: w, reason: collision with root package name */
        private List<q> f25362w;

        /* renamed from: x, reason: collision with root package name */
        private List<Integer> f25363x;

        /* renamed from: y, reason: collision with root package name */
        private int f25364y;

        /* renamed from: z, reason: collision with root package name */
        private byte f25365z;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$s$a, reason: collision with other inner class name */
        static class C0341a extends kotlin.reflect.jvm.internal.impl.protobuf.b<s> {
            C0341a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public s b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new s(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<s, b> implements kotlin.reflect.jvm.internal.impl.metadata.u {

            /* renamed from: r, reason: collision with root package name */
            private int f25366r;

            /* renamed from: s, reason: collision with root package name */
            private int f25367s;

            /* renamed from: t, reason: collision with root package name */
            private int f25368t;

            /* renamed from: u, reason: collision with root package name */
            private boolean f25369u;

            /* renamed from: v, reason: collision with root package name */
            private c f25370v = c.INV;

            /* renamed from: w, reason: collision with root package name */
            private List<q> f25371w = Collections.emptyList();

            /* renamed from: x, reason: collision with root package name */
            private List<Integer> f25372x = Collections.emptyList();

            private b() {
            }

            private static b D() {
                return new b();
            }

            private void E() {
                if ((this.f25366r & 32) != 32) {
                    this.f25372x = new ArrayList(this.f25372x);
                    this.f25366r |= 32;
                }
            }

            private void F() {
                if ((this.f25366r & 16) != 16) {
                    this.f25371w = new ArrayList(this.f25371w);
                    this.f25366r |= 16;
                }
            }

            private void M() {
            }

            static b y() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public s build() {
                s B = B();
                if (B.l()) {
                    return B;
                }
                throw new UninitializedMessageException(B);
            }

            public s B() {
                s sVar = new s(this);
                int i5 = this.f25366r;
                int i6 = (i5 & 1) != 1 ? 0 : 1;
                sVar.f25358s = this.f25367s;
                if ((i5 & 2) == 2) {
                    i6 |= 2;
                }
                sVar.f25359t = this.f25368t;
                if ((i5 & 4) == 4) {
                    i6 |= 4;
                }
                sVar.f25360u = this.f25369u;
                if ((i5 & 8) == 8) {
                    i6 |= 8;
                }
                sVar.f25361v = this.f25370v;
                if ((this.f25366r & 16) == 16) {
                    this.f25371w = Collections.unmodifiableList(this.f25371w);
                    this.f25366r &= -17;
                }
                sVar.f25362w = this.f25371w;
                if ((this.f25366r & 32) == 32) {
                    this.f25372x = Collections.unmodifiableList(this.f25372x);
                    this.f25366r &= -33;
                }
                sVar.f25363x = this.f25372x;
                sVar.f25357r = i6;
                return sVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(B());
            }

            public s G() {
                return s.K();
            }

            public q I(int i5) {
                return this.f25371w.get(i5);
            }

            public int J() {
                return this.f25371w.size();
            }

            public boolean K() {
                return (this.f25366r & 1) == 1;
            }

            public boolean L() {
                return (this.f25366r & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: N, reason: merged with bridge method [inline-methods] */
            public b j(s sVar) {
                if (sVar == s.K()) {
                    return this;
                }
                if (sVar.U()) {
                    S(sVar.M());
                }
                if (sVar.V()) {
                    T(sVar.N());
                }
                if (sVar.W()) {
                    V(sVar.O());
                }
                if (sVar.X()) {
                    W(sVar.T());
                }
                if (!sVar.f25362w.isEmpty()) {
                    if (this.f25371w.isEmpty()) {
                        this.f25371w = sVar.f25362w;
                        this.f25366r &= -17;
                    } else {
                        F();
                        this.f25371w.addAll(sVar.f25362w);
                    }
                }
                if (!sVar.f25363x.isEmpty()) {
                    if (this.f25372x.isEmpty()) {
                        this.f25372x = sVar.f25363x;
                        this.f25366r &= -33;
                    } else {
                        E();
                        this.f25372x.addAll(sVar.f25363x);
                    }
                }
                w(sVar);
                k(i().f(sVar.f25356q));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: Q, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.s.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$s> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.s.C     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$s r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.s) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$s r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.s) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.s.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$s$b");
            }

            public b S(int i5) {
                this.f25366r |= 1;
                this.f25367s = i5;
                return this;
            }

            public b T(int i5) {
                this.f25366r |= 2;
                this.f25368t = i5;
                return this;
            }

            public b V(boolean z5) {
                this.f25366r |= 4;
                this.f25369u = z5;
                return this;
            }

            public b W(c cVar) {
                cVar.getClass();
                this.f25366r |= 8;
                this.f25370v = cVar;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public kotlin.reflect.jvm.internal.impl.protobuf.h m() {
                return s.K();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                if (!K() || !L()) {
                    return false;
                }
                for (int i5 = 0; i5 < J(); i5++) {
                    if (!I(i5).l()) {
                        return false;
                    }
                }
                return v();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return s.K();
            }
        }

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes5.dex */
        public enum c implements i.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2);

            private static i.b<c> internalValueMap = new C0342a();
            private final int value;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$s$c$a, reason: collision with other inner class name */
            static class C0342a implements i.b<c> {
                C0342a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                public c a(int i5) {
                    return c.valueOf(i5);
                }

                public c b(int i5) {
                    return c.valueOf(i5);
                }
            }

            c(int i5, int i6) {
                this.value = i6;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.value;
            }

            public static c valueOf(int i5) {
                if (i5 == 0) {
                    return IN;
                }
                if (i5 == 1) {
                    return OUT;
                }
                if (i5 != 2) {
                    return null;
                }
                return INV;
            }
        }

        static {
            s sVar = new s(true);
            B = sVar;
            sVar.Y();
        }

        public static s K() {
            return B;
        }

        private void Y() {
            this.f25358s = 0;
            this.f25359t = 0;
            this.f25360u = false;
            this.f25361v = c.INV;
            this.f25362w = Collections.emptyList();
            this.f25363x = Collections.emptyList();
        }

        public static b a0() {
            return b.y();
        }

        public static b b0(s sVar) {
            return b.y().j(sVar);
        }

        public s L() {
            return B;
        }

        public int M() {
            return this.f25358s;
        }

        public int N() {
            return this.f25359t;
        }

        public boolean O() {
            return this.f25360u;
        }

        public q P(int i5) {
            return this.f25362w.get(i5);
        }

        public int Q() {
            return this.f25362w.size();
        }

        public List<Integer> R() {
            return this.f25363x;
        }

        public List<q> S() {
            return this.f25362w;
        }

        public c T() {
            return this.f25361v;
        }

        public boolean U() {
            return (this.f25357r & 1) == 1;
        }

        public boolean V() {
            return (this.f25357r & 2) == 2;
        }

        public boolean W() {
            return (this.f25357r & 4) == 4;
        }

        public boolean X() {
            return (this.f25357r & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            h.d<MessageType>.a w5 = w();
            if ((this.f25357r & 1) == 1) {
                codedOutputStream.a0(1, this.f25358s);
            }
            if ((this.f25357r & 2) == 2) {
                codedOutputStream.a0(2, this.f25359t);
            }
            if ((this.f25357r & 4) == 4) {
                codedOutputStream.L(3, this.f25360u);
            }
            if ((this.f25357r & 8) == 8) {
                codedOutputStream.S(4, this.f25361v.getNumber());
            }
            for (int i5 = 0; i5 < this.f25362w.size(); i5++) {
                codedOutputStream.d0(5, this.f25362w.get(i5));
            }
            if (this.f25363x.size() > 0) {
                codedOutputStream.o0(50);
                codedOutputStream.o0(this.f25364y);
            }
            for (int i6 = 0; i6 < this.f25363x.size(); i6++) {
                codedOutputStream.b0(this.f25363x.get(i6).intValue());
            }
            w5.a(1000, codedOutputStream);
            codedOutputStream.i0(this.f25356q);
        }

        public b c0() {
            return b.y();
        }

        public b d0() {
            return b0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.f25365z;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            if (!U()) {
                this.f25365z = (byte) 0;
                return false;
            }
            if (!V()) {
                this.f25365z = (byte) 0;
                return false;
            }
            for (int i5 = 0; i5 < Q(); i5++) {
                if (!P(i5).l()) {
                    this.f25365z = (byte) 0;
                    return false;
                }
            }
            if (p()) {
                this.f25365z = (byte) 1;
                return true;
            }
            this.f25365z = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return B;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return b0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.A;
            if (i5 != -1) {
                return i5;
            }
            int o5 = (this.f25357r & 1) == 1 ? CodedOutputStream.o(1, this.f25358s) + 0 : 0;
            if ((this.f25357r & 2) == 2) {
                o5 += CodedOutputStream.o(2, this.f25359t);
            }
            if ((this.f25357r & 4) == 4) {
                o5 += CodedOutputStream.a(3, this.f25360u);
            }
            if ((this.f25357r & 8) == 8) {
                o5 += CodedOutputStream.h(4, this.f25361v.getNumber());
            }
            for (int i6 = 0; i6 < this.f25362w.size(); i6++) {
                o5 += CodedOutputStream.s(5, this.f25362w.get(i6));
            }
            int i7 = 0;
            for (int i8 = 0; i8 < this.f25363x.size(); i8++) {
                i7 += CodedOutputStream.p(this.f25363x.get(i8).intValue());
            }
            int i9 = o5 + i7;
            if (!this.f25363x.isEmpty()) {
                i9 = i9 + 1 + CodedOutputStream.p(i7);
            }
            this.f25364y = i7;
            int size = this.f25356q.size() + i9 + q();
            this.A = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.y();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<s> z() {
            return C;
        }

        private s(h.c<s, ?> cVar) {
            super(cVar);
            this.f25364y = -1;
            this.f25365z = (byte) -1;
            this.A = -1;
            this.f25356q = cVar.i();
        }

        private s(boolean z5) {
            this.f25364y = -1;
            this.f25365z = (byte) -1;
            this.A = -1;
            this.f25356q = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private s(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f25364y = -1;
            this.f25365z = (byte) -1;
            this.A = -1;
            Y();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            int i5 = 0;
            while (!z5) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K == 8) {
                                    this.f25357r |= 1;
                                    this.f25358s = eVar.A();
                                } else if (K == 16) {
                                    this.f25357r |= 2;
                                    this.f25359t = eVar.A();
                                } else if (K == 24) {
                                    this.f25357r |= 4;
                                    this.f25360u = eVar.k();
                                } else if (K == 32) {
                                    int A = eVar.A();
                                    c valueOf = c.valueOf(A);
                                    if (valueOf == null) {
                                        J.o0(K);
                                        J.o0(A);
                                    } else {
                                        this.f25357r |= 8;
                                        this.f25361v = valueOf;
                                    }
                                } else if (K == 42) {
                                    if ((i5 & 16) != 16) {
                                        this.f25362w = new ArrayList();
                                        i5 |= 16;
                                    }
                                    this.f25362w.add(eVar.u(q.J, fVar));
                                } else if (K == 48) {
                                    if ((i5 & 32) != 32) {
                                        this.f25363x = new ArrayList();
                                        i5 |= 32;
                                    }
                                    this.f25363x.add(Integer.valueOf(eVar.A()));
                                } else if (K != 50) {
                                    if (!j(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    int j5 = eVar.j(eVar.A());
                                    if ((i5 & 32) != 32 && eVar.e() > 0) {
                                        this.f25363x = new ArrayList();
                                        i5 |= 32;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f25363x.add(Integer.valueOf(eVar.A()));
                                    }
                                    eVar.i(j5);
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
                    if ((i5 & 16) == 16) {
                        this.f25362w = Collections.unmodifiableList(this.f25362w);
                    }
                    if ((i5 & 32) == 32) {
                        this.f25363x = Collections.unmodifiableList(this.f25363x);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f25356q = x5.e();
                        throw th2;
                    }
                    this.f25356q = x5.e();
                    g();
                    throw th;
                }
            }
            if ((i5 & 16) == 16) {
                this.f25362w = Collections.unmodifiableList(this.f25362w);
            }
            if ((i5 & 32) == 32) {
                this.f25363x = Collections.unmodifiableList(this.f25363x);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25356q = x5.e();
                throw th3;
            }
            this.f25356q = x5.e();
            g();
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class t extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.v {

        /* renamed from: v, reason: collision with root package name */
        private static final t f25373v;

        /* renamed from: w, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<t> f25374w = new C0343a();

        /* renamed from: p, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25375p;

        /* renamed from: q, reason: collision with root package name */
        private int f25376q;

        /* renamed from: r, reason: collision with root package name */
        private List<q> f25377r;

        /* renamed from: s, reason: collision with root package name */
        private int f25378s;

        /* renamed from: t, reason: collision with root package name */
        private byte f25379t;

        /* renamed from: u, reason: collision with root package name */
        private int f25380u;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$t$a, reason: collision with other inner class name */
        static class C0343a extends kotlin.reflect.jvm.internal.impl.protobuf.b<t> {
            C0343a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public t b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new t(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.b<t, b> implements kotlin.reflect.jvm.internal.impl.metadata.v {

            /* renamed from: p, reason: collision with root package name */
            private int f25381p;

            /* renamed from: q, reason: collision with root package name */
            private List<q> f25382q = Collections.emptyList();

            /* renamed from: r, reason: collision with root package name */
            private int f25383r = -1;

            private b() {
            }

            private void C() {
            }

            static b o() {
                return new b();
            }

            private static b v() {
                return new b();
            }

            private void w() {
                if ((this.f25381p & 1) != 1) {
                    this.f25382q = new ArrayList(this.f25382q);
                    this.f25381p |= 1;
                }
            }

            public q A(int i5) {
                return this.f25382q.get(i5);
            }

            public int B() {
                return this.f25382q.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            public b j(t tVar) {
                if (tVar == t.t()) {
                    return this;
                }
                if (!tVar.f25377r.isEmpty()) {
                    if (this.f25382q.isEmpty()) {
                        this.f25382q = tVar.f25377r;
                        this.f25381p &= -2;
                    } else {
                        w();
                        this.f25382q.addAll(tVar.f25377r);
                    }
                }
                if (tVar.C()) {
                    F(tVar.w());
                }
                k(i().f(tVar.f25375p));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.t.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$t> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.t.f25374w     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$t r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.t) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$t r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.t) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.t.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$t$b");
            }

            public b F(int i5) {
                this.f25381p |= 2;
                this.f25383r = i5;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public t m() {
                return t.t();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                for (int i5 = 0; i5 < B(); i5++) {
                    if (!A(i5).l()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return t.t();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public t build() {
                t q5 = q();
                if (q5.l()) {
                    return q5;
                }
                throw new UninitializedMessageException(q5);
            }

            public t q() {
                t tVar = new t(this);
                int i5 = this.f25381p;
                if ((i5 & 1) == 1) {
                    this.f25382q = Collections.unmodifiableList(this.f25382q);
                    this.f25381p &= -2;
                }
                tVar.f25377r = this.f25382q;
                int i6 = (i5 & 2) != 2 ? 0 : 1;
                tVar.f25378s = this.f25383r;
                tVar.f25376q = i6;
                return tVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(q());
            }

            public t y() {
                return t.t();
            }
        }

        static {
            t tVar = new t(true);
            f25373v = tVar;
            tVar.D();
        }

        private void D() {
            this.f25377r = Collections.emptyList();
            this.f25378s = -1;
        }

        public static b E() {
            return b.o();
        }

        public static b F(t tVar) {
            return b.o().j(tVar);
        }

        public static t t() {
            return f25373v;
        }

        public int A() {
            return this.f25377r.size();
        }

        public List<q> B() {
            return this.f25377r;
        }

        public boolean C() {
            return (this.f25376q & 1) == 1;
        }

        public b G() {
            return b.o();
        }

        public b H() {
            return F(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            for (int i5 = 0; i5 < this.f25377r.size(); i5++) {
                codedOutputStream.d0(1, this.f25377r.get(i5));
            }
            if ((this.f25376q & 1) == 1) {
                codedOutputStream.a0(2, this.f25378s);
            }
            codedOutputStream.i0(this.f25375p);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.f25379t;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            for (int i5 = 0; i5 < A(); i5++) {
                if (!y(i5).l()) {
                    this.f25379t = (byte) 0;
                    return false;
                }
            }
            this.f25379t = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return f25373v;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return F(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.f25380u;
            if (i5 != -1) {
                return i5;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < this.f25377r.size(); i7++) {
                i6 += CodedOutputStream.s(1, this.f25377r.get(i7));
            }
            if ((this.f25376q & 1) == 1) {
                i6 += CodedOutputStream.o(2, this.f25378s);
            }
            int size = this.f25375p.size() + i6;
            this.f25380u = size;
            return size;
        }

        public t v() {
            return f25373v;
        }

        public int w() {
            return this.f25378s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.o();
        }

        public q y(int i5) {
            return this.f25377r.get(i5);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<t> z() {
            return f25374w;
        }

        private t(h.b bVar) {
            super(bVar);
            this.f25379t = (byte) -1;
            this.f25380u = -1;
            this.f25375p = bVar.i();
        }

        private t(boolean z5) {
            this.f25379t = (byte) -1;
            this.f25380u = -1;
            this.f25375p = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private t(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f25379t = (byte) -1;
            this.f25380u = -1;
            D();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            boolean z6 = false;
            while (!z5) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 10) {
                                if (!(z6 & true)) {
                                    this.f25377r = new ArrayList();
                                    z6 |= true;
                                }
                                this.f25377r.add(eVar.u(q.J, fVar));
                            } else if (K != 16) {
                                if (!eVar.P(K, J)) {
                                }
                            } else {
                                this.f25376q |= 1;
                                this.f25378s = eVar.A();
                            }
                        }
                        z5 = true;
                    } catch (InvalidProtocolBufferException e6) {
                        throw e6.i(this);
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if (z6 & true) {
                        this.f25377r = Collections.unmodifiableList(this.f25377r);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f25375p = x5.e();
                        throw th2;
                    }
                    this.f25375p = x5.e();
                    throw th;
                }
            }
            if (z6 & true) {
                this.f25377r = Collections.unmodifiableList(this.f25377r);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25375p = x5.e();
                throw th3;
            }
            this.f25375p = x5.e();
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class u extends h.d<u> implements kotlin.reflect.jvm.internal.impl.metadata.w {
        private static final u A;
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<u> B = new C0344a();

        /* renamed from: q, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25384q;

        /* renamed from: r, reason: collision with root package name */
        private int f25385r;

        /* renamed from: s, reason: collision with root package name */
        private int f25386s;

        /* renamed from: t, reason: collision with root package name */
        private int f25387t;

        /* renamed from: u, reason: collision with root package name */
        private q f25388u;

        /* renamed from: v, reason: collision with root package name */
        private int f25389v;

        /* renamed from: w, reason: collision with root package name */
        private q f25390w;

        /* renamed from: x, reason: collision with root package name */
        private int f25391x;

        /* renamed from: y, reason: collision with root package name */
        private byte f25392y;

        /* renamed from: z, reason: collision with root package name */
        private int f25393z;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$u$a, reason: collision with other inner class name */
        static class C0344a extends kotlin.reflect.jvm.internal.impl.protobuf.b<u> {
            C0344a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public u b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new u(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.c<u, b> implements kotlin.reflect.jvm.internal.impl.metadata.w {

            /* renamed from: r, reason: collision with root package name */
            private int f25394r;

            /* renamed from: s, reason: collision with root package name */
            private int f25395s;

            /* renamed from: t, reason: collision with root package name */
            private int f25396t;

            /* renamed from: v, reason: collision with root package name */
            private int f25398v;

            /* renamed from: x, reason: collision with root package name */
            private int f25400x;

            /* renamed from: u, reason: collision with root package name */
            private q f25397u = q.X();

            /* renamed from: w, reason: collision with root package name */
            private q f25399w = q.X();

            private b() {
            }

            private static b D() {
                return new b();
            }

            private void L() {
            }

            static b y() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public u build() {
                u B = B();
                if (B.l()) {
                    return B;
                }
                throw new UninitializedMessageException(B);
            }

            public u B() {
                u uVar = new u(this);
                int i5 = this.f25394r;
                int i6 = (i5 & 1) != 1 ? 0 : 1;
                uVar.f25386s = this.f25395s;
                if ((i5 & 2) == 2) {
                    i6 |= 2;
                }
                uVar.f25387t = this.f25396t;
                if ((i5 & 4) == 4) {
                    i6 |= 4;
                }
                uVar.f25388u = this.f25397u;
                if ((i5 & 8) == 8) {
                    i6 |= 8;
                }
                uVar.f25389v = this.f25398v;
                if ((i5 & 16) == 16) {
                    i6 |= 16;
                }
                uVar.f25390w = this.f25399w;
                if ((i5 & 32) == 32) {
                    i6 |= 32;
                }
                uVar.f25391x = this.f25400x;
                uVar.f25385r = i6;
                return uVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(B());
            }

            public u E() {
                return u.I();
            }

            public q F() {
                return this.f25397u;
            }

            public q G() {
                return this.f25399w;
            }

            public boolean I() {
                return (this.f25394r & 2) == 2;
            }

            public boolean J() {
                return (this.f25394r & 4) == 4;
            }

            public boolean K() {
                return (this.f25394r & 16) == 16;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: M, reason: merged with bridge method [inline-methods] */
            public b j(u uVar) {
                if (uVar == u.I()) {
                    return this;
                }
                if (uVar.Q()) {
                    T(uVar.K());
                }
                if (uVar.R()) {
                    V(uVar.L());
                }
                if (uVar.S()) {
                    Q(uVar.M());
                }
                if (uVar.T()) {
                    W(uVar.N());
                }
                if (uVar.U()) {
                    S(uVar.O());
                }
                if (uVar.V()) {
                    Y(uVar.P());
                }
                w(uVar);
                k(i().f(uVar.f25384q));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: N, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.u.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$u> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.u.B     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$u r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.u) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$u r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.u) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.u.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$u$b");
            }

            public b Q(q qVar) {
                if ((this.f25394r & 4) != 4 || this.f25397u == q.X()) {
                    this.f25397u = qVar;
                } else {
                    this.f25397u = q.z0(this.f25397u).j(qVar).B();
                }
                this.f25394r |= 4;
                return this;
            }

            public b S(q qVar) {
                if ((this.f25394r & 16) != 16 || this.f25399w == q.X()) {
                    this.f25399w = qVar;
                } else {
                    this.f25399w = q.z0(this.f25399w).j(qVar).B();
                }
                this.f25394r |= 16;
                return this;
            }

            public b T(int i5) {
                this.f25394r |= 1;
                this.f25395s = i5;
                return this;
            }

            public b V(int i5) {
                this.f25394r |= 2;
                this.f25396t = i5;
                return this;
            }

            public b W(int i5) {
                this.f25394r |= 8;
                this.f25398v = i5;
                return this;
            }

            public b Y(int i5) {
                this.f25394r |= 32;
                this.f25400x = i5;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public kotlin.reflect.jvm.internal.impl.protobuf.h m() {
                return u.I();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                if (!I()) {
                    return false;
                }
                if (!J() || this.f25397u.l()) {
                    return (!K() || this.f25399w.l()) && v();
                }
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return u.I();
            }
        }

        static {
            u uVar = new u(true);
            A = uVar;
            uVar.W();
        }

        public static u I() {
            return A;
        }

        private void W() {
            this.f25386s = 0;
            this.f25387t = 0;
            this.f25388u = q.X();
            this.f25389v = 0;
            this.f25390w = q.X();
            this.f25391x = 0;
        }

        public static b X() {
            return b.y();
        }

        public static b Y(u uVar) {
            return b.y().j(uVar);
        }

        public u J() {
            return A;
        }

        public int K() {
            return this.f25386s;
        }

        public int L() {
            return this.f25387t;
        }

        public q M() {
            return this.f25388u;
        }

        public int N() {
            return this.f25389v;
        }

        public q O() {
            return this.f25390w;
        }

        public int P() {
            return this.f25391x;
        }

        public boolean Q() {
            return (this.f25385r & 1) == 1;
        }

        public boolean R() {
            return (this.f25385r & 2) == 2;
        }

        public boolean S() {
            return (this.f25385r & 4) == 4;
        }

        public boolean T() {
            return (this.f25385r & 8) == 8;
        }

        public boolean U() {
            return (this.f25385r & 16) == 16;
        }

        public boolean V() {
            return (this.f25385r & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            h.d<MessageType>.a w5 = w();
            if ((this.f25385r & 1) == 1) {
                codedOutputStream.a0(1, this.f25386s);
            }
            if ((this.f25385r & 2) == 2) {
                codedOutputStream.a0(2, this.f25387t);
            }
            if ((this.f25385r & 4) == 4) {
                codedOutputStream.d0(3, this.f25388u);
            }
            if ((this.f25385r & 16) == 16) {
                codedOutputStream.d0(4, this.f25390w);
            }
            if ((this.f25385r & 8) == 8) {
                codedOutputStream.a0(5, this.f25389v);
            }
            if ((this.f25385r & 32) == 32) {
                codedOutputStream.a0(6, this.f25391x);
            }
            w5.a(o.f.f9512b, codedOutputStream);
            codedOutputStream.i0(this.f25384q);
        }

        public b a0() {
            return b.y();
        }

        public b b0() {
            return Y(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.f25392y;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            if (!R()) {
                this.f25392y = (byte) 0;
                return false;
            }
            if (S() && !this.f25388u.l()) {
                this.f25392y = (byte) 0;
                return false;
            }
            if (U() && !this.f25390w.l()) {
                this.f25392y = (byte) 0;
                return false;
            }
            if (p()) {
                this.f25392y = (byte) 1;
                return true;
            }
            this.f25392y = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return A;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return Y(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.f25393z;
            if (i5 != -1) {
                return i5;
            }
            int o5 = (this.f25385r & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f25386s) : 0;
            if ((this.f25385r & 2) == 2) {
                o5 += CodedOutputStream.o(2, this.f25387t);
            }
            if ((this.f25385r & 4) == 4) {
                o5 += CodedOutputStream.s(3, this.f25388u);
            }
            if ((this.f25385r & 16) == 16) {
                o5 += CodedOutputStream.s(4, this.f25390w);
            }
            if ((this.f25385r & 8) == 8) {
                o5 += CodedOutputStream.o(5, this.f25389v);
            }
            if ((this.f25385r & 32) == 32) {
                o5 += CodedOutputStream.o(6, this.f25391x);
            }
            int size = this.f25384q.size() + o5 + q();
            this.f25393z = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.y();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<u> z() {
            return B;
        }

        private u(h.c<u, ?> cVar) {
            super(cVar);
            this.f25392y = (byte) -1;
            this.f25393z = -1;
            this.f25384q = cVar.i();
        }

        private u(boolean z5) {
            this.f25392y = (byte) -1;
            this.f25393z = -1;
            this.f25384q = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        private u(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f25392y = (byte) -1;
            this.f25393z = -1;
            W();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            while (!z5) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K == 8) {
                                    this.f25385r |= 1;
                                    this.f25386s = eVar.A();
                                } else if (K != 16) {
                                    q.c cVar = null;
                                    if (K == 26) {
                                        if ((this.f25385r & 4) == 4) {
                                            q qVar = this.f25388u;
                                            qVar.getClass();
                                            cVar = q.z0(qVar);
                                        }
                                        q qVar2 = (q) eVar.u(q.J, fVar);
                                        this.f25388u = qVar2;
                                        if (cVar != null) {
                                            cVar.j(qVar2);
                                            this.f25388u = cVar.B();
                                        }
                                        this.f25385r |= 4;
                                    } else if (K == 34) {
                                        if ((this.f25385r & 16) == 16) {
                                            q qVar3 = this.f25390w;
                                            qVar3.getClass();
                                            cVar = q.z0(qVar3);
                                        }
                                        q qVar4 = (q) eVar.u(q.J, fVar);
                                        this.f25390w = qVar4;
                                        if (cVar != null) {
                                            cVar.j(qVar4);
                                            this.f25390w = cVar.B();
                                        }
                                        this.f25385r |= 16;
                                    } else if (K == 40) {
                                        this.f25385r |= 8;
                                        this.f25389v = eVar.A();
                                    } else if (K != 48) {
                                        if (!j(eVar, J, fVar, K)) {
                                        }
                                    } else {
                                        this.f25385r |= 32;
                                        this.f25391x = eVar.A();
                                    }
                                } else {
                                    this.f25385r |= 2;
                                    this.f25387t = eVar.A();
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
                        this.f25384q = x5.e();
                        throw th2;
                    }
                    this.f25384q = x5.e();
                    g();
                    throw th;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25384q = x5.e();
                throw th3;
            }
            this.f25384q = x5.e();
            g();
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class v extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.x {
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<v> A = new C0345a();

        /* renamed from: z, reason: collision with root package name */
        private static final v f25401z;

        /* renamed from: p, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25402p;

        /* renamed from: q, reason: collision with root package name */
        private int f25403q;

        /* renamed from: r, reason: collision with root package name */
        private int f25404r;

        /* renamed from: s, reason: collision with root package name */
        private int f25405s;

        /* renamed from: t, reason: collision with root package name */
        private c f25406t;

        /* renamed from: u, reason: collision with root package name */
        private int f25407u;

        /* renamed from: v, reason: collision with root package name */
        private int f25408v;

        /* renamed from: w, reason: collision with root package name */
        private d f25409w;

        /* renamed from: x, reason: collision with root package name */
        private byte f25410x;

        /* renamed from: y, reason: collision with root package name */
        private int f25411y;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$v$a, reason: collision with other inner class name */
        static class C0345a extends kotlin.reflect.jvm.internal.impl.protobuf.b<v> {
            C0345a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public v b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new v(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.b<v, b> implements kotlin.reflect.jvm.internal.impl.metadata.x {

            /* renamed from: p, reason: collision with root package name */
            private int f25412p;

            /* renamed from: q, reason: collision with root package name */
            private int f25413q;

            /* renamed from: r, reason: collision with root package name */
            private int f25414r;

            /* renamed from: t, reason: collision with root package name */
            private int f25416t;

            /* renamed from: u, reason: collision with root package name */
            private int f25417u;

            /* renamed from: s, reason: collision with root package name */
            private c f25415s = c.ERROR;

            /* renamed from: v, reason: collision with root package name */
            private d f25418v = d.LANGUAGE_VERSION;

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
            public b j(v vVar) {
                if (vVar == v.y()) {
                    return this;
                }
                if (vVar.K()) {
                    F(vVar.E());
                }
                if (vVar.L()) {
                    G(vVar.F());
                }
                if (vVar.I()) {
                    D(vVar.C());
                }
                if (vVar.H()) {
                    C(vVar.B());
                }
                if (vVar.J()) {
                    E(vVar.D());
                }
                if (vVar.M()) {
                    I(vVar.G());
                }
                k(i().f(vVar.f25402p));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: B, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.v.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$v> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.v.A     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$v r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.v) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$v r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.v) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.v.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$v$b");
            }

            public b C(int i5) {
                this.f25412p |= 8;
                this.f25416t = i5;
                return this;
            }

            public b D(c cVar) {
                cVar.getClass();
                this.f25412p |= 4;
                this.f25415s = cVar;
                return this;
            }

            public b E(int i5) {
                this.f25412p |= 16;
                this.f25417u = i5;
                return this;
            }

            public b F(int i5) {
                this.f25412p |= 1;
                this.f25413q = i5;
                return this;
            }

            public b G(int i5) {
                this.f25412p |= 2;
                this.f25414r = i5;
                return this;
            }

            public b I(d dVar) {
                dVar.getClass();
                this.f25412p |= 32;
                this.f25418v = dVar;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public v m() {
                return v.y();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return v.y();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public v build() {
                v q5 = q();
                if (q5.l()) {
                    return q5;
                }
                throw new UninitializedMessageException(q5);
            }

            public v q() {
                v vVar = new v(this);
                int i5 = this.f25412p;
                int i6 = (i5 & 1) != 1 ? 0 : 1;
                vVar.f25404r = this.f25413q;
                if ((i5 & 2) == 2) {
                    i6 |= 2;
                }
                vVar.f25405s = this.f25414r;
                if ((i5 & 4) == 4) {
                    i6 |= 4;
                }
                vVar.f25406t = this.f25415s;
                if ((i5 & 8) == 8) {
                    i6 |= 8;
                }
                vVar.f25407u = this.f25416t;
                if ((i5 & 16) == 16) {
                    i6 |= 16;
                }
                vVar.f25408v = this.f25417u;
                if ((i5 & 32) == 32) {
                    i6 |= 32;
                }
                vVar.f25409w = this.f25418v;
                vVar.f25403q = i6;
                return vVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(q());
            }

            public v w() {
                return v.y();
            }
        }

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes5.dex */
        public enum c implements i.a {
            WARNING(0, 0),
            ERROR(1, 1),
            HIDDEN(2, 2);

            private static i.b<c> internalValueMap = new C0346a();
            private final int value;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$v$c$a, reason: collision with other inner class name */
            static class C0346a implements i.b<c> {
                C0346a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                public c a(int i5) {
                    return c.valueOf(i5);
                }

                public c b(int i5) {
                    return c.valueOf(i5);
                }
            }

            c(int i5, int i6) {
                this.value = i6;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.value;
            }

            public static c valueOf(int i5) {
                if (i5 == 0) {
                    return WARNING;
                }
                if (i5 == 1) {
                    return ERROR;
                }
                if (i5 != 2) {
                    return null;
                }
                return HIDDEN;
            }
        }

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes5.dex */
        public enum d implements i.a {
            LANGUAGE_VERSION(0, 0),
            COMPILER_VERSION(1, 1),
            API_VERSION(2, 2);

            private static i.b<d> internalValueMap = new C0347a();
            private final int value;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$v$d$a, reason: collision with other inner class name */
            static class C0347a implements i.b<d> {
                C0347a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                public d a(int i5) {
                    return d.valueOf(i5);
                }

                public d b(int i5) {
                    return d.valueOf(i5);
                }
            }

            d(int i5, int i6) {
                this.value = i6;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.value;
            }

            public static d valueOf(int i5) {
                if (i5 == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i5 == 1) {
                    return COMPILER_VERSION;
                }
                if (i5 != 2) {
                    return null;
                }
                return API_VERSION;
            }
        }

        static {
            v vVar = new v(true);
            f25401z = vVar;
            vVar.N();
        }

        private void N() {
            this.f25404r = 0;
            this.f25405s = 0;
            this.f25406t = c.ERROR;
            this.f25407u = 0;
            this.f25408v = 0;
            this.f25409w = d.LANGUAGE_VERSION;
        }

        public static b O() {
            return b.o();
        }

        public static b P(v vVar) {
            return b.o().j(vVar);
        }

        public static v y() {
            return f25401z;
        }

        public v A() {
            return f25401z;
        }

        public int B() {
            return this.f25407u;
        }

        public c C() {
            return this.f25406t;
        }

        public int D() {
            return this.f25408v;
        }

        public int E() {
            return this.f25404r;
        }

        public int F() {
            return this.f25405s;
        }

        public d G() {
            return this.f25409w;
        }

        public boolean H() {
            return (this.f25403q & 8) == 8;
        }

        public boolean I() {
            return (this.f25403q & 4) == 4;
        }

        public boolean J() {
            return (this.f25403q & 16) == 16;
        }

        public boolean K() {
            return (this.f25403q & 1) == 1;
        }

        public boolean L() {
            return (this.f25403q & 2) == 2;
        }

        public boolean M() {
            return (this.f25403q & 32) == 32;
        }

        public b Q() {
            return b.o();
        }

        public b R() {
            return P(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            if ((this.f25403q & 1) == 1) {
                codedOutputStream.a0(1, this.f25404r);
            }
            if ((this.f25403q & 2) == 2) {
                codedOutputStream.a0(2, this.f25405s);
            }
            if ((this.f25403q & 4) == 4) {
                codedOutputStream.S(3, this.f25406t.getNumber());
            }
            if ((this.f25403q & 8) == 8) {
                codedOutputStream.a0(4, this.f25407u);
            }
            if ((this.f25403q & 16) == 16) {
                codedOutputStream.a0(5, this.f25408v);
            }
            if ((this.f25403q & 32) == 32) {
                codedOutputStream.S(6, this.f25409w.getNumber());
            }
            codedOutputStream.i0(this.f25402p);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.f25410x;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            this.f25410x = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return f25401z;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return P(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.f25411y;
            if (i5 != -1) {
                return i5;
            }
            int o5 = (this.f25403q & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f25404r) : 0;
            if ((this.f25403q & 2) == 2) {
                o5 += CodedOutputStream.o(2, this.f25405s);
            }
            if ((this.f25403q & 4) == 4) {
                o5 += CodedOutputStream.h(3, this.f25406t.getNumber());
            }
            if ((this.f25403q & 8) == 8) {
                o5 += CodedOutputStream.o(4, this.f25407u);
            }
            if ((this.f25403q & 16) == 16) {
                o5 += CodedOutputStream.o(5, this.f25408v);
            }
            if ((this.f25403q & 32) == 32) {
                o5 += CodedOutputStream.h(6, this.f25409w.getNumber());
            }
            int size = this.f25402p.size() + o5;
            this.f25411y = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.o();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<v> z() {
            return A;
        }

        private v(h.b bVar) {
            super(bVar);
            this.f25410x = (byte) -1;
            this.f25411y = -1;
            this.f25402p = bVar.i();
        }

        private v(boolean z5) {
            this.f25410x = (byte) -1;
            this.f25411y = -1;
            this.f25402p = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        private v(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f25410x = (byte) -1;
            this.f25411y = -1;
            N();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            while (!z5) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f25403q |= 1;
                                this.f25404r = eVar.A();
                            } else if (K == 16) {
                                this.f25403q |= 2;
                                this.f25405s = eVar.A();
                            } else if (K == 24) {
                                int A2 = eVar.A();
                                c valueOf = c.valueOf(A2);
                                if (valueOf == null) {
                                    J.o0(K);
                                    J.o0(A2);
                                } else {
                                    this.f25403q |= 4;
                                    this.f25406t = valueOf;
                                }
                            } else if (K == 32) {
                                this.f25403q |= 8;
                                this.f25407u = eVar.A();
                            } else if (K == 40) {
                                this.f25403q |= 16;
                                this.f25408v = eVar.A();
                            } else if (K != 48) {
                                if (!eVar.P(K, J)) {
                                }
                            } else {
                                int A3 = eVar.A();
                                d valueOf2 = d.valueOf(A3);
                                if (valueOf2 == null) {
                                    J.o0(K);
                                    J.o0(A3);
                                } else {
                                    this.f25403q |= 32;
                                    this.f25409w = valueOf2;
                                }
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
                        this.f25402p = x5.e();
                        throw th2;
                    }
                    this.f25402p = x5.e();
                    throw th;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25402p = x5.e();
                throw th3;
            }
            this.f25402p = x5.e();
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes6.dex */
    public static final class w extends kotlin.reflect.jvm.internal.impl.protobuf.h implements y {

        /* renamed from: t, reason: collision with root package name */
        private static final w f25419t;

        /* renamed from: u, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<w> f25420u = new C0348a();

        /* renamed from: p, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f25421p;

        /* renamed from: q, reason: collision with root package name */
        private List<v> f25422q;

        /* renamed from: r, reason: collision with root package name */
        private byte f25423r;

        /* renamed from: s, reason: collision with root package name */
        private int f25424s;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.a$w$a, reason: collision with other inner class name */
        static class C0348a extends kotlin.reflect.jvm.internal.impl.protobuf.b<w> {
            C0348a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public w b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
                return new w(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        public static final class b extends h.b<w, b> implements y {

            /* renamed from: p, reason: collision with root package name */
            private int f25425p;

            /* renamed from: q, reason: collision with root package name */
            private List<v> f25426q = Collections.emptyList();

            private b() {
            }

            private void A() {
            }

            static b o() {
                return new b();
            }

            private static b v() {
                return new b();
            }

            private void w() {
                if ((this.f25425p & 1) != 1) {
                    this.f25426q = new ArrayList(this.f25426q);
                    this.f25425p |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: B, reason: merged with bridge method [inline-methods] */
            public b j(w wVar) {
                if (wVar == w.r()) {
                    return this;
                }
                if (!wVar.f25422q.isEmpty()) {
                    if (this.f25426q.isEmpty()) {
                        this.f25426q = wVar.f25422q;
                        this.f25425p &= -2;
                    } else {
                        w();
                        this.f25426q.addAll(wVar.f25422q);
                    }
                }
                k(i().f(wVar.f25421p));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.a.w.b c(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$w> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.w.f25420u     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.a$w r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.w) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.a$w r4 = (kotlin.reflect.jvm.internal.impl.metadata.a.w) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.a.w.b.c(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.a$w$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: f */
            public w m() {
                return w.r();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean l() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.p
            public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
                return w.r();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public w build() {
                w q5 = q();
                if (q5.l()) {
                    return q5;
                }
                throw new UninitializedMessageException(q5);
            }

            public w q() {
                w wVar = new w(this);
                if ((this.f25425p & 1) == 1) {
                    this.f25426q = Collections.unmodifiableList(this.f25426q);
                    this.f25425p &= -2;
                }
                wVar.f25422q = this.f25426q;
                return wVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public b q() {
                return new b().j(q());
            }

            public w y() {
                return w.r();
            }
        }

        static {
            w wVar = new w(true);
            f25419t = wVar;
            wVar.w();
        }

        public static b A(w wVar) {
            return b.o().j(wVar);
        }

        public static w r() {
            return f25419t;
        }

        private void w() {
            this.f25422q = Collections.emptyList();
        }

        public static b y() {
            return b.o();
        }

        public b B() {
            return b.o();
        }

        public b C() {
            return A(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void a(CodedOutputStream codedOutputStream) throws IOException {
            u();
            for (int i5 = 0; i5 < this.f25422q.size(); i5++) {
                codedOutputStream.d0(1, this.f25422q.get(i5));
            }
            codedOutputStream.i0(this.f25421p);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean l() {
            byte b6 = this.f25423r;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            this.f25423r = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public kotlin.reflect.jvm.internal.impl.protobuf.o m() {
            return f25419t;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a n() {
            return A(this);
        }

        public w s() {
            return f25419t;
        }

        public int t() {
            return this.f25422q.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int u() {
            int i5 = this.f25424s;
            if (i5 != -1) {
                return i5;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < this.f25422q.size(); i7++) {
                i6 += CodedOutputStream.s(1, this.f25422q.get(i7));
            }
            int size = this.f25421p.size() + i6;
            this.f25424s = size;
            return size;
        }

        public List<v> v() {
            return this.f25422q;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public o.a x() {
            return b.o();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<w> z() {
            return f25420u;
        }

        private w(h.b bVar) {
            super(bVar);
            this.f25423r = (byte) -1;
            this.f25424s = -1;
            this.f25421p = bVar.i();
        }

        private w(boolean z5) {
            this.f25423r = (byte) -1;
            this.f25424s = -1;
            this.f25421p = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private w(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            this.f25423r = (byte) -1;
            this.f25424s = -1;
            w();
            d.b x5 = kotlin.reflect.jvm.internal.impl.protobuf.d.x();
            CodedOutputStream J = CodedOutputStream.J(x5, 1);
            boolean z5 = false;
            boolean z6 = false;
            while (!z5) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K != 10) {
                                if (!eVar.P(K, J)) {
                                }
                            } else {
                                if (!(z6 & true)) {
                                    this.f25422q = new ArrayList();
                                    z6 |= true;
                                }
                                this.f25422q.add(eVar.u(v.A, fVar));
                            }
                        }
                        z5 = true;
                    } catch (InvalidProtocolBufferException e6) {
                        throw e6.i(this);
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if (z6 & true) {
                        this.f25422q = Collections.unmodifiableList(this.f25422q);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f25421p = x5.e();
                        throw th2;
                    }
                    this.f25421p = x5.e();
                    throw th;
                }
            }
            if (z6 & true) {
                this.f25422q = Collections.unmodifiableList(this.f25422q);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f25421p = x5.e();
                throw th3;
            }
            this.f25421p = x5.e();
        }
    }
}
