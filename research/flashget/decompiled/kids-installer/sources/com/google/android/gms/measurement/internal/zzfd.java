package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfd {
    final /* synthetic */ zzfi zza;
    private final String zzb;
    private final Bundle zzc;
    private Bundle zzd;

    public zzfd(zzfi zzfiVar, String str, Bundle bundle) {
        this.zza = zzfiVar;
        String s5 = ProtectedSandApp.s("྆");
        Preconditions.checkNotEmpty(s5);
        this.zzb = s5;
        this.zzc = new Bundle();
    }

    @n1
    public final Bundle zza() {
        char c6;
        if (this.zzd == null) {
            String string = this.zza.zza().getString(this.zzb, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i5);
                            String string2 = jSONObject.getString(ProtectedSandApp.s("྇"));
                            String string3 = jSONObject.getString(ProtectedSandApp.s("ྈ"));
                            int hashCode = string3.hashCode();
                            if (hashCode == 100) {
                                if (string3.equals(ProtectedSandApp.s("ྋ"))) {
                                    c6 = 1;
                                }
                                c6 = 65535;
                            } else if (hashCode != 108) {
                                if (hashCode == 115 && string3.equals(ProtectedSandApp.s("ྉ"))) {
                                    c6 = 0;
                                }
                                c6 = 65535;
                            } else {
                                if (string3.equals(ProtectedSandApp.s("ྊ"))) {
                                    c6 = 2;
                                }
                                c6 = 65535;
                            }
                            String s5 = ProtectedSandApp.s("ྌ");
                            if (c6 == 0) {
                                bundle.putString(string2, jSONObject.getString(s5));
                            } else if (c6 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString(s5)));
                            } else if (c6 != 2) {
                                this.zza.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ྍ"), string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString(s5)));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.zza.zzt.zzaA().zzd().zza(ProtectedSandApp.s("ྎ"));
                        }
                    }
                    this.zzd = bundle;
                } catch (JSONException unused2) {
                    a.a(this.zza.zzt, ProtectedSandApp.s("ྏ"));
                }
            }
            if (this.zzd == null) {
                this.zzd = this.zzc;
            }
        }
        return this.zzd;
    }

    @n1
    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.zza.zza().edit();
        if (bundle.size() == 0) {
            edit.remove(this.zzb);
        } else {
            String str = this.zzb;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(ProtectedSandApp.s("ྐ"), str2);
                        jSONObject.put(ProtectedSandApp.s("ྑ"), obj.toString());
                        boolean z5 = obj instanceof String;
                        String s5 = ProtectedSandApp.s("ྒ");
                        if (z5) {
                            jSONObject.put(s5, ProtectedSandApp.s("ྒྷ"));
                        } else if (obj instanceof Long) {
                            jSONObject.put(s5, ProtectedSandApp.s("ྔ"));
                        } else if (obj instanceof Double) {
                            jSONObject.put(s5, ProtectedSandApp.s("ྕ"));
                        } else {
                            this.zza.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ྖ"), obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e6) {
                        this.zza.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ྗ"), e6);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.zzd = bundle;
    }
}
