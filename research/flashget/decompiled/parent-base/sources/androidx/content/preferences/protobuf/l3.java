package androidx.content.preferences.protobuf;

import androidx.constraintlayout.core.motion.utils.w;
import androidx.content.preferences.protobuf.w;
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

/* compiled from: RopeByteString.java */
/* loaded from: classes3.dex */
final class l3 extends w {

    /* renamed from: o, reason: collision with root package name */
    static final int[] f28734o = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, w.e.f22502z, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: p, reason: collision with root package name */
    private static final long f28735p = 1;

    /* renamed from: j, reason: collision with root package name */
    private final int f28736j;

    /* renamed from: k, reason: collision with root package name */
    private final w f28737k;

    /* renamed from: l, reason: collision with root package name */
    private final w f28738l;

    /* renamed from: m, reason: collision with root package name */
    private final int f28739m;

    /* renamed from: n, reason: collision with root package name */
    private final int f28740n;

    /* compiled from: RopeByteString.java */
    class a extends w.c {

        /* renamed from: b, reason: collision with root package name */
        final c f28741b;

        /* renamed from: c, reason: collision with root package name */
        w.g f28742c = b();

        a() {
            this.f28741b = new c(l3.this, null);
        }

        private w.g b() {
            if (this.f28741b.hasNext()) {
                return this.f28741b.next().iterator();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28742c != null;
        }

        @Override // androidx.datastore.preferences.protobuf.w.g
        public byte q() {
            w.g gVar = this.f28742c;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            byte q4 = gVar.q();
            if (!this.f28742c.hasNext()) {
                this.f28742c = b();
            }
            return q4;
        }
    }

    /* compiled from: RopeByteString.java */
    private static final class c implements Iterator<w.i> {

        /* renamed from: b, reason: collision with root package name */
        private final ArrayDeque<l3> f28745b;

        /* renamed from: c, reason: collision with root package name */
        private w.i f28746c;

        /* synthetic */ c(w wVar, a aVar) {
            this(wVar);
        }

        private w.i a(w wVar) {
            while (wVar instanceof l3) {
                l3 l3Var = (l3) wVar;
                this.f28745b.push(l3Var);
                wVar = l3Var.f28737k;
            }
            return (w.i) wVar;
        }

        private w.i b() {
            w.i a5;
            do {
                ArrayDeque<l3> arrayDeque = this.f28745b;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                a5 = a(this.f28745b.pop().f28738l);
            } while (a5.isEmpty());
            return a5;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public w.i next() {
            w.i iVar = this.f28746c;
            if (iVar == null) {
                throw new NoSuchElementException();
            }
            this.f28746c = b();
            return iVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28746c != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(w wVar) {
            if (!(wVar instanceof l3)) {
                this.f28745b = null;
                this.f28746c = (w.i) wVar;
                return;
            }
            l3 l3Var = (l3) wVar;
            ArrayDeque<l3> arrayDeque = new ArrayDeque<>(l3Var.K());
            this.f28745b = arrayDeque;
            arrayDeque.push(l3Var);
            this.f28746c = a(l3Var.f28737k);
        }
    }

    /* synthetic */ l3(w wVar, w wVar2, a aVar) {
        this(wVar, wVar2);
    }

    static w D0(w wVar, w wVar2) {
        if (wVar2.size() == 0) {
            return wVar;
        }
        if (wVar.size() == 0) {
            return wVar2;
        }
        int size = wVar2.size() + wVar.size();
        if (size < 128) {
            return E0(wVar, wVar2);
        }
        if (wVar instanceof l3) {
            l3 l3Var = (l3) wVar;
            if (wVar2.size() + l3Var.f28738l.size() < 128) {
                return new l3(l3Var.f28737k, E0(l3Var.f28738l, wVar2));
            }
            if (l3Var.f28737k.K() > l3Var.f28738l.K() && l3Var.f28740n > wVar2.K()) {
                return new l3(l3Var.f28737k, new l3(l3Var.f28738l, wVar2));
            }
        }
        return size >= f28734o[Math.max(wVar.K(), wVar2.K()) + 1] ? new l3(wVar, wVar2) : new b(null).b(wVar, wVar2);
    }

    private static w E0(w wVar, w wVar2) {
        int size = wVar.size();
        int size2 = wVar2.size();
        byte[] bArr = new byte[size + size2];
        wVar.G(bArr, 0, 0, size);
        wVar2.G(bArr, 0, size, size2);
        return new w.j(bArr);
    }

    private boolean F0(w wVar) {
        a aVar = null;
        c cVar = new c(this, aVar);
        w.i next = cVar.next();
        c cVar2 = new c(wVar, aVar);
        w.i next2 = cVar2.next();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int size = next.size() - i4;
            int size2 = next2.size() - i5;
            int min = Math.min(size, size2);
            if (!(i4 == 0 ? next.y0(next2, i5, min) : next2.y0(next, i4, min))) {
                return false;
            }
            i6 += min;
            int i7 = this.f28736j;
            if (i6 >= i7) {
                if (i6 == i7) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                i4 = 0;
                next = cVar.next();
            } else {
                i4 += min;
                next = next;
            }
            if (min == size2) {
                next2 = cVar2.next();
                i5 = 0;
            } else {
                i5 += min;
            }
        }
    }

    static l3 G0(w wVar, w wVar2) {
        return new l3(wVar, wVar2);
    }

    private void I0(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // androidx.content.preferences.protobuf.w
    public void D(ByteBuffer byteBuffer) {
        this.f28737k.D(byteBuffer);
        this.f28738l.D(byteBuffer);
    }

    @Override // androidx.content.preferences.protobuf.w
    protected void H(byte[] bArr, int i4, int i5, int i6) {
        int i7 = i4 + i6;
        int i10 = this.f28739m;
        if (i7 <= i10) {
            this.f28737k.H(bArr, i4, i5, i6);
        } else {
            if (i4 >= i10) {
                this.f28738l.H(bArr, i4 - i10, i5, i6);
                return;
            }
            int i11 = i10 - i4;
            this.f28737k.H(bArr, i4, i5, i11);
            this.f28738l.H(bArr, 0, i5 + i11, i6 - i11);
        }
    }

    Object J0() {
        return new w.j(i0());
    }

    @Override // androidx.content.preferences.protobuf.w
    protected int K() {
        return this.f28740n;
    }

    @Override // androidx.content.preferences.protobuf.w
    byte L(int i4) {
        int i5 = this.f28739m;
        return i4 < i5 ? this.f28737k.L(i4) : this.f28738l.L(i4 - i5);
    }

    @Override // androidx.content.preferences.protobuf.w
    protected boolean O() {
        return this.f28736j >= f28734o[this.f28740n];
    }

    @Override // androidx.content.preferences.protobuf.w
    public boolean P() {
        int X = this.f28737k.X(0, 0, this.f28739m);
        w wVar = this.f28738l;
        return wVar.X(X, 0, wVar.size()) == 0;
    }

    @Override // androidx.content.preferences.protobuf.w
    /* renamed from: Q */
    public w.g iterator() {
        return new a();
    }

    @Override // androidx.content.preferences.protobuf.w
    public z S() {
        return z.k(new d(), 4096);
    }

    @Override // androidx.content.preferences.protobuf.w
    public InputStream T() {
        return new d();
    }

    @Override // androidx.content.preferences.protobuf.w
    protected int W(int i4, int i5, int i6) {
        int i7 = i5 + i6;
        int i10 = this.f28739m;
        if (i7 <= i10) {
            return this.f28737k.W(i4, i5, i6);
        }
        if (i5 >= i10) {
            return this.f28738l.W(i4, i5 - i10, i6);
        }
        int i11 = i10 - i5;
        return this.f28738l.W(this.f28737k.W(i4, i5, i11), 0, i6 - i11);
    }

    @Override // androidx.content.preferences.protobuf.w
    protected int X(int i4, int i5, int i6) {
        int i7 = i5 + i6;
        int i10 = this.f28739m;
        if (i7 <= i10) {
            return this.f28737k.X(i4, i5, i6);
        }
        if (i5 >= i10) {
            return this.f28738l.X(i4, i5 - i10, i6);
        }
        int i11 = i10 - i5;
        return this.f28738l.X(this.f28737k.X(i4, i5, i11), 0, i6 - i11);
    }

    @Override // androidx.content.preferences.protobuf.w
    public ByteBuffer c() {
        return ByteBuffer.wrap(i0()).asReadOnlyBuffer();
    }

    @Override // androidx.content.preferences.protobuf.w
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f28736j != wVar.size()) {
            return false;
        }
        if (this.f28736j == 0) {
            return true;
        }
        int Z = Z();
        int Z2 = wVar.Z();
        if (Z == 0 || Z2 == 0 || Z == Z2) {
            return F0(wVar);
        }
        return false;
    }

    @Override // androidx.content.preferences.protobuf.w
    public List<ByteBuffer> f() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().c());
        }
        return arrayList;
    }

    @Override // androidx.content.preferences.protobuf.w
    public w h0(int i4, int i5) {
        int l4 = w.l(i4, i5, this.f28736j);
        if (l4 == 0) {
            return w.f28998f;
        }
        if (l4 == this.f28736j) {
            return this;
        }
        int i6 = this.f28739m;
        return i5 <= i6 ? this.f28737k.h0(i4, i5) : i4 >= i6 ? this.f28738l.h0(i4 - i6, i5 - i6) : new l3(this.f28737k.g0(i4), this.f28738l.h0(0, i5 - this.f28739m));
    }

    @Override // androidx.content.preferences.protobuf.w
    public byte i(int i4) {
        w.j(i4, this.f28736j);
        return L(i4);
    }

    @Override // androidx.content.preferences.protobuf.w, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new a();
    }

    @Override // androidx.content.preferences.protobuf.w
    protected String m0(Charset charset) {
        return new String(i0(), charset);
    }

    @Override // androidx.content.preferences.protobuf.w
    public int size() {
        return this.f28736j;
    }

    @Override // androidx.content.preferences.protobuf.w
    void t0(v vVar) throws IOException {
        this.f28737k.t0(vVar);
        this.f28738l.t0(vVar);
    }

    @Override // androidx.content.preferences.protobuf.w
    public void u0(OutputStream outputStream) throws IOException {
        this.f28737k.u0(outputStream);
        this.f28738l.u0(outputStream);
    }

    @Override // androidx.content.preferences.protobuf.w
    void w0(OutputStream outputStream, int i4, int i5) throws IOException {
        int i6 = i4 + i5;
        int i7 = this.f28739m;
        if (i6 <= i7) {
            this.f28737k.w0(outputStream, i4, i5);
        } else {
            if (i4 >= i7) {
                this.f28738l.w0(outputStream, i4 - i7, i5);
                return;
            }
            int i10 = i7 - i4;
            this.f28737k.w0(outputStream, i4, i10);
            this.f28738l.w0(outputStream, 0, i5 - i10);
        }
    }

    @Override // androidx.content.preferences.protobuf.w
    void x0(v vVar) throws IOException {
        this.f28738l.x0(vVar);
        this.f28737k.x0(vVar);
    }

    /* compiled from: RopeByteString.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayDeque<w> f28744a;

        private b() {
            this.f28744a = new ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public w b(w wVar, w wVar2) {
            c(wVar);
            c(wVar2);
            w pop = this.f28744a.pop();
            while (!this.f28744a.isEmpty()) {
                pop = new l3(this.f28744a.pop(), pop, null);
            }
            return pop;
        }

        private void c(w wVar) {
            if (wVar.O()) {
                e(wVar);
                return;
            }
            if (!(wVar instanceof l3)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + wVar.getClass());
            }
            l3 l3Var = (l3) wVar;
            c(l3Var.f28737k);
            c(l3Var.f28738l);
        }

        private int d(int i4) {
            int binarySearch = Arrays.binarySearch(l3.f28734o, i4);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        private void e(w wVar) {
            a aVar;
            int d5 = d(wVar.size());
            int[] iArr = l3.f28734o;
            int i4 = iArr[d5 + 1];
            if (this.f28744a.isEmpty() || this.f28744a.peek().size() >= i4) {
                this.f28744a.push(wVar);
                return;
            }
            int i5 = iArr[d5];
            w pop = this.f28744a.pop();
            while (true) {
                aVar = null;
                if (this.f28744a.isEmpty() || this.f28744a.peek().size() >= i5) {
                    break;
                } else {
                    pop = new l3(this.f28744a.pop(), pop, aVar);
                }
            }
            l3 l3Var = new l3(pop, wVar, aVar);
            while (!this.f28744a.isEmpty()) {
                if (this.f28744a.peek().size() >= l3.f28734o[d(l3Var.size()) + 1]) {
                    break;
                } else {
                    l3Var = new l3(this.f28744a.pop(), l3Var, aVar);
                }
            }
            this.f28744a.push(l3Var);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private l3(w wVar, w wVar2) {
        this.f28737k = wVar;
        this.f28738l = wVar2;
        int size = wVar.size();
        this.f28739m = size;
        this.f28736j = wVar2.size() + size;
        this.f28740n = Math.max(wVar.K(), wVar2.K()) + 1;
    }

    /* compiled from: RopeByteString.java */
    private class d extends InputStream {

        /* renamed from: b, reason: collision with root package name */
        private c f28747b;

        /* renamed from: c, reason: collision with root package name */
        private w.i f28748c;

        /* renamed from: d, reason: collision with root package name */
        private int f28749d;

        /* renamed from: e, reason: collision with root package name */
        private int f28750e;

        /* renamed from: f, reason: collision with root package name */
        private int f28751f;

        /* renamed from: g, reason: collision with root package name */
        private int f28752g;

        public d() {
            b();
        }

        private void a() {
            if (this.f28748c != null) {
                int i4 = this.f28750e;
                int i5 = this.f28749d;
                if (i4 == i5) {
                    this.f28751f += i5;
                    this.f28750e = 0;
                    if (!this.f28747b.hasNext()) {
                        this.f28748c = null;
                        this.f28749d = 0;
                    } else {
                        w.i next = this.f28747b.next();
                        this.f28748c = next;
                        this.f28749d = next.size();
                    }
                }
            }
        }

        private void b() {
            c cVar = new c(l3.this, null);
            this.f28747b = cVar;
            w.i next = cVar.next();
            this.f28748c = next;
            this.f28749d = next.size();
            this.f28750e = 0;
            this.f28751f = 0;
        }

        private int c(byte[] bArr, int i4, int i5) {
            int i6 = i5;
            while (true) {
                if (i6 <= 0) {
                    break;
                }
                a();
                if (this.f28748c != null) {
                    int min = Math.min(this.f28749d - this.f28750e, i6);
                    if (bArr != null) {
                        this.f28748c.G(bArr, this.f28750e, i4, min);
                        i4 += min;
                    }
                    this.f28750e += min;
                    i6 -= min;
                } else if (i6 == i5) {
                    return -1;
                }
            }
            return i5 - i6;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return l3.this.size() - (this.f28751f + this.f28750e);
        }

        @Override // java.io.InputStream
        public void mark(int i4) {
            this.f28752g = this.f28751f + this.f28750e;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) {
            bArr.getClass();
            if (i4 < 0 || i5 < 0 || i5 > bArr.length - i4) {
                throw new IndexOutOfBoundsException();
            }
            return c(bArr, i4, i5);
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            b();
            c(null, 0, this.f28752g);
        }

        @Override // java.io.InputStream
        public long skip(long j4) {
            if (j4 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j4 > 2147483647L) {
                j4 = 2147483647L;
            }
            return c(null, 0, (int) j4);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            a();
            w.i iVar = this.f28748c;
            if (iVar == null) {
                return -1;
            }
            int i4 = this.f28750e;
            this.f28750e = i4 + 1;
            return iVar.i(i4) & 255;
        }
    }
}
