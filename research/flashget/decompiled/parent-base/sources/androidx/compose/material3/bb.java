package androidx.compose.material3;

import android.view.KeyEvent;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.i;
import androidx.compose.material3.t9;
import androidx.compose.material3.u8;
import androidx.compose.material3.x7;
import androidx.compose.runtime.t;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.k1;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import androidx.compose.ui.text.input.g0;
import androidx.compose.ui.text.input.y;
import androidx.compose.ui.text.input.z0;
import androidx.compose.ui.text.style.h;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: TimePicker.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0017\u0010\u0016\u001a'\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001c\u0010\u001b\u001a\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001d\u0010\u001b\u001a'\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010 \u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b \u0010\u001f\u001a?\u0010&\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0003¢\u0006\u0004\b&\u0010'\u001aS\u00101\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020#2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0*2\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u00100\u001a\u0018\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0,¢\u0006\u0002\b.¢\u0006\u0002\b/H\u0003¢\u0006\u0004\b1\u00102\u001a\u0017\u00103\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b3\u00104\u001a:\u00108\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00105\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a'\u0010:\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0010H\u0001¢\u0006\u0004\b:\u0010;\u001a#\u0010<\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b<\u0010=\u001a/\u0010>\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00105\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0010H\u0003¢\u0006\u0004\b>\u0010?\u001a]\u0010F\u001a\u00020\b2\u0006\u00107\u001a\u0002062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00105\u001a\u00020@2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\r2!\u0010E\u001a\u001d\u0012\u0013\u0012\u00110@¢\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020\b0,H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001ab\u0010M\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00105\u001a\u00020@2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\b0,2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\b\b\u0002\u0010J\u001a\u00020I2\b\b\u0002\u0010L\u001a\u00020K2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a7\u0010Q\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010P\u001a\u00020O2\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\b0*¢\u0006\u0002\b.H\u0003ø\u0001\u0000¢\u0006\u0004\bQ\u0010R\u001a*\u0010U\u001a\u00020T2\u0006\u00107\u001a\u0002062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\rH\u0001ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a+\u0010[\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020W0Z2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020WH\u0002¢\u0006\u0004\b[\u0010\\\u001a/\u0010a\u001a\u00020W2\u0006\u0010]\u001a\u00020W2\u0006\u0010^\u001a\u00020W2\u0006\u0010_\u001a\u00020\r2\u0006\u0010`\u001a\u00020\rH\u0002¢\u0006\u0004\ba\u0010b\u001a\u001f\u0010c\u001a\u00020W2\u0006\u0010\u0015\u001a\u00020W2\u0006\u0010 \u001a\u00020WH\u0002¢\u0006\u0004\bc\u0010d\u001a\u001b\u0010f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010e\u001a\u00020\u0010H\u0003¢\u0006\u0004\bf\u0010g\"\u0014\u0010i\u001a\u00020W8\u0002X\u0082T¢\u0006\u0006\n\u0004\bQ\u0010h\"\u0014\u0010l\u001a\u00020j8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010k\"\u0014\u0010m\u001a\u00020W8\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010h\"\u0014\u0010n\u001a\u00020W8\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010h\"\u0014\u0010p\u001a\u00020W8\u0002X\u0082T¢\u0006\u0006\n\u0004\bo\u0010h\"\u0014\u0010r\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010h\"\u0014\u0010s\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010h\"\u0014\u0010t\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010h\"\u0014\u0010u\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010h\"\u0014\u0010v\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010h\"\u0014\u0010w\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010h\"\u0014\u0010x\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010h\"\u0014\u0010y\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010h\"\u0014\u0010{\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010h\"\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\r0|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~\"\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\r0|8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010~\"\u001c\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\r0|8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010~\"\u0015\u0010\u0084\u0001\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010h\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u008a\u0001²\u0006\r\u0010\u0085\u0001\u001a\u00020\u00108\nX\u008a\u0084\u0002²\u0006\u000f\u0010\u0086\u0001\u001a\u00020@8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010\u0087\u0001\u001a\u00020@8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0089\u0001\u001a\u00030\u0088\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/material3/db;", "state", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/material3/za;", "colors", "Landroidx/compose/material3/cb;", "layoutType", "Lkotlin/k2;", "r", "(Landroidx/compose/material3/db;Landroidx/compose/ui/q;Landroidx/compose/material3/za;ILandroidx/compose/runtime/t;II)V", "l", "(Landroidx/compose/material3/db;Landroidx/compose/ui/q;Landroidx/compose/material3/za;Landroidx/compose/runtime/t;II)V", "", "initialHour", "initialMinute", "", "is24Hour", "i0", "(IIZLandroidx/compose/runtime/t;II)Landroidx/compose/material3/db;", "autoSwitchToMinute", "y", "(Landroidx/compose/material3/db;Landroidx/compose/ui/q;Landroidx/compose/material3/za;ZLandroidx/compose/runtime/t;II)V", "j", "m", "(Landroidx/compose/ui/q;Landroidx/compose/material3/za;Landroidx/compose/material3/db;Landroidx/compose/runtime/t;I)V", "h", "(Landroidx/compose/material3/db;Landroidx/compose/material3/za;Landroidx/compose/runtime/t;I)V", "w", "b", "i", "(Landroidx/compose/ui/q;Landroidx/compose/material3/db;Landroidx/compose/material3/za;Landroidx/compose/runtime/t;I)V", "x", "Landroidx/compose/ui/layout/m0;", "measurePolicy", "Landroidx/compose/ui/graphics/e6;", "startShape", "endShape", "k", "(Landroidx/compose/ui/q;Landroidx/compose/material3/db;Landroidx/compose/material3/za;Landroidx/compose/ui/layout/m0;Landroidx/compose/ui/graphics/e6;Landroidx/compose/ui/graphics/e6;Landroidx/compose/runtime/t;I)V", "checked", "shape", "Lkotlin/Function0;", "onClick", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/x1;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "content", "v", "(ZLandroidx/compose/ui/graphics/e6;Lld/a;Landroidx/compose/material3/za;Lld/q;Landroidx/compose/runtime/t;I)V", "g", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)V", "value", "Landroidx/compose/material3/u8;", "selection", "u", "(Landroidx/compose/ui/q;ILandroidx/compose/material3/db;ILandroidx/compose/material3/za;Landroidx/compose/runtime/t;I)V", "c", "(Landroidx/compose/material3/db;Landroidx/compose/material3/za;ZLandroidx/compose/runtime/t;I)V", "g0", "(Landroidx/compose/ui/q;Landroidx/compose/material3/db;Landroidx/compose/material3/za;)Landroidx/compose/ui/q;", "d", "(Landroidx/compose/ui/q;Landroidx/compose/material3/db;IZLandroidx/compose/runtime/t;I)V", "Landroidx/compose/ui/text/input/z0;", "prevValue", "max", "Lkotlin/r0;", "name", "onNewValue", "j0", "(ILandroidx/compose/material3/db;Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/z0;ILld/l;)V", "onValueChange", "Landroidx/compose/foundation/text/f0;", "keyboardOptions", "Landroidx/compose/foundation/text/d0;", "keyboardActions", "s", "(Landroidx/compose/ui/q;Landroidx/compose/ui/text/input/z0;Lld/l;Landroidx/compose/material3/db;ILandroidx/compose/foundation/text/f0;Landroidx/compose/foundation/text/d0;Landroidx/compose/material3/za;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/unit/h;", "radius", "a", "(Landroidx/compose/ui/q;FLld/p;Landroidx/compose/runtime/t;II)V", "number", "", "h0", "(IZILandroidx/compose/runtime/t;I)Ljava/lang/String;", "", "current", "new", "Lkotlin/q0;", "k0", "(FF)Lkotlin/q0;", "x1", "y1", "x2", "y2", "f0", "(FFII)F", "e0", "(FF)F", "visible", "l0", "(Landroidx/compose/ui/q;Z)Landroidx/compose/ui/q;", "F", "FullCircle", "", "D", "QuarterCircle", "RadiansPerMinute", "RadiansPerHour", "e", "SeparatorZIndex", "f", "OuterCircleSizeRadius", "InnerCircleRadius", "ClockDisplayBottomMargin", "ClockFaceBottomMargin", "DisplaySeparatorWidth", "SupportLabelTop", "TimeInputBottomPadding", "MaxDistance", "n", "MinimumInteractiveSize", "", "o", "Ljava/util/List;", "Minutes", "p", "Hours", "q", "ExtraHours", "PeriodToggleMargin", "touchExplorationServicesEnabled", "hourValue", "minuteValue", "Li0/f;", "center", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 12 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 13 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 14 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 15 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 16 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 17 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1843:1\n1116#2,6:1844\n1116#2,6:1930\n1116#2,6:1936\n1116#2,6:2184\n1116#2,6:2190\n1116#2,6:2197\n1116#2,6:2231\n1116#2,6:2237\n1116#2,6:2247\n1116#2,3:2301\n1119#2,3:2307\n1116#2,6:2311\n1116#2,6:2317\n1116#2,6:2325\n1116#2,3:2336\n1119#2,3:2342\n1116#2,6:2346\n1116#2,6:2352\n1116#2,6:2392\n1116#2,6:2403\n1116#2,6:2409\n1116#2,6:2487\n1116#2,6:2506\n1116#2,6:2512\n74#3,6:1850\n80#3:1884\n84#3:1889\n73#3,7:2022\n80#3:2057\n84#3:2102\n74#3,6:2415\n80#3:2449\n84#3:2505\n78#4,11:1856\n91#4:1888\n78#4,11:1896\n91#4:1928\n78#4,11:1948\n78#4,11:1983\n91#4:2015\n91#4:2020\n78#4,11:2029\n78#4,11:2064\n91#4:2096\n91#4:2101\n78#4,11:2110\n78#4,11:2145\n91#4:2177\n91#4:2182\n78#4,11:2203\n91#4:2246\n78#4,11:2260\n91#4:2292\n78#4,11:2363\n91#4:2401\n78#4,11:2421\n78#4,11:2458\n91#4:2497\n91#4:2504\n78#4,11:2518\n91#4:2549\n456#5,8:1867\n464#5,3:1881\n467#5,3:1885\n456#5,8:1907\n464#5,3:1921\n467#5,3:1925\n456#5,8:1959\n464#5,3:1973\n456#5,8:1994\n464#5,3:2008\n467#5,3:2012\n467#5,3:2017\n456#5,8:2040\n464#5,3:2054\n456#5,8:2075\n464#5,3:2089\n467#5,3:2093\n467#5,3:2098\n456#5,8:2121\n464#5,3:2135\n456#5,8:2156\n464#5,3:2170\n467#5,3:2174\n467#5,3:2179\n456#5,8:2214\n464#5,3:2228\n467#5,3:2243\n456#5,8:2271\n464#5,3:2285\n467#5,3:2289\n25#5:2300\n25#5:2335\n456#5,8:2374\n464#5,3:2388\n467#5,3:2398\n456#5,8:2432\n464#5,3:2446\n456#5,8:2469\n464#5,3:2483\n467#5,3:2494\n467#5,3:2501\n456#5,8:2529\n464#5,6:2543\n3737#6,6:1875\n3737#6,6:1915\n3737#6,6:1967\n3737#6,6:2002\n3737#6,6:2048\n3737#6,6:2083\n3737#6,6:2129\n3737#6,6:2164\n3737#6,6:2222\n3737#6,6:2279\n3737#6,6:2382\n3737#6,6:2440\n3737#6,6:2477\n3737#6,6:2537\n87#7,6:1890\n93#7:1924\n97#7:1929\n87#7,6:1942\n93#7:1976\n97#7:2021\n86#7,7:2103\n93#7:2138\n97#7:2183\n68#8,6:1977\n74#8:2011\n78#8:2016\n68#8,6:2058\n74#8:2092\n78#8:2097\n68#8,6:2139\n74#8:2173\n78#8:2178\n69#8,5:2255\n74#8:2288\n78#8:2293\n69#8,5:2358\n74#8:2391\n78#8:2402\n68#8,6:2452\n74#8:2486\n78#8:2498\n141#9:2196\n145#9:2294\n143#9:2295\n159#9:2450\n157#9:2451\n153#9:2499\n155#9:2500\n149#9:2550\n151#9:2551\n147#9:2552\n154#10:2253\n154#10:2564\n154#10:2565\n154#10:2566\n154#10:2567\n154#10:2568\n154#10:2569\n154#10:2570\n154#10:2571\n154#10:2572\n154#10:2584\n74#11:2254\n74#11:2323\n74#11:2493\n487#12,4:2296\n491#12,2:2304\n495#12:2310\n487#12,4:2331\n491#12,2:2339\n495#12:2345\n487#13:2306\n487#13:2341\n1#14:2324\n135#15:2553\n81#16:2554\n81#16:2555\n107#16,2:2556\n81#16:2558\n107#16,2:2559\n81#16:2561\n107#16,2:2562\n151#17,3:2573\n33#17,4:2576\n154#17,2:2580\n38#17:2582\n156#17:2583\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n*L\n559#1:1844,6\n819#1:1930,6\n822#1:1936,6\n1004#1:2184,6\n1049#1:2190,6\n1106#1:2197,6\n1117#1:2231,6\n1131#1:2237,6\n1153#1:2247,6\n1207#1:2301,3\n1207#1:2307,3\n1210#1:2311,6\n1214#1:2317,6\n1471#1:2325,6\n1472#1:2336,3\n1472#1:2342,3\n1492#1:2346,6\n1494#1:2352,6\n1503#1:2392,6\n1575#1:2403,6\n1576#1:2409,6\n1609#1:2487,6\n1667#1:2506,6\n1683#1:2512,6\n785#1:1850,6\n785#1:1884\n785#1:1889\n923#1:2022,7\n923#1:2057\n923#1:2102\n1583#1:2415,6\n1583#1:2449\n1583#1:2505\n785#1:1856,11\n785#1:1888\n803#1:1896,11\n803#1:1928\n826#1:1948,11\n907#1:1983,11\n907#1:2015\n826#1:2020\n923#1:2029,11\n926#1:2064,11\n926#1:2096\n923#1:2101\n942#1:2110,11\n945#1:2145,11\n945#1:2177\n942#1:2182\n1104#1:2203,11\n1104#1:2246\n1175#1:2260,11\n1175#1:2292\n1487#1:2363,11\n1487#1:2401\n1583#1:2421,11\n1602#1:2458,11\n1602#1:2497\n1583#1:2504\n1681#1:2518,11\n1681#1:2549\n785#1:1867,8\n785#1:1881,3\n785#1:1885,3\n803#1:1907,8\n803#1:1921,3\n803#1:1925,3\n826#1:1959,8\n826#1:1973,3\n907#1:1994,8\n907#1:2008,3\n907#1:2012,3\n826#1:2017,3\n923#1:2040,8\n923#1:2054,3\n926#1:2075,8\n926#1:2089,3\n926#1:2093,3\n923#1:2098,3\n942#1:2121,8\n942#1:2135,3\n945#1:2156,8\n945#1:2170,3\n945#1:2174,3\n942#1:2179,3\n1104#1:2214,8\n1104#1:2228,3\n1104#1:2243,3\n1175#1:2271,8\n1175#1:2285,3\n1175#1:2289,3\n1207#1:2300\n1472#1:2335\n1487#1:2374,8\n1487#1:2388,3\n1487#1:2398,3\n1583#1:2432,8\n1583#1:2446,3\n1602#1:2469,8\n1602#1:2483,3\n1602#1:2494,3\n1583#1:2501,3\n1681#1:2529,8\n1681#1:2543,6\n785#1:1875,6\n803#1:1915,6\n826#1:1967,6\n907#1:2002,6\n923#1:2048,6\n926#1:2083,6\n942#1:2129,6\n945#1:2164,6\n1104#1:2222,6\n1175#1:2279,6\n1487#1:2382,6\n1583#1:2440,6\n1602#1:2477,6\n1681#1:2537,6\n803#1:1890,6\n803#1:1924\n803#1:1929\n826#1:1942,6\n826#1:1976\n826#1:2021\n942#1:2103,7\n942#1:2138\n942#1:2183\n907#1:1977,6\n907#1:2011\n907#1:2016\n926#1:2058,6\n926#1:2092\n926#1:2097\n945#1:2139,6\n945#1:2173\n945#1:2178\n1175#1:2255,5\n1175#1:2288\n1175#1:2293\n1487#1:2358,5\n1487#1:2391\n1487#1:2402\n1602#1:2452,6\n1602#1:2486\n1602#1:2498\n1103#1:2196\n1199#1:2294\n1201#1:2295\n1596#1:2450\n1598#1:2451\n1655#1:2499\n1657#1:2500\n1727#1:2550\n1729#1:2551\n1731#1:2552\n1154#1:2253\n1787#1:2564\n1788#1:2565\n1789#1:2566\n1790#1:2567\n1791#1:2568\n1793#1:2569\n1794#1:2570\n1795#1:2571\n1796#1:2572\n1800#1:2584\n1167#1:2254\n1470#1:2323\n1615#1:2493\n1207#1:2296,4\n1207#1:2304,2\n1207#1:2310\n1472#1:2331,4\n1472#1:2339,2\n1472#1:2345\n1207#1:2306\n1472#1:2341\n1810#1:2553\n209#1:2554\n819#1:2555\n819#1:2556,2\n822#1:2558\n822#1:2559,2\n1471#1:2561\n1471#1:2562,2\n1799#1:2573,3\n1799#1:2576,4\n1799#1:2580,2\n1799#1:2582\n1799#1:2583\n*E\n"})
/* loaded from: classes.dex */
public final class bb {

    /* renamed from: a, reason: collision with root package name */
    private static final float f9994a = 6.2831855f;

    /* renamed from: b, reason: collision with root package name */
    private static final double f9995b = 1.5707963267948966d;

    /* renamed from: c, reason: collision with root package name */
    private static final float f9996c = 0.10471976f;

    /* renamed from: d, reason: collision with root package name */
    private static final float f9997d = 0.5235988f;

    /* renamed from: e, reason: collision with root package name */
    private static final float f9998e = 2.0f;

    /* renamed from: i, reason: collision with root package name */
    private static final float f10002i;

    /* renamed from: j, reason: collision with root package name */
    private static final float f10003j;

    /* renamed from: l, reason: collision with root package name */
    private static final float f10005l;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private static final List<Integer> f10009p;

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private static final List<Integer> f10010q;

    /* renamed from: r, reason: collision with root package name */
    private static final float f10011r;

    /* renamed from: f, reason: collision with root package name */
    private static final float f9999f = androidx.compose.ui.unit.h.g(101);

    /* renamed from: g, reason: collision with root package name */
    private static final float f10000g = 69;

    /* renamed from: h, reason: collision with root package name */
    private static final float f10001h = 36;

    /* renamed from: k, reason: collision with root package name */
    private static final float f10004k = 7;

    /* renamed from: m, reason: collision with root package name */
    private static final float f10006m = 74;

    /* renamed from: n, reason: collision with root package name */
    private static final float f10007n = 48;

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private static final List<Integer> f10008o = kotlin.collections.w.O(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$CircularLayout$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1843:1\n235#2,3:1844\n33#2,4:1847\n238#2,2:1851\n38#2:1853\n240#2:1854\n151#2,3:1855\n33#2,4:1858\n154#2,2:1862\n38#2:1864\n156#2:1865\n116#2,2:1866\n33#2,6:1868\n118#2:1874\n116#2,2:1875\n33#2,6:1877\n118#2:1883\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$CircularLayout$1$1\n*L\n1686#1:1844,3\n1686#1:1847,4\n1686#1:1851,2\n1686#1:1853\n1686#1:1854\n1688#1:1855,3\n1688#1:1858,4\n1688#1:1862,2\n1688#1:1864\n1688#1:1865\n1689#1:1866,2\n1689#1:1868,6\n1689#1:1874\n1690#1:1875,2\n1690#1:1877,6\n1690#1:1883\n*E\n"})
    static final class a implements androidx.compose.ui.layout.m0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f10012a;

        /* compiled from: TimePicker.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$CircularLayout$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1843:1\n69#2,6:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$CircularLayout$1$1$1\n*L\n1701#1:1844,6\n*E\n"})
        /* renamed from: androidx.compose.material3.bb$a$a, reason: collision with other inner class name */
        static final class C0220a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f10013b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<androidx.compose.ui.layout.i1> f10014c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f10015d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f10016e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f10017f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ float f10018g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0220a(androidx.compose.ui.layout.i1 i1Var, List<? extends androidx.compose.ui.layout.i1> list, androidx.compose.ui.layout.i1 i1Var2, long j4, float f4, float f5) {
                super(1);
                this.f10013b = i1Var;
                this.f10014c = list;
                this.f10015d = i1Var2;
                this.f10016e = j4;
                this.f10017f = f4;
                this.f10018g = f5;
            }

            public final void a(@fg.l i1.a aVar) {
                androidx.compose.ui.layout.i1 i1Var = this.f10013b;
                if (i1Var != null) {
                    i1.a.g(aVar, i1Var, 0, 0, 0.0f, 4, null);
                }
                List<androidx.compose.ui.layout.i1> list = this.f10014c;
                long j4 = this.f10016e;
                float f4 = this.f10017f;
                float f5 = this.f10018g;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    androidx.compose.ui.layout.i1 i1Var2 = list.get(i4);
                    int p4 = (androidx.compose.ui.unit.b.p(j4) / 2) - (i1Var2.getWidth() / 2);
                    int o4 = (androidx.compose.ui.unit.b.o(j4) / 2) - (i1Var2.getHeight() / 2);
                    double d5 = f4;
                    double d6 = (i4 * f5) - bb.f9995b;
                    i1.a.g(aVar, i1Var2, kotlin.math.b.K0((Math.cos(d6) * d5) + p4), kotlin.math.b.K0((Math.sin(d6) * d5) + o4), 0.0f, 4, null);
                }
                androidx.compose.ui.layout.i1 i1Var3 = this.f10015d;
                if (i1Var3 != null) {
                    i1.a.g(aVar, i1Var3, androidx.compose.material3.s.a(this.f10015d, androidx.compose.ui.unit.b.r(this.f10016e), 2), androidx.compose.material3.r.a(this.f10015d, androidx.compose.ui.unit.b.q(this.f10016e), 2), 0.0f, 4, null);
                }
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        a(float f4) {
            this.f10012a = f4;
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            androidx.compose.ui.layout.l0 l0Var;
            androidx.compose.ui.layout.l0 l0Var2;
            float v5 = o0Var.v5(this.f10012a);
            int i4 = 0;
            long e4 = androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 10, null);
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                androidx.compose.ui.layout.l0 l0Var3 = list.get(i5);
                androidx.compose.ui.layout.l0 l0Var4 = l0Var3;
                if (androidx.compose.ui.layout.w.a(l0Var4) != e6.Selector && androidx.compose.ui.layout.w.a(l0Var4) != e6.InnerCircle) {
                    arrayList.add(l0Var3);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i6 = 0; i6 < size2; i6 = androidx.compose.animation.n.a((androidx.compose.ui.layout.l0) arrayList.get(i6), e4, arrayList2, i6, 1)) {
            }
            int size3 = list.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size3) {
                    l0Var = null;
                    break;
                }
                l0Var = list.get(i7);
                if (androidx.compose.ui.layout.w.a(l0Var) == e6.Selector) {
                    break;
                }
                i7++;
            }
            androidx.compose.ui.layout.l0 l0Var5 = l0Var;
            int size4 = list.size();
            while (true) {
                if (i4 >= size4) {
                    l0Var2 = null;
                    break;
                }
                l0Var2 = list.get(i4);
                if (androidx.compose.ui.layout.w.a(l0Var2) == e6.InnerCircle) {
                    break;
                }
                i4++;
            }
            androidx.compose.ui.layout.l0 l0Var6 = l0Var2;
            return androidx.compose.ui.layout.o0.x2(o0Var, androidx.compose.ui.unit.b.r(j4), androidx.compose.ui.unit.b.q(j4), null, new C0220a(l0Var5 != null ? l0Var5.m0(e4) : null, arrayList2, l0Var6 != null ? l0Var6.m0(e4) : null, j4, v5, bb.f9994a / arrayList2.size()), 4, null);
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ db f10019b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10020c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ za f10021d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10022e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f10023f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f10024g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(db dbVar, androidx.compose.ui.q qVar, za zaVar, int i4, int i5, int i6) {
            super(2);
            this.f10019b = dbVar;
            this.f10020c = qVar;
            this.f10021d = zaVar;
            this.f10022e = i4;
            this.f10023f = i5;
            this.f10024g = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            bb.r(this.f10019b, this.f10020c, this.f10021d, this.f10022e, tVar, androidx.compose.runtime.g3.b(this.f10023f | 1), this.f10024g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10025b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f10026c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10027d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10028e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f10029f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.q qVar, float f4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4, int i5) {
            super(2);
            this.f10025b = qVar;
            this.f10026c = f4;
            this.f10027d = pVar;
            this.f10028e = i4;
            this.f10029f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            bb.a(this.f10025b, this.f10026c, this.f10027d, tVar, androidx.compose.runtime.g3.b(this.f10028e | 1), this.f10029f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class b0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10030b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(String str) {
            super(1);
            this.f10030b = str;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.a1(zVar, this.f10030b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockDisplayNumbers$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1843:1\n86#2,7:1844\n93#2:1879\n97#2:1884\n78#3,11:1851\n91#3:1883\n456#4,8:1862\n464#4,3:1876\n467#4,3:1880\n3737#5,6:1870\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockDisplayNumbers$1\n*L\n967#1:1844,7\n967#1:1879\n967#1:1884\n967#1:1851,11\n967#1:1883\n967#1:1862,8\n967#1:1876,3\n967#1:1880,3\n967#1:1870,6\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ db f10031b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ za f10032c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(db dbVar, za zaVar) {
            super(2);
            this.f10031b = dbVar;
            this.f10032c = zaVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-477913269, i4, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:966)");
            }
            db dbVar = this.f10031b;
            za zaVar = this.f10032c;
            tVar.P(693286680);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(androidx.compose.foundation.layout.i.f5073a.p(), androidx.compose.ui.c.INSTANCE.w(), tVar, 0);
            tVar.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(companion);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a5);
            } else {
                tVar.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion2, tVar, d5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.y1 y1Var = androidx.compose.foundation.layout.y1.f5410a;
            c0.k1 k1Var = c0.k1.f37594a;
            androidx.compose.ui.q y4 = androidx.compose.foundation.layout.c2.y(companion, k1Var.O(), k1Var.M());
            int i5 = dbVar.i();
            u8.Companion companion3 = u8.INSTANCE;
            companion3.getClass();
            bb.u(y4, i5, dbVar, u8.f14967c, zaVar, tVar, 3078);
            bb.g(androidx.compose.foundation.layout.c2.y(companion, bb.f10003j, k1Var.I()), tVar, 6);
            androidx.compose.ui.q y5 = androidx.compose.foundation.layout.c2.y(companion, k1Var.O(), k1Var.M());
            int j5 = dbVar.j();
            companion3.getClass();
            bb.u(y5, j5, dbVar, u8.f14968d, zaVar, tVar, 3078);
            if (androidx.compose.material3.t.a(tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "it", "a", "(Lld/p;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimePickerTextField$1$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1843:1\n154#2:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimePickerTextField$1$1$2\n*L\n1635#1:1844\n*E\n"})
    static final class c0 extends kotlin.jvm.internal.n0 implements ld.q<ld.p<? super androidx.compose.runtime.t, ? super Integer, ? extends kotlin.k2>, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f10033b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f10034c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ pa f10035d;

        /* compiled from: TimePicker.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.interaction.k f10036b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ pa f10037c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.foundation.interaction.k kVar, pa paVar) {
                super(2);
                this.f10036b = kVar;
                this.f10037c = paVar;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-968963953, i4, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1636)");
                }
                q7.f13678a.a(true, false, this.f10036b, this.f10037c, x8.e(c0.j1.f37525a.x(), tVar, 6), 0.0f, 0.0f, tVar, 12583350, 96);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(androidx.compose.ui.text.input.z0 z0Var, androidx.compose.foundation.interaction.k kVar, pa paVar) {
            super(3);
            this.f10033b = z0Var;
            this.f10034c = kVar;
            this.f10035d = paVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(ld.p<? super androidx.compose.runtime.t, ? super Integer, ? extends kotlin.k2> pVar, androidx.compose.runtime.t tVar, Integer num) {
            a(pVar, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        @androidx.compose.runtime.i
        public final void a(@fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            int i5;
            if ((i4 & 6) == 0) {
                i5 = i4 | (tVar.S(pVar) ? 4 : 2);
            } else {
                i5 = i4;
            }
            if ((i5 & 19) == 18 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(2133555260, i5, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1626)");
            }
            q7 q7Var = q7.f13678a;
            String i6 = this.f10033b.i();
            androidx.compose.ui.text.input.k1 c5 = androidx.compose.ui.text.input.k1.INSTANCE.c();
            androidx.compose.foundation.layout.l1 a5 = androidx.compose.foundation.layout.j1.a(androidx.compose.ui.unit.h.g(0));
            androidx.compose.foundation.interaction.k kVar = this.f10034c;
            pa paVar = this.f10035d;
            q7Var.b(i6, pVar, true, true, c5, kVar, false, null, null, null, null, null, null, null, paVar, a5, androidx.compose.runtime.internal.c.b(tVar, -968963953, true, new a(kVar, paVar)), tVar, ((i5 << 3) & 112) | 224640, 14352384, 16320);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ db f10038b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ za f10039c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10040d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(db dbVar, za zaVar, int i4) {
            super(2);
            this.f10038b = dbVar;
            this.f10039c = zaVar;
            this.f10040d = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            bb.b(this.f10038b, this.f10039c, tVar, androidx.compose.runtime.g3.b(this.f10040d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class d0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d0 f10041b = new d0(1);

        d0() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f10042b = new e(1);

        e() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.W0(zVar);
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.W0(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TimePickerKt$TimePickerTextField$2$1", f = "TimePicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class e0 extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f10043b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ db f10044c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10045d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.a0 f10046e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(db dbVar, int i4, androidx.compose.ui.focus.a0 a0Var, kotlin.coroutines.d<? super e0> dVar) {
            super(2, dVar);
            this.f10044c = dbVar;
            this.f10045d = i4;
            this.f10046e = a0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new e0(this.f10044c, this.f10045d, this.f10046e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f10043b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            if (u8.f(this.f10044c.l(), this.f10045d)) {
                this.f10046e.e();
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((e0) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "screen", "Lkotlin/k2;", "a", "(Ljava/util/List;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.q<List<? extends Integer>, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ db f10047b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f10048c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ za f10049d;

        /* compiled from: TimePicker.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ za f10050b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<Integer> f10051c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ db f10052d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f10053e;

            /* compiled from: TimePicker.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.jvm.internal.r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1843:1\n1116#2,6:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1\n*L\n1366#1:1844,6\n*E\n"})
            /* renamed from: androidx.compose.material3.bb$f$a$a, reason: collision with other inner class name */
            static final class C0221a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ List<Integer> f10054b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ db f10055c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f10056d;

                /* compiled from: TimePicker.kt */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material3.bb$f$a$a$a, reason: collision with other inner class name */
                static final class C0222a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ int f10057b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0222a(int i4) {
                        super(1);
                        this.f10057b = i4;
                    }

                    public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                        androidx.compose.ui.semantics.w.B1(zVar, this.f10057b);
                    }

                    @Override // ld.l
                    public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                        a(zVar);
                        return kotlin.k2.f75408a;
                    }
                }

                /* compiled from: TimePicker.kt */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
                @kotlin.jvm.internal.r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1843:1\n1116#2,6:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n*L\n1386#1:1844,6\n*E\n"})
                /* renamed from: androidx.compose.material3.bb$f$a$a$b */
                static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ db f10058b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ boolean f10059c;

                    /* compiled from: TimePicker.kt */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: androidx.compose.material3.bb$f$a$a$b$a, reason: collision with other inner class name */
                    static final class C0223a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ int f10060b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0223a(int i4) {
                            super(1);
                            this.f10060b = i4;
                        }

                        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                            androidx.compose.ui.semantics.w.B1(zVar, 12 + this.f10060b);
                        }

                        @Override // ld.l
                        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                            a(zVar);
                            return kotlin.k2.f75408a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(db dbVar, boolean z4) {
                        super(2);
                        this.f10058b = dbVar;
                        this.f10059c = z4;
                    }

                    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.i
                    public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                        if ((i4 & 3) == 2 && tVar.p()) {
                            tVar.d0();
                            return;
                        }
                        if (androidx.compose.runtime.x.b0()) {
                            androidx.compose.runtime.x.r0(-448649404, i4, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1382)");
                        }
                        int size = bb.f10010q.size();
                        db dbVar = this.f10058b;
                        boolean z4 = this.f10059c;
                        for (int i5 = 0; i5 < size; i5++) {
                            int intValue = ((Number) bb.f10010q.get(i5)).intValue();
                            q.Companion companion = androidx.compose.ui.q.INSTANCE;
                            tVar.P(-1469917176);
                            boolean f4 = tVar.f(i5);
                            Object Q = tVar.Q();
                            if (f4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                                Q = new C0223a(i5);
                                tVar.E(Q);
                            }
                            tVar.p0();
                            bb.d(androidx.compose.ui.semantics.o.f(companion, false, (ld.l) Q, 1, null), dbVar, intValue, z4, tVar, 0);
                        }
                        if (androidx.compose.runtime.x.b0()) {
                            androidx.compose.runtime.x.q0();
                        }
                    }

                    @Override // ld.p
                    public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                        a(tVar, num.intValue());
                        return kotlin.k2.f75408a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0221a(List<Integer> list, db dbVar, boolean z4) {
                    super(2);
                    this.f10054b = list;
                    this.f10055c = dbVar;
                    this.f10056d = z4;
                }

                @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.i
                public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                    int intValue;
                    boolean f4;
                    Object Q;
                    if ((i4 & 3) == 2 && tVar.p()) {
                        tVar.d0();
                        return;
                    }
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.r0(-2018362505, i4, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1358)");
                    }
                    tVar.P(-504293055);
                    int size = this.f10054b.size();
                    db dbVar = this.f10055c;
                    List<Integer> list = this.f10054b;
                    boolean z4 = this.f10056d;
                    for (int i5 = 0; i5 < size; i5++) {
                        if (dbVar.getIs24hour()) {
                            int l4 = dbVar.l();
                            u8.INSTANCE.getClass();
                            if (!u8.f(l4, u8.f14968d)) {
                                intValue = list.get(i5).intValue() % 12;
                                int i6 = intValue;
                                q.Companion companion = androidx.compose.ui.q.INSTANCE;
                                tVar.P(-1916851139);
                                f4 = tVar.f(i5);
                                Q = tVar.Q();
                                if (!f4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                                    Q = new C0222a(i5);
                                    tVar.E(Q);
                                }
                                tVar.p0();
                                bb.d(androidx.compose.ui.semantics.o.f(companion, false, (ld.l) Q, 1, null), dbVar, i6, z4, tVar, 0);
                            }
                        }
                        intValue = list.get(i5).intValue();
                        int i62 = intValue;
                        q.Companion companion2 = androidx.compose.ui.q.INSTANCE;
                        tVar.P(-1916851139);
                        f4 = tVar.f(i5);
                        Q = tVar.Q();
                        if (!f4) {
                        }
                        Q = new C0222a(i5);
                        tVar.E(Q);
                        tVar.p0();
                        bb.d(androidx.compose.ui.semantics.o.f(companion2, false, (ld.l) Q, 1, null), dbVar, i62, z4, tVar, 0);
                    }
                    tVar.p0();
                    int l5 = this.f10055c.l();
                    u8.INSTANCE.getClass();
                    if (u8.f(l5, u8.f14967c) && this.f10055c.getIs24hour()) {
                        androidx.compose.ui.q w4 = androidx.compose.foundation.layout.c2.w(androidx.compose.ui.layout.w.b(androidx.compose.ui.q.INSTANCE, e6.InnerCircle), c0.k1.f37594a.b());
                        androidx.compose.foundation.shape.o k4 = androidx.compose.foundation.shape.p.k();
                        androidx.compose.ui.graphics.d2.INSTANCE.getClass();
                        bb.a(androidx.compose.foundation.n.c(w4, androidx.compose.ui.graphics.d2.f17777n, k4), bb.f10000g, androidx.compose.runtime.internal.c.b(tVar, -448649404, true, new b(this.f10055c, this.f10056d)), tVar, 432, 0);
                    }
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.q0();
                    }
                }

                @Override // ld.p
                public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                    a(tVar, num.intValue());
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(za zaVar, List<Integer> list, db dbVar, boolean z4) {
                super(2);
                this.f10050b = zaVar;
                this.f10051c = list;
                this.f10052d = dbVar;
                this.f10053e = z4;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-1385633737, i4, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1355)");
                }
                androidx.compose.runtime.f0.b(p3.a().e(androidx.compose.ui.graphics.d2.n(this.f10050b.a(false))), androidx.compose.runtime.internal.c.b(tVar, -2018362505, true, new C0221a(this.f10051c, this.f10052d, this.f10053e)), tVar, androidx.compose.runtime.b3.f15974d | 48);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(db dbVar, boolean z4, za zaVar) {
            super(3);
            this.f10047b = dbVar;
            this.f10048c = z4;
            this.f10049d = zaVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(List<? extends Integer> list, androidx.compose.runtime.t tVar, Integer num) {
            a(list, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l List<Integer> list, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1628166511, i4, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1348)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            ClockDialModifier clockDialModifier = new ClockDialModifier(this.f10047b, this.f10048c);
            companion.getClass();
            bb.a(bb.g0(androidx.compose.foundation.layout.c2.w(clockDialModifier, c0.k1.f37594a.b()), this.f10047b, this.f10049d), bb.f9999f, androidx.compose.runtime.internal.c.b(tVar, -1385633737, true, new a(this.f10049d, list, this.f10047b, this.f10048c)), tVar, 432, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10061b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f10062c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.input.z0, kotlin.k2> f10063d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ db f10064e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f10065f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.f0 f10066g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.d0 f10067h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ za f10068i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f10069j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f10070k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f0(androidx.compose.ui.q qVar, androidx.compose.ui.text.input.z0 z0Var, ld.l<? super androidx.compose.ui.text.input.z0, kotlin.k2> lVar, db dbVar, int i4, androidx.compose.foundation.text.f0 f0Var, androidx.compose.foundation.text.d0 d0Var, za zaVar, int i5, int i6) {
            super(2);
            this.f10061b = qVar;
            this.f10062c = z0Var;
            this.f10063d = lVar;
            this.f10064e = dbVar;
            this.f10065f = i4;
            this.f10066g = f0Var;
            this.f10067h = d0Var;
            this.f10068i = zaVar;
            this.f10069j = i5;
            this.f10070k = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            bb.s(this.f10061b, this.f10062c, this.f10063d, this.f10064e, this.f10065f, this.f10066g, this.f10067h, this.f10068i, tVar, androidx.compose.runtime.g3.b(this.f10069j | 1), this.f10070k);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ db f10071b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ za f10072c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f10073d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10074e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(db dbVar, za zaVar, boolean z4, int i4) {
            super(2);
            this.f10071b = dbVar;
            this.f10072c = zaVar;
            this.f10073d = z4;
            this.f10074e = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            bb.c(this.f10071b, this.f10072c, this.f10073d, tVar, androidx.compose.runtime.g3.b(this.f10074e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class g0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10075b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(String str) {
            super(1);
            this.f10075b = str;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.i.INSTANCE.getClass();
            androidx.compose.ui.semantics.w.l1(zVar, androidx.compose.ui.semantics.i.f20312f);
            androidx.compose.ui.semantics.w.a1(zVar, this.f10075b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/u;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/u;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.layout.u, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<i0.f> f10076b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(androidx.compose.runtime.k2<i0.f> k2Var) {
            super(1);
            this.f10076b = k2Var;
        }

        public final void a(@fg.l androidx.compose.ui.layout.u uVar) {
            bb.f(this.f10076b, androidx.compose.ui.layout.v.a(uVar).o());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.layout.u uVar) {
            a(uVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class h0 extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10077b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ db f10078c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f10079d;

        /* compiled from: TimePicker.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TimePickerKt$TimeSelector$2$1$1", f = "TimePicker.kt", i = {}, l = {1218}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f10080b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ db f10081c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(db dbVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f10081c = dbVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f10081c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f10080b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    db dbVar = this.f10081c;
                    this.f10080b = 1;
                    if (dbVar.d(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(int i4, db dbVar, kotlinx.coroutines.r0 r0Var) {
            super(0);
            this.f10077b = i4;
            this.f10078c = dbVar;
            this.f10079d = r0Var;
        }

        public final void a() {
            if (u8.f(this.f10077b, this.f10078c.l())) {
                return;
            }
            this.f10078c.E(this.f10077b);
            kotlinx.coroutines.k.f(this.f10079d, null, null, new a(this.f10078c, null), 3, null);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f10082b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f10083c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ db f10084d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f10085e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f10086f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<i0.f> f10087g;

        /* compiled from: TimePicker.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f10088b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ db f10089c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ float f10090d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f10091e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k2<i0.f> f10092f;

            /* compiled from: TimePicker.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", f = "TimePicker.kt", i = {}, l = {1496}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.bb$i$a$a, reason: collision with other inner class name */
            static final class C0224a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f10093b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ db f10094c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ float f10095d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ boolean f10096e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.k2<i0.f> f10097f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0224a(db dbVar, float f4, boolean z4, androidx.compose.runtime.k2<i0.f> k2Var, kotlin.coroutines.d<? super C0224a> dVar) {
                    super(2, dVar);
                    this.f10094c = dbVar;
                    this.f10095d = f4;
                    this.f10096e = z4;
                    this.f10097f = k2Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0224a(this.f10094c, this.f10095d, this.f10096e, this.f10097f, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f10093b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        db dbVar = this.f10094c;
                        float p4 = i0.f.p(bb.e(this.f10097f));
                        float r4 = i0.f.r(bb.e(this.f10097f));
                        float f4 = this.f10095d;
                        boolean z4 = this.f10096e;
                        this.f10093b = 1;
                        if (dbVar.w(p4, r4, f4, z4, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    return kotlin.k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((C0224a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlinx.coroutines.r0 r0Var, db dbVar, float f4, boolean z4, androidx.compose.runtime.k2<i0.f> k2Var) {
                super(0);
                this.f10088b = r0Var;
                this.f10089c = dbVar;
                this.f10090d = f4;
                this.f10091e = z4;
                this.f10092f = k2Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                kotlinx.coroutines.k.f(this.f10088b, null, null, new C0224a(this.f10089c, this.f10090d, this.f10091e, this.f10092f, null), 3, null);
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z4, kotlinx.coroutines.r0 r0Var, db dbVar, float f4, boolean z5, androidx.compose.runtime.k2<i0.f> k2Var) {
            super(1);
            this.f10082b = z4;
            this.f10083c = r0Var;
            this.f10084d = dbVar;
            this.f10085e = f4;
            this.f10086f = z5;
            this.f10087g = k2Var;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.x0(zVar, null, new a(this.f10083c, this.f10084d, this.f10085e, this.f10086f, this.f10087g), 1, null);
            androidx.compose.ui.semantics.w.m1(zVar, this.f10082b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimeSelector$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1843:1\n67#2,7:1844\n74#2:1879\n78#2:1890\n78#3,11:1851\n91#3:1889\n456#4,8:1862\n464#4,3:1876\n467#4,3:1886\n3737#5,6:1870\n1116#6,6:1880\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimeSelector$3\n*L\n1233#1:1844,7\n1233#1:1879\n1233#1:1890\n1233#1:1851,11\n1233#1:1889\n1233#1:1862,8\n1233#1:1876,3\n1233#1:1886,3\n1233#1:1870,6\n1235#1:1880,6\n*E\n"})
    static final class i0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10098b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ db f10099c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10100d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f10101e;

        /* compiled from: TimePicker.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f10102b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f10102b = str;
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                androidx.compose.ui.semantics.w.a1(zVar, this.f10102b);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                a(zVar);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(int i4, db dbVar, int i5, long j4) {
            super(2);
            this.f10098b = i4;
            this.f10099c = dbVar;
            this.f10100d = i5;
            this.f10101e = j4;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1338709103, i4, -1, "androidx.compose.material3.TimeSelector.<anonymous> (TimePicker.kt:1225)");
            }
            String h02 = bb.h0(this.f10098b, this.f10099c.getIs24hour(), this.f10100d, tVar, 0);
            androidx.compose.ui.c i5 = androidx.compose.ui.c.INSTANCE.i();
            int i6 = this.f10100d;
            long j4 = this.f10101e;
            tVar.P(733328855);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.layout.m0 i7 = androidx.compose.foundation.layout.m.i(i5, false, tVar, 6);
            tVar.P(-1323940314);
            int j5 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(companion);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a5);
            } else {
                tVar.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion2, tVar, i7, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j5))) {
                androidx.compose.animation.d.a(j5, tVar, j5, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.p pVar = androidx.compose.foundation.layout.p.f5235a;
            tVar.P(992582240);
            boolean q02 = tVar.q0(h02);
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(h02);
                tVar.E(Q);
            }
            tVar.p0();
            xa.c(androidx.compose.material3.b.d(i6, 2, 0, false, 6, null), androidx.compose.ui.semantics.o.f(companion, false, (ld.l) Q, 1, null), j4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tVar, 0, 0, 131064);
            if (androidx.compose.material3.t.a(tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10103b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str) {
            super(1);
            this.f10103b = str;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.a1(zVar, this.f10103b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10104b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f10105c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ db f10106d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10107e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ za f10108f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f10109g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(androidx.compose.ui.q qVar, int i4, db dbVar, int i5, za zaVar, int i6) {
            super(2);
            this.f10104b = qVar;
            this.f10105c = i4;
            this.f10106d = dbVar;
            this.f10107e = i5;
            this.f10108f = zaVar;
            this.f10109g = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            bb.u(this.f10104b, this.f10105c, this.f10106d, this.f10107e, this.f10108f, tVar, androidx.compose.runtime.g3.b(this.f10109g | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10110b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ db f10111c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10112d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f10113e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f10114f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(androidx.compose.ui.q qVar, db dbVar, int i4, boolean z4, int i5) {
            super(2);
            this.f10110b = qVar;
            this.f10111c = dbVar;
            this.f10112d = i4;
            this.f10113e = z4;
            this.f10114f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            bb.d(this.f10110b, this.f10111c, this.f10112d, this.f10113e, tVar, androidx.compose.runtime.g3.b(this.f10114f | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class k0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f10115b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(boolean z4) {
            super(1);
            this.f10115b = z4;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.m1(zVar, this.f10115b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f10116b = new l(1);

        l() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class l0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f10117b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f10118c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f10119d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ za f10120e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f10121f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f10122g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l0(boolean z4, androidx.compose.ui.graphics.e6 e6Var, ld.a<kotlin.k2> aVar, za zaVar, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, int i4) {
            super(2);
            this.f10117b = z4;
            this.f10118c = e6Var;
            this.f10119d = aVar;
            this.f10120e = zaVar;
            this.f10121f = qVar;
            this.f10122g = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            bb.v(this.f10117b, this.f10118c, this.f10119d, this.f10120e, this.f10121f, tVar, androidx.compose.runtime.g3.b(this.f10122g | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class m extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10123b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f10124c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(androidx.compose.ui.q qVar, int i4) {
            super(2);
            this.f10123b = qVar;
            this.f10124c = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            bb.g(this.f10123b, tVar, androidx.compose.runtime.g3.b(this.f10124c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class m0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ db f10125b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ za f10126c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10127d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(db dbVar, za zaVar, int i4) {
            super(2);
            this.f10125b = dbVar;
            this.f10126c = zaVar;
            this.f10127d = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            bb.w(this.f10125b, this.f10126c, tVar, androidx.compose.runtime.g3.b(this.f10127d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class n extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ db f10128b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ za f10129c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10130d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(db dbVar, za zaVar, int i4) {
            super(2);
            this.f10128b = dbVar;
            this.f10129c = zaVar;
            this.f10130d = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            bb.h(this.f10128b, this.f10129c, tVar, androidx.compose.runtime.g3.b(this.f10130d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class n0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10131b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ db f10132c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ za f10133d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10134e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n0(androidx.compose.ui.q qVar, db dbVar, za zaVar, int i4) {
            super(2);
            this.f10131b = qVar;
            this.f10132c = dbVar;
            this.f10133d = zaVar;
            this.f10134e = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            bb.x(this.f10131b, this.f10132c, this.f10133d, tVar, androidx.compose.runtime.g3.b(this.f10134e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class o extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10135b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ db f10136c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ za f10137d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10138e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(androidx.compose.ui.q qVar, db dbVar, za zaVar, int i4) {
            super(2);
            this.f10135b = qVar;
            this.f10136c = dbVar;
            this.f10137d = zaVar;
            this.f10138e = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            bb.i(this.f10135b, this.f10136c, this.f10137d, tVar, androidx.compose.runtime.g3.b(this.f10138e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1843:1\n544#2,2:1844\n33#2,6:1846\n546#2:1852\n235#2,3:1853\n33#2,4:1856\n238#2,2:1860\n38#2:1862\n240#2:1863\n151#2,3:1864\n33#2,4:1867\n154#2,2:1871\n38#2:1873\n156#2:1874\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1\n*L\n1051#1:1844,2\n1051#1:1846,6\n1051#1:1852\n1059#1:1853,3\n1059#1:1856,4\n1059#1:1860,2\n1059#1:1862\n1059#1:1863\n1059#1:1864,3\n1059#1:1867,4\n1059#1:1871,2\n1059#1:1873\n1059#1:1874\n*E\n"})
    static final class o0 implements androidx.compose.ui.layout.m0 {

        /* renamed from: a, reason: collision with root package name */
        public static final o0 f10139a = new o0();

        /* compiled from: TimePicker.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<androidx.compose.ui.layout.i1> f10140b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f10141c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(List<? extends androidx.compose.ui.layout.i1> list, androidx.compose.ui.layout.i1 i1Var) {
                super(1);
                this.f10140b = list;
                this.f10141c = i1Var;
            }

            public final void a(@fg.l i1.a aVar) {
                i1.a.g(aVar, this.f10140b.get(0), 0, 0, 0.0f, 4, null);
                i1.a.g(aVar, this.f10140b.get(1), 0, this.f10140b.get(0).getHeight(), 0.0f, 4, null);
                i1.a.g(aVar, this.f10141c, 0, this.f10140b.get(0).getHeight() - (this.f10141c.getHeight() / 2), 0.0f, 4, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        o0() {
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                androidx.compose.ui.layout.l0 l0Var = list.get(i4);
                if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var), "Spacer")) {
                    androidx.compose.ui.layout.i1 m02 = l0Var.m0(androidx.compose.ui.unit.b.e(j4, 0, 0, 0, o0Var.q2(c0.k1.f37594a.y()), 3, null));
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        androidx.compose.ui.layout.l0 l0Var2 = list.get(i5);
                        if (!kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var2), "Spacer")) {
                            arrayList.add(l0Var2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size3 = arrayList.size();
                    int i6 = 0;
                    while (i6 < size3) {
                        i6 = androidx.compose.animation.n.a((androidx.compose.ui.layout.l0) arrayList.get(i6), androidx.compose.ui.unit.b.e(j4, 0, 0, 0, androidx.compose.ui.unit.b.o(j4) / 2, 3, null), arrayList2, i6, 1);
                    }
                    return androidx.compose.ui.layout.o0.x2(o0Var, androidx.compose.ui.unit.b.p(j4), androidx.compose.ui.unit.b.o(j4), null, new a(arrayList2, m02), 4, null);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1843:1\n544#2,2:1844\n33#2,6:1846\n546#2:1852\n235#2,3:1853\n33#2,4:1856\n238#2,2:1860\n38#2:1862\n240#2:1863\n151#2,3:1864\n33#2,4:1867\n154#2,2:1871\n38#2:1873\n156#2:1874\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1\n*L\n1006#1:1844,2\n1006#1:1846,6\n1006#1:1852\n1014#1:1853,3\n1014#1:1856,4\n1014#1:1860,2\n1014#1:1862\n1014#1:1863\n1014#1:1864,3\n1014#1:1867,4\n1014#1:1871,2\n1014#1:1873\n1014#1:1874\n*E\n"})
    static final class p implements androidx.compose.ui.layout.m0 {

        /* renamed from: a, reason: collision with root package name */
        public static final p f10142a = new p();

        /* compiled from: TimePicker.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<androidx.compose.ui.layout.i1> f10143b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f10144c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(List<? extends androidx.compose.ui.layout.i1> list, androidx.compose.ui.layout.i1 i1Var) {
                super(1);
                this.f10143b = list;
                this.f10144c = i1Var;
            }

            public final void a(@fg.l i1.a aVar) {
                i1.a.g(aVar, this.f10143b.get(0), 0, 0, 0.0f, 4, null);
                i1.a.g(aVar, this.f10143b.get(1), this.f10143b.get(0).getWidth(), 0, 0.0f, 4, null);
                i1.a.g(aVar, this.f10144c, this.f10143b.get(0).getWidth() - (this.f10144c.getWidth() / 2), 0, 0.0f, 4, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        p() {
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                androidx.compose.ui.layout.l0 l0Var = list.get(i4);
                if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var), "Spacer")) {
                    androidx.compose.ui.layout.i1 m02 = l0Var.m0(androidx.compose.ui.unit.b.e(j4, 0, o0Var.q2(c0.k1.f37594a.y()), 0, 0, 12, null));
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        androidx.compose.ui.layout.l0 l0Var2 = list.get(i5);
                        if (!kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var2), "Spacer")) {
                            arrayList.add(l0Var2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size3 = arrayList.size();
                    int i6 = 0;
                    while (i6 < size3) {
                        i6 = androidx.compose.animation.n.a((androidx.compose.ui.layout.l0) arrayList.get(i6), androidx.compose.ui.unit.b.e(j4, 0, androidx.compose.ui.unit.b.p(j4) / 2, 0, 0, 12, null), arrayList2, i6, 1);
                    }
                    return androidx.compose.ui.layout.o0.x2(o0Var, androidx.compose.ui.unit.b.p(j4), androidx.compose.ui.unit.b.o(j4), null, new a(arrayList2, m02), 4, null);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class p0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final p0 f10145b = new p0(1);

        p0() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.A1(zVar, true);
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.A1(zVar, true);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class q extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ db f10146b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10147c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ za f10148d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f10149e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f10150f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f10151g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(db dbVar, androidx.compose.ui.q qVar, za zaVar, boolean z4, int i4, int i5) {
            super(2);
            this.f10146b = dbVar;
            this.f10147c = qVar;
            this.f10148d = zaVar;
            this.f10149e = z4;
            this.f10150f = i4;
            this.f10151g = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            bb.j(this.f10146b, this.f10147c, this.f10148d, this.f10149e, tVar, androidx.compose.runtime.g3.b(this.f10150f | 1), this.f10151g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class q0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ db f10152b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10153c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ za f10154d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f10155e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f10156f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f10157g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q0(db dbVar, androidx.compose.ui.q qVar, za zaVar, boolean z4, int i4, int i5) {
            super(2);
            this.f10152b = dbVar;
            this.f10153c = qVar;
            this.f10154d = zaVar;
            this.f10155e = z4;
            this.f10156f = i4;
            this.f10157g = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            bb.y(this.f10152b, this.f10153c, this.f10154d, this.f10155e, tVar, androidx.compose.runtime.g3.b(this.f10156f | 1), this.f10157g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class r extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10158b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str) {
            super(1);
            this.f10158b = str;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.A1(zVar, true);
            androidx.compose.ui.semantics.w.a1(zVar, this.f10158b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class r0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.c, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ db f10159b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ za f10160c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r0(db dbVar, za zaVar) {
            super(1);
            this.f10159b = dbVar;
            this.f10160c = zaVar;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
            long a5 = i0.g.a(cVar.v5(androidx.compose.ui.unit.j.j(this.f10159b.m())), cVar.v5(androidx.compose.ui.unit.j.l(this.f10159b.m())));
            c0.k1 k1Var = c0.k1.f37594a;
            float f4 = 2;
            float v5 = cVar.v5(k1Var.j()) / f4;
            long selectorColor = this.f10160c.getSelectorColor();
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            long j4 = androidx.compose.ui.graphics.d2.f17766c;
            k1.Companion companion = androidx.compose.ui.graphics.k1.INSTANCE;
            companion.getClass();
            androidx.compose.ui.graphics.drawscope.f.u6(cVar, j4, v5, a5, 0.0f, null, null, androidx.compose.ui.graphics.k1.f17874c, 56, null);
            cVar.G6();
            companion.getClass();
            androidx.compose.ui.graphics.drawscope.f.u6(cVar, selectorColor, v5, a5, 0.0f, null, null, androidx.compose.ui.graphics.k1.f17885n, 56, null);
            float v52 = cVar.v5(k1Var.l());
            long u4 = i0.f.u(a5, i0.g.a(((float) Math.cos(this.f10159b.f().v().floatValue())) * v5, ((float) Math.sin(this.f10159b.f().v().floatValue())) * v5));
            long b5 = i0.o.b(cVar.e());
            companion.getClass();
            androidx.compose.ui.graphics.drawscope.f.R2(cVar, selectorColor, b5, u4, v52, 0, null, 0.0f, null, androidx.compose.ui.graphics.k1.f17877f, 240, null);
            androidx.compose.ui.graphics.drawscope.f.u6(cVar, selectorColor, cVar.v5(k1Var.g()) / f4, i0.o.b(cVar.e()), 0.0f, null, null, 0, 120, null);
            long a6 = this.f10160c.a(true);
            companion.getClass();
            androidx.compose.ui.graphics.drawscope.f.u6(cVar, a6, v5, a5, 0.0f, null, null, androidx.compose.ui.graphics.k1.f17878g, 56, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.c cVar) {
            a(cVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class s extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ db f10161b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(db dbVar) {
            super(0);
            this.f10161b = dbVar;
        }

        public final void a() {
            this.f10161b.x(false);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material3/db;", "a", "()Landroidx/compose/material3/db;"}, k = 3, mv = {1, 8, 0})
    static final class s0 extends kotlin.jvm.internal.n0 implements ld.a<db> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10162b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f10163c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f10164d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s0(int i4, int i5, boolean z4) {
            super(0);
            this.f10162b = i4;
            this.f10163c = i5;
            this.f10164d = z4;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final db invoke() {
            return new db(this.f10162b, this.f10163c, this.f10164d);
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class t extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ db f10165b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(db dbVar) {
            super(0);
            this.f10165b = dbVar;
        }

        public final void a() {
            this.f10165b.x(true);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n*L\n1#1,170:1\n1811#2,3:171\n*E\n"})
    public static final class t0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f10166b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(boolean z4) {
            super(1);
            this.f10166b = z4;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("visible");
            a2Var.getProperties().c("visible", Boolean.valueOf(this.f10166b));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class u extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10167b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ db f10168c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ za f10169d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.m0 f10170e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f10171f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f10172g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f10173h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(androidx.compose.ui.q qVar, db dbVar, za zaVar, androidx.compose.ui.layout.m0 m0Var, androidx.compose.ui.graphics.e6 e6Var, androidx.compose.ui.graphics.e6 e6Var2, int i4) {
            super(2);
            this.f10167b = qVar;
            this.f10168c = dbVar;
            this.f10169d = zaVar;
            this.f10170e = m0Var;
            this.f10171f = e6Var;
            this.f10172g = e6Var2;
            this.f10173h = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            bb.k(this.f10167b, this.f10168c, this.f10169d, this.f10170e, this.f10171f, this.f10172g, tVar, androidx.compose.runtime.g3.b(this.f10173h | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class v extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ db f10174b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10175c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ za f10176d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10177e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f10178f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(db dbVar, androidx.compose.ui.q qVar, za zaVar, int i4, int i5) {
            super(2);
            this.f10174b = dbVar;
            this.f10175c = qVar;
            this.f10176d = zaVar;
            this.f10177e = i4;
            this.f10178f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            bb.l(this.f10174b, this.f10175c, this.f10176d, tVar, androidx.compose.runtime.g3.b(this.f10177e | 1), this.f10178f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1843:1\n1116#2,6:1844\n1116#2,6:1850\n1116#2,6:1856\n1116#2,6:1862\n1116#2,6:1868\n1116#2,6:1874\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1\n*L\n840#1:1844,6\n852#1:1850,6\n867#1:1856,6\n873#1:1862,6\n886#1:1868,6\n901#1:1874,6\n*E\n"})
    static final class w extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> f10179b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ db f10180c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ za f10181d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> f10182e;

        /* compiled from: TimePicker.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/key/c;", "event", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.key.c, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ db f10183b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> f10184c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(db dbVar, androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var) {
                super(1);
                this.f10183b = dbVar;
                this.f10184c = k2Var;
            }

            @fg.l
            public final Boolean a(@fg.l KeyEvent keyEvent) {
                int unicodeChar = keyEvent.getUnicodeChar();
                if (48 <= unicodeChar && unicodeChar < 58 && androidx.compose.ui.text.t0.n(bb.J(this.f10184c).getSelection()) == 2 && this.f10184c.getValue().i().length() == 2) {
                    db dbVar = this.f10183b;
                    u8.INSTANCE.getClass();
                    dbVar.E(u8.f14968d);
                }
                return Boolean.FALSE;
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
                return a(cVar.h());
            }
        }

        /* compiled from: TimePicker.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/z0;", "newValue", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/z0;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.input.z0, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ db f10185b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> f10186c;

            /* compiled from: TimePicker.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/z0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/z0;)V"}, k = 3, mv = {1, 8, 0})
            static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.input.z0, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> f10187b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var) {
                    super(1);
                    this.f10187b = k2Var;
                }

                public final void a(@fg.l androidx.compose.ui.text.input.z0 z0Var) {
                    bb.K(this.f10187b, z0Var);
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.text.input.z0 z0Var) {
                    a(z0Var);
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(db dbVar, androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var) {
                super(1);
                this.f10185b = dbVar;
                this.f10186c = k2Var;
            }

            public final void a(@fg.l androidx.compose.ui.text.input.z0 z0Var) {
                u8.INSTANCE.getClass();
                bb.j0(u8.f14967c, this.f10185b, z0Var, bb.J(this.f10186c), this.f10185b.getIs24hour() ? 23 : 12, new a(this.f10186c));
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.text.input.z0 z0Var) {
                a(z0Var);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: TimePicker.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/c0;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text/c0;)V"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.foundation.text.c0, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ db f10188b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(db dbVar) {
                super(1);
                this.f10188b = dbVar;
            }

            public final void a(@fg.l androidx.compose.foundation.text.c0 c0Var) {
                db dbVar = this.f10188b;
                u8.INSTANCE.getClass();
                dbVar.E(u8.f14968d);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.foundation.text.c0 c0Var) {
                a(c0Var);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: TimePicker.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/key/c;", "event", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.key.c, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ db f10189b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> f10190c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(db dbVar, androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var) {
                super(1);
                this.f10189b = dbVar;
                this.f10190c = k2Var;
            }

            @fg.l
            public final Boolean a(@fg.l KeyEvent keyEvent) {
                boolean z4 = keyEvent.getUnicodeChar() == 0 && androidx.compose.ui.text.t0.n(bb.L(this.f10190c).getSelection()) == 0;
                if (z4) {
                    db dbVar = this.f10189b;
                    u8.INSTANCE.getClass();
                    dbVar.E(u8.f14967c);
                }
                return Boolean.valueOf(z4);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
                return a(cVar.h());
            }
        }

        /* compiled from: TimePicker.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/z0;", "newValue", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/z0;)V"}, k = 3, mv = {1, 8, 0})
        static final class e extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.input.z0, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ db f10191b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> f10192c;

            /* compiled from: TimePicker.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/z0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/z0;)V"}, k = 3, mv = {1, 8, 0})
            static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.input.z0, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> f10193b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var) {
                    super(1);
                    this.f10193b = k2Var;
                }

                public final void a(@fg.l androidx.compose.ui.text.input.z0 z0Var) {
                    bb.M(this.f10193b, z0Var);
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.text.input.z0 z0Var) {
                    a(z0Var);
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(db dbVar, androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var) {
                super(1);
                this.f10191b = dbVar;
                this.f10192c = k2Var;
            }

            public final void a(@fg.l androidx.compose.ui.text.input.z0 z0Var) {
                u8.INSTANCE.getClass();
                bb.j0(u8.f14968d, this.f10191b, z0Var, bb.L(this.f10192c), 59, new a(this.f10192c));
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.text.input.z0 z0Var) {
                a(z0Var);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: TimePicker.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/c0;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text/c0;)V"}, k = 3, mv = {1, 8, 0})
        static final class f extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.foundation.text.c0, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ db f10194b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(db dbVar) {
                super(1);
                this.f10194b = dbVar;
            }

            public final void a(@fg.l androidx.compose.foundation.text.c0 c0Var) {
                db dbVar = this.f10194b;
                u8.INSTANCE.getClass();
                dbVar.E(u8.f14968d);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.foundation.text.c0 c0Var) {
                a(c0Var);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var, db dbVar, za zaVar, androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var2) {
            super(2);
            this.f10179b = k2Var;
            this.f10180c = dbVar;
            this.f10181d = zaVar;
            this.f10182e = k2Var2;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1306700887, i4, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:837)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            tVar.P(-1645133303);
            boolean q02 = tVar.q0(this.f10179b) | tVar.q0(this.f10180c);
            db dbVar = this.f10180c;
            androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var = this.f10179b;
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(dbVar, k2Var);
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.ui.q a5 = androidx.compose.ui.input.key.f.a(companion, (ld.l) Q);
            androidx.compose.ui.text.input.z0 J = bb.J(this.f10179b);
            tVar.P(-1645132823);
            boolean q03 = tVar.q0(this.f10180c) | tVar.q0(this.f10179b);
            db dbVar2 = this.f10180c;
            androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var2 = this.f10179b;
            Object Q2 = tVar.Q();
            if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q2 = new b(dbVar2, k2Var2);
                tVar.E(Q2);
            }
            ld.l lVar = (ld.l) Q2;
            tVar.p0();
            db dbVar3 = this.f10180c;
            u8.Companion companion2 = u8.INSTANCE;
            companion2.getClass();
            int i5 = u8.f14967c;
            y.Companion companion3 = androidx.compose.ui.text.input.y.INSTANCE;
            companion3.getClass();
            int i6 = androidx.compose.ui.text.input.y.f21137i;
            g0.Companion companion4 = androidx.compose.ui.text.input.g0.INSTANCE;
            companion4.getClass();
            androidx.compose.foundation.text.f0 f0Var = new androidx.compose.foundation.text.f0(0, false, androidx.compose.ui.text.input.g0.f21027e, i6, null, 19, null);
            tVar.P(-1645132161);
            boolean q04 = tVar.q0(this.f10180c);
            db dbVar4 = this.f10180c;
            Object Q3 = tVar.Q();
            if (q04 || Q3 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q3 = new c(dbVar4);
                tVar.E(Q3);
            }
            tVar.p0();
            bb.s(a5, J, lVar, dbVar3, i5, f0Var, new androidx.compose.foundation.text.d0(null, null, (ld.l) Q3, null, null, null, 59, null), this.f10181d, tVar, 24576, 0);
            bb.g(androidx.compose.foundation.layout.c2.y(companion, bb.f10003j, c0.j1.f37525a.f()), tVar, 6);
            tVar.P(-1645131867);
            boolean q05 = tVar.q0(this.f10182e) | tVar.q0(this.f10180c);
            db dbVar5 = this.f10180c;
            androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var3 = this.f10182e;
            Object Q4 = tVar.Q();
            if (q05 || Q4 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q4 = new d(dbVar5, k2Var3);
                tVar.E(Q4);
            }
            tVar.p0();
            androidx.compose.ui.q b5 = androidx.compose.ui.input.key.f.b(companion, (ld.l) Q4);
            androidx.compose.ui.text.input.z0 value = this.f10182e.getValue();
            tVar.P(-1645131419);
            boolean q06 = tVar.q0(this.f10180c) | tVar.q0(this.f10182e);
            db dbVar6 = this.f10180c;
            androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var4 = this.f10182e;
            Object Q5 = tVar.Q();
            if (q06 || Q5 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q5 = new e(dbVar6, k2Var4);
                tVar.E(Q5);
            }
            ld.l lVar2 = (ld.l) Q5;
            tVar.p0();
            db dbVar7 = this.f10180c;
            companion2.getClass();
            int i7 = u8.f14968d;
            companion3.getClass();
            int i10 = androidx.compose.ui.text.input.y.f21138j;
            companion4.getClass();
            androidx.compose.foundation.text.f0 f0Var2 = new androidx.compose.foundation.text.f0(0, false, androidx.compose.ui.text.input.g0.f21027e, i10, null, 19, null);
            tVar.P(-1645130777);
            boolean q07 = tVar.q0(this.f10180c);
            db dbVar8 = this.f10180c;
            Object Q6 = tVar.Q();
            if (q07 || Q6 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q6 = new f(dbVar8);
                tVar.E(Q6);
            }
            tVar.p0();
            bb.s(b5, value, lVar2, dbVar7, i7, f0Var2, new androidx.compose.foundation.text.d0(null, null, (ld.l) Q6, null, null, null, 59, null), this.f10181d, tVar, 24576, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class x extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10195b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ za f10196c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ db f10197d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10198e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(androidx.compose.ui.q qVar, za zaVar, db dbVar, int i4) {
            super(2);
            this.f10195b = qVar;
            this.f10196c = zaVar;
            this.f10197d = dbVar;
            this.f10198e = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            bb.m(this.f10195b, this.f10196c, this.f10197d, tVar, androidx.compose.runtime.g3.b(this.f10198e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/k2;", "Landroidx/compose/ui/text/input/z0;", "a", "()Landroidx/compose/runtime/k2;"}, k = 3, mv = {1, 8, 0})
    static final class y extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ db f10199b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(db dbVar) {
            super(0);
            this.f10199b = dbVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> invoke() {
            androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> g4;
            g4 = androidx.compose.runtime.t4.g(new androidx.compose.ui.text.input.z0(androidx.compose.material3.b.d(this.f10199b.i(), 2, 0, false, 6, null), 0L, (androidx.compose.ui.text.t0) null, 6, (kotlin.jvm.internal.w) null), null, 2, null);
            return g4;
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/k2;", "Landroidx/compose/ui/text/input/z0;", "a", "()Landroidx/compose/runtime/k2;"}, k = 3, mv = {1, 8, 0})
    static final class z extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ db f10200b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(db dbVar) {
            super(0);
            this.f10200b = dbVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> invoke() {
            androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> g4;
            g4 = androidx.compose.runtime.t4.g(new androidx.compose.ui.text.input.z0(androidx.compose.material3.b.d(this.f10200b.j(), 2, 0, false, 6, null), 0L, (androidx.compose.ui.text.t0) null, 6, (kotlin.jvm.internal.w) null), null, 2, null);
            return g4;
        }
    }

    static {
        float f4 = 24;
        f10002i = f4;
        f10003j = f4;
        f10005l = f4;
        List<Integer> O = kotlin.collections.w.O(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        f10009p = O;
        ArrayList arrayList = new ArrayList(O.size());
        int size = O.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(Integer.valueOf((O.get(i4).intValue() % 12) + 12));
        }
        f10010q = arrayList;
        f10011r = 12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.ui.text.input.z0 J(androidx.compose.runtime.k2 k2Var) {
        return (androidx.compose.ui.text.input.z0) k2Var.getValue();
    }

    public static final void K(androidx.compose.runtime.k2 k2Var, androidx.compose.ui.text.input.z0 z0Var) {
        k2Var.setValue(z0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.ui.text.input.z0 L(androidx.compose.runtime.k2 k2Var) {
        return (androidx.compose.ui.text.input.z0) k2Var.getValue();
    }

    public static final void M(androidx.compose.runtime.k2 k2Var, androidx.compose.ui.text.input.z0 z0Var) {
        k2Var.setValue(z0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void a(androidx.compose.ui.q qVar, float f4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(1548175696);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= o4.d(f4) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i4 & 384) == 0) {
            i6 |= o4.S(pVar) ? 256 : 128;
        }
        if ((i6 & 147) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (i7 != 0) {
                qVar = androidx.compose.ui.q.INSTANCE;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1548175696, i6, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1679)");
            }
            o4.P(1651957759);
            boolean z4 = (i6 & 112) == 32;
            Object Q = o4.Q();
            if (z4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(f4);
                o4.E(Q);
            }
            androidx.compose.ui.layout.m0 m0Var = (androidx.compose.ui.layout.m0) Q;
            o4.p0();
            int i10 = ((i6 >> 6) & 14) | ((i6 << 3) & 112);
            o4.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(qVar);
            int i11 = ((i10 << 9) & 7168) | 6;
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a5);
            } else {
                o4.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion, o4, m0Var, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            pVar.invoke(o4, Integer.valueOf((i11 >> 9) & 14));
            o4.p0();
            o4.H();
            o4.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.ui.q qVar2 = qVar;
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new b(qVar2, f4, pVar, i4, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void b(db dbVar, za zaVar, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-934561141);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(dbVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.q0(zaVar) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-934561141, i5, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:962)");
            }
            androidx.compose.runtime.f0.b(xa.f().e(tb.a(p6.f13227a.c(o4, 6), c0.k1.f37594a.P())), androidx.compose.runtime.internal.c.b(o4, -477913269, true, new c(dbVar, zaVar)), o4, androidx.compose.runtime.b3.f15974d | 48);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new d(dbVar, zaVar, i4));
        }
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void c(@fg.l db dbVar, @fg.l za zaVar, boolean z4, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-1525091100);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(dbVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.q0(zaVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.b(z4) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1525091100, i5, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1339)");
            }
            androidx.compose.animation.z.b(dbVar.n(), androidx.compose.ui.semantics.o.f(androidx.compose.foundation.layout.c2.w(androidx.compose.foundation.n.c(androidx.compose.ui.q.INSTANCE, zaVar.getClockDialColor(), androidx.compose.foundation.shape.p.k()), c0.k1.f37594a.b()), false, e.f10042b, 1, null), androidx.compose.animation.core.l.r(350, 0, null, 6, null), null, androidx.compose.runtime.internal.c.b(o4, 1628166511, true, new f(dbVar, z4, zaVar)), o4, 24576, 8);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new g(dbVar, zaVar, z4, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void d(androidx.compose.ui.q qVar, db dbVar, int i4, boolean z4, androidx.compose.runtime.t tVar, int i5) {
        int i6;
        androidx.compose.runtime.t tVar2;
        androidx.compose.runtime.t o4 = tVar.o(-1420123631);
        if ((i5 & 6) == 0) {
            i6 = (o4.q0(qVar) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= o4.q0(dbVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= o4.f(i4) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= o4.b(z4) ? 2048 : 1024;
        }
        int i7 = i6;
        if ((i7 & 1171) == 1170 && o4.p()) {
            o4.d0();
            tVar2 = o4;
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1420123631, i7, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1467)");
            }
            androidx.compose.ui.text.v0 a5 = tb.a(p6.f13227a.c(o4, 6), c0.k1.f37594a.c());
            float v5 = ((androidx.compose.ui.unit.d) o4.x(androidx.compose.ui.platform.h1.i())).v5(f10006m);
            o4.P(-1652988653);
            Object Q = o4.Q();
            t.Companion companion = androidx.compose.runtime.t.INSTANCE;
            if (Q == companion.a()) {
                i0.f.INSTANCE.getClass();
                Q = androidx.compose.runtime.t4.g(i0.f.d(i0.f.f74147c), null, 2, null);
                o4.E(Q);
            }
            androidx.compose.runtime.k2 k2Var = (androidx.compose.runtime.k2) Q;
            o4.p0();
            o4.P(773894976);
            o4.P(-492369756);
            Object Q2 = o4.Q();
            if (Q2 == companion.a()) {
                Q2 = androidx.view.compose.l.a(androidx.compose.runtime.a1.m(kotlin.coroutines.i.f75057b, o4), o4);
            }
            o4.p0();
            kotlinx.coroutines.r0 coroutineScope = ((androidx.compose.runtime.j0) Q2).getCoroutineScope();
            o4.p0();
            String h02 = h0(dbVar.l(), dbVar.getIs24hour(), i4, o4, i7 & 896);
            String d5 = androidx.compose.material3.b.d(i4, 0, 0, false, 7, null);
            int l4 = dbVar.l();
            u8.INSTANCE.getClass();
            boolean g4 = u8.f(l4, u8.f14968d) ? kotlin.jvm.internal.l0.g(androidx.compose.material3.b.d(dbVar.j(), 0, 0, false, 7, null), d5) : kotlin.jvm.internal.l0.g(androidx.compose.material3.b.d(dbVar.g(), 0, 0, false, 7, null), d5);
            androidx.compose.ui.c i10 = androidx.compose.ui.c.INSTANCE.i();
            androidx.compose.ui.q w4 = androidx.compose.foundation.layout.c2.w(a6.f(qVar), f10007n);
            o4.P(-1652987978);
            Object Q3 = o4.Q();
            if (Q3 == companion.a()) {
                Q3 = new h(k2Var);
                o4.E(Q3);
            }
            o4.p0();
            androidx.compose.ui.q c5 = FocusableKt.c(androidx.compose.ui.layout.w0.a(w4, (ld.l) Q3), false, null, 3, null);
            o4.P(-1652987865);
            boolean S = o4.S(coroutineScope) | ((i7 & 112) == 32) | o4.d(v5) | ((i7 & 7168) == 2048) | o4.b(g4);
            Object Q4 = o4.Q();
            if (S || Q4 == companion.a()) {
                Q4 = new i(g4, coroutineScope, dbVar, v5, z4, k2Var);
                o4.E(Q4);
            }
            o4.p0();
            androidx.compose.ui.q e4 = androidx.compose.ui.semantics.o.e(c5, true, (ld.l) Q4);
            o4.P(733328855);
            androidx.compose.ui.layout.m0 i11 = androidx.compose.foundation.layout.m.i(i10, false, o4, 6);
            o4.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(e4);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a6);
            } else {
                o4.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion2, o4, i11, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, a7);
            }
            androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.p pVar = androidx.compose.foundation.layout.p.f5235a;
            q.Companion companion3 = androidx.compose.ui.q.INSTANCE;
            o4.P(859631475);
            boolean q02 = o4.q0(h02);
            Object Q5 = o4.Q();
            if (q02 || Q5 == companion.a()) {
                Q5 = new j(h02);
                o4.E(Q5);
            }
            o4.p0();
            androidx.compose.ui.q c6 = androidx.compose.ui.semantics.o.c(companion3, (ld.l) Q5);
            tVar2 = o4;
            xa.c(d5, c6, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, a5, tVar2, 0, 0, 65532);
            if (androidx.compose.material3.t.a(tVar2)) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = tVar2.t();
        if (t4 != null) {
            t4.a(new k(qVar, dbVar, i4, z4, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(androidx.compose.runtime.k2<i0.f> k2Var) {
        return k2Var.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e0(float f4, float f5) {
        float atan2 = ((float) Math.atan2(f4, f5)) - 1.5707964f;
        return atan2 < 0.0f ? atan2 + f9994a : atan2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(androidx.compose.runtime.k2<i0.f> k2Var, long j4) {
        k2Var.setValue(i0.f.d(j4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f0(float f4, float f5, int i4, int i5) {
        return (float) Math.hypot(i4 - f4, i5 - f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void g(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.ui.text.v0 l4;
        androidx.compose.runtime.t tVar2;
        androidx.compose.runtime.t o4 = tVar.o(2100674302);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) == 2 && o4.p()) {
            o4.d0();
            tVar2 = o4;
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(2100674302, i5, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1165)");
            }
            androidx.compose.ui.text.v0 v0Var = (androidx.compose.ui.text.v0) o4.x(xa.f());
            androidx.compose.ui.text.style.j.INSTANCE.getClass();
            int i6 = androidx.compose.ui.text.style.j.f21356e;
            h.a.INSTANCE.getClass();
            float f4 = h.a.f21341d;
            h.c.INSTANCE.getClass();
            l4 = v0Var.l((r48 & 1) != 0 ? v0Var.spanStyle.m() : 0L, (r48 & 2) != 0 ? v0Var.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? v0Var.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? v0Var.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? v0Var.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? v0Var.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? v0Var.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? v0Var.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? v0Var.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? v0Var.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? v0Var.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? v0Var.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? v0Var.spanStyle.getBackground() : null, (r48 & 8192) != 0 ? v0Var.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? v0Var.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? v0Var.paragraphStyle.getTextAlign() : i6, (r48 & 65536) != 0 ? v0Var.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? v0Var.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? v0Var.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? v0Var.platformStyle : null, (r48 & 1048576) != 0 ? v0Var.paragraphStyle.getLineHeightStyle() : new androidx.compose.ui.text.style.h(f4, h.c.f21350g, null), (r48 & 2097152) != 0 ? v0Var.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? v0Var.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? v0Var.paragraphStyle.getTextMotion() : null);
            androidx.compose.ui.q c5 = androidx.compose.ui.semantics.o.c(qVar, l.f10116b);
            androidx.compose.ui.c i7 = androidx.compose.ui.c.INSTANCE.i();
            o4.P(733328855);
            androidx.compose.ui.layout.m0 i10 = androidx.compose.foundation.layout.m.i(i7, false, o4, 6);
            o4.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(c5);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a5);
            } else {
                o4.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion, o4, i10, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.p pVar = androidx.compose.foundation.layout.p.f5235a;
            tVar2 = o4;
            xa.c(":", null, b3.k(c0.j1.f37525a.G(), o4, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, l4, tVar2, 6, 0, 65530);
            if (androidx.compose.material3.t.a(tVar2)) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = tVar2.t();
        if (t4 != null) {
            t4.a(new m(qVar, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.q g0(androidx.compose.ui.q qVar, db dbVar, za zaVar) {
        return androidx.compose.ui.draw.l.d(qVar, new r0(dbVar, zaVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void h(db dbVar, za zaVar, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(755539561);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(dbVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.q0(zaVar) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(755539561, i5, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:921)");
            }
            i.f f4 = androidx.compose.foundation.layout.i.f5073a.f();
            o4.P(-483455358);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            c.Companion companion2 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.m0 b5 = androidx.compose.foundation.layout.t.b(f4, companion2.u(), o4, 6);
            o4.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion3 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(companion);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a5);
            } else {
                o4.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion3, o4, b5, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
            b(dbVar, zaVar, o4, i5 & 126);
            o4.P(-552392411);
            if (!dbVar.getIs24hour()) {
                androidx.compose.ui.q o5 = androidx.compose.foundation.layout.j1.o(companion, 0.0f, f10011r, 0.0f, 0.0f, 13, null);
                o4.P(733328855);
                androidx.compose.ui.layout.m0 a7 = androidx.compose.animation.a0.a(companion2, false, o4, 0, -1323940314);
                int j5 = androidx.compose.runtime.p.j(o4, 0);
                androidx.compose.runtime.g0 B2 = o4.B();
                ld.a<androidx.compose.ui.node.g> a8 = companion3.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(o5);
                if (o4.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                o4.W();
                if (o4.getInserting()) {
                    o4.F(a8);
                } else {
                    o4.C();
                }
                ld.p a10 = androidx.compose.animation.p.a(companion3, o4, a7, o4, B2);
                if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j5))) {
                    androidx.compose.animation.d.a(j5, o4, j5, a10);
                }
                androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
                androidx.compose.foundation.layout.p pVar = androidx.compose.foundation.layout.p.f5235a;
                c0.k1 k1Var = c0.k1.f37594a;
                int i6 = i5 << 3;
                i(androidx.compose.foundation.layout.c2.y(companion, k1Var.v(), k1Var.u()), dbVar, zaVar, o4, (i6 & 896) | (i6 & 112) | 6);
                o4.p0();
                o4.H();
                o4.p0();
                o4.p0();
            }
            if (androidx.compose.animation.y.a(o4)) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new n(dbVar, zaVar, i4));
        }
    }

    @fg.l
    @androidx.compose.runtime.d3
    @androidx.compose.runtime.i
    public static final String h0(int i4, boolean z4, int i5, @fg.m androidx.compose.runtime.t tVar, int i6) {
        int i7;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1826155772, i6, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1724)");
        }
        u8.INSTANCE.getClass();
        if (u8.f(i4, u8.f14968d)) {
            t9.Companion companion = t9.INSTANCE;
            i7 = x7.a.Y;
        } else if (z4) {
            t9.Companion companion2 = t9.INSTANCE;
            i7 = x7.a.S;
        } else {
            t9.Companion companion3 = t9.INSTANCE;
            i7 = x7.a.U;
        }
        String b5 = v9.b(i7, new Object[]{Integer.valueOf(i5)}, tVar, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        return b5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void i(androidx.compose.ui.q qVar, db dbVar, za zaVar, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(1261215927);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.q0(dbVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.q0(zaVar) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1261215927, i5, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1002)");
            }
            o4.P(759555873);
            Object Q = o4.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = p.f10142a;
                o4.E(Q);
            }
            androidx.compose.ui.layout.m0 m0Var = (androidx.compose.ui.layout.m0) Q;
            o4.p0();
            androidx.compose.ui.graphics.e6 e4 = x8.e(c0.k1.f37594a.t(), o4, 6);
            kotlin.jvm.internal.l0.n(e4, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            androidx.compose.foundation.shape.e eVar = (androidx.compose.foundation.shape.e) e4;
            k(qVar, dbVar, zaVar, m0Var, x8.f(eVar), x8.b(eVar), o4, (i5 & 14) | 3072 | (i5 & 112) | (i5 & 896));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new o(qVar, dbVar, zaVar, i4));
        }
    }

    @fg.l
    @f5
    @androidx.compose.runtime.i
    public static final db i0(int i4, int i5, boolean z4, @fg.m androidx.compose.runtime.t tVar, int i6, int i7) {
        tVar.P(1237715277);
        int i10 = (i7 & 1) != 0 ? 0 : i4;
        int i11 = (i7 & 2) != 0 ? 0 : i5;
        boolean a5 = (i7 & 4) != 0 ? ya.a(tVar, 0) : z4;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1237715277, i6, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:556)");
        }
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.l<db, ?> a6 = db.INSTANCE.a();
        tVar.P(1737740702);
        boolean z5 = ((((i6 & 14) ^ 6) > 4 && tVar.f(i10)) || (i6 & 6) == 4) | ((((i6 & 112) ^ 48) > 32 && tVar.f(i11)) || (i6 & 48) == 32) | ((((i6 & 896) ^ 384) > 256 && tVar.b(a5)) || (i6 & 384) == 256);
        Object Q = tVar.Q();
        if (z5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new s0(i10, i11, a5);
            tVar.E(Q);
        }
        tVar.p0();
        db dbVar = (db) androidx.compose.runtime.saveable.d.d(objArr, a6, null, (ld.a) Q, tVar, 0, 4);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return dbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005a  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(@fg.l androidx.compose.material3.db r18, @fg.m androidx.compose.ui.q r19, @fg.m androidx.compose.material3.za r20, boolean r21, @fg.m androidx.compose.runtime.t r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.bb.j(androidx.compose.material3.db, androidx.compose.ui.q, androidx.compose.material3.za, boolean, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(int i4, db dbVar, androidx.compose.ui.text.input.z0 z0Var, androidx.compose.ui.text.input.z0 z0Var2, int i5, ld.l<? super androidx.compose.ui.text.input.z0, kotlin.k2> lVar) {
        if (kotlin.jvm.internal.l0.g(z0Var.i(), z0Var2.i())) {
            lVar.invoke(z0Var);
            return;
        }
        if (z0Var.i().length() == 0) {
            u8.INSTANCE.getClass();
            if (u8.f(i4, u8.f14967c)) {
                dbVar.z(0);
            } else {
                dbVar.C(0);
            }
            lVar.invoke(androidx.compose.ui.text.input.z0.e(z0Var, "", 0L, null, 6, null));
            return;
        }
        try {
            int F = (z0Var.i().length() == 3 && androidx.compose.ui.text.t0.n(z0Var.getSelection()) == 1) ? kotlin.text.c.F(z0Var.i().charAt(0)) : Integer.parseInt(z0Var.i());
            if (F <= i5) {
                u8.Companion companion = u8.INSTANCE;
                companion.getClass();
                if (u8.f(i4, u8.f14967c)) {
                    dbVar.z(F);
                    if (F > 1 && !dbVar.getIs24hour()) {
                        companion.getClass();
                        dbVar.E(u8.f14968d);
                    }
                } else {
                    dbVar.C(F);
                }
                if (z0Var.i().length() > 2) {
                    z0Var = androidx.compose.ui.text.input.z0.e(z0Var, String.valueOf(z0Var.i().charAt(0)), 0L, null, 6, null);
                }
                lVar.invoke(z0Var);
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void k(androidx.compose.ui.q qVar, db dbVar, za zaVar, androidx.compose.ui.layout.m0 m0Var, androidx.compose.ui.graphics.e6 e6Var, androidx.compose.ui.graphics.e6 e6Var2, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(1374241901);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.q0(dbVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.q0(zaVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.q0(m0Var) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.q0(e6Var) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.q0(e6Var2) ? 131072 : 65536;
        }
        if ((74899 & i5) == 74898 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1374241901, i5, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1095)");
            }
            c0.k1 k1Var = c0.k1.f37594a;
            androidx.compose.foundation.c0 a5 = androidx.compose.foundation.d0.a(k1Var.y(), zaVar.getPeriodSelectorBorderColor());
            androidx.compose.ui.graphics.e6 e4 = x8.e(k1Var.t(), o4, 6);
            kotlin.jvm.internal.l0.n(e4, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            androidx.compose.foundation.shape.e eVar = (androidx.compose.foundation.shape.e) e4;
            t9.Companion companion = t9.INSTANCE;
            String a6 = v9.a(x7.a.f15590a0, o4, 0);
            o4.P(-2008454294);
            boolean q02 = o4.q0(a6);
            Object Q = o4.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new r(a6);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.ui.q e5 = androidx.compose.foundation.z.e(androidx.compose.foundation.selection.a.a(androidx.compose.ui.semantics.o.f(qVar, false, (ld.l) Q, 1, null)), a5, eVar);
            o4.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a7 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(e5);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a7);
            } else {
                o4.C();
            }
            ld.p a8 = androidx.compose.animation.p.a(companion2, o4, m0Var, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, a8);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            boolean z4 = !dbVar.r();
            o4.P(1654477599);
            int i6 = i5 & 112;
            boolean z5 = i6 == 32;
            Object Q2 = o4.Q();
            if (z5 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q2 = new s(dbVar);
                o4.E(Q2);
            }
            o4.p0();
            o3 o3Var = o3.f12919a;
            o3Var.getClass();
            int i7 = (i5 << 3) & 7168;
            v(z4, e6Var, (ld.a) Q2, zaVar, o3.f12920b, o4, ((i5 >> 9) & 112) | 24576 | i7);
            androidx.compose.foundation.layout.f2.a(androidx.compose.foundation.n.d(androidx.compose.foundation.layout.c2.f(androidx.compose.ui.w.a(androidx.compose.ui.layout.w.b(androidx.compose.ui.q.INSTANCE, "Spacer"), 2.0f), 0.0f, 1, null), zaVar.getPeriodSelectorBorderColor(), null, 2, null), o4, 0);
            boolean r4 = dbVar.r();
            o4.P(1654478145);
            boolean z6 = i6 == 32;
            Object Q3 = o4.Q();
            if (z6 || Q3 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q3 = new t(dbVar);
                o4.E(Q3);
            }
            o4.p0();
            o3Var.getClass();
            v(r4, e6Var2, (ld.a) Q3, zaVar, o3.f12921c, o4, ((i5 >> 12) & 112) | 24576 | i7);
            o4.p0();
            o4.H();
            o4.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new u(qVar, dbVar, zaVar, m0Var, e6Var, e6Var2, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.q0<Float, Float> k0(float f4, float f5) {
        if (Math.abs(f4 - f5) <= 3.141592653589793d) {
            return new kotlin.q0<>(Float.valueOf(f4), Float.valueOf(f5));
        }
        double d5 = f4;
        if (d5 > 3.141592653589793d && f5 < 3.141592653589793d) {
            f5 += f9994a;
        } else if (d5 < 3.141592653589793d && f5 > 3.141592653589793d) {
            f4 += f9994a;
        }
        return new kotlin.q0<>(Float.valueOf(f4), Float.valueOf(f5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        if ((r12 & 4) != 0) goto L46;
     */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(@fg.l androidx.compose.material3.db r7, @fg.m androidx.compose.ui.q r8, @fg.m androidx.compose.material3.za r9, @fg.m androidx.compose.runtime.t r10, int r11, int r12) {
        /*
            r0 = -760850373(0xffffffffd2a6583b, float:-3.5722242E11)
            androidx.compose.runtime.t r10 = r10.o(r0)
            r1 = r12 & 1
            if (r1 == 0) goto Le
            r1 = r11 | 6
            goto L1e
        Le:
            r1 = r11 & 6
            if (r1 != 0) goto L1d
            boolean r1 = r10.q0(r7)
            if (r1 == 0) goto L1a
            r1 = 4
            goto L1b
        L1a:
            r1 = 2
        L1b:
            r1 = r1 | r11
            goto L1e
        L1d:
            r1 = r11
        L1e:
            r2 = r12 & 2
            if (r2 == 0) goto L25
            r1 = r1 | 48
            goto L35
        L25:
            r3 = r11 & 48
            if (r3 != 0) goto L35
            boolean r3 = r10.q0(r8)
            if (r3 == 0) goto L32
            r3 = 32
            goto L34
        L32:
            r3 = 16
        L34:
            r1 = r1 | r3
        L35:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L49
            r3 = r12 & 4
            if (r3 != 0) goto L46
            boolean r3 = r10.q0(r9)
            if (r3 == 0) goto L46
            r3 = 256(0x100, float:3.59E-43)
            goto L48
        L46:
            r3 = 128(0x80, float:1.8E-43)
        L48:
            r1 = r1 | r3
        L49:
            r3 = r1 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L5c
            boolean r3 = r10.p()
            if (r3 != 0) goto L56
            goto L5c
        L56:
            r10.d0()
        L59:
            r3 = r8
            r4 = r9
            goto La8
        L5c:
            r10.T()
            r3 = r11 & 1
            r4 = 6
            if (r3 == 0) goto L75
            boolean r3 = r10.i0()
            if (r3 == 0) goto L6b
            goto L75
        L6b:
            r10.d0()
            r2 = r12 & 4
            if (r2 == 0) goto L84
        L72:
            r1 = r1 & (-897(0xfffffffffffffc7f, float:NaN))
            goto L84
        L75:
            if (r2 == 0) goto L79
            androidx.compose.ui.q$a r8 = androidx.compose.ui.q.INSTANCE
        L79:
            r2 = r12 & 4
            if (r2 == 0) goto L84
            androidx.compose.material3.ab r9 = androidx.compose.material3.ab.f9822a
            androidx.compose.material3.za r9 = r9.a(r10, r4)
            goto L72
        L84:
            r10.I()
            boolean r2 = androidx.compose.runtime.x.b0()
            if (r2 == 0) goto L93
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TimeInput (TimePicker.kt:248)"
            androidx.compose.runtime.x.r0(r0, r1, r2, r3)
        L93:
            int r0 = r1 >> 3
            r0 = r0 & 126(0x7e, float:1.77E-43)
            int r1 = r1 << r4
            r1 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            m(r8, r9, r7, r10, r0)
            boolean r0 = androidx.compose.runtime.x.b0()
            if (r0 == 0) goto L59
            androidx.compose.runtime.x.q0()
            goto L59
        La8:
            androidx.compose.runtime.t3 r8 = r10.t()
            if (r8 == 0) goto Lba
            androidx.compose.material3.bb$v r9 = new androidx.compose.material3.bb$v
            r1 = r9
            r2 = r7
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r8.a(r9)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.bb.l(androidx.compose.material3.db, androidx.compose.ui.q, androidx.compose.material3.za, androidx.compose.runtime.t, int, int):void");
    }

    @androidx.compose.runtime.x4
    private static final androidx.compose.ui.q l0(androidx.compose.ui.q qVar, boolean z4) {
        return qVar.w3(new ub(z4, androidx.compose.ui.platform.y1.e() ? new t0(z4) : androidx.compose.ui.platform.y1.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void m(androidx.compose.ui.q qVar, za zaVar, db dbVar, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t tVar2;
        androidx.compose.ui.text.v0 l4;
        androidx.compose.runtime.t o4 = tVar.o(-475657989);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.q0(zaVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.q0(dbVar) ? 256 : 128;
        }
        int i6 = i5;
        if ((i6 & 147) == 146 && o4.p()) {
            o4.d0();
            tVar2 = o4;
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-475657989, i6, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:817)");
            }
            Object[] objArr = new Object[0];
            z0.Companion companion = androidx.compose.ui.text.input.z0.INSTANCE;
            companion.getClass();
            androidx.compose.runtime.saveable.l lVar = androidx.compose.ui.text.input.z0.f21154f;
            o4.P(565122579);
            int i7 = i6 & 896;
            boolean z4 = i7 == 256;
            Object Q = o4.Q();
            if (z4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new y(dbVar);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.runtime.k2 c5 = androidx.compose.runtime.saveable.d.c(objArr, lVar, null, (ld.a) Q, o4, 0, 4);
            Object[] objArr2 = new Object[0];
            companion.getClass();
            androidx.compose.runtime.saveable.l lVar2 = androidx.compose.ui.text.input.z0.f21154f;
            o4.P(565122759);
            boolean z5 = i7 == 256;
            Object Q2 = o4.Q();
            if (z5 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q2 = new z(dbVar);
                o4.E(Q2);
            }
            o4.p0();
            androidx.compose.runtime.k2 c6 = androidx.compose.runtime.saveable.d.c(objArr2, lVar2, null, (ld.a) Q2, o4, 0, 4);
            tVar2 = o4;
            androidx.compose.ui.q o5 = androidx.compose.foundation.layout.j1.o(qVar, 0.0f, 0.0f, 0.0f, f10005l, 7, null);
            c.Companion companion2 = androidx.compose.ui.c.INSTANCE;
            c.InterfaceC0326c w4 = companion2.w();
            tVar2.P(693286680);
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(androidx.compose.foundation.layout.i.f5073a.p(), w4, tVar2, 48);
            tVar2.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar2, 0);
            androidx.compose.runtime.g0 B = tVar2.B();
            g.Companion companion3 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(o5);
            if (tVar2.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar2.W();
            if (tVar2.getInserting()) {
                tVar2.F(a5);
            } else {
                tVar2.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion3, tVar2, d5, tVar2, B);
            if (tVar2.getInserting() || !kotlin.jvm.internal.l0.g(tVar2.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar2, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar2), tVar2, 2058660585);
            androidx.compose.foundation.layout.y1 y1Var = androidx.compose.foundation.layout.y1.f5410a;
            sb c7 = p6.f13227a.c(tVar2, 6);
            c0.j1 j1Var = c0.j1.f37525a;
            androidx.compose.ui.text.v0 a7 = tb.a(c7, j1Var.F());
            androidx.compose.ui.text.style.j.INSTANCE.getClass();
            l4 = a7.l((r48 & 1) != 0 ? a7.spanStyle.m() : zaVar.u(true), (r48 & 2) != 0 ? a7.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? a7.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? a7.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? a7.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? a7.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? a7.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? a7.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? a7.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? a7.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? a7.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? a7.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? a7.spanStyle.getBackground() : null, (r48 & 8192) != 0 ? a7.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? a7.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? a7.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.j.f21356e, (r48 & 65536) != 0 ? a7.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? a7.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? a7.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? a7.platformStyle : null, (r48 & 1048576) != 0 ? a7.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? a7.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? a7.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? a7.paragraphStyle.getTextMotion() : null);
            androidx.compose.runtime.f0.b(xa.f().e(l4), androidx.compose.runtime.internal.c.b(tVar2, 1306700887, true, new w(c5, dbVar, zaVar, c6)), tVar2, androidx.compose.runtime.b3.f15974d | 48);
            tVar2.P(565126032);
            if (!dbVar.getIs24hour()) {
                q.Companion companion4 = androidx.compose.ui.q.INSTANCE;
                androidx.compose.ui.q o6 = androidx.compose.foundation.layout.j1.o(companion4, f10011r, 0.0f, 0.0f, 0.0f, 14, null);
                tVar2.P(733328855);
                androidx.compose.ui.layout.m0 a8 = androidx.compose.animation.a0.a(companion2, false, tVar2, 0, -1323940314);
                int j5 = androidx.compose.runtime.p.j(tVar2, 0);
                androidx.compose.runtime.g0 B2 = tVar2.B();
                ld.a<androidx.compose.ui.node.g> a10 = companion3.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(o6);
                if (tVar2.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar2.W();
                if (tVar2.getInserting()) {
                    tVar2.F(a10);
                } else {
                    tVar2.C();
                }
                ld.p a11 = androidx.compose.animation.p.a(companion3, tVar2, a8, tVar2, B2);
                if (tVar2.getInserting() || !kotlin.jvm.internal.l0.g(tVar2.Q(), Integer.valueOf(j5))) {
                    androidx.compose.animation.d.a(j5, tVar2, j5, a11);
                }
                androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(tVar2), tVar2, 2058660585);
                androidx.compose.foundation.layout.p pVar = androidx.compose.foundation.layout.p.f5235a;
                x(androidx.compose.foundation.layout.c2.y(companion4, j1Var.h(), j1Var.f()), dbVar, zaVar, tVar2, ((i6 >> 3) & 112) | 6 | ((i6 << 3) & 896));
                tVar2.p0();
                tVar2.H();
                tVar2.p0();
                tVar2.p0();
            }
            if (androidx.compose.animation.y.a(tVar2)) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = tVar2.t();
        if (t4 != null) {
            t4.a(new x(qVar, zaVar, dbVar, i4));
        }
    }

    private static final androidx.compose.ui.text.input.z0 n(androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var) {
        return k2Var.getValue();
    }

    private static final void o(androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var, androidx.compose.ui.text.input.z0 z0Var) {
        k2Var.setValue(z0Var);
    }

    private static final androidx.compose.ui.text.input.z0 p(androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var) {
        return k2Var.getValue();
    }

    private static final void q(androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var, androidx.compose.ui.text.input.z0 z0Var) {
        k2Var.setValue(z0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if ((r14 & 8) != 0) goto L58;
     */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(@fg.l androidx.compose.material3.db r8, @fg.m androidx.compose.ui.q r9, @fg.m androidx.compose.material3.za r10, int r11, @fg.m androidx.compose.runtime.t r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.bb.r(androidx.compose.material3.db, androidx.compose.ui.q, androidx.compose.material3.za, int, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0530  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(androidx.compose.ui.q r117, androidx.compose.ui.text.input.z0 r118, ld.l<? super androidx.compose.ui.text.input.z0, kotlin.k2> r119, androidx.compose.material3.db r120, int r121, androidx.compose.foundation.text.f0 r122, androidx.compose.foundation.text.d0 r123, androidx.compose.material3.za r124, androidx.compose.runtime.t r125, int r126, int r127) {
        /*
            Method dump skipped, instructions count: 1420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.bb.s(androidx.compose.ui.q, androidx.compose.ui.text.input.z0, ld.l, androidx.compose.material3.db, int, androidx.compose.foundation.text.f0, androidx.compose.foundation.text.d0, androidx.compose.material3.za, androidx.compose.runtime.t, int, int):void");
    }

    private static final boolean t(androidx.compose.runtime.b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void u(androidx.compose.ui.q qVar, int i4, db dbVar, int i5, za zaVar, androidx.compose.runtime.t tVar, int i6) {
        int i7;
        int i10;
        androidx.compose.runtime.t tVar2;
        androidx.compose.runtime.t o4 = tVar.o(21099367);
        if ((i6 & 6) == 0) {
            i7 = (o4.q0(qVar) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= o4.f(i4) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= o4.q0(dbVar) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i7 |= o4.f(i5) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i7 |= o4.q0(zaVar) ? 16384 : 8192;
        }
        if ((i7 & 9363) == 9362 && o4.p()) {
            o4.d0();
            tVar2 = o4;
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(21099367, i7, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1194)");
            }
            boolean f4 = u8.f(dbVar.l(), i5);
            u8.INSTANCE.getClass();
            if (u8.f(i5, u8.f14967c)) {
                t9.Companion companion = t9.INSTANCE;
                i10 = x7.a.T;
            } else {
                t9.Companion companion2 = t9.INSTANCE;
                i10 = x7.a.X;
            }
            String a5 = v9.a(i10, o4, 0);
            long t4 = zaVar.t(f4);
            long u4 = zaVar.u(f4);
            o4.P(773894976);
            o4.P(-492369756);
            Object Q = o4.Q();
            t.Companion companion3 = androidx.compose.runtime.t.INSTANCE;
            if (Q == companion3.a()) {
                Q = androidx.view.compose.l.a(androidx.compose.runtime.a1.m(kotlin.coroutines.i.f75057b, o4), o4);
            }
            o4.p0();
            kotlinx.coroutines.r0 coroutineScope = ((androidx.compose.runtime.j0) Q).getCoroutineScope();
            o4.p0();
            o4.P(-633372797);
            boolean q02 = o4.q0(a5);
            Object Q2 = o4.Q();
            if (q02 || Q2 == companion3.a()) {
                Q2 = new g0(a5);
                o4.E(Q2);
            }
            o4.p0();
            androidx.compose.ui.q e4 = androidx.compose.ui.semantics.o.e(qVar, true, (ld.l) Q2);
            androidx.compose.ui.graphics.e6 e5 = x8.e(c0.k1.f37594a.N(), o4, 6);
            o4.P(-633372653);
            boolean S = ((i7 & 896) == 256) | ((i7 & 7168) == 2048) | o4.S(coroutineScope);
            Object Q3 = o4.Q();
            if (S || Q3 == companion3.a()) {
                Q3 = new h0(i5, dbVar, coroutineScope);
                o4.E(Q3);
            }
            o4.p0();
            tVar2 = o4;
            x9.b(f4, (ld.a) Q3, e4, false, e5, t4, 0L, 0.0f, 0.0f, null, null, androidx.compose.runtime.internal.c.b(o4, -1338709103, true, new i0(i5, dbVar, i4, u4)), tVar2, 0, 48, 1992);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t5 = tVar2.t();
        if (t5 != null) {
            t5.a(new j0(qVar, i4, dbVar, i5, zaVar, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void v(boolean z4, androidx.compose.ui.graphics.e6 e6Var, ld.a<kotlin.k2> aVar, za zaVar, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-1937408098);
        if ((i4 & 6) == 0) {
            i5 = (o4.b(z4) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.q0(e6Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.S(aVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.q0(zaVar) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.S(qVar) ? 16384 : 8192;
        }
        if ((i5 & 9363) == 9362 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1937408098, i5, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1144)");
            }
            long s4 = zaVar.s(z4);
            long r4 = zaVar.r(z4);
            androidx.compose.ui.q f4 = androidx.compose.foundation.layout.c2.f(androidx.compose.ui.w.a(androidx.compose.ui.q.INSTANCE, z4 ? 0.0f : 1.0f), 0.0f, 1, null);
            o4.P(526522672);
            boolean z5 = (i5 & 14) == 4;
            Object Q = o4.Q();
            if (z5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new k0(z4);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.material3.q0.e(aVar, androidx.compose.ui.semantics.o.f(f4, false, (ld.l) Q, 1, null), false, e6Var, androidx.compose.material3.o0.f12901a.F(r4, s4, 0L, 0L, o4, 24576, 12), null, null, androidx.compose.foundation.layout.j1.a(androidx.compose.ui.unit.h.g(0)), null, qVar, o4, ((i5 >> 6) & 14) | 12582912 | ((i5 << 6) & 7168) | ((i5 << 15) & 1879048192), 356);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new l0(z4, e6Var, aVar, zaVar, qVar, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void w(db dbVar, za zaVar, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(2054675515);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(dbVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.q0(zaVar) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(2054675515, i5, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:940)");
            }
            i.f f4 = androidx.compose.foundation.layout.i.f5073a.f();
            o4.P(693286680);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            c.Companion companion2 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(f4, companion2.w(), o4, 6);
            o4.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion3 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(companion);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a5);
            } else {
                o4.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion3, o4, d5, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.y1 y1Var = androidx.compose.foundation.layout.y1.f5410a;
            b(dbVar, zaVar, o4, i5 & 126);
            o4.P(952914149);
            if (!dbVar.getIs24hour()) {
                androidx.compose.ui.q o5 = androidx.compose.foundation.layout.j1.o(companion, f10011r, 0.0f, 0.0f, 0.0f, 14, null);
                o4.P(733328855);
                androidx.compose.ui.layout.m0 a7 = androidx.compose.animation.a0.a(companion2, false, o4, 0, -1323940314);
                int j5 = androidx.compose.runtime.p.j(o4, 0);
                androidx.compose.runtime.g0 B2 = o4.B();
                ld.a<androidx.compose.ui.node.g> a8 = companion3.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(o5);
                if (o4.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                o4.W();
                if (o4.getInserting()) {
                    o4.F(a8);
                } else {
                    o4.C();
                }
                ld.p a10 = androidx.compose.animation.p.a(companion3, o4, a7, o4, B2);
                if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j5))) {
                    androidx.compose.animation.d.a(j5, o4, j5, a10);
                }
                androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
                androidx.compose.foundation.layout.p pVar = androidx.compose.foundation.layout.p.f5235a;
                c0.k1 k1Var = c0.k1.f37594a;
                int i6 = i5 << 3;
                x(androidx.compose.foundation.layout.c2.y(companion, k1Var.J(), k1Var.I()), dbVar, zaVar, o4, (i6 & 896) | (i6 & 112) | 6);
                o4.p0();
                o4.H();
                o4.p0();
                o4.p0();
            }
            if (androidx.compose.animation.y.a(o4)) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new m0(dbVar, zaVar, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void x(androidx.compose.ui.q qVar, db dbVar, za zaVar, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-1898918107);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.q0(dbVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.q0(zaVar) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1898918107, i5, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1047)");
            }
            o4.P(-2030104119);
            Object Q = o4.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = o0.f10139a;
                o4.E(Q);
            }
            androidx.compose.ui.layout.m0 m0Var = (androidx.compose.ui.layout.m0) Q;
            o4.p0();
            androidx.compose.ui.graphics.e6 e4 = x8.e(c0.k1.f37594a.t(), o4, 6);
            kotlin.jvm.internal.l0.n(e4, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            androidx.compose.foundation.shape.e eVar = (androidx.compose.foundation.shape.e) e4;
            k(qVar, dbVar, zaVar, m0Var, x8.g(eVar), x8.a(eVar), o4, (i5 & 14) | 3072 | (i5 & 112) | (i5 & 896));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new n0(qVar, dbVar, zaVar, i4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005a  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void y(@fg.l androidx.compose.material3.db r16, @fg.m androidx.compose.ui.q r17, @fg.m androidx.compose.material3.za r18, boolean r19, @fg.m androidx.compose.runtime.t r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.bb.y(androidx.compose.material3.db, androidx.compose.ui.q, androidx.compose.material3.za, boolean, androidx.compose.runtime.t, int, int):void");
    }
}
