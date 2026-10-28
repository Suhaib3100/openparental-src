package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaFormat;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.videobase.e;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public interface VideoEncoderDef {

    public enum BitrateMode {
        f72567a(-1),
        f72568b(0),
        f72569c(1),
        f72570d(2);


        /* renamed from: e, reason: collision with root package name */
        private static final BitrateMode[] f72571e = values();
        public int mValue;

        BitrateMode(int i4) {
            this.mValue = i4;
        }

        public static BitrateMode a(int i4) {
            for (BitrateMode bitrateMode : f72571e) {
                if (i4 == bitrateMode.mValue) {
                    return bitrateMode;
                }
            }
            return f72569c;
        }
    }

    public static class EncodeAbility {

        /* renamed from: a, reason: collision with root package name */
        public boolean f72573a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f72574b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f72575c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f72576d;

        public boolean isSupportHwHEVC() {
            return this.f72576d;
        }

        public boolean isSupportRPS() {
            return this.f72573a;
        }

        public boolean isSupportSVC() {
            return this.f72574b;
        }

        public boolean isSupportSwHEVC() {
            return this.f72575c;
        }
    }

    public enum EncodeScene {
        f72577a(0),
        f72578b(1);

        int mValue;

        EncodeScene(int i4) {
            this.mValue = i4;
        }

        public static EncodeScene a(int i4) {
            for (EncodeScene encodeScene : values()) {
                if (encodeScene.mValue == i4) {
                    return encodeScene;
                }
            }
            return f72577a;
        }
    }

    public enum EncoderComplexity {
        f72580a(65535),
        f72581b(0),
        f72582c(1),
        f72583d(2),
        f72584e(3),
        f72585f(4);

        final int mValue;

        EncoderComplexity(int i4) {
            this.mValue = i4;
        }

        public static EncoderComplexity a(int i4) {
            for (EncoderComplexity encoderComplexity : values()) {
                if (encoderComplexity.mValue == i4) {
                    return encoderComplexity;
                }
            }
            return f72580a;
        }
    }

    public enum EncoderProfile {
        f72587a(1),
        f72588b(2),
        f72589c(3),
        f72590d(11),
        f72591e(12),
        f72592f(13);


        /* renamed from: g, reason: collision with root package name */
        private static final EncoderProfile[] f72593g = values();
        int mValue;

        EncoderProfile(int i4) {
            this.mValue = i4;
        }

        public static EncoderProfile a(int i4) {
            for (EncoderProfile encoderProfile : f72593g) {
                if (i4 == encoderProfile.mValue) {
                    return encoderProfile;
                }
            }
            return f72587a;
        }
    }

    public static class EncoderProperty {

        /* renamed from: a, reason: collision with root package name */
        public a f72595a;

        /* renamed from: b, reason: collision with root package name */
        public ReferenceStrategy f72596b;

        /* renamed from: c, reason: collision with root package name */
        public CodecType f72597c;

        public int getCodecType() {
            return this.f72597c.mValue;
        }

        public int getEncoderType() {
            return this.f72595a.value;
        }

        public int getReferenceStrategy() {
            return this.f72596b.mValue;
        }
    }

    public enum ReferenceStrategy {
        f72598a(0),
        f72599b(1),
        f72600c(2),
        f72601d(3);


        /* renamed from: e, reason: collision with root package name */
        private static final ReferenceStrategy[] f72602e = values();
        int mValue;

        ReferenceStrategy(int i4) {
            this.mValue = i4;
        }

        public static ReferenceStrategy a(int i4) {
            for (ReferenceStrategy referenceStrategy : f72602e) {
                if (i4 == referenceStrategy.mValue) {
                    return referenceStrategy;
                }
            }
            return f72598a;
        }
    }

    public enum a {
        f72604a(1),
        f72605b(2);

        int value;

        a(int i4) {
            this.value = i4;
        }
    }

    public static abstract class b {
        public void onBitrateModeUpdated(BitrateMode bitrateMode) {
        }

        public void onEncodedFail(e.a aVar) {
        }

        public void onEncodedNAL(EncodedVideoFrame encodedVideoFrame, boolean z4) {
        }

        public void onOutputFormatChanged(MediaFormat mediaFormat) {
        }
    }
}
