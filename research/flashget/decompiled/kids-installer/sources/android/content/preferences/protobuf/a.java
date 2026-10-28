package android.content.preferences.protobuf;

import android.content.preferences.protobuf.CodedOutputStream;
import android.content.preferences.protobuf.a;
import android.content.preferences.protobuf.a.AbstractC0082a;
import android.content.preferences.protobuf.h2;
import android.content.preferences.protobuf.w;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: AbstractMessageLite.java */
/* loaded from: classes3.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0082a<MessageType, BuilderType>> implements h2 {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* loaded from: classes.dex */
    protected interface b {
        int getNumber();
    }

    private String Z(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Deprecated
    protected static <T> void g(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC0082a.F1(iterable, (List) collection);
    }

    protected static <T> void h(Iterable<T> iterable, List<? super T> list) {
        AbstractC0082a.F1(iterable, list);
    }

    protected static void r(w wVar) throws IllegalArgumentException {
        if (!wVar.L()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    void E1(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.preferences.protobuf.h2
    public void L(OutputStream outputStream) throws IOException {
        CodedOutputStream.f fVar = new CodedOutputStream.f(outputStream, CodedOutputStream.J0(u()));
        M0(fVar);
        fVar.e1();
    }

    int R(j3 j3Var) {
        int t5 = t();
        if (t5 != -1) {
            return t5;
        }
        int g5 = j3Var.g(this);
        E1(g5);
        return g5;
    }

    @Override // android.content.preferences.protobuf.h2
    public void V(OutputStream outputStream) throws IOException {
        int u5 = u();
        int L0 = CodedOutputStream.L0(u5) + u5;
        if (L0 > 4096) {
            L0 = 4096;
        }
        CodedOutputStream.f fVar = new CodedOutputStream.f(outputStream, L0);
        fVar.h2(u5);
        M0(fVar);
        fVar.e1();
    }

    @Override // android.content.preferences.protobuf.h2
    public byte[] b1() {
        try {
            byte[] bArr = new byte[u()];
            CodedOutputStream n12 = CodedOutputStream.n1(bArr);
            M0(n12);
            n12.Z();
            return bArr;
        } catch (IOException e6) {
            throw new RuntimeException(Z("byte array"), e6);
        }
    }

    @Override // android.content.preferences.protobuf.h2
    public w j0() {
        try {
            w.h N = w.N(u());
            M0(N.b());
            return N.a();
        } catch (IOException e6) {
            throw new RuntimeException(Z("ByteString"), e6);
        }
    }

    int t() {
        throw new UnsupportedOperationException();
    }

    UninitializedMessageException y0() {
        return new UninitializedMessageException(this);
    }

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0082a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0082a<MessageType, BuilderType>> implements h2.a {
        @Deprecated
        protected static <T> void E1(Iterable<T> iterable, Collection<? super T> collection) {
            F1(iterable, (List) collection);
        }

        protected static <T> void F1(Iterable<T> iterable, List<? super T> list) {
            o1.d(iterable);
            if (!(iterable instanceof u1)) {
                if (iterable instanceof a3) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    G1(iterable, list);
                    return;
                }
            }
            List<?> j5 = ((u1) iterable).j();
            u1 u1Var = (u1) list;
            int size = list.size();
            for (Object obj : j5) {
                if (obj == null) {
                    String str = "Element at index " + (u1Var.size() - size) + " is null.";
                    for (int size2 = u1Var.size() - 1; size2 >= size; size2--) {
                        u1Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof w) {
                    u1Var.F((w) obj);
                } else {
                    u1Var.add((String) obj);
                }
            }
        }

        private static <T> void G1(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size = list.size();
            for (T t5 : iterable) {
                if (t5 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t5);
            }
        }

        private String I1(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        protected static UninitializedMessageException V1(h2 h2Var) {
            return new UninitializedMessageException(h2Var);
        }

        @Override // 
        /* renamed from: H1, reason: merged with bridge method [inline-methods] */
        public abstract BuilderType mo0clone();

        protected abstract BuilderType J1(MessageType messagetype);

        @Override // androidx.datastore.preferences.protobuf.h2.a
        /* renamed from: K1, reason: merged with bridge method [inline-methods] */
        public BuilderType O(w wVar) throws InvalidProtocolBufferException {
            try {
                z O = wVar.O();
                P(O);
                O.a(0);
                return this;
            } catch (InvalidProtocolBufferException e6) {
                throw e6;
            } catch (IOException e7) {
                throw new RuntimeException(I1("ByteString"), e7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h2.a
        /* renamed from: L1, reason: merged with bridge method [inline-methods] */
        public BuilderType w1(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
            try {
                z O = wVar.O();
                T0(O, s0Var);
                O.a(0);
                return this;
            } catch (InvalidProtocolBufferException e6) {
                throw e6;
            } catch (IOException e7) {
                throw new RuntimeException(I1("ByteString"), e7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h2.a
        /* renamed from: M1, reason: merged with bridge method [inline-methods] */
        public BuilderType P(z zVar) throws IOException {
            return T0(zVar, s0.d());
        }

        @Override // androidx.datastore.preferences.protobuf.h2.a
        /* renamed from: N1 */
        public abstract BuilderType T0(z zVar, s0 s0Var) throws IOException;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.h2.a
        /* renamed from: O1, reason: merged with bridge method [inline-methods] */
        public BuilderType H(h2 h2Var) {
            if (m().getClass().isInstance(h2Var)) {
                return (BuilderType) J1((a) h2Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        @Override // androidx.datastore.preferences.protobuf.h2.a
        /* renamed from: P1, reason: merged with bridge method [inline-methods] */
        public BuilderType p0(InputStream inputStream) throws IOException {
            z j5 = z.j(inputStream);
            P(j5);
            j5.a(0);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.h2.a
        /* renamed from: Q1, reason: merged with bridge method [inline-methods] */
        public BuilderType s1(InputStream inputStream, s0 s0Var) throws IOException {
            z j5 = z.j(inputStream);
            T0(j5, s0Var);
            j5.a(0);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.h2.a
        /* renamed from: R1, reason: merged with bridge method [inline-methods] */
        public BuilderType U(byte[] bArr) throws InvalidProtocolBufferException {
            return n1(bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.h2.a
        /* renamed from: S1 */
        public BuilderType n1(byte[] bArr, int i5, int i6) throws InvalidProtocolBufferException {
            try {
                z r5 = z.r(bArr, i5, i6, false);
                P(r5);
                r5.a(0);
                return this;
            } catch (InvalidProtocolBufferException e6) {
                throw e6;
            } catch (IOException e7) {
                throw new RuntimeException(I1("byte array"), e7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h2.a
        /* renamed from: T1 */
        public BuilderType X(byte[] bArr, int i5, int i6, s0 s0Var) throws InvalidProtocolBufferException {
            try {
                z r5 = z.r(bArr, i5, i6, false);
                T0(r5, s0Var);
                r5.a(0);
                return this;
            } catch (InvalidProtocolBufferException e6) {
                throw e6;
            } catch (IOException e7) {
                throw new RuntimeException(I1("byte array"), e7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h2.a
        /* renamed from: U1, reason: merged with bridge method [inline-methods] */
        public BuilderType q1(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
            return X(bArr, 0, bArr.length, s0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.h2.a
        public boolean f0(InputStream inputStream) throws IOException {
            return g1(inputStream, s0.d());
        }

        @Override // androidx.datastore.preferences.protobuf.h2.a
        public boolean g1(InputStream inputStream, s0 s0Var) throws IOException {
            int read = inputStream.read();
            if (read == -1) {
                return false;
            }
            s1(new C0083a(inputStream, z.O(read, inputStream)), s0Var);
            return true;
        }

        /* compiled from: AbstractMessageLite.java */
        /* renamed from: androidx.datastore.preferences.protobuf.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0083a extends FilterInputStream {

            /* renamed from: o, reason: collision with root package name */
            private int f7162o;

            C0083a(InputStream inputStream, int i5) {
                super(inputStream);
                this.f7162o = i5;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f7162o);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f7162o <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f7162o--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j5) throws IOException {
                long skip = super.skip(Math.min(j5, this.f7162o));
                if (skip >= 0) {
                    this.f7162o = (int) (this.f7162o - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i5, int i6) throws IOException {
                int i7 = this.f7162o;
                if (i7 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i5, Math.min(i6, i7));
                if (read >= 0) {
                    this.f7162o -= read;
                }
                return read;
            }
        }
    }
}
