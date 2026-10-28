package androidx.content.preferences.protobuf;

import androidx.collection.n1;
import androidx.collection.r2;
import androidx.compose.foundation.text.q;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: ByteString.java */
/* loaded from: classes3.dex */
public abstract class w implements Iterable<Byte>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    static final int f28995c = 128;

    /* renamed from: d, reason: collision with root package name */
    static final int f28996d = 256;

    /* renamed from: e, reason: collision with root package name */
    static final int f28997e = 8192;

    /* renamed from: f, reason: collision with root package name */
    public static final w f28998f = new j(p1.f28850d);

    /* renamed from: g, reason: collision with root package name */
    private static final f f28999g;

    /* renamed from: h, reason: collision with root package name */
    private static final int f29000h = 255;

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator<w> f29001i;

    /* renamed from: b, reason: collision with root package name */
    private int f29002b = 0;

    /* compiled from: ByteString.java */
    class a extends c {

        /* renamed from: b, reason: collision with root package name */
        private int f29003b = 0;

        /* renamed from: c, reason: collision with root package name */
        private final int f29004c;

        a() {
            this.f29004c = w.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29003b < this.f29004c;
        }

        @Override // androidx.datastore.preferences.protobuf.w.g
        public byte q() {
            int i4 = this.f29003b;
            if (i4 >= this.f29004c) {
                throw new NoSuchElementException();
            }
            this.f29003b = i4 + 1;
            return w.this.L(i4);
        }
    }

    /* compiled from: ByteString.java */
    static class b implements Comparator<w> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(w wVar, w wVar2) {
            g it = wVar.iterator();
            g it2 = wVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(it.q() & 255, it2.q() & 255);
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(wVar.size(), wVar2.size());
        }
    }

    /* compiled from: ByteString.java */
    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(q());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ByteString.java */
    private static final class d implements f {
        private d() {
        }

        @Override // androidx.datastore.preferences.protobuf.w.f
        public byte[] a(byte[] bArr, int i4, int i5) {
            return Arrays.copyOfRange(bArr, i4, i5 + i4);
        }

        d(a aVar) {
        }
    }

    /* compiled from: ByteString.java */
    private static final class e extends j {

        /* renamed from: n, reason: collision with root package name */
        private static final long f29006n = 1;

        /* renamed from: l, reason: collision with root package name */
        private final int f29007l;

        /* renamed from: m, reason: collision with root package name */
        private final int f29008m;

        e(byte[] bArr, int i4, int i5) {
            super(bArr);
            w.l(i4, i4 + i5, bArr.length);
            this.f29007l = i4;
            this.f29008m = i5;
        }

        private void D0(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        Object E0() {
            return new j(i0());
        }

        @Override // androidx.datastore.preferences.protobuf.w.j, androidx.content.preferences.protobuf.w
        protected void H(byte[] bArr, int i4, int i5, int i6) {
            System.arraycopy(this.f29012j, this.f29007l + i4, bArr, i5, i6);
        }

        @Override // androidx.datastore.preferences.protobuf.w.j, androidx.content.preferences.protobuf.w
        byte L(int i4) {
            return this.f29012j[this.f29007l + i4];
        }

        @Override // androidx.datastore.preferences.protobuf.w.j, androidx.content.preferences.protobuf.w
        public byte i(int i4) {
            w.j(i4, this.f29008m);
            return this.f29012j[this.f29007l + i4];
        }

        @Override // androidx.datastore.preferences.protobuf.w.j, androidx.content.preferences.protobuf.w
        public int size() {
            return this.f29008m;
        }

        @Override // androidx.datastore.preferences.protobuf.w.j
        protected int z0() {
            return this.f29007l;
        }
    }

    /* compiled from: ByteString.java */
    private interface f {
        byte[] a(byte[] bArr, int i4, int i5);
    }

    /* compiled from: ByteString.java */
    public interface g extends Iterator<Byte> {
        byte q();
    }

    /* compiled from: ByteString.java */
    static final class h {

        /* renamed from: a, reason: collision with root package name */
        private final CodedOutputStream f29009a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f29010b;

        /* synthetic */ h(int i4, a aVar) {
            this(i4);
        }

        public w a() {
            this.f29009a.Z();
            return new j(this.f29010b);
        }

        public CodedOutputStream b() {
            return this.f29009a;
        }

        private h(int i4) {
            byte[] bArr = new byte[i4];
            this.f29010b = bArr;
            this.f29009a = CodedOutputStream.n1(bArr);
        }
    }

    /* compiled from: ByteString.java */
    static abstract class i extends w {
        i() {
        }

        @Override // androidx.content.preferences.protobuf.w
        protected final int K() {
            return 0;
        }

        @Override // androidx.content.preferences.protobuf.w
        protected final boolean O() {
            return true;
        }

        @Override // androidx.content.preferences.protobuf.w, java.lang.Iterable
        public Iterator<Byte> iterator() {
            return new a();
        }

        @Override // androidx.content.preferences.protobuf.w
        void x0(v vVar) throws IOException {
            t0(vVar);
        }

        abstract boolean y0(w wVar, int i4, int i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteString.java */
    static class j extends i {

        /* renamed from: k, reason: collision with root package name */
        private static final long f29011k = 1;

        /* renamed from: j, reason: collision with root package name */
        protected final byte[] f29012j;

        j(byte[] bArr) {
            bArr.getClass();
            this.f29012j = bArr;
        }

        @Override // androidx.content.preferences.protobuf.w
        public final void D(ByteBuffer byteBuffer) {
            byteBuffer.put(this.f29012j, z0(), size());
        }

        @Override // androidx.content.preferences.protobuf.w
        protected void H(byte[] bArr, int i4, int i5, int i6) {
            System.arraycopy(this.f29012j, i4, bArr, i5, i6);
        }

        @Override // androidx.content.preferences.protobuf.w
        byte L(int i4) {
            return this.f29012j[i4];
        }

        @Override // androidx.content.preferences.protobuf.w
        public final boolean P() {
            int z02 = z0();
            return q4.u(this.f29012j, z02, size() + z02);
        }

        @Override // androidx.content.preferences.protobuf.w
        public final z S() {
            return z.r(this.f29012j, z0(), size(), true);
        }

        @Override // androidx.content.preferences.protobuf.w
        public final InputStream T() {
            return new ByteArrayInputStream(this.f29012j, z0(), size());
        }

        @Override // androidx.content.preferences.protobuf.w
        protected final int W(int i4, int i5, int i6) {
            return p1.w(i4, this.f29012j, z0() + i5, i6);
        }

        @Override // androidx.content.preferences.protobuf.w
        protected final int X(int i4, int i5, int i6) {
            int z02 = z0() + i5;
            return q4.w(i4, this.f29012j, z02, i6 + z02);
        }

        @Override // androidx.content.preferences.protobuf.w
        public final ByteBuffer c() {
            return ByteBuffer.wrap(this.f29012j, z0(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.content.preferences.protobuf.w
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof w) || size() != ((w) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int Z = Z();
            int Z2 = jVar.Z();
            if (Z == 0 || Z2 == 0 || Z == Z2) {
                return y0(jVar, 0, size());
            }
            return false;
        }

        @Override // androidx.content.preferences.protobuf.w
        public final List<ByteBuffer> f() {
            return Collections.singletonList(c());
        }

        @Override // androidx.content.preferences.protobuf.w
        public final w h0(int i4, int i5) {
            int l4 = w.l(i4, i5, size());
            return l4 == 0 ? w.f28998f : new e(this.f29012j, z0() + i4, l4);
        }

        @Override // androidx.content.preferences.protobuf.w
        public byte i(int i4) {
            return this.f29012j[i4];
        }

        @Override // androidx.content.preferences.protobuf.w
        protected final String m0(Charset charset) {
            return new String(this.f29012j, z0(), size(), charset);
        }

        @Override // androidx.content.preferences.protobuf.w
        public int size() {
            return this.f29012j.length;
        }

        @Override // androidx.content.preferences.protobuf.w
        final void t0(v vVar) throws IOException {
            vVar.X(this.f29012j, z0(), size());
        }

        @Override // androidx.content.preferences.protobuf.w
        public final void u0(OutputStream outputStream) throws IOException {
            outputStream.write(i0());
        }

        @Override // androidx.content.preferences.protobuf.w
        final void w0(OutputStream outputStream, int i4, int i5) throws IOException {
            outputStream.write(this.f29012j, z0() + i4, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.w.i
        final boolean y0(w wVar, int i4, int i5) {
            if (i5 > wVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i5 + size());
            }
            int i6 = i4 + i5;
            if (i6 > wVar.size()) {
                StringBuilder a5 = n1.a("Ran off end of other: ", i4, ", ", i5, ", ");
                a5.append(wVar.size());
                throw new IllegalArgumentException(a5.toString());
            }
            if (!(wVar instanceof j)) {
                return wVar.h0(i4, i6).equals(h0(0, i5));
            }
            j jVar = (j) wVar;
            byte[] bArr = this.f29012j;
            byte[] bArr2 = jVar.f29012j;
            int z02 = z0() + i5;
            int z03 = z0();
            int z04 = jVar.z0() + i4;
            while (z03 < z02) {
                if (bArr[z03] != bArr2[z04]) {
                    return false;
                }
                z03++;
                z04++;
            }
            return true;
        }

        protected int z0() {
            return 0;
        }
    }

    /* compiled from: ByteString.java */
    private static final class l implements f {
        private l() {
        }

        @Override // androidx.datastore.preferences.protobuf.w.f
        public byte[] a(byte[] bArr, int i4, int i5) {
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, i4, bArr2, 0, i5);
            return bArr2;
        }

        l(a aVar) {
        }
    }

    static {
        f28999g = androidx.content.preferences.protobuf.e.c() ? new l() : new d();
        f29001i = new b();
    }

    w() {
    }

    public static w A(String str) {
        return new j(str.getBytes(p1.f28847a));
    }

    static h R(int i4) {
        return new h(i4, null);
    }

    public static k U() {
        return new k(128);
    }

    public static k V(int i4) {
        return new k(i4);
    }

    private static w a0(InputStream inputStream, int i4) throws IOException {
        byte[] bArr = new byte[i4];
        int i5 = 0;
        while (i5 < i4) {
            int read = inputStream.read(bArr, i5, i4 - i5);
            if (read == -1) {
                break;
            }
            i5 += read;
        }
        if (i5 == 0) {
            return null;
        }
        return x(bArr, 0, i5);
    }

    static int b(byte b5) {
        return b5 & 255;
    }

    public static w b0(InputStream inputStream) throws IOException {
        return e0(inputStream, 256, 8192);
    }

    public static w d0(InputStream inputStream, int i4) throws IOException {
        return e0(inputStream, i4, i4);
    }

    public static w e0(InputStream inputStream, int i4, int i5) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            w a02 = a0(inputStream, i4);
            if (a02 == null) {
                return p(arrayList);
            }
            arrayList.add(a02);
            i4 = Math.min(i4 * 2, i5);
        }
    }

    private static w h(Iterator<w> it, int i4) {
        if (i4 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i4)));
        }
        if (i4 == 1) {
            return it.next();
        }
        int i5 = i4 >>> 1;
        return h(it, i5).m(h(it, i4 - i5));
    }

    static void j(int i4, int i5) {
        if (((i5 - (i4 + 1)) | i4) < 0) {
            if (i4 >= 0) {
                throw new ArrayIndexOutOfBoundsException(q.a("Index > length: ", i4, ", ", i5));
            }
            throw new ArrayIndexOutOfBoundsException(android.support.v4.media.a.a("Index < 0: ", i4));
        }
    }

    private static int j0(byte b5) {
        return b5 & 255;
    }

    static int l(int i4, int i5, int i6) {
        int i7 = i5 - i4;
        if ((i4 | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(r2.a("Beginning index: ", i4, " < 0"));
        }
        if (i5 < i4) {
            throw new IndexOutOfBoundsException(q.a("Beginning index larger than ending index: ", i4, ", ", i5));
        }
        throw new IndexOutOfBoundsException(q.a("End index: ", i5, " >= ", i6));
    }

    public static w p(Iterable<w> iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator<w> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f28998f : h(iterable.iterator(), size);
    }

    public static Comparator<w> p0() {
        return f29001i;
    }

    public static w q(String str, String str2) throws UnsupportedEncodingException {
        return new j(str.getBytes(str2));
    }

    static w q0(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new x2(byteBuffer);
        }
        return new e(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }

    public static w r(String str, Charset charset) {
        return new j(str.getBytes(charset));
    }

    static w r0(byte[] bArr) {
        return new j(bArr);
    }

    public static w s(ByteBuffer byteBuffer) {
        return v(byteBuffer, byteBuffer.remaining());
    }

    static w s0(byte[] bArr, int i4, int i5) {
        return new e(bArr, i4, i5);
    }

    public static w v(ByteBuffer byteBuffer, int i4) {
        l(0, i4, byteBuffer.remaining());
        byte[] bArr = new byte[i4];
        byteBuffer.get(bArr);
        return new j(bArr);
    }

    public static w w(byte[] bArr) {
        return x(bArr, 0, bArr.length);
    }

    public static w x(byte[] bArr, int i4, int i5) {
        l(i4, i4 + i5, bArr.length);
        return new j(f28999g.a(bArr, i4, i5));
    }

    public abstract void D(ByteBuffer byteBuffer);

    public void F(byte[] bArr, int i4) {
        G(bArr, 0, i4, size());
    }

    @Deprecated
    public final void G(byte[] bArr, int i4, int i5, int i6) {
        l(i4, i4 + i6, size());
        l(i5, i5 + i6, bArr.length);
        if (i6 > 0) {
            H(bArr, i4, i5, i6);
        }
    }

    protected abstract void H(byte[] bArr, int i4, int i5, int i6);

    public final boolean I(w wVar) {
        return size() >= wVar.size() && g0(size() - wVar.size()).equals(wVar);
    }

    protected abstract int K();

    abstract byte L(int i4);

    protected abstract boolean O();

    public abstract boolean P();

    @Override // java.lang.Iterable
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }

    public abstract z S();

    public abstract InputStream T();

    protected abstract int W(int i4, int i5, int i6);

    protected abstract int X(int i4, int i5, int i6);

    protected final int Z() {
        return this.f29002b;
    }

    public abstract ByteBuffer c();

    public abstract boolean equals(Object obj);

    public abstract List<ByteBuffer> f();

    public final boolean f0(w wVar) {
        return size() >= wVar.size() && h0(0, wVar.size()).equals(wVar);
    }

    public final w g0(int i4) {
        return h0(i4, size());
    }

    public abstract w h0(int i4, int i5);

    public final int hashCode() {
        int i4 = this.f29002b;
        if (i4 == 0) {
            int size = size();
            i4 = W(size, 0, size);
            if (i4 == 0) {
                i4 = 1;
            }
            this.f29002b = i4;
        }
        return i4;
    }

    public abstract byte i(int i4);

    public final byte[] i0() {
        int size = size();
        if (size == 0) {
            return p1.f28850d;
        }
        byte[] bArr = new byte[size];
        H(bArr, 0, 0, size);
        return bArr;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final String k0(String str) throws UnsupportedEncodingException {
        try {
            return l0(Charset.forName(str));
        } catch (UnsupportedCharsetException e4) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e4);
            throw unsupportedEncodingException;
        }
    }

    public final String l0(Charset charset) {
        return size() == 0 ? "" : m0(charset);
    }

    public final w m(w wVar) {
        if (Integer.MAX_VALUE - size() >= wVar.size()) {
            return l3.D0(this, wVar);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + wVar.size());
    }

    protected abstract String m0(Charset charset);

    public final String n0() {
        return l0(p1.f28847a);
    }

    public abstract int size();

    abstract void t0(v vVar) throws IOException;

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract void u0(OutputStream outputStream) throws IOException;

    final void v0(OutputStream outputStream, int i4, int i5) throws IOException {
        l(i4, i4 + i5, size());
        if (i5 > 0) {
            w0(outputStream, i4, i5);
        }
    }

    abstract void w0(OutputStream outputStream, int i4, int i5) throws IOException;

    abstract void x0(v vVar) throws IOException;

    /* compiled from: ByteString.java */
    public static final class k extends OutputStream {

        /* renamed from: g, reason: collision with root package name */
        private static final byte[] f29013g = new byte[0];

        /* renamed from: b, reason: collision with root package name */
        private final int f29014b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList<w> f29015c;

        /* renamed from: d, reason: collision with root package name */
        private int f29016d;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f29017e;

        /* renamed from: f, reason: collision with root package name */
        private int f29018f;

        k(int i4) {
            if (i4 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f29014b = i4;
            this.f29015c = new ArrayList<>();
            this.f29017e = new byte[i4];
        }

        private byte[] a(byte[] bArr, int i4) {
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i4));
            return bArr2;
        }

        private void b(int i4) {
            this.f29015c.add(new j(this.f29017e));
            int length = this.f29016d + this.f29017e.length;
            this.f29016d = length;
            this.f29017e = new byte[Math.max(this.f29014b, Math.max(i4, length >>> 1))];
            this.f29018f = 0;
        }

        private void c() {
            int i4 = this.f29018f;
            byte[] bArr = this.f29017e;
            if (i4 >= bArr.length) {
                this.f29015c.add(new j(this.f29017e));
                this.f29017e = f29013g;
            } else if (i4 > 0) {
                this.f29015c.add(new j(a(bArr, i4)));
            }
            this.f29016d += this.f29018f;
            this.f29018f = 0;
        }

        public synchronized void d() {
            this.f29015c.clear();
            this.f29016d = 0;
            this.f29018f = 0;
        }

        public synchronized int e() {
            return this.f29016d + this.f29018f;
        }

        public synchronized w f() {
            c();
            return w.p(this.f29015c);
        }

        public void g(OutputStream outputStream) throws IOException {
            w[] wVarArr;
            byte[] bArr;
            int i4;
            synchronized (this) {
                ArrayList<w> arrayList = this.f29015c;
                wVarArr = (w[]) arrayList.toArray(new w[arrayList.size()]);
                bArr = this.f29017e;
                i4 = this.f29018f;
            }
            for (w wVar : wVarArr) {
                wVar.u0(outputStream);
            }
            outputStream.write(a(bArr, i4));
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(e()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i4) {
            try {
                if (this.f29018f == this.f29017e.length) {
                    b(1);
                }
                byte[] bArr = this.f29017e;
                int i5 = this.f29018f;
                this.f29018f = i5 + 1;
                bArr[i5] = (byte) i4;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i4, int i5) {
            try {
                byte[] bArr2 = this.f29017e;
                int length = bArr2.length;
                int i6 = this.f29018f;
                if (i5 <= length - i6) {
                    System.arraycopy(bArr, i4, bArr2, i6, i5);
                    this.f29018f += i5;
                } else {
                    int length2 = bArr2.length - i6;
                    System.arraycopy(bArr, i4, bArr2, i6, length2);
                    int i7 = i5 - length2;
                    b(i7);
                    System.arraycopy(bArr, i4 + length2, this.f29017e, 0, i7);
                    this.f29018f = i7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
