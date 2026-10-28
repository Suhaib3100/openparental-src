package androidx.compose.ui.node;

import androidx.compose.ui.node.d;
import androidx.compose.ui.node.p1;
import androidx.compose.ui.q;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: BackwardsCompatNode.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000fB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\u001b\u0010\u001d\u001a\u00020\u00142\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010\u0016J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010\"\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\"\u0010\u0016J\r\u0010#\u001a\u00020\u0014¢\u0006\u0004\b#\u0010\u0016J&\u0010*\u001a\u00020)*\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\b*\u0010+J#\u00100\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J#\u00103\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b3\u00101J#\u00104\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b4\u00101J#\u00105\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b5\u00101J\u0013\u00107\u001a\u00020\u0014*\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0013\u0010:\u001a\u00020\u0014*\u000209H\u0016¢\u0006\u0004\b:\u0010;J*\u0010B\u001a\u00020\u00142\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0016ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0014H\u0016¢\u0006\u0004\bD\u0010\u0016J\u000f\u0010E\u001a\u00020\u0017H\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0017H\u0016¢\u0006\u0004\bG\u0010FJ\u001f\u0010K\u001a\u0004\u0018\u00010I*\u00020H2\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\u00142\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u001a\u0010R\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020@H\u0016ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u00142\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bT\u0010PJ\u0017\u0010W\u001a\u00020\u00142\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b^\u0010_R*\u0010\u0011\u001a\u00020\u00102\u0006\u0010`\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010\u0013R\u0016\u0010f\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010eR\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR:\u0010t\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030l0kj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030l`m8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0018\u0010w\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010z\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0014\u0010~\u001a\u00020{8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u001c\u0010Q\u001a\u00020\u007f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R'\u0010\u0088\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010K*\b\u0012\u0004\u0012\u00028\u00000l8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0016\u0010\u008a\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010F\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008b\u0001"}, d2 = {"Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/node/q;", "Landroidx/compose/ui/node/y1;", "Landroidx/compose/ui/node/u1;", "Landroidx/compose/ui/modifier/j;", "Landroidx/compose/ui/modifier/n;", "Landroidx/compose/ui/node/s1;", "Landroidx/compose/ui/node/b0;", "Landroidx/compose/ui/node/s;", "Landroidx/compose/ui/focus/i;", "Landroidx/compose/ui/focus/w;", "Landroidx/compose/ui/focus/e0;", "Landroidx/compose/ui/node/q1;", "Landroidx/compose/ui/draw/d;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/q$c;", "element", "<init>", "(Landroidx/compose/ui/q$c;)V", "Lkotlin/k2;", "F7", "()V", "", "duringAttach", "B7", "(Z)V", "G7", "Landroidx/compose/ui/modifier/l;", "I7", "(Landroidx/compose/ui/modifier/l;)V", "i7", "j7", "P4", "C7", "H7", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "", "height", "P", "(Landroidx/compose/ui/layout/q;Landroidx/compose/ui/layout/p;I)I", "width", "G", "V", "p", "Landroidx/compose/ui/graphics/drawscope/c;", "E", "(Landroidx/compose/ui/graphics/drawscope/c;)V", "Landroidx/compose/ui/semantics/z;", "f6", "(Landroidx/compose/ui/semantics/z;)V", "Landroidx/compose/ui/input/pointer/p;", "pointerEvent", "Landroidx/compose/ui/input/pointer/r;", "pass", "Landroidx/compose/ui/unit/u;", "bounds", "g1", "(Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/r;J)V", "E4", "W5", "()Z", "m1", "Landroidx/compose/ui/unit/d;", "", "parentData", "T", "(Landroidx/compose/ui/unit/d;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/u;", "coordinates", "W", "(Landroidx/compose/ui/layout/u;)V", "size", "l", "(J)V", "q", "Landroidx/compose/ui/focus/j0;", "focusState", "e0", "(Landroidx/compose/ui/focus/j0;)V", "Landroidx/compose/ui/focus/t;", "focusProperties", "V3", "(Landroidx/compose/ui/focus/t;)V", "", "toString", "()Ljava/lang/String;", "value", "Landroidx/compose/ui/q$c;", "z7", "()Landroidx/compose/ui/q$c;", "D7", "Z", "invalidateCache", "Landroidx/compose/ui/modifier/a;", "r", "Landroidx/compose/ui/modifier/a;", "_providedValues", "Ljava/util/HashSet;", "Landroidx/compose/ui/modifier/c;", "Lkotlin/collections/HashSet;", "s", "Ljava/util/HashSet;", "A7", "()Ljava/util/HashSet;", "E7", "(Ljava/util/HashSet;)V", "readValues", "t", "Landroidx/compose/ui/layout/u;", "lastOnPlacedCoordinates", "b", "()Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "layoutDirection", "Li0/n;", "e", "()J", "Landroidx/compose/ui/modifier/i;", "A1", "()Landroidx/compose/ui/modifier/i;", "providedValues", "v", "(Landroidx/compose/ui/modifier/c;)Ljava/lang/Object;", "current", "G3", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBackwardsCompatNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,449:1\n1#2:450\n1#2:481\n80#3:451\n76#3:453\n80#3:457\n74#3:459\n72#3:461\n84#3:463\n86#3:465\n78#3:469\n76#3:471\n84#3:473\n80#3:474\n261#4:452\n261#4:454\n261#4:458\n261#4:460\n261#4:462\n261#4:464\n261#4:466\n261#4:470\n261#4:472\n261#4:496\n735#5,2:455\n728#5,2:467\n230#6,5:475\n58#6:480\n59#6,8:482\n385#6,6:490\n395#6,2:497\n397#6,8:502\n405#6,9:513\n414#6,8:525\n68#6,7:533\n234#7,3:499\n237#7,3:522\n1208#8:510\n1187#8,2:511\n*S KotlinDebug\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n*L\n258#1:481\n116#1:451\n126#1:453\n137#1:457\n145#1:459\n153#1:461\n169#1:463\n194#1:465\n207#1:469\n212#1:471\n222#1:473\n258#1:474\n116#1:452\n126#1:454\n137#1:458\n145#1:460\n153#1:462\n169#1:464\n194#1:466\n207#1:470\n212#1:472\n258#1:496\n130#1:455,2\n205#1:467,2\n258#1:475,5\n258#1:480\n258#1:482,8\n258#1:490,6\n258#1:497,2\n258#1:502,8\n258#1:513,9\n258#1:525,8\n258#1:533,7\n258#1:499,3\n258#1:522,3\n258#1:510\n258#1:511,2\n*E\n"})
/* loaded from: classes.dex */
public final class c extends q.d implements c0, q, y1, u1, androidx.compose.ui.modifier.j, androidx.compose.ui.modifier.n, s1, b0, s, androidx.compose.ui.focus.i, androidx.compose.ui.focus.w, androidx.compose.ui.focus.e0, q1, androidx.compose.ui.draw.d {

    /* renamed from: u, reason: collision with root package name */
    public static final int f19183u = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private q.c element;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean invalidateCache;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.modifier.a _providedValues;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private HashSet<androidx.compose.ui.modifier.c<?>> readValues;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.layout.u lastOnPlacedCoordinates;

    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {
        a() {
            super(0);
        }

        public final void a() {
            c.this.H7();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/node/c$b", "Landroidx/compose/ui/node/p1$b;", "Lkotlin/k2;", "s", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nBackwardsCompatNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode$initializeModifier$3\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,449:1\n84#2:450\n*S KotlinDebug\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode$initializeModifier$3\n*L\n186#1:450\n*E\n"})
    public static final class b implements p1.b {
        b() {
        }

        @Override // androidx.compose.ui.node.p1.b
        public void s() {
            if (c.this.lastOnPlacedCoordinates == null) {
                c cVar = c.this;
                cVar.q(k.m(cVar, 128));
            }
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.node.c$c, reason: collision with other inner class name */
    static final class C0345c extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q.c f19191b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f19192c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0345c(q.c cVar, c cVar2) {
            super(0);
            this.f19191b = cVar;
            this.f19192c = cVar2;
        }

        public final void a() {
            ((androidx.compose.ui.draw.j) this.f19191b).y4(this.f19192c);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.a<k2> {
        d() {
            super(0);
        }

        public final void a() {
            q.c element = c.this.getElement();
            kotlin.jvm.internal.l0.n(element, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((androidx.compose.ui.modifier.d) element).e4(c.this);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    public c(@fg.l q.c cVar) {
        s7(h1.f(cVar));
        this.element = cVar;
        this.invalidateCache = true;
        this.readValues = new HashSet<>();
    }

    private final void B7(boolean duringAttach) {
        boolean e4;
        boolean e5;
        boolean e6;
        boolean e7;
        if (!getIsAttached()) {
            throw new IllegalStateException("initializeModifier called on unattached node");
        }
        q.c cVar = this.element;
        if ((getKindSet() & 32) != 0) {
            if (cVar instanceof androidx.compose.ui.modifier.d) {
                w7(new a());
            }
            if (cVar instanceof androidx.compose.ui.modifier.l) {
                I7((androidx.compose.ui.modifier.l) cVar);
            }
        }
        if ((getKindSet() & 4) != 0) {
            if (cVar instanceof androidx.compose.ui.draw.j) {
                this.invalidateCache = true;
            }
            if (!duringAttach) {
                f0.a(this);
            }
        }
        if ((getKindSet() & 2) != 0) {
            e7 = androidx.compose.ui.node.d.e(this);
            if (e7) {
                e1 coordinator = getCoordinator();
                kotlin.jvm.internal.l0.m(coordinator);
                ((d0) coordinator).V5(this);
                coordinator.e4();
            }
            if (!duringAttach) {
                f0.a(this);
                k.p(this).S0();
            }
        }
        if (cVar instanceof androidx.compose.ui.layout.l1) {
            ((androidx.compose.ui.layout.l1) cVar).K2(k.p(this));
        }
        if ((getKindSet() & 128) != 0) {
            if (cVar instanceof androidx.compose.ui.layout.b1) {
                e6 = androidx.compose.ui.node.d.e(this);
                if (e6) {
                    k.p(this).S0();
                }
            }
            if (cVar instanceof androidx.compose.ui.layout.y0) {
                this.lastOnPlacedCoordinates = null;
                e5 = androidx.compose.ui.node.d.e(this);
                if (e5) {
                    k.q(this).G(new b());
                }
            }
        }
        if ((getKindSet() & 256) != 0 && (cVar instanceof androidx.compose.ui.layout.v0)) {
            e4 = androidx.compose.ui.node.d.e(this);
            if (e4) {
                k.p(this).S0();
            }
        }
        if (cVar instanceof androidx.compose.ui.focus.c0) {
            ((androidx.compose.ui.focus.c0) cVar).k1().g().b(this);
        }
        if ((getKindSet() & 16) != 0 && (cVar instanceof androidx.compose.ui.input.pointer.i0)) {
            ((androidx.compose.ui.input.pointer.i0) cVar).getPointerInputFilter().j(getCoordinator());
        }
        if ((getKindSet() & 8) != 0) {
            k.q(this).i0();
        }
    }

    private final void F7() {
        d.a aVar;
        if (!getIsAttached()) {
            throw new IllegalStateException("unInitializeModifier called on unattached node");
        }
        q.c cVar = this.element;
        if ((getKindSet() & 32) != 0) {
            if (cVar instanceof androidx.compose.ui.modifier.l) {
                k.q(this).getModifierLocalManager().e(this, ((androidx.compose.ui.modifier.l) cVar).getKey());
            }
            if (cVar instanceof androidx.compose.ui.modifier.d) {
                aVar = androidx.compose.ui.node.d.f19216a;
                ((androidx.compose.ui.modifier.d) cVar).e4(aVar);
            }
        }
        if ((getKindSet() & 8) != 0) {
            k.q(this).i0();
        }
        if (cVar instanceof androidx.compose.ui.focus.c0) {
            ((androidx.compose.ui.focus.c0) cVar).k1().g().j0(this);
        }
    }

    private final void G7() {
        ld.l lVar;
        q.c cVar = this.element;
        if (cVar instanceof androidx.compose.ui.draw.j) {
            r1 snapshotObserver = k.q(this).getSnapshotObserver();
            lVar = androidx.compose.ui.node.d.f19217b;
            snapshotObserver.i(this, lVar, new C0345c(cVar, this));
        }
        this.invalidateCache = false;
    }

    private final void I7(androidx.compose.ui.modifier.l<?> element) {
        boolean e4;
        androidx.compose.ui.modifier.a aVar = this._providedValues;
        if (aVar != null && aVar.a(element.getKey())) {
            aVar.e(element);
            k.q(this).getModifierLocalManager().g(this, element.getKey());
            return;
        }
        this._providedValues = new androidx.compose.ui.modifier.a(element);
        e4 = androidx.compose.ui.node.d.e(this);
        if (e4) {
            k.q(this).getModifierLocalManager().b(this, element.getKey());
        }
    }

    @Override // androidx.compose.ui.modifier.j
    @fg.l
    /* renamed from: A1 */
    public androidx.compose.ui.modifier.i getProvidedValues() {
        androidx.compose.ui.modifier.a aVar = this._providedValues;
        return aVar != null ? aVar : androidx.compose.ui.modifier.b.f19127b;
    }

    @fg.l
    public final HashSet<androidx.compose.ui.modifier.c<?>> A7() {
        return this.readValues;
    }

    public final void C7() {
        this.invalidateCache = true;
        r.a(this);
    }

    public final void D7(@fg.l q.c cVar) {
        if (getIsAttached()) {
            F7();
        }
        this.element = cVar;
        s7(h1.f(cVar));
        if (getIsAttached()) {
            B7(false);
        }
    }

    @Override // androidx.compose.ui.node.q
    public void E(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
        q.c cVar2 = this.element;
        kotlin.jvm.internal.l0.n(cVar2, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        androidx.compose.ui.draw.k kVar = (androidx.compose.ui.draw.k) cVar2;
        if (this.invalidateCache && (cVar2 instanceof androidx.compose.ui.draw.j)) {
            G7();
        }
        kVar.E(cVar);
    }

    @Override // androidx.compose.ui.node.u1
    public void E4() {
        q.c cVar = this.element;
        kotlin.jvm.internal.l0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((androidx.compose.ui.input.pointer.i0) cVar).getPointerInputFilter().g();
    }

    public final void E7(@fg.l HashSet<androidx.compose.ui.modifier.c<?>> hashSet) {
        this.readValues = hashSet;
    }

    @Override // androidx.compose.ui.node.c0
    public int G(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        q.c cVar = this.element;
        kotlin.jvm.internal.l0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.b0) cVar).G(qVar, pVar, i4);
    }

    @Override // androidx.compose.ui.node.q1
    public boolean G3() {
        return getIsAttached();
    }

    public final void H7() {
        ld.l lVar;
        if (getIsAttached()) {
            this.readValues.clear();
            r1 snapshotObserver = k.q(this).getSnapshotObserver();
            lVar = androidx.compose.ui.node.d.f19218c;
            snapshotObserver.i(this, lVar, new d());
        }
    }

    @Override // androidx.compose.ui.node.c0
    public int P(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        q.c cVar = this.element;
        kotlin.jvm.internal.l0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.b0) cVar).P(qVar, pVar, i4);
    }

    @Override // androidx.compose.ui.node.q
    public void P4() {
        this.invalidateCache = true;
        r.a(this);
    }

    @Override // androidx.compose.ui.node.s1
    @fg.m
    public Object T(@fg.l androidx.compose.ui.unit.d dVar, @fg.m Object obj) {
        q.c cVar = this.element;
        kotlin.jvm.internal.l0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((androidx.compose.ui.layout.f1) cVar).T(dVar, obj);
    }

    @Override // androidx.compose.ui.node.c0
    public int V(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        q.c cVar = this.element;
        kotlin.jvm.internal.l0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.b0) cVar).V(qVar, pVar, i4);
    }

    @Override // androidx.compose.ui.focus.w
    public void V3(@fg.l androidx.compose.ui.focus.t focusProperties) {
        q.c cVar = this.element;
        if (!(cVar instanceof androidx.compose.ui.focus.p)) {
            throw new IllegalStateException("applyFocusProperties called on wrong node");
        }
        ((androidx.compose.ui.focus.p) cVar).R4(new androidx.compose.ui.focus.o(focusProperties));
    }

    @Override // androidx.compose.ui.node.s
    public void W(@fg.l androidx.compose.ui.layout.u coordinates) {
        q.c cVar = this.element;
        kotlin.jvm.internal.l0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((androidx.compose.ui.layout.v0) cVar).W(coordinates);
    }

    @Override // androidx.compose.ui.node.u1
    public boolean W5() {
        q.c cVar = this.element;
        kotlin.jvm.internal.l0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((androidx.compose.ui.input.pointer.i0) cVar).getPointerInputFilter().c();
    }

    @Override // androidx.compose.ui.draw.d
    @fg.l
    public androidx.compose.ui.unit.d b() {
        return k.p(this).getDensity();
    }

    @Override // androidx.compose.ui.draw.d
    public long e() {
        return androidx.compose.ui.unit.v.f(k.m(this, 128).c());
    }

    @Override // androidx.compose.ui.focus.i
    public void e0(@fg.l androidx.compose.ui.focus.j0 focusState) {
        q.c cVar = this.element;
        if (!(cVar instanceof androidx.compose.ui.focus.g)) {
            throw new IllegalStateException("onFocusEvent called on wrong node");
        }
        ((androidx.compose.ui.focus.g) cVar).e0(focusState);
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        q.c cVar = this.element;
        kotlin.jvm.internal.l0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.b0) cVar).f(o0Var, l0Var, j4);
    }

    @Override // androidx.compose.ui.node.y1
    public void f6(@fg.l androidx.compose.ui.semantics.z zVar) {
        q.c cVar = this.element;
        kotlin.jvm.internal.l0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        androidx.compose.ui.semantics.l v6 = ((androidx.compose.ui.semantics.n) cVar).v6();
        kotlin.jvm.internal.l0.n(zVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((androidx.compose.ui.semantics.l) zVar).c(v6);
    }

    @Override // androidx.compose.ui.node.u1
    public void g1(@fg.l androidx.compose.ui.input.pointer.p pointerEvent, @fg.l androidx.compose.ui.input.pointer.r pass, long bounds) {
        q.c cVar = this.element;
        kotlin.jvm.internal.l0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((androidx.compose.ui.input.pointer.i0) cVar).getPointerInputFilter().h(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.ui.draw.d
    @fg.l
    public androidx.compose.ui.unit.w getLayoutDirection() {
        return k.p(this).getLayoutDirection();
    }

    @Override // androidx.compose.ui.q.d
    public void i7() {
        B7(true);
    }

    @Override // androidx.compose.ui.q.d
    public void j7() {
        F7();
    }

    @Override // androidx.compose.ui.node.b0
    public void l(long size) {
        q.c cVar = this.element;
        if (cVar instanceof androidx.compose.ui.layout.b1) {
            ((androidx.compose.ui.layout.b1) cVar).l(size);
        }
    }

    @Override // androidx.compose.ui.node.u1
    public boolean m1() {
        q.c cVar = this.element;
        kotlin.jvm.internal.l0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((androidx.compose.ui.input.pointer.i0) cVar).getPointerInputFilter().a();
    }

    @Override // androidx.compose.ui.node.c0
    public int p(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        q.c cVar = this.element;
        kotlin.jvm.internal.l0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.b0) cVar).p(qVar, pVar, i4);
    }

    @Override // androidx.compose.ui.node.b0
    public void q(@fg.l androidx.compose.ui.layout.u coordinates) {
        this.lastOnPlacedCoordinates = coordinates;
        q.c cVar = this.element;
        if (cVar instanceof androidx.compose.ui.layout.y0) {
            ((androidx.compose.ui.layout.y0) cVar).q(coordinates);
        }
    }

    @fg.l
    public String toString() {
        return this.element.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.g] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.g] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.modifier.j, androidx.compose.ui.modifier.n
    public <T> T v(@fg.l androidx.compose.ui.modifier.c<T> cVar) {
        c1 nodes;
        this.readValues.add(cVar);
        if (!getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d parent = getNode().getParent();
        h0 p4 = k.p(this);
        while (p4 != null) {
            if ((androidx.compose.ui.focus.a.a(p4) & 32) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & 32) != 0) {
                        l lVar = parent;
                        ?? r4 = 0;
                        while (lVar != 0) {
                            if (lVar instanceof androidx.compose.ui.modifier.j) {
                                androidx.compose.ui.modifier.j jVar = (androidx.compose.ui.modifier.j) lVar;
                                if (jVar.getProvidedValues().a(cVar)) {
                                    return (T) jVar.getProvidedValues().b(cVar);
                                }
                            } else if ((lVar.getKindSet() & 32) != 0 && (lVar instanceof l)) {
                                q.d delegate = lVar.getDelegate();
                                int i4 = 0;
                                lVar = lVar;
                                r4 = r4;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & 32) != 0) {
                                        i4++;
                                        r4 = r4;
                                        if (i4 == 1) {
                                            lVar = delegate;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                            }
                                            if (lVar != 0) {
                                                r4.b(lVar);
                                                lVar = 0;
                                            }
                                            r4.b(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    lVar = lVar;
                                    r4 = r4;
                                }
                                if (i4 == 1) {
                                }
                            }
                            lVar = k.l(r4);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            p4 = p4.B0();
            parent = (p4 == null || (nodes = p4.getNodes()) == null) ? null : nodes.getTail();
        }
        return cVar.a().invoke();
    }

    @fg.l
    /* renamed from: z7, reason: from getter */
    public final q.c getElement() {
        return this.element;
    }
}
