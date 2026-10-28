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

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aØ\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'\u001aØ\u0002\u0010)\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b)\u0010*\u001aª\u0002\u0010+\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b+\u0010,\u001aª\u0002\u0010-\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b-\u0010.\u001aî\u0001\u00108\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\r2\u0013\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u00103\u001a\u0002022\u0011\u00104\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0013\u00105\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b8\u00109\u001a\u001b\u0010;\u001a\u00020\u001d*\u00020\u001d2\u0006\u0010:\u001a\u00020\u001dH\u0002¢\u0006\u0004\b;\u0010<\u001aR\u0010F\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020DH\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001ar\u0010Q\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u001d2\u0006\u0010O\u001a\u00020\u001d2\u0006\u00103\u001a\u0002022\u0006\u0010E\u001a\u00020D2\u0006\u0010P\u001a\u0002022\u0006\u00107\u001a\u000206H\u0002ø\u0001\u0000¢\u0006\u0004\bQ\u0010R\u001a¡\u0001\u0010b\u001a\u00020\u0003*\u00020S2\u0006\u0010T\u001a\u00020\u001d2\u0006\u0010U\u001a\u00020\u001d2\u0006\u0010W\u001a\u00020V2\b\u0010X\u001a\u0004\u0018\u00010V2\b\u0010Y\u001a\u0004\u0018\u00010V2\b\u0010Z\u001a\u0004\u0018\u00010V2\b\u0010[\u001a\u0004\u0018\u00010V2\b\u0010\\\u001a\u0004\u0018\u00010V2\b\u0010]\u001a\u0004\u0018\u00010V2\u0006\u0010^\u001a\u00020V2\b\u0010_\u001a\u0004\u0018\u00010V2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u001d2\u0006\u0010a\u001a\u00020\u001d2\u0006\u00103\u001a\u0002022\u0006\u0010P\u001a\u000202H\u0002¢\u0006\u0004\bb\u0010c\u001a\u0087\u0001\u0010e\u001a\u00020\u0003*\u00020S2\u0006\u0010T\u001a\u00020\u001d2\u0006\u0010U\u001a\u00020\u001d2\u0006\u0010d\u001a\u00020V2\b\u0010Y\u001a\u0004\u0018\u00010V2\b\u0010Z\u001a\u0004\u0018\u00010V2\b\u0010[\u001a\u0004\u0018\u00010V2\b\u0010\\\u001a\u0004\u0018\u00010V2\b\u0010]\u001a\u0004\u0018\u00010V2\u0006\u0010^\u001a\u00020V2\b\u0010_\u001a\u0004\u0018\u00010V2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010P\u001a\u0002022\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\be\u0010f\u001a\u001b\u0010i\u001a\u00020\u0005*\u00020\u00052\u0006\u0010h\u001a\u00020gH\u0000¢\u0006\u0004\bi\u0010j\"\u001a\u0010o\u001a\u00020k8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010l\u001a\u0004\bm\u0010n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006p"}, d2 = {"", "value", "Lkotlin/Function1;", "Lkotlin/k2;", "onValueChange", "Landroidx/compose/ui/q;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/v0;", "textStyle", "Lkotlin/Function0;", "Landroidx/compose/runtime/i;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "Landroidx/compose/ui/text/input/k1;", "visualTransformation", "Landroidx/compose/foundation/text/f0;", "keyboardOptions", "Landroidx/compose/foundation/text/d0;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/material3/pa;", "colors", "c", "(Ljava/lang/String;Lld/l;Landroidx/compose/ui/q;ZZLandroidx/compose/ui/text/v0;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;ZLandroidx/compose/ui/text/input/k1;Landroidx/compose/foundation/text/f0;Landroidx/compose/foundation/text/d0;ZIILandroidx/compose/foundation/interaction/k;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/pa;Landroidx/compose/runtime/t;IIII)V", "Landroidx/compose/ui/text/input/z0;", "a", "(Landroidx/compose/ui/text/input/z0;Lld/l;Landroidx/compose/ui/q;ZZLandroidx/compose/ui/text/v0;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;ZLandroidx/compose/ui/text/input/k1;Landroidx/compose/foundation/text/f0;Landroidx/compose/foundation/text/d0;ZIILandroidx/compose/foundation/interaction/k;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/pa;Landroidx/compose/runtime/t;IIII)V", "d", "(Ljava/lang/String;Lld/l;Landroidx/compose/ui/q;ZZLandroidx/compose/ui/text/v0;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;ZLandroidx/compose/ui/text/input/k1;Landroidx/compose/foundation/text/f0;Landroidx/compose/foundation/text/d0;ZIILandroidx/compose/foundation/interaction/k;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/pa;Landroidx/compose/runtime/t;IIII)V", "b", "(Landroidx/compose/ui/text/input/z0;Lld/l;Landroidx/compose/ui/q;ZZLandroidx/compose/ui/text/v0;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;ZLandroidx/compose/ui/text/input/k1;Landroidx/compose/foundation/text/f0;Landroidx/compose/foundation/text/d0;ZIILandroidx/compose/foundation/interaction/k;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/pa;Landroidx/compose/runtime/t;IIII)V", "textField", "leading", "trailing", "", "animationProgress", "container", "supporting", "Landroidx/compose/foundation/layout/l1;", "paddingValues", "e", "(Landroidx/compose/ui/q;Lld/p;Lld/p;Lld/q;Lld/p;Lld/p;Lld/p;Lld/p;ZFLld/p;Lld/p;Landroidx/compose/foundation/layout/l1;Landroidx/compose/runtime/t;II)V", "from", "r", "(II)I", "leadingWidth", "trailingWidth", "prefixWidth", "suffixWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "Landroidx/compose/ui/unit/b;", "constraints", "l", "(IIIIIIIJ)I", "textFieldHeight", "labelHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "placeholderHeight", "supportingHeight", "density", "k", "(IIIIIIIIFJFLandroidx/compose/foundation/layout/l1;)I", "Landroidx/compose/ui/layout/i1$a;", "width", "totalHeight", "Landroidx/compose/ui/layout/i1;", "textfieldPlaceable", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "containerPlaceable", "supportingPlaceable", "labelEndPosition", "textPosition", "o", "(Landroidx/compose/ui/layout/i1$a;IILandroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;ZIIFF)V", "textPlaceable", "p", "(Landroidx/compose/ui/layout/i1$a;IILandroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;ZFLandroidx/compose/foundation/layout/l1;)V", "Landroidx/compose/foundation/c0;", "indicatorBorder", "m", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/c0;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/unit/h;", "F", "n", "()F", "TextFieldWithLabelVerticalPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1164:1\n74#2:1165\n74#2:1174\n74#2:1183\n74#2:1190\n74#2:1203\n1116#3,6:1166\n1116#3,6:1175\n1116#3,6:1184\n1116#3,6:1191\n1116#3,6:1197\n658#4:1172\n646#4:1173\n658#4:1181\n646#4:1182\n78#5,11:1204\n78#5,11:1237\n91#5:1269\n78#5,11:1276\n91#5:1308\n78#5,11:1322\n91#5:1354\n78#5,11:1362\n91#5:1394\n78#5,11:1402\n91#5:1434\n78#5,11:1444\n91#5:1476\n78#5,11:1484\n91#5:1516\n91#5:1521\n456#6,8:1215\n464#6,3:1229\n456#6,8:1248\n464#6,3:1262\n467#6,3:1266\n456#6,8:1287\n464#6,3:1301\n467#6,3:1305\n456#6,8:1333\n464#6,3:1347\n467#6,3:1351\n456#6,8:1373\n464#6,3:1387\n467#6,3:1391\n456#6,8:1413\n464#6,3:1427\n467#6,3:1431\n456#6,8:1455\n464#6,3:1469\n467#6,3:1473\n456#6,8:1495\n464#6,3:1509\n467#6,3:1513\n467#6,3:1518\n3737#7,6:1223\n3737#7,6:1256\n3737#7,6:1295\n3737#7,6:1341\n3737#7,6:1381\n3737#7,6:1421\n3737#7,6:1463\n3737#7,6:1503\n69#8,5:1232\n74#8:1265\n78#8:1270\n69#8,5:1271\n74#8:1304\n78#8:1309\n68#8,6:1316\n74#8:1350\n78#8:1355\n68#8,6:1356\n74#8:1390\n78#8:1395\n68#8,6:1396\n74#8:1430\n78#8:1435\n68#8,6:1438\n74#8:1472\n78#8:1477\n68#8,6:1478\n74#8:1512\n78#8:1517\n58#9:1310\n58#9:1313\n51#9:1522\n92#9:1523\n154#10:1311\n211#10:1312\n154#10:1314\n211#10:1315\n154#10:1436\n154#10:1437\n154#10:1524\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt\n*L\n175#1:1165\n321#1:1174\n401#1:1183\n454#1:1190\n521#1:1203\n190#1:1166,6\n336#1:1175,6\n414#1:1184,6\n467#1:1191,6\n518#1:1197,6\n195#1:1172\n195#1:1173\n341#1:1181\n341#1:1182\n522#1:1204,11\n531#1:1237,11\n531#1:1269\n541#1:1276,11\n541#1:1308\n566#1:1322,11\n566#1:1354\n577#1:1362,11\n577#1:1394\n589#1:1402,11\n589#1:1434\n611#1:1444,11\n611#1:1476\n622#1:1484,11\n622#1:1516\n522#1:1521\n522#1:1215,8\n522#1:1229,3\n531#1:1248,8\n531#1:1262,3\n531#1:1266,3\n541#1:1287,8\n541#1:1301,3\n541#1:1305,3\n566#1:1333,8\n566#1:1347,3\n566#1:1351,3\n577#1:1373,8\n577#1:1387,3\n577#1:1391,3\n589#1:1413,8\n589#1:1427,3\n589#1:1431,3\n611#1:1455,8\n611#1:1469,3\n611#1:1473,3\n622#1:1495,8\n622#1:1509,3\n622#1:1513,3\n522#1:1518,3\n522#1:1223,6\n531#1:1256,6\n541#1:1295,6\n566#1:1341,6\n577#1:1381,6\n589#1:1421,6\n611#1:1463,6\n622#1:1503,6\n531#1:1232,5\n531#1:1265\n531#1:1270\n541#1:1271,5\n541#1:1304\n541#1:1309\n566#1:1316,6\n566#1:1350\n566#1:1355\n577#1:1356,6\n577#1:1390\n577#1:1395\n589#1:1396,6\n589#1:1430\n589#1:1435\n611#1:1438,6\n611#1:1472\n611#1:1477\n622#1:1478,6\n622#1:1512\n622#1:1517\n555#1:1310\n560#1:1313\n978#1:1522\n982#1:1523\n555#1:1311\n555#1:1312\n560#1:1314\n560#1:1315\n602#1:1436\n603#1:1437\n1163#1:1524\n*E\n"})
/* loaded from: classes.dex */
public final class ta {

    /* renamed from: a, reason: collision with root package name */
    private static final float f14635a = androidx.compose.ui.unit.h.g(8);

    /* compiled from: TextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f14636b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.input.z0, kotlin.k2> f14637c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14638d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f14639e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f14640f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f14641g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14642h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14643i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14644j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14645k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14646l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f14647m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f14648n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.f0 f14649o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.d0 f14650p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f14651q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f14652r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f14653s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14654t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f14655u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ pa f14656v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f14657w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f14658x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f14659y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ int f14660z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.text.input.z0 z0Var, ld.l<? super androidx.compose.ui.text.input.z0, kotlin.k2> lVar, androidx.compose.ui.q qVar, boolean z4, boolean z5, androidx.compose.ui.text.v0 v0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, boolean z6, androidx.compose.ui.text.input.k1 k1Var, androidx.compose.foundation.text.f0 f0Var, androidx.compose.foundation.text.d0 d0Var, boolean z7, int i4, int i5, androidx.compose.foundation.interaction.k kVar, androidx.compose.ui.graphics.e6 e6Var, pa paVar, int i6, int i7, int i10, int i11) {
            super(2);
            this.f14636b = z0Var;
            this.f14637c = lVar;
            this.f14638d = qVar;
            this.f14639e = z4;
            this.f14640f = z5;
            this.f14641g = v0Var;
            this.f14642h = pVar;
            this.f14643i = pVar2;
            this.f14644j = pVar3;
            this.f14645k = pVar4;
            this.f14646l = pVar5;
            this.f14647m = z6;
            this.f14648n = k1Var;
            this.f14649o = f0Var;
            this.f14650p = d0Var;
            this.f14651q = z7;
            this.f14652r = i4;
            this.f14653s = i5;
            this.f14654t = kVar;
            this.f14655u = e6Var;
            this.f14656v = paVar;
            this.f14657w = i6;
            this.f14658x = i7;
            this.f14659y = i10;
            this.f14660z = i11;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            ta.b(this.f14636b, this.f14637c, this.f14638d, this.f14639e, this.f14640f, this.f14641g, this.f14642h, this.f14643i, this.f14644j, this.f14645k, this.f14646l, this.f14647m, this.f14648n, this.f14649o, this.f14650p, this.f14651q, this.f14652r, this.f14653s, this.f14654t, this.f14655u, this.f14656v, tVar, androidx.compose.runtime.g3.b(this.f14657w | 1), androidx.compose.runtime.g3.b(this.f14658x), androidx.compose.runtime.g3.b(this.f14659y), this.f14660z);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextField.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt$TextField$2\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n*L\n1#1,1164:1\n50#2:1165\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt$TextField$2\n*L\n204#1:1165\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14661b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f14662c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ pa f14663d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f14664e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<String, kotlin.k2> f14665f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f14666g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f14667h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f14668i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.f0 f14669j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.d0 f14670k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f14671l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f14672m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f14673n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f14674o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14675p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14676q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14677r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14678s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14679t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14680u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14681v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14682w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f14683x;

        /* compiled from: TextField.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "innerTextField", "a", "(Lld/p;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.q<ld.p<? super androidx.compose.runtime.t, ? super Integer, ? extends kotlin.k2>, androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f14684b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f14685c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f14686d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.k1 f14687e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.interaction.k f14688f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f14689g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14690h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14691i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14692j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14693k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14694l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14695m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14696n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.graphics.e6 f14697o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ pa f14698p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(String str, boolean z4, boolean z5, androidx.compose.ui.text.input.k1 k1Var, androidx.compose.foundation.interaction.k kVar, boolean z6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7, androidx.compose.ui.graphics.e6 e6Var, pa paVar) {
                super(3);
                this.f14684b = str;
                this.f14685c = z4;
                this.f14686d = z5;
                this.f14687e = k1Var;
                this.f14688f = kVar;
                this.f14689g = z6;
                this.f14690h = pVar;
                this.f14691i = pVar2;
                this.f14692j = pVar3;
                this.f14693k = pVar4;
                this.f14694l = pVar5;
                this.f14695m = pVar6;
                this.f14696n = pVar7;
                this.f14697o = e6Var;
                this.f14698p = paVar;
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
                    androidx.compose.runtime.x.r0(-288211827, i5, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:222)");
                }
                qa.f13733a.b(this.f14684b, pVar, this.f14685c, this.f14686d, this.f14687e, this.f14688f, this.f14689g, this.f14690h, this.f14691i, this.f14692j, this.f14693k, this.f14694l, this.f14695m, this.f14696n, this.f14697o, this.f14698p, null, null, tVar, (i5 << 3) & 112, 100663296, o.c.f32821k);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.q qVar, boolean z4, pa paVar, String str, ld.l<? super String, kotlin.k2> lVar, boolean z5, boolean z6, androidx.compose.ui.text.v0 v0Var, androidx.compose.foundation.text.f0 f0Var, androidx.compose.foundation.text.d0 d0Var, boolean z7, int i4, int i5, androidx.compose.ui.text.input.k1 k1Var, androidx.compose.foundation.interaction.k kVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7, androidx.compose.ui.graphics.e6 e6Var) {
            super(2);
            this.f14661b = qVar;
            this.f14662c = z4;
            this.f14663d = paVar;
            this.f14664e = str;
            this.f14665f = lVar;
            this.f14666g = z5;
            this.f14667h = z6;
            this.f14668i = v0Var;
            this.f14669j = f0Var;
            this.f14670k = d0Var;
            this.f14671l = z7;
            this.f14672m = i4;
            this.f14673n = i5;
            this.f14674o = k1Var;
            this.f14675p = kVar;
            this.f14676q = pVar;
            this.f14677r = pVar2;
            this.f14678s = pVar3;
            this.f14679t = pVar4;
            this.f14680u = pVar5;
            this.f14681v = pVar6;
            this.f14682w = pVar7;
            this.f14683x = e6Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1859145987, i4, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:200)");
            }
            androidx.compose.ui.q qVar = this.f14661b;
            boolean z4 = this.f14662c;
            t9.Companion companion = t9.INSTANCE;
            androidx.compose.ui.q c5 = sa.c(qVar, z4, v9.a(t.c.f20446c, tVar, 0));
            qa qaVar = qa.f13733a;
            androidx.compose.ui.q a5 = androidx.compose.foundation.layout.c2.a(c5, qaVar.v(), qaVar.u());
            androidx.compose.ui.graphics.g6 g6Var = new androidx.compose.ui.graphics.g6(this.f14663d.e(this.f14662c, tVar, 0).getValue().M(), null);
            String str = this.f14664e;
            ld.l<String, kotlin.k2> lVar = this.f14665f;
            boolean z5 = this.f14666g;
            boolean z6 = this.f14667h;
            androidx.compose.ui.text.v0 v0Var = this.f14668i;
            androidx.compose.foundation.text.f0 f0Var = this.f14669j;
            androidx.compose.foundation.text.d0 d0Var = this.f14670k;
            boolean z7 = this.f14671l;
            int i5 = this.f14672m;
            int i6 = this.f14673n;
            androidx.compose.ui.text.input.k1 k1Var = this.f14674o;
            androidx.compose.foundation.interaction.k kVar = this.f14675p;
            androidx.compose.foundation.text.c.c(str, lVar, a5, z5, z6, v0Var, f0Var, d0Var, z7, i5, i6, k1Var, null, kVar, g6Var, androidx.compose.runtime.internal.c.b(tVar, -288211827, true, new a(str, z5, z7, k1Var, kVar, this.f14662c, this.f14676q, this.f14677r, this.f14678s, this.f14679t, this.f14680u, this.f14681v, this.f14682w, this.f14683x, this.f14663d)), tVar, 0, o.c.f32821k, 4096);
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

    /* compiled from: TextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {
        final /* synthetic */ int A;
        final /* synthetic */ int B;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f14699b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<String, kotlin.k2> f14700c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14701d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f14702e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f14703f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f14704g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14705h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14706i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14707j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14708k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14709l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14710m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14711n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f14712o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f14713p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.f0 f14714q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.d0 f14715r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f14716s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f14717t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f14718u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14719v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f14720w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ pa f14721x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f14722y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ int f14723z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(String str, ld.l<? super String, kotlin.k2> lVar, androidx.compose.ui.q qVar, boolean z4, boolean z5, androidx.compose.ui.text.v0 v0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7, boolean z6, androidx.compose.ui.text.input.k1 k1Var, androidx.compose.foundation.text.f0 f0Var, androidx.compose.foundation.text.d0 d0Var, boolean z7, int i4, int i5, androidx.compose.foundation.interaction.k kVar, androidx.compose.ui.graphics.e6 e6Var, pa paVar, int i6, int i7, int i10, int i11) {
            super(2);
            this.f14699b = str;
            this.f14700c = lVar;
            this.f14701d = qVar;
            this.f14702e = z4;
            this.f14703f = z5;
            this.f14704g = v0Var;
            this.f14705h = pVar;
            this.f14706i = pVar2;
            this.f14707j = pVar3;
            this.f14708k = pVar4;
            this.f14709l = pVar5;
            this.f14710m = pVar6;
            this.f14711n = pVar7;
            this.f14712o = z6;
            this.f14713p = k1Var;
            this.f14714q = f0Var;
            this.f14715r = d0Var;
            this.f14716s = z7;
            this.f14717t = i4;
            this.f14718u = i5;
            this.f14719v = kVar;
            this.f14720w = e6Var;
            this.f14721x = paVar;
            this.f14722y = i6;
            this.f14723z = i7;
            this.A = i10;
            this.B = i11;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            ta.c(this.f14699b, this.f14700c, this.f14701d, this.f14702e, this.f14703f, this.f14704g, this.f14705h, this.f14706i, this.f14707j, this.f14708k, this.f14709l, this.f14710m, this.f14711n, this.f14712o, this.f14713p, this.f14714q, this.f14715r, this.f14716s, this.f14717t, this.f14718u, this.f14719v, this.f14720w, this.f14721x, tVar, androidx.compose.runtime.g3.b(this.f14722y | 1), androidx.compose.runtime.g3.b(this.f14723z), androidx.compose.runtime.g3.b(this.A), this.B);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextField.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt$TextField$5\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n*L\n1#1,1164:1\n50#2:1165\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt$TextField$5\n*L\n350#1:1165\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14724b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f14725c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ pa f14726d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f14727e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.input.z0, kotlin.k2> f14728f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f14729g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f14730h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f14731i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.f0 f14732j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.d0 f14733k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f14734l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f14735m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f14736n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f14737o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14738p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14739q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14740r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14741s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14742t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14743u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14744v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14745w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f14746x;

        /* compiled from: TextField.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "innerTextField", "a", "(Lld/p;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.q<ld.p<? super androidx.compose.runtime.t, ? super Integer, ? extends kotlin.k2>, androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.z0 f14747b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f14748c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f14749d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.k1 f14750e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.interaction.k f14751f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f14752g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14753h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14754i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14755j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14756k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14757l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14758m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14759n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.graphics.e6 f14760o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ pa f14761p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(androidx.compose.ui.text.input.z0 z0Var, boolean z4, boolean z5, androidx.compose.ui.text.input.k1 k1Var, androidx.compose.foundation.interaction.k kVar, boolean z6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7, androidx.compose.ui.graphics.e6 e6Var, pa paVar) {
                super(3);
                this.f14747b = z0Var;
                this.f14748c = z4;
                this.f14749d = z5;
                this.f14750e = k1Var;
                this.f14751f = kVar;
                this.f14752g = z6;
                this.f14753h = pVar;
                this.f14754i = pVar2;
                this.f14755j = pVar3;
                this.f14756k = pVar4;
                this.f14757l = pVar5;
                this.f14758m = pVar6;
                this.f14759n = pVar7;
                this.f14760o = e6Var;
                this.f14761p = paVar;
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
                    androidx.compose.runtime.x.r0(1751957978, i5, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:368)");
                }
                qa.f13733a.b(this.f14747b.i(), pVar, this.f14748c, this.f14749d, this.f14750e, this.f14751f, this.f14752g, this.f14753h, this.f14754i, this.f14755j, this.f14756k, this.f14757l, this.f14758m, this.f14759n, this.f14760o, this.f14761p, null, null, tVar, (i5 << 3) & 112, 100663296, o.c.f32821k);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(androidx.compose.ui.q qVar, boolean z4, pa paVar, androidx.compose.ui.text.input.z0 z0Var, ld.l<? super androidx.compose.ui.text.input.z0, kotlin.k2> lVar, boolean z5, boolean z6, androidx.compose.ui.text.v0 v0Var, androidx.compose.foundation.text.f0 f0Var, androidx.compose.foundation.text.d0 d0Var, boolean z7, int i4, int i5, androidx.compose.ui.text.input.k1 k1Var, androidx.compose.foundation.interaction.k kVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7, androidx.compose.ui.graphics.e6 e6Var) {
            super(2);
            this.f14724b = qVar;
            this.f14725c = z4;
            this.f14726d = paVar;
            this.f14727e = z0Var;
            this.f14728f = lVar;
            this.f14729g = z5;
            this.f14730h = z6;
            this.f14731i = v0Var;
            this.f14732j = f0Var;
            this.f14733k = d0Var;
            this.f14734l = z7;
            this.f14735m = i4;
            this.f14736n = i5;
            this.f14737o = k1Var;
            this.f14738p = kVar;
            this.f14739q = pVar;
            this.f14740r = pVar2;
            this.f14741s = pVar3;
            this.f14742t = pVar4;
            this.f14743u = pVar5;
            this.f14744v = pVar6;
            this.f14745w = pVar7;
            this.f14746x = e6Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1163788208, i4, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:346)");
            }
            androidx.compose.ui.q qVar = this.f14724b;
            boolean z4 = this.f14725c;
            t9.Companion companion = t9.INSTANCE;
            androidx.compose.ui.q c5 = sa.c(qVar, z4, v9.a(t.c.f20446c, tVar, 0));
            qa qaVar = qa.f13733a;
            androidx.compose.ui.q a5 = androidx.compose.foundation.layout.c2.a(c5, qaVar.v(), qaVar.u());
            androidx.compose.ui.graphics.g6 g6Var = new androidx.compose.ui.graphics.g6(this.f14726d.e(this.f14725c, tVar, 0).getValue().M(), null);
            androidx.compose.ui.text.input.z0 z0Var = this.f14727e;
            ld.l<androidx.compose.ui.text.input.z0, kotlin.k2> lVar = this.f14728f;
            boolean z5 = this.f14729g;
            boolean z6 = this.f14730h;
            androidx.compose.ui.text.v0 v0Var = this.f14731i;
            androidx.compose.foundation.text.f0 f0Var = this.f14732j;
            androidx.compose.foundation.text.d0 d0Var = this.f14733k;
            boolean z7 = this.f14734l;
            int i5 = this.f14735m;
            int i6 = this.f14736n;
            androidx.compose.ui.text.input.k1 k1Var = this.f14737o;
            androidx.compose.foundation.interaction.k kVar = this.f14738p;
            androidx.compose.foundation.text.c.a(z0Var, lVar, a5, z5, z6, v0Var, f0Var, d0Var, z7, i5, i6, k1Var, null, kVar, g6Var, androidx.compose.runtime.internal.c.b(tVar, 1751957978, true, new a(z0Var, z5, z7, k1Var, kVar, this.f14725c, this.f14739q, this.f14740r, this.f14741s, this.f14742t, this.f14743u, this.f14744v, this.f14745w, this.f14746x, this.f14726d)), tVar, 0, o.c.f32821k, 4096);
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

    /* compiled from: TextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {
        final /* synthetic */ int A;
        final /* synthetic */ int B;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f14762b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.input.z0, kotlin.k2> f14763c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14764d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f14765e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f14766f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f14767g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14768h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14769i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14770j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14771k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14772l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14773m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14774n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f14775o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f14776p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.f0 f14777q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.d0 f14778r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f14779s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f14780t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f14781u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14782v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f14783w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ pa f14784x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f14785y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ int f14786z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.ui.text.input.z0 z0Var, ld.l<? super androidx.compose.ui.text.input.z0, kotlin.k2> lVar, androidx.compose.ui.q qVar, boolean z4, boolean z5, androidx.compose.ui.text.v0 v0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7, boolean z6, androidx.compose.ui.text.input.k1 k1Var, androidx.compose.foundation.text.f0 f0Var, androidx.compose.foundation.text.d0 d0Var, boolean z7, int i4, int i5, androidx.compose.foundation.interaction.k kVar, androidx.compose.ui.graphics.e6 e6Var, pa paVar, int i6, int i7, int i10, int i11) {
            super(2);
            this.f14762b = z0Var;
            this.f14763c = lVar;
            this.f14764d = qVar;
            this.f14765e = z4;
            this.f14766f = z5;
            this.f14767g = v0Var;
            this.f14768h = pVar;
            this.f14769i = pVar2;
            this.f14770j = pVar3;
            this.f14771k = pVar4;
            this.f14772l = pVar5;
            this.f14773m = pVar6;
            this.f14774n = pVar7;
            this.f14775o = z6;
            this.f14776p = k1Var;
            this.f14777q = f0Var;
            this.f14778r = d0Var;
            this.f14779s = z7;
            this.f14780t = i4;
            this.f14781u = i5;
            this.f14782v = kVar;
            this.f14783w = e6Var;
            this.f14784x = paVar;
            this.f14785y = i6;
            this.f14786z = i7;
            this.A = i10;
            this.B = i11;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            ta.a(this.f14762b, this.f14763c, this.f14764d, this.f14765e, this.f14766f, this.f14767g, this.f14768h, this.f14769i, this.f14770j, this.f14771k, this.f14772l, this.f14773m, this.f14774n, this.f14775o, this.f14776p, this.f14777q, this.f14778r, this.f14779s, this.f14780t, this.f14781u, this.f14782v, this.f14783w, this.f14784x, tVar, androidx.compose.runtime.g3.b(this.f14785y | 1), androidx.compose.runtime.g3.b(this.f14786z), androidx.compose.runtime.g3.b(this.A), this.B);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f14787b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<String, kotlin.k2> f14788c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14789d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f14790e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f14791f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f14792g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14793h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14794i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14795j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14796k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14797l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f14798m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f14799n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.f0 f14800o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.d0 f14801p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f14802q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f14803r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f14804s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14805t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f14806u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ pa f14807v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f14808w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f14809x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f14810y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ int f14811z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(String str, ld.l<? super String, kotlin.k2> lVar, androidx.compose.ui.q qVar, boolean z4, boolean z5, androidx.compose.ui.text.v0 v0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, boolean z6, androidx.compose.ui.text.input.k1 k1Var, androidx.compose.foundation.text.f0 f0Var, androidx.compose.foundation.text.d0 d0Var, boolean z7, int i4, int i5, androidx.compose.foundation.interaction.k kVar, androidx.compose.ui.graphics.e6 e6Var, pa paVar, int i6, int i7, int i10, int i11) {
            super(2);
            this.f14787b = str;
            this.f14788c = lVar;
            this.f14789d = qVar;
            this.f14790e = z4;
            this.f14791f = z5;
            this.f14792g = v0Var;
            this.f14793h = pVar;
            this.f14794i = pVar2;
            this.f14795j = pVar3;
            this.f14796k = pVar4;
            this.f14797l = pVar5;
            this.f14798m = z6;
            this.f14799n = k1Var;
            this.f14800o = f0Var;
            this.f14801p = d0Var;
            this.f14802q = z7;
            this.f14803r = i4;
            this.f14804s = i5;
            this.f14805t = kVar;
            this.f14806u = e6Var;
            this.f14807v = paVar;
            this.f14808w = i6;
            this.f14809x = i7;
            this.f14810y = i10;
            this.f14811z = i11;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            ta.d(this.f14787b, this.f14788c, this.f14789d, this.f14790e, this.f14791f, this.f14792g, this.f14793h, this.f14794i, this.f14795j, this.f14796k, this.f14797l, this.f14798m, this.f14799n, this.f14800o, this.f14801p, this.f14802q, this.f14803r, this.f14804s, this.f14805t, this.f14806u, this.f14807v, tVar, androidx.compose.runtime.g3.b(this.f14808w | 1), androidx.compose.runtime.g3.b(this.f14809x), androidx.compose.runtime.g3.b(this.f14810y), this.f14811z);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14812b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14813c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14814d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, kotlin.k2> f14815e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14816f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14817g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14818h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14819i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f14820j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f14821k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14822l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14823m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f14824n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f14825o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f14826p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.q<? super androidx.compose.ui.q, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6, boolean z4, float f4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar8, androidx.compose.foundation.layout.l1 l1Var, int i4, int i5) {
            super(2);
            this.f14812b = qVar;
            this.f14813c = pVar;
            this.f14814d = pVar2;
            this.f14815e = qVar2;
            this.f14816f = pVar3;
            this.f14817g = pVar4;
            this.f14818h = pVar5;
            this.f14819i = pVar6;
            this.f14820j = z4;
            this.f14821k = f4;
            this.f14822l = pVar7;
            this.f14823m = pVar8;
            this.f14824n = l1Var;
            this.f14825o = i4;
            this.f14826p = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            ta.e(this.f14812b, this.f14813c, this.f14814d, this.f14815e, this.f14816f, this.f14817g, this.f14818h, this.f14819i, this.f14820j, this.f14821k, this.f14822l, this.f14823m, this.f14824n, tVar, androidx.compose.runtime.g3.b(this.f14825o | 1), androidx.compose.runtime.g3.b(this.f14826p));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.c, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f14827b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f14828c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(float f4, androidx.compose.foundation.c0 c0Var) {
            super(1);
            this.f14827b = f4;
            this.f14828c = c0Var;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
            cVar.G6();
            float f4 = this.f14827b;
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            if (androidx.compose.ui.unit.h.l(f4, androidx.compose.ui.unit.h.f21499d)) {
                return;
            }
            float density = cVar.getDensity() * this.f14827b;
            float m4 = i0.n.m(cVar.e()) - (density / 2);
            androidx.compose.ui.graphics.drawscope.f.F6(cVar, this.f14828c.getBrush(), i0.g.a(0.0f, m4), i0.g.a(i0.n.t(cVar.e()), m4), density, 0, null, 0.0f, null, 0, 496, null);
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ta.a(androidx.compose.ui.text.input.z0, ld.l, androidx.compose.ui.q, boolean, boolean, androidx.compose.ui.text.v0, ld.p, ld.p, ld.p, ld.p, ld.p, ld.p, ld.p, boolean, androidx.compose.ui.text.input.k1, androidx.compose.foundation.text.f0, androidx.compose.foundation.text.d0, boolean, int, int, androidx.compose.foundation.interaction.k, androidx.compose.ui.graphics.e6, androidx.compose.material3.pa, androidx.compose.runtime.t, int, int, int, int):void");
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ta.b(androidx.compose.ui.text.input.z0, ld.l, androidx.compose.ui.q, boolean, boolean, androidx.compose.ui.text.v0, ld.p, ld.p, ld.p, ld.p, ld.p, boolean, androidx.compose.ui.text.input.k1, androidx.compose.foundation.text.f0, androidx.compose.foundation.text.d0, boolean, int, int, androidx.compose.foundation.interaction.k, androidx.compose.ui.graphics.e6, androidx.compose.material3.pa, androidx.compose.runtime.t, int, int, int, int):void");
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ta.c(java.lang.String, ld.l, androidx.compose.ui.q, boolean, boolean, androidx.compose.ui.text.v0, ld.p, ld.p, ld.p, ld.p, ld.p, ld.p, ld.p, boolean, androidx.compose.ui.text.input.k1, androidx.compose.foundation.text.f0, androidx.compose.foundation.text.d0, boolean, int, int, androidx.compose.foundation.interaction.k, androidx.compose.ui.graphics.e6, androidx.compose.material3.pa, androidx.compose.runtime.t, int, int, int, int):void");
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ta.d(java.lang.String, ld.l, androidx.compose.ui.q, boolean, boolean, androidx.compose.ui.text.v0, ld.p, ld.p, ld.p, ld.p, ld.p, boolean, androidx.compose.ui.text.input.k1, androidx.compose.foundation.text.f0, androidx.compose.foundation.text.d0, boolean, int, int, androidx.compose.foundation.interaction.k, androidx.compose.ui.graphics.e6, androidx.compose.material3.pa, androidx.compose.runtime.t, int, int, int, int):void");
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void e(@fg.l androidx.compose.ui.q qVar, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, @fg.m ld.q<? super androidx.compose.ui.q, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6, boolean z4, float f4, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar8, @fg.l androidx.compose.foundation.layout.l1 l1Var, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        int i7;
        int i10;
        androidx.compose.runtime.t o4 = tVar.o(-1830307184);
        if ((i4 & 6) == 0) {
            i6 = i4 | (o4.q0(qVar) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= o4.S(pVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= o4.S(pVar2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= o4.S(qVar2) ? 2048 : 1024;
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
            i7 = i5 | (o4.S(pVar7) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= o4.S(pVar8) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= o4.q0(l1Var) ? 256 : 128;
        }
        int i12 = i7;
        if ((i11 & 306783379) == 306783378 && (i12 & 147) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1830307184, i11, i12, "androidx.compose.material3.TextFieldLayout (TextField.kt:516)");
            }
            o4.P(243139239);
            boolean z5 = ((1879048192 & i11) == 536870912) | ((234881024 & i11) == 67108864) | ((i12 & 896) == 256);
            Object Q = o4.Q();
            if (z5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new ua(z4, f4, l1Var);
                o4.E(Q);
            }
            ua uaVar = (ua) Q;
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
            androidx.compose.runtime.m5.j(o4, uaVar, companion.f());
            androidx.compose.runtime.m5.j(o4, B, companion.h());
            ld.p<androidx.compose.ui.node.g, Integer, kotlin.k2> b5 = companion.b();
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, b5);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            pVar7.invoke(o4, Integer.valueOf(i12 & 14));
            o4.P(-95271705);
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
            o4.P(-95271370);
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
            float i17 = androidx.compose.foundation.layout.j1.i(l1Var, wVar);
            float h4 = androidx.compose.foundation.layout.j1.h(l1Var, wVar);
            if (pVar3 != null) {
                i10 = 0;
                i17 = kotlin.ranges.s.t(androidx.compose.ui.unit.h.g(i17 - sa.d()), 0);
            } else {
                i10 = 0;
            }
            if (pVar4 != null) {
                h4 = kotlin.ranges.s.t(androidx.compose.ui.unit.h.g(h4 - sa.d()), i10);
            }
            o4.P(-95270430);
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
            o4.P(-95270031);
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
            o4.P(-95269633);
            if (pVar2 != null) {
                androidx.compose.ui.q o7 = androidx.compose.foundation.layout.j1.o(androidx.compose.foundation.layout.c2.F(androidx.compose.foundation.layout.c2.k(androidx.compose.ui.layout.w.b(androidx.compose.ui.q.INSTANCE, "Label"), androidx.compose.ui.unit.i.I(sa.i(), sa.g(), f4), 0.0f, 2, null), null, false, 3, null), i17, 0.0f, h4, 0.0f, 10, null);
                o4.P(733328855);
                androidx.compose.ui.layout.m0 a17 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, o4, 0, -1323940314);
                int j11 = androidx.compose.runtime.p.j(o4, 0);
                androidx.compose.runtime.g0 B6 = o4.B();
                ld.a<androidx.compose.ui.node.g> a18 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g11 = androidx.compose.ui.layout.a0.g(o7);
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
                q.a((i11 >> 6) & 14, pVar2, o4);
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
            androidx.compose.ui.q o10 = androidx.compose.foundation.layout.j1.o(F, f5, 0.0f, h4, 0.0f, 10, null);
            o4.P(-95268909);
            if (qVar2 != null) {
                qVar2.R(androidx.compose.ui.layout.w.b(companion2, "Hint").w3(o10), o4, Integer.valueOf((i11 >> 6) & 112));
            }
            o4.p0();
            androidx.compose.ui.q w34 = androidx.compose.ui.layout.w.b(companion2, "TextField").w3(o10);
            o4.P(733328855);
            c.Companion companion3 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.m0 a20 = androidx.compose.animation.a0.a(companion3, true, o4, 48, -1323940314);
            int j12 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B7 = o4.B();
            ld.a<androidx.compose.ui.node.g> a21 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g12 = androidx.compose.ui.layout.a0.g(w34);
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
            androidx.compose.foundation.layout.p pVar14 = androidx.compose.foundation.layout.p.f5235a;
            pVar.invoke(o4, Integer.valueOf((i11 >> 3) & 14));
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            o4.P(243142996);
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
                q.a((i12 >> 3) & 14, pVar8, o4);
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
            t4.a(new g(qVar, pVar, pVar2, qVar2, pVar3, pVar4, pVar5, pVar6, z4, f4, pVar7, pVar8, l1Var, i4, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13, float f4, long j4, float f5, androidx.compose.foundation.layout.l1 l1Var) {
        boolean z4 = i5 > 0;
        float g4 = androidx.compose.ui.unit.h.g(l1Var.getBottom() + l1Var.getTop()) * f5;
        if (z4) {
            g4 = androidx.compose.ui.util.d.a(sa.l() * 2 * f5, g4, f4);
        }
        return Math.max(androidx.compose.ui.unit.b.q(j4), Math.max(i6, Math.max(i7, kotlin.math.b.L0(g4 + androidx.compose.ui.util.d.b(0, i5, f4) + kotlin.comparisons.a.T(i4, i12, i10, i11, androidx.compose.ui.util.d.b(i5, 0, f4))))) + i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(int i4, int i5, int i6, int i7, int i10, int i11, int i12, long j4) {
        int i13 = i6 + i7;
        return Math.max(Math.max(i10 + i13, Math.max(i12 + i13, i11)) + i4 + i5, androidx.compose.ui.unit.b.r(j4));
    }

    @fg.l
    public static final androidx.compose.ui.q m(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.foundation.c0 c0Var) {
        return androidx.compose.ui.draw.l.d(qVar, new h(c0Var.getWidth(), c0Var));
    }

    public static final float n() {
        return f14635a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(i1.a aVar, int i4, int i5, androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.i1 i1Var2, androidx.compose.ui.layout.i1 i1Var3, androidx.compose.ui.layout.i1 i1Var4, androidx.compose.ui.layout.i1 i1Var5, androidx.compose.ui.layout.i1 i1Var6, androidx.compose.ui.layout.i1 i1Var7, androidx.compose.ui.layout.i1 i1Var8, androidx.compose.ui.layout.i1 i1Var9, boolean z4, int i6, int i7, float f4, float f5) {
        androidx.compose.ui.unit.q.INSTANCE.getClass();
        i1.a.i(aVar, i1Var8, androidx.compose.ui.unit.q.f21519c, 0.0f, 2, null);
        int n4 = i5 - sa.n(i1Var9);
        if (i1Var4 != null) {
            i1.a.m(aVar, i1Var4, 0, androidx.compose.ui.c.INSTANCE.q().a(i1Var4.getHeight(), n4), 0.0f, 4, null);
        }
        if (i1Var5 != null) {
            i1.a.m(aVar, i1Var5, i4 - i1Var5.getWidth(), androidx.compose.ui.c.INSTANCE.q().a(i1Var5.getHeight(), n4), 0.0f, 4, null);
        }
        if (i1Var2 != null) {
            i1.a.m(aVar, i1Var2, sa.o(i1Var4), (z4 ? androidx.compose.ui.c.INSTANCE.q().a(i1Var2.getHeight(), n4) : kotlin.math.b.L0(sa.l() * f5)) - kotlin.math.b.L0((r1 - i6) * f4), 0.0f, 4, null);
        }
        if (i1Var6 != null) {
            i1.a.m(aVar, i1Var6, sa.o(i1Var4), i7, 0.0f, 4, null);
        }
        if (i1Var7 != null) {
            i1.a.m(aVar, i1Var7, (i4 - sa.o(i1Var5)) - i1Var7.getWidth(), i7, 0.0f, 4, null);
        }
        int o4 = sa.o(i1Var4) + sa.o(i1Var6);
        i1.a.m(aVar, i1Var, o4, i7, 0.0f, 4, null);
        if (i1Var3 != null) {
            i1.a.m(aVar, i1Var3, o4, i7, 0.0f, 4, null);
        }
        if (i1Var9 != null) {
            i1.a.m(aVar, i1Var9, 0, n4, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(i1.a aVar, int i4, int i5, androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.i1 i1Var2, androidx.compose.ui.layout.i1 i1Var3, androidx.compose.ui.layout.i1 i1Var4, androidx.compose.ui.layout.i1 i1Var5, androidx.compose.ui.layout.i1 i1Var6, androidx.compose.ui.layout.i1 i1Var7, androidx.compose.ui.layout.i1 i1Var8, boolean z4, float f4, androidx.compose.foundation.layout.l1 l1Var) {
        androidx.compose.ui.unit.q.INSTANCE.getClass();
        i1.a.i(aVar, i1Var7, androidx.compose.ui.unit.q.f21519c, 0.0f, 2, null);
        int n4 = i5 - sa.n(i1Var8);
        int L0 = kotlin.math.b.L0(l1Var.getTop() * f4);
        if (i1Var3 != null) {
            i1.a.m(aVar, i1Var3, 0, androidx.compose.ui.c.INSTANCE.q().a(i1Var3.getHeight(), n4), 0.0f, 4, null);
        }
        if (i1Var4 != null) {
            i1.a.m(aVar, i1Var4, i4 - i1Var4.getWidth(), androidx.compose.ui.c.INSTANCE.q().a(i1Var4.getHeight(), n4), 0.0f, 4, null);
        }
        if (i1Var5 != null) {
            i1.a.m(aVar, i1Var5, sa.o(i1Var3), q(z4, n4, L0, i1Var5), 0.0f, 4, null);
        }
        if (i1Var6 != null) {
            i1.a.m(aVar, i1Var6, (i4 - sa.o(i1Var4)) - i1Var6.getWidth(), q(z4, n4, L0, i1Var6), 0.0f, 4, null);
        }
        int o4 = sa.o(i1Var3) + sa.o(i1Var5);
        i1.a.m(aVar, i1Var, o4, q(z4, n4, L0, i1Var), 0.0f, 4, null);
        if (i1Var2 != null) {
            i1.a.m(aVar, i1Var2, o4, q(z4, n4, L0, i1Var2), 0.0f, 4, null);
        }
        if (i1Var8 != null) {
            i1.a.m(aVar, i1Var8, 0, n4, 0.0f, 4, null);
        }
    }

    private static final int q(boolean z4, int i4, int i5, androidx.compose.ui.layout.i1 i1Var) {
        return z4 ? androidx.compose.ui.c.INSTANCE.q().a(i1Var.getHeight(), i4) : i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(int i4, int i5) {
        return i4 == Integer.MAX_VALUE ? i4 : i4 - i5;
    }
}
