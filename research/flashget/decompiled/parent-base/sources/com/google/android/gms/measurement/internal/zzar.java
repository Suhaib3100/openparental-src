package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzar {
    private final String zza;
    private long zzb = -1;
    private final /* synthetic */ zzal zzc;

    public zzar(zzal zzalVar, String str) {
        this.zzc = zzalVar;
        Preconditions.checkNotEmpty(str);
        this.zza = str;
    }

    public final List<zzap> zza() {
        Cursor query;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                query = this.zzc.e_().query(ProtectedSandApp.s("\udd03"), new String[]{ProtectedSandApp.s("\udd04"), ProtectedSandApp.s("\udd05"), ProtectedSandApp.s("\udd06"), ProtectedSandApp.s("\udd07"), ProtectedSandApp.s("\udd08"), ProtectedSandApp.s("\udd09")}, ProtectedSandApp.s("\udd02"), new String[]{this.zza, String.valueOf(this.zzb)}, null, null, ProtectedSandApp.s("\udd04"), ProtectedSandApp.s("\udd0a"));
            } catch (SQLiteException e4) {
                this.zzc.zzj().zzg().zza(ProtectedSandApp.s("\udd0c"), zzgo.zza(this.zza), e4);
                if (0 != 0) {
                    cursor.close();
                }
            }
            if (!query.moveToFirst()) {
                List<zzap> emptyList = Collections.emptyList();
                query.close();
                return emptyList;
            }
            do {
                long j4 = query.getLong(0);
                long j5 = query.getLong(3);
                boolean z4 = query.getLong(5) == 1;
                byte[] blob = query.getBlob(4);
                if (j4 > this.zzb) {
                    this.zzb = j4;
                }
                try {
                    zzfy.zzf.zza zzaVar = (zzfy.zzf.zza) zzoo.zza(zzfy.zzf.zze(), blob);
                    String string = query.getString(1);
                    if (string == null) {
                        string = "";
                    }
                    zzaVar.zza(string).zzb(query.getLong(2));
                    arrayList.add(new zzap(j4, j5, z4, (zzfy.zzf) ((com.google.android.gms.internal.measurement.zzjt) zzaVar.zzai())));
                } catch (IOException e5) {
                    this.zzc.zzj().zzg().zza(ProtectedSandApp.s("\udd0b"), zzgo.zza(this.zza), e5);
                }
            } while (query.moveToNext());
            query.close();
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }
}
