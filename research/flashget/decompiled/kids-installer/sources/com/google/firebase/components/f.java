package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.m1;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: ComponentDiscovery.java */
/* loaded from: classes2.dex */
public final class f<T> {

    /* renamed from: c, reason: collision with root package name */
    static final String f15362c = ProtectedSandApp.s("\u139b");

    /* renamed from: d, reason: collision with root package name */
    private static final String f15363d = ProtectedSandApp.s("\u139c");

    /* renamed from: e, reason: collision with root package name */
    private static final String f15364e = ProtectedSandApp.s("\u139d");

    /* renamed from: a, reason: collision with root package name */
    private final T f15365a;

    /* renamed from: b, reason: collision with root package name */
    private final c<T> f15366b;

    /* compiled from: ComponentDiscovery.java */
    /* loaded from: classes3.dex */
    private static class b implements c<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<? extends Service> f15367a;

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f15367a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Objects.toString(this.f15367a);
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @Override // com.google.firebase.components.f.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> a(Context context) {
            Bundle b6 = b(context);
            if (b6 == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b6.keySet()) {
                if (ProtectedSandApp.s("⟒").equals(b6.get(str)) && str.startsWith(ProtectedSandApp.s("⟓"))) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class<? extends Service> cls) {
            this.f15367a = cls;
        }
    }

    /* compiled from: ComponentDiscovery.java */
    @m1
    interface c<T> {
        List<String> a(T t5);
    }

    @m1
    f(T t5, c<T> cVar) {
        this.f15365a = t5;
        this.f15366b = cVar;
    }

    public static f<Context> d(Context context, Class<? extends Service> cls) {
        return new f<>(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @q0
    public static ComponentRegistrar e(String str) {
        String s5 = ProtectedSandApp.s("᎖");
        String s6 = ProtectedSandApp.s("᎗");
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format(ProtectedSandApp.s("᎘"), str, ProtectedSandApp.s("᎙")));
        } catch (ClassNotFoundException unused) {
            String.format(ProtectedSandApp.s("\u139a"), str);
            return null;
        } catch (IllegalAccessException e6) {
            throw new InvalidRegistrarException(String.format(s6, str), e6);
        } catch (InstantiationException e7) {
            throw new InvalidRegistrarException(String.format(s6, str), e7);
        } catch (NoSuchMethodException e8) {
            throw new InvalidRegistrarException(String.format(s5, str), e8);
        } catch (InvocationTargetException e9) {
            throw new InvalidRegistrarException(String.format(s5, str), e9);
        }
    }

    @Deprecated
    public List<ComponentRegistrar> b() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f15366b.a(this.f15365a).iterator();
        while (it.hasNext()) {
            try {
                ComponentRegistrar e6 = e(it.next());
                if (e6 != null) {
                    arrayList.add(e6);
                }
            } catch (InvalidRegistrarException unused) {
            }
        }
        return arrayList;
    }

    public List<o2.b<ComponentRegistrar>> c() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f15366b.a(this.f15365a)) {
            arrayList.add(new o2.b() { // from class: com.google.firebase.components.e
                @Override // o2.b
                public final Object get() {
                    ComponentRegistrar e6;
                    e6 = f.e(str);
                    return e6;
                }
            });
        }
        return arrayList;
    }
}
