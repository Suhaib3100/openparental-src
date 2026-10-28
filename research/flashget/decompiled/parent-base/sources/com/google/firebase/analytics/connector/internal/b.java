package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.common.collect.f3;
import com.google.common.collect.q3;
import com.google.firebase.analytics.connector.a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final q3<String> f58384a = q3.R(ProtectedSandApp.s("ﬤ"), ProtectedSandApp.s("ﬥ"), ProtectedSandApp.s("ﬦ"), ProtectedSandApp.s("ﬧ"), ProtectedSandApp.s("ﬨ"), ProtectedSandApp.s("﬩"), ProtectedSandApp.s("יִ"), ProtectedSandApp.s("ﬞ"), ProtectedSandApp.s("ײַ"), ProtectedSandApp.s("ﬠ"), ProtectedSandApp.s("ﬡ"), ProtectedSandApp.s("ﬢ"), ProtectedSandApp.s("ﬣ"), ProtectedSandApp.s("\ufb1b"), ProtectedSandApp.s("\ufb1c"));

    /* renamed from: b, reason: collision with root package name */
    private static final f3<String> f58385b = f3.R(ProtectedSandApp.s("שּׁ"), ProtectedSandApp.s("שּׂ"), ProtectedSandApp.s("אַ"), ProtectedSandApp.s("אָ"), ProtectedSandApp.s("אּ"), ProtectedSandApp.s("שׁ"), ProtectedSandApp.s("שׂ"));

    /* renamed from: c, reason: collision with root package name */
    private static final f3<String> f58386c = f3.L(ProtectedSandApp.s("דּ"), ProtectedSandApp.s("בּ"), ProtectedSandApp.s("גּ"));

    /* renamed from: d, reason: collision with root package name */
    private static final f3<String> f58387d = f3.K(ProtectedSandApp.s("הּ"), ProtectedSandApp.s("וּ"));

    /* renamed from: e, reason: collision with root package name */
    private static final f3<String> f58388e = new f3.a().k(zzjj.zza).k(zzjj.zzb).e();

    /* renamed from: f, reason: collision with root package name */
    private static final f3<String> f58389f = f3.K(ProtectedSandApp.s("זּ"), ProtectedSandApp.s("\ufb37"));

    public static Bundle a(a.c cVar) {
        Bundle bundle = new Bundle();
        String str = cVar.f58364a;
        if (str != null) {
            bundle.putString(ProtectedSandApp.s("טּ"), str);
        }
        String str2 = cVar.f58365b;
        if (str2 != null) {
            bundle.putString(ProtectedSandApp.s("יּ"), str2);
        }
        Object obj = cVar.f58366c;
        if (obj != null) {
            zzjf.zza(bundle, obj);
        }
        String str3 = cVar.f58367d;
        if (str3 != null) {
            bundle.putString(ProtectedSandApp.s("ךּ"), str3);
        }
        bundle.putLong(ProtectedSandApp.s("כּ"), cVar.f58368e);
        String str4 = cVar.f58369f;
        if (str4 != null) {
            bundle.putString(ProtectedSandApp.s("לּ"), str4);
        }
        Bundle bundle2 = cVar.f58370g;
        if (bundle2 != null) {
            bundle.putBundle(ProtectedSandApp.s("\ufb3d"), bundle2);
        }
        String str5 = cVar.f58371h;
        if (str5 != null) {
            bundle.putString(ProtectedSandApp.s("מּ"), str5);
        }
        Bundle bundle3 = cVar.f58372i;
        if (bundle3 != null) {
            bundle.putBundle(ProtectedSandApp.s("\ufb3f"), bundle3);
        }
        bundle.putLong(ProtectedSandApp.s("נּ"), cVar.f58373j);
        String str6 = cVar.f58374k;
        if (str6 != null) {
            bundle.putString(ProtectedSandApp.s("סּ"), str6);
        }
        Bundle bundle4 = cVar.f58375l;
        if (bundle4 != null) {
            bundle.putBundle(ProtectedSandApp.s("\ufb42"), bundle4);
        }
        bundle.putLong(ProtectedSandApp.s("ףּ"), cVar.f58376m);
        bundle.putBoolean(ProtectedSandApp.s("פּ"), cVar.f58377n);
        bundle.putLong(ProtectedSandApp.s("\ufb45"), cVar.f58378o);
        return bundle;
    }

    public static a.c b(Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        a.c cVar = new a.c();
        cVar.f58364a = (String) Preconditions.checkNotNull((String) zzjf.zza(bundle, ProtectedSandApp.s("טּ"), String.class, null));
        cVar.f58365b = (String) Preconditions.checkNotNull((String) zzjf.zza(bundle, ProtectedSandApp.s("יּ"), String.class, null));
        cVar.f58366c = zzjf.zza(bundle, ProtectedSandApp.s("צּ"), Object.class, null);
        cVar.f58367d = (String) zzjf.zza(bundle, ProtectedSandApp.s("ךּ"), String.class, null);
        cVar.f58368e = ((Long) zzjf.zza(bundle, ProtectedSandApp.s("כּ"), Long.class, 0L)).longValue();
        cVar.f58369f = (String) zzjf.zza(bundle, ProtectedSandApp.s("לּ"), String.class, null);
        cVar.f58370g = (Bundle) zzjf.zza(bundle, ProtectedSandApp.s("\ufb3d"), Bundle.class, null);
        cVar.f58371h = (String) zzjf.zza(bundle, ProtectedSandApp.s("מּ"), String.class, null);
        cVar.f58372i = (Bundle) zzjf.zza(bundle, ProtectedSandApp.s("\ufb3f"), Bundle.class, null);
        cVar.f58373j = ((Long) zzjf.zza(bundle, ProtectedSandApp.s("נּ"), Long.class, 0L)).longValue();
        cVar.f58374k = (String) zzjf.zza(bundle, ProtectedSandApp.s("סּ"), String.class, null);
        cVar.f58375l = (Bundle) zzjf.zza(bundle, ProtectedSandApp.s("\ufb42"), Bundle.class, null);
        cVar.f58377n = ((Boolean) zzjf.zza(bundle, ProtectedSandApp.s("פּ"), Boolean.class, Boolean.FALSE)).booleanValue();
        cVar.f58376m = ((Long) zzjf.zza(bundle, ProtectedSandApp.s("ףּ"), Long.class, 0L)).longValue();
        cVar.f58378o = ((Long) zzjf.zza(bundle, ProtectedSandApp.s("\ufb45"), Long.class, 0L)).longValue();
        return cVar;
    }

    public static String c(String str) {
        String zza = zzji.zza(str);
        return zza != null ? zza : str;
    }

    public static void d(String str, String str2, Bundle bundle) {
        if (ProtectedSandApp.s("קּ").equals(str) && ProtectedSandApp.s("רּ").equals(str2)) {
            bundle.putLong(ProtectedSandApp.s("הּ"), 1L);
        }
    }

    public static boolean e(String str, Bundle bundle) {
        if (f58385b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        f3<String> f3Var = f58387d;
        int size = f3Var.size();
        int i4 = 0;
        while (i4 < size) {
            String str2 = f3Var.get(i4);
            i4++;
            if (bundle.containsKey(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(String str, String str2) {
        boolean equals = ProtectedSandApp.s("שּ").equals(str2);
        String s4 = ProtectedSandApp.s("תּ");
        if (equals || ProtectedSandApp.s("וֹ").equals(str2)) {
            return str.equals(s4) || str.equals(ProtectedSandApp.s("פֿ"));
        }
        if (ProtectedSandApp.s("בֿ").equals(str2)) {
            return str.equals(s4) || str.equals(ProtectedSandApp.s("כֿ"));
        }
        if (f58388e.contains(str2)) {
            return false;
        }
        f3<String> f3Var = f58389f;
        int size = f3Var.size();
        int i4 = 0;
        while (i4 < size) {
            String str3 = f3Var.get(i4);
            i4++;
            if (str2.matches(str3)) {
                return false;
            }
        }
        return true;
    }

    public static String g(String str) {
        String zzb = zzji.zzb(str);
        return zzb != null ? zzb : str;
    }

    public static boolean h(a.c cVar) {
        String str;
        if (cVar == null || (str = cVar.f58364a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.f58366c;
        if ((obj != null && zzlh.zza(obj) == null) || !m(str) || !f(str, cVar.f58365b)) {
            return false;
        }
        String str2 = cVar.f58374k;
        if (str2 != null && (!e(str2, cVar.f58375l) || !i(str, cVar.f58374k, cVar.f58375l))) {
            return false;
        }
        String str3 = cVar.f58371h;
        if (str3 != null && (!e(str3, cVar.f58372i) || !i(str, cVar.f58371h, cVar.f58372i))) {
            return false;
        }
        String str4 = cVar.f58369f;
        if (str4 != null) {
            return e(str4, cVar.f58370g) && i(str, cVar.f58369f, cVar.f58370g);
        }
        return true;
    }

    public static boolean i(String str, String str2, Bundle bundle) {
        if (!ProtectedSandApp.s("ﭏ").equals(str2)) {
            return true;
        }
        if (!m(str) || bundle == null) {
            return false;
        }
        f3<String> f3Var = f58387d;
        int size = f3Var.size();
        int i4 = 0;
        while (i4 < size) {
            String str3 = f3Var.get(i4);
            i4++;
            if (bundle.containsKey(str3)) {
                return false;
            }
        }
        str.getClass();
        String s4 = ProtectedSandApp.s("ﭐ");
        char c5 = 65535;
        switch (str.hashCode()) {
            case 101200:
                if (str.equals(ProtectedSandApp.s("תּ"))) {
                    c5 = 0;
                    break;
                }
                break;
            case 101230:
                if (str.equals(ProtectedSandApp.s("ﭑ"))) {
                    c5 = 1;
                    break;
                }
                break;
            case 3142703:
                if (str.equals(ProtectedSandApp.s("כֿ"))) {
                    c5 = 2;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                bundle.putString(s4, ProtectedSandApp.s("ﭔ"));
                return true;
            case 1:
                bundle.putString(s4, ProtectedSandApp.s("ﭓ"));
                return true;
            case 2:
                bundle.putString(s4, ProtectedSandApp.s("ﭒ"));
                return true;
            default:
                return false;
        }
    }

    public static boolean j(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static boolean k(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static boolean l(String str) {
        return !f58384a.contains(str);
    }

    public static boolean m(String str) {
        return !f58386c.contains(str);
    }
}
