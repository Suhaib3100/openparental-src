package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.r;
import androidx.compose.ui.graphics.v1;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.layout.m0;
import androidx.compose.ui.layout.o0;
import androidx.compose.ui.layout.w0;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.node.p1;
import androidx.compose.ui.node.q1;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.platform.j2;
import androidx.compose.ui.q;
import androidx.compose.ui.semantics.z;
import androidx.compose.ui.unit.c0;
import androidx.compose.ui.unit.d0;
import androidx.compose.ui.viewinterop.c;
import androidx.compose.ui.viewinterop.d;
import androidx.core.view.a1;
import androidx.core.view.c1;
import androidx.view.C1442q1;
import androidx.view.C1463g;
import androidx.view.InterfaceC1423e0;
import androidx.view.InterfaceC1461e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.ranges.s;
import kotlinx.coroutines.r0;

/* compiled from: AndroidViewHolder.android.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 a2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001,B9\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010 J\u001f\u0010%\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tH\u0014¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u001e¢\u0006\u0004\b'\u0010 J7\u0010-\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010,\u001a\u00020\tH\u0014¢\u0006\u0004\b-\u0010.J\u0011\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u001e2\u0006\u00102\u001a\u00020(H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001eH\u0014¢\u0006\u0004\b5\u0010 J\u000f\u00106\u001a\u00020\u001eH\u0014¢\u0006\u0004\b6\u0010 J%\u0010<\u001a\u0004\u0018\u00010;2\b\u00108\u001a\u0004\u0018\u0001072\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010@\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\r2\u0006\u0010?\u001a\u00020\rH\u0016¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\u001e¢\u0006\u0004\bB\u0010 J\u0017\u0010D\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020\tH\u0014¢\u0006\u0004\bD\u0010EJ\u0019\u0010H\u001a\u00020(2\b\u0010G\u001a\u0004\u0018\u00010FH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020(H\u0016¢\u0006\u0004\bJ\u0010KJ/\u0010N\u001a\u00020(2\u0006\u0010>\u001a\u00020\r2\u0006\u0010?\u001a\u00020\r2\u0006\u0010L\u001a\u00020\t2\u0006\u0010M\u001a\u00020\tH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\tH\u0016¢\u0006\u0004\bP\u0010QJ/\u0010R\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\r2\u0006\u0010?\u001a\u00020\r2\u0006\u0010L\u001a\u00020\t2\u0006\u0010M\u001a\u00020\tH\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010T\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020\r2\u0006\u0010M\u001a\u00020\tH\u0016¢\u0006\u0004\bT\u0010UJG\u0010[\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020\r2\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020\t2\u0006\u0010X\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010M\u001a\u00020\t2\u0006\u0010Z\u001a\u000207H\u0016¢\u0006\u0004\b[\u0010\\J?\u0010]\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020\r2\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020\t2\u0006\u0010X\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010M\u001a\u00020\tH\u0016¢\u0006\u0004\b]\u0010^J7\u0010a\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020\r2\u0006\u0010_\u001a\u00020\t2\u0006\u0010`\u001a\u00020\t2\u0006\u0010Z\u001a\u0002072\u0006\u0010M\u001a\u00020\tH\u0016¢\u0006\u0004\ba\u0010bJ/\u0010f\u001a\u00020(2\u0006\u0010?\u001a\u00020\r2\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020c2\u0006\u0010Z\u001a\u00020(H\u0016¢\u0006\u0004\bf\u0010gJ'\u0010h\u001a\u00020(2\u0006\u0010?\u001a\u00020\r2\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020cH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020(H\u0016¢\u0006\u0004\bj\u0010KR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010pR6\u0010y\u001a\b\u0012\u0004\u0012\u00020\u001e0q2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u001e0q8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0016\u0010|\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R8\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0q2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u001e0q8\u0006@DX\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010t\u001a\u0004\b\u007f\u0010v\"\u0005\b\u0080\u0001\u0010xR:\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0q2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u001e0q8\u0006@DX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010t\u001a\u0005\b\u0083\u0001\u0010v\"\u0005\b\u0084\u0001\u0010xR2\u0010\u008c\u0001\u001a\u00030\u0086\u00012\u0007\u0010r\u001a\u00030\u0086\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0005\b+\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R8\u0010\u0093\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0086\u0001\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u008d\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b!\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R2\u0010\u009a\u0001\u001a\u00030\u0094\u00012\u0007\u0010r\u001a\u00030\u0094\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b*\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R9\u0010\u009e\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0094\u0001\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u008d\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u008e\u0001\u001a\u0006\b\u009c\u0001\u0010\u0090\u0001\"\u0006\b\u009d\u0001\u0010\u0092\u0001R7\u0010¦\u0001\u001a\u0005\u0018\u00010\u009f\u00012\t\u0010r\u001a\u0005\u0018\u00010\u009f\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R7\u0010\u00ad\u0001\u001a\u0005\u0018\u00010§\u00012\t\u0010r\u001a\u0005\u0018\u00010§\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R\u001b\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010tR\u001c\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0q8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¯\u0001\u0010tR7\u0010³\u0001\u001a\u0011\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u008d\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u001f\u0010\u008e\u0001\u001a\u0006\b±\u0001\u0010\u0090\u0001\"\u0006\b²\u0001\u0010\u0092\u0001R\u0016\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010´\u0001R\u0017\u0010µ\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u0016R\u0017\u0010¶\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010\u0016R\u0018\u0010¹\u0001\u001a\u00030·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010¸\u0001R\u0018\u0010º\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010{R\u001c\u0010¾\u0001\u001a\u00030»\u00018\u0006¢\u0006\u000f\n\u0005\bT\u0010¼\u0001\u001a\u0006\b¯\u0001\u0010½\u0001R\u0018\u0010Â\u0001\u001a\u00030¿\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0016\u0010Ä\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010K¨\u0006Å\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/c;", "Landroid/view/ViewGroup;", "Landroidx/core/view/a1;", "Landroidx/compose/runtime/r;", "Landroidx/compose/ui/node/q1;", "Landroid/content/Context;", "context", "Landroidx/compose/runtime/z;", "parentContext", "", "compositeKeyHash", "Landroidx/compose/ui/input/nestedscroll/b;", "dispatcher", "Landroid/view/View;", "view", "Landroidx/compose/ui/node/p1;", "owner", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/z;ILandroidx/compose/ui/input/nestedscroll/b;Landroid/view/View;Landroidx/compose/ui/node/p1;)V", "min", "max", "preferred", "I", "(III)I", "Landroidx/compose/ui/viewinterop/InteropView;", "p", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/k2;", "r", "()V", "k", "e", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "J", "", "changed", "l", "t", "b", "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "child", "target", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "G", "visibility", "onWindowVisibilityChanged", "(I)V", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "(Landroid/graphics/Region;)Z", "shouldDelayChildPressedState", "()Z", "axes", "type", "s0", "(Landroid/view/View;Landroid/view/View;II)Z", "getNestedScrollAxes", "()I", "u", "(Landroid/view/View;Landroid/view/View;II)V", "x", "(Landroid/view/View;I)V", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "o0", "(Landroid/view/View;IIIII[I)V", "q0", "(Landroid/view/View;IIIII)V", "dx", "dy", "y", "(Landroid/view/View;II[II)V", "", "velocityX", "velocityY", "onNestedFling", "(Landroid/view/View;FFZ)Z", "onNestedPreFling", "(Landroid/view/View;FF)Z", "isNestedScrollingEnabled", "c", "Landroidx/compose/ui/input/nestedscroll/b;", "d", "Landroid/view/View;", "F", "Landroidx/compose/ui/node/p1;", "Lkotlin/Function0;", "value", "f", "Lld/a;", "E", "()Lld/a;", "T", "(Lld/a;)V", "update", "g", "Z", "hasUpdateBlock", "<set-?>", "h", "B", "R", "reset", "i", "A", "Q", "release", "Landroidx/compose/ui/q;", "j", "Landroidx/compose/ui/q;", "()Landroidx/compose/ui/q;", "M", "(Landroidx/compose/ui/q;)V", "modifier", "Lkotlin/Function1;", "Lld/l;", "w", "()Lld/l;", "O", "(Lld/l;)V", "onModifierChanged", "Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/d;", "o", "()Landroidx/compose/ui/unit/d;", "K", "(Landroidx/compose/ui/unit/d;)V", "density", "m", "v", "N", "onDensityChanged", "Landroidx/lifecycle/e0;", "n", "Landroidx/lifecycle/e0;", "s", "()Landroidx/lifecycle/e0;", "L", "(Landroidx/lifecycle/e0;)V", "lifecycleOwner", "Landroidx/savedstate/e;", "Landroidx/savedstate/e;", "C", "()Landroidx/savedstate/e;", "S", "(Landroidx/savedstate/e;)V", "savedStateRegistryOwner", "runUpdate", "q", "runInvalidate", "z", "P", "onRequestDisallowInterceptTouchEvent", "[I", "lastWidthMeasureSpec", "lastHeightMeasureSpec", "Landroidx/core/view/c1;", "Landroidx/core/view/c1;", "nestedScrollingParentHelper", "isDrawing", "Landroidx/compose/ui/node/h0;", "Landroidx/compose/ui/node/h0;", "()Landroidx/compose/ui/node/h0;", "layoutNode", "Landroidx/compose/ui/node/r1;", "D", "()Landroidx/compose/ui/node/r1;", "snapshotObserver", "G3", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class c extends ViewGroup implements a1, r, q1 {

    /* renamed from: z, reason: collision with root package name */
    public static final int f21539z = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int compositeKeyHash;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.input.nestedscroll.b dispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final View view;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final p1 owner;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.a<k2> update;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean hasUpdateBlock;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.a<k2> reset;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.a<k2> release;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.q modifier;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super androidx.compose.ui.q, k2> onModifierChanged;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.d density;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super androidx.compose.ui.unit.d, k2> onDensityChanged;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private InterfaceC1423e0 lifecycleOwner;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private InterfaceC1461e savedStateRegistryOwner;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<k2> runUpdate;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<k2> runInvalidate;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super Boolean, k2> onRequestDisallowInterceptTouchEvent;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final int[] location;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int lastWidthMeasureSpec;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int lastHeightMeasureSpec;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c1 nestedScrollingParentHelper;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean isDrawing;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h0 layoutNode;

    @fg.l
    private static final ld.l<c, k2> A = a.f21563b;

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/viewinterop/c;", "it", "Lkotlin/k2;", "b", "(Landroidx/compose/ui/viewinterop/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<c, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f21563b = new a(1);

        a() {
            super(1);
        }

        public static void a(ld.a aVar) {
            aVar.invoke();
        }

        private static final void c(ld.a aVar) {
            aVar.invoke();
        }

        public final void b(@fg.l c cVar) {
            Handler handler = cVar.getHandler();
            final ld.a aVar = cVar.runUpdate;
            handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.a.a(ld.a.this);
                }
            });
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(c cVar) {
            b(cVar);
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/q;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/q;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.viewinterop.c$c, reason: collision with other inner class name */
    static final class C0377c extends n0 implements ld.l<androidx.compose.ui.q, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f21564b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f21565c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0377c(h0 h0Var, androidx.compose.ui.q qVar) {
            super(1);
            this.f21564b = h0Var;
            this.f21565c = qVar;
        }

        public final void a(@fg.l androidx.compose.ui.q qVar) {
            this.f21564b.u(qVar.w3(this.f21565c));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.q qVar) {
            a(qVar);
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/d;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/unit/d;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.l<androidx.compose.ui.unit.d, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f21566b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h0 h0Var) {
            super(1);
            this.f21566b = h0Var;
        }

        public final void a(@fg.l androidx.compose.ui.unit.d dVar) {
            this.f21566b.g(dVar);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.unit.d dVar) {
            a(dVar);
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/p1;", "owner", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/p1;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends n0 implements ld.l<p1, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0 f21568c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(h0 h0Var) {
            super(1);
            this.f21568c = h0Var;
        }

        public final void a(@fg.l p1 p1Var) {
            AndroidComposeView androidComposeView = p1Var instanceof AndroidComposeView ? (AndroidComposeView) p1Var : null;
            if (androidComposeView != null) {
                androidComposeView.D0(c.this, this.f21568c);
            }
            ViewParent parent = c.this.getView().getParent();
            c cVar = c.this;
            if (parent != cVar) {
                cVar.addView(cVar.getView());
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(p1 p1Var) {
            a(p1Var);
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/p1;", "owner", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/p1;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends n0 implements ld.l<p1, k2> {
        f() {
            super(1);
        }

        public final void a(@fg.l p1 p1Var) {
            AndroidComposeView androidComposeView = p1Var instanceof AndroidComposeView ? (AndroidComposeView) p1Var : null;
            if (androidComposeView != null) {
                androidComposeView.o1(c.this);
            }
            c.this.removeAllViewsInLayout();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(p1 p1Var) {
            a(p1Var);
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J,\u0010\u000f\u001a\u00020\u000e*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0015\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J)\u0010\u0016\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"androidx/compose/ui/viewinterop/c$g", "Landroidx/compose/ui/layout/m0;", "", "height", "k", "(I)I", "width", "j", "Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "d", "(Landroidx/compose/ui/layout/q;Ljava/util/List;I)I", "b", "c", "e", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g implements m0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f21571b;

        /* compiled from: AndroidViewHolder.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.l<i1.a, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f21572b = new a(1);

            a() {
                super(1);
            }

            public final void a(@fg.l i1.a aVar) {
            }

            @Override // ld.l
            public k2 invoke(i1.a aVar) {
                return k2.f75408a;
            }
        }

        /* compiled from: AndroidViewHolder.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends n0 implements ld.l<i1.a, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f21573b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ h0 f21574c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c cVar, h0 h0Var) {
                super(1);
                this.f21573b = cVar;
                this.f21574c = h0Var;
            }

            public final void a(@fg.l i1.a aVar) {
                androidx.compose.ui.viewinterop.d.f(this.f21573b, this.f21574c);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
                a(aVar);
                return k2.f75408a;
            }
        }

        g(h0 h0Var) {
            this.f21571b = h0Var;
        }

        private final int j(int width) {
            c cVar = c.this;
            ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
            l0.m(layoutParams);
            cVar.measure(cVar.I(0, width, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return c.this.getMeasuredHeight();
        }

        private final int k(int height) {
            c cVar = c.this;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            c cVar2 = c.this;
            ViewGroup.LayoutParams layoutParams = cVar2.getLayoutParams();
            l0.m(layoutParams);
            cVar.measure(makeMeasureSpec, cVar2.I(0, height, layoutParams.height));
            return c.this.getMeasuredWidth();
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public androidx.compose.ui.layout.n0 a(@fg.l o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            if (c.this.getChildCount() == 0) {
                return o0.x2(o0Var, androidx.compose.ui.unit.b.r(j4), androidx.compose.ui.unit.b.q(j4), null, a.f21572b, 4, null);
            }
            if (androidx.compose.ui.unit.b.r(j4) != 0) {
                c.this.getChildAt(0).setMinimumWidth(androidx.compose.ui.unit.b.r(j4));
            }
            if (androidx.compose.ui.unit.b.q(j4) != 0) {
                c.this.getChildAt(0).setMinimumHeight(androidx.compose.ui.unit.b.q(j4));
            }
            c cVar = c.this;
            int r4 = androidx.compose.ui.unit.b.r(j4);
            int p4 = androidx.compose.ui.unit.b.p(j4);
            ViewGroup.LayoutParams layoutParams = c.this.getLayoutParams();
            l0.m(layoutParams);
            int I = cVar.I(r4, p4, layoutParams.width);
            c cVar2 = c.this;
            int q4 = androidx.compose.ui.unit.b.q(j4);
            int o4 = androidx.compose.ui.unit.b.o(j4);
            ViewGroup.LayoutParams layoutParams2 = c.this.getLayoutParams();
            l0.m(layoutParams2);
            cVar.measure(I, cVar2.I(q4, o4, layoutParams2.height));
            return o0.x2(o0Var, c.this.getMeasuredWidth(), c.this.getMeasuredHeight(), null, new b(c.this, this.f21571b), 4, null);
        }

        @Override // androidx.compose.ui.layout.m0
        public int b(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
            return k(i4);
        }

        @Override // androidx.compose.ui.layout.m0
        public int c(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
            return j(i4);
        }

        @Override // androidx.compose.ui.layout.m0
        public int d(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
            return k(i4);
        }

        @Override // androidx.compose.ui.layout.m0
        public int e(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
            return j(i4);
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends n0 implements ld.l<z, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f21575b = new h(1);

        h() {
            super(1);
        }

        public final void a(@fg.l z zVar) {
        }

        @Override // ld.l
        public k2 invoke(z zVar) {
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nAndroidViewHolder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$2\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,617:1\n246#2:618\n*S KotlinDebug\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$2\n*L\n351#1:618\n*E\n"})
    static final class i extends n0 implements ld.l<androidx.compose.ui.graphics.drawscope.f, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0 f21577c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f21578d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(h0 h0Var, c cVar) {
            super(1);
            this.f21577c = h0Var;
            this.f21578d = cVar;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
            c cVar = c.this;
            h0 h0Var = this.f21577c;
            c cVar2 = this.f21578d;
            v1 i4 = fVar.getDrawContext().i();
            if (cVar.getView().getVisibility() != 8) {
                cVar.isDrawing = true;
                p1 owner = h0Var.getOwner();
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                if (androidComposeView != null) {
                    androidComposeView.M0(cVar2, androidx.compose.ui.graphics.h0.d(i4));
                }
                cVar.isDrawing = false;
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            a(fVar);
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/u;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/u;)V"}, k = 3, mv = {1, 8, 0})
    static final class j extends n0 implements ld.l<androidx.compose.ui.layout.u, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0 f21580c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(h0 h0Var) {
            super(1);
            this.f21580c = h0Var;
        }

        public final void a(@fg.l androidx.compose.ui.layout.u uVar) {
            androidx.compose.ui.viewinterop.d.f(c.this, this.f21580c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.layout.u uVar) {
            a(uVar);
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {560, 565}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class k extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f21581b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f21582c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f21583d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f21584e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z4, c cVar, long j4, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f21582c = z4;
            this.f21583d = cVar;
            this.f21584e = j4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new k(this.f21582c, this.f21583d, this.f21584e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f21581b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                if (this.f21582c) {
                    androidx.compose.ui.input.nestedscroll.b bVar = this.f21583d.dispatcher;
                    long j4 = this.f21584e;
                    c0.INSTANCE.getClass();
                    long j5 = c0.f21491c;
                    this.f21581b = 2;
                    if (bVar.a(j4, j5, this) == aVar) {
                        return aVar;
                    }
                } else {
                    androidx.compose.ui.input.nestedscroll.b bVar2 = this.f21583d.dispatcher;
                    c0.INSTANCE.getClass();
                    long j6 = c0.f21491c;
                    long j7 = this.f21584e;
                    this.f21581b = 1;
                    if (bVar2.a(j6, j7, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i4 != 1 && i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((k) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {578}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f21585b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f21587d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(long j4, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f21587d = j4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return c.this.new l(this.f21587d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f21585b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.ui.input.nestedscroll.b bVar = c.this.dispatcher;
                long j4 = this.f21587d;
                this.f21585b = 1;
                if (bVar.c(j4, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((l) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class m extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f21588b = new m(0);

        m() {
            super(0);
        }

        public final void a() {
        }

        @Override // ld.a
        public k2 invoke() {
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class n extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final n f21589b = new n(0);

        n() {
            super(0);
        }

        public final void a() {
        }

        @Override // ld.a
        public k2 invoke() {
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class o extends n0 implements ld.a<k2> {
        o() {
            super(0);
        }

        public final void a() {
            c.this.getLayoutNode().Q0();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class p extends n0 implements ld.a<k2> {
        p() {
            super(0);
        }

        public final void a() {
            if (c.this.hasUpdateBlock && c.this.isAttachedToWindow()) {
                c.this.D().i(c.this, c.A, c.this.E());
            }
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class q extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final q f21592b = new q(0);

        q() {
            super(0);
        }

        public final void a() {
        }

        @Override // ld.a
        public k2 invoke() {
            return k2.f75408a;
        }
    }

    public c(@fg.l Context context, @fg.m androidx.compose.runtime.z zVar, int i4, @fg.l androidx.compose.ui.input.nestedscroll.b bVar, @fg.l View view, @fg.l p1 p1Var) {
        super(context);
        d.a aVar;
        this.compositeKeyHash = i4;
        this.dispatcher = bVar;
        this.view = view;
        this.owner = p1Var;
        if (zVar != null) {
            WindowRecomposer_androidKt.j(this, zVar);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.update = q.f21592b;
        this.reset = n.f21589b;
        this.release = m.f21588b;
        q.Companion companion = androidx.compose.ui.q.INSTANCE;
        this.modifier = companion;
        this.density = androidx.compose.ui.unit.f.b(1.0f, 0.0f, 2, null);
        this.runUpdate = new p();
        this.runInvalidate = new o();
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new c1();
        h0 h0Var = new h0(false, 0, 3, null);
        h0Var.H1(this);
        aVar = androidx.compose.ui.viewinterop.d.f21594b;
        androidx.compose.ui.q a5 = w0.a(androidx.compose.ui.draw.l.b(androidx.compose.ui.input.pointer.n0.c(androidx.compose.ui.semantics.o.e(androidx.compose.ui.input.nestedscroll.c.a(companion, aVar, bVar), true, h.f21575b), this), new i(h0Var, this)), new j(h0Var));
        h0Var.i(i4);
        h0Var.u(this.modifier.w3(a5));
        this.onModifierChanged = new C0377c(h0Var, a5);
        h0Var.g(this.density);
        this.onDensityChanged = new d(h0Var);
        h0Var.L1(new e(h0Var));
        h0Var.M1(new f());
        h0Var.t(new g(h0Var));
        this.layoutNode = h0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.node.r1 D() {
        if (isAttachedToWindow()) {
            return this.owner.getSnapshotObserver();
        }
        throw new IllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
    }

    private static final void H(ld.a aVar) {
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int I(int min, int max, int preferred) {
        return (preferred >= 0 || min == max) ? View.MeasureSpec.makeMeasureSpec(s.I(preferred, min, max), 1073741824) : (preferred != -2 || max == Integer.MAX_VALUE) ? (preferred != -1 || max == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(max, 1073741824) : View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
    }

    public static void f(ld.a aVar) {
        aVar.invoke();
    }

    @fg.l
    public final ld.a<k2> A() {
        return this.release;
    }

    @fg.l
    public final ld.a<k2> B() {
        return this.reset;
    }

    @fg.m
    /* renamed from: C, reason: from getter */
    public final InterfaceC1461e getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    @fg.l
    public final ld.a<k2> E() {
        return this.update;
    }

    @fg.l
    /* renamed from: F, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final void G() {
        if (!this.isDrawing) {
            this.layoutNode.Q0();
            return;
        }
        View view = this.view;
        final ld.a<k2> aVar = this.runInvalidate;
        view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.a
            @Override // java.lang.Runnable
            public final void run() {
                c.f(ld.a.this);
            }
        });
    }

    @Override // androidx.compose.ui.node.q1
    public boolean G3() {
        return isAttachedToWindow();
    }

    public final void J() {
        int i4;
        int i5 = this.lastWidthMeasureSpec;
        if (i5 == Integer.MIN_VALUE || (i4 = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i5, i4);
    }

    public final void K(@fg.l androidx.compose.ui.unit.d dVar) {
        if (dVar != this.density) {
            this.density = dVar;
            ld.l<? super androidx.compose.ui.unit.d, k2> lVar = this.onDensityChanged;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
        }
    }

    public final void L(@fg.m InterfaceC1423e0 interfaceC1423e0) {
        if (interfaceC1423e0 != this.lifecycleOwner) {
            this.lifecycleOwner = interfaceC1423e0;
            C1442q1.b(this, interfaceC1423e0);
        }
    }

    public final void M(@fg.l androidx.compose.ui.q qVar) {
        if (qVar != this.modifier) {
            this.modifier = qVar;
            ld.l<? super androidx.compose.ui.q, k2> lVar = this.onModifierChanged;
            if (lVar != null) {
                lVar.invoke(qVar);
            }
        }
    }

    public final void N(@fg.m ld.l<? super androidx.compose.ui.unit.d, k2> lVar) {
        this.onDensityChanged = lVar;
    }

    public final void O(@fg.m ld.l<? super androidx.compose.ui.q, k2> lVar) {
        this.onModifierChanged = lVar;
    }

    public final void P(@fg.m ld.l<? super Boolean, k2> lVar) {
        this.onRequestDisallowInterceptTouchEvent = lVar;
    }

    protected final void Q(@fg.l ld.a<k2> aVar) {
        this.release = aVar;
    }

    protected final void R(@fg.l ld.a<k2> aVar) {
        this.reset = aVar;
    }

    public final void S(@fg.m InterfaceC1461e interfaceC1461e) {
        if (interfaceC1461e != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = interfaceC1461e;
            C1463g.b(this, interfaceC1461e);
        }
    }

    protected final void T(@fg.l ld.a<k2> aVar) {
        this.update = aVar;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    @Override // androidx.compose.runtime.r
    public void e() {
        this.release.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(@fg.m Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i4 = iArr[0];
        region.op(i4, iArr[1], getWidth() + i4, getHeight() + this.location[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @fg.l
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // android.view.View
    @fg.m
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup, androidx.core.view.b1
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @fg.m
    public ViewParent invalidateChildInParent(@fg.m int[] location, @fg.m Rect dirty) {
        super.invalidateChildInParent(location, dirty);
        G();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // androidx.compose.runtime.r
    public void k() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @fg.l
    /* renamed from: o, reason: from getter */
    public final androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }

    @Override // androidx.core.view.a1
    public void o0(@fg.l View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, @fg.l int[] consumed) {
        int i4;
        if (isNestedScrollingEnabled()) {
            androidx.compose.ui.input.nestedscroll.b bVar = this.dispatcher;
            float c5 = androidx.compose.ui.viewinterop.d.c(dxConsumed);
            float f4 = dyConsumed;
            float f5 = -1;
            long a5 = i0.g.a(c5, f4 * f5);
            long a6 = i0.g.a(dxUnconsumed * f5, dyUnconsumed * f5);
            i4 = androidx.compose.ui.viewinterop.d.i(type);
            long b5 = bVar.b(a5, a6, i4);
            consumed[0] = j2.f(i0.f.p(b5));
            consumed[1] = j2.f(i0.f.r(b5));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(@fg.l View child, @fg.l View target) {
        super.onDescendantInvalidated(child, target);
        G();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        D().a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l4, int t4, int r4, int b5) {
        this.view.layout(0, 0, r4 - l4, b5 - t4);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = widthMeasureSpec;
        this.lastHeightMeasureSpec = heightMeasureSpec;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onNestedFling(@fg.l View target, float velocityX, float velocityY, boolean consumed) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        kotlinx.coroutines.k.f(this.dispatcher.f(), null, null, new k(consumed, this, d0.a(androidx.compose.ui.viewinterop.d.d(velocityX), (-1.0f) * velocityY), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onNestedPreFling(@fg.l View target, float velocityX, float velocityY) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        kotlinx.coroutines.k.f(this.dispatcher.f(), null, null, new l(d0.a(androidx.compose.ui.viewinterop.d.d(velocityX), velocityY * (-1.0f)), null), 3, null);
        return false;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
    }

    @fg.m
    public final View p() {
        return this.view;
    }

    @fg.l
    /* renamed from: q, reason: from getter */
    public final h0 getLayoutNode() {
        return this.layoutNode;
    }

    @Override // androidx.core.view.z0
    public void q0(@fg.l View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        int i4;
        if (isNestedScrollingEnabled()) {
            androidx.compose.ui.input.nestedscroll.b bVar = this.dispatcher;
            float c5 = androidx.compose.ui.viewinterop.d.c(dxConsumed);
            float f4 = dyConsumed;
            float f5 = -1;
            long a5 = i0.g.a(c5, f4 * f5);
            long a6 = i0.g.a(dxUnconsumed * f5, dyUnconsumed * f5);
            i4 = androidx.compose.ui.viewinterop.d.i(type);
            bVar.b(a5, a6, i4);
        }
    }

    @Override // androidx.compose.runtime.r
    public void r() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        ld.l<? super Boolean, k2> lVar = this.onRequestDisallowInterceptTouchEvent;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(disallowIntercept));
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    @fg.m
    /* renamed from: s, reason: from getter */
    public final InterfaceC1423e0 getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @Override // androidx.core.view.z0
    public boolean s0(@fg.l View child, @fg.l View target, int axes, int type) {
        return ((axes & 2) == 0 && (axes & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @fg.l
    /* renamed from: t, reason: from getter */
    public final androidx.compose.ui.q getModifier() {
        return this.modifier;
    }

    @Override // androidx.core.view.z0
    public void u(@fg.l View child, @fg.l View target, int axes, int type) {
        this.nestedScrollingParentHelper.c(child, target, axes, type);
    }

    @fg.m
    public final ld.l<androidx.compose.ui.unit.d, k2> v() {
        return this.onDensityChanged;
    }

    @fg.m
    public final ld.l<androidx.compose.ui.q, k2> w() {
        return this.onModifierChanged;
    }

    @Override // androidx.core.view.z0
    public void x(@fg.l View target, int type) {
        this.nestedScrollingParentHelper.e(target, type);
    }

    @Override // androidx.core.view.z0
    public void y(@fg.l View target, int dx, int dy, @fg.l int[] consumed, int type) {
        int i4;
        if (isNestedScrollingEnabled()) {
            androidx.compose.ui.input.nestedscroll.b bVar = this.dispatcher;
            long a5 = i0.g.a(androidx.compose.ui.viewinterop.d.c(dx), dy * (-1));
            i4 = androidx.compose.ui.viewinterop.d.i(type);
            long d5 = bVar.d(a5, i4);
            consumed[0] = j2.f(i0.f.p(d5));
            consumed[1] = j2.f(i0.f.r(d5));
        }
    }

    @fg.m
    public final ld.l<Boolean, k2> z() {
        return this.onRequestDisallowInterceptTouchEvent;
    }
}
