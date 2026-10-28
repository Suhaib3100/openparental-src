package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.o0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(21)
/* loaded from: classes3.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: c, reason: collision with root package name */
    private static final String f30599c = "AudioAttributesCompat21";

    /* renamed from: d, reason: collision with root package name */
    static Method f30600d;

    /* renamed from: a, reason: collision with root package name */
    AudioAttributes f30601a;

    /* renamed from: b, reason: collision with root package name */
    int f30602b;

    AudioAttributesImplApi21() {
        this.f30602b = -1;
    }

    public static AudioAttributesImpl f(Bundle bundle) {
        AudioAttributes audioAttributes;
        if (bundle == null || (audioAttributes = (AudioAttributes) bundle.getParcelable("androidx.media.audio_attrs.FRAMEWORKS")) == null) {
            return null;
        }
        return new AudioAttributesImplApi21(audioAttributes, bundle.getInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", -1));
    }

    static Method g() {
        try {
            if (f30600d == null) {
                f30600d = AudioAttributes.class.getMethod("toLegacyStreamType", AudioAttributes.class);
            }
            return f30600d;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        return this.f30602b;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int b() {
        return this.f30601a.getUsage();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int c() {
        int volumeControlStream;
        if (Build.VERSION.SDK_INT < 26) {
            return AudioAttributesCompat.h(true, getFlags(), b());
        }
        volumeControlStream = this.f30601a.getVolumeControlStream();
        return volumeControlStream;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int d() {
        int i4 = this.f30602b;
        if (i4 != -1) {
            return i4;
        }
        Method g4 = g();
        if (g4 == null) {
            return -1;
        }
        try {
            return ((Integer) g4.invoke(null, this.f30601a)).intValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return -1;
        }
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object e() {
        return this.f30601a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f30601a.equals(((AudioAttributesImplApi21) obj).f30601a);
        }
        return false;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.f30601a.getContentType();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        return this.f30601a.getFlags();
    }

    public int hashCode() {
        return this.f30601a.hashCode();
    }

    @Override // androidx.media.AudioAttributesImpl
    @o0
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("androidx.media.audio_attrs.FRAMEWORKS", this.f30601a);
        int i4 = this.f30602b;
        if (i4 != -1) {
            bundle.putInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", i4);
        }
        return bundle;
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f30601a;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i4) {
        this.f30601a = audioAttributes;
        this.f30602b = i4;
    }
}
