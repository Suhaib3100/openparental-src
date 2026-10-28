package com.tencent.liteav.videobase.base;

/* loaded from: classes7.dex */
public interface GLConstants {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f72135a = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f72136b = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f72137c = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f72138d = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f72139e = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f72140f = {1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f72141g = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: h, reason: collision with root package name */
    public static final float[] f72142h = {1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};

    public enum ColorRange {
        f72143a(0),
        f72144b(1),
        f72145c(2);

        private final int mJniValue;

        ColorRange(int i4) {
            this.mJniValue = i4;
        }

        public static ColorRange a(int i4) {
            for (ColorRange colorRange : values()) {
                if (colorRange.mJniValue == i4) {
                    return colorRange;
                }
            }
            return f72143a;
        }

        public final int getValue() {
            return this.mJniValue;
        }
    }

    public enum ColorSpace {
        f72147a(0),
        f72148b(1),
        f72149c(2);

        private final int mJniValue;

        ColorSpace(int i4) {
            this.mJniValue = i4;
        }

        public static ColorSpace a(int i4) {
            for (ColorSpace colorSpace : values()) {
                if (colorSpace.mJniValue == i4) {
                    return colorSpace;
                }
            }
            return f72147a;
        }

        public final int getValue() {
            return this.mJniValue;
        }
    }

    public enum GLScaleType {
        f72151a(0),
        f72152b(1),
        f72153c(2);


        /* renamed from: d, reason: collision with root package name */
        private static final GLScaleType[] f72154d = values();
        public int mValue;

        GLScaleType(int i4) {
            this.mValue = i4;
        }

        public static GLScaleType a(int i4) {
            for (GLScaleType gLScaleType : f72154d) {
                if (gLScaleType.mValue == i4) {
                    return gLScaleType;
                }
            }
            return f72152b;
        }
    }

    public enum PixelFormatType {
        f72156a(0),
        f72157b(1),
        f72158c(2),
        f72159d(3),
        f72160e(4),
        f72161f(5),
        f72162g(6),
        f72163h(7),
        f72164i(8),
        f72165j(9),
        f72166k(10),
        f72167l(11),
        f72168m(12),
        f72169n(13),
        f72170o(14),
        f72171p(100);


        /* renamed from: q, reason: collision with root package name */
        private static final PixelFormatType[] f72172q = values();
        private final int mJniValue;

        PixelFormatType(int i4) {
            this.mJniValue = i4;
        }

        public static PixelFormatType a(int i4) {
            for (PixelFormatType pixelFormatType : f72172q) {
                if (pixelFormatType.mJniValue == i4) {
                    return pixelFormatType;
                }
            }
            return null;
        }

        public final int getValue() {
            return this.mJniValue;
        }
    }

    public enum a {
        f72174a(0),
        f72175b(1),
        f72176c(2),
        f72177d(3);


        /* renamed from: e, reason: collision with root package name */
        private static final a[] f72178e = values();
        public int mValue;

        a(int i4) {
            this.mValue = i4;
        }

        public static a a(int i4) {
            for (a aVar : f72178e) {
                if (aVar.mValue == i4) {
                    return aVar;
                }
            }
            return f72175b;
        }
    }
}
