package org.webrtc;

import java.util.Arrays;
import java.util.LinkedHashSet;
import org.apache.log4j.Logger;
import org.webrtc.EglBase;

/* loaded from: classes9.dex */
public class SandVideoDecoderFactory implements VideoDecoderFactory {
    private static final Logger logger = Logger.getLogger("SandVideoDecoderFactory");
    private final VideoDecoderFactory hardwareVideoDecoderFactory;
    private final boolean isHwAcc;
    private final VideoDecoderFactory platformSoftwareVideoDecoderFactory;
    private final VideoDecoderFactory softwareVideoDecoderFactory = new SoftwareVideoDecoderFactory();

    public SandVideoDecoderFactory(boolean z4, @androidx.annotation.q0 EglBase.Context context) {
        this.isHwAcc = z4;
        this.hardwareVideoDecoderFactory = new HardwareVideoDecoderFactory(context);
        this.platformSoftwareVideoDecoderFactory = new PlatformSoftwareVideoDecoderFactory(context);
    }

    @Override // org.webrtc.VideoDecoderFactory
    @androidx.annotation.q0
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        Logger logger2 = logger;
        StringBuilder sb = new StringBuilder("createDecoder: ");
        sb.append(videoCodecInfo.getName());
        sb.append(", isHwAcc: ");
        com.flashget.kid.common.components.s.a(sb, this.isHwAcc, logger2);
        VideoDecoder createDecoder = this.softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        VideoDecoder createDecoder2 = this.platformSoftwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        if (!this.isHwAcc) {
            return (createDecoder == null || createDecoder2 == null) ? createDecoder2 != null ? createDecoder2 : createDecoder : new VideoDecoderFallback(createDecoder, createDecoder2);
        }
        VideoDecoder createDecoder3 = this.hardwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        if (createDecoder2 != null) {
            createDecoder = createDecoder2;
        }
        return (createDecoder3 == null || createDecoder == null) ? createDecoder3 != null ? createDecoder3 : createDecoder : new VideoDecoderFallback(createDecoder, createDecoder3);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(Arrays.asList(this.softwareVideoDecoderFactory.getSupportedCodecs()));
        linkedHashSet.addAll(Arrays.asList(this.hardwareVideoDecoderFactory.getSupportedCodecs()));
        VideoDecoderFactory videoDecoderFactory = this.platformSoftwareVideoDecoderFactory;
        if (videoDecoderFactory != null) {
            linkedHashSet.addAll(Arrays.asList(videoDecoderFactory.getSupportedCodecs()));
        }
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[linkedHashSet.size()]);
    }
}
