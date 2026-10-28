package org.webrtc;

import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes9.dex */
public class RtpParameters {
    private static final Logger logger = Logger.getLogger("RtpParameters");
    private static DegradationPreference mDegradationPreferenceMode;
    public final List<Codec> codecs;

    @androidx.annotation.q0
    public DegradationPreference degradationPreference;
    public final List<Encoding> encodings;
    private final List<HeaderExtension> headerExtensions;
    private final Rtcp rtcp;
    public final String transactionId;

    public static class Codec {
        public Integer clockRate;
        MediaStreamTrack.MediaType kind;
        public String name;
        public Integer numChannels;
        public Map<String, String> parameters;
        public int payloadType;

        @CalledByNative("Codec")
        Codec(int i4, String str, MediaStreamTrack.MediaType mediaType, Integer num, Integer num2, Map<String, String> map) {
            this.payloadType = i4;
            this.name = str;
            this.kind = mediaType;
            this.clockRate = num;
            this.numChannels = num2;
            this.parameters = map;
        }

        @CalledByNative("Codec")
        Integer getClockRate() {
            return this.clockRate;
        }

        @CalledByNative("Codec")
        MediaStreamTrack.MediaType getKind() {
            return this.kind;
        }

        @CalledByNative("Codec")
        String getName() {
            return this.name;
        }

        @CalledByNative("Codec")
        Integer getNumChannels() {
            return this.numChannels;
        }

        @CalledByNative("Codec")
        Map getParameters() {
            return this.parameters;
        }

        @CalledByNative("Codec")
        int getPayloadType() {
            return this.payloadType;
        }
    }

    public enum DegradationPreference {
        DISABLED,
        MAINTAIN_FRAMERATE,
        MAINTAIN_RESOLUTION,
        BALANCED;

        @CalledByNative("DegradationPreference")
        static DegradationPreference fromNativeIndex(int i4) {
            return values()[i4];
        }
    }

    public static class HeaderExtension {
        private final boolean encrypted;

        /* renamed from: id, reason: collision with root package name */
        private final int f88476id;
        private final String uri;

        @CalledByNative("HeaderExtension")
        HeaderExtension(String str, int i4, boolean z4) {
            this.uri = str;
            this.f88476id = i4;
            this.encrypted = z4;
        }

        @CalledByNative("HeaderExtension")
        public boolean getEncrypted() {
            return this.encrypted;
        }

        @CalledByNative("HeaderExtension")
        public int getId() {
            return this.f88476id;
        }

        @CalledByNative("HeaderExtension")
        public String getUri() {
            return this.uri;
        }
    }

    public static class Rtcp {
        private final String cname;
        private final boolean reducedSize;

        @CalledByNative("Rtcp")
        Rtcp(String str, boolean z4) {
            this.cname = str;
            this.reducedSize = z4;
        }

        @CalledByNative("Rtcp")
        public String getCname() {
            return this.cname;
        }

        @CalledByNative("Rtcp")
        public boolean getReducedSize() {
            return this.reducedSize;
        }
    }

    @CalledByNative
    RtpParameters(String str, DegradationPreference degradationPreference, Rtcp rtcp, List<HeaderExtension> list, List<Encoding> list2, List<Codec> list3) {
        DegradationPreference degradationPreference2;
        this.transactionId = str;
        if (degradationPreference != null) {
            this.degradationPreference = degradationPreference;
        }
        DegradationPreference degradationPreference3 = this.degradationPreference;
        if (degradationPreference3 == null && (degradationPreference2 = mDegradationPreferenceMode) != null) {
            this.degradationPreference = degradationPreference2;
        } else if (degradationPreference3 == null) {
            this.degradationPreference = DegradationPreference.BALANCED;
        }
        logger.info("DegradationPreference " + this.degradationPreference);
        this.rtcp = rtcp;
        this.headerExtensions = list;
        this.encodings = list2;
        this.codecs = list3;
    }

    @CalledByNative
    List<Codec> getCodecs() {
        return this.codecs;
    }

    @CalledByNative
    DegradationPreference getDegradationPreference() {
        return this.degradationPreference;
    }

    @CalledByNative
    List<Encoding> getEncodings() {
        return this.encodings;
    }

    @CalledByNative
    public List<HeaderExtension> getHeaderExtensions() {
        return this.headerExtensions;
    }

    @CalledByNative
    public Rtcp getRtcp() {
        return this.rtcp;
    }

    @CalledByNative
    String getTransactionId() {
        return this.transactionId;
    }

    public static class Encoding {
        public boolean active;
        public boolean adaptiveAudioPacketTime;
        public double bitratePriority;

        @androidx.annotation.q0
        public Integer maxBitrateBps;

        @androidx.annotation.q0
        public Integer maxFramerate;

        @androidx.annotation.q0
        public Integer minBitrateBps;
        public int networkPriority;

        @androidx.annotation.q0
        public Integer numTemporalLayers;

        @androidx.annotation.q0
        public String rid;

        @androidx.annotation.q0
        public Double scaleResolutionDownBy;
        public Long ssrc;

        public Encoding(String str, boolean z4, Double d5) {
            this.bitratePriority = 1.0d;
            this.networkPriority = 1;
            this.rid = str;
            this.active = z4;
            this.scaleResolutionDownBy = d5;
        }

        @CalledByNative("Encoding")
        boolean getActive() {
            return this.active;
        }

        @CalledByNative("Encoding")
        boolean getAdaptivePTime() {
            return this.adaptiveAudioPacketTime;
        }

        @CalledByNative("Encoding")
        double getBitratePriority() {
            return this.bitratePriority;
        }

        @androidx.annotation.q0
        @CalledByNative("Encoding")
        Integer getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        @androidx.annotation.q0
        @CalledByNative("Encoding")
        Integer getMaxFramerate() {
            return this.maxFramerate;
        }

        @androidx.annotation.q0
        @CalledByNative("Encoding")
        Integer getMinBitrateBps() {
            return this.minBitrateBps;
        }

        @CalledByNative("Encoding")
        int getNetworkPriority() {
            return this.networkPriority;
        }

        @androidx.annotation.q0
        @CalledByNative("Encoding")
        Integer getNumTemporalLayers() {
            return this.numTemporalLayers;
        }

        @androidx.annotation.q0
        @CalledByNative("Encoding")
        String getRid() {
            return this.rid;
        }

        @androidx.annotation.q0
        @CalledByNative("Encoding")
        Double getScaleResolutionDownBy() {
            return this.scaleResolutionDownBy;
        }

        @CalledByNative("Encoding")
        Long getSsrc() {
            return this.ssrc;
        }

        @CalledByNative("Encoding")
        Encoding(String str, boolean z4, double d5, int i4, Integer num, Integer num2, Integer num3, Integer num4, Double d6, Long l4, boolean z5) {
            this.rid = str;
            this.active = z4;
            this.bitratePriority = d5;
            this.networkPriority = i4;
            this.maxBitrateBps = num;
            this.minBitrateBps = num2;
            this.maxFramerate = num3;
            this.numTemporalLayers = num4;
            this.scaleResolutionDownBy = d6;
            this.ssrc = l4;
            this.adaptiveAudioPacketTime = z5;
        }
    }
}
