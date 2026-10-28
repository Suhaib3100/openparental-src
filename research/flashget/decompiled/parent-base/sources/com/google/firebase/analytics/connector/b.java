package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.b1;
import androidx.annotation.e1;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdy;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.a;
import com.google.firebase.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
/* loaded from: classes6.dex */
public class b implements com.google.firebase.analytics.connector.a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile com.google.firebase.analytics.connector.a f58379c;

    /* renamed from: a, reason: collision with root package name */
    @m1
    private final AppMeasurementSdk f58380a;

    /* renamed from: b, reason: collision with root package name */
    @m1
    final Map<String, com.google.firebase.analytics.connector.internal.a> f58381b;

    /* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
    class a implements a.InterfaceC0895a {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ String f58382a;

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ b f58383b;

        a(b bVar, String str) {
            this.f58382a = str;
            this.f58383b = bVar;
        }

        @Override // com.google.firebase.analytics.connector.a.InterfaceC0895a
        public void a() {
            if (this.f58383b.m(this.f58382a)) {
                a.b zza = this.f58383b.f58381b.get(this.f58382a).zza();
                if (zza != null) {
                    zza.a(0, null);
                }
                this.f58383b.f58381b.remove(this.f58382a);
            }
        }

        @Override // com.google.firebase.analytics.connector.a.InterfaceC0895a
        @KeepForSdk
        public void b() {
            if (this.f58383b.m(this.f58382a) && this.f58382a.equals(ProtectedSandApp.s("ﬕ"))) {
                this.f58383b.f58381b.get(this.f58382a).zzb();
            }
        }

        @Override // com.google.firebase.analytics.connector.a.InterfaceC0895a
        @KeepForSdk
        public void c(Set<String> set) {
            if (!this.f58383b.m(this.f58382a) || !this.f58382a.equals(ProtectedSandApp.s("ﬕ")) || set == null || set.isEmpty()) {
                return;
            }
            this.f58383b.f58381b.get(this.f58382a).a(set);
        }
    }

    private b(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f58380a = appMeasurementSdk;
        this.f58381b = new ConcurrentHashMap();
    }

    @o0
    @KeepForSdk
    public static com.google.firebase.analytics.connector.a h() {
        return i(g.p());
    }

    @o0
    @KeepForSdk
    public static com.google.firebase.analytics.connector.a i(@o0 g gVar) {
        return (com.google.firebase.analytics.connector.a) gVar.l(com.google.firebase.analytics.connector.a.class);
    }

    @o0
    @KeepForSdk
    @b1(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static com.google.firebase.analytics.connector.a j(@o0 g gVar, @o0 Context context, @o0 v9.d dVar) {
        Preconditions.checkNotNull(gVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f58379c == null) {
            synchronized (b.class) {
                try {
                    if (f58379c == null) {
                        Bundle bundle = new Bundle(1);
                        if (gVar.B()) {
                            dVar.d(com.google.firebase.c.class, new d(), new e());
                            bundle.putBoolean(ProtectedSandApp.s("ﬖ"), gVar.A());
                        }
                        f58379c = new b(zzdy.zza(context, (String) null, (String) null, (String) null, bundle).zzb());
                    }
                } finally {
                }
            }
        }
        return f58379c;
    }

    static /* synthetic */ void k(v9.a aVar) {
        boolean z4 = ((com.google.firebase.c) aVar.a()).f58406a;
        synchronized (b.class) {
            ((b) Preconditions.checkNotNull(f58379c)).f58380a.zza(z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m(@o0 String str) {
        return (str.isEmpty() || !this.f58381b.containsKey(str) || this.f58381b.get(str) == null) ? false : true;
    }

    @Override // com.google.firebase.analytics.connector.a
    @KeepForSdk
    public void a(@o0 a.c cVar) {
        if (com.google.firebase.analytics.connector.internal.b.h(cVar)) {
            this.f58380a.setConditionalUserProperty(com.google.firebase.analytics.connector.internal.b.a(cVar));
        }
    }

    @Override // com.google.firebase.analytics.connector.a
    @KeepForSdk
    public void b(@o0 String str, @o0 String str2, @o0 Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.m(str) && com.google.firebase.analytics.connector.internal.b.e(str2, bundle) && com.google.firebase.analytics.connector.internal.b.i(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.b.d(str, str2, bundle);
            this.f58380a.logEvent(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.a
    @KeepForSdk
    public void c(@o0 String str, @o0 String str2, @o0 Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.m(str) && com.google.firebase.analytics.connector.internal.b.f(str, str2)) {
            this.f58380a.setUserProperty(str, str2, obj);
        }
    }

    @Override // com.google.firebase.analytics.connector.a
    @KeepForSdk
    public void clearConditionalUserProperty(@e1(max = 24, min = 1) @o0 String str, @o0 String str2, @o0 Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.b.e(str2, bundle)) {
            this.f58380a.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.a
    @n1
    @o0
    @KeepForSdk
    public Map<String, Object> d(boolean z4) {
        return this.f58380a.getUserProperties(null, null, z4);
    }

    @Override // com.google.firebase.analytics.connector.a
    @n1
    @KeepForSdk
    public int e(@e1(min = 1) @o0 String str) {
        return this.f58380a.getMaxUserProperties(str);
    }

    @Override // com.google.firebase.analytics.connector.a
    @n1
    @o0
    @KeepForSdk
    public List<a.c> f(@o0 String str, @e1(max = 23, min = 1) @o0 String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator<Bundle> it = this.f58380a.getConditionalUserProperties(str, str2).iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.firebase.analytics.connector.internal.b.b(it.next()));
        }
        return arrayList;
    }

    @Override // com.google.firebase.analytics.connector.a
    @n1
    @o0
    @KeepForSdk
    public a.InterfaceC0895a g(@o0 String str, @o0 a.b bVar) {
        Preconditions.checkNotNull(bVar);
        if (!com.google.firebase.analytics.connector.internal.b.m(str) || m(str)) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk = this.f58380a;
        com.google.firebase.analytics.connector.internal.a eVar = ProtectedSandApp.s("ﬗ").equals(str) ? new com.google.firebase.analytics.connector.internal.e(appMeasurementSdk, bVar) : ProtectedSandApp.s("\ufb18").equals(str) ? new com.google.firebase.analytics.connector.internal.g(appMeasurementSdk, bVar) : null;
        if (eVar == null) {
            return null;
        }
        this.f58381b.put(str, eVar);
        return new a(this, str);
    }
}
