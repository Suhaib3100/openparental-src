package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.a1;
import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.graphics.j5;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.graphics.z0;
import java.util.List;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.f0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: Vector.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u0012R.\u0010\u001b\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\"\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R6\u0010*\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R0\u00100\u001a\u00020+2\u0006\u0010\r\u001a\u00020+8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00103\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001d\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u0010!R*\u00106\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001d\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R.\u0010:\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0016\u001a\u0004\b8\u0010\u0018\"\u0004\b9\u0010\u001aR0\u0010>\u001a\u00020;2\u0006\u0010\r\u001a\u00020;8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b8\u0010\u0006\u001a\u0004\b<\u0010-\"\u0004\b=\u0010/R0\u0010B\u001a\u00020?2\u0006\u0010\r\u001a\u00020?8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b1\u0010\u0006\u001a\u0004\b@\u0010-\"\u0004\bA\u0010/R*\u0010E\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\u001d\u001a\u0004\bC\u0010\u001f\"\u0004\bD\u0010!R*\u0010H\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u001d\u001a\u0004\bF\u0010\u001f\"\u0004\bG\u0010!R*\u0010K\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\u001d\u001a\u0004\bI\u0010\u001f\"\u0004\bJ\u0010!R*\u0010M\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001d\u001a\u0004\bL\u0010\u001f\"\u0004\b\u001d\u0010!R\u0016\u0010P\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010OR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010OR\u0016\u0010R\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010OR\u0018\u0010U\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010TR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010WR\u0016\u0010Y\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010WR\u001b\u0010]\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010[\u001a\u0004\b7\u0010\\\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Landroidx/compose/ui/graphics/vector/h;", "Landroidx/compose/ui/graphics/vector/n;", "<init>", "()V", "Lkotlin/k2;", "H", "I", "Landroidx/compose/ui/graphics/drawscope/f;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V", "", "toString", "()Ljava/lang/String;", "value", "c", "Ljava/lang/String;", "g", "v", "(Ljava/lang/String;)V", "name", "Landroidx/compose/ui/graphics/t1;", "d", "Landroidx/compose/ui/graphics/t1;", "e", "()Landroidx/compose/ui/graphics/t1;", "t", "(Landroidx/compose/ui/graphics/t1;)V", "fill", "", "F", "f", "()F", "u", "(F)V", "fillAlpha", "", "Landroidx/compose/ui/graphics/vector/i;", "Ljava/util/List;", "h", "()Ljava/util/List;", "w", "(Ljava/util/List;)V", "pathData", "Landroidx/compose/ui/graphics/i5;", "i", "()I", "x", "(I)V", "pathFillType", "l", "z", "strokeAlpha", "p", "D", "strokeLineWidth", "j", "k", "y", "stroke", "Landroidx/compose/ui/graphics/i6;", "m", "A", "strokeLineCap", "Landroidx/compose/ui/graphics/j6;", "n", "B", "strokeLineJoin", "o", "C", "strokeLineMiter", "s", "G", "trimPathStart", "q", "E", "trimPathEnd", "r", "trimPathOffset", "", "Z", "isPathDirty", "isStrokeDirty", "isTrimPathDirty", "Landroidx/compose/ui/graphics/drawscope/n;", "Landroidx/compose/ui/graphics/drawscope/n;", "strokeStyle", "Landroidx/compose/ui/graphics/g5;", "Landroidx/compose/ui/graphics/g5;", "path", "renderPath", "Landroidx/compose/ui/graphics/j5;", "Lkotlin/b0;", "()Landroidx/compose/ui/graphics/j5;", "pathMeasure", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/PathComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1#2:652\n*E\n"})
/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: x, reason: collision with root package name */
    public static final int f18168x = 8;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private t1 fill;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float fillAlpha;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private List<? extends i> pathData;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int pathFillType;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float strokeAlpha;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private float strokeLineWidth;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private t1 stroke;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int strokeLineCap;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int strokeLineJoin;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float strokeLineMiter;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float trimPathStart;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float trimPathEnd;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float trimPathOffset;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean isPathDirty;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isStrokeDirty;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isTrimPathDirty;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.graphics.drawscope.n strokeStyle;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final g5 path;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private g5 renderPath;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b0 pathMeasure;

    /* compiled from: Vector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/graphics/j5;", "a", "()Landroidx/compose/ui/graphics/j5;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<j5> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f18190b = new a(0);

        a() {
            super(0);
        }

        @fg.l
        public final j5 a() {
            return z0.a();
        }

        @Override // ld.a
        public j5 invoke() {
            return z0.a();
        }
    }

    public h() {
        super(null);
        this.name = "";
        this.fillAlpha = 1.0f;
        this.pathData = u.h();
        this.pathFillType = u.c();
        this.strokeAlpha = 1.0f;
        this.strokeLineCap = u.d();
        this.strokeLineJoin = u.e();
        this.strokeLineMiter = 4.0f;
        this.trimPathEnd = 1.0f;
        this.isPathDirty = true;
        this.isStrokeDirty = true;
        g5 a5 = a1.a();
        this.path = a5;
        this.renderPath = a5;
        this.pathMeasure = c0.b(f0.NONE, a.f18190b);
    }

    private final void H() {
        m.d(this.pathData, this.path);
        I();
    }

    private final void I() {
        if (this.trimPathStart == 0.0f && this.trimPathEnd == 1.0f) {
            this.renderPath = this.path;
            return;
        }
        if (l0.g(this.renderPath, this.path)) {
            this.renderPath = a1.a();
        } else {
            int p4 = this.renderPath.p();
            this.renderPath.rewind();
            this.renderPath.g(p4);
        }
        j().c(this.path, false);
        float length = j().getLength();
        float f4 = this.trimPathStart;
        float f5 = this.trimPathOffset;
        float f6 = ((f4 + f5) % 1.0f) * length;
        float f7 = ((this.trimPathEnd + f5) % 1.0f) * length;
        if (f6 <= f7) {
            j().b(f6, f7, this.renderPath, true);
        } else {
            j().b(f6, length, this.renderPath, true);
            j().b(0.0f, f7, this.renderPath, true);
        }
    }

    private final j5 j() {
        return (j5) this.pathMeasure.getValue();
    }

    public final void A(int i4) {
        this.strokeLineCap = i4;
        this.isStrokeDirty = true;
        c();
    }

    public final void B(int i4) {
        this.strokeLineJoin = i4;
        this.isStrokeDirty = true;
        c();
    }

    public final void C(float f4) {
        this.strokeLineMiter = f4;
        this.isStrokeDirty = true;
        c();
    }

    public final void D(float f4) {
        this.strokeLineWidth = f4;
        this.isStrokeDirty = true;
        c();
    }

    public final void E(float f4) {
        this.trimPathEnd = f4;
        this.isTrimPathDirty = true;
        c();
    }

    public final void F(float f4) {
        this.trimPathOffset = f4;
        this.isTrimPathDirty = true;
        c();
    }

    public final void G(float f4) {
        this.trimPathStart = f4;
        this.isTrimPathDirty = true;
        c();
    }

    @Override // androidx.compose.ui.graphics.vector.n
    public void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
        if (this.isPathDirty) {
            H();
        } else if (this.isTrimPathDirty) {
            I();
        }
        this.isPathDirty = false;
        this.isTrimPathDirty = false;
        t1 t1Var = this.fill;
        if (t1Var != null) {
            androidx.compose.ui.graphics.drawscope.f.a5(fVar, this.renderPath, t1Var, this.fillAlpha, null, null, 0, 56, null);
        }
        t1 t1Var2 = this.stroke;
        if (t1Var2 != null) {
            androidx.compose.ui.graphics.drawscope.n nVar = this.strokeStyle;
            if (this.isStrokeDirty || nVar == null) {
                nVar = new androidx.compose.ui.graphics.drawscope.n(this.strokeLineWidth, this.strokeLineMiter, this.strokeLineCap, this.strokeLineJoin, null, 16, null);
                this.strokeStyle = nVar;
                this.isStrokeDirty = false;
            }
            androidx.compose.ui.graphics.drawscope.f.a5(fVar, this.renderPath, t1Var2, this.strokeAlpha, nVar, null, 0, 48, null);
        }
    }

    @fg.m
    /* renamed from: e, reason: from getter */
    public final t1 getFill() {
        return this.fill;
    }

    /* renamed from: f, reason: from getter */
    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @fg.l
    public final List<i> h() {
        return this.pathData;
    }

    /* renamed from: i, reason: from getter */
    public final int getPathFillType() {
        return this.pathFillType;
    }

    @fg.m
    /* renamed from: k, reason: from getter */
    public final t1 getStroke() {
        return this.stroke;
    }

    /* renamed from: l, reason: from getter */
    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* renamed from: m, reason: from getter */
    public final int getStrokeLineCap() {
        return this.strokeLineCap;
    }

    /* renamed from: n, reason: from getter */
    public final int getStrokeLineJoin() {
        return this.strokeLineJoin;
    }

    /* renamed from: o, reason: from getter */
    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    /* renamed from: p, reason: from getter */
    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    /* renamed from: q, reason: from getter */
    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    /* renamed from: r, reason: from getter */
    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    /* renamed from: s, reason: from getter */
    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public final void t(@fg.m t1 t1Var) {
        this.fill = t1Var;
        c();
    }

    @fg.l
    public String toString() {
        return this.path.toString();
    }

    public final void u(float f4) {
        this.fillAlpha = f4;
        c();
    }

    public final void v(@fg.l String str) {
        this.name = str;
        c();
    }

    public final void w(@fg.l List<? extends i> list) {
        this.pathData = list;
        this.isPathDirty = true;
        c();
    }

    public final void x(int i4) {
        this.pathFillType = i4;
        this.renderPath.g(i4);
        c();
    }

    public final void y(@fg.m t1 t1Var) {
        this.stroke = t1Var;
        c();
    }

    public final void z(float f4) {
        this.strokeAlpha = f4;
        c();
    }
}
