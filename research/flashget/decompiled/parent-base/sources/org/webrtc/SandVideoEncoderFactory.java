package org.webrtc;

import java.util.Arrays;
import java.util.LinkedHashSet;
import org.apache.log4j.Logger;
import org.webrtc.EglBase;

/* loaded from: classes9.dex */
public class SandVideoEncoderFactory implements VideoEncoderFactory {
    private static final Logger logger = Logger.getLogger("SandVideoEncoderFactory");
    private final VideoEncoderFactory hardwareVideoEncoderFactory;
    private final boolean isHwAcc;
    private final VideoEncoderFactory platformSoftwareVideoEncoderFactory;
    private final VideoEncoderFactory softwareVideoEncoderFactory = new SoftwareVideoEncoderFactory();

    public SandVideoEncoderFactory(boolean z4, EglBase.Context context, boolean z5, boolean z6) {
        this.isHwAcc = z4;
        this.hardwareVideoEncoderFactory = new HardwareVideoEncoderFactory(context, z5, z6);
        this.platformSoftwareVideoEncoderFactory = new PlatformSoftwareVideoEncoderFactory(context, z5, z6);
    }

    @Override // org.webrtc.VideoEncoderFactory
    @androidx.annotation.q0
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        Logger logger2 = logger;
        StringBuilder sb = new StringBuilder("createEncoder: ");
        sb.append(videoCodecInfo.getName());
        sb.append(", isHwAcc: ");
        com.flashget.kid.common.components.s.a(sb, this.isHwAcc, logger2);
        VideoEncoder createEncoder = this.softwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        VideoEncoder createEncoder2 = this.platformSoftwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        if (!this.isHwAcc) {
            return (createEncoder == null || createEncoder2 == null) ? createEncoder2 != null ? createEncoder2 : createEncoder : new VideoEncoderFallback(createEncoder, createEncoder2);
        }
        VideoEncoder createEncoder3 = this.hardwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        if (createEncoder2 != null) {
            createEncoder = createEncoder2;
        }
        return (createEncoder3 == null || createEncoder == null) ? createEncoder3 != null ? createEncoder3 : createEncoder : new VideoEncoderFallback(createEncoder, createEncoder3);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(Arrays.asList(this.softwareVideoEncoderFactory.getSupportedCodecs()));
        linkedHashSet.addAll(Arrays.asList(this.hardwareVideoEncoderFactory.getSupportedCodecs()));
        VideoEncoderFactory videoEncoderFactory = this.platformSoftwareVideoEncoderFactory;
        if (videoEncoderFactory != null) {
            linkedHashSet.addAll(Arrays.asList(videoEncoderFactory.getSupportedCodecs()));
        }
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[linkedHashSet.size()]);
    }
}
