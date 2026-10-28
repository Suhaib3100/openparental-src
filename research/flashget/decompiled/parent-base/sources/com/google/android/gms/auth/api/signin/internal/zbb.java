package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes5.dex */
public final class zbb implements Runnable {
    private static final Logger zba = new Logger(ProtectedSandApp.s("젭"), new String[0]);
    private final String zbb;
    private final StatusPendingResult zbc = new StatusPendingResult((GoogleApiClient) null);

    public zbb(String str) {
        this.zbb = Preconditions.checkNotEmpty(str);
    }

    public static PendingResult zba(@q0 String str) {
        if (str == null) {
            return PendingResults.immediateFailedResult(new Status(4), null);
        }
        zbb zbbVar = new zbb(str);
        new Thread(zbbVar).start();
        return zbbVar.zbc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String s4 = ProtectedSandApp.s("젮");
        String s5 = ProtectedSandApp.s("젯");
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(s5 + this.zbb).openConnection();
            httpURLConnection.setRequestProperty(ProtectedSandApp.s("젰"), ProtectedSandApp.s("젱"));
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                zba.e(ProtectedSandApp.s("젲"), new Object[0]);
            }
            zba.d(s4 + responseCode, new Object[0]);
        } catch (IOException e4) {
            zba.e(ProtectedSandApp.s("젴").concat(String.valueOf(e4.toString())), new Object[0]);
        } catch (Exception e5) {
            zba.e(ProtectedSandApp.s("젳").concat(String.valueOf(e5.toString())), new Object[0]);
        }
        this.zbc.setResult(status);
    }
}
