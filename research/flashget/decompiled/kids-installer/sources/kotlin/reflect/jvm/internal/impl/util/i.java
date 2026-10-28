package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l0;

/* compiled from: ArrayMap.kt */
/* loaded from: classes6.dex */
public final class i extends c {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    public static final i f26593o = new i();

    /* compiled from: ArrayMap.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, r3.a {
        a() {
        }

        @d5.d
        public Void a() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("墌"));
        }
    }

    private i() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public int b() {
        return 0;
    }

    @d5.e
    public Void g(int i5) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public Object get(int i5) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void f(int i5, @d5.d Void r22) {
        l0.p(r22, ProtectedSandApp.s("觀"));
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c, java.lang.Iterable
    @d5.d
    public Iterator iterator() {
        return new a();
    }
}
