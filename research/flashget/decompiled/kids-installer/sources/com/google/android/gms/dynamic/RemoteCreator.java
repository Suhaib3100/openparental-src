package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class RemoteCreator<T> {
    private final String zza;
    private Object zzb;

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @KeepForSdk
    public static class RemoteCreatorException extends Exception {
        @KeepForSdk
        public RemoteCreatorException(@o0 String str) {
            super(str);
        }

        @KeepForSdk
        public RemoteCreatorException(@o0 String str, @o0 Throwable th) {
            super(str, th);
        }
    }

    @KeepForSdk
    protected RemoteCreator(@o0 String str) {
        this.zza = str;
    }

    @o0
    @KeepForSdk
    protected abstract T getRemoteCreator(@o0 IBinder iBinder);

    @o0
    @KeepForSdk
    protected final T getRemoteCreatorInstance(@o0 Context context) throws RemoteCreatorException {
        if (this.zzb == null) {
            Preconditions.checkNotNull(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null) {
                throw new RemoteCreatorException(ProtectedSandApp.s("ಲ"));
            }
            try {
                this.zzb = getRemoteCreator((IBinder) remoteContext.getClassLoader().loadClass(this.zza).newInstance());
            } catch (ClassNotFoundException e6) {
                throw new RemoteCreatorException(ProtectedSandApp.s("ಱ"), e6);
            } catch (IllegalAccessException e7) {
                throw new RemoteCreatorException(ProtectedSandApp.s("ಯ"), e7);
            } catch (InstantiationException e8) {
                throw new RemoteCreatorException(ProtectedSandApp.s("ರ"), e8);
            }
        }
        return (T) this.zzb;
    }
}
