package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.CodedOutputStream;
import androidx.content.preferences.protobuf.a;
import androidx.content.preferences.protobuf.a.AbstractC0471a;
import androidx.content.preferences.protobuf.i2;
import androidx.content.preferences.protobuf.w;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: AbstractMessageLite.java */
/* loaded from: classes3.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0471a<MessageType, BuilderType>> implements i2 {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    protected interface b {
        int getNumber();
    }

    private String O0(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Deprecated
    protected static <T> void h(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC0471a.y1(iterable, (List) collection);
    }

    protected static <T> void j(Iterable<T> iterable, List<? super T> list) {
        AbstractC0471a.y1(iterable, list);
    }

    protected static void x(w wVar) throws IllegalArgumentException {
        if (!wVar.P()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    @Override // androidx.content.preferences.protobuf.i2
    public void J(OutputStream outputStream) throws IOException {
        int t4 = t();
        int L0 = CodedOutputStream.L0(t4) + t4;
        if (L0 > 4096) {
            L0 = 4096;
        }
        CodedOutputStream.f fVar = new CodedOutputStream.f(outputStream, L0);
        fVar.h2(t4);
        c1(fVar);
        fVar.e1();
    }

    int L() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.content.preferences.protobuf.i2
    public w R() {
        try {
            w.h R = w.R(t());
            c1(R.b());
            return R.a();
        } catch (IOException e4) {
            throw new RuntimeException(O0("ByteString"), e4);
        }
    }

    @Override // androidx.content.preferences.protobuf.i2
    public byte[] m() {
        try {
            byte[] bArr = new byte[t()];
            CodedOutputStream n12 = CodedOutputStream.n1(bArr);
            c1(n12);
            n12.Z();
            return bArr;
        } catch (IOException e4) {
            throw new RuntimeException(O0("byte array"), e4);
        }
    }

    int r0(m3 m3Var) {
        int L = L();
        if (L != -1) {
            return L;
        }
        int e4 = m3Var.e(this);
        y1(e4);
        return e4;
    }

    @Override // androidx.content.preferences.protobuf.i2
    public void writeTo(OutputStream outputStream) throws IOException {
        CodedOutputStream.f fVar = new CodedOutputStream.f(outputStream, CodedOutputStream.J0(t()));
        c1(fVar);
        fVar.e1();
    }

    UninitializedMessageException x1() {
        return new UninitializedMessageException(this);
    }

    void y1(int i4) {
        throw new UnsupportedOperationException();
    }

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0471a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0471a<MessageType, BuilderType>> implements i2.a {
        private String C1(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        protected static UninitializedMessageException R1(i2 i2Var) {
            return new UninitializedMessageException(i2Var);
        }

        @Deprecated
        protected static <T> void x1(Iterable<T> iterable, Collection<? super T> collection) {
            y1(iterable, (List) collection);
        }

        protected static <T> void y1(Iterable<T> iterable, List<? super T> list) {
            p1.d(iterable);
            if (!(iterable instanceof v1)) {
                if (iterable instanceof d3) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    z1(iterable, list);
                    return;
                }
            }
            List<?> y4 = ((v1) iterable).y();
            v1 v1Var = (v1) list;
            int size = list.size();
            for (Object obj : y4) {
                if (obj == null) {
                    String str = "Element at index " + (v1Var.size() - size) + " is null.";
                    for (int size2 = v1Var.size() - 1; size2 >= size; size2--) {
                        v1Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof w) {
                    v1Var.w2((w) obj);
                } else {
                    v1Var.add((String) obj);
                }
            }
        }

        private static <T> void z1(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size = list.size();
            for (T t4 : iterable) {
                if (t4 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t4);
            }
        }

        @Override // 
        /* renamed from: A1, reason: merged with bridge method [inline-methods] */
        public abstract BuilderType mo6clone();

        @Override // androidx.datastore.preferences.protobuf.i2.a
        public boolean A2(InputStream inputStream) throws IOException {
            return v3(inputStream, s0.d());
        }

        protected abstract BuilderType E1(MessageType messagetype);

        @Override // androidx.datastore.preferences.protobuf.i2.a
        /* renamed from: F1, reason: merged with bridge method [inline-methods] */
        public BuilderType X(w wVar) throws InvalidProtocolBufferException {
            try {
                z S = wVar.S();
                j0(S);
                S.a(0);
                return this;
            } catch (InvalidProtocolBufferException e4) {
                throw e4;
            } catch (IOException e5) {
                throw new RuntimeException(C1("ByteString"), e5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i2.a
        /* renamed from: G1, reason: merged with bridge method [inline-methods] */
        public BuilderType H1(w wVar, s0 s0Var) throws InvalidProtocolBufferException {
            try {
                z S = wVar.S();
                n1(S, s0Var);
                S.a(0);
                return this;
            } catch (InvalidProtocolBufferException e4) {
                throw e4;
            } catch (IOException e5) {
                throw new RuntimeException(C1("ByteString"), e5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i2.a
        /* renamed from: I1, reason: merged with bridge method [inline-methods] */
        public BuilderType j0(z zVar) throws IOException {
            return n1(zVar, s0.d());
        }

        @Override // androidx.datastore.preferences.protobuf.i2.a
        /* renamed from: J1 */
        public abstract BuilderType n1(z zVar, s0 s0Var) throws IOException;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.i2.a
        /* renamed from: K1, reason: merged with bridge method [inline-methods] */
        public BuilderType Q(i2 i2Var) {
            if (z().getClass().isInstance(i2Var)) {
                return (BuilderType) E1((a) i2Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        @Override // androidx.datastore.preferences.protobuf.i2.a
        /* renamed from: L1, reason: merged with bridge method [inline-methods] */
        public BuilderType K0(InputStream inputStream) throws IOException {
            z k4 = z.k(inputStream, 4096);
            j0(k4);
            k4.a(0);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.i2.a
        /* renamed from: M1, reason: merged with bridge method [inline-methods] */
        public BuilderType D1(InputStream inputStream, s0 s0Var) throws IOException {
            z k4 = z.k(inputStream, 4096);
            n1(k4, s0Var);
            k4.a(0);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.i2.a
        /* renamed from: N1, reason: merged with bridge method [inline-methods] */
        public BuilderType q2(byte[] bArr) throws InvalidProtocolBufferException {
            return O1(bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.i2.a
        public BuilderType O1(byte[] bArr, int i4, int i5) throws InvalidProtocolBufferException {
            try {
                z r4 = z.r(bArr, i4, i5, false);
                j0(r4);
                r4.a(0);
                return this;
            } catch (InvalidProtocolBufferException e4) {
                throw e4;
            } catch (IOException e5) {
                throw new RuntimeException(C1("byte array"), e5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i2.a
        /* renamed from: P1 */
        public BuilderType n0(byte[] bArr, int i4, int i5, s0 s0Var) throws InvalidProtocolBufferException {
            try {
                z r4 = z.r(bArr, i4, i5, false);
                n1(r4, s0Var);
                r4.a(0);
                return this;
            } catch (InvalidProtocolBufferException e4) {
                throw e4;
            } catch (IOException e5) {
                throw new RuntimeException(C1("byte array"), e5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i2.a
        /* renamed from: Q1, reason: merged with bridge method [inline-methods] */
        public BuilderType B1(byte[] bArr, s0 s0Var) throws InvalidProtocolBufferException {
            return n0(bArr, 0, bArr.length, s0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.i2.a
        public boolean v3(InputStream inputStream, s0 s0Var) throws IOException {
            int read = inputStream.read();
            if (read == -1) {
                return false;
            }
            D1(new C0472a(inputStream, z.O(read, inputStream)), s0Var);
            return true;
        }

        /* compiled from: AbstractMessageLite.java */
        /* renamed from: androidx.datastore.preferences.protobuf.a$a$a, reason: collision with other inner class name */
        static final class C0472a extends FilterInputStream {

            /* renamed from: b, reason: collision with root package name */
            private int f28616b;

            C0472a(InputStream inputStream, int i4) {
                super(inputStream);
                this.f28616b = i4;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f28616b);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f28616b <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f28616b--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j4) throws IOException {
                long skip = super.skip(Math.min(j4, this.f28616b));
                if (skip >= 0) {
                    this.f28616b = (int) (this.f28616b - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i4, int i5) throws IOException {
                int i6 = this.f28616b;
                if (i6 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i4, Math.min(i5, i6));
                if (read >= 0) {
                    this.f28616b -= read;
                }
                return read;
            }
        }
    }
}
