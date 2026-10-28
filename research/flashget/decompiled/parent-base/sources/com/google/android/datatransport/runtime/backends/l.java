package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MetadataBackendRegistry.java */
@cd.f
/* loaded from: classes5.dex */
class l implements e {

    /* renamed from: d, reason: collision with root package name */
    private static final String f51977d = ProtectedSandApp.s("언");

    /* renamed from: e, reason: collision with root package name */
    private static final String f51978e = ProtectedSandApp.s("얹");

    /* renamed from: a, reason: collision with root package name */
    private final a f51979a;

    /* renamed from: b, reason: collision with root package name */
    private final j f51980b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, n> f51981c;

    /* compiled from: MetadataBackendRegistry.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f51982a;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, String> f51983b = null;

        a(Context context) {
            this.f51982a = context;
        }

        private Map<String, String> a(Context context) {
            Bundle d5 = d(context);
            if (d5 == null) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d5.keySet()) {
                Object obj = d5.get(str);
                if ((obj instanceof String) && str.startsWith(ProtectedSandApp.s("얳"))) {
                    for (String str2 : ((String) obj).split(ProtectedSandApp.s("어"), -1)) {
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
            if (this.f51983b == null) {
                this.f51983b = a(this.f51982a);
            }
            return this.f51983b;
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
            String s4 = ProtectedSandApp.s("억");
            String s5 = ProtectedSandApp.s("얶");
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str2).asSubclass(d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException unused) {
                String.format(ProtectedSandApp.s("얷"), str2);
                return null;
            } catch (IllegalAccessException unused2) {
                String.format(s4, str2);
                return null;
            } catch (InstantiationException unused3) {
                String.format(s4, str2);
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

    @cd.a
    l(Context context, j jVar) {
        this(new a(context), jVar);
    }

    @Override // com.google.android.datatransport.runtime.backends.e
    @q0
    public synchronized n get(String str) {
        if (this.f51981c.containsKey(str)) {
            return this.f51981c.get(str);
        }
        d b5 = this.f51979a.b(str);
        if (b5 == null) {
            return null;
        }
        n create = b5.create(this.f51980b.a(str));
        this.f51981c.put(str, create);
        return create;
    }

    l(a aVar, j jVar) {
        this.f51981c = new HashMap();
        this.f51979a = aVar;
        this.f51980b = jVar;
    }
}
