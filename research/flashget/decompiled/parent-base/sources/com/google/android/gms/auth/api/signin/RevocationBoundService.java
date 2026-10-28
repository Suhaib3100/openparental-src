package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.auth.api.signin.internal.zbt;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@Deprecated
/* loaded from: classes5.dex */
public final class RevocationBoundService extends Service {
    @Override // android.app.Service
    @q0
    public IBinder onBind(@o0 Intent intent) {
        if (!ProtectedSandApp.s("젒").equals(intent.getAction())) {
            if (!ProtectedSandApp.s("젓").equals(intent.getAction())) {
                ProtectedSandApp.s("젔").concat(String.valueOf(intent.getAction()));
                return null;
            }
        }
        if (Log.isLoggable(ProtectedSandApp.s("정"), 2)) {
            ProtectedSandApp.s("젖").concat(String.valueOf(intent.getAction()));
        }
        return new zbt(this);
    }
}
