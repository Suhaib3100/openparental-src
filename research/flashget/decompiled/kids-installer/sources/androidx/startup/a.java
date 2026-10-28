package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Trace;
import androidx.annotation.o0;
import androidx.startup.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: AppInitializer.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static volatile a f9642e;

    /* renamed from: c, reason: collision with root package name */
    @o0
    final Context f9646c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f9641d = "Startup";

    /* renamed from: f, reason: collision with root package name */
    private static final Object f9643f = new Object();

    /* renamed from: b, reason: collision with root package name */
    @o0
    final Set<Class<? extends b<?>>> f9645b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    @o0
    final Map<Class<?>, Object> f9644a = new HashMap();

    a(@o0 Context context) {
        this.f9646c = context.getApplicationContext();
    }

    @o0
    public static a c(@o0 Context context) {
        if (f9642e == null) {
            synchronized (f9643f) {
                if (f9642e == null) {
                    f9642e = new a(context);
                }
            }
        }
        return f9642e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void a() {
        try {
            try {
                Trace.beginSection("Startup");
                Bundle bundle = this.f9646c.getPackageManager().getProviderInfo(new ComponentName(this.f9646c.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                String string = this.f9646c.getString(c.a.f9647a);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : bundle.keySet()) {
                        if (string.equals(bundle.getString(str, null))) {
                            Class<?> cls = Class.forName(str);
                            if (b.class.isAssignableFrom(cls)) {
                                this.f9645b.add(cls);
                                b(cls, hashSet);
                            }
                        }
                    }
                }
            } finally {
                Trace.endSection();
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException e6) {
            throw new StartupException(e6);
        }
    }

    @o0
    <T> T b(@o0 Class<? extends b<?>> cls, @o0 Set<Class<?>> set) {
        T t5;
        synchronized (f9643f) {
            if (androidx.tracing.b.h()) {
                try {
                    Trace.beginSection(cls.getSimpleName());
                } finally {
                    Trace.endSection();
                }
            }
            if (set.contains(cls)) {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
            }
            if (this.f9644a.containsKey(cls)) {
                t5 = (T) this.f9644a.get(cls);
            } else {
                set.add(cls);
                try {
                    b<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class<? extends b<?>>> dependencies = newInstance.dependencies();
                    if (!dependencies.isEmpty()) {
                        for (Class<? extends b<?>> cls2 : dependencies) {
                            if (!this.f9644a.containsKey(cls2)) {
                                b(cls2, set);
                            }
                        }
                    }
                    t5 = (T) newInstance.a(this.f9646c);
                    set.remove(cls);
                    this.f9644a.put(cls, t5);
                } catch (Throwable th) {
                    throw new StartupException(th);
                }
            }
        }
        return t5;
    }

    @o0
    public <T> T d(@o0 Class<? extends b<T>> cls) {
        return (T) b(cls, new HashSet());
    }

    public boolean e(@o0 Class<? extends b<?>> cls) {
        return this.f9645b.contains(cls);
    }
}
