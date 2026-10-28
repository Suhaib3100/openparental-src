package com.google.android.gms.measurement.internal;

import androidx.annotation.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
@n1
/* loaded from: classes5.dex */
final class zzlg implements Runnable {
    private final URL zza;
    private final zzld zzb;
    private final String zzc;
    private final Map<String, String> zzd;
    private final /* synthetic */ zzle zze;

    public zzlg(zzle zzleVar, String str, URL url, byte[] bArr, Map<String, String> map, zzld zzldVar) {
        this.zze = zzleVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzldVar);
        this.zza = url;
        this.zzb = zzldVar;
        this.zzc = str;
        this.zzd = null;
    }

    private final void zzb(final int i4, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.zze.zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlf
            @Override // java.lang.Runnable
            public final void run() {
                zzlg.this.zza(i4, exc, bArr, map);
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        byte[] zza;
        this.zze.zzr();
        int i4 = 0;
        try {
            URLConnection zza2 = com.google.android.gms.internal.measurement.zzcy.zza().zza(this.zza, ProtectedSandApp.s("\ue159"));
            if (!(zza2 instanceof HttpURLConnection)) {
                throw new IOException(ProtectedSandApp.s("\ue15a"));
            }
            httpURLConnection = (HttpURLConnection) zza2;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                i4 = httpURLConnection.getResponseCode();
                map = httpURLConnection.getHeaderFields();
                try {
                    zzle zzleVar = this.zze;
                    zza = zzle.zza(httpURLConnection);
                    httpURLConnection.disconnect();
                    zzb(i4, null, zza, map);
                } catch (IOException e4) {
                    e = e4;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(i4, e, null, map);
                } catch (Throwable th) {
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(i4, null, null, map);
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                map = null;
            } catch (Throwable th2) {
                th = th2;
                map = null;
            }
        } catch (IOException e6) {
            e = e6;
            httpURLConnection = null;
            map = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            map = null;
        }
    }

    final /* synthetic */ void zza(int i4, Exception exc, byte[] bArr, Map map) {
        this.zzb.zza(this.zzc, i4, exc, bArr, map);
    }
}
