package com.google.common.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import com.google.common.collect.f3;
import com.google.common.io.j;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: ByteSource.java */
@p
@d9.c
/* loaded from: classes6.dex */
public abstract class f {

    /* compiled from: ByteSource.java */
    class a extends j {

        /* renamed from: a, reason: collision with root package name */
        final Charset f57107a;

        a(Charset charset) {
            charset.getClass();
            this.f57107a = charset;
        }

        @Override // com.google.common.io.j
        public f a(Charset charset) {
            return charset.equals(this.f57107a) ? f.this : new j.a(charset);
        }

        @Override // com.google.common.io.j
        public Reader m() throws IOException {
            return new InputStreamReader(f.this.m(), this.f57107a);
        }

        @Override // com.google.common.io.j
        public String n() throws IOException {
            return new String(f.this.o(), this.f57107a);
        }

        public String toString() {
            String obj = f.this.toString();
            String valueOf = String.valueOf(this.f57107a);
            return com.google.common.base.e.a(valueOf.length() + com.google.android.gms.common.internal.b.a(obj, 15), obj, ProtectedSandApp.s("\uf686"), valueOf, ProtectedSandApp.s("\uf687"));
        }
    }

    /* compiled from: ByteSource.java */
    private static class b extends f {

        /* renamed from: a, reason: collision with root package name */
        final byte[] f57109a;

        /* renamed from: b, reason: collision with root package name */
        final int f57110b;

        /* renamed from: c, reason: collision with root package name */
        final int f57111c;

        b(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // com.google.common.io.f
        public long g(OutputStream outputStream) throws IOException {
            outputStream.write(this.f57109a, this.f57110b, this.f57111c);
            return this.f57111c;
        }

        @Override // com.google.common.io.f
        public com.google.common.hash.p j(com.google.common.hash.q qVar) throws IOException {
            return qVar.k(this.f57109a, this.f57110b, this.f57111c);
        }

        @Override // com.google.common.io.f
        public boolean k() {
            return this.f57111c == 0;
        }

        @Override // com.google.common.io.f
        public InputStream l() throws IOException {
            return m();
        }

        @Override // com.google.common.io.f
        public InputStream m() {
            return new ByteArrayInputStream(this.f57109a, this.f57110b, this.f57111c);
        }

        @Override // com.google.common.io.f
        @c0
        public <T> T n(com.google.common.io.d<T> dVar) throws IOException {
            dVar.b(this.f57109a, this.f57110b, this.f57111c);
            return dVar.a();
        }

        @Override // com.google.common.io.f
        public byte[] o() {
            byte[] bArr = this.f57109a;
            int i4 = this.f57110b;
            return Arrays.copyOfRange(bArr, i4, this.f57111c + i4);
        }

        @Override // com.google.common.io.f
        public long p() {
            return this.f57111c;
        }

        @Override // com.google.common.io.f
        public com.google.common.base.g0<Long> q() {
            return com.google.common.base.g0.f(Long.valueOf(this.f57111c));
        }

        @Override // com.google.common.io.f
        public f r(long j4, long j5) {
            l0.p(j4 >= 0, ProtectedSandApp.s("\uf688"), j4);
            l0.p(j5 >= 0, ProtectedSandApp.s("\uf689"), j5);
            long min = Math.min(j4, this.f57111c);
            return new b(this.f57109a, this.f57110b + ((int) min), (int) Math.min(j5, this.f57111c - min));
        }

        public String toString() {
            String k4 = com.google.common.base.c.k(BaseEncoding.a().m(this.f57109a, this.f57110b, this.f57111c), 30, ProtectedSandApp.s("\uf68a"));
            return com.google.common.base.h.a(com.google.android.gms.common.internal.b.a(k4, 17), ProtectedSandApp.s("\uf68b"), k4, ProtectedSandApp.s("\uf68c"));
        }

        b(byte[] bArr, int i4, int i5) {
            this.f57109a = bArr;
            this.f57110b = i4;
            this.f57111c = i5;
        }
    }

    /* compiled from: ByteSource.java */
    private static final class c extends f {

        /* renamed from: a, reason: collision with root package name */
        final Iterable<? extends f> f57112a;

        c(Iterable<? extends f> iterable) {
            iterable.getClass();
            this.f57112a = iterable;
        }

        @Override // com.google.common.io.f
        public boolean k() throws IOException {
            Iterator<? extends f> it = this.f57112a.iterator();
            while (it.hasNext()) {
                if (!it.next().k()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.f
        public InputStream m() throws IOException {
            return new a0(this.f57112a.iterator());
        }

        @Override // com.google.common.io.f
        public long p() throws IOException {
            Iterator<? extends f> it = this.f57112a.iterator();
            long j4 = 0;
            while (it.hasNext()) {
                j4 += it.next().p();
                if (j4 < 0) {
                    return Long.MAX_VALUE;
                }
            }
            return j4;
        }

        @Override // com.google.common.io.f
        public com.google.common.base.g0<Long> q() {
            Iterable<? extends f> iterable = this.f57112a;
            if (!(iterable instanceof Collection)) {
                return com.google.common.base.g0.a();
            }
            Iterator<? extends f> it = iterable.iterator();
            long j4 = 0;
            while (it.hasNext()) {
                com.google.common.base.g0<Long> q4 = it.next().q();
                if (!q4.e()) {
                    return com.google.common.base.g0.a();
                }
                j4 += q4.d().longValue();
                if (j4 < 0) {
                    return com.google.common.base.g0.f(Long.MAX_VALUE);
                }
            }
            return com.google.common.base.g0.f(Long.valueOf(j4));
        }

        public String toString() {
            String valueOf = String.valueOf(this.f57112a);
            return com.google.common.base.h.a(valueOf.length() + 19, ProtectedSandApp.s("\uf68d"), valueOf, ProtectedSandApp.s("\uf68e"));
        }
    }

    /* compiled from: ByteSource.java */
    private static final class d extends b {

        /* renamed from: d, reason: collision with root package name */
        static final d f57113d = new d();

        d() {
            super(new byte[0]);
        }

        @Override // com.google.common.io.f
        public j a(Charset charset) {
            charset.getClass();
            return j.d.f57139c;
        }

        @Override // com.google.common.io.f.b, com.google.common.io.f
        public byte[] o() {
            return this.f57109a;
        }

        @Override // com.google.common.io.f.b
        public String toString() {
            return ProtectedSandApp.s("\uf68f");
        }
    }

    /* compiled from: ByteSource.java */
    private final class e extends f {

        /* renamed from: a, reason: collision with root package name */
        final long f57114a;

        /* renamed from: b, reason: collision with root package name */
        final long f57115b;

        e(long j4, long j5) {
            l0.p(j4 >= 0, ProtectedSandApp.s("\uf690"), j4);
            l0.p(j5 >= 0, ProtectedSandApp.s("\uf691"), j5);
            this.f57114a = j4;
            this.f57115b = j5;
        }

        private InputStream t(InputStream inputStream) throws IOException {
            long j4 = this.f57114a;
            if (j4 > 0) {
                try {
                    if (g.t(inputStream, j4) < this.f57114a) {
                        inputStream.close();
                        return new ByteArrayInputStream(new byte[0]);
                    }
                } finally {
                }
            }
            return g.f(inputStream, this.f57115b);
        }

        @Override // com.google.common.io.f
        public boolean k() throws IOException {
            return this.f57115b == 0 || super.k();
        }

        @Override // com.google.common.io.f
        public InputStream l() throws IOException {
            return t(f.this.l());
        }

        @Override // com.google.common.io.f
        public InputStream m() throws IOException {
            return t(f.this.m());
        }

        @Override // com.google.common.io.f
        public com.google.common.base.g0<Long> q() {
            com.google.common.base.g0<Long> q4 = f.this.q();
            if (!q4.e()) {
                return com.google.common.base.g0.a();
            }
            long longValue = q4.d().longValue();
            return com.google.common.base.g0.f(Long.valueOf(Math.min(this.f57115b, longValue - Math.min(this.f57114a, longValue))));
        }

        @Override // com.google.common.io.f
        public f r(long j4, long j5) {
            l0.p(j4 >= 0, ProtectedSandApp.s("\uf690"), j4);
            l0.p(j5 >= 0, ProtectedSandApp.s("\uf691"), j5);
            long j6 = this.f57115b - j4;
            return j6 <= 0 ? d.f57113d : f.this.r(this.f57114a + j4, Math.min(j5, j6));
        }

        public String toString() {
            String obj = f.this.toString();
            long j4 = this.f57114a;
            long j5 = this.f57115b;
            StringBuilder sb = new StringBuilder(com.google.android.gms.common.internal.b.a(obj, 50));
            sb.append(obj);
            sb.append(ProtectedSandApp.s("\uf692"));
            sb.append(j4);
            sb.append(ProtectedSandApp.s("\uf693"));
            sb.append(j5);
            sb.append(ProtectedSandApp.s("\uf694"));
            return sb.toString();
        }
    }

    protected f() {
    }

    public static f b(Iterable<? extends f> iterable) {
        return new c(iterable);
    }

    public static f c(Iterator<? extends f> it) {
        return new c(f3.A(it));
    }

    public static f d(f... fVarArr) {
        return new c(f3.D(fVarArr));
    }

    private long h(InputStream inputStream) throws IOException {
        long j4 = 0;
        while (true) {
            long t4 = g.t(inputStream, 2147483647L);
            if (t4 <= 0) {
                return j4;
            }
            j4 += t4;
        }
    }

    public static f i() {
        return d.f57113d;
    }

    public static f s(byte[] bArr) {
        return new b(bArr);
    }

    public j a(Charset charset) {
        return new a(charset);
    }

    public boolean e(f fVar) throws IOException {
        int n4;
        fVar.getClass();
        byte[] d5 = g.d();
        byte[] bArr = new byte[8192];
        m a5 = m.a();
        try {
            InputStream inputStream = (InputStream) a5.b(m());
            InputStream inputStream2 = (InputStream) a5.b(fVar.m());
            do {
                n4 = g.n(inputStream, d5, 0, d5.length);
                if (n4 == g.n(inputStream2, bArr, 0, 8192) && Arrays.equals(d5, bArr)) {
                }
                return false;
            } while (n4 == d5.length);
            a5.close();
            return true;
        } finally {
        }
    }

    @f9.a
    public long f(com.google.common.io.e eVar) throws IOException {
        eVar.getClass();
        m a5 = m.a();
        try {
            return g.b((InputStream) a5.b(m()), (OutputStream) a5.b(eVar.c()));
        } finally {
        }
    }

    @f9.a
    public long g(OutputStream outputStream) throws IOException {
        outputStream.getClass();
        try {
            return g.b((InputStream) m.a().b(m()), outputStream);
        } finally {
        }
    }

    public com.google.common.hash.p j(com.google.common.hash.q qVar) throws IOException {
        com.google.common.hash.r f4 = qVar.f();
        g(com.google.common.hash.o.a(f4));
        return f4.o();
    }

    public boolean k() throws IOException {
        com.google.common.base.g0<Long> q4 = q();
        if (q4.e()) {
            return q4.d().longValue() == 0;
        }
        m a5 = m.a();
        try {
            return ((InputStream) a5.b(m())).read() == -1;
        } catch (Throwable th) {
            try {
                throw a5.c(th);
            } finally {
                a5.close();
            }
        }
    }

    public InputStream l() throws IOException {
        InputStream m4 = m();
        return m4 instanceof BufferedInputStream ? (BufferedInputStream) m4 : new BufferedInputStream(m4);
    }

    public abstract InputStream m() throws IOException;

    @d9.a
    @f9.a
    public <T> T n(com.google.common.io.d<T> dVar) throws IOException {
        dVar.getClass();
        try {
            return (T) g.o((InputStream) m.a().b(m()), dVar);
        } finally {
        }
    }

    public byte[] o() throws IOException {
        m a5 = m.a();
        try {
            InputStream inputStream = (InputStream) a5.b(m());
            com.google.common.base.g0<Long> q4 = q();
            return q4.e() ? g.v(inputStream, q4.d().longValue()) : g.u(inputStream);
        } catch (Throwable th) {
            try {
                throw a5.c(th);
            } finally {
                a5.close();
            }
        }
    }

    public long p() throws IOException {
        com.google.common.base.g0<Long> q4 = q();
        if (q4.e()) {
            return q4.d().longValue();
        }
        m a5 = m.a();
        try {
            return h((InputStream) a5.b(m()));
        } catch (IOException unused) {
            a5.close();
            try {
                return g.e((InputStream) m.a().b(m()));
            } finally {
            }
        } finally {
        }
    }

    @d9.a
    public com.google.common.base.g0<Long> q() {
        return com.google.common.base.g0.a();
    }

    public f r(long j4, long j5) {
        return new e(j4, j5);
    }
}
