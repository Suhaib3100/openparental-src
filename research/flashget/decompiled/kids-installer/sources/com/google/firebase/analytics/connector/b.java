package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.b1;
import androidx.annotation.e1;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zziq;
import com.google.firebase.analytics.connector.a;
import com.google.firebase.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
/* loaded from: classes3.dex */
public class b implements com.google.firebase.analytics.connector.a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile com.google.firebase.analytics.connector.a f15300c;

    /* renamed from: a, reason: collision with root package name */
    @m1
    final AppMeasurementSdk f15301a;

    /* renamed from: b, reason: collision with root package name */
    @m1
    final Map f15302b;

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
    class a implements a.InterfaceC0192a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15303a;

        a(String str) {
            this.f15303a = str;
        }

        @Override // com.google.firebase.analytics.connector.a.InterfaceC0192a
        public final void a() {
            if (b.this.m(this.f15303a)) {
                a.b zza = ((com.google.firebase.analytics.connector.internal.a) b.this.f15302b.get(this.f15303a)).zza();
                if (zza != null) {
                    zza.a(0, null);
                }
                b.this.f15302b.remove(this.f15303a);
            }
        }

        @Override // com.google.firebase.analytics.connector.a.InterfaceC0192a
        @KeepForSdk
        public void b() {
            if (b.this.m(this.f15303a) && this.f15303a.equals(ProtectedSandApp.s("➝"))) {
                ((com.google.firebase.analytics.connector.internal.a) b.this.f15302b.get(this.f15303a)).zzc();
            }
        }

        @Override // com.google.firebase.analytics.connector.a.InterfaceC0192a
        @KeepForSdk
        public void c(Set<String> set) {
            if (!b.this.m(this.f15303a) || !this.f15303a.equals(ProtectedSandApp.s("➞")) || set == null || set.isEmpty()) {
                return;
            }
            ((com.google.firebase.analytics.connector.internal.a) b.this.f15302b.get(this.f15303a)).a(set);
        }
    }

    b(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f15301a = appMeasurementSdk;
        this.f15302b = new ConcurrentHashMap();
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
    public static com.google.firebase.analytics.connector.a j(@o0 g gVar, @o0 Context context, @o0 l2.d dVar) {
        Preconditions.checkNotNull(gVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f15300c == null) {
            synchronized (b.class) {
                if (f15300c == null) {
                    Bundle bundle = new Bundle(1);
                    if (gVar.B()) {
                        dVar.b(com.google.firebase.c.class, new Executor() { // from class: com.google.firebase.analytics.connector.d
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new l2.b() { // from class: com.google.firebase.analytics.connector.e
                            @Override // l2.b
                            public final void a(l2.a aVar) {
                                b.k(aVar);
                            }
                        });
                        bundle.putBoolean(ProtectedSandApp.s("➟"), gVar.A());
                    }
                    f15300c = new b(zzef.zzg(context, null, null, null, bundle).zzd());
                }
            }
        }
        return f15300c;
    }

    static /* synthetic */ void k(l2.a aVar) {
        boolean z5 = ((com.google.firebase.c) aVar.a()).f15329a;
        synchronized (b.class) {
            ((b) Preconditions.checkNotNull(f15300c)).f15301a.zza(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m(@o0 String str) {
        return (str.isEmpty() || !this.f15302b.containsKey(str) || this.f15302b.get(str) == null) ? false : true;
    }

    @Override // com.google.firebase.analytics.connector.a
    @n1
    @o0
    @KeepForSdk
    public Map<String, Object> a(boolean z5) {
        return this.f15301a.getUserProperties(null, null, z5);
    }

    @Override // com.google.firebase.analytics.connector.a
    @KeepForSdk
    public void b(@o0 a.c cVar) {
        String str;
        int i5 = com.google.firebase.analytics.connector.internal.c.f15314g;
        if (cVar == null || (str = cVar.f15285a) == null || str.isEmpty()) {
            return;
        }
        Object obj = cVar.f15287c;
        if ((obj == null || zziq.zza(obj) != null) && com.google.firebase.analytics.connector.internal.c.d(str) && com.google.firebase.analytics.connector.internal.c.e(str, cVar.f15286b)) {
            String str2 = cVar.f15295k;
            if (str2 == null || (com.google.firebase.analytics.connector.internal.c.b(str2, cVar.f15296l) && com.google.firebase.analytics.connector.internal.c.a(str, cVar.f15295k, cVar.f15296l))) {
                String str3 = cVar.f15292h;
                if (str3 == null || (com.google.firebase.analytics.connector.internal.c.b(str3, cVar.f15293i) && com.google.firebase.analytics.connector.internal.c.a(str, cVar.f15292h, cVar.f15293i))) {
                    String str4 = cVar.f15290f;
                    if (str4 == null || (com.google.firebase.analytics.connector.internal.c.b(str4, cVar.f15291g) && com.google.firebase.analytics.connector.internal.c.a(str, cVar.f15290f, cVar.f15291g))) {
                        AppMeasurementSdk appMeasurementSdk = this.f15301a;
                        Bundle bundle = new Bundle();
                        String str5 = cVar.f15285a;
                        if (str5 != null) {
                            bundle.putString(ProtectedSandApp.s("➠"), str5);
                        }
                        String str6 = cVar.f15286b;
                        if (str6 != null) {
                            bundle.putString(ProtectedSandApp.s("➡"), str6);
                        }
                        Object obj2 = cVar.f15287c;
                        if (obj2 != null) {
                            zzgz.zzb(bundle, obj2);
                        }
                        String str7 = cVar.f15288d;
                        if (str7 != null) {
                            bundle.putString(ProtectedSandApp.s("➢"), str7);
                        }
                        bundle.putLong(ProtectedSandApp.s("➣"), cVar.f15289e);
                        String str8 = cVar.f15290f;
                        if (str8 != null) {
                            bundle.putString(ProtectedSandApp.s("➤"), str8);
                        }
                        Bundle bundle2 = cVar.f15291g;
                        if (bundle2 != null) {
                            bundle.putBundle(ProtectedSandApp.s("➥"), bundle2);
                        }
                        String str9 = cVar.f15292h;
                        if (str9 != null) {
                            bundle.putString(ProtectedSandApp.s("➦"), str9);
                        }
                        Bundle bundle3 = cVar.f15293i;
                        if (bundle3 != null) {
                            bundle.putBundle(ProtectedSandApp.s("➧"), bundle3);
                        }
                        bundle.putLong(ProtectedSandApp.s("➨"), cVar.f15294j);
                        String str10 = cVar.f15295k;
                        if (str10 != null) {
                            bundle.putString(ProtectedSandApp.s("➩"), str10);
                        }
                        Bundle bundle4 = cVar.f15296l;
                        if (bundle4 != null) {
                            bundle.putBundle(ProtectedSandApp.s("➪"), bundle4);
                        }
                        bundle.putLong(ProtectedSandApp.s("➫"), cVar.f15297m);
                        bundle.putBoolean(ProtectedSandApp.s("➬"), cVar.f15298n);
                        bundle.putLong(ProtectedSandApp.s("➭"), cVar.f15299o);
                        appMeasurementSdk.setConditionalUserProperty(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.firebase.analytics.connector.a
    @KeepForSdk
    public void c(@o0 String str, @o0 String str2, @o0 Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.c.d(str) && com.google.firebase.analytics.connector.internal.c.b(str2, bundle) && com.google.firebase.analytics.connector.internal.c.a(str, str2, bundle)) {
            if (ProtectedSandApp.s("➮").equals(str) && ProtectedSandApp.s("➯").equals(str2)) {
                bundle.putLong(ProtectedSandApp.s("➰"), 1L);
            }
            this.f15301a.logEvent(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.a
    @KeepForSdk
    public void clearConditionalUserProperty(@e1(max = 24, min = 1) @o0 String str, @o0 String str2, @o0 Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.c.b(str2, bundle)) {
            this.f15301a.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.a
    @n1
    @KeepForSdk
    public int d(@e1(min = 1) @o0 String str) {
        return this.f15301a.getMaxUserProperties(str);
    }

    @Override // com.google.firebase.analytics.connector.a
    @n1
    @o0
    @KeepForSdk
    public List<a.c> e(@o0 String str, @e1(max = 23, min = 1) @o0 String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f15301a.getConditionalUserProperties(str, str2)) {
            int i5 = com.google.firebase.analytics.connector.internal.c.f15314g;
            Preconditions.checkNotNull(bundle);
            a.c cVar = new a.c();
            cVar.f15285a = (String) Preconditions.checkNotNull((String) zzgz.zza(bundle, ProtectedSandApp.s("➱"), String.class, null));
            cVar.f15286b = (String) Preconditions.checkNotNull((String) zzgz.zza(bundle, ProtectedSandApp.s("➲"), String.class, null));
            cVar.f15287c = zzgz.zza(bundle, ProtectedSandApp.s("➳"), Object.class, null);
            cVar.f15288d = (String) zzgz.zza(bundle, ProtectedSandApp.s("➴"), String.class, null);
            cVar.f15289e = ((Long) zzgz.zza(bundle, ProtectedSandApp.s("➵"), Long.class, 0L)).longValue();
            cVar.f15290f = (String) zzgz.zza(bundle, ProtectedSandApp.s("➶"), String.class, null);
            cVar.f15291g = (Bundle) zzgz.zza(bundle, ProtectedSandApp.s("➷"), Bundle.class, null);
            cVar.f15292h = (String) zzgz.zza(bundle, ProtectedSandApp.s("➸"), String.class, null);
            cVar.f15293i = (Bundle) zzgz.zza(bundle, ProtectedSandApp.s("➹"), Bundle.class, null);
            cVar.f15294j = ((Long) zzgz.zza(bundle, ProtectedSandApp.s("➺"), Long.class, 0L)).longValue();
            cVar.f15295k = (String) zzgz.zza(bundle, ProtectedSandApp.s("➻"), String.class, null);
            cVar.f15296l = (Bundle) zzgz.zza(bundle, ProtectedSandApp.s("➼"), Bundle.class, null);
            cVar.f15298n = ((Boolean) zzgz.zza(bundle, ProtectedSandApp.s("➽"), Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f15297m = ((Long) zzgz.zza(bundle, ProtectedSandApp.s("➾"), Long.class, 0L)).longValue();
            cVar.f15299o = ((Long) zzgz.zza(bundle, ProtectedSandApp.s("➿"), Long.class, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @Override // com.google.firebase.analytics.connector.a
    @KeepForSdk
    public void f(@o0 String str, @o0 String str2, @o0 Object obj) {
        if (com.google.firebase.analytics.connector.internal.c.d(str) && com.google.firebase.analytics.connector.internal.c.e(str, str2)) {
            this.f15301a.setUserProperty(str, str2, obj);
        }
    }

    @Override // com.google.firebase.analytics.connector.a
    @n1
    @o0
    @KeepForSdk
    public a.InterfaceC0192a g(@o0 String str, @o0 a.b bVar) {
        Preconditions.checkNotNull(bVar);
        if (!com.google.firebase.analytics.connector.internal.c.d(str) || m(str)) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk = this.f15301a;
        com.google.firebase.analytics.connector.internal.a eVar = ProtectedSandApp.s("⟀").equals(str) ? new com.google.firebase.analytics.connector.internal.e(appMeasurementSdk, bVar) : ProtectedSandApp.s("⟁").equals(str) ? new com.google.firebase.analytics.connector.internal.g(appMeasurementSdk, bVar) : null;
        if (eVar == null) {
            return null;
        }
        this.f15302b.put(str, eVar);
        return new a(str);
    }
}
