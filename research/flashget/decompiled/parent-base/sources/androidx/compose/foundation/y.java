package androidx.compose.foundation;

import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.graphics.s4;
import kotlin.Metadata;

/* compiled from: Border.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u001e\u001a\u00020\u0002*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019¢\u0006\u0002\b\u001cH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010\u0013J@\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/foundation/y;", "", "Landroidx/compose/ui/graphics/s4;", "imageBitmap", "Landroidx/compose/ui/graphics/v1;", "canvas", "Landroidx/compose/ui/graphics/drawscope/a;", "canvasDrawScope", "Landroidx/compose/ui/graphics/g5;", "borderPath", "<init>", "(Landroidx/compose/ui/graphics/s4;Landroidx/compose/ui/graphics/v1;Landroidx/compose/ui/graphics/drawscope/a;Landroidx/compose/ui/graphics/g5;)V", "g", "()Landroidx/compose/ui/graphics/s4;", "h", "()Landroidx/compose/ui/graphics/v1;", "i", "()Landroidx/compose/ui/graphics/drawscope/a;", "j", "()Landroidx/compose/ui/graphics/g5;", "Landroidx/compose/ui/draw/g;", "Landroidx/compose/ui/unit/u;", "borderSize", "Landroidx/compose/ui/graphics/t4;", "config", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "Lkotlin/u;", "block", "m", "(Landroidx/compose/ui/draw/g;JILld/l;)Landroidx/compose/ui/graphics/s4;", "n", "k", "(Landroidx/compose/ui/graphics/s4;Landroidx/compose/ui/graphics/v1;Landroidx/compose/ui/graphics/drawscope/a;Landroidx/compose/ui/graphics/g5;)Landroidx/compose/foundation/y;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/graphics/s4;", "b", "Landroidx/compose/ui/graphics/v1;", "c", "Landroidx/compose/ui/graphics/drawscope/a;", "d", "Landroidx/compose/ui/graphics/g5;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,516:1\n1#2:517\n542#3,17:518\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n*L\n413#1:518,17\n*E\n"})
/* loaded from: classes.dex */
final /* data */ class y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private s4 imageBitmap;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.graphics.v1 canvas;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.graphics.drawscope.a canvasDrawScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private g5 borderPath;

    public y() {
        this(null, null, null, null, 15, null);
    }

    /* renamed from: g, reason: from getter */
    private final s4 getImageBitmap() {
        return this.imageBitmap;
    }

    /* renamed from: h, reason: from getter */
    private final androidx.compose.ui.graphics.v1 getCanvas() {
        return this.canvas;
    }

    /* renamed from: i, reason: from getter */
    private final androidx.compose.ui.graphics.drawscope.a getCanvasDrawScope() {
        return this.canvasDrawScope;
    }

    /* renamed from: j, reason: from getter */
    private final g5 getBorderPath() {
        return this.borderPath;
    }

    public static y l(y yVar, s4 s4Var, androidx.compose.ui.graphics.v1 v1Var, androidx.compose.ui.graphics.drawscope.a aVar, g5 g5Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            s4Var = yVar.imageBitmap;
        }
        if ((i4 & 2) != 0) {
            v1Var = yVar.canvas;
        }
        if ((i4 & 4) != 0) {
            aVar = yVar.canvasDrawScope;
        }
        if ((i4 & 8) != 0) {
            g5Var = yVar.borderPath;
        }
        yVar.getClass();
        return new y(s4Var, v1Var, aVar, g5Var);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof y)) {
            return false;
        }
        y yVar = (y) other;
        return kotlin.jvm.internal.l0.g(this.imageBitmap, yVar.imageBitmap) && kotlin.jvm.internal.l0.g(this.canvas, yVar.canvas) && kotlin.jvm.internal.l0.g(this.canvasDrawScope, yVar.canvasDrawScope) && kotlin.jvm.internal.l0.g(this.borderPath, yVar.borderPath);
    }

    public int hashCode() {
        s4 s4Var = this.imageBitmap;
        int hashCode = (s4Var == null ? 0 : s4Var.hashCode()) * 31;
        androidx.compose.ui.graphics.v1 v1Var = this.canvas;
        int hashCode2 = (hashCode + (v1Var == null ? 0 : v1Var.hashCode())) * 31;
        androidx.compose.ui.graphics.drawscope.a aVar = this.canvasDrawScope;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        g5 g5Var = this.borderPath;
        return hashCode3 + (g5Var != null ? g5Var.hashCode() : 0);
    }

    @fg.l
    public final y k(@fg.m s4 imageBitmap, @fg.m androidx.compose.ui.graphics.v1 canvas, @fg.m androidx.compose.ui.graphics.drawscope.a canvasDrawScope, @fg.m g5 borderPath) {
        return new y(imageBitmap, canvas, canvasDrawScope, borderPath);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (androidx.compose.ui.graphics.t4.h(r31, r1 != null ? androidx.compose.ui.graphics.t4.f(r1.f()) : null) != false) goto L17;
     */
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.graphics.s4 m(@fg.l androidx.compose.ui.draw.g r28, long r29, int r31, @fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.f, kotlin.k2> r32) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.y.m(androidx.compose.ui.draw.g, long, int, ld.l):androidx.compose.ui.graphics.s4");
    }

    @fg.l
    public final g5 n() {
        g5 g5Var = this.borderPath;
        if (g5Var != null) {
            return g5Var;
        }
        g5 a5 = androidx.compose.ui.graphics.a1.a();
        this.borderPath = a5;
        return a5;
    }

    @fg.l
    public String toString() {
        return "BorderCache(imageBitmap=" + this.imageBitmap + ", canvas=" + this.canvas + ", canvasDrawScope=" + this.canvasDrawScope + ", borderPath=" + this.borderPath + ')';
    }

    public y(@fg.m s4 s4Var, @fg.m androidx.compose.ui.graphics.v1 v1Var, @fg.m androidx.compose.ui.graphics.drawscope.a aVar, @fg.m g5 g5Var) {
        this.imageBitmap = s4Var;
        this.canvas = v1Var;
        this.canvasDrawScope = aVar;
        this.borderPath = g5Var;
    }

    public /* synthetic */ y(s4 s4Var, androidx.compose.ui.graphics.v1 v1Var, androidx.compose.ui.graphics.drawscope.a aVar, g5 g5Var, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? null : s4Var, (i4 & 2) != 0 ? null : v1Var, (i4 & 4) != 0 ? null : aVar, (i4 & 8) != 0 ? null : g5Var);
    }
}
