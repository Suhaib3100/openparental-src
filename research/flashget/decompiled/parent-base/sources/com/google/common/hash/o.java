package com.google.common.hash;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* compiled from: Funnels.java */
@d9.a
@k
/* loaded from: classes6.dex */
public final class o {

    /* compiled from: Funnels.java */
    private enum a implements n<byte[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return ProtectedSandApp.s("\uf61a");
        }

        @Override // com.google.common.hash.n
        public void funnel(byte[] bArr, g0 g0Var) {
            g0Var.a(bArr);
        }
    }

    /* compiled from: Funnels.java */
    private enum b implements n<Integer> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return ProtectedSandApp.s("\uf61c");
        }

        @Override // com.google.common.hash.n
        public void funnel(Integer num, g0 g0Var) {
            g0Var.g(num.intValue());
        }
    }

    /* compiled from: Funnels.java */
    private enum c implements n<Long> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return ProtectedSandApp.s("\uf61e");
        }

        @Override // com.google.common.hash.n
        public void funnel(Long l4, g0 g0Var) {
            g0Var.h(l4.longValue());
        }
    }

    /* compiled from: Funnels.java */
    private static class d<E> implements n<Iterable<? extends E>>, Serializable {

        /* renamed from: b, reason: collision with root package name */
        private final n<E> f57021b;

        d(n<E> nVar) {
            nVar.getClass();
            this.f57021b = nVar;
        }

        @Override // com.google.common.hash.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void funnel(Iterable<? extends E> iterable, g0 g0Var) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                this.f57021b.funnel(it.next(), g0Var);
            }
        }

        public boolean equals(@zc.a Object obj) {
            if (obj instanceof d) {
                return this.f57021b.equals(((d) obj).f57021b);
            }
            return false;
        }

        public int hashCode() {
            return d.class.hashCode() ^ this.f57021b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f57021b);
            return com.google.common.base.h.a(valueOf.length() + 26, ProtectedSandApp.s("\uf61f"), valueOf, ProtectedSandApp.s("\uf620"));
        }
    }

    /* compiled from: Funnels.java */
    private static class e extends OutputStream {

        /* renamed from: b, reason: collision with root package name */
        final g0 f57022b;

        e(g0 g0Var) {
            g0Var.getClass();
            this.f57022b = g0Var;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f57022b);
            return com.google.common.base.h.a(valueOf.length() + 24, ProtectedSandApp.s("\uf621"), valueOf, ProtectedSandApp.s("\uf622"));
        }

        @Override // java.io.OutputStream
        public void write(int i4) {
            this.f57022b.d((byte) i4);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.f57022b.a(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i4, int i5) {
            this.f57022b.k(bArr, i4, i5);
        }
    }

    /* compiled from: Funnels.java */
    private static class f implements n<CharSequence>, Serializable {

        /* renamed from: b, reason: collision with root package name */
        private final Charset f57023b;

        /* compiled from: Funnels.java */
        private static class a implements Serializable {

            /* renamed from: c, reason: collision with root package name */
            private static final long f57024c = 0;

            /* renamed from: b, reason: collision with root package name */
            private final String f57025b;

            a(Charset charset) {
                this.f57025b = charset.name();
            }

            private Object a() {
                return new f(Charset.forName(this.f57025b));
            }
        }

        f(Charset charset) {
            charset.getClass();
            this.f57023b = charset;
        }

        @Override // com.google.common.hash.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void funnel(CharSequence charSequence, g0 g0Var) {
            g0Var.m(charSequence, this.f57023b);
        }

        Object b() {
            return new a(this.f57023b);
        }

        public boolean equals(@zc.a Object obj) {
            if (obj instanceof f) {
                return this.f57023b.equals(((f) obj).f57023b);
            }
            return false;
        }

        public int hashCode() {
            return f.class.hashCode() ^ this.f57023b.hashCode();
        }

        public String toString() {
            String name = this.f57023b.name();
            return com.google.common.base.h.a(com.google.android.gms.common.internal.b.a(name, 22), ProtectedSandApp.s("\uf623"), name, ProtectedSandApp.s("\uf624"));
        }
    }

    /* compiled from: Funnels.java */
    private enum g implements n<CharSequence> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return ProtectedSandApp.s("\uf626");
        }

        @Override // com.google.common.hash.n
        public void funnel(CharSequence charSequence, g0 g0Var) {
            g0Var.j(charSequence);
        }
    }

    private o() {
    }

    public static OutputStream a(g0 g0Var) {
        return new e(g0Var);
    }

    public static n<byte[]> b() {
        return a.INSTANCE;
    }

    public static n<Integer> c() {
        return b.INSTANCE;
    }

    public static n<Long> d() {
        return c.INSTANCE;
    }

    public static <E> n<Iterable<? extends E>> e(n<E> nVar) {
        return new d(nVar);
    }

    public static n<CharSequence> f(Charset charset) {
        return new f(charset);
    }

    public static n<CharSequence> g() {
        return g.INSTANCE;
    }
}
