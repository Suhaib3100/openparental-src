package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MetadataBackendRegistry.java */
@h3.f
/* loaded from: classes3.dex */
class l implements e {

    /* renamed from: d, reason: collision with root package name */
    private static final String f12437d = ProtectedSandApp.s("\u2028");

    /* renamed from: e, reason: collision with root package name */
    private static final String f12438e = ProtectedSandApp.s("\u2029");

    /* renamed from: a, reason: collision with root package name */
    private final a f12439a;

    /* renamed from: b, reason: collision with root package name */
    private final j f12440b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, n> f12441c;

    /* compiled from: MetadataBackendRegistry.java */
    /* loaded from: classes2.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f12442a;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, String> f12443b = null;

        a(Context context) {
            this.f12442a = context;
        }

        private Map<String, String> a(Context context) {
            Bundle d6 = d(context);
            if (d6 == null) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d6.keySet()) {
                Object obj = d6.get(str);
                if ((obj instanceof String) && str.startsWith(ProtectedSandApp.s("ढ"))) {
                    for (String str2 : ((String) obj).split(ProtectedSandApp.s("ण"), -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private Map<String, String> c() {
            if (this.f12443b == null) {
                this.f12443b = a(this.f12442a);
            }
            return this.f12443b;
        }

        private static Bundle d(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @q0
        d b(String str) {
            String s5 = ProtectedSandApp.s("त");
            String s6 = ProtectedSandApp.s("थ");
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str2).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                String.format(ProtectedSandApp.s("द"), str2);
                return null;
            } catch (IllegalAccessException unused2) {
                String.format(s6, str2);
                return null;
            } catch (InstantiationException unused3) {
                String.format(s6, str2);
                return null;
            } catch (NoSuchMethodException unused4) {
                String.format(s5, str2);
                return null;
            } catch (InvocationTargetException unused5) {
                String.format(s5, str2);
                return null;
            }
        }
    }

    @h3.a
    l(Context context, j jVar) {
        this(new a(context), jVar);
    }

    @Override // com.google.android.datatransport.runtime.backends.e
    @q0
    public synchronized n c(String str) {
        if (this.f12441c.containsKey(str)) {
            return this.f12441c.get(str);
        }
        d b6 = this.f12439a.b(str);
        if (b6 == null) {
            return null;
        }
        n create = b6.create(this.f12440b.a(str));
        this.f12441c.put(str, create);
        return create;
    }

    l(a aVar, j jVar) {
        this.f12441c = new HashMap();
        this.f12439a = aVar;
        this.f12440b = jVar;
    }
}
