package androidx.compose.material3.internal;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.animation.r;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.i;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.x;
import androidx.compose.runtime.z;
import androidx.compose.ui.graphics.q5;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.a6;
import androidx.compose.ui.t;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.s;
import androidx.compose.ui.unit.u;
import androidx.compose.ui.unit.w;
import androidx.compose.ui.window.o;
import androidx.view.C1442q1;
import androidx.view.C1446s1;
import androidx.view.C1463g;
import com.google.android.material.badge.BadgeDrawable;
import fg.l;
import fg.m;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import ld.p;

/* compiled from: ExposedDropdownMenuPopup.android.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010 \u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0005¢\u0006\u0004\b*\u0010\u001bJ\r\u0010+\u001a\u00020\u0005¢\u0006\u0004\b+\u0010\u001bJ\u0019\u0010-\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0005H\u0016¢\u0006\u0004\b2\u0010\u001bR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010G\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010\u0016R/\u0010P\u001a\u0004\u0018\u00010H2\b\u0010I\u001a\u0004\u0018\u00010H8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR5\u0010W\u001a\u0004\u0018\u00010Q2\b\u0010I\u001a\u0004\u0018\u00010Q8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bR\u0010K\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010_\u001a\u00020]8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b^\u0010 R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010e\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010bRA\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u001e2\u0011\u0010I\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u001e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bf\u0010K\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010k\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\u0018\u0010:\u001a\u0004\b7\u0010[R\u0014\u0010n\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006o"}, d2 = {"Landroidx/compose/material3/internal/c;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/a6;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lkotlin/Function0;", "Lkotlin/k2;", "onDismissRequest", "Landroid/view/View;", "composeView", "Landroidx/compose/ui/window/o;", "positionProvider", "", "isTouchExplorationEnabled", "Landroidx/compose/ui/unit/d;", "density", "Ljava/util/UUID;", "popupId", "<init>", "(Lld/a;Landroid/view/View;Landroidx/compose/ui/window/o;ZLandroidx/compose/ui/unit/d;Ljava/util/UUID;)V", "Landroidx/compose/ui/unit/w;", "layoutDirection", "L", "(Landroidx/compose/ui/unit/w;)V", "Landroid/view/WindowManager$LayoutParams;", "y", "()Landroid/view/WindowManager$LayoutParams;", "K", "()V", "Landroidx/compose/runtime/z;", "parent", "Landroidx/compose/runtime/i;", "content", "F", "(Landroidx/compose/runtime/z;Lld/p;)V", "e", "(Landroidx/compose/runtime/t;I)V", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "M", "(Lld/a;Landroidx/compose/ui/unit/w;)V", "N", "z", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "setLayoutDirection", "(I)V", "onGlobalLayout", "k", "Lld/a;", "l", "Landroid/view/View;", "m", "Landroidx/compose/ui/window/o;", "n", "Z", "Landroid/view/WindowManager;", "o", "Landroid/view/WindowManager;", "windowManager", "p", "Landroid/view/WindowManager$LayoutParams;", "params", "q", "Landroidx/compose/ui/unit/w;", "D", "()Landroidx/compose/ui/unit/w;", "I", "parentLayoutDirection", "Landroidx/compose/ui/unit/s;", "<set-?>", "r", "Landroidx/compose/runtime/k2;", "C", "()Landroidx/compose/ui/unit/s;", "H", "(Landroidx/compose/ui/unit/s;)V", "parentBounds", "Landroidx/compose/ui/unit/u;", "s", "E", "()Landroidx/compose/ui/unit/u;", "J", "(Landroidx/compose/ui/unit/u;)V", "popupContentSize", "t", "Landroidx/compose/runtime/b5;", "A", "()Z", "canCalculatePosition", "Landroidx/compose/ui/unit/h;", "u", "maxSupportedElevation", "Landroid/graphics/Rect;", "v", "Landroid/graphics/Rect;", "previousWindowVisibleFrame", "w", "tmpWindowVisibleFrame", "x", "B", "()Lld/p;", "G", "(Lld/p;)V", "shouldCreateCompositionOnAttachedToWindow", "c", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
@r1({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,436:1\n154#2:437\n1#3:438\n81#4:439\n107#4,2:440\n81#4:442\n107#4,2:443\n81#4:445\n81#4:446\n107#4,2:447\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/PopupLayout\n*L\n228#1:437\n220#1:439\n220#1:440,2\n221#1:442\n221#1:443,2\n224#1:445\n264#1:446\n264#1:447,2\n*E\n"})
/* loaded from: classes.dex */
final class c extends AbstractComposeView implements a6, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @m
    private ld.a<k2> onDismissRequest;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @l
    private final View composeView;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @l
    private final o positionProvider;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean isTouchExplorationEnabled;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @l
    private final WindowManager windowManager;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @l
    private final WindowManager.LayoutParams params;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @l
    private w parentLayoutDirection;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @l
    private final androidx.compose.runtime.k2 parentBounds;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @l
    private final androidx.compose.runtime.k2 popupContentSize;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @l
    private final b5 canCalculatePosition;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final float maxSupportedElevation;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @l
    private final Rect previousWindowVisibleFrame;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @l
    private final Rect tmpWindowVisibleFrame;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @l
    private final androidx.compose.runtime.k2 content;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/material3/internal/c$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "result", "Lkotlin/k2;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(@l View view, @l Outline result) {
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(0.0f);
        }
    }

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends n0 implements p<t, Integer, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11719c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i4) {
            super(2);
            this.f11719c = i4;
        }

        public final void a(@m t tVar, int i4) {
            c.this.e(tVar, g3.b(this.f11719c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.internal.c$c, reason: collision with other inner class name */
    public /* synthetic */ class C0256c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11720a;

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
            f11720a = iArr;
        }
    }

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.a<Boolean> {
        d() {
            super(0);
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf((c.this.C() == null || c.this.E() == null) ? false : true);
        }
    }

    public c(@m ld.a<k2> aVar, @l View view, @l o oVar, boolean z4, @l androidx.compose.ui.unit.d dVar, @l UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        androidx.compose.runtime.k2 g4;
        androidx.compose.runtime.k2 g5;
        androidx.compose.runtime.k2 g6;
        this.onDismissRequest = aVar;
        this.composeView = view;
        this.positionProvider = oVar;
        this.isTouchExplorationEnabled = z4;
        Object systemService = view.getContext().getSystemService("window");
        l0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        this.params = y();
        this.parentLayoutDirection = w.Ltr;
        g4 = t4.g(null, null, 2, null);
        this.parentBounds = g4;
        g5 = t4.g(null, null, 2, null);
        this.popupContentSize = g5;
        this.canCalculatePosition = o4.e(new d());
        float g7 = h.g(8);
        this.maxSupportedElevation = g7;
        this.previousWindowVisibleFrame = new Rect();
        this.tmpWindowVisibleFrame = new Rect();
        setId(R.id.content);
        C1442q1.b(this, C1442q1.a(view));
        C1446s1.b(this, C1446s1.a(view));
        C1463g.b(this, C1463g.a(view));
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setTag(t.b.H, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.v5(g7));
        setOutlineProvider(new a());
        androidx.compose.material3.internal.a.f11674a.getClass();
        g6 = t4.g(androidx.compose.material3.internal.a.f11675b, null, 2, null);
        this.content = g6;
    }

    private final p<androidx.compose.runtime.t, Integer, k2> B() {
        return (p) this.content.getValue();
    }

    private final void G(p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar) {
        this.content.setValue(pVar);
    }

    private final void L(w layoutDirection) {
        int i4 = C0256c.f11720a[layoutDirection.ordinal()];
        int i5 = 1;
        if (i4 == 1) {
            i5 = 0;
        } else if (i4 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i5);
    }

    private final WindowManager.LayoutParams y() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = BadgeDrawable.f52614s;
        layoutParams.flags = 393248;
        layoutParams.flags = this.isTouchExplorationEnabled ? 393248 & (-33) : 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(t.c.f20447d));
        return layoutParams;
    }

    public final boolean A() {
        return ((Boolean) this.canCalculatePosition.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    public final s C() {
        return (s) this.parentBounds.getValue();
    }

    @l
    /* renamed from: D, reason: from getter */
    public final w getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    public final u E() {
        return (u) this.popupContentSize.getValue();
    }

    public final void F(@l z parent, @l p<? super androidx.compose.runtime.t, ? super Integer, k2> content) {
        t(parent);
        G(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public final void H(@m s sVar) {
        this.parentBounds.setValue(sVar);
    }

    public final void I(@l w wVar) {
        this.parentLayoutDirection = wVar;
    }

    public final void J(@m u uVar) {
        this.popupContentSize.setValue(uVar);
    }

    public final void K() {
        this.windowManager.addView(this, this.params);
    }

    public final void M(@m ld.a<k2> onDismissRequest, @l w layoutDirection) {
        this.onDismissRequest = onDismissRequest;
        L(layoutDirection);
    }

    public final void N() {
        u E;
        s C = C();
        if (C == null || (E = E()) == null) {
            return;
        }
        long packedValue = E.getPackedValue();
        Rect rect = this.previousWindowVisibleFrame;
        this.composeView.getWindowVisibleDisplayFrame(rect);
        long a5 = this.positionProvider.a(C, q5.d(rect).z(), this.parentLayoutDirection, packedValue);
        this.params.x = q.m(a5);
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.y = (int) (a5 & 4294967295L);
        this.windowManager.updateViewLayout(this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.a6
    @l
    public AbstractComposeView c() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@l KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (event.getKeyCode() == 4) {
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
                ld.a<k2> aVar = this.onDismissRequest;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @i
    public void e(@m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-1284481754);
        if ((i4 & 6) == 0) {
            i5 = (o4.S(this) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) == 2 && o4.p()) {
            o4.d0();
        } else {
            if (x.b0()) {
                x.r0(-1284481754, i5, -1, "androidx.compose.material3.internal.PopupLayout.Content (ExposedDropdownMenuPopup.android.kt:279)");
            }
            if (r.a(0, B(), o4)) {
                x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new b(i4));
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* renamed from: m, reason: from getter */
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.composeView.getWindowVisibleDisplayFrame(this.tmpWindowVisibleFrame);
        if (l0.g(this.tmpWindowVisibleFrame, this.previousWindowVisibleFrame)) {
            return;
        }
        N();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@m MotionEvent event) {
        if (event == null) {
            return super.onTouchEvent(event);
        }
        if (event.getAction() == 4 || (event.getAction() == 0 && (event.getX() < 0.0f || event.getX() >= getWidth() || event.getY() < 0.0f || event.getY() >= getHeight()))) {
            boolean z4 = event.getRawX() == 0.0f && event.getRawY() == 0.0f;
            if (C() == null || !z4) {
                ld.a<k2> aVar = this.onDismissRequest;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.onTouchEvent(event);
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }

    public final void z() {
        C1442q1.b(this, null);
        this.composeView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.windowManager.removeViewImmediate(this);
    }
}
