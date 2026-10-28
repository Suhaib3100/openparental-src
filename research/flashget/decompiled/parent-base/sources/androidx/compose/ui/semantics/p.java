package androidx.compose.ui.semantics;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.node.p1;
import androidx.compose.ui.node.x1;
import androidx.compose.ui.node.y1;
import androidx.compose.ui.node.z1;
import androidx.compose.ui.q;
import androidx.compose.ui.semantics.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: SemanticsNode.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\r*\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010$\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\r0 ¢\u0006\u0002\b\"H\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0015\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b+\u0010,J\u0011\u0010.\u001a\u0004\u0018\u00010-H\u0000¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0000H\u0000¢\u0006\u0004\b0\u00101R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010=R\"\u0010A\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u00105\u001a\u0004\b>\u00107\"\u0004\b?\u0010@R\u0018\u0010C\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010BR\u0017\u0010G\u001a\u00020(8\u0006¢\u0006\f\n\u0004\bD\u0010+\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u00107R\u0014\u0010K\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u00107R\u0011\u0010O\u001a\u00020L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0013\u0010S\u001a\u0004\u0018\u00010P8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0011\u0010W\u001a\u00020T8F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0017\u0010[\u001a\u00020X8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0011\u0010]\u001a\u00020T8F¢\u0006\u0006\u001a\u0004\b\\\u0010VR\u0017\u0010`\u001a\u00020^8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b_\u0010ZR\u0011\u0010b\u001a\u00020T8F¢\u0006\u0006\u001a\u0004\ba\u0010VR\u0017\u0010d\u001a\u00020^8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bc\u0010ZR\u0014\u0010f\u001a\u00020T8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\be\u0010VR\u0014\u0010h\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bg\u00107R\u0011\u0010j\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bi\u0010=R\u0017\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bn\u0010lR\u0011\u0010q\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bp\u00107R\u0013\u0010s\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\br\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006t"}, d2 = {"Landroidx/compose/ui/semantics/p;", "", "Landroidx/compose/ui/q$d;", "outerSemanticsNode", "", "mergingEnabled", "Landroidx/compose/ui/node/h0;", "layoutNode", "Landroidx/compose/ui/semantics/l;", "unmergedConfig", "<init>", "(Landroidx/compose/ui/q$d;ZLandroidx/compose/ui/node/h0;Landroidx/compose/ui/semantics/l;)V", "mergedConfig", "Lkotlin/k2;", "G", "(Landroidx/compose/ui/semantics/l;)V", "", "list", "d", "(Landroidx/compose/ui/node/h0;Ljava/util/List;)V", "includeReplacedSemantics", "includeFakeNodes", "", "m", "(ZZ)Ljava/util/List;", "f", "(Ljava/util/List;)Ljava/util/List;", "unmergedChildren", "b", "(Ljava/util/List;)V", "Landroidx/compose/ui/semantics/i;", "role", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/z;", "Lkotlin/u;", "properties", "c", "(Landroidx/compose/ui/semantics/i;Lld/l;)Landroidx/compose/ui/semantics/p;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "h", "(Landroidx/compose/ui/layout/a;)I", "I", "(Z)Ljava/util/List;", "Landroidx/compose/ui/node/e1;", "e", "()Landroidx/compose/ui/node/e1;", "a", "()Landroidx/compose/ui/semantics/p;", "Landroidx/compose/ui/q$d;", "s", "()Landroidx/compose/ui/q$d;", "Z", "r", "()Z", "Landroidx/compose/ui/node/h0;", "q", "()Landroidx/compose/ui/node/h0;", "Landroidx/compose/ui/semantics/l;", "A", "()Landroidx/compose/ui/semantics/l;", "B", "H", "(Z)V", "isFake", "Landroidx/compose/ui/semantics/p;", "fakeNodeParent", "g", "o", "()I", "id", "C", "isMergingSemanticsOfDescendants", "F", "isUnmergedLeafNode", "Landroidx/compose/ui/layout/z;", "p", "()Landroidx/compose/ui/layout/z;", "layoutInfo", "Landroidx/compose/ui/node/x1;", "x", "()Landroidx/compose/ui/node/x1;", "root", "Li0/i;", "z", "()Li0/i;", "touchBoundsInRoot", "Landroidx/compose/ui/unit/u;", "y", "()J", "size", "j", "boundsInRoot", "Li0/f;", "u", "positionInRoot", "k", "boundsInWindow", "v", "positionInWindow", "i", "boundsInParent", "E", "isTransparent", "n", "config", "l", "()Ljava/util/List;", "children", "w", "replacedChildren", "D", "isRoot", "t", "parent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,475:1\n1#2:476\n76#3:477\n76#3:491\n76#3:502\n33#4,6:478\n33#4,6:496\n460#5,7:484\n467#5,4:492\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n*L\n185#1:477\n267#1:491\n381#1:502\n227#1:478,6\n360#1:496,6\n262#1:484,7\n262#1:492,4\n*E\n"})
/* loaded from: classes.dex */
public final class p {

    /* renamed from: h, reason: collision with root package name */
    public static final int f20353h = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q.d outerSemanticsNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean mergingEnabled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h0 layoutNode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l unmergedConfig;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isFake;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private p fakeNodeParent;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<z, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f20361b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar) {
            super(1);
            this.f20361b = iVar;
        }

        public final void a(@fg.l z zVar) {
            w.l1(zVar, this.f20361b.getValue());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(z zVar) {
            a(zVar);
            return k2.f75408a;
        }
    }

    /* compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<z, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f20362b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f20362b = str;
        }

        public final void a(@fg.l z zVar) {
            w.a1(zVar, this.f20362b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(z zVar) {
            a(zVar);
            return k2.f75408a;
        }
    }

    /* compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/ui/semantics/p$c", "Landroidx/compose/ui/node/y1;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "f6", "(Landroidx/compose/ui/semantics/z;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends q.d implements y1 {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ld.l<z, k2> f20363p;

        /* JADX WARN: Multi-variable type inference failed */
        c(ld.l<? super z, k2> lVar) {
            this.f20363p = lVar;
        }

        @Override // androidx.compose.ui.node.y1
        public void f6(@fg.l z zVar) {
            this.f20363p.invoke(zVar);
        }
    }

    /* compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/h0;", "it", "", "a", "(Landroidx/compose/ui/node/h0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.l<h0, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f20364b = new d(1);

        d() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l h0 h0Var) {
            l Z = h0Var.Z();
            boolean z4 = false;
            if (Z != null && Z.getIsMergingSemanticsOfDescendants()) {
                z4 = true;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/h0;", "it", "", "a", "(Landroidx/compose/ui/node/h0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends n0 implements ld.l<h0, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f20365b = new e(1);

        e() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l h0 h0Var) {
            l Z = h0Var.Z();
            boolean z4 = false;
            if (Z != null && Z.getIsMergingSemanticsOfDescendants()) {
                z4 = true;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/h0;", "it", "", "a", "(Landroidx/compose/ui/node/h0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode$parent$2\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,475:1\n76#2:476\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode$parent$2\n*L\n348#1:476\n*E\n"})
    static final class f extends n0 implements ld.l<h0, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f20366b = new f(1);

        f() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l h0 h0Var) {
            return Boolean.valueOf(h0Var.getNodes().t(8));
        }
    }

    public p(@fg.l q.d dVar, boolean z4, @fg.l h0 h0Var, @fg.l l lVar) {
        this.outerSemanticsNode = dVar;
        this.mergingEnabled = z4;
        this.layoutNode = h0Var;
        this.unmergedConfig = lVar;
        this.id = h0Var.getSemanticsId();
    }

    private final boolean C() {
        return this.mergingEnabled && this.unmergedConfig.getIsMergingSemanticsOfDescendants();
    }

    private final void G(l mergedConfig) {
        if (this.unmergedConfig.getIsClearingSemantics()) {
            return;
        }
        List J = J(this, false, 1, null);
        int size = J.size();
        for (int i4 = 0; i4 < size; i4++) {
            p pVar = (p) J.get(i4);
            if (!pVar.C()) {
                mergedConfig.r(pVar.unmergedConfig);
                pVar.G(mergedConfig);
            }
        }
    }

    public static /* synthetic */ List J(p pVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return pVar.I(z4);
    }

    private final void b(List<p> unmergedChildren) {
        i j4;
        j4 = q.j(this);
        if (j4 != null && this.unmergedConfig.getIsMergingSemanticsOfDescendants() && !unmergedChildren.isEmpty()) {
            unmergedChildren.add(c(j4, new a(j4)));
        }
        l lVar = this.unmergedConfig;
        t tVar = t.f20369a;
        if (lVar.f(tVar.c()) && !unmergedChildren.isEmpty() && this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            List list = (List) this.unmergedConfig.m(tVar.c(), m.a.f20351b);
            String str = list != null ? (String) kotlin.collections.w.G2(list) : null;
            if (str != null) {
                unmergedChildren.add(0, c(null, new b(str)));
            }
        }
    }

    private final p c(i role, ld.l<? super z, k2> properties) {
        l lVar = new l();
        lVar.v(false);
        lVar.s(false);
        properties.invoke(lVar);
        p pVar = new p(new c(properties), false, new h0(true, role != null ? q.k(this) : q.g(this)), lVar);
        pVar.isFake = true;
        pVar.fakeNodeParent = this;
        return pVar;
    }

    private final void d(h0 h0Var, List<p> list) {
        androidx.compose.runtime.collection.g<h0> F0 = h0Var.F0();
        int size = F0.getSize();
        if (size > 0) {
            h0[] L = F0.L();
            int i4 = 0;
            do {
                h0 h0Var2 = L[i4];
                if (h0Var2.f()) {
                    if (h0Var2.getNodes().t(8)) {
                        list.add(q.a(h0Var2, this.mergingEnabled));
                    } else {
                        d(h0Var2, list);
                    }
                }
                i4++;
            } while (i4 < size);
        }
    }

    private final List<p> f(List<p> list) {
        List J = J(this, false, 1, null);
        int size = J.size();
        for (int i4 = 0; i4 < size; i4++) {
            p pVar = (p) J.get(i4);
            if (pVar.C()) {
                list.add(pVar);
            } else if (!pVar.unmergedConfig.getIsClearingSemantics()) {
                pVar.f(list);
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List g(p pVar, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = new ArrayList();
        }
        return pVar.f(list);
    }

    private final List<p> m(boolean includeReplacedSemantics, boolean includeFakeNodes) {
        return (includeReplacedSemantics || !this.unmergedConfig.getIsClearingSemantics()) ? C() ? g(this, null, 1, null) : I(includeFakeNodes) : j0.f74919b;
    }

    @fg.l
    /* renamed from: A, reason: from getter */
    public final l getUnmergedConfig() {
        return this.unmergedConfig;
    }

    /* renamed from: B, reason: from getter */
    public final boolean getIsFake() {
        return this.isFake;
    }

    public final boolean D() {
        return t() == null;
    }

    public final boolean E() {
        e1 e4 = e();
        if (e4 != null) {
            return e4.Y3();
        }
        return false;
    }

    public final boolean F() {
        return !this.isFake && m(false, true).isEmpty() && q.h(this.layoutNode, d.f20364b) == null;
    }

    public final void H(boolean z4) {
        this.isFake = z4;
    }

    @fg.l
    public final List<p> I(boolean includeFakeNodes) {
        if (this.isFake) {
            return j0.f74919b;
        }
        ArrayList arrayList = new ArrayList();
        d(this.layoutNode, arrayList);
        if (includeFakeNodes) {
            b(arrayList);
        }
        return arrayList;
    }

    @fg.l
    public final p a() {
        return new p(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }

    @fg.m
    public final e1 e() {
        if (this.isFake) {
            p t4 = t();
            if (t4 != null) {
                return t4.e();
            }
            return null;
        }
        androidx.compose.ui.node.j i4 = q.i(this.layoutNode);
        if (i4 == null) {
            i4 = this.outerSemanticsNode;
        }
        return androidx.compose.ui.node.k.m(i4, 8);
    }

    public final int h(@fg.l androidx.compose.ui.layout.a alignmentLine) {
        e1 e4 = e();
        if (e4 != null) {
            return e4.q(alignmentLine);
        }
        return Integer.MIN_VALUE;
    }

    @fg.l
    public final i0.i i() {
        androidx.compose.ui.layout.u P0;
        p t4 = t();
        if (t4 == null) {
            i0.i.INSTANCE.getClass();
            return i0.i.f74153g;
        }
        e1 e4 = e();
        if (e4 != null) {
            if (!e4.f()) {
                e4 = null;
            }
            if (e4 != null && (P0 = e4.P0()) != null) {
                return androidx.compose.ui.layout.u.A(androidx.compose.ui.node.k.m(t4.outerSemanticsNode, 8), P0, false, 2, null);
            }
        }
        i0.i.INSTANCE.getClass();
        return i0.i.f74153g;
    }

    @fg.l
    public final i0.i j() {
        i0.i b5;
        e1 e4 = e();
        if (e4 != null) {
            if (!e4.f()) {
                e4 = null;
            }
            if (e4 != null && (b5 = androidx.compose.ui.layout.v.b(e4)) != null) {
                return b5;
            }
        }
        i0.i.INSTANCE.getClass();
        return i0.i.f74153g;
    }

    @fg.l
    public final i0.i k() {
        i0.i c5;
        e1 e4 = e();
        if (e4 != null) {
            if (!e4.f()) {
                e4 = null;
            }
            if (e4 != null && (c5 = androidx.compose.ui.layout.v.c(e4)) != null) {
                return c5;
            }
        }
        i0.i.INSTANCE.getClass();
        return i0.i.f74153g;
    }

    @fg.l
    public final List<p> l() {
        return m(!this.mergingEnabled, false);
    }

    @fg.l
    public final l n() {
        if (!C()) {
            return this.unmergedConfig;
        }
        l i4 = this.unmergedConfig.i();
        G(i4);
        return i4;
    }

    /* renamed from: o, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @fg.l
    public final androidx.compose.ui.layout.z p() {
        return this.layoutNode;
    }

    @fg.l
    /* renamed from: q, reason: from getter */
    public final h0 getLayoutNode() {
        return this.layoutNode;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getMergingEnabled() {
        return this.mergingEnabled;
    }

    @fg.l
    /* renamed from: s, reason: from getter */
    public final q.d getOuterSemanticsNode() {
        return this.outerSemanticsNode;
    }

    @fg.m
    public final p t() {
        p pVar = this.fakeNodeParent;
        if (pVar != null) {
            return pVar;
        }
        h0 h4 = this.mergingEnabled ? q.h(this.layoutNode, e.f20365b) : null;
        if (h4 == null) {
            h4 = q.h(this.layoutNode, f.f20366b);
        }
        if (h4 == null) {
            return null;
        }
        return q.a(h4, this.mergingEnabled);
    }

    public final long u() {
        e1 e4 = e();
        if (e4 != null) {
            if (!e4.f()) {
                e4 = null;
            }
            if (e4 != null) {
                return androidx.compose.ui.layout.v.f(e4);
            }
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74147c;
    }

    public final long v() {
        e1 e4 = e();
        if (e4 != null) {
            if (!e4.f()) {
                e4 = null;
            }
            if (e4 != null) {
                return androidx.compose.ui.layout.v.g(e4);
            }
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74147c;
    }

    @fg.l
    public final List<p> w() {
        return m(false, true);
    }

    @fg.m
    public final x1 x() {
        p1 owner = this.layoutNode.getOwner();
        if (owner != null) {
            return owner.P();
        }
        return null;
    }

    public final long y() {
        e1 e4 = e();
        if (e4 != null) {
            return e4.c();
        }
        androidx.compose.ui.unit.u.INSTANCE.getClass();
        return androidx.compose.ui.unit.u.f21529c;
    }

    @fg.l
    public final i0.i z() {
        androidx.compose.ui.node.j jVar;
        if (this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            jVar = q.i(this.layoutNode);
            if (jVar == null) {
                jVar = this.outerSemanticsNode;
            }
        } else {
            jVar = this.outerSemanticsNode;
        }
        return z1.c(jVar.getNode(), z1.a(this.unmergedConfig));
    }
}
