package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Iterator;
import net.minidev.json.a;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class DataBufferUtils {

    @o0
    @KeepForSdk
    public static final String KEY_NEXT_PAGE_TOKEN = ProtectedSandApp.s("쪜");

    @o0
    @KeepForSdk
    public static final String KEY_PREV_PAGE_TOKEN = ProtectedSandApp.s("쪝");

    private DataBufferUtils() {
    }

    @o0
    public static <T, E extends Freezable<T>> ArrayList<T> freezeAndClose(@o0 DataBuffer<E> dataBuffer) {
        a aVar = (ArrayList<T>) new ArrayList(dataBuffer.getCount());
        try {
            Iterator<E> it = dataBuffer.iterator();
            while (it.hasNext()) {
                aVar.add(it.next().freeze());
            }
            return aVar;
        } finally {
            dataBuffer.close();
        }
    }

    public static boolean hasData(@o0 DataBuffer<?> dataBuffer) {
        return dataBuffer != null && dataBuffer.getCount() > 0;
    }

    public static boolean hasNextPage(@o0 DataBuffer<?> dataBuffer) {
        Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString(ProtectedSandApp.s("쪜")) == null) ? false : true;
    }

    public static boolean hasPrevPage(@o0 DataBuffer<?> dataBuffer) {
        Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString(ProtectedSandApp.s("쪝")) == null) ? false : true;
    }
}
