package androidx.exifinterface.media;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.r2;
import androidx.constraintlayout.core.motion.utils.w;
import androidx.core.view.h0;
import androidx.exifinterface.media.b;
import androidx.work.i0;
import com.google.firebase.remoteconfig.p;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.apache.commons.lang3.m;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* compiled from: ExifInterface.java */
/* loaded from: classes3.dex */
public class a {
    public static final short A3 = 9;
    public static final short A4 = 2;
    public static final int A5 = 0;
    private static final int A6 = 9;
    private static final byte A7 = -49;
    public static final short B3 = 10;
    public static final short B4 = 3;
    public static final int B5 = 1;
    private static final int B6 = 10;
    private static final byte B7 = -38;
    private static final int C2 = 512;
    public static final short C3 = 11;
    public static final short C4 = 4;
    private static final int C5 = 5000;
    private static final int C6 = 11;
    static final byte C7 = -31;
    public static final int D2 = 0;
    public static final short D3 = 12;
    public static final short D4 = 0;
    private static final int D6 = 12;
    private static final byte D7 = -2;
    public static final int E2 = 1;
    public static final short E3 = 13;
    public static final short E4 = 1;
    private static final int E6 = 13;
    static final byte E7 = -39;
    public static final int F2 = 2;
    public static final short F3 = 14;
    public static final short F4 = 2;
    private static final int F5 = 84;
    private static final int F6 = 8192;
    static final int F7 = 0;
    public static final int G2 = 3;
    public static final short G3 = 15;
    public static final short G4 = 0;
    static final int G7 = 1;
    public static final int H2 = 4;
    public static final short H3 = 16;
    public static final short H4 = 0;
    static final int H7 = 2;
    public static final int I2 = 5;
    public static final short I3 = 17;
    public static final short I4 = 0;
    static final int I7 = 3;
    public static final int J2 = 6;
    public static final short J3 = 18;
    public static final short J4 = 0;
    private static final short J5 = 20306;
    private static final f[] J6;
    static final int J7 = 4;
    public static final int K2 = 7;
    public static final short K3 = 19;
    public static final short K4 = 1;
    private static final short K5 = 21330;
    private static final f[] K6;
    static final int K7 = 5;
    public static final int L2 = 8;
    public static final short L3 = 20;
    public static final short L4 = 2;
    private static final f[] L6;
    static final int L7 = 6;
    public static final short M3 = 21;
    public static final short M4 = 0;
    private static final f[] M6;
    static final int M7 = 7;
    public static final short N3 = 22;
    public static final short N4 = 1;
    private static final int N5 = 8;
    private static final f[] N6;
    static final int N7 = 8;
    public static final short O2 = 1;
    public static final short O3 = 23;
    public static final short O4 = 2;
    private static final int O5 = 12;
    private static final f O6;
    static final int O7 = 9;
    public static final short P2 = 2;
    public static final short P3 = 24;
    public static final short P4 = 3;
    private static final short P5 = 85;
    private static final f[] P6;
    static final int P7 = 10;
    public static final short Q2 = 1;
    public static final short Q3 = 255;
    private static final f[] Q6;
    static final int Q7 = 11;
    public static final short R2 = 2;
    public static final short R3 = 1;
    private static final int R5 = 6;
    private static final f[] R6;
    static final int R7 = 12;
    public static final short S2 = 2;
    public static final short S3 = 4;
    private static final f[] S6;
    static final int S7 = 13;
    public static final short T2 = 3;
    public static final short T3 = 6;
    static final int T6 = 0;
    static final int T7 = 14;
    public static final int U2 = 1;
    public static final short U3 = 8;
    public static final short U4 = 0;
    private static final int U6 = 1;
    private static final Pattern U7;
    public static final int V2 = 65535;
    public static final short V3 = 16;
    public static final short V4 = 1;
    private static final int V6 = 2;
    private static final Pattern V7;
    public static final short W2 = 0;
    public static final short W3 = 24;
    private static final int W5 = 4;
    private static final int W6 = 3;
    private static final Pattern W7;
    public static final short X2 = 1;
    public static final short X3 = 32;
    private static final int X5 = 4;
    static final int X6 = 4;
    private static final Pattern X7;
    public static final short Y2 = 2;
    public static final short Y3 = 64;
    static final int Y6 = 5;
    private static final int Y7 = 19;
    public static final short Z2 = 3;
    public static final short Z3 = 1;
    private static final int Z6 = 6;

    /* renamed from: a3, reason: collision with root package name */
    public static final short f29561a3 = 4;

    /* renamed from: a4, reason: collision with root package name */
    public static final short f29562a4 = 2;
    private static final int a6 = 4;
    private static final int a7 = 7;

    /* renamed from: b3, reason: collision with root package name */
    public static final short f29566b3 = 5;

    /* renamed from: b4, reason: collision with root package name */
    public static final short f29567b4 = 3;
    private static final int b7 = 8;

    /* renamed from: c3, reason: collision with root package name */
    public static final short f29571c3 = 6;

    /* renamed from: c4, reason: collision with root package name */
    public static final short f29572c4 = 4;
    private static final int c7 = 9;

    /* renamed from: d3, reason: collision with root package name */
    public static final short f29576d3 = 7;

    /* renamed from: d4, reason: collision with root package name */
    public static final short f29577d4 = 5;
    private static final byte d6 = 47;
    static final f[][] d7;

    /* renamed from: e3, reason: collision with root package name */
    public static final short f29581e3 = 8;
    public static final short e4 = 7;
    private static final f[] e7;

    /* renamed from: f3, reason: collision with root package name */
    public static final short f29585f3 = 0;
    public static final short f4 = 8;
    private static final HashMap<Integer, f>[] f7;

    /* renamed from: g3, reason: collision with root package name */
    public static final short f29589g3 = 1;
    public static final short g4 = 0;
    private static final HashMap<String, f>[] g7;

    /* renamed from: h3, reason: collision with root package name */
    public static final short f29593h3 = 2;
    public static final short h4 = 1;
    private static final HashSet<String> h7;

    /* renamed from: i3, reason: collision with root package name */
    public static final short f29597i3 = 3;
    public static final short i4 = 2;
    public static final short i5 = 0;
    private static final HashMap<Integer, Integer> i7;

    /* renamed from: j3, reason: collision with root package name */
    public static final short f29601j3 = 4;
    public static final short j4 = 3;
    public static final short j5 = 1;
    private static final int j6 = 10;
    static final Charset j7;

    /* renamed from: k3, reason: collision with root package name */
    public static final short f29605k3 = 5;
    public static final short k4 = 1;
    public static final int k5 = 1;
    private static final int k6 = 4;
    static final byte[] k7;

    /* renamed from: l3, reason: collision with root package name */
    public static final short f29609l3 = 6;
    public static final short l4 = 0;
    public static final int l5 = 2;
    private static final int l6 = 4;
    private static final byte[] l7;

    /* renamed from: m3, reason: collision with root package name */
    public static final short f29613m3 = 7;
    public static final short m4 = 1;
    public static final int m5 = 6;
    private static SimpleDateFormat m6 = null;
    static final byte m7 = -1;

    /* renamed from: n3, reason: collision with root package name */
    public static final short f29617n3 = 0;
    public static final short n4 = 0;
    public static final int n5 = 7;
    private static SimpleDateFormat n6 = null;

    /* renamed from: o3, reason: collision with root package name */
    public static final short f29621o3 = 1;
    public static final short o4 = 1;
    public static final int o5 = 8;
    static final short o6 = 18761;
    private static final byte o7 = -64;

    /* renamed from: p3, reason: collision with root package name */
    public static final short f29625p3 = 2;
    public static final short p4 = 2;
    public static final int p5 = 32773;
    static final short p6 = 19789;
    private static final byte p7 = -63;

    /* renamed from: q3, reason: collision with root package name */
    public static final short f29629q3 = 3;

    @Deprecated
    public static final int q4 = 0;
    public static final int q5 = 34892;
    private static final byte q7 = -62;

    /* renamed from: r3, reason: collision with root package name */
    public static final short f29633r3 = 4;

    @Deprecated
    public static final int r4 = 1;
    private static final int r6 = 8;
    private static final byte r7 = -61;

    /* renamed from: s3, reason: collision with root package name */
    public static final short f29637s3 = 5;
    public static final short s4 = 0;
    private static final int s6 = 1;
    private static final byte s7 = -59;

    /* renamed from: t3, reason: collision with root package name */
    public static final short f29641t3 = 6;
    public static final short t4 = 1;
    private static final int t6 = 2;
    private static final byte t7 = -58;

    /* renamed from: u3, reason: collision with root package name */
    public static final short f29645u3 = 255;
    public static final short u4 = 0;
    public static final int u5 = 0;
    private static final int u6 = 3;
    private static final byte u7 = -57;

    /* renamed from: v3, reason: collision with root package name */
    public static final short f29650v3 = 0;
    public static final short v4 = 1;
    public static final int v5 = 1;
    private static final int v6 = 4;
    private static final byte v7 = -55;

    /* renamed from: w3, reason: collision with root package name */
    public static final short f29655w3 = 1;
    public static final short w4 = 2;
    public static final int w5 = 2;
    private static final int w6 = 5;
    private static final byte w7 = -54;

    /* renamed from: x3, reason: collision with root package name */
    public static final short f29660x3 = 2;
    public static final short x4 = 3;
    public static final int x5 = 6;
    private static final int x6 = 6;
    private static final byte x7 = -53;

    /* renamed from: y3, reason: collision with root package name */
    public static final short f29665y3 = 3;
    public static final short y4 = 0;
    public static final int y5 = 0;
    private static final int y6 = 7;
    private static final byte y7 = -51;

    /* renamed from: z3, reason: collision with root package name */
    public static final short f29670z3 = 4;
    public static final short z4 = 1;
    public static final int z5 = 1;
    private static final int z6 = 8;
    private static final byte z7 = -50;

    /* renamed from: a, reason: collision with root package name */
    private String f29671a;

    /* renamed from: b, reason: collision with root package name */
    private FileDescriptor f29672b;

    /* renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f29673c;

    /* renamed from: d, reason: collision with root package name */
    private int f29674d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f29675e;

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, d>[] f29676f;

    /* renamed from: g, reason: collision with root package name */
    private Set<Integer> f29677g;

    /* renamed from: h, reason: collision with root package name */
    private ByteOrder f29678h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f29679i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f29680j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f29681k;

    /* renamed from: l, reason: collision with root package name */
    private int f29682l;

    /* renamed from: m, reason: collision with root package name */
    private int f29683m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f29684n;

    /* renamed from: o, reason: collision with root package name */
    private int f29685o;

    /* renamed from: p, reason: collision with root package name */
    private int f29686p;

    /* renamed from: q, reason: collision with root package name */
    private int f29687q;

    /* renamed from: r, reason: collision with root package name */
    private int f29688r;

    /* renamed from: s, reason: collision with root package name */
    private int f29689s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f29690t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f29691u;
    public static final String Q1 = "GPSDestLatitudeRef";

    /* renamed from: r2, reason: collision with root package name */
    public static final String f29632r2 = "ISO";
    public static final String Q4 = "N";
    private static final String Q5 = "PENTAX";

    /* renamed from: j0, reason: collision with root package name */
    public static final String f29598j0 = "MakerNote";
    public static final String I0 = "ApertureValue";

    /* renamed from: j1, reason: collision with root package name */
    public static final String f29599j1 = "GainControl";
    public static final String I1 = "GPSDOP";

    /* renamed from: j2, reason: collision with root package name */
    public static final String f29600j2 = "ThumbnailImage";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f29563b0 = "ExifVersion";
    public static final String A0 = "OECF";

    /* renamed from: b1, reason: collision with root package name */
    public static final String f29564b1 = "SceneType";
    public static final String A1 = "GPSLongitudeRef";

    /* renamed from: b2, reason: collision with root package name */
    public static final String f29565b2 = "GPSDifferential";
    private static final String A2 = "CameraSettingsIFDPointer";
    public static final String b5 = "M";
    public static final String Z0 = "SensingMethod";
    public static final String Z1 = "GPSAreaInformation";
    public static final String Z4 = "3";

    /* renamed from: s0, reason: collision with root package name */
    public static final String f29634s0 = "SubSecTimeOriginal";
    public static final String R0 = "FocalLength";

    /* renamed from: s1, reason: collision with root package name */
    public static final String f29635s1 = "BodySerialNumber";
    public static final String R1 = "GPSDestLatitude";

    /* renamed from: s2, reason: collision with root package name */
    public static final String f29636s2 = "JpgFromRaw";
    public static final String R4 = "S";

    /* renamed from: k0, reason: collision with root package name */
    public static final String f29602k0 = "UserComment";
    public static final String J0 = "BrightnessValue";

    /* renamed from: k1, reason: collision with root package name */
    public static final String f29603k1 = "Contrast";
    public static final String J1 = "GPSSpeedRef";

    /* renamed from: k2, reason: collision with root package name */
    public static final String f29604k2 = "PreviewImageStart";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f29568c0 = "FlashpixVersion";
    public static final String B0 = "SensitivityType";

    /* renamed from: c1, reason: collision with root package name */
    public static final String f29569c1 = "CFAPattern";
    public static final String B1 = "GPSLongitude";

    /* renamed from: c2, reason: collision with root package name */
    public static final String f29570c2 = "GPSHPositioningError";
    private static final String B2 = "ImageProcessingIFDPointer";
    public static final String c5 = "N";

    /* renamed from: t0, reason: collision with root package name */
    public static final String f29638t0 = "SubSecTimeDigitized";
    public static final String S0 = "FlashEnergy";

    /* renamed from: t1, reason: collision with root package name */
    public static final String f29639t1 = "LensSpecification";
    public static final String S1 = "GPSDestLongitudeRef";

    /* renamed from: t2, reason: collision with root package name */
    public static final String f29640t2 = "Xmp";
    public static final String A = "Compression";
    public static final String S4 = "E";
    public static final String B = "PhotometricInterpretation";
    public static final String C = "Orientation";
    public static final String D = "SamplesPerPixel";

    /* renamed from: l0, reason: collision with root package name */
    public static final String f29606l0 = "RelatedSoundFile";
    public static final String E = "PlanarConfiguration";
    public static final String K0 = "ExposureBiasValue";

    /* renamed from: l1, reason: collision with root package name */
    public static final String f29607l1 = "Saturation";
    public static final String F = "YCbCrSubSampling";
    public static final String K1 = "GPSSpeed";

    /* renamed from: l2, reason: collision with root package name */
    public static final String f29608l2 = "PreviewImageLength";
    public static final String G = "YCbCrPositioning";
    public static final String H = "XResolution";
    public static final String I = "YResolution";
    public static final String J = "ResolutionUnit";
    public static final String K = "StripOffsets";
    public static final String L = "RowsPerStrip";

    /* renamed from: d0, reason: collision with root package name */
    public static final String f29573d0 = "ColorSpace";
    public static final String C0 = "StandardOutputSensitivity";
    public static final String M = "StripByteCounts";

    /* renamed from: d1, reason: collision with root package name */
    public static final String f29574d1 = "CustomRendered";
    public static final String C1 = "GPSAltitudeRef";
    public static final String N = "JPEGInterchangeFormat";

    /* renamed from: d2, reason: collision with root package name */
    public static final String f29575d2 = "InteroperabilityIndex";
    public static final String O = "JPEGInterchangeFormatLength";
    public static final String P = "TransferFunction";
    public static final String Q = "WhitePoint";
    public static final String d5 = "T";
    public static final String R = "PrimaryChromaticities";
    public static final String S = "YCbCrCoefficients";
    public static final String T = "ReferenceBlackWhite";
    public static final String U = "DateTime";
    public static final String V = "ImageDescription";
    public static final String W = "Make";
    public static final String X = "Model";
    public static final String Y = "Software";
    public static final String Z = "Artist";

    /* renamed from: u0, reason: collision with root package name */
    public static final String f29642u0 = "ExposureTime";
    public static final String T0 = "SpatialFrequencyResponse";

    /* renamed from: u1, reason: collision with root package name */
    public static final String f29643u1 = "LensMake";
    public static final String T1 = "GPSDestLongitude";

    /* renamed from: u2, reason: collision with root package name */
    public static final String f29644u2 = "NewSubfileType";
    public static final String T4 = "W";

    /* renamed from: m0, reason: collision with root package name */
    public static final String f29610m0 = "DateTimeOriginal";
    public static final String L0 = "MaxApertureValue";

    /* renamed from: m1, reason: collision with root package name */
    public static final String f29611m1 = "Sharpness";
    public static final String L1 = "GPSTrackRef";

    /* renamed from: m2, reason: collision with root package name */
    public static final String f29612m2 = "AspectFrame";

    /* renamed from: e0, reason: collision with root package name */
    public static final String f29578e0 = "Gamma";
    public static final String D0 = "RecommendedExposureIndex";

    /* renamed from: e1, reason: collision with root package name */
    public static final String f29579e1 = "ExposureMode";
    public static final String D1 = "GPSAltitude";

    /* renamed from: e2, reason: collision with root package name */
    public static final String f29580e2 = "ThumbnailImageLength";
    public static final String e5 = "M";

    /* renamed from: v, reason: collision with root package name */
    private static final String f29646v = "ExifInterface";

    /* renamed from: x, reason: collision with root package name */
    public static final String f29656x = "ImageWidth";

    /* renamed from: y, reason: collision with root package name */
    public static final String f29661y = "ImageLength";

    /* renamed from: v0, reason: collision with root package name */
    public static final String f29647v0 = "FNumber";

    /* renamed from: z, reason: collision with root package name */
    public static final String f29666z = "BitsPerSample";
    public static final String U0 = "FocalPlaneXResolution";

    /* renamed from: v1, reason: collision with root package name */
    public static final String f29648v1 = "LensModel";
    public static final String U1 = "GPSDestBearingRef";

    /* renamed from: v2, reason: collision with root package name */
    public static final String f29649v2 = "SubfileType";

    /* renamed from: n0, reason: collision with root package name */
    public static final String f29614n0 = "DateTimeDigitized";
    public static final String M0 = "SubjectDistance";

    /* renamed from: n1, reason: collision with root package name */
    public static final String f29615n1 = "DeviceSettingDescription";
    public static final String M1 = "GPSTrack";

    /* renamed from: n2, reason: collision with root package name */
    public static final String f29616n2 = "SensorBottomBorder";

    /* renamed from: f0, reason: collision with root package name */
    public static final String f29582f0 = "PixelXDimension";
    public static final String E0 = "ISOSpeed";

    /* renamed from: f1, reason: collision with root package name */
    public static final String f29583f1 = "WhiteBalance";
    public static final String E1 = "GPSTimeStamp";

    /* renamed from: f2, reason: collision with root package name */
    public static final String f29584f2 = "ThumbnailImageWidth";
    public static final String f5 = "K";
    private static final String E5 = "FUJIFILMCCD-RAW";

    /* renamed from: w0, reason: collision with root package name */
    public static final String f29652w0 = "ExposureProgram";
    public static final String V0 = "FocalPlaneYResolution";

    /* renamed from: w1, reason: collision with root package name */
    public static final String f29653w1 = "LensSerialNumber";
    public static final String V1 = "GPSDestBearing";

    /* renamed from: w2, reason: collision with root package name */
    private static final String f29654w2 = "ExifIFDPointer";

    /* renamed from: o0, reason: collision with root package name */
    public static final String f29618o0 = "OffsetTime";
    public static final String N0 = "MeteringMode";

    /* renamed from: o1, reason: collision with root package name */
    public static final String f29619o1 = "SubjectDistanceRange";
    public static final String N1 = "GPSImgDirectionRef";

    /* renamed from: o2, reason: collision with root package name */
    public static final String f29620o2 = "SensorLeftBorder";

    /* renamed from: g0, reason: collision with root package name */
    public static final String f29586g0 = "PixelYDimension";
    public static final String F0 = "ISOSpeedLatitudeyyy";

    /* renamed from: g1, reason: collision with root package name */
    public static final String f29587g1 = "DigitalZoomRatio";
    public static final String F1 = "GPSSatellites";

    /* renamed from: g2, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    public static final String f29588g2 = "ThumbnailOrientation";
    public static final String g5 = "M";

    /* renamed from: x0, reason: collision with root package name */
    public static final String f29657x0 = "SpectralSensitivity";
    public static final String W0 = "FocalPlaneResolutionUnit";

    /* renamed from: x1, reason: collision with root package name */
    public static final String f29658x1 = "GPSVersionID";
    public static final String W1 = "GPSDestDistanceRef";

    /* renamed from: x2, reason: collision with root package name */
    private static final String f29659x2 = "GPSInfoIFDPointer";
    public static final String W4 = "A";

    /* renamed from: p0, reason: collision with root package name */
    public static final String f29622p0 = "OffsetTimeOriginal";
    public static final String O0 = "LightSource";

    /* renamed from: p1, reason: collision with root package name */
    public static final String f29623p1 = "ImageUniqueID";
    public static final String O1 = "GPSImgDirection";

    /* renamed from: p2, reason: collision with root package name */
    public static final String f29624p2 = "SensorRightBorder";

    /* renamed from: h0, reason: collision with root package name */
    public static final String f29590h0 = "ComponentsConfiguration";
    public static final String G0 = "ISOSpeedLatitudezzz";

    /* renamed from: h1, reason: collision with root package name */
    public static final String f29591h1 = "FocalLengthIn35mmFilm";
    public static final String G1 = "GPSStatus";

    /* renamed from: h2, reason: collision with root package name */
    public static final String f29592h2 = "DNGVersion";
    public static final String h5 = "N";

    /* renamed from: y0, reason: collision with root package name */
    @Deprecated
    public static final String f29662y0 = "ISOSpeedRatings";
    public static final String X0 = "SubjectLocation";

    /* renamed from: y1, reason: collision with root package name */
    public static final String f29663y1 = "GPSLatitudeRef";
    public static final String X1 = "GPSDestDistance";

    /* renamed from: y2, reason: collision with root package name */
    private static final String f29664y2 = "InteroperabilityIFDPointer";
    public static final String X4 = "V";

    /* renamed from: q0, reason: collision with root package name */
    public static final String f29626q0 = "OffsetTimeDigitized";
    public static final String P0 = "Flash";

    /* renamed from: q1, reason: collision with root package name */
    @Deprecated
    public static final String f29627q1 = "CameraOwnerName";
    public static final String P1 = "GPSMapDatum";

    /* renamed from: q2, reason: collision with root package name */
    public static final String f29628q2 = "SensorTopBorder";

    /* renamed from: i0, reason: collision with root package name */
    public static final String f29594i0 = "CompressedBitsPerPixel";
    public static final String H0 = "ShutterSpeedValue";

    /* renamed from: i1, reason: collision with root package name */
    public static final String f29595i1 = "SceneCaptureType";
    public static final String H1 = "GPSMeasureMode";

    /* renamed from: i2, reason: collision with root package name */
    public static final String f29596i2 = "DefaultCropSize";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f29558a0 = "Copyright";

    /* renamed from: a1, reason: collision with root package name */
    public static final String f29559a1 = "FileSource";

    /* renamed from: a2, reason: collision with root package name */
    public static final String f29560a2 = "GPSDateStamp";
    public static final String a5 = "K";

    /* renamed from: z0, reason: collision with root package name */
    public static final String f29667z0 = "PhotographicSensitivity";
    public static final String Y0 = "ExposureIndex";

    /* renamed from: z1, reason: collision with root package name */
    public static final String f29668z1 = "GPSLatitude";
    public static final String Y1 = "GPSProcessingMethod";

    /* renamed from: z2, reason: collision with root package name */
    private static final String f29669z2 = "SubIFDPointer";
    public static final String Y4 = "2";

    /* renamed from: r0, reason: collision with root package name */
    public static final String f29630r0 = "SubSecTime";
    public static final String Q0 = "SubjectArea";

    /* renamed from: r1, reason: collision with root package name */
    public static final String f29631r1 = "CameraOwnerName";

    /* renamed from: w, reason: collision with root package name */
    private static final boolean f29651w = Log.isLoggable("ExifInterface", 3);
    private static final List<Integer> M2 = Arrays.asList(1, 6, 3, 8);
    private static final List<Integer> N2 = Arrays.asList(2, 7, 4, 5);
    public static final int[] r5 = {8, 8, 8};
    public static final int[] s5 = {4};
    public static final int[] t5 = {8};
    private static final byte n7 = -40;
    static final byte[] D5 = {-1, n7, -1};
    private static final byte[] G5 = {102, 116, 121, 112};
    private static final byte[] H5 = {109, 105, 102, 49};
    private static final byte[] I5 = {104, 101, 105, 99};
    private static final byte[] L5 = {79, 76, 89, 77, 80, 0};
    private static final byte[] M5 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] S5 = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] T5 = {101, 88, 73, 102};
    private static final byte[] U5 = {73, 72, 68, 82};
    private static final byte[] V5 = {73, 69, 78, 68};
    private static final byte[] Y5 = {82, 73, 70, 70};
    private static final byte[] Z5 = {87, 69, 66, 80};
    private static final byte[] b6 = {69, 88, 73, 70};
    static final byte q6 = 42;
    private static final byte[] c6 = {-99, 1, q6};
    private static final byte[] e6 = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] f6 = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] g6 = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] h6 = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] i6 = "ANMF".getBytes(Charset.defaultCharset());
    static final String[] G6 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] H6 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] I6 = {65, 83, 67, 73, 73, 0, 0, 0};

    /* compiled from: ExifInterface.java */
    /* renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    class C0480a extends MediaDataSource {

        /* renamed from: b, reason: collision with root package name */
        long f29692b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f29693c;

        C0480a(i iVar) {
            this.f29693c = iVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j4, byte[] bArr, int i4, int i5) throws IOException {
            if (i5 == 0) {
                return 0;
            }
            if (j4 < 0) {
                return -1;
            }
            try {
                long j5 = this.f29692b;
                if (j5 != j4) {
                    if (j5 >= 0 && j4 >= j5 + this.f29693c.available()) {
                        return -1;
                    }
                    this.f29693c.e(j4);
                    this.f29692b = j4;
                }
                if (i5 > this.f29693c.available()) {
                    i5 = this.f29693c.available();
                }
                int read = this.f29693c.read(bArr, i4, i5);
                if (read >= 0) {
                    this.f29692b += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f29692b = -1L;
            return -1;
        }
    }

    /* compiled from: ExifInterface.java */
    private static class b extends InputStream implements DataInput {

        /* renamed from: f, reason: collision with root package name */
        private static final ByteOrder f29695f = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: g, reason: collision with root package name */
        private static final ByteOrder f29696g = ByteOrder.BIG_ENDIAN;

        /* renamed from: b, reason: collision with root package name */
        final DataInputStream f29697b;

        /* renamed from: c, reason: collision with root package name */
        private ByteOrder f29698c;

        /* renamed from: d, reason: collision with root package name */
        int f29699d;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f29700e;

        b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.f29699d;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f29697b.available();
        }

        public long b() throws IOException {
            return readInt() & 4294967295L;
        }

        public void c(ByteOrder byteOrder) {
            this.f29698c = byteOrder;
        }

        public void d(int i4) throws IOException {
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i4 - i5;
                int skip = (int) this.f29697b.skip(i6);
                if (skip <= 0) {
                    if (this.f29700e == null) {
                        this.f29700e = new byte[8192];
                    }
                    skip = this.f29697b.read(this.f29700e, 0, Math.min(8192, i6));
                    if (skip == -1) {
                        throw new EOFException(r2.a("Reached EOF while skipping ", i4, " bytes."));
                    }
                }
                i5 += skip;
            }
            this.f29699d += i5;
        }

        @Override // java.io.InputStream
        public void mark(int i4) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f29699d++;
            return this.f29697b.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f29699d++;
            return this.f29697b.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f29699d++;
            int read = this.f29697b.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f29699d += 2;
            return this.f29697b.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i4, int i5) throws IOException {
            this.f29699d += i5;
            this.f29697b.readFully(bArr, i4, i5);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f29699d += 4;
            int read = this.f29697b.read();
            int read2 = this.f29697b.read();
            int read3 = this.f29697b.read();
            int read4 = this.f29697b.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f29698c;
            if (byteOrder == f29695f) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f29696g) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f29698c);
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f29699d += 8;
            int read = this.f29697b.read();
            int read2 = this.f29697b.read();
            int read3 = this.f29697b.read();
            int read4 = this.f29697b.read();
            int read5 = this.f29697b.read();
            int read6 = this.f29697b.read();
            int read7 = this.f29697b.read();
            int read8 = this.f29697b.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f29698c;
            if (byteOrder == f29695f) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f29696g) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f29698c);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f29699d += 2;
            int read = this.f29697b.read();
            int read2 = this.f29697b.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f29698c;
            if (byteOrder == f29695f) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f29696g) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f29698c);
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f29699d += 2;
            return this.f29697b.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f29699d++;
            return this.f29697b.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f29699d += 2;
            int read = this.f29697b.read();
            int read2 = this.f29697b.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f29698c;
            if (byteOrder == f29695f) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f29696g) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f29698c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i4) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f29698c = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f29697b = dataInputStream;
            dataInputStream.mark(0);
            this.f29699d = 0;
            this.f29698c = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            int read = this.f29697b.read(bArr, i4, i5);
            this.f29699d += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f29699d += bArr.length;
            this.f29697b.readFully(bArr);
        }
    }

    /* compiled from: ExifInterface.java */
    private static class c extends FilterOutputStream {

        /* renamed from: b, reason: collision with root package name */
        final OutputStream f29701b;

        /* renamed from: c, reason: collision with root package name */
        private ByteOrder f29702c;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f29701b = outputStream;
            this.f29702c = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.f29702c = byteOrder;
        }

        public void b(int i4) throws IOException {
            this.f29701b.write(i4);
        }

        public void c(int i4) throws IOException {
            ByteOrder byteOrder = this.f29702c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f29701b.write(i4 & 255);
                this.f29701b.write((i4 >>> 8) & 255);
                this.f29701b.write((i4 >>> 16) & 255);
                this.f29701b.write((i4 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f29701b.write((i4 >>> 24) & 255);
                this.f29701b.write((i4 >>> 16) & 255);
                this.f29701b.write((i4 >>> 8) & 255);
                this.f29701b.write(i4 & 255);
            }
        }

        public void d(short s4) throws IOException {
            ByteOrder byteOrder = this.f29702c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f29701b.write(s4 & 255);
                this.f29701b.write((s4 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f29701b.write((s4 >>> 8) & 255);
                this.f29701b.write(s4 & 255);
            }
        }

        public void e(long j4) throws IOException {
            c((int) j4);
        }

        public void f(int i4) throws IOException {
            d((short) i4);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f29701b.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i4, int i5) throws IOException {
            this.f29701b.write(bArr, i4, i5);
        }
    }

    /* compiled from: ExifInterface.java */
    private static class d {

        /* renamed from: e, reason: collision with root package name */
        public static final long f29703e = -1;

        /* renamed from: a, reason: collision with root package name */
        public final int f29704a;

        /* renamed from: b, reason: collision with root package name */
        public final int f29705b;

        /* renamed from: c, reason: collision with root package name */
        public final long f29706c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f29707d;

        d(int i4, int i5, byte[] bArr) {
            this(i4, i5, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.j7);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double d5, ByteOrder byteOrder) {
            return c(new double[]{d5}, byteOrder);
        }

        public static d c(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.H6[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d5 : dArr) {
                wrap.putDouble(d5);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d d(int i4, ByteOrder byteOrder) {
            return e(new int[]{i4}, byteOrder);
        }

        public static d e(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.H6[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i4 : iArr) {
                wrap.putInt(i4);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d f(h hVar, ByteOrder byteOrder) {
            return g(new h[]{hVar}, byteOrder);
        }

        public static d g(h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.H6[10] * hVarArr.length]);
            wrap.order(byteOrder);
            for (h hVar : hVarArr) {
                wrap.putInt((int) hVar.f29712a);
                wrap.putInt((int) hVar.f29713b);
            }
            return new d(10, hVarArr.length, wrap.array());
        }

        public static d h(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.j7);
            return new d(2, bytes.length, bytes);
        }

        public static d i(long j4, ByteOrder byteOrder) {
            return j(new long[]{j4}, byteOrder);
        }

        public static d j(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.H6[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j4 : jArr) {
                wrap.putInt((int) j4);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d k(h hVar, ByteOrder byteOrder) {
            return l(new h[]{hVar}, byteOrder);
        }

        public static d l(h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.H6[5] * hVarArr.length]);
            wrap.order(byteOrder);
            for (h hVar : hVarArr) {
                wrap.putInt((int) hVar.f29712a);
                wrap.putInt((int) hVar.f29713b);
            }
            return new d(5, hVarArr.length, wrap.array());
        }

        public static d m(int i4, ByteOrder byteOrder) {
            return n(new int[]{i4}, byteOrder);
        }

        public static d n(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.H6[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i4 : iArr) {
                wrap.putShort((short) i4);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double o(ByteOrder byteOrder) {
            Object r4 = r(byteOrder);
            if (r4 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (r4 instanceof String) {
                return Double.parseDouble((String) r4);
            }
            if (r4 instanceof long[]) {
                if (((long[]) r4).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (r4 instanceof int[]) {
                if (((int[]) r4).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (r4 instanceof double[]) {
                double[] dArr = (double[]) r4;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(r4 instanceof h[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            h[] hVarArr = (h[]) r4;
            if (hVarArr.length == 1) {
                return hVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int p(ByteOrder byteOrder) {
            Object r4 = r(byteOrder);
            if (r4 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (r4 instanceof String) {
                return Integer.parseInt((String) r4);
            }
            if (r4 instanceof long[]) {
                long[] jArr = (long[]) r4;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(r4 instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) r4;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String q(ByteOrder byteOrder) {
            Object r4 = r(byteOrder);
            if (r4 == null) {
                return null;
            }
            if (r4 instanceof String) {
                return (String) r4;
            }
            StringBuilder sb = new StringBuilder();
            int i4 = 0;
            if (r4 instanceof long[]) {
                long[] jArr = (long[]) r4;
                while (i4 < jArr.length) {
                    sb.append(jArr[i4]);
                    i4++;
                    if (i4 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (r4 instanceof int[]) {
                int[] iArr = (int[]) r4;
                while (i4 < iArr.length) {
                    sb.append(iArr[i4]);
                    i4++;
                    if (i4 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (r4 instanceof double[]) {
                double[] dArr = (double[]) r4;
                while (i4 < dArr.length) {
                    sb.append(dArr[i4]);
                    i4++;
                    if (i4 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(r4 instanceof h[])) {
                return null;
            }
            h[] hVarArr = (h[]) r4;
            while (i4 < hVarArr.length) {
                sb.append(hVarArr[i4].f29712a);
                sb.append('/');
                sb.append(hVarArr[i4].f29713b);
                i4++;
                if (i4 != hVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        Object r(ByteOrder byteOrder) {
            b bVar;
            byte b5;
            byte b6;
            int i4 = 0;
            b bVar2 = null;
            try {
                bVar = new b(this.f29707d);
            } catch (IOException unused) {
                bVar = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                bVar.c(byteOrder);
                switch (this.f29704a) {
                    case 1:
                    case 6:
                        byte[] bArr = this.f29707d;
                        if (bArr.length != 1 || (b5 = bArr[0]) < 0 || b5 > 1) {
                            String str = new String(bArr, a.j7);
                            try {
                                bVar.close();
                            } catch (IOException unused2) {
                            }
                            return str;
                        }
                        String str2 = new String(new char[]{(char) (b5 + 48)});
                        try {
                            bVar.close();
                        } catch (IOException unused3) {
                        }
                        return str2;
                    case 2:
                    case 7:
                        if (this.f29705b >= a.I6.length) {
                            int i5 = 0;
                            while (true) {
                                byte[] bArr2 = a.I6;
                                if (i5 >= bArr2.length) {
                                    i4 = bArr2.length;
                                } else if (this.f29707d[i5] == bArr2[i5]) {
                                    i5++;
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        while (i4 < this.f29705b && (b6 = this.f29707d[i4]) != 0) {
                            if (b6 >= 32) {
                                sb.append((char) b6);
                            } else {
                                sb.append('?');
                            }
                            i4++;
                        }
                        String sb2 = sb.toString();
                        try {
                            bVar.close();
                        } catch (IOException unused4) {
                        }
                        return sb2;
                    case 3:
                        int[] iArr = new int[this.f29705b];
                        while (i4 < this.f29705b) {
                            iArr[i4] = bVar.readUnsignedShort();
                            i4++;
                        }
                        try {
                            bVar.close();
                        } catch (IOException unused5) {
                        }
                        return iArr;
                    case 4:
                        long[] jArr = new long[this.f29705b];
                        while (i4 < this.f29705b) {
                            jArr[i4] = bVar.b();
                            i4++;
                        }
                        try {
                            bVar.close();
                        } catch (IOException unused6) {
                        }
                        return jArr;
                    case 5:
                        h[] hVarArr = new h[this.f29705b];
                        while (i4 < this.f29705b) {
                            hVarArr[i4] = new h(bVar.b(), bVar.b());
                            i4++;
                        }
                        try {
                            bVar.close();
                        } catch (IOException unused7) {
                        }
                        return hVarArr;
                    case 8:
                        int[] iArr2 = new int[this.f29705b];
                        while (i4 < this.f29705b) {
                            iArr2[i4] = bVar.readShort();
                            i4++;
                        }
                        try {
                            bVar.close();
                        } catch (IOException unused8) {
                        }
                        return iArr2;
                    case 9:
                        int[] iArr3 = new int[this.f29705b];
                        while (i4 < this.f29705b) {
                            iArr3[i4] = bVar.readInt();
                            i4++;
                        }
                        try {
                            bVar.close();
                        } catch (IOException unused9) {
                        }
                        return iArr3;
                    case 10:
                        h[] hVarArr2 = new h[this.f29705b];
                        while (i4 < this.f29705b) {
                            hVarArr2[i4] = new h(bVar.readInt(), bVar.readInt());
                            i4++;
                        }
                        try {
                            bVar.close();
                        } catch (IOException unused10) {
                        }
                        return hVarArr2;
                    case 11:
                        double[] dArr = new double[this.f29705b];
                        while (i4 < this.f29705b) {
                            dArr[i4] = bVar.readFloat();
                            i4++;
                        }
                        try {
                            bVar.close();
                        } catch (IOException unused11) {
                        }
                        return dArr;
                    case 12:
                        double[] dArr2 = new double[this.f29705b];
                        while (i4 < this.f29705b) {
                            dArr2[i4] = bVar.readDouble();
                            i4++;
                        }
                        try {
                            bVar.close();
                        } catch (IOException unused12) {
                        }
                        return dArr2;
                    default:
                        try {
                            bVar.close();
                        } catch (IOException unused13) {
                        }
                        return null;
                }
            } catch (IOException unused14) {
                if (bVar != null) {
                    try {
                        bVar.close();
                    } catch (IOException unused15) {
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                bVar2 = bVar;
                if (bVar2 != null) {
                    try {
                        bVar2.close();
                    } catch (IOException unused16) {
                    }
                }
                throw th;
            }
        }

        public int s() {
            return a.H6[this.f29704a] * this.f29705b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(a.G6[this.f29704a]);
            sb.append(", data length:");
            return android.support.v4.media.b.a(sb, this.f29707d.length, ")");
        }

        d(int i4, int i5, long j4, byte[] bArr) {
            this.f29704a = i4;
            this.f29705b = i5;
            this.f29706c = j4;
            this.f29707d = bArr;
        }
    }

    /* compiled from: ExifInterface.java */
    @c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    /* compiled from: ExifInterface.java */
    @c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    /* compiled from: ExifInterface.java */
    private static class h {

        /* renamed from: a, reason: collision with root package name */
        public final long f29712a;

        /* renamed from: b, reason: collision with root package name */
        public final long f29713b;

        h(double d5) {
            this((long) (d5 * 10000.0d), i0.f35991f);
        }

        public double a() {
            return this.f29712a / this.f29713b;
        }

        public String toString() {
            return this.f29712a + "/" + this.f29713b;
        }

        h(long j4, long j5) {
            if (j5 == 0) {
                this.f29712a = 0L;
                this.f29713b = 1L;
            } else {
                this.f29712a = j4;
                this.f29713b = j5;
            }
        }
    }

    static {
        f[] fVarArr = {new f("NewSubfileType", 254, 4), new f("SubfileType", 255, 4), new f("ImageWidth", 256, 3, 4), new f("ImageLength", 257, 3, 4), new f("BitsPerSample", 258, 3), new f("Compression", 259, 3), new f("PhotometricInterpretation", 262, 3), new f("ImageDescription", 270, 2), new f("Make", 271, 2), new f("Model", 272, 2), new f("StripOffsets", 273, 3, 4), new f("Orientation", 274, 3), new f("SamplesPerPixel", 277, 3), new f("RowsPerStrip", 278, 3, 4), new f("StripByteCounts", 279, 3, 4), new f("XResolution", 282, 5), new f("YResolution", 283, 5), new f("PlanarConfiguration", 284, 3), new f("ResolutionUnit", 296, 3), new f("TransferFunction", 301, 3), new f("Software", 305, 2), new f("DateTime", 306, 2), new f("Artist", 315, 2), new f("WhitePoint", w.a.f22421s, 5), new f("PrimaryChromaticities", 319, 5), new f("SubIFDPointer", 330, 4), new f("JPEGInterchangeFormat", h0.f27183j, 4), new f("JPEGInterchangeFormatLength", 514, 4), new f("YCbCrCoefficients", 529, 5), new f("YCbCrSubSampling", 530, 3), new f("YCbCrPositioning", 531, 3), new f("ReferenceBlackWhite", 532, 5), new f("Copyright", 33432, 2), new f("ExifIFDPointer", 34665, 4), new f("GPSInfoIFDPointer", 34853, 4), new f("SensorTopBorder", 4, 4), new f("SensorLeftBorder", 5, 4), new f("SensorBottomBorder", 6, 4), new f("SensorRightBorder", 7, 4), new f("ISO", 23, 3), new f("JpgFromRaw", 46, 7), new f("Xmp", w.h.f22554j, 1)};
        J6 = fVarArr;
        f[] fVarArr2 = {new f("ExposureTime", 33434, 5), new f("FNumber", 33437, 5), new f("ExposureProgram", 34850, 3), new f("SpectralSensitivity", 34852, 2), new f("PhotographicSensitivity", 34855, 3), new f("OECF", 34856, 7), new f("SensitivityType", 34864, 3), new f("StandardOutputSensitivity", 34865, 4), new f("RecommendedExposureIndex", 34866, 4), new f("ISOSpeed", 34867, 4), new f("ISOSpeedLatitudeyyy", 34868, 4), new f("ISOSpeedLatitudezzz", 34869, 4), new f("ExifVersion", 36864, 2), new f("DateTimeOriginal", 36867, 2), new f("DateTimeDigitized", 36868, 2), new f("OffsetTime", 36880, 2), new f("OffsetTimeOriginal", 36881, 2), new f("OffsetTimeDigitized", 36882, 2), new f("ComponentsConfiguration", 37121, 7), new f("CompressedBitsPerPixel", 37122, 5), new f("ShutterSpeedValue", 37377, 10), new f("ApertureValue", 37378, 5), new f("BrightnessValue", 37379, 10), new f("ExposureBiasValue", 37380, 10), new f("MaxApertureValue", 37381, 5), new f("SubjectDistance", 37382, 5), new f("MeteringMode", 37383, 3), new f("LightSource", 37384, 3), new f("Flash", 37385, 3), new f("FocalLength", 37386, 5), new f("SubjectArea", 37396, 3), new f("MakerNote", 37500, 7), new f("UserComment", 37510, 7), new f("SubSecTime", 37520, 2), new f("SubSecTimeOriginal", 37521, 2), new f("SubSecTimeDigitized", 37522, 2), new f("FlashpixVersion", org.apache.tools.zip.d.f86737y2, 7), new f("ColorSpace", 40961, 3), new f("PixelXDimension", 40962, 3, 4), new f("PixelYDimension", 40963, 3, 4), new f("RelatedSoundFile", 40964, 2), new f("InteroperabilityIFDPointer", 40965, 4), new f("FlashEnergy", 41483, 5), new f("SpatialFrequencyResponse", 41484, 7), new f("FocalPlaneXResolution", 41486, 5), new f("FocalPlaneYResolution", 41487, 5), new f("FocalPlaneResolutionUnit", 41488, 3), new f("SubjectLocation", 41492, 3), new f("ExposureIndex", 41493, 5), new f("SensingMethod", 41495, 3), new f("FileSource", 41728, 7), new f("SceneType", 41729, 7), new f("CFAPattern", 41730, 7), new f("CustomRendered", 41985, 3), new f("ExposureMode", 41986, 3), new f("WhiteBalance", 41987, 3), new f("DigitalZoomRatio", 41988, 5), new f("FocalLengthIn35mmFilm", 41989, 3), new f("SceneCaptureType", 41990, 3), new f("GainControl", 41991, 3), new f("Contrast", 41992, 3), new f("Saturation", 41993, 3), new f("Sharpness", 41994, 3), new f("DeviceSettingDescription", 41995, 7), new f("SubjectDistanceRange", 41996, 3), new f("ImageUniqueID", 42016, 2), new f("CameraOwnerName", 42032, 2), new f("BodySerialNumber", 42033, 2), new f("LensSpecification", 42034, 5), new f("LensMake", 42035, 2), new f("LensModel", 42036, 2), new f("Gamma", 42240, 5), new f("DNGVersion", 50706, 1), new f("DefaultCropSize", 50720, 3, 4)};
        K6 = fVarArr2;
        f[] fVarArr3 = {new f("GPSVersionID", 0, 1), new f("GPSLatitudeRef", 1, 2), new f("GPSLatitude", 2, 5, 10), new f("GPSLongitudeRef", 3, 2), new f("GPSLongitude", 4, 5, 10), new f("GPSAltitudeRef", 5, 1), new f("GPSAltitude", 6, 5), new f("GPSTimeStamp", 7, 5), new f("GPSSatellites", 8, 2), new f("GPSStatus", 9, 2), new f("GPSMeasureMode", 10, 2), new f("GPSDOP", 11, 5), new f("GPSSpeedRef", 12, 2), new f("GPSSpeed", 13, 5), new f("GPSTrackRef", 14, 2), new f("GPSTrack", 15, 5), new f("GPSImgDirectionRef", 16, 2), new f("GPSImgDirection", 17, 5), new f("GPSMapDatum", 18, 2), new f("GPSDestLatitudeRef", 19, 2), new f("GPSDestLatitude", 20, 5), new f("GPSDestLongitudeRef", 21, 2), new f("GPSDestLongitude", 22, 5), new f("GPSDestBearingRef", 23, 2), new f("GPSDestBearing", 24, 5), new f("GPSDestDistanceRef", 25, 2), new f("GPSDestDistance", 26, 5), new f("GPSProcessingMethod", 27, 7), new f("GPSAreaInformation", 28, 7), new f("GPSDateStamp", 29, 2), new f("GPSDifferential", 30, 3), new f("GPSHPositioningError", 31, 5)};
        L6 = fVarArr3;
        f[] fVarArr4 = {new f("InteroperabilityIndex", 1, 2)};
        M6 = fVarArr4;
        f[] fVarArr5 = {new f("NewSubfileType", 254, 4), new f("SubfileType", 255, 4), new f("ThumbnailImageWidth", 256, 3, 4), new f("ThumbnailImageLength", 257, 3, 4), new f("BitsPerSample", 258, 3), new f("Compression", 259, 3), new f("PhotometricInterpretation", 262, 3), new f("ImageDescription", 270, 2), new f("Make", 271, 2), new f("Model", 272, 2), new f("StripOffsets", 273, 3, 4), new f("ThumbnailOrientation", 274, 3), new f("SamplesPerPixel", 277, 3), new f("RowsPerStrip", 278, 3, 4), new f("StripByteCounts", 279, 3, 4), new f("XResolution", 282, 5), new f("YResolution", 283, 5), new f("PlanarConfiguration", 284, 3), new f("ResolutionUnit", 296, 3), new f("TransferFunction", 301, 3), new f("Software", 305, 2), new f("DateTime", 306, 2), new f("Artist", 315, 2), new f("WhitePoint", w.a.f22421s, 5), new f("PrimaryChromaticities", 319, 5), new f("SubIFDPointer", 330, 4), new f("JPEGInterchangeFormat", h0.f27183j, 4), new f("JPEGInterchangeFormatLength", 514, 4), new f("YCbCrCoefficients", 529, 5), new f("YCbCrSubSampling", 530, 3), new f("YCbCrPositioning", 531, 3), new f("ReferenceBlackWhite", 532, 5), new f("Copyright", 33432, 2), new f("ExifIFDPointer", 34665, 4), new f("GPSInfoIFDPointer", 34853, 4), new f("DNGVersion", 50706, 1), new f("DefaultCropSize", 50720, 3, 4)};
        N6 = fVarArr5;
        O6 = new f("StripOffsets", 273, 3);
        f[] fVarArr6 = {new f("ThumbnailImage", 256, 7), new f("CameraSettingsIFDPointer", 8224, 4), new f("ImageProcessingIFDPointer", 8256, 4)};
        P6 = fVarArr6;
        f[] fVarArr7 = {new f("PreviewImageStart", 257, 4), new f("PreviewImageLength", 258, 4)};
        Q6 = fVarArr7;
        f[] fVarArr8 = {new f("AspectFrame", 4371, 3)};
        R6 = fVarArr8;
        f[] fVarArr9 = {new f("ColorSpace", 55, 3)};
        S6 = fVarArr9;
        f[][] fVarArr10 = {fVarArr, fVarArr2, fVarArr3, fVarArr4, fVarArr5, fVarArr, fVarArr6, fVarArr7, fVarArr8, fVarArr9};
        d7 = fVarArr10;
        e7 = new f[]{new f("SubIFDPointer", 330, 4), new f("ExifIFDPointer", 34665, 4), new f("GPSInfoIFDPointer", 34853, 4), new f("InteroperabilityIFDPointer", 40965, 4), new f("CameraSettingsIFDPointer", 8224, 1), new f("ImageProcessingIFDPointer", 8256, 1)};
        f7 = new HashMap[fVarArr10.length];
        g7 = new HashMap[fVarArr10.length];
        h7 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        i7 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        j7 = forName;
        k7 = "Exif\u0000\u0000".getBytes(forName);
        l7 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        m6 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        n6 = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            f[][] fVarArr11 = d7;
            if (i10 >= fVarArr11.length) {
                HashMap<Integer, Integer> hashMap = i7;
                f[] fVarArr12 = e7;
                hashMap.put(Integer.valueOf(fVarArr12[0].f29708a), 5);
                hashMap.put(Integer.valueOf(fVarArr12[1].f29708a), 1);
                hashMap.put(Integer.valueOf(fVarArr12[2].f29708a), 2);
                hashMap.put(Integer.valueOf(fVarArr12[3].f29708a), 3);
                hashMap.put(Integer.valueOf(fVarArr12[4].f29708a), 7);
                hashMap.put(Integer.valueOf(fVarArr12[5].f29708a), 8);
                U7 = Pattern.compile(".*[1-9].*");
                V7 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                W7 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                X7 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f7[i10] = new HashMap<>();
            g7[i10] = new HashMap<>();
            for (f fVar : fVarArr11[i10]) {
                f7[i10].put(Integer.valueOf(fVar.f29708a), fVar);
                g7[i10].put(fVar.f29709b, fVar);
            }
            i10++;
        }
    }

    public a(@o0 File file) throws IOException {
        f[][] fVarArr = d7;
        this.f29676f = new HashMap[fVarArr.length];
        this.f29677g = new HashSet(fVarArr.length);
        this.f29678h = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        O(file.getAbsolutePath());
    }

    private void A(i iVar) throws IOException {
        d dVar;
        g0(iVar);
        k0(iVar, 0);
        C0(iVar, 0);
        C0(iVar, 5);
        C0(iVar, 4);
        D0();
        if (this.f29674d != 8 || (dVar = this.f29676f[1].get("MakerNote")) == null) {
            return;
        }
        i iVar2 = new i(dVar.f29707d);
        iVar2.c(this.f29678h);
        iVar2.d(6);
        k0(iVar2, 9);
        d dVar2 = this.f29676f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f29676f[1].put("ColorSpace", dVar2);
        }
    }

    private static boolean A0(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    private void B0(int i10, int i11) throws IOException {
        if (this.f29676f[i10].isEmpty() || this.f29676f[i11].isEmpty()) {
            return;
        }
        d dVar = this.f29676f[i10].get("ImageLength");
        d dVar2 = this.f29676f[i10].get("ImageWidth");
        d dVar3 = this.f29676f[i11].get("ImageLength");
        d dVar4 = this.f29676f[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null || dVar3 == null || dVar4 == null) {
            return;
        }
        int p10 = dVar.p(this.f29678h);
        int p11 = dVar2.p(this.f29678h);
        int p12 = dVar3.p(this.f29678h);
        int p13 = dVar4.p(this.f29678h);
        if (p10 >= p12 || p11 >= p13) {
            return;
        }
        HashMap<String, d>[] hashMapArr = this.f29676f;
        HashMap<String, d> hashMap = hashMapArr[i10];
        hashMapArr[i10] = hashMapArr[i11];
        hashMapArr[i11] = hashMap;
    }

    private void C(i iVar) throws IOException {
        if (f29651w) {
            Objects.toString(iVar);
        }
        A(iVar);
        d dVar = this.f29676f[0].get("JpgFromRaw");
        if (dVar != null) {
            t(new b(dVar.f29707d), (int) dVar.f29706c, 5);
        }
        d dVar2 = this.f29676f[0].get("ISO");
        d dVar3 = this.f29676f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f29676f[1].put("PhotographicSensitivity", dVar2);
    }

    private void C0(i iVar, int i10) throws IOException {
        d m10;
        d m11;
        d dVar = this.f29676f[i10].get("DefaultCropSize");
        d dVar2 = this.f29676f[i10].get("SensorTopBorder");
        d dVar3 = this.f29676f[i10].get("SensorLeftBorder");
        d dVar4 = this.f29676f[i10].get("SensorBottomBorder");
        d dVar5 = this.f29676f[i10].get("SensorRightBorder");
        if (dVar != null) {
            if (dVar.f29704a == 5) {
                h[] hVarArr = (h[]) dVar.r(this.f29678h);
                if (hVarArr == null || hVarArr.length != 2) {
                    Arrays.toString(hVarArr);
                    return;
                } else {
                    m10 = d.k(hVarArr[0], this.f29678h);
                    m11 = d.k(hVarArr[1], this.f29678h);
                }
            } else {
                int[] iArr = (int[]) dVar.r(this.f29678h);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    m10 = d.m(iArr[0], this.f29678h);
                    m11 = d.m(iArr[1], this.f29678h);
                }
            }
            this.f29676f[i10].put("ImageWidth", m10);
            this.f29676f[i10].put("ImageLength", m11);
            return;
        }
        if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
            o0(iVar, i10);
            return;
        }
        int p10 = dVar2.p(this.f29678h);
        int p11 = dVar4.p(this.f29678h);
        int p12 = dVar5.p(this.f29678h);
        int p13 = dVar3.p(this.f29678h);
        if (p11 <= p10 || p12 <= p13) {
            return;
        }
        d m12 = d.m(p11 - p10, this.f29678h);
        d m13 = d.m(p12 - p13, this.f29678h);
        this.f29676f[i10].put("ImageLength", m12);
        this.f29676f[i10].put("ImageWidth", m13);
    }

    private void D(i iVar) throws IOException {
        byte[] bArr = k7;
        iVar.d(bArr.length);
        byte[] bArr2 = new byte[iVar.available()];
        iVar.readFully(bArr2);
        this.f29686p = bArr.length;
        j0(bArr2, 0);
    }

    private void D0() throws IOException {
        B0(0, 5);
        B0(0, 4);
        B0(5, 4);
        d dVar = this.f29676f[1].get("PixelXDimension");
        d dVar2 = this.f29676f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f29676f[0].put("ImageWidth", dVar);
            this.f29676f[0].put("ImageLength", dVar2);
        }
        if (this.f29676f[4].isEmpty() && b0(this.f29676f[5])) {
            HashMap<String, d>[] hashMapArr = this.f29676f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        b0(this.f29676f[4]);
        m0(0, "ThumbnailOrientation", "Orientation");
        m0(0, "ThumbnailImageLength", "ImageLength");
        m0(0, "ThumbnailImageWidth", "ImageWidth");
        m0(5, "ThumbnailOrientation", "Orientation");
        m0(5, "ThumbnailImageLength", "ImageLength");
        m0(5, "ThumbnailImageWidth", "ImageWidth");
        m0(4, "Orientation", "ThumbnailOrientation");
        m0(4, "ImageLength", "ThumbnailImageLength");
        m0(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private int E0(c cVar) throws IOException {
        f[][] fVarArr = d7;
        int[] iArr = new int[fVarArr.length];
        int[] iArr2 = new int[fVarArr.length];
        for (f fVar : e7) {
            l0(fVar.f29709b);
        }
        if (this.f29679i) {
            if (this.f29680j) {
                l0("StripOffsets");
                l0("StripByteCounts");
            } else {
                l0("JPEGInterchangeFormat");
                l0("JPEGInterchangeFormatLength");
            }
        }
        for (int i10 = 0; i10 < d7.length; i10++) {
            for (Object obj : this.f29676f[i10].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f29676f[i10].remove(entry.getKey());
                }
            }
        }
        if (!this.f29676f[1].isEmpty()) {
            this.f29676f[0].put(e7[1].f29709b, d.i(0L, this.f29678h));
        }
        if (!this.f29676f[2].isEmpty()) {
            this.f29676f[0].put(e7[2].f29709b, d.i(0L, this.f29678h));
        }
        if (!this.f29676f[3].isEmpty()) {
            this.f29676f[1].put(e7[3].f29709b, d.i(0L, this.f29678h));
        }
        if (this.f29679i) {
            if (this.f29680j) {
                this.f29676f[4].put("StripOffsets", d.m(0, this.f29678h));
                this.f29676f[4].put("StripByteCounts", d.m(this.f29683m, this.f29678h));
            } else {
                this.f29676f[4].put("JPEGInterchangeFormat", d.i(0L, this.f29678h));
                this.f29676f[4].put("JPEGInterchangeFormatLength", d.i(this.f29683m, this.f29678h));
            }
        }
        for (int i11 = 0; i11 < d7.length; i11++) {
            Iterator<Map.Entry<String, d>> it = this.f29676f[i11].entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int s10 = it.next().getValue().s();
                if (s10 > 4) {
                    i12 += s10;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < d7.length; i14++) {
            if (!this.f29676f[i14].isEmpty()) {
                iArr[i14] = i13;
                i13 = (this.f29676f[i14].size() * 12) + 6 + iArr2[i14] + i13;
            }
        }
        if (this.f29679i) {
            if (this.f29680j) {
                this.f29676f[4].put("StripOffsets", d.m(i13, this.f29678h));
            } else {
                this.f29676f[4].put("JPEGInterchangeFormat", d.i(i13, this.f29678h));
            }
            this.f29682l = i13;
            i13 += this.f29683m;
        }
        if (this.f29674d == 4) {
            i13 += 8;
        }
        if (f29651w) {
            for (int i15 = 0; i15 < d7.length; i15++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i15), Integer.valueOf(iArr[i15]), Integer.valueOf(this.f29676f[i15].size()), Integer.valueOf(iArr2[i15]), Integer.valueOf(i13));
            }
        }
        if (!this.f29676f[1].isEmpty()) {
            this.f29676f[0].put(e7[1].f29709b, d.i(iArr[1], this.f29678h));
        }
        if (!this.f29676f[2].isEmpty()) {
            this.f29676f[0].put(e7[2].f29709b, d.i(iArr[2], this.f29678h));
        }
        if (!this.f29676f[3].isEmpty()) {
            this.f29676f[1].put(e7[3].f29709b, d.i(iArr[3], this.f29678h));
        }
        int i16 = this.f29674d;
        if (i16 == 4) {
            cVar.f(i13);
            cVar.write(k7);
        } else if (i16 == 13) {
            cVar.c(i13);
            cVar.write(T5);
        } else if (i16 == 14) {
            cVar.write(b6);
            cVar.c(i13);
        }
        cVar.d(this.f29678h == ByteOrder.BIG_ENDIAN ? p6 : o6);
        cVar.a(this.f29678h);
        cVar.f(42);
        cVar.e(8L);
        for (int i17 = 0; i17 < d7.length; i17++) {
            if (!this.f29676f[i17].isEmpty()) {
                cVar.f(this.f29676f[i17].size());
                int size = (this.f29676f[i17].size() * 12) + iArr[i17] + 2 + 4;
                for (Map.Entry<String, d> entry2 : this.f29676f[i17].entrySet()) {
                    int i18 = g7[i17].get(entry2.getKey()).f29708a;
                    d value = entry2.getValue();
                    int s11 = value.s();
                    cVar.f(i18);
                    cVar.f(value.f29704a);
                    cVar.c(value.f29705b);
                    if (s11 > 4) {
                        cVar.e(size);
                        size += s11;
                    } else {
                        cVar.write(value.f29707d);
                        if (s11 < 4) {
                            while (s11 < 4) {
                                cVar.b(0);
                                s11++;
                            }
                        }
                    }
                }
                if (i17 != 0 || this.f29676f[4].isEmpty()) {
                    cVar.e(0L);
                } else {
                    cVar.e(iArr[4]);
                }
                Iterator<Map.Entry<String, d>> it2 = this.f29676f[i17].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f29707d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f29679i) {
            cVar.write(G());
        }
        if (this.f29674d == 14 && i13 % 2 == 1) {
            cVar.b(0);
        }
        cVar.a(ByteOrder.BIG_ENDIAN);
        return i13;
    }

    private void I(b bVar) throws IOException {
        if (f29651w) {
            Objects.toString(bVar);
        }
        bVar.c(ByteOrder.LITTLE_ENDIAN);
        bVar.d(Y5.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = Z5;
        bVar.d(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = bVar.readInt();
                int i10 = length + 8;
                if (Arrays.equals(b6, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (bVar.read(bArr3) == readInt2) {
                        this.f29686p = i10;
                        j0(bArr3, 0);
                        z0(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                    }
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i10 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.d(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private static Pair<Integer, Integer> J(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> J8 = J(split[0]);
            if (((Integer) J8.first).intValue() == 2) {
                return J8;
            }
            for (int i10 = 1; i10 < split.length; i10++) {
                Pair<Integer, Integer> J9 = J(split[i10]);
                int intValue = (((Integer) J9.first).equals(J8.first) || ((Integer) J9.second).equals(J8.first)) ? ((Integer) J8.first).intValue() : -1;
                int intValue2 = (((Integer) J8.second).intValue() == -1 || !(((Integer) J9.first).equals(J8.second) || ((Integer) J9.second).equals(J8.second))) ? -1 : ((Integer) J8.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    J8 = new Pair<>(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    J8 = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return J8;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    return (parseLong < 0 || parseLong > okhttp3.internal.ws.g.f84969s) ? parseLong < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] split2 = str.split("/", -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    private void K(b bVar, HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int p10 = dVar.p(this.f29678h);
        int p11 = dVar2.p(this.f29678h);
        if (this.f29674d == 7) {
            p10 += this.f29687q;
        }
        if (p10 <= 0 || p11 <= 0) {
            return;
        }
        this.f29679i = true;
        if (this.f29671a == null && this.f29673c == null && this.f29672b == null) {
            byte[] bArr = new byte[p11];
            bVar.skip(p10);
            bVar.read(bArr);
            this.f29684n = bArr;
        }
        this.f29682l = p10;
        this.f29683m = p11;
    }

    private void L(b bVar, HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get("StripOffsets");
        d dVar2 = (d) hashMap.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] d10 = androidx.exifinterface.media.b.d(dVar.r(this.f29678h));
        long[] d11 = androidx.exifinterface.media.b.d(dVar2.r(this.f29678h));
        if (d10 == null || d10.length == 0 || d11 == null || d11.length == 0 || d10.length != d11.length) {
            return;
        }
        long j10 = 0;
        for (long j11 : d11) {
            j10 += j11;
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        this.f29681k = true;
        this.f29680j = true;
        this.f29679i = true;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < d10.length; i13++) {
            int i14 = (int) d10[i13];
            int i15 = (int) d11[i13];
            if (i13 < d10.length - 1 && i14 + i15 != d10[i13 + 1]) {
                this.f29681k = false;
            }
            int i16 = i14 - i11;
            if (i16 < 0) {
                return;
            }
            long j12 = i16;
            if (bVar.skip(j12) != j12) {
                return;
            }
            int i17 = i11 + i16;
            byte[] bArr2 = new byte[i15];
            if (bVar.read(bArr2) != i15) {
                return;
            }
            i11 = i17 + i15;
            System.arraycopy(bArr2, 0, bArr, i12, i15);
            i12 += i15;
        }
        this.f29684n = bArr;
        if (this.f29681k) {
            this.f29682l = (int) d10[0];
            this.f29683m = i10;
        }
    }

    private void O(String str) throws IOException {
        FileInputStream fileInputStream;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f29673c = null;
        this.f29671a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (X(fileInputStream.getFD())) {
                this.f29672b = fileInputStream.getFD();
            } else {
                this.f29672b = null;
            }
            e0(fileInputStream);
            androidx.exifinterface.media.b.c(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            androidx.exifinterface.media.b.c(fileInputStream2);
            throw th;
        }
    }

    private static boolean P(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = k7;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = k7;
            if (i10 >= bArr3.length) {
                return true;
            }
            if (bArr2[i10] != bArr3[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean R(byte[] bArr) throws IOException {
        b bVar;
        long readInt;
        byte[] bArr2;
        long j10;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
            try {
                readInt = bVar.readInt();
                bArr2 = new byte[4];
                bVar.read(bArr2);
            } catch (Exception unused) {
                bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (!Arrays.equals(bArr2, G5)) {
            bVar.close();
            return false;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j10 = 16;
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j10 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j11 = readInt - j10;
        if (j11 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z10 = false;
        boolean z11 = false;
        for (long j12 = 0; j12 < j11 / 4; j12++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j12 != 1) {
                if (Arrays.equals(bArr3, H5)) {
                    z10 = true;
                } else if (Arrays.equals(bArr3, I5)) {
                    z11 = true;
                }
                if (z10 && z11) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    private static boolean S(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = D5;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean T(byte[] bArr) throws IOException {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder i02 = i0(bVar2);
                this.f29678h = i02;
                bVar2.c(i02);
                short readShort = bVar2.readShort();
                boolean z10 = readShort == 20306 || readShort == 21330;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean U(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = S5;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean V(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    private boolean W(byte[] bArr) throws IOException {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder i02 = i0(bVar2);
                this.f29678h = i02;
                bVar2.c(i02);
                boolean z10 = bVar2.readShort() == 85;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean X(FileDescriptor fileDescriptor) {
        try {
            b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean Y(HashMap hashMap) throws IOException {
        d dVar;
        d dVar2 = (d) hashMap.get("BitsPerSample");
        if (dVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) dVar2.r(this.f29678h);
        int[] iArr2 = r5;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f29674d != 3 || (dVar = (d) hashMap.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int p10 = dVar.p(this.f29678h);
        return (p10 == 1 && Arrays.equals(iArr, t5)) || (p10 == 6 && Arrays.equals(iArr, iArr2));
    }

    private static boolean Z(int i10) {
        return i10 == 4 || i10 == 13 || i10 == 14;
    }

    private void a() {
        String i10 = i("DateTimeOriginal");
        if (i10 != null && i("DateTime") == null) {
            this.f29676f[0].put("DateTime", d.h(i10));
        }
        if (i("ImageWidth") == null) {
            this.f29676f[0].put("ImageWidth", d.i(0L, this.f29678h));
        }
        if (i("ImageLength") == null) {
            this.f29676f[0].put("ImageLength", d.i(0L, this.f29678h));
        }
        if (i("Orientation") == null) {
            this.f29676f[0].put("Orientation", d.i(0L, this.f29678h));
        }
        if (i("LightSource") == null) {
            this.f29676f[1].put("LightSource", d.i(0L, this.f29678h));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean a0(@o0 String str) {
        if (str == null) {
            throw new NullPointerException("mimeType shouldn't be null");
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        char c10 = 65535;
        switch (lowerCase.hashCode()) {
            case -1875291391:
                if (lowerCase.equals("image/x-fuji-raf")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1635437028:
                if (lowerCase.equals("image/x-samsung-srw")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1594371159:
                if (lowerCase.equals("image/x-sony-arw")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1487464693:
                if (lowerCase.equals("image/heic")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1487464690:
                if (lowerCase.equals("image/heif")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1487394660:
                if (lowerCase.equals("image/jpeg")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1487018032:
                if (lowerCase.equals("image/webp")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1423313290:
                if (lowerCase.equals("image/x-adobe-dng")) {
                    c10 = 7;
                    break;
                }
                break;
            case -985160897:
                if (lowerCase.equals("image/x-panasonic-rw2")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -879258763:
                if (lowerCase.equals("image/png")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -332763809:
                if (lowerCase.equals("image/x-pentax-pef")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1378106698:
                if (lowerCase.equals("image/x-olympus-orf")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2099152104:
                if (lowerCase.equals("image/x-nikon-nef")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2099152524:
                if (lowerCase.equals("image/x-nikon-nrw")) {
                    c10 = m.f86065d;
                    break;
                }
                break;
            case 2111234748:
                if (lowerCase.equals("image/x-canon-cr2")) {
                    c10 = 14;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
                return true;
            default:
                return false;
        }
    }

    private String b(double d10) {
        long j10 = (long) d10;
        double d11 = d10 - j10;
        long j11 = (long) (d11 * 60.0d);
        return j10 + "/1," + j11 + "/1," + Math.round((d11 - (j11 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    private boolean b0(HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.p(this.f29678h) <= 512 && dVar2.p(this.f29678h) <= 512;
    }

    private static double c(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split("/", -1);
            double parseDouble3 = ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d) + (parseDouble2 / 60.0d) + parseDouble;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private void d(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = j7;
                sb.append(new String(bArr, charset));
                sb.append(bArr2 == null ? "" : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb.toString());
            }
            e(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private boolean d0(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = Y5;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = Z5;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[Y5.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    private void e(b bVar, c cVar, byte[] bArr) throws IOException {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.c(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        androidx.exifinterface.media.b.f(bVar, cVar, readInt);
    }

    private void e0(@o0 InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i10 = 0; i10 < d7.length; i10++) {
            try {
                try {
                    this.f29676f[i10] = new HashMap<>();
                } catch (IOException | UnsupportedOperationException unused) {
                    boolean z10 = f29651w;
                    a();
                    if (!z10) {
                        return;
                    }
                }
            } catch (Throwable th) {
                a();
                if (f29651w) {
                    h0();
                }
                throw th;
            }
        }
        if (!this.f29675e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f29674d = w(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (A0(this.f29674d)) {
            i iVar = new i(inputStream);
            if (this.f29675e) {
                D(iVar);
            } else {
                int i11 = this.f29674d;
                if (i11 == 12) {
                    s(iVar);
                } else if (i11 == 7) {
                    x(iVar);
                } else if (i11 == 10) {
                    C(iVar);
                } else {
                    A(iVar);
                }
            }
            iVar.e(this.f29686p);
            z0(iVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f29674d;
            if (i12 == 4) {
                t(bVar, 0, 0);
            } else if (i12 == 13) {
                y(bVar);
            } else if (i12 == 9) {
                z(bVar);
            } else if (i12 == 14) {
                I(bVar);
            }
        }
        a();
        if (!f29651w) {
            return;
        }
        h0();
    }

    private static Long f0(@q0 String str, @q0 String str2, @q0 String str3) {
        if (str != null && U7.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date parse = m6.parse(str, parsePosition);
                if (parse == null && (parse = n6.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = parse.getTime();
                if (str3 != null) {
                    int i10 = 1;
                    String substring = str3.substring(0, 1);
                    int parseInt = Integer.parseInt(str3.substring(1, 3));
                    int parseInt2 = Integer.parseInt(str3.substring(4, 6));
                    if (("+".equals(substring) || "-".equals(substring)) && ":".equals(str3.substring(3, 4)) && parseInt <= 14) {
                        int i11 = ((parseInt * 60) + parseInt2) * 60000;
                        if (!"-".equals(substring)) {
                            i10 = -1;
                        }
                        time += i11 * i10;
                    }
                }
                if (str2 != null) {
                    time += androidx.exifinterface.media.b.g(str2);
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    private void g0(b bVar) throws IOException {
        ByteOrder i02 = i0(bVar);
        this.f29678h = i02;
        bVar.c(i02);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f29674d;
        if (i10 != 7 && i10 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException(android.support.v4.media.a.a("Invalid first Ifd offset: ", readInt));
        }
        int i11 = readInt - 8;
        if (i11 > 0) {
            bVar.d(i11);
        }
    }

    private void h0() {
        int i10 = 0;
        while (true) {
            HashMap<String, d>[] hashMapArr = this.f29676f;
            if (i10 >= hashMapArr.length) {
                return;
            }
            hashMapArr[i10].size();
            for (Map.Entry<String, d> entry : this.f29676f[i10].entrySet()) {
                d value = entry.getValue();
                entry.getKey();
                value.toString();
                value.q(this.f29678h);
            }
            i10++;
        }
    }

    private ByteOrder i0(b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    private void j0(byte[] bArr, int i10) throws IOException {
        i iVar = new i(bArr);
        g0(iVar);
        k0(iVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k0(androidx.exifinterface.media.a.i r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.k0(androidx.exifinterface.media.a$i, int):void");
    }

    private void l0(String str) {
        for (int i10 = 0; i10 < d7.length; i10++) {
            this.f29676f[i10].remove(str);
        }
    }

    private void m0(int i10, String str, String str2) {
        if (this.f29676f[i10].isEmpty() || this.f29676f[i10].get(str) == null) {
            return;
        }
        HashMap<String, d> hashMap = this.f29676f[i10];
        hashMap.put(str2, hashMap.get(str));
        this.f29676f[i10].remove(str);
    }

    private void o0(i iVar, int i10) throws IOException {
        d dVar = this.f29676f[i10].get("ImageLength");
        d dVar2 = this.f29676f[i10].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f29676f[i10].get("JPEGInterchangeFormat");
            d dVar4 = this.f29676f[i10].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int p10 = dVar3.p(this.f29678h);
            int p11 = dVar3.p(this.f29678h);
            iVar.e(p10);
            byte[] bArr = new byte[p11];
            iVar.read(bArr);
            t(new b(bArr), p10, i10);
        }
    }

    @q0
    private d q(@o0 String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < d7.length; i10++) {
            d dVar = this.f29676f[i10].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    private void r0(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f29651w) {
            Objects.toString(inputStream);
            Objects.toString(outputStream);
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-40);
        d remove = (i("Xmp") == null || !this.f29691u) ? null : this.f29676f[0].remove("Xmp");
        cVar.b(-1);
        cVar.b(-31);
        E0(cVar);
        if (remove != null) {
            this.f29676f[0].put("Xmp", remove);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte readByte = bVar.readByte();
            if (readByte == -39 || readByte == -38) {
                cVar.b(-1);
                cVar.b(readByte);
                androidx.exifinterface.media.b.e(bVar, cVar);
                return;
            }
            if (readByte != -31) {
                cVar.b(-1);
                cVar.b(readByte);
                int readUnsignedShort = bVar.readUnsignedShort();
                cVar.d((short) readUnsignedShort);
                int i10 = readUnsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int read = bVar.read(bArr, 0, Math.min(i10, 4096));
                    if (read >= 0) {
                        cVar.write(bArr, 0, read);
                        i10 -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = bVar.readUnsignedShort();
                int i11 = readUnsignedShort2 - 2;
                if (i11 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i11 >= 6) {
                    if (bVar.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, k7)) {
                        bVar.d(readUnsignedShort2 - 8);
                    }
                }
                cVar.b(-1);
                cVar.b(readByte);
                cVar.d((short) readUnsignedShort2);
                if (i11 >= 6) {
                    i11 = readUnsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i11 > 0) {
                    int read2 = bVar.read(bArr, 0, Math.min(i11, 4096));
                    if (read2 >= 0) {
                        cVar.write(bArr, 0, read2);
                        i11 -= read2;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    private void s(i iVar) throws IOException {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.C0481b.a(mediaMetadataRetriever, new C0480a(iVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                if (str != null) {
                    this.f29676f[0].put("ImageWidth", d.m(Integer.parseInt(str), this.f29678h));
                }
                if (str2 != null) {
                    this.f29676f[0].put("ImageLength", d.m(Integer.parseInt(str2), this.f29678h));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    this.f29676f[0].put("Orientation", d.m(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f29678h));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    iVar.e(parseInt2);
                    byte[] bArr = new byte[6];
                    if (iVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i10 = parseInt2 + 6;
                    int i11 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, k7)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i11];
                    if (iVar.read(bArr2) != i11) {
                        throw new IOException("Can't read exif");
                    }
                    this.f29686p = i10;
                    j0(bArr2, 0);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    private void s0(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f29651w) {
            Objects.toString(inputStream);
            Objects.toString(outputStream);
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        androidx.exifinterface.media.b.f(bVar, cVar, S5.length);
        if (this.f29686p == 0) {
            int readInt = bVar.readInt();
            cVar.c(readInt);
            androidx.exifinterface.media.b.f(bVar, cVar, readInt + 8);
        } else {
            androidx.exifinterface.media.b.f(bVar, cVar, (r2 - r7.length) - 8);
            bVar.d(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                E0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f29701b).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.c((int) crc32.getValue());
                androidx.exifinterface.media.b.c(byteArrayOutputStream2);
                androidx.exifinterface.media.b.e(bVar, cVar);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                androidx.exifinterface.media.b.c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0128 A[LOOP:0: B:9:0x0024->B:32:0x0128, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t(androidx.exifinterface.media.a.b r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.t(androidx.exifinterface.media.a$b, int, int):void");
    }

    private void t0(InputStream inputStream, OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        int i10;
        int i11;
        int i12;
        if (f29651w) {
            Objects.toString(inputStream);
            Objects.toString(outputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = Y5;
        androidx.exifinterface.media.b.f(bVar, cVar, bArr.length);
        byte[] bArr2 = Z5;
        bVar.d(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            int i13 = this.f29686p;
            if (i13 != 0) {
                androidx.exifinterface.media.b.f(bVar, cVar2, (i13 - ((bArr.length + 4) + bArr2.length)) - 8);
                bVar.d(4);
                int readInt = bVar.readInt();
                if (readInt % 2 != 0) {
                    readInt++;
                }
                bVar.d(readInt);
                E0(cVar2);
            } else {
                byte[] bArr3 = new byte[4];
                if (bVar.read(bArr3) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                }
                byte[] bArr4 = e6;
                boolean z10 = true;
                if (Arrays.equals(bArr3, bArr4)) {
                    int readInt2 = bVar.readInt();
                    byte[] bArr5 = new byte[readInt2 % 2 == 1 ? readInt2 + 1 : readInt2];
                    bVar.read(bArr5);
                    byte b10 = (byte) (8 | bArr5[0]);
                    bArr5[0] = b10;
                    boolean z11 = ((b10 >> 1) & 1) == 1;
                    cVar2.write(bArr4);
                    cVar2.c(readInt2);
                    cVar2.write(bArr5);
                    if (z11) {
                        d(bVar, cVar2, h6, null);
                        while (true) {
                            byte[] bArr6 = new byte[4];
                            inputStream.read(bArr6);
                            if (!Arrays.equals(bArr6, i6)) {
                                break;
                            } else {
                                e(bVar, cVar2, bArr6);
                            }
                        }
                        E0(cVar2);
                    } else {
                        d(bVar, cVar2, g6, f6);
                        E0(cVar2);
                    }
                } else {
                    byte[] bArr7 = g6;
                    if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f6)) {
                        int readInt3 = bVar.readInt();
                        int i14 = readInt3 % 2 == 1 ? readInt3 + 1 : readInt3;
                        byte[] bArr8 = new byte[3];
                        if (Arrays.equals(bArr3, bArr7)) {
                            bVar.read(bArr8);
                            byte[] bArr9 = new byte[3];
                            if (bVar.read(bArr9) != 3 || !Arrays.equals(c6, bArr9)) {
                                throw new IOException("Encountered error while checking VP8 signature");
                            }
                            i10 = bVar.readInt();
                            i14 -= 10;
                            i12 = (i10 << 2) >> 18;
                            i11 = (i10 << 18) >> 18;
                            z10 = false;
                        } else if (!Arrays.equals(bArr3, f6)) {
                            i10 = 0;
                            z10 = false;
                            i11 = 0;
                            i12 = 0;
                        } else {
                            if (bVar.readByte() != 47) {
                                throw new IOException("Encountered error while checking VP8L signature");
                            }
                            i10 = bVar.readInt();
                            i11 = (i10 & 16383) + 1;
                            i12 = ((i10 & 268419072) >>> 14) + 1;
                            if ((i10 & ClientDefaults.MAX_MSG_SIZE) == 0) {
                                z10 = false;
                            }
                            i14 -= 5;
                        }
                        cVar2.write(bArr4);
                        cVar2.c(10);
                        byte[] bArr10 = new byte[10];
                        if (z10) {
                            bArr10[0] = (byte) (bArr10[0] | com.google.common.base.c.f54872r);
                        }
                        bArr10[0] = (byte) (bArr10[0] | 8);
                        int i15 = i11 - 1;
                        int i16 = i12 - 1;
                        bArr10[4] = (byte) i15;
                        bArr10[5] = (byte) (i15 >> 8);
                        bArr10[6] = (byte) (i15 >> 16);
                        bArr10[7] = (byte) i16;
                        bArr10[8] = (byte) (i16 >> 8);
                        bArr10[9] = (byte) (i16 >> 16);
                        cVar2.write(bArr10);
                        cVar2.write(bArr3);
                        cVar2.c(readInt3);
                        if (Arrays.equals(bArr3, bArr7)) {
                            cVar2.write(bArr8);
                            cVar2.write(c6);
                            cVar2.c(i10);
                        } else if (Arrays.equals(bArr3, f6)) {
                            cVar2.write(47);
                            cVar2.c(i10);
                        }
                        androidx.exifinterface.media.b.f(bVar, cVar2, i14);
                        E0(cVar2);
                    }
                }
            }
            androidx.exifinterface.media.b.e(bVar, cVar2);
            int size = byteArrayOutputStream.size();
            byte[] bArr11 = Z5;
            cVar.c(size + bArr11.length);
            cVar.write(bArr11);
            byteArrayOutputStream.writeTo(cVar);
            androidx.exifinterface.media.b.c(byteArrayOutputStream);
        } catch (Exception e11) {
            e = e11;
            byteArrayOutputStream2 = byteArrayOutputStream;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            androidx.exifinterface.media.b.c(byteArrayOutputStream2);
            throw th;
        }
    }

    private int w(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (S(bArr)) {
            return 4;
        }
        if (V(bArr)) {
            return 9;
        }
        if (R(bArr)) {
            return 12;
        }
        if (T(bArr)) {
            return 7;
        }
        if (W(bArr)) {
            return 10;
        }
        if (U(bArr)) {
            return 13;
        }
        return d0(bArr) ? 14 : 0;
    }

    private void x(i iVar) throws IOException {
        int i10;
        int i11;
        A(iVar);
        d dVar = this.f29676f[1].get("MakerNote");
        if (dVar != null) {
            i iVar2 = new i(dVar.f29707d);
            iVar2.c(this.f29678h);
            byte[] bArr = L5;
            byte[] bArr2 = new byte[bArr.length];
            iVar2.readFully(bArr2);
            iVar2.e(0L);
            byte[] bArr3 = M5;
            byte[] bArr4 = new byte[bArr3.length];
            iVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                iVar2.e(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                iVar2.e(12L);
            }
            k0(iVar2, 6);
            d dVar2 = this.f29676f[7].get("PreviewImageStart");
            d dVar3 = this.f29676f[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                this.f29676f[5].put("JPEGInterchangeFormat", dVar2);
                this.f29676f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = this.f29676f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.r(this.f29678h);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                d m10 = d.m(i14, this.f29678h);
                d m11 = d.m(i15, this.f29678h);
                this.f29676f[0].put("ImageWidth", m10);
                this.f29676f[0].put("ImageLength", m11);
            }
        }
    }

    private void y(b bVar) throws IOException {
        if (f29651w) {
            Objects.toString(bVar);
        }
        bVar.c(ByteOrder.BIG_ENDIAN);
        byte[] bArr = S5;
        bVar.d(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i10 = length + 8;
                if (i10 == 16 && !Arrays.equals(bArr2, U5)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, V5)) {
                    return;
                }
                if (Arrays.equals(bArr2, T5)) {
                    byte[] bArr3 = new byte[readInt];
                    if (bVar.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                    }
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f29686p = i10;
                        j0(bArr3, 0);
                        D0();
                        z0(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i11 = readInt + 4;
                bVar.d(i11);
                length = i10 + i11;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void z(b bVar) throws IOException {
        if (f29651w) {
            Objects.toString(bVar);
        }
        bVar.d(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.d(i10 - bVar.a());
        bVar.read(bArr4);
        t(new b(bArr4), i10, 5);
        bVar.d(i12 - bVar.a());
        bVar.c(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == O6.f29708a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d m10 = d.m(readShort, this.f29678h);
                d m11 = d.m(readShort2, this.f29678h);
                this.f29676f[0].put("ImageLength", m10);
                this.f29676f[0].put("ImageWidth", m11);
                return;
            }
            bVar.d(readUnsignedShort2);
        }
    }

    private void z0(b bVar) throws IOException {
        HashMap<String, d> hashMap = this.f29676f[4];
        d dVar = hashMap.get("Compression");
        if (dVar == null) {
            this.f29685o = 6;
            K(bVar, hashMap);
            return;
        }
        int p10 = dVar.p(this.f29678h);
        this.f29685o = p10;
        if (p10 != 1) {
            if (p10 == 6) {
                K(bVar, hashMap);
                return;
            } else if (p10 != 7) {
                return;
            }
        }
        if (Y(hashMap)) {
            L(bVar, hashMap);
        }
    }

    public int B() {
        switch (l("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    @q0
    public byte[] E() {
        int i10 = this.f29685o;
        if (i10 == 6 || i10 == 7) {
            return G();
        }
        return null;
    }

    @q0
    public Bitmap F() {
        if (!this.f29679i) {
            return null;
        }
        if (this.f29684n == null) {
            this.f29684n = G();
        }
        int i10 = this.f29685o;
        if (i10 == 6 || i10 == 7) {
            return BitmapFactory.decodeByteArray(this.f29684n, 0, this.f29683m);
        }
        if (i10 == 1) {
            int length = this.f29684n.length / 3;
            int[] iArr = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                byte[] bArr = this.f29684n;
                int i12 = i11 * 3;
                iArr[i11] = (bArr[i12] << com.google.common.base.c.f54872r) + (bArr[i12 + 1] << 8) + bArr[i12 + 2];
            }
            d dVar = this.f29676f[4].get("ThumbnailImageLength");
            d dVar2 = this.f29676f[4].get("ThumbnailImageWidth");
            if (dVar != null && dVar2 != null) {
                return Bitmap.createBitmap(iArr, dVar2.p(this.f29678h), dVar.p(this.f29678h), Bitmap.Config.ARGB_8888);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[Catch: all -> 0x007f, Exception -> 0x00a0, TRY_ENTER, TryCatch #7 {Exception -> 0x00a0, all -> 0x007f, blocks: (B:16:0x0052, B:19:0x0068, B:21:0x0074, B:26:0x0084, B:27:0x0089, B:28:0x008a, B:29:0x008f), top: B:15:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a A[Catch: all -> 0x007f, Exception -> 0x00a0, TryCatch #7 {Exception -> 0x00a0, all -> 0x007f, blocks: (B:16:0x0052, B:19:0x0068, B:21:0x0074, B:26:0x0084, B:27:0x0089, B:28:0x008a, B:29:0x008f), top: B:15:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[SYNTHETIC] */
    @androidx.annotation.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] G() {
        /*
            r8 = this;
            boolean r0 = r8.f29679i
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            byte[] r0 = r8.f29684n
            if (r0 == 0) goto Lb
            return r0
        Lb:
            android.content.res.AssetManager$AssetInputStream r0 = r8.f29673c     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            if (r0 == 0) goto L28
            boolean r2 = r0.markSupported()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L21
            if (r2 == 0) goto L24
            r0.reset()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L21
        L18:
            r2 = r1
            goto L52
        L1a:
            r2 = move-exception
            r7 = r1
            r1 = r0
            r0 = r2
            r2 = r7
            goto L97
        L21:
            r2 = r1
            goto La0
        L24:
            androidx.exifinterface.media.b.c(r0)
            return r1
        L28:
            java.lang.String r0 = r8.f29671a     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            if (r0 == 0) goto L3d
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            java.lang.String r2 = r8.f29671a     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            goto L18
        L34:
            r2 = move-exception
            r0 = r2
            r2 = r1
            goto L97
        L39:
            r0 = r1
            r2 = r0
            goto La0
        L3d:
            java.io.FileDescriptor r0 = r8.f29672b     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            java.io.FileDescriptor r0 = androidx.exifinterface.media.b.a.b(r0)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            int r2 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            r3 = 0
            androidx.exifinterface.media.b.a.c(r0, r3, r2)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            r7 = r2
            r2 = r0
            r0 = r7
        L52:
            int r3 = r8.f29682l     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r4 = r8.f29686p     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r3 = r3 + r4
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            long r3 = r0.skip(r3)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r5 = r8.f29682l     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r6 = r8.f29686p     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r5 = r5 + r6
            long r5 = (long) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            java.lang.String r4 = "Corrupted image"
            if (r3 != 0) goto L8a
            int r3 = r8.f29683m     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r5 = r0.read(r3)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r6 = r8.f29683m     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            if (r5 != r6) goto L84
            r8.f29684n = r3     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            androidx.exifinterface.media.b.c(r0)
            if (r2 == 0) goto L7e
            androidx.exifinterface.media.b.b(r2)
        L7e:
            return r3
        L7f:
            r1 = move-exception
            r7 = r1
            r1 = r0
        L82:
            r0 = r7
            goto L97
        L84:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            throw r3     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
        L8a:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            throw r3     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
        L90:
            r2 = move-exception
            r7 = r2
            r2 = r0
            goto L82
        L94:
            r2 = r0
            r0 = r1
            goto La0
        L97:
            androidx.exifinterface.media.b.c(r1)
            if (r2 == 0) goto L9f
            androidx.exifinterface.media.b.b(r2)
        L9f:
            throw r0
        La0:
            androidx.exifinterface.media.b.c(r0)
            if (r2 == 0) goto La8
            androidx.exifinterface.media.b.b(r2)
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.G():byte[]");
    }

    @q0
    public long[] H() {
        if (this.f29690t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        if (!this.f29679i) {
            return null;
        }
        if (!this.f29680j || this.f29681k) {
            return new long[]{this.f29682l + this.f29686p, this.f29683m};
        }
        return null;
    }

    public boolean M(@o0 String str) {
        return q(str) != null;
    }

    public boolean N() {
        return this.f29679i;
    }

    public boolean Q() {
        int l10 = l("Orientation", 1);
        return l10 == 2 || l10 == 7 || l10 == 4 || l10 == 5;
    }

    public boolean c0() {
        if (!this.f29679i) {
            return false;
        }
        int i10 = this.f29685o;
        return i10 == 6 || i10 == 7;
    }

    public void f() {
        int i10 = 1;
        switch (l("Orientation", 1)) {
            case 1:
                i10 = 2;
                break;
            case 2:
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 3;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 5;
                break;
            case 7:
                i10 = 8;
                break;
            case 8:
                i10 = 7;
                break;
            default:
                i10 = 0;
                break;
        }
        v0("Orientation", Integer.toString(i10));
    }

    public void g() {
        int i10 = 1;
        switch (l("Orientation", 1)) {
            case 1:
                i10 = 4;
                break;
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 2;
                break;
            case 4:
                break;
            case 5:
                i10 = 8;
                break;
            case 6:
                i10 = 7;
                break;
            case 7:
                i10 = 6;
                break;
            case 8:
                i10 = 5;
                break;
            default:
                i10 = 0;
                break;
        }
        v0("Orientation", Integer.toString(i10));
    }

    public double h(double d10) {
        double k10 = k("GPSAltitude", -1.0d);
        int l10 = l("GPSAltitudeRef", -1);
        if (k10 < p.f60679p || l10 < 0) {
            return d10;
        }
        return k10 * (l10 != 1 ? 1 : -1);
    }

    @q0
    public String i(@o0 String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d q10 = q(str);
        if (q10 != null) {
            if (!h7.contains(str)) {
                return q10.q(this.f29678h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = q10.f29704a;
                if (i10 != 5 && i10 != 10) {
                    return null;
                }
                h[] hVarArr = (h[]) q10.r(this.f29678h);
                if (hVarArr == null || hVarArr.length != 3) {
                    Arrays.toString(hVarArr);
                    return null;
                }
                h hVar = hVarArr[0];
                Integer valueOf = Integer.valueOf((int) (hVar.f29712a / hVar.f29713b));
                h hVar2 = hVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (hVar2.f29712a / hVar2.f29713b));
                h hVar3 = hVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (hVar3.f29712a / hVar3.f29713b)));
            }
            try {
                return Double.toString(q10.o(this.f29678h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @q0
    public byte[] j(@o0 String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d q10 = q(str);
        if (q10 != null) {
            return q10.f29707d;
        }
        return null;
    }

    public double k(@o0 String str, double d10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d q10 = q(str);
        if (q10 == null) {
            return d10;
        }
        try {
            return q10.o(this.f29678h);
        } catch (NumberFormatException unused) {
            return d10;
        }
    }

    public int l(@o0 String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d q10 = q(str);
        if (q10 == null) {
            return i10;
        }
        try {
            return q10.p(this.f29678h);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    @q0
    public long[] m(@o0 String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (this.f29690t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        d q10 = q(str);
        if (q10 != null) {
            return new long[]{q10.f29706c, q10.f29707d.length};
        }
        return null;
    }

    @q0
    @c1({c1.a.LIBRARY})
    public Long n() {
        return f0(i("DateTime"), i("SubSecTime"), i("OffsetTime"));
    }

    public void n0() {
        v0("Orientation", Integer.toString(1));
    }

    @q0
    @c1({c1.a.LIBRARY})
    public Long o() {
        return f0(i("DateTimeDigitized"), i("SubSecTimeDigitized"), i("OffsetTimeDigitized"));
    }

    @q0
    @c1({c1.a.LIBRARY})
    public Long p() {
        return f0(i("DateTimeOriginal"), i("SubSecTimeOriginal"), i("OffsetTimeOriginal"));
    }

    public void p0(int i10) {
        if (i10 % 90 != 0) {
            throw new IllegalArgumentException("degree should be a multiple of 90");
        }
        int l10 = l("Orientation", 1);
        List<Integer> list = M2;
        if (list.contains(Integer.valueOf(l10))) {
            int indexOf = ((i10 / 90) + list.indexOf(Integer.valueOf(l10))) % 4;
            r4 = list.get(indexOf + (indexOf < 0 ? 4 : 0)).intValue();
        } else {
            List<Integer> list2 = N2;
            if (list2.contains(Integer.valueOf(l10))) {
                int indexOf2 = ((i10 / 90) + list2.indexOf(Integer.valueOf(l10))) % 4;
                r4 = list2.get(indexOf2 + (indexOf2 < 0 ? 4 : 0)).intValue();
            }
        }
        v0("Orientation", Integer.toString(r4));
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3 A[Catch: all -> 0x0103, Exception -> 0x0107, TryCatch #20 {Exception -> 0x0107, all -> 0x0103, blocks: (B:59:0x00ef, B:61:0x00f3, B:63:0x0111, B:67:0x0109), top: B:58:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0109 A[Catch: all -> 0x0103, Exception -> 0x0107, TryCatch #20 {Exception -> 0x0107, all -> 0x0103, blocks: (B:59:0x00ef, B:61:0x00f3, B:63:0x0111, B:67:0x0109), top: B:58:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.q0():void");
    }

    @q0
    @SuppressLint({"AutoBoxing"})
    public Long r() {
        String i10 = i("GPSDateStamp");
        String i11 = i("GPSTimeStamp");
        if (i10 != null && i11 != null) {
            Pattern pattern = U7;
            if (pattern.matcher(i10).matches() || pattern.matcher(i11).matches()) {
                String str = i10 + ' ' + i11;
                ParsePosition parsePosition = new ParsePosition(0);
                try {
                    Date parse = m6.parse(str, parsePosition);
                    if (parse == null && (parse = n6.parse(str, parsePosition)) == null) {
                        return null;
                    }
                    return Long.valueOf(parse.getTime());
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    @Deprecated
    public boolean u(float[] fArr) {
        double[] v10 = v();
        if (v10 == null) {
            return false;
        }
        fArr[0] = (float) v10[0];
        fArr[1] = (float) v10[1];
        return true;
    }

    public void u0(double d10) {
        String str = d10 >= p.f60679p ? "0" : "1";
        v0("GPSAltitude", new h(Math.abs(d10)).toString());
        v0("GPSAltitudeRef", str);
    }

    @q0
    public double[] v() {
        String i10 = i("GPSLatitude");
        String i11 = i("GPSLatitudeRef");
        String i12 = i("GPSLongitude");
        String i13 = i("GPSLongitudeRef");
        if (i10 == null || i11 == null || i12 == null || i13 == null) {
            return null;
        }
        try {
            return new double[]{c(i10, i11), c(i12, i13)};
        } catch (IllegalArgumentException unused) {
            String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", i10, i11, i12, i13);
            return null;
        }
    }

    public void v0(@o0 String str, @q0 String str2) {
        f fVar;
        int i10;
        String str3 = str;
        String str4 = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
            boolean find = W7.matcher(str4).find();
            boolean find2 = X7.matcher(str4).find();
            if (str2.length() != 19) {
                return;
            }
            if (!find && !find2) {
                return;
            }
            if (find2) {
                str4 = str4.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            str3 = "PhotographicSensitivity";
        }
        int i11 = 2;
        int i12 = 1;
        if (str4 != null && h7.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = V7.matcher(str4);
                if (!matcher.find()) {
                    return;
                }
                str4 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str4 = new h(Double.parseDouble(str4)).toString();
                } catch (NumberFormatException unused) {
                    return;
                }
            }
        }
        int i13 = 0;
        while (i13 < d7.length) {
            if ((i13 != 4 || this.f29679i) && (fVar = g7[i13].get(str3)) != null) {
                if (str4 != null) {
                    Pair<Integer, Integer> J8 = J(str4);
                    if (fVar.f29710c == ((Integer) J8.first).intValue() || fVar.f29710c == ((Integer) J8.second).intValue()) {
                        i10 = fVar.f29710c;
                    } else {
                        int i14 = fVar.f29711d;
                        if (i14 == -1 || !(i14 == ((Integer) J8.first).intValue() || fVar.f29711d == ((Integer) J8.second).intValue())) {
                            int i15 = fVar.f29710c;
                            if (i15 == i12 || i15 == 7 || i15 == i11) {
                                i10 = i15;
                            } else if (f29651w) {
                                String[] strArr = G6;
                                String str5 = strArr[i15];
                                if (fVar.f29711d != -1) {
                                    new StringBuilder(", ").append(strArr[fVar.f29711d]);
                                }
                                String str6 = strArr[((Integer) J8.first).intValue()];
                                if (((Integer) J8.second).intValue() != -1) {
                                    new StringBuilder(", ").append(strArr[((Integer) J8.second).intValue()]);
                                }
                            }
                        } else {
                            i10 = fVar.f29711d;
                        }
                    }
                    switch (i10) {
                        case 1:
                            this.f29676f[i13].put(str3, d.a(str4));
                            break;
                        case 2:
                        case 7:
                            this.f29676f[i13].put(str3, d.h(str4));
                            break;
                        case 3:
                            String[] split = str4.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i16 = 0; i16 < split.length; i16++) {
                                iArr[i16] = Integer.parseInt(split[i16]);
                            }
                            this.f29676f[i13].put(str3, d.n(iArr, this.f29678h));
                            break;
                        case 4:
                            String[] split2 = str4.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i17 = 0; i17 < split2.length; i17++) {
                                jArr[i17] = Long.parseLong(split2[i17]);
                            }
                            this.f29676f[i13].put(str3, d.j(jArr, this.f29678h));
                            break;
                        case 5:
                            String[] split3 = str4.split(",", -1);
                            h[] hVarArr = new h[split3.length];
                            for (int i18 = 0; i18 < split3.length; i18++) {
                                String[] split4 = split3[i18].split("/", -1);
                                hVarArr[i18] = new h((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                            }
                            this.f29676f[i13].put(str3, d.l(hVarArr, this.f29678h));
                            break;
                        case 9:
                            String[] split5 = str4.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i19 = 0; i19 < split5.length; i19++) {
                                iArr2[i19] = Integer.parseInt(split5[i19]);
                            }
                            this.f29676f[i13].put(str3, d.e(iArr2, this.f29678h));
                            break;
                        case 10:
                            String[] split6 = str4.split(",", -1);
                            h[] hVarArr2 = new h[split6.length];
                            int i20 = 0;
                            while (i20 < split6.length) {
                                String[] split7 = split6[i20].split("/", -1);
                                hVarArr2[i20] = new h((long) Double.parseDouble(split7[0]), (long) Double.parseDouble(split7[i12]));
                                i20++;
                                i12 = 1;
                            }
                            this.f29676f[i13].put(str3, d.g(hVarArr2, this.f29678h));
                            break;
                        case 12:
                            String[] split8 = str4.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i21 = 0; i21 < split8.length; i21++) {
                                dArr[i21] = Double.parseDouble(split8[i21]);
                            }
                            this.f29676f[i13].put(str3, d.c(dArr, this.f29678h));
                            break;
                    }
                } else {
                    this.f29676f[i13].remove(str3);
                }
            }
            i13++;
            i11 = 2;
            i12 = 1;
        }
    }

    @c1({c1.a.LIBRARY})
    public void w0(@o0 Long l10) {
        if (l10 == null) {
            throw new NullPointerException("Timestamp should not be null.");
        }
        if (l10.longValue() < 0) {
            throw new IllegalArgumentException("Timestamp should a positive value.");
        }
        String l11 = Long.toString(l10.longValue() % 1000);
        for (int length = l11.length(); length < 3; length++) {
            l11 = androidx.constraintlayout.core.motion.key.c.a("0", l11);
        }
        v0("DateTime", m6.format(new Date(l10.longValue())));
        v0("SubSecTime", l11);
    }

    public void x0(Location location) {
        if (location == null) {
            return;
        }
        v0("GPSProcessingMethod", location.getProvider());
        y0(location.getLatitude(), location.getLongitude());
        u0(location.getAltitude());
        v0("GPSSpeedRef", "K");
        v0("GPSSpeed", new h((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] split = m6.format(new Date(location.getTime())).split("\\s+", -1);
        v0("GPSDateStamp", split[0]);
        v0("GPSTimeStamp", split[1]);
    }

    public void y0(double d10, double d11) {
        if (d10 < -90.0d || d10 > 90.0d || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Latitude value " + d10 + " is not valid.");
        }
        if (d11 < -180.0d || d11 > 180.0d || Double.isNaN(d11)) {
            throw new IllegalArgumentException("Longitude value " + d11 + " is not valid.");
        }
        v0("GPSLatitudeRef", d10 >= p.f60679p ? "N" : "S");
        v0("GPSLatitude", b(Math.abs(d10)));
        v0("GPSLongitudeRef", d11 >= p.f60679p ? "E" : "W");
        v0("GPSLongitude", b(Math.abs(d11)));
    }

    /* compiled from: ExifInterface.java */
    private static class i extends b {
        i(byte[] bArr) throws IOException {
            super(bArr);
            this.f29697b.mark(Integer.MAX_VALUE);
        }

        public void e(long j4) throws IOException {
            int i4 = this.f29699d;
            if (i4 > j4) {
                this.f29699d = 0;
                this.f29697b.reset();
            } else {
                j4 -= i4;
            }
            d((int) j4);
        }

        i(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f29697b.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* compiled from: ExifInterface.java */
    static class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f29708a;

        /* renamed from: b, reason: collision with root package name */
        public final String f29709b;

        /* renamed from: c, reason: collision with root package name */
        public final int f29710c;

        /* renamed from: d, reason: collision with root package name */
        public final int f29711d;

        f(String str, int i4, int i5) {
            this.f29709b = str;
            this.f29708a = i4;
            this.f29710c = i5;
            this.f29711d = -1;
        }

        boolean a(int i4) {
            int i5;
            int i6 = this.f29710c;
            if (i6 == 7 || i4 == 7 || i6 == i4 || (i5 = this.f29711d) == i4) {
                return true;
            }
            if ((i6 == 4 || i5 == 4) && i4 == 3) {
                return true;
            }
            if ((i6 == 9 || i5 == 9) && i4 == 8) {
                return true;
            }
            return (i6 == 12 || i5 == 12) && i4 == 11;
        }

        f(String str, int i4, int i5, int i6) {
            this.f29709b = str;
            this.f29708a = i4;
            this.f29710c = i5;
            this.f29711d = i6;
        }
    }

    public a(@o0 String str) throws IOException {
        f[][] fVarArr = d7;
        this.f29676f = new HashMap[fVarArr.length];
        this.f29677g = new HashSet(fVarArr.length);
        this.f29678h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            O(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public a(@o0 FileDescriptor fileDescriptor) throws IOException {
        boolean z10;
        FileInputStream fileInputStream;
        Throwable th;
        f[][] fVarArr = d7;
        this.f29676f = new HashMap[fVarArr.length];
        this.f29677g = new HashSet(fVarArr.length);
        this.f29678h = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f29673c = null;
            this.f29671a = null;
            if (X(fileDescriptor)) {
                this.f29672b = fileDescriptor;
                try {
                    fileDescriptor = b.a.b(fileDescriptor);
                    z10 = true;
                } catch (Exception e10) {
                    throw new IOException("Failed to duplicate file descriptor", e10);
                }
            } else {
                this.f29672b = null;
                z10 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    e0(fileInputStream);
                    androidx.exifinterface.media.b.c(fileInputStream);
                    if (z10) {
                        androidx.exifinterface.media.b.b(fileDescriptor);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    androidx.exifinterface.media.b.c(fileInputStream);
                    if (z10) {
                        androidx.exifinterface.media.b.b(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    public a(@o0 InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    public a(@o0 InputStream inputStream, int i10) throws IOException {
        f[][] fVarArr = d7;
        this.f29676f = new HashMap[fVarArr.length];
        this.f29677g = new HashSet(fVarArr.length);
        this.f29678h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f29671a = null;
            if (i10 == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, k7.length);
                if (!P(bufferedInputStream)) {
                    return;
                }
                this.f29675e = true;
                this.f29673c = null;
                this.f29672b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f29673c = (AssetManager.AssetInputStream) inputStream;
                this.f29672b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (X(fileInputStream.getFD())) {
                        this.f29673c = null;
                        this.f29672b = fileInputStream.getFD();
                    }
                }
                this.f29673c = null;
                this.f29672b = null;
            }
            e0(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
