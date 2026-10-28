package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.annotation.c1;
import androidx.versionedparcelable.VersionedParcel;

@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f26201a = versionedParcel.M(iconCompat.f26201a, 1);
        iconCompat.f26203c = versionedParcel.t(iconCompat.f26203c, 2);
        iconCompat.f26204d = versionedParcel.W(iconCompat.f26204d, 3);
        iconCompat.f26205e = versionedParcel.M(iconCompat.f26205e, 4);
        iconCompat.f26206f = versionedParcel.M(iconCompat.f26206f, 5);
        iconCompat.f26207g = (ColorStateList) versionedParcel.W(iconCompat.f26207g, 6);
        iconCompat.f26209i = versionedParcel.d0(iconCompat.f26209i, 7);
        iconCompat.f26210j = versionedParcel.d0(iconCompat.f26210j, 8);
        iconCompat.f();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.j0(true, true);
        iconCompat.g(versionedParcel.i());
        int i4 = iconCompat.f26201a;
        if (-1 != i4) {
            versionedParcel.M0(i4, 1);
        }
        byte[] bArr = iconCompat.f26203c;
        if (bArr != null) {
            versionedParcel.u0(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f26204d;
        if (parcelable != null) {
            versionedParcel.X0(parcelable, 3);
        }
        int i5 = iconCompat.f26205e;
        if (i5 != 0) {
            versionedParcel.M0(i5, 4);
        }
        int i6 = iconCompat.f26206f;
        if (i6 != 0) {
            versionedParcel.M0(i6, 5);
        }
        ColorStateList colorStateList = iconCompat.f26207g;
        if (colorStateList != null) {
            versionedParcel.X0(colorStateList, 6);
        }
        String str = iconCompat.f26209i;
        if (str != null) {
            versionedParcel.f1(str, 7);
        }
        String str2 = iconCompat.f26210j;
        if (str2 != null) {
            versionedParcel.f1(str2, 8);
        }
    }
}
