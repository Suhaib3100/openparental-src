package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* compiled from: RopeByteString.java */
/* loaded from: classes7.dex */
class s extends kotlin.reflect.jvm.internal.impl.protobuf.d {

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f77743j;

    /* renamed from: d, reason: collision with root package name */
    private final int f77744d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f77745e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f77746f;

    /* renamed from: g, reason: collision with root package name */
    private final int f77747g;

    /* renamed from: h, reason: collision with root package name */
    private final int f77748h;

    /* renamed from: i, reason: collision with root package name */
    private int f77749i;

    /* compiled from: RopeByteString.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> f77750a;

        private b() {
            this.f77750a = new Stack<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public kotlin.reflect.jvm.internal.impl.protobuf.d b(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
            c(dVar);
            c(dVar2);
            kotlin.reflect.jvm.internal.impl.protobuf.d pop = this.f77750a.pop();
            while (!this.f77750a.isEmpty()) {
                pop = new s(this.f77750a.pop(), pop);
            }
            return pop;
        }

        private void c(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            if (dVar.q()) {
                e(dVar);
            } else {
                if (!(dVar instanceof s)) {
                    String valueOf = String.valueOf(dVar.getClass());
                    throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder(valueOf.length() + 49), ProtectedSandApp.s("盝\u0001"), valueOf));
                }
                s sVar = (s) dVar;
                c(sVar.f77745e);
                c(sVar.f77746f);
            }
        }

        private int d(int i4) {
            int binarySearch = Arrays.binarySearch(s.f77743j, i4);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        private void e(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            int d5 = d(dVar.size());
            int i4 = s.f77743j[d5 + 1];
            if (this.f77750a.isEmpty() || this.f77750a.peek().size() >= i4) {
                this.f77750a.push(dVar);
                return;
            }
            int i5 = s.f77743j[d5];
            kotlin.reflect.jvm.internal.impl.protobuf.d pop = this.f77750a.pop();
            while (true) {
                if (this.f77750a.isEmpty() || this.f77750a.peek().size() >= i5) {
                    break;
                } else {
                    pop = new s(this.f77750a.pop(), pop);
                }
            }
            s sVar = new s(pop, dVar);
            while (!this.f77750a.isEmpty()) {
                if (this.f77750a.peek().size() >= s.f77743j[d(sVar.size()) + 1]) {
                    break;
                } else {
                    sVar = new s(this.f77750a.pop(), sVar);
                }
            }
            this.f77750a.push(sVar);
        }
    }

    /* compiled from: RopeByteString.java */
    private static class c implements Iterator<n> {

        /* renamed from: b, reason: collision with root package name */
        private final Stack<s> f77751b;

        /* renamed from: c, reason: collision with root package name */
        private n f77752c;

        private n a(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            while (dVar instanceof s) {
                s sVar = (s) dVar;
                this.f77751b.push(sVar);
                dVar = sVar.f77745e;
            }
            return (n) dVar;
        }

        private n b() {
            while (!this.f77751b.isEmpty()) {
                n a5 = a(this.f77751b.pop().f77746f);
                if (!a5.isEmpty()) {
                    return a5;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public n next() {
            n nVar = this.f77752c;
            if (nVar == null) {
                throw new NoSuchElementException();
            }
            this.f77752c = b();
            return nVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f77752c != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            this.f77751b = new Stack<>();
            this.f77752c = a(dVar);
        }
    }

    /* compiled from: RopeByteString.java */
    private class d implements d.a {

        /* renamed from: b, reason: collision with root package name */
        private final c f77753b;

        /* renamed from: c, reason: collision with root package name */
        private d.a f77754c;

        /* renamed from: d, reason: collision with root package name */
        int f77755d;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(q());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f77755d > 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte q() {
            if (!this.f77754c.hasNext()) {
                this.f77754c = this.f77753b.next().iterator();
            }
            this.f77755d--;
            return this.f77754c.q();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private d() {
            c cVar = new c(s.this);
            this.f77753b = cVar;
            this.f77754c = cVar.next().iterator();
            this.f77755d = s.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i4 = 1;
        int i5 = 1;
        while (i4 > 0) {
            arrayList.add(Integer.valueOf(i4));
            int i6 = i5 + i4;
            i5 = i4;
            i4 = i6;
        }
        arrayList.add(Integer.MAX_VALUE);
        f77743j = new int[arrayList.size()];
        int i7 = 0;
        while (true) {
            int[] iArr = f77743j;
            if (i7 >= iArr.length) {
                return;
            }
            iArr[i7] = ((Integer) arrayList.get(i7)).intValue();
            i7++;
        }
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.d Q(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        s sVar = dVar instanceof s ? (s) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() != 0) {
            int size = dVar2.size() + dVar.size();
            if (size < 128) {
                return R(dVar, dVar2);
            }
            if (sVar != null) {
                if (dVar2.size() + sVar.f77746f.size() < 128) {
                    dVar2 = new s(sVar.f77745e, R(sVar.f77746f, dVar2));
                }
            }
            if (sVar == null || sVar.f77745e.p() <= sVar.f77746f.p() || sVar.p() <= dVar2.p()) {
                return size >= f77743j[Math.max(dVar.p(), dVar2.p()) + 1] ? new s(dVar, dVar2) : new b().b(dVar, dVar2);
            }
            dVar2 = new s(sVar.f77745e, new s(sVar.f77746f, dVar2));
        }
        return dVar2;
    }

    private static n R(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[size + size2];
        dVar.l(bArr, 0, 0, size);
        dVar2.l(bArr, 0, size, size2);
        return new n(bArr);
    }

    private boolean S(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
        c cVar = new c(this);
        n nVar = (n) cVar.next();
        c cVar2 = new c(dVar);
        n nVar2 = (n) cVar2.next();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int size = nVar.size() - i4;
            int size2 = nVar2.size() - i5;
            int min = Math.min(size, size2);
            if (!(i4 == 0 ? nVar.O(nVar2, i5, min) : nVar2.O(nVar, i4, min))) {
                return false;
            }
            i6 += min;
            int i7 = this.f77744d;
            if (i6 >= i7) {
                if (i6 == i7) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                nVar = (n) cVar.next();
                i4 = 0;
            } else {
                i4 += min;
            }
            if (min == size2) {
                nVar2 = (n) cVar2.next();
                i5 = 0;
            } else {
                i5 += min;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int A(int i4, int i5, int i6) {
        int i7 = i5 + i6;
        int i10 = this.f77747g;
        if (i7 <= i10) {
            return this.f77745e.A(i4, i5, i6);
        }
        if (i5 >= i10) {
            return this.f77746f.A(i4, i5 - i10, i6);
        }
        int i11 = i10 - i5;
        return this.f77746f.A(this.f77745e.A(i4, i5, i11), 0, i6 - i11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int D() {
        return this.f77749i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String G(String str) throws UnsupportedEncodingException {
        return new String(F(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    void K(OutputStream outputStream, int i4, int i5) throws IOException {
        int i6 = i4 + i5;
        int i7 = this.f77747g;
        if (i6 <= i7) {
            this.f77745e.K(outputStream, i4, i5);
        } else {
            if (i4 >= i7) {
                this.f77746f.K(outputStream, i4 - i7, i5);
                return;
            }
            int i10 = i7 - i4;
            this.f77745e.K(outputStream, i4, i10);
            this.f77746f.K(outputStream, 0, i5 - i10);
        }
    }

    public boolean equals(Object obj) {
        int D;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.d)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
        if (this.f77744d != dVar.size()) {
            return false;
        }
        if (this.f77744d == 0) {
            return true;
        }
        if (this.f77749i == 0 || (D = dVar.D()) == 0 || this.f77749i == D) {
            return S(dVar);
        }
        return false;
    }

    public int hashCode() {
        int i4 = this.f77749i;
        if (i4 == 0) {
            int i5 = this.f77744d;
            i4 = x(i5, 0, i5);
            if (i4 == 0) {
                i4 = 1;
            }
            this.f77749i = i4;
        }
        return i4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void m(byte[] bArr, int i4, int i5, int i6) {
        int i7 = i4 + i6;
        int i10 = this.f77747g;
        if (i7 <= i10) {
            this.f77745e.m(bArr, i4, i5, i6);
        } else {
            if (i4 >= i10) {
                this.f77746f.m(bArr, i4 - i10, i5, i6);
                return;
            }
            int i11 = i10 - i4;
            this.f77745e.m(bArr, i4, i5, i11);
            this.f77746f.m(bArr, 0, i5 + i11, i6 - i11);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int p() {
        return this.f77748h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected boolean q() {
        return this.f77744d >= f77743j[this.f77748h];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean r() {
        int A = this.f77745e.A(0, 0, this.f77747g);
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = this.f77746f;
        return dVar.A(A, 0, dVar.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: s */
    public d.a iterator() {
        return new d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f77744d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public kotlin.reflect.jvm.internal.impl.protobuf.e v() {
        return kotlin.reflect.jvm.internal.impl.protobuf.e.g(new e());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int x(int i4, int i5, int i6) {
        int i7 = i5 + i6;
        int i10 = this.f77747g;
        if (i7 <= i10) {
            return this.f77745e.x(i4, i5, i6);
        }
        if (i5 >= i10) {
            return this.f77746f.x(i4, i5 - i10, i6);
        }
        int i11 = i10 - i5;
        return this.f77746f.x(this.f77745e.x(i4, i5, i11), 0, i6 - i11);
    }

    private s(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        this.f77749i = 0;
        this.f77745e = dVar;
        this.f77746f = dVar2;
        int size = dVar.size();
        this.f77747g = size;
        this.f77744d = dVar2.size() + size;
        this.f77748h = Math.max(dVar.p(), dVar2.p()) + 1;
    }

    /* compiled from: RopeByteString.java */
    private class e extends InputStream {

        /* renamed from: b, reason: collision with root package name */
        private c f77757b;

        /* renamed from: c, reason: collision with root package name */
        private n f77758c;

        /* renamed from: d, reason: collision with root package name */
        private int f77759d;

        /* renamed from: e, reason: collision with root package name */
        private int f77760e;

        /* renamed from: f, reason: collision with root package name */
        private int f77761f;

        /* renamed from: g, reason: collision with root package name */
        private int f77762g;

        public e() {
            b();
        }

        private void a() {
            if (this.f77758c != null) {
                int i4 = this.f77760e;
                int i5 = this.f77759d;
                if (i4 == i5) {
                    this.f77761f += i5;
                    this.f77760e = 0;
                    if (!this.f77757b.hasNext()) {
                        this.f77758c = null;
                        this.f77759d = 0;
                    } else {
                        n next = this.f77757b.next();
                        this.f77758c = next;
                        this.f77759d = next.size();
                    }
                }
            }
        }

        private void b() {
            c cVar = new c(s.this);
            this.f77757b = cVar;
            n next = cVar.next();
            this.f77758c = next;
            this.f77759d = next.size();
            this.f77760e = 0;
            this.f77761f = 0;
        }

        private int c(byte[] bArr, int i4, int i5) {
            int i6 = i5;
            while (true) {
                if (i6 <= 0) {
                    break;
                }
                a();
                if (this.f77758c != null) {
                    int min = Math.min(this.f77759d - this.f77760e, i6);
                    if (bArr != null) {
                        this.f77758c.l(bArr, this.f77760e, i4, min);
                        i4 += min;
                    }
                    this.f77760e += min;
                    i6 -= min;
                } else if (i6 == i5) {
                    return -1;
                }
            }
            return i5 - i6;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return s.this.size() - (this.f77761f + this.f77760e);
        }

        @Override // java.io.InputStream
        public void mark(int i4) {
            this.f77762g = this.f77761f + this.f77760e;
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
            c(null, 0, this.f77762g);
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
            n nVar = this.f77758c;
            if (nVar == null) {
                return -1;
            }
            int i4 = this.f77760e;
            this.f77760e = i4 + 1;
            return nVar.L(i4) & 255;
        }
    }
}
