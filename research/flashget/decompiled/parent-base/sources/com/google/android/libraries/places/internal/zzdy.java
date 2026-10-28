package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.api.model.Place;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzdy {
    private static final zzhv zza;

    static {
        zzhu zzhuVar = new zzhu();
        zzhuVar.zza(Place.Field.ADDRESS, ProtectedSandApp.s("\ue92b"));
        zzhuVar.zza(Place.Field.ADDRESS_COMPONENTS, ProtectedSandApp.s("\ue92c"));
        zzhuVar.zza(Place.Field.BUSINESS_STATUS, ProtectedSandApp.s("\ue92d"));
        zzhuVar.zza(Place.Field.ID, ProtectedSandApp.s("\ue92e"));
        zzhuVar.zza(Place.Field.LAT_LNG, ProtectedSandApp.s("\ue92f"));
        zzhuVar.zza(Place.Field.NAME, ProtectedSandApp.s("\ue930"));
        zzhuVar.zza(Place.Field.OPENING_HOURS, ProtectedSandApp.s("\ue931"));
        zzhuVar.zza(Place.Field.PHONE_NUMBER, ProtectedSandApp.s("\ue932"));
        zzhuVar.zza(Place.Field.PHOTO_METADATAS, ProtectedSandApp.s("\ue933"));
        zzhuVar.zza(Place.Field.PLUS_CODE, ProtectedSandApp.s("\ue934"));
        zzhuVar.zza(Place.Field.PRICE_LEVEL, ProtectedSandApp.s("\ue935"));
        zzhuVar.zza(Place.Field.RATING, ProtectedSandApp.s("\ue936"));
        zzhuVar.zza(Place.Field.TYPES, ProtectedSandApp.s("\ue937"));
        zzhuVar.zza(Place.Field.USER_RATINGS_TOTAL, ProtectedSandApp.s("\ue938"));
        zzhuVar.zza(Place.Field.UTC_OFFSET, ProtectedSandApp.s("\ue939"));
        zzhuVar.zza(Place.Field.VIEWPORT, ProtectedSandApp.s("\ue93a"));
        zzhuVar.zza(Place.Field.WEBSITE_URI, ProtectedSandApp.s("\ue93b"));
        zzhuVar.zza(Place.Field.ICON_URL, ProtectedSandApp.s("\ue93c"));
        zzhuVar.zza(Place.Field.ICON_BACKGROUND_COLOR, ProtectedSandApp.s("\ue93d"));
        zza = zzhuVar.zzb();
    }

    public static String zza(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) zza.get((Place.Field) it.next());
            if (!TextUtils.isEmpty(str)) {
                if (sb.length() > 0) {
                    sb.append(ProtectedSandApp.s("\ue93e"));
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static List zzb(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) zza.get((Place.Field) it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
