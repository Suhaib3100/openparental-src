package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.a1;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.graphics.g6;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.graphics.y4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Vector.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u001d\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u0006*\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001e\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u00103\u001a\u00020-2\u0006\u0010.\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R*\u00107\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t8\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u0010\u0012\u001a\u0004\b5\u00106R6\u0010?\u001a\b\u0012\u0004\u0012\u000209082\f\u0010:\u001a\b\u0012\u0004\u0012\u000209088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010+\u001a\u0004\b4\u0010<\"\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00100R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR0\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010F8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\b*\u0010KR \u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010HR*\u0010S\u001a\u00020\"2\u0006\u0010:\u001a\u00020\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\b;\u0010$\"\u0004\bQ\u0010RR*\u0010Z\u001a\u00020T2\u0006\u0010:\u001a\u00020T8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bM\u0010W\"\u0004\bX\u0010YR*\u0010\\\u001a\u00020T2\u0006\u0010:\u001a\u00020T8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010V\u001a\u0004\bC\u0010W\"\u0004\b[\u0010YR*\u0010_\u001a\u00020T2\u0006\u0010:\u001a\u00020T8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010V\u001a\u0004\bG\u0010W\"\u0004\b^\u0010YR*\u0010b\u001a\u00020T2\u0006\u0010:\u001a\u00020T8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010V\u001a\u0004\bO\u0010W\"\u0004\ba\u0010YR*\u0010d\u001a\u00020T2\u0006\u0010:\u001a\u00020T8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010V\u001a\u0004\bU\u0010W\"\u0004\bV\u0010YR*\u0010f\u001a\u00020T2\u0006\u0010:\u001a\u00020T8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010V\u001a\u0004\b]\u0010W\"\u0004\be\u0010YR*\u0010h\u001a\u00020T2\u0006\u0010:\u001a\u00020T8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010V\u001a\u0004\b`\u0010W\"\u0004\bg\u0010YR\u0016\u0010i\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00100R\u0014\u0010j\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u00102R\u0011\u0010l\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b@\u0010k\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006m"}, d2 = {"Landroidx/compose/ui/graphics/vector/c;", "Landroidx/compose/ui/graphics/vector/n;", "<init>", "()V", "Landroidx/compose/ui/graphics/t1;", "brush", "Lkotlin/k2;", "u", "(Landroidx/compose/ui/graphics/t1;)V", "Landroidx/compose/ui/graphics/d2;", "color", "v", "(J)V", "node", "w", "(Landroidx/compose/ui/graphics/vector/n;)V", "t", "I", "J", "", "index", "instance", "r", "(ILandroidx/compose/ui/graphics/vector/n;)V", "from", "to", "count", "x", "(III)V", "y", "(II)V", "Landroidx/compose/ui/graphics/drawscope/f;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/y4;", "c", "[F", "groupMatrix", "", "d", "Ljava/util/List;", "children", "", "<set-?>", "e", "Z", "s", "()Z", "isTintable", "f", "n", "()J", "tintColor", "", "Landroidx/compose/ui/graphics/vector/i;", "value", "g", "()Ljava/util/List;", "z", "(Ljava/util/List;)V", "clipPathData", "h", "isClipPathDirty", "Landroidx/compose/ui/graphics/g5;", "i", "Landroidx/compose/ui/graphics/g5;", "clipPath", "Lkotlin/Function1;", "j", "Lld/l;", "b", "()Lld/l;", "(Lld/l;)V", "invalidateListener", "k", "wrappedListener", "l", "Ljava/lang/String;", "A", "(Ljava/lang/String;)V", "name", "", "m", "F", "()F", "D", "(F)V", "rotation", "B", "pivotX", "o", "C", "pivotY", "p", "E", "scaleX", "q", "scaleY", "G", "translationX", "H", "translationY", "isMatrixDirty", "willClipPath", "()I", "numChildren", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,651:1\n646#2:652\n652#2:653\n262#3,7:654\n269#3:662\n270#3,3:669\n1#4:661\n33#5,6:663\n33#5,6:672\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n*L\n410#1:652\n411#1:653\n609#1:654,7\n609#1:662\n609#1:669,3\n616#1:663,6\n626#1:672,6\n*E\n"})
/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: u, reason: collision with root package name */
    public static final int f18073u = 8;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private float[] groupMatrix;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<n> children;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isTintable;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long tintColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private List<? extends i> clipPathData;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isClipPathDirty;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private g5 clipPath;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super n, k2> invalidateListener;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<n, k2> wrappedListener;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private String name;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float rotation;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float pivotX;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float pivotY;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean isMatrixDirty;

    /* compiled from: Vector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/n;", "node", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/n;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<n, k2> {
        a() {
            super(1);
        }

        public final void a(@fg.l n nVar) {
            c.this.w(nVar);
            ld.l<n, k2> b5 = c.this.b();
            if (b5 != null) {
                b5.invoke(nVar);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(n nVar) {
            a(nVar);
            return k2.f75408a;
        }
    }

    public c() {
        super(null);
        this.children = new ArrayList();
        this.isTintable = true;
        d2.INSTANCE.getClass();
        this.tintColor = d2.f17778o;
        this.clipPathData = u.h();
        this.isClipPathDirty = true;
        this.wrappedListener = new a();
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    private final void I() {
        if (q()) {
            g5 g5Var = this.clipPath;
            if (g5Var == null) {
                g5Var = a1.a();
                this.clipPath = g5Var;
            }
            m.d(this.clipPathData, g5Var);
        }
    }

    private final void J() {
        float[] fArr = this.groupMatrix;
        if (fArr == null) {
            fArr = y4.c(null, 1, null);
            this.groupMatrix = fArr;
        } else {
            y4.m(fArr);
        }
        y4.x(fArr, this.pivotX + this.translationX, this.pivotY + this.translationY, 0.0f, 4, null);
        y4.p(fArr, this.rotation);
        y4.q(fArr, this.scaleX, this.scaleY, 1.0f);
        y4.x(fArr, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }

    private final boolean q() {
        return !this.clipPathData.isEmpty();
    }

    private final void t() {
        this.isTintable = false;
        d2.INSTANCE.getClass();
        this.tintColor = d2.f17778o;
    }

    private final void u(t1 brush) {
        if (this.isTintable && brush != null) {
            if (brush instanceof g6) {
                v(((g6) brush).getValue());
            } else {
                t();
            }
        }
    }

    private final void v(long color) {
        if (this.isTintable) {
            d2.Companion companion = d2.INSTANCE;
            companion.getClass();
            if (color != d2.f17778o) {
                long j4 = this.tintColor;
                companion.getClass();
                if (j4 == d2.f17778o) {
                    this.tintColor = color;
                } else {
                    if (u.i(this.tintColor, color)) {
                        return;
                    }
                    t();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(n node) {
        if (node instanceof h) {
            h hVar = (h) node;
            u(hVar.getFill());
            u(hVar.getStroke());
        } else if (node instanceof c) {
            c cVar = (c) node;
            if (cVar.isTintable && this.isTintable) {
                v(cVar.tintColor);
            } else {
                t();
            }
        }
    }

    public final void A(@fg.l String str) {
        this.name = str;
        c();
    }

    public final void B(float f4) {
        this.pivotX = f4;
        this.isMatrixDirty = true;
        c();
    }

    public final void C(float f4) {
        this.pivotY = f4;
        this.isMatrixDirty = true;
        c();
    }

    public final void D(float f4) {
        this.rotation = f4;
        this.isMatrixDirty = true;
        c();
    }

    public final void E(float f4) {
        this.scaleX = f4;
        this.isMatrixDirty = true;
        c();
    }

    public final void F(float f4) {
        this.scaleY = f4;
        this.isMatrixDirty = true;
        c();
    }

    public final void G(float f4) {
        this.translationX = f4;
        this.isMatrixDirty = true;
        c();
    }

    public final void H(float f4) {
        this.translationY = f4;
        this.isMatrixDirty = true;
        c();
    }

    @Override // androidx.compose.ui.graphics.vector.n
    public void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
        if (this.isMatrixDirty) {
            J();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            I();
            this.isClipPathDirty = false;
        }
        androidx.compose.ui.graphics.drawscope.d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        androidx.compose.ui.graphics.drawscope.j transform = drawContext.getTransform();
        float[] fArr = this.groupMatrix;
        if (fArr != null) {
            transform.a(y4.a(fArr).y());
        }
        g5 g5Var = this.clipPath;
        if (q() && g5Var != null) {
            androidx.compose.ui.graphics.drawscope.j.f(transform, g5Var, 0, 2, null);
        }
        List<n> list = this.children;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            list.get(i4).a(fVar);
        }
        drawContext.i().o();
        drawContext.j(e4);
    }

    @Override // androidx.compose.ui.graphics.vector.n
    @fg.m
    public ld.l<n, k2> b() {
        return this.invalidateListener;
    }

    @Override // androidx.compose.ui.graphics.vector.n
    public void d(@fg.m ld.l<? super n, k2> lVar) {
        this.invalidateListener = lVar;
    }

    @fg.l
    public final List<i> f() {
        return this.clipPathData;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final int h() {
        return this.children.size();
    }

    /* renamed from: i, reason: from getter */
    public final float getPivotX() {
        return this.pivotX;
    }

    /* renamed from: j, reason: from getter */
    public final float getPivotY() {
        return this.pivotY;
    }

    /* renamed from: k, reason: from getter */
    public final float getRotation() {
        return this.rotation;
    }

    /* renamed from: l, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* renamed from: m, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    /* renamed from: n, reason: from getter */
    public final long getTintColor() {
        return this.tintColor;
    }

    /* renamed from: o, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* renamed from: p, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    public final void r(int index, @fg.l n instance) {
        if (index < this.children.size()) {
            this.children.set(index, instance);
        } else {
            this.children.add(instance);
        }
        w(instance);
        instance.d(this.wrappedListener);
        c();
    }

    /* renamed from: s, reason: from getter */
    public final boolean getIsTintable() {
        return this.isTintable;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.name);
        List<n> list = this.children;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            n nVar = list.get(i4);
            sb.append("\t");
            sb.append(nVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public final void x(int from, int to, int count) {
        int i4 = 0;
        if (from > to) {
            while (i4 < count) {
                n nVar = this.children.get(from);
                this.children.remove(from);
                this.children.add(to, nVar);
                to++;
                i4++;
            }
        } else {
            while (i4 < count) {
                n nVar2 = this.children.get(from);
                this.children.remove(from);
                this.children.add(to - 1, nVar2);
                i4++;
            }
        }
        c();
    }

    public final void y(int index, int count) {
        for (int i4 = 0; i4 < count; i4++) {
            if (index < this.children.size()) {
                this.children.get(index).d(null);
                this.children.remove(index);
            }
        }
        c();
    }

    public final void z(@fg.l List<? extends i> list) {
        this.clipPathData = list;
        this.isClipPathDirty = true;
        c();
    }
}
