package androidx.compose.material3;

import kotlin.Metadata;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* compiled from: ColorScheme.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001aø\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a´\u0002\u0010(\u001a\u00020%2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001aø\u0002\u0010*\u001a\u00020%2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b*\u0010'\u001a´\u0002\u0010+\u001a\u00020%2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010)\u001a\u001e\u0010-\u001a\u00020\u0000*\u00020%2\u0006\u0010,\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u001a\u0010/\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a&\u00103\u001a\u00020\u0000*\u00020%2\u0006\u0010,\u001a\u00020\u00002\u0006\u00102\u001a\u000201H\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a\u001e\u00105\u001a\u00020\u0000*\u00020%2\u0006\u00102\u001a\u000201H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a\u001b\u00109\u001a\u00020\u0000*\u00020%2\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b9\u0010:\" \u0010?\u001a\b\u0012\u0004\u0012\u00020%0;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010<\u001a\u0004\b=\u0010>\"\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020@0;8\u0006¢\u0006\f\n\u0004\b-\u0010<\u001a\u0004\bA\u0010>\"\u0014\u0010E\u001a\u00020C8\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010D\"\u0018\u00108\u001a\u00020\u0000*\u0002078AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006H"}, d2 = {"Landroidx/compose/ui/graphics/d2;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "surfaceDim", "Landroidx/compose/material3/a3;", "l", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/a3;", "n", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/a3;", "d", "f", "backgroundColor", "b", "(Landroidx/compose/material3/a3;J)J", "c", "(JLandroidx/compose/runtime/t;I)J", "Landroidx/compose/ui/unit/h;", "elevation", "a", "(Landroidx/compose/material3/a3;JFLandroidx/compose/runtime/t;I)J", "p", "(Landroidx/compose/material3/a3;F)J", "Lc0/h;", "value", "h", "(Landroidx/compose/material3/a3;Lc0/h;)J", "Landroidx/compose/runtime/a3;", "Landroidx/compose/runtime/a3;", "i", "()Landroidx/compose/runtime/a3;", "LocalColorScheme", "", "j", "LocalTonalElevationEnabled", "", "F", "DisabledAlpha", "k", "(Lc0/h;Landroidx/compose/runtime/t;I)J", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nColorScheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,947:1\n658#2:948\n646#2:949\n74#3:950\n74#3:951\n154#4:952\n*S KotlinDebug\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n*L\n824#1:948\n824#1:949\n825#1:950\n843#1:951\n863#1:952\n*E\n"})
/* loaded from: classes.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<a3> f9825a = androidx.compose.runtime.f0.f(a.f9828b);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<Boolean> f9826b = androidx.compose.runtime.f0.f(b.f9829b);

    /* renamed from: c, reason: collision with root package name */
    public static final float f9827c = 0.38f;

    /* compiled from: ColorScheme.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material3/a3;", "a", "()Landroidx/compose/material3/a3;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<a3> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f9828b = new a(0);

        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a3 invoke() {
            return b3.m(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null);
        }
    }

    /* compiled from: ColorScheme.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f9829b = new b(0);

        b() {
            super(0);
        }

        @fg.l
        public final Boolean a() {
            return Boolean.TRUE;
        }

        @Override // ld.a
        public Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* compiled from: ColorScheme.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9830a;

        static {
            int[] iArr = new int[c0.h.values().length];
            try {
                iArr[c0.h.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c0.h.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c0.h.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c0.h.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c0.h.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c0.h.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c0.h.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c0.h.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[c0.h.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[c0.h.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[c0.h.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[c0.h.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[c0.h.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[c0.h.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[c0.h.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[c0.h.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[c0.h.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[c0.h.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[c0.h.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[c0.h.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[c0.h.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[c0.h.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[c0.h.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[c0.h.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[c0.h.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[c0.h.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[c0.h.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[c0.h.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[c0.h.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[c0.h.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[c0.h.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[c0.h.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[c0.h.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[c0.h.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[c0.h.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[c0.h.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            f9830a = iArr;
        }
    }

    @androidx.compose.runtime.d3
    @androidx.compose.runtime.i
    public static final long a(@fg.l a3 a3Var, long j4, float f4, @fg.m androidx.compose.runtime.t tVar, int i4) {
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1610977682, i4, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:841)");
        }
        boolean booleanValue = ((Boolean) tVar.x(f9826b)).booleanValue();
        if (androidx.compose.ui.graphics.d2.y(j4, a3Var.getSurface()) && booleanValue) {
            j4 = p(a3Var, f4);
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        return j4;
    }

    @androidx.compose.runtime.x4
    public static final long b(@fg.l a3 a3Var, long j4) {
        if (androidx.compose.ui.graphics.d2.y(j4, a3Var.getPrimary())) {
            return a3Var.getOnPrimary();
        }
        if (kotlin.a2.o(j4, a3Var.getSecondary())) {
            return a3Var.getOnSecondary();
        }
        if (kotlin.a2.o(j4, a3Var.getTertiary())) {
            return a3Var.getOnTertiary();
        }
        if (kotlin.a2.o(j4, a3Var.getBackground())) {
            return a3Var.getOnBackground();
        }
        if (kotlin.a2.o(j4, a3Var.getError())) {
            return a3Var.getOnError();
        }
        if (kotlin.a2.o(j4, a3Var.getPrimaryContainer())) {
            return a3Var.getOnPrimaryContainer();
        }
        if (kotlin.a2.o(j4, a3Var.getSecondaryContainer())) {
            return a3Var.getOnSecondaryContainer();
        }
        if (kotlin.a2.o(j4, a3Var.getTertiaryContainer())) {
            return a3Var.getOnTertiaryContainer();
        }
        if (kotlin.a2.o(j4, a3Var.getErrorContainer())) {
            return a3Var.getOnErrorContainer();
        }
        if (kotlin.a2.o(j4, a3Var.getInverseSurface())) {
            return a3Var.getInverseOnSurface();
        }
        if (kotlin.a2.o(j4, a3Var.getSurface())) {
            return a3Var.getOnSurface();
        }
        if (kotlin.a2.o(j4, a3Var.getSurfaceVariant())) {
            return a3Var.getOnSurfaceVariant();
        }
        if (kotlin.a2.o(j4, a3Var.getSurfaceBright())) {
            return a3Var.getOnSurface();
        }
        if (kotlin.a2.o(j4, a3Var.getSurfaceContainer())) {
            return a3Var.getOnSurface();
        }
        if (kotlin.a2.o(j4, a3Var.getSurfaceContainerHigh())) {
            return a3Var.getOnSurface();
        }
        if (kotlin.a2.o(j4, a3Var.getSurfaceContainerHighest())) {
            return a3Var.getOnSurface();
        }
        if (kotlin.a2.o(j4, a3Var.getSurfaceContainerLow())) {
            return a3Var.getOnSurface();
        }
        if (kotlin.a2.o(j4, a3Var.getSurfaceContainerLowest())) {
            return a3Var.getOnSurface();
        }
        androidx.compose.ui.graphics.d2.INSTANCE.getClass();
        return androidx.compose.ui.graphics.d2.f17778o;
    }

    @androidx.compose.runtime.d3
    @androidx.compose.runtime.i
    public static final long c(long j4, @fg.m androidx.compose.runtime.t tVar, int i4) {
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(509589638, i4, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:823)");
        }
        long b5 = b(p6.f13227a.a(tVar, 6), j4);
        androidx.compose.ui.graphics.d2.INSTANCE.getClass();
        if (b5 == androidx.compose.ui.graphics.d2.f17778o) {
            b5 = ((androidx.compose.ui.graphics.d2) tVar.x(p3.a())).M();
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        return b5;
    }

    @fg.l
    public static final a3 d(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41) {
        return new a3(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j41, j36, j37, j38, j39, j40, null);
    }

    public static /* synthetic */ a3 e(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, int i4, int i5, Object obj) {
        long z4 = (i4 & 1) != 0 ? c0.f.f37219a.z() : j4;
        return d(z4, (i4 & 2) != 0 ? c0.f.f37219a.j() : j5, (i4 & 4) != 0 ? c0.f.f37219a.A() : j6, (i4 & 8) != 0 ? c0.f.f37219a.k() : j7, (i4 & 16) != 0 ? c0.f.f37219a.e() : j10, (i4 & 32) != 0 ? c0.f.f37219a.E() : j11, (i4 & 64) != 0 ? c0.f.f37219a.n() : j12, (i4 & 128) != 0 ? c0.f.f37219a.F() : j13, (i4 & 256) != 0 ? c0.f.f37219a.o() : j14, (i4 & 512) != 0 ? c0.f.f37219a.S() : j15, (i4 & 1024) != 0 ? c0.f.f37219a.t() : j16, (i4 & 2048) != 0 ? c0.f.f37219a.T() : j17, (i4 & 4096) != 0 ? c0.f.f37219a.u() : j18, (i4 & 8192) != 0 ? c0.f.f37219a.a() : j19, (i4 & 16384) != 0 ? c0.f.f37219a.g() : j20, (i4 & 32768) != 0 ? c0.f.f37219a.I() : j21, (i4 & 65536) != 0 ? c0.f.f37219a.r() : j22, (i4 & 131072) != 0 ? c0.f.f37219a.R() : j23, (i4 & 262144) != 0 ? c0.f.f37219a.s() : j24, (i4 & 524288) != 0 ? z4 : j25, (i4 & 1048576) != 0 ? c0.f.f37219a.f() : j26, (i4 & 2097152) != 0 ? c0.f.f37219a.d() : j27, (i4 & 4194304) != 0 ? c0.f.f37219a.b() : j28, (i4 & 8388608) != 0 ? c0.f.f37219a.h() : j29, (i4 & 16777216) != 0 ? c0.f.f37219a.c() : j30, (i4 & 33554432) != 0 ? c0.f.f37219a.i() : j31, (i4 & androidx.core.view.accessibility.b.f26943s) != 0 ? c0.f.f37219a.x() : j32, (i4 & 134217728) != 0 ? c0.f.f37219a.y() : j33, (i4 & ClientDefaults.MAX_MSG_SIZE) != 0 ? c0.f.f37219a.D() : j34, (i4 & 536870912) != 0 ? c0.f.f37219a.J() : j35, (i4 & 1073741824) != 0 ? c0.f.f37219a.K() : j36, (i4 & Integer.MIN_VALUE) != 0 ? c0.f.f37219a.L() : j37, (i5 & 1) != 0 ? c0.f.f37219a.M() : j38, (i5 & 2) != 0 ? c0.f.f37219a.N() : j39, (i5 & 4) != 0 ? c0.f.f37219a.O() : j40, (i5 & 8) != 0 ? c0.f.f37219a.P() : j41);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    public static final /* synthetic */ a3 f(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34) {
        return e(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    public static /* synthetic */ a3 g(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, int i4, Object obj) {
        long z4 = (i4 & 1) != 0 ? c0.f.f37219a.z() : j4;
        return f(z4, (i4 & 2) != 0 ? c0.f.f37219a.j() : j5, (i4 & 4) != 0 ? c0.f.f37219a.A() : j6, (i4 & 8) != 0 ? c0.f.f37219a.k() : j7, (i4 & 16) != 0 ? c0.f.f37219a.e() : j10, (i4 & 32) != 0 ? c0.f.f37219a.E() : j11, (i4 & 64) != 0 ? c0.f.f37219a.n() : j12, (i4 & 128) != 0 ? c0.f.f37219a.F() : j13, (i4 & 256) != 0 ? c0.f.f37219a.o() : j14, (i4 & 512) != 0 ? c0.f.f37219a.S() : j15, (i4 & 1024) != 0 ? c0.f.f37219a.t() : j16, (i4 & 2048) != 0 ? c0.f.f37219a.T() : j17, (i4 & 4096) != 0 ? c0.f.f37219a.u() : j18, (i4 & 8192) != 0 ? c0.f.f37219a.a() : j19, (i4 & 16384) != 0 ? c0.f.f37219a.g() : j20, (i4 & 32768) != 0 ? c0.f.f37219a.I() : j21, (i4 & 65536) != 0 ? c0.f.f37219a.r() : j22, (i4 & 131072) != 0 ? c0.f.f37219a.R() : j23, (i4 & 262144) != 0 ? c0.f.f37219a.s() : j24, (i4 & 524288) != 0 ? z4 : j25, (i4 & 1048576) != 0 ? c0.f.f37219a.f() : j26, (i4 & 2097152) != 0 ? c0.f.f37219a.d() : j27, (i4 & 4194304) != 0 ? c0.f.f37219a.b() : j28, (i4 & 8388608) != 0 ? c0.f.f37219a.h() : j29, (i4 & 16777216) != 0 ? c0.f.f37219a.c() : j30, (i4 & 33554432) != 0 ? c0.f.f37219a.i() : j31, (i4 & androidx.core.view.accessibility.b.f26943s) != 0 ? c0.f.f37219a.x() : j32, (i4 & 134217728) != 0 ? c0.f.f37219a.y() : j33, (i4 & ClientDefaults.MAX_MSG_SIZE) != 0 ? c0.f.f37219a.D() : j34);
    }

    @androidx.compose.runtime.x4
    public static final long h(@fg.l a3 a3Var, @fg.l c0.h hVar) {
        switch (c.f9830a[hVar.ordinal()]) {
            case 1:
                return a3Var.getBackground();
            case 2:
                return a3Var.getError();
            case 3:
                return a3Var.getErrorContainer();
            case 4:
                return a3Var.getInverseOnSurface();
            case 5:
                return a3Var.getInversePrimary();
            case 6:
                return a3Var.getInverseSurface();
            case 7:
                return a3Var.getOnBackground();
            case 8:
                return a3Var.getOnError();
            case 9:
                return a3Var.getOnErrorContainer();
            case 10:
                return a3Var.getOnPrimary();
            case 11:
                return a3Var.getOnPrimaryContainer();
            case 12:
                return a3Var.getOnSecondary();
            case 13:
                return a3Var.getOnSecondaryContainer();
            case 14:
                return a3Var.getOnSurface();
            case 15:
                return a3Var.getOnSurfaceVariant();
            case 16:
                return a3Var.getSurfaceTint();
            case 17:
                return a3Var.getOnTertiary();
            case 18:
                return a3Var.getOnTertiaryContainer();
            case 19:
                return a3Var.getOutline();
            case 20:
                return a3Var.getOutlineVariant();
            case 21:
                return a3Var.getPrimary();
            case 22:
                return a3Var.getPrimaryContainer();
            case 23:
                return a3Var.getScrim();
            case 24:
                return a3Var.getSecondary();
            case 25:
                return a3Var.getSecondaryContainer();
            case 26:
                return a3Var.getSurface();
            case 27:
                return a3Var.getSurfaceVariant();
            case 28:
                return a3Var.getSurfaceBright();
            case 29:
                return a3Var.getSurfaceContainer();
            case 30:
                return a3Var.getSurfaceContainerHigh();
            case 31:
                return a3Var.getSurfaceContainerHighest();
            case 32:
                return a3Var.getSurfaceContainerLow();
            case 33:
                return a3Var.getSurfaceContainerLowest();
            case 34:
                return a3Var.getSurfaceDim();
            case 35:
                return a3Var.getTertiary();
            case 36:
                return a3Var.getTertiaryContainer();
            default:
                androidx.compose.ui.graphics.d2.INSTANCE.getClass();
                return androidx.compose.ui.graphics.d2.f17778o;
        }
    }

    @fg.l
    public static final androidx.compose.runtime.a3<a3> i() {
        return f9825a;
    }

    @fg.l
    public static final androidx.compose.runtime.a3<Boolean> j() {
        return f9826b;
    }

    @androidx.compose.runtime.d3
    @androidx.compose.runtime.i
    @kd.i(name = "getValue")
    public static final long k(@fg.l c0.h hVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-810780884, i4, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:945)");
        }
        long h4 = h(p6.f13227a.a(tVar, 6), hVar);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        return h4;
    }

    @fg.l
    public static final a3 l(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41) {
        return new a3(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j41, j36, j37, j38, j39, j40, null);
    }

    public static /* synthetic */ a3 m(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, int i4, int i5, Object obj) {
        long z4 = (i4 & 1) != 0 ? c0.g.f37278a.z() : j4;
        return l(z4, (i4 & 2) != 0 ? c0.g.f37278a.j() : j5, (i4 & 4) != 0 ? c0.g.f37278a.A() : j6, (i4 & 8) != 0 ? c0.g.f37278a.k() : j7, (i4 & 16) != 0 ? c0.g.f37278a.e() : j10, (i4 & 32) != 0 ? c0.g.f37278a.E() : j11, (i4 & 64) != 0 ? c0.g.f37278a.n() : j12, (i4 & 128) != 0 ? c0.g.f37278a.F() : j13, (i4 & 256) != 0 ? c0.g.f37278a.o() : j14, (i4 & 512) != 0 ? c0.g.f37278a.S() : j15, (i4 & 1024) != 0 ? c0.g.f37278a.t() : j16, (i4 & 2048) != 0 ? c0.g.f37278a.T() : j17, (i4 & 4096) != 0 ? c0.g.f37278a.u() : j18, (i4 & 8192) != 0 ? c0.g.f37278a.a() : j19, (i4 & 16384) != 0 ? c0.g.f37278a.g() : j20, (i4 & 32768) != 0 ? c0.g.f37278a.I() : j21, (i4 & 65536) != 0 ? c0.g.f37278a.r() : j22, (i4 & 131072) != 0 ? c0.g.f37278a.R() : j23, (i4 & 262144) != 0 ? c0.g.f37278a.s() : j24, (i4 & 524288) != 0 ? z4 : j25, (i4 & 1048576) != 0 ? c0.g.f37278a.f() : j26, (i4 & 2097152) != 0 ? c0.g.f37278a.d() : j27, (i4 & 4194304) != 0 ? c0.g.f37278a.b() : j28, (i4 & 8388608) != 0 ? c0.g.f37278a.h() : j29, (i4 & 16777216) != 0 ? c0.g.f37278a.c() : j30, (i4 & 33554432) != 0 ? c0.g.f37278a.i() : j31, (i4 & androidx.core.view.accessibility.b.f26943s) != 0 ? c0.g.f37278a.x() : j32, (i4 & 134217728) != 0 ? c0.g.f37278a.y() : j33, (i4 & ClientDefaults.MAX_MSG_SIZE) != 0 ? c0.g.f37278a.D() : j34, (i4 & 536870912) != 0 ? c0.g.f37278a.J() : j35, (i4 & 1073741824) != 0 ? c0.g.f37278a.K() : j36, (i4 & Integer.MIN_VALUE) != 0 ? c0.g.f37278a.L() : j37, (i5 & 1) != 0 ? c0.g.f37278a.M() : j38, (i5 & 2) != 0 ? c0.g.f37278a.N() : j39, (i5 & 4) != 0 ? c0.g.f37278a.O() : j40, (i5 & 8) != 0 ? c0.g.f37278a.P() : j41);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    public static final /* synthetic */ a3 n(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34) {
        return m(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    public static /* synthetic */ a3 o(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, int i4, Object obj) {
        long z4 = (i4 & 1) != 0 ? c0.g.f37278a.z() : j4;
        return n(z4, (i4 & 2) != 0 ? c0.g.f37278a.j() : j5, (i4 & 4) != 0 ? c0.g.f37278a.A() : j6, (i4 & 8) != 0 ? c0.g.f37278a.k() : j7, (i4 & 16) != 0 ? c0.g.f37278a.e() : j10, (i4 & 32) != 0 ? c0.g.f37278a.E() : j11, (i4 & 64) != 0 ? c0.g.f37278a.n() : j12, (i4 & 128) != 0 ? c0.g.f37278a.F() : j13, (i4 & 256) != 0 ? c0.g.f37278a.o() : j14, (i4 & 512) != 0 ? c0.g.f37278a.S() : j15, (i4 & 1024) != 0 ? c0.g.f37278a.t() : j16, (i4 & 2048) != 0 ? c0.g.f37278a.T() : j17, (i4 & 4096) != 0 ? c0.g.f37278a.u() : j18, (i4 & 8192) != 0 ? c0.g.f37278a.a() : j19, (i4 & 16384) != 0 ? c0.g.f37278a.g() : j20, (i4 & 32768) != 0 ? c0.g.f37278a.I() : j21, (i4 & 65536) != 0 ? c0.g.f37278a.r() : j22, (i4 & 131072) != 0 ? c0.g.f37278a.R() : j23, (i4 & 262144) != 0 ? c0.g.f37278a.s() : j24, (i4 & 524288) != 0 ? z4 : j25, (i4 & 1048576) != 0 ? c0.g.f37278a.f() : j26, (i4 & 2097152) != 0 ? c0.g.f37278a.d() : j27, (i4 & 4194304) != 0 ? c0.g.f37278a.b() : j28, (i4 & 8388608) != 0 ? c0.g.f37278a.h() : j29, (i4 & 16777216) != 0 ? c0.g.f37278a.c() : j30, (i4 & 33554432) != 0 ? c0.g.f37278a.i() : j31, (i4 & androidx.core.view.accessibility.b.f26943s) != 0 ? c0.g.f37278a.x() : j32, (i4 & 134217728) != 0 ? c0.g.f37278a.y() : j33, (i4 & ClientDefaults.MAX_MSG_SIZE) != 0 ? c0.g.f37278a.D() : j34);
    }

    @androidx.compose.runtime.x4
    public static final long p(@fg.l a3 a3Var, float f4) {
        if (androidx.compose.ui.unit.h.l(f4, androidx.compose.ui.unit.h.g(0))) {
            return a3Var.getSurface();
        }
        return androidx.compose.ui.graphics.f2.h(androidx.compose.ui.graphics.d2.w(a3Var.getSurfaceTint(), ((((float) Math.log(f4 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), a3Var.getSurface());
    }
}
