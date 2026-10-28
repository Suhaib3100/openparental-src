package android.content.preferences.protobuf;

import android.content.preferences.protobuf.a;
import android.content.preferences.protobuf.c1;
import android.content.preferences.protobuf.h2;
import android.content.preferences.protobuf.i1;
import android.content.preferences.protobuf.l;
import android.content.preferences.protobuf.o1;
import android.content.preferences.protobuf.q4;
import androidx.datastore.preferences.protobuf.i1.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: GeneratedMessageLite.java */
/* loaded from: classes3.dex */
public abstract class i1<MessageType extends i1<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends android.content.preferences.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, i1<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected j4 unknownFields = j4.e();
    protected int memoizedSerializedSize = -1;

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7238a;

        static {
            int[] iArr = new int[q4.c.values().length];
            f7238a = iArr;
            try {
                iArr[q4.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7238a[q4.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public static abstract class b<MessageType extends i1<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends a.AbstractC0082a<MessageType, BuilderType> {

        /* renamed from: o, reason: collision with root package name */
        private final MessageType f7239o;

        /* renamed from: p, reason: collision with root package name */
        protected MessageType f7240p;

        /* renamed from: q, reason: collision with root package name */
        protected boolean f7241q = false;

        protected b(MessageType messagetype) {
            this.f7239o = messagetype;
            this.f7240p = (MessageType) messagetype.L1(i.NEW_MUTABLE_INSTANCE);
        }

        private void h2(MessageType messagetype, MessageType messagetype2) {
            c3.a().j(messagetype).a(messagetype, messagetype2);
        }

        @Override // androidx.datastore.preferences.protobuf.h2.a
        /* renamed from: W1, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType N0 = N0();
            if (N0.l()) {
                return N0;
            }
            throw new UninitializedMessageException(N0);
        }

        @Override // androidx.datastore.preferences.protobuf.h2.a
        /* renamed from: X1, reason: merged with bridge method [inline-methods] */
        public MessageType N0() {
            if (this.f7241q) {
                return this.f7240p;
            }
            this.f7240p.a2();
            this.f7241q = true;
            return this.f7240p;
        }

        @Override // androidx.datastore.preferences.protobuf.h2.a
        /* renamed from: Y1, reason: merged with bridge method [inline-methods] */
        public final BuilderType clear() {
            this.f7240p = (MessageType) this.f7240p.L1(i.NEW_MUTABLE_INSTANCE);
            return this;
        }

        @Override // android.content.preferences.protobuf.a.AbstractC0082a
        /* renamed from: Z1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType mo0clone() {
            BuilderType buildertype = (BuilderType) m().x();
            buildertype.e2(N0());
            return buildertype;
        }

        protected void a2() {
            if (this.f7241q) {
                MessageType messagetype = (MessageType) this.f7240p.L1(i.NEW_MUTABLE_INSTANCE);
                h2(messagetype, this.f7240p);
                this.f7240p = messagetype;
                this.f7241q = false;
            }
        }

        @Override // android.content.preferences.protobuf.i2
        /* renamed from: b2, reason: merged with bridge method [inline-methods] */
        public MessageType m() {
            return this.f7239o;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.content.preferences.protobuf.a.AbstractC0082a
        /* renamed from: c2, reason: merged with bridge method [inline-methods] */
        public BuilderType J1(MessageType messagetype) {
            return e2(messagetype);
        }

        @Override // android.content.preferences.protobuf.a.AbstractC0082a, androidx.datastore.preferences.protobuf.h2.a
        /* renamed from: d2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType T0(z zVar, s0 s0Var) throws IOException {
            a2();
            try {
                c3.a().j(this.f7240p).b(this.f7240p, a0.T(zVar), s0Var);
                return this;
            } catch (RuntimeException e6) {
                if (e6.getCause() instanceof IOException) {
                    throw ((IOException) e6.getCause());
                }
                throw e6;
            }
        }

        public BuilderType e2(MessageType messagetype) {
            a2();
            h2(this.f7240p, messagetype);
            return this;
        }

        @Override // android.content.preferences.protobuf.a.AbstractC0082a, androidx.datastore.preferences.protobuf.h2.a
        /* renamed from: f2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType n1(byte[] bArr, int i5, int i6) throws InvalidProtocolBufferException {
            return T1(bArr, i5, i6, s0.d());
        }

        @Override // android.content.preferences.protobuf.a.AbstractC0082a, androidx.datastore.preferences.protobuf.h2.a
        /* renamed from: g2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType X(byte[] bArr, int i5, int i6, s0 s0Var) throws InvalidProtocolBufferException {
            a2();
            try {
                c3.a().j(this.f7240p).i(this.f7240p, bArr, i5, i5 + i6, new l.b(s0Var));
                return this;
            } catch (InvalidProtocolBufferException e6) {
                throw e6;
            } catch (IOException e7) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e7);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.l();
            }
        }

        @Override // android.content.preferences.protobuf.i2
        public final boolean l() {
            return i1.Z1(this.f7240p, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: GeneratedMessageLite.java */
    public static class c<T extends i1<T, ?>> extends android.content.preferences.protobuf.b<T> {

        /* renamed from: b, reason: collision with root package name */
        private final T f7242b;

        public c(T t5) {
            this.f7242b = t5;
        }

        @Override // android.content.preferences.protobuf.z2
        /* renamed from: b0, reason: merged with bridge method [inline-methods] */
        public T y(z zVar, s0 s0Var) throws InvalidProtocolBufferException {
            return (T) i1.D2(this.f7242b, zVar, s0Var);
        }

        @Override // android.content.preferences.protobuf.b, android.content.preferences.protobuf.z2
        /* renamed from: c0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public T b(byte[] bArr, int i5, int i6, s0 s0Var) throws InvalidProtocolBufferException {
            return (T) i1.E2(this.f7242b, bArr, i5, i6, s0Var);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes4.dex */
    public static abstract class d<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements f<MessageType, BuilderType> {
        protected d(MessageType messagetype) {
            super(messagetype);
        }

        private c1<g> l2() {
            c1<g> c1Var = ((e) this.f7240p).extensions;
            if (!c1Var.D()) {
                return c1Var;
            }
            c1<g> clone = c1Var.clone();
            ((e) this.f7240p).extensions = clone;
            return clone;
        }

        private void p2(h<MessageType, ?> hVar) {
            if (hVar.h() != m()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i1.f
        public final <Type> boolean K(q0<MessageType, Type> q0Var) {
            return ((e) this.f7240p).K(q0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.f
        public final <Type> Type a0(q0<MessageType, Type> q0Var) {
            return (Type) ((e) this.f7240p).a0(q0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.b
        protected void a2() {
            if (this.f7241q) {
                super.a2();
                e eVar = (e) this.f7240p;
                eVar.extensions = eVar.extensions.clone();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i1.f
        public final <Type> int c0(q0<MessageType, List<Type>> q0Var) {
            return ((e) this.f7240p).c0(q0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.f
        public final <Type> Type i1(q0<MessageType, List<Type>> q0Var, int i5) {
            return (Type) ((e) this.f7240p).i1(q0Var, i5);
        }

        public final <Type> BuilderType i2(q0<MessageType, List<Type>> q0Var, Type type) {
            h<MessageType, ?> H1 = i1.H1(q0Var);
            p2(H1);
            a2();
            l2().h(H1.f7255d, H1.j(type));
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.i1.b
        /* renamed from: j2, reason: merged with bridge method [inline-methods] */
        public final MessageType N0() {
            if (this.f7241q) {
                return (MessageType) this.f7240p;
            }
            ((e) this.f7240p).extensions.I();
            return (MessageType) super.N0();
        }

        public final <Type> BuilderType k2(q0<MessageType, ?> q0Var) {
            h<MessageType, ?> H1 = i1.H1(q0Var);
            p2(H1);
            a2();
            l2().j(H1.f7255d);
            return this;
        }

        void m2(c1<g> c1Var) {
            a2();
            ((e) this.f7240p).extensions = c1Var;
        }

        public final <Type> BuilderType n2(q0<MessageType, List<Type>> q0Var, int i5, Type type) {
            h<MessageType, ?> H1 = i1.H1(q0Var);
            p2(H1);
            a2();
            l2().P(H1.f7255d, i5, H1.j(type));
            return this;
        }

        public final <Type> BuilderType o2(q0<MessageType, Type> q0Var, Type type) {
            h<MessageType, ?> H1 = i1.H1(q0Var);
            p2(H1);
            a2();
            l2().O(H1.f7255d, H1.k(type));
            return this;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes4.dex */
    public static abstract class e<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends i1<MessageType, BuilderType> implements f<MessageType, BuilderType> {
        protected c1<g> extensions = c1.s();

        /* compiled from: GeneratedMessageLite.java */
        /* loaded from: classes.dex */
        protected class a {

            /* renamed from: a, reason: collision with root package name */
            private final Iterator<Map.Entry<g, Object>> f7243a;

            /* renamed from: b, reason: collision with root package name */
            private Map.Entry<g, Object> f7244b;

            /* renamed from: c, reason: collision with root package name */
            private final boolean f7245c;

            /* synthetic */ a(e eVar, boolean z5, a aVar) {
                this(z5);
            }

            public void a(int i5, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<g, Object> entry = this.f7244b;
                    if (entry == null || entry.getKey().f7248p >= i5) {
                        return;
                    }
                    g key = this.f7244b.getKey();
                    if (this.f7245c && key.e() == q4.c.MESSAGE && !key.f7250r) {
                        codedOutputStream.P1(key.f7248p, (h2) this.f7244b.getValue());
                    } else {
                        c1.T(key, this.f7244b.getValue(), codedOutputStream);
                    }
                    if (this.f7243a.hasNext()) {
                        this.f7244b = this.f7243a.next();
                    } else {
                        this.f7244b = null;
                    }
                }
            }

            private a(boolean z5) {
                Iterator<Map.Entry<g, Object>> H = e.this.extensions.H();
                this.f7243a = H;
                if (H.hasNext()) {
                    this.f7244b = H.next();
                }
                this.f7245c = z5;
            }
        }

        private void J2(z zVar, h<?, ?> hVar, s0 s0Var, int i5) throws IOException {
            T2(zVar, s0Var, hVar, q4.c(i5, 2), i5);
        }

        private void P2(w wVar, s0 s0Var, h<?, ?> hVar) throws IOException {
            h2 h2Var = (h2) this.extensions.u(hVar.f7255d);
            h2.a n5 = h2Var != null ? h2Var.n() : null;
            if (n5 == null) {
                n5 = hVar.c().x();
            }
            n5.w1(wVar, s0Var);
            K2().O(hVar.f7255d, hVar.j(n5.build()));
        }

        private <MessageType extends h2> void Q2(MessageType messagetype, z zVar, s0 s0Var) throws IOException {
            int i5 = 0;
            w wVar = null;
            h<?, ?> hVar = null;
            while (true) {
                int Y = zVar.Y();
                if (Y == 0) {
                    break;
                }
                if (Y == q4.f7488s) {
                    i5 = zVar.Z();
                    if (i5 != 0) {
                        hVar = s0Var.c(messagetype, i5);
                    }
                } else if (Y == q4.f7489t) {
                    if (i5 == 0 || hVar == null) {
                        wVar = zVar.x();
                    } else {
                        J2(zVar, hVar, s0Var, i5);
                        wVar = null;
                    }
                } else if (!zVar.g0(Y)) {
                    break;
                }
            }
            zVar.a(q4.f7487r);
            if (wVar == null || i5 == 0) {
                return;
            }
            if (hVar != null) {
                P2(wVar, s0Var, hVar);
            } else {
                b2(i5, wVar);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean T2(android.content.preferences.protobuf.z r6, android.content.preferences.protobuf.s0 r7, androidx.datastore.preferences.protobuf.i1.h<?, ?> r8, int r9, int r10) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 267
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i1.e.T2(androidx.datastore.preferences.protobuf.z, androidx.datastore.preferences.protobuf.s0, androidx.datastore.preferences.protobuf.i1$h, int, int):boolean");
        }

        private void W2(h<MessageType, ?> hVar) {
            if (hVar.h() != m()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i1.f
        public final <Type> boolean K(q0<MessageType, Type> q0Var) {
            h<MessageType, ?> H1 = i1.H1(q0Var);
            W2(H1);
            return this.extensions.B(H1.f7255d);
        }

        c1<g> K2() {
            if (this.extensions.D()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        protected boolean L2() {
            return this.extensions.E();
        }

        protected int M2() {
            return this.extensions.z();
        }

        protected int N2() {
            return this.extensions.v();
        }

        protected final void O2(MessageType messagetype) {
            if (this.extensions.D()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.J(messagetype.extensions);
        }

        protected e<MessageType, BuilderType>.a R2() {
            return new a(this, false, null);
        }

        protected e<MessageType, BuilderType>.a S2() {
            return new a(this, true, null);
        }

        protected <MessageType extends h2> boolean U2(MessageType messagetype, z zVar, s0 s0Var, int i5) throws IOException {
            int a6 = q4.a(i5);
            return T2(zVar, s0Var, s0Var.c(messagetype, a6), i5, a6);
        }

        protected <MessageType extends h2> boolean V2(MessageType messagetype, z zVar, s0 s0Var, int i5) throws IOException {
            if (i5 != q4.f7486q) {
                return (i5 & 7) == 2 ? U2(messagetype, zVar, s0Var, i5) : zVar.g0(i5);
            }
            Q2(messagetype, zVar, s0Var);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.i1.f
        public final <Type> Type a0(q0<MessageType, Type> q0Var) {
            h<MessageType, ?> H1 = i1.H1(q0Var);
            W2(H1);
            Object u5 = this.extensions.u(H1.f7255d);
            return u5 == null ? H1.f7253b : (Type) H1.g(u5);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.f
        public final <Type> int c0(q0<MessageType, List<Type>> q0Var) {
            h<MessageType, ?> H1 = i1.H1(q0Var);
            W2(H1);
            return this.extensions.y(H1.f7255d);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.f
        public final <Type> Type i1(q0<MessageType, List<Type>> q0Var, int i5) {
            h<MessageType, ?> H1 = i1.H1(q0Var);
            W2(H1);
            return (Type) H1.i(this.extensions.x(H1.f7255d, i5));
        }

        @Override // android.content.preferences.protobuf.i1, android.content.preferences.protobuf.i2
        public /* bridge */ /* synthetic */ h2 m() {
            return super.m();
        }

        @Override // android.content.preferences.protobuf.i1, android.content.preferences.protobuf.h2
        public /* bridge */ /* synthetic */ h2.a n() {
            return super.n();
        }

        @Override // android.content.preferences.protobuf.i1, android.content.preferences.protobuf.h2
        public /* bridge */ /* synthetic */ h2.a x() {
            return super.x();
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public interface f<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends i2 {
        <Type> boolean K(q0<MessageType, Type> q0Var);

        <Type> Type a0(q0<MessageType, Type> q0Var);

        <Type> int c0(q0<MessageType, List<Type>> q0Var);

        <Type> Type i1(q0<MessageType, List<Type>> q0Var, int i5);
    }

    /* compiled from: GeneratedMessageLite.java */
    static final class g implements c1.c<g> {

        /* renamed from: o, reason: collision with root package name */
        final o1.d<?> f7247o;

        /* renamed from: p, reason: collision with root package name */
        final int f7248p;

        /* renamed from: q, reason: collision with root package name */
        final q4.b f7249q;

        /* renamed from: r, reason: collision with root package name */
        final boolean f7250r;

        /* renamed from: s, reason: collision with root package name */
        final boolean f7251s;

        g(o1.d<?> dVar, int i5, q4.b bVar, boolean z5, boolean z6) {
            this.f7247o = dVar;
            this.f7248p = i5;
            this.f7249q = bVar;
            this.f7250r = z5;
            this.f7251s = z6;
        }

        @Override // androidx.datastore.preferences.protobuf.c1.c
        public boolean a() {
            return this.f7250r;
        }

        @Override // androidx.datastore.preferences.protobuf.c1.c
        public q4.b b() {
            return this.f7249q;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f7248p - ((g) obj).f7248p;
        }

        @Override // androidx.datastore.preferences.protobuf.c1.c
        public q4.c e() {
            return this.f7249q.getJavaType();
        }

        public int g(g gVar) {
            return this.f7248p - gVar.f7248p;
        }

        @Override // androidx.datastore.preferences.protobuf.c1.c
        public int getNumber() {
            return this.f7248p;
        }

        @Override // androidx.datastore.preferences.protobuf.c1.c
        public boolean isPacked() {
            return this.f7251s;
        }

        @Override // androidx.datastore.preferences.protobuf.c1.c
        public o1.d<?> k() {
            return this.f7247o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.c1.c
        public h2.a n(h2.a aVar, h2 h2Var) {
            return ((b) aVar).e2((i1) h2Var);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public static class h<ContainingType extends h2, Type> extends q0<ContainingType, Type> {

        /* renamed from: a, reason: collision with root package name */
        final ContainingType f7252a;

        /* renamed from: b, reason: collision with root package name */
        final Type f7253b;

        /* renamed from: c, reason: collision with root package name */
        final h2 f7254c;

        /* renamed from: d, reason: collision with root package name */
        final g f7255d;

        h(ContainingType containingtype, Type type, h2 h2Var, g gVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (gVar.f7249q == q4.b.MESSAGE && h2Var == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f7252a = containingtype;
            this.f7253b = type;
            this.f7254c = h2Var;
            this.f7255d = gVar;
        }

        @Override // android.content.preferences.protobuf.q0
        public Type a() {
            return this.f7253b;
        }

        @Override // android.content.preferences.protobuf.q0
        public q4.b b() {
            return this.f7255d.f7249q;
        }

        @Override // android.content.preferences.protobuf.q0
        public h2 c() {
            return this.f7254c;
        }

        @Override // android.content.preferences.protobuf.q0
        public int d() {
            return this.f7255d.f7248p;
        }

        @Override // android.content.preferences.protobuf.q0
        public boolean f() {
            return this.f7255d.f7250r;
        }

        Object g(Object obj) {
            g gVar = this.f7255d;
            if (!gVar.f7250r) {
                return i(obj);
            }
            if (gVar.e() != q4.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(i(it.next()));
            }
            return arrayList;
        }

        public ContainingType h() {
            return this.f7252a;
        }

        Object i(Object obj) {
            return this.f7255d.e() == q4.c.ENUM ? this.f7255d.f7247o.a(((Integer) obj).intValue()) : obj;
        }

        Object j(Object obj) {
            return this.f7255d.e() == q4.c.ENUM ? Integer.valueOf(((o1.c) obj).getNumber()) : obj;
        }

        Object k(Object obj) {
            g gVar = this.f7255d;
            if (!gVar.f7250r) {
                return j(obj);
            }
            if (gVar.e() != q4.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(j(it.next()));
            }
            return arrayList;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public enum i {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    protected static final class j implements Serializable {

        /* renamed from: r, reason: collision with root package name */
        private static final long f7256r = 0;

        /* renamed from: o, reason: collision with root package name */
        private final Class<?> f7257o;

        /* renamed from: p, reason: collision with root package name */
        private final String f7258p;

        /* renamed from: q, reason: collision with root package name */
        private final byte[] f7259q;

        j(h2 h2Var) {
            Class<?> cls = h2Var.getClass();
            this.f7257o = cls;
            this.f7258p = cls.getName();
            this.f7259q = h2Var.b1();
        }

        public static j a(h2 h2Var) {
            return new j(h2Var);
        }

        @Deprecated
        private Object c() throws ObjectStreamException {
            try {
                Field declaredField = d().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((h2) declaredField.get(null)).x().U(this.f7259q).N0();
            } catch (InvalidProtocolBufferException e6) {
                throw new RuntimeException("Unable to understand proto buffer", e6);
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f7258p, e7);
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("Unable to call parsePartialFrom", e8);
            } catch (NoSuchFieldException e9) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.f7258p, e9);
            } catch (SecurityException e10) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.f7258p, e10);
            }
        }

        private Class<?> d() throws ClassNotFoundException {
            Class<?> cls = this.f7257o;
            return cls != null ? cls : Class.forName(this.f7258p);
        }

        protected Object b() throws ObjectStreamException {
            try {
                Field declaredField = d().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((h2) declaredField.get(null)).x().U(this.f7259q).N0();
            } catch (InvalidProtocolBufferException e6) {
                throw new RuntimeException("Unable to understand proto buffer", e6);
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f7258p, e7);
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("Unable to call parsePartialFrom", e8);
            } catch (NoSuchFieldException unused) {
                return c();
            } catch (SecurityException e9) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.f7258p, e9);
            }
        }
    }

    private static <T extends i1<T, ?>> T A2(T t5, InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            z j5 = z.j(new a.AbstractC0082a.C0083a(inputStream, z.O(read, inputStream)));
            T t6 = (T) D2(t5, j5, s0Var);
            try {
                j5.a(0);
                return t6;
            } catch (InvalidProtocolBufferException e6) {
                throw e6.j(t6);
            }
        } catch (IOException e7) {
            throw new InvalidProtocolBufferException(e7.getMessage());
        }
    }

    private static <T extends i1<T, ?>> T B2(T t5, w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        try {
            z O = wVar.O();
            T t6 = (T) D2(t5, O, s0Var);
            try {
                O.a(0);
                return t6;
            } catch (InvalidProtocolBufferException e6) {
                throw e6.j(t6);
            }
        } catch (InvalidProtocolBufferException e7) {
            throw e7;
        }
    }

    protected static <T extends i1<T, ?>> T C2(T t5, z zVar) throws InvalidProtocolBufferException {
        return (T) D2(t5, zVar, s0.d());
    }

    static <T extends i1<T, ?>> T D2(T t5, z zVar, s0 s0Var) throws InvalidProtocolBufferException {
        T t6 = (T) t5.L1(i.NEW_MUTABLE_INSTANCE);
        try {
            j3 j5 = c3.a().j(t6);
            j5.b(t6, a0.T(zVar), s0Var);
            j5.c(t6);
            return t6;
        } catch (IOException e6) {
            if (e6.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e6.getCause());
            }
            throw new InvalidProtocolBufferException(e6.getMessage()).j(t6);
        } catch (RuntimeException e7) {
            if (e7.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e7.getCause());
            }
            throw e7;
        }
    }

    static <T extends i1<T, ?>> T E2(T t5, byte[] bArr, int i5, int i6, s0 s0Var) throws InvalidProtocolBufferException {
        T t6 = (T) t5.L1(i.NEW_MUTABLE_INSTANCE);
        try {
            j3 j5 = c3.a().j(t6);
            j5.i(t6, bArr, i5, i5 + i6, new l.b(s0Var));
            j5.c(t6);
            if (t6.memoizedHashCode == 0) {
                return t6;
            }
            throw new RuntimeException();
        } catch (IOException e6) {
            if (e6.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e6.getCause());
            }
            throw new InvalidProtocolBufferException(e6.getMessage()).j(t6);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.l().j(t6);
        }
    }

    private static <T extends i1<T, ?>> T F2(T t5, byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (T) I1(E2(t5, bArr, 0, bArr.length, s0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>, T> h<MessageType, T> H1(q0<MessageType, T> q0Var) {
        if (q0Var.e()) {
            return (h) q0Var;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    protected static <T extends i1<?, ?>> void H2(Class<T> cls, T t5) {
        defaultInstanceMap.put(cls, t5);
    }

    private static <T extends i1<T, ?>> T I1(T t5) throws InvalidProtocolBufferException {
        if (t5 == null || t5.l()) {
            return t5;
        }
        throw t5.y0().a().j(t5);
    }

    protected static o1.a O1() {
        return r.i();
    }

    protected static o1.b P1() {
        return c0.i();
    }

    protected static o1.f Q1() {
        return e1.i();
    }

    protected static o1.g R1() {
        return n1.i();
    }

    protected static o1.i S1() {
        return y1.i();
    }

    protected static <E> o1.k<E> T1() {
        return d3.g();
    }

    private final void U1() {
        if (this.unknownFields == j4.e()) {
            this.unknownFields = j4.p();
        }
    }

    static <T extends i1<?, ?>> T V1(Class<T> cls) {
        i1<?, ?> i1Var = defaultInstanceMap.get(cls);
        if (i1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                i1Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (i1Var == null) {
            i1Var = (T) ((i1) m4.j(cls)).m();
            if (i1Var == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, i1Var);
        }
        return (T) i1Var;
    }

    static Method X1(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e6);
        }
    }

    static Object Y1(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e6);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends i1<T, ?>> boolean Z1(T t5, boolean z5) {
        byte byteValue = ((Byte) t5.L1(i.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d6 = c3.a().j(t5).d(t5);
        if (z5) {
            t5.M1(i.SET_MEMOIZED_IS_INITIALIZED, d6 ? t5 : null);
        }
        return d6;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.o1$a] */
    protected static o1.a e2(o1.a aVar) {
        int size = aVar.size();
        return aVar.a2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.o1$b] */
    protected static o1.b f2(o1.b bVar) {
        int size = bVar.size();
        return bVar.a2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.o1$f] */
    protected static o1.f g2(o1.f fVar) {
        int size = fVar.size();
        return fVar.a2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.o1$g] */
    protected static o1.g h2(o1.g gVar) {
        int size = gVar.size();
        return gVar.a2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.o1$i] */
    protected static o1.i i2(o1.i iVar) {
        int size = iVar.size();
        return iVar.a2(size == 0 ? 10 : size * 2);
    }

    protected static <E> o1.k<E> j2(o1.k<E> kVar) {
        int size = kVar.size();
        return kVar.a2(size == 0 ? 10 : size * 2);
    }

    protected static Object l2(h2 h2Var, String str, Object[] objArr) {
        return new g3(h2Var, str, objArr);
    }

    public static <ContainingType extends h2, Type> h<ContainingType, Type> m2(ContainingType containingtype, h2 h2Var, o1.d<?> dVar, int i5, q4.b bVar, boolean z5, Class cls) {
        return new h<>(containingtype, Collections.emptyList(), h2Var, new g(dVar, i5, bVar, true, z5), cls);
    }

    public static <ContainingType extends h2, Type> h<ContainingType, Type> n2(ContainingType containingtype, Type type, h2 h2Var, o1.d<?> dVar, int i5, q4.b bVar, Class cls) {
        return new h<>(containingtype, type, h2Var, new g(dVar, i5, bVar, false, false), cls);
    }

    protected static <T extends i1<T, ?>> T o2(T t5, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) I1(A2(t5, inputStream, s0.d()));
    }

    protected static <T extends i1<T, ?>> T p2(T t5, InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException {
        return (T) I1(A2(t5, inputStream, s0Var));
    }

    protected static <T extends i1<T, ?>> T q2(T t5, w wVar) throws InvalidProtocolBufferException {
        return (T) I1(r2(t5, wVar, s0.d()));
    }

    protected static <T extends i1<T, ?>> T r2(T t5, w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (T) I1(B2(t5, wVar, s0Var));
    }

    protected static <T extends i1<T, ?>> T s2(T t5, z zVar) throws InvalidProtocolBufferException {
        return (T) t2(t5, zVar, s0.d());
    }

    protected static <T extends i1<T, ?>> T t2(T t5, z zVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (T) I1(D2(t5, zVar, s0Var));
    }

    protected static <T extends i1<T, ?>> T u2(T t5, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) I1(D2(t5, z.j(inputStream), s0.d()));
    }

    protected static <T extends i1<T, ?>> T v2(T t5, InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException {
        return (T) I1(D2(t5, z.j(inputStream), s0Var));
    }

    protected static <T extends i1<T, ?>> T w2(T t5, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (T) x2(t5, byteBuffer, s0.d());
    }

    protected static <T extends i1<T, ?>> T x2(T t5, ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (T) I1(t2(t5, z.o(byteBuffer, false), s0Var));
    }

    protected static <T extends i1<T, ?>> T y2(T t5, byte[] bArr) throws InvalidProtocolBufferException {
        return (T) I1(E2(t5, bArr, 0, bArr.length, s0.d()));
    }

    protected static <T extends i1<T, ?>> T z2(T t5, byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (T) I1(E2(t5, bArr, 0, bArr.length, s0Var));
    }

    @Override // android.content.preferences.protobuf.a
    void E1(int i5) {
        this.memoizedSerializedSize = i5;
    }

    Object G1() throws Exception {
        return L1(i.BUILD_MESSAGE_INFO);
    }

    protected boolean G2(int i5, z zVar) throws IOException {
        if (q4.b(i5) == 4) {
            return false;
        }
        U1();
        return this.unknownFields.k(i5, zVar);
    }

    @Override // android.content.preferences.protobuf.h2
    /* renamed from: I2, reason: merged with bridge method [inline-methods] */
    public final BuilderType n() {
        BuilderType buildertype = (BuilderType) L1(i.NEW_BUILDER);
        buildertype.e2(this);
        return buildertype;
    }

    protected final <MessageType extends i1<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType J1() {
        return (BuilderType) L1(i.NEW_BUILDER);
    }

    protected final <MessageType extends i1<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType K1(MessageType messagetype) {
        return (BuilderType) J1().e2(messagetype);
    }

    protected Object L1(i iVar) {
        return N1(iVar, null, null);
    }

    @Override // android.content.preferences.protobuf.h2
    public void M0(CodedOutputStream codedOutputStream) throws IOException {
        c3.a().j(this).e(this, b0.T(codedOutputStream));
    }

    protected Object M1(i iVar, Object obj) {
        return N1(iVar, obj, null);
    }

    protected abstract Object N1(i iVar, Object obj, Object obj2);

    @Override // android.content.preferences.protobuf.i2
    /* renamed from: W1, reason: merged with bridge method [inline-methods] */
    public final MessageType m() {
        return (MessageType) L1(i.GET_DEFAULT_INSTANCE);
    }

    protected void a2() {
        c3.a().j(this).c(this);
    }

    protected void b2(int i5, w wVar) {
        U1();
        this.unknownFields.m(i5, wVar);
    }

    protected final void c2(j4 j4Var) {
        this.unknownFields = j4.o(this.unknownFields, j4Var);
    }

    protected void d2(int i5, int i6) {
        U1();
        this.unknownFields.n(i5, i6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (m().getClass().isInstance(obj)) {
            return c3.a().j(this).f(this, (i1) obj);
        }
        return false;
    }

    public int hashCode() {
        int i5 = this.memoizedHashCode;
        if (i5 != 0) {
            return i5;
        }
        int j5 = c3.a().j(this).j(this);
        this.memoizedHashCode = j5;
        return j5;
    }

    @Override // android.content.preferences.protobuf.h2
    /* renamed from: k2, reason: merged with bridge method [inline-methods] */
    public final BuilderType x() {
        return (BuilderType) L1(i.NEW_BUILDER);
    }

    @Override // android.content.preferences.protobuf.i2
    public final boolean l() {
        return Z1(this, true);
    }

    @Override // android.content.preferences.protobuf.a
    int t() {
        return this.memoizedSerializedSize;
    }

    public String toString() {
        return j2.e(this, super.toString());
    }

    @Override // android.content.preferences.protobuf.h2
    public int u() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = c3.a().j(this).g(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // android.content.preferences.protobuf.h2
    public final z2<MessageType> z() {
        return (z2) L1(i.GET_PARSER);
    }
}
