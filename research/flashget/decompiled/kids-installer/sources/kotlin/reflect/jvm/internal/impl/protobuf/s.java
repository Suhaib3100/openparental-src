package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.UByte;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* compiled from: RopeByteString.java */
/* loaded from: classes5.dex */
class s extends kotlin.reflect.jvm.internal.impl.protobuf.d {

    /* renamed from: w, reason: collision with root package name */
    private static final int[] f25761w;

    /* renamed from: q, reason: collision with root package name */
    private final int f25762q;

    /* renamed from: r, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f25763r;

    /* renamed from: s, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f25764s;

    /* renamed from: t, reason: collision with root package name */
    private final int f25765t;

    /* renamed from: u, reason: collision with root package name */
    private final int f25766u;

    /* renamed from: v, reason: collision with root package name */
    private int f25767v;

    /* compiled from: RopeByteString.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> f25768a;

        private b() {
            this.f25768a = new Stack<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public kotlin.reflect.jvm.internal.impl.protobuf.d b(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
            c(dVar);
            c(dVar2);
            kotlin.reflect.jvm.internal.impl.protobuf.d pop = this.f25768a.pop();
            while (!this.f25768a.isEmpty()) {
                pop = new s(this.f25768a.pop(), pop);
            }
            return pop;
        }

        private void c(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            if (dVar.s()) {
                e(dVar);
            } else {
                if (!(dVar instanceof s)) {
                    String valueOf = String.valueOf(dVar.getClass());
                    throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder(valueOf.length() + 49), ProtectedSandApp.s("佚"), valueOf));
                }
                s sVar = (s) dVar;
                c(sVar.f25763r);
                c(sVar.f25764s);
            }
        }

        private int d(int i5) {
            int binarySearch = Arrays.binarySearch(s.f25761w, i5);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        private void e(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            int d6 = d(dVar.size());
            int i5 = s.f25761w[d6 + 1];
            if (this.f25768a.isEmpty() || this.f25768a.peek().size() >= i5) {
                this.f25768a.push(dVar);
                return;
            }
            int i6 = s.f25761w[d6];
            kotlin.reflect.jvm.internal.impl.protobuf.d pop = this.f25768a.pop();
            while (true) {
                if (this.f25768a.isEmpty() || this.f25768a.peek().size() >= i6) {
                    break;
                } else {
                    pop = new s(this.f25768a.pop(), pop);
                }
            }
            s sVar = new s(pop, dVar);
            while (!this.f25768a.isEmpty()) {
                if (this.f25768a.peek().size() >= s.f25761w[d(sVar.size()) + 1]) {
                    break;
                } else {
                    sVar = new s(this.f25768a.pop(), sVar);
                }
            }
            this.f25768a.push(sVar);
        }
    }

    /* compiled from: RopeByteString.java */
    private static class c implements Iterator<n> {

        /* renamed from: o, reason: collision with root package name */
        private final Stack<s> f25769o;

        /* renamed from: p, reason: collision with root package name */
        private n f25770p;

        private n a(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            while (dVar instanceof s) {
                s sVar = (s) dVar;
                this.f25769o.push(sVar);
                dVar = sVar.f25763r;
            }
            return (n) dVar;
        }

        private n c() {
            while (!this.f25769o.isEmpty()) {
                n a6 = a(this.f25769o.pop().f25764s);
                if (!a6.isEmpty()) {
                    return a6;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public n next() {
            n nVar = this.f25770p;
            if (nVar == null) {
                throw new NoSuchElementException();
            }
            this.f25770p = c();
            return nVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25770p != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            this.f25769o = new Stack<>();
            this.f25770p = a(dVar);
        }
    }

    /* compiled from: RopeByteString.java */
    private class d implements d.a {

        /* renamed from: o, reason: collision with root package name */
        private final c f25771o;

        /* renamed from: p, reason: collision with root package name */
        private d.a f25772p;

        /* renamed from: q, reason: collision with root package name */
        int f25773q;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(b());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte b() {
            if (!this.f25772p.hasNext()) {
                this.f25772p = this.f25771o.next().iterator();
            }
            this.f25773q--;
            return this.f25772p.b();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25773q > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private d() {
            c cVar = new c(s.this);
            this.f25771o = cVar;
            this.f25772p = cVar.next().iterator();
            this.f25773q = s.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i5 = 1;
        int i6 = 1;
        while (i5 > 0) {
            arrayList.add(Integer.valueOf(i5));
            int i7 = i6 + i5;
            i6 = i5;
            i5 = i7;
        }
        arrayList.add(Integer.MAX_VALUE);
        f25761w = new int[arrayList.size()];
        int i8 = 0;
        while (true) {
            int[] iArr = f25761w;
            if (i8 >= iArr.length) {
                return;
            }
            iArr[i8] = ((Integer) arrayList.get(i8)).intValue();
            i8++;
        }
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.d M(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        s sVar = dVar instanceof s ? (s) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() != 0) {
            int size = dVar2.size() + dVar.size();
            if (size < 128) {
                return N(dVar, dVar2);
            }
            if (sVar != null) {
                if (dVar2.size() + sVar.f25764s.size() < 128) {
                    dVar2 = new s(sVar.f25763r, N(sVar.f25764s, dVar2));
                }
            }
            if (sVar == null || sVar.f25763r.r() <= sVar.f25764s.r() || sVar.r() <= dVar2.r()) {
                return size >= f25761w[Math.max(dVar.r(), dVar2.r()) + 1] ? new s(dVar, dVar2) : new b().b(dVar, dVar2);
            }
            dVar2 = new s(sVar.f25763r, new s(sVar.f25764s, dVar2));
        }
        return dVar2;
    }

    private static n N(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[size + size2];
        dVar.p(bArr, 0, 0, size);
        dVar2.p(bArr, 0, size, size2);
        return new n(bArr);
    }

    private boolean O(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
        c cVar = new c(this);
        n next = cVar.next();
        c cVar2 = new c(dVar);
        n next2 = cVar2.next();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int size = next.size() - i5;
            int size2 = next2.size() - i6;
            int min = Math.min(size, size2);
            if (!(i5 == 0 ? next.K(next2, i6, min) : next2.K(next, i5, min))) {
                return false;
            }
            i7 += min;
            int i8 = this.f25762q;
            if (i7 >= i8) {
                if (i7 == i8) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                next = cVar.next();
                i5 = 0;
            } else {
                i5 += min;
            }
            if (min == size2) {
                next2 = cVar2.next();
                i6 = 0;
            } else {
                i6 += min;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int A() {
        return this.f25767v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String C(String str) throws UnsupportedEncodingException {
        return new String(B(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    void I(OutputStream outputStream, int i5, int i6) throws IOException {
        int i7 = i5 + i6;
        int i8 = this.f25765t;
        if (i7 <= i8) {
            this.f25763r.I(outputStream, i5, i6);
        } else {
            if (i5 >= i8) {
                this.f25764s.I(outputStream, i5 - i8, i6);
                return;
            }
            int i9 = i8 - i5;
            this.f25763r.I(outputStream, i5, i9);
            this.f25764s.I(outputStream, 0, i6 - i9);
        }
    }

    public boolean equals(Object obj) {
        int A;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.d)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
        if (this.f25762q != dVar.size()) {
            return false;
        }
        if (this.f25762q == 0) {
            return true;
        }
        if (this.f25767v == 0 || (A = dVar.A()) == 0 || this.f25767v == A) {
            return O(dVar);
        }
        return false;
    }

    public int hashCode() {
        int i5 = this.f25767v;
        if (i5 == 0) {
            int i6 = this.f25762q;
            i5 = y(i6, 0, i6);
            if (i5 == 0) {
                i5 = 1;
            }
            this.f25767v = i5;
        }
        return i5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void q(byte[] bArr, int i5, int i6, int i7) {
        int i8 = i5 + i7;
        int i9 = this.f25765t;
        if (i8 <= i9) {
            this.f25763r.q(bArr, i5, i6, i7);
        } else {
            if (i5 >= i9) {
                this.f25764s.q(bArr, i5 - i9, i6, i7);
                return;
            }
            int i10 = i9 - i5;
            this.f25763r.q(bArr, i5, i6, i10);
            this.f25764s.q(bArr, 0, i6 + i10, i7 - i10);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int r() {
        return this.f25766u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected boolean s() {
        return this.f25762q >= f25761w[this.f25766u];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f25762q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean t() {
        int z5 = this.f25763r.z(0, 0, this.f25765t);
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = this.f25764s;
        return dVar.z(z5, 0, dVar.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: u */
    public d.a iterator() {
        return new d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public kotlin.reflect.jvm.internal.impl.protobuf.e v() {
        return kotlin.reflect.jvm.internal.impl.protobuf.e.g(new e());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int y(int i5, int i6, int i7) {
        int i8 = i6 + i7;
        int i9 = this.f25765t;
        if (i8 <= i9) {
            return this.f25763r.y(i5, i6, i7);
        }
        if (i6 >= i9) {
            return this.f25764s.y(i5, i6 - i9, i7);
        }
        int i10 = i9 - i6;
        return this.f25764s.y(this.f25763r.y(i5, i6, i10), 0, i7 - i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int z(int i5, int i6, int i7) {
        int i8 = i6 + i7;
        int i9 = this.f25765t;
        if (i8 <= i9) {
            return this.f25763r.z(i5, i6, i7);
        }
        if (i6 >= i9) {
            return this.f25764s.z(i5, i6 - i9, i7);
        }
        int i10 = i9 - i6;
        return this.f25764s.z(this.f25763r.z(i5, i6, i10), 0, i7 - i10);
    }

    private s(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        this.f25767v = 0;
        this.f25763r = dVar;
        this.f25764s = dVar2;
        int size = dVar.size();
        this.f25765t = size;
        this.f25762q = dVar2.size() + size;
        this.f25766u = Math.max(dVar.r(), dVar2.r()) + 1;
    }

    /* compiled from: RopeByteString.java */
    private class e extends InputStream {

        /* renamed from: o, reason: collision with root package name */
        private c f25775o;

        /* renamed from: p, reason: collision with root package name */
        private n f25776p;

        /* renamed from: q, reason: collision with root package name */
        private int f25777q;

        /* renamed from: r, reason: collision with root package name */
        private int f25778r;

        /* renamed from: s, reason: collision with root package name */
        private int f25779s;

        /* renamed from: t, reason: collision with root package name */
        private int f25780t;

        public e() {
            b();
        }

        private void a() {
            if (this.f25776p != null) {
                int i5 = this.f25778r;
                int i6 = this.f25777q;
                if (i5 == i6) {
                    this.f25779s += i6;
                    this.f25778r = 0;
                    if (!this.f25775o.hasNext()) {
                        this.f25776p = null;
                        this.f25777q = 0;
                    } else {
                        n next = this.f25775o.next();
                        this.f25776p = next;
                        this.f25777q = next.size();
                    }
                }
            }
        }

        private void b() {
            c cVar = new c(s.this);
            this.f25775o = cVar;
            n next = cVar.next();
            this.f25776p = next;
            this.f25777q = next.size();
            this.f25778r = 0;
            this.f25779s = 0;
        }

        private int c(byte[] bArr, int i5, int i6) {
            int i7 = i6;
            while (true) {
                if (i7 <= 0) {
                    break;
                }
                a();
                if (this.f25776p != null) {
                    int min = Math.min(this.f25777q - this.f25778r, i7);
                    if (bArr != null) {
                        this.f25776p.p(bArr, this.f25778r, i5, min);
                        i5 += min;
                    }
                    this.f25778r += min;
                    i7 -= min;
                } else if (i7 == i6) {
                    return -1;
                }
            }
            return i6 - i7;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return s.this.size() - (this.f25779s + this.f25778r);
        }

        @Override // java.io.InputStream
        public void mark(int i5) {
            this.f25780t = this.f25779s + this.f25778r;
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
            c(null, 0, this.f25780t);
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
            n nVar = this.f25776p;
            if (nVar == null) {
                return -1;
            }
            int i5 = this.f25778r;
            this.f25778r = i5 + 1;
            return nVar.J(i5) & UByte.f27220r;
        }
    }
}
