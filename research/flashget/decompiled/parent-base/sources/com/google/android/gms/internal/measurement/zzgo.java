package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzgo implements zzgq {
    @Override // com.google.android.gms.internal.measurement.zzgq
    @q0
    public final String zza(ContentResolver contentResolver, String str) throws zzgt {
        Uri uri = zzgi.zza;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (acquireUnstableContentProviderClient == null) {
                throw new zzgt(ProtectedSandApp.s("푹"));
            }
            try {
                Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                try {
                    if (query == null) {
                        throw new zzgt(ProtectedSandApp.s("푷"));
                    }
                    if (query.moveToFirst()) {
                        String string = query.getString(1);
                        query.close();
                        return string;
                    }
                    query.close();
                    acquireUnstableContentProviderClient.release();
                    return null;
                } catch (Throwable th) {
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (RemoteException e4) {
                throw new zzgt(ProtectedSandApp.s("푸"), e4);
            }
        } finally {
            acquireUnstableContentProviderClient.release();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgq
    public final <T extends Map<String, String>> T zza(ContentResolver contentResolver, String[] strArr, zzgr<T> zzgrVar) throws zzgt {
        Uri uri = zzgi.zzb;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (acquireUnstableContentProviderClient != null) {
            try {
                try {
                    Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                    try {
                        if (query != null) {
                            T zza = zzgrVar.zza(query.getCount());
                            while (query.moveToNext()) {
                                zza.put(query.getString(0), query.getString(1));
                            }
                            if (query.isAfterLast()) {
                                query.close();
                                return zza;
                            }
                            throw new zzgt(ProtectedSandApp.s("푺"));
                        }
                        throw new zzgt(ProtectedSandApp.s("푷"));
                    } catch (Throwable th) {
                        if (query != null) {
                            try {
                                query.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (RemoteException e4) {
                    throw new zzgt(ProtectedSandApp.s("푸"), e4);
                }
            } finally {
                acquireUnstableContentProviderClient.release();
            }
        }
        throw new zzgt(ProtectedSandApp.s("푹"));
    }
}
