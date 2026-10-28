package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.util.Pair;
import android.util.Range;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f72607a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f72608b = true;

    /* renamed from: c, reason: collision with root package name */
    private final MediaCodec f72609c;

    /* renamed from: d, reason: collision with root package name */
    private final String f72610d;

    /* renamed from: e, reason: collision with root package name */
    private final VideoEncodeParams f72611e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f72612f;

    /* renamed from: com.tencent.liteav.videoproducer.encoder.a$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f72613a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f72614b;

        static {
            int[] iArr = new int[VideoEncoderDef.EncoderProfile.values().length];
            f72614b = iArr;
            try {
                iArr[VideoEncoderDef.EncoderProfile.f72588b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72614b[VideoEncoderDef.EncoderProfile.f72589c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72614b[VideoEncoderDef.EncoderProfile.f72587a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VideoEncoderDef.BitrateMode.values().length];
            f72613a = iArr2;
            try {
                iArr2[VideoEncoderDef.BitrateMode.f72568b.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f72613a[VideoEncoderDef.BitrateMode.f72569c.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f72613a[VideoEncoderDef.BitrateMode.f72570d.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public a(MediaCodec mediaCodec, String str, VideoEncodeParams videoEncodeParams, Boolean bool) {
        this.f72609c = mediaCodec;
        this.f72610d = str;
        this.f72611e = videoEncodeParams;
        this.f72612f = bool;
    }

    private void c(MediaFormat mediaFormat, int i4, int i5) {
        MediaCodecInfo.VideoCapabilities a5;
        if (mediaFormat == null || (a5 = a(i4, i5)) == null) {
            return;
        }
        int widthAlignment = a5.getWidthAlignment();
        int heightAlignment = a5.getHeightAlignment();
        Object[] objArr = {Integer.valueOf(widthAlignment), Integer.valueOf(heightAlignment)};
        String s4 = ProtectedSandApp.s("坎\u0001");
        LiteavLog.i(s4, ProtectedSandApp.s("坞\u0001"), objArr);
        if (widthAlignment < 2 || heightAlignment < 2 || widthAlignment % 2 != 0 || heightAlignment % 2 != 0) {
            return;
        }
        String s5 = ProtectedSandApp.s("坏\u0001");
        int integer = mediaFormat.getInteger(s5);
        String s6 = ProtectedSandApp.s("坐\u0001");
        int integer2 = mediaFormat.getInteger(s6);
        int i6 = (integer / widthAlignment) * widthAlignment;
        int i7 = (integer2 / heightAlignment) * heightAlignment;
        if (integer == i6 && integer2 == i7) {
            return;
        }
        mediaFormat.setInteger(s5, i6);
        mediaFormat.setInteger(s6, i7);
        LiteavLog.i(s4, ProtectedSandApp.s("坟\u0001"), Integer.valueOf(integer), Integer.valueOf(integer2), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(widthAlignment), Integer.valueOf(heightAlignment));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.media.MediaFormat a() {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.encoder.a.a():android.media.MediaFormat");
    }

    public final MediaFormat b() {
        int i4;
        MediaFormat createVideoFormat;
        VideoEncodeParams videoEncodeParams = this.f72611e;
        int i5 = videoEncodeParams.width;
        if (i5 == 0 || (i4 = videoEncodeParams.height) == 0 || videoEncodeParams.bitrate == 0 || videoEncodeParams.fps == 0 || (createVideoFormat = MediaFormat.createVideoFormat(this.f72610d, i5, i4)) == null) {
            return null;
        }
        createVideoFormat.setInteger(ProtectedSandApp.s("坧\u0001"), this.f72611e.bitrate * 1024);
        createVideoFormat.setInteger(ProtectedSandApp.s("坫\u0001"), this.f72611e.fps);
        createVideoFormat.setInteger(ProtectedSandApp.s("坬\u0001"), 2130708361);
        VideoEncodeParams videoEncodeParams2 = this.f72611e;
        createVideoFormat.setInteger(ProtectedSandApp.s("坭\u0001"), videoEncodeParams2.fullIFrame ? 0 : videoEncodeParams2.gop);
        return createVideoFormat;
    }

    private static Pair<Integer, Integer> b(MediaFormat mediaFormat) {
        int i4;
        String s4 = ProtectedSandApp.s("坎\u0001");
        int i5 = 0;
        try {
            i4 = mediaFormat.getInteger(ProtectedSandApp.s("坙\u0001"));
        } catch (Throwable th) {
            LiteavLog.i(s4, ProtectedSandApp.s("坚\u0001"), th);
            i4 = 0;
        }
        try {
            i5 = mediaFormat.getInteger(ProtectedSandApp.s("坛\u0001"));
        } catch (Throwable th2) {
            LiteavLog.i(s4, ProtectedSandApp.s("坜\u0001"), th2);
        }
        return new Pair<>(Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private void b(MediaFormat mediaFormat, int i4, int i5) {
        MediaCodecInfo.VideoCapabilities a5;
        if (mediaFormat == null || (a5 = a(i4, i5)) == null) {
            return;
        }
        Range<Integer> supportedWidths = a5.getSupportedWidths();
        Range<Integer> supportedHeights = a5.getSupportedHeights();
        if (supportedWidths == null || supportedHeights == null) {
            return;
        }
        Integer lower = supportedWidths.getLower();
        Integer lower2 = supportedHeights.getLower();
        MediaCodecInfo.VideoCapabilities c5 = c();
        if (c5 != null) {
            Range<Integer> supportedWidths2 = c5.getSupportedWidths();
            Range<Integer> supportedHeights2 = c5.getSupportedHeights();
            if (supportedWidths2 != null && supportedHeights2 != null) {
                lower = Integer.valueOf(Math.max(lower.intValue(), supportedWidths2.getLower().intValue()));
                lower2 = Integer.valueOf(Math.max(lower2.intValue(), supportedHeights2.getLower().intValue()));
            }
        }
        if (lower.intValue() < 0 || lower2.intValue() < 0) {
            return;
        }
        String s4 = ProtectedSandApp.s("坏\u0001");
        int integer = mediaFormat.getInteger(s4);
        String s5 = ProtectedSandApp.s("坐\u0001");
        int integer2 = mediaFormat.getInteger(s5);
        if (lower.intValue() > integer || lower2.intValue() > integer2) {
            float f4 = integer;
            float f5 = integer2;
            float max = Math.max(lower.intValue() / (f4 * 1.0f), lower2.intValue() / (1.0f * f5));
            mediaFormat.setInteger(s4, (int) (f4 * max));
            mediaFormat.setInteger(s5, (int) (max * f5));
            LiteavLog.i(ProtectedSandApp.s("坎\u0001"), ProtectedSandApp.s("坝\u0001"), lower, lower2);
        }
    }

    private MediaCodecInfo.VideoCapabilities c() {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        if (this.f72609c == null || LiteavSystemInfo.getSystemOSVersionInt() < 21 || (capabilitiesForType = this.f72609c.getCodecInfo().getCapabilitiesForType(this.f72610d)) == null) {
            return null;
        }
        return capabilitiesForType.getVideoCapabilities();
    }

    private boolean a(int i4, MediaCodecInfo.EncoderCapabilities encoderCapabilities) {
        Boolean bool;
        if (i4 == 2 && (bool = this.f72612f) != null) {
            return bool.booleanValue();
        }
        return encoderCapabilities.isBitrateModeSupported(i4);
    }

    public final void a(MediaFormat mediaFormat) {
        if (mediaFormat != null && LiteavSystemInfo.getSystemOSVersionInt() >= 23) {
            Pair<Integer, Integer> b5 = b(mediaFormat);
            int intValue = ((Integer) b5.first).intValue();
            int intValue2 = ((Integer) b5.second).intValue();
            a(mediaFormat, intValue, intValue2);
            b(mediaFormat, intValue, intValue2);
            c(mediaFormat, intValue, intValue2);
        }
    }

    private void a(MediaFormat mediaFormat, int i4, int i5) {
        Range<Integer> range;
        Range<Integer> range2;
        Range<Integer> range3;
        if (mediaFormat == null) {
            return;
        }
        MediaCodecInfo.VideoCapabilities a5 = a(i4, i5);
        Range<Integer> range4 = null;
        if (a5 != null) {
            range2 = a5.getSupportedWidths();
            range = a5.getSupportedHeights();
        } else {
            range = null;
            range2 = null;
        }
        MediaCodecInfo.VideoCapabilities c5 = c();
        if (c5 != null) {
            range4 = c5.getSupportedWidths();
            range3 = c5.getSupportedHeights();
        } else {
            range3 = null;
        }
        Integer num = Integer.MAX_VALUE;
        Integer num2 = Integer.MAX_VALUE;
        if (range2 != null && range != null) {
            num = range2.getUpper();
            num2 = range.getUpper();
        }
        if (range4 != null && range3 != null) {
            num = Integer.valueOf(Math.min(num.intValue(), range4.getUpper().intValue()));
            num2 = Integer.valueOf(Math.min(num2.intValue(), range3.getUpper().intValue()));
        }
        int intValue = num.intValue();
        String s4 = ProtectedSandApp.s("坎\u0001");
        if (intValue != Integer.MAX_VALUE && num2.intValue() != Integer.MAX_VALUE) {
            String s5 = ProtectedSandApp.s("坏\u0001");
            int integer = mediaFormat.getInteger(s5);
            String s6 = ProtectedSandApp.s("坐\u0001");
            int integer2 = mediaFormat.getInteger(s6);
            if ((integer > integer2 && num.intValue() < num2.intValue()) || (integer < integer2 && num.intValue() > num2.intValue())) {
                Integer num3 = num2;
                num2 = num;
                num = num3;
            }
            if (num.intValue() < integer || num2.intValue() < integer2) {
                float f4 = integer;
                float f5 = integer2;
                float min = Math.min(num.intValue() / (f4 * 1.0f), num2.intValue() / (1.0f * f5));
                mediaFormat.setInteger(s5, (int) (f4 * min));
                mediaFormat.setInteger(s6, (int) (f5 * min));
                LiteavLog.i(s4, ProtectedSandApp.s("坑\u0001") + integer + ProtectedSandApp.s("坒\u0001") + integer2 + ProtectedSandApp.s("坓\u0001") + min + ProtectedSandApp.s("坔\u0001") + range2 + ProtectedSandApp.s("坕\u0001") + range + ProtectedSandApp.s("坖\u0001") + range4 + ProtectedSandApp.s("块\u0001") + range3);
                return;
            }
            return;
        }
        LiteavLog.w(s4, ProtectedSandApp.s("坘\u0001"));
    }

    private MediaCodecInfo.VideoCapabilities a(int i4, int i5) {
        MediaCodecInfo.CodecCapabilities createFromProfileLevel;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 21 && (createFromProfileLevel = MediaCodecInfo.CodecCapabilities.createFromProfileLevel(this.f72610d, i4, i5)) != null) {
            return createFromProfileLevel.getVideoCapabilities();
        }
        return null;
    }
}
