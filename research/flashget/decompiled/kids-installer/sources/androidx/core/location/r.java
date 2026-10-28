package androidx.core.location;

import android.location.Location;
import kotlin.Metadata;

/* compiled from: Location.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0086\n¨\u0006\u0004"}, d2 = {"Landroid/location/Location;", "", "a", "b", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class r {
    public static final double a(@d5.d Location location) {
        kotlin.jvm.internal.l0.p(location, "<this>");
        return location.getLatitude();
    }

    public static final double b(@d5.d Location location) {
        kotlin.jvm.internal.l0.p(location, "<this>");
        return location.getLongitude();
    }
}
