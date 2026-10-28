package androidx.compose.ui.platform;

import kotlin.Metadata;

/* compiled from: DeviceRenderNode.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b7\b\u0080\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010&J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010&J\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010&J\u0010\u0010,\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b/\u0010-J\u0010\u00100\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b0\u0010-J\u0010\u00101\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b1\u0010-J\u0010\u00102\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b2\u0010&J\u0010\u00103\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b3\u0010&J\u0010\u00104\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b4\u0010-J\u0010\u00105\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b5\u0010-J\u0010\u00106\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b6\u0010-J\u0010\u00107\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b7\u0010-J\u0010\u00108\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b8\u0010-J\u0010\u00109\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b9\u0010-J\u0010\u0010:\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b<\u0010;J\u0010\u0010=\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b=\u0010-J\u0012\u0010>\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0016\u0010@\u001a\u00020\u001fHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010&J\u008f\u0002\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fHÆ\u0001ø\u0001\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010D\u001a\u00020CHÖ\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bF\u0010&J\u001a\u0010H\u001a\u00020\u00192\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bH\u0010IR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010J\u001a\u0004\bK\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010L\u001a\u0004\bM\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010L\u001a\u0004\bN\u0010&R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010L\u001a\u0004\bO\u0010&R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010L\u001a\u0004\bP\u0010&R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010L\u001a\u0004\bQ\u0010&R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010L\u001a\u0004\bJ\u0010&R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010R\u001a\u0004\bS\u0010-\"\u0004\bT\u0010UR\"\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010R\u001a\u0004\bV\u0010-\"\u0004\bW\u0010UR\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010R\u001a\u0004\bX\u0010-\"\u0004\bY\u0010UR\"\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010R\u001a\u0004\bZ\u0010-\"\u0004\b[\u0010UR\"\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010R\u001a\u0004\bL\u0010-\"\u0004\b\\\u0010UR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010L\u001a\u0004\b]\u0010&\"\u0004\b^\u0010_R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010L\u001a\u0004\b`\u0010&\"\u0004\ba\u0010_R\"\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010R\u001a\u0004\bb\u0010-\"\u0004\bc\u0010UR\"\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010R\u001a\u0004\bd\u0010-\"\u0004\be\u0010UR\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010R\u001a\u0004\bf\u0010-\"\u0004\bg\u0010UR\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010R\u001a\u0004\bh\u0010-\"\u0004\bi\u0010UR\"\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010R\u001a\u0004\bj\u0010-\"\u0004\bk\u0010UR\"\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010R\u001a\u0004\bl\u0010-\"\u0004\bm\u0010UR\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010Q\u001a\u0004\bn\u0010;\"\u0004\bo\u0010pR\"\u0010\u001b\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010Q\u001a\u0004\bR\u0010;\"\u0004\bq\u0010pR\"\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010R\u001a\u0004\br\u0010-\"\u0004\bs\u0010UR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010t\u001a\u0004\bu\u0010?\"\u0004\bv\u0010wR(\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b.\u0010L\u001a\u0004\bx\u0010&\"\u0004\by\u0010_\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006z"}, d2 = {"Landroidx/compose/ui/platform/m1;", "", "", "uniqueId", "", "left", "top", "right", "bottom", "width", "height", "", "scaleX", "scaleY", "translationX", "translationY", "elevation", "ambientShadowColor", "spotShadowColor", "rotationZ", "rotationX", "rotationY", "cameraDistance", "pivotX", "pivotY", "", "clipToOutline", "clipToBounds", "alpha", "Landroidx/compose/ui/graphics/s5;", "renderEffect", "Landroidx/compose/ui/graphics/i4;", "compositingStrategy", "<init>", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/s5;ILkotlin/jvm/internal/w;)V", "a", "()J", "l", "()I", "s", "t", "u", "v", "w", "x", "()F", "y", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "()Z", "o", "p", "q", "()Landroidx/compose/ui/graphics/s5;", "r", "z", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/s5;I)Landroidx/compose/ui/platform/m1;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "J", "Y", "I", "K", "V", "O", "D", "Z", "F", "S", "n0", "(F)V", "T", "o0", "W", "q0", "X", "r0", "g0", "C", "b0", "(I)V", "U", "p0", "R", "m0", "P", "k0", "Q", "l0", "E", "c0", "L", "h0", "M", "i0", "G", "e0", "(Z)V", "d0", "B", "a0", "Landroidx/compose/ui/graphics/s5;", "N", "j0", "(Landroidx/compose/ui/graphics/s5;)V", "H", "f0", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class m1 {

    /* renamed from: z, reason: collision with root package name */
    public static final int f19984z = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long uniqueId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int left;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int top;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int right;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int bottom;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int height;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float elevation;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int ambientShadowColor;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int spotShadowColor;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float pivotX;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float pivotY;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean clipToOutline;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.graphics.s5 renderEffect;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private int compositingStrategy;

    public /* synthetic */ m1(long j4, int i4, int i5, int i6, int i7, int i10, int i11, float f4, float f5, float f6, float f7, float f10, int i12, int i13, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, boolean z5, float f17, androidx.compose.ui.graphics.s5 s5Var, int i14, kotlin.jvm.internal.w wVar) {
        this(j4, i4, i5, i6, i7, i10, i11, f4, f5, f6, f7, f10, i12, i13, f11, f12, f13, f14, f15, f16, z4, z5, f17, s5Var, i14);
    }

    public static m1 A(m1 m1Var, long j4, int i4, int i5, int i6, int i7, int i10, int i11, float f4, float f5, float f6, float f7, float f10, int i12, int i13, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, boolean z5, float f17, androidx.compose.ui.graphics.s5 s5Var, int i14, int i15, Object obj) {
        long j5 = (i15 & 1) != 0 ? m1Var.uniqueId : j4;
        int i16 = (i15 & 2) != 0 ? m1Var.left : i4;
        int i17 = (i15 & 4) != 0 ? m1Var.top : i5;
        int i18 = (i15 & 8) != 0 ? m1Var.right : i6;
        int i19 = (i15 & 16) != 0 ? m1Var.bottom : i7;
        int i20 = (i15 & 32) != 0 ? m1Var.width : i10;
        int i21 = (i15 & 64) != 0 ? m1Var.height : i11;
        float f18 = (i15 & 128) != 0 ? m1Var.scaleX : f4;
        float f19 = (i15 & 256) != 0 ? m1Var.scaleY : f5;
        float f20 = (i15 & 512) != 0 ? m1Var.translationX : f6;
        float f21 = (i15 & 1024) != 0 ? m1Var.translationY : f7;
        float f22 = (i15 & 2048) != 0 ? m1Var.elevation : f10;
        int i22 = (i15 & 4096) != 0 ? m1Var.ambientShadowColor : i12;
        int i23 = (i15 & 8192) != 0 ? m1Var.spotShadowColor : i13;
        float f23 = (i15 & 16384) != 0 ? m1Var.rotationZ : f11;
        float f24 = (i15 & 32768) != 0 ? m1Var.rotationX : f12;
        float f25 = (i15 & 65536) != 0 ? m1Var.rotationY : f13;
        float f26 = (i15 & 131072) != 0 ? m1Var.cameraDistance : f14;
        float f27 = (i15 & 262144) != 0 ? m1Var.pivotX : f15;
        float f28 = (i15 & 524288) != 0 ? m1Var.pivotY : f16;
        boolean z6 = (i15 & 1048576) != 0 ? m1Var.clipToOutline : z4;
        boolean z7 = (i15 & 2097152) != 0 ? m1Var.clipToBounds : z5;
        float f29 = (i15 & 4194304) != 0 ? m1Var.alpha : f17;
        androidx.compose.ui.graphics.s5 s5Var2 = (i15 & 8388608) != 0 ? m1Var.renderEffect : s5Var;
        int i24 = (i15 & 16777216) != 0 ? m1Var.compositingStrategy : i14;
        m1Var.getClass();
        return new m1(j5, i16, i17, i18, i19, i20, i21, f18, f19, f20, f21, f22, i22, i23, f23, f24, f25, f26, f27, f28, z6, z7, f29, s5Var2, i24);
    }

    /* renamed from: B, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: C, reason: from getter */
    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    /* renamed from: D, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    /* renamed from: E, reason: from getter */
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    /* renamed from: F, reason: from getter */
    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    /* renamed from: G, reason: from getter */
    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    /* renamed from: H, reason: from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    /* renamed from: I, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* renamed from: J, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: K, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* renamed from: L, reason: from getter */
    public final float getPivotX() {
        return this.pivotX;
    }

    /* renamed from: M, reason: from getter */
    public final float getPivotY() {
        return this.pivotY;
    }

    @fg.m
    /* renamed from: N, reason: from getter */
    public final androidx.compose.ui.graphics.s5 getRenderEffect() {
        return this.renderEffect;
    }

    /* renamed from: O, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* renamed from: P, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    /* renamed from: Q, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    /* renamed from: R, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    /* renamed from: S, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* renamed from: T, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    /* renamed from: U, reason: from getter */
    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    /* renamed from: V, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* renamed from: W, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* renamed from: X, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    /* renamed from: Y, reason: from getter */
    public final long getUniqueId() {
        return this.uniqueId;
    }

    /* renamed from: Z, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public final long a() {
        return this.uniqueId;
    }

    public final void a0(float f4) {
        this.alpha = f4;
    }

    public final float b() {
        return this.translationX;
    }

    public final void b0(int i4) {
        this.ambientShadowColor = i4;
    }

    public final float c() {
        return this.translationY;
    }

    public final void c0(float f4) {
        this.cameraDistance = f4;
    }

    public final float d() {
        return this.elevation;
    }

    public final void d0(boolean z4) {
        this.clipToBounds = z4;
    }

    public final int e() {
        return this.ambientShadowColor;
    }

    public final void e0(boolean z4) {
        this.clipToOutline = z4;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) other;
        return this.uniqueId == m1Var.uniqueId && this.left == m1Var.left && this.top == m1Var.top && this.right == m1Var.right && this.bottom == m1Var.bottom && this.width == m1Var.width && this.height == m1Var.height && Float.compare(this.scaleX, m1Var.scaleX) == 0 && Float.compare(this.scaleY, m1Var.scaleY) == 0 && Float.compare(this.translationX, m1Var.translationX) == 0 && Float.compare(this.translationY, m1Var.translationY) == 0 && Float.compare(this.elevation, m1Var.elevation) == 0 && this.ambientShadowColor == m1Var.ambientShadowColor && this.spotShadowColor == m1Var.spotShadowColor && Float.compare(this.rotationZ, m1Var.rotationZ) == 0 && Float.compare(this.rotationX, m1Var.rotationX) == 0 && Float.compare(this.rotationY, m1Var.rotationY) == 0 && Float.compare(this.cameraDistance, m1Var.cameraDistance) == 0 && Float.compare(this.pivotX, m1Var.pivotX) == 0 && Float.compare(this.pivotY, m1Var.pivotY) == 0 && this.clipToOutline == m1Var.clipToOutline && this.clipToBounds == m1Var.clipToBounds && Float.compare(this.alpha, m1Var.alpha) == 0 && kotlin.jvm.internal.l0.g(this.renderEffect, m1Var.renderEffect) && androidx.compose.ui.graphics.i4.g(this.compositingStrategy, m1Var.compositingStrategy);
    }

    public final int f() {
        return this.spotShadowColor;
    }

    public final void f0(int i4) {
        this.compositingStrategy = i4;
    }

    public final float g() {
        return this.rotationZ;
    }

    public final void g0(float f4) {
        this.elevation = f4;
    }

    public final float h() {
        return this.rotationX;
    }

    public final void h0(float f4) {
        this.pivotX = f4;
    }

    public int hashCode() {
        int a5 = androidx.compose.animation.l0.a(this.alpha, androidx.compose.animation.d1.a(this.clipToBounds, androidx.compose.animation.d1.a(this.clipToOutline, androidx.compose.animation.l0.a(this.pivotY, androidx.compose.animation.l0.a(this.pivotX, androidx.compose.animation.l0.a(this.cameraDistance, androidx.compose.animation.l0.a(this.rotationY, androidx.compose.animation.l0.a(this.rotationX, androidx.compose.animation.l0.a(this.rotationZ, androidx.compose.foundation.w1.a(this.spotShadowColor, androidx.compose.foundation.w1.a(this.ambientShadowColor, androidx.compose.animation.l0.a(this.elevation, androidx.compose.animation.l0.a(this.translationY, androidx.compose.animation.l0.a(this.translationX, androidx.compose.animation.l0.a(this.scaleY, androidx.compose.animation.l0.a(this.scaleX, androidx.compose.foundation.w1.a(this.height, androidx.compose.foundation.w1.a(this.width, androidx.compose.foundation.w1.a(this.bottom, androidx.compose.foundation.w1.a(this.right, androidx.compose.foundation.w1.a(this.top, androidx.compose.foundation.w1.a(this.left, Long.hashCode(this.uniqueId) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        androidx.compose.ui.graphics.s5 s5Var = this.renderEffect;
        return androidx.compose.ui.graphics.i4.h(this.compositingStrategy) + ((a5 + (s5Var == null ? 0 : s5Var.hashCode())) * 31);
    }

    public final float i() {
        return this.rotationY;
    }

    public final void i0(float f4) {
        this.pivotY = f4;
    }

    public final float j() {
        return this.cameraDistance;
    }

    public final void j0(@fg.m androidx.compose.ui.graphics.s5 s5Var) {
        this.renderEffect = s5Var;
    }

    public final float k() {
        return this.pivotX;
    }

    public final void k0(float f4) {
        this.rotationX = f4;
    }

    public final int l() {
        return this.left;
    }

    public final void l0(float f4) {
        this.rotationY = f4;
    }

    public final float m() {
        return this.pivotY;
    }

    public final void m0(float f4) {
        this.rotationZ = f4;
    }

    public final boolean n() {
        return this.clipToOutline;
    }

    public final void n0(float f4) {
        this.scaleX = f4;
    }

    public final boolean o() {
        return this.clipToBounds;
    }

    public final void o0(float f4) {
        this.scaleY = f4;
    }

    public final float p() {
        return this.alpha;
    }

    public final void p0(int i4) {
        this.spotShadowColor = i4;
    }

    @fg.m
    public final androidx.compose.ui.graphics.s5 q() {
        return this.renderEffect;
    }

    public final void q0(float f4) {
        this.translationX = f4;
    }

    public final int r() {
        return this.compositingStrategy;
    }

    public final void r0(float f4) {
        this.translationY = f4;
    }

    public final int s() {
        return this.top;
    }

    public final int t() {
        return this.right;
    }

    @fg.l
    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.uniqueId + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", width=" + this.width + ", height=" + this.height + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", elevation=" + this.elevation + ", ambientShadowColor=" + this.ambientShadowColor + ", spotShadowColor=" + this.spotShadowColor + ", rotationZ=" + this.rotationZ + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", cameraDistance=" + this.cameraDistance + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", clipToOutline=" + this.clipToOutline + ", clipToBounds=" + this.clipToBounds + ", alpha=" + this.alpha + ", renderEffect=" + this.renderEffect + ", compositingStrategy=" + ((Object) androidx.compose.ui.graphics.i4.i(this.compositingStrategy)) + ')';
    }

    public final int u() {
        return this.bottom;
    }

    public final int v() {
        return this.width;
    }

    public final int w() {
        return this.height;
    }

    public final float x() {
        return this.scaleX;
    }

    public final float y() {
        return this.scaleY;
    }

    @fg.l
    public final m1 z(long uniqueId, int left, int top2, int right, int bottom, int width, int height, float scaleX, float scaleY, float translationX, float translationY, float elevation, int ambientShadowColor, int spotShadowColor, float rotationZ, float rotationX, float rotationY, float cameraDistance, float pivotX, float pivotY, boolean clipToOutline, boolean clipToBounds, float alpha, @fg.m androidx.compose.ui.graphics.s5 renderEffect, int compositingStrategy) {
        return new m1(uniqueId, left, top2, right, bottom, width, height, scaleX, scaleY, translationX, translationY, elevation, ambientShadowColor, spotShadowColor, rotationZ, rotationX, rotationY, cameraDistance, pivotX, pivotY, clipToOutline, clipToBounds, alpha, renderEffect, compositingStrategy);
    }

    private m1(long j4, int i4, int i5, int i6, int i7, int i10, int i11, float f4, float f5, float f6, float f7, float f10, int i12, int i13, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, boolean z5, float f17, androidx.compose.ui.graphics.s5 s5Var, int i14) {
        this.uniqueId = j4;
        this.left = i4;
        this.top = i5;
        this.right = i6;
        this.bottom = i7;
        this.width = i10;
        this.height = i11;
        this.scaleX = f4;
        this.scaleY = f5;
        this.translationX = f6;
        this.translationY = f7;
        this.elevation = f10;
        this.ambientShadowColor = i12;
        this.spotShadowColor = i13;
        this.rotationZ = f11;
        this.rotationX = f12;
        this.rotationY = f13;
        this.cameraDistance = f14;
        this.pivotX = f15;
        this.pivotY = f16;
        this.clipToOutline = z4;
        this.clipToBounds = z5;
        this.alpha = f17;
        this.renderEffect = s5Var;
        this.compositingStrategy = i14;
    }
}
