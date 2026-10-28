package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.annotation.c1;
import androidx.versionedparcelable.VersionedParcel;

@c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f4713a = versionedParcel.M(iconCompat.f4713a, 1);
        iconCompat.f4715c = versionedParcel.t(iconCompat.f4715c, 2);
        iconCompat.f4716d = versionedParcel.W(iconCompat.f4716d, 3);
        iconCompat.f4717e = versionedParcel.M(iconCompat.f4717e, 4);
        iconCompat.f4718f = versionedParcel.M(iconCompat.f4718f, 5);
        iconCompat.f4719g = (ColorStateList) versionedParcel.W(iconCompat.f4719g, 6);
        iconCompat.f4721i = versionedParcel.d0(iconCompat.f4721i, 7);
        iconCompat.f4722j = versionedParcel.d0(iconCompat.f4722j, 8);
        iconCompat.a();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.j0(true, true);
        iconCompat.b(versionedParcel.i());
        int i5 = iconCompat.f4713a;
        if (-1 != i5) {
            versionedParcel.M0(i5, 1);
        }
        byte[] bArr = iconCompat.f4715c;
        if (bArr != null) {
            versionedParcel.u0(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f4716d;
        if (parcelable != null) {
            versionedParcel.X0(parcelable, 3);
        }
        int i6 = iconCompat.f4717e;
        if (i6 != 0) {
            versionedParcel.M0(i6, 4);
        }
        int i7 = iconCompat.f4718f;
        if (i7 != 0) {
            versionedParcel.M0(i7, 5);
        }
        ColorStateList colorStateList = iconCompat.f4719g;
        if (colorStateList != null) {
            versionedParcel.X0(colorStateList, 6);
        }
        String str = iconCompat.f4721i;
        if (str != null) {
            versionedParcel.f1(str, 7);
        }
        String str2 = iconCompat.f4722j;
        if (str2 != null) {
            versionedParcel.f1(str2, 8);
        }
    }
}
