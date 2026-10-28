package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* loaded from: classes.dex */
public final class AppLocalesMetadataHolderService extends Service {

    @x0(24)
    private static class a {
        private a() {
        }

        @androidx.annotation.u
        static int a() {
            return 512;
        }
    }

    @o0
    public static ServiceInfo a(@o0 Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), a.a() | 128);
    }

    @Override // android.app.Service
    @o0
    public IBinder onBind(@o0 Intent intent) {
        throw new UnsupportedOperationException();
    }
}
