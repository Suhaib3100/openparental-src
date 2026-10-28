package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: ArrayMap.kt */
/* loaded from: classes6.dex */
public final class d<T> extends c<T> {

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    public static final a f26575q = new a(null);

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private Object[] f26576o;

    /* renamed from: p, reason: collision with root package name */
    private int f26577p;

    /* compiled from: ArrayMap.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* compiled from: ArrayMap.kt */
    public static final class b extends AbstractIterator<T> {

        /* renamed from: q, reason: collision with root package name */
        private int f26578q = -1;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ d<T> f26579r;

        b(d<T> dVar) {
            this.f26579r = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.AbstractIterator
        protected void a() {
            do {
                int i5 = this.f26578q + 1;
                this.f26578q = i5;
                if (i5 >= ((d) this.f26579r).f26576o.length) {
                    break;
                }
            } while (((d) this.f26579r).f26576o[this.f26578q] == null);
            if (this.f26578q >= ((d) this.f26579r).f26576o.length) {
                d();
                return;
            }
            Object obj = ((d) this.f26579r).f26576o[this.f26578q];
            l0.n(obj, ProtectedSandApp.s("覺"));
            f(obj);
        }
    }

    private d(Object[] objArr, int i5) {
        super(null);
        this.f26576o = objArr;
        this.f26577p = i5;
    }

    private final void h(int i5) {
        Object[] objArr = this.f26576o;
        if (objArr.length <= i5) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            l0.o(copyOf, ProtectedSandApp.s("覻"));
            this.f26576o = copyOf;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public int b() {
        return this.f26577p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public void f(int i5, @d5.d T t5) {
        l0.p(t5, ProtectedSandApp.s("覼"));
        h(i5);
        Object[] objArr = this.f26576o;
        if (objArr[i5] == null) {
            this.f26577p++;
        }
        objArr[i5] = t5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    @d5.e
    public T get(int i5) {
        Object Pe;
        Pe = kotlin.collections.t.Pe(this.f26576o, i5);
        return (T) Pe;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c, java.lang.Iterable
    @d5.d
    public Iterator<T> iterator() {
        return new b(this);
    }

    public d() {
        this(new Object[20], 0);
    }
}
