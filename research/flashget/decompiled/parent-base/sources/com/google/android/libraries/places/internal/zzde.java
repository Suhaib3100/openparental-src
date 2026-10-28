package com.google.android.libraries.places.internal;

import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzde {
    private final Gson zza = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    public final Object zza(String str, Class cls) throws zzcc {
        try {
            return this.zza.fromJson(str, cls);
        } catch (JsonSyntaxException unused) {
            String name = cls.getName();
            throw new zzcc(k0.a(new StringBuilder(name.length() + 55), ProtectedSandApp.s("\ue86f"), name, ProtectedSandApp.s("\ue870")));
        }
    }
}
