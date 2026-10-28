package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.r2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public class AudioAttributesCompat implements androidx.versionedparcelable.g {
    private static final SparseIntArray A;
    static boolean B = false;
    private static final int[] C;
    public static final int D = 1;
    static final int E = 2;
    static final int F = 4;
    static final int G = 8;
    public static final int H = 16;
    static final int I = 32;
    static final int J = 64;
    static final int K = 128;
    static final int L = 256;
    static final int M = 512;
    static final int N = 1023;
    static final int O = 273;
    static final int P = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f30566c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f30567d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f30568e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f30569f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f30570g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f30571h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f30572i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f30573j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f30574k = 3;

    /* renamed from: l, reason: collision with root package name */
    public static final int f30575l = 4;

    /* renamed from: m, reason: collision with root package name */
    public static final int f30576m = 5;

    /* renamed from: n, reason: collision with root package name */
    public static final int f30577n = 6;

    /* renamed from: o, reason: collision with root package name */
    public static final int f30578o = 7;

    /* renamed from: p, reason: collision with root package name */
    public static final int f30579p = 8;

    /* renamed from: q, reason: collision with root package name */
    public static final int f30580q = 9;

    /* renamed from: r, reason: collision with root package name */
    public static final int f30581r = 10;

    /* renamed from: s, reason: collision with root package name */
    public static final int f30582s = 11;

    /* renamed from: t, reason: collision with root package name */
    public static final int f30583t = 12;

    /* renamed from: u, reason: collision with root package name */
    public static final int f30584u = 13;

    /* renamed from: v, reason: collision with root package name */
    public static final int f30585v = 14;

    /* renamed from: w, reason: collision with root package name */
    private static final int f30586w = 15;

    /* renamed from: x, reason: collision with root package name */
    public static final int f30587x = 16;

    /* renamed from: y, reason: collision with root package name */
    private static final int f30588y = 1;

    /* renamed from: z, reason: collision with root package name */
    private static final int f30589z = 2;

    /* renamed from: a, reason: collision with root package name */
    AudioAttributesImpl f30590a;
    static final String Q = "androidx.media.audio_attrs.FRAMEWORKS";
    static final String R = "androidx.media.audio_attrs.USAGE";

    /* renamed from: b, reason: collision with root package name */
    private static final String f30565b = "AudioAttributesCompat";
    static final String S = "androidx.media.audio_attrs.CONTENT_TYPE";
    static final String T = "androidx.media.audio_attrs.FLAGS";
    static final String U = "androidx.media.audio_attrs.LEGACY_STREAM_TYPE";

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f30591a = 6;

        /* renamed from: b, reason: collision with root package name */
        public static final int f30592b = 7;

        /* renamed from: c, reason: collision with root package name */
        public static final int f30593c = 9;

        /* renamed from: d, reason: collision with root package name */
        public static final int f30594d = 10;

        private c() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        C = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    AudioAttributesCompat() {
    }

    @c1({c1.a.LIBRARY_GROUP})
    public static AudioAttributesCompat f(Bundle bundle) {
        AudioAttributesImpl f4 = AudioAttributesImplApi21.f(bundle);
        if (f4 == null) {
            return null;
        }
        return new AudioAttributesCompat(f4);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public static void g(boolean z4) {
        B = z4;
    }

    static int h(boolean z4, int i4, int i5) {
        if ((i4 & 1) == 1) {
            return z4 ? 1 : 7;
        }
        if ((i4 & 4) == 4) {
            return z4 ? 0 : 6;
        }
        switch (i5) {
            case 0:
                return z4 ? Integer.MIN_VALUE : 3;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z4 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (z4) {
                    throw new IllegalArgumentException(r2.a("Unknown usage value ", i5, " in audio attributes"));
                }
                return 3;
        }
    }

    static int i(boolean z4, AudioAttributesCompat audioAttributesCompat) {
        return h(z4, audioAttributesCompat.getFlags(), audioAttributesCompat.b());
    }

    static int k(int i4) {
        switch (i4) {
        }
        return 2;
    }

    static String l(int i4) {
        switch (i4) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return android.support.v4.media.a.a("unknown usage ", i4);
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    @q0
    public static AudioAttributesCompat m(@o0 Object obj) {
        if (B) {
            return null;
        }
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21((AudioAttributes) obj, -1);
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f30590a = audioAttributesImplApi21;
        return audioAttributesCompat;
    }

    int a() {
        return this.f30590a.a();
    }

    public int b() {
        return this.f30590a.b();
    }

    public int c() {
        return this.f30590a.c();
    }

    public int d() {
        return this.f30590a.d();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f30590a;
        return audioAttributesImpl == null ? audioAttributesCompat.f30590a == null : audioAttributesImpl.equals(audioAttributesCompat.f30590a);
    }

    public int getContentType() {
        return this.f30590a.getContentType();
    }

    public int getFlags() {
        return this.f30590a.getFlags();
    }

    public int hashCode() {
        return this.f30590a.hashCode();
    }

    @q0
    public Object j() {
        return this.f30590a.e();
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public Bundle toBundle() {
        return this.f30590a.toBundle();
    }

    public String toString() {
        return this.f30590a.toString();
    }

    AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f30590a = audioAttributesImpl;
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private int f30595a;

        /* renamed from: b, reason: collision with root package name */
        private int f30596b;

        /* renamed from: c, reason: collision with root package name */
        private int f30597c;

        /* renamed from: d, reason: collision with root package name */
        private int f30598d;

        public d() {
            this.f30595a = 0;
            this.f30596b = 0;
            this.f30597c = 0;
            this.f30598d = -1;
        }

        public AudioAttributesCompat a() {
            AudioAttributesImpl audioAttributesImplBase;
            if (AudioAttributesCompat.B) {
                audioAttributesImplBase = new AudioAttributesImplBase(this.f30596b, this.f30597c, this.f30595a, this.f30598d);
            } else {
                AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f30596b).setFlags(this.f30597c).setUsage(this.f30595a);
                int i4 = this.f30598d;
                if (i4 != -1) {
                    usage.setLegacyStreamType(i4);
                }
                audioAttributesImplBase = new AudioAttributesImplApi21(usage.build(), this.f30598d);
            }
            return new AudioAttributesCompat(audioAttributesImplBase);
        }

        public d b(int i4) {
            if (i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4) {
                this.f30596b = i4;
            } else {
                this.f30595a = 0;
            }
            return this;
        }

        public d c(int i4) {
            this.f30597c = (i4 & AudioAttributesCompat.N) | this.f30597c;
            return this;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        d d(int i4) {
            switch (i4) {
                case 0:
                    this.f30596b = 1;
                    break;
                case 1:
                    this.f30596b = 4;
                    break;
                case 2:
                    this.f30596b = 4;
                    break;
                case 3:
                    this.f30596b = 2;
                    break;
                case 4:
                    this.f30596b = 4;
                    break;
                case 5:
                    this.f30596b = 4;
                    break;
                case 6:
                    this.f30596b = 1;
                    this.f30597c |= 4;
                    break;
                case 7:
                    this.f30597c = 1 | this.f30597c;
                    this.f30596b = 4;
                    break;
                case 8:
                    this.f30596b = 4;
                    break;
                case 9:
                    this.f30596b = 4;
                    break;
                case 10:
                    this.f30596b = 1;
                    break;
            }
            this.f30595a = AudioAttributesCompat.k(i4);
            return this;
        }

        public d e(int i4) {
            if (i4 == 10) {
                throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
            }
            this.f30598d = i4;
            return d(i4);
        }

        public d f(int i4) {
            switch (i4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.f30595a = i4;
                    return this;
                case 16:
                    if (AudioAttributesCompat.B || Build.VERSION.SDK_INT <= 25) {
                        this.f30595a = 12;
                    } else {
                        this.f30595a = i4;
                    }
                    return this;
                default:
                    this.f30595a = 0;
                    return this;
            }
        }

        public d(AudioAttributesCompat audioAttributesCompat) {
            this.f30595a = 0;
            this.f30596b = 0;
            this.f30597c = 0;
            this.f30598d = -1;
            this.f30595a = audioAttributesCompat.b();
            this.f30596b = audioAttributesCompat.getContentType();
            this.f30597c = audioAttributesCompat.getFlags();
            this.f30598d = audioAttributesCompat.a();
        }
    }
}
