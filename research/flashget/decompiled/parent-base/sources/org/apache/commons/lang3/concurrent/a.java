package org.apache.commons.lang3.concurrent;

import androidx.compose.animation.core.k1;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AbstractCircuitBreaker.java */
/* loaded from: classes6.dex */
public abstract class a<T> implements g<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final String f85874c = "open";

    /* renamed from: a, reason: collision with root package name */
    protected final AtomicReference<b> f85875a = new AtomicReference<>(b.CLOSED);

    /* renamed from: b, reason: collision with root package name */
    private final PropertyChangeSupport f85876b = new PropertyChangeSupport(this);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AbstractCircuitBreaker.java */
    protected static abstract class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b CLOSED;
        public static final b OPEN;

        /* compiled from: AbstractCircuitBreaker.java */
        /* renamed from: org.apache.commons.lang3.concurrent.a$b$a, reason: collision with other inner class name */
        enum C1335a extends b {
            C1335a(String str, int i4) {
                super(str, i4);
            }

            @Override // org.apache.commons.lang3.concurrent.a.b
            public b oppositeState() {
                return b.OPEN;
            }
        }

        /* compiled from: AbstractCircuitBreaker.java */
        /* renamed from: org.apache.commons.lang3.concurrent.a$b$b, reason: collision with other inner class name */
        enum C1336b extends b {
            C1336b(String str, int i4) {
                super(str, i4);
            }

            @Override // org.apache.commons.lang3.concurrent.a.b
            public b oppositeState() {
                return b.CLOSED;
            }
        }

        static {
            C1335a c1335a = new C1335a("CLOSED", 0);
            CLOSED = c1335a;
            C1336b c1336b = new C1336b("OPEN", 1);
            OPEN = c1336b;
            $VALUES = new b[]{c1335a, c1336b};
        }

        private b(String str, int i4) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public abstract b oppositeState();
    }

    protected static boolean e(b bVar) {
        return bVar == b.OPEN;
    }

    @Override // org.apache.commons.lang3.concurrent.g
    public abstract boolean a();

    @Override // org.apache.commons.lang3.concurrent.g
    public abstract boolean b(T t4);

    public void c(PropertyChangeListener propertyChangeListener) {
        this.f85876b.addPropertyChangeListener(propertyChangeListener);
    }

    @Override // org.apache.commons.lang3.concurrent.g
    public void close() {
        d(b.CLOSED);
    }

    protected void d(b bVar) {
        if (k1.a(this.f85875a, bVar.oppositeState(), bVar)) {
            this.f85876b.firePropertyChange("open", !e(bVar), e(bVar));
        }
    }

    public void f(PropertyChangeListener propertyChangeListener) {
        this.f85876b.removePropertyChangeListener(propertyChangeListener);
    }

    @Override // org.apache.commons.lang3.concurrent.g
    public boolean isClosed() {
        return !isOpen();
    }

    @Override // org.apache.commons.lang3.concurrent.g
    public boolean isOpen() {
        return e(this.f85875a.get());
    }

    @Override // org.apache.commons.lang3.concurrent.g
    public void open() {
        d(b.OPEN);
    }
}
