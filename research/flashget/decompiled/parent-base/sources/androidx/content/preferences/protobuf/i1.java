package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.a;
import androidx.content.preferences.protobuf.c1;
import androidx.content.preferences.protobuf.i1;
import androidx.content.preferences.protobuf.i2;
import androidx.content.preferences.protobuf.l;
import androidx.content.preferences.protobuf.p1;
import androidx.content.preferences.protobuf.t4;
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
public abstract class i1<MessageType extends i1<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends androidx.content.preferences.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, i1<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected m4 unknownFields = m4.e();
    protected int memoizedSerializedSize = -1;

    /* compiled from: GeneratedMessageLite.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28693a;

        static {
            int[] iArr = new int[t4.c.values().length];
            f28693a = iArr;
            try {
                iArr[t4.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28693a[t4.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public static abstract class b<MessageType extends i1<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends a.AbstractC0471a<MessageType, BuilderType> {

        /* renamed from: b, reason: collision with root package name */
        private final MessageType f28694b;

        /* renamed from: c, reason: collision with root package name */
        protected MessageType f28695c;

        /* renamed from: d, reason: collision with root package name */
        protected boolean f28696d = false;

        protected b(MessageType messagetype) {
            this.f28694b = messagetype;
            this.f28695c = (MessageType) messagetype.I1(i.NEW_MUTABLE_INSTANCE);
        }

        private void d2(MessageType messagetype, MessageType messagetype2) {
            f3.a().j(messagetype).a(messagetype, messagetype2);
        }

        @Override // androidx.datastore.preferences.protobuf.i2.a
        /* renamed from: S1, reason: merged with bridge method [inline-methods] */
        public final MessageType a() {
            MessageType l12 = l1();
            l12.getClass();
            if (i1.W1(l12, true)) {
                return l12;
            }
            throw new UninitializedMessageException(l12);
        }

        @Override // androidx.datastore.preferences.protobuf.i2.a
        /* renamed from: T1, reason: merged with bridge method [inline-methods] */
        public MessageType l1() {
            if (this.f28696d) {
                return this.f28695c;
            }
            this.f28695c.X1();
            this.f28696d = true;
            return this.f28695c;
        }

        @Override // androidx.datastore.preferences.protobuf.i2.a
        /* renamed from: U1, reason: merged with bridge method [inline-methods] */
        public final BuilderType clear() {
            this.f28695c = (MessageType) this.f28695c.I1(i.NEW_MUTABLE_INSTANCE);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.a.AbstractC0471a
        /* renamed from: V1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType mo6clone() {
            BuilderType buildertype = (BuilderType) z().w();
            buildertype.a2(l1());
            return buildertype;
        }

        protected void W1() {
            if (this.f28696d) {
                MessageType messagetype = (MessageType) this.f28695c.I1(i.NEW_MUTABLE_INSTANCE);
                d2(messagetype, this.f28695c);
                this.f28695c = messagetype;
                this.f28696d = false;
            }
        }

        @Override // androidx.content.preferences.protobuf.j2
        /* renamed from: X1, reason: merged with bridge method [inline-methods] */
        public MessageType z() {
            return this.f28694b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.content.preferences.protobuf.a.AbstractC0471a
        /* renamed from: Y1, reason: merged with bridge method [inline-methods] */
        public BuilderType E1(MessageType messagetype) {
            return a2(messagetype);
        }

        @Override // androidx.content.preferences.protobuf.a.AbstractC0471a, androidx.datastore.preferences.protobuf.i2.a
        /* renamed from: Z1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType n1(z zVar, s0 s0Var) throws IOException {
            W1();
            try {
                f3.a().j(this.f28695c).b(this.f28695c, a0.S(zVar), s0Var);
                return this;
            } catch (RuntimeException e4) {
                if (e4.getCause() instanceof IOException) {
                    throw ((IOException) e4.getCause());
                }
                throw e4;
            }
        }

        public BuilderType a2(MessageType messagetype) {
            W1();
            d2(this.f28695c, messagetype);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.a.AbstractC0471a
        /* renamed from: b2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType O1(byte[] bArr, int i4, int i5) throws InvalidProtocolBufferException {
            return P1(bArr, i4, i5, s0.d());
        }

        @Override // androidx.content.preferences.protobuf.a.AbstractC0471a, androidx.datastore.preferences.protobuf.i2.a
        /* renamed from: c2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType n0(byte[] bArr, int i4, int i5, s0 s0Var) throws InvalidProtocolBufferException {
            W1();
            try {
                f3.a().j(this.f28695c).j(this.f28695c, bArr, i4, i4 + i5, new l.b(s0Var));
                return this;
            } catch (InvalidProtocolBufferException e4) {
                throw e4;
            } catch (IOException e5) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e5);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.l();
            }
        }

        @Override // androidx.content.preferences.protobuf.j2
        public final boolean p() {
            return i1.W1(this.f28695c, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: GeneratedMessageLite.java */
    public static class c<T extends i1<T, ?>> extends androidx.content.preferences.protobuf.b<T> {

        /* renamed from: b, reason: collision with root package name */
        private final T f28697b;

        public c(T t4) {
            this.f28697b = t4;
        }

        @Override // androidx.content.preferences.protobuf.c3
        /* renamed from: b0, reason: merged with bridge method [inline-methods] */
        public T z(z zVar, s0 s0Var) throws InvalidProtocolBufferException {
            return (T) i1.C2(this.f28697b, zVar, s0Var);
        }

        @Override // androidx.content.preferences.protobuf.b, androidx.content.preferences.protobuf.c3
        /* renamed from: c0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public T k(byte[] bArr, int i4, int i5, s0 s0Var) throws InvalidProtocolBufferException {
            return (T) i1.D2(this.f28697b, bArr, i4, i5, s0Var);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public static abstract class d<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements f<MessageType, BuilderType> {
        protected d(MessageType messagetype) {
            super(messagetype);
        }

        private c1<g> h2() {
            c1<g> c1Var = ((e) this.f28695c).extensions;
            if (!c1Var.D()) {
                return c1Var;
            }
            c1<g> clone = c1Var.clone();
            ((e) this.f28695c).extensions = clone;
            return clone;
        }

        private void l2(h<MessageType, ?> hVar) {
            if (hVar.h() != z()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i1.f
        public final <Type> boolean C0(q0<MessageType, Type> q0Var) {
            return ((e) this.f28695c).C0(q0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.f
        public final <Type> int J0(q0<MessageType, List<Type>> q0Var) {
            return ((e) this.f28695c).J0(q0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.f
        public final <Type> Type K(q0<MessageType, Type> q0Var) {
            return (Type) ((e) this.f28695c).K(q0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.b
        protected void W1() {
            if (this.f28696d) {
                super.W1();
                MessageType messagetype = this.f28695c;
                ((e) messagetype).extensions = ((e) messagetype).extensions.clone();
            }
        }

        public final <Type> BuilderType e2(q0<MessageType, List<Type>> q0Var, Type type) {
            h<MessageType, ?> C1 = i1.C1(q0Var);
            l2(C1);
            W1();
            h2().h(C1.f28710d, C1.j(type));
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.i1.b, androidx.datastore.preferences.protobuf.i2.a
        /* renamed from: f2, reason: merged with bridge method [inline-methods] */
        public final MessageType l1() {
            if (this.f28696d) {
                return (MessageType) this.f28695c;
            }
            ((e) this.f28695c).extensions.I();
            return (MessageType) super.l1();
        }

        public final <Type> BuilderType g2(q0<MessageType, ?> q0Var) {
            h<MessageType, ?> C1 = i1.C1(q0Var);
            l2(C1);
            W1();
            h2().j(C1.f28710d);
            return this;
        }

        void i2(c1<g> c1Var) {
            W1();
            ((e) this.f28695c).extensions = c1Var;
        }

        public final <Type> BuilderType j2(q0<MessageType, List<Type>> q0Var, int i4, Type type) {
            h<MessageType, ?> C1 = i1.C1(q0Var);
            l2(C1);
            W1();
            h2().P(C1.f28710d, i4, C1.j(type));
            return this;
        }

        public final <Type> BuilderType k2(q0<MessageType, Type> q0Var, Type type) {
            h<MessageType, ?> C1 = i1.C1(q0Var);
            l2(C1);
            W1();
            h2().O(C1.f28710d, C1.k(type));
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.i1.f
        public final <Type> Type s0(q0<MessageType, List<Type>> q0Var, int i4) {
            return (Type) ((e) this.f28695c).s0(q0Var, i4);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public static abstract class e<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends i1<MessageType, BuilderType> implements f<MessageType, BuilderType> {
        protected c1<g> extensions = c1.s();

        /* compiled from: GeneratedMessageLite.java */
        protected class a {

            /* renamed from: a, reason: collision with root package name */
            private final Iterator<Map.Entry<g, Object>> f28698a;

            /* renamed from: b, reason: collision with root package name */
            private Map.Entry<g, Object> f28699b;

            /* renamed from: c, reason: collision with root package name */
            private final boolean f28700c;

            /* synthetic */ a(e eVar, boolean z4, a aVar) {
                this(z4);
            }

            public void a(int i4, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<g, Object> entry = this.f28699b;
                    if (entry == null || entry.getKey().f28703c >= i4) {
                        return;
                    }
                    g key = this.f28699b.getKey();
                    if (this.f28700c && key.f28704d.getJavaType() == t4.c.MESSAGE && !key.f28705e) {
                        codedOutputStream.P1(key.f28703c, (i2) this.f28699b.getValue());
                    } else {
                        c1.T(key, this.f28699b.getValue(), codedOutputStream);
                    }
                    if (this.f28698a.hasNext()) {
                        this.f28699b = this.f28698a.next();
                    } else {
                        this.f28699b = null;
                    }
                }
            }

            private a(boolean z4) {
                Iterator<Map.Entry<g, Object>> H = e.this.extensions.H();
                this.f28698a = H;
                if (H.hasNext()) {
                    this.f28699b = H.next();
                }
                this.f28700c = z4;
            }
        }

        private void I2(z zVar, h<?, ?> hVar, s0 s0Var, int i4) throws IOException {
            S2(zVar, s0Var, hVar, t4.c(i4, 2), i4);
        }

        private void O2(w wVar, s0 s0Var, h<?, ?> hVar) throws IOException {
            i2 i2Var = (i2) this.extensions.u(hVar.f28710d);
            i2.a q4 = i2Var != null ? i2Var.q() : null;
            if (q4 == null) {
                q4 = hVar.c().w();
            }
            q4.H1(wVar, s0Var);
            J2().O(hVar.f28710d, hVar.j(q4.a()));
        }

        private <MessageType extends i2> void P2(MessageType messagetype, z zVar, s0 s0Var) throws IOException {
            int i4 = 0;
            w wVar = null;
            h<?, ?> hVar = null;
            while (true) {
                int Y = zVar.Y();
                if (Y == 0) {
                    break;
                }
                if (Y == t4.f28976s) {
                    i4 = zVar.Z();
                    if (i4 != 0) {
                        hVar = s0Var.c(messagetype, i4);
                    }
                } else if (Y == t4.f28977t) {
                    if (i4 == 0 || hVar == null) {
                        wVar = zVar.x();
                    } else {
                        I2(zVar, hVar, s0Var, i4);
                        wVar = null;
                    }
                } else if (!zVar.g0(Y)) {
                    break;
                }
            }
            zVar.a(t4.f28975r);
            if (wVar == null || i4 == 0) {
                return;
            }
            if (hVar != null) {
                O2(wVar, s0Var, hVar);
            } else {
                Y1(i4, wVar);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean S2(androidx.content.preferences.protobuf.z r6, androidx.content.preferences.protobuf.s0 r7, androidx.datastore.preferences.protobuf.i1.h<?, ?> r8, int r9, int r10) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 269
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i1.e.S2(androidx.datastore.preferences.protobuf.z, androidx.datastore.preferences.protobuf.s0, androidx.datastore.preferences.protobuf.i1$h, int, int):boolean");
        }

        private void V2(h<MessageType, ?> hVar) {
            if (hVar.h() != z()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i1.f
        public final <Type> boolean C0(q0<MessageType, Type> q0Var) {
            h<MessageType, ?> C1 = i1.C1(q0Var);
            V2(C1);
            return this.extensions.B(C1.f28710d);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.f
        public final <Type> int J0(q0<MessageType, List<Type>> q0Var) {
            h<MessageType, ?> C1 = i1.C1(q0Var);
            V2(C1);
            return this.extensions.y(C1.f28710d);
        }

        c1<g> J2() {
            if (this.extensions.D()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.i1.f
        public final <Type> Type K(q0<MessageType, Type> q0Var) {
            h<MessageType, ?> C1 = i1.C1(q0Var);
            V2(C1);
            Object u4 = this.extensions.u(C1.f28710d);
            return u4 == null ? C1.f28708b : (Type) C1.g(u4);
        }

        protected boolean K2() {
            return this.extensions.E();
        }

        protected int L2() {
            return this.extensions.z();
        }

        protected int M2() {
            return this.extensions.v();
        }

        protected final void N2(MessageType messagetype) {
            if (this.extensions.D()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.J(messagetype.extensions);
        }

        protected e<MessageType, BuilderType>.a Q2() {
            return new a(this, false, null);
        }

        protected e<MessageType, BuilderType>.a R2() {
            return new a(this, true, null);
        }

        protected <MessageType extends i2> boolean T2(MessageType messagetype, z zVar, s0 s0Var, int i4) throws IOException {
            int a5 = t4.a(i4);
            return S2(zVar, s0Var, s0Var.c(messagetype, a5), i4, a5);
        }

        protected <MessageType extends i2> boolean U2(MessageType messagetype, z zVar, s0 s0Var, int i4) throws IOException {
            if (i4 != t4.f28974q) {
                return (i4 & 7) == 2 ? T2(messagetype, zVar, s0Var, i4) : zVar.g0(i4);
            }
            P2(messagetype, zVar, s0Var);
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.i1$b, androidx.datastore.preferences.protobuf.i2$a] */
        @Override // androidx.content.preferences.protobuf.i1, androidx.content.preferences.protobuf.i2
        public /* bridge */ /* synthetic */ i2.a q() {
            return q();
        }

        @Override // androidx.datastore.preferences.protobuf.i1.f
        public final <Type> Type s0(q0<MessageType, List<Type>> q0Var, int i4) {
            h<MessageType, ?> C1 = i1.C1(q0Var);
            V2(C1);
            return (Type) C1.i(this.extensions.x(C1.f28710d, i4));
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.i1$b, androidx.datastore.preferences.protobuf.i2$a] */
        @Override // androidx.content.preferences.protobuf.i1, androidx.content.preferences.protobuf.i2
        public /* bridge */ /* synthetic */ i2.a w() {
            return w();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.i1, androidx.datastore.preferences.protobuf.i2] */
        @Override // androidx.content.preferences.protobuf.i1, androidx.content.preferences.protobuf.j2
        public /* bridge */ /* synthetic */ i2 z() {
            return z();
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public interface f<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends j2 {
        <Type> boolean C0(q0<MessageType, Type> q0Var);

        <Type> int J0(q0<MessageType, List<Type>> q0Var);

        <Type> Type K(q0<MessageType, Type> q0Var);

        <Type> Type s0(q0<MessageType, List<Type>> q0Var, int i4);
    }

    /* compiled from: GeneratedMessageLite.java */
    static final class g implements c1.c<g> {

        /* renamed from: b, reason: collision with root package name */
        final p1.d<?> f28702b;

        /* renamed from: c, reason: collision with root package name */
        final int f28703c;

        /* renamed from: d, reason: collision with root package name */
        final t4.b f28704d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f28705e;

        /* renamed from: f, reason: collision with root package name */
        final boolean f28706f;

        g(p1.d<?> dVar, int i4, t4.b bVar, boolean z4, boolean z5) {
            this.f28702b = dVar;
            this.f28703c = i4;
            this.f28704d = bVar;
            this.f28705e = z4;
            this.f28706f = z5;
        }

        @Override // androidx.datastore.preferences.protobuf.c1.c
        public boolean F() {
            return this.f28705e;
        }

        @Override // androidx.datastore.preferences.protobuf.c1.c
        public t4.b H() {
            return this.f28704d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.c1.c
        public i2.a K1(i2.a aVar, i2 i2Var) {
            return ((b) aVar).a2((i1) i2Var);
        }

        @Override // androidx.datastore.preferences.protobuf.c1.c
        public p1.d<?> M0() {
            return this.f28702b;
        }

        @Override // androidx.datastore.preferences.protobuf.c1.c
        public t4.c O() {
            return this.f28704d.getJavaType();
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            return this.f28703c - gVar.f28703c;
        }

        @Override // androidx.datastore.preferences.protobuf.c1.c
        public int getNumber() {
            return this.f28703c;
        }

        @Override // androidx.datastore.preferences.protobuf.c1.c
        public boolean isPacked() {
            return this.f28706f;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public static class h<ContainingType extends i2, Type> extends q0<ContainingType, Type> {

        /* renamed from: a, reason: collision with root package name */
        final ContainingType f28707a;

        /* renamed from: b, reason: collision with root package name */
        final Type f28708b;

        /* renamed from: c, reason: collision with root package name */
        final i2 f28709c;

        /* renamed from: d, reason: collision with root package name */
        final g f28710d;

        h(ContainingType containingtype, Type type, i2 i2Var, g gVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (gVar.f28704d == t4.b.MESSAGE && i2Var == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f28707a = containingtype;
            this.f28708b = type;
            this.f28709c = i2Var;
            this.f28710d = gVar;
        }

        @Override // androidx.content.preferences.protobuf.q0
        public Type a() {
            return this.f28708b;
        }

        @Override // androidx.content.preferences.protobuf.q0
        public t4.b b() {
            return this.f28710d.f28704d;
        }

        @Override // androidx.content.preferences.protobuf.q0
        public i2 c() {
            return this.f28709c;
        }

        @Override // androidx.content.preferences.protobuf.q0
        public int d() {
            return this.f28710d.f28703c;
        }

        @Override // androidx.content.preferences.protobuf.q0
        public boolean f() {
            return this.f28710d.f28705e;
        }

        Object g(Object obj) {
            g gVar = this.f28710d;
            if (!gVar.f28705e) {
                return i(obj);
            }
            if (gVar.f28704d.getJavaType() != t4.c.ENUM) {
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
            return this.f28707a;
        }

        Object i(Object obj) {
            return this.f28710d.f28704d.getJavaType() == t4.c.ENUM ? this.f28710d.f28702b.a(((Integer) obj).intValue()) : obj;
        }

        Object j(Object obj) {
            return this.f28710d.f28704d.getJavaType() == t4.c.ENUM ? Integer.valueOf(((p1.c) obj).getNumber()) : obj;
        }

        Object k(Object obj) {
            g gVar = this.f28710d;
            if (!gVar.f28705e) {
                return j(obj);
            }
            if (gVar.f28704d.getJavaType() != t4.c.ENUM) {
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
    protected static final class j implements Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final long f28711e = 0;

        /* renamed from: b, reason: collision with root package name */
        private final Class<?> f28712b;

        /* renamed from: c, reason: collision with root package name */
        private final String f28713c;

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f28714d;

        j(i2 i2Var) {
            Class<?> cls = i2Var.getClass();
            this.f28712b = cls;
            this.f28713c = cls.getName();
            this.f28714d = i2Var.m();
        }

        public static j a(i2 i2Var) {
            return new j(i2Var);
        }

        @Deprecated
        private Object c() throws ObjectStreamException {
            try {
                Field declaredField = d().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((i2) declaredField.get(null)).w().q2(this.f28714d).l1();
            } catch (InvalidProtocolBufferException e4) {
                throw new RuntimeException("Unable to understand proto buffer", e4);
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f28713c, e5);
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("Unable to call parsePartialFrom", e6);
            } catch (NoSuchFieldException e7) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.f28713c, e7);
            } catch (SecurityException e10) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.f28713c, e10);
            }
        }

        private Class<?> d() throws ClassNotFoundException {
            Class<?> cls = this.f28712b;
            return cls != null ? cls : Class.forName(this.f28713c);
        }

        protected Object b() throws ObjectStreamException {
            try {
                Field declaredField = d().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((i2) declaredField.get(null)).w().q2(this.f28714d).l1();
            } catch (InvalidProtocolBufferException e4) {
                throw new RuntimeException("Unable to understand proto buffer", e4);
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f28713c, e5);
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("Unable to call parsePartialFrom", e6);
            } catch (NoSuchFieldException unused) {
                return c();
            } catch (SecurityException e7) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.f28713c, e7);
            }
        }
    }

    protected static <T extends i1<T, ?>> T B2(T t4, z zVar) throws InvalidProtocolBufferException {
        return (T) C2(t4, zVar, s0.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>, T> h<MessageType, T> C1(q0<MessageType, T> q0Var) {
        if (q0Var.e()) {
            return (h) q0Var;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    static <T extends i1<T, ?>> T C2(T t4, z zVar, s0 s0Var) throws InvalidProtocolBufferException {
        T t5 = (T) t4.I1(i.NEW_MUTABLE_INSTANCE);
        try {
            m3 j4 = f3.a().j(t5);
            j4.b(t5, a0.S(zVar), s0Var);
            j4.c(t5);
            return t5;
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4.getMessage()).j(t5);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e5.getCause());
            }
            throw e5;
        }
    }

    static <T extends i1<T, ?>> T D2(T t4, byte[] bArr, int i4, int i5, s0 s0Var) throws InvalidProtocolBufferException {
        T t5 = (T) t4.I1(i.NEW_MUTABLE_INSTANCE);
        try {
            m3 j4 = f3.a().j(t5);
            j4.j(t5, bArr, i4, i4 + i5, new l.b(s0Var));
            j4.c(t5);
            if (t5.memoizedHashCode == 0) {
                return t5;
            }
            throw new RuntimeException();
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4.getMessage()).j(t5);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.l().j(t5);
        }
    }

    private static <T extends i1<T, ?>> T E1(T t4) throws InvalidProtocolBufferException {
        if (t4 == null || W1(t4, true)) {
            return t4;
        }
        throw t4.x1().a().j(t4);
    }

    private static <T extends i1<T, ?>> T E2(T t4, byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (T) E1(D2(t4, bArr, 0, bArr.length, s0Var));
    }

    protected static <T extends i1<?, ?>> void G2(Class<T> cls, T t4) {
        defaultInstanceMap.put(cls, t4);
    }

    protected static p1.a L1() {
        return s.i();
    }

    protected static p1.b M1() {
        return c0.i();
    }

    protected static p1.f N1() {
        return e1.i();
    }

    protected static p1.g O1() {
        return n1.i();
    }

    protected static p1.i P1() {
        return z1.i();
    }

    protected static <E> p1.k<E> Q1() {
        return g3.f();
    }

    private final void R1() {
        if (this.unknownFields == m4.e()) {
            this.unknownFields = m4.p();
        }
    }

    static <T extends i1<?, ?>> T S1(Class<T> cls) {
        i1<?, ?> i1Var = defaultInstanceMap.get(cls);
        if (i1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                i1Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (i1Var == null) {
            i1Var = (T) ((i1) p4.j(cls)).z();
            if (i1Var == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, i1Var);
        }
        return (T) i1Var;
    }

    static Method U1(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e4);
        }
    }

    static Object V1(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends i1<T, ?>> boolean W1(T t4, boolean z4) {
        byte byteValue = ((Byte) t4.I1(i.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d5 = f3.a().j(t4).d(t4);
        if (z4) {
            t4.J1(i.SET_MEMOIZED_IS_INITIALIZED, d5 ? t4 : null);
        }
        return d5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.p1$a] */
    protected static p1.a b2(p1.a aVar) {
        int size = aVar.size();
        return aVar.e2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.p1$b] */
    protected static p1.b c2(p1.b bVar) {
        int size = bVar.size();
        return bVar.e2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.p1$f] */
    protected static p1.f d2(p1.f fVar) {
        int size = fVar.size();
        return fVar.e2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.p1$g] */
    protected static p1.g e2(p1.g gVar) {
        int size = gVar.size();
        return gVar.e2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.p1$i] */
    protected static p1.i f2(p1.i iVar) {
        int size = iVar.size();
        return iVar.e2(size == 0 ? 10 : size * 2);
    }

    protected static <E> p1.k<E> g2(p1.k<E> kVar) {
        int size = kVar.size();
        return kVar.e2(size == 0 ? 10 : size * 2);
    }

    protected static Object i2(i2 i2Var, String str, Object[] objArr) {
        return new j3(i2Var, str, objArr);
    }

    public static <ContainingType extends i2, Type> h<ContainingType, Type> j2(ContainingType containingtype, i2 i2Var, p1.d<?> dVar, int i4, t4.b bVar, boolean z4, Class cls) {
        return new h<>(containingtype, Collections.emptyList(), i2Var, new g(dVar, i4, bVar, true, z4), cls);
    }

    public static <ContainingType extends i2, Type> h<ContainingType, Type> k2(ContainingType containingtype, Type type, i2 i2Var, p1.d<?> dVar, int i4, t4.b bVar, Class cls) {
        return new h<>(containingtype, type, i2Var, new g(dVar, i4, bVar, false, false), cls);
    }

    protected static <T extends i1<T, ?>> T l2(T t4, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) E1(y2(t4, inputStream, s0.d()));
    }

    protected static <T extends i1<T, ?>> T m2(T t4, InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException {
        return (T) E1(y2(t4, inputStream, s0Var));
    }

    protected static <T extends i1<T, ?>> T n2(T t4, w wVar) throws InvalidProtocolBufferException {
        return (T) E1(o2(t4, wVar, s0.d()));
    }

    protected static <T extends i1<T, ?>> T o2(T t4, w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (T) E1(z2(t4, wVar, s0Var));
    }

    protected static <T extends i1<T, ?>> T p2(T t4, z zVar) throws InvalidProtocolBufferException {
        return (T) r2(t4, zVar, s0.d());
    }

    protected static <T extends i1<T, ?>> T r2(T t4, z zVar, s0 s0Var) throws InvalidProtocolBufferException {
        return (T) E1(C2(t4, zVar, s0Var));
    }

    protected static <T extends i1<T, ?>> T s2(T t4, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) E1(C2(t4, z.k(inputStream, 4096), s0.d()));
    }

    protected static <T extends i1<T, ?>> T t2(T t4, InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException {
        return (T) E1(C2(t4, z.k(inputStream, 4096), s0Var));
    }

    protected static <T extends i1<T, ?>> T u2(T t4, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (T) v2(t4, byteBuffer, s0.d());
    }

    protected static <T extends i1<T, ?>> T v2(T t4, ByteBuffer byteBuffer, s0 s0Var) throws InvalidProtocolBufferException {
        return (T) E1(r2(t4, z.o(byteBuffer, false), s0Var));
    }

    protected static <T extends i1<T, ?>> T w2(T t4, byte[] bArr) throws InvalidProtocolBufferException {
        return (T) E1(D2(t4, bArr, 0, bArr.length, s0.d()));
    }

    protected static <T extends i1<T, ?>> T x2(T t4, byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
        return (T) E1(D2(t4, bArr, 0, bArr.length, s0Var));
    }

    private static <T extends i1<T, ?>> T y2(T t4, InputStream inputStream, s0 s0Var) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            z k4 = z.k(new a.AbstractC0471a.C0472a(inputStream, z.O(read, inputStream)), 4096);
            T t5 = (T) C2(t4, k4, s0Var);
            try {
                k4.a(0);
                return t5;
            } catch (InvalidProtocolBufferException e4) {
                throw e4.j(t5);
            }
        } catch (IOException e5) {
            throw new InvalidProtocolBufferException(e5.getMessage());
        }
    }

    private static <T extends i1<T, ?>> T z2(T t4, w wVar, s0 s0Var) throws InvalidProtocolBufferException {
        z S = wVar.S();
        T t5 = (T) C2(t4, S, s0Var);
        try {
            S.a(0);
            return t5;
        } catch (InvalidProtocolBufferException e4) {
            throw e4.j(t5);
        }
    }

    Object A1() throws Exception {
        return I1(i.BUILD_MESSAGE_INFO);
    }

    @Override // androidx.content.preferences.protobuf.i2
    public final c3<MessageType> B() {
        return (c3) I1(i.GET_PARSER);
    }

    protected final <MessageType extends i1<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType F1() {
        return (BuilderType) I1(i.NEW_BUILDER);
    }

    protected boolean F2(int i4, z zVar) throws IOException {
        if (t4.b(i4) == 4) {
            return false;
        }
        R1();
        return this.unknownFields.k(i4, zVar);
    }

    protected final <MessageType extends i1<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType G1(MessageType messagetype) {
        return (BuilderType) F1().a2(messagetype);
    }

    @Override // androidx.content.preferences.protobuf.i2
    /* renamed from: H2, reason: merged with bridge method [inline-methods] */
    public final BuilderType q() {
        BuilderType buildertype = (BuilderType) I1(i.NEW_BUILDER);
        buildertype.a2(this);
        return buildertype;
    }

    protected Object I1(i iVar) {
        return K1(iVar, null, null);
    }

    protected Object J1(i iVar, Object obj) {
        return K1(iVar, obj, null);
    }

    protected abstract Object K1(i iVar, Object obj, Object obj2);

    @Override // androidx.content.preferences.protobuf.a
    int L() {
        return this.memoizedSerializedSize;
    }

    @Override // androidx.content.preferences.protobuf.j2
    /* renamed from: T1, reason: merged with bridge method [inline-methods] */
    public final MessageType z() {
        return (MessageType) I1(i.GET_DEFAULT_INSTANCE);
    }

    protected void X1() {
        f3.a().j(this).c(this);
    }

    protected void Y1(int i4, w wVar) {
        R1();
        this.unknownFields.m(i4, wVar);
    }

    protected final void Z1(m4 m4Var) {
        this.unknownFields = m4.o(this.unknownFields, m4Var);
    }

    protected void a2(int i4, int i5) {
        R1();
        this.unknownFields.n(i4, i5);
    }

    @Override // androidx.content.preferences.protobuf.i2
    public void c1(CodedOutputStream codedOutputStream) throws IOException {
        f3.a().j(this).h(this, b0.T(codedOutputStream));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (z().getClass().isInstance(obj)) {
            return f3.a().j(this).i(this, (i1) obj);
        }
        return false;
    }

    @Override // androidx.content.preferences.protobuf.i2
    /* renamed from: h2, reason: merged with bridge method [inline-methods] */
    public final BuilderType w() {
        return (BuilderType) I1(i.NEW_BUILDER);
    }

    public int hashCode() {
        int i4 = this.memoizedHashCode;
        if (i4 != 0) {
            return i4;
        }
        int g4 = f3.a().j(this).g(this);
        this.memoizedHashCode = g4;
        return g4;
    }

    @Override // androidx.content.preferences.protobuf.j2
    public final boolean p() {
        return W1(this, true);
    }

    @Override // androidx.content.preferences.protobuf.i2
    public int t() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = f3.a().j(this).e(this);
        }
        return this.memoizedSerializedSize;
    }

    public String toString() {
        return k2.e(this, super.toString());
    }

    @Override // androidx.content.preferences.protobuf.a
    void y1(int i4) {
        this.memoizedSerializedSize = i4;
    }
}
