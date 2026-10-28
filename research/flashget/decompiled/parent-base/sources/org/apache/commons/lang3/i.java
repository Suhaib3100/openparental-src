package org.apache.commons.lang3;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: CharRange.java */
/* loaded from: classes6.dex */
final class i implements Iterable<Character>, Serializable {

    /* renamed from: f, reason: collision with root package name */
    private static final long f86013f = 8270183163158333422L;

    /* renamed from: b, reason: collision with root package name */
    private final char f86014b;

    /* renamed from: c, reason: collision with root package name */
    private final char f86015c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f86016d;

    /* renamed from: e, reason: collision with root package name */
    private transient String f86017e;

    /* compiled from: CharRange.java */
    private static class b implements Iterator<Character> {

        /* renamed from: b, reason: collision with root package name */
        private char f86018b;

        /* renamed from: c, reason: collision with root package name */
        private final i f86019c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f86020d;

        private void b() {
            if (!this.f86019c.f86016d) {
                if (this.f86018b < this.f86019c.f86015c) {
                    this.f86018b = (char) (this.f86018b + 1);
                    return;
                } else {
                    this.f86020d = false;
                    return;
                }
            }
            char c5 = this.f86018b;
            if (c5 == 65535) {
                this.f86020d = false;
                return;
            }
            if (c5 + 1 != this.f86019c.f86014b) {
                this.f86018b = (char) (this.f86018b + 1);
            } else if (this.f86019c.f86015c == 65535) {
                this.f86020d = false;
            } else {
                this.f86018b = (char) (this.f86019c.f86015c + 1);
            }
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character next() {
            if (!this.f86020d) {
                throw new NoSuchElementException();
            }
            char c5 = this.f86018b;
            b();
            return Character.valueOf(c5);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f86020d;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b(i iVar) {
            this.f86019c = iVar;
            this.f86020d = true;
            if (!iVar.f86016d) {
                this.f86018b = iVar.f86014b;
                return;
            }
            if (iVar.f86014b != 0) {
                this.f86018b = (char) 0;
            } else if (iVar.f86015c == 65535) {
                this.f86020d = false;
            } else {
                this.f86018b = (char) (iVar.f86015c + 1);
            }
        }
    }

    private i(char c5, char c6, boolean z4) {
        if (c5 > c6) {
            c6 = c5;
            c5 = c6;
        }
        this.f86014b = c5;
        this.f86015c = c6;
        this.f86016d = z4;
    }

    public static i m(char c5) {
        return new i(c5, c5, false);
    }

    public static i p(char c5, char c6) {
        return new i(c5, c6, false);
    }

    public static i r(char c5) {
        return new i(c5, c5, true);
    }

    public static i s(char c5, char c6) {
        return new i(c5, c6, true);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f86014b == iVar.f86014b && this.f86015c == iVar.f86015c && this.f86016d == iVar.f86016d;
    }

    public boolean h(char c5) {
        return (c5 >= this.f86014b && c5 <= this.f86015c) != this.f86016d;
    }

    public int hashCode() {
        return (this.f86015c * 7) + this.f86014b + 'S' + (this.f86016d ? 1 : 0);
    }

    public boolean i(i iVar) {
        k1.b0(iVar, "The Range must not be null", new Object[0]);
        return this.f86016d ? iVar.f86016d ? this.f86014b >= iVar.f86014b && this.f86015c <= iVar.f86015c : iVar.f86015c < this.f86014b || iVar.f86014b > this.f86015c : iVar.f86016d ? this.f86014b == 0 && this.f86015c == 65535 : this.f86014b <= iVar.f86014b && this.f86015c >= iVar.f86015c;
    }

    @Override // java.lang.Iterable
    public Iterator<Character> iterator() {
        return new b();
    }

    public char j() {
        return this.f86015c;
    }

    public char l() {
        return this.f86014b;
    }

    public boolean q() {
        return this.f86016d;
    }

    public String toString() {
        if (this.f86017e == null) {
            StringBuilder sb = new StringBuilder(4);
            if (this.f86016d) {
                sb.append('^');
            }
            sb.append(this.f86014b);
            if (this.f86014b != this.f86015c) {
                sb.append('-');
                sb.append(this.f86015c);
            }
            this.f86017e = sb.toString();
        }
        return this.f86017e;
    }
}
