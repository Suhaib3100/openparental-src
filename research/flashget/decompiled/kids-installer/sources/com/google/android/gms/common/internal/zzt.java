package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzt {
    private static final Uri zza;
    private static final Uri zzb;

    static {
        Uri parse = Uri.parse(ProtectedSandApp.s("ே"));
        zza = parse;
        zzb = parse.buildUpon().appendPath(ProtectedSandApp.s("ை")).appendPath(ProtectedSandApp.s("\u0bc9")).build();
    }

    public static Intent zza() {
        Intent intent = new Intent(ProtectedSandApp.s("ொ"));
        intent.setPackage(ProtectedSandApp.s("ோ"));
        return intent;
    }

    public static Intent zzb(String str, @q0 String str2) {
        Intent intent = new Intent(ProtectedSandApp.s("ௌ"));
        Uri.Builder appendQueryParameter = Uri.parse(ProtectedSandApp.s("்")).buildUpon().appendQueryParameter(ProtectedSandApp.s("\u0bce"), ProtectedSandApp.s("\u0bcf"));
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter(ProtectedSandApp.s("ௐ"), str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage(ProtectedSandApp.s("\u0bd1"));
        intent.addFlags(524288);
        return intent;
    }

    public static Intent zzc(String str) {
        Uri fromParts = Uri.fromParts(ProtectedSandApp.s("\u0bd3"), ProtectedSandApp.s("\u0bd2"), null);
        Intent intent = new Intent(ProtectedSandApp.s("\u0bd4"));
        intent.setData(fromParts);
        return intent;
    }
}
