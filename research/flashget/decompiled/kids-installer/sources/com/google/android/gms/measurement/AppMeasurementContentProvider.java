package com.google.android.gms.measurement;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgd;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
@Deprecated
/* loaded from: classes2.dex */
public class AppMeasurementContentProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public void attachInfo(@o0 Context context, @o0 ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (ProtectedSandApp.s("ມ").equals(providerInfo.authority)) {
            throw new IllegalStateException(ProtectedSandApp.s("ຢ"));
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@o0 Uri uri, @q0 String str, @o0 String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @q0
    public String getType(@o0 Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @q0
    public Uri insert(@o0 Uri uri, @o0 ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Preconditions.checkNotNull(context);
        zzgd.zzp(context, null, null);
        return false;
    }

    @Override // android.content.ContentProvider
    @q0
    public Cursor query(@o0 Uri uri, @o0 String[] strArr, @q0 String str, @o0 String[] strArr2, @q0 String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@o0 Uri uri, @q0 ContentValues contentValues, @q0 String str, @o0 String[] strArr) {
        return 0;
    }
}
