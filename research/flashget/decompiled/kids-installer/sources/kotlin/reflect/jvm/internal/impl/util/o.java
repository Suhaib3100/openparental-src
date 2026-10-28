package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l0;

/* compiled from: ArrayMap.kt */
/* loaded from: classes6.dex */
public final class o<T> extends c<T> {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final T f26602o;

    /* renamed from: p, reason: collision with root package name */
    private final int f26603p;

    /* compiled from: ArrayMap.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator<T>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        private boolean f26604o = true;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ o<T> f26605p;

        a(o<T> oVar) {
            this.f26605p = oVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26604o;
        }

        @Override // java.util.Iterator
        @d5.d
        public T next() {
            if (!this.f26604o) {
                throw new NoSuchElementException();
            }
            this.f26604o = false;
            return this.f26605p.h();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("墚"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@d5.d T t5, int i5) {
        super(null);
        l0.p(t5, ProtectedSandApp.s("觅"));
        this.f26602o = t5;
        this.f26603p = i5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public int b() {
        return 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public void f(int i5, @d5.d T t5) {
        l0.p(t5, ProtectedSandApp.s("视"));
        throw new IllegalStateException();
    }

    public final int g() {
        return this.f26603p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    @d5.e
    public T get(int i5) {
        if (i5 == this.f26603p) {
            return this.f26602o;
        }
        return null;
    }

    @d5.d
    public final T h() {
        return this.f26602o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c, java.lang.Iterable
    @d5.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
