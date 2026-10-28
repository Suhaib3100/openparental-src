package androidx.media;

import android.os.Bundle;
import androidx.annotation.o0;
import java.util.Arrays;

/* loaded from: classes3.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    int f30603a;

    /* renamed from: b, reason: collision with root package name */
    int f30604b;

    /* renamed from: c, reason: collision with root package name */
    int f30605c;

    /* renamed from: d, reason: collision with root package name */
    int f30606d;

    AudioAttributesImplBase() {
        this.f30603a = 0;
        this.f30604b = 0;
        this.f30605c = 0;
        this.f30606d = -1;
    }

    public static AudioAttributesImpl f(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new AudioAttributesImplBase(bundle.getInt("androidx.media.audio_attrs.CONTENT_TYPE", 0), bundle.getInt("androidx.media.audio_attrs.FLAGS", 0), bundle.getInt("androidx.media.audio_attrs.USAGE", 0), bundle.getInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", -1));
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        return this.f30606d;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int b() {
        return this.f30603a;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int c() {
        return AudioAttributesCompat.h(true, this.f30605c, this.f30603a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int d() {
        int i4 = this.f30606d;
        return i4 != -1 ? i4 : AudioAttributesCompat.h(false, this.f30605c, this.f30603a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f30604b == audioAttributesImplBase.getContentType() && this.f30605c == audioAttributesImplBase.getFlags() && this.f30603a == audioAttributesImplBase.b() && this.f30606d == audioAttributesImplBase.f30606d;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.f30604b;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        int i4 = this.f30605c;
        int d5 = d();
        if (d5 == 6) {
            i4 |= 4;
        } else if (d5 == 7) {
            i4 |= 1;
        }
        return i4 & 273;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30604b), Integer.valueOf(this.f30605c), Integer.valueOf(this.f30603a), Integer.valueOf(this.f30606d)});
    }

    @Override // androidx.media.AudioAttributesImpl
    @o0
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt("androidx.media.audio_attrs.USAGE", this.f30603a);
        bundle.putInt("androidx.media.audio_attrs.CONTENT_TYPE", this.f30604b);
        bundle.putInt("androidx.media.audio_attrs.FLAGS", this.f30605c);
        int i4 = this.f30606d;
        if (i4 != -1) {
            bundle.putInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", i4);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f30606d != -1) {
            sb.append(" stream=");
            sb.append(this.f30606d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.l(this.f30603a));
        sb.append(" content=");
        sb.append(this.f30604b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f30605c).toUpperCase());
        return sb.toString();
    }

    AudioAttributesImplBase(int i4, int i5, int i6, int i7) {
        this.f30604b = i4;
        this.f30605c = i5;
        this.f30603a = i6;
        this.f30606d = i7;
    }
}
