package androidx.compose.material3;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.material3.t9;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import androidx.compose.ui.t;
import androidx.profileinstaller.o;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u007f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aµ\u0001\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\f\u001a\u00020\u000b2\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\tH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001au\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0081\u0001\u0010\u001e\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001aæ\u0001\u0010%\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\u0019\b\u0002\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\b\b\u0003\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010&\u001a\u009a\u0001\u0010'\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\"2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\u0019\b\u0002\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b'\u0010(\u001aa\u0010)\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0004\b)\u0010*\u001a\u0082\u0001\u0010+\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0004\b+\u0010,\u001a/\u00102\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0000H\u0002¢\u0006\u0004\b2\u00103\u001a5\u0010;\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0000\u0018\u000109*\u0002042\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0082@ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u0017\u0010=\u001a\u00020.2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b=\u0010>\u001a7\u0010D\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0000H\u0002¢\u0006\u0004\bD\u0010E\u001a:\u0010H\u001a\u00020F2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a'\u0010G\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0002¢\u0006\u0004\bG\u0010K\u001a#\u0010L\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bL\u0010M\u001a#\u0010N\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bN\u0010O\u001a#\u0010P\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bP\u0010O\u001a+\u0010Q\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\bQ\u0010R\u001a3\u0010S\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\bS\u0010T\u001a\u001f\u0010W\u001a\u00020F2\u0006\u0010U\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u0000H\u0001¢\u0006\u0004\bW\u0010X\u001a\u001d\u0010Z\u001a\u00020F2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00000\tH\u0001¢\u0006\u0004\bZ\u0010[\"\u001a\u0010_\u001a\u00020\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010D\u001a\u0004\b]\u0010^\"\u0014\u0010`\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010D\"\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00102\"\u0014\u0010c\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010D\"\u0014\u0010d\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010D\"\u0014\u0010e\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010D\"\u001a\u0010g\u001a\u00020\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010D\u001a\u0004\bf\u0010^\"\u001e\u0010l\u001a\u00020\u0007*\u00020F8@X\u0081\u0004¢\u0006\f\u0012\u0004\bj\u0010k\u001a\u0004\bh\u0010i\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006m"}, d2 = {"", "value", "Lkotlin/Function1;", "Lkotlin/k2;", "onValueChange", "Landroidx/compose/ui/q;", "modifier", "", "enabled", "Lkotlin/ranges/f;", "valueRange", "", "steps", "Lkotlin/Function0;", "onValueChangeFinished", "Landroidx/compose/material3/d9;", "colors", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "e", "(FLld/l;Landroidx/compose/ui/q;ZLkotlin/ranges/f;ILld/a;Landroidx/compose/material3/d9;Landroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/material3/j9;", "Landroidx/compose/runtime/i;", "thumb", "track", "f", "(FLld/l;Landroidx/compose/ui/q;ZLld/a;Landroidx/compose/material3/d9;Landroidx/compose/foundation/interaction/k;ILld/q;Lld/q;Lkotlin/ranges/f;Landroidx/compose/runtime/t;III)V", "state", "g", "(Landroidx/compose/material3/j9;Landroidx/compose/ui/q;ZLandroidx/compose/material3/d9;Landroidx/compose/foundation/interaction/k;Lld/q;Lld/q;Landroidx/compose/runtime/t;II)V", "b", "(Lkotlin/ranges/f;Lld/l;Landroidx/compose/ui/q;ZLkotlin/ranges/f;ILld/a;Landroidx/compose/material3/d9;Landroidx/compose/runtime/t;II)V", "startInteractionSource", "endInteractionSource", "Landroidx/compose/material3/d8;", "startThumb", "endThumb", "c", "(Lkotlin/ranges/f;Lld/l;Landroidx/compose/ui/q;ZLkotlin/ranges/f;Lld/a;Landroidx/compose/material3/d9;Landroidx/compose/foundation/interaction/k;Landroidx/compose/foundation/interaction/k;Lld/q;Lld/q;Lld/q;ILandroidx/compose/runtime/t;III)V", "a", "(Landroidx/compose/material3/d8;Landroidx/compose/ui/q;ZLandroidx/compose/material3/d9;Landroidx/compose/foundation/interaction/k;Landroidx/compose/foundation/interaction/k;Lld/q;Lld/q;Lld/q;Landroidx/compose/runtime/t;II)V", "h", "(Landroidx/compose/ui/q;Landroidx/compose/material3/j9;ZLandroidx/compose/foundation/interaction/k;Lld/q;Lld/q;Landroidx/compose/runtime/t;I)V", "d", "(Landroidx/compose/ui/q;Landroidx/compose/material3/d8;ZLandroidx/compose/foundation/interaction/k;Landroidx/compose/foundation/interaction/k;Lld/q;Lld/q;Lld/q;Landroidx/compose/runtime/t;I)V", "current", "", "tickFractions", "minPx", "maxPx", "J", "(F[FFF)F", "Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/input/pointer/a0;", "id", "Landroidx/compose/ui/input/pointer/q0;", "type", "Lkotlin/q0;", "Landroidx/compose/ui/input/pointer/b0;", "w", "(Landroidx/compose/ui/input/pointer/c;JILkotlin/coroutines/d;)Ljava/lang/Object;", "K", "(I)[F", "a1", "b1", "x1", "a2", "b2", "F", "(FFFFF)F", "Landroidx/compose/material3/i9;", "x", "G", "(FFJFF)J", "pos", "(FFF)F", "H", "(Landroidx/compose/ui/q;Landroidx/compose/material3/j9;Z)Landroidx/compose/ui/q;", "E", "(Landroidx/compose/ui/q;Landroidx/compose/material3/d8;Z)Landroidx/compose/ui/q;", "C", "I", "(Landroidx/compose/ui/q;Landroidx/compose/material3/j9;Landroidx/compose/foundation/interaction/k;Z)Landroidx/compose/ui/q;", "D", "(Landroidx/compose/ui/q;Landroidx/compose/material3/d8;Landroidx/compose/foundation/interaction/k;Landroidx/compose/foundation/interaction/k;Z)Landroidx/compose/ui/q;", "start", "endInclusive", "i", "(FF)J", "range", "j", "(Lkotlin/ranges/f;)J", "Landroidx/compose/ui/unit/h;", "y", "()F", "ThumbWidth", "ThumbHeight", "Landroidx/compose/ui/unit/l;", "ThumbSize", "ThumbDefaultElevation", "ThumbPressedElevation", "TickSize", "z", "TrackHeight", "A", "(J)Z", "B", "(J)V", "isSpecified", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 10 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 11 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2151:1\n1116#2,6:2152\n1116#2,6:2158\n1116#2,6:2164\n1116#2,6:2170\n1116#2,6:2177\n1116#2,6:2183\n1116#2,6:2189\n1116#2,6:2195\n1116#2,6:2201\n1116#2,6:2207\n1116#2,6:2213\n1116#2,6:2219\n1116#2,6:2226\n1116#2,6:2232\n1116#2,6:2353\n1116#2,6:2387\n1116#2,6:2433\n1#3:2176\n74#4:2225\n74#4:2350\n78#5,11:2238\n78#5,11:2272\n91#5:2304\n78#5,11:2312\n91#5:2344\n91#5:2349\n78#5,11:2359\n78#5,11:2399\n91#5:2431\n78#5,11:2445\n91#5:2477\n78#5,11:2485\n91#5:2517\n91#5:2522\n456#6,8:2249\n464#6,3:2263\n456#6,8:2283\n464#6,3:2297\n467#6,3:2301\n456#6,8:2323\n464#6,3:2337\n467#6,3:2341\n467#6,3:2346\n456#6,8:2370\n464#6,3:2384\n456#6,8:2410\n464#6,3:2424\n467#6,3:2428\n456#6,8:2456\n464#6,3:2470\n467#6,3:2474\n456#6,8:2496\n464#6,3:2510\n467#6,3:2514\n467#6,3:2519\n3737#7,6:2257\n3737#7,6:2291\n3737#7,6:2331\n3737#7,6:2378\n3737#7,6:2418\n3737#7,6:2464\n3737#7,6:2504\n68#8,6:2266\n74#8:2300\n78#8:2305\n68#8,6:2306\n74#8:2340\n78#8:2345\n68#8,6:2393\n74#8:2427\n78#8:2432\n68#8,6:2439\n74#8:2473\n78#8:2478\n68#8,6:2479\n74#8:2513\n78#8:2518\n52#9:2351\n53#9:2352\n16867#10,14:2523\n25#11,3:2537\n25#11,3:2540\n154#12:2543\n154#12:2544\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt\n*L\n157#1:2152,6\n248#1:2158,6\n268#1:2164,6\n344#1:2170,6\n418#1:2177,6\n419#1:2183,6\n519#1:2189,6\n520#1:2195,6\n546#1:2201,6\n559#1:2207,6\n626#1:2213,6\n627#1:2219,6\n685#1:2226,6\n712#1:2232,6\n808#1:2353,6\n783#1:2387,6\n791#1:2433,6\n674#1:2225\n764#1:2350\n690#1:2238,11\n692#1:2272,11\n692#1:2304\n695#1:2312,11\n695#1:2344\n690#1:2349\n779#1:2359,11\n781#1:2399,11\n781#1:2431\n789#1:2445,11\n789#1:2477\n797#1:2485,11\n797#1:2517\n779#1:2522\n690#1:2249,8\n690#1:2263,3\n692#1:2283,8\n692#1:2297,3\n692#1:2301,3\n695#1:2323,8\n695#1:2337,3\n695#1:2341,3\n690#1:2346,3\n779#1:2370,8\n779#1:2384,3\n781#1:2410,8\n781#1:2424,3\n781#1:2428,3\n789#1:2456,8\n789#1:2470,3\n789#1:2474,3\n797#1:2496,8\n797#1:2510,3\n797#1:2514,3\n779#1:2519,3\n690#1:2257,6\n692#1:2291,6\n695#1:2331,6\n779#1:2378,6\n781#1:2418,6\n789#1:2464,6\n797#1:2504,6\n692#1:2266,6\n692#1:2300\n692#1:2305\n695#1:2306,6\n695#1:2340\n695#1:2345\n781#1:2393,6\n781#1:2427\n781#1:2432\n789#1:2439,6\n789#1:2473\n789#1:2478\n797#1:2479,6\n797#1:2513\n797#1:2518\n776#1:2351\n777#1:2352\n1248#1:2523,14\n2124#1:2537,3\n2142#1:2540,3\n1710#1:2543\n1711#1:2544\n*E\n"})
/* loaded from: classes.dex */
public final class g9 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f11127a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f11128b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f11129c;

    /* renamed from: d, reason: collision with root package name */
    private static final float f11130d;

    /* renamed from: e, reason: collision with root package name */
    private static final float f11131e;

    /* renamed from: f, reason: collision with root package name */
    private static final float f11132f;

    /* renamed from: g, reason: collision with root package name */
    private static final float f11133g;

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/i9;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i9, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<kotlin.ranges.f<Float>, kotlin.k2> f11134b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.l<? super kotlin.ranges.f<Float>, kotlin.k2> lVar) {
            super(1);
            this.f11134b = lVar;
        }

        public final void a(long j4) {
            this.f11134b.invoke(kotlin.ranges.s.e(i9.j(j4), i9.g(j4)));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i9 i9Var) {
            a(i9Var.m());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f11135b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Float, kotlin.k2> f11136c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11137d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f11138e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f11139f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ d9 f11140g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11141h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f11142i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.q<j9, androidx.compose.runtime.t, Integer, kotlin.k2> f11143j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.q<j9, androidx.compose.runtime.t, Integer, kotlin.k2> f11144k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.f<Float> f11145l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f11146m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f11147n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f11148o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a0(float f4, ld.l<? super Float, kotlin.k2> lVar, androidx.compose.ui.q qVar, boolean z4, ld.a<kotlin.k2> aVar, d9 d9Var, androidx.compose.foundation.interaction.k kVar, int i4, ld.q<? super j9, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.q<? super j9, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar3, kotlin.ranges.f<Float> fVar, int i5, int i6, int i7) {
            super(2);
            this.f11135b = f4;
            this.f11136c = lVar;
            this.f11137d = qVar;
            this.f11138e = z4;
            this.f11139f = aVar;
            this.f11140g = d9Var;
            this.f11141h = kVar;
            this.f11142i = i4;
            this.f11143j = qVar2;
            this.f11144k = qVar3;
            this.f11145l = fVar;
            this.f11146m = i5;
            this.f11147n = i6;
            this.f11148o = i7;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g9.f(this.f11135b, this.f11136c, this.f11137d, this.f11138e, this.f11139f, this.f11140g, this.f11141h, this.f11142i, this.f11143j, this.f11144k, this.f11145l, tVar, androidx.compose.runtime.g3.b(this.f11146m | 1), androidx.compose.runtime.g3.b(this.f11147n), this.f11148o);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.f<Float> f11149b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<kotlin.ranges.f<Float>, kotlin.k2> f11150c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11151d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f11152e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.f<Float> f11153f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f11154g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ d9 f11155h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11156i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11157j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.q<d8, androidx.compose.runtime.t, Integer, kotlin.k2> f11158k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.q<d8, androidx.compose.runtime.t, Integer, kotlin.k2> f11159l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ld.q<d8, androidx.compose.runtime.t, Integer, kotlin.k2> f11160m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f11161n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f11162o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f11163p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f11164q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(kotlin.ranges.f<Float> fVar, ld.l<? super kotlin.ranges.f<Float>, kotlin.k2> lVar, androidx.compose.ui.q qVar, boolean z4, kotlin.ranges.f<Float> fVar2, ld.a<kotlin.k2> aVar, d9 d9Var, androidx.compose.foundation.interaction.k kVar, androidx.compose.foundation.interaction.k kVar2, ld.q<? super d8, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.q<? super d8, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar3, ld.q<? super d8, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar4, int i4, int i5, int i6, int i7) {
            super(2);
            this.f11149b = fVar;
            this.f11150c = lVar;
            this.f11151d = qVar;
            this.f11152e = z4;
            this.f11153f = fVar2;
            this.f11154g = aVar;
            this.f11155h = d9Var;
            this.f11156i = kVar;
            this.f11157j = kVar2;
            this.f11158k = qVar2;
            this.f11159l = qVar3;
            this.f11160m = qVar4;
            this.f11161n = i4;
            this.f11162o = i5;
            this.f11163p = i6;
            this.f11164q = i7;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g9.c(this.f11149b, this.f11150c, this.f11151d, this.f11152e, this.f11153f, this.f11154g, this.f11155h, this.f11156i, this.f11157j, this.f11158k, this.f11159l, this.f11160m, this.f11161n, tVar, androidx.compose.runtime.g3.b(this.f11162o | 1), androidx.compose.runtime.g3.b(this.f11163p), this.f11164q);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b0 extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<ld.a<kotlin.k2>> f11165b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b0(androidx.compose.runtime.b5<? extends ld.a<kotlin.k2>> b5Var) {
            super(0);
            this.f11165b = b5Var;
        }

        public final void a() {
            ld.a<kotlin.k2> value = this.f11165b.getValue();
            if (value != null) {
                value.invoke();
            }
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.q<d8, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11166b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d9 f11167c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11168d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.foundation.interaction.k kVar, d9 d9Var, boolean z4) {
            super(3);
            this.f11166b = kVar;
            this.f11167c = d9Var;
            this.f11168d = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(d8 d8Var, androidx.compose.runtime.t tVar, Integer num) {
            a(d8Var, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l d8 d8Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 17) == 16 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1884205643, i4, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:628)");
            }
            f9.f10692a.a(this.f11166b, null, this.f11167c, this.f11168d, 0L, tVar, o.c.f32821k, 18);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt$SliderImpl$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2151:1\n544#2,2:2152\n33#2,6:2154\n546#2:2160\n544#2,2:2161\n33#2,6:2163\n546#2:2169\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt$SliderImpl$2$1\n*L\n714#1:2152,2\n714#1:2154,6\n714#1:2160\n718#1:2161,2\n718#1:2163,6\n718#1:2169\n*E\n"})
    static final class c0 implements androidx.compose.ui.layout.m0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j9 f11169a;

        /* compiled from: Slider.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f11170b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f11171c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f11172d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f11173e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f11174f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f11175g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.layout.i1 i1Var, int i4, int i5, androidx.compose.ui.layout.i1 i1Var2, int i6, int i7) {
                super(1);
                this.f11170b = i1Var;
                this.f11171c = i4;
                this.f11172d = i5;
                this.f11173e = i1Var2;
                this.f11174f = i6;
                this.f11175g = i7;
            }

            public final void a(@fg.l i1.a aVar) {
                i1.a.m(aVar, this.f11170b, this.f11171c, this.f11172d, 0.0f, 4, null);
                i1.a.m(aVar, this.f11173e, this.f11174f, this.f11175g, 0.0f, 4, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        c0(j9 j9Var) {
            this.f11169a = j9Var;
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                androidx.compose.ui.layout.l0 l0Var = list.get(i4);
                if (androidx.compose.ui.layout.w.a(l0Var) == e9.THUMB) {
                    androidx.compose.ui.layout.i1 m02 = l0Var.m0(j4);
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        androidx.compose.ui.layout.l0 l0Var2 = list.get(i5);
                        if (androidx.compose.ui.layout.w.a(l0Var2) == e9.TRACK) {
                            androidx.compose.ui.layout.i1 m03 = l0Var2.m0(androidx.compose.ui.unit.b.e(androidx.compose.ui.unit.c.j(j4, -m02.getWidth(), 0, 2, null), 0, 0, 0, 0, 11, null));
                            int width = m02.getWidth() + m03.getWidth();
                            int max = Math.max(m03.getHeight(), m02.getHeight());
                            this.f11169a.H(m02.getWidth(), width);
                            return androidx.compose.ui.layout.o0.x2(o0Var, width, max, null, new a(m03, m02.getWidth() / 2, androidx.compose.material3.r.a(m03, max, 2), m02, kotlin.math.b.L0(this.f11169a.g() * m03.getWidth()), androidx.compose.material3.r.a(m02, max, 2)), 4, null);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.q<d8, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11176b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d9 f11177c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11178d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.foundation.interaction.k kVar, d9 d9Var, boolean z4) {
            super(3);
            this.f11176b = kVar;
            this.f11177c = d9Var;
            this.f11178d = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(d8 d8Var, androidx.compose.runtime.t tVar, Integer num) {
            a(d8Var, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l d8 d8Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 17) == 16 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1016457138, i4, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:635)");
            }
            f9.f10692a.a(this.f11176b, null, this.f11177c, this.f11178d, 0L, tVar, o.c.f32821k, 18);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11179b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j9 f11180c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11181d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11182e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.q<j9, androidx.compose.runtime.t, Integer, kotlin.k2> f11183f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.q<j9, androidx.compose.runtime.t, Integer, kotlin.k2> f11184g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f11185h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d0(androidx.compose.ui.q qVar, j9 j9Var, boolean z4, androidx.compose.foundation.interaction.k kVar, ld.q<? super j9, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.q<? super j9, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar3, int i4) {
            super(2);
            this.f11179b = qVar;
            this.f11180c = j9Var;
            this.f11181d = z4;
            this.f11182e = kVar;
            this.f11183f = qVar2;
            this.f11184g = qVar3;
            this.f11185h = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g9.h(this.f11179b, this.f11180c, this.f11181d, this.f11182e, this.f11183f, this.f11184g, tVar, androidx.compose.runtime.g3.b(this.f11185h | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.q<d8, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d9 f11186b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11187c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(d9 d9Var, boolean z4) {
            super(3);
            this.f11186b = d9Var;
            this.f11187c = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(d8 d8Var, androidx.compose.runtime.t tVar, Integer num) {
            a(d8Var, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l d8 d8Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 6) == 0) {
                i4 |= tVar.q0(d8Var) ? 4 : 2;
            }
            if ((i4 & 19) == 18 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1617375262, i4, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:642)");
            }
            f9.f10692a.b(d8Var, null, this.f11186b, this.f11187c, tVar, (i4 & 14) | 24576, 2);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: Slider.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderKt$SliderImpl$drag$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/r0;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;F)V"}, k = 3, mv = {1, 8, 0})
    static final class e0 extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.r0, Float, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f11188b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j9 f11189c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(j9 j9Var, kotlin.coroutines.d<? super e0> dVar) {
            super(3, dVar);
            this.f11189c = j9Var;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(kotlinx.coroutines.r0 r0Var, Float f4, kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return a(r0Var, f4.floatValue(), dVar);
        }

        @fg.m
        public final Object a(@fg.l kotlinx.coroutines.r0 r0Var, float f4, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return new e0(this.f11189c, dVar).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f11188b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            this.f11189c.h().invoke();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d8 f11190b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11191c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11192d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d9 f11193e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11194f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11195g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<d8, androidx.compose.runtime.t, Integer, kotlin.k2> f11196h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.q<d8, androidx.compose.runtime.t, Integer, kotlin.k2> f11197i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.q<d8, androidx.compose.runtime.t, Integer, kotlin.k2> f11198j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f11199k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f11200l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(d8 d8Var, androidx.compose.ui.q qVar, boolean z4, d9 d9Var, androidx.compose.foundation.interaction.k kVar, androidx.compose.foundation.interaction.k kVar2, ld.q<? super d8, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.q<? super d8, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar3, ld.q<? super d8, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar4, int i4, int i5) {
            super(2);
            this.f11190b = d8Var;
            this.f11191c = qVar;
            this.f11192d = z4;
            this.f11193e = d9Var;
            this.f11194f = kVar;
            this.f11195g = kVar2;
            this.f11196h = qVar2;
            this.f11197i = qVar3;
            this.f11198j = qVar4;
            this.f11199k = i4;
            this.f11200l = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g9.a(this.f11190b, this.f11191c, this.f11192d, this.f11193e, this.f11194f, this.f11195g, this.f11196h, this.f11197i, this.f11198j, tVar, androidx.compose.runtime.g3.b(this.f11199k | 1), this.f11200l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderKt", f = "Slider.kt", i = {0}, l = {1262}, m = "awaitSlop-8vUncbI", n = {"initialDelta"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f0 extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f11201b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f11202c;

        /* renamed from: d, reason: collision with root package name */
        int f11203d;

        f0(kotlin.coroutines.d<? super f0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f11202c = obj;
            this.f11203d |= Integer.MIN_VALUE;
            return g9.w(null, 0L, 0, this);
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/d8;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/material3/d8;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.q<d8, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11204b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d9 f11205c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11206d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(androidx.compose.foundation.interaction.k kVar, d9 d9Var, boolean z4) {
            super(3);
            this.f11204b = kVar;
            this.f11205c = d9Var;
            this.f11206d = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(d8 d8Var, androidx.compose.runtime.t tVar, Integer num) {
            a(d8Var, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l d8 d8Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 17) == 16 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-811582901, i4, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:431)");
            }
            f9.f10692a.a(this.f11204b, null, this.f11205c, this.f11206d, 0L, tVar, 196614, 18);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "pointerInput", "", "offset", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/b0;F)V"}, k = 3, mv = {1, 8, 0})
    static final class g0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.input.pointer.b0, Float, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.e f11207b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(k1.e eVar) {
            super(2);
            this.f11207b = eVar;
        }

        public final void a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var, float f4) {
            b0Var.a();
            this.f11207b.f75326b = f4;
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.input.pointer.b0 b0Var, Float f4) {
            a(b0Var, f4.floatValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/d8;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/material3/d8;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.q<d8, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11208b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d9 f11209c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11210d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(androidx.compose.foundation.interaction.k kVar, d9 d9Var, boolean z4) {
            super(3);
            this.f11208b = kVar;
            this.f11209c = d9Var;
            this.f11210d = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(d8 d8Var, androidx.compose.runtime.t tVar, Integer num) {
            a(d8Var, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l d8 d8Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 17) == 16 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1832060001, i4, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:438)");
            }
            f9.f10692a.a(this.f11208b, null, this.f11209c, this.f11210d, 0L, tVar, 196614, 18);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class h0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11211b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.f<Float> f11212c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d8 f11213d;

        /* compiled from: Slider.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "targetValue", "", "a", "(F)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt$rangeSliderEndThumbSemantics$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2151:1\n1#2:2152\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<Float, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.ranges.f<Float> f11214b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d8 f11215c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlin.ranges.f<Float> fVar, d8 d8Var) {
                super(1);
                this.f11214b = fVar;
                this.f11215c = d8Var;
            }

            @fg.l
            public final Boolean a(float f4) {
                int g4;
                float H = kotlin.ranges.s.H(f4, this.f11214b.c().floatValue(), this.f11214b.h().floatValue());
                boolean z4 = false;
                if (this.f11215c.g() > 0 && (g4 = this.f11215c.g() + 1) >= 0) {
                    float f5 = H;
                    float f6 = f5;
                    int i4 = 0;
                    while (true) {
                        float a5 = androidx.compose.ui.util.d.a(this.f11214b.c().floatValue(), this.f11214b.h().floatValue(), i4 / (this.f11215c.g() + 1));
                        float f7 = a5 - H;
                        if (Math.abs(f7) <= f5) {
                            f5 = Math.abs(f7);
                            f6 = a5;
                        }
                        if (i4 == g4) {
                            break;
                        }
                        i4++;
                    }
                    H = f6;
                }
                if (H != this.f11215c.a()) {
                    long i5 = g9.i(this.f11215c.c(), H);
                    if (!i9.e(i5, g9.i(this.f11215c.c(), this.f11215c.a()))) {
                        if (this.f11215c.l() != null) {
                            ld.l<i9, kotlin.k2> l4 = this.f11215c.l();
                            if (l4 != null) {
                                l4.invoke(i9.b(i5));
                            }
                        } else {
                            this.f11215c.B(i9.j(i5));
                            this.f11215c.z(i9.g(i5));
                        }
                    }
                    ld.a<kotlin.k2> m4 = this.f11215c.m();
                    if (m4 != null) {
                        m4.invoke();
                    }
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ Boolean invoke(Float f4) {
                return a(f4.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(boolean z4, kotlin.ranges.f<Float> fVar, d8 d8Var) {
            super(1);
            this.f11211b = z4;
            this.f11212c = fVar;
            this.f11213d = d8Var;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            if (!this.f11211b) {
                androidx.compose.ui.semantics.w.n(zVar);
            }
            androidx.compose.ui.semantics.w.j1(zVar, null, new a(this.f11212c, this.f11213d), 1, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/d8;", "rangeSliderState", "Lkotlin/k2;", "a", "(Landroidx/compose/material3/d8;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.q<d8, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d9 f11216b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11217c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(d9 d9Var, boolean z4) {
            super(3);
            this.f11216b = d9Var;
            this.f11217c = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(d8 d8Var, androidx.compose.runtime.t tVar, Integer num) {
            a(d8Var, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l d8 d8Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 6) == 0) {
                i4 |= tVar.q0(d8Var) ? 4 : 2;
            }
            if ((i4 & 19) == 18 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(377064480, i4, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:445)");
            }
            f9.f10692a.b(d8Var, null, this.f11216b, this.f11217c, tVar, (i4 & 14) | 24576, 2);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: Slider.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", i = {}, l = {1496}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class i0 extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f11218b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f11219c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d8 f11220d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11221e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11222f;

        /* compiled from: Slider.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {1497}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f11223b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f11224c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f11225d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ d8 f11226e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ c8 f11227f;

            /* compiled from: Slider.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {1498, 1509, 1528}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "event", "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.g9$i0$a$a, reason: collision with other inner class name */
            static final class C0247a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: c, reason: collision with root package name */
                Object f11228c;

                /* renamed from: d, reason: collision with root package name */
                Object f11229d;

                /* renamed from: e, reason: collision with root package name */
                Object f11230e;

                /* renamed from: f, reason: collision with root package name */
                Object f11231f;

                /* renamed from: g, reason: collision with root package name */
                int f11232g;

                /* renamed from: h, reason: collision with root package name */
                private /* synthetic */ Object f11233h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ d8 f11234i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ c8 f11235j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.r0 f11236k;

                /* compiled from: Slider.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", i = {}, l = {1545}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material3.g9$i0$a$a$a, reason: collision with other inner class name */
                static final class C0248a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    int f11237b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ c8 f11238c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ k1.a f11239d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.foundation.interaction.a f11240e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0248a(c8 c8Var, k1.a aVar, androidx.compose.foundation.interaction.a aVar2, kotlin.coroutines.d<? super C0248a> dVar) {
                        super(2, dVar);
                        this.f11238c = c8Var;
                        this.f11239d = aVar;
                        this.f11240e = aVar2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        return new C0248a(this.f11238c, this.f11239d, this.f11240e, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                        int i4 = this.f11237b;
                        if (i4 == 0) {
                            kotlin.a1.n(obj);
                            androidx.compose.foundation.interaction.k a5 = this.f11238c.a(this.f11239d.f75322b);
                            androidx.compose.foundation.interaction.a aVar2 = this.f11240e;
                            this.f11237b = 1;
                            if (a5.a(aVar2, this) == aVar) {
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
                        return ((C0248a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                    }
                }

                /* compiled from: Slider.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/b0;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material3.g9$i0$a$a$b */
                static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.pointer.b0, kotlin.k2> {

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ d8 f11241b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ k1.a f11242c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(d8 d8Var, k1.a aVar) {
                        super(1);
                        this.f11241b = d8Var;
                        this.f11242c = aVar;
                    }

                    public final void a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var) {
                        float p4 = i0.f.p(androidx.compose.ui.input.pointer.q.k(b0Var));
                        d8 d8Var = this.f11241b;
                        boolean z4 = this.f11242c.f75322b;
                        if (d8Var.v()) {
                            p4 = -p4;
                        }
                        d8Var.w(z4, p4);
                    }

                    @Override // ld.l
                    public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.input.pointer.b0 b0Var) {
                        a(b0Var);
                        return kotlin.k2.f75408a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0247a(d8 d8Var, c8 c8Var, kotlinx.coroutines.r0 r0Var, kotlin.coroutines.d<? super C0247a> dVar) {
                    super(2, dVar);
                    this.f11234i = d8Var;
                    this.f11235j = c8Var;
                    this.f11236k = r0Var;
                }

                @Override // ld.p
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((C0247a) create(cVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    C0247a c0247a = new C0247a(this.f11234i, this.f11235j, this.f11236k, dVar);
                    c0247a.f11233h = obj;
                    return c0247a;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0167 A[Catch: CancellationException -> 0x0175, TryCatch #1 {CancellationException -> 0x0175, blocks: (B:8:0x0019, B:9:0x015f, B:11:0x0167, B:15:0x016d), top: B:7:0x0019 }] */
                /* JADX WARN: Removed duplicated region for block: B:15:0x016d A[Catch: CancellationException -> 0x0175, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0175, blocks: (B:8:0x0019, B:9:0x015f, B:11:0x0167, B:15:0x016d), top: B:7:0x0019 }] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x015c A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:40:0x015d  */
                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r15) {
                    /*
                        Method dump skipped, instructions count: 412
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.g9.i0.a.C0247a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.input.pointer.k0 k0Var, d8 d8Var, c8 c8Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f11225d = k0Var;
                this.f11226e = d8Var;
                this.f11227f = c8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f11225d, this.f11226e, this.f11227f, dVar);
                aVar.f11224c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f11223b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f11224c;
                    androidx.compose.ui.input.pointer.k0 k0Var = this.f11225d;
                    C0247a c0247a = new C0247a(this.f11226e, this.f11227f, r0Var, null);
                    this.f11223b = 1;
                    if (androidx.compose.foundation.gestures.f0.d(k0Var, c0247a, this) == aVar) {
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
        i0(d8 d8Var, androidx.compose.foundation.interaction.k kVar, androidx.compose.foundation.interaction.k kVar2, kotlin.coroutines.d<? super i0> dVar) {
            super(2, dVar);
            this.f11220d = d8Var;
            this.f11221e = kVar;
            this.f11222f = kVar2;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((i0) create(k0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            i0 i0Var = new i0(this.f11220d, this.f11221e, this.f11222f, dVar);
            i0Var.f11219c = obj;
            return i0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f11218b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                a aVar2 = new a((androidx.compose.ui.input.pointer.k0) this.f11219c, this.f11220d, new c8(this.f11220d, this.f11221e, this.f11222f), null);
                this.f11218b = 1;
                if (kotlinx.coroutines.s0.g(aVar2, this) == aVar) {
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
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.f<Float> f11243b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<kotlin.ranges.f<Float>, kotlin.k2> f11244c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11245d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f11246e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.f<Float> f11247f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f11248g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f11249h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ d9 f11250i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f11251j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f11252k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(kotlin.ranges.f<Float> fVar, ld.l<? super kotlin.ranges.f<Float>, kotlin.k2> lVar, androidx.compose.ui.q qVar, boolean z4, kotlin.ranges.f<Float> fVar2, int i4, ld.a<kotlin.k2> aVar, d9 d9Var, int i5, int i6) {
            super(2);
            this.f11243b = fVar;
            this.f11244c = lVar;
            this.f11245d = qVar;
            this.f11246e = z4;
            this.f11247f = fVar2;
            this.f11248g = i4;
            this.f11249h = aVar;
            this.f11250i = d9Var;
            this.f11251j = i5;
            this.f11252k = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g9.b(this.f11243b, this.f11244c, this.f11245d, this.f11246e, this.f11247f, this.f11248g, this.f11249h, this.f11250i, tVar, androidx.compose.runtime.g3.b(this.f11251j | 1), this.f11252k);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class j0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11253b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.f<Float> f11254c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d8 f11255d;

        /* compiled from: Slider.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "targetValue", "", "a", "(F)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt$rangeSliderStartThumbSemantics$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2151:1\n1#2:2152\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<Float, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.ranges.f<Float> f11256b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d8 f11257c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlin.ranges.f<Float> fVar, d8 d8Var) {
                super(1);
                this.f11256b = fVar;
                this.f11257c = d8Var;
            }

            @fg.l
            public final Boolean a(float f4) {
                int p4;
                float H = kotlin.ranges.s.H(f4, this.f11256b.c().floatValue(), this.f11256b.h().floatValue());
                boolean z4 = false;
                if (this.f11257c.p() > 0 && (p4 = this.f11257c.p() + 1) >= 0) {
                    float f5 = H;
                    float f6 = f5;
                    int i4 = 0;
                    while (true) {
                        float a5 = androidx.compose.ui.util.d.a(this.f11256b.c().floatValue(), this.f11256b.h().floatValue(), i4 / (this.f11257c.p() + 1));
                        float f7 = a5 - H;
                        if (Math.abs(f7) <= f5) {
                            f5 = Math.abs(f7);
                            f6 = a5;
                        }
                        if (i4 == p4) {
                            break;
                        }
                        i4++;
                    }
                    H = f6;
                }
                if (H != this.f11257c.c()) {
                    long i5 = g9.i(H, this.f11257c.a());
                    if (!i9.e(i5, g9.i(this.f11257c.c(), this.f11257c.a()))) {
                        if (this.f11257c.l() != null) {
                            ld.l<i9, kotlin.k2> l4 = this.f11257c.l();
                            if (l4 != null) {
                                l4.invoke(i9.b(i5));
                            }
                        } else {
                            this.f11257c.B(i9.j(i5));
                            this.f11257c.z(i9.g(i5));
                        }
                    }
                    ld.a<kotlin.k2> m4 = this.f11257c.m();
                    if (m4 != null) {
                        m4.invoke();
                    }
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ Boolean invoke(Float f4) {
                return a(f4.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(boolean z4, kotlin.ranges.f<Float> fVar, d8 d8Var) {
            super(1);
            this.f11253b = z4;
            this.f11254c = fVar;
            this.f11255d = d8Var;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            if (!this.f11253b) {
                androidx.compose.ui.semantics.w.n(zVar);
            }
            androidx.compose.ui.semantics.w.j1(zVar, null, new a(this.f11254c, this.f11255d), 1, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k extends kotlin.jvm.internal.n0 implements ld.q<d8, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11258b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d9 f11259c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11260d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(androidx.compose.foundation.interaction.k kVar, d9 d9Var, boolean z4) {
            super(3);
            this.f11258b = kVar;
            this.f11259c = d9Var;
            this.f11260d = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(d8 d8Var, androidx.compose.runtime.t tVar, Integer num) {
            a(d8Var, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l d8 d8Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 17) == 16 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1963073082, i4, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:521)");
            }
            f9.f10692a.a(this.f11258b, null, this.f11259c, this.f11260d, 0L, tVar, o.c.f32821k, 18);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class k0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11261b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j9 f11262c;

        /* compiled from: Slider.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "targetValue", "", "a", "(F)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<Float, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j9 f11263b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j9 j9Var) {
                super(1);
                this.f11263b = j9Var;
            }

            @fg.l
            public final Boolean a(float f4) {
                int m4;
                float H = kotlin.ranges.s.H(f4, this.f11263b.r().c().floatValue(), this.f11263b.r().h().floatValue());
                boolean z4 = false;
                if (this.f11263b.m() > 0 && (m4 = this.f11263b.m() + 1) >= 0) {
                    float f5 = H;
                    float f6 = f5;
                    int i4 = 0;
                    while (true) {
                        float a5 = androidx.compose.ui.util.d.a(this.f11263b.r().c().floatValue(), this.f11263b.r().h().floatValue(), i4 / (this.f11263b.m() + 1));
                        float f7 = a5 - H;
                        if (Math.abs(f7) <= f5) {
                            f5 = Math.abs(f7);
                            f6 = a5;
                        }
                        if (i4 == m4) {
                            break;
                        }
                        i4++;
                    }
                    H = f6;
                }
                if (H != this.f11263b.q()) {
                    if (H != this.f11263b.q()) {
                        if (this.f11263b.i() != null) {
                            ld.l<Float, kotlin.k2> i5 = this.f11263b.i();
                            if (i5 != null) {
                                i5.invoke(Float.valueOf(H));
                            }
                        } else {
                            this.f11263b.F(H);
                        }
                    }
                    ld.a<kotlin.k2> j4 = this.f11263b.j();
                    if (j4 != null) {
                        j4.invoke();
                    }
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ Boolean invoke(Float f4) {
                return a(f4.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(boolean z4, j9 j9Var) {
            super(1);
            this.f11261b = z4;
            this.f11262c = j9Var;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            if (!this.f11261b) {
                androidx.compose.ui.semantics.w.n(zVar);
            }
            androidx.compose.ui.semantics.w.j1(zVar, null, new a(this.f11262c), 1, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class l extends kotlin.jvm.internal.n0 implements ld.q<d8, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11264b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d9 f11265c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11266d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(androidx.compose.foundation.interaction.k kVar, d9 d9Var, boolean z4) {
            super(3);
            this.f11264b = kVar;
            this.f11265c = d9Var;
            this.f11266d = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(d8 d8Var, androidx.compose.runtime.t tVar, Integer num) {
            a(d8Var, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l d8 d8Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 17) == 16 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1908709951, i4, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:528)");
            }
            f9.f10692a.a(this.f11264b, null, this.f11265c, this.f11266d, 0L, tVar, o.c.f32821k, 18);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: Slider.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1", f = "Slider.kt", i = {}, l = {1469}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class l0 extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f11267b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f11268c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ j9 f11269d;

        /* compiled from: Slider.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/l0;", "Li0/f;", "it", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/l0;Li0/f;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.q<androidx.compose.foundation.gestures.l0, i0.f, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f11270b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ long f11271c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ j9 f11272d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j9 j9Var, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f11272d = j9Var;
            }

            @Override // ld.q
            public /* bridge */ /* synthetic */ Object R(androidx.compose.foundation.gestures.l0 l0Var, i0.f fVar, kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return a(l0Var, fVar.getPackedValue(), dVar);
            }

            @fg.m
            public final Object a(@fg.l androidx.compose.foundation.gestures.l0 l0Var, long j4, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                a aVar = new a(this.f11272d, dVar);
                aVar.f11271c = j4;
                return aVar.invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f11270b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                this.f11272d.v(this.f11271c);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: Slider.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<i0.f, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j9 f11273b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j9 j9Var) {
                super(1);
                this.f11273b = j9Var;
            }

            public final void a(long j4) {
                this.f11273b.b(0.0f);
                this.f11273b.h().invoke();
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i0.f fVar) {
                a(fVar.getPackedValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l0(j9 j9Var, kotlin.coroutines.d<? super l0> dVar) {
            super(2, dVar);
            this.f11269d = j9Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((l0) create(k0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            l0 l0Var = new l0(this.f11269d, dVar);
            l0Var.f11268c = obj;
            return l0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f11267b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f11268c;
                a aVar2 = new a(this.f11269d, null);
                b bVar = new b(this.f11269d);
                this.f11267b = 1;
                if (androidx.compose.foundation.gestures.z0.m(k0Var, null, null, aVar2, bVar, this, 3, null) == aVar) {
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
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class m extends kotlin.jvm.internal.n0 implements ld.q<d8, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d9 f11274b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11275c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(d9 d9Var, boolean z4) {
            super(3);
            this.f11274b = d9Var;
            this.f11275c = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(d8 d8Var, androidx.compose.runtime.t tVar, Integer num) {
            a(d8Var, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l d8 d8Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 6) == 0) {
                i4 |= tVar.q0(d8Var) ? 4 : 2;
            }
            if ((i4 & 19) == 18 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-429193201, i4, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:535)");
            }
            f9.f10692a.b(d8Var, null, this.f11274b, this.f11275c, tVar, (i4 & 14) | 24576, 2);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class n extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<ld.a<kotlin.k2>> f11276b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(androidx.compose.runtime.b5<? extends ld.a<kotlin.k2>> b5Var) {
            super(0);
            this.f11276b = b5Var;
        }

        public final void a() {
            ld.a<kotlin.k2> value = this.f11276b.getValue();
            if (value != null) {
                value.invoke();
            }
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class o extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11277b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str) {
            super(1);
            this.f11277b = str;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.a1(zVar, this.f11277b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class p extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11278b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str) {
            super(1);
            this.f11278b = str;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.a1(zVar, this.f11278b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt$RangeSliderImpl$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2151:1\n544#2,2:2152\n33#2,6:2154\n546#2:2160\n544#2,2:2161\n33#2,6:2163\n546#2:2169\n544#2,2:2170\n33#2,6:2172\n546#2:2178\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt$RangeSliderImpl$2$1\n*L\n809#1:2152,2\n809#1:2154,6\n809#1:2160\n815#1:2161,2\n815#1:2163,6\n815#1:2169\n821#1:2170,2\n821#1:2172,6\n821#1:2178\n*E\n"})
    static final class q implements androidx.compose.ui.layout.m0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d8 f11279a;

        /* compiled from: Slider.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f11280b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f11281c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f11282d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f11283e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f11284f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f11285g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f11286h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f11287i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f11288j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.layout.i1 i1Var, int i4, int i5, androidx.compose.ui.layout.i1 i1Var2, int i6, int i7, androidx.compose.ui.layout.i1 i1Var3, int i10, int i11) {
                super(1);
                this.f11280b = i1Var;
                this.f11281c = i4;
                this.f11282d = i5;
                this.f11283e = i1Var2;
                this.f11284f = i6;
                this.f11285g = i7;
                this.f11286h = i1Var3;
                this.f11287i = i10;
                this.f11288j = i11;
            }

            public final void a(@fg.l i1.a aVar) {
                i1.a.m(aVar, this.f11280b, this.f11281c, this.f11282d, 0.0f, 4, null);
                i1.a.m(aVar, this.f11283e, this.f11284f, this.f11285g, 0.0f, 4, null);
                i1.a.m(aVar, this.f11286h, this.f11287i, this.f11288j, 0.0f, 4, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        q(d8 d8Var) {
            this.f11279a = d8Var;
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                androidx.compose.ui.layout.l0 l0Var = list.get(i4);
                if (androidx.compose.ui.layout.w.a(l0Var) == b8.STARTTHUMB) {
                    androidx.compose.ui.layout.i1 m02 = l0Var.m0(j4);
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        androidx.compose.ui.layout.l0 l0Var2 = list.get(i5);
                        if (androidx.compose.ui.layout.w.a(l0Var2) == b8.ENDTHUMB) {
                            androidx.compose.ui.layout.i1 m03 = l0Var2.m0(j4);
                            int size3 = list.size();
                            for (int i6 = 0; i6 < size3; i6++) {
                                androidx.compose.ui.layout.l0 l0Var3 = list.get(i6);
                                if (androidx.compose.ui.layout.w.a(l0Var3) == b8.TRACK) {
                                    androidx.compose.ui.layout.i1 m04 = l0Var3.m0(androidx.compose.ui.unit.b.e(androidx.compose.ui.unit.c.j(j4, (-(m03.getWidth() + m02.getWidth())) / 2, 0, 2, null), 0, 0, 0, 0, 11, null));
                                    int width = m04.getWidth() + ((m03.getWidth() + m02.getWidth()) / 2);
                                    int max = Math.max(m04.getHeight(), Math.max(m02.getHeight(), m03.getHeight()));
                                    this.f11279a.K(m02.getWidth());
                                    this.f11279a.D(m03.getWidth());
                                    this.f11279a.L(width);
                                    this.f11279a.M();
                                    return androidx.compose.ui.layout.o0.x2(o0Var, width, max, null, new a(m04, m02.getWidth() / 2, androidx.compose.material3.r.a(m04, max, 2), m02, kotlin.math.b.L0(this.f11279a.f() * m04.getWidth()), androidx.compose.material3.r.a(m02, max, 2), m03, kotlin.math.b.L0((this.f11279a.e() * m04.getWidth()) + androidx.compose.material3.s.a(m03, m02.getWidth(), 2)), androidx.compose.material3.r.a(m03, max, 2)), 4, null);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class r extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11289b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d8 f11290c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11291d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11292e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11293f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.q<d8, androidx.compose.runtime.t, Integer, kotlin.k2> f11294g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<d8, androidx.compose.runtime.t, Integer, kotlin.k2> f11295h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.q<d8, androidx.compose.runtime.t, Integer, kotlin.k2> f11296i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f11297j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(androidx.compose.ui.q qVar, d8 d8Var, boolean z4, androidx.compose.foundation.interaction.k kVar, androidx.compose.foundation.interaction.k kVar2, ld.q<? super d8, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.q<? super d8, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar3, ld.q<? super d8, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar4, int i4) {
            super(2);
            this.f11289b = qVar;
            this.f11290c = d8Var;
            this.f11291d = z4;
            this.f11292e = kVar;
            this.f11293f = kVar2;
            this.f11294g = qVar2;
            this.f11295h = qVar3;
            this.f11296i = qVar4;
            this.f11297j = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g9.d(this.f11289b, this.f11290c, this.f11291d, this.f11292e, this.f11293f, this.f11294g, this.f11295h, this.f11296i, tVar, androidx.compose.runtime.g3.b(this.f11297j | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class s extends kotlin.jvm.internal.n0 implements ld.q<j9, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11298b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d9 f11299c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11300d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(androidx.compose.foundation.interaction.k kVar, d9 d9Var, boolean z4) {
            super(3);
            this.f11298b = kVar;
            this.f11299c = d9Var;
            this.f11300d = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(j9 j9Var, androidx.compose.runtime.t tVar, Integer num) {
            a(j9Var, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l j9 j9Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 17) == 16 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1426271326, i4, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:345)");
            }
            f9.f10692a.a(this.f11298b, null, this.f11299c, this.f11300d, 0L, tVar, o.c.f32821k, 18);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class t extends kotlin.jvm.internal.n0 implements ld.q<j9, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d9 f11301b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11302c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(d9 d9Var, boolean z4) {
            super(3);
            this.f11301b = d9Var;
            this.f11302c = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(j9 j9Var, androidx.compose.runtime.t tVar, Integer num) {
            a(j9Var, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l j9 j9Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 6) == 0) {
                i4 |= tVar.q0(j9Var) ? 4 : 2;
            }
            if ((i4 & 19) == 18 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(577038345, i4, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:352)");
            }
            f9.f10692a.d(j9Var, null, this.f11301b, this.f11302c, tVar, (i4 & 14) | 24576, 2);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class u extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j9 f11303b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11304c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11305d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d9 f11306e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11307f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.q<j9, androidx.compose.runtime.t, Integer, kotlin.k2> f11308g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<j9, androidx.compose.runtime.t, Integer, kotlin.k2> f11309h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f11310i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f11311j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u(j9 j9Var, androidx.compose.ui.q qVar, boolean z4, d9 d9Var, androidx.compose.foundation.interaction.k kVar, ld.q<? super j9, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.q<? super j9, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar3, int i4, int i5) {
            super(2);
            this.f11303b = j9Var;
            this.f11304c = qVar;
            this.f11305d = z4;
            this.f11306e = d9Var;
            this.f11307f = kVar;
            this.f11308g = qVar2;
            this.f11309h = qVar3;
            this.f11310i = i4;
            this.f11311j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g9.g(this.f11303b, this.f11304c, this.f11305d, this.f11306e, this.f11307f, this.f11308g, this.f11309h, tVar, androidx.compose.runtime.g3.b(this.f11310i | 1), this.f11311j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/j9;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/material3/j9;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class v extends kotlin.jvm.internal.n0 implements ld.q<j9, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11312b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d9 f11313c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11314d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(androidx.compose.foundation.interaction.k kVar, d9 d9Var, boolean z4) {
            super(3);
            this.f11312b = kVar;
            this.f11313c = d9Var;
            this.f11314d = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(j9 j9Var, androidx.compose.runtime.t tVar, Integer num) {
            a(j9Var, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l j9 j9Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 17) == 16 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(308249025, i4, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:168)");
            }
            f9.f10692a.a(this.f11312b, null, this.f11313c, this.f11314d, 0L, tVar, o.c.f32821k, 18);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/j9;", "sliderState", "Lkotlin/k2;", "a", "(Landroidx/compose/material3/j9;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class w extends kotlin.jvm.internal.n0 implements ld.q<j9, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d9 f11315b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11316c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(d9 d9Var, boolean z4) {
            super(3);
            this.f11315b = d9Var;
            this.f11316c = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(j9 j9Var, androidx.compose.runtime.t tVar, Integer num) {
            a(j9Var, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l j9 j9Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 6) == 0) {
                i4 |= tVar.q0(j9Var) ? 4 : 2;
            }
            if ((i4 & 19) == 18 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1843234110, i4, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:175)");
            }
            f9.f10692a.d(j9Var, null, this.f11315b, this.f11316c, tVar, (i4 & 14) | 24576, 2);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class x extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f11317b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Float, kotlin.k2> f11318c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11319d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f11320e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.f<Float> f11321f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f11322g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f11323h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ d9 f11324i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11325j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f11326k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f11327l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        x(float f4, ld.l<? super Float, kotlin.k2> lVar, androidx.compose.ui.q qVar, boolean z4, kotlin.ranges.f<Float> fVar, int i4, ld.a<kotlin.k2> aVar, d9 d9Var, androidx.compose.foundation.interaction.k kVar, int i5, int i6) {
            super(2);
            this.f11317b = f4;
            this.f11318c = lVar;
            this.f11319d = qVar;
            this.f11320e = z4;
            this.f11321f = fVar;
            this.f11322g = i4;
            this.f11323h = aVar;
            this.f11324i = d9Var;
            this.f11325j = kVar;
            this.f11326k = i5;
            this.f11327l = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g9.e(this.f11317b, this.f11318c, this.f11319d, this.f11320e, this.f11321f, this.f11322g, this.f11323h, this.f11324i, this.f11325j, tVar, androidx.compose.runtime.g3.b(this.f11326k | 1), this.f11327l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class y extends kotlin.jvm.internal.n0 implements ld.q<j9, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f11328b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d9 f11329c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11330d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(androidx.compose.foundation.interaction.k kVar, d9 d9Var, boolean z4) {
            super(3);
            this.f11328b = kVar;
            this.f11329c = d9Var;
            this.f11330d = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(j9 j9Var, androidx.compose.runtime.t tVar, Integer num) {
            a(j9Var, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l j9 j9Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 17) == 16 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1756326375, i4, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:251)");
            }
            f9.f10692a.a(this.f11328b, null, this.f11329c, this.f11330d, 0L, tVar, o.c.f32821k, 18);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class z extends kotlin.jvm.internal.n0 implements ld.q<j9, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d9 f11331b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11332c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(d9 d9Var, boolean z4) {
            super(3);
            this.f11331b = d9Var;
            this.f11332c = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(j9 j9Var, androidx.compose.runtime.t tVar, Integer num) {
            a(j9Var, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l j9 j9Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 6) == 0) {
                i4 |= tVar.q0(j9Var) ? 4 : 2;
            }
            if ((i4 & 19) == 18 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(2083675534, i4, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:258)");
            }
            f9.f10692a.d(j9Var, null, this.f11331b, this.f11332c, tVar, (i4 & 14) | 24576, 2);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    static {
        c0.d1 d1Var = c0.d1.f37152a;
        float m4 = d1Var.m();
        f11127a = m4;
        float k4 = d1Var.k();
        f11128b = k4;
        f11129c = androidx.compose.ui.unit.i.b(m4, k4);
        f11130d = androidx.compose.ui.unit.h.g(1);
        f11131e = 6;
        f11132f = d1Var.C();
        f11133g = d1Var.p();
    }

    public static final boolean A(long j4) {
        i9.INSTANCE.getClass();
        return j4 != i9.f11620c;
    }

    @androidx.compose.runtime.x4
    public static /* synthetic */ void B(long j4) {
    }

    private static final androidx.compose.ui.q C(androidx.compose.ui.q qVar, d8 d8Var, boolean z4) {
        kotlin.ranges.f e4 = kotlin.ranges.s.e(d8Var.c(), d8Var.u().h().floatValue());
        return androidx.compose.foundation.s2.b(androidx.compose.ui.semantics.o.f(qVar, false, new h0(z4, e4, d8Var), 1, null), d8Var.a(), e4, d8Var.g());
    }

    @androidx.compose.runtime.x4
    private static final androidx.compose.ui.q D(androidx.compose.ui.q qVar, d8 d8Var, androidx.compose.foundation.interaction.k kVar, androidx.compose.foundation.interaction.k kVar2, boolean z4) {
        return z4 ? androidx.compose.ui.input.pointer.u0.g(qVar, new Object[]{kVar, kVar2, d8Var}, new i0(d8Var, kVar, kVar2, null)) : qVar;
    }

    private static final androidx.compose.ui.q E(androidx.compose.ui.q qVar, d8 d8Var, boolean z4) {
        kotlin.ranges.f e4 = kotlin.ranges.s.e(d8Var.u().c().floatValue(), d8Var.a());
        return androidx.compose.foundation.s2.b(androidx.compose.ui.semantics.o.f(qVar, false, new j0(z4, e4, d8Var), 1, null), d8Var.c(), e4, d8Var.p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float F(float f4, float f5, float f6, float f7, float f10) {
        return androidx.compose.ui.util.d.a(f7, f10, x(f4, f5, f6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long G(float f4, float f5, long j4, float f6, float f7) {
        return i(F(f4, f5, i9.j(j4), f6, f7), F(f4, f5, i9.g(j4), f6, f7));
    }

    private static final androidx.compose.ui.q H(androidx.compose.ui.q qVar, j9 j9Var, boolean z4) {
        return androidx.compose.foundation.s2.b(androidx.compose.ui.semantics.o.f(qVar, false, new k0(z4, j9Var), 1, null), j9Var.q(), kotlin.ranges.s.e(j9Var.r().c().floatValue(), j9Var.r().h().floatValue()), j9Var.m());
    }

    @androidx.compose.runtime.x4
    private static final androidx.compose.ui.q I(androidx.compose.ui.q qVar, j9 j9Var, androidx.compose.foundation.interaction.k kVar, boolean z4) {
        return z4 ? androidx.compose.ui.input.pointer.u0.d(qVar, j9Var, kVar, new l0(j9Var, null)) : qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float J(float f4, float[] fArr, float f5, float f6) {
        Float valueOf;
        if (fArr.length == 0) {
            valueOf = null;
        } else {
            float f7 = fArr[0];
            int te2 = kotlin.collections.l.te(fArr);
            if (te2 == 0) {
                valueOf = Float.valueOf(f7);
            } else {
                float abs = Math.abs(androidx.compose.ui.util.d.a(f5, f6, f7) - f4);
                kotlin.collections.u0 a5 = androidx.compose.animation.g.a(1, te2, 1);
                while (a5.hasNext()) {
                    float f10 = fArr[a5.c()];
                    float abs2 = Math.abs(androidx.compose.ui.util.d.a(f5, f6, f10) - f4);
                    if (Float.compare(abs, abs2) > 0) {
                        f7 = f10;
                        abs = abs2;
                    }
                }
                valueOf = Float.valueOf(f7);
            }
        }
        return valueOf != null ? androidx.compose.ui.util.d.a(f5, f6, valueOf.floatValue()) : f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] K(int i4) {
        if (i4 == 0) {
            return new float[0];
        }
        int i5 = i4 + 2;
        float[] fArr = new float[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            fArr[i6] = i6 / (i4 + 1);
        }
        return fArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015b  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l androidx.compose.material3.d8 r23, @fg.m androidx.compose.ui.q r24, boolean r25, @fg.m androidx.compose.material3.d9 r26, @fg.m androidx.compose.foundation.interaction.k r27, @fg.m androidx.compose.foundation.interaction.k r28, @fg.m ld.q<? super androidx.compose.material3.d8, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r29, @fg.m ld.q<? super androidx.compose.material3.d8, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r30, @fg.m ld.q<? super androidx.compose.material3.d8, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r31, @fg.m androidx.compose.runtime.t r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.g9.a(androidx.compose.material3.d8, androidx.compose.ui.q, boolean, androidx.compose.material3.d9, androidx.compose.foundation.interaction.k, androidx.compose.foundation.interaction.k, ld.q, ld.q, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00bc  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.l kotlin.ranges.f<java.lang.Float> r29, @fg.l ld.l<? super kotlin.ranges.f<java.lang.Float>, kotlin.k2> r30, @fg.m androidx.compose.ui.q r31, boolean r32, @fg.m kotlin.ranges.f<java.lang.Float> r33, @androidx.annotation.g0(from = 0) int r34, @fg.m ld.a<kotlin.k2> r35, @fg.m androidx.compose.material3.d9 r36, @fg.m androidx.compose.runtime.t r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.g9.b(kotlin.ranges.f, ld.l, androidx.compose.ui.q, boolean, kotlin.ranges.f, int, ld.a, androidx.compose.material3.d9, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0369  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@fg.l kotlin.ranges.f<java.lang.Float> r28, @fg.l ld.l<? super kotlin.ranges.f<java.lang.Float>, kotlin.k2> r29, @fg.m androidx.compose.ui.q r30, boolean r31, @fg.m kotlin.ranges.f<java.lang.Float> r32, @fg.m ld.a<kotlin.k2> r33, @fg.m androidx.compose.material3.d9 r34, @fg.m androidx.compose.foundation.interaction.k r35, @fg.m androidx.compose.foundation.interaction.k r36, @fg.m ld.q<? super androidx.compose.material3.d8, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r37, @fg.m ld.q<? super androidx.compose.material3.d8, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r38, @fg.m ld.q<? super androidx.compose.material3.d8, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r39, @androidx.annotation.g0(from = 0) int r40, @fg.m androidx.compose.runtime.t r41, int r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.g9.c(kotlin.ranges.f, ld.l, androidx.compose.ui.q, boolean, kotlin.ranges.f, ld.a, androidx.compose.material3.d9, androidx.compose.foundation.interaction.k, androidx.compose.foundation.interaction.k, ld.q, ld.q, ld.q, int, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void d(androidx.compose.ui.q qVar, d8 d8Var, boolean z4, androidx.compose.foundation.interaction.k kVar, androidx.compose.foundation.interaction.k kVar2, ld.q<? super d8, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.q<? super d8, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar3, ld.q<? super d8, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar4, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-1411725677);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.q0(d8Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.b(z4) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.q0(kVar) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.q0(kVar2) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.S(qVar2) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= o4.S(qVar3) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= o4.S(qVar4) ? 8388608 : 4194304;
        }
        if ((4793491 & i5) == 4793490 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1411725677, i5, -1, "androidx.compose.material3.RangeSliderImpl (Slider.kt:762)");
            }
            d8Var.J(o4.x(androidx.compose.ui.platform.h1.p()) == androidx.compose.ui.unit.w.Rtl);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.q D = D(companion, d8Var, kVar, kVar2, z4);
            androidx.compose.ui.q E = E(companion, d8Var, z4);
            androidx.compose.ui.q C = C(companion, d8Var, z4);
            t9.Companion companion2 = t9.INSTANCE;
            String a5 = v9.a(t.c.f20456m, o4, 0);
            String a6 = v9.a(t.c.f20455l, o4, 0);
            androidx.compose.ui.q f4 = a6.f(qVar);
            c0.d1 d1Var = c0.d1.f37152a;
            androidx.compose.ui.q w32 = androidx.compose.foundation.layout.c2.s(f4, d1Var.m(), d1Var.k(), 0.0f, 0.0f, 12, null).w3(D);
            o4.P(1300547382);
            boolean z5 = (i5 & 112) == 32;
            Object Q = o4.Q();
            if (z5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new q(d8Var);
                o4.E(Q);
            }
            androidx.compose.ui.layout.m0 m0Var = (androidx.compose.ui.layout.m0) Q;
            o4.p0();
            o4.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion3 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a7 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(w32);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a7);
            } else {
                o4.C();
            }
            ld.p a8 = androidx.compose.animation.p.a(companion3, o4, m0Var, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, a8);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.ui.q b5 = androidx.compose.ui.layout.w.b(companion, b8.STARTTHUMB);
            o4.P(-2040261114);
            boolean q02 = o4.q0(a5);
            Object Q2 = o4.Q();
            if (q02 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q2 = new o(a5);
                o4.E(Q2);
            }
            o4.p0();
            androidx.compose.ui.q w33 = FocusableKt.b(androidx.compose.ui.semantics.o.e(b5, true, (ld.l) Q2), z4, kVar).w3(E);
            o4.P(733328855);
            c.Companion companion4 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.m0 a10 = androidx.compose.animation.a0.a(companion4, false, o4, 0, -1323940314);
            int j5 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B2 = o4.B();
            ld.a<androidx.compose.ui.node.g> a11 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(w33);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a11);
            } else {
                o4.C();
            }
            ld.p a12 = androidx.compose.animation.p.a(companion3, o4, a10, o4, B2);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j5))) {
                androidx.compose.animation.d.a(j5, o4, j5, a12);
            }
            androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.p pVar = androidx.compose.foundation.layout.p.f5235a;
            int i6 = (i5 >> 3) & 14;
            qVar2.R(d8Var, o4, Integer.valueOf(((i5 >> 12) & 112) | i6));
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            androidx.compose.ui.q b6 = androidx.compose.ui.layout.w.b(companion, b8.ENDTHUMB);
            o4.P(-2040260744);
            boolean q03 = o4.q0(a6);
            Object Q3 = o4.Q();
            if (q03 || Q3 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q3 = new p(a6);
                o4.E(Q3);
            }
            o4.p0();
            androidx.compose.ui.q w34 = FocusableKt.b(androidx.compose.ui.semantics.o.e(b6, true, (ld.l) Q3), z4, kVar2).w3(C);
            o4.P(733328855);
            androidx.compose.ui.layout.m0 a13 = androidx.compose.animation.a0.a(companion4, false, o4, 0, -1323940314);
            int j6 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B3 = o4.B();
            ld.a<androidx.compose.ui.node.g> a14 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g6 = androidx.compose.ui.layout.a0.g(w34);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a14);
            } else {
                o4.C();
            }
            ld.p a15 = androidx.compose.animation.p.a(companion3, o4, a13, o4, B3);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j6))) {
                androidx.compose.animation.d.a(j6, o4, j6, a15);
            }
            androidx.compose.animation.e.a(0, g6, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            qVar3.R(d8Var, o4, Integer.valueOf(((i5 >> 15) & 112) | i6));
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            androidx.compose.ui.q b7 = androidx.compose.ui.layout.w.b(companion, b8.TRACK);
            o4.P(733328855);
            androidx.compose.ui.layout.m0 a16 = androidx.compose.animation.a0.a(companion4, false, o4, 0, -1323940314);
            int j7 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B4 = o4.B();
            ld.a<androidx.compose.ui.node.g> a17 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g7 = androidx.compose.ui.layout.a0.g(b7);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a17);
            } else {
                o4.C();
            }
            ld.p a18 = androidx.compose.animation.p.a(companion3, o4, a16, o4, B4);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j7))) {
                androidx.compose.animation.d.a(j7, o4, j7, a18);
            }
            androidx.compose.animation.e.a(0, g7, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            qVar4.R(d8Var, o4, Integer.valueOf(((i5 >> 18) & 112) | i6));
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            o4.p0();
            o4.H();
            o4.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new r(qVar, d8Var, z4, kVar, kVar2, qVar2, qVar3, qVar4, i4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f7  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(float r28, @fg.l ld.l<? super java.lang.Float, kotlin.k2> r29, @fg.m androidx.compose.ui.q r30, boolean r31, @fg.m kotlin.ranges.f<java.lang.Float> r32, @androidx.annotation.g0(from = 0) int r33, @fg.m ld.a<kotlin.k2> r34, @fg.m androidx.compose.material3.d9 r35, @fg.m androidx.compose.foundation.interaction.k r36, @fg.m androidx.compose.runtime.t r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.g9.e(float, ld.l, androidx.compose.ui.q, boolean, kotlin.ranges.f, int, ld.a, androidx.compose.material3.d9, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ad  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(float r23, @fg.l ld.l<? super java.lang.Float, kotlin.k2> r24, @fg.m androidx.compose.ui.q r25, boolean r26, @fg.m ld.a<kotlin.k2> r27, @fg.m androidx.compose.material3.d9 r28, @fg.m androidx.compose.foundation.interaction.k r29, @androidx.annotation.g0(from = 0) int r30, @fg.m ld.q<? super androidx.compose.material3.j9, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r31, @fg.m ld.q<? super androidx.compose.material3.j9, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r32, @fg.m kotlin.ranges.f<java.lang.Float> r33, @fg.m androidx.compose.runtime.t r34, int r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.g9.f(float, ld.l, androidx.compose.ui.q, boolean, ld.a, androidx.compose.material3.d9, androidx.compose.foundation.interaction.k, int, ld.q, ld.q, kotlin.ranges.f, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0083  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(@fg.l androidx.compose.material3.j9 r18, @fg.m androidx.compose.ui.q r19, boolean r20, @fg.m androidx.compose.material3.d9 r21, @fg.m androidx.compose.foundation.interaction.k r22, @fg.m ld.q<? super androidx.compose.material3.j9, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r23, @fg.m ld.q<? super androidx.compose.material3.j9, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r24, @fg.m androidx.compose.runtime.t r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.g9.g(androidx.compose.material3.j9, androidx.compose.ui.q, boolean, androidx.compose.material3.d9, androidx.compose.foundation.interaction.k, ld.q, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void h(androidx.compose.ui.q qVar, j9 j9Var, boolean z4, androidx.compose.foundation.interaction.k kVar, ld.q<? super j9, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.q<? super j9, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar3, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t tVar2;
        androidx.compose.runtime.t o4 = tVar.o(1390990089);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.q0(j9Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.b(z4) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.q0(kVar) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.S(qVar2) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.S(qVar3) ? 131072 : 65536;
        }
        int i6 = i5;
        if ((74899 & i6) == 74898 && o4.p()) {
            o4.d0();
            tVar2 = o4;
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1390990089, i6, -1, "androidx.compose.material3.SliderImpl (Slider.kt:672)");
            }
            j9Var.C(o4.x(androidx.compose.ui.platform.h1.p()) == androidx.compose.ui.unit.w.Rtl);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.q I = I(companion, j9Var, kVar, z4);
            androidx.compose.foundation.gestures.j0 j0Var = androidx.compose.foundation.gestures.j0.Horizontal;
            boolean u4 = j9Var.u();
            boolean t4 = j9Var.t();
            o4.P(1114013383);
            int i7 = i6 & 112;
            boolean z5 = i7 == 32;
            Object Q = o4.Q();
            if (z5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new e0(j9Var, null);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.ui.q k4 = androidx.compose.foundation.gestures.b0.k(companion, j9Var, j0Var, z4, kVar, t4, null, (ld.q) Q, u4, 32, null);
            androidx.compose.ui.q f4 = a6.f(qVar);
            c0.d1 d1Var = c0.d1.f37152a;
            androidx.compose.ui.q w32 = FocusableKt.b(H(androidx.compose.foundation.layout.c2.s(f4, d1Var.m(), d1Var.k(), 0.0f, 0.0f, 12, null), j9Var, z4), z4, kVar).w3(I).w3(k4);
            tVar2 = o4;
            tVar2.P(1114014176);
            boolean z6 = i7 == 32;
            Object Q2 = tVar2.Q();
            if (z6 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q2 = new c0(j9Var);
                tVar2.E(Q2);
            }
            androidx.compose.ui.layout.m0 m0Var = (androidx.compose.ui.layout.m0) Q2;
            tVar2.p0();
            tVar2.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar2, 0);
            androidx.compose.runtime.g0 B = tVar2.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(w32);
            if (tVar2.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar2.W();
            if (tVar2.getInserting()) {
                tVar2.F(a5);
            } else {
                tVar2.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion2, tVar2, m0Var, tVar2, B);
            if (tVar2.getInserting() || !kotlin.jvm.internal.l0.g(tVar2.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar2, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar2), tVar2, 2058660585);
            androidx.compose.ui.q b5 = androidx.compose.ui.layout.w.b(companion, e9.THUMB);
            tVar2.P(733328855);
            c.Companion companion3 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.m0 a7 = androidx.compose.animation.a0.a(companion3, false, tVar2, 0, -1323940314);
            int j5 = androidx.compose.runtime.p.j(tVar2, 0);
            androidx.compose.runtime.g0 B2 = tVar2.B();
            ld.a<androidx.compose.ui.node.g> a8 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(b5);
            if (tVar2.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar2.W();
            if (tVar2.getInserting()) {
                tVar2.F(a8);
            } else {
                tVar2.C();
            }
            ld.p a10 = androidx.compose.animation.p.a(companion2, tVar2, a7, tVar2, B2);
            if (tVar2.getInserting() || !kotlin.jvm.internal.l0.g(tVar2.Q(), Integer.valueOf(j5))) {
                androidx.compose.animation.d.a(j5, tVar2, j5, a10);
            }
            androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(tVar2), tVar2, 2058660585);
            androidx.compose.foundation.layout.p pVar = androidx.compose.foundation.layout.p.f5235a;
            int i10 = (i6 >> 3) & 14;
            qVar2.R(j9Var, tVar2, Integer.valueOf(((i6 >> 9) & 112) | i10));
            tVar2.p0();
            tVar2.H();
            tVar2.p0();
            tVar2.p0();
            androidx.compose.ui.q b6 = androidx.compose.ui.layout.w.b(companion, e9.TRACK);
            tVar2.P(733328855);
            androidx.compose.ui.layout.m0 a11 = androidx.compose.animation.a0.a(companion3, false, tVar2, 0, -1323940314);
            int j6 = androidx.compose.runtime.p.j(tVar2, 0);
            androidx.compose.runtime.g0 B3 = tVar2.B();
            ld.a<androidx.compose.ui.node.g> a12 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g6 = androidx.compose.ui.layout.a0.g(b6);
            if (tVar2.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar2.W();
            if (tVar2.getInserting()) {
                tVar2.F(a12);
            } else {
                tVar2.C();
            }
            ld.p a13 = androidx.compose.animation.p.a(companion2, tVar2, a11, tVar2, B3);
            if (tVar2.getInserting() || !kotlin.jvm.internal.l0.g(tVar2.Q(), Integer.valueOf(j6))) {
                androidx.compose.animation.d.a(j6, tVar2, j6, a13);
            }
            androidx.compose.animation.e.a(0, g6, androidx.compose.runtime.v3.a(tVar2), tVar2, 2058660585);
            qVar3.R(j9Var, tVar2, Integer.valueOf(i10 | ((i6 >> 12) & 112)));
            tVar2.p0();
            tVar2.H();
            tVar2.p0();
            tVar2.p0();
            tVar2.p0();
            tVar2.H();
            tVar2.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t5 = tVar2.t();
        if (t5 != null) {
            t5.a(new d0(qVar, j9Var, z4, kVar, qVar2, qVar3, i4));
        }
    }

    @androidx.compose.runtime.x4
    public static final long i(float f4, float f5) {
        if ((Float.isNaN(f4) && Float.isNaN(f5)) || f4 <= f5) {
            return i9.c((Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32));
        }
        throw new IllegalArgumentException(("start(" + f4 + ") must be <= endInclusive(" + f5 + ')').toString());
    }

    @androidx.compose.runtime.x4
    public static final long j(@fg.l kotlin.ranges.f<Float> fVar) {
        float floatValue = fVar.c().floatValue();
        float floatValue2 = fVar.h().floatValue();
        if ((Float.isNaN(floatValue) && Float.isNaN(floatValue2)) || floatValue <= floatValue2) {
            return i9.c((Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(floatValue2) & 4294967295L));
        }
        throw new IllegalArgumentException(("ClosedFloatingPointRange<Float>.start(" + floatValue + ") must be <= ClosedFloatingPoint.endInclusive(" + floatValue2 + ')').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(androidx.compose.ui.input.pointer.c r8, long r9, int r11, kotlin.coroutines.d<? super kotlin.q0<androidx.compose.ui.input.pointer.b0, java.lang.Float>> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material3.g9.f0
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.material3.g9$f0 r0 = (androidx.compose.material3.g9.f0) r0
            int r1 = r0.f11203d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f11203d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.material3.g9$f0 r0 = new androidx.compose.material3.g9$f0
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f11202c
            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r1 = r6.f11203d
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r8 = r6.f11201b
            kotlin.jvm.internal.k1$e r8 = (kotlin.jvm.internal.k1.e) r8
            kotlin.a1.n(r12)
            goto L53
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.a1.n(r12)
            kotlin.jvm.internal.k1$e r12 = new kotlin.jvm.internal.k1$e
            r12.<init>()
            androidx.compose.material3.g9$g0 r5 = new androidx.compose.material3.g9$g0
            r5.<init>(r12)
            r6.f11201b = r12
            r6.f11203d = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material3.s4.a(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L50
            return r0
        L50:
            r7 = r12
            r12 = r8
            r8 = r7
        L53:
            androidx.compose.ui.input.pointer.b0 r12 = (androidx.compose.ui.input.pointer.b0) r12
            if (r12 == 0) goto L64
            float r8 = r8.f75326b
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r8)
            kotlin.q0 r8 = new kotlin.q0
            r8.<init>(r12, r9)
            goto L65
        L64:
            r8 = 0
        L65:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.g9.w(androidx.compose.ui.input.pointer.c, long, int, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float x(float f4, float f5, float f6) {
        float f7 = f5 - f4;
        return kotlin.ranges.s.H(f7 == 0.0f ? 0.0f : (f6 - f4) / f7, 0.0f, 1.0f);
    }

    public static final float y() {
        return f11127a;
    }

    public static final float z() {
        return f11133g;
    }
}
