package androidx.compose.foundation.text.modifiers;

import androidx.compose.animation.d1;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.c6;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.graphics.v1;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.layout.o0;
import androidx.compose.ui.layout.p;
import androidx.compose.ui.node.c0;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.node.r;
import androidx.compose.ui.node.y1;
import androidx.compose.ui.node.z1;
import androidx.compose.ui.q;
import androidx.compose.ui.semantics.z;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.n0;
import androidx.compose.ui.text.s;
import androidx.compose.ui.text.style.t;
import androidx.compose.ui.text.v0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: TextStringSimpleNode.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001jBS\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b$\u0010\u001dJ@\u0010%\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b%\u0010&J%\u0010*\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r¢\u0006\u0004\b*\u0010+J\u0013\u0010-\u001a\u00020\u001e*\u00020,H\u0016¢\u0006\u0004\b-\u0010.J&\u00105\u001a\u000204*\u00020/2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0016ø\u0001\u0000¢\u0006\u0004\b5\u00106J#\u0010:\u001a\u00020\u000f*\u0002072\u0006\u00101\u001a\u0002082\u0006\u00109\u001a\u00020\u000fH\u0016¢\u0006\u0004\b:\u0010;J#\u0010=\u001a\u00020\u000f*\u0002072\u0006\u00101\u001a\u0002082\u0006\u0010<\u001a\u00020\u000fH\u0016¢\u0006\u0004\b=\u0010;J#\u0010>\u001a\u00020\u000f*\u0002072\u0006\u00101\u001a\u0002082\u0006\u00109\u001a\u00020\u000fH\u0016¢\u0006\u0004\b>\u0010;J#\u0010?\u001a\u00020\u000f*\u0002072\u0006\u00101\u001a\u0002082\u0006\u0010<\u001a\u00020\u000fH\u0016¢\u0006\u0004\b?\u0010;J\u0013\u0010A\u001a\u00020\u001e*\u00020@H\u0016¢\u0006\u0004\bA\u0010BR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010CR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010IR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010IR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR$\u0010T\u001a\u0010\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\u000f\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR*\u0010]\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0Y\u0012\u0004\u0012\u00020\r\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R/\u0010f\u001a\u0004\u0018\u00010^2\b\u0010_\u001a\u0004\u0018\u00010^8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0014\u0010i\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bg\u0010h\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, d2 = {"Landroidx/compose/foundation/text/modifiers/o;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/node/q;", "Landroidx/compose/ui/node/y1;", "", "text", "Landroidx/compose/ui/text/v0;", "style", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/graphics/k2;", "overrideColor", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/v0;Landroidx/compose/ui/text/font/y$b;IZIILandroidx/compose/ui/graphics/k2;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/foundation/text/modifiers/g;", "H7", "(Landroidx/compose/ui/unit/d;)Landroidx/compose/foundation/text/modifiers/g;", "updatedText", "J7", "(Ljava/lang/String;)Z", "Lkotlin/k2;", "E7", "()V", "color", "L7", "(Landroidx/compose/ui/graphics/k2;Landroidx/compose/ui/text/v0;)Z", "N7", "M7", "(Landroidx/compose/ui/text/v0;IIZLandroidx/compose/ui/text/font/y$b;I)Z", "drawChanged", "textChanged", "layoutChanged", "F7", "(ZZZ)V", "Landroidx/compose/ui/semantics/z;", "f6", "(Landroidx/compose/ui/semantics/z;)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "height", "P", "(Landroidx/compose/ui/layout/q;Landroidx/compose/ui/layout/p;I)I", "width", "G", "V", "p", "Landroidx/compose/ui/graphics/drawscope/c;", "E", "(Landroidx/compose/ui/graphics/drawscope/c;)V", "Ljava/lang/String;", "q", "Landroidx/compose/ui/text/v0;", "r", "Landroidx/compose/ui/text/font/y$b;", "s", "I", "t", "Z", "u", "v", "w", "Landroidx/compose/ui/graphics/k2;", "", "Landroidx/compose/ui/layout/a;", "x", "Ljava/util/Map;", "baselineCache", "y", "Landroidx/compose/foundation/text/modifiers/g;", "_layoutCache", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/n0;", "z", "Lld/l;", "semanticsTextLayoutResult", "Landroidx/compose/foundation/text/modifiers/o$a;", "<set-?>", "A", "Landroidx/compose/runtime/k2;", "I7", "()Landroidx/compose/foundation/text/modifiers/o$a;", "K7", "(Landroidx/compose/foundation/text/modifiers/o$a;)V", "textSubstitution", "G7", "()Landroidx/compose/foundation/text/modifiers/g;", "layoutCache", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nTextStringSimpleNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,440:1\n1#2:441\n81#3:442\n107#3,2:443\n246#4:445\n646#5:446\n646#5:447\n*S KotlinDebug\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n*L\n222#1:442\n222#1:443,2\n391#1:445\n417#1:446\n419#1:447\n*E\n"})
/* loaded from: classes.dex */
public final class o extends q.d implements c0, androidx.compose.ui.node.q, y1 {
    public static final int B = 8;

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private final k2 textSubstitution;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private String text;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private v0 style;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private y.b fontFamilyResolver;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int overflow;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean softWrap;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int minLines;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.graphics.k2 overrideColor;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Map<androidx.compose.ui.layout.a, Integer> baselineCache;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private g _layoutCache;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super List<n0>, Boolean> semanticsTextLayoutResult;

    /* compiled from: TextStringSimpleNode.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<List<n0>, Boolean> {
        b() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l List<n0> list) {
            long j4;
            g G7 = o.this.G7();
            v0 v0Var = o.this.style;
            androidx.compose.ui.graphics.k2 k2Var = o.this.overrideColor;
            if (k2Var != null) {
                j4 = k2Var.a();
            } else {
                d2.INSTANCE.getClass();
                j4 = d2.f17778o;
            }
            n0 r4 = G7.r(v0.j0(v0Var, j4, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777214, null));
            if (r4 != null) {
                list.add(r4);
            } else {
                r4 = null;
            }
            return Boolean.valueOf(r4 != null);
        }
    }

    /* compiled from: TextStringSimpleNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/e;", "updatedText", "", "a", "(Landroidx/compose/ui/text/e;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.e, Boolean> {
        c() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l androidx.compose.ui.text.e eVar) {
            o.this.J7(eVar.getText());
            z1.b(o.this);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextStringSimpleNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<Boolean, Boolean> {
        d() {
            super(1);
        }

        @fg.l
        public final Boolean a(boolean z4) {
            if (o.this.I7() == null) {
                return Boolean.FALSE;
            }
            a I7 = o.this.I7();
            if (I7 != null) {
                I7.l(z4);
            }
            z1.b(o.this);
            f0.b(o.this);
            r.a(o.this);
            return Boolean.TRUE;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    /* compiled from: TextStringSimpleNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {
        e() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            o.y7(o.this);
            z1.b(o.this);
            f0.b(o.this);
            r.a(o.this);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextStringSimpleNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f7833b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(i1 i1Var) {
            super(1);
            this.f7833b = i1Var;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.g(aVar, this.f7833b, 0, 0, 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    public /* synthetic */ o(String str, v0 v0Var, y.b bVar, int i4, boolean z4, int i5, int i6, androidx.compose.ui.graphics.k2 k2Var, w wVar) {
        this(str, v0Var, bVar, i4, z4, i5, i6, k2Var);
    }

    private final void E7() {
        K7(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g G7() {
        if (this._layoutCache == null) {
            this._layoutCache = new g(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        }
        g gVar = this._layoutCache;
        l0.m(gVar);
        return gVar;
    }

    private final g H7(androidx.compose.ui.unit.d density) {
        g g4;
        a I7 = I7();
        if (I7 != null && I7.j() && (g4 = I7.g()) != null) {
            g4.m(density);
            return g4;
        }
        g G7 = G7();
        G7.m(density);
        return G7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final a I7() {
        return (a) this.textSubstitution.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean J7(String updatedText) {
        kotlin.k2 k2Var;
        a I7 = I7();
        if (I7 == null) {
            a aVar = new a(this.text, updatedText, false, null, 12, null);
            g gVar = new g(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
            gVar.m(G7().getDensity());
            aVar.k(gVar);
            K7(aVar);
            return true;
        }
        if (l0.g(updatedText, I7.i())) {
            return false;
        }
        I7.m(updatedText);
        g g4 = I7.g();
        if (g4 != null) {
            g4.s(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
            k2Var = kotlin.k2.f75408a;
        } else {
            k2Var = null;
        }
        return k2Var != null;
    }

    private final void K7(a aVar) {
        this.textSubstitution.setValue(aVar);
    }

    public static final void y7(o oVar) {
        oVar.K7(null);
    }

    @Override // androidx.compose.ui.node.q
    public void E(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
        long j4;
        if (getIsAttached()) {
            s paragraph = G7().getParagraph();
            if (paragraph == null) {
                throw new IllegalArgumentException("no paragraph");
            }
            v1 i4 = cVar.getDrawContext().i();
            boolean didOverflow = G7().getDidOverflow();
            if (didOverflow) {
                float m4 = androidx.compose.ui.unit.u.m(G7().getLayoutSize());
                float layoutSize = (int) (G7().getLayoutSize() & 4294967295L);
                i0.f.INSTANCE.getClass();
                i0.i c5 = i0.j.c(i0.f.f74147c, i0.o.a(m4, layoutSize));
                i4.C();
                v1.F(i4, c5, 0, 2, null);
            }
            try {
                androidx.compose.ui.text.style.k S = this.style.S();
                if (S == null) {
                    androidx.compose.ui.text.style.k.INSTANCE.getClass();
                    S = androidx.compose.ui.text.style.k.f21364d;
                }
                androidx.compose.ui.text.style.k kVar = S;
                c6 N = this.style.N();
                if (N == null) {
                    c6.INSTANCE.getClass();
                    N = c6.f17640e;
                }
                c6 c6Var = N;
                androidx.compose.ui.graphics.drawscope.i u4 = this.style.u();
                if (u4 == null) {
                    u4 = androidx.compose.ui.graphics.drawscope.m.f17797a;
                }
                androidx.compose.ui.graphics.drawscope.i iVar = u4;
                t1 s4 = this.style.s();
                if (s4 != null) {
                    s.E(paragraph, i4, s4, this.style.p(), c6Var, kVar, iVar, 0, 64, null);
                } else {
                    androidx.compose.ui.graphics.k2 k2Var = this.overrideColor;
                    if (k2Var != null) {
                        j4 = k2Var.a();
                    } else {
                        d2.INSTANCE.getClass();
                        j4 = d2.f17778o;
                    }
                    d2.Companion companion = d2.INSTANCE;
                    companion.getClass();
                    if (j4 == d2.f17778o) {
                        long t4 = this.style.t();
                        companion.getClass();
                        if (t4 != d2.f17778o) {
                            j4 = this.style.t();
                        } else {
                            companion.getClass();
                            j4 = d2.f17766c;
                        }
                    }
                    s.v(paragraph, i4, j4, c6Var, kVar, iVar, 0, 32, null);
                }
                if (didOverflow) {
                    i4.o();
                }
            } catch (Throwable th) {
                if (didOverflow) {
                    i4.o();
                }
                throw th;
            }
        }
    }

    public final void F7(boolean drawChanged, boolean textChanged, boolean layoutChanged) {
        if (getIsAttached()) {
            if (textChanged || (drawChanged && this.semanticsTextLayoutResult != null)) {
                z1.b(this);
            }
            if (textChanged || layoutChanged) {
                G7().s(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
                f0.b(this);
                r.a(this);
            }
            if (drawChanged) {
                r.a(this);
            }
        }
    }

    @Override // androidx.compose.ui.node.c0
    public int G(@fg.l androidx.compose.ui.layout.q qVar, @fg.l p pVar, int i4) {
        return H7(qVar).f(i4, qVar.getLayoutDirection());
    }

    public final boolean L7(@fg.m androidx.compose.ui.graphics.k2 color, @fg.l v0 style) {
        boolean g4 = l0.g(color, this.overrideColor);
        this.overrideColor = color;
        return (g4 && style.Z(this.style)) ? false : true;
    }

    public final boolean M7(@fg.l v0 style, int minLines, int maxLines, boolean softWrap, @fg.l y.b fontFamilyResolver, int overflow) {
        boolean z4 = !this.style.a0(style);
        this.style = style;
        if (this.minLines != minLines) {
            this.minLines = minLines;
            z4 = true;
        }
        if (this.maxLines != maxLines) {
            this.maxLines = maxLines;
            z4 = true;
        }
        if (this.softWrap != softWrap) {
            this.softWrap = softWrap;
            z4 = true;
        }
        if (!l0.g(this.fontFamilyResolver, fontFamilyResolver)) {
            this.fontFamilyResolver = fontFamilyResolver;
            z4 = true;
        }
        if (t.g(this.overflow, overflow)) {
            return z4;
        }
        this.overflow = overflow;
        return true;
    }

    public final boolean N7(@fg.l String text) {
        if (l0.g(this.text, text)) {
            return false;
        }
        this.text = text;
        K7(null);
        return true;
    }

    @Override // androidx.compose.ui.node.c0
    public int P(@fg.l androidx.compose.ui.layout.q qVar, @fg.l p pVar, int i4) {
        return H7(qVar).k(qVar.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.c0
    public int V(@fg.l androidx.compose.ui.layout.q qVar, @fg.l p pVar, int i4) {
        return H7(qVar).j(qVar.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        g H7 = H7(o0Var);
        boolean h4 = H7.h(j4, o0Var.getLayoutDirection());
        H7.d();
        s paragraph = H7.getParagraph();
        l0.m(paragraph);
        long layoutSize = H7.getLayoutSize();
        if (h4) {
            f0.a(this);
            Map<androidx.compose.ui.layout.a, Integer> map = this.baselineCache;
            if (map == null) {
                map = new LinkedHashMap<>(2);
            }
            map.put(androidx.compose.ui.layout.b.a(), Integer.valueOf(kotlin.math.b.L0(paragraph.k())));
            map.put(androidx.compose.ui.layout.b.b(), Integer.valueOf(kotlin.math.b.L0(paragraph.y())));
            this.baselineCache = map;
        }
        int i4 = (int) (4294967295L & layoutSize);
        i1 m02 = l0Var.m0(androidx.compose.foundation.text.modifiers.b.d(androidx.compose.ui.unit.b.INSTANCE, androidx.compose.ui.unit.u.m(layoutSize), i4));
        Map<androidx.compose.ui.layout.a, Integer> map2 = this.baselineCache;
        l0.m(map2);
        return o0Var.U3((int) (layoutSize >> 32), i4, map2, new f(m02));
    }

    @Override // androidx.compose.ui.node.y1
    public void f6(@fg.l z zVar) {
        ld.l lVar = this.semanticsTextLayoutResult;
        if (lVar == null) {
            lVar = new b();
            this.semanticsTextLayoutResult = lVar;
        }
        androidx.compose.ui.semantics.w.s1(zVar, new androidx.compose.ui.text.e(this.text, null, null, 6, null));
        a I7 = I7();
        if (I7 != null) {
            androidx.compose.ui.semantics.w.p1(zVar, I7.j());
            androidx.compose.ui.semantics.w.w1(zVar, new androidx.compose.ui.text.e(I7.i(), null, null, 6, null));
        }
        androidx.compose.ui.semantics.w.y1(zVar, null, new c(), 1, null);
        androidx.compose.ui.semantics.w.E1(zVar, null, new d(), 1, null);
        androidx.compose.ui.semantics.w.f(zVar, null, new e(), 1, null);
        androidx.compose.ui.semantics.w.Z(zVar, null, lVar, 1, null);
    }

    @Override // androidx.compose.ui.node.c0
    public int p(@fg.l androidx.compose.ui.layout.q qVar, @fg.l p pVar, int i4) {
        return H7(qVar).f(i4, qVar.getLayoutDirection());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(java.lang.String r12, androidx.compose.ui.text.v0 r13, androidx.compose.ui.text.font.y.b r14, int r15, boolean r16, int r17, int r18, androidx.compose.ui.graphics.k2 r19, int r20, kotlin.jvm.internal.w r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 8
            if (r1 == 0) goto L11
            androidx.compose.ui.text.style.t$a r1 = androidx.compose.ui.text.style.t.INSTANCE
            r1.getClass()
            int r1 = androidx.compose.ui.text.style.t.a()
            r6 = r1
            goto L12
        L11:
            r6 = r15
        L12:
            r1 = r0 & 16
            r2 = 1
            if (r1 == 0) goto L19
            r7 = r2
            goto L1b
        L19:
            r7 = r16
        L1b:
            r1 = r0 & 32
            if (r1 == 0) goto L24
            r1 = 2147483647(0x7fffffff, float:NaN)
            r8 = r1
            goto L26
        L24:
            r8 = r17
        L26:
            r1 = r0 & 64
            if (r1 == 0) goto L2c
            r9 = r2
            goto L2e
        L2c:
            r9 = r18
        L2e:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L35
            r0 = 0
            r10 = r0
            goto L37
        L35:
            r10 = r19
        L37:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.o.<init>(java.lang.String, androidx.compose.ui.text.v0, androidx.compose.ui.text.font.y$b, int, boolean, int, int, androidx.compose.ui.graphics.k2, int, kotlin.jvm.internal.w):void");
    }

    /* compiled from: TextStringSimpleNode.kt */
    @u(parameters = 0)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010#R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/compose/foundation/text/modifiers/o$a;", "", "", "original", "substitution", "", "isShowingSubstitution", "Landroidx/compose/foundation/text/modifiers/g;", "layoutCache", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/foundation/text/modifiers/g;)V", "a", "()Ljava/lang/String;", "b", "c", "()Z", "d", "()Landroidx/compose/foundation/text/modifiers/g;", "e", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/foundation/text/modifiers/g;)Landroidx/compose/foundation/text/modifiers/o$a;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "i", "m", "(Ljava/lang/String;)V", "Z", "j", "l", "(Z)V", "Landroidx/compose/foundation/text/modifiers/g;", "g", "k", "(Landroidx/compose/foundation/text/modifiers/g;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: e, reason: collision with root package name */
        public static final int f7824e = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String original;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private String substitution;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean isShowingSubstitution;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private g layoutCache;

        public a(@fg.l String str, @fg.l String str2, boolean z4, @fg.m g gVar) {
            this.original = str;
            this.substitution = str2;
            this.isShowingSubstitution = z4;
            this.layoutCache = gVar;
        }

        public static a f(a aVar, String str, String str2, boolean z4, g gVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = aVar.original;
            }
            if ((i4 & 2) != 0) {
                str2 = aVar.substitution;
            }
            if ((i4 & 4) != 0) {
                z4 = aVar.isShowingSubstitution;
            }
            if ((i4 & 8) != 0) {
                gVar = aVar.layoutCache;
            }
            aVar.getClass();
            return new a(str, str2, z4, gVar);
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final String getOriginal() {
            return this.original;
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final String getSubstitution() {
            return this.substitution;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        @fg.m
        /* renamed from: d, reason: from getter */
        public final g getLayoutCache() {
            return this.layoutCache;
        }

        @fg.l
        public final a e(@fg.l String original, @fg.l String substitution, boolean isShowingSubstitution, @fg.m g layoutCache) {
            return new a(original, substitution, isShowingSubstitution, layoutCache);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return l0.g(this.original, aVar.original) && l0.g(this.substitution, aVar.substitution) && this.isShowingSubstitution == aVar.isShowingSubstitution && l0.g(this.layoutCache, aVar.layoutCache);
        }

        @fg.m
        public final g g() {
            return this.layoutCache;
        }

        @fg.l
        public final String h() {
            return this.original;
        }

        public int hashCode() {
            int a5 = d1.a(this.isShowingSubstitution, n.a(this.substitution, this.original.hashCode() * 31, 31), 31);
            g gVar = this.layoutCache;
            return a5 + (gVar == null ? 0 : gVar.hashCode());
        }

        @fg.l
        public final String i() {
            return this.substitution;
        }

        public final boolean j() {
            return this.isShowingSubstitution;
        }

        public final void k(@fg.m g gVar) {
            this.layoutCache = gVar;
        }

        public final void l(boolean z4) {
            this.isShowingSubstitution = z4;
        }

        public final void m(@fg.l String str) {
            this.substitution = str;
        }

        @fg.l
        public String toString() {
            return "TextSubstitutionValue(original=" + this.original + ", substitution=" + this.substitution + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }

        public /* synthetic */ a(String str, String str2, boolean z4, g gVar, int i4, w wVar) {
            this(str, str2, (i4 & 4) != 0 ? false : z4, (i4 & 8) != 0 ? null : gVar);
        }
    }

    private o(String str, v0 v0Var, y.b bVar, int i4, boolean z4, int i5, int i6, androidx.compose.ui.graphics.k2 k2Var) {
        k2 g4;
        this.text = str;
        this.style = v0Var;
        this.fontFamilyResolver = bVar;
        this.overflow = i4;
        this.softWrap = z4;
        this.maxLines = i5;
        this.minLines = i6;
        this.overrideColor = k2Var;
        g4 = t4.g(null, null, 2, null);
        this.textSubstitution = g4;
    }
}
