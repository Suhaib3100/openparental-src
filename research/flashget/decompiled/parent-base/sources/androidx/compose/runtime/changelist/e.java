package androidx.compose.runtime.changelist;

import androidx.compose.runtime.a5;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.f2;
import androidx.compose.runtime.internal.n;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.n0;
import androidx.compose.runtime.n1;
import androidx.compose.runtime.p3;
import androidx.compose.runtime.v;
import androidx.compose.runtime.w3;
import androidx.compose.runtime.x;
import androidx.compose.runtime.x3;
import androidx.compose.runtime.y;
import androidx.compose.runtime.z;
import fg.m;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import ld.p;

/* compiled from: ComposerChangeListWriter.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 w2\u00020\u0001:\u0001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\nJ\u0015\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\nJ&\u0010+\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0)H\u0086\b¢\u0006\u0004\b+\u0010,J\u001e\u0010-\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0)H\u0086\b¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010\u00012\u0006\u00103\u001a\u00020\u0018¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\b¢\u0006\u0004\b6\u0010\nJ\u0017\u00108\u001a\u00020\b2\b\u00107\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\b¢\u0006\u0004\b:\u0010\nJ\r\u0010;\u001a\u00020\b¢\u0006\u0004\b;\u0010\nJ\r\u0010<\u001a\u00020\b¢\u0006\u0004\b<\u0010\nJ\r\u0010=\u001a\u00020\b¢\u0006\u0004\b=\u0010\nJ\u001d\u0010?\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020>¢\u0006\u0004\b?\u0010@J%\u0010C\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020>2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0015\u0010F\u001a\u00020\b2\u0006\u0010E\u001a\u00020\u0018¢\u0006\u0004\bF\u0010%J)\u0010K\u001a\u00020\b2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\b0G2\u0006\u0010J\u001a\u00020H¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\b2\b\u0010M\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bN\u00109J@\u0010R\u001a\u00020\b\"\u0004\b\u0000\u0010O\"\u0004\b\u0001\u0010<2\u0006\u00100\u001a\u00028\u00012\u001d\u0010*\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0P¢\u0006\u0002\bQ¢\u0006\u0004\bR\u0010SJ\u001d\u0010U\u001a\u00020\b2\u0006\u0010T\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\bU\u0010\u001cJ%\u0010V\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\bV\u0010!J\r\u0010W\u001a\u00020\b¢\u0006\u0004\bW\u0010\nJ\r\u0010X\u001a\u00020\b¢\u0006\u0004\bX\u0010\nJ\u001d\u0010Z\u001a\u00020\b2\u0006\u0010T\u001a\u00020\u00182\u0006\u0010Y\u001a\u00020\u0018¢\u0006\u0004\bZ\u0010\u001cJ\r\u0010[\u001a\u00020\b¢\u0006\u0004\b[\u0010\nJ\u0017\u0010\\\u001a\u00020\b2\b\u0010M\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\\\u00109J\u001b\u0010^\u001a\u00020\b2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\b0)¢\u0006\u0004\b^\u0010.J\u001d\u0010a\u001a\u00020\b2\u0006\u0010`\u001a\u00020_2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\ba\u0010bJ%\u0010f\u001a\u00020\b2\u000e\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010c2\u0006\u0010e\u001a\u00020_¢\u0006\u0004\bf\u0010gJ/\u0010m\u001a\u00020\b2\b\u0010i\u001a\u0004\u0018\u00010h2\u0006\u0010k\u001a\u00020j2\u0006\u0010\u001e\u001a\u00020l2\u0006\u0010\u001d\u001a\u00020l¢\u0006\u0004\bm\u0010nJ%\u0010q\u001a\u00020\b2\u0006\u0010J\u001a\u00020o2\u0006\u0010k\u001a\u00020j2\u0006\u0010p\u001a\u00020l¢\u0006\u0004\bq\u0010rJ\r\u0010s\u001a\u00020\b¢\u0006\u0004\bs\u0010\nJ!\u0010u\u001a\u00020\b2\u0006\u0010t\u001a\u00020\u00042\n\b\u0002\u0010e\u001a\u0004\u0018\u00010_¢\u0006\u0004\bu\u0010vJ\r\u0010w\u001a\u00020\b¢\u0006\u0004\bw\u0010\nJ\r\u0010x\u001a\u00020\b¢\u0006\u0004\bx\u0010\nJ\r\u0010y\u001a\u00020\b¢\u0006\u0004\by\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010zR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u0017\u0010\u0080\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010NR\u0017\u0010\u0083\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\ba\u0010\u0082\u0001R%\u0010\u0086\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bK\u0010N\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0004\bO\u0010\u000fR\u0018\u0010\u0088\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b;\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bs\u0010\u0087\u0001R!\u0010\u008c\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bX\u0010\u008b\u0001R\u0017\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bZ\u0010\u0087\u0001R\u0018\u0010\u008d\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b:\u0010\u0087\u0001R\u0018\u0010\u008e\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0013\u0010\u0087\u0001R\u0017\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0010\u0010\u0087\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u008f\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0093\u0001"}, d2 = {"Landroidx/compose/runtime/changelist/e;", "", "Landroidx/compose/runtime/v;", "composer", "Landroidx/compose/runtime/changelist/d;", "changeList", "<init>", "(Landroidx/compose/runtime/v;Landroidx/compose/runtime/changelist/d;)V", "Lkotlin/k2;", "A", "()V", "C", "", "useParentSlot", "D", "(Z)V", "l", "Landroidx/compose/runtime/d;", "anchor", "k", "(Landroidx/compose/runtime/d;)V", "forParent", "H", "G", "", "removeFrom", "moveCount", "J", "(II)V", "to", "from", "count", "F", "(III)V", "B", "location", "x", "(I)V", "y", "K", "newChangeList", "Lkotlin/Function0;", "block", "a0", "(Landroidx/compose/runtime/changelist/d;Lld/a;)V", "b0", "(Lld/a;)V", "Landroidx/compose/runtime/p3;", "value", "N", "(Landroidx/compose/runtime/p3;)V", "groupSlotIndex", "Y", "(Ljava/lang/Object;I)V", "Q", "data", "W", "(Ljava/lang/Object;)V", "j", "f", "V", "O", "Landroidx/compose/runtime/x3;", "s", "(Landroidx/compose/runtime/d;Landroidx/compose/runtime/x3;)V", "Landroidx/compose/runtime/changelist/f;", "fixups", "t", "(Landroidx/compose/runtime/d;Landroidx/compose/runtime/x3;Landroidx/compose/runtime/changelist/f;)V", "offset", "u", "Lkotlin/Function1;", "Landroidx/compose/runtime/y;", "action", "composition", "e", "(Lld/l;Landroidx/compose/runtime/y;)V", "node", "Z", "T", "Lkotlin/Function2;", "Lkotlin/u;", "X", "(Ljava/lang/Object;Lld/p;)V", "nodeIndex", "P", "w", "L", "h", "group", "i", "z", "v", "effect", "U", "Landroidx/compose/runtime/internal/n;", "effectiveNodeIndexOut", "d", "(Landroidx/compose/runtime/internal/n;Landroidx/compose/runtime/d;)V", "", "nodes", "effectiveNodeIndex", "a", "(Ljava/util/List;Landroidx/compose/runtime/internal/n;)V", "Landroidx/compose/runtime/e2;", "resolvedState", "Landroidx/compose/runtime/z;", "parentContext", "Landroidx/compose/runtime/f2;", "b", "(Landroidx/compose/runtime/e2;Landroidx/compose/runtime/z;Landroidx/compose/runtime/f2;Landroidx/compose/runtime/f2;)V", "Landroidx/compose/runtime/n0;", "reference", "M", "(Landroidx/compose/runtime/n0;Landroidx/compose/runtime/z;Landroidx/compose/runtime/f2;)V", "g", "other", "q", "(Landroidx/compose/runtime/changelist/d;Landroidx/compose/runtime/internal/n;)V", "m", "R", "c", "Landroidx/compose/runtime/v;", "Landroidx/compose/runtime/changelist/d;", "n", "()Landroidx/compose/runtime/changelist/d;", "S", "(Landroidx/compose/runtime/changelist/d;)V", "startedGroup", "Landroidx/compose/runtime/n1;", "Landroidx/compose/runtime/n1;", "startedGroups", "o", "()Z", "implicitRootStart", "I", "writersReaderDelta", "pendingUps", "Landroidx/compose/runtime/a5;", "Landroidx/compose/runtime/a5;", "pendingDownNodes", "moveFrom", "moveTo", "Landroidx/compose/runtime/w3;", "p", "()Landroidx/compose/runtime/w3;", "reader", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nComposerChangeListWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,461:1\n4178#2,5:462\n4178#2,5:467\n4178#2,5:472\n4178#2,5:477\n*S KotlinDebug\n*F\n+ 1 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n*L\n167#1:462,5\n229#1:467,5\n297#1:472,5\n443#1:477,5\n*E\n"})
/* loaded from: classes.dex */
public final class e {

    /* renamed from: n, reason: collision with root package name */
    public static final int f15986n = 8;

    /* renamed from: o, reason: collision with root package name */
    private static final int f15987o = -2;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final v composer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private d changeList;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean startedGroup;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int writersReaderDelta;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int pendingUps;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int moveCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n1 startedGroups = new n1();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean implicitRootStart = true;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private a5<Object> pendingDownNodes = new a5<>();

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int removeFrom = -1;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int moveFrom = -1;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int moveTo = -1;

    public e(@fg.l v vVar, @fg.l d dVar) {
        this.composer = vVar;
        this.changeList = dVar;
    }

    private final void A() {
        B();
    }

    private final void B() {
        int i4 = this.pendingUps;
        if (i4 > 0) {
            this.changeList.I(i4);
            this.pendingUps = 0;
        }
        if (this.pendingDownNodes.d()) {
            this.changeList.m(this.pendingDownNodes.i());
            this.pendingDownNodes.a();
        }
    }

    private final void C() {
        I(this, false, 1, null);
        K();
    }

    private final void D(boolean useParentSlot) {
        H(useParentSlot);
    }

    static void E(e eVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        eVar.H(z4);
    }

    private final void F(int to, int from, int count) {
        B();
        this.changeList.x(to, from, count);
    }

    private final void G() {
        int i4 = this.moveCount;
        if (i4 > 0) {
            int i5 = this.removeFrom;
            if (i5 >= 0) {
                J(i5, i4);
                this.removeFrom = -1;
            } else {
                F(this.moveTo, this.moveFrom, i4);
                this.moveFrom = -1;
                this.moveTo = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void H(boolean forParent) {
        int parent = forParent ? this.composer.getReader().getParent() : this.composer.getReader().getCurrentGroup();
        int i4 = parent - this.writersReaderDelta;
        if (!(i4 >= 0)) {
            throw androidx.compose.runtime.u.a("Tried to seek backward");
        }
        if (i4 > 0) {
            this.changeList.h(i4);
            this.writersReaderDelta = parent;
        }
    }

    static /* synthetic */ void I(e eVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        eVar.H(z4);
    }

    private final void J(int removeFrom, int moveCount) {
        B();
        this.changeList.B(removeFrom, moveCount);
    }

    private final void k(androidx.compose.runtime.d anchor) {
        E(this, false, 1, null);
        this.changeList.q(anchor);
        this.startedGroup = true;
    }

    private final void l() {
        if (this.startedGroup || !this.implicitRootStart) {
            return;
        }
        E(this, false, 1, null);
        this.changeList.r();
        this.startedGroup = true;
    }

    private final w3 p() {
        return this.composer.getReader();
    }

    public static /* synthetic */ void r(e eVar, d dVar, n nVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            nVar = null;
        }
        eVar.q(dVar, nVar);
    }

    public final void K() {
        w3 reader;
        int parent;
        if (this.composer.getReader().getGroupsSize() <= 0 || this.startedGroups.h(-2) == (parent = (reader = this.composer.getReader()).getParent())) {
            return;
        }
        l();
        if (parent > 0) {
            androidx.compose.runtime.d a5 = reader.a(parent);
            this.startedGroups.j(parent);
            k(a5);
        }
    }

    public final void L() {
        B();
        if (this.startedGroup) {
            V();
            j();
        }
    }

    public final void M(@fg.l n0 composition, @fg.l z parentContext, @fg.l f2 reference) {
        this.changeList.y(composition, parentContext, reference);
    }

    public final void N(@fg.l p3 value) {
        this.changeList.z(value);
    }

    public final void O() {
        C();
        this.changeList.A();
        this.writersReaderDelta = this.composer.getReader().s() + this.writersReaderDelta;
    }

    public final void P(int nodeIndex, int count) {
        if (count > 0) {
            if (!(nodeIndex >= 0)) {
                x.x(("Invalid remove index " + nodeIndex).toString());
                throw new KotlinNothingValueException();
            }
            if (this.removeFrom == nodeIndex) {
                this.moveCount += count;
                return;
            }
            G();
            this.removeFrom = nodeIndex;
            this.moveCount = count;
        }
    }

    public final void Q() {
        this.changeList.C();
    }

    public final void R() {
        this.startedGroup = false;
        this.startedGroups.a();
        this.writersReaderDelta = 0;
    }

    public final void S(@fg.l d dVar) {
        this.changeList = dVar;
    }

    public final void T(boolean z4) {
        this.implicitRootStart = z4;
    }

    public final void U(@fg.l ld.a<k2> effect) {
        this.changeList.D(effect);
    }

    public final void V() {
        this.changeList.E();
    }

    public final void W(@m Object data) {
        E(this, false, 1, null);
        this.changeList.F(data);
    }

    public final <T, V> void X(V value, @fg.l p<? super T, ? super V, k2> block) {
        B();
        this.changeList.G(value, block);
    }

    public final void Y(@m Object value, int groupSlotIndex) {
        H(true);
        this.changeList.H(value, groupSlotIndex);
    }

    public final void Z(@m Object node) {
        B();
        this.changeList.J(node);
    }

    public final void a(@fg.l List<? extends Object> nodes, @fg.l n effectiveNodeIndex) {
        this.changeList.i(nodes, effectiveNodeIndex);
    }

    public final void a0(@fg.l d newChangeList, @fg.l ld.a<k2> block) {
        d dVar = this.changeList;
        try {
            this.changeList = newChangeList;
            block.invoke();
        } finally {
            this.changeList = dVar;
        }
    }

    public final void b(@m e2 resolvedState, @fg.l z parentContext, @fg.l f2 from, @fg.l f2 to) {
        this.changeList.j(resolvedState, parentContext, from, to);
    }

    public final void b0(@fg.l ld.a<k2> block) {
        boolean z4 = this.implicitRootStart;
        try {
            this.implicitRootStart = false;
            block.invoke();
        } finally {
            this.implicitRootStart = z4;
        }
    }

    public final void c() {
        E(this, false, 1, null);
        this.changeList.k();
    }

    public final void d(@fg.l n effectiveNodeIndexOut, @fg.l androidx.compose.runtime.d anchor) {
        B();
        this.changeList.l(effectiveNodeIndexOut, anchor);
    }

    public final void e(@fg.l ld.l<? super y, k2> action, @fg.l y composition) {
        this.changeList.n(action, composition);
    }

    public final void f() {
        int parent = this.composer.getReader().getParent();
        if (!(this.startedGroups.h(-1) <= parent)) {
            throw androidx.compose.runtime.u.a("Missed recording an endGroup");
        }
        if (this.startedGroups.h(-1) == parent) {
            E(this, false, 1, null);
            this.startedGroups.i();
            this.changeList.o();
        }
    }

    public final void g() {
        this.changeList.p();
        this.writersReaderDelta = 0;
    }

    public final void h() {
        G();
    }

    public final void i(int nodeIndex, int group) {
        G();
        B();
        int S = this.composer.getReader().O(group) ? 1 : this.composer.getReader().S(group);
        if (S > 0) {
            P(nodeIndex, S);
        }
    }

    public final void j() {
        if (this.startedGroup) {
            E(this, false, 1, null);
            E(this, false, 1, null);
            this.changeList.o();
            this.startedGroup = false;
        }
    }

    public final void m() {
        B();
        if (!this.startedGroups.d()) {
            throw androidx.compose.runtime.u.a("Missed recording an endGroup()");
        }
    }

    @fg.l
    /* renamed from: n, reason: from getter */
    public final d getChangeList() {
        return this.changeList;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final void q(@fg.l d other, @m n effectiveNodeIndex) {
        this.changeList.s(other, effectiveNodeIndex);
    }

    public final void s(@fg.l androidx.compose.runtime.d anchor, @fg.l x3 from) {
        B();
        C();
        this.changeList.u(anchor, from);
    }

    public final void t(@fg.l androidx.compose.runtime.d anchor, @fg.l x3 from, @fg.l f fixups) {
        B();
        C();
        this.changeList.v(anchor, from, fixups);
    }

    public final void u(int offset) {
        C();
        this.changeList.w(offset);
    }

    public final void v(@m Object node) {
        this.pendingDownNodes.h(node);
    }

    public final void w(int from, int to, int count) {
        if (count > 0) {
            int i4 = this.moveCount;
            if (i4 > 0 && this.moveFrom == from - i4 && this.moveTo == to - i4) {
                this.moveCount = i4 + count;
                return;
            }
            G();
            this.moveFrom = from;
            this.moveTo = to;
            this.moveCount = count;
        }
    }

    public final void x(int location) {
        this.writersReaderDelta = (location - this.composer.getReader().getCurrentGroup()) + this.writersReaderDelta;
    }

    public final void y(int location) {
        this.writersReaderDelta = location;
    }

    public final void z() {
        if (this.pendingDownNodes.d()) {
            this.pendingDownNodes.g();
        } else {
            this.pendingUps++;
        }
    }
}
