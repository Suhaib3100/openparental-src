package androidx.compose.material3;

import androidx.compose.material3.t9;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import androidx.compose.ui.t;
import androidx.profileinstaller.o;
import kotlin.Metadata;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aØ\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'\u001aØ\u0002\u0010)\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b)\u0010*\u001aª\u0002\u0010+\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b+\u0010,\u001aª\u0002\u0010-\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b-\u0010.\u001a\u0082\u0002\u0010:\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\r2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u00103\u001a\u0002022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0013\u00107\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b:\u0010;\u001a\u001b\u0010=\u001a\u00020\u001d*\u00020\u001d2\u0006\u0010<\u001a\u00020\u001dH\u0002¢\u0006\u0004\b=\u0010>\u001aj\u0010I\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u001d2\u0006\u00103\u001a\u0002022\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u0002022\u0006\u00109\u001a\u000208H\u0002ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001ar\u0010S\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u001d2\u0006\u0010O\u001a\u00020\u001d2\u0006\u0010P\u001a\u00020\u001d2\u0006\u0010Q\u001a\u00020\u001d2\u0006\u0010R\u001a\u00020\u001d2\u0006\u00103\u001a\u0002022\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u0002022\u0006\u00109\u001a\u000208H\u0002ø\u0001\u0000¢\u0006\u0004\bS\u0010T\u001a¡\u0001\u0010d\u001a\u00020\u0003*\u00020U2\u0006\u0010V\u001a\u00020\u001d2\u0006\u0010W\u001a\u00020\u001d2\b\u0010Y\u001a\u0004\u0018\u00010X2\b\u0010Z\u001a\u0004\u0018\u00010X2\b\u0010[\u001a\u0004\u0018\u00010X2\b\u0010\\\u001a\u0004\u0018\u00010X2\u0006\u0010]\u001a\u00020X2\b\u0010^\u001a\u0004\u0018\u00010X2\b\u0010_\u001a\u0004\u0018\u00010X2\u0006\u0010`\u001a\u00020X2\b\u0010a\u001a\u0004\u0018\u00010X2\u0006\u00103\u001a\u0002022\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010H\u001a\u0002022\u0006\u0010c\u001a\u00020b2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bd\u0010e\u001a&\u0010g\u001a\u00020\u0005*\u00020\u00052\u0006\u0010f\u001a\u0002042\u0006\u00109\u001a\u000208H\u0000ø\u0001\u0000¢\u0006\u0004\bg\u0010h\"\u0014\u0010k\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010j\"\u001a\u0010n\u001a\u00020i8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010j\u001a\u0004\bl\u0010m\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006o"}, d2 = {"", "value", "Lkotlin/Function1;", "Lkotlin/k2;", "onValueChange", "Landroidx/compose/ui/q;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/v0;", "textStyle", "Lkotlin/Function0;", "Landroidx/compose/runtime/i;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "Landroidx/compose/ui/text/input/k1;", "visualTransformation", "Landroidx/compose/foundation/text/f0;", "keyboardOptions", "Landroidx/compose/foundation/text/d0;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/material3/pa;", "colors", "c", "(Ljava/lang/String;Lld/l;Landroidx/compose/ui/q;ZZLandroidx/compose/ui/text/v0;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;ZLandroidx/compose/ui/text/input/k1;Landroidx/compose/foundation/text/f0;Landroidx/compose/foundation/text/d0;ZIILandroidx/compose/foundation/interaction/k;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/pa;Landroidx/compose/runtime/t;IIII)V", "Landroidx/compose/ui/text/input/z0;", "a", "(Landroidx/compose/ui/text/input/z0;Lld/l;Landroidx/compose/ui/q;ZZLandroidx/compose/ui/text/v0;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;ZLandroidx/compose/ui/text/input/k1;Landroidx/compose/foundation/text/f0;Landroidx/compose/foundation/text/d0;ZIILandroidx/compose/foundation/interaction/k;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/pa;Landroidx/compose/runtime/t;IIII)V", "d", "(Ljava/lang/String;Lld/l;Landroidx/compose/ui/q;ZZLandroidx/compose/ui/text/v0;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;ZLandroidx/compose/ui/text/input/k1;Landroidx/compose/foundation/text/f0;Landroidx/compose/foundation/text/d0;ZIILandroidx/compose/foundation/interaction/k;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/pa;Landroidx/compose/runtime/t;IIII)V", "b", "(Landroidx/compose/ui/text/input/z0;Lld/l;Landroidx/compose/ui/q;ZZLandroidx/compose/ui/text/v0;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;ZLandroidx/compose/ui/text/input/k1;Landroidx/compose/foundation/text/f0;Landroidx/compose/foundation/text/d0;ZIILandroidx/compose/foundation/interaction/k;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/pa;Landroidx/compose/runtime/t;IIII)V", "textField", "leading", "trailing", "", "animationProgress", "Li0/n;", "onLabelMeasured", "container", "supporting", "Landroidx/compose/foundation/layout/l1;", "paddingValues", "e", "(Landroidx/compose/ui/q;Lld/p;Lld/q;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;ZFLld/l;Lld/p;Lld/p;Landroidx/compose/foundation/layout/l1;Landroidx/compose/runtime/t;II)V", "from", "q", "(II)I", "leadingPlaceableWidth", "trailingPlaceableWidth", "prefixPlaceableWidth", "suffixPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "Landroidx/compose/ui/unit/b;", "constraints", "density", "l", "(IIIIIIIFJFLandroidx/compose/foundation/layout/l1;)I", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "textFieldHeight", "labelHeight", "placeholderHeight", "supportingHeight", "k", "(IIIIIIIIFJFLandroidx/compose/foundation/layout/l1;)I", "Landroidx/compose/ui/layout/i1$a;", "totalHeight", "width", "Landroidx/compose/ui/layout/i1;", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "containerPlaceable", "supportingPlaceable", "Landroidx/compose/ui/unit/w;", "layoutDirection", "o", "(Landroidx/compose/ui/layout/i1$a;IILandroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;FZFLandroidx/compose/ui/unit/w;Landroidx/compose/foundation/layout/l1;)V", "labelSize", "n", "(Landroidx/compose/ui/q;JLandroidx/compose/foundation/layout/l1;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/unit/h;", "F", "OutlinedTextFieldInnerPadding", "m", "()F", "OutlinedTextFieldTopPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1156:1\n74#2:1157\n74#2:1166\n74#2:1175\n74#2:1182\n74#2:1195\n1116#3,6:1158\n1116#3,6:1167\n1116#3,6:1176\n1116#3,6:1183\n1116#3,6:1189\n658#4:1164\n646#4:1165\n658#4:1173\n646#4:1174\n78#5,11:1196\n78#5,11:1229\n91#5:1261\n78#5,11:1268\n91#5:1300\n78#5,11:1314\n91#5:1346\n78#5,11:1354\n91#5:1386\n78#5,11:1396\n91#5:1428\n78#5,11:1436\n91#5:1468\n78#5,11:1476\n91#5:1508\n91#5:1513\n456#6,8:1207\n464#6,3:1221\n456#6,8:1240\n464#6,3:1254\n467#6,3:1258\n456#6,8:1279\n464#6,3:1293\n467#6,3:1297\n456#6,8:1325\n464#6,3:1339\n467#6,3:1343\n456#6,8:1365\n464#6,3:1379\n467#6,3:1383\n456#6,8:1407\n464#6,3:1421\n467#6,3:1425\n456#6,8:1447\n464#6,3:1461\n467#6,3:1465\n456#6,8:1487\n464#6,3:1501\n467#6,3:1505\n467#6,3:1510\n3737#7,6:1215\n3737#7,6:1248\n3737#7,6:1287\n3737#7,6:1333\n3737#7,6:1373\n3737#7,6:1415\n3737#7,6:1455\n3737#7,6:1495\n69#8,5:1224\n74#8:1257\n78#8:1262\n69#8,5:1263\n74#8:1296\n78#8:1301\n68#8,6:1308\n74#8:1342\n78#8:1347\n68#8,6:1348\n74#8:1382\n78#8:1387\n68#8,6:1390\n74#8:1424\n78#8:1429\n68#8,6:1430\n74#8:1464\n78#8:1469\n68#8,6:1470\n74#8:1504\n78#8:1509\n58#9:1302\n58#9:1305\n51#9:1514\n154#10:1303\n211#10:1304\n154#10:1306\n211#10:1307\n154#10:1388\n154#10:1389\n154#10:1515\n154#10:1516\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt\n*L\n148#1:1157\n308#1:1166\n403#1:1175\n456#1:1182\n531#1:1195\n163#1:1158,6\n323#1:1167,6\n416#1:1176,6\n469#1:1183,6\n523#1:1189,6\n168#1:1164\n168#1:1165\n328#1:1173\n328#1:1174\n532#1:1196,11\n538#1:1229,11\n538#1:1261\n546#1:1268,11\n546#1:1300\n569#1:1314,11\n569#1:1346\n580#1:1354,11\n580#1:1386\n605#1:1396,11\n605#1:1428\n615#1:1436,11\n615#1:1468\n624#1:1476,11\n624#1:1508\n532#1:1513\n532#1:1207,8\n532#1:1221,3\n538#1:1240,8\n538#1:1254,3\n538#1:1258,3\n546#1:1279,8\n546#1:1293,3\n546#1:1297,3\n569#1:1325,8\n569#1:1339,3\n569#1:1343,3\n580#1:1365,8\n580#1:1379,3\n580#1:1383,3\n605#1:1407,8\n605#1:1421,3\n605#1:1425,3\n615#1:1447,8\n615#1:1461,3\n615#1:1465,3\n624#1:1487,8\n624#1:1501,3\n624#1:1505,3\n532#1:1510,3\n532#1:1215,6\n538#1:1248,6\n546#1:1287,6\n569#1:1333,6\n580#1:1373,6\n605#1:1415,6\n615#1:1455,6\n624#1:1495,6\n538#1:1224,5\n538#1:1257\n538#1:1262\n546#1:1263,5\n546#1:1296\n546#1:1301\n569#1:1308,6\n569#1:1342\n569#1:1347\n580#1:1348,6\n580#1:1382\n580#1:1387\n605#1:1390,6\n605#1:1424\n605#1:1429\n615#1:1430,6\n615#1:1464\n615#1:1469\n624#1:1470,6\n624#1:1504\n624#1:1509\n558#1:1302\n563#1:1305\n969#1:1514\n558#1:1303\n558#1:1304\n563#1:1306\n563#1:1307\n595#1:1388\n596#1:1389\n1147#1:1515\n1155#1:1516\n*E\n"})
/* loaded from: classes.dex */
public final class r7 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f14076a = androidx.compose.ui.unit.h.g(4);

    /* renamed from: b, reason: collision with root package name */
    private static final float f14077b = 8;

    /* compiled from: OutlinedTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f14078b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.input.z0, kotlin.k2> f14079c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14080d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f14081e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f14082f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f14083g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14084h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14085i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14086j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14087k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14088l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f14089m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f14090n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.f0 f14091o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.d0 f14092p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f14093q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f14094r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f14095s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14096t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f14097u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ pa f14098v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f14099w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f14100x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f14101y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ int f14102z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.text.input.z0 z0Var, ld.l<? super androidx.compose.ui.text.input.z0, kotlin.k2> lVar, androidx.compose.ui.q qVar, boolean z4, boolean z5, androidx.compose.ui.text.v0 v0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, boolean z6, androidx.compose.ui.text.input.k1 k1Var, androidx.compose.foundation.text.f0 f0Var, androidx.compose.foundation.text.d0 d0Var, boolean z7, int i4, int i5, androidx.compose.foundation.interaction.k kVar, androidx.compose.ui.graphics.e6 e6Var, pa paVar, int i6, int i7, int i10, int i11) {
            super(2);
            this.f14078b = z0Var;
            this.f14079c = lVar;
            this.f14080d = qVar;
            this.f14081e = z4;
            this.f14082f = z5;
            this.f14083g = v0Var;
            this.f14084h = pVar;
            this.f14085i = pVar2;
            this.f14086j = pVar3;
            this.f14087k = pVar4;
            this.f14088l = pVar5;
            this.f14089m = z6;
            this.f14090n = k1Var;
            this.f14091o = f0Var;
            this.f14092p = d0Var;
            this.f14093q = z7;
            this.f14094r = i4;
            this.f14095s = i5;
            this.f14096t = kVar;
            this.f14097u = e6Var;
            this.f14098v = paVar;
            this.f14099w = i6;
            this.f14100x = i7;
            this.f14101y = i10;
            this.f14102z = i11;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r7.b(this.f14078b, this.f14079c, this.f14080d, this.f14081e, this.f14082f, this.f14083g, this.f14084h, this.f14085i, this.f14086j, this.f14087k, this.f14088l, this.f14089m, this.f14090n, this.f14091o, this.f14092p, this.f14093q, this.f14094r, this.f14095s, this.f14096t, this.f14097u, this.f14098v, tVar, androidx.compose.runtime.g3.b(this.f14099w | 1), androidx.compose.runtime.g3.b(this.f14100x), androidx.compose.runtime.g3.b(this.f14101y), this.f14102z);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextField$2\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n*L\n1#1,1156:1\n50#2:1157\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextField$2\n*L\n185#1:1157\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14103b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14104c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f14105d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ pa f14106e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f14107f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.l<String, kotlin.k2> f14108g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f14109h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f14110i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f14111j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.f0 f14112k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.d0 f14113l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f14114m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f14115n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f14116o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f14117p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14118q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14119r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14120s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14121t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14122u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14123v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14124w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f14125x;

        /* compiled from: OutlinedTextField.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f14126b = new a(1);

            a() {
                super(1);
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            }

            @Override // ld.l
            public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: OutlinedTextField.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "innerTextField", "a", "(Lld/p;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.r7$b$b, reason: collision with other inner class name */
        static final class C0291b extends kotlin.jvm.internal.n0 implements ld.q<ld.p<? super androidx.compose.runtime.t, ? super Integer, ? extends kotlin.k2>, androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f14127b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f14128c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f14129d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.k1 f14130e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.interaction.k f14131f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f14132g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14133h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14134i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14135j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14136k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14137l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14138m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14139n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ pa f14140o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.graphics.e6 f14141p;

            /* compiled from: OutlinedTextField.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.r7$b$b$a */
            static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f14142b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f14143c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.interaction.k f14144d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ pa f14145e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.graphics.e6 f14146f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(boolean z4, boolean z5, androidx.compose.foundation.interaction.k kVar, pa paVar, androidx.compose.ui.graphics.e6 e6Var) {
                    super(2);
                    this.f14142b = z4;
                    this.f14143c = z5;
                    this.f14144d = kVar;
                    this.f14145e = paVar;
                    this.f14146f = e6Var;
                }

                @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.i
                public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                    if ((i4 & 3) == 2 && tVar.p()) {
                        tVar.d0();
                        return;
                    }
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.r0(2108828640, i4, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:219)");
                    }
                    q7.f13678a.a(this.f14142b, this.f14143c, this.f14144d, this.f14145e, this.f14146f, 0.0f, 0.0f, tVar, 12582912, 96);
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
            /* JADX WARN: Multi-variable type inference failed */
            C0291b(String str, boolean z4, boolean z5, androidx.compose.ui.text.input.k1 k1Var, androidx.compose.foundation.interaction.k kVar, boolean z6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7, pa paVar, androidx.compose.ui.graphics.e6 e6Var) {
                super(3);
                this.f14127b = str;
                this.f14128c = z4;
                this.f14129d = z5;
                this.f14130e = k1Var;
                this.f14131f = kVar;
                this.f14132g = z6;
                this.f14133h = pVar;
                this.f14134i = pVar2;
                this.f14135j = pVar3;
                this.f14136k = pVar4;
                this.f14137l = pVar5;
                this.f14138m = pVar6;
                this.f14139n = pVar7;
                this.f14140o = paVar;
                this.f14141p = e6Var;
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
                    androidx.compose.runtime.x.r0(1474611661, i5, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:202)");
                }
                q7 q7Var = q7.f13678a;
                String str = this.f14127b;
                boolean z4 = this.f14128c;
                boolean z5 = this.f14129d;
                androidx.compose.ui.text.input.k1 k1Var = this.f14130e;
                androidx.compose.foundation.interaction.k kVar = this.f14131f;
                boolean z6 = this.f14132g;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar2 = this.f14133h;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar3 = this.f14134i;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar4 = this.f14135j;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar5 = this.f14136k;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar6 = this.f14137l;
                int i6 = i5;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar7 = this.f14138m;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar8 = this.f14139n;
                pa paVar = this.f14140o;
                q7Var.b(str, pVar, z4, z5, k1Var, kVar, z6, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, paVar, null, androidx.compose.runtime.internal.c.b(tVar, 2108828640, true, new a(z4, z6, kVar, paVar, this.f14141p)), tVar, (i6 << 3) & 112, 14155776, 32768);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, boolean z4, pa paVar, String str, ld.l<? super String, kotlin.k2> lVar, boolean z5, boolean z6, androidx.compose.ui.text.v0 v0Var, androidx.compose.foundation.text.f0 f0Var, androidx.compose.foundation.text.d0 d0Var, boolean z7, int i4, int i5, androidx.compose.ui.text.input.k1 k1Var, androidx.compose.foundation.interaction.k kVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7, androidx.compose.ui.graphics.e6 e6Var) {
            super(2);
            this.f14103b = pVar;
            this.f14104c = qVar;
            this.f14105d = z4;
            this.f14106e = paVar;
            this.f14107f = str;
            this.f14108g = lVar;
            this.f14109h = z5;
            this.f14110i = z6;
            this.f14111j = v0Var;
            this.f14112k = f0Var;
            this.f14113l = d0Var;
            this.f14114m = z7;
            this.f14115n = i4;
            this.f14116o = i5;
            this.f14117p = k1Var;
            this.f14118q = kVar;
            this.f14119r = pVar2;
            this.f14120s = pVar3;
            this.f14121t = pVar4;
            this.f14122u = pVar5;
            this.f14123v = pVar6;
            this.f14124w = pVar7;
            this.f14125x = e6Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1886965181, i4, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:173)");
            }
            androidx.compose.ui.q o4 = this.f14103b != null ? androidx.compose.foundation.layout.j1.o(androidx.compose.ui.semantics.o.e(this.f14104c, true, a.f14126b), 0.0f, r7.m(), 0.0f, 0.0f, 13, null) : this.f14104c;
            boolean z4 = this.f14105d;
            t9.Companion companion = t9.INSTANCE;
            androidx.compose.ui.q c5 = sa.c(o4, z4, v9.a(t.c.f20446c, tVar, 0));
            q7 q7Var = q7.f13678a;
            androidx.compose.ui.q a5 = androidx.compose.foundation.layout.c2.a(c5, q7Var.j(), q7Var.i());
            androidx.compose.ui.graphics.g6 g6Var = new androidx.compose.ui.graphics.g6(this.f14106e.e(this.f14105d, tVar, 0).getValue().M(), null);
            String str = this.f14107f;
            ld.l<String, kotlin.k2> lVar = this.f14108g;
            boolean z5 = this.f14109h;
            boolean z6 = this.f14110i;
            androidx.compose.ui.text.v0 v0Var = this.f14111j;
            androidx.compose.foundation.text.f0 f0Var = this.f14112k;
            androidx.compose.foundation.text.d0 d0Var = this.f14113l;
            boolean z7 = this.f14114m;
            int i5 = this.f14115n;
            int i6 = this.f14116o;
            androidx.compose.ui.text.input.k1 k1Var = this.f14117p;
            androidx.compose.foundation.interaction.k kVar = this.f14118q;
            androidx.compose.foundation.text.c.c(str, lVar, a5, z5, z6, v0Var, f0Var, d0Var, z7, i5, i6, k1Var, null, kVar, g6Var, androidx.compose.runtime.internal.c.b(tVar, 1474611661, true, new C0291b(str, z5, z7, k1Var, kVar, this.f14105d, this.f14103b, this.f14119r, this.f14120s, this.f14121t, this.f14122u, this.f14123v, this.f14124w, this.f14106e, this.f14125x)), tVar, 0, o.c.f32821k, 4096);
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

    /* compiled from: OutlinedTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {
        final /* synthetic */ int A;
        final /* synthetic */ int B;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f14147b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<String, kotlin.k2> f14148c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14149d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f14150e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f14151f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f14152g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14153h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14154i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14155j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14156k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14157l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14158m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14159n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f14160o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f14161p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.f0 f14162q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.d0 f14163r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f14164s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f14165t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f14166u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14167v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f14168w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ pa f14169x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f14170y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ int f14171z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(String str, ld.l<? super String, kotlin.k2> lVar, androidx.compose.ui.q qVar, boolean z4, boolean z5, androidx.compose.ui.text.v0 v0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7, boolean z6, androidx.compose.ui.text.input.k1 k1Var, androidx.compose.foundation.text.f0 f0Var, androidx.compose.foundation.text.d0 d0Var, boolean z7, int i4, int i5, androidx.compose.foundation.interaction.k kVar, androidx.compose.ui.graphics.e6 e6Var, pa paVar, int i6, int i7, int i10, int i11) {
            super(2);
            this.f14147b = str;
            this.f14148c = lVar;
            this.f14149d = qVar;
            this.f14150e = z4;
            this.f14151f = z5;
            this.f14152g = v0Var;
            this.f14153h = pVar;
            this.f14154i = pVar2;
            this.f14155j = pVar3;
            this.f14156k = pVar4;
            this.f14157l = pVar5;
            this.f14158m = pVar6;
            this.f14159n = pVar7;
            this.f14160o = z6;
            this.f14161p = k1Var;
            this.f14162q = f0Var;
            this.f14163r = d0Var;
            this.f14164s = z7;
            this.f14165t = i4;
            this.f14166u = i5;
            this.f14167v = kVar;
            this.f14168w = e6Var;
            this.f14169x = paVar;
            this.f14170y = i6;
            this.f14171z = i7;
            this.A = i10;
            this.B = i11;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r7.c(this.f14147b, this.f14148c, this.f14149d, this.f14150e, this.f14151f, this.f14152g, this.f14153h, this.f14154i, this.f14155j, this.f14156k, this.f14157l, this.f14158m, this.f14159n, this.f14160o, this.f14161p, this.f14162q, this.f14163r, this.f14164s, this.f14165t, this.f14166u, this.f14167v, this.f14168w, this.f14169x, tVar, androidx.compose.runtime.g3.b(this.f14170y | 1), androidx.compose.runtime.g3.b(this.f14171z), androidx.compose.runtime.g3.b(this.A), this.B);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextField$5\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n*L\n1#1,1156:1\n50#2:1157\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextField$5\n*L\n345#1:1157\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14172b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14173c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f14174d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ pa f14175e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f14176f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.input.z0, kotlin.k2> f14177g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f14178h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f14179i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f14180j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.f0 f14181k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.d0 f14182l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f14183m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f14184n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f14185o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f14186p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14187q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14188r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14189s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14190t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14191u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14192v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14193w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f14194x;

        /* compiled from: OutlinedTextField.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f14195b = new a(1);

            a() {
                super(1);
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            }

            @Override // ld.l
            public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: OutlinedTextField.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "innerTextField", "a", "(Lld/p;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.q<ld.p<? super androidx.compose.runtime.t, ? super Integer, ? extends kotlin.k2>, androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.z0 f14196b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f14197c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f14198d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.k1 f14199e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.interaction.k f14200f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f14201g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14202h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14203i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14204j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14205k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14206l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14207m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14208n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ pa f14209o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.graphics.e6 f14210p;

            /* compiled from: OutlinedTextField.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
            static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f14211b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f14212c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.interaction.k f14213d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ pa f14214e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.graphics.e6 f14215f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(boolean z4, boolean z5, androidx.compose.foundation.interaction.k kVar, pa paVar, androidx.compose.ui.graphics.e6 e6Var) {
                    super(2);
                    this.f14211b = z4;
                    this.f14212c = z5;
                    this.f14213d = kVar;
                    this.f14214e = paVar;
                    this.f14215f = e6Var;
                }

                @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.i
                public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                    if ((i4 & 3) == 2 && tVar.p()) {
                        tVar.d0();
                        return;
                    }
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.r0(255570733, i4, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:379)");
                    }
                    q7.f13678a.a(this.f14211b, this.f14212c, this.f14213d, this.f14214e, this.f14215f, 0.0f, 0.0f, tVar, 12582912, 96);
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
            /* JADX WARN: Multi-variable type inference failed */
            b(androidx.compose.ui.text.input.z0 z0Var, boolean z4, boolean z5, androidx.compose.ui.text.input.k1 k1Var, androidx.compose.foundation.interaction.k kVar, boolean z6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7, pa paVar, androidx.compose.ui.graphics.e6 e6Var) {
                super(3);
                this.f14196b = z0Var;
                this.f14197c = z4;
                this.f14198d = z5;
                this.f14199e = k1Var;
                this.f14200f = kVar;
                this.f14201g = z6;
                this.f14202h = pVar;
                this.f14203i = pVar2;
                this.f14204j = pVar3;
                this.f14205k = pVar4;
                this.f14206l = pVar5;
                this.f14207m = pVar6;
                this.f14208n = pVar7;
                this.f14209o = paVar;
                this.f14210p = e6Var;
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
                    androidx.compose.runtime.x.r0(-757328870, i5, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:362)");
                }
                q7 q7Var = q7.f13678a;
                String i6 = this.f14196b.i();
                boolean z4 = this.f14197c;
                boolean z5 = this.f14198d;
                androidx.compose.ui.text.input.k1 k1Var = this.f14199e;
                androidx.compose.foundation.interaction.k kVar = this.f14200f;
                boolean z6 = this.f14201g;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar2 = this.f14202h;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar3 = this.f14203i;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar4 = this.f14204j;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar5 = this.f14205k;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar6 = this.f14206l;
                int i7 = i5;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar7 = this.f14207m;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar8 = this.f14208n;
                pa paVar = this.f14209o;
                q7Var.b(i6, pVar, z4, z5, k1Var, kVar, z6, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, paVar, null, androidx.compose.runtime.internal.c.b(tVar, 255570733, true, new a(z4, z6, kVar, paVar, this.f14210p)), tVar, (i7 << 3) & 112, 14155776, 32768);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, boolean z4, pa paVar, androidx.compose.ui.text.input.z0 z0Var, ld.l<? super androidx.compose.ui.text.input.z0, kotlin.k2> lVar, boolean z5, boolean z6, androidx.compose.ui.text.v0 v0Var, androidx.compose.foundation.text.f0 f0Var, androidx.compose.foundation.text.d0 d0Var, boolean z7, int i4, int i5, androidx.compose.ui.text.input.k1 k1Var, androidx.compose.foundation.interaction.k kVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7, androidx.compose.ui.graphics.e6 e6Var) {
            super(2);
            this.f14172b = pVar;
            this.f14173c = qVar;
            this.f14174d = z4;
            this.f14175e = paVar;
            this.f14176f = z0Var;
            this.f14177g = lVar;
            this.f14178h = z5;
            this.f14179i = z6;
            this.f14180j = v0Var;
            this.f14181k = f0Var;
            this.f14182l = d0Var;
            this.f14183m = z7;
            this.f14184n = i4;
            this.f14185o = i5;
            this.f14186p = k1Var;
            this.f14187q = kVar;
            this.f14188r = pVar2;
            this.f14189s = pVar3;
            this.f14190t = pVar4;
            this.f14191u = pVar5;
            this.f14192v = pVar6;
            this.f14193w = pVar7;
            this.f14194x = e6Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1830921872, i4, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:333)");
            }
            androidx.compose.ui.q o4 = this.f14172b != null ? androidx.compose.foundation.layout.j1.o(androidx.compose.ui.semantics.o.e(this.f14173c, true, a.f14195b), 0.0f, r7.m(), 0.0f, 0.0f, 13, null) : this.f14173c;
            boolean z4 = this.f14174d;
            t9.Companion companion = t9.INSTANCE;
            androidx.compose.ui.q c5 = sa.c(o4, z4, v9.a(t.c.f20446c, tVar, 0));
            q7 q7Var = q7.f13678a;
            androidx.compose.ui.q a5 = androidx.compose.foundation.layout.c2.a(c5, q7Var.j(), q7Var.i());
            androidx.compose.ui.graphics.g6 g6Var = new androidx.compose.ui.graphics.g6(this.f14175e.e(this.f14174d, tVar, 0).getValue().M(), null);
            androidx.compose.ui.text.input.z0 z0Var = this.f14176f;
            ld.l<androidx.compose.ui.text.input.z0, kotlin.k2> lVar = this.f14177g;
            boolean z5 = this.f14178h;
            boolean z6 = this.f14179i;
            androidx.compose.ui.text.v0 v0Var = this.f14180j;
            androidx.compose.foundation.text.f0 f0Var = this.f14181k;
            androidx.compose.foundation.text.d0 d0Var = this.f14182l;
            boolean z7 = this.f14183m;
            int i5 = this.f14184n;
            int i6 = this.f14185o;
            androidx.compose.ui.text.input.k1 k1Var = this.f14186p;
            androidx.compose.foundation.interaction.k kVar = this.f14187q;
            androidx.compose.foundation.text.c.a(z0Var, lVar, a5, z5, z6, v0Var, f0Var, d0Var, z7, i5, i6, k1Var, null, kVar, g6Var, androidx.compose.runtime.internal.c.b(tVar, -757328870, true, new b(z0Var, z5, z7, k1Var, kVar, this.f14174d, this.f14172b, this.f14188r, this.f14189s, this.f14190t, this.f14191u, this.f14192v, this.f14193w, this.f14175e, this.f14194x)), tVar, 0, o.c.f32821k, 4096);
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

    /* compiled from: OutlinedTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {
        final /* synthetic */ int A;
        final /* synthetic */ int B;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f14216b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.input.z0, kotlin.k2> f14217c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14218d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f14219e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f14220f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f14221g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14222h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14223i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14224j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14225k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14226l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14227m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14228n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f14229o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f14230p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.f0 f14231q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.d0 f14232r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f14233s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f14234t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f14235u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14236v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f14237w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ pa f14238x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f14239y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ int f14240z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.ui.text.input.z0 z0Var, ld.l<? super androidx.compose.ui.text.input.z0, kotlin.k2> lVar, androidx.compose.ui.q qVar, boolean z4, boolean z5, androidx.compose.ui.text.v0 v0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7, boolean z6, androidx.compose.ui.text.input.k1 k1Var, androidx.compose.foundation.text.f0 f0Var, androidx.compose.foundation.text.d0 d0Var, boolean z7, int i4, int i5, androidx.compose.foundation.interaction.k kVar, androidx.compose.ui.graphics.e6 e6Var, pa paVar, int i6, int i7, int i10, int i11) {
            super(2);
            this.f14216b = z0Var;
            this.f14217c = lVar;
            this.f14218d = qVar;
            this.f14219e = z4;
            this.f14220f = z5;
            this.f14221g = v0Var;
            this.f14222h = pVar;
            this.f14223i = pVar2;
            this.f14224j = pVar3;
            this.f14225k = pVar4;
            this.f14226l = pVar5;
            this.f14227m = pVar6;
            this.f14228n = pVar7;
            this.f14229o = z6;
            this.f14230p = k1Var;
            this.f14231q = f0Var;
            this.f14232r = d0Var;
            this.f14233s = z7;
            this.f14234t = i4;
            this.f14235u = i5;
            this.f14236v = kVar;
            this.f14237w = e6Var;
            this.f14238x = paVar;
            this.f14239y = i6;
            this.f14240z = i7;
            this.A = i10;
            this.B = i11;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r7.a(this.f14216b, this.f14217c, this.f14218d, this.f14219e, this.f14220f, this.f14221g, this.f14222h, this.f14223i, this.f14224j, this.f14225k, this.f14226l, this.f14227m, this.f14228n, this.f14229o, this.f14230p, this.f14231q, this.f14232r, this.f14233s, this.f14234t, this.f14235u, this.f14236v, this.f14237w, this.f14238x, tVar, androidx.compose.runtime.g3.b(this.f14239y | 1), androidx.compose.runtime.g3.b(this.f14240z), androidx.compose.runtime.g3.b(this.A), this.B);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f14241b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<String, kotlin.k2> f14242c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14243d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f14244e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f14245f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f14246g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14247h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14248i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14249j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14250k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14251l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f14252m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f14253n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.f0 f14254o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.d0 f14255p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f14256q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f14257r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f14258s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14259t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f14260u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ pa f14261v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f14262w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f14263x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f14264y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ int f14265z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(String str, ld.l<? super String, kotlin.k2> lVar, androidx.compose.ui.q qVar, boolean z4, boolean z5, androidx.compose.ui.text.v0 v0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, boolean z6, androidx.compose.ui.text.input.k1 k1Var, androidx.compose.foundation.text.f0 f0Var, androidx.compose.foundation.text.d0 d0Var, boolean z7, int i4, int i5, androidx.compose.foundation.interaction.k kVar, androidx.compose.ui.graphics.e6 e6Var, pa paVar, int i6, int i7, int i10, int i11) {
            super(2);
            this.f14241b = str;
            this.f14242c = lVar;
            this.f14243d = qVar;
            this.f14244e = z4;
            this.f14245f = z5;
            this.f14246g = v0Var;
            this.f14247h = pVar;
            this.f14248i = pVar2;
            this.f14249j = pVar3;
            this.f14250k = pVar4;
            this.f14251l = pVar5;
            this.f14252m = z6;
            this.f14253n = k1Var;
            this.f14254o = f0Var;
            this.f14255p = d0Var;
            this.f14256q = z7;
            this.f14257r = i4;
            this.f14258s = i5;
            this.f14259t = kVar;
            this.f14260u = e6Var;
            this.f14261v = paVar;
            this.f14262w = i6;
            this.f14263x = i7;
            this.f14264y = i10;
            this.f14265z = i11;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r7.d(this.f14241b, this.f14242c, this.f14243d, this.f14244e, this.f14245f, this.f14246g, this.f14247h, this.f14248i, this.f14249j, this.f14250k, this.f14251l, this.f14252m, this.f14253n, this.f14254o, this.f14255p, this.f14256q, this.f14257r, this.f14258s, this.f14259t, this.f14260u, this.f14261v, tVar, androidx.compose.runtime.g3.b(this.f14262w | 1), androidx.compose.runtime.g3.b(this.f14263x), androidx.compose.runtime.g3.b(this.f14264y), this.f14265z);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14266b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14267c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, kotlin.k2> f14268d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14269e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14270f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14271g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14272h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14273i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f14274j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f14275k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.l<i0.n, kotlin.k2> f14276l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14277m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14278n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f14279o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f14280p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f14281q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.q<? super androidx.compose.ui.q, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6, boolean z4, float f4, ld.l<? super i0.n, kotlin.k2> lVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar8, androidx.compose.foundation.layout.l1 l1Var, int i4, int i5) {
            super(2);
            this.f14266b = qVar;
            this.f14267c = pVar;
            this.f14268d = qVar2;
            this.f14269e = pVar2;
            this.f14270f = pVar3;
            this.f14271g = pVar4;
            this.f14272h = pVar5;
            this.f14273i = pVar6;
            this.f14274j = z4;
            this.f14275k = f4;
            this.f14276l = lVar;
            this.f14277m = pVar7;
            this.f14278n = pVar8;
            this.f14279o = l1Var;
            this.f14280p = i4;
            this.f14281q = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r7.e(this.f14266b, this.f14267c, this.f14268d, this.f14269e, this.f14270f, this.f14271g, this.f14272h, this.f14273i, this.f14274j, this.f14275k, this.f14276l, this.f14277m, this.f14278n, this.f14279o, tVar, androidx.compose.runtime.g3.b(this.f14280p | 1), androidx.compose.runtime.g3.b(this.f14281q));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt$outlineCutout$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1156:1\n222#2:1157\n262#2,11:1158\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt$outlineCutout$1\n*L\n1139#1:1157\n1139#1:1158,11\n*E\n"})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.c, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f14282b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f14283c;

        /* compiled from: OutlinedTextField.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f14284a;

            static {
                int[] iArr = new int[androidx.compose.ui.unit.w.values().length];
                try {
                    iArr[androidx.compose.ui.unit.w.Rtl.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f14284a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j4, androidx.compose.foundation.layout.l1 l1Var) {
            super(1);
            this.f14282b = j4;
            this.f14283c = l1Var;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
            float t4 = i0.n.t(this.f14282b);
            if (t4 <= 0.0f) {
                cVar.G6();
                return;
            }
            float v5 = cVar.v5(r7.f14076a);
            float v52 = cVar.v5(this.f14283c.b(cVar.getLayoutDirection())) - v5;
            float f4 = 2;
            float f5 = (v5 * f4) + t4 + v52;
            androidx.compose.ui.unit.w layoutDirection = cVar.getLayoutDirection();
            int[] iArr = a.f14284a;
            float t5 = iArr[layoutDirection.ordinal()] == 1 ? i0.n.t(cVar.e()) - f5 : kotlin.ranges.s.t(v52, 0.0f);
            if (iArr[cVar.getLayoutDirection().ordinal()] == 1) {
                f5 = i0.n.t(cVar.e()) - kotlin.ranges.s.t(v52, 0.0f);
            }
            float m4 = i0.n.m(this.f14282b);
            float f6 = (-m4) / f4;
            float f7 = m4 / f4;
            androidx.compose.ui.graphics.c2.INSTANCE.getClass();
            int i4 = androidx.compose.ui.graphics.c2.f17636c;
            androidx.compose.ui.graphics.drawscope.d drawContext = cVar.getDrawContext();
            long e4 = drawContext.e();
            drawContext.i().C();
            drawContext.getTransform().b(t5, f6, f5, f7, i4);
            cVar.G6();
            drawContext.i().o();
            drawContext.j(e4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.c cVar) {
            a(cVar);
            return kotlin.k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a2  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l androidx.compose.ui.text.input.z0 r82, @fg.l ld.l<? super androidx.compose.ui.text.input.z0, kotlin.k2> r83, @fg.m androidx.compose.ui.q r84, boolean r85, boolean r86, @fg.m androidx.compose.ui.text.v0 r87, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r88, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r89, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r90, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r91, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r92, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r93, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r94, boolean r95, @fg.m androidx.compose.ui.text.input.k1 r96, @fg.m androidx.compose.foundation.text.f0 r97, @fg.m androidx.compose.foundation.text.d0 r98, boolean r99, int r100, int r101, @fg.m androidx.compose.foundation.interaction.k r102, @fg.m androidx.compose.ui.graphics.e6 r103, @fg.m androidx.compose.material3.pa r104, @fg.m androidx.compose.runtime.t r105, int r106, int r107, int r108, int r109) {
        /*
            Method dump skipped, instructions count: 1497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.r7.a(androidx.compose.ui.text.input.z0, ld.l, androidx.compose.ui.q, boolean, boolean, androidx.compose.ui.text.v0, ld.p, ld.p, ld.p, ld.p, ld.p, ld.p, ld.p, boolean, androidx.compose.ui.text.input.k1, androidx.compose.foundation.text.f0, androidx.compose.foundation.text.d0, boolean, int, int, androidx.compose.foundation.interaction.k, androidx.compose.ui.graphics.e6, androidx.compose.material3.pa, androidx.compose.runtime.t, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0286  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use overload with prefix and suffix parameters")
    @androidx.compose.material3.f5
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.text.input.z0 r53, ld.l r54, androidx.compose.ui.q r55, boolean r56, boolean r57, androidx.compose.ui.text.v0 r58, ld.p r59, ld.p r60, ld.p r61, ld.p r62, ld.p r63, boolean r64, androidx.compose.ui.text.input.k1 r65, androidx.compose.foundation.text.f0 r66, androidx.compose.foundation.text.d0 r67, boolean r68, int r69, int r70, androidx.compose.foundation.interaction.k r71, androidx.compose.ui.graphics.e6 r72, androidx.compose.material3.pa r73, androidx.compose.runtime.t r74, int r75, int r76, int r77, int r78) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.r7.b(androidx.compose.ui.text.input.z0, ld.l, androidx.compose.ui.q, boolean, boolean, androidx.compose.ui.text.v0, ld.p, ld.p, ld.p, ld.p, ld.p, boolean, androidx.compose.ui.text.input.k1, androidx.compose.foundation.text.f0, androidx.compose.foundation.text.d0, boolean, int, int, androidx.compose.foundation.interaction.k, androidx.compose.ui.graphics.e6, androidx.compose.material3.pa, androidx.compose.runtime.t, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a2  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@fg.l java.lang.String r82, @fg.l ld.l<? super java.lang.String, kotlin.k2> r83, @fg.m androidx.compose.ui.q r84, boolean r85, boolean r86, @fg.m androidx.compose.ui.text.v0 r87, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r88, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r89, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r90, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r91, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r92, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r93, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r94, boolean r95, @fg.m androidx.compose.ui.text.input.k1 r96, @fg.m androidx.compose.foundation.text.f0 r97, @fg.m androidx.compose.foundation.text.d0 r98, boolean r99, int r100, int r101, @fg.m androidx.compose.foundation.interaction.k r102, @fg.m androidx.compose.ui.graphics.e6 r103, @fg.m androidx.compose.material3.pa r104, @fg.m androidx.compose.runtime.t r105, int r106, int r107, int r108, int r109) {
        /*
            Method dump skipped, instructions count: 1497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.r7.c(java.lang.String, ld.l, androidx.compose.ui.q, boolean, boolean, androidx.compose.ui.text.v0, ld.p, ld.p, ld.p, ld.p, ld.p, ld.p, ld.p, boolean, androidx.compose.ui.text.input.k1, androidx.compose.foundation.text.f0, androidx.compose.foundation.text.d0, boolean, int, int, androidx.compose.foundation.interaction.k, androidx.compose.ui.graphics.e6, androidx.compose.material3.pa, androidx.compose.runtime.t, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0286  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use overload with prefix and suffix parameters")
    @androidx.compose.material3.f5
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(java.lang.String r53, ld.l r54, androidx.compose.ui.q r55, boolean r56, boolean r57, androidx.compose.ui.text.v0 r58, ld.p r59, ld.p r60, ld.p r61, ld.p r62, ld.p r63, boolean r64, androidx.compose.ui.text.input.k1 r65, androidx.compose.foundation.text.f0 r66, androidx.compose.foundation.text.d0 r67, boolean r68, int r69, int r70, androidx.compose.foundation.interaction.k r71, androidx.compose.ui.graphics.e6 r72, androidx.compose.material3.pa r73, androidx.compose.runtime.t r74, int r75, int r76, int r77, int r78) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.r7.d(java.lang.String, ld.l, androidx.compose.ui.q, boolean, boolean, androidx.compose.ui.text.v0, ld.p, ld.p, ld.p, ld.p, ld.p, boolean, androidx.compose.ui.text.input.k1, androidx.compose.foundation.text.f0, androidx.compose.foundation.text.d0, boolean, int, int, androidx.compose.foundation.interaction.k, androidx.compose.ui.graphics.e6, androidx.compose.material3.pa, androidx.compose.runtime.t, int, int, int, int):void");
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void e(@fg.l androidx.compose.ui.q qVar, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, @fg.m ld.q<? super androidx.compose.ui.q, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6, boolean z4, float f4, @fg.l ld.l<? super i0.n, kotlin.k2> lVar, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar8, @fg.l androidx.compose.foundation.layout.l1 l1Var, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        int i7;
        androidx.compose.foundation.layout.l1 l1Var2;
        int i10;
        androidx.compose.runtime.t o4 = tVar.o(1408290209);
        if ((i4 & 6) == 0) {
            i6 = i4 | (o4.q0(qVar) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= o4.S(pVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= o4.S(qVar2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= o4.S(pVar2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= o4.S(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= o4.S(pVar4) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i6 |= o4.S(pVar5) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i6 |= o4.S(pVar6) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i6 |= o4.b(z4) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        if ((805306368 & i4) == 0) {
            i6 |= o4.d(f4) ? 536870912 : ClientDefaults.MAX_MSG_SIZE;
        }
        int i11 = i6;
        if ((i5 & 6) == 0) {
            i7 = i5 | (o4.S(lVar) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= o4.S(pVar7) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= o4.S(pVar8) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            l1Var2 = l1Var;
            i7 |= o4.q0(l1Var2) ? 2048 : 1024;
        } else {
            l1Var2 = l1Var;
        }
        int i12 = i7;
        if ((i11 & 306783379) == 306783378 && (i12 & 1171) == 1170 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1408290209, i11, i12, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:521)");
            }
            o4.P(-2058767641);
            boolean z5 = ((234881024 & i11) == 67108864) | ((i12 & 14) == 4) | ((1879048192 & i11) == 536870912) | ((i12 & 7168) == 2048);
            Object Q = o4.Q();
            if (z5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new s7(lVar, z4, f4, l1Var2);
                o4.E(Q);
            }
            s7 s7Var = (s7) Q;
            o4.p0();
            androidx.compose.ui.unit.w wVar = (androidx.compose.ui.unit.w) o4.x(androidx.compose.ui.platform.h1.p());
            o4.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(qVar);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a5);
            } else {
                o4.C();
            }
            androidx.compose.runtime.m5.j(o4, s7Var, companion.f());
            androidx.compose.runtime.m5.j(o4, B, companion.h());
            ld.p<androidx.compose.ui.node.g, Integer, kotlin.k2> b5 = companion.b();
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, b5);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            pVar7.invoke(o4, Integer.valueOf((i12 >> 3) & 14));
            o4.P(1116455313);
            if (pVar3 != null) {
                androidx.compose.ui.q w32 = androidx.compose.ui.layout.w.b(androidx.compose.ui.q.INSTANCE, "Leading").w3(sa.e());
                androidx.compose.ui.c i13 = androidx.compose.ui.c.INSTANCE.i();
                o4.P(733328855);
                androidx.compose.ui.layout.m0 i14 = androidx.compose.foundation.layout.m.i(i13, false, o4, 6);
                o4.P(-1323940314);
                int j5 = androidx.compose.runtime.p.j(o4, 0);
                androidx.compose.runtime.g0 B2 = o4.B();
                ld.a<androidx.compose.ui.node.g> a6 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(w32);
                if (o4.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                o4.W();
                if (o4.getInserting()) {
                    o4.F(a6);
                } else {
                    o4.C();
                }
                ld.p a7 = androidx.compose.animation.p.a(companion, o4, i14, o4, B2);
                if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j5))) {
                    androidx.compose.animation.d.a(j5, o4, j5, a7);
                }
                androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
                androidx.compose.foundation.layout.p pVar9 = androidx.compose.foundation.layout.p.f5235a;
                q.a((i11 >> 12) & 14, pVar3, o4);
            }
            o4.p0();
            o4.P(1116455598);
            if (pVar4 != null) {
                androidx.compose.ui.q w33 = androidx.compose.ui.layout.w.b(androidx.compose.ui.q.INSTANCE, "Trailing").w3(sa.e());
                androidx.compose.ui.c i15 = androidx.compose.ui.c.INSTANCE.i();
                o4.P(733328855);
                androidx.compose.ui.layout.m0 i16 = androidx.compose.foundation.layout.m.i(i15, false, o4, 6);
                o4.P(-1323940314);
                int j6 = androidx.compose.runtime.p.j(o4, 0);
                androidx.compose.runtime.g0 B3 = o4.B();
                ld.a<androidx.compose.ui.node.g> a8 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g6 = androidx.compose.ui.layout.a0.g(w33);
                if (o4.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                o4.W();
                if (o4.getInserting()) {
                    o4.F(a8);
                } else {
                    o4.C();
                }
                ld.p a10 = androidx.compose.animation.p.a(companion, o4, i16, o4, B3);
                if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j6))) {
                    androidx.compose.animation.d.a(j6, o4, j6, a10);
                }
                androidx.compose.animation.e.a(0, g6, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
                androidx.compose.foundation.layout.p pVar10 = androidx.compose.foundation.layout.p.f5235a;
                q.a((i11 >> 15) & 14, pVar4, o4);
            }
            o4.p0();
            float i17 = androidx.compose.foundation.layout.j1.i(l1Var2, wVar);
            float h4 = androidx.compose.foundation.layout.j1.h(l1Var2, wVar);
            if (pVar3 != null) {
                i10 = 0;
                i17 = kotlin.ranges.s.t(androidx.compose.ui.unit.h.g(i17 - sa.d()), 0);
            } else {
                i10 = 0;
            }
            if (pVar4 != null) {
                h4 = kotlin.ranges.s.t(androidx.compose.ui.unit.h.g(h4 - sa.d()), i10);
            }
            o4.P(1116456488);
            if (pVar5 != null) {
                androidx.compose.ui.q o5 = androidx.compose.foundation.layout.j1.o(androidx.compose.foundation.layout.c2.F(androidx.compose.foundation.layout.c2.k(androidx.compose.ui.layout.w.b(androidx.compose.ui.q.INSTANCE, "Prefix"), sa.i(), 0.0f, 2, null), null, false, 3, null), i17, 0.0f, sa.j(), 0.0f, 10, null);
                o4.P(733328855);
                androidx.compose.ui.layout.m0 a11 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, o4, 0, -1323940314);
                int j7 = androidx.compose.runtime.p.j(o4, 0);
                androidx.compose.runtime.g0 B4 = o4.B();
                ld.a<androidx.compose.ui.node.g> a12 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g7 = androidx.compose.ui.layout.a0.g(o5);
                if (o4.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                o4.W();
                if (o4.getInserting()) {
                    o4.F(a12);
                } else {
                    o4.C();
                }
                ld.p a13 = androidx.compose.animation.p.a(companion, o4, a11, o4, B4);
                if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j7))) {
                    androidx.compose.animation.d.a(j7, o4, j7, a13);
                }
                androidx.compose.animation.e.a(0, g7, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
                androidx.compose.foundation.layout.p pVar11 = androidx.compose.foundation.layout.p.f5235a;
                q.a((i11 >> 18) & 14, pVar5, o4);
            }
            o4.p0();
            o4.P(1116456887);
            if (pVar6 != null) {
                androidx.compose.ui.q o6 = androidx.compose.foundation.layout.j1.o(androidx.compose.foundation.layout.c2.F(androidx.compose.foundation.layout.c2.k(androidx.compose.ui.layout.w.b(androidx.compose.ui.q.INSTANCE, "Suffix"), sa.i(), 0.0f, 2, null), null, false, 3, null), sa.j(), 0.0f, h4, 0.0f, 10, null);
                o4.P(733328855);
                androidx.compose.ui.layout.m0 a14 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, o4, 0, -1323940314);
                int j10 = androidx.compose.runtime.p.j(o4, 0);
                androidx.compose.runtime.g0 B5 = o4.B();
                ld.a<androidx.compose.ui.node.g> a15 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g10 = androidx.compose.ui.layout.a0.g(o6);
                if (o4.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                o4.W();
                if (o4.getInserting()) {
                    o4.F(a15);
                } else {
                    o4.C();
                }
                ld.p a16 = androidx.compose.animation.p.a(companion, o4, a14, o4, B5);
                if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j10))) {
                    androidx.compose.animation.d.a(j10, o4, j10, a16);
                }
                androidx.compose.animation.e.a(0, g10, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
                androidx.compose.foundation.layout.p pVar12 = androidx.compose.foundation.layout.p.f5235a;
                q.a((i11 >> 21) & 14, pVar6, o4);
            }
            o4.p0();
            q.Companion companion2 = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.q F = androidx.compose.foundation.layout.c2.F(androidx.compose.foundation.layout.c2.k(companion2, sa.i(), 0.0f, 2, null), null, false, 3, null);
            if (pVar5 != null) {
                i17 = androidx.compose.ui.unit.h.g(0);
            }
            float f5 = i17;
            if (pVar6 != null) {
                h4 = androidx.compose.ui.unit.h.g(0);
            }
            androidx.compose.ui.q o7 = androidx.compose.foundation.layout.j1.o(F, f5, 0.0f, h4, 0.0f, 10, null);
            o4.P(1116457597);
            if (qVar2 != null) {
                qVar2.R(androidx.compose.ui.layout.w.b(companion2, "Hint").w3(o7), o4, Integer.valueOf((i11 >> 3) & 112));
            }
            o4.p0();
            androidx.compose.ui.q w34 = androidx.compose.ui.layout.w.b(companion2, "TextField").w3(o7);
            o4.P(733328855);
            c.Companion companion3 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.m0 a17 = androidx.compose.animation.a0.a(companion3, true, o4, 48, -1323940314);
            int j11 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B6 = o4.B();
            ld.a<androidx.compose.ui.node.g> a18 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g11 = androidx.compose.ui.layout.a0.g(w34);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a18);
            } else {
                o4.C();
            }
            ld.p a19 = androidx.compose.animation.p.a(companion, o4, a17, o4, B6);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j11))) {
                androidx.compose.animation.d.a(j11, o4, j11, a19);
            }
            androidx.compose.animation.e.a(0, g11, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.p pVar13 = androidx.compose.foundation.layout.p.f5235a;
            pVar.invoke(o4, Integer.valueOf((i11 >> 3) & 14));
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            o4.P(1116458015);
            if (pVar2 != null) {
                androidx.compose.ui.q b6 = androidx.compose.ui.layout.w.b(androidx.compose.foundation.layout.c2.F(androidx.compose.foundation.layout.c2.k(companion2, androidx.compose.ui.unit.i.I(sa.i(), sa.g(), f4), 0.0f, 2, null), null, false, 3, null), "Label");
                o4.P(733328855);
                androidx.compose.ui.layout.m0 a20 = androidx.compose.animation.a0.a(companion3, false, o4, 0, -1323940314);
                int j12 = androidx.compose.runtime.p.j(o4, 0);
                androidx.compose.runtime.g0 B7 = o4.B();
                ld.a<androidx.compose.ui.node.g> a21 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g12 = androidx.compose.ui.layout.a0.g(b6);
                if (o4.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                o4.W();
                if (o4.getInserting()) {
                    o4.F(a21);
                } else {
                    o4.C();
                }
                ld.p a22 = androidx.compose.animation.p.a(companion, o4, a20, o4, B7);
                if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j12))) {
                    androidx.compose.animation.d.a(j12, o4, j12, a22);
                }
                androidx.compose.animation.e.a(0, g12, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
                q.a((i11 >> 9) & 14, pVar2, o4);
            }
            o4.p0();
            o4.P(-2058764244);
            if (pVar8 != null) {
                androidx.compose.ui.q j13 = androidx.compose.foundation.layout.j1.j(androidx.compose.foundation.layout.c2.F(androidx.compose.foundation.layout.c2.k(androidx.compose.ui.layout.w.b(companion2, "Supporting"), sa.h(), 0.0f, 2, null), null, false, 3, null), qa.J(qa.f13733a, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                o4.P(733328855);
                androidx.compose.ui.layout.m0 a23 = androidx.compose.animation.a0.a(companion3, false, o4, 0, -1323940314);
                int j14 = androidx.compose.runtime.p.j(o4, 0);
                androidx.compose.runtime.g0 B8 = o4.B();
                ld.a<androidx.compose.ui.node.g> a24 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g13 = androidx.compose.ui.layout.a0.g(j13);
                if (o4.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                o4.W();
                if (o4.getInserting()) {
                    o4.F(a24);
                } else {
                    o4.C();
                }
                ld.p a25 = androidx.compose.animation.p.a(companion, o4, a23, o4, B8);
                if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j14))) {
                    androidx.compose.animation.d.a(j14, o4, j14, a25);
                }
                androidx.compose.animation.e.a(0, g13, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
                q.a((i12 >> 6) & 14, pVar8, o4);
            }
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
            t4.a(new g(qVar, pVar, qVar2, pVar2, pVar3, pVar4, pVar5, pVar6, z4, f4, lVar, pVar7, pVar8, l1Var, i4, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13, float f4, long j4, float f5, androidx.compose.foundation.layout.l1 l1Var) {
        int T = kotlin.comparisons.a.T(i10, i12, i6, i7, androidx.compose.ui.util.d.b(i11, 0, f4));
        float top2 = l1Var.getTop() * f5;
        return Math.max(androidx.compose.ui.unit.b.q(j4), Math.max(i4, Math.max(i5, kotlin.math.b.L0(androidx.compose.ui.util.d.a(top2, Math.max(top2, i11 / 2.0f), f4) + T + (l1Var.getBottom() * f5)))) + i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(int i4, int i5, int i6, int i7, int i10, int i11, int i12, float f4, long j4, float f5, androidx.compose.foundation.layout.l1 l1Var) {
        int i13 = i6 + i7;
        int max = Math.max(i10 + i13, Math.max(i12 + i13, androidx.compose.ui.util.d.b(i11, 0, f4))) + i4 + i5;
        androidx.compose.ui.unit.w wVar = androidx.compose.ui.unit.w.Ltr;
        return Math.max(max, Math.max(kotlin.math.b.L0((i11 + (androidx.compose.ui.unit.h.g(l1Var.c(wVar) + l1Var.b(wVar)) * f5)) * f4), androidx.compose.ui.unit.b.r(j4)));
    }

    public static final float m() {
        return f14077b;
    }

    @fg.l
    public static final androidx.compose.ui.q n(@fg.l androidx.compose.ui.q qVar, long j4, @fg.l androidx.compose.foundation.layout.l1 l1Var) {
        return androidx.compose.ui.draw.l.d(qVar, new h(j4, l1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(i1.a aVar, int i4, int i5, androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.i1 i1Var2, androidx.compose.ui.layout.i1 i1Var3, androidx.compose.ui.layout.i1 i1Var4, androidx.compose.ui.layout.i1 i1Var5, androidx.compose.ui.layout.i1 i1Var6, androidx.compose.ui.layout.i1 i1Var7, androidx.compose.ui.layout.i1 i1Var8, androidx.compose.ui.layout.i1 i1Var9, float f4, boolean z4, float f5, androidx.compose.ui.unit.w wVar, androidx.compose.foundation.layout.l1 l1Var) {
        androidx.compose.ui.unit.q.INSTANCE.getClass();
        i1.a.i(aVar, i1Var8, androidx.compose.ui.unit.q.f21519c, 0.0f, 2, null);
        int n4 = i4 - sa.n(i1Var9);
        int L0 = kotlin.math.b.L0(l1Var.getTop() * f5);
        int L02 = kotlin.math.b.L0(androidx.compose.foundation.layout.j1.i(l1Var, wVar) * f5);
        float d5 = sa.d() * f5;
        if (i1Var != null) {
            i1.a.m(aVar, i1Var, 0, androidx.compose.ui.c.INSTANCE.q().a(i1Var.getHeight(), n4), 0.0f, 4, null);
        }
        if (i1Var2 != null) {
            i1.a.m(aVar, i1Var2, i5 - i1Var2.getWidth(), androidx.compose.ui.c.INSTANCE.q().a(i1Var2.getHeight(), n4), 0.0f, 4, null);
        }
        if (i1Var6 != null) {
            i1.a.m(aVar, i1Var6, kotlin.math.b.L0(i1Var == null ? 0.0f : (sa.o(i1Var) - d5) * (1 - f4)) + L02, androidx.compose.ui.util.d.b(z4 ? androidx.compose.ui.c.INSTANCE.q().a(i1Var6.getHeight(), n4) : L0, -(i1Var6.getHeight() / 2), f4), 0.0f, 4, null);
        }
        if (i1Var3 != null) {
            i1.a.m(aVar, i1Var3, sa.o(i1Var), p(z4, n4, L0, i1Var6, i1Var3), 0.0f, 4, null);
        }
        if (i1Var4 != null) {
            i1.a.m(aVar, i1Var4, (i5 - sa.o(i1Var2)) - i1Var4.getWidth(), p(z4, n4, L0, i1Var6, i1Var4), 0.0f, 4, null);
        }
        int o4 = sa.o(i1Var) + sa.o(i1Var3);
        i1.a.m(aVar, i1Var5, o4, p(z4, n4, L0, i1Var6, i1Var5), 0.0f, 4, null);
        if (i1Var7 != null) {
            i1.a.m(aVar, i1Var7, o4, p(z4, n4, L0, i1Var6, i1Var7), 0.0f, 4, null);
        }
        if (i1Var9 != null) {
            i1.a.m(aVar, i1Var9, 0, n4, 0.0f, 4, null);
        }
    }

    private static final int p(boolean z4, int i4, int i5, androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.i1 i1Var2) {
        if (z4) {
            i5 = androidx.compose.ui.c.INSTANCE.q().a(i1Var2.getHeight(), i4);
        }
        return Math.max(i5, sa.n(i1Var) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(int i4, int i5) {
        return i4 == Integer.MAX_VALUE ? i4 : i4 - i5;
    }
}
