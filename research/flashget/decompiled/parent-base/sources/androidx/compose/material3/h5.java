package androidx.compose.material3;

import kotlin.Metadata;
import r.a;

/* compiled from: ExposedDropdownMenu.android.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0098\u0003\u00103\u001a\u0002022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0002\u0010'\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020\t2\b\b\u0002\u0010)\u001a\u00020\t2\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020\t2\b\b\u0002\u0010,\u001a\u00020\t2\b\b\u0002\u0010-\u001a\u00020\t2\b\b\u0002\u0010.\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u00020\t2\b\b\u0002\u00100\u001a\u00020\t2\b\b\u0002\u00101\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0098\u0003\u00109\u001a\u0002022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u00105\u001a\u00020\t2\b\b\u0002\u00106\u001a\u00020\t2\b\b\u0002\u00107\u001a\u00020\t2\b\b\u0002\u00108\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0002\u0010'\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020\t2\b\b\u0002\u0010)\u001a\u00020\t2\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020\t2\b\b\u0002\u0010,\u001a\u00020\t2\b\b\u0002\u0010-\u001a\u00020\t2\b\b\u0002\u0010.\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u00020\t2\b\b\u0002\u00100\u001a\u00020\t2\b\b\u0002\u00101\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b9\u00104J\u0084\u0003\u0010;\u001a\u0002022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0002\u0010'\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020\t2\b\b\u0002\u0010)\u001a\u00020\t2\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020\t2\b\b\u0002\u0010,\u001a\u00020\t2\b\b\u0002\u0010-\u001a\u00020\t2\b\b\u0002\u0010.\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u00020\t2\b\b\u0002\u00100\u001a\u00020\t2\b\b\u0002\u00101\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u0084\u0003\u0010=\u001a\u0002022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u00105\u001a\u00020\t2\b\b\u0002\u00106\u001a\u00020\t2\b\b\u0002\u00107\u001a\u00020\t2\b\b\u0002\u00108\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0002\u0010'\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020\t2\b\b\u0002\u0010)\u001a\u00020\t2\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020\t2\b\b\u0002\u0010,\u001a\u00020\t2\b\b\u0002\u0010-\u001a\u00020\t2\b\b\u0002\u0010.\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u00020\t2\b\b\u0002\u00100\u001a\u00020\t2\b\b\u0002\u00101\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b=\u0010<J\u0082\u0002\u0010@\u001a\u0002022\b\b\u0002\u0010>\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010?\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u0082\u0002\u0010B\u001a\u0002022\b\b\u0002\u0010>\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u00105\u001a\u00020\t2\b\b\u0002\u00106\u001a\u00020\t2\b\b\u0002\u00107\u001a\u00020\t2\b\b\u0002\u00108\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010?\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\bB\u0010AR\u0017\u0010G\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bD\u0010F\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006H"}, d2 = {"Landroidx/compose/material3/h5;", "", "<init>", "()V", "", "expanded", "Lkotlin/k2;", "a", "(ZLandroidx/compose/runtime/t;I)V", "Landroidx/compose/ui/graphics/d2;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/x0;", "selectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "Landroidx/compose/material3/pa;", "f", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/x0;JJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/t;IIIIII)Landroidx/compose/material3/pa;", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "c", "containerColor", "h", "(JJJJJJJJLandroidx/compose/foundation/text/selection/x0;JJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/t;IIIIII)Landroidx/compose/material3/pa;", "e", "textColor", "placeholderColor", "g", "(JJJJJLandroidx/compose/foundation/text/selection/x0;JJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/t;IIII)Landroidx/compose/material3/pa;", "d", "Landroidx/compose/foundation/layout/l1;", "b", "Landroidx/compose/foundation/layout/l1;", "()Landroidx/compose/foundation/layout/l1;", "ItemContentPadding", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@f5
@kotlin.jvm.internal.r1({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1091:1\n74#2:1092\n74#2:1093\n74#2:1094\n74#2:1095\n74#2:1096\n74#2:1097\n154#3:1098\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuDefaults\n*L\n392#1:1092\n546#1:1093\n659#1:1094\n765#1:1095\n866#1:1096\n956#1:1097\n644#1:1098\n*E\n"})
/* loaded from: classes.dex */
public final class h5 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final h5 f11344a = new h5();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 ItemContentPadding;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11346c = 0;

    /* compiled from: ExposedDropdownMenu.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11348c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f11349d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z4, int i4) {
            super(2);
            this.f11348c = z4;
            this.f11349d = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            h5.this.a(this.f11348c, tVar, androidx.compose.runtime.g3.b(this.f11349d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    static {
        float f4;
        f4 = i5.f11417a;
        ItemContentPadding = androidx.compose.foundation.layout.j1.b(f4, androidx.compose.ui.unit.h.g(0));
    }

    private h5() {
    }

    @f5
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public final void a(boolean z4, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-473088613);
        if ((i4 & 6) == 0) {
            i5 = (o4.b(z4) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) == 2 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-473088613, i5, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.android.kt:322)");
            }
            v5.c(x.f.a(a.b.f89546a), null, androidx.compose.ui.draw.r.a(androidx.compose.ui.q.INSTANCE, z4 ? 180.0f : 0.0f), 0L, o4, 48, 8);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new a(z4, i4));
        }
    }

    @fg.l
    public final androidx.compose.foundation.layout.l1 b() {
        return ItemContentPadding;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final pa c(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, @fg.m androidx.compose.foundation.text.selection.x0 x0Var, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, @fg.m androidx.compose.runtime.t tVar, int i4, int i5, int i6, int i7, int i10, int i11) {
        long j44;
        long j45;
        long j46;
        long j47;
        tVar.P(-1567195085);
        long k4 = (i10 & 1) != 0 ? b3.k(c0.l0.f37628a.m(), tVar, 6) : j4;
        long k5 = (i10 & 2) != 0 ? b3.k(c0.l0.f37628a.s(), tVar, 6) : j5;
        long w4 = (i10 & 4) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.a(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long k6 = (i10 & 8) != 0 ? b3.k(c0.l0.f37628a.j(), tVar, 6) : j7;
        if ((i10 & 16) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j44 = androidx.compose.ui.graphics.d2.f17777n;
        } else {
            j44 = j10;
        }
        if ((i10 & 32) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j45 = androidx.compose.ui.graphics.d2.f17777n;
        } else {
            j45 = j11;
        }
        if ((i10 & 64) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j46 = androidx.compose.ui.graphics.d2.f17777n;
        } else {
            j46 = j12;
        }
        if ((i10 & 128) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j47 = androidx.compose.ui.graphics.d2.f17777n;
        } else {
            j47 = j13;
        }
        long k7 = (i10 & 256) != 0 ? b3.k(c0.l0.f37628a.I(), tVar, 6) : j14;
        long k10 = (i10 & 512) != 0 ? b3.k(c0.l0.f37628a.Q(), tVar, 6) : j15;
        androidx.compose.foundation.text.selection.x0 x0Var2 = (i10 & 1024) != 0 ? (androidx.compose.foundation.text.selection.x0) tVar.x(androidx.compose.foundation.text.selection.y0.c()) : x0Var;
        long k11 = (i10 & 2048) != 0 ? b3.k(c0.l0.f37628a.b0(), tVar, 6) : j16;
        long k12 = (i10 & 4096) != 0 ? b3.k(c0.l0.f37628a.k0(), tVar, 6) : j17;
        long w5 = (i10 & 8192) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.N(), tVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long k13 = (i10 & 16384) != 0 ? b3.k(c0.l0.f37628a.Y(), tVar, 6) : j19;
        long k14 = (32768 & i10) != 0 ? b3.k(c0.l0.f37628a.a0(), tVar, 6) : j20;
        long k15 = (65536 & i10) != 0 ? b3.k(c0.l0.f37628a.i0(), tVar, 6) : j21;
        long w6 = (131072 & i10) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.M(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long k16 = (262144 & i10) != 0 ? b3.k(c0.l0.f37628a.X(), tVar, 6) : j23;
        long k17 = (524288 & i10) != 0 ? b3.k(c0.l0.f37628a.d0(), tVar, 6) : j24;
        long k18 = (1048576 & i10) != 0 ? b3.k(c0.l0.f37628a.m0(), tVar, 6) : j25;
        long w7 = (2097152 & i10) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.P(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long k19 = (4194304 & i10) != 0 ? b3.k(c0.l0.f37628a.Z(), tVar, 6) : j27;
        long k20 = (8388608 & i10) != 0 ? b3.k(c0.l0.f37628a.n(), tVar, 6) : j28;
        long k21 = (16777216 & i10) != 0 ? b3.k(c0.l0.f37628a.u(), tVar, 6) : j29;
        long w10 = (33554432 & i10) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.b(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j30;
        long k22 = (67108864 & i10) != 0 ? b3.k(c0.l0.f37628a.k(), tVar, 6) : j31;
        long k23 = (134217728 & i10) != 0 ? b3.k(c0.l0.f37628a.w(), tVar, 6) : j32;
        long k24 = (268435456 & i10) != 0 ? b3.k(c0.l0.f37628a.w(), tVar, 6) : j33;
        long w11 = (536870912 & i10) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.c(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j34;
        long k25 = (i10 & 1073741824) != 0 ? b3.k(c0.l0.f37628a.w(), tVar, 6) : j35;
        long k26 = (i11 & 1) != 0 ? b3.k(c0.l0.f37628a.w(), tVar, 6) : j36;
        long k27 = (i11 & 2) != 0 ? b3.k(c0.l0.f37628a.w(), tVar, 6) : j37;
        long w12 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.c(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j38;
        long k28 = (i11 & 8) != 0 ? b3.k(c0.l0.f37628a.w(), tVar, 6) : j39;
        long k29 = (i11 & 16) != 0 ? b3.k(c0.l0.f37628a.w(), tVar, 6) : j40;
        long k30 = (i11 & 32) != 0 ? b3.k(c0.l0.f37628a.w(), tVar, 6) : j41;
        long w13 = (i11 & 64) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.c(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j42;
        long k31 = (i11 & 128) != 0 ? b3.k(c0.l0.f37628a.w(), tVar, 6) : j43;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1567195085, i4, i5, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:595)");
        }
        int i12 = i7 << 12;
        int i13 = i7 >> 18;
        int i14 = (i13 & 14) | 3072 | (i13 & 112) | (i13 & 896);
        pa d5 = q7.f13678a.d(k4, k5, w4, k6, j44, j45, j46, j47, k7, k10, x0Var2, k11, k12, w5, k13, k14, k15, w6, k16, k17, k18, w7, k19, k20, k21, w10, k22, k23, k24, w11, k25, 0L, 0L, 0L, 0L, k26, k27, w12, k28, k29, k30, w13, k31, tVar, i4 & 2147483646, i5 & 2147483646, i6 & 2147483646, (i7 & 14) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), i14, 0, 15);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return d5;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.i
    public final pa d(long j4, long j5, long j6, long j7, long j10, androidx.compose.foundation.text.selection.x0 x0Var, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, androidx.compose.runtime.t tVar, int i4, int i5, int i6, int i7) {
        long j29;
        tVar.P(-836383316);
        long k4 = (i7 & 1) != 0 ? b3.k(c0.l0.f37628a.s(), tVar, 6) : j4;
        long w4 = (i7 & 2) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.a(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if ((i7 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j29 = androidx.compose.ui.graphics.d2.f17777n;
        } else {
            j29 = j6;
        }
        long k5 = (i7 & 8) != 0 ? b3.k(c0.l0.f37628a.I(), tVar, 6) : j7;
        long k6 = (i7 & 16) != 0 ? b3.k(c0.l0.f37628a.Q(), tVar, 6) : j10;
        androidx.compose.foundation.text.selection.x0 x0Var2 = (i7 & 32) != 0 ? (androidx.compose.foundation.text.selection.x0) tVar.x(androidx.compose.foundation.text.selection.y0.c()) : x0Var;
        long k7 = (i7 & 64) != 0 ? b3.k(c0.l0.f37628a.b0(), tVar, 6) : j11;
        long k10 = (i7 & 128) != 0 ? b3.k(c0.l0.f37628a.k0(), tVar, 6) : j12;
        long w5 = (i7 & 256) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.N(), tVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long k11 = (i7 & 512) != 0 ? b3.k(c0.l0.f37628a.Y(), tVar, 6) : j14;
        long k12 = (i7 & 1024) != 0 ? b3.k(c0.l0.f37628a.a0(), tVar, 6) : j15;
        long k13 = (i7 & 2048) != 0 ? b3.k(c0.l0.f37628a.i0(), tVar, 6) : j16;
        long w6 = (i7 & 4096) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.M(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long k14 = (i7 & 8192) != 0 ? b3.k(c0.l0.f37628a.X(), tVar, 6) : j18;
        long k15 = (i7 & 16384) != 0 ? b3.k(c0.l0.f37628a.d0(), tVar, 6) : j19;
        long k16 = (32768 & i7) != 0 ? b3.k(c0.l0.f37628a.m0(), tVar, 6) : j20;
        long w7 = (65536 & i7) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.P(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long k17 = (131072 & i7) != 0 ? b3.k(c0.l0.f37628a.Z(), tVar, 6) : j22;
        long k18 = (262144 & i7) != 0 ? b3.k(c0.l0.f37628a.n(), tVar, 6) : j23;
        long k19 = (524288 & i7) != 0 ? b3.k(c0.l0.f37628a.u(), tVar, 6) : j24;
        long w10 = (1048576 & i7) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.b(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long k20 = (2097152 & i7) != 0 ? b3.k(c0.l0.f37628a.k(), tVar, 6) : j26;
        long k21 = (4194304 & i7) != 0 ? b3.k(c0.l0.f37628a.w(), tVar, 6) : j27;
        long w11 = (i7 & 8388608) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.a(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j28;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-836383316, i4, i5, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:989)");
        }
        c0.l0 l0Var = c0.l0.f37628a;
        long k22 = b3.k(l0Var.w(), tVar, 6);
        long k23 = b3.k(l0Var.w(), tVar, 6);
        long w12 = androidx.compose.ui.graphics.d2.w(b3.k(l0Var.c(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long k24 = b3.k(l0Var.w(), tVar, 6);
        long k25 = b3.k(l0Var.w(), tVar, 6);
        long k26 = b3.k(l0Var.w(), tVar, 6);
        long w13 = androidx.compose.ui.graphics.d2.w(b3.k(l0Var.c(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long k27 = b3.k(l0Var.w(), tVar, 6);
        int i10 = i4 << 3;
        int i11 = (i4 & 14) | (i10 & 112) | (i10 & 896);
        int i12 = i4 << 9;
        int i13 = i11 | (i12 & 7168) | ((i4 << 6) & 57344) | (i12 & 458752) | ((i4 << 12) & 3670016);
        int i14 = i4 << 15;
        int i15 = i13 | (i14 & 29360128) | (i14 & 234881024) | (i14 & 1879048192);
        int i16 = i5 << 15;
        int i17 = i6 << 15;
        int i18 = i6 << 18;
        pa c5 = c(k4, k4, w4, k4, j29, j29, j29, j29, k5, k6, x0Var2, k7, k10, w5, k11, k12, k13, w6, k14, k15, k16, w7, k17, k18, k19, w10, k20, k21, k21, w11, k21, k22, k23, w12, k24, k25, k26, w13, k27, tVar, i15, ((i4 >> 15) & 65534) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192), ((i5 >> 15) & 65534) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | (i18 & 234881024) | (i18 & 1879048192), ((i6 >> 6) & 14) | (i17 & 1879048192), 0, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.i
    public final pa e(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, androidx.compose.foundation.text.selection.x0 x0Var, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, androidx.compose.runtime.t tVar, int i4, int i5, int i6, int i7, int i10, int i11) {
        long j42;
        long j43;
        tVar.P(-388128543);
        long k4 = (i10 & 1) != 0 ? b3.k(c0.l0.f37628a.m(), tVar, 6) : j4;
        long k5 = (i10 & 2) != 0 ? b3.k(c0.l0.f37628a.s(), tVar, 6) : j5;
        long w4 = (i10 & 4) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.a(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long k6 = (i10 & 8) != 0 ? b3.k(c0.l0.f37628a.j(), tVar, 6) : j7;
        if ((i10 & 16) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j42 = androidx.compose.ui.graphics.d2.f17777n;
        } else {
            j42 = j10;
        }
        if ((i10 & 32) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j43 = androidx.compose.ui.graphics.d2.f17777n;
        } else {
            j43 = j11;
        }
        long k7 = (i10 & 64) != 0 ? b3.k(c0.l0.f37628a.I(), tVar, 6) : j12;
        long k10 = (i10 & 128) != 0 ? b3.k(c0.l0.f37628a.Q(), tVar, 6) : j13;
        androidx.compose.foundation.text.selection.x0 x0Var2 = (i10 & 256) != 0 ? (androidx.compose.foundation.text.selection.x0) tVar.x(androidx.compose.foundation.text.selection.y0.c()) : x0Var;
        long k11 = (i10 & 512) != 0 ? b3.k(c0.l0.f37628a.b0(), tVar, 6) : j14;
        long k12 = (i10 & 1024) != 0 ? b3.k(c0.l0.f37628a.k0(), tVar, 6) : j15;
        long w5 = (i10 & 2048) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.N(), tVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long k13 = (i10 & 4096) != 0 ? b3.k(c0.l0.f37628a.Y(), tVar, 6) : j17;
        long k14 = (i10 & 8192) != 0 ? b3.k(c0.l0.f37628a.a0(), tVar, 6) : j18;
        long k15 = (i10 & 16384) != 0 ? b3.k(c0.l0.f37628a.i0(), tVar, 6) : j19;
        long w6 = (32768 & i10) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.M(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long k16 = (65536 & i10) != 0 ? b3.k(c0.l0.f37628a.X(), tVar, 6) : j21;
        long k17 = (131072 & i10) != 0 ? b3.k(c0.l0.f37628a.d0(), tVar, 6) : j22;
        long k18 = (262144 & i10) != 0 ? b3.k(c0.l0.f37628a.m0(), tVar, 6) : j23;
        long w7 = (524288 & i10) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.P(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j24;
        long k19 = (1048576 & i10) != 0 ? b3.k(c0.l0.f37628a.Z(), tVar, 6) : j25;
        long k20 = (2097152 & i10) != 0 ? b3.k(c0.l0.f37628a.n(), tVar, 6) : j26;
        long k21 = (4194304 & i10) != 0 ? b3.k(c0.l0.f37628a.u(), tVar, 6) : j27;
        long w10 = (8388608 & i10) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.b(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j28;
        long k22 = (16777216 & i10) != 0 ? b3.k(c0.l0.f37628a.k(), tVar, 6) : j29;
        long k23 = (33554432 & i10) != 0 ? b3.k(c0.l0.f37628a.w(), tVar, 6) : j30;
        long k24 = (67108864 & i10) != 0 ? b3.k(c0.l0.f37628a.w(), tVar, 6) : j31;
        long w11 = (134217728 & i10) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.c(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j32;
        long k25 = (268435456 & i10) != 0 ? b3.k(c0.l0.f37628a.w(), tVar, 6) : j33;
        long k26 = (536870912 & i10) != 0 ? b3.k(c0.l0.f37628a.w(), tVar, 6) : j34;
        long k27 = (i10 & 1073741824) != 0 ? b3.k(c0.l0.f37628a.w(), tVar, 6) : j35;
        long w12 = (i11 & 1) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.c(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j36;
        long k28 = (i11 & 2) != 0 ? b3.k(c0.l0.f37628a.w(), tVar, 6) : j37;
        long k29 = (i11 & 4) != 0 ? b3.k(c0.l0.f37628a.w(), tVar, 6) : j38;
        long k30 = (i11 & 8) != 0 ? b3.k(c0.l0.f37628a.w(), tVar, 6) : j39;
        long w13 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.l0.f37628a.c(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j40;
        long k31 = (i11 & 32) != 0 ? b3.k(c0.l0.f37628a.w(), tVar, 6) : j41;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-388128543, i4, i5, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:814)");
        }
        int i12 = i4 << 6;
        int i13 = i5 << 6;
        int i14 = i6 << 6;
        int i15 = ((i5 >> 24) & 126) | (i14 & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128) | (i14 & 234881024) | (i14 & 1879048192);
        int i16 = i7 << 6;
        pa c5 = c(k4, k5, w4, k6, j42, j42, j42, j43, k7, k10, x0Var2, k11, k12, w5, k13, k14, k15, w6, k16, k17, k18, w7, k19, k20, k21, w10, k22, k23, k24, w11, k25, k26, k27, w12, k28, k29, k30, w13, k31, tVar, (65534 & i4) | ((i4 << 3) & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), ((i4 >> 24) & 126) | (i13 & 896) | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192), i15, ((i6 >> 24) & 126) | (i16 & 896) | (i16 & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192), 0, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final pa f(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, @fg.m androidx.compose.foundation.text.selection.x0 x0Var, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, @fg.m androidx.compose.runtime.t tVar, int i4, int i5, int i6, int i7, int i10, int i11) {
        tVar.P(768358577);
        long k4 = (i10 & 1) != 0 ? b3.k(c0.u.f38174a.m(), tVar, 6) : j4;
        long k5 = (i10 & 2) != 0 ? b3.k(c0.u.f38174a.s(), tVar, 6) : j5;
        long w4 = (i10 & 4) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.u.f38174a.a(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long k6 = (i10 & 8) != 0 ? b3.k(c0.u.f38174a.j(), tVar, 6) : j7;
        long k7 = (i10 & 16) != 0 ? b3.k(c0.u.f38174a.L(), tVar, 6) : j10;
        long k10 = (i10 & 32) != 0 ? b3.k(c0.u.f38174a.L(), tVar, 6) : j11;
        long k11 = (i10 & 64) != 0 ? b3.k(c0.u.f38174a.L(), tVar, 6) : j12;
        long k12 = (i10 & 128) != 0 ? b3.k(c0.u.f38174a.L(), tVar, 6) : j13;
        long k13 = (i10 & 256) != 0 ? b3.k(c0.u.f38174a.K(), tVar, 6) : j14;
        long k14 = (i10 & 512) != 0 ? b3.k(c0.u.f38174a.V(), tVar, 6) : j15;
        androidx.compose.foundation.text.selection.x0 x0Var2 = (i10 & 1024) != 0 ? (androidx.compose.foundation.text.selection.x0) tVar.x(androidx.compose.foundation.text.selection.y0.c()) : x0Var;
        long k15 = (i10 & 2048) != 0 ? b3.k(c0.u.f38174a.d0(), tVar, 6) : j16;
        long k16 = (i10 & 4096) != 0 ? b3.k(c0.u.f38174a.I(), tVar, 6) : j17;
        long w5 = (i10 & 8192) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.u.f38174a.O(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long k17 = (i10 & 16384) != 0 ? b3.k(c0.u.f38174a.T(), tVar, 6) : j19;
        long k18 = (32768 & i10) != 0 ? b3.k(c0.u.f38174a.f0(), tVar, 6) : j20;
        long k19 = (65536 & i10) != 0 ? b3.k(c0.u.f38174a.l0(), tVar, 6) : j21;
        long w6 = (131072 & i10) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.u.f38174a.R(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long k20 = (262144 & i10) != 0 ? b3.k(c0.u.f38174a.b0(), tVar, 6) : j23;
        long k21 = (524288 & i10) != 0 ? b3.k(c0.u.f38174a.g0(), tVar, 6) : j24;
        long k22 = (1048576 & i10) != 0 ? b3.k(c0.u.f38174a.n0(), tVar, 6) : j25;
        long w7 = (2097152 & i10) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.u.f38174a.S(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long k23 = (4194304 & i10) != 0 ? b3.k(c0.u.f38174a.c0(), tVar, 6) : j27;
        long k24 = (8388608 & i10) != 0 ? b3.k(c0.u.f38174a.n(), tVar, 6) : j28;
        long k25 = (16777216 & i10) != 0 ? b3.k(c0.u.f38174a.u(), tVar, 6) : j29;
        long k26 = (33554432 & i10) != 0 ? b3.k(c0.u.f38174a.b(), tVar, 6) : j30;
        long k27 = (67108864 & i10) != 0 ? b3.k(c0.u.f38174a.k(), tVar, 6) : j31;
        long k28 = (134217728 & i10) != 0 ? b3.k(c0.u.f38174a.w(), tVar, 6) : j32;
        long k29 = (268435456 & i10) != 0 ? b3.k(c0.u.f38174a.w(), tVar, 6) : j33;
        long w10 = (536870912 & i10) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.u.f38174a.c(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j34;
        long k30 = (i10 & 1073741824) != 0 ? b3.k(c0.u.f38174a.w(), tVar, 6) : j35;
        long k31 = (i11 & 1) != 0 ? b3.k(c0.u.f38174a.w(), tVar, 6) : j36;
        long k32 = (i11 & 2) != 0 ? b3.k(c0.u.f38174a.w(), tVar, 6) : j37;
        long w11 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.u.f38174a.c(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j38;
        long k33 = (i11 & 8) != 0 ? b3.k(c0.u.f38174a.w(), tVar, 6) : j39;
        long k34 = (i11 & 16) != 0 ? b3.k(c0.u.f38174a.w(), tVar, 6) : j40;
        long k35 = (i11 & 32) != 0 ? b3.k(c0.u.f38174a.w(), tVar, 6) : j41;
        long w12 = (i11 & 64) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.u.f38174a.c(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j42;
        long k36 = (i11 & 128) != 0 ? b3.k(c0.u.f38174a.w(), tVar, 6) : j43;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(768358577, i4, i5, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:442)");
        }
        int i12 = i7 << 12;
        int i13 = i7 >> 18;
        int i14 = (i13 & 14) | 3072 | (i13 & 112) | (i13 & 896);
        pa j44 = qa.f13733a.j(k4, k5, w4, k6, k7, k10, k11, k12, k13, k14, x0Var2, k15, k16, w5, k17, k18, k19, w6, k20, k21, k22, w7, k23, k24, k25, k26, k27, k28, k29, w10, k30, 0L, 0L, 0L, 0L, k31, k32, w11, k33, k34, k35, w12, k36, tVar, i4 & 2147483646, i5 & 2147483646, i6 & 2147483646, (i7 & 14) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), i14, 0, 15);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return j44;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.i
    public final /* synthetic */ pa g(long j4, long j5, long j6, long j7, long j10, androidx.compose.foundation.text.selection.x0 x0Var, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, androidx.compose.runtime.t tVar, int i4, int i5, int i6, int i7) {
        tVar.P(-1343678550);
        long k4 = (i7 & 1) != 0 ? b3.k(c0.u.f38174a.s(), tVar, 6) : j4;
        long w4 = (i7 & 2) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.u.f38174a.a(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long k5 = (i7 & 4) != 0 ? b3.k(c0.u.f38174a.L(), tVar, 6) : j6;
        long k6 = (i7 & 8) != 0 ? b3.k(c0.u.f38174a.K(), tVar, 6) : j7;
        long k7 = (i7 & 16) != 0 ? b3.k(c0.u.f38174a.V(), tVar, 6) : j10;
        androidx.compose.foundation.text.selection.x0 x0Var2 = (i7 & 32) != 0 ? (androidx.compose.foundation.text.selection.x0) tVar.x(androidx.compose.foundation.text.selection.y0.c()) : x0Var;
        long k10 = (i7 & 64) != 0 ? b3.k(c0.u.f38174a.d0(), tVar, 6) : j11;
        long k11 = (i7 & 128) != 0 ? b3.k(c0.u.f38174a.I(), tVar, 6) : j12;
        long w5 = (i7 & 256) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.u.f38174a.O(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long k12 = (i7 & 512) != 0 ? b3.k(c0.u.f38174a.T(), tVar, 6) : j14;
        long k13 = (i7 & 1024) != 0 ? b3.k(c0.u.f38174a.f0(), tVar, 6) : j15;
        long k14 = (i7 & 2048) != 0 ? b3.k(c0.u.f38174a.l0(), tVar, 6) : j16;
        long w6 = (i7 & 4096) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.u.f38174a.R(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long k15 = (i7 & 8192) != 0 ? b3.k(c0.u.f38174a.b0(), tVar, 6) : j18;
        long k16 = (i7 & 16384) != 0 ? b3.k(c0.u.f38174a.g0(), tVar, 6) : j19;
        long k17 = (32768 & i7) != 0 ? b3.k(c0.u.f38174a.n0(), tVar, 6) : j20;
        long w7 = (65536 & i7) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.u.f38174a.S(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long k18 = (131072 & i7) != 0 ? b3.k(c0.u.f38174a.c0(), tVar, 6) : j22;
        long k19 = (262144 & i7) != 0 ? b3.k(c0.u.f38174a.n(), tVar, 6) : j23;
        long k20 = (524288 & i7) != 0 ? b3.k(c0.u.f38174a.u(), tVar, 6) : j24;
        long k21 = (1048576 & i7) != 0 ? b3.k(c0.u.f38174a.b(), tVar, 6) : j25;
        long k22 = (2097152 & i7) != 0 ? b3.k(c0.u.f38174a.k(), tVar, 6) : j26;
        long k23 = (4194304 & i7) != 0 ? b3.k(c0.u.f38174a.w(), tVar, 6) : j27;
        long w10 = (i7 & 8388608) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.u.f38174a.a(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j28;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1343678550, i4, i5, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:901)");
        }
        c0.l0 l0Var = c0.l0.f37628a;
        long k24 = b3.k(l0Var.w(), tVar, 6);
        long k25 = b3.k(l0Var.w(), tVar, 6);
        long w11 = androidx.compose.ui.graphics.d2.w(b3.k(l0Var.c(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long k26 = b3.k(l0Var.w(), tVar, 6);
        long k27 = b3.k(l0Var.w(), tVar, 6);
        long k28 = b3.k(l0Var.w(), tVar, 6);
        long w12 = androidx.compose.ui.graphics.d2.w(b3.k(l0Var.c(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long k29 = b3.k(l0Var.w(), tVar, 6);
        int i10 = i4 << 3;
        int i11 = (i4 & 14) | (i10 & 112) | (i10 & 896);
        int i12 = i4 << 9;
        int i13 = i11 | (i12 & 7168) | ((i4 << 6) & 57344) | (i12 & 458752) | ((i4 << 12) & 3670016);
        int i14 = i4 << 15;
        int i15 = i13 | (i14 & 29360128) | (i14 & 234881024) | (i14 & 1879048192);
        int i16 = i5 << 15;
        int i17 = i6 << 15;
        int i18 = i6 << 18;
        pa f4 = f(k4, k4, w4, k4, k5, k5, k5, k5, k6, k7, x0Var2, k10, k11, w5, k12, k13, k14, w6, k15, k16, k17, w7, k18, k19, k20, k21, k22, k23, k23, w10, k23, k24, k25, w11, k26, k27, k28, w12, k29, tVar, i15, ((i4 >> 15) & 65534) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192), ((i5 >> 15) & 65534) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | (i18 & 234881024) | (i18 & 1879048192), ((i6 >> 6) & 14) | (i17 & 1879048192), 0, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return f4;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.i
    public final /* synthetic */ pa h(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, androidx.compose.foundation.text.selection.x0 x0Var, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, androidx.compose.runtime.t tVar, int i4, int i5, int i6, int i7, int i10, int i11) {
        tVar.P(611690079);
        long k4 = (i10 & 1) != 0 ? b3.k(c0.u.f38174a.m(), tVar, 6) : j4;
        long k5 = (i10 & 2) != 0 ? b3.k(c0.u.f38174a.s(), tVar, 6) : j5;
        long w4 = (i10 & 4) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.u.f38174a.a(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long k6 = (i10 & 8) != 0 ? b3.k(c0.u.f38174a.j(), tVar, 6) : j7;
        long k7 = (i10 & 16) != 0 ? b3.k(c0.u.f38174a.L(), tVar, 6) : j10;
        long k10 = (i10 & 32) != 0 ? b3.k(c0.u.f38174a.L(), tVar, 6) : j11;
        long k11 = (i10 & 64) != 0 ? b3.k(c0.u.f38174a.K(), tVar, 6) : j12;
        long k12 = (i10 & 128) != 0 ? b3.k(c0.u.f38174a.V(), tVar, 6) : j13;
        androidx.compose.foundation.text.selection.x0 x0Var2 = (i10 & 256) != 0 ? (androidx.compose.foundation.text.selection.x0) tVar.x(androidx.compose.foundation.text.selection.y0.c()) : x0Var;
        long k13 = (i10 & 512) != 0 ? b3.k(c0.u.f38174a.d0(), tVar, 6) : j14;
        long k14 = (i10 & 1024) != 0 ? b3.k(c0.u.f38174a.I(), tVar, 6) : j15;
        long w5 = (i10 & 2048) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.u.f38174a.O(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long k15 = (i10 & 4096) != 0 ? b3.k(c0.u.f38174a.T(), tVar, 6) : j17;
        long k16 = (i10 & 8192) != 0 ? b3.k(c0.u.f38174a.f0(), tVar, 6) : j18;
        long k17 = (i10 & 16384) != 0 ? b3.k(c0.u.f38174a.l0(), tVar, 6) : j19;
        long w6 = (32768 & i10) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.u.f38174a.R(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long k18 = (65536 & i10) != 0 ? b3.k(c0.u.f38174a.b0(), tVar, 6) : j21;
        long k19 = (131072 & i10) != 0 ? b3.k(c0.u.f38174a.g0(), tVar, 6) : j22;
        long k20 = (262144 & i10) != 0 ? b3.k(c0.u.f38174a.n0(), tVar, 6) : j23;
        long w7 = (524288 & i10) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.u.f38174a.S(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j24;
        long k21 = (1048576 & i10) != 0 ? b3.k(c0.u.f38174a.c0(), tVar, 6) : j25;
        long k22 = (2097152 & i10) != 0 ? b3.k(c0.u.f38174a.n(), tVar, 6) : j26;
        long k23 = (4194304 & i10) != 0 ? b3.k(c0.u.f38174a.u(), tVar, 6) : j27;
        long k24 = (8388608 & i10) != 0 ? b3.k(c0.u.f38174a.b(), tVar, 6) : j28;
        long k25 = (16777216 & i10) != 0 ? b3.k(c0.u.f38174a.k(), tVar, 6) : j29;
        long k26 = (33554432 & i10) != 0 ? b3.k(c0.u.f38174a.w(), tVar, 6) : j30;
        long k27 = (67108864 & i10) != 0 ? b3.k(c0.u.f38174a.w(), tVar, 6) : j31;
        long w10 = (134217728 & i10) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.u.f38174a.c(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j32;
        long k28 = (268435456 & i10) != 0 ? b3.k(c0.u.f38174a.w(), tVar, 6) : j33;
        long k29 = (536870912 & i10) != 0 ? b3.k(c0.u.f38174a.w(), tVar, 6) : j34;
        long k30 = (i10 & 1073741824) != 0 ? b3.k(c0.u.f38174a.w(), tVar, 6) : j35;
        long w11 = (i11 & 1) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.u.f38174a.c(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j36;
        long k31 = (i11 & 2) != 0 ? b3.k(c0.u.f38174a.w(), tVar, 6) : j37;
        long k32 = (i11 & 4) != 0 ? b3.k(c0.u.f38174a.w(), tVar, 6) : j38;
        long k33 = (i11 & 8) != 0 ? b3.k(c0.u.f38174a.w(), tVar, 6) : j39;
        long w12 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.d2.w(b3.k(c0.u.f38174a.c(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j40;
        long k34 = (i11 & 32) != 0 ? b3.k(c0.u.f38174a.w(), tVar, 6) : j41;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(611690079, i4, i5, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:709)");
        }
        int i12 = i4 << 6;
        int i13 = i5 << 6;
        int i14 = i6 << 6;
        int i15 = ((i5 >> 24) & 126) | (i14 & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128) | (i14 & 234881024) | (i14 & 1879048192);
        int i16 = i7 << 6;
        pa f4 = f(k4, k5, w4, k6, k7, k7, k7, k10, k11, k12, x0Var2, k13, k14, w5, k15, k16, k17, w6, k18, k19, k20, w7, k21, k22, k23, k24, k25, k26, k27, w10, k28, k29, k30, w11, k31, k32, k33, w12, k34, tVar, (65534 & i4) | ((i4 << 3) & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), ((i4 >> 24) & 126) | (i13 & 896) | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192), i15, ((i6 >> 24) & 126) | (i16 & 896) | (i16 & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192), 0, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return f4;
    }
}
