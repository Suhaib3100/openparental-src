package com.tencent.cos.xml.transfer;

import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes7.dex */
public class TransferConfig {
    protected long divisionForCopy;
    protected long divisionForUpload;
    private boolean forceSimpleUpload;
    protected long sliceSizeForCopy;
    protected long sliceSizeForUpload;
    private boolean verifyCRC64;

    public static class Builder {
        private long divisionForCopy = 5242880;
        private long sliceSizeForCopy = 5242880;
        private long divisionForUpload = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
        private long sliceSizeForUpload = 1048576;
        private boolean forceSimpleUpload = false;
        private boolean verifyCRC64 = true;

        public TransferConfig build() {
            return new TransferConfig(this);
        }

        public Builder setDividsionForCopy(long j4) {
            if (j4 > 0) {
                this.divisionForCopy = j4;
            }
            return this;
        }

        public Builder setDivisionForUpload(long j4) {
            if (j4 > 0) {
                this.divisionForUpload = j4;
            }
            return this;
        }

        public Builder setForceSimpleUpload(boolean z4) {
            this.forceSimpleUpload = z4;
            return this;
        }

        public Builder setSliceSizeForCopy(long j4) {
            if (j4 > 0) {
                this.sliceSizeForCopy = j4;
            }
            return this;
        }

        public Builder setSliceSizeForUpload(long j4) {
            if (j4 > 0) {
                this.sliceSizeForUpload = j4;
            }
            return this;
        }

        public Builder setVerifyCRC64(boolean z4) {
            this.verifyCRC64 = z4;
            return this;
        }
    }

    TransferConfig(Builder builder) {
        this.verifyCRC64 = true;
        this.divisionForCopy = builder.divisionForCopy;
        this.sliceSizeForCopy = builder.sliceSizeForCopy;
        this.divisionForUpload = builder.divisionForUpload;
        this.sliceSizeForUpload = builder.sliceSizeForUpload;
        this.forceSimpleUpload = builder.forceSimpleUpload;
        this.verifyCRC64 = builder.verifyCRC64;
    }

    public long getDivisionForCopy() {
        return this.divisionForCopy;
    }

    public boolean isForceSimpleUpload() {
        return this.forceSimpleUpload;
    }

    public boolean isVerifyCRC64() {
        return this.verifyCRC64;
    }
}
