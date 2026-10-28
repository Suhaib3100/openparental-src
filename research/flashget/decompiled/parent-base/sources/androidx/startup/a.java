package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Trace;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.startup.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: AppInitializer.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static volatile a f34112e;

    /* renamed from: c, reason: collision with root package name */
    @o0
    final Context f34116c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f34111d = "Startup";

    /* renamed from: f, reason: collision with root package name */
    private static final Object f34113f = new Object();

    /* renamed from: b, reason: collision with root package name */
    @o0
    final Set<Class<? extends b<?>>> f34115b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    @o0
    final Map<Class<?>, Object> f34114a = new HashMap();

    a(@o0 Context context) {
        this.f34116c = context.getApplicationContext();
    }

    @o0
    private <T> T d(@o0 Class<? extends b<?>> cls, @o0 Set<Class<?>> set) {
        T t4;
        if (androidx.tracing.b.i()) {
            try {
                androidx.tracing.b.c(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f34114a.containsKey(cls)) {
            t4 = (T) this.f34114a.get(cls);
        } else {
            set.add(cls);
            try {
                b<?> newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends b<?>>> dependencies = newInstance.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class<? extends b<?>> cls2 : dependencies) {
                        if (!this.f34114a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t4 = (T) newInstance.create(this.f34116c);
                set.remove(cls);
                this.f34114a.put(cls, t4);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        Trace.endSection();
        return t4;
    }

    @o0
    public static a e(@o0 Context context) {
        if (f34112e == null) {
            synchronized (f34113f) {
                try {
                    if (f34112e == null) {
                        f34112e = new a(context);
                    }
                } finally {
                }
            }
        }
        return f34112e;
    }

    static void h(@o0 a aVar) {
        synchronized (f34113f) {
            f34112e = aVar;
        }
    }

    void a() {
        try {
            try {
                androidx.tracing.b.c("Startup");
                b(this.f34116c.getPackageManager().getProviderInfo(new ComponentName(this.f34116c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e4) {
                throw new StartupException(e4);
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b(@q0 Bundle bundle) {
        String string = this.f34116c.getString(c.a.f34117a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f34115b.add(cls);
                        }
                    }
                }
                Iterator<Class<? extends b<?>>> it = this.f34115b.iterator();
                while (it.hasNext()) {
                    d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e4) {
                throw new StartupException(e4);
            }
        }
    }

    @o0
    <T> T c(@o0 Class<? extends b<?>> cls) {
        T t4;
        synchronized (f34113f) {
            try {
                t4 = (T) this.f34114a.get(cls);
                if (t4 == null) {
                    t4 = (T) d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t4;
    }

    @o0
    public <T> T f(@o0 Class<? extends b<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(@o0 Class<? extends b<?>> cls) {
        return this.f34115b.contains(cls);
    }
}
