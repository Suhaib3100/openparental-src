package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.c1;
import androidx.versionedparcelable.VersionedParcel;

@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f30601a = (AudioAttributes) versionedParcel.W(audioAttributesImplApi21.f30601a, 1);
        audioAttributesImplApi21.f30602b = versionedParcel.M(audioAttributesImplApi21.f30602b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.j0(false, false);
        versionedParcel.X0(audioAttributesImplApi21.f30601a, 1);
        versionedParcel.M0(audioAttributesImplApi21.f30602b, 2);
    }
}
