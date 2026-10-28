package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.VolleyError;
import com.android.volley.l;
import com.android.volley.o;
import com.android.volley.q;
import com.android.volley.toolbox.r;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import java.util.Map;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzby {
    private final o zza;

    zzby(o oVar) {
        this.zza = oVar;
    }

    static /* synthetic */ void zza(TaskCompletionSource taskCompletionSource, VolleyError volleyError) {
        ApiException zza;
        try {
            l lVar = volleyError.f40811b;
            if (lVar != null) {
                int i4 = lVar.f40899a;
                if (i4 == 400) {
                    zza = new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, ProtectedSandApp.s("\ue83e")));
                } else if (i4 == 403) {
                    zza = new ApiException(new Status(PlacesStatusCodes.REQUEST_DENIED, ProtectedSandApp.s("\ue83d")));
                }
                taskCompletionSource.trySetException(zza);
            }
            zza = zzbm.zza(volleyError);
            taskCompletionSource.trySetException(zza);
        } catch (Error e4) {
            e = e4;
            zzev.zzb(e);
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            zzev.zzb(e);
            throw e;
        }
    }

    static /* synthetic */ void zzc(zzcn zzcnVar, TaskCompletionSource taskCompletionSource, Bitmap bitmap) {
        try {
            zzcnVar.zzb(bitmap);
            taskCompletionSource.trySetResult(zzcnVar.zza());
        } catch (Error | RuntimeException e4) {
            zzev.zzb(e4);
            throw e4;
        }
    }

    public final Task zzb(zzca zzcaVar, final zzcn zzcnVar) {
        String zzc = zzcaVar.zzc();
        Map zzd = zzcaVar.zzd();
        CancellationToken zza = zzcaVar.zza();
        final TaskCompletionSource taskCompletionSource = zza != null ? new TaskCompletionSource(zza) : new TaskCompletionSource();
        final byte[] bArr = null;
        final zzbx zzbxVar = new zzbx(this, zzc, new q.b(taskCompletionSource, bArr) { // from class: com.google.android.libraries.places.internal.zzbv
            public final /* synthetic */ TaskCompletionSource zza;

            @Override // com.android.volley.q.b
            public final void onResponse(Object obj) {
                zzby.zzc(zzcn.this, this.zza, (Bitmap) obj);
            }
        }, 0, 0, ImageView.ScaleType.CENTER, Bitmap.Config.ARGB_8888, new q.a() { // from class: com.google.android.libraries.places.internal.zzbu
            @Override // com.android.volley.q.a
            public final void onErrorResponse(VolleyError volleyError) {
                zzby.zza(TaskCompletionSource.this, volleyError);
            }
        }, zzd);
        if (zza != null) {
            zza.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzbw
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final void onCanceled() {
                    r.this.cancel();
                }
            });
        }
        this.zza.a(zzbxVar);
        return taskCompletionSource.getTask();
    }
}
