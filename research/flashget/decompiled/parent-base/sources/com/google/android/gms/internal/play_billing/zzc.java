package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.q0;
import com.android.billingclient.api.b1;
import com.android.billingclient.api.q;
import com.android.billingclient.api.w0;
import com.android.billingclient.api.y;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Priority;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzc {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt(ProtectedSandApp.s("횸"), 0);
        }
        zzn(str, ProtectedSandApp.s("횷"));
        return 0;
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzn(str, ProtectedSandApp.s("횷"));
            return 6;
        }
        Object obj = bundle.get(ProtectedSandApp.s("횹"));
        if (obj == null) {
            zzm(str, ProtectedSandApp.s("횺"));
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        zzn(str, ProtectedSandApp.s("횻").concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle zzc(Bundle bundle, String str, @q0 String str2, long j4) {
        bundle.putString(ProtectedSandApp.s("횼"), ProtectedSandApp.s("횽"));
        if (str2 != null) {
            bundle.putString(ProtectedSandApp.s("횾"), str2);
        }
        bundle.putLong(ProtectedSandApp.s("횿"), j4);
        return bundle;
    }

    public static Bundle zzd(y yVar, zzjs zzjsVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(ProtectedSandApp.s("횹"), yVar.c());
        bundle.putString(ProtectedSandApp.s("훀"), yVar.a());
        bundle.putInt(ProtectedSandApp.s("훁"), zzjsVar.zza());
        return bundle;
    }

    public static Bundle zze(y yVar, zzjs zzjsVar, @q0 String str) {
        Bundle zzd = zzd(yVar, zzjsVar);
        if (str != null) {
            zzd.putString(ProtectedSandApp.s("훂"), str);
        }
        return zzd;
    }

    public static Bundle zzf(q qVar, boolean z4, boolean z5, boolean z6, boolean z7, boolean z10, String str, @q0 String str2, long j4, String str3, long j5) {
        int i4;
        Bundle bundle = new Bundle();
        zzc(bundle, ProtectedSandApp.s("횽"), str2, j4);
        bundle.putLong(ProtectedSandApp.s("훃"), j5);
        if (qVar.d() != 0) {
            bundle.putInt(ProtectedSandApp.s("후"), qVar.d());
        }
        if (!TextUtils.isEmpty(qVar.g())) {
            bundle.putString(ProtectedSandApp.s("훅"), qVar.g());
        }
        if (!TextUtils.isEmpty(qVar.h())) {
            bundle.putString(ProtectedSandApp.s("훆"), qVar.h());
        }
        if (qVar.v()) {
            bundle.putBoolean(ProtectedSandApp.s("훇"), true);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putStringArrayList(ProtectedSandApp.s("훈"), new ArrayList<>(Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty(qVar.j())) {
            bundle.putString(ProtectedSandApp.s("훉"), qVar.j());
        }
        qVar.i();
        if (!TextUtils.isEmpty(null)) {
            qVar.i();
            bundle.putString(ProtectedSandApp.s("훊"), null);
        }
        if (!TextUtils.isEmpty(qVar.k())) {
            bundle.putString(ProtectedSandApp.s("훋"), qVar.k());
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString(ProtectedSandApp.s("훌"), null);
        }
        if (z4 && z6) {
            bundle.putBoolean(ProtectedSandApp.s("훍"), true);
        }
        if (z5 && z7) {
            bundle.putBoolean(ProtectedSandApp.s("훎"), true);
        }
        if (z10 || qVar.a() != null) {
            bundle.putBoolean(ProtectedSandApp.s("훏"), true);
        }
        qVar.e();
        qVar.c();
        if (qVar.a() != null) {
            if (qVar.a().d() != null) {
                bundle.putString(ProtectedSandApp.s("훐"), qVar.a().d().toString());
            }
            if (qVar.a().c() != 0) {
                bundle.putInt(ProtectedSandApp.s("훑"), qVar.a().c());
            }
            bundle.putInt(ProtectedSandApp.s("훒"), qVar.a().a());
            if (qVar.a().b() != null) {
                bundle.putString(ProtectedSandApp.s("훓"), qVar.a().b());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (q.b bVar : qVar.m()) {
            if (bVar.a() != null) {
                String e4 = bVar.c().e();
                q.b.C0666b a5 = bVar.a();
                zzek zza2 = zzel.zza();
                zzeu zza3 = zzev.zza();
                String s4 = ProtectedSandApp.s("훔");
                zza3.zza(zzq(e4, s4, str3));
                zza2.zza(zza3);
                zzeu zza4 = zzev.zza();
                zza4.zza(zzq(a5.d(), s4, str3));
                zza2.zzb(zza4);
                switch (a5.e()) {
                    case 1:
                        i4 = 2;
                        break;
                    case 2:
                        i4 = 3;
                        break;
                    case 3:
                        i4 = 4;
                        break;
                    case 4:
                        i4 = 6;
                        break;
                    case 5:
                        i4 = 7;
                        break;
                    case 6:
                        i4 = 8;
                        break;
                    case 7:
                        i4 = 9;
                        break;
                    default:
                        i4 = 1;
                        break;
                }
                zza2.zzc(i4);
                arrayList.add((zzel) zza2.zzi());
            }
        }
        if (!arrayList.isEmpty()) {
            zzem zza5 = zzen.zza();
            zza5.zza(arrayList);
            bundle.putByteArray(ProtectedSandApp.s("훕"), ((zzen) zza5.zzi()).zzQ());
        }
        return bundle;
    }

    public static Bundle zzg(String str, @q0 String str2, ArrayList arrayList, @q0 String str3, @q0 String str4, zza zzaVar, long j4) {
        boolean z4;
        Bundle bundle = new Bundle();
        zzc(bundle, ProtectedSandApp.s("횽"), str2, j4);
        bundle.putBoolean(ProtectedSandApp.s("훍"), true);
        bundle.putString(ProtectedSandApp.s("훖"), ProtectedSandApp.s("훗"));
        String s4 = ProtectedSandApp.s("훔");
        String s5 = ProtectedSandApp.s("훘");
        bundle.putStringArrayList(ProtectedSandApp.s("훙"), new ArrayList<>(zzca.zzm(s4, s5)));
        bundle.putStringArrayList(ProtectedSandApp.s("훚"), new ArrayList<>(zzca.zzl(s5)));
        bundle.putStringArrayList(ProtectedSandApp.s("훛"), new ArrayList<>(zzca.zzl(s5)));
        bundle.putBoolean(ProtectedSandApp.s("훜"), true);
        z4 = zzaVar.zza;
        if (z4) {
            bundle.putBoolean(ProtectedSandApp.s("훎"), true);
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z5 = false;
        boolean z6 = false;
        for (int i4 = 0; i4 < size; i4++) {
            b1.b bVar = (b1.b) arrayList.get(i4);
            arrayList2.add(null);
            z5 |= !TextUtils.isEmpty(null);
            arrayList4.add(bVar.a());
            z6 |= !TextUtils.isEmpty(bVar.a());
            if (bVar.d().equals(ProtectedSandApp.s("훝"))) {
                zzbl.zzc(null, ProtectedSandApp.s("훞"));
                arrayList3.add(null);
            }
        }
        if (z5) {
            bundle.putStringArrayList(ProtectedSandApp.s("훟"), arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList(ProtectedSandApp.s("훠"), arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString(ProtectedSandApp.s("훡"), null);
        }
        if (z6) {
            bundle.putStringArrayList(ProtectedSandApp.s("훢"), arrayList4);
        }
        return bundle;
    }

    public static Bundle zzh(String str, @q0 String str2, long j4) {
        Bundle bundle = new Bundle();
        zzc(bundle, ProtectedSandApp.s("횽"), str2, j4);
        return bundle;
    }

    public static y zzi(Intent intent, String str) {
        if (intent != null) {
            y.a d5 = y.d();
            d5.d(zzb(intent.getExtras(), str));
            d5.b(zzj(intent.getExtras(), str));
            return d5.a();
        }
        zzn(ProtectedSandApp.s("훣"), ProtectedSandApp.s("훤"));
        y.a d6 = y.d();
        d6.d(6);
        d6.b(ProtectedSandApp.s("훥"));
        return d6.a();
    }

    public static String zzj(Bundle bundle, String str) {
        if (bundle == null) {
            zzn(str, ProtectedSandApp.s("횷"));
            return "";
        }
        Object obj = bundle.get(ProtectedSandApp.s("훀"));
        if (obj == null) {
            zzm(str, ProtectedSandApp.s("훦"));
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        zzn(str, ProtectedSandApp.s("훧").concat(obj.getClass().getName()));
        return "";
    }

    public static String zzk(int i4) {
        return zzb.zza(i4).toString();
    }

    @q0
    public static List zzl(Bundle bundle, Set set) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(ProtectedSandApp.s("훨"));
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(ProtectedSandApp.s("훩"));
        ArrayList arrayList = new ArrayList();
        String s4 = ProtectedSandApp.s("훣");
        if (stringArrayList == null || stringArrayList2 == null) {
            w0 zzp = zzp(bundle.getString(ProtectedSandApp.s("훬")), bundle.getString(ProtectedSandApp.s("훭")), set);
            if (zzp == null) {
                zzm(s4, ProtectedSandApp.s("훮"));
                return null;
            }
            arrayList.add(zzp);
        } else {
            zzm(s4, ProtectedSandApp.s("훪") + stringArrayList.size() + ProtectedSandApp.s("훫"));
            for (int i4 = 0; i4 < stringArrayList.size() && i4 < stringArrayList2.size(); i4++) {
                w0 zzp2 = zzp(stringArrayList.get(i4), stringArrayList2.get(i4), set);
                if (zzp2 != null) {
                    arrayList.add(zzp2);
                }
            }
        }
        return arrayList;
    }

    public static void zzm(String str, String str2) {
        if (!Log.isLoggable(str, 2) || str2.isEmpty()) {
            return;
        }
        int i4 = Priority.ERROR_INT;
        while (!str2.isEmpty() && i4 > 0) {
            int min = Math.min(str2.length(), Math.min(4000, i4));
            str2.substring(0, min);
            str2 = str2.substring(min);
            i4 -= min;
        }
    }

    public static void zzn(String str, String str2) {
        Log.isLoggable(str, 5);
    }

    public static void zzo(String str, String str2, @q0 Throwable th) {
        try {
            Log.isLoggable(str, 5);
        } catch (Throwable unused) {
        }
    }

    @q0
    private static w0 zzp(String str, String str2, Set set) {
        String s4 = ProtectedSandApp.s("훣");
        w0 w0Var = null;
        if (str == null || str2 == null) {
            zzm(s4, ProtectedSandApp.s("훰"));
            return null;
        }
        try {
            w0 w0Var2 = new w0(str, str2);
            try {
                return set.isEmpty() ? w0Var2 : w0Var2;
            } catch (JSONException e4) {
                e = e4;
                w0Var = w0Var2;
                zzn(s4, ProtectedSandApp.s("훯").concat(e.toString()));
                return w0Var;
            }
        } catch (JSONException e5) {
            e = e5;
        }
    }

    private static String zzq(String str, String str2, String str3) {
        return androidx.fragment.app.y.a(ProtectedSandApp.s("훱"), str3, ProtectedSandApp.s("훲"), str);
    }
}
