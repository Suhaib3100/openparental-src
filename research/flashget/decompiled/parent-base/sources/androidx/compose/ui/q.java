package androidx.compose.ui;

import androidx.compose.runtime.x4;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.node.m1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.m2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;

/* compiled from: Modifier.kt */
@x4
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\bg\u0018\u0000 \u00132\u00020\u0001:\u0003\u0014\u0015\u0016J7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\t\u0010\bJ#\u0010\r\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0004¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/q;", "", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/q$c;", "operation", "I", "(Ljava/lang/Object;Lld/p;)Ljava/lang/Object;", "t", "Lkotlin/Function1;", "", "predicate", "y", "(Lld/l;)Z", "Z", "other", "w3", "(Landroidx/compose/ui/q;)Landroidx/compose/ui/q;", "V", "a", "c", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface q {

    /* renamed from: V, reason: from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f20243b;

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ#\u0010\u000f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0096\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/q$a;", "Landroidx/compose/ui/q;", "<init>", "()V", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/q$c;", "operation", "I", "(Ljava/lang/Object;Lld/p;)Ljava/lang/Object;", "t", "Lkotlin/Function1;", "", "predicate", "y", "(Lld/l;)Z", "Z", "other", "w3", "(Landroidx/compose/ui/q;)Landroidx/compose/ui/q;", "", "toString", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.q$a, reason: from kotlin metadata */
    public static final class Companion implements q {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f20243b = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.ui.q
        public <R> R I(R initial, @fg.l ld.p<? super R, ? super c, ? extends R> operation) {
            return initial;
        }

        @Override // androidx.compose.ui.q
        public boolean Z(@fg.l ld.l<? super c, Boolean> predicate) {
            return true;
        }

        @Override // androidx.compose.ui.q
        public <R> R t(R initial, @fg.l ld.p<? super c, ? super R, ? extends R> operation) {
            return initial;
        }

        @fg.l
        public String toString() {
            return "Modifier";
        }

        @Override // androidx.compose.ui.q
        @fg.l
        public q w3(@fg.l q other) {
            return other;
        }

        @Override // androidx.compose.ui.q
        public boolean y(@fg.l ld.l<? super c, Boolean> predicate) {
            return false;
        }
    }

    /* compiled from: Modifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        @fg.l
        @Deprecated
        public static q a(@fg.l q qVar, @fg.l q qVar2) {
            return q.super.w3(qVar2);
        }
    }

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J7\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J#\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000e\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/q$c;", "Landroidx/compose/ui/q;", "R", "initial", "Lkotlin/Function2;", "operation", "I", "(Ljava/lang/Object;Lld/p;)Ljava/lang/Object;", "t", "Lkotlin/Function1;", "", "predicate", "y", "(Lld/l;)Z", "Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface c extends q {

        /* compiled from: Modifier.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            @Deprecated
            public static boolean a(@fg.l c cVar, @fg.l ld.l<? super c, Boolean> lVar) {
                return c.super.Z(lVar);
            }

            @Deprecated
            public static boolean b(@fg.l c cVar, @fg.l ld.l<? super c, Boolean> lVar) {
                return c.super.y(lVar);
            }

            @Deprecated
            public static <R> R c(@fg.l c cVar, R r4, @fg.l ld.p<? super R, ? super c, ? extends R> pVar) {
                return (R) c.y2(cVar, r4, pVar);
            }

            @Deprecated
            public static <R> R d(@fg.l c cVar, R r4, @fg.l ld.p<? super c, ? super R, ? extends R> pVar) {
                return (R) c.i0(cVar, r4, pVar);
            }

            @fg.l
            @Deprecated
            public static q e(@fg.l c cVar, @fg.l q qVar) {
                return c.super.w3(qVar);
            }
        }

        static Object i0(c cVar, Object obj, ld.p pVar) {
            cVar.getClass();
            return pVar.invoke(cVar, obj);
        }

        static Object y2(c cVar, Object obj, ld.p pVar) {
            cVar.getClass();
            return pVar.invoke(obj, cVar);
        }

        @Override // androidx.compose.ui.q
        default <R> R I(R initial, @fg.l ld.p<? super R, ? super c, ? extends R> operation) {
            return operation.invoke(initial, this);
        }

        @Override // androidx.compose.ui.q
        default boolean Z(@fg.l ld.l<? super c, Boolean> predicate) {
            return predicate.invoke(this).booleanValue();
        }

        @Override // androidx.compose.ui.q
        default <R> R t(R initial, @fg.l ld.p<? super c, ? super R, ? extends R> operation) {
            return operation.invoke(this, initial);
        }

        @Override // androidx.compose.ui.q
        default boolean y(@fg.l ld.l<? super c, Boolean> predicate) {
            return predicate.invoke(this).booleanValue();
        }
    }

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b$\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0080\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u001d\u0010\u0018\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010#\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00008\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b \u0010!R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R$\u00107\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001f\u001a\u0004\b5\u0010!\"\u0004\b6\u0010\u001cR$\u0010;\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010\u001f\u001a\u0004\b9\u0010!\"\u0004\b:\u0010\u001cR$\u0010C\u001a\u0004\u0018\u00010<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\"\u0010N\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010R\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010I\u001a\u0004\bP\u0010K\"\u0004\bQ\u0010MR\u0016\u0010T\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010IR\u0016\u0010V\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010IR$\u0010Y\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bW\u0010I\u001a\u0004\bX\u0010KR\u001a\u0010\\\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\f\u0012\u0004\b[\u0010\u0003\u001a\u0004\bZ\u0010KR\u0011\u0010_\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b]\u0010^\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006`"}, d2 = {"Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/j;", "<init>", "()V", "Landroidx/compose/ui/node/e1;", "coordinator", "Lkotlin/k2;", "x7", "(Landroidx/compose/ui/node/e1;)V", "Landroidx/compose/ui/node/g1;", "kind", "", "f7", "(I)Z", "g7", "m7", "n7", "h7", "l7", "i7", "j7", "k7", "Lkotlin/Function0;", "effect", "w7", "(Lld/a;)V", "owner", "p7", "(Landroidx/compose/ui/q$d;)V", "<set-?>", "b", "Landroidx/compose/ui/q$d;", "A", "()Landroidx/compose/ui/q$d;", "Y6", "node", "Lkotlinx/coroutines/r0;", "c", "Lkotlinx/coroutines/r0;", "scope", "", "d", "I", "X6", "()I", "s7", "(I)V", "kindSet", "e", "S6", "o7", "aggregateChildKindSet", "f", "a7", "u7", "parent", "g", "T6", "q7", "child", "Landroidx/compose/ui/node/m1;", "h", "Landroidx/compose/ui/node/m1;", "Z6", "()Landroidx/compose/ui/node/m1;", "t7", "(Landroidx/compose/ui/node/m1;)V", "ownerScope", "i", "Landroidx/compose/ui/node/e1;", "U6", "()Landroidx/compose/ui/node/e1;", "j", "Z", "W6", "()Z", "r7", "(Z)V", "insertedNodeAwaitingAttachForInvalidation", "k", "d7", "v7", "updatedNodeAwaitingAttachForInvalidation", "l", "onAttachRunExpected", "m", "onDetachRunExpected", "n", "e7", "isAttached", "b7", "c7", "shouldAutoInvalidate", "V6", "()Lkotlinx/coroutines/r0;", "coroutineScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 0)
    @r1({"SMAP\nModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
    public static abstract class d implements androidx.compose.ui.node.j {

        /* renamed from: o, reason: collision with root package name */
        public static final int f20244o = 8;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private r0 scope;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int kindSet;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private d parent;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private d child;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private m1 ownerScope;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private e1 coordinator;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private boolean insertedNodeAwaitingAttachForInvalidation;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private boolean updatedNodeAwaitingAttachForInvalidation;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private boolean onAttachRunExpected;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private boolean onDetachRunExpected;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private boolean isAttached;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private d node = this;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int aggregateChildKindSet = -1;

        public static /* synthetic */ void Y6() {
        }

        public static /* synthetic */ void c7() {
        }

        @Override // androidx.compose.ui.node.j
        @fg.l
        /* renamed from: A, reason: from getter */
        public final d getNode() {
            return this.node;
        }

        /* renamed from: S6, reason: from getter */
        public final int getAggregateChildKindSet() {
            return this.aggregateChildKindSet;
        }

        @fg.m
        /* renamed from: T6, reason: from getter */
        public final d getChild() {
            return this.child;
        }

        @fg.m
        /* renamed from: U6, reason: from getter */
        public final e1 getCoordinator() {
            return this.coordinator;
        }

        @fg.l
        public final r0 V6() {
            r0 r0Var = this.scope;
            if (r0Var != null) {
                return r0Var;
            }
            r0 a5 = s0.a(androidx.compose.ui.node.k.q(this).q().O(new m2((k2) androidx.compose.ui.node.k.q(this).q().c(k2.INSTANCE))));
            this.scope = a5;
            return a5;
        }

        /* renamed from: W6, reason: from getter */
        public final boolean getInsertedNodeAwaitingAttachForInvalidation() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        /* renamed from: X6, reason: from getter */
        public final int getKindSet() {
            return this.kindSet;
        }

        @fg.m
        /* renamed from: Z6, reason: from getter */
        public final m1 getOwnerScope() {
            return this.ownerScope;
        }

        @fg.m
        /* renamed from: a7, reason: from getter */
        public final d getParent() {
            return this.parent;
        }

        public boolean b7() {
            return true;
        }

        /* renamed from: d7, reason: from getter */
        public final boolean getUpdatedNodeAwaitingAttachForInvalidation() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        /* renamed from: e7, reason: from getter */
        public final boolean getIsAttached() {
            return this.isAttached;
        }

        public final boolean f7(int kind) {
            return (kind & this.kindSet) != 0;
        }

        public void g7() {
            if (this.isAttached) {
                throw new IllegalStateException("node attached multiple times");
            }
            if (this.coordinator == null) {
                throw new IllegalStateException("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void h7() {
            if (!this.isAttached) {
                throw new IllegalStateException("Cannot detach a node that is not attached");
            }
            if (this.onAttachRunExpected) {
                throw new IllegalStateException("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.onDetachRunExpected) {
                throw new IllegalStateException("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            r0 r0Var = this.scope;
            if (r0Var != null) {
                s0.d(r0Var, new r());
                this.scope = null;
            }
        }

        public void i7() {
        }

        public void j7() {
        }

        public void k7() {
        }

        public void l7() {
            if (!this.isAttached) {
                throw new IllegalStateException("reset() called on an unattached node");
            }
            k7();
        }

        public void m7() {
            if (!this.isAttached) {
                throw new IllegalStateException("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.onAttachRunExpected) {
                throw new IllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.onAttachRunExpected = false;
            i7();
            this.onDetachRunExpected = true;
        }

        public void n7() {
            if (!this.isAttached) {
                throw new IllegalStateException("node detached multiple times");
            }
            if (this.coordinator == null) {
                throw new IllegalStateException("detach invoked on a node without a coordinator");
            }
            if (!this.onDetachRunExpected) {
                throw new IllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.onDetachRunExpected = false;
            j7();
        }

        public final void o7(int i4) {
            this.aggregateChildKindSet = i4;
        }

        public final void p7(@fg.l d owner) {
            this.node = owner;
        }

        public final void q7(@fg.m d dVar) {
            this.child = dVar;
        }

        public final void r7(boolean z4) {
            this.insertedNodeAwaitingAttachForInvalidation = z4;
        }

        public final void s7(int i4) {
            this.kindSet = i4;
        }

        public final void t7(@fg.m m1 m1Var) {
            this.ownerScope = m1Var;
        }

        public final void u7(@fg.m d dVar) {
            this.parent = dVar;
        }

        public final void v7(boolean z4) {
            this.updatedNodeAwaitingAttachForInvalidation = z4;
        }

        @k
        public final void w7(@fg.l ld.a<kotlin.k2> effect) {
            androidx.compose.ui.node.k.q(this).g0(effect);
        }

        public void x7(@fg.m e1 coordinator) {
            this.coordinator = coordinator;
        }
    }

    <R> R I(R initial, @fg.l ld.p<? super R, ? super c, ? extends R> operation);

    boolean Z(@fg.l ld.l<? super c, Boolean> predicate);

    <R> R t(R initial, @fg.l ld.p<? super c, ? super R, ? extends R> operation);

    @fg.l
    default q w3(@fg.l q other) {
        return other == INSTANCE ? this : new g(this, other);
    }

    boolean y(@fg.l ld.l<? super c, Boolean> predicate);
}
