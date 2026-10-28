package com.google.android.gms.dynamic;

import android.os.IBinder;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@RetainForClient
@KeepForSdk
/* loaded from: classes5.dex */
public final class ObjectWrapper<T> extends IObjectWrapper.Stub {
    private final Object zza;

    private ObjectWrapper(Object obj) {
        this.zza = obj;
    }

    @o0
    @KeepForSdk
    public static <T> T unwrap(@o0 IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return (T) ((ObjectWrapper) iObjectWrapper).zza;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i4 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i4++;
                field = field2;
            }
        }
        if (i4 != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 53);
            sb.append(ProtectedSandApp.s("챗"));
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        Preconditions.checkNotNull(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("챖"));
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e4) {
            throw new IllegalArgumentException(ProtectedSandApp.s("챔"), e4);
        } catch (NullPointerException e5) {
            throw new IllegalArgumentException(ProtectedSandApp.s("챕"), e5);
        }
    }

    @o0
    @KeepForSdk
    public static <T> IObjectWrapper wrap(@o0 T t4) {
        return new ObjectWrapper(t4);
    }
}
