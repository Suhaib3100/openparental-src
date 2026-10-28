package androidx.media;

import androidx.annotation.c1;
import androidx.versionedparcelable.VersionedParcel;

@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f30603a = versionedParcel.M(audioAttributesImplBase.f30603a, 1);
        audioAttributesImplBase.f30604b = versionedParcel.M(audioAttributesImplBase.f30604b, 2);
        audioAttributesImplBase.f30605c = versionedParcel.M(audioAttributesImplBase.f30605c, 3);
        audioAttributesImplBase.f30606d = versionedParcel.M(audioAttributesImplBase.f30606d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.j0(false, false);
        versionedParcel.M0(audioAttributesImplBase.f30603a, 1);
        versionedParcel.M0(audioAttributesImplBase.f30604b, 2);
        versionedParcel.M0(audioAttributesImplBase.f30605c, 3);
        versionedParcel.M0(audioAttributesImplBase.f30606d, 4);
    }
}
