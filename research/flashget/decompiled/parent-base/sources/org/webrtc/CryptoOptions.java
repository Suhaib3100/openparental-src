package org.webrtc;

/* loaded from: classes9.dex */
public final class CryptoOptions {
    private final SFrame sframe;
    private final Srtp srtp;

    public static class Builder {
        private boolean enableAes128Sha1_32CryptoCipher;
        private boolean enableEncryptedRtpHeaderExtensions;
        private boolean enableGcmCryptoSuites;
        private boolean requireFrameEncryption;

        public CryptoOptions createCryptoOptions() {
            return new CryptoOptions(this.enableGcmCryptoSuites, this.enableAes128Sha1_32CryptoCipher, this.enableEncryptedRtpHeaderExtensions, this.requireFrameEncryption);
        }

        public Builder setEnableAes128Sha1_32CryptoCipher(boolean z4) {
            this.enableAes128Sha1_32CryptoCipher = z4;
            return this;
        }

        public Builder setEnableEncryptedRtpHeaderExtensions(boolean z4) {
            this.enableEncryptedRtpHeaderExtensions = z4;
            return this;
        }

        public Builder setEnableGcmCryptoSuites(boolean z4) {
            this.enableGcmCryptoSuites = z4;
            return this;
        }

        public Builder setRequireFrameEncryption(boolean z4) {
            this.requireFrameEncryption = z4;
            return this;
        }

        private Builder() {
        }
    }

    public final class SFrame {
        private final boolean requireFrameEncryption;

        @CalledByNative("SFrame")
        public boolean getRequireFrameEncryption() {
            return this.requireFrameEncryption;
        }

        private SFrame(boolean z4) {
            this.requireFrameEncryption = z4;
        }
    }

    public final class Srtp {
        private final boolean enableAes128Sha1_32CryptoCipher;
        private final boolean enableEncryptedRtpHeaderExtensions;
        private final boolean enableGcmCryptoSuites;

        @CalledByNative("Srtp")
        public boolean getEnableAes128Sha1_32CryptoCipher() {
            return this.enableAes128Sha1_32CryptoCipher;
        }

        @CalledByNative("Srtp")
        public boolean getEnableEncryptedRtpHeaderExtensions() {
            return this.enableEncryptedRtpHeaderExtensions;
        }

        @CalledByNative("Srtp")
        public boolean getEnableGcmCryptoSuites() {
            return this.enableGcmCryptoSuites;
        }

        private Srtp(boolean z4, boolean z5, boolean z6) {
            this.enableGcmCryptoSuites = z4;
            this.enableAes128Sha1_32CryptoCipher = z5;
            this.enableEncryptedRtpHeaderExtensions = z6;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @CalledByNative
    public SFrame getSFrame() {
        return this.sframe;
    }

    @CalledByNative
    public Srtp getSrtp() {
        return this.srtp;
    }

    private CryptoOptions(boolean z4, boolean z5, boolean z6, boolean z7) {
        this.srtp = new Srtp(z4, z5, z6);
        this.sframe = new SFrame(z7);
    }
}
