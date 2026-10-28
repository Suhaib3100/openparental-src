package androidx.compose.ui.graphics.colorspace;

import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.e1;
import androidx.compose.material3.f4;
import androidx.compose.ui.graphics.f2;
import androidx.compose.ui.graphics.x4;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: Rgb.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b&\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b*\u0018\u0000 62\u00020\u0001:\u0001FB]\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014BE\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0013\u0010\u0018B]\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0019B%\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u001bB-\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u001cB1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u001dB%\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u0013\u0010\u001fB-\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u0013\u0010 BA\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010!B!\b\u0010\u0012\u0006\u0010\"\u001a\u00020\u0000\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0007¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010%J\u0019\u0010(\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b*\u0010)J\u0019\u0010,\u001a\u00020\u00042\b\b\u0001\u0010+\u001a\u00020\u0004H\u0007¢\u0006\u0004\b,\u0010)J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0011H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0011H\u0016¢\u0006\u0004\b0\u0010/J'\u00104\u001a\u00020\u00042\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\fH\u0007¢\u0006\u0004\b4\u00105J\u0019\u00107\u001a\u00020\u00042\b\b\u0001\u00106\u001a\u00020\u0004H\u0007¢\u0006\u0004\b7\u0010)J'\u00108\u001a\u00020\u00042\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\fH\u0007¢\u0006\u0004\b8\u00105J\u0019\u00109\u001a\u00020\u00042\b\b\u0001\u00106\u001a\u00020\u0004H\u0007¢\u0006\u0004\b9\u0010)J\u0017\u0010:\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u0004H\u0016¢\u0006\u0004\b:\u0010)J'\u0010?\u001a\u00020>2\u0006\u0010;\u001a\u00020\f2\u0006\u0010<\u001a\u00020\f2\u0006\u0010=\u001a\u00020\fH\u0010¢\u0006\u0004\b?\u0010@J'\u0010A\u001a\u00020\f2\u0006\u0010;\u001a\u00020\f2\u0006\u0010<\u001a\u00020\f2\u0006\u0010=\u001a\u00020\fH\u0010¢\u0006\u0004\bA\u0010BJ=\u0010H\u001a\u00020G2\u0006\u0010C\u001a\u00020\f2\u0006\u0010D\u001a\u00020\f2\u0006\u0010E\u001a\u00020\f2\u0006\u0010F\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010IJ\u0017\u00103\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u0010)J\u001a\u0010M\u001a\u00020L2\b\u0010K\u001a\u0004\u0018\u00010JH\u0096\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0011H\u0016¢\u0006\u0004\bO\u0010PR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b2\u0010Q\u001a\u0004\bR\u0010SR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010UR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010[\u001a\u0004\b\\\u0010%R\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010[\u001a\u0004\b^\u0010%R\u001a\u0010+\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010[\u001a\u0004\b_\u0010%R\u001a\u0010c\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010`\u001a\u0004\ba\u0010bR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\bH\u0010d\u001a\u0004\be\u0010fR\u001a\u0010i\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010`\u001a\u0004\bh\u0010bR\u001a\u0010l\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bj\u0010`\u001a\u0004\bk\u0010bR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b1\u0010d\u001a\u0004\bm\u0010fR\u001a\u0010p\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bn\u0010`\u001a\u0004\bo\u0010bR\u001a\u0010s\u001a\u00020L8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bq\u0010h\u001a\u0004\bW\u0010rR\u001a\u0010u\u001a\u00020L8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bt\u0010h\u001a\u0004\bV\u0010r\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006v"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/a0;", "Landroidx/compose/ui/graphics/colorspace/c;", "", "name", "", "primaries", "Landroidx/compose/ui/graphics/colorspace/e0;", "whitePoint", "transform", "Landroidx/compose/ui/graphics/colorspace/i;", "oetf", "eotf", "", "min", "max", "Landroidx/compose/ui/graphics/colorspace/d0;", "transferParameters", "", "id", "<init>", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/e0;[FLandroidx/compose/ui/graphics/colorspace/i;Landroidx/compose/ui/graphics/colorspace/i;FFLandroidx/compose/ui/graphics/colorspace/d0;I)V", "toXYZ", "Lkotlin/Function1;", "", "(Ljava/lang/String;[FLld/l;Lld/l;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/e0;Lld/l;Lld/l;FF)V", "function", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/d0;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/e0;Landroidx/compose/ui/graphics/colorspace/d0;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/e0;Landroidx/compose/ui/graphics/colorspace/d0;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/e0;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/e0;DFFI)V", "colorSpace", "(Landroidx/compose/ui/graphics/colorspace/a0;[FLandroidx/compose/ui/graphics/colorspace/e0;)V", "b0", "()[F", "f0", "V", "c0", "([F)[F", "g0", "inverseTransform", "W", "component", "f", "(I)F", "e", "r", "g", "b", "k0", "(FFF)[F", "v", "l0", "Q", "R", "m", "v0", "v1", "v2", "", "k", "(FFF)J", "n", "(FFF)F", "x", "y", "z", "a", "Landroidx/compose/ui/graphics/d2;", "o", "(FFFFLandroidx/compose/ui/graphics/colorspace/c;)J", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/graphics/colorspace/e0;", "i0", "()Landroidx/compose/ui/graphics/colorspace/e0;", "h", "F", "i", "j", "Landroidx/compose/ui/graphics/colorspace/d0;", "e0", "()Landroidx/compose/ui/graphics/colorspace/d0;", "[F", "d0", "l", "h0", "X", "Landroidx/compose/ui/graphics/colorspace/i;", "a0", "()Landroidx/compose/ui/graphics/colorspace/i;", "oetfOrig", "Lld/l;", "Y", "()Lld/l;", "p", "Z", "oetfFunc", "q", "U", "eotfOrig", "S", "s", "T", "eotfFunc", "t", "()Z", "isWideGamut", "u", "isSrgb", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1386:1\n25#2,3:1387\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n*L\n904#1:1387,3\n*E\n"})
/* loaded from: classes.dex */
public final class a0 extends androidx.compose.ui.graphics.colorspace.c {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: w, reason: collision with root package name */
    @fg.l
    private static final i f17650w = new s();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e0 whitePoint;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float min;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float max;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final d0 transferParameters;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final float[] primaries;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final float[] transform;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final float[] inverseTransform;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i oetfOrig;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<Double, Double> oetf;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i oetfFunc;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i eotfOrig;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<Double, Double> eotf;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i eotfFunc;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean isWideGamut;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final boolean isSrgb;

    /* compiled from: Rgb.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001e\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010!\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004H\u0000¢\u0006\u0004\b.\u0010+R\u0014\u0010/\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/a0$a;", "", "<init>", "()V", "", "primaries", "Landroidx/compose/ui/graphics/colorspace/e0;", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/i;", "OETF", "EOTF", "", "min", "max", "", "id", "", "m", "([FLandroidx/compose/ui/graphics/colorspace/e0;Landroidx/compose/ui/graphics/colorspace/i;Landroidx/compose/ui/graphics/colorspace/i;FFI)Z", "", "point", "a", "b", "g", "(DLandroidx/compose/ui/graphics/colorspace/i;Landroidx/compose/ui/graphics/colorspace/i;)Z", "n", "([FFF)Z", "f", "([F)F", "ax", "ay", "bx", "by", "l", "(FFFF)F", "p1", "p2", "k", "([F[F)Z", "toXYZ", "i", "([F)Landroidx/compose/ui/graphics/colorspace/e0;", "o", "([F)[F", "j", "([FLandroidx/compose/ui/graphics/colorspace/e0;)[F", "h", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/i;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.colorspace.a0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final float f(float[] primaries) {
            float f4 = primaries[0];
            float f5 = primaries[1];
            float f6 = primaries[2];
            float f7 = primaries[3];
            float f10 = primaries[4];
            float f11 = primaries[5];
            float a5 = x4.a(f4, f11, (((f6 * f11) + ((f5 * f10) + (f4 * f7))) - (f7 * f10)) - (f5 * f6), 0.5f);
            return a5 < 0.0f ? -a5 : a5;
        }

        private final boolean g(double point, i a5, i b5) {
            return Math.abs(a5.a(point) - b5.a(point)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final e0 i(float[] toXYZ) {
            float[] o4 = d.o(toXYZ, new float[]{1.0f, 1.0f, 1.0f});
            float f4 = o4[0];
            float f5 = o4[1];
            float f6 = f4 + f5 + o4[2];
            return new e0(f4 / f6, f5 / f6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] j(float[] primaries, e0 whitePoint) {
            float f4 = primaries[0];
            float f5 = primaries[1];
            float f6 = primaries[2];
            float f7 = primaries[3];
            float f10 = primaries[4];
            float f11 = primaries[5];
            float e4 = whitePoint.e();
            float f12 = whitePoint.f();
            float f13 = 1;
            float f14 = (f13 - f4) / f5;
            float f15 = (f13 - f6) / f7;
            float f16 = (f13 - f10) / f11;
            float f17 = (f13 - e4) / f12;
            float f18 = f4 / f5;
            float f19 = e4 / f12;
            float f20 = (f6 / f7) - f18;
            float f21 = f19 - f18;
            float f22 = f15 - f14;
            float f23 = ((f17 - f14) * f20) - (f21 * f22);
            float f24 = (f16 - f14) * f20;
            float f25 = (f10 / f11) - f18;
            float f26 = f23 / (f24 - (f22 * f25));
            float a5 = f4.a(f26, f25, f21, f20);
            float f27 = (1.0f - a5) - f26;
            float f28 = f27 / f5;
            float f29 = a5 / f7;
            float f30 = f26 / f11;
            return new float[]{f28 * f4, f27, ((1.0f - f4) - f5) * f28, f29 * f6, a5, ((1.0f - f6) - f7) * f29, f30 * f10, f26, ((1.0f - f10) - f11) * f30};
        }

        private final boolean k(float[] p12, float[] p22) {
            float f4 = p12[0];
            float f5 = p22[0];
            float f6 = p12[1];
            float f7 = p22[1];
            float f10 = p12[2] - p22[2];
            float f11 = p12[3] - p22[3];
            float f12 = p12[4];
            float f13 = p22[4];
            float f14 = p12[5];
            float f15 = p22[5];
            float[] fArr = {f4 - f5, f6 - f7, f10, f11, f12 - f13, f14 - f15};
            return l(fArr[0], fArr[1], f5 - f13, f7 - f15) >= 0.0f && l(p22[0] - p22[2], p22[1] - p22[3], fArr[0], fArr[1]) >= 0.0f && l(fArr[2], fArr[3], p22[2] - p22[0], p22[3] - p22[1]) >= 0.0f && l(p22[2] - p22[4], p22[3] - p22[5], fArr[2], fArr[3]) >= 0.0f && l(fArr[4], fArr[5], p22[4] - p22[2], p22[5] - p22[3]) >= 0.0f && l(p22[4] - p22[0], p22[5] - p22[1], fArr[4], fArr[5]) >= 0.0f;
        }

        private final float l(float ax, float ay, float bx, float by) {
            return (ax * by) - (ay * bx);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m(float[] primaries, e0 whitePoint, i OETF, i EOTF, float min, float max, int id2) {
            if (id2 == 0) {
                return true;
            }
            g gVar = g.f17689a;
            if (!d.i(primaries, gVar.y()) || !d.h(whitePoint, j.f17726a.h()) || min != 0.0f || max != 1.0f) {
                return false;
            }
            a0 x4 = gVar.x();
            for (double d5 = com.google.firebase.remoteconfig.p.f60679p; d5 <= 1.0d; d5 += 0.00392156862745098d) {
                if (!g(d5, OETF, x4.getOetfOrig()) || !g(d5, EOTF, x4.getEotfOrig())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean n(float[] primaries, float min, float max) {
            float f4 = f(primaries);
            g gVar = g.f17689a;
            return (f4 / f(gVar.t()) > 0.9f && k(primaries, gVar.y())) || (min < 0.0f && max > 1.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] o(float[] primaries) {
            float[] fArr = new float[6];
            if (primaries.length == 9) {
                float f4 = primaries[0];
                float f5 = primaries[1];
                float f6 = f4 + f5 + primaries[2];
                fArr[0] = f4 / f6;
                fArr[1] = f5 / f6;
                float f7 = primaries[3];
                float f10 = primaries[4];
                float f11 = f7 + f10 + primaries[5];
                fArr[2] = f7 / f11;
                fArr[3] = f10 / f11;
                float f12 = primaries[6];
                float f13 = primaries[7];
                float f14 = f12 + f13 + primaries[8];
                fArr[4] = f12 / f14;
                fArr[5] = f13 / f14;
            } else {
                kotlin.collections.l.H0(primaries, fArr, 0, 0, 6, 6, null);
            }
            return fArr;
        }

        @fg.l
        public final float[] h(@fg.l float[] toXYZ) {
            float[] o4 = d.o(toXYZ, new float[]{1.0f, 0.0f, 0.0f});
            float[] o5 = d.o(toXYZ, new float[]{0.0f, 1.0f, 0.0f});
            float[] o6 = d.o(toXYZ, new float[]{0.0f, 0.0f, 1.0f});
            float f4 = o4[0];
            float f5 = o4[1];
            float f6 = f4 + f5 + o4[2];
            float f7 = o5[0];
            float f10 = o5[1];
            float f11 = f7 + f10 + o5[2];
            float f12 = o6[0];
            float f13 = o6[1];
            float f14 = f12 + f13 + o6[2];
            return new float[]{f4 / f6, f5 / f6, f7 / f11, f10 / f11, f12 / f14, f13 / f14};
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: Rgb.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "x", "a", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<Double, Double> {
        b() {
            super(1);
        }

        @fg.l
        public final Double a(double d5) {
            return Double.valueOf(a0.this.getEotfOrig().a(kotlin.ranges.s.G(d5, a0.this.min, a0.this.max)));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Double invoke(Double d5) {
            return a(d5.doubleValue());
        }
    }

    /* compiled from: Rgb.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "x", "a", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.l<Double, Double> {
        c() {
            super(1);
        }

        @fg.l
        public final Double a(double d5) {
            return Double.valueOf(kotlin.ranges.s.G(a0.this.getOetfOrig().a(d5), a0.this.min, a0.this.max));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Double invoke(Double d5) {
            return a(d5.doubleValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@fg.l String str, @fg.l float[] fArr, @fg.l e0 e0Var, @fg.m float[] fArr2, @fg.l i iVar, @fg.l i iVar2, float f4, float f5, @fg.m d0 d0Var, int i4) {
        super(str, androidx.compose.ui.graphics.colorspace.b.f17669c, i4, null);
        androidx.compose.ui.graphics.colorspace.b.INSTANCE.getClass();
        this.whitePoint = e0Var;
        this.min = f4;
        this.max = f5;
        this.transferParameters = d0Var;
        this.oetfOrig = iVar;
        this.oetf = new c();
        this.oetfFunc = new i() { // from class: androidx.compose.ui.graphics.colorspace.n
            @Override // androidx.compose.ui.graphics.colorspace.i
            public final double a(double d5) {
                double j02;
                j02 = a0.j0(a0.this, d5);
                return j02;
            }
        };
        this.eotfOrig = iVar2;
        this.eotf = new b();
        this.eotfFunc = new i() { // from class: androidx.compose.ui.graphics.colorspace.r
            @Override // androidx.compose.ui.graphics.colorspace.i
            public final double a(double d5) {
                double P;
                P = a0.P(a0.this, d5);
                return P;
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f4 >= f5) {
            throw new IllegalArgumentException("Invalid range: min=" + f4 + ", max=" + f5 + "; min must be strictly < max");
        }
        Companion companion = INSTANCE;
        float[] o4 = companion.o(fArr);
        this.primaries = o4;
        if (fArr2 == null) {
            this.transform = companion.j(o4, e0Var);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.transform = fArr2;
        }
        this.inverseTransform = d.l(this.transform);
        this.isWideGamut = companion.n(o4, f4, f5);
        this.isSrgb = companion.m(o4, e0Var, iVar, iVar2, f4, f5, i4);
    }

    private static final double C(double d5) {
        return d5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double D(double d5, double d6) {
        if (d6 < com.google.firebase.remoteconfig.p.f60679p) {
            d6 = 0.0d;
        }
        return Math.pow(d6, 1.0d / d5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double E(double d5, double d6) {
        if (d6 < com.google.firebase.remoteconfig.p.f60679p) {
            d6 = 0.0d;
        }
        return Math.pow(d6, d5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double F(ld.l lVar, double d5) {
        return ((Number) lVar.invoke(Double.valueOf(d5))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double G(ld.l lVar, double d5) {
        return ((Number) lVar.invoke(Double.valueOf(d5))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double H(ld.l lVar, double d5) {
        return ((Number) lVar.invoke(Double.valueOf(d5))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double I(ld.l lVar, double d5) {
        return ((Number) lVar.invoke(Double.valueOf(d5))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double J(d0 d0Var, double d5) {
        return d.s(d5, d0Var.j(), d0Var.k(), d0Var.l(), d0Var.m(), d0Var.p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double K(d0 d0Var, double d5) {
        return d.t(d5, d0Var.j(), d0Var.k(), d0Var.l(), d0Var.m(), d0Var.n(), d0Var.o(), d0Var.p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double L(d0 d0Var, double d5) {
        return d.u(d5, d0Var.j(), d0Var.k(), d0Var.l(), d0Var.m(), d0Var.p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double M(d0 d0Var, double d5) {
        return d.v(d5, d0Var.j(), d0Var.k(), d0Var.l(), d0Var.m(), d0Var.n(), d0Var.o(), d0Var.p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double P(a0 a0Var, double d5) {
        return a0Var.eotfOrig.a(kotlin.ranges.s.G(d5, a0Var.min, a0Var.max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double j0(a0 a0Var, double d5) {
        return kotlin.ranges.s.G(a0Var.oetfOrig.a(d5), a0Var.min, a0Var.max);
    }

    public static double w(double d5) {
        return d5;
    }

    @e1(MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    @fg.l
    public final float[] Q(float r4, float g4, float b5) {
        return R(new float[]{r4, g4, b5});
    }

    @e1(min = MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    @fg.l
    public final float[] R(@e1(min = 3) @fg.l float[] v4) {
        v4[0] = (float) this.oetfFunc.a(v4[0]);
        v4[1] = (float) this.oetfFunc.a(v4[1]);
        v4[2] = (float) this.oetfFunc.a(v4[2]);
        return v4;
    }

    @fg.l
    public final ld.l<Double, Double> S() {
        return this.eotf;
    }

    @fg.l
    /* renamed from: T, reason: from getter */
    public final i getEotfFunc() {
        return this.eotfFunc;
    }

    @fg.l
    /* renamed from: U, reason: from getter */
    public final i getEotfOrig() {
        return this.eotfOrig;
    }

    @e1(9)
    @fg.l
    public final float[] V() {
        float[] fArr = this.inverseTransform;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @e1(min = 9)
    @fg.l
    public final float[] W(@e1(min = 9) @fg.l float[] inverseTransform) {
        return kotlin.collections.l.H0(this.inverseTransform, inverseTransform, 0, 0, 0, 14, null);
    }

    @fg.l
    /* renamed from: X, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    @fg.l
    public final ld.l<Double, Double> Y() {
        return this.oetf;
    }

    @fg.l
    /* renamed from: Z, reason: from getter */
    public final i getOetfFunc() {
        return this.oetfFunc;
    }

    @fg.l
    /* renamed from: a0, reason: from getter */
    public final i getOetfOrig() {
        return this.oetfOrig;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @fg.l
    public float[] b(@fg.l float[] v4) {
        d.o(this.inverseTransform, v4);
        v4[0] = (float) this.oetfFunc.a(v4[0]);
        v4[1] = (float) this.oetfFunc.a(v4[1]);
        v4[2] = (float) this.oetfFunc.a(v4[2]);
        return v4;
    }

    @e1(MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS)
    @fg.l
    public final float[] b0() {
        float[] fArr = this.primaries;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @e1(min = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS)
    @fg.l
    public final float[] c0(@e1(min = 6) @fg.l float[] primaries) {
        return kotlin.collections.l.H0(this.primaries, primaries, 0, 0, 0, 14, null);
    }

    @fg.l
    /* renamed from: d0, reason: from getter */
    public final float[] getPrimaries() {
        return this.primaries;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float e(int component) {
        return this.max;
    }

    @fg.m
    /* renamed from: e0, reason: from getter */
    public final d0 getTransferParameters() {
        return this.transferParameters;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || a0.class != other.getClass() || !super.equals(other)) {
            return false;
        }
        a0 a0Var = (a0) other;
        if (Float.compare(a0Var.min, this.min) != 0 || Float.compare(a0Var.max, this.max) != 0 || !l0.g(this.whitePoint, a0Var.whitePoint) || !Arrays.equals(this.primaries, a0Var.primaries)) {
            return false;
        }
        d0 d0Var = this.transferParameters;
        if (d0Var != null) {
            return l0.g(d0Var, a0Var.transferParameters);
        }
        if (a0Var.transferParameters == null) {
            return true;
        }
        if (l0.g(this.oetfOrig, a0Var.oetfOrig)) {
            return l0.g(this.eotfOrig, a0Var.eotfOrig);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float f(int component) {
        return this.min;
    }

    @e1(9)
    @fg.l
    public final float[] f0() {
        float[] fArr = this.transform;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @e1(min = 9)
    @fg.l
    public final float[] g0(@e1(min = 9) @fg.l float[] transform) {
        return kotlin.collections.l.H0(this.transform, transform, 0, 0, 0, 14, null);
    }

    @fg.l
    /* renamed from: h0, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public int hashCode() {
        int hashCode = (Arrays.hashCode(this.primaries) + ((this.whitePoint.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f4 = this.min;
        int floatToIntBits = (hashCode + (f4 == 0.0f ? 0 : Float.floatToIntBits(f4))) * 31;
        float f5 = this.max;
        int floatToIntBits2 = (floatToIntBits + (f5 == 0.0f ? 0 : Float.floatToIntBits(f5))) * 31;
        d0 d0Var = this.transferParameters;
        int hashCode2 = floatToIntBits2 + (d0Var != null ? d0Var.hashCode() : 0);
        if (this.transferParameters == null) {
            return this.eotfOrig.hashCode() + ((this.oetfOrig.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    /* renamed from: i, reason: from getter */
    public boolean getIsSrgb() {
        return this.isSrgb;
    }

    @fg.l
    /* renamed from: i0, reason: from getter */
    public final e0 getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    /* renamed from: j, reason: from getter */
    public boolean getIsWideGamut() {
        return this.isWideGamut;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long k(float v02, float v12, float v22) {
        float a5 = (float) this.eotfFunc.a(v02);
        float a6 = (float) this.eotfFunc.a(v12);
        float a7 = (float) this.eotfFunc.a(v22);
        float p4 = d.p(this.transform, a5, a6, a7);
        float q4 = d.q(this.transform, a5, a6, a7);
        return (Float.floatToRawIntBits(p4) << 32) | (Float.floatToRawIntBits(q4) & 4294967295L);
    }

    @e1(MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    @fg.l
    public final float[] k0(float r4, float g4, float b5) {
        return l0(new float[]{r4, g4, b5});
    }

    @e1(min = MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    @fg.l
    public final float[] l0(@e1(min = 3) @fg.l float[] v4) {
        v4[0] = (float) this.eotfFunc.a(v4[0]);
        v4[1] = (float) this.eotfFunc.a(v4[1]);
        v4[2] = (float) this.eotfFunc.a(v4[2]);
        return v4;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @fg.l
    public float[] m(@fg.l float[] v4) {
        v4[0] = (float) this.eotfFunc.a(v4[0]);
        v4[1] = (float) this.eotfFunc.a(v4[1]);
        v4[2] = (float) this.eotfFunc.a(v4[2]);
        return d.o(this.transform, v4);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float n(float v02, float v12, float v22) {
        return d.r(this.transform, (float) this.eotfFunc.a(v02), (float) this.eotfFunc.a(v12), (float) this.eotfFunc.a(v22));
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long o(float x4, float y4, float z4, float a5, @fg.l androidx.compose.ui.graphics.colorspace.c colorSpace) {
        return f2.a((float) this.oetfFunc.a(d.p(this.inverseTransform, x4, y4, z4)), (float) this.oetfFunc.a(d.q(this.inverseTransform, x4, y4, z4)), (float) this.oetfFunc.a(d.r(this.inverseTransform, x4, y4, z4)), a5, colorSpace);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0(@androidx.annotation.e1(min = 1) @fg.l java.lang.String r14, @androidx.annotation.e1(9) @fg.l float[] r15, @fg.l final ld.l<? super java.lang.Double, java.lang.Double> r16, @fg.l final ld.l<? super java.lang.Double, java.lang.Double> r17) {
        /*
            r13 = this;
            r0 = r15
            androidx.compose.ui.graphics.colorspace.a0$a r1 = androidx.compose.ui.graphics.colorspace.a0.INSTANCE
            float[] r4 = r1.h(r15)
            androidx.compose.ui.graphics.colorspace.e0 r5 = androidx.compose.ui.graphics.colorspace.a0.Companion.a(r1, r15)
            androidx.compose.ui.graphics.colorspace.t r7 = new androidx.compose.ui.graphics.colorspace.t
            r0 = r16
            r7.<init>()
            androidx.compose.ui.graphics.colorspace.u r8 = new androidx.compose.ui.graphics.colorspace.u
            r0 = r17
            r8.<init>()
            r11 = 0
            r12 = -1
            r6 = 0
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r2 = r13
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.a0.<init>(java.lang.String, float[], ld.l, ld.l):void");
    }

    public a0(@e1(min = 1) @fg.l String str, @e1(max = 9, min = 6) @fg.l float[] fArr, @fg.l e0 e0Var, @fg.l final ld.l<? super Double, Double> lVar, @fg.l final ld.l<? super Double, Double> lVar2, float f4, float f5) {
        this(str, fArr, e0Var, null, new i() { // from class: androidx.compose.ui.graphics.colorspace.x
            @Override // androidx.compose.ui.graphics.colorspace.i
            public final double a(double d5) {
                double H;
                H = a0.H(ld.l.this, d5);
                return H;
            }
        }, new i() { // from class: androidx.compose.ui.graphics.colorspace.y
            @Override // androidx.compose.ui.graphics.colorspace.i
            public final double a(double d5) {
                double I;
                I = a0.I(ld.l.this, d5);
                return I;
            }
        }, f4, f5, null, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0(@androidx.annotation.e1(min = 1) @fg.l java.lang.String r8, @androidx.annotation.e1(9) @fg.l float[] r9, @fg.l androidx.compose.ui.graphics.colorspace.d0 r10) {
        /*
            r7 = this;
            androidx.compose.ui.graphics.colorspace.a0$a r0 = androidx.compose.ui.graphics.colorspace.a0.INSTANCE
            float[] r3 = r0.h(r9)
            androidx.compose.ui.graphics.colorspace.e0 r4 = androidx.compose.ui.graphics.colorspace.a0.Companion.a(r0, r9)
            r6 = -1
            r1 = r7
            r2 = r8
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.a0.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.d0):void");
    }

    public a0(@e1(min = 1) @fg.l String str, @e1(max = 9, min = 6) @fg.l float[] fArr, @fg.l e0 e0Var, @fg.l d0 d0Var) {
        this(str, fArr, e0Var, d0Var, -1);
    }

    public a0(@fg.l String str, @fg.l float[] fArr, @fg.l e0 e0Var, @fg.l final d0 d0Var, int i4) {
        this(str, fArr, e0Var, null, (d0Var.n() == com.google.firebase.remoteconfig.p.f60679p && d0Var.o() == com.google.firebase.remoteconfig.p.f60679p) ? new i() { // from class: androidx.compose.ui.graphics.colorspace.z
            @Override // androidx.compose.ui.graphics.colorspace.i
            public final double a(double d5) {
                double J;
                J = a0.J(d0.this, d5);
                return J;
            }
        } : new i() { // from class: androidx.compose.ui.graphics.colorspace.o
            @Override // androidx.compose.ui.graphics.colorspace.i
            public final double a(double d5) {
                double K;
                K = a0.K(d0.this, d5);
                return K;
            }
        }, (d0Var.n() == com.google.firebase.remoteconfig.p.f60679p && d0Var.o() == com.google.firebase.remoteconfig.p.f60679p) ? new i() { // from class: androidx.compose.ui.graphics.colorspace.p
            @Override // androidx.compose.ui.graphics.colorspace.i
            public final double a(double d5) {
                double L;
                L = a0.L(d0.this, d5);
                return L;
            }
        } : new i() { // from class: androidx.compose.ui.graphics.colorspace.q
            @Override // androidx.compose.ui.graphics.colorspace.i
            public final double a(double d5) {
                double M;
                M = a0.M(d0.this, d5);
                return M;
            }
        }, 0.0f, 1.0f, d0Var, i4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0(@androidx.annotation.e1(min = 1) @fg.l java.lang.String r11, @androidx.annotation.e1(9) @fg.l float[] r12, double r13) {
        /*
            r10 = this;
            androidx.compose.ui.graphics.colorspace.a0$a r0 = androidx.compose.ui.graphics.colorspace.a0.INSTANCE
            float[] r3 = r0.h(r12)
            androidx.compose.ui.graphics.colorspace.e0 r4 = androidx.compose.ui.graphics.colorspace.a0.Companion.a(r0, r12)
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = -1
            r7 = 0
            r1 = r10
            r2 = r11
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.a0.<init>(java.lang.String, float[], double):void");
    }

    public a0(@e1(min = 1) @fg.l String str, @e1(max = 9, min = 6) @fg.l float[] fArr, @fg.l e0 e0Var, double d5) {
        this(str, fArr, e0Var, d5, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0(@fg.l java.lang.String r21, @fg.l float[] r22, @fg.l androidx.compose.ui.graphics.colorspace.e0 r23, final double r24, float r26, float r27, int r28) {
        /*
            r20 = this;
            r1 = r24
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto Ld
            androidx.compose.ui.graphics.colorspace.i r3 = androidx.compose.ui.graphics.colorspace.a0.f17650w
        La:
            r17 = r3
            goto L13
        Ld:
            androidx.compose.ui.graphics.colorspace.v r3 = new androidx.compose.ui.graphics.colorspace.v
            r3.<init>()
            goto La
        L13:
            if (r0 != 0) goto L1a
            androidx.compose.ui.graphics.colorspace.i r0 = androidx.compose.ui.graphics.colorspace.a0.f17650w
        L17:
            r18 = r0
            goto L20
        L1a:
            androidx.compose.ui.graphics.colorspace.w r0 = new androidx.compose.ui.graphics.colorspace.w
            r0.<init>()
            goto L17
        L20:
            androidx.compose.ui.graphics.colorspace.d0 r19 = new androidx.compose.ui.graphics.colorspace.d0
            r0 = r19
            r15 = 96
            r16 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r1 = r24
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r8 = 0
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r9 = r17
            r10 = r18
            r11 = r26
            r12 = r27
            r13 = r19
            r14 = r28
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.a0.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.e0, double, float, float, int):void");
    }

    public a0(@fg.l a0 a0Var, @fg.l float[] fArr, @fg.l e0 e0Var) {
        this(a0Var.getName(), a0Var.primaries, e0Var, fArr, a0Var.oetfOrig, a0Var.eotfOrig, a0Var.min, a0Var.max, a0Var.transferParameters, -1);
    }
}
