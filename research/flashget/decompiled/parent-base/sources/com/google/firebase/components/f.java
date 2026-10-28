package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.m1;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: ComponentDiscovery.java */
/* loaded from: classes6.dex */
public final class f<T> {

    /* renamed from: c, reason: collision with root package name */
    static final String f58439c = ProtectedSandApp.s("ﭼ");

    /* renamed from: d, reason: collision with root package name */
    private static final String f58440d = ProtectedSandApp.s("ﭺ");

    /* renamed from: e, reason: collision with root package name */
    private static final String f58441e = ProtectedSandApp.s("ﭽ");

    /* renamed from: a, reason: collision with root package name */
    private final T f58442a;

    /* renamed from: b, reason: collision with root package name */
    private final c<T> f58443b;

    /* compiled from: ComponentDiscovery.java */
    private static class b implements c<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<? extends Service> f58444a;

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f58444a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Objects.toString(this.f58444a);
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @Override // com.google.firebase.components.f.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> a(Context context) {
            Bundle b5 = b(context);
            if (b5 == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b5.keySet()) {
                if (ProtectedSandApp.s("ﭵ").equals(b5.get(str)) && str.startsWith(ProtectedSandApp.s("ﭶ"))) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class<? extends Service> cls) {
            this.f58444a = cls;
        }
    }

    /* compiled from: ComponentDiscovery.java */
    @m1
    interface c<T> {
        List<String> a(T t4);
    }

    @m1
    f(T t4, c<T> cVar) {
        this.f58442a = t4;
        this.f58443b = cVar;
    }

    public static f<Context> d(Context context, Class<? extends Service> cls) {
        return new f<>(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @q0
    public static ComponentRegistrar e(String str) {
        String s4 = ProtectedSandApp.s("ﭷ");
        String s5 = ProtectedSandApp.s("ﭸ");
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new InvalidRegistrarException(String.format(ProtectedSandApp.s("ﭹ"), str, ProtectedSandApp.s("ﭺ")));
        } catch (ClassNotFoundException unused) {
            String.format(ProtectedSandApp.s("ﭻ"), str);
            return null;
        } catch (IllegalAccessException e4) {
            throw new InvalidRegistrarException(String.format(s4, str), e4);
        } catch (InstantiationException e5) {
            throw new InvalidRegistrarException(String.format(s4, str), e5);
        } catch (NoSuchMethodException e6) {
            throw new InvalidRegistrarException(String.format(s5, str), e6);
        } catch (InvocationTargetException e7) {
            throw new InvalidRegistrarException(String.format(s5, str), e7);
        }
    }

    @Deprecated
    public List<ComponentRegistrar> b() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f58443b.a(this.f58442a).iterator();
        while (it.hasNext()) {
            try {
                ComponentRegistrar e4 = e(it.next());
                if (e4 != null) {
                    arrayList.add(e4);
                }
            } catch (InvalidRegistrarException unused) {
            }
        }
        return arrayList;
    }

    public List<y9.b<ComponentRegistrar>> c() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f58443b.a(this.f58442a)) {
            arrayList.add(new y9.b() { // from class: com.google.firebase.components.e
                @Override // y9.b
                public final Object get() {
                    ComponentRegistrar e4;
                    e4 = f.e(str);
                    return e4;
                }
            });
        }
        return arrayList;
    }
}
