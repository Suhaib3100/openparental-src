package a5;

import android.os.Bundle;
import android.os.Parcelable;
import java.lang.reflect.Array;

/* compiled from: BundleHelper.java */
/* loaded from: classes5.dex */
public final class a {
    private a() {
    }

    public static <T extends Parcelable> T[] a(Bundle bundle, String str, Class<T[]> cls) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if (parcelableArray == null) {
            return null;
        }
        Object newInstance = Array.newInstance(cls.getComponentType(), parcelableArray.length);
        System.arraycopy(parcelableArray, 0, newInstance, 0, parcelableArray.length);
        return (T[]) ((Parcelable[]) newInstance);
    }
}
