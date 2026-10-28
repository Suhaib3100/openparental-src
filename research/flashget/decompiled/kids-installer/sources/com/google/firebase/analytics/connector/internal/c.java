package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzja;
import com.google.android.gms.internal.measurement.zzjb;
import com.google.android.gms.measurement.internal.zzhe;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final zzjb f15308a = zzjb.zzi(ProtectedSandApp.s("፠"), ProtectedSandApp.s("፡"), ProtectedSandApp.s("።"), ProtectedSandApp.s("፣"), ProtectedSandApp.s("፤"), ProtectedSandApp.s("፥"), ProtectedSandApp.s("ፗ"), ProtectedSandApp.s("ፘ"), ProtectedSandApp.s("ፙ"), ProtectedSandApp.s("ፚ"), ProtectedSandApp.s("\u135b"), ProtectedSandApp.s("\u135c"), ProtectedSandApp.s("፝"), ProtectedSandApp.s("፞"), ProtectedSandApp.s("፟"));

    /* renamed from: b, reason: collision with root package name */
    private static final zzja f15309b = zzja.zzj(ProtectedSandApp.s("፦"), ProtectedSandApp.s("፧"), ProtectedSandApp.s("፨"), ProtectedSandApp.s("፩"), ProtectedSandApp.s("፪"), ProtectedSandApp.s("፫"), ProtectedSandApp.s("፬"));

    /* renamed from: c, reason: collision with root package name */
    private static final zzja f15310c = zzja.zzi(ProtectedSandApp.s("፯"), ProtectedSandApp.s("፭"), ProtectedSandApp.s("፮"));

    /* renamed from: d, reason: collision with root package name */
    private static final zzja f15311d = zzja.zzh(ProtectedSandApp.s("፰"), ProtectedSandApp.s("፱"));

    /* renamed from: e, reason: collision with root package name */
    private static final zzja f15312e;

    /* renamed from: f, reason: collision with root package name */
    private static final zzja f15313f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f15314g = 0;

    static {
        zzix zzixVar = new zzix();
        zzixVar.zza(zzhe.zza);
        zzixVar.zza(zzhe.zzb);
        f15312e = zzixVar.zzb();
        f15313f = zzja.zzh(ProtectedSandApp.s("፲"), ProtectedSandApp.s("፳"));
    }

    public static boolean a(String str, String str2, Bundle bundle) {
        char c6;
        if (!ProtectedSandApp.s("፴").equals(str2)) {
            return true;
        }
        if (!d(str) || bundle == null) {
            return false;
        }
        zzja zzjaVar = f15311d;
        int size = zzjaVar.size();
        int i5 = 0;
        while (i5 < size) {
            boolean containsKey = bundle.containsKey((String) zzjaVar.get(i5));
            i5++;
            if (containsKey) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode == 101200) {
            if (str.equals(ProtectedSandApp.s("፷"))) {
                c6 = 0;
            }
            c6 = 65535;
        } else if (hashCode != 101230) {
            if (hashCode == 3142703 && str.equals(ProtectedSandApp.s("፵"))) {
                c6 = 2;
            }
            c6 = 65535;
        } else {
            if (str.equals(ProtectedSandApp.s("፶"))) {
                c6 = 1;
            }
            c6 = 65535;
        }
        String s5 = ProtectedSandApp.s("፸");
        if (c6 == 0) {
            bundle.putString(s5, ProtectedSandApp.s("፻"));
            return true;
        }
        if (c6 == 1) {
            bundle.putString(s5, ProtectedSandApp.s("፺"));
            return true;
        }
        if (c6 != 2) {
            return false;
        }
        bundle.putString(s5, ProtectedSandApp.s("፹"));
        return true;
    }

    public static boolean b(String str, Bundle bundle) {
        if (f15309b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        zzja zzjaVar = f15311d;
        int size = zzjaVar.size();
        int i5 = 0;
        while (i5 < size) {
            boolean containsKey = bundle.containsKey((String) zzjaVar.get(i5));
            i5++;
            if (containsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str) {
        return !f15308a.contains(str);
    }

    public static boolean d(String str) {
        return !f15310c.contains(str);
    }

    public static boolean e(String str, String str2) {
        boolean equals = ProtectedSandApp.s("፼").equals(str2);
        String s5 = ProtectedSandApp.s("\u137d");
        if (equals || ProtectedSandApp.s("\u137e").equals(str2)) {
            return str.equals(s5) || str.equals(ProtectedSandApp.s("ᎁ"));
        }
        if (ProtectedSandApp.s("\u137f").equals(str2)) {
            return str.equals(s5) || str.equals(ProtectedSandApp.s("ᎀ"));
        }
        if (f15312e.contains(str2)) {
            return false;
        }
        zzja zzjaVar = f15313f;
        int size = zzjaVar.size();
        int i5 = 0;
        while (i5 < size) {
            boolean matches = str2.matches((String) zzjaVar.get(i5));
            i5++;
            if (matches) {
                return false;
            }
        }
        return true;
    }
}
