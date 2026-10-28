package android.content.preferences.protobuf;

import android.content.preferences.protobuf.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.UByte;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: RopeByteString.java */
/* loaded from: classes3.dex */
final class i3 extends w {
    static final int[] B = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, SyslogAppender.LOG_LOCAL2, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long C = 1;
    private final int A;

    /* renamed from: w, reason: collision with root package name */
    private final int f7260w;

    /* renamed from: x, reason: collision with root package name */
    private final w f7261x;

    /* renamed from: y, reason: collision with root package name */
    private final w f7262y;

    /* renamed from: z, reason: collision with root package name */
    private final int f7263z;

    /* compiled from: RopeByteString.java */
    class a extends w.c {

        /* renamed from: o, reason: collision with root package name */
        final c f7264o;

        /* renamed from: p, reason: collision with root package name */
        w.g f7265p = c();

        a() {
            this.f7264o = new c(i3.this, null);
        }

        private w.g c() {
            if (this.f7264o.hasNext()) {
                return this.f7264o.next().iterator();
            }
            return null;
        }

        @Override // androidx.datastore.preferences.protobuf.w.g
        public byte b() {
            w.g gVar = this.f7265p;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            byte b6 = gVar.b();
            if (!this.f7265p.hasNext()) {
                this.f7265p = c();
            }
            return b6;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7265p != null;
        }
    }

    /* compiled from: RopeByteString.java */
    /* loaded from: classes.dex */
    private static final class c implements Iterator<w.i> {

        /* renamed from: o, reason: collision with root package name */
        private final ArrayDeque<i3> f7268o;

        /* renamed from: p, reason: collision with root package name */
        private w.i f7269p;

        /* synthetic */ c(w wVar, a aVar) {
            this(wVar);
        }

        private w.i a(w wVar) {
            while (wVar instanceof i3) {
                i3 i3Var = (i3) wVar;
                this.f7268o.push(i3Var);
                wVar = i3Var.f7261x;
            }
            return (w.i) wVar;
        }

        private w.i c() {
            w.i a6;
            do {
                ArrayDeque<i3> arrayDeque = this.f7268o;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                a6 = a(this.f7268o.pop().f7262y);
            } while (a6.isEmpty());
            return a6;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public w.i next() {
            w.i iVar = this.f7269p;
            if (iVar == null) {
                throw new NoSuchElementException();
            }
            this.f7269p = c();
            return iVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7269p != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(w wVar) {
            if (!(wVar instanceof i3)) {
                this.f7268o = null;
                this.f7269p = (w.i) wVar;
                return;
            }
            i3 i3Var = (i3) wVar;
            ArrayDeque<i3> arrayDeque = new ArrayDeque<>(i3Var.I());
            this.f7268o = arrayDeque;
            arrayDeque.push(i3Var);
            this.f7269p = a(i3Var.f7261x);
        }
    }

    /* synthetic */ i3(w wVar, w wVar2, a aVar) {
        this(wVar, wVar2);
    }

    static w C0(w wVar, w wVar2) {
        if (wVar2.size() == 0) {
            return wVar;
        }
        if (wVar.size() == 0) {
            return wVar2;
        }
        int size = wVar2.size() + wVar.size();
        if (size < 128) {
            return D0(wVar, wVar2);
        }
        if (wVar instanceof i3) {
            i3 i3Var = (i3) wVar;
            if (wVar2.size() + i3Var.f7262y.size() < 128) {
                return new i3(i3Var.f7261x, D0(i3Var.f7262y, wVar2));
            }
            if (i3Var.f7261x.I() > i3Var.f7262y.I() && i3Var.A > wVar2.I()) {
                return new i3(i3Var.f7261x, new i3(i3Var.f7262y, wVar2));
            }
        }
        return size >= B[Math.max(wVar.I(), wVar2.I()) + 1] ? new i3(wVar, wVar2) : new b(null).b(wVar, wVar2);
    }

    private static w D0(w wVar, w wVar2) {
        int size = wVar.size();
        int size2 = wVar2.size();
        byte[] bArr = new byte[size + size2];
        wVar.C(bArr, 0, 0, size);
        wVar2.C(bArr, 0, size, size2);
        return new w.j(bArr);
    }

    private boolean E0(w wVar) {
        a aVar = null;
        c cVar = new c(this, aVar);
        w.i next = cVar.next();
        c cVar2 = new c(wVar, aVar);
        w.i next2 = cVar2.next();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int size = next.size() - i5;
            int size2 = next2.size() - i6;
            int min = Math.min(size, size2);
            if (!(i5 == 0 ? next.z0(next2, i6, min) : next2.z0(next, i5, min))) {
                return false;
            }
            i7 += min;
            int i8 = this.f7260w;
            if (i7 >= i8) {
                if (i7 == i8) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                i5 = 0;
                next = cVar.next();
            } else {
                i5 += min;
                next = next;
            }
            if (min == size2) {
                next2 = cVar2.next();
                i6 = 0;
            } else {
                i6 += min;
            }
        }
    }

    static i3 F0(w wVar, w wVar2) {
        return new i3(wVar, wVar2);
    }

    private void G0(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // android.content.preferences.protobuf.w
    public void A(ByteBuffer byteBuffer) {
        this.f7261x.A(byteBuffer);
        this.f7262y.A(byteBuffer);
    }

    @Override // android.content.preferences.protobuf.w
    protected void E(byte[] bArr, int i5, int i6, int i7) {
        int i8 = i5 + i7;
        int i9 = this.f7263z;
        if (i8 <= i9) {
            this.f7261x.E(bArr, i5, i6, i7);
        } else {
            if (i5 >= i9) {
                this.f7262y.E(bArr, i5 - i9, i6, i7);
                return;
            }
            int i10 = i9 - i5;
            this.f7261x.E(bArr, i5, i6, i10);
            this.f7262y.E(bArr, 0, i6 + i10, i7 - i10);
        }
    }

    Object H0() {
        return new w.j(f0());
    }

    @Override // android.content.preferences.protobuf.w
    protected int I() {
        return this.A;
    }

    @Override // android.content.preferences.protobuf.w
    byte J(int i5) {
        int i6 = this.f7263z;
        return i5 < i6 ? this.f7261x.J(i5) : this.f7262y.J(i5 - i6);
    }

    @Override // android.content.preferences.protobuf.w
    protected boolean K() {
        return this.f7260w >= B[this.A];
    }

    @Override // android.content.preferences.protobuf.w
    public boolean L() {
        int T = this.f7261x.T(0, 0, this.f7263z);
        w wVar = this.f7262y;
        return wVar.T(T, 0, wVar.size()) == 0;
    }

    @Override // android.content.preferences.protobuf.w
    /* renamed from: M */
    public w.g iterator() {
        return new a();
    }

    @Override // android.content.preferences.protobuf.w
    public z O() {
        return z.j(new d());
    }

    @Override // android.content.preferences.protobuf.w
    public InputStream P() {
        return new d();
    }

    @Override // android.content.preferences.protobuf.w
    protected int S(int i5, int i6, int i7) {
        int i8 = i6 + i7;
        int i9 = this.f7263z;
        if (i8 <= i9) {
            return this.f7261x.S(i5, i6, i7);
        }
        if (i6 >= i9) {
            return this.f7262y.S(i5, i6 - i9, i7);
        }
        int i10 = i9 - i6;
        return this.f7262y.S(this.f7261x.S(i5, i6, i10), 0, i7 - i10);
    }

    @Override // android.content.preferences.protobuf.w
    protected int T(int i5, int i6, int i7) {
        int i8 = i6 + i7;
        int i9 = this.f7263z;
        if (i8 <= i9) {
            return this.f7261x.T(i5, i6, i7);
        }
        if (i6 >= i9) {
            return this.f7262y.T(i5, i6 - i9, i7);
        }
        int i10 = i9 - i6;
        return this.f7262y.T(this.f7261x.T(i5, i6, i10), 0, i7 - i10);
    }

    @Override // android.content.preferences.protobuf.w
    public w c0(int i5, int i6) {
        int p5 = w.p(i5, i6, this.f7260w);
        if (p5 == 0) {
            return w.f7553s;
        }
        if (p5 == this.f7260w) {
            return this;
        }
        int i7 = this.f7263z;
        return i6 <= i7 ? this.f7261x.c0(i5, i6) : i5 >= i7 ? this.f7262y.c0(i5 - i7, i6 - i7) : new i3(this.f7261x.a0(i5), this.f7262y.c0(0, i6 - this.f7263z));
    }

    @Override // android.content.preferences.protobuf.w
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f7260w != wVar.size()) {
            return false;
        }
        if (this.f7260w == 0) {
            return true;
        }
        int U = U();
        int U2 = wVar.U();
        if (U == 0 || U2 == 0 || U == U2) {
            return E0(wVar);
        }
        return false;
    }

    @Override // android.content.preferences.protobuf.w
    public ByteBuffer f() {
        return ByteBuffer.wrap(f0()).asReadOnlyBuffer();
    }

    @Override // android.content.preferences.protobuf.w
    public List<ByteBuffer> g() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().f());
        }
        return arrayList;
    }

    @Override // android.content.preferences.protobuf.w
    public byte i(int i5) {
        w.o(i5, this.f7260w);
        return J(i5);
    }

    @Override // android.content.preferences.protobuf.w, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new a();
    }

    @Override // android.content.preferences.protobuf.w
    protected String n0(Charset charset) {
        return new String(f0(), charset);
    }

    @Override // android.content.preferences.protobuf.w
    public int size() {
        return this.f7260w;
    }

    @Override // android.content.preferences.protobuf.w
    void u0(u uVar) throws IOException {
        this.f7261x.u0(uVar);
        this.f7262y.u0(uVar);
    }

    @Override // android.content.preferences.protobuf.w
    public void v0(OutputStream outputStream) throws IOException {
        this.f7261x.v0(outputStream);
        this.f7262y.v0(outputStream);
    }

    @Override // android.content.preferences.protobuf.w
    void x0(OutputStream outputStream, int i5, int i6) throws IOException {
        int i7 = i5 + i6;
        int i8 = this.f7263z;
        if (i7 <= i8) {
            this.f7261x.x0(outputStream, i5, i6);
        } else {
            if (i5 >= i8) {
                this.f7262y.x0(outputStream, i5 - i8, i6);
                return;
            }
            int i9 = i8 - i5;
            this.f7261x.x0(outputStream, i5, i9);
            this.f7262y.x0(outputStream, 0, i6 - i9);
        }
    }

    @Override // android.content.preferences.protobuf.w
    void y0(u uVar) throws IOException {
        this.f7262y.y0(uVar);
        this.f7261x.y0(uVar);
    }

    /* compiled from: RopeByteString.java */
    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayDeque<w> f7267a;

        private b() {
            this.f7267a = new ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public w b(w wVar, w wVar2) {
            c(wVar);
            c(wVar2);
            w pop = this.f7267a.pop();
            while (!this.f7267a.isEmpty()) {
                pop = new i3(this.f7267a.pop(), pop, null);
            }
            return pop;
        }

        private void c(w wVar) {
            if (wVar.K()) {
                e(wVar);
                return;
            }
            if (!(wVar instanceof i3)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + wVar.getClass());
            }
            i3 i3Var = (i3) wVar;
            c(i3Var.f7261x);
            c(i3Var.f7262y);
        }

        private int d(int i5) {
            int binarySearch = Arrays.binarySearch(i3.B, i5);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        private void e(w wVar) {
            a aVar;
            int d6 = d(wVar.size());
            int[] iArr = i3.B;
            int i5 = iArr[d6 + 1];
            if (this.f7267a.isEmpty() || this.f7267a.peek().size() >= i5) {
                this.f7267a.push(wVar);
                return;
            }
            int i6 = iArr[d6];
            w pop = this.f7267a.pop();
            while (true) {
                aVar = null;
                if (this.f7267a.isEmpty() || this.f7267a.peek().size() >= i6) {
                    break;
                } else {
                    pop = new i3(this.f7267a.pop(), pop, aVar);
                }
            }
            i3 i3Var = new i3(pop, wVar, aVar);
            while (!this.f7267a.isEmpty()) {
                if (this.f7267a.peek().size() >= i3.B[d(i3Var.size()) + 1]) {
                    break;
                } else {
                    i3Var = new i3(this.f7267a.pop(), i3Var, aVar);
                }
            }
            this.f7267a.push(i3Var);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private i3(w wVar, w wVar2) {
        this.f7261x = wVar;
        this.f7262y = wVar2;
        int size = wVar.size();
        this.f7263z = size;
        this.f7260w = wVar2.size() + size;
        this.A = Math.max(wVar.I(), wVar2.I()) + 1;
    }

    /* compiled from: RopeByteString.java */
    /* loaded from: classes.dex */
    private class d extends InputStream {

        /* renamed from: o, reason: collision with root package name */
        private c f7270o;

        /* renamed from: p, reason: collision with root package name */
        private w.i f7271p;

        /* renamed from: q, reason: collision with root package name */
        private int f7272q;

        /* renamed from: r, reason: collision with root package name */
        private int f7273r;

        /* renamed from: s, reason: collision with root package name */
        private int f7274s;

        /* renamed from: t, reason: collision with root package name */
        private int f7275t;

        public d() {
            b();
        }

        private void a() {
            if (this.f7271p != null) {
                int i5 = this.f7273r;
                int i6 = this.f7272q;
                if (i5 == i6) {
                    this.f7274s += i6;
                    this.f7273r = 0;
                    if (!this.f7270o.hasNext()) {
                        this.f7271p = null;
                        this.f7272q = 0;
                    } else {
                        w.i next = this.f7270o.next();
                        this.f7271p = next;
                        this.f7272q = next.size();
                    }
                }
            }
        }

        private void b() {
            c cVar = new c(i3.this, null);
            this.f7270o = cVar;
            w.i next = cVar.next();
            this.f7271p = next;
            this.f7272q = next.size();
            this.f7273r = 0;
            this.f7274s = 0;
        }

        private int c(byte[] bArr, int i5, int i6) {
            int i7 = i6;
            while (true) {
                if (i7 <= 0) {
                    break;
                }
                a();
                if (this.f7271p != null) {
                    int min = Math.min(this.f7272q - this.f7273r, i7);
                    if (bArr != null) {
                        this.f7271p.C(bArr, this.f7273r, i5, min);
                        i5 += min;
                    }
                    this.f7273r += min;
                    i7 -= min;
                } else if (i7 == i6) {
                    return -1;
                }
            }
            return i6 - i7;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return i3.this.size() - (this.f7274s + this.f7273r);
        }

        @Override // java.io.InputStream
        public void mark(int i5) {
            this.f7275t = this.f7274s + this.f7273r;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i5, int i6) {
            bArr.getClass();
            if (i5 < 0 || i6 < 0 || i6 > bArr.length - i5) {
                throw new IndexOutOfBoundsException();
            }
            return c(bArr, i5, i6);
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            b();
            c(null, 0, this.f7275t);
        }

        @Override // java.io.InputStream
        public long skip(long j5) {
            if (j5 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j5 > 2147483647L) {
                j5 = 2147483647L;
            }
            return c(null, 0, (int) j5);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            a();
            w.i iVar = this.f7271p;
            if (iVar == null) {
                return -1;
            }
            int i5 = this.f7273r;
            this.f7273r = i5 + 1;
            return iVar.i(i5) & UByte.f27220r;
        }
    }
}
