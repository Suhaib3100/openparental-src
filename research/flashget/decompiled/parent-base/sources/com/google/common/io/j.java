package com.google.common.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.q0;
import com.google.common.collect.f3;
import com.google.common.io.f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CharSource.java */
@p
@d9.c
/* loaded from: classes6.dex */
public abstract class j {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CharSource.java */
    final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        final Charset f57132a;

        a(Charset charset) {
            charset.getClass();
            this.f57132a = charset;
        }

        @Override // com.google.common.io.f
        public j a(Charset charset) {
            return charset.equals(this.f57132a) ? j.this : new f.a(charset);
        }

        @Override // com.google.common.io.f
        public InputStream m() throws IOException {
            return new e0(j.this.m(), this.f57132a, 8192);
        }

        public String toString() {
            String obj = j.this.toString();
            String valueOf = String.valueOf(this.f57132a);
            return com.google.common.base.e.a(valueOf.length() + com.google.android.gms.common.internal.b.a(obj, 15), obj, ProtectedSandApp.s("\uf6a9"), valueOf, ProtectedSandApp.s("\uf6aa"));
        }
    }

    /* compiled from: CharSource.java */
    private static class b extends j {

        /* renamed from: b, reason: collision with root package name */
        private static final q0 f57134b = q0.m(ProtectedSandApp.s("\uf6ab"));

        /* renamed from: a, reason: collision with root package name */
        protected final CharSequence f57135a;

        /* compiled from: CharSource.java */
        class a extends com.google.common.collect.c<String> {

            /* renamed from: d, reason: collision with root package name */
            Iterator<String> f57136d;

            a() {
                this.f57136d = b.f57134b.n(b.this.f57135a).iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @zc.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public String a() {
                if (this.f57136d.hasNext()) {
                    String next = this.f57136d.next();
                    if (this.f57136d.hasNext() || !next.isEmpty()) {
                        return next;
                    }
                }
                return b();
            }
        }

        protected b(CharSequence charSequence) {
            charSequence.getClass();
            this.f57135a = charSequence;
        }

        private Iterator<String> t() {
            return new a();
        }

        @Override // com.google.common.io.j
        public boolean i() {
            return this.f57135a.length() == 0;
        }

        @Override // com.google.common.io.j
        public long j() {
            return this.f57135a.length();
        }

        @Override // com.google.common.io.j
        public com.google.common.base.g0<Long> k() {
            return com.google.common.base.g0.f(Long.valueOf(this.f57135a.length()));
        }

        @Override // com.google.common.io.j
        public Reader m() {
            return new h(this.f57135a);
        }

        @Override // com.google.common.io.j
        public String n() {
            return this.f57135a.toString();
        }

        @Override // com.google.common.io.j
        @zc.a
        public String o() {
            a aVar = new a();
            if (aVar.hasNext()) {
                return aVar.next();
            }
            return null;
        }

        @Override // com.google.common.io.j
        public f3<String> p() {
            return f3.A(new a());
        }

        @Override // com.google.common.io.j
        @c0
        public <T> T q(w<T> wVar) throws IOException {
            a aVar = new a();
            while (aVar.hasNext() && wVar.b(aVar.next())) {
            }
            return wVar.a();
        }

        public String toString() {
            String k4 = com.google.common.base.c.k(this.f57135a, 30, ProtectedSandApp.s("\uf6ac"));
            return com.google.common.base.h.a(com.google.android.gms.common.internal.b.a(k4, 17), ProtectedSandApp.s("\uf6ad"), k4, ProtectedSandApp.s("\uf6ae"));
        }
    }

    /* compiled from: CharSource.java */
    private static final class c extends j {

        /* renamed from: a, reason: collision with root package name */
        private final Iterable<? extends j> f57138a;

        c(Iterable<? extends j> iterable) {
            iterable.getClass();
            this.f57138a = iterable;
        }

        @Override // com.google.common.io.j
        public boolean i() throws IOException {
            Iterator<? extends j> it = this.f57138a.iterator();
            while (it.hasNext()) {
                if (!it.next().i()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.j
        public long j() throws IOException {
            Iterator<? extends j> it = this.f57138a.iterator();
            long j4 = 0;
            while (it.hasNext()) {
                j4 += it.next().j();
            }
            return j4;
        }

        @Override // com.google.common.io.j
        public com.google.common.base.g0<Long> k() {
            Iterator<? extends j> it = this.f57138a.iterator();
            long j4 = 0;
            while (it.hasNext()) {
                com.google.common.base.g0<Long> k4 = it.next().k();
                if (!k4.e()) {
                    return com.google.common.base.g0.a();
                }
                j4 += k4.d().longValue();
            }
            return com.google.common.base.g0.f(Long.valueOf(j4));
        }

        @Override // com.google.common.io.j
        public Reader m() throws IOException {
            return new b0(this.f57138a.iterator());
        }

        public String toString() {
            String valueOf = String.valueOf(this.f57138a);
            return com.google.common.base.h.a(valueOf.length() + 19, ProtectedSandApp.s("\uf6af"), valueOf, ProtectedSandApp.s("\uf6b0"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CharSource.java */
    static final class d extends e {

        /* renamed from: c, reason: collision with root package name */
        private static final d f57139c = new d();

        private d() {
            super((CharSequence) "");
        }

        @Override // com.google.common.io.j.b
        public String toString() {
            return ProtectedSandApp.s("\uf6b1");
        }
    }

    /* compiled from: CharSource.java */
    private static class e extends b {
        protected e(String str) {
            super(str);
        }

        @Override // com.google.common.io.j
        public long e(i iVar) throws IOException {
            iVar.getClass();
            try {
                ((Writer) m.a().b(iVar.b())).write((String) this.f57135a);
                return this.f57135a.length();
            } finally {
            }
        }

        @Override // com.google.common.io.j
        public long f(Appendable appendable) throws IOException {
            appendable.append(this.f57135a);
            return this.f57135a.length();
        }

        @Override // com.google.common.io.j.b, com.google.common.io.j
        public Reader m() {
            return new StringReader((String) this.f57135a);
        }
    }

    protected j() {
    }

    public static j b(Iterable<? extends j> iterable) {
        return new c(iterable);
    }

    public static j c(Iterator<? extends j> it) {
        return new c(f3.A(it));
    }

    public static j d(j... jVarArr) {
        return new c(f3.D(jVarArr));
    }

    private long g(Reader reader) throws IOException {
        long j4 = 0;
        while (true) {
            long skip = reader.skip(Long.MAX_VALUE);
            if (skip == 0) {
                return j4;
            }
            j4 += skip;
        }
    }

    public static j h() {
        return d.f57139c;
    }

    public static j r(CharSequence charSequence) {
        return charSequence instanceof String ? new e(charSequence) : new b(charSequence);
    }

    @d9.a
    public f a(Charset charset) {
        return new a(charset);
    }

    @f9.a
    public long e(i iVar) throws IOException {
        iVar.getClass();
        m a5 = m.a();
        try {
            return k.b((Reader) a5.b(m()), (Writer) a5.b(iVar.b()));
        } finally {
        }
    }

    @f9.a
    public long f(Appendable appendable) throws IOException {
        appendable.getClass();
        try {
            return k.b((Reader) m.a().b(m()), appendable);
        } finally {
        }
    }

    public boolean i() throws IOException {
        com.google.common.base.g0<Long> k4 = k();
        if (k4.e()) {
            return k4.d().longValue() == 0;
        }
        m a5 = m.a();
        try {
            return ((Reader) a5.b(m())).read() == -1;
        } catch (Throwable th) {
            try {
                throw a5.c(th);
            } finally {
                a5.close();
            }
        }
    }

    @d9.a
    public long j() throws IOException {
        com.google.common.base.g0<Long> k4 = k();
        if (k4.e()) {
            return k4.d().longValue();
        }
        try {
            return g((Reader) m.a().b(m()));
        } finally {
        }
    }

    @d9.a
    public com.google.common.base.g0<Long> k() {
        return com.google.common.base.g0.a();
    }

    public BufferedReader l() throws IOException {
        Reader m4 = m();
        return m4 instanceof BufferedReader ? (BufferedReader) m4 : new BufferedReader(m4);
    }

    public abstract Reader m() throws IOException;

    public String n() throws IOException {
        try {
            return k.k((Reader) m.a().b(m()));
        } finally {
        }
    }

    @zc.a
    public String o() throws IOException {
        try {
            return ((BufferedReader) m.a().b(l())).readLine();
        } finally {
        }
    }

    public f3<String> p() throws IOException {
        try {
            BufferedReader bufferedReader = (BufferedReader) m.a().b(l());
            ArrayList arrayList = new ArrayList();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return f3.x(arrayList);
                }
                arrayList.add(readLine);
            }
        } finally {
        }
    }

    @f9.a
    @d9.a
    @c0
    public <T> T q(w<T> wVar) throws IOException {
        wVar.getClass();
        try {
            return (T) k.h((Reader) m.a().b(m()), wVar);
        } finally {
        }
    }
}
