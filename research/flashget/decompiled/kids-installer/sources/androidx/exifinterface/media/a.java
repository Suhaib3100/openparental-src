package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.view.menu.s;
import androidx.core.view.e0;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.firebase.remoteconfig.p;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
import org.apache.commons.io.n;

/* compiled from: ExifInterface.java */
/* loaded from: classes.dex */
public class a {
    public static final short A3 = 3;
    public static final short A4 = 0;
    public static final int A5 = 0;
    private static final int A6 = 6;
    private static final byte A7 = -54;
    public static final short B3 = 4;
    public static final short B4 = 1;
    public static final int B5 = 1;
    private static final int B6 = 7;
    private static final byte B7 = -53;
    public static final short C3 = 9;
    public static final short C4 = 2;
    public static final int C5 = 0;
    private static final int C6 = 8;
    private static final byte C7 = -51;
    public static final short D3 = 10;
    public static final short D4 = 3;
    public static final int D5 = 1;
    private static final int D6 = 9;
    private static final byte D7 = -50;
    private static final int E2 = 512;
    public static final short E3 = 11;
    public static final short E4 = 4;
    private static final int E5 = 5000;
    private static final int E6 = 10;
    private static final byte E7 = -49;
    public static final int F2 = 0;
    public static final short F3 = 12;
    public static final short F4 = 0;
    private static final int F6 = 11;
    private static final byte F7 = -38;
    public static final int G2 = 1;
    public static final short G3 = 13;
    public static final short G4 = 1;
    private static final int G6 = 12;
    static final byte G7 = -31;
    public static final int H2 = 2;
    public static final short H3 = 14;
    public static final short H4 = 2;
    private static final int H5 = 84;
    private static final int H6 = 13;
    private static final byte H7 = -2;
    public static final int I2 = 3;
    public static final short I3 = 15;
    public static final short I4 = 0;
    private static final int I5 = 4;
    static final byte I7 = -39;
    public static final int J2 = 4;
    public static final short J3 = 16;
    public static final short J4 = 0;
    private static final int J7 = 0;
    public static final int K2 = 5;
    public static final short K3 = 17;
    public static final short K4 = 0;
    private static final int K7 = 1;
    public static final int L2 = 6;
    public static final short L3 = 18;
    public static final short L4 = 0;
    private static final f[] L6;
    private static final int L7 = 2;
    public static final int M2 = 7;
    public static final short M3 = 19;
    public static final short M4 = 1;
    private static final short M5 = 20306;
    private static final f[] M6;
    private static final int M7 = 3;
    public static final int N2 = 8;
    public static final short N3 = 20;
    public static final short N4 = 2;
    private static final short N5 = 21330;
    private static final f[] N6;
    private static final int N7 = 4;
    public static final short O3 = 21;
    public static final short O4 = 0;
    private static final f[] O6;
    private static final int O7 = 5;
    public static final short P3 = 22;
    public static final short P4 = 1;
    private static final f[] P6;
    private static final int P7 = 6;
    public static final short Q2 = 1;
    public static final short Q3 = 23;
    public static final short Q4 = 2;
    private static final int Q5 = 8;
    private static final f Q6;
    private static final int Q7 = 7;
    public static final short R2 = 2;
    public static final short R3 = 24;
    public static final short R4 = 3;
    private static final int R5 = 12;
    private static final f[] R6;
    private static final int R7 = 8;
    public static final short S2 = 1;
    public static final short S3 = 255;
    private static final short S5 = 85;
    private static final f[] S6;
    private static final int S7 = 9;
    public static final short T2 = 2;
    public static final short T3 = 1;
    private static final f[] T6;
    private static final int T7 = 10;
    public static final short U2 = 2;
    public static final short U3 = 4;
    private static final int U5 = 6;
    private static final f[] U6;
    private static final int U7 = 11;
    public static final short V2 = 3;
    public static final short V3 = 6;
    static final int V6 = 0;
    private static final int V7 = 12;
    public static final int W2 = 1;
    public static final short W3 = 8;
    public static final short W4 = 0;
    private static final int W6 = 1;
    private static final int W7 = 13;
    public static final int X2 = 65535;
    public static final short X3 = 16;
    public static final short X4 = 1;
    private static final int X6 = 2;
    private static final int X7 = 14;
    public static final short Y2 = 0;
    public static final short Y3 = 24;
    private static final int Y6 = 3;
    private static final Pattern Y7;
    public static final short Z2 = 1;
    public static final short Z3 = 32;
    private static final int Z5 = 4;
    static final int Z6 = 4;
    private static final Pattern Z7;

    /* renamed from: a3, reason: collision with root package name */
    public static final short f7813a3 = 2;

    /* renamed from: a4, reason: collision with root package name */
    public static final short f7814a4 = 64;
    private static final int a6 = 4;
    static final int a7 = 5;

    /* renamed from: b3, reason: collision with root package name */
    public static final short f7819b3 = 3;

    /* renamed from: b4, reason: collision with root package name */
    public static final short f7820b4 = 1;
    private static final int b7 = 6;

    /* renamed from: c3, reason: collision with root package name */
    public static final short f7825c3 = 4;

    /* renamed from: c4, reason: collision with root package name */
    public static final short f7826c4 = 2;
    private static final int c7 = 7;

    /* renamed from: d3, reason: collision with root package name */
    public static final short f7831d3 = 5;

    /* renamed from: d4, reason: collision with root package name */
    public static final short f7832d4 = 3;
    private static final int d6 = 4;
    private static final int d7 = 8;

    /* renamed from: e3, reason: collision with root package name */
    public static final short f7837e3 = 6;

    /* renamed from: e4, reason: collision with root package name */
    public static final short f7838e4 = 4;
    private static final int e7 = 9;

    /* renamed from: f3, reason: collision with root package name */
    public static final short f7843f3 = 7;

    /* renamed from: f4, reason: collision with root package name */
    public static final short f7844f4 = 5;
    static final f[][] f7;

    /* renamed from: g3, reason: collision with root package name */
    public static final short f7849g3 = 8;

    /* renamed from: g4, reason: collision with root package name */
    public static final short f7850g4 = 7;
    private static final byte g6 = 47;
    private static final f[] g7;

    /* renamed from: h3, reason: collision with root package name */
    public static final short f7854h3 = 0;

    /* renamed from: h4, reason: collision with root package name */
    public static final short f7855h4 = 8;
    private static final f h7;

    /* renamed from: i3, reason: collision with root package name */
    public static final short f7859i3 = 1;

    /* renamed from: i4, reason: collision with root package name */
    public static final short f7860i4 = 0;
    private static final f i7;

    /* renamed from: j3, reason: collision with root package name */
    public static final short f7864j3 = 2;

    /* renamed from: j4, reason: collision with root package name */
    public static final short f7865j4 = 1;
    private static final HashMap<Integer, f>[] j7;

    /* renamed from: k3, reason: collision with root package name */
    public static final short f7869k3 = 3;

    /* renamed from: k4, reason: collision with root package name */
    public static final short f7870k4 = 2;
    public static final short k5 = 0;
    private static final HashMap<String, f>[] k7;

    /* renamed from: l3, reason: collision with root package name */
    public static final short f7874l3 = 4;

    /* renamed from: l4, reason: collision with root package name */
    public static final short f7875l4 = 3;
    public static final short l5 = 1;
    private static final HashSet<String> l7;

    /* renamed from: m3, reason: collision with root package name */
    public static final short f7879m3 = 5;

    /* renamed from: m4, reason: collision with root package name */
    public static final short f7880m4 = 1;
    public static final int m5 = 1;
    private static final HashMap<Integer, Integer> m7;

    /* renamed from: n3, reason: collision with root package name */
    public static final short f7884n3 = 6;

    /* renamed from: n4, reason: collision with root package name */
    public static final short f7885n4 = 0;
    public static final int n5 = 2;
    private static final int n6 = 10;
    static final Charset n7;

    /* renamed from: o3, reason: collision with root package name */
    public static final short f7889o3 = 7;

    /* renamed from: o4, reason: collision with root package name */
    public static final short f7890o4 = 1;
    public static final int o5 = 6;
    private static final int o6 = 4;
    static final byte[] o7;

    /* renamed from: p3, reason: collision with root package name */
    public static final short f7894p3 = 0;

    /* renamed from: p4, reason: collision with root package name */
    public static final short f7895p4 = 0;
    public static final int p5 = 7;
    private static final int p6 = 4;
    private static final byte[] p7;

    /* renamed from: q3, reason: collision with root package name */
    public static final short f7899q3 = 1;

    /* renamed from: q4, reason: collision with root package name */
    public static final short f7900q4 = 1;
    public static final int q5 = 8;
    private static SimpleDateFormat q6 = null;
    static final byte q7 = -1;

    /* renamed from: r3, reason: collision with root package name */
    public static final short f7904r3 = 2;

    /* renamed from: r4, reason: collision with root package name */
    public static final short f7905r4 = 2;
    public static final int r5 = 32773;
    static final short r6 = 18761;

    /* renamed from: s3, reason: collision with root package name */
    public static final short f7909s3 = 3;

    /* renamed from: s4, reason: collision with root package name */
    @Deprecated
    public static final int f7910s4 = 0;
    public static final int s5 = 34892;
    static final short s6 = 19789;
    private static final byte s7 = -64;

    /* renamed from: t3, reason: collision with root package name */
    public static final short f7914t3 = 4;

    /* renamed from: t4, reason: collision with root package name */
    @Deprecated
    public static final int f7915t4 = 1;
    private static final byte t7 = -63;

    /* renamed from: u3, reason: collision with root package name */
    public static final short f7919u3 = 5;

    /* renamed from: u4, reason: collision with root package name */
    public static final short f7920u4 = 0;
    private static final int u6 = 8;
    private static final byte u7 = -62;

    /* renamed from: v3, reason: collision with root package name */
    public static final short f7924v3 = 6;

    /* renamed from: v4, reason: collision with root package name */
    public static final short f7925v4 = 1;
    private static final int v6 = 1;
    private static final byte v7 = -61;

    /* renamed from: w3, reason: collision with root package name */
    public static final short f7929w3 = 255;

    /* renamed from: w4, reason: collision with root package name */
    public static final short f7930w4 = 0;
    public static final int w5 = 0;
    private static final int w6 = 2;
    private static final byte w7 = -59;

    /* renamed from: x3, reason: collision with root package name */
    public static final short f7935x3 = 0;

    /* renamed from: x4, reason: collision with root package name */
    public static final short f7936x4 = 1;
    public static final int x5 = 1;
    private static final int x6 = 3;
    private static final byte x7 = -58;

    /* renamed from: y3, reason: collision with root package name */
    public static final short f7941y3 = 1;

    /* renamed from: y4, reason: collision with root package name */
    public static final short f7942y4 = 2;
    public static final int y5 = 2;
    private static final int y6 = 4;
    private static final byte y7 = -57;

    /* renamed from: z3, reason: collision with root package name */
    public static final short f7947z3 = 2;

    /* renamed from: z4, reason: collision with root package name */
    public static final short f7948z4 = 3;
    public static final int z5 = 6;
    private static final int z6 = 5;
    private static final byte z7 = -55;

    /* renamed from: a, reason: collision with root package name */
    private String f7949a;

    /* renamed from: b, reason: collision with root package name */
    private FileDescriptor f7950b;

    /* renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f7951c;

    /* renamed from: d, reason: collision with root package name */
    private int f7952d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7953e;

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, d>[] f7954f;

    /* renamed from: g, reason: collision with root package name */
    private Set<Integer> f7955g;

    /* renamed from: h, reason: collision with root package name */
    private ByteOrder f7956h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7957i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f7958j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f7959k;

    /* renamed from: l, reason: collision with root package name */
    private int f7960l;

    /* renamed from: m, reason: collision with root package name */
    private int f7961m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f7962n;

    /* renamed from: o, reason: collision with root package name */
    private int f7963o;

    /* renamed from: p, reason: collision with root package name */
    private int f7964p;

    /* renamed from: q, reason: collision with root package name */
    private int f7965q;

    /* renamed from: r, reason: collision with root package name */
    private int f7966r;

    /* renamed from: s, reason: collision with root package name */
    private int f7967s;

    /* renamed from: t, reason: collision with root package name */
    private int f7968t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f7969u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f7970v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f7971w;
    public static final String Q1 = "GPSImgDirection";

    /* renamed from: r2, reason: collision with root package name */
    public static final String f7903r2 = "SensorRightBorder";

    /* renamed from: j0, reason: collision with root package name */
    public static final String f7861j0 = "ComponentsConfiguration";
    public static final String I0 = "ISOSpeedLatitudezzz";

    /* renamed from: j1, reason: collision with root package name */
    public static final String f7862j1 = "FocalLengthIn35mmFilm";
    public static final String I1 = "GPSStatus";

    /* renamed from: j2, reason: collision with root package name */
    public static final String f7863j2 = "DNGVersion";
    public static final String j5 = "N";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f7816b0 = "Artist";

    @Deprecated
    public static final String A0 = "ISOSpeedRatings";

    /* renamed from: b1, reason: collision with root package name */
    public static final String f7817b1 = "SensingMethod";
    public static final String A1 = "GPSLatitudeRef";

    /* renamed from: b2, reason: collision with root package name */
    public static final String f7818b2 = "GPSAreaInformation";
    private static final String A2 = "InteroperabilityIFDPointer";

    /* renamed from: b5, reason: collision with root package name */
    public static final String f7821b5 = "3";
    public static final String Z0 = "SubjectLocation";
    public static final String Z1 = "GPSDestDistance";
    public static final String Z4 = "V";

    /* renamed from: s0, reason: collision with root package name */
    public static final String f7906s0 = "OffsetTimeDigitized";
    public static final String R0 = "Flash";

    /* renamed from: s1, reason: collision with root package name */
    @Deprecated
    public static final String f7907s1 = "CameraOwnerName";
    public static final String R1 = "GPSMapDatum";

    /* renamed from: s2, reason: collision with root package name */
    public static final String f7908s2 = "SensorTopBorder";

    /* renamed from: k0, reason: collision with root package name */
    public static final String f7866k0 = "CompressedBitsPerPixel";
    public static final String J0 = "ShutterSpeedValue";

    /* renamed from: k1, reason: collision with root package name */
    public static final String f7867k1 = "SceneCaptureType";
    public static final String J1 = "GPSMeasureMode";

    /* renamed from: k2, reason: collision with root package name */
    public static final String f7868k2 = "DefaultCropSize";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f7822c0 = "Copyright";
    public static final String B0 = "PhotographicSensitivity";

    /* renamed from: c1, reason: collision with root package name */
    public static final String f7823c1 = "FileSource";
    public static final String B1 = "GPSLatitude";

    /* renamed from: c2, reason: collision with root package name */
    public static final String f7824c2 = "GPSDateStamp";
    private static final String B2 = "SubIFDPointer";

    /* renamed from: c5, reason: collision with root package name */
    public static final String f7827c5 = "K";

    /* renamed from: t0, reason: collision with root package name */
    public static final String f7911t0 = "SubSecTime";
    public static final String S0 = "SubjectArea";

    /* renamed from: t1, reason: collision with root package name */
    public static final String f7912t1 = "CameraOwnerName";
    public static final String S1 = "GPSDestLatitudeRef";

    /* renamed from: t2, reason: collision with root package name */
    public static final String f7913t2 = "ISO";
    public static final String A = "ImageLength";
    public static final String S4 = "N";
    public static final String B = "BitsPerSample";
    public static final String C = "Compression";
    public static final String D = "PhotometricInterpretation";

    /* renamed from: l0, reason: collision with root package name */
    public static final String f7871l0 = "MakerNote";
    public static final String E = "Orientation";
    public static final String K0 = "ApertureValue";

    /* renamed from: l1, reason: collision with root package name */
    public static final String f7872l1 = "GainControl";
    public static final String F = "SamplesPerPixel";
    public static final String K1 = "GPSDOP";

    /* renamed from: l2, reason: collision with root package name */
    public static final String f7873l2 = "ThumbnailImage";
    public static final String G = "PlanarConfiguration";
    public static final String H = "YCbCrSubSampling";
    public static final String I = "YCbCrPositioning";
    public static final String J = "XResolution";
    public static final String K = "YResolution";
    public static final String L = "ResolutionUnit";

    /* renamed from: d0, reason: collision with root package name */
    public static final String f7828d0 = "ExifVersion";
    public static final String C0 = "OECF";
    public static final String M = "StripOffsets";

    /* renamed from: d1, reason: collision with root package name */
    public static final String f7829d1 = "SceneType";
    public static final String C1 = "GPSLongitudeRef";
    public static final String N = "RowsPerStrip";

    /* renamed from: d2, reason: collision with root package name */
    public static final String f7830d2 = "GPSDifferential";
    private static final String C2 = "CameraSettingsIFDPointer";
    public static final String O = "StripByteCounts";
    public static final String P = "JPEGInterchangeFormat";
    public static final String Q = "JPEGInterchangeFormatLength";

    /* renamed from: d5, reason: collision with root package name */
    public static final String f7833d5 = "M";
    public static final String R = "TransferFunction";
    public static final String S = "WhitePoint";
    public static final String T = "PrimaryChromaticities";
    public static final String U = "YCbCrCoefficients";
    public static final String V = "ReferenceBlackWhite";
    public static final String W = "DateTime";
    public static final String X = "ImageDescription";
    public static final String Y = "Make";
    public static final String Z = "Model";

    /* renamed from: u0, reason: collision with root package name */
    public static final String f7916u0 = "SubSecTimeOriginal";
    public static final String T0 = "FocalLength";

    /* renamed from: u1, reason: collision with root package name */
    public static final String f7917u1 = "BodySerialNumber";
    public static final String T1 = "GPSDestLatitude";

    /* renamed from: u2, reason: collision with root package name */
    public static final String f7918u2 = "JpgFromRaw";
    public static final String T4 = "S";
    private static final String T5 = "PENTAX";

    /* renamed from: m0, reason: collision with root package name */
    public static final String f7876m0 = "UserComment";
    public static final String L0 = "BrightnessValue";

    /* renamed from: m1, reason: collision with root package name */
    public static final String f7877m1 = "Contrast";
    public static final String L1 = "GPSSpeedRef";

    /* renamed from: m2, reason: collision with root package name */
    public static final String f7878m2 = "PreviewImageStart";

    /* renamed from: e0, reason: collision with root package name */
    public static final String f7834e0 = "FlashpixVersion";
    public static final String D0 = "SensitivityType";

    /* renamed from: e1, reason: collision with root package name */
    public static final String f7835e1 = "CFAPattern";
    public static final String D1 = "GPSLongitude";

    /* renamed from: e2, reason: collision with root package name */
    public static final String f7836e2 = "GPSHPositioningError";
    private static final String D2 = "ImageProcessingIFDPointer";

    /* renamed from: e5, reason: collision with root package name */
    public static final String f7839e5 = "N";

    /* renamed from: x, reason: collision with root package name */
    private static final String f7931x = "ExifInterface";

    /* renamed from: v0, reason: collision with root package name */
    public static final String f7921v0 = "SubSecTimeDigitized";

    /* renamed from: z, reason: collision with root package name */
    public static final String f7943z = "ImageWidth";
    public static final String U0 = "FlashEnergy";

    /* renamed from: v1, reason: collision with root package name */
    public static final String f7922v1 = "LensSpecification";
    public static final String U1 = "GPSDestLongitudeRef";

    /* renamed from: v2, reason: collision with root package name */
    public static final String f7923v2 = "Xmp";
    public static final String U4 = "E";

    /* renamed from: n0, reason: collision with root package name */
    public static final String f7881n0 = "RelatedSoundFile";
    public static final String M0 = "ExposureBiasValue";

    /* renamed from: n1, reason: collision with root package name */
    public static final String f7882n1 = "Saturation";
    public static final String M1 = "GPSSpeed";

    /* renamed from: n2, reason: collision with root package name */
    public static final String f7883n2 = "PreviewImageLength";

    /* renamed from: f0, reason: collision with root package name */
    public static final String f7840f0 = "ColorSpace";
    public static final String E0 = "StandardOutputSensitivity";

    /* renamed from: f1, reason: collision with root package name */
    public static final String f7841f1 = "CustomRendered";
    public static final String E1 = "GPSAltitudeRef";

    /* renamed from: f2, reason: collision with root package name */
    public static final String f7842f2 = "InteroperabilityIndex";

    /* renamed from: f5, reason: collision with root package name */
    public static final String f7845f5 = "T";

    /* renamed from: w0, reason: collision with root package name */
    public static final String f7926w0 = "ExposureTime";
    public static final String V0 = "SpatialFrequencyResponse";

    /* renamed from: w1, reason: collision with root package name */
    public static final String f7927w1 = "LensMake";
    public static final String V1 = "GPSDestLongitude";

    /* renamed from: w2, reason: collision with root package name */
    public static final String f7928w2 = "NewSubfileType";
    public static final String V4 = "W";

    /* renamed from: o0, reason: collision with root package name */
    public static final String f7886o0 = "DateTimeOriginal";
    public static final String N0 = "MaxApertureValue";

    /* renamed from: o1, reason: collision with root package name */
    public static final String f7887o1 = "Sharpness";
    public static final String N1 = "GPSTrackRef";

    /* renamed from: o2, reason: collision with root package name */
    public static final String f7888o2 = "AspectFrame";

    /* renamed from: g0, reason: collision with root package name */
    public static final String f7846g0 = "Gamma";
    public static final String F0 = "RecommendedExposureIndex";

    /* renamed from: g1, reason: collision with root package name */
    public static final String f7847g1 = "ExposureMode";
    public static final String F1 = "GPSAltitude";

    /* renamed from: g2, reason: collision with root package name */
    public static final String f7848g2 = "ThumbnailImageLength";
    public static final String g5 = "M";

    /* renamed from: x0, reason: collision with root package name */
    public static final String f7932x0 = "FNumber";
    public static final String W0 = "FocalPlaneXResolution";

    /* renamed from: x1, reason: collision with root package name */
    public static final String f7933x1 = "LensModel";
    public static final String W1 = "GPSDestBearingRef";

    /* renamed from: x2, reason: collision with root package name */
    public static final String f7934x2 = "SubfileType";

    /* renamed from: p0, reason: collision with root package name */
    public static final String f7891p0 = "DateTimeDigitized";
    public static final String O0 = "SubjectDistance";

    /* renamed from: p1, reason: collision with root package name */
    public static final String f7892p1 = "DeviceSettingDescription";
    public static final String O1 = "GPSTrack";

    /* renamed from: p2, reason: collision with root package name */
    public static final String f7893p2 = "SensorBottomBorder";

    /* renamed from: h0, reason: collision with root package name */
    public static final String f7851h0 = "PixelXDimension";
    public static final String G0 = "ISOSpeed";

    /* renamed from: h1, reason: collision with root package name */
    public static final String f7852h1 = "WhiteBalance";
    public static final String G1 = "GPSTimeStamp";

    /* renamed from: h2, reason: collision with root package name */
    public static final String f7853h2 = "ThumbnailImageWidth";
    public static final String h5 = "K";
    private static final String G5 = "FUJIFILMCCD-RAW";

    /* renamed from: y0, reason: collision with root package name */
    public static final String f7938y0 = "ExposureProgram";
    public static final String X0 = "FocalPlaneYResolution";

    /* renamed from: y1, reason: collision with root package name */
    public static final String f7939y1 = "LensSerialNumber";
    public static final String X1 = "GPSDestBearing";

    /* renamed from: y2, reason: collision with root package name */
    private static final String f7940y2 = "ExifIFDPointer";

    /* renamed from: q0, reason: collision with root package name */
    public static final String f7896q0 = "OffsetTime";
    public static final String P0 = "MeteringMode";

    /* renamed from: q1, reason: collision with root package name */
    public static final String f7897q1 = "SubjectDistanceRange";
    public static final String P1 = "GPSImgDirectionRef";

    /* renamed from: q2, reason: collision with root package name */
    public static final String f7898q2 = "SensorLeftBorder";

    /* renamed from: i0, reason: collision with root package name */
    public static final String f7856i0 = "PixelYDimension";
    public static final String H0 = "ISOSpeedLatitudeyyy";

    /* renamed from: i1, reason: collision with root package name */
    public static final String f7857i1 = "DigitalZoomRatio";
    public static final String H1 = "GPSSatellites";

    /* renamed from: i2, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    public static final String f7858i2 = "ThumbnailOrientation";
    public static final String i5 = "M";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f7810a0 = "Software";

    /* renamed from: a1, reason: collision with root package name */
    public static final String f7811a1 = "ExposureIndex";

    /* renamed from: a2, reason: collision with root package name */
    public static final String f7812a2 = "GPSProcessingMethod";

    /* renamed from: a5, reason: collision with root package name */
    public static final String f7815a5 = "2";

    /* renamed from: z0, reason: collision with root package name */
    public static final String f7944z0 = "SpectralSensitivity";
    public static final String Y0 = "FocalPlaneResolutionUnit";

    /* renamed from: z1, reason: collision with root package name */
    public static final String f7945z1 = "GPSVersionID";
    public static final String Y1 = "GPSDestDistanceRef";

    /* renamed from: z2, reason: collision with root package name */
    private static final String f7946z2 = "GPSInfoIFDPointer";
    public static final String Y4 = "A";

    /* renamed from: r0, reason: collision with root package name */
    public static final String f7901r0 = "OffsetTimeOriginal";
    public static final String Q0 = "LightSource";

    /* renamed from: r1, reason: collision with root package name */
    public static final String f7902r1 = "ImageUniqueID";

    /* renamed from: y, reason: collision with root package name */
    private static final boolean f7937y = Log.isLoggable("ExifInterface", 3);
    private static final List<Integer> O2 = Arrays.asList(1, 6, 3, 8);
    private static final List<Integer> P2 = Arrays.asList(2, 7, 4, 5);
    public static final int[] t5 = {8, 8, 8};
    public static final int[] u5 = {4};
    public static final int[] v5 = {8};
    private static final byte r7 = -40;
    static final byte[] F5 = {-1, r7, -1};
    private static final byte[] J5 = {102, 116, 121, 112};
    private static final byte[] K5 = {109, 105, 102, 49};
    private static final byte[] L5 = {104, 101, 105, 99};
    private static final byte[] O5 = {79, 76, 89, 77, 80, 0};
    private static final byte[] P5 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] V5 = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] W5 = {101, 88, 73, 102};
    private static final byte[] X5 = {73, 72, 68, 82};
    private static final byte[] Y5 = {73, 69, 78, 68};
    private static final byte[] b6 = {82, 73, 70, 70};
    private static final byte[] c6 = {87, 69, 66, 80};
    private static final byte[] e6 = {69, 88, 73, 70};
    static final byte t6 = 42;
    private static final byte[] f6 = {-99, 1, t6};
    private static final byte[] h6 = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] i6 = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] j6 = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] k6 = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] l6 = "ANMF".getBytes(Charset.defaultCharset());
    private static final byte[] m6 = "XMP ".getBytes(Charset.defaultCharset());
    static final String[] I6 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] J6 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] K6 = {65, 83, 67, 73, 73, 0, 0, 0};

    /* compiled from: ExifInterface.java */
    /* renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    class C0089a extends MediaDataSource {

        /* renamed from: o, reason: collision with root package name */
        long f7972o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ b f7973p;

        C0089a(b bVar) {
            this.f7973p = bVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j5, byte[] bArr, int i5, int i6) throws IOException {
            if (i6 == 0) {
                return 0;
            }
            if (j5 < 0) {
                return -1;
            }
            try {
                long j6 = this.f7972o;
                if (j6 != j5) {
                    if (j6 >= 0 && j5 >= j6 + this.f7973p.available()) {
                        return -1;
                    }
                    this.f7973p.d(j5);
                    this.f7972o = j5;
                }
                if (i6 > this.f7973p.available()) {
                    i6 = this.f7973p.available();
                }
                int read = this.f7973p.read(bArr, i5, i6);
                if (read >= 0) {
                    this.f7972o += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f7972o = -1L;
            return -1;
        }
    }

    /* compiled from: ExifInterface.java */
    private static class b extends InputStream implements DataInput {

        /* renamed from: s, reason: collision with root package name */
        private static final ByteOrder f7975s = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: t, reason: collision with root package name */
        private static final ByteOrder f7976t = ByteOrder.BIG_ENDIAN;

        /* renamed from: o, reason: collision with root package name */
        private DataInputStream f7977o;

        /* renamed from: p, reason: collision with root package name */
        private ByteOrder f7978p;

        /* renamed from: q, reason: collision with root package name */
        final int f7979q;

        /* renamed from: r, reason: collision with root package name */
        int f7980r;

        public b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.f7979q;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f7977o.available();
        }

        public int b() {
            return this.f7980r;
        }

        public long c() throws IOException {
            return readInt() & 4294967295L;
        }

        public void d(long j5) throws IOException {
            int i5 = this.f7980r;
            if (i5 > j5) {
                this.f7980r = 0;
                this.f7977o.reset();
                this.f7977o.mark(this.f7979q);
            } else {
                j5 -= i5;
            }
            int i6 = (int) j5;
            if (skipBytes(i6) != i6) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public void e(ByteOrder byteOrder) {
            this.f7978p = byteOrder;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f7980r++;
            return this.f7977o.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f7980r++;
            return this.f7977o.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            int i5 = this.f7980r + 1;
            this.f7980r = i5;
            if (i5 > this.f7979q) {
                throw new EOFException();
            }
            int read = this.f7977o.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f7980r += 2;
            return this.f7977o.readChar();
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
        public void readFully(byte[] bArr, int i5, int i6) throws IOException {
            int i7 = this.f7980r + i6;
            this.f7980r = i7;
            if (i7 > this.f7979q) {
                throw new EOFException();
            }
            if (this.f7977o.read(bArr, i5, i6) != i6) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            int i5 = this.f7980r + 4;
            this.f7980r = i5;
            if (i5 > this.f7979q) {
                throw new EOFException();
            }
            int read = this.f7977o.read();
            int read2 = this.f7977o.read();
            int read3 = this.f7977o.read();
            int read4 = this.f7977o.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f7978p;
            if (byteOrder == f7975s) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f7976t) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f7978p);
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            int i5 = this.f7980r + 8;
            this.f7980r = i5;
            if (i5 > this.f7979q) {
                throw new EOFException();
            }
            int read = this.f7977o.read();
            int read2 = this.f7977o.read();
            int read3 = this.f7977o.read();
            int read4 = this.f7977o.read();
            int read5 = this.f7977o.read();
            int read6 = this.f7977o.read();
            int read7 = this.f7977o.read();
            int read8 = this.f7977o.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f7978p;
            if (byteOrder == f7975s) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f7976t) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f7978p);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i5 = this.f7980r + 2;
            this.f7980r = i5;
            if (i5 > this.f7979q) {
                throw new EOFException();
            }
            int read = this.f7977o.read();
            int read2 = this.f7977o.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f7978p;
            if (byteOrder == f7975s) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f7976t) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f7978p);
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f7980r += 2;
            return this.f7977o.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f7980r++;
            return this.f7977o.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            int i5 = this.f7980r + 2;
            this.f7980r = i5;
            if (i5 > this.f7979q) {
                throw new EOFException();
            }
            int read = this.f7977o.read();
            int read2 = this.f7977o.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f7978p;
            if (byteOrder == f7975s) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f7976t) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f7978p);
        }

        @Override // java.io.DataInput
        public int skipBytes(int i5) throws IOException {
            int min = Math.min(i5, this.f7979q - this.f7980r);
            int i6 = 0;
            while (i6 < min) {
                i6 += this.f7977o.skipBytes(min - i6);
            }
            this.f7980r += i6;
            return i6;
        }

        b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f7978p = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f7977o = dataInputStream;
            int available = dataInputStream.available();
            this.f7979q = available;
            this.f7980r = 0;
            this.f7977o.mark(available);
            this.f7978p = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i5, int i6) throws IOException {
            int read = this.f7977o.read(bArr, i5, i6);
            this.f7980r += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            int length = this.f7980r + bArr.length;
            this.f7980r = length;
            if (length <= this.f7979q) {
                if (this.f7977o.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        public b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr));
        }
    }

    /* compiled from: ExifInterface.java */
    private static class c extends FilterOutputStream {

        /* renamed from: o, reason: collision with root package name */
        final OutputStream f7981o;

        /* renamed from: p, reason: collision with root package name */
        private ByteOrder f7982p;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f7981o = outputStream;
            this.f7982p = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.f7982p = byteOrder;
        }

        public void b(int i5) throws IOException {
            this.f7981o.write(i5);
        }

        public void c(int i5) throws IOException {
            ByteOrder byteOrder = this.f7982p;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f7981o.write((i5 >>> 0) & 255);
                this.f7981o.write((i5 >>> 8) & 255);
                this.f7981o.write((i5 >>> 16) & 255);
                this.f7981o.write((i5 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f7981o.write((i5 >>> 24) & 255);
                this.f7981o.write((i5 >>> 16) & 255);
                this.f7981o.write((i5 >>> 8) & 255);
                this.f7981o.write((i5 >>> 0) & 255);
            }
        }

        public void d(short s5) throws IOException {
            ByteOrder byteOrder = this.f7982p;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f7981o.write((s5 >>> 0) & 255);
                this.f7981o.write((s5 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f7981o.write((s5 >>> 8) & 255);
                this.f7981o.write((s5 >>> 0) & 255);
            }
        }

        public void e(long j5) throws IOException {
            c((int) j5);
        }

        public void g(int i5) throws IOException {
            d((short) i5);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f7981o.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i5, int i6) throws IOException {
            this.f7981o.write(bArr, i5, i6);
        }
    }

    /* compiled from: ExifInterface.java */
    private static class d {

        /* renamed from: e, reason: collision with root package name */
        public static final long f7983e = -1;

        /* renamed from: a, reason: collision with root package name */
        public final int f7984a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7985b;

        /* renamed from: c, reason: collision with root package name */
        public final long f7986c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f7987d;

        d(int i5, int i6, byte[] bArr) {
            this(i5, i6, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.n7);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double d6, ByteOrder byteOrder) {
            return c(new double[]{d6}, byteOrder);
        }

        public static d c(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.J6[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d6 : dArr) {
                wrap.putDouble(d6);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d d(int i5, ByteOrder byteOrder) {
            return e(new int[]{i5}, byteOrder);
        }

        public static d e(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.J6[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i5 : iArr) {
                wrap.putInt(i5);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d f(h hVar, ByteOrder byteOrder) {
            return g(new h[]{hVar}, byteOrder);
        }

        public static d g(h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.J6[10] * hVarArr.length]);
            wrap.order(byteOrder);
            for (h hVar : hVarArr) {
                wrap.putInt((int) hVar.f7992a);
                wrap.putInt((int) hVar.f7993b);
            }
            return new d(10, hVarArr.length, wrap.array());
        }

        public static d h(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.n7);
            return new d(2, bytes.length, bytes);
        }

        public static d i(long j5, ByteOrder byteOrder) {
            return j(new long[]{j5}, byteOrder);
        }

        public static d j(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.J6[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j5 : jArr) {
                wrap.putInt((int) j5);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d k(h hVar, ByteOrder byteOrder) {
            return l(new h[]{hVar}, byteOrder);
        }

        public static d l(h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.J6[5] * hVarArr.length]);
            wrap.order(byteOrder);
            for (h hVar : hVarArr) {
                wrap.putInt((int) hVar.f7992a);
                wrap.putInt((int) hVar.f7993b);
            }
            return new d(5, hVarArr.length, wrap.array());
        }

        public static d m(int i5, ByteOrder byteOrder) {
            return n(new int[]{i5}, byteOrder);
        }

        public static d n(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.J6[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i5 : iArr) {
                wrap.putShort((short) i5);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double o(ByteOrder byteOrder) {
            Object r5 = r(byteOrder);
            if (r5 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (r5 instanceof String) {
                return Double.parseDouble((String) r5);
            }
            if (r5 instanceof long[]) {
                if (((long[]) r5).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (r5 instanceof int[]) {
                if (((int[]) r5).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (r5 instanceof double[]) {
                double[] dArr = (double[]) r5;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(r5 instanceof h[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            h[] hVarArr = (h[]) r5;
            if (hVarArr.length == 1) {
                return hVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int p(ByteOrder byteOrder) {
            Object r5 = r(byteOrder);
            if (r5 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (r5 instanceof String) {
                return Integer.parseInt((String) r5);
            }
            if (r5 instanceof long[]) {
                long[] jArr = (long[]) r5;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(r5 instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) r5;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String q(ByteOrder byteOrder) {
            Object r5 = r(byteOrder);
            if (r5 == null) {
                return null;
            }
            if (r5 instanceof String) {
                return (String) r5;
            }
            StringBuilder sb = new StringBuilder();
            int i5 = 0;
            if (r5 instanceof long[]) {
                long[] jArr = (long[]) r5;
                while (i5 < jArr.length) {
                    sb.append(jArr[i5]);
                    i5++;
                    if (i5 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (r5 instanceof int[]) {
                int[] iArr = (int[]) r5;
                while (i5 < iArr.length) {
                    sb.append(iArr[i5]);
                    i5++;
                    if (i5 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (r5 instanceof double[]) {
                double[] dArr = (double[]) r5;
                while (i5 < dArr.length) {
                    sb.append(dArr[i5]);
                    i5++;
                    if (i5 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(r5 instanceof h[])) {
                return null;
            }
            h[] hVarArr = (h[]) r5;
            while (i5 < hVarArr.length) {
                sb.append(hVarArr[i5].f7992a);
                sb.append(n.f32060b);
                sb.append(hVarArr[i5].f7993b);
                i5++;
                if (i5 != hVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        Object r(ByteOrder byteOrder) {
            b bVar;
            byte b6;
            byte b7;
            byte[] bArr;
            b bVar2 = null;
            try {
                bVar = new b(this.f7987d);
                try {
                    bVar.e(byteOrder);
                    int i5 = 0;
                    boolean z5 = true;
                    switch (this.f7984a) {
                        case 1:
                        case 6:
                            byte[] bArr2 = this.f7987d;
                            if (bArr2.length != 1 || (b6 = bArr2[0]) < 0 || b6 > 1) {
                                String str = new String(bArr2, a.n7);
                                try {
                                    bVar.close();
                                } catch (IOException unused) {
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b6 + 48)});
                            try {
                                bVar.close();
                            } catch (IOException unused2) {
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (this.f7985b >= a.K6.length) {
                                int i6 = 0;
                                while (true) {
                                    bArr = a.K6;
                                    if (i6 < bArr.length) {
                                        if (this.f7987d[i6] != bArr[i6]) {
                                            z5 = false;
                                        } else {
                                            i6++;
                                        }
                                    }
                                }
                                if (z5) {
                                    i5 = bArr.length;
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i5 < this.f7985b && (b7 = this.f7987d[i5]) != 0) {
                                if (b7 >= 32) {
                                    sb.append((char) b7);
                                } else {
                                    sb.append('?');
                                }
                                i5++;
                            }
                            String sb2 = sb.toString();
                            try {
                                bVar.close();
                            } catch (IOException unused3) {
                            }
                            return sb2;
                        case 3:
                            int[] iArr = new int[this.f7985b];
                            while (i5 < this.f7985b) {
                                iArr[i5] = bVar.readUnsignedShort();
                                i5++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused4) {
                            }
                            return iArr;
                        case 4:
                            long[] jArr = new long[this.f7985b];
                            while (i5 < this.f7985b) {
                                jArr[i5] = bVar.c();
                                i5++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused5) {
                            }
                            return jArr;
                        case 5:
                            h[] hVarArr = new h[this.f7985b];
                            while (i5 < this.f7985b) {
                                hVarArr[i5] = new h(bVar.c(), bVar.c());
                                i5++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused6) {
                            }
                            return hVarArr;
                        case 8:
                            int[] iArr2 = new int[this.f7985b];
                            while (i5 < this.f7985b) {
                                iArr2[i5] = bVar.readShort();
                                i5++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused7) {
                            }
                            return iArr2;
                        case 9:
                            int[] iArr3 = new int[this.f7985b];
                            while (i5 < this.f7985b) {
                                iArr3[i5] = bVar.readInt();
                                i5++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused8) {
                            }
                            return iArr3;
                        case 10:
                            h[] hVarArr2 = new h[this.f7985b];
                            while (i5 < this.f7985b) {
                                hVarArr2[i5] = new h(bVar.readInt(), bVar.readInt());
                                i5++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused9) {
                            }
                            return hVarArr2;
                        case 11:
                            double[] dArr = new double[this.f7985b];
                            while (i5 < this.f7985b) {
                                dArr[i5] = bVar.readFloat();
                                i5++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused10) {
                            }
                            return dArr;
                        case 12:
                            double[] dArr2 = new double[this.f7985b];
                            while (i5 < this.f7985b) {
                                dArr2[i5] = bVar.readDouble();
                                i5++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused11) {
                            }
                            return dArr2;
                        default:
                            try {
                                bVar.close();
                            } catch (IOException unused12) {
                            }
                            return null;
                    }
                } catch (IOException unused13) {
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException unused14) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        try {
                            bVar2.close();
                        } catch (IOException unused15) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused16) {
                bVar = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public int s() {
            return a.J6[this.f7984a] * this.f7985b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(a.I6[this.f7984a]);
            sb.append(", data length:");
            return androidx.constraintlayout.solver.e.a(sb, this.f7987d.length, ")");
        }

        d(int i5, int i6, long j5, byte[] bArr) {
            this.f7984a = i5;
            this.f7985b = i6;
            this.f7986c = j5;
            this.f7987d = bArr;
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
        public final long f7992a;

        /* renamed from: b, reason: collision with root package name */
        public final long f7993b;

        h(double d6) {
            this((long) (d6 * 10000.0d), 10000L);
        }

        public double a() {
            return this.f7992a / this.f7993b;
        }

        public String toString() {
            return this.f7992a + "/" + this.f7993b;
        }

        h(long j5, long j6) {
            if (j6 == 0) {
                this.f7992a = 0L;
                this.f7993b = 1L;
            } else {
                this.f7992a = j5;
                this.f7993b = j6;
            }
        }
    }

    static {
        f[] fVarArr = {new f("NewSubfileType", 254, 4), new f("SubfileType", 255, 4), new f("ImageWidth", 256, 3, 4), new f("ImageLength", 257, 3, 4), new f("BitsPerSample", 258, 3), new f("Compression", 259, 3), new f("PhotometricInterpretation", 262, 3), new f("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new f("Make", 271, 2), new f("Model", 272, 2), new f("StripOffsets", 273, 3, 4), new f("Orientation", 274, 3), new f("SamplesPerPixel", 277, 3), new f("RowsPerStrip", 278, 3, 4), new f("StripByteCounts", 279, 3, 4), new f("XResolution", 282, 5), new f("YResolution", 283, 5), new f("PlanarConfiguration", 284, 3), new f("ResolutionUnit", 296, 3), new f("TransferFunction", 301, 3), new f("Software", 305, 2), new f("DateTime", 306, 2), new f("Artist", 315, 2), new f("WhitePoint", 318, 5), new f("PrimaryChromaticities", 319, 5), new f("SubIFDPointer", 330, 4), new f("JPEGInterchangeFormat", e0.f5479j, 4), new f("JPEGInterchangeFormatLength", 514, 4), new f("YCbCrCoefficients", 529, 5), new f("YCbCrSubSampling", 530, 3), new f("YCbCrPositioning", 531, 3), new f("ReferenceBlackWhite", 532, 5), new f("Copyright", 33432, 2), new f("ExifIFDPointer", 34665, 4), new f("GPSInfoIFDPointer", 34853, 4), new f("SensorTopBorder", 4, 4), new f("SensorLeftBorder", 5, 4), new f("SensorBottomBorder", 6, 4), new f("SensorRightBorder", 7, 4), new f("ISO", 23, 3), new f("JpgFromRaw", 46, 7), new f("Xmp", 700, 1)};
        L6 = fVarArr;
        f[] fVarArr2 = {new f("ExposureTime", 33434, 5), new f("FNumber", 33437, 5), new f("ExposureProgram", 34850, 3), new f("SpectralSensitivity", 34852, 2), new f("PhotographicSensitivity", 34855, 3), new f("OECF", 34856, 7), new f("SensitivityType", 34864, 3), new f("StandardOutputSensitivity", 34865, 4), new f("RecommendedExposureIndex", 34866, 4), new f("ISOSpeed", 34867, 4), new f("ISOSpeedLatitudeyyy", 34868, 4), new f("ISOSpeedLatitudezzz", 34869, 4), new f("ExifVersion", 36864, 2), new f("DateTimeOriginal", 36867, 2), new f("DateTimeDigitized", 36868, 2), new f("OffsetTime", 36880, 2), new f("OffsetTimeOriginal", 36881, 2), new f("OffsetTimeDigitized", 36882, 2), new f("ComponentsConfiguration", 37121, 7), new f("CompressedBitsPerPixel", 37122, 5), new f("ShutterSpeedValue", 37377, 10), new f("ApertureValue", 37378, 5), new f("BrightnessValue", 37379, 10), new f("ExposureBiasValue", 37380, 10), new f("MaxApertureValue", 37381, 5), new f("SubjectDistance", 37382, 5), new f("MeteringMode", 37383, 3), new f("LightSource", 37384, 3), new f("Flash", 37385, 3), new f("FocalLength", 37386, 5), new f("SubjectArea", 37396, 3), new f("MakerNote", 37500, 7), new f("UserComment", 37510, 7), new f("SubSecTime", 37520, 2), new f("SubSecTimeOriginal", 37521, 2), new f("SubSecTimeDigitized", 37522, 2), new f("FlashpixVersion", 40960, 7), new f("ColorSpace", 40961, 3), new f("PixelXDimension", 40962, 3, 4), new f("PixelYDimension", 40963, 3, 4), new f("RelatedSoundFile", 40964, 2), new f("InteroperabilityIFDPointer", 40965, 4), new f("FlashEnergy", 41483, 5), new f("SpatialFrequencyResponse", 41484, 7), new f("FocalPlaneXResolution", 41486, 5), new f("FocalPlaneYResolution", 41487, 5), new f("FocalPlaneResolutionUnit", 41488, 3), new f("SubjectLocation", 41492, 3), new f("ExposureIndex", 41493, 5), new f("SensingMethod", 41495, 3), new f("FileSource", 41728, 7), new f("SceneType", 41729, 7), new f("CFAPattern", 41730, 7), new f("CustomRendered", 41985, 3), new f("ExposureMode", 41986, 3), new f("WhiteBalance", 41987, 3), new f("DigitalZoomRatio", 41988, 5), new f("FocalLengthIn35mmFilm", 41989, 3), new f("SceneCaptureType", 41990, 3), new f("GainControl", 41991, 3), new f("Contrast", 41992, 3), new f("Saturation", 41993, 3), new f("Sharpness", 41994, 3), new f("DeviceSettingDescription", 41995, 7), new f("SubjectDistanceRange", 41996, 3), new f("ImageUniqueID", 42016, 2), new f("CameraOwnerName", 42032, 2), new f("BodySerialNumber", 42033, 2), new f("LensSpecification", 42034, 5), new f("LensMake", 42035, 2), new f("LensModel", 42036, 2), new f("Gamma", 42240, 5), new f("DNGVersion", 50706, 1), new f("DefaultCropSize", 50720, 3, 4)};
        M6 = fVarArr2;
        f[] fVarArr3 = {new f("GPSVersionID", 0, 1), new f("GPSLatitudeRef", 1, 2), new f("GPSLatitude", 2, 5), new f("GPSLongitudeRef", 3, 2), new f("GPSLongitude", 4, 5), new f("GPSAltitudeRef", 5, 1), new f("GPSAltitude", 6, 5), new f("GPSTimeStamp", 7, 5), new f("GPSSatellites", 8, 2), new f("GPSStatus", 9, 2), new f("GPSMeasureMode", 10, 2), new f("GPSDOP", 11, 5), new f("GPSSpeedRef", 12, 2), new f("GPSSpeed", 13, 5), new f("GPSTrackRef", 14, 2), new f("GPSTrack", 15, 5), new f("GPSImgDirectionRef", 16, 2), new f("GPSImgDirection", 17, 5), new f("GPSMapDatum", 18, 2), new f("GPSDestLatitudeRef", 19, 2), new f("GPSDestLatitude", 20, 5), new f("GPSDestLongitudeRef", 21, 2), new f("GPSDestLongitude", 22, 5), new f("GPSDestBearingRef", 23, 2), new f("GPSDestBearing", 24, 5), new f("GPSDestDistanceRef", 25, 2), new f("GPSDestDistance", 26, 5), new f("GPSProcessingMethod", 27, 7), new f("GPSAreaInformation", 28, 7), new f("GPSDateStamp", 29, 2), new f("GPSDifferential", 30, 3), new f("GPSHPositioningError", 31, 5)};
        N6 = fVarArr3;
        f[] fVarArr4 = {new f("InteroperabilityIndex", 1, 2)};
        O6 = fVarArr4;
        f[] fVarArr5 = {new f("NewSubfileType", 254, 4), new f("SubfileType", 255, 4), new f("ThumbnailImageWidth", 256, 3, 4), new f("ThumbnailImageLength", 257, 3, 4), new f("BitsPerSample", 258, 3), new f("Compression", 259, 3), new f("PhotometricInterpretation", 262, 3), new f("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new f("Make", 271, 2), new f("Model", 272, 2), new f("StripOffsets", 273, 3, 4), new f("ThumbnailOrientation", 274, 3), new f("SamplesPerPixel", 277, 3), new f("RowsPerStrip", 278, 3, 4), new f("StripByteCounts", 279, 3, 4), new f("XResolution", 282, 5), new f("YResolution", 283, 5), new f("PlanarConfiguration", 284, 3), new f("ResolutionUnit", 296, 3), new f("TransferFunction", 301, 3), new f("Software", 305, 2), new f("DateTime", 306, 2), new f("Artist", 315, 2), new f("WhitePoint", 318, 5), new f("PrimaryChromaticities", 319, 5), new f("SubIFDPointer", 330, 4), new f("JPEGInterchangeFormat", e0.f5479j, 4), new f("JPEGInterchangeFormatLength", 514, 4), new f("YCbCrCoefficients", 529, 5), new f("YCbCrSubSampling", 530, 3), new f("YCbCrPositioning", 531, 3), new f("ReferenceBlackWhite", 532, 5), new f("Copyright", 33432, 2), new f("ExifIFDPointer", 34665, 4), new f("GPSInfoIFDPointer", 34853, 4), new f("DNGVersion", 50706, 1), new f("DefaultCropSize", 50720, 3, 4)};
        P6 = fVarArr5;
        Q6 = new f("StripOffsets", 273, 3);
        f[] fVarArr6 = {new f("ThumbnailImage", 256, 7), new f("CameraSettingsIFDPointer", 8224, 4), new f("ImageProcessingIFDPointer", 8256, 4)};
        R6 = fVarArr6;
        f[] fVarArr7 = {new f("PreviewImageStart", 257, 4), new f("PreviewImageLength", 258, 4)};
        S6 = fVarArr7;
        f[] fVarArr8 = {new f("AspectFrame", 4371, 3)};
        T6 = fVarArr8;
        f[] fVarArr9 = {new f("ColorSpace", 55, 3)};
        U6 = fVarArr9;
        f[][] fVarArr10 = {fVarArr, fVarArr2, fVarArr3, fVarArr4, fVarArr5, fVarArr, fVarArr6, fVarArr7, fVarArr8, fVarArr9};
        f7 = fVarArr10;
        g7 = new f[]{new f("SubIFDPointer", 330, 4), new f("ExifIFDPointer", 34665, 4), new f("GPSInfoIFDPointer", 34853, 4), new f("InteroperabilityIFDPointer", 40965, 4), new f("CameraSettingsIFDPointer", 8224, 1), new f("ImageProcessingIFDPointer", 8256, 1)};
        h7 = new f("JPEGInterchangeFormat", e0.f5479j, 4);
        i7 = new f("JPEGInterchangeFormatLength", 514, 4);
        j7 = new HashMap[fVarArr10.length];
        k7 = new HashMap[fVarArr10.length];
        l7 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        m7 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        n7 = forName;
        o7 = "Exif\u0000\u0000".getBytes(forName);
        p7 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        q6 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i8 = 0;
        while (true) {
            f[][] fVarArr11 = f7;
            if (i8 >= fVarArr11.length) {
                HashMap<Integer, Integer> hashMap = m7;
                f[] fVarArr12 = g7;
                hashMap.put(Integer.valueOf(fVarArr12[0].f7988a), 5);
                hashMap.put(Integer.valueOf(fVarArr12[1].f7988a), 1);
                hashMap.put(Integer.valueOf(fVarArr12[2].f7988a), 2);
                hashMap.put(Integer.valueOf(fVarArr12[3].f7988a), 3);
                hashMap.put(Integer.valueOf(fVarArr12[4].f7988a), 7);
                hashMap.put(Integer.valueOf(fVarArr12[5].f7988a), 8);
                Y7 = Pattern.compile(".*[1-9].*");
                Z7 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
            j7[i8] = new HashMap<>();
            k7[i8] = new HashMap<>();
            for (f fVar : fVarArr11[i8]) {
                j7[i8].put(Integer.valueOf(fVar.f7988a), fVar);
                k7[i8].put(fVar.f7989b, fVar);
            }
            i8++;
        }
    }

    public a(@o0 File file) throws IOException {
        f[][] fVarArr = f7;
        this.f7954f = new HashMap[fVarArr.length];
        this.f7955g = new HashSet(fVarArr.length);
        this.f7956h = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        U(file.getAbsolutePath());
    }

    private int C(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (Y(bArr)) {
            return 4;
        }
        if (b0(bArr)) {
            return 9;
        }
        if (X(bArr)) {
            return 12;
        }
        if (Z(bArr)) {
            return 7;
        }
        if (c0(bArr)) {
            return 10;
        }
        if (a0(bArr)) {
            return 13;
        }
        return j0(bArr) ? 14 : 0;
    }

    private void D(b bVar) throws IOException {
        int i8;
        int i9;
        G(bVar);
        d dVar = this.f7954f[1].get("MakerNote");
        if (dVar != null) {
            b bVar2 = new b(dVar.f7987d);
            bVar2.e(this.f7956h);
            byte[] bArr = O5;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.d(0L);
            byte[] bArr3 = P5;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.d(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.d(12L);
            }
            q0(bVar2, 6);
            d dVar2 = this.f7954f[7].get("PreviewImageStart");
            d dVar3 = this.f7954f[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                this.f7954f[5].put("JPEGInterchangeFormat", dVar2);
                this.f7954f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = this.f7954f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.r(this.f7956h);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i10 = iArr[2];
                int i11 = iArr[0];
                if (i10 <= i11 || (i8 = iArr[3]) <= (i9 = iArr[1])) {
                    return;
                }
                int i12 = (i10 - i11) + 1;
                int i13 = (i8 - i9) + 1;
                if (i12 < i13) {
                    int i14 = i12 + i13;
                    i13 = i14 - i13;
                    i12 = i14 - i13;
                }
                d m8 = d.m(i12, this.f7956h);
                d m9 = d.m(i13, this.f7956h);
                this.f7954f[0].put("ImageWidth", m8);
                this.f7954f[0].put("ImageLength", m9);
            }
        }
    }

    private void E(b bVar) throws IOException {
        if (f7937y) {
            Objects.toString(bVar);
        }
        bVar.e(ByteOrder.BIG_ENDIAN);
        byte[] bArr = V5;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i8 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i9 = i8 + 4;
                if (i9 == 16 && !Arrays.equals(bArr2, X5)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, Y5)) {
                    return;
                }
                if (Arrays.equals(bArr2, W5)) {
                    byte[] bArr3 = new byte[readInt];
                    if (bVar.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                    }
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f7964p = i9;
                        p0(bArr3, 0);
                        I0();
                        return;
                    } else {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                    }
                }
                int i10 = readInt + 4;
                bVar.skipBytes(i10);
                length = i9 + i10;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void E0(b bVar) throws IOException {
        HashMap<String, d> hashMap = this.f7954f[4];
        d dVar = hashMap.get("Compression");
        if (dVar == null) {
            this.f7963o = 6;
            Q(bVar, hashMap);
            return;
        }
        int p8 = dVar.p(this.f7956h);
        this.f7963o = p8;
        if (p8 != 1) {
            if (p8 == 6) {
                Q(bVar, hashMap);
                return;
            } else if (p8 != 7) {
                return;
            }
        }
        if (e0(hashMap)) {
            R(bVar, hashMap);
        }
    }

    private void F(b bVar) throws IOException {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i8 = ByteBuffer.wrap(bArr).getInt();
        int i9 = ByteBuffer.wrap(bArr2).getInt();
        z(bVar, i8, 5);
        bVar.d(i9);
        bVar.e(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        for (int i10 = 0; i10 < readInt; i10++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == Q6.f7988a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d m8 = d.m(readShort, this.f7956h);
                d m9 = d.m(readShort2, this.f7956h);
                this.f7954f[0].put("ImageLength", m8);
                this.f7954f[0].put("ImageWidth", m9);
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    private static boolean F0(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i8 = 0; i8 < bArr2.length; i8++) {
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    private void G(b bVar) throws IOException {
        d dVar;
        m0(bVar, bVar.available());
        q0(bVar, 0);
        H0(bVar, 0);
        H0(bVar, 5);
        H0(bVar, 4);
        I0();
        if (this.f7952d != 8 || (dVar = this.f7954f[1].get("MakerNote")) == null) {
            return;
        }
        b bVar2 = new b(dVar.f7987d);
        bVar2.e(this.f7956h);
        bVar2.d(6L);
        q0(bVar2, 9);
        d dVar2 = this.f7954f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f7954f[1].put("ColorSpace", dVar2);
        }
    }

    private void G0(int i8, int i9) throws IOException {
        if (this.f7954f[i8].isEmpty() || this.f7954f[i9].isEmpty()) {
            return;
        }
        d dVar = this.f7954f[i8].get("ImageLength");
        d dVar2 = this.f7954f[i8].get("ImageWidth");
        d dVar3 = this.f7954f[i9].get("ImageLength");
        d dVar4 = this.f7954f[i9].get("ImageWidth");
        if (dVar == null || dVar2 == null || dVar3 == null || dVar4 == null) {
            return;
        }
        int p8 = dVar.p(this.f7956h);
        int p9 = dVar2.p(this.f7956h);
        int p10 = dVar3.p(this.f7956h);
        int p11 = dVar4.p(this.f7956h);
        if (p8 >= p10 || p9 >= p11) {
            return;
        }
        HashMap<String, d>[] hashMapArr = this.f7954f;
        HashMap<String, d> hashMap = hashMapArr[i8];
        hashMapArr[i8] = hashMapArr[i9];
        hashMapArr[i9] = hashMap;
    }

    private void H0(b bVar, int i8) throws IOException {
        d m8;
        d m9;
        d dVar = this.f7954f[i8].get("DefaultCropSize");
        d dVar2 = this.f7954f[i8].get("SensorTopBorder");
        d dVar3 = this.f7954f[i8].get("SensorLeftBorder");
        d dVar4 = this.f7954f[i8].get("SensorBottomBorder");
        d dVar5 = this.f7954f[i8].get("SensorRightBorder");
        if (dVar != null) {
            if (dVar.f7984a == 5) {
                h[] hVarArr = (h[]) dVar.r(this.f7956h);
                if (hVarArr == null || hVarArr.length != 2) {
                    Arrays.toString(hVarArr);
                    return;
                } else {
                    m8 = d.k(hVarArr[0], this.f7956h);
                    m9 = d.k(hVarArr[1], this.f7956h);
                }
            } else {
                int[] iArr = (int[]) dVar.r(this.f7956h);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    m8 = d.m(iArr[0], this.f7956h);
                    m9 = d.m(iArr[1], this.f7956h);
                }
            }
            this.f7954f[i8].put("ImageWidth", m8);
            this.f7954f[i8].put("ImageLength", m9);
            return;
        }
        if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
            t0(bVar, i8);
            return;
        }
        int p8 = dVar2.p(this.f7956h);
        int p9 = dVar4.p(this.f7956h);
        int p10 = dVar5.p(this.f7956h);
        int p11 = dVar3.p(this.f7956h);
        if (p9 <= p8 || p10 <= p11) {
            return;
        }
        d m10 = d.m(p9 - p8, this.f7956h);
        d m11 = d.m(p10 - p11, this.f7956h);
        this.f7954f[i8].put("ImageLength", m10);
        this.f7954f[i8].put("ImageWidth", m11);
    }

    private void I(b bVar) throws IOException {
        G(bVar);
        if (this.f7954f[0].get("JpgFromRaw") != null) {
            z(bVar, this.f7968t, 5);
        }
        d dVar = this.f7954f[0].get("ISO");
        d dVar2 = this.f7954f[1].get("PhotographicSensitivity");
        if (dVar == null || dVar2 != null) {
            return;
        }
        this.f7954f[1].put("PhotographicSensitivity", dVar);
    }

    private void I0() throws IOException {
        G0(0, 5);
        G0(0, 4);
        G0(5, 4);
        d dVar = this.f7954f[1].get("PixelXDimension");
        d dVar2 = this.f7954f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f7954f[0].put("ImageWidth", dVar);
            this.f7954f[0].put("ImageLength", dVar2);
        }
        if (this.f7954f[4].isEmpty() && h0(this.f7954f[5])) {
            HashMap<String, d>[] hashMapArr = this.f7954f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        h0(this.f7954f[4]);
    }

    private void J(b bVar) throws IOException {
        byte[] bArr = o7;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.f7964p = bArr.length;
        p0(bArr2, 0);
    }

    private int J0(c cVar) throws IOException {
        f[][] fVarArr = f7;
        int[] iArr = new int[fVarArr.length];
        int[] iArr2 = new int[fVarArr.length];
        for (f fVar : g7) {
            r0(fVar.f7989b);
        }
        r0(h7.f7989b);
        r0(i7.f7989b);
        for (int i8 = 0; i8 < f7.length; i8++) {
            for (Object obj : this.f7954f[i8].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f7954f[i8].remove(entry.getKey());
                }
            }
        }
        if (!this.f7954f[1].isEmpty()) {
            this.f7954f[0].put(g7[1].f7989b, d.i(0L, this.f7956h));
        }
        if (!this.f7954f[2].isEmpty()) {
            this.f7954f[0].put(g7[2].f7989b, d.i(0L, this.f7956h));
        }
        if (!this.f7954f[3].isEmpty()) {
            this.f7954f[1].put(g7[3].f7989b, d.i(0L, this.f7956h));
        }
        if (this.f7957i) {
            this.f7954f[4].put(h7.f7989b, d.i(0L, this.f7956h));
            this.f7954f[4].put(i7.f7989b, d.i(this.f7961m, this.f7956h));
        }
        for (int i9 = 0; i9 < f7.length; i9++) {
            Iterator<Map.Entry<String, d>> it = this.f7954f[i9].entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int s8 = it.next().getValue().s();
                if (s8 > 4) {
                    i10 += s8;
                }
            }
            iArr2[i9] = iArr2[i9] + i10;
        }
        int i11 = 8;
        for (int i12 = 0; i12 < f7.length; i12++) {
            if (!this.f7954f[i12].isEmpty()) {
                iArr[i12] = i11;
                i11 = (this.f7954f[i12].size() * 12) + 2 + 4 + iArr2[i12] + i11;
            }
        }
        if (this.f7957i) {
            this.f7954f[4].put(h7.f7989b, d.i(i11, this.f7956h));
            this.f7960l = this.f7964p + i11;
            i11 += this.f7961m;
        }
        if (this.f7952d == 4) {
            i11 += 8;
        }
        if (f7937y) {
            for (int i13 = 0; i13 < f7.length; i13++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i13), Integer.valueOf(iArr[i13]), Integer.valueOf(this.f7954f[i13].size()), Integer.valueOf(iArr2[i13]), Integer.valueOf(i11));
            }
        }
        if (!this.f7954f[1].isEmpty()) {
            this.f7954f[0].put(g7[1].f7989b, d.i(iArr[1], this.f7956h));
        }
        if (!this.f7954f[2].isEmpty()) {
            this.f7954f[0].put(g7[2].f7989b, d.i(iArr[2], this.f7956h));
        }
        if (!this.f7954f[3].isEmpty()) {
            this.f7954f[1].put(g7[3].f7989b, d.i(iArr[3], this.f7956h));
        }
        int i14 = this.f7952d;
        if (i14 == 4) {
            cVar.g(i11);
            cVar.write(o7);
        } else if (i14 == 13) {
            cVar.c(i11);
            cVar.write(W5);
        } else if (i14 == 14) {
            cVar.write(e6);
            cVar.c(i11);
        }
        cVar.d(this.f7956h == ByteOrder.BIG_ENDIAN ? s6 : r6);
        cVar.a(this.f7956h);
        cVar.g(42);
        cVar.e(8L);
        for (int i15 = 0; i15 < f7.length; i15++) {
            if (!this.f7954f[i15].isEmpty()) {
                cVar.g(this.f7954f[i15].size());
                int size = (this.f7954f[i15].size() * 12) + iArr[i15] + 2 + 4;
                for (Map.Entry<String, d> entry2 : this.f7954f[i15].entrySet()) {
                    int i16 = k7[i15].get(entry2.getKey()).f7988a;
                    d value = entry2.getValue();
                    int s9 = value.s();
                    cVar.g(i16);
                    cVar.g(value.f7984a);
                    cVar.c(value.f7985b);
                    if (s9 > 4) {
                        cVar.e(size);
                        size += s9;
                    } else {
                        cVar.write(value.f7987d);
                        if (s9 < 4) {
                            while (s9 < 4) {
                                cVar.b(0);
                                s9++;
                            }
                        }
                    }
                }
                if (i15 != 0 || this.f7954f[4].isEmpty()) {
                    cVar.e(0L);
                } else {
                    cVar.e(iArr[4]);
                }
                Iterator<Map.Entry<String, d>> it2 = this.f7954f[i15].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f7987d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f7957i) {
            cVar.write(M());
        }
        if (this.f7952d == 14 && i11 % 2 == 1) {
            cVar.b(0);
        }
        cVar.a(ByteOrder.BIG_ENDIAN);
        return i11;
    }

    private void O(b bVar) throws IOException {
        if (f7937y) {
            Objects.toString(bVar);
        }
        bVar.e(ByteOrder.LITTLE_ENDIAN);
        bVar.skipBytes(b6.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(c6.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = bVar.readInt();
                int i8 = skipBytes + 4 + 4;
                if (Arrays.equals(e6, bArr)) {
                    byte[] bArr2 = new byte[readInt2];
                    if (bVar.read(bArr2) == readInt2) {
                        this.f7964p = i8;
                        p0(bArr2, 0);
                        this.f7964p = i8;
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                int i9 = i8 + readInt2;
                if (i9 == readInt) {
                    return;
                }
                if (i9 > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                int skipBytes2 = bVar.skipBytes(readInt2);
                if (skipBytes2 != readInt2) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                skipBytes = i8 + skipBytes2;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private static Pair<Integer, Integer> P(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> P8 = P(split[0]);
            if (((Integer) P8.first).intValue() == 2) {
                return P8;
            }
            for (int i8 = 1; i8 < split.length; i8++) {
                Pair<Integer, Integer> P9 = P(split[i8]);
                int intValue = (((Integer) P9.first).equals(P8.first) || ((Integer) P9.second).equals(P8.first)) ? ((Integer) P8.first).intValue() : -1;
                int intValue2 = (((Integer) P8.second).intValue() == -1 || !(((Integer) P9.first).equals(P8.second) || ((Integer) P9.second).equals(P8.second))) ? -1 : ((Integer) P8.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    P8 = new Pair<>(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    P8 = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return P8;
        }
        if (!str.contains("/")) {
            try {
                try {
                    Long valueOf = Long.valueOf(Long.parseLong(str));
                    return (valueOf.longValue() < 0 || valueOf.longValue() > okhttp3.internal.ws.g.f31429s) ? valueOf.longValue() < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
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

    private void Q(b bVar, HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int p8 = dVar.p(this.f7956h);
        int p9 = dVar2.p(this.f7956h);
        if (this.f7952d == 7) {
            p8 += this.f7965q;
        }
        int min = Math.min(p9, bVar.a() - p8);
        if (p8 <= 0 || min <= 0) {
            return;
        }
        this.f7957i = true;
        int i8 = p8 + this.f7964p;
        this.f7960l = i8;
        this.f7961m = min;
        if (this.f7949a == null && this.f7951c == null && this.f7950b == null) {
            byte[] bArr = new byte[min];
            bVar.d(i8);
            bVar.readFully(bArr);
            this.f7962n = bArr;
        }
    }

    private void R(b bVar, HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get("StripOffsets");
        d dVar2 = (d) hashMap.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] g8 = g(dVar.r(this.f7956h));
        long[] g9 = g(dVar2.r(this.f7956h));
        if (g8 == null || g8.length == 0 || g9 == null || g9.length == 0 || g8.length != g9.length) {
            return;
        }
        long j8 = 0;
        for (long j9 : g9) {
            j8 += j9;
        }
        int i8 = (int) j8;
        byte[] bArr = new byte[i8];
        this.f7959k = true;
        this.f7958j = true;
        this.f7957i = true;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < g8.length; i11++) {
            int i12 = (int) g8[i11];
            int i13 = (int) g9[i11];
            if (i11 < g8.length - 1 && i12 + i13 != g8[i11 + 1]) {
                this.f7959k = false;
            }
            int i14 = i12 - i9;
            bVar.d(i14);
            int i15 = i9 + i14;
            byte[] bArr2 = new byte[i13];
            bVar.read(bArr2);
            i9 = i15 + i13;
            System.arraycopy(bArr2, 0, bArr, i10, i13);
            i10 += i13;
        }
        this.f7962n = bArr;
        if (this.f7959k) {
            this.f7960l = ((int) g8[0]) + this.f7964p;
            this.f7961m = i8;
        }
    }

    private void U(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f7951c = null;
        this.f7949a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (d0(fileInputStream2.getFD())) {
                    this.f7950b = fileInputStream2.getFD();
                } else {
                    this.f7950b = null;
                }
                k0(fileInputStream2);
                d(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                d(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean V(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = o7;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i8 = 0;
        while (true) {
            byte[] bArr3 = o7;
            if (i8 >= bArr3.length) {
                return true;
            }
            if (bArr2[i8] != bArr3[i8]) {
                return false;
            }
            i8++;
        }
    }

    private boolean X(byte[] bArr) throws IOException {
        b bVar;
        long readInt;
        byte[] bArr2;
        long j8;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.read(bArr2);
        } catch (Exception unused2) {
            bVar2 = bVar;
            boolean z8 = f7937y;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, J5)) {
            bVar.close();
            return false;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j8 = 16;
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j8 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j9 = readInt - j8;
        if (j9 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z9 = false;
        boolean z10 = false;
        for (long j10 = 0; j10 < j9 / 4; j10++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j10 != 1) {
                if (Arrays.equals(bArr3, K5)) {
                    z9 = true;
                } else if (Arrays.equals(bArr3, L5)) {
                    z10 = true;
                }
                if (z9 && z10) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    private static boolean Y(byte[] bArr) throws IOException {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = F5;
            if (i8 >= bArr2.length) {
                return true;
            }
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
            i8++;
        }
    }

    private boolean Z(byte[] bArr) throws IOException {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder o02 = o0(bVar2);
                this.f7956h = o02;
                bVar2.e(o02);
                short readShort = bVar2.readShort();
                boolean z8 = readShort == 20306 || readShort == 21330;
                bVar2.close();
                return z8;
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

    private void a() {
        String o8 = o("DateTimeOriginal");
        if (o8 != null && o("DateTime") == null) {
            this.f7954f[0].put("DateTime", d.h(o8));
        }
        if (o("ImageWidth") == null) {
            this.f7954f[0].put("ImageWidth", d.i(0L, this.f7956h));
        }
        if (o("ImageLength") == null) {
            this.f7954f[0].put("ImageLength", d.i(0L, this.f7956h));
        }
        if (o("Orientation") == null) {
            this.f7954f[0].put("Orientation", d.i(0L, this.f7956h));
        }
        if (o("LightSource") == null) {
            this.f7954f[1].put("LightSource", d.i(0L, this.f7956h));
        }
    }

    private boolean a0(byte[] bArr) throws IOException {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = V5;
            if (i8 >= bArr2.length) {
                return true;
            }
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
            i8++;
        }
    }

    private static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b8 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b8)));
        }
        return sb.toString();
    }

    private boolean b0(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i8 = 0; i8 < bytes.length; i8++) {
            if (bArr[i8] != bytes[i8]) {
                return false;
            }
        }
        return true;
    }

    private static void c(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (Exception unused) {
        }
    }

    private boolean c0(byte[] bArr) throws IOException {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder o02 = o0(bVar2);
                this.f7956h = o02;
                bVar2.e(o02);
                boolean z8 = bVar2.readShort() == 85;
                bVar2.close();
                return z8;
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

    private static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception unused) {
            }
        }
    }

    private static boolean d0(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private String e(double d8) {
        long j8 = (long) d8;
        double d9 = d8 - j8;
        long j9 = (long) (d9 * 60.0d);
        return j8 + "/1," + j9 + "/1," + Math.round((d9 - (j9 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    private boolean e0(HashMap hashMap) throws IOException {
        d dVar;
        d dVar2 = (d) hashMap.get("BitsPerSample");
        if (dVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) dVar2.r(this.f7956h);
        int[] iArr2 = t5;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f7952d != 3 || (dVar = (d) hashMap.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int p8 = dVar.p(this.f7956h);
        return (p8 == 1 && Arrays.equals(iArr, v5)) || (p8 == 6 && Arrays.equals(iArr, iArr2));
    }

    private static double f(String str, String str2) {
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

    private boolean f0() {
        if (!this.f7969u) {
            return false;
        }
        int i8 = this.f7952d;
        return i8 == 4 || i8 == 13 || i8 == 14;
    }

    private static long[] g(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            jArr[i8] = iArr[i8];
        }
        return jArr;
    }

    public static boolean g0(@o0 String str) {
        if (str == null) {
            throw new NullPointerException("mimeType shouldn't be null");
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        switch (lowerCase) {
            case "image/x-fuji-raf":
            case "image/x-samsung-srw":
            case "image/x-sony-arw":
            case "image/heic":
            case "image/heif":
            case "image/jpeg":
            case "image/webp":
            case "image/x-adobe-dng":
            case "image/x-panasonic-rw2":
            case "image/png":
            case "image/x-pentax-pef":
            case "image/x-olympus-orf":
            case "image/x-nikon-nef":
            case "image/x-nikon-nrw":
            case "image/x-canon-cr2":
                return true;
            default:
                return false;
        }
    }

    private static int h(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i8 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i8;
            }
            i8 += read;
            outputStream.write(bArr, 0, read);
        }
    }

    private boolean h0(HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.p(this.f7956h) <= 512 && dVar2.p(this.f7956h) <= 512;
    }

    private static void i(InputStream inputStream, OutputStream outputStream, int i8) throws IOException {
        byte[] bArr = new byte[8192];
        while (i8 > 0) {
            int min = Math.min(i8, 8192);
            int read = inputStream.read(bArr, 0, min);
            if (read != min) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i8 -= read;
            outputStream.write(bArr, 0, read);
        }
    }

    private void j(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = n7;
                sb.append(new String(bArr, charset));
                sb.append(bArr2 == null ? "" : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb.toString());
            }
            k(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private boolean j0(byte[] bArr) throws IOException {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = b6;
            if (i8 >= bArr2.length) {
                int i9 = 0;
                while (true) {
                    byte[] bArr3 = c6;
                    if (i9 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[b6.length + i9 + 4] != bArr3[i9]) {
                        return false;
                    }
                    i9++;
                }
            } else {
                if (bArr[i8] != bArr2[i8]) {
                    return false;
                }
                i8++;
            }
        }
    }

    private void k(b bVar, c cVar, byte[] bArr) throws IOException {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.c(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        i(bVar, cVar, readInt);
    }

    private void k0(@o0 InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i8 = 0; i8 < f7.length; i8++) {
            try {
                try {
                    this.f7954f[i8] = new HashMap<>();
                } catch (IOException unused) {
                    this.f7969u = false;
                    boolean z8 = f7937y;
                    a();
                    if (!z8) {
                        return;
                    }
                }
            } finally {
                a();
                if (f7937y) {
                    n0();
                }
            }
        }
        if (!this.f7953e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f7952d = C(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        b bVar = new b(inputStream);
        if (!this.f7953e) {
            switch (this.f7952d) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    G(bVar);
                    break;
                case 4:
                    z(bVar, 0, 0);
                    break;
                case 7:
                    D(bVar);
                    break;
                case 9:
                    F(bVar);
                    break;
                case 10:
                    I(bVar);
                    break;
                case 12:
                    y(bVar);
                    break;
                case 13:
                    E(bVar);
                    break;
                case 14:
                    O(bVar);
                    break;
            }
        } else {
            J(bVar);
        }
        E0(bVar);
        this.f7969u = true;
    }

    private static long l0(@q0 String str, @q0 String str2) {
        if (str != null && Y7.matcher(str).matches()) {
            try {
                Date parse = q6.parse(str, new ParsePosition(0));
                if (parse == null) {
                    return -1L;
                }
                long time = parse.getTime();
                if (str2 == null) {
                    return time;
                }
                try {
                    long parseLong = Long.parseLong(str2);
                    while (parseLong > 1000) {
                        parseLong /= 10;
                    }
                    return time + parseLong;
                } catch (NumberFormatException unused) {
                    return time;
                }
            } catch (IllegalArgumentException unused2) {
            }
        }
        return -1L;
    }

    private void m0(b bVar, int i8) throws IOException {
        ByteOrder o02 = o0(bVar);
        this.f7956h = o02;
        bVar.e(o02);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i9 = this.f7952d;
        if (i9 != 7 && i9 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8 || readInt >= i8) {
            throw new IOException(s.a("Invalid first Ifd offset: ", readInt));
        }
        int i10 = readInt - 8;
        if (i10 > 0 && bVar.skipBytes(i10) != i10) {
            throw new IOException(s.a("Couldn't jump to first Ifd: ", i10));
        }
    }

    private void n0() {
        int i8 = 0;
        while (true) {
            HashMap<String, d>[] hashMapArr = this.f7954f;
            if (i8 >= hashMapArr.length) {
                return;
            }
            hashMapArr[i8].size();
            for (Map.Entry<String, d> entry : this.f7954f[i8].entrySet()) {
                d value = entry.getValue();
                entry.getKey();
                value.toString();
                value.q(this.f7956h);
            }
            i8++;
        }
    }

    private ByteOrder o0(b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    private void p0(byte[] bArr, int i8) throws IOException {
        b bVar = new b(bArr);
        m0(bVar, bArr.length);
        q0(bVar, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q0(androidx.exifinterface.media.a.b r27, int r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.q0(androidx.exifinterface.media.a$b, int):void");
    }

    private void r0(String str) {
        for (int i8 = 0; i8 < f7.length; i8++) {
            this.f7954f[i8].remove(str);
        }
    }

    private void t0(b bVar, int i8) throws IOException {
        d dVar;
        d dVar2 = this.f7954f[i8].get("ImageLength");
        d dVar3 = this.f7954f[i8].get("ImageWidth");
        if ((dVar2 == null || dVar3 == null) && (dVar = this.f7954f[i8].get("JPEGInterchangeFormat")) != null) {
            z(bVar, dVar.p(this.f7956h), i8);
        }
    }

    @q0
    private d w(@o0 String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i8 = 0; i8 < f7.length; i8++) {
            d dVar = this.f7954f[i8].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    private void w0(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f7937y) {
            Objects.toString(inputStream);
            Objects.toString(outputStream);
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-1);
        if (dataInputStream.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-40);
        d remove = (o("Xmp") == null || !this.f7971w) ? null : this.f7954f[0].remove("Xmp");
        cVar.b(-1);
        cVar.b(-31);
        J0(cVar);
        if (remove != null) {
            this.f7954f[0].put("Xmp", remove);
        }
        byte[] bArr = new byte[4096];
        while (dataInputStream.readByte() == -1) {
            byte readByte = dataInputStream.readByte();
            if (readByte == -39 || readByte == -38) {
                cVar.b(-1);
                cVar.b(readByte);
                h(dataInputStream, cVar);
                return;
            }
            if (readByte != -31) {
                cVar.b(-1);
                cVar.b(readByte);
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                cVar.d((short) readUnsignedShort);
                int i8 = readUnsignedShort - 2;
                if (i8 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i8 > 0) {
                    int read = dataInputStream.read(bArr, 0, Math.min(i8, 4096));
                    if (read >= 0) {
                        cVar.write(bArr, 0, read);
                        i8 -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = dataInputStream.readUnsignedShort() - 2;
                if (readUnsignedShort2 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (readUnsignedShort2 >= 6) {
                    if (dataInputStream.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, o7)) {
                        int i9 = readUnsignedShort2 - 6;
                        if (dataInputStream.skipBytes(i9) != i9) {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                cVar.b(-1);
                cVar.b(readByte);
                cVar.d((short) (readUnsignedShort2 + 2));
                if (readUnsignedShort2 >= 6) {
                    readUnsignedShort2 -= 6;
                    cVar.write(bArr2);
                }
                while (readUnsignedShort2 > 0) {
                    int read2 = dataInputStream.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                    if (read2 >= 0) {
                        cVar.write(bArr, 0, read2);
                        readUnsignedShort2 -= read2;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    private void x0(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f7937y) {
            Objects.toString(inputStream);
            Objects.toString(outputStream);
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = V5;
        i(dataInputStream, cVar, bArr.length);
        int i8 = this.f7964p;
        if (i8 == 0) {
            int readInt = dataInputStream.readInt();
            cVar.c(readInt);
            i(dataInputStream, cVar, readInt + 4 + 4);
        } else {
            i(dataInputStream, cVar, ((i8 - bArr.length) - 4) - 4);
            dataInputStream.skipBytes(dataInputStream.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                J0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f7981o).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.c((int) crc32.getValue());
                d(byteArrayOutputStream2);
                h(dataInputStream, cVar);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                d(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void y(b bVar) throws IOException {
        String str;
        String str2;
        String str3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new C0089a(bVar));
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
                this.f7954f[0].put("ImageWidth", d.m(Integer.parseInt(str), this.f7956h));
            }
            if (str2 != null) {
                this.f7954f[0].put("ImageLength", d.m(Integer.parseInt(str2), this.f7956h));
            }
            if (str3 != null) {
                int parseInt = Integer.parseInt(str3);
                this.f7954f[0].put("Orientation", d.m(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f7956h));
            }
            if (extractMetadata != null && extractMetadata2 != null) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 <= 6) {
                    throw new IOException("Invalid exif length");
                }
                bVar.d(parseInt2);
                byte[] bArr = new byte[6];
                if (bVar.read(bArr) != 6) {
                    throw new IOException("Can't read identifier");
                }
                int i8 = parseInt2 + 6;
                int i9 = parseInt3 - 6;
                if (!Arrays.equals(bArr, o7)) {
                    throw new IOException("Invalid identifier");
                }
                byte[] bArr2 = new byte[i9];
                if (bVar.read(bArr2) != i9) {
                    throw new IOException("Can't read exif");
                }
                this.f7964p = i8;
                p0(bArr2, 0);
            }
            boolean z8 = f7937y;
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    private void y0(InputStream inputStream, OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f7937y) {
            Objects.toString(inputStream);
            Objects.toString(outputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = b6;
        i(bVar, cVar, bArr.length);
        byte[] bArr2 = c6;
        bVar.skipBytes(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            int i8 = this.f7964p;
            if (i8 != 0) {
                i(bVar, cVar2, ((i8 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                bVar.skipBytes(4);
                bVar.skipBytes(bVar.readInt());
                J0(cVar2);
            } else {
                byte[] bArr3 = new byte[4];
                if (bVar.read(bArr3) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                }
                byte[] bArr4 = h6;
                if (Arrays.equals(bArr3, bArr4)) {
                    int readInt = bVar.readInt();
                    boolean z8 = true;
                    byte[] bArr5 = new byte[readInt % 2 == 1 ? readInt + 1 : readInt];
                    bVar.read(bArr5);
                    byte b8 = (byte) (bArr5[0] | 8);
                    bArr5[0] = b8;
                    if (((b8 >> 1) & 1) != 1) {
                        z8 = false;
                    }
                    cVar2.write(bArr4);
                    cVar2.c(readInt);
                    cVar2.write(bArr5);
                    if (z8) {
                        j(bVar, cVar2, k6, null);
                        while (true) {
                            byte[] bArr6 = new byte[4];
                            inputStream.read(bArr6);
                            if (!Arrays.equals(bArr6, l6)) {
                                break;
                            } else {
                                k(bVar, cVar2, bArr6);
                            }
                        }
                        J0(cVar2);
                    } else {
                        j(bVar, cVar2, j6, i6);
                        J0(cVar2);
                    }
                } else if (Arrays.equals(bArr3, j6) || Arrays.equals(bArr3, i6)) {
                    throw new IOException("WebP files with only VP8 or VP8L chunks are currently not supported");
                }
            }
            h(bVar, cVar2);
            int size = byteArrayOutputStream.size();
            byte[] bArr7 = c6;
            cVar.c(size + bArr7.length);
            cVar.write(bArr7);
            byteArrayOutputStream.writeTo(cVar);
            d(byteArrayOutputStream);
        } catch (Exception e9) {
            e = e9;
            byteArrayOutputStream2 = byteArrayOutputStream;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            d(byteArrayOutputStream2);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x014a, code lost:
    
        r19.e(r18.f7956h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void z(androidx.exifinterface.media.a.b r19, int r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.z(androidx.exifinterface.media.a$b, int, int):void");
    }

    @Deprecated
    public boolean A(float[] fArr) {
        double[] B8 = B();
        if (B8 == null) {
            return false;
        }
        fArr[0] = (float) B8[0];
        fArr[1] = (float) B8[1];
        return true;
    }

    public void A0(@o0 String str, @q0 String str2) {
        f fVar;
        int i8;
        String str3 = str;
        String str4 = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str3)) {
            str3 = "PhotographicSensitivity";
        }
        int i9 = 2;
        int i10 = 1;
        if (str4 != null && l7.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = Z7.matcher(str4);
                if (!matcher.find()) {
                    return;
                }
                str4 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str4 = new h(Double.parseDouble(str2)).toString();
                } catch (NumberFormatException unused) {
                    return;
                }
            }
        }
        int i11 = 0;
        while (i11 < f7.length) {
            if ((i11 != 4 || this.f7957i) && (fVar = k7[i11].get(str3)) != null) {
                if (str4 != null) {
                    Pair<Integer, Integer> P8 = P(str4);
                    if (fVar.f7990c == ((Integer) P8.first).intValue() || fVar.f7990c == ((Integer) P8.second).intValue()) {
                        i8 = fVar.f7990c;
                    } else {
                        int i12 = fVar.f7991d;
                        if (i12 == -1 || !(i12 == ((Integer) P8.first).intValue() || fVar.f7991d == ((Integer) P8.second).intValue())) {
                            int i13 = fVar.f7990c;
                            if (i13 == i10 || i13 == 7 || i13 == i9) {
                                i8 = i13;
                            } else if (f7937y) {
                                String[] strArr = I6;
                                String str5 = strArr[i13];
                                if (fVar.f7991d != -1) {
                                    new StringBuilder(", ").append(strArr[fVar.f7991d]);
                                }
                                String str6 = strArr[((Integer) P8.first).intValue()];
                                if (((Integer) P8.second).intValue() != -1) {
                                    new StringBuilder(", ").append(strArr[((Integer) P8.second).intValue()]);
                                }
                            }
                        } else {
                            i8 = fVar.f7991d;
                        }
                    }
                    switch (i8) {
                        case 1:
                            this.f7954f[i11].put(str3, d.a(str4));
                            break;
                        case 2:
                        case 7:
                            this.f7954f[i11].put(str3, d.h(str4));
                            break;
                        case 3:
                            String[] split = str4.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i14 = 0; i14 < split.length; i14++) {
                                iArr[i14] = Integer.parseInt(split[i14]);
                            }
                            this.f7954f[i11].put(str3, d.n(iArr, this.f7956h));
                            break;
                        case 4:
                            String[] split2 = str4.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i15 = 0; i15 < split2.length; i15++) {
                                jArr[i15] = Long.parseLong(split2[i15]);
                            }
                            this.f7954f[i11].put(str3, d.j(jArr, this.f7956h));
                            break;
                        case 5:
                            String[] split3 = str4.split(",", -1);
                            h[] hVarArr = new h[split3.length];
                            for (int i16 = 0; i16 < split3.length; i16++) {
                                String[] split4 = split3[i16].split("/", -1);
                                hVarArr[i16] = new h((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                            }
                            this.f7954f[i11].put(str3, d.l(hVarArr, this.f7956h));
                            break;
                        case 9:
                            String[] split5 = str4.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i17 = 0; i17 < split5.length; i17++) {
                                iArr2[i17] = Integer.parseInt(split5[i17]);
                            }
                            this.f7954f[i11].put(str3, d.e(iArr2, this.f7956h));
                            break;
                        case 10:
                            String[] split6 = str4.split(",", -1);
                            h[] hVarArr2 = new h[split6.length];
                            int i18 = 0;
                            while (i18 < split6.length) {
                                String[] split7 = split6[i18].split("/", -1);
                                hVarArr2[i18] = new h((long) Double.parseDouble(split7[0]), (long) Double.parseDouble(split7[i10]));
                                i18++;
                                i10 = 1;
                            }
                            this.f7954f[i11].put(str3, d.g(hVarArr2, this.f7956h));
                            break;
                        case 12:
                            String[] split8 = str4.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i19 = 0; i19 < split8.length; i19++) {
                                dArr[i19] = Double.parseDouble(split8[i19]);
                            }
                            this.f7954f[i11].put(str3, d.c(dArr, this.f7956h));
                            break;
                    }
                } else {
                    this.f7954f[i11].remove(str3);
                }
            }
            i11++;
            i9 = 2;
            i10 = 1;
        }
    }

    @q0
    public double[] B() {
        String o8 = o("GPSLatitude");
        String o9 = o("GPSLatitudeRef");
        String o10 = o("GPSLongitude");
        String o11 = o("GPSLongitudeRef");
        if (o8 == null || o9 == null || o10 == null || o11 == null) {
            return null;
        }
        try {
            return new double[]{f(o8, o9), f(o10, o11)};
        } catch (IllegalArgumentException unused) {
            String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", o8, o9, o10, o11);
            return null;
        }
    }

    @c1({c1.a.LIBRARY})
    public void B0(long j8) {
        A0("DateTime", q6.format(new Date(j8)));
        A0("SubSecTime", Long.toString(j8 % 1000));
    }

    public void C0(Location location) {
        if (location == null) {
            return;
        }
        A0("GPSProcessingMethod", location.getProvider());
        D0(location.getLatitude(), location.getLongitude());
        z0(location.getAltitude());
        A0("GPSSpeedRef", "K");
        A0("GPSSpeed", new h((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] split = q6.format(new Date(location.getTime())).split("\\s+", -1);
        A0("GPSDateStamp", split[0]);
        A0("GPSTimeStamp", split[1]);
    }

    public void D0(double d8, double d9) {
        if (d8 < -90.0d || d8 > 90.0d || Double.isNaN(d8)) {
            throw new IllegalArgumentException("Latitude value " + d8 + " is not valid.");
        }
        if (d9 < -180.0d || d9 > 180.0d || Double.isNaN(d9)) {
            throw new IllegalArgumentException("Longitude value " + d9 + " is not valid.");
        }
        A0("GPSLatitudeRef", d8 >= p.f18289o ? "N" : "S");
        A0("GPSLatitude", e(Math.abs(d8)));
        A0("GPSLongitudeRef", d9 >= p.f18289o ? "E" : "W");
        A0("GPSLongitude", e(Math.abs(d9)));
    }

    public int H() {
        switch (r("Orientation", 1)) {
            case 3:
            case 4:
                return SubsamplingScaleImageView.ORIENTATION_180;
            case 5:
            case 8:
                return SubsamplingScaleImageView.ORIENTATION_270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    @q0
    public byte[] K() {
        int i8 = this.f7963o;
        if (i8 == 6 || i8 == 7) {
            return M();
        }
        return null;
    }

    @q0
    public Bitmap L() {
        if (!this.f7957i) {
            return null;
        }
        if (this.f7962n == null) {
            this.f7962n = M();
        }
        int i8 = this.f7963o;
        if (i8 == 6 || i8 == 7) {
            return BitmapFactory.decodeByteArray(this.f7962n, 0, this.f7961m);
        }
        if (i8 == 1) {
            int length = this.f7962n.length / 3;
            int[] iArr = new int[length];
            for (int i9 = 0; i9 < length; i9++) {
                byte[] bArr = this.f7962n;
                int i10 = i9 * 3;
                iArr[i9] = (bArr[i10] << 16) + 0 + (bArr[i10 + 1] << 8) + bArr[i10 + 2];
            }
            d dVar = this.f7954f[4].get("ImageLength");
            d dVar2 = this.f7954f[4].get("ImageWidth");
            if (dVar != null && dVar2 != null) {
                return Bitmap.createBitmap(iArr, dVar2.p(this.f7956h), dVar.p(this.f7956h), Bitmap.Config.ARGB_8888);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057 A[Catch: all -> 0x008a, Exception -> 0x00a3, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x00a3, all -> 0x008a, blocks: (B:17:0x0057, B:20:0x0067, B:22:0x0073, B:30:0x007e, B:31:0x0083, B:32:0x0084, B:33:0x0089, B:34:0x008f, B:35:0x0094), top: B:15:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[Catch: all -> 0x008a, Exception -> 0x00a3, TryCatch #9 {Exception -> 0x00a3, all -> 0x008a, blocks: (B:17:0x0057, B:20:0x0067, B:22:0x0073, B:30:0x007e, B:31:0x0083, B:32:0x0084, B:33:0x0089, B:34:0x008f, B:35:0x0094), top: B:15:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[SYNTHETIC] */
    @androidx.annotation.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] M() {
        /*
            r8 = this;
            boolean r0 = r8.f7957i
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            byte[] r0 = r8.f7962n
            if (r0 == 0) goto Lb
            return r0
        Lb:
            android.content.res.AssetManager$AssetInputStream r0 = r8.f7951c     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> La1
            if (r0 == 0) goto L28
            boolean r2 = r0.markSupported()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L25
            if (r2 == 0) goto L1a
            r0.reset()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L25
        L18:
            r2 = r1
            goto L55
        L1a:
            d(r0)
            return r1
        L1e:
            r2 = move-exception
            r7 = r1
            r1 = r0
            r0 = r2
            r2 = r7
            goto L98
        L25:
            r2 = r1
            goto La3
        L28:
            java.lang.String r0 = r8.f7949a     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> La1
            if (r0 == 0) goto L34
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> La1
            java.lang.String r2 = r8.f7949a     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> La1
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> La1
            goto L18
        L34:
            java.io.FileDescriptor r0 = r8.f7950b     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> La1
            if (r0 == 0) goto L53
            java.io.FileDescriptor r0 = android.system.Os.dup(r0)     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> La1
            int r2 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r3 = 0
            android.system.Os.lseek(r0, r3, r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r7 = r2
            r2 = r0
            r0 = r7
            goto L55
        L4c:
            r2 = move-exception
            r7 = r2
            r2 = r0
            goto L8d
        L50:
            r2 = r0
            r0 = r1
            goto La3
        L53:
            r0 = r1
            r2 = r0
        L55:
            if (r0 == 0) goto L8f
            int r3 = r8.f7960l     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> La3
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> La3
            long r3 = r0.skip(r3)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> La3
            int r5 = r8.f7960l     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> La3
            long r5 = (long) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            java.lang.String r4 = "Corrupted image"
            if (r3 != 0) goto L84
            int r3 = r8.f7961m     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> La3
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> La3
            int r5 = r0.read(r3)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> La3
            int r6 = r8.f7961m     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> La3
            if (r5 != r6) goto L7e
            r8.f7962n = r3     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> La3
            d(r0)
            if (r2 == 0) goto L7d
            android.system.Os.close(r2)     // Catch: java.lang.Exception -> L7d
        L7d:
            return r3
        L7e:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> La3
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> La3
            throw r3     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> La3
        L84:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> La3
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> La3
            throw r3     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> La3
        L8a:
            r1 = move-exception
            r7 = r1
            r1 = r0
        L8d:
            r0 = r7
            goto L98
        L8f:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> La3
            r3.<init>()     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> La3
            throw r3     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> La3
        L95:
            r2 = move-exception
            r0 = r2
            r2 = r1
        L98:
            d(r1)
            if (r2 == 0) goto La0
            android.system.Os.close(r2)     // Catch: java.lang.Exception -> La0
        La0:
            throw r0
        La1:
            r0 = r1
            r2 = r0
        La3:
            d(r0)
            if (r2 == 0) goto Lab
            android.system.Os.close(r2)     // Catch: java.lang.Exception -> Lab
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.M():byte[]");
    }

    @q0
    public long[] N() {
        if (this.f7970v) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        if (!this.f7957i) {
            return null;
        }
        if (!this.f7958j || this.f7959k) {
            return new long[]{this.f7960l, this.f7961m};
        }
        return null;
    }

    public boolean S(@o0 String str) {
        return w(str) != null;
    }

    public boolean T() {
        return this.f7957i;
    }

    public boolean W() {
        int r8 = r("Orientation", 1);
        return r8 == 2 || r8 == 7 || r8 == 4 || r8 == 5;
    }

    public boolean i0() {
        if (!this.f7957i) {
            return false;
        }
        int i8 = this.f7963o;
        return i8 == 6 || i8 == 7;
    }

    public void l() {
        int i8 = 1;
        switch (r("Orientation", 1)) {
            case 1:
                i8 = 2;
                break;
            case 2:
                break;
            case 3:
                i8 = 4;
                break;
            case 4:
                i8 = 3;
                break;
            case 5:
                i8 = 6;
                break;
            case 6:
                i8 = 5;
                break;
            case 7:
                i8 = 8;
                break;
            case 8:
                i8 = 7;
                break;
            default:
                i8 = 0;
                break;
        }
        A0("Orientation", Integer.toString(i8));
    }

    public void m() {
        int i8 = 1;
        switch (r("Orientation", 1)) {
            case 1:
                i8 = 4;
                break;
            case 2:
                i8 = 3;
                break;
            case 3:
                i8 = 2;
                break;
            case 4:
                break;
            case 5:
                i8 = 8;
                break;
            case 6:
                i8 = 7;
                break;
            case 7:
                i8 = 6;
                break;
            case 8:
                i8 = 5;
                break;
            default:
                i8 = 0;
                break;
        }
        A0("Orientation", Integer.toString(i8));
    }

    public double n(double d8) {
        double q8 = q("GPSAltitude", -1.0d);
        int r8 = r("GPSAltitudeRef", -1);
        if (q8 < p.f18289o || r8 < 0) {
            return d8;
        }
        return q8 * (r8 != 1 ? 1 : -1);
    }

    @q0
    public String o(@o0 String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d w8 = w(str);
        if (w8 != null) {
            if (!l7.contains(str)) {
                return w8.q(this.f7956h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i8 = w8.f7984a;
                if (i8 != 5 && i8 != 10) {
                    return null;
                }
                h[] hVarArr = (h[]) w8.r(this.f7956h);
                if (hVarArr == null || hVarArr.length != 3) {
                    Arrays.toString(hVarArr);
                    return null;
                }
                h hVar = hVarArr[0];
                h hVar2 = hVarArr[1];
                h hVar3 = hVarArr[2];
                return String.format("%02d:%02d:%02d", Integer.valueOf((int) (hVar.f7992a / hVar.f7993b)), Integer.valueOf((int) (hVar2.f7992a / hVar2.f7993b)), Integer.valueOf((int) (hVar3.f7992a / hVar3.f7993b)));
            }
            try {
                return Double.toString(w8.o(this.f7956h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @q0
    public byte[] p(@o0 String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d w8 = w(str);
        if (w8 != null) {
            return w8.f7987d;
        }
        return null;
    }

    public double q(@o0 String str, double d8) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d w8 = w(str);
        if (w8 == null) {
            return d8;
        }
        try {
            return w8.o(this.f7956h);
        } catch (NumberFormatException unused) {
            return d8;
        }
    }

    public int r(@o0 String str, int i8) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d w8 = w(str);
        if (w8 == null) {
            return i8;
        }
        try {
            return w8.p(this.f7956h);
        } catch (NumberFormatException unused) {
            return i8;
        }
    }

    @q0
    public long[] s(@o0 String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (this.f7970v) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        d w8 = w(str);
        if (w8 != null) {
            return new long[]{w8.f7986c, w8.f7987d.length};
        }
        return null;
    }

    public void s0() {
        A0("Orientation", Integer.toString(1));
    }

    @c1({c1.a.LIBRARY})
    public long t() {
        return l0(o("DateTime"), o("SubSecTime"));
    }

    @c1({c1.a.LIBRARY})
    public long u() {
        return l0(o("DateTimeDigitized"), o("SubSecTimeDigitized"));
    }

    public void u0(int i8) {
        if (i8 % 90 != 0) {
            throw new IllegalArgumentException("degree should be a multiple of 90");
        }
        int r8 = r("Orientation", 1);
        List<Integer> list = O2;
        if (list.contains(Integer.valueOf(r8))) {
            int indexOf = ((i8 / 90) + list.indexOf(Integer.valueOf(r8))) % 4;
            r4 = list.get(indexOf + (indexOf < 0 ? 4 : 0)).intValue();
        } else {
            List<Integer> list2 = P2;
            if (list2.contains(Integer.valueOf(r8))) {
                int indexOf2 = ((i8 / 90) + list2.indexOf(Integer.valueOf(r8))) % 4;
                r4 = list2.get(indexOf2 + (indexOf2 < 0 ? 4 : 0)).intValue();
            }
        }
        A0("Orientation", Integer.toString(r4));
    }

    @c1({c1.a.LIBRARY})
    public long v() {
        return l0(o("DateTimeOriginal"), o("SubSecTimeOriginal"));
    }

    public void v0() throws IOException {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        File file;
        BufferedOutputStream bufferedOutputStream;
        FileOutputStream fileOutputStream2;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream2;
        if (!f0()) {
            throw new IOException("ExifInterface only supports saving attributes on JPEG, PNG, or WebP formats.");
        }
        if (this.f7950b == null && this.f7949a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        this.f7970v = true;
        this.f7962n = K();
        InputStream inputStream = null;
        File file2 = this.f7949a != null ? new File(this.f7949a) : null;
        try {
            if (this.f7949a != null) {
                file = new File(this.f7949a + ".tmp");
                if (!file2.renameTo(file)) {
                    throw new IOException("Couldn't rename to " + file.getAbsolutePath());
                }
                fileInputStream = null;
                fileOutputStream = null;
            } else if (this.f7950b != null) {
                file = File.createTempFile("temp", "tmp");
                Os.lseek(this.f7950b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.f7950b);
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        h(fileInputStream, fileOutputStream);
                    } catch (Exception e8) {
                        e = e8;
                        inputStream = fileInputStream;
                        e = e;
                        try {
                            throw new IOException("Failed to copy original file to temp file", e);
                        } catch (Throwable th) {
                            th = th;
                            d(inputStream);
                            d(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = fileInputStream;
                        th = th;
                        d(inputStream);
                        d(fileOutputStream);
                        throw th;
                    }
                } catch (Exception e9) {
                    e = e9;
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } else {
                fileInputStream = null;
                file = null;
                fileOutputStream = null;
            }
            d(fileInputStream);
            d(fileOutputStream);
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                if (this.f7949a != null) {
                    fileOutputStream2 = new FileOutputStream(this.f7949a);
                } else {
                    FileDescriptor fileDescriptor = this.f7950b;
                    if (fileDescriptor != null) {
                        Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_SET);
                        fileOutputStream2 = new FileOutputStream(this.f7950b);
                    } else {
                        fileOutputStream2 = null;
                    }
                }
                bufferedInputStream = new BufferedInputStream(fileInputStream2);
                try {
                    bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream2);
                } catch (Exception e10) {
                    e = e10;
                    bufferedOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedOutputStream = null;
                }
            } catch (Exception e11) {
                e = e11;
                bufferedOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                bufferedOutputStream = null;
            }
            try {
                int i8 = this.f7952d;
                if (i8 == 4) {
                    w0(bufferedInputStream, bufferedOutputStream2);
                } else if (i8 == 13) {
                    x0(bufferedInputStream, bufferedOutputStream2);
                } else if (i8 == 14) {
                    y0(bufferedInputStream, bufferedOutputStream2);
                }
                d(bufferedInputStream);
                d(bufferedOutputStream2);
                file.delete();
                this.f7962n = null;
            } catch (Exception e12) {
                bufferedOutputStream = bufferedOutputStream2;
                e = e12;
                inputStream = bufferedInputStream;
                try {
                    if (this.f7949a == null || file.renameTo(file2)) {
                        throw new IOException("Failed to save new file", e);
                    }
                    throw new IOException("Couldn't restore original file: " + file2.getAbsolutePath());
                } catch (Throwable th6) {
                    th = th6;
                    d(inputStream);
                    d(bufferedOutputStream);
                    file.delete();
                    throw th;
                }
            } catch (Throwable th7) {
                bufferedOutputStream = bufferedOutputStream2;
                th = th7;
                inputStream = bufferedInputStream;
                d(inputStream);
                d(bufferedOutputStream);
                file.delete();
                throw th;
            }
        } catch (Exception e13) {
            e = e13;
            fileOutputStream = null;
        } catch (Throwable th8) {
            th = th8;
            fileOutputStream = null;
        }
    }

    @c1({c1.a.LIBRARY})
    public long x() {
        String o8 = o("GPSDateStamp");
        String o9 = o("GPSTimeStamp");
        if (o8 != null && o9 != null) {
            Pattern pattern = Y7;
            if (pattern.matcher(o8).matches() || pattern.matcher(o9).matches()) {
                try {
                    Date parse = q6.parse(o8 + ' ' + o9, new ParsePosition(0));
                    if (parse == null) {
                        return -1L;
                    }
                    return parse.getTime();
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return -1L;
    }

    public void z0(double d8) {
        String str = d8 >= p.f18289o ? "0" : "1";
        A0("GPSAltitude", new h(Math.abs(d8)).toString());
        A0("GPSAltitudeRef", str);
    }

    /* compiled from: ExifInterface.java */
    static class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f7988a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7989b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7990c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7991d;

        f(String str, int i5, int i6) {
            this.f7989b = str;
            this.f7988a = i5;
            this.f7990c = i6;
            this.f7991d = -1;
        }

        boolean a(int i5) {
            int i6;
            int i7 = this.f7990c;
            if (i7 == 7 || i5 == 7 || i7 == i5 || (i6 = this.f7991d) == i5) {
                return true;
            }
            if ((i7 == 4 || i6 == 4) && i5 == 3) {
                return true;
            }
            if ((i7 == 9 || i6 == 9) && i5 == 8) {
                return true;
            }
            return (i7 == 12 || i6 == 12) && i5 == 11;
        }

        f(String str, int i5, int i6, int i7) {
            this.f7989b = str;
            this.f7988a = i5;
            this.f7990c = i6;
            this.f7991d = i7;
        }
    }

    public a(@o0 String str) throws IOException {
        f[][] fVarArr = f7;
        this.f7954f = new HashMap[fVarArr.length];
        this.f7955g = new HashSet(fVarArr.length);
        this.f7956h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            U(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public a(@o0 FileDescriptor fileDescriptor) throws IOException {
        boolean z8;
        FileInputStream fileInputStream;
        Throwable th;
        f[][] fVarArr = f7;
        this.f7954f = new HashMap[fVarArr.length];
        this.f7955g = new HashSet(fVarArr.length);
        this.f7956h = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f7951c = null;
            this.f7949a = null;
            if (d0(fileDescriptor)) {
                this.f7950b = fileDescriptor;
                try {
                    fileDescriptor = Os.dup(fileDescriptor);
                    z8 = true;
                } catch (Exception e8) {
                    throw new IOException("Failed to duplicate file descriptor", e8);
                }
            } else {
                this.f7950b = null;
                z8 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    k0(fileInputStream);
                    d(fileInputStream);
                    if (z8) {
                        try {
                            Os.close(fileDescriptor);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    d(fileInputStream);
                    if (z8) {
                        try {
                            Os.close(fileDescriptor);
                        } catch (Exception unused2) {
                        }
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
        this(inputStream, false);
    }

    public a(@o0 InputStream inputStream, int i8) throws IOException {
        this(inputStream, i8 == 1);
    }

    private a(@o0 InputStream inputStream, boolean z8) throws IOException {
        f[][] fVarArr = f7;
        this.f7954f = new HashMap[fVarArr.length];
        this.f7955g = new HashSet(fVarArr.length);
        this.f7956h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f7949a = null;
            if (z8) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
                if (!V(bufferedInputStream)) {
                    return;
                }
                this.f7953e = true;
                this.f7951c = null;
                this.f7950b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f7951c = (AssetManager.AssetInputStream) inputStream;
                this.f7950b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (d0(fileInputStream.getFD())) {
                        this.f7951c = null;
                        this.f7950b = fileInputStream.getFD();
                    }
                }
                this.f7951c = null;
                this.f7950b = null;
            }
            k0(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
