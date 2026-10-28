package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: Joiner.java */
@o
@d9.b
/* loaded from: classes6.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f54881a;

    /* compiled from: Joiner.java */
    class a extends c0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f54882b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c0 c0Var, String str) {
            super(c0Var, null);
            this.f54882b = str;
        }

        @Override // com.google.common.base.c0
        public c0 q() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf2be"));
        }

        @Override // com.google.common.base.c0
        CharSequence r(@zc.a Object obj) {
            return obj == null ? this.f54882b : c0.this.r(obj);
        }

        @Override // com.google.common.base.c0
        public c0 s(String str) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf2be"));
        }
    }

    /* compiled from: Joiner.java */
    class b extends c0 {
        b(c0 c0Var) {
            super(c0Var, null);
        }

        @Override // com.google.common.base.c0
        public <A extends Appendable> A d(A a5, Iterator<? extends Object> it) throws IOException {
            l0.F(a5, ProtectedSandApp.s("\uf2bf"));
            l0.F(it, ProtectedSandApp.s("\uf2c0"));
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null) {
                    a5.append(c0.this.r(next));
                    break;
                }
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 != null) {
                    a5.append(c0.this.f54881a);
                    a5.append(c0.this.r(next2));
                }
            }
            return a5;
        }

        @Override // com.google.common.base.c0
        public c0 s(String str) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf2c1"));
        }

        @Override // com.google.common.base.c0
        public d u(String str) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf2c2"));
        }
    }

    /* compiled from: Joiner.java */
    class c extends AbstractList<Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f54885b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f54886c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f54887d;

        c(Object[] objArr, Object obj, Object obj2) {
            this.f54885b = objArr;
            this.f54886c = obj;
            this.f54887d = obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        @zc.a
        public Object get(int i4) {
            return i4 != 0 ? i4 != 1 ? this.f54885b[i4 - 2] : this.f54887d : this.f54886c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f54885b.length + 2;
        }
    }

    /* compiled from: Joiner.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final c0 f54888a;

        /* renamed from: b, reason: collision with root package name */
        private final String f54889b;

        /* synthetic */ d(c0 c0Var, String str, a aVar) {
            this(c0Var, str);
        }

        @d9.a
        @f9.a
        public <A extends Appendable> A a(A a5, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) b(a5, iterable.iterator());
        }

        @d9.a
        @f9.a
        public <A extends Appendable> A b(A a5, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
            a5.getClass();
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                a5.append(this.f54888a.r(next.getKey()));
                a5.append(this.f54889b);
                a5.append(this.f54888a.r(next.getValue()));
                while (it.hasNext()) {
                    a5.append(this.f54888a.f54881a);
                    Map.Entry<?, ?> next2 = it.next();
                    a5.append(this.f54888a.r(next2.getKey()));
                    a5.append(this.f54889b);
                    a5.append(this.f54888a.r(next2.getValue()));
                }
            }
            return a5;
        }

        @f9.a
        public <A extends Appendable> A c(A a5, Map<?, ?> map) throws IOException {
            return (A) a(a5, map.entrySet());
        }

        @d9.a
        @f9.a
        public StringBuilder d(StringBuilder sb, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return e(sb, iterable.iterator());
        }

        @d9.a
        @f9.a
        public StringBuilder e(StringBuilder sb, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                b(sb, it);
                return sb;
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }

        @f9.a
        public StringBuilder f(StringBuilder sb, Map<?, ?> map) {
            return d(sb, map.entrySet());
        }

        @d9.a
        public String g(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return h(iterable.iterator());
        }

        @d9.a
        public String h(Iterator<? extends Map.Entry<?, ?>> it) {
            return e(new StringBuilder(), it).toString();
        }

        public String i(Map<?, ?> map) {
            return g(map.entrySet());
        }

        public d j(String str) {
            return new d(this.f54888a.s(str), this.f54889b);
        }

        private d(c0 c0Var, String str) {
            this.f54888a = c0Var;
            str.getClass();
            this.f54889b = str;
        }
    }

    /* synthetic */ c0(c0 c0Var, a aVar) {
        this(c0Var);
    }

    private static Iterable<Object> j(@zc.a Object obj, @zc.a Object obj2, Object[] objArr) {
        objArr.getClass();
        return new c(objArr, obj, obj2);
    }

    public static c0 o(char c5) {
        return new c0(String.valueOf(c5));
    }

    public static c0 p(String str) {
        return new c0(str);
    }

    @f9.a
    public <A extends Appendable> A b(A a5, Iterable<? extends Object> iterable) throws IOException {
        return (A) d(a5, iterable.iterator());
    }

    @f9.a
    public final <A extends Appendable> A c(A a5, @zc.a Object obj, @zc.a Object obj2, Object... objArr) throws IOException {
        return (A) b(a5, j(obj, obj2, objArr));
    }

    @f9.a
    public <A extends Appendable> A d(A a5, Iterator<? extends Object> it) throws IOException {
        a5.getClass();
        if (it.hasNext()) {
            a5.append(r(it.next()));
            while (it.hasNext()) {
                a5.append(this.f54881a);
                a5.append(r(it.next()));
            }
        }
        return a5;
    }

    @f9.a
    public final <A extends Appendable> A e(A a5, Object[] objArr) throws IOException {
        return (A) b(a5, Arrays.asList(objArr));
    }

    @f9.a
    public final StringBuilder f(StringBuilder sb, Iterable<? extends Object> iterable) {
        return h(sb, iterable.iterator());
    }

    @f9.a
    public final StringBuilder g(StringBuilder sb, @zc.a Object obj, @zc.a Object obj2, Object... objArr) {
        return f(sb, j(obj, obj2, objArr));
    }

    @f9.a
    public final StringBuilder h(StringBuilder sb, Iterator<? extends Object> it) {
        try {
            d(sb, it);
            return sb;
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    @f9.a
    public final StringBuilder i(StringBuilder sb, Object[] objArr) {
        return f(sb, Arrays.asList(objArr));
    }

    public final String k(Iterable<? extends Object> iterable) {
        return m(iterable.iterator());
    }

    public final String l(@zc.a Object obj, @zc.a Object obj2, Object... objArr) {
        return k(j(obj, obj2, objArr));
    }

    public final String m(Iterator<? extends Object> it) {
        return h(new StringBuilder(), it).toString();
    }

    public final String n(Object[] objArr) {
        return k(Arrays.asList(objArr));
    }

    public c0 q() {
        return new b(this);
    }

    CharSequence r(@zc.a Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public c0 s(String str) {
        str.getClass();
        return new a(this, str);
    }

    public d t(char c5) {
        return u(String.valueOf(c5));
    }

    public d u(String str) {
        return new d(this, str, null);
    }

    private c0(String str) {
        str.getClass();
        this.f54881a = str;
    }

    private c0(c0 c0Var) {
        this.f54881a = c0Var.f54881a;
    }
}
