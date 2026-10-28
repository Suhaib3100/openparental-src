package androidx.media;

import android.os.Bundle;
import androidx.annotation.c1;

/* compiled from: MediaBrowserCompatUtils.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class b {
    private b() {
    }

    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle2 == null ? bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }

    public static boolean b(Bundle bundle, Bundle bundle2) {
        int i4;
        int i5;
        int i6;
        int i7 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i10 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE", -1);
        int i11 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        int i12 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        int i13 = Integer.MAX_VALUE;
        if (i7 == -1 || i11 == -1) {
            i4 = Integer.MAX_VALUE;
            i5 = 0;
        } else {
            i5 = i7 * i11;
            i4 = (i11 + i5) - 1;
        }
        if (i10 == -1 || i12 == -1) {
            i6 = 0;
        } else {
            i6 = i10 * i12;
            i13 = (i12 + i6) - 1;
        }
        return i4 >= i6 && i13 >= i5;
    }
}
