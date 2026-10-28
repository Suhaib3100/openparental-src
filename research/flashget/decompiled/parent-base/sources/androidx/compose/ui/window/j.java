package androidx.compose.ui.window;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.annotation.m1;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.snapshots.g0;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.x;
import androidx.compose.runtime.z;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.a6;
import androidx.compose.ui.t;
import androidx.compose.ui.unit.s;
import androidx.compose.ui.unit.w;
import androidx.view.C1442q1;
import androidx.view.C1446s1;
import androidx.view.C1463g;
import com.google.android.material.badge.BadgeDrawable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: AndroidPopup.android.kt */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\n\b\u0001\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u0002:\u0002£\u0001BQ\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u0019J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J(\u00101\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-2\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b/¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0004H\u0017¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0004H\u0014¢\u0006\u0004\b5\u0010,J\u000f\u00106\u001a\u00020\u0004H\u0014¢\u0006\u0004\b6\u0010,J\u001f\u00109\u001a\u00020\u00042\u0006\u00107\u001a\u00020 2\u0006\u00108\u001a\u00020 H\u0010¢\u0006\u0004\b9\u0010:J7\u0010@\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00162\u0006\u0010<\u001a\u00020 2\u0006\u0010=\u001a\u00020 2\u0006\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020 H\u0010¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u00162\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ5\u0010F\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\bF\u0010GJ\u0015\u0010J\u001a\u00020\u00042\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\u0004¢\u0006\u0004\bL\u0010,J\u000f\u0010M\u001a\u00020\u0004H\u0001¢\u0006\u0004\bM\u0010,J\r\u0010N\u001a\u00020\u0004¢\u0006\u0004\bN\u0010,J\r\u0010O\u001a\u00020\u0004¢\u0006\u0004\bO\u0010,J\u0019\u0010Q\u001a\u00020\u00162\b\u0010C\u001a\u0004\u0018\u00010PH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00042\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\bS\u0010#R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010cR \u0010h\u001a\u00020(8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b9\u0010e\u0012\u0004\bg\u0010,\u001a\u0004\bf\u0010*R\"\u0010o\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010u\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010'R5\u0010~\u001a\u0004\u0018\u00010v2\b\u0010w\u001a\u0004\u0018\u00010v8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R2\u0010I\u001a\u0004\u0018\u00010H2\b\u0010w\u001a\u0004\u0018\u00010H8B@BX\u0082\u008e\u0002¢\u0006\u0015\n\u0004\b\u007f\u0010y\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0005\b\u0082\u0001\u0010KR\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010\u008b\u0001\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001e\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0017\u0010\u0096\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010\u0095\u0001RE\u00100\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b/2\u0011\u0010w\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b/8B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0004\b)\u0010y\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R&\u0010\u009b\u0001\u001a\u00020\u00162\u0006\u0010w\u001a\u00020\u00168\u0014@RX\u0094\u000e¢\u0006\r\n\u0004\bO\u0010&\u001a\u0005\bX\u0010\u008a\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u009d\u0001R\u0017\u0010 \u0001\u001a\u00020 8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u009f\u0001R\u0017\u0010¢\u0001\u001a\u00020 8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010\u009f\u0001R\u0017\u0010¥\u0001\u001a\u00020\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¦\u0001"}, d2 = {"Landroidx/compose/ui/window/j;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/a6;", "Lkotlin/Function0;", "Lkotlin/k2;", "onDismissRequest", "Landroidx/compose/ui/window/p;", "properties", "", "testTag", "Landroid/view/View;", "composeView", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/window/o;", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "Landroidx/compose/ui/window/l;", "popupLayoutHelper", "<init>", "(Lld/a;Landroidx/compose/ui/window/p;Ljava/lang/String;Landroid/view/View;Landroidx/compose/ui/unit/d;Landroidx/compose/ui/window/o;Ljava/util/UUID;Landroidx/compose/ui/window/l;)V", "", "isFocusable", "R", "(Z)V", "Landroidx/compose/ui/window/q;", "securePolicy", "W", "(Landroidx/compose/ui/window/q;)V", "clippingEnabled", "O", "", "flags", "z", "(I)V", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Z", "(Landroidx/compose/ui/unit/w;)V", "Landroid/view/WindowManager$LayoutParams;", "A", "()Landroid/view/WindowManager$LayoutParams;", "Y", "()V", "Landroidx/compose/runtime/z;", "parent", "Landroidx/compose/runtime/i;", "content", "P", "(Landroidx/compose/runtime/z;Lld/p;)V", "e", "(Landroidx/compose/runtime/t;I)V", "onAttachedToWindow", "onDetachedFromWindow", "widthMeasureSpec", "heightMeasureSpec", "q", "(II)V", "changed", "left", "top", "right", "bottom", "p", "(ZIIII)V", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "a0", "(Lld/a;Landroidx/compose/ui/window/p;Ljava/lang/String;Landroidx/compose/ui/unit/w;)V", "Landroidx/compose/ui/layout/u;", "parentLayoutCoordinates", "c0", "(Landroidx/compose/ui/layout/u;)V", "N", "b0", "d0", "B", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "setLayoutDirection", "k", "Lld/a;", "l", "Landroidx/compose/ui/window/p;", "m", "Ljava/lang/String;", "M", "()Ljava/lang/String;", "X", "(Ljava/lang/String;)V", "n", "Landroid/view/View;", "o", "Landroidx/compose/ui/window/l;", "Landroid/view/WindowManager;", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager$LayoutParams;", "G", "H", "params", "r", "Landroidx/compose/ui/window/o;", "L", "()Landroidx/compose/ui/window/o;", "V", "(Landroidx/compose/ui/window/o;)V", "positionProvider", "s", "Landroidx/compose/ui/unit/w;", "J", "()Landroidx/compose/ui/unit/w;", "T", "parentLayoutDirection", "Landroidx/compose/ui/unit/u;", "<set-?>", "t", "Landroidx/compose/runtime/k2;", "K", "()Landroidx/compose/ui/unit/u;", "U", "(Landroidx/compose/ui/unit/u;)V", "popupContentSize", "u", "I", "()Landroidx/compose/ui/layout/u;", "S", "Landroidx/compose/ui/unit/s;", "v", "Landroidx/compose/ui/unit/s;", "parentBounds", "w", "Landroidx/compose/runtime/b5;", "C", "()Z", "canCalculatePosition", "Landroidx/compose/ui/unit/h;", "x", "F", "maxSupportedElevation", "Landroid/graphics/Rect;", "y", "Landroid/graphics/Rect;", "previousWindowVisibleFrame", "Landroidx/compose/runtime/snapshots/g0;", "Landroidx/compose/runtime/snapshots/g0;", "snapshotStateObserver", "D", "()Lld/p;", "Q", "(Lld/p;)V", "shouldCreateCompositionOnAttachedToWindow", "", "[I", "locationOnScreen", "()I", "displayWidth", "E", "displayHeight", "c", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
@u(parameters = 0)
@r1({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,867:1\n154#2:868\n1#3:869\n81#4:870\n107#4,2:871\n81#4:873\n107#4,2:874\n81#4:876\n81#4:877\n107#4,2:878\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n*L\n415#1:868\n404#1:870\n404#1:871,2\n405#1:873\n405#1:874,2\n409#1:876\n459#1:877\n459#1:878,2\n*E\n"})
/* loaded from: classes.dex */
public final class j extends AbstractComposeView implements a6 {
    public static final int E = 8;

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private final k2 content;

    /* renamed from: B, reason: from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* renamed from: C, reason: from kotlin metadata */
    @fg.l
    private final int[] locationOnScreen;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.a<kotlin.k2> onDismissRequest;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private p properties;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private String testTag;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final View composeView;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l popupLayoutHelper;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final WindowManager windowManager;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final WindowManager.LayoutParams params;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private o positionProvider;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private w parentLayoutDirection;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 popupContentSize;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 parentLayoutCoordinates;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private s parentBounds;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5 canCalculatePosition;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final float maxSupportedElevation;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Rect previousWindowVisibleFrame;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final g0 snapshotStateObserver;

    @fg.l
    private static final c D = new c();

    @fg.l
    private static final ld.l<j, kotlin.k2> F = b.f21747b;

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/window/j$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "result", "Lkotlin/k2;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(@fg.l View view, @fg.l Outline result) {
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(0.0f);
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/window/j;", "popupLayout", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/window/j;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<j, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f21747b = new b(1);

        b() {
            super(1);
        }

        public final void a(@fg.l j jVar) {
            if (jVar.isAttachedToWindow()) {
                jVar.d0();
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(j jVar) {
            a(jVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/window/j$c;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/window/j;", "Lkotlin/k2;", "onCommitAffectingPopupPosition", "Lld/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c {
        private c() {
        }

        public c(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends n0 implements ld.p<t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21749c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i4) {
            super(2);
            this.f21749c = i4;
        }

        public final void a(@fg.m t tVar, int i4) {
            j.this.e(tVar, g3.b(this.f21749c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21750a;

        static {
            int[] iArr = new int[w.values().length];
            try {
                iArr[w.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21750a = iArr;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class f extends n0 implements ld.a<Boolean> {
        f() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf((j.this.I() == null || j.this.K() == null) ? false : true);
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "command", "b", "(Lld/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends n0 implements ld.l<ld.a<? extends kotlin.k2>, kotlin.k2> {
        g() {
            super(1);
        }

        public static void a(ld.a aVar) {
            aVar.invoke();
        }

        private static final void c(ld.a aVar) {
            aVar.invoke();
        }

        public final void b(@fg.l final ld.a<kotlin.k2> aVar) {
            Handler handler = j.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                aVar.invoke();
                return;
            }
            Handler handler2 = j.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.window.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ld.a.this.invoke();
                    }
                });
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(ld.a<? extends kotlin.k2> aVar) {
            b(aVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class h extends n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.g f21753b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f21754c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ s f21755d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f21756e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f21757f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(k1.g gVar, j jVar, s sVar, long j4, long j5) {
            super(0);
            this.f21753b = gVar;
            this.f21754c = jVar;
            this.f21755d = sVar;
            this.f21756e = j4;
            this.f21757f = j5;
        }

        public final void a() {
            this.f21753b.f75328b = this.f21754c.getPositionProvider().a(this.f21755d, this.f21756e, this.f21754c.getParentLayoutDirection(), this.f21757f);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(ld.a r11, androidx.compose.ui.window.p r12, java.lang.String r13, android.view.View r14, androidx.compose.ui.unit.d r15, androidx.compose.ui.window.o r16, java.util.UUID r17, androidx.compose.ui.window.l r18, int r19, kotlin.jvm.internal.w r20) {
        /*
            r10 = this;
            r0 = r19
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L19
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L12
            androidx.compose.ui.window.m r0 = new androidx.compose.ui.window.m
            r0.<init>()
            goto L17
        L12:
            androidx.compose.ui.window.n r0 = new androidx.compose.ui.window.n
            r0.<init>()
        L17:
            r9 = r0
            goto L1b
        L19:
            r9 = r18
        L1b:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.j.<init>(ld.a, androidx.compose.ui.window.p, java.lang.String, android.view.View, androidx.compose.ui.unit.d, androidx.compose.ui.window.o, java.util.UUID, androidx.compose.ui.window.l, int, kotlin.jvm.internal.w):void");
    }

    private final WindowManager.LayoutParams A() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = BadgeDrawable.f52614s;
        layoutParams.flags = (layoutParams.flags & (-8552473)) | 262144;
        layoutParams.type = 1002;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(t.c.f20447d));
        return layoutParams;
    }

    private final ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> D() {
        return (ld.p) this.content.getValue();
    }

    private final int E() {
        return kotlin.math.b.L0(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int F() {
        return kotlin.math.b.L0(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    @m1
    public static /* synthetic */ void H() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.layout.u I() {
        return (androidx.compose.ui.layout.u) this.parentLayoutCoordinates.getValue();
    }

    private final void O(boolean clippingEnabled) {
        z(clippingEnabled ? this.params.flags & (-513) : this.params.flags | 512);
    }

    private final void Q(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
        this.content.setValue(pVar);
    }

    private final void R(boolean isFocusable) {
        z(!isFocusable ? this.params.flags | 8 : this.params.flags & (-9));
    }

    private final void S(androidx.compose.ui.layout.u uVar) {
        this.parentLayoutCoordinates.setValue(uVar);
    }

    private final void W(q securePolicy) {
        z(r.a(securePolicy, androidx.compose.ui.window.c.i(this.composeView)) ? this.params.flags | 8192 : this.params.flags & (-8193));
    }

    private final void Z(w layoutDirection) {
        int i4 = e.f21750a[layoutDirection.ordinal()];
        int i5 = 1;
        if (i4 == 1) {
            i5 = 0;
        } else if (i4 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i5);
    }

    private final void z(int flags) {
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.flags = flags;
        this.popupLayoutHelper.b(this.windowManager, this, layoutParams);
    }

    public final void B() {
        C1442q1.b(this, null);
        this.windowManager.removeViewImmediate(this);
    }

    public final boolean C() {
        return ((Boolean) this.canCalculatePosition.getValue()).booleanValue();
    }

    @fg.l
    /* renamed from: G, reason: from getter */
    public final WindowManager.LayoutParams getParams() {
        return this.params;
    }

    @fg.l
    /* renamed from: J, reason: from getter */
    public final w getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    public final androidx.compose.ui.unit.u K() {
        return (androidx.compose.ui.unit.u) this.popupContentSize.getValue();
    }

    @fg.l
    /* renamed from: L, reason: from getter */
    public final o getPositionProvider() {
        return this.positionProvider;
    }

    @fg.l
    /* renamed from: M, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    public final void N() {
        int[] iArr = this.locationOnScreen;
        int i4 = iArr[0];
        int i5 = iArr[1];
        this.composeView.getLocationOnScreen(iArr);
        int[] iArr2 = this.locationOnScreen;
        if (i4 == iArr2[0] && i5 == iArr2[1]) {
            return;
        }
        b0();
    }

    public final void P(@fg.l z parent, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> content) {
        t(parent);
        Q(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public final void T(@fg.l w wVar) {
        this.parentLayoutDirection = wVar;
    }

    public final void U(@fg.m androidx.compose.ui.unit.u uVar) {
        this.popupContentSize.setValue(uVar);
    }

    public final void V(@fg.l o oVar) {
        this.positionProvider = oVar;
    }

    public final void X(@fg.l String str) {
        this.testTag = str;
    }

    public final void Y() {
        this.windowManager.addView(this, this.params);
    }

    public final void a0(@fg.m ld.a<kotlin.k2> onDismissRequest, @fg.l p properties, @fg.l String testTag, @fg.l w layoutDirection) {
        this.onDismissRequest = onDismissRequest;
        if (properties.getUsePlatformDefaultWidth() && !this.properties.getUsePlatformDefaultWidth()) {
            WindowManager.LayoutParams layoutParams = this.params;
            layoutParams.width = -2;
            layoutParams.height = -2;
            this.popupLayoutHelper.b(this.windowManager, this, layoutParams);
        }
        this.properties = properties;
        this.testTag = testTag;
        R(properties.getFocusable());
        W(properties.getSecurePolicy());
        O(properties.getClippingEnabled());
        Z(layoutDirection);
    }

    @m1
    public final void b0() {
        androidx.compose.ui.layout.u I = I();
        if (I == null) {
            return;
        }
        long c5 = I.c();
        long g4 = v.g(I);
        s b5 = androidx.compose.ui.unit.t.b(androidx.compose.ui.unit.r.a(kotlin.math.b.L0(i0.f.p(g4)), kotlin.math.b.L0(i0.f.r(g4))), c5);
        if (l0.g(b5, this.parentBounds)) {
            return;
        }
        this.parentBounds = b5;
        d0();
    }

    @Override // androidx.compose.ui.platform.a6
    @fg.l
    public AbstractComposeView c() {
        return this;
    }

    public final void c0(@fg.l androidx.compose.ui.layout.u parentLayoutCoordinates) {
        S(parentLayoutCoordinates);
        b0();
    }

    public final void d0() {
        androidx.compose.ui.unit.u K;
        s l4;
        s sVar = this.parentBounds;
        if (sVar == null || (K = K()) == null) {
            return;
        }
        long packedValue = K.getPackedValue();
        Rect rect = this.previousWindowVisibleFrame;
        this.popupLayoutHelper.a(this.composeView, rect);
        l4 = androidx.compose.ui.window.c.l(rect);
        long a5 = androidx.compose.ui.unit.v.a(l4.G(), l4.r());
        k1.g gVar = new k1.g();
        androidx.compose.ui.unit.q.INSTANCE.getClass();
        gVar.f75328b = androidx.compose.ui.unit.q.f21519c;
        this.snapshotStateObserver.q(this, F, new h(gVar, this, sVar, a5, packedValue));
        WindowManager.LayoutParams layoutParams = this.params;
        long j4 = gVar.f75328b;
        layoutParams.x = (int) (j4 >> 32);
        layoutParams.y = (int) (j4 & 4294967295L);
        if (this.properties.getExcludeFromSystemGesture()) {
            this.popupLayoutHelper.c(this, (int) (a5 >> 32), (int) (a5 & 4294967295L));
        }
        this.popupLayoutHelper.b(this.windowManager, this, this.params);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@fg.l KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (event.getKeyCode() == 4 && this.properties.getDismissOnBackPress()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            }
            if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                ld.a<kotlin.k2> aVar = this.onDismissRequest;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @androidx.compose.ui.v
    @androidx.compose.runtime.i
    public void e(@fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.t o4 = tVar.o(-857613600);
        if (x.b0()) {
            x.r0(-857613600, i4, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:475)");
        }
        if (androidx.compose.animation.r.a(0, D(), o4)) {
            x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new d(i4));
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* renamed from: m, reason: from getter */
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotStateObserver.v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.snapshotStateObserver.w();
        this.snapshotStateObserver.j();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@fg.m MotionEvent event) {
        if (!this.properties.getDismissOnClickOutside()) {
            return super.onTouchEvent(event);
        }
        if (event != null && event.getAction() == 0 && (event.getX() < 0.0f || event.getX() >= getWidth() || event.getY() < 0.0f || event.getY() >= getHeight())) {
            ld.a<kotlin.k2> aVar = this.onDismissRequest;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (event == null || event.getAction() != 4) {
            return super.onTouchEvent(event);
        }
        ld.a<kotlin.k2> aVar2 = this.onDismissRequest;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void p(boolean changed, int left, int top2, int right, int bottom) {
        View childAt;
        super.p(changed, left, top2, right, bottom);
        if (this.properties.getUsePlatformDefaultWidth() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.params.width = childAt.getMeasuredWidth();
        this.params.height = childAt.getMeasuredHeight();
        this.popupLayoutHelper.b(this.windowManager, this, this.params);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void q(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.properties.getUsePlatformDefaultWidth()) {
            super.q(widthMeasureSpec, heightMeasureSpec);
        } else {
            super.q(View.MeasureSpec.makeMeasureSpec(F(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(E(), Integer.MIN_VALUE));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }

    public j(@fg.m ld.a<kotlin.k2> aVar, @fg.l p pVar, @fg.l String str, @fg.l View view, @fg.l androidx.compose.ui.unit.d dVar, @fg.l o oVar, @fg.l UUID uuid, @fg.l l lVar) {
        super(view.getContext(), null, 0, 6, null);
        k2 g4;
        k2 g5;
        k2 g6;
        this.onDismissRequest = aVar;
        this.properties = pVar;
        this.testTag = str;
        this.composeView = view;
        this.popupLayoutHelper = lVar;
        Object systemService = view.getContext().getSystemService("window");
        l0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        this.params = A();
        this.positionProvider = oVar;
        this.parentLayoutDirection = w.Ltr;
        g4 = t4.g(null, null, 2, null);
        this.popupContentSize = g4;
        g5 = t4.g(null, null, 2, null);
        this.parentLayoutCoordinates = g5;
        this.canCalculatePosition = o4.e(new f());
        float g7 = androidx.compose.ui.unit.h.g(8);
        this.maxSupportedElevation = g7;
        this.previousWindowVisibleFrame = new Rect();
        this.snapshotStateObserver = new g0(new g());
        setId(R.id.content);
        C1442q1.b(this, C1442q1.a(view));
        C1446s1.b(this, C1446s1.a(view));
        C1463g.b(this, C1463g.a(view));
        setTag(t.b.H, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.v5(g7));
        setOutlineProvider(new a());
        androidx.compose.ui.window.e.f21708a.getClass();
        g6 = t4.g(androidx.compose.ui.window.e.f21709b, null, 2, null);
        this.content = g6;
        this.locationOnScreen = new int[2];
    }
}
