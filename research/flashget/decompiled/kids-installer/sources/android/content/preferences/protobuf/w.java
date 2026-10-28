package android.content.preferences.protobuf;

import androidx.appcompat.view.menu.s;
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
import kotlin.UByte;

/* compiled from: ByteString.java */
/* loaded from: classes.dex */
public abstract class w implements Iterable<Byte>, Serializable {

    /* renamed from: p, reason: collision with root package name */
    static final int f7550p = 128;

    /* renamed from: q, reason: collision with root package name */
    static final int f7551q = 256;

    /* renamed from: r, reason: collision with root package name */
    static final int f7552r = 8192;

    /* renamed from: s, reason: collision with root package name */
    public static final w f7553s = new j(o1.f7442d);

    /* renamed from: t, reason: collision with root package name */
    private static final f f7554t;

    /* renamed from: u, reason: collision with root package name */
    private static final int f7555u = 255;

    /* renamed from: v, reason: collision with root package name */
    private static final Comparator<w> f7556v;

    /* renamed from: o, reason: collision with root package name */
    private int f7557o = 0;

    /* compiled from: ByteString.java */
    /* loaded from: classes3.dex */
    class a extends c {

        /* renamed from: o, reason: collision with root package name */
        private int f7558o = 0;

        /* renamed from: p, reason: collision with root package name */
        private final int f7559p;

        a() {
            this.f7559p = w.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.w.g
        public byte b() {
            int i5 = this.f7558o;
            if (i5 >= this.f7559p) {
                throw new NoSuchElementException();
            }
            this.f7558o = i5 + 1;
            return w.this.J(i5);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7558o < this.f7559p;
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
                int compare = Integer.compare(it.b() & UByte.f27220r, it2.b() & UByte.f27220r);
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(wVar.size(), wVar2.size());
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes3.dex */
    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(b());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes3.dex */
    private static final class d implements f {
        private d() {
        }

        @Override // androidx.datastore.preferences.protobuf.w.f
        public byte[] a(byte[] bArr, int i5, int i6) {
            return Arrays.copyOfRange(bArr, i5, i6 + i5);
        }

        d(a aVar) {
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes3.dex */
    private static final class e extends j {
        private static final long A = 1;

        /* renamed from: y, reason: collision with root package name */
        private final int f7561y;

        /* renamed from: z, reason: collision with root package name */
        private final int f7562z;

        e(byte[] bArr, int i5, int i6) {
            super(bArr);
            w.p(i5, i5 + i6, bArr.length);
            this.f7561y = i5;
            this.f7562z = i6;
        }

        private void C0(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.w.j
        protected int A0() {
            return this.f7561y;
        }

        Object D0() {
            return new j(f0());
        }

        @Override // androidx.datastore.preferences.protobuf.w.j, android.content.preferences.protobuf.w
        protected void E(byte[] bArr, int i5, int i6, int i7) {
            System.arraycopy(this.f7566w, this.f7561y + i5, bArr, i6, i7);
        }

        @Override // androidx.datastore.preferences.protobuf.w.j, android.content.preferences.protobuf.w
        byte J(int i5) {
            return this.f7566w[this.f7561y + i5];
        }

        @Override // androidx.datastore.preferences.protobuf.w.j, android.content.preferences.protobuf.w
        public byte i(int i5) {
            w.o(i5, this.f7562z);
            return this.f7566w[this.f7561y + i5];
        }

        @Override // androidx.datastore.preferences.protobuf.w.j, android.content.preferences.protobuf.w
        public int size() {
            return this.f7562z;
        }
    }

    /* compiled from: ByteString.java */
    private interface f {
        byte[] a(byte[] bArr, int i5, int i6);
    }

    /* compiled from: ByteString.java */
    public interface g extends Iterator<Byte> {
        byte b();
    }

    /* compiled from: ByteString.java */
    static final class h {

        /* renamed from: a, reason: collision with root package name */
        private final CodedOutputStream f7563a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f7564b;

        /* synthetic */ h(int i5, a aVar) {
            this(i5);
        }

        public w a() {
            this.f7563a.Z();
            return new j(this.f7564b);
        }

        public CodedOutputStream b() {
            return this.f7563a;
        }

        private h(int i5) {
            byte[] bArr = new byte[i5];
            this.f7564b = bArr;
            this.f7563a = CodedOutputStream.n1(bArr);
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes3.dex */
    static abstract class i extends w {
        i() {
        }

        @Override // android.content.preferences.protobuf.w
        protected final int I() {
            return 0;
        }

        @Override // android.content.preferences.protobuf.w
        protected final boolean K() {
            return true;
        }

        @Override // android.content.preferences.protobuf.w, java.lang.Iterable
        public Iterator<Byte> iterator() {
            return new a();
        }

        @Override // android.content.preferences.protobuf.w
        void y0(u uVar) throws IOException {
            u0(uVar);
        }

        abstract boolean z0(w wVar, int i5, int i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteString.java */
    /* loaded from: classes3.dex */
    static class j extends i {

        /* renamed from: x, reason: collision with root package name */
        private static final long f7565x = 1;

        /* renamed from: w, reason: collision with root package name */
        protected final byte[] f7566w;

        j(byte[] bArr) {
            bArr.getClass();
            this.f7566w = bArr;
        }

        @Override // android.content.preferences.protobuf.w
        public final void A(ByteBuffer byteBuffer) {
            byteBuffer.put(this.f7566w, A0(), size());
        }

        protected int A0() {
            return 0;
        }

        @Override // android.content.preferences.protobuf.w
        protected void E(byte[] bArr, int i5, int i6, int i7) {
            System.arraycopy(this.f7566w, i5, bArr, i6, i7);
        }

        @Override // android.content.preferences.protobuf.w
        byte J(int i5) {
            return this.f7566w[i5];
        }

        @Override // android.content.preferences.protobuf.w
        public final boolean L() {
            int A0 = A0();
            return n4.u(this.f7566w, A0, size() + A0);
        }

        @Override // android.content.preferences.protobuf.w
        public final z O() {
            return z.r(this.f7566w, A0(), size(), true);
        }

        @Override // android.content.preferences.protobuf.w
        public final InputStream P() {
            return new ByteArrayInputStream(this.f7566w, A0(), size());
        }

        @Override // android.content.preferences.protobuf.w
        protected final int S(int i5, int i6, int i7) {
            return o1.w(i5, this.f7566w, A0() + i6, i7);
        }

        @Override // android.content.preferences.protobuf.w
        protected final int T(int i5, int i6, int i7) {
            int A0 = A0() + i6;
            return n4.w(i5, this.f7566w, A0, i7 + A0);
        }

        @Override // android.content.preferences.protobuf.w
        public final w c0(int i5, int i6) {
            int p5 = w.p(i5, i6, size());
            return p5 == 0 ? w.f7553s : new e(this.f7566w, A0() + i5, p5);
        }

        @Override // android.content.preferences.protobuf.w
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
            int U = U();
            int U2 = jVar.U();
            if (U == 0 || U2 == 0 || U == U2) {
                return z0(jVar, 0, size());
            }
            return false;
        }

        @Override // android.content.preferences.protobuf.w
        public final ByteBuffer f() {
            return ByteBuffer.wrap(this.f7566w, A0(), size()).asReadOnlyBuffer();
        }

        @Override // android.content.preferences.protobuf.w
        public final List<ByteBuffer> g() {
            return Collections.singletonList(f());
        }

        @Override // android.content.preferences.protobuf.w
        public byte i(int i5) {
            return this.f7566w[i5];
        }

        @Override // android.content.preferences.protobuf.w
        protected final String n0(Charset charset) {
            return new String(this.f7566w, A0(), size(), charset);
        }

        @Override // android.content.preferences.protobuf.w
        public int size() {
            return this.f7566w.length;
        }

        @Override // android.content.preferences.protobuf.w
        final void u0(u uVar) throws IOException {
            uVar.X(this.f7566w, A0(), size());
        }

        @Override // android.content.preferences.protobuf.w
        public final void v0(OutputStream outputStream) throws IOException {
            outputStream.write(f0());
        }

        @Override // android.content.preferences.protobuf.w
        final void x0(OutputStream outputStream, int i5, int i6) throws IOException {
            outputStream.write(this.f7566w, A0() + i5, i6);
        }

        @Override // androidx.datastore.preferences.protobuf.w.i
        final boolean z0(w wVar, int i5, int i6) {
            if (i6 > wVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i6 + size());
            }
            int i7 = i5 + i6;
            if (i7 > wVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i5 + ", " + i6 + ", " + wVar.size());
            }
            if (!(wVar instanceof j)) {
                return wVar.c0(i5, i7).equals(c0(0, i6));
            }
            j jVar = (j) wVar;
            byte[] bArr = this.f7566w;
            byte[] bArr2 = jVar.f7566w;
            int A0 = A0() + i6;
            int A02 = A0();
            int A03 = jVar.A0() + i5;
            while (A02 < A0) {
                if (bArr[A02] != bArr2[A03]) {
                    return false;
                }
                A02++;
                A03++;
            }
            return true;
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes3.dex */
    private static final class l implements f {
        private l() {
        }

        @Override // androidx.datastore.preferences.protobuf.w.f
        public byte[] a(byte[] bArr, int i5, int i6) {
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i5, bArr2, 0, i6);
            return bArr2;
        }

        l(a aVar) {
        }
    }

    static {
        f7554t = android.content.preferences.protobuf.e.c() ? new l(null) : new d(null);
        f7556v = new b();
    }

    w() {
    }

    static h N(int i5) {
        return new h(i5, null);
    }

    public static k Q() {
        return new k(128);
    }

    public static k R(int i5) {
        return new k(i5);
    }

    private static w V(InputStream inputStream, int i5) throws IOException {
        byte[] bArr = new byte[i5];
        int i6 = 0;
        while (i6 < i5) {
            int read = inputStream.read(bArr, i6, i5 - i6);
            if (read == -1) {
                break;
            }
            i6 += read;
        }
        if (i6 == 0) {
            return null;
        }
        return y(bArr, 0, i6);
    }

    public static w W(InputStream inputStream) throws IOException {
        return Y(inputStream, 256, 8192);
    }

    public static w X(InputStream inputStream, int i5) throws IOException {
        return Y(inputStream, i5, i5);
    }

    public static w Y(InputStream inputStream, int i5, int i6) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            w V = V(inputStream, i5);
            if (V == null) {
                return r(arrayList);
            }
            arrayList.add(V);
            i5 = Math.min(i5 * 2, i6);
        }
    }

    static int b(byte b6) {
        return b6 & UByte.f27220r;
    }

    private static w h(Iterator<w> it, int i5) {
        if (i5 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i5)));
        }
        if (i5 == 1) {
            return it.next();
        }
        int i6 = i5 >>> 1;
        return h(it, i6).q(h(it, i5 - i6));
    }

    private static int h0(byte b6) {
        return b6 & UByte.f27220r;
    }

    static void o(int i5, int i6) {
        if (((i6 - (i5 + 1)) | i5) < 0) {
            if (i5 >= 0) {
                throw new ArrayIndexOutOfBoundsException(v.a("Index > length: ", i5, ", ", i6));
            }
            throw new ArrayIndexOutOfBoundsException(s.a("Index < 0: ", i5));
        }
    }

    static int p(int i5, int i6, int i7) {
        int i8 = i6 - i5;
        if ((i5 | i6 | i8 | (i7 - i6)) >= 0) {
            return i8;
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(androidx.constraintlayout.solver.f.a("Beginning index: ", i5, " < 0"));
        }
        if (i6 < i5) {
            throw new IndexOutOfBoundsException(v.a("Beginning index larger than ending index: ", i5, ", ", i6));
        }
        throw new IndexOutOfBoundsException(v.a("End index: ", i6, " >= ", i7));
    }

    public static Comparator<w> q0() {
        return f7556v;
    }

    public static w r(Iterable<w> iterable) {
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
        return size == 0 ? f7553s : h(iterable.iterator(), size);
    }

    static w r0(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new u2(byteBuffer);
        }
        return new e(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }

    public static w s(String str, String str2) throws UnsupportedEncodingException {
        return new j(str.getBytes(str2));
    }

    static w s0(byte[] bArr) {
        return new j(bArr);
    }

    public static w t(String str, Charset charset) {
        return new j(str.getBytes(charset));
    }

    static w t0(byte[] bArr, int i5, int i6) {
        return new e(bArr, i5, i6);
    }

    public static w u(ByteBuffer byteBuffer) {
        return v(byteBuffer, byteBuffer.remaining());
    }

    public static w v(ByteBuffer byteBuffer, int i5) {
        p(0, i5, byteBuffer.remaining());
        byte[] bArr = new byte[i5];
        byteBuffer.get(bArr);
        return new j(bArr);
    }

    public static w x(byte[] bArr) {
        return y(bArr, 0, bArr.length);
    }

    public static w y(byte[] bArr, int i5, int i6) {
        p(i5, i5 + i6, bArr.length);
        return new j(f7554t.a(bArr, i5, i6));
    }

    public static w z(String str) {
        return new j(str.getBytes(o1.f7439a));
    }

    public abstract void A(ByteBuffer byteBuffer);

    public void B(byte[] bArr, int i5) {
        C(bArr, 0, i5, size());
    }

    @Deprecated
    public final void C(byte[] bArr, int i5, int i6, int i7) {
        p(i5, i5 + i7, size());
        p(i6, i6 + i7, bArr.length);
        if (i7 > 0) {
            E(bArr, i5, i6, i7);
        }
    }

    protected abstract void E(byte[] bArr, int i5, int i6, int i7);

    public final boolean H(w wVar) {
        return size() >= wVar.size() && a0(size() - wVar.size()).equals(wVar);
    }

    protected abstract int I();

    abstract byte J(int i5);

    protected abstract boolean K();

    public abstract boolean L();

    @Override // java.lang.Iterable
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }

    public abstract z O();

    public abstract InputStream P();

    protected abstract int S(int i5, int i6, int i7);

    protected abstract int T(int i5, int i6, int i7);

    protected final int U() {
        return this.f7557o;
    }

    public final boolean Z(w wVar) {
        return size() >= wVar.size() && c0(0, wVar.size()).equals(wVar);
    }

    public final w a0(int i5) {
        return c0(i5, size());
    }

    public abstract w c0(int i5, int i6);

    public abstract boolean equals(Object obj);

    public abstract ByteBuffer f();

    public final byte[] f0() {
        int size = size();
        if (size == 0) {
            return o1.f7442d;
        }
        byte[] bArr = new byte[size];
        E(bArr, 0, 0, size);
        return bArr;
    }

    public abstract List<ByteBuffer> g();

    public final int hashCode() {
        int i5 = this.f7557o;
        if (i5 == 0) {
            int size = size();
            i5 = S(size, 0, size);
            if (i5 == 0) {
                i5 = 1;
            }
            this.f7557o = i5;
        }
        return i5;
    }

    public abstract byte i(int i5);

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final String j0(String str) throws UnsupportedEncodingException {
        try {
            return m0(Charset.forName(str));
        } catch (UnsupportedCharsetException e6) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e6);
            throw unsupportedEncodingException;
        }
    }

    public final String m0(Charset charset) {
        return size() == 0 ? "" : n0(charset);
    }

    protected abstract String n0(Charset charset);

    public final String p0() {
        return m0(o1.f7439a);
    }

    public final w q(w wVar) {
        if (Integer.MAX_VALUE - size() >= wVar.size()) {
            return i3.C0(this, wVar);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + wVar.size());
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    abstract void u0(u uVar) throws IOException;

    public abstract void v0(OutputStream outputStream) throws IOException;

    final void w0(OutputStream outputStream, int i5, int i6) throws IOException {
        p(i5, i5 + i6, size());
        if (i6 > 0) {
            x0(outputStream, i5, i6);
        }
    }

    abstract void x0(OutputStream outputStream, int i5, int i6) throws IOException;

    abstract void y0(u uVar) throws IOException;

    /* compiled from: ByteString.java */
    public static final class k extends OutputStream {

        /* renamed from: t, reason: collision with root package name */
        private static final byte[] f7567t = new byte[0];

        /* renamed from: o, reason: collision with root package name */
        private final int f7568o;

        /* renamed from: p, reason: collision with root package name */
        private final ArrayList<w> f7569p;

        /* renamed from: q, reason: collision with root package name */
        private int f7570q;

        /* renamed from: r, reason: collision with root package name */
        private byte[] f7571r;

        /* renamed from: s, reason: collision with root package name */
        private int f7572s;

        k(int i5) {
            if (i5 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f7568o = i5;
            this.f7569p = new ArrayList<>();
            this.f7571r = new byte[i5];
        }

        private byte[] a(byte[] bArr, int i5) {
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i5));
            return bArr2;
        }

        private void b(int i5) {
            this.f7569p.add(new j(this.f7571r));
            int length = this.f7570q + this.f7571r.length;
            this.f7570q = length;
            this.f7571r = new byte[Math.max(this.f7568o, Math.max(i5, length >>> 1))];
            this.f7572s = 0;
        }

        private void c() {
            int i5 = this.f7572s;
            byte[] bArr = this.f7571r;
            if (i5 >= bArr.length) {
                this.f7569p.add(new j(this.f7571r));
                this.f7571r = f7567t;
            } else if (i5 > 0) {
                this.f7569p.add(new j(a(bArr, i5)));
            }
            this.f7570q += this.f7572s;
            this.f7572s = 0;
        }

        public synchronized void d() {
            this.f7569p.clear();
            this.f7570q = 0;
            this.f7572s = 0;
        }

        public synchronized int e() {
            return this.f7570q + this.f7572s;
        }

        public synchronized w g() {
            c();
            return w.r(this.f7569p);
        }

        public void j(OutputStream outputStream) throws IOException {
            w[] wVarArr;
            byte[] bArr;
            int i5;
            synchronized (this) {
                ArrayList<w> arrayList = this.f7569p;
                wVarArr = (w[]) arrayList.toArray(new w[arrayList.size()]);
                bArr = this.f7571r;
                i5 = this.f7572s;
            }
            for (w wVar : wVarArr) {
                wVar.v0(outputStream);
            }
            outputStream.write(a(bArr, i5));
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(e()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i5) {
            if (this.f7572s == this.f7571r.length) {
                b(1);
            }
            byte[] bArr = this.f7571r;
            int i6 = this.f7572s;
            this.f7572s = i6 + 1;
            bArr[i6] = (byte) i5;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i5, int i6) {
            byte[] bArr2 = this.f7571r;
            int length = bArr2.length;
            int i7 = this.f7572s;
            if (i6 <= length - i7) {
                System.arraycopy(bArr, i5, bArr2, i7, i6);
                this.f7572s += i6;
            } else {
                int length2 = bArr2.length - i7;
                System.arraycopy(bArr, i5, bArr2, i7, length2);
                int i8 = i6 - length2;
                b(i8);
                System.arraycopy(bArr, i5 + length2, this.f7571r, 0, i8);
                this.f7572s = i8;
            }
        }
    }
}
