package androidx.media;

import androidx.annotation.c1;
import androidx.versionedparcelable.VersionedParcel;

@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f30590a = (AudioAttributesImpl) versionedParcel.h0(audioAttributesCompat.f30590a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.j0(false, false);
        versionedParcel.m1(audioAttributesCompat.f30590a, 1);
    }
}
