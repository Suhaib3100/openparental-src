package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.i4;
import androidx.compose.ui.graphics.p6;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* compiled from: ViewLayer.android.kt */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0000\u0018\u0000 |2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002<$B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J'\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020&H\u0016ø\u0001\u0000¢\u0006\u0004\b'\u0010%J\u0017\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\n2\u0006\u0010(\u001a\u00020+H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\nH\u0016¢\u0006\u0004\b.\u0010\u0011J7\u00105\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u001b2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u0002002\u0006\u00104\u001a\u000200H\u0014¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\b7\u0010\u0011J\u000f\u00108\u001a\u00020\nH\u0016¢\u0006\u0004\b8\u0010\u0011J\u000f\u00109\u001a\u00020\nH\u0016¢\u0006\u0004\b9\u0010\u0011J\"\u0010<\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u001f\u0010@\u001a\u00020\n2\u0006\u0010?\u001a\u00020>2\u0006\u0010;\u001a\u00020\u001bH\u0016¢\u0006\u0004\b@\u0010AJ1\u00104\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016¢\u0006\u0004\b4\u0010BJ\u001a\u0010E\u001a\u00020\n2\u0006\u0010D\u001a\u00020CH\u0016ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\u001a\u00101\u001a\u00020\n2\u0006\u0010D\u001a\u00020CH\u0016ø\u0001\u0000¢\u0006\u0004\b1\u0010FR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u0010J\u001a\u0004\bK\u0010LR$\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010MR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010TR\u0018\u0010X\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010WR*\u0010]\u001a\u00020\u001b2\u0006\u0010Y\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010T\u001a\u0004\bZ\u0010\u001d\"\u0004\b[\u0010\\R\u0016\u0010^\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010TR\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00010c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010dR\u001c\u0010h\u001a\u00020f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u0010gR\u0016\u0010i\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010TR\u001a\u0010m\u001a\u00020j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010g\u001a\u0004\bQ\u0010lR\u0016\u0010p\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010t\u001a\u0004\u0018\u00010q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0014\u0010u\u001a\u00020j8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010lR$\u0010{\u001a\u00020v2\u0006\u0010Y\u001a\u00020v8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bw\u0010x\"\u0004\by\u0010z\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006}"}, d2 = {"Landroidx/compose/ui/platform/t5;", "Landroid/view/View;", "Landroidx/compose/ui/node/o1;", "Landroidx/compose/ui/layout/l;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/q1;", "container", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/v1;", "Lkotlin/k2;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/q1;Lld/l;Lld/a;)V", "G", "()V", "D", "Landroidx/compose/ui/graphics/z5;", "scope", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/unit/d;", "density", "h", "(Landroidx/compose/ui/graphics/z5;Landroidx/compose/ui/unit/w;Landroidx/compose/ui/unit/d;)V", "", "hasOverlappingRendering", "()Z", "Li0/f;", "position", "i", "(J)Z", "Landroidx/compose/ui/unit/u;", "size", "d", "(J)V", "Landroidx/compose/ui/unit/q;", "m", "canvas", "g", "(Landroidx/compose/ui/graphics/v1;)V", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "invalidate", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "destroy", "n", "forceLayout", "point", "inverse", "c", "(JZ)J", "Li0/d;", "rect", "j", "(Li0/d;Z)V", "(Lld/l;Lld/a;)V", "Landroidx/compose/ui/graphics/y4;", "matrix", "a", "([F)V", "Landroidx/compose/ui/platform/AndroidComposeView;", "B", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/q1;", "z", "()Landroidx/compose/ui/platform/q1;", "Lld/l;", "e", "Lld/a;", "Landroidx/compose/ui/platform/k2;", "f", "Landroidx/compose/ui/platform/k2;", "outlineResolver", "Z", "clipToBounds", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "clipBoundsCache", "value", "C", "F", "(Z)V", "isInvalidated", "drawnWithZ", "Landroidx/compose/ui/graphics/w1;", "k", "Landroidx/compose/ui/graphics/w1;", "canvasHolder", "Landroidx/compose/ui/platform/e2;", "Landroidx/compose/ui/platform/e2;", "matrixCache", "Landroidx/compose/ui/graphics/p6;", "J", "mTransformOrigin", "mHasOverlappingRendering", "", "o", "()J", "layerId", "p", "I", "mutatedFields", "Landroidx/compose/ui/graphics/g5;", "A", "()Landroidx/compose/ui/graphics/g5;", "manualClipPath", "ownerViewId", "", "y", "()F", "E", "(F)V", "cameraDistancePx", "q", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,505:1\n47#2,5:506\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n*L\n318#1:506,5\n*E\n"})
/* loaded from: classes.dex */
public final class t5 extends View implements androidx.compose.ui.node.o1, androidx.compose.ui.layout.l {

    /* renamed from: r, reason: collision with root package name */
    public static final int f20142r = 8;

    /* renamed from: u, reason: collision with root package name */
    @fg.m
    private static Method f20145u;

    /* renamed from: v, reason: collision with root package name */
    @fg.m
    private static Field f20146v;

    /* renamed from: w, reason: collision with root package name */
    private static boolean f20147w;

    /* renamed from: x, reason: collision with root package name */
    private static boolean f20148x;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AndroidComposeView ownerView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q1 container;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super androidx.compose.ui.graphics.v1, kotlin.k2> drawBlock;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.a<kotlin.k2> invalidateParentLayer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 outlineResolver;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Rect clipBoundsCache;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidated;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean drawnWithZ;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.graphics.w1 canvasHolder;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e2<View> matrixCache;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long mTransformOrigin;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean mHasOverlappingRendering;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long layerId;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: s, reason: collision with root package name */
    @fg.l
    private static final ld.p<View, Matrix, kotlin.k2> f20143s = b.f20164b;

    /* renamed from: t, reason: collision with root package name */
    @fg.l
    private static final ViewOutlineProvider f20144t = new a();

    /* compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/t5$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "Lkotlin/k2;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(@fg.l View view, @fg.l Outline outline) {
            kotlin.jvm.internal.l0.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline d5 = ((t5) view).outlineResolver.d();
            kotlin.jvm.internal.l0.m(d5);
            outline.set(d5);
        }
    }

    /* compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "view", "Landroid/graphics/Matrix;", "matrix", "Lkotlin/k2;", "a", "(Landroid/view/View;Landroid/graphics/Matrix;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<View, Matrix, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f20164b = new b(2);

        b() {
            super(2);
        }

        public final void a(@fg.l View view, @fg.l Matrix matrix) {
            matrix.set(view.getMatrix());
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(View view, Matrix matrix) {
            a(view, matrix);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R*\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013\"\u0004\b\u0016\u0010\u0017R&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/compose/ui/platform/t5$c;", "", "<init>", "()V", "Landroid/view/View;", "view", "Lkotlin/k2;", "e", "(Landroid/view/View;)V", "Landroid/view/ViewOutlineProvider;", "OutlineProvider", "Landroid/view/ViewOutlineProvider;", "b", "()Landroid/view/ViewOutlineProvider;", "", "<set-?>", "hasRetrievedMethod", "Z", "a", "()Z", "shouldUseDispatchDraw", "c", "d", "(Z)V", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "getMatrix", "Lld/p;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,505:1\n26#2:506\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n*L\n460#1:506\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.t5$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final boolean a() {
            return t5.f20147w;
        }

        @fg.l
        public final ViewOutlineProvider b() {
            return t5.f20144t;
        }

        public final boolean c() {
            return t5.f20148x;
        }

        public final void d(boolean z4) {
            t5.f20148x = z4;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void e(@fg.l View view) {
            try {
                if (!t5.f20147w) {
                    t5.f20147w = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        t5.f20145u = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        t5.f20146v = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        t5.f20145u = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        t5.f20146v = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = t5.f20145u;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = t5.f20146v;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = t5.f20146v;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = t5.f20145u;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                t5.f20148x = true;
            }
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/t5$d;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(29)
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final d f20165a = new d();

        private d() {
        }

        @androidx.annotation.u
        @kd.n
        public static final long a(@fg.l View view) {
            long uniqueDrawingId;
            uniqueDrawingId = view.getUniqueDrawingId();
            return uniqueDrawingId;
        }
    }

    public t5(@fg.l AndroidComposeView androidComposeView, @fg.l q1 q1Var, @fg.l ld.l<? super androidx.compose.ui.graphics.v1, kotlin.k2> lVar, @fg.l ld.a<kotlin.k2> aVar) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = q1Var;
        this.drawBlock = lVar;
        this.invalidateParentLayer = aVar;
        this.outlineResolver = new k2(androidComposeView.getDensity());
        this.canvasHolder = new androidx.compose.ui.graphics.w1();
        this.matrixCache = new e2<>(f20143s);
        p6.INSTANCE.getClass();
        this.mTransformOrigin = p6.f17986c;
        this.mHasOverlappingRendering = true;
        setWillNotDraw(false);
        q1Var.addView(this);
        this.layerId = View.generateViewId();
    }

    private final androidx.compose.ui.graphics.g5 A() {
        if (!getClipToOutline() || this.outlineResolver.e()) {
            return null;
        }
        return this.outlineResolver.c();
    }

    private final void D() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                kotlin.jvm.internal.l0.m(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void F(boolean z4) {
        if (z4 != this.isInvalidated) {
            this.isInvalidated = z4;
            this.ownerView.i1(this, z4);
        }
    }

    private final void G() {
        setOutlineProvider(this.outlineResolver.d() != null ? f20144t : null);
    }

    @fg.l
    /* renamed from: B, reason: from getter */
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    /* renamed from: C, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    public final void E(float f4) {
        setCameraDistance(f4 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.node.o1
    public void a(@fg.l float[] matrix) {
        androidx.compose.ui.graphics.y4.u(matrix, this.matrixCache.b(this));
    }

    @Override // androidx.compose.ui.node.o1
    public void b(@fg.l ld.l<? super androidx.compose.ui.graphics.v1, kotlin.k2> drawBlock, @fg.l ld.a<kotlin.k2> invalidateParentLayer) {
        this.container.addView(this);
        this.clipToBounds = false;
        this.drawnWithZ = false;
        p6.INSTANCE.getClass();
        this.mTransformOrigin = p6.f17986c;
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
    }

    @Override // androidx.compose.ui.node.o1
    public long c(long point, boolean inverse) {
        if (!inverse) {
            return androidx.compose.ui.graphics.y4.j(this.matrixCache.b(this), point);
        }
        float[] a5 = this.matrixCache.a(this);
        if (a5 != null) {
            return androidx.compose.ui.graphics.y4.j(a5, point);
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74148d;
    }

    @Override // androidx.compose.ui.node.o1
    public void d(long size) {
        int m4 = androidx.compose.ui.unit.u.m(size);
        int i4 = (int) (size & 4294967295L);
        if (m4 == getWidth() && i4 == getHeight()) {
            return;
        }
        float f4 = m4;
        setPivotX(p6.k(this.mTransformOrigin) * f4);
        float f5 = i4;
        setPivotY(p6.l(this.mTransformOrigin) * f5);
        this.outlineResolver.i(i0.o.a(f4, f5));
        G();
        layout(getLeft(), getTop(), getLeft() + m4, getTop() + i4);
        D();
        this.matrixCache.c();
    }

    @Override // androidx.compose.ui.node.o1
    public void destroy() {
        F(false);
        this.ownerView.p1();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.n1(this);
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(@fg.l Canvas canvas) {
        boolean z4;
        androidx.compose.ui.graphics.w1 w1Var = this.canvasHolder;
        Canvas internalCanvas = w1Var.getAndroidCanvas().getInternalCanvas();
        w1Var.getAndroidCanvas().U(canvas);
        androidx.compose.ui.graphics.g0 androidCanvas = w1Var.getAndroidCanvas();
        if (A() == null && canvas.isHardwareAccelerated()) {
            z4 = false;
        } else {
            androidCanvas.C();
            this.outlineResolver.a(androidCanvas);
            z4 = true;
        }
        ld.l<? super androidx.compose.ui.graphics.v1, kotlin.k2> lVar = this.drawBlock;
        if (lVar != null) {
            lVar.invoke(androidCanvas);
        }
        if (z4) {
            androidCanvas.o();
        }
        w1Var.getAndroidCanvas().U(internalCanvas);
        F(false);
    }

    @Override // androidx.compose.ui.layout.l
    public long e() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(this.ownerView);
        }
        return -1L;
    }

    @Override // androidx.compose.ui.layout.l
    /* renamed from: f, reason: from getter */
    public long getLayerId() {
        return this.layerId;
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // androidx.compose.ui.node.o1
    public void g(@fg.l androidx.compose.ui.graphics.v1 canvas) {
        boolean z4 = getElevation() > 0.0f;
        this.drawnWithZ = z4;
        if (z4) {
            canvas.t();
        }
        this.container.a(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.D();
        }
    }

    @Override // androidx.compose.ui.node.o1
    public void h(@fg.l androidx.compose.ui.graphics.z5 scope, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l androidx.compose.ui.unit.d density) {
        ld.a<kotlin.k2> aVar;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        if ((mutatedFields & 4096) != 0) {
            long transformOrigin = scope.getTransformOrigin();
            this.mTransformOrigin = transformOrigin;
            setPivotX(p6.k(transformOrigin) * getWidth());
            setPivotY(p6.l(this.mTransformOrigin) * getHeight());
        }
        if ((mutatedFields & 1) != 0) {
            setScaleX(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            setScaleY(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            setAlpha(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            setTranslationX(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            setTranslationY(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            setElevation(scope.getShadowElevation());
        }
        if ((mutatedFields & 1024) != 0) {
            setRotation(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            setRotationX(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            setRotationY(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            E(scope.getCameraDistance());
        }
        boolean z4 = false;
        boolean z5 = A() != null;
        boolean z6 = scope.getClip() && scope.getShape() != androidx.compose.ui.graphics.r5.a();
        if ((mutatedFields & 24576) != 0) {
            this.clipToBounds = scope.getClip() && scope.getShape() == androidx.compose.ui.graphics.r5.a();
            D();
            setClipToOutline(z6);
        }
        boolean h4 = this.outlineResolver.h(scope.getShape(), scope.getAlpha(), z6, scope.getShadowElevation(), layoutDirection, density);
        if (this.outlineResolver.getCacheIsDirty()) {
            G();
        }
        boolean z7 = A() != null;
        if (z5 != z7 || (z7 && h4)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (aVar = this.invalidateParentLayer) != null) {
            aVar.invoke();
        }
        if ((mutatedFields & androidx.compose.ui.graphics.l4.MatrixAffectingFields) != 0) {
            this.matrixCache.c();
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            if ((mutatedFields & 64) != 0) {
                x5.f20212a.a(this, androidx.compose.ui.graphics.f2.r(scope.getAmbientShadowColor()));
            }
            if ((mutatedFields & 128) != 0) {
                x5.f20212a.b(this, androidx.compose.ui.graphics.f2.r(scope.getSpotShadowColor()));
            }
        }
        if (i4 >= 31 && (131072 & mutatedFields) != 0) {
            z5.f20242a.a(this, scope.getRenderEffect());
        }
        if ((mutatedFields & 32768) != 0) {
            int compositingStrategy = scope.getCompositingStrategy();
            i4.Companion companion = androidx.compose.ui.graphics.i4.INSTANCE;
            companion.getClass();
            if (androidx.compose.ui.graphics.i4.g(compositingStrategy, androidx.compose.ui.graphics.i4.f17853d)) {
                setLayerType(2, null);
            } else {
                companion.getClass();
                if (androidx.compose.ui.graphics.i4.g(compositingStrategy, androidx.compose.ui.graphics.i4.f17854e)) {
                    setLayerType(0, null);
                    this.mHasOverlappingRendering = z4;
                } else {
                    setLayerType(0, null);
                }
            }
            z4 = true;
            this.mHasOverlappingRendering = z4;
        }
        this.mutatedFields = scope.getMutatedFields();
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // androidx.compose.ui.node.o1
    public boolean i(long position) {
        float p4 = i0.f.p(position);
        float r4 = i0.f.r(position);
        if (this.clipToBounds) {
            return 0.0f <= p4 && p4 < ((float) getWidth()) && 0.0f <= r4 && r4 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.f(position);
        }
        return true;
    }

    @Override // android.view.View, androidx.compose.ui.node.o1
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        F(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // androidx.compose.ui.node.o1
    public void j(@fg.l i0.d rect, boolean inverse) {
        if (!inverse) {
            androidx.compose.ui.graphics.y4.l(this.matrixCache.b(this), rect);
            return;
        }
        float[] a5 = this.matrixCache.a(this);
        if (a5 != null) {
            androidx.compose.ui.graphics.y4.l(a5, rect);
        } else {
            rect.k(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    @Override // androidx.compose.ui.node.o1
    public void l(@fg.l float[] matrix) {
        float[] a5 = this.matrixCache.a(this);
        if (a5 != null) {
            androidx.compose.ui.graphics.y4.u(matrix, a5);
        }
    }

    @Override // androidx.compose.ui.node.o1
    public void m(long position) {
        int m4 = androidx.compose.ui.unit.q.m(position);
        if (m4 != getLeft()) {
            offsetLeftAndRight(m4 - getLeft());
            this.matrixCache.c();
        }
        int i4 = (int) (position & 4294967295L);
        if (i4 != getTop()) {
            offsetTopAndBottom(i4 - getTop());
            this.matrixCache.c();
        }
    }

    @Override // androidx.compose.ui.node.o1
    public void n() {
        if (!this.isInvalidated || f20148x) {
            return;
        }
        INSTANCE.e(this);
        F(false);
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l4, int t4, int r4, int b5) {
    }

    public final float y() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    @fg.l
    /* renamed from: z, reason: from getter */
    public final q1 getContainer() {
        return this.container;
    }
}
