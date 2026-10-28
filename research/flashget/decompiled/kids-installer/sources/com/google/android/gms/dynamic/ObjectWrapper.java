package com.google.android.gms.dynamic;

import android.os.IBinder;
import androidx.annotation.o0;
import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@RetainForClient
@KeepForSdk
/* loaded from: classes3.dex */
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
        int i5 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i5++;
                field = field2;
            }
        }
        if (i5 != 1) {
            throw new IllegalArgumentException(s.a(ProtectedSandApp.s("⊧"), declaredFields.length));
        }
        Preconditions.checkNotNull(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⊦"));
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e6) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⊤"), e6);
        } catch (NullPointerException e7) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⊥"), e7);
        }
    }

    @o0
    @KeepForSdk
    public static <T> IObjectWrapper wrap(@o0 T t5) {
        return new ObjectWrapper(t5);
    }
}
