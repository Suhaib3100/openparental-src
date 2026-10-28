package androidx.compose.foundation.text.selection;

import android.view.KeyEvent;
import androidx.annotation.m1;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.text.selection.q;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import androidx.compose.ui.platform.f1;
import androidx.compose.ui.platform.i5;
import androidx.compose.ui.platform.k5;
import androidx.compose.ui.text.e;
import i0.f;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;

/* compiled from: SelectionManager.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b \b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0012\u001a\u00020\u0006*\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u0014*\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010#\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$J*\u0010'\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u00062\u0006\u0010)\u001a\u00020&2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0019\u00101\u001a\u0004\u0018\u0001002\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0019H\u0000¢\u0006\u0004\b3\u00104J;\u0010:\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020*09082\u0006\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u00010*H\u0000¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u001fH\u0000¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u001fH\u0000¢\u0006\u0004\b>\u0010=J\u0011\u0010@\u001a\u0004\u0018\u00010?H\u0000¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0006H\u0000¢\u0006\u0004\bB\u0010\bJ\r\u0010C\u001a\u00020\u0006¢\u0006\u0004\bC\u0010\bJ\u0015\u0010E\u001a\u00020D2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\bE\u0010FJ4\u0010I\u001a\u00020\u001f2\b\u0010G\u001a\u0004\u0018\u00010\u00102\u0006\u0010H\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0000ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ2\u0010K\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0000ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u001fH\u0001¢\u0006\u0004\bM\u0010=J\u0018\u0010N\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\bN\u0010OR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001c\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001f0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010TR0\u0010^\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0004\u0012\u00020\u00060\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010f\u001a\u0004\u0018\u00010_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010n\u001a\u0004\u0018\u00010g8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010v\u001a\u0004\u0018\u00010o8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010~\u001a\u00020w8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R0\u0010\u0084\u0001\u001a\u00020\u001f2\u0006\u0010\u007f\u001a\u00020\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b\u0080\u0001\u0010T\u001a\u0005\b\u0081\u0001\u0010=\"\u0006\b\u0082\u0001\u0010\u0083\u0001R \u0010H\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R5\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00192\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00198\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u00104\"\u0006\b\u008b\u0001\u0010\u008c\u0001R6\u0010\u0092\u0001\u001a\u00020\u00102\u0006\u0010\u007f\u001a\u00020\u00108@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0005\b\u008e\u0001\u0010T\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0005\b\u0091\u0001\u0010OR6\u0010\u0096\u0001\u001a\u00020\u00102\u0006\u0010\u007f\u001a\u00020\u00108@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0005\b\u0093\u0001\u0010T\u001a\u0006\b\u0094\u0001\u0010\u0090\u0001\"\u0005\b\u0095\u0001\u0010OR:\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00102\b\u0010\u007f\u001a\u0004\u0018\u00010\u00108F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0004\bN\u0010T\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R:\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00102\b\u0010\u007f\u001a\u0004\u0018\u00010\u00108F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0004\b\u001c\u0010T\u001a\u0006\b\u009c\u0001\u0010\u0098\u0001\"\u0006\b\u009d\u0001\u0010\u009a\u0001R6\u0010¤\u0001\u001a\u0005\u0018\u00010\u009f\u00012\t\u0010\u007f\u001a\u0005\u0018\u00010\u009f\u00018F@BX\u0086\u008e\u0002¢\u0006\u0016\n\u0004\bB\u0010T\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R:\u0010§\u0001\u001a\u0004\u0018\u00010\u00102\b\u0010\u007f\u001a\u0004\u0018\u00010\u00108F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0004\b\u0012\u0010T\u001a\u0006\b¥\u0001\u0010\u0098\u0001\"\u0006\b¦\u0001\u0010\u009a\u0001R1\u0010®\u0001\u001a\u0004\u0018\u00010&8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0005\b1\u0010¨\u0001\u0012\u0005\b\u00ad\u0001\u0010\b\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R0\u0010±\u0001\u001a\u00020\u001f2\u0007\u0010\u0087\u0001\u001a\u00020\u001f8\u0000@@X\u0080\u000e¢\u0006\u0016\n\u0005\bj\u0010¦\u0001\u001a\u0005\b¯\u0001\u0010=\"\u0006\b°\u0001\u0010\u0083\u0001R\u0016\u0010³\u0001\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010=R.\u0010¸\u0001\u001a\u0004\u0018\u00010*2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010*8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R)\u0010»\u0001\u001a\u00020\u001f2\u0007\u0010\u0087\u0001\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b¹\u0001\u0010=\"\u0006\bº\u0001\u0010\u0083\u0001R\u0014\u0010¾\u0001\u001a\u00020\u00148F¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¿\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/h0;", "", "Landroidx/compose/foundation/text/selection/n0;", "selectionRegistrar", "<init>", "(Landroidx/compose/foundation/text/selection/n0;)V", "Lkotlin/k2;", "r0", "()V", "q0", "u0", "Li0/i;", "u", "()Li0/i;", "Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/Function1;", "Li0/f;", "onTap", "q", "(Landroidx/compose/ui/input/pointer/k0;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/q;", "Lkotlin/Function0;", "block", "S", "(Landroidx/compose/ui/q;Lld/a;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/layout/u;", "layoutCoordinates", "offset", "o", "(Landroidx/compose/ui/layout/u;J)J", "position", "", "isStartHandle", "Landroidx/compose/foundation/text/selection/w;", "adjustment", "p0", "(JZLandroidx/compose/foundation/text/selection/w;)V", "previousHandlePosition", "Landroidx/compose/foundation/text/selection/d0;", "J", "(JJZ)Landroidx/compose/foundation/text/selection/d0;", "selectionLayout", "Landroidx/compose/foundation/text/selection/q;", "newSelection", "W", "(Landroidx/compose/foundation/text/selection/d0;Landroidx/compose/foundation/text/selection/q;)V", "Landroidx/compose/foundation/text/selection/q$a;", "anchor", "Landroidx/compose/foundation/text/selection/o;", "r", "(Landroidx/compose/foundation/text/selection/q$a;)Landroidx/compose/foundation/text/selection/o;", "U", "()Landroidx/compose/ui/layout/u;", "", "selectableId", "previousSelection", "Lkotlin/q0;", "", "V", "(JLandroidx/compose/foundation/text/selection/q;)Lkotlin/q0;", "R", "()Z", "Q", "Landroidx/compose/ui/text/e;", "H", "()Landroidx/compose/ui/text/e;", "p", "T", "Landroidx/compose/foundation/text/o0;", "O", "(Z)Landroidx/compose/foundation/text/o0;", "newPosition", "previousPosition", "t0", "(Li0/f;JZLandroidx/compose/foundation/text/selection/w;)Z", "s0", "(JJZLandroidx/compose/foundation/text/selection/w;)Z", "o0", "n", "(J)V", "a", "Landroidx/compose/foundation/text/selection/n0;", "Landroidx/compose/runtime/k2;", "b", "Landroidx/compose/runtime/k2;", "_selection", "c", "_isInTouchMode", "d", "Lld/l;", "E", "()Lld/l;", "i0", "(Lld/l;)V", "onSelectionChange", "Lk0/a;", "e", "Lk0/a;", "B", "()Lk0/a;", "f0", "(Lk0/a;)V", "hapticFeedBack", "Landroidx/compose/ui/platform/f1;", "f", "Landroidx/compose/ui/platform/f1;", "s", "()Landroidx/compose/ui/platform/f1;", "X", "(Landroidx/compose/ui/platform/f1;)V", "clipboardManager", "Landroidx/compose/ui/platform/i5;", "g", "Landroidx/compose/ui/platform/i5;", "N", "()Landroidx/compose/ui/platform/i5;", "n0", "(Landroidx/compose/ui/platform/i5;)V", "textToolbar", "Landroidx/compose/ui/focus/a0;", "h", "Landroidx/compose/ui/focus/a0;", "A", "()Landroidx/compose/ui/focus/a0;", "e0", "(Landroidx/compose/ui/focus/a0;)V", "focusRequester", "<set-?>", "i", "C", "g0", "(Z)V", "hasFocus", "j", "Li0/f;", "value", "k", "Landroidx/compose/ui/layout/u;", "t", "Y", "(Landroidx/compose/ui/layout/u;)V", "containerLayoutCoordinates", "l", "w", "()J", "a0", "dragBeginPosition", "m", "x", "b0", "dragTotalDistance", "M", "()Li0/f;", "m0", "(Li0/f;)V", "startHandlePosition", "z", "d0", "endHandlePosition", "Landroidx/compose/foundation/text/o;", "y", "()Landroidx/compose/foundation/text/o;", "c0", "(Landroidx/compose/foundation/text/o;)V", "draggingHandle", "v", "Z", "currentDragPosition", "Landroidx/compose/foundation/text/selection/d0;", "F", "()Landroidx/compose/foundation/text/selection/d0;", "j0", "(Landroidx/compose/foundation/text/selection/d0;)V", "G", "previousSelectionLayout", "L", "l0", "showToolbar", "K", "shouldShowMagnifier", "I", "()Landroidx/compose/foundation/text/selection/q;", "k0", "(Landroidx/compose/foundation/text/selection/q;)V", "selection", "P", "h0", "isInTouchMode", "D", "()Landroidx/compose/ui/q;", "modifier", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,979:1\n81#2:980\n107#2,2:981\n81#2:983\n107#2,2:984\n81#2:986\n107#2,2:987\n81#2:989\n107#2,2:990\n81#2:992\n107#2,2:993\n81#2:995\n107#2,2:996\n81#2:998\n107#2,2:999\n1#3:1001\n1#3:1037\n256#4,3:1002\n33#4,4:1005\n259#4,2:1009\n38#4:1011\n261#4:1012\n101#4,2:1013\n33#4,6:1015\n103#4:1021\n33#4,6:1023\n416#4,3:1029\n33#4,4:1032\n419#4:1036\n420#4:1038\n38#4:1039\n421#4:1040\n69#4,6:1041\n33#4,6:1047\n101#4,2:1053\n33#4,6:1055\n103#4:1061\n1099#5:1022\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n*L\n126#1:980\n126#1:981,2\n176#1:983\n176#1:984,2\n183#1:986\n183#1:987,2\n192#1:989\n192#1:990,2\n201#1:992\n201#1:993,2\n208#1:995\n208#1:996,2\n215#1:998\n215#1:999,2\n525#1:1037\n400#1:1002,3\n400#1:1005,4\n400#1:1009,2\n400#1:1011\n400#1:1012\n445#1:1013,2\n445#1:1015,6\n445#1:1021\n458#1:1023,6\n525#1:1029,3\n525#1:1032,4\n525#1:1036\n525#1:1038\n525#1:1039\n525#1:1040\n775#1:1041,6\n792#1:1047,6\n809#1:1053,2\n809#1:1055,6\n809#1:1061\n457#1:1022\n*E\n"})
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: t, reason: collision with root package name */
    public static final int f7986t = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n0 selectionRegistrar;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2<androidx.compose.foundation.text.selection.q> _selection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2<Boolean> _isInTouchMode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super androidx.compose.foundation.text.selection.q, kotlin.k2> onSelectionChange;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private k0.a hapticFeedBack;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private f1 clipboardManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i5 textToolbar;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.focus.a0 focusRequester;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 hasFocus;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i0.f previousPosition;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.layout.u containerLayoutCoordinates;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 dragBeginPosition;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 dragTotalDistance;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 startHandlePosition;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 endHandlePosition;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 draggingHandle;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 currentDragPosition;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private d0 previousSelectionLayout;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean showToolbar;

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectableId", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Long, kotlin.k2> {
        a() {
            super(1);
        }

        public final void a(long j4) {
            if (h0.this.selectionRegistrar.b().containsKey(Long.valueOf(j4))) {
                h0.this.r0();
                h0.this.u0();
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Long l4) {
            a(l4.longValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "isInTouchMode", "Landroidx/compose/ui/layout/u;", "layoutCoordinates", "Li0/f;", "rawPosition", "Landroidx/compose/foundation/text/selection/w;", "selectionMode", "Lkotlin/k2;", "a", "(ZLandroidx/compose/ui/layout/u;JLandroidx/compose/foundation/text/selection/w;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.r<Boolean, androidx.compose.ui.layout.u, i0.f, w, kotlin.k2> {
        b() {
            super(4);
        }

        public final void a(boolean z4, @fg.l androidx.compose.ui.layout.u uVar, long j4, @fg.l w wVar) {
            long c5 = uVar.c();
            i0.i iVar = new i0.i(0.0f, 0.0f, androidx.compose.ui.unit.u.m(c5), (int) (c5 & 4294967295L));
            if (!i0.d(iVar, j4)) {
                j4 = androidx.compose.foundation.text2.input.internal.k0.a(j4, iVar);
            }
            long o4 = h0.this.o(uVar, j4);
            if (i0.g.d(o4)) {
                h0.this.h0(z4);
                h0.this.p0(o4, false, wVar);
                h0.this.getFocusRequester().e();
                h0.this.l0(false);
            }
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ kotlin.k2 i(Boolean bool, androidx.compose.ui.layout.u uVar, i0.f fVar, w wVar) {
            a(bool.booleanValue(), uVar, fVar.getPackedValue(), wVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isInTouchMode", "", "selectableId", "Lkotlin/k2;", "a", "(ZJ)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<Boolean, Long, kotlin.k2> {
        c() {
            super(2);
        }

        public final void a(boolean z4, long j4) {
            h0 h0Var = h0.this;
            kotlin.q0<androidx.compose.foundation.text.selection.q, Map<Long, androidx.compose.foundation.text.selection.q>> V = h0Var.V(j4, h0Var.I());
            androidx.compose.foundation.text.selection.q a5 = V.a();
            Map<Long, androidx.compose.foundation.text.selection.q> b5 = V.b();
            if (!kotlin.jvm.internal.l0.g(a5, h0.this.I())) {
                h0.this.selectionRegistrar.F(b5);
                h0.this.E().invoke(a5);
            }
            h0.this.h0(z4);
            h0.this.getFocusRequester().e();
            h0.this.l0(false);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Boolean bool, Long l4) {
            a(bool.booleanValue(), l4.longValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "isInTouchMode", "Landroidx/compose/ui/layout/u;", "layoutCoordinates", "Li0/f;", "newPosition", "previousPosition", "isStartHandle", "Landroidx/compose/foundation/text/selection/w;", "selectionMode", "a", "(ZLandroidx/compose/ui/layout/u;JJZLandroidx/compose/foundation/text/selection/w;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.t<Boolean, androidx.compose.ui.layout.u, i0.f, i0.f, Boolean, w, Boolean> {
        d() {
            super(6);
        }

        @Override // ld.t
        public /* bridge */ /* synthetic */ Boolean H(Boolean bool, androidx.compose.ui.layout.u uVar, i0.f fVar, i0.f fVar2, Boolean bool2, w wVar) {
            return a(bool.booleanValue(), uVar, fVar.getPackedValue(), fVar2.getPackedValue(), bool2.booleanValue(), wVar);
        }

        @fg.l
        public final Boolean a(boolean z4, @fg.l androidx.compose.ui.layout.u uVar, long j4, long j5, boolean z5, @fg.l w wVar) {
            long o4 = h0.this.o(uVar, j4);
            long o5 = h0.this.o(uVar, j5);
            h0.this.h0(z4);
            return Boolean.valueOf(h0.this.t0(i0.f.d(o4), o5, z5, wVar));
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {
        e() {
            super(0);
        }

        public final void a() {
            h0.this.l0(true);
            h0.this.c0(null);
            h0.this.Z(null);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectableKey", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<Long, kotlin.k2> {
        f() {
            super(1);
        }

        public final void a(long j4) {
            if (h0.this.selectionRegistrar.b().containsKey(Long.valueOf(j4))) {
                h0.this.T();
                h0.this.k0(null);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Long l4) {
            a(l4.longValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectableId", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<Long, kotlin.k2> {
        g() {
            super(1);
        }

        public final void a(long j4) {
            q.a f4;
            q.a h4;
            androidx.compose.foundation.text.selection.q I = h0.this.I();
            if (I != null && (h4 = I.h()) != null && j4 == h4.h()) {
                h0.this.m0(null);
            }
            androidx.compose.foundation.text.selection.q I2 = h0.this.I();
            if (I2 != null && (f4 = I2.f()) != null && j4 == f4.h()) {
                h0.this.d0(null);
            }
            if (h0.this.selectionRegistrar.b().containsKey(Long.valueOf(j4))) {
                h0.this.u0();
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Long l4) {
            a(l4.longValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SelectionManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2", f = "SelectionManager.kt", i = {}, l = {652}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        int f8013c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f8014d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<i0.f, kotlin.k2> f8015e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(ld.l<? super i0.f, kotlin.k2> lVar, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f8015e = lVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((h) create(cVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            h hVar = new h(this.f8015e, dVar);
            hVar.f8014d = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f8013c;
            if (i4 == 0) {
                a1.n(obj);
                androidx.compose.ui.input.pointer.c cVar = (androidx.compose.ui.input.pointer.c) this.f8014d;
                this.f8013c = 1;
                obj = androidx.compose.foundation.gestures.z0.p(cVar, null, this, 1, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            androidx.compose.ui.input.pointer.b0 b0Var = (androidx.compose.ui.input.pointer.b0) obj;
            if (b0Var != null) {
                this.f8015e.invoke(i0.f.d(b0Var.getPosition()));
            }
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n*L\n1#1,328:1\n779#2:329\n*E\n"})
    public static final class i<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f8016b;

        public i(Map map) {
            this.f8016b = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return kotlin.comparisons.a.l((Comparable) this.f8016b.get(Long.valueOf(((Number) t4).longValue())), (Comparable) this.f8016b.get(Long.valueOf(((Number) t5).longValue())));
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/text/selection/h0$j", "Landroidx/compose/foundation/text/o0;", "Lkotlin/k2;", "e", "()V", "Li0/f;", "point", "a", "(J)V", "startPoint", "b", "delta", "d", "c", "onStop", "onCancel", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class j implements androidx.compose.foundation.text.o0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8017a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f8018b;

        j(boolean z4, h0 h0Var) {
            this.f8017a = z4;
            this.f8018b = h0Var;
        }

        private final void e() {
            this.f8018b.l0(true);
            this.f8018b.c0(null);
            this.f8018b.Z(null);
        }

        @Override // androidx.compose.foundation.text.o0
        public void a(long point) {
            androidx.compose.ui.layout.u f4;
            i0.f M = this.f8017a ? this.f8018b.M() : this.f8018b.z();
            if (M != null) {
                M.getPackedValue();
                androidx.compose.foundation.text.selection.q I = this.f8018b.I();
                if (I == null) {
                    return;
                }
                androidx.compose.foundation.text.selection.o r4 = this.f8018b.r(this.f8017a ? I.h() : I.f());
                if (r4 == null || (f4 = r4.f()) == null) {
                    return;
                }
                long g4 = r4.g(I, this.f8017a);
                if (i0.g.f(g4)) {
                    return;
                }
                long a5 = c0.a(g4);
                h0 h0Var = this.f8018b;
                h0Var.Z(i0.f.d(h0Var.U().E(f4, a5)));
                this.f8018b.c0(this.f8017a ? androidx.compose.foundation.text.o.SelectionStart : androidx.compose.foundation.text.o.SelectionEnd);
                this.f8018b.l0(false);
            }
        }

        @Override // androidx.compose.foundation.text.o0
        public void b(long startPoint) {
            if (this.f8018b.y() == null) {
                return;
            }
            androidx.compose.foundation.text.selection.q I = this.f8018b.I();
            kotlin.jvm.internal.l0.m(I);
            androidx.compose.foundation.text.selection.o oVar = this.f8018b.selectionRegistrar.u().get(Long.valueOf((this.f8017a ? I.h() : I.f()).h()));
            if (oVar == null) {
                throw new IllegalStateException("SelectionRegistrar should contain the current selection's selectableIds");
            }
            androidx.compose.foundation.text.selection.o oVar2 = oVar;
            androidx.compose.ui.layout.u f4 = oVar2.f();
            if (f4 == null) {
                throw new IllegalStateException("Current selectable should have layout coordinates.");
            }
            long g4 = oVar2.g(I, this.f8017a);
            if (i0.g.f(g4)) {
                return;
            }
            long a5 = c0.a(g4);
            h0 h0Var = this.f8018b;
            h0Var.a0(h0Var.U().E(f4, a5));
            h0 h0Var2 = this.f8018b;
            i0.f.INSTANCE.getClass();
            h0Var2.b0(i0.f.f74147c);
        }

        @Override // androidx.compose.foundation.text.o0
        public void c() {
            e();
        }

        @Override // androidx.compose.foundation.text.o0
        public void d(long delta) {
            if (this.f8018b.y() == null) {
                return;
            }
            h0 h0Var = this.f8018b;
            h0Var.b0(i0.f.v(h0Var.x(), delta));
            long v4 = i0.f.v(this.f8018b.w(), this.f8018b.x());
            if (this.f8018b.t0(i0.f.d(v4), this.f8018b.w(), this.f8017a, w.INSTANCE.l())) {
                this.f8018b.a0(v4);
                h0 h0Var2 = this.f8018b;
                i0.f.INSTANCE.getClass();
                h0Var2.b0(i0.f.f74147c);
            }
        }

        @Override // androidx.compose.foundation.text.o0
        public void onCancel() {
            e();
        }

        @Override // androidx.compose.foundation.text.o0
        public void onStop() {
            e();
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class k extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {
        k() {
            super(0);
        }

        public final void a() {
            h0.this.T();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/u;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/u;)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.layout.u, kotlin.k2> {
        l() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.layout.u uVar) {
            h0.this.Y(uVar);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.layout.u uVar) {
            a(uVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/j0;", "focusState", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/focus/j0;)V"}, k = 3, mv = {1, 8, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.focus.j0, kotlin.k2> {
        m() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.focus.j0 j0Var) {
            if (!j0Var.isFocused() && h0.this.C()) {
                h0.this.T();
            }
            h0.this.g0(j0Var.isFocused());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.focus.j0 j0Var) {
            a(j0Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "a", "(Z)V"}, k = 3, mv = {1, 8, 0})
    static final class n extends kotlin.jvm.internal.n0 implements ld.l<Boolean, kotlin.k2> {
        n() {
            super(1);
        }

        public final void a(boolean z4) {
            h0.this.h0(z4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Boolean bool) {
            a(bool.booleanValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/key/c;", "it", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class o extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.key.c, Boolean> {
        o() {
            super(1);
        }

        @fg.l
        public final Boolean a(@fg.l KeyEvent keyEvent) {
            boolean z4;
            if (j0.a(keyEvent)) {
                h0.this.p();
                z4 = true;
            } else {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
            return a(cVar.h());
        }
    }

    /* compiled from: SelectionManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1", f = "SelectionManager.kt", i = {}, l = {659}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class p extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f8024b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f8025c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f8027e;

        /* compiled from: SelectionManager.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i0.f, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.a<kotlin.k2> f8028b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ld.a<kotlin.k2> aVar) {
                super(1);
                this.f8028b = aVar;
            }

            public final void a(long j4) {
                this.f8028b.invoke();
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i0.f fVar) {
                a(fVar.getPackedValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(ld.a<kotlin.k2> aVar, kotlin.coroutines.d<? super p> dVar) {
            super(2, dVar);
            this.f8027e = aVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((p) create(k0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            p pVar = h0.this.new p(this.f8027e, dVar);
            pVar.f8025c = obj;
            return pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f8024b;
            if (i4 == 0) {
                a1.n(obj);
                androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f8025c;
                h0 h0Var = h0.this;
                a aVar2 = new a(this.f8027e);
                this.f8024b = 1;
                if (h0Var.q(k0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/text/selection/q;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text/selection/q;)V"}, k = 3, mv = {1, 8, 0})
    static final class q extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.foundation.text.selection.q, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final q f8029b = new q(1);

        q() {
            super(1);
        }

        public final void a(@fg.m androidx.compose.foundation.text.selection.q qVar) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.foundation.text.selection.q qVar) {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class r extends kotlin.jvm.internal.h0 implements ld.a<kotlin.k2> {
        r(Object obj) {
            super(0, obj, h0.class, "toolbarCopy", "toolbarCopy()V", 0);
        }

        public final void Z() {
            ((h0) this.receiver).q0();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            Z();
            return kotlin.k2.f75408a;
        }
    }

    public h0(@fg.l n0 n0Var) {
        k2<androidx.compose.foundation.text.selection.q> g4;
        k2<Boolean> g5;
        k2 g6;
        k2 g7;
        k2 g10;
        k2 g11;
        k2 g12;
        k2 g13;
        k2 g14;
        this.selectionRegistrar = n0Var;
        g4 = t4.g(null, null, 2, null);
        this._selection = g4;
        g5 = t4.g(Boolean.TRUE, null, 2, null);
        this._isInTouchMode = g5;
        this.onSelectionChange = q.f8029b;
        this.focusRequester = new androidx.compose.ui.focus.a0();
        g6 = t4.g(Boolean.FALSE, null, 2, null);
        this.hasFocus = g6;
        f.Companion companion = i0.f.INSTANCE;
        companion.getClass();
        g7 = t4.g(i0.f.d(i0.f.f74147c), null, 2, null);
        this.dragBeginPosition = g7;
        companion.getClass();
        g10 = t4.g(i0.f.d(i0.f.f74147c), null, 2, null);
        this.dragTotalDistance = g10;
        g11 = t4.g(null, null, 2, null);
        this.startHandlePosition = g11;
        g12 = t4.g(null, null, 2, null);
        this.endHandlePosition = g12;
        g13 = t4.g(null, null, 2, null);
        this.draggingHandle = g13;
        g14 = t4.g(null, null, 2, null);
        this.currentDragPosition = g14;
        n0Var.y(new a());
        n0Var.D(new b());
        n0Var.C(new c());
        n0Var.A(new d());
        n0Var.B(new e());
        n0Var.z(new f());
        n0Var.x(new g());
    }

    @m1
    public static /* synthetic */ void G() {
    }

    private final d0 J(long position, long previousHandlePosition, boolean isStartHandle) {
        androidx.compose.ui.layout.u U = U();
        List<androidx.compose.foundation.text.selection.o> G = this.selectionRegistrar.G(U);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = G.size();
        for (int i4 = 0; i4 < size; i4++) {
            linkedHashMap.put(Long.valueOf(G.get(i4).j()), Integer.valueOf(i4));
        }
        e0 e0Var = new e0(position, previousHandlePosition, U, isStartHandle, i0.g.f(previousHandlePosition) ? null : I(), new i(linkedHashMap), null);
        int size2 = G.size();
        for (int i5 = 0; i5 < size2; i5++) {
            G.get(i5).l(e0Var);
        }
        return e0Var.b();
    }

    private final boolean K() {
        return (y() == null || !P() || R()) ? false : true;
    }

    private final androidx.compose.ui.q S(androidx.compose.ui.q qVar, ld.a<kotlin.k2> aVar) {
        return C() ? androidx.compose.ui.input.pointer.u0.e(qVar, kotlin.k2.f75408a, new p(aVar, null)) : qVar;
    }

    private final void W(d0 selectionLayout, androidx.compose.foundation.text.selection.q newSelection) {
        k0.a aVar;
        if (o0() && (aVar = this.hapticFeedBack) != null) {
            k0.b.INSTANCE.getClass();
            aVar.a(k0.d.f74804a.b());
        }
        this.selectionRegistrar.F(selectionLayout.h(newSelection));
        this.onSelectionChange.invoke(newSelection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(i0.f fVar) {
        this.currentDragPosition.setValue(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(long j4) {
        this.dragBeginPosition.setValue(i0.f.d(j4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(long j4) {
        this.dragTotalDistance.setValue(i0.f.d(j4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(androidx.compose.foundation.text.o oVar) {
        this.draggingHandle.setValue(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(i0.f fVar) {
        this.endHandlePosition.setValue(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(i0.f fVar) {
        this.startHandlePosition.setValue(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long o(androidx.compose.ui.layout.u layoutCoordinates, long offset) {
        androidx.compose.ui.layout.u uVar = this.containerLayoutCoordinates;
        if (uVar != null && uVar.f()) {
            return U().E(layoutCoordinates, offset);
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74149e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(long position, boolean isStartHandle, w adjustment) {
        this.previousSelectionLayout = null;
        i0.f.INSTANCE.getClass();
        s0(position, i0.f.f74149e, isStartHandle, adjustment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(androidx.compose.ui.input.pointer.k0 k0Var, ld.l<? super i0.f, kotlin.k2> lVar, kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object d5 = androidx.compose.foundation.gestures.f0.d(k0Var, new h(lVar, null), dVar);
        return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : kotlin.k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0() {
        p();
        T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (androidx.compose.foundation.text.selection.i0.d(r7, r8) == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r0() {
        /*
            r11 = this;
            androidx.compose.foundation.text.selection.q r0 = r11.I()
            androidx.compose.ui.layout.u r1 = r11.containerLayoutCoordinates
            r2 = 0
            if (r0 == 0) goto L14
            androidx.compose.foundation.text.selection.q$a r3 = r0.h()
            if (r3 == 0) goto L14
            androidx.compose.foundation.text.selection.o r3 = r11.r(r3)
            goto L15
        L14:
            r3 = r2
        L15:
            if (r0 == 0) goto L22
            androidx.compose.foundation.text.selection.q$a r4 = r0.f()
            if (r4 == 0) goto L22
            androidx.compose.foundation.text.selection.o r4 = r11.r(r4)
            goto L23
        L22:
            r4 = r2
        L23:
            if (r3 == 0) goto L2a
            androidx.compose.ui.layout.u r5 = r3.f()
            goto L2b
        L2a:
            r5 = r2
        L2b:
            if (r4 == 0) goto L32
            androidx.compose.ui.layout.u r6 = r4.f()
            goto L33
        L32:
            r6 = r2
        L33:
            if (r0 == 0) goto La0
            if (r1 == 0) goto La0
            boolean r7 = r1.f()
            if (r7 == 0) goto La0
            if (r5 != 0) goto L42
            if (r6 != 0) goto L42
            goto La0
        L42:
            i0.i r7 = androidx.compose.foundation.text.selection.i0.i(r1)
            if (r5 == 0) goto L6f
            r8 = 1
            long r8 = r3.g(r0, r8)
            boolean r3 = i0.g.f(r8)
            if (r3 == 0) goto L54
            goto L6f
        L54:
            long r8 = r1.E(r5, r8)
            i0.f r3 = i0.f.d(r8)
            long r8 = r3.getPackedValue()
            androidx.compose.foundation.text.o r5 = r11.y()
            androidx.compose.foundation.text.o r10 = androidx.compose.foundation.text.o.SelectionStart
            if (r5 == r10) goto L70
            boolean r5 = androidx.compose.foundation.text.selection.i0.d(r7, r8)
            if (r5 == 0) goto L6f
            goto L70
        L6f:
            r3 = r2
        L70:
            r11.m0(r3)
            if (r6 == 0) goto L9c
            r3 = 0
            long r3 = r4.g(r0, r3)
            boolean r0 = i0.g.f(r3)
            if (r0 == 0) goto L81
            goto L9c
        L81:
            long r0 = r1.E(r6, r3)
            i0.f r0 = i0.f.d(r0)
            long r3 = r0.getPackedValue()
            androidx.compose.foundation.text.o r1 = r11.y()
            androidx.compose.foundation.text.o r5 = androidx.compose.foundation.text.o.SelectionEnd
            if (r1 == r5) goto L9b
            boolean r1 = androidx.compose.foundation.text.selection.i0.d(r7, r3)
            if (r1 == 0) goto L9c
        L9b:
            r2 = r0
        L9c:
            r11.d0(r2)
            return
        La0:
            r11.m0(r2)
            r11.d0(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.h0.r0():void");
    }

    private final i0.i u() {
        androidx.compose.ui.layout.u uVar;
        List e4;
        i0.i iVar;
        if (I() == null || (uVar = this.containerLayoutCoordinates) == null || !uVar.f()) {
            return null;
        }
        List<androidx.compose.foundation.text.selection.o> G = this.selectionRegistrar.G(U());
        ArrayList arrayList = new ArrayList(G.size());
        int size = G.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.foundation.text.selection.o oVar = G.get(i4);
            androidx.compose.foundation.text.selection.q qVar = this.selectionRegistrar.b().get(Long.valueOf(oVar.j()));
            kotlin.q0 q0Var = qVar != null ? new kotlin.q0(oVar, qVar) : null;
            if (q0Var != null) {
                arrayList.add(q0Var);
            }
        }
        e4 = i0.e(arrayList);
        if (e4.isEmpty()) {
            return null;
        }
        i0.i g4 = i0.g(e4, uVar);
        iVar = i0.f8030a;
        if (kotlin.jvm.internal.l0.g(g4, iVar)) {
            return null;
        }
        i0.i K = i0.i(uVar).K(g4);
        if (K.G() < 0.0f || K.r() < 0.0f) {
            return null;
        }
        return i0.i.h(K.T(androidx.compose.ui.layout.v.f(uVar)), 0.0f, 0.0f, 0.0f, (c0.b() * 4) + K.j(), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0() {
        i5 i5Var;
        if (C() && (i5Var = this.textToolbar) != null) {
            if (!this.showToolbar || !P() || !Q()) {
                if (i5Var.getStatus() == k5.Shown) {
                    i5Var.a();
                }
            } else {
                i0.i u4 = u();
                if (u4 == null) {
                    return;
                }
                i5.b(i5Var, u4, new r(this), null, null, null, 28, null);
            }
        }
    }

    @fg.l
    /* renamed from: A, reason: from getter */
    public final androidx.compose.ui.focus.a0 getFocusRequester() {
        return this.focusRequester;
    }

    @fg.m
    /* renamed from: B, reason: from getter */
    public final k0.a getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean C() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    @fg.l
    public final androidx.compose.ui.q D() {
        androidx.compose.ui.q qVar = androidx.compose.ui.q.INSTANCE;
        androidx.compose.ui.q a5 = androidx.compose.ui.input.key.f.a(z.j(FocusableKt.c(androidx.compose.ui.focus.d.a(androidx.compose.ui.focus.d0.a(androidx.compose.ui.layout.w0.a(S(qVar, new k()), new l()), this.focusRequester), new m()), false, null, 3, null), new n()), new o());
        if (K()) {
            qVar = j0.b(qVar, this);
        }
        return a5.w3(qVar);
    }

    @fg.l
    public final ld.l<androidx.compose.foundation.text.selection.q, kotlin.k2> E() {
        return this.onSelectionChange;
    }

    @fg.m
    /* renamed from: F, reason: from getter */
    public final d0 getPreviousSelectionLayout() {
        return this.previousSelectionLayout;
    }

    @fg.m
    public final androidx.compose.ui.text.e H() {
        if (I() == null || this.selectionRegistrar.b().isEmpty()) {
            return null;
        }
        e.a aVar = new e.a(0, 1, null);
        List<androidx.compose.foundation.text.selection.o> G = this.selectionRegistrar.G(U());
        int size = G.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.foundation.text.selection.o oVar = G.get(i4);
            androidx.compose.foundation.text.selection.q qVar = this.selectionRegistrar.b().get(Long.valueOf(oVar.j()));
            if (qVar != null) {
                androidx.compose.ui.text.e b5 = oVar.b();
                aVar.j(qVar.g() ? b5.subSequence(qVar.f().g(), qVar.h().g()) : b5.subSequence(qVar.h().g(), qVar.f().g()));
            }
        }
        return aVar.u();
    }

    @fg.m
    public final androidx.compose.foundation.text.selection.q I() {
        return this._selection.getValue();
    }

    /* renamed from: L, reason: from getter */
    public final boolean getShowToolbar() {
        return this.showToolbar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    public final i0.f M() {
        return (i0.f) this.startHandlePosition.getValue();
    }

    @fg.m
    /* renamed from: N, reason: from getter */
    public final i5 getTextToolbar() {
        return this.textToolbar;
    }

    @fg.l
    public final androidx.compose.foundation.text.o0 O(boolean isStartHandle) {
        return new j(isStartHandle, this);
    }

    public final boolean P() {
        return this._isInTouchMode.getValue().booleanValue();
    }

    public final boolean Q() {
        androidx.compose.foundation.text.selection.q I = I();
        if (I == null || kotlin.jvm.internal.l0.g(I.h(), I.f())) {
            return false;
        }
        if (I.h().h() == I.f().h()) {
            return true;
        }
        List<androidx.compose.foundation.text.selection.o> G = this.selectionRegistrar.G(U());
        int size = G.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.foundation.text.selection.q qVar = this.selectionRegistrar.b().get(Long.valueOf(G.get(i4).j()));
            if (qVar != null && qVar.h().g() != qVar.f().g()) {
                return true;
            }
        }
        return false;
    }

    public final boolean R() {
        androidx.compose.foundation.text.selection.q I = I();
        if (I == null) {
            return true;
        }
        return kotlin.jvm.internal.l0.g(I.h(), I.f());
    }

    public final void T() {
        k0.a aVar;
        this.selectionRegistrar.F(kotlin.collections.z0.z());
        l0(false);
        if (I() != null) {
            this.onSelectionChange.invoke(null);
            if (!P() || (aVar = this.hapticFeedBack) == null) {
                return;
            }
            k0.b.INSTANCE.getClass();
            aVar.a(k0.d.f74804a.b());
        }
    }

    @fg.l
    public final androidx.compose.ui.layout.u U() {
        androidx.compose.ui.layout.u uVar = this.containerLayoutCoordinates;
        if (uVar == null) {
            throw new IllegalArgumentException("null coordinates");
        }
        if (uVar.f()) {
            return uVar;
        }
        throw new IllegalArgumentException("unattached coordinates");
    }

    @fg.l
    public final kotlin.q0<androidx.compose.foundation.text.selection.q, Map<Long, androidx.compose.foundation.text.selection.q>> V(long selectableId, @fg.m androidx.compose.foundation.text.selection.q previousSelection) {
        k0.a aVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<androidx.compose.foundation.text.selection.o> G = this.selectionRegistrar.G(U());
        int size = G.size();
        androidx.compose.foundation.text.selection.q qVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.foundation.text.selection.o oVar = G.get(i4);
            androidx.compose.foundation.text.selection.q k4 = oVar.j() == selectableId ? oVar.k() : null;
            if (k4 != null) {
                linkedHashMap.put(Long.valueOf(oVar.j()), k4);
            }
            qVar = i0.h(qVar, k4);
        }
        if (P() && !kotlin.jvm.internal.l0.g(qVar, previousSelection) && (aVar = this.hapticFeedBack) != null) {
            k0.b.INSTANCE.getClass();
            aVar.a(k0.d.f74804a.b());
        }
        return new kotlin.q0<>(qVar, linkedHashMap);
    }

    public final void X(@fg.m f1 f1Var) {
        this.clipboardManager = f1Var;
    }

    public final void Y(@fg.m androidx.compose.ui.layout.u uVar) {
        this.containerLayoutCoordinates = uVar;
        if (!C() || I() == null) {
            return;
        }
        i0.f d5 = uVar != null ? i0.f.d(androidx.compose.ui.layout.v.g(uVar)) : null;
        if (kotlin.jvm.internal.l0.g(this.previousPosition, d5)) {
            return;
        }
        this.previousPosition = d5;
        r0();
        u0();
    }

    public final void e0(@fg.l androidx.compose.ui.focus.a0 a0Var) {
        this.focusRequester = a0Var;
    }

    public final void f0(@fg.m k0.a aVar) {
        this.hapticFeedBack = aVar;
    }

    public final void g0(boolean z4) {
        this.hasFocus.setValue(Boolean.valueOf(z4));
    }

    public final void h0(boolean z4) {
        if (this._isInTouchMode.getValue().booleanValue() != z4) {
            this._isInTouchMode.setValue(Boolean.valueOf(z4));
            u0();
        }
    }

    public final void i0(@fg.l ld.l<? super androidx.compose.foundation.text.selection.q, kotlin.k2> lVar) {
        this.onSelectionChange = lVar;
    }

    public final void j0(@fg.m d0 d0Var) {
        this.previousSelectionLayout = d0Var;
    }

    public final void k0(@fg.m androidx.compose.foundation.text.selection.q qVar) {
        this._selection.setValue(qVar);
        if (qVar != null) {
            r0();
        }
    }

    public final void l0(boolean z4) {
        this.showToolbar = z4;
        u0();
    }

    public final void n(long position) {
        androidx.compose.foundation.text.selection.q I = I();
        if (I != null ? androidx.compose.ui.text.t0.h(I.j()) : true) {
            p0(position, true, w.INSTANCE.o());
        }
    }

    public final void n0(@fg.m i5 i5Var) {
        this.textToolbar = i5Var;
    }

    @m1
    public final boolean o0() {
        if (!P()) {
            return false;
        }
        List<androidx.compose.foundation.text.selection.o> v4 = this.selectionRegistrar.v();
        int size = v4.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (v4.get(i4).b().length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final void p() {
        f1 f1Var;
        androidx.compose.ui.text.e H = H();
        if (H != null) {
            if (H.length() <= 0) {
                H = null;
            }
            if (H == null || (f1Var = this.clipboardManager) == null) {
                return;
            }
            f1Var.c(H);
        }
    }

    @fg.m
    public final androidx.compose.foundation.text.selection.o r(@fg.l q.a anchor) {
        return this.selectionRegistrar.u().get(Long.valueOf(anchor.h()));
    }

    @fg.m
    /* renamed from: s, reason: from getter */
    public final f1 getClipboardManager() {
        return this.clipboardManager;
    }

    public final boolean s0(long position, long previousHandlePosition, boolean isStartHandle, @fg.l w adjustment) {
        c0(isStartHandle ? androidx.compose.foundation.text.o.SelectionStart : androidx.compose.foundation.text.o.SelectionEnd);
        Z(i0.f.d(position));
        d0 J = J(position, previousHandlePosition, isStartHandle);
        if (!J.i(this.previousSelectionLayout)) {
            return false;
        }
        androidx.compose.foundation.text.selection.q a5 = adjustment.a(J);
        if (!kotlin.jvm.internal.l0.g(a5, I())) {
            W(J, a5);
        }
        this.previousSelectionLayout = J;
        return true;
    }

    @fg.m
    /* renamed from: t, reason: from getter */
    public final androidx.compose.ui.layout.u getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    public final boolean t0(@fg.m i0.f newPosition, long previousPosition, boolean isStartHandle, @fg.l w adjustment) {
        if (newPosition == null) {
            return false;
        }
        return s0(newPosition.getPackedValue(), previousPosition, isStartHandle, adjustment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    public final i0.f v() {
        return (i0.f) this.currentDragPosition.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long w() {
        return ((i0.f) this.dragBeginPosition.getValue()).getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long x() {
        return ((i0.f) this.dragTotalDistance.getValue()).getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    public final androidx.compose.foundation.text.o y() {
        return (androidx.compose.foundation.text.o) this.draggingHandle.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    public final i0.f z() {
        return (i0.f) this.endHandlePosition.getValue();
    }
}
