package androidx.compose.material3;

import com.tencent.rtmp.TXLiveConstants;
import kotlin.Metadata;

/* compiled from: SearchBar.android.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u009e\u0001\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u008a\u0001\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u00020!8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010)\u001a\u00020!8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R&\u0010+\u001a\u00020!8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b*\u0010#\u0012\u0004\b*\u0010\u0003\u001a\u0004\b'\u0010%R\u001d\u0010.\u001a\u00020!8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%R\u0011\u00102\u001a\u00020/8G¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00103\u001a\u00020/8G¢\u0006\u0006\u001a\u0004\b,\u00101R\u0011\u00104\u001a\u00020/8G¢\u0006\u0006\u001a\u0004\b\"\u00101R\u0011\u00108\u001a\u0002058G¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/material3/k8;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/d2;", "containerColor", "dividerColor", "Landroidx/compose/material3/pa;", "inputFieldColors", "Landroidx/compose/material3/j8;", "a", "(JJLandroidx/compose/material3/pa;Landroidx/compose/runtime/t;II)Landroidx/compose/material3/j8;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "cursorColor", "Landroidx/compose/foundation/text/selection/x0;", "selectionColors", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "l", "(JJJJLandroidx/compose/foundation/text/selection/x0;JJJJJJJJJLandroidx/compose/runtime/t;III)Landroidx/compose/material3/pa;", "textColor", "placeholderColor", "k", "(JJJLandroidx/compose/foundation/text/selection/x0;JJJJJJJJLandroidx/compose/runtime/t;III)Landroidx/compose/material3/pa;", "Landroidx/compose/ui/unit/h;", "b", "F", "i", "()F", "TonalElevation", "c", "h", "ShadowElevation", "d", "Elevation", "e", "f", "InputFieldHeight", "Landroidx/compose/ui/graphics/e6;", "g", "(Landroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/e6;", "inputFieldShape", "fullScreenShape", "dockedShape", "Landroidx/compose/foundation/layout/n2;", "j", "(Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/layout/n2;", "windowInsets", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@f5
@kotlin.jvm.internal.r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBarDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,741:1\n74#2:742\n74#2:743\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBarDefaults\n*L\n586#1:742\n624#1:743\n*E\n"})
/* loaded from: classes.dex */
public final class k8 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final k8 f12100a = new k8();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float TonalElevation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ShadowElevation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float Elevation;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float InputFieldHeight;

    /* renamed from: f, reason: collision with root package name */
    public static final int f12105f = 0;

    static {
        c0.x0 x0Var = c0.x0.f38323a;
        float d5 = x0Var.d();
        TonalElevation = d5;
        ShadowElevation = c0.o.f37804a.a();
        Elevation = d5;
        InputFieldHeight = x0Var.e();
    }

    private k8() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Renamed to TonalElevation. Not to be confused with ShadowElevation.", replaceWith = @kotlin.x0(expression = "TonalElevation", imports = {}))
    public static /* synthetic */ void d() {
    }

    @fg.l
    @androidx.compose.runtime.i
    public final j8 a(long j4, long j5, @fg.m pa paVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-1216168196);
        long k4 = (i5 & 1) != 0 ? b3.k(c0.x0.f38323a.c(), tVar, 6) : j4;
        long k5 = (i5 & 2) != 0 ? b3.k(c0.y0.f38383a.d(), tVar, 6) : j5;
        pa l4 = (i5 & 4) != 0 ? l(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, tVar, 0, (i4 << 3) & 57344, 16383) : paVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1216168196, i4, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.android.kt:548)");
        }
        j8 j8Var = new j8(k4, k5, l4, null);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return j8Var;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getDockedShape")
    public final androidx.compose.ui.graphics.e6 b(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1006952150);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1006952150, i4, -1, "androidx.compose.material3.SearchBarDefaults.<get-dockedShape> (SearchBar.android.kt:530)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.y0.f38383a.e(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    public final float c() {
        return Elevation;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getFullScreenShape")
    public final androidx.compose.ui.graphics.e6 e(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1665502056);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1665502056, i4, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenShape> (SearchBar.android.kt:527)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.y0.f38383a.g(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    public final float f() {
        return InputFieldHeight;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getInputFieldShape")
    public final androidx.compose.ui.graphics.e6 g(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-971556142);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-971556142, i4, -1, "androidx.compose.material3.SearchBarDefaults.<get-inputFieldShape> (SearchBar.android.kt:523)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.x0.f38323a.f(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    public final float h() {
        return ShadowElevation;
    }

    public final float i() {
        return TonalElevation;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getWindowInsets")
    public final androidx.compose.foundation.layout.n2 j(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(2112270157);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(2112270157, i4, -1, "androidx.compose.material3.SearchBarDefaults.<get-windowInsets> (SearchBar.android.kt:533)");
        }
        androidx.compose.foundation.layout.n2 A = androidx.compose.foundation.layout.i3.A(androidx.compose.foundation.layout.n2.INSTANCE, tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return A;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.i
    public final /* synthetic */ pa k(long j4, long j5, long j6, androidx.compose.foundation.text.selection.x0 x0Var, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, androidx.compose.runtime.t tVar, int i4, int i5, int i6) {
        tVar.P(355927049);
        long k4 = (i6 & 1) != 0 ? b3.k(c0.x0.f38323a.i(), tVar, 6) : j4;
        long w4 = (i6 & 2) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.y.f38340a.j(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long k5 = (i6 & 4) != 0 ? b3.k(c0.y.f38340a.c(), tVar, 6) : j6;
        androidx.compose.foundation.text.selection.x0 x0Var2 = (i6 & 8) != 0 ? (androidx.compose.foundation.text.selection.x0) tVar.x(androidx.compose.foundation.text.selection.y0.c()) : x0Var;
        long k6 = (i6 & 16) != 0 ? b3.k(c0.x0.f38323a.k(), tVar, 6) : j7;
        long k7 = (i6 & 32) != 0 ? b3.k(c0.x0.f38323a.k(), tVar, 6) : j10;
        long w5 = (i6 & 64) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.y.f38340a.l(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long k10 = (i6 & 128) != 0 ? b3.k(c0.x0.f38323a.o(), tVar, 6) : j12;
        long k11 = (i6 & 256) != 0 ? b3.k(c0.x0.f38323a.o(), tVar, 6) : j13;
        long w6 = (i6 & 512) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.y.f38340a.n(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long k12 = (i6 & 1024) != 0 ? b3.k(c0.x0.f38323a.m(), tVar, 6) : j15;
        long w7 = (i6 & 2048) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.y.f38340a.j(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(355927049, i4, i5, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.android.kt:635)");
        }
        int i7 = i4 << 3;
        int i10 = i5 << 6;
        pa l4 = l(k4, k4, w4, k5, x0Var2, k6, k7, w5, k10, k11, w6, k12, k12, w7, tVar, (i4 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | (234881024 & i7) | (i7 & 1879048192), ((i4 >> 27) & 14) | ((i5 << 3) & 112) | (i10 & 896) | (i10 & 7168) | (i10 & 57344), 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return l4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final pa l(long j4, long j5, long j6, long j7, @fg.m androidx.compose.foundation.text.selection.x0 x0Var, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, @fg.m androidx.compose.runtime.t tVar, int i4, int i5, int i6) {
        tVar.P(-602148837);
        long k4 = (i6 & 1) != 0 ? b3.k(c0.x0.f38323a.i(), tVar, 6) : j4;
        long k5 = (i6 & 2) != 0 ? b3.k(c0.x0.f38323a.i(), tVar, 6) : j5;
        long w4 = (i6 & 4) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.y.f38340a.j(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long k6 = (i6 & 8) != 0 ? b3.k(c0.y.f38340a.c(), tVar, 6) : j7;
        androidx.compose.foundation.text.selection.x0 x0Var2 = (i6 & 16) != 0 ? (androidx.compose.foundation.text.selection.x0) tVar.x(androidx.compose.foundation.text.selection.y0.c()) : x0Var;
        long k7 = (i6 & 32) != 0 ? b3.k(c0.x0.f38323a.k(), tVar, 6) : j10;
        long k10 = (i6 & 64) != 0 ? b3.k(c0.x0.f38323a.k(), tVar, 6) : j11;
        long w5 = (i6 & 128) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.y.f38340a.l(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long k11 = (i6 & 256) != 0 ? b3.k(c0.x0.f38323a.o(), tVar, 6) : j13;
        long k12 = (i6 & 512) != 0 ? b3.k(c0.x0.f38323a.o(), tVar, 6) : j14;
        long w6 = (i6 & 1024) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.y.f38340a.n(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long k13 = (i6 & 2048) != 0 ? b3.k(c0.x0.f38323a.m(), tVar, 6) : j16;
        long k14 = (i6 & 4096) != 0 ? b3.k(c0.x0.f38323a.m(), tVar, 6) : j17;
        long w7 = (i6 & 8192) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.y.f38340a.j(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j18;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-602148837, i4, i5, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.android.kt:599)");
        }
        int i7 = i5 << 18;
        pa j19 = qa.f13733a.j(k4, k5, w4, 0L, 0L, 0L, 0L, 0L, k6, 0L, x0Var2, 0L, 0L, 0L, 0L, k7, k10, w5, 0L, k11, k12, w6, 0L, 0L, 0L, 0L, 0L, k13, k14, w7, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, tVar, (i4 & TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED) | ((i4 << 15) & 234881024), ((i4 >> 12) & 14) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128) | ((i4 << 3) & 1879048192), ((i4 >> 27) & 14) | ((i5 << 3) & 112) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), 0, 3072, 1204058872, org.apache.tools.zip.d.f86736x2);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return j19;
    }
}
