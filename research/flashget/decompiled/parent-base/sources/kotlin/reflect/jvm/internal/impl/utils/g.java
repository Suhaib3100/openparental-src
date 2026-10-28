package kotlin.reflect.jvm.internal.impl.utils;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kd.n;
import kotlin.collections.l1;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.jvm.internal.w;

/* compiled from: SmartSet.kt */
@r1({"SMAP\nSmartSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartSet.kt\norg/jetbrains/kotlin/utils/SmartSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
/* loaded from: classes7.dex */
public final class g<T> extends AbstractSet<T> {

    /* renamed from: d, reason: collision with root package name */
    @l
    public static final b f78687d = new b();

    /* renamed from: b, reason: collision with root package name */
    @m
    private Object f78688b;

    /* renamed from: c, reason: collision with root package name */
    private int f78689c;

    /* compiled from: SmartSet.kt */
    private static final class a<T> implements Iterator<T>, md.d {

        /* renamed from: b, reason: collision with root package name */
        @l
        private final Iterator<T> f78690b;

        public a(@l T[] tArr) {
            l0.p(tArr, ProtectedSandApp.s("腝\u0001"));
            this.f78690b = i.a(tArr);
        }

        @Override // java.util.Iterator
        @l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f78690b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f78690b.next();
        }
    }

    /* compiled from: SmartSet.kt */
    @r1({"SMAP\nSmartSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartSet.kt\norg/jetbrains/kotlin/utils/SmartSet$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
    public static final class b {
        private b() {
        }

        @l
        @n
        public final <T> g<T> a() {
            return new g<>(null);
        }

        @l
        @n
        public final <T> g<T> b(@l Collection<? extends T> collection) {
            l0.p(collection, ProtectedSandApp.s("腞\u0001"));
            g<T> gVar = new g<>(null);
            gVar.addAll(collection);
            return gVar;
        }

        public b(w wVar) {
        }
    }

    /* compiled from: SmartSet.kt */
    private static final class c<T> implements Iterator<T>, md.d {

        /* renamed from: b, reason: collision with root package name */
        private final T f78691b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f78692c = true;

        public c(T t4) {
            this.f78691b = t4;
        }

        @Override // java.util.Iterator
        @l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f78692c;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f78692c) {
                throw new NoSuchElementException();
            }
            this.f78692c = false;
            return this.f78691b;
        }
    }

    private g() {
    }

    @l
    @n
    public static final <T> g<T> b() {
        return f78687d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t4) {
        Object[] objArr;
        int i4 = this.f78689c;
        if (i4 == 0) {
            this.f78688b = t4;
        } else if (i4 == 1) {
            if (l0.g(this.f78688b, t4)) {
                return false;
            }
            this.f78688b = new Object[]{this.f78688b, t4};
        } else if (i4 < 5) {
            Object obj = this.f78688b;
            l0.n(obj, ProtectedSandApp.s("腟\u0001"));
            Object[] objArr2 = (Object[]) obj;
            if (kotlin.collections.l.s8(objArr2, t4)) {
                return false;
            }
            int i5 = this.f78689c;
            if (i5 == 4) {
                ?? o4 = l1.o(Arrays.copyOf(objArr2, objArr2.length));
                o4.add(t4);
                objArr = o4;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, i5 + 1);
                l0.o(copyOf, ProtectedSandApp.s("腠\u0001"));
                copyOf[copyOf.length - 1] = t4;
                objArr = copyOf;
            }
            this.f78688b = objArr;
        } else {
            Object obj2 = this.f78688b;
            l0.n(obj2, ProtectedSandApp.s("腡\u0001"));
            if (!u1.o(obj2).add(t4)) {
                return false;
            }
        }
        this.f78689c++;
        return true;
    }

    public int c() {
        return this.f78689c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f78688b = null;
        this.f78689c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i4 = this.f78689c;
        if (i4 == 0) {
            return false;
        }
        if (i4 == 1) {
            return l0.g(this.f78688b, obj);
        }
        if (i4 < 5) {
            Object obj2 = this.f78688b;
            l0.n(obj2, ProtectedSandApp.s("腟\u0001"));
            return kotlin.collections.l.s8((Object[]) obj2, obj);
        }
        Object obj3 = this.f78688b;
        l0.n(obj3, ProtectedSandApp.s("腢\u0001"));
        return ((Set) obj3).contains(obj);
    }

    public void f(int i4) {
        this.f78689c = i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @l
    public Iterator<T> iterator() {
        int i4 = this.f78689c;
        if (i4 == 0) {
            return Collections.emptySet().iterator();
        }
        if (i4 == 1) {
            return new c(this.f78688b);
        }
        if (i4 < 5) {
            Object obj = this.f78688b;
            l0.n(obj, ProtectedSandApp.s("腟\u0001"));
            return new a((Object[]) obj);
        }
        Object obj2 = this.f78688b;
        l0.n(obj2, ProtectedSandApp.s("腡\u0001"));
        return u1.o(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f78689c;
    }

    public g(w wVar) {
    }
}
