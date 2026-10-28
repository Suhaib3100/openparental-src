package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.u;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.node.p1;
import androidx.compose.ui.q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: ModifierLocalManager.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u001e\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/ui/modifier/h;", "", "Landroidx/compose/ui/node/p1;", "owner", "<init>", "(Landroidx/compose/ui/node/p1;)V", "Landroidx/compose/ui/q$d;", "node", "Landroidx/compose/ui/modifier/c;", "key", "", "Landroidx/compose/ui/node/c;", "set", "Lkotlin/k2;", "d", "(Landroidx/compose/ui/q$d;Landroidx/compose/ui/modifier/c;Ljava/util/Set;)V", "c", "()V", "f", "g", "(Landroidx/compose/ui/node/c;Landroidx/compose/ui/modifier/c;)V", "b", "e", "a", "Landroidx/compose/ui/node/p1;", "()Landroidx/compose/ui/node/p1;", "Landroidx/compose/runtime/collection/g;", "Landroidx/compose/runtime/collection/g;", "inserted", "insertedLocal", "Landroidx/compose/ui/node/h0;", "removed", "removedLocal", "", "Z", "invalidated", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nModifierLocalManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,122:1\n1208#2:123\n1187#2,2:124\n1208#2:126\n1187#2,2:127\n1208#2:129\n1187#2,2:130\n1208#2:132\n1187#2,2:133\n1208#2:166\n1187#2,2:167\n476#3,7:135\n523#3:142\n483#3,4:143\n476#3,7:147\n523#3:154\n483#3,4:155\n728#3,2:234\n728#3,2:236\n728#3,2:238\n728#3,2:240\n728#3,2:242\n728#3,2:244\n1855#4,2:159\n80#5:161\n289#6:162\n163#6:163\n164#6:165\n165#6,12:169\n290#6:181\n385#6,5:182\n291#6,2:187\n390#6:189\n395#6,2:191\n397#6,17:196\n414#6,8:216\n293#6:224\n177#6,8:225\n294#6:233\n1#7:164\n261#8:190\n234#9,3:193\n237#9,3:213\n*S KotlinDebug\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n*L\n44#1:123\n44#1:124,2\n45#1:126\n45#1:127,2\n46#1:129\n46#1:130,2\n47#1:132\n47#1:133,2\n93#1:166\n93#1:167,2\n64#1:135,7\n65#1:142\n64#1:143,4\n77#1:147,7\n78#1:154\n77#1:155,4\n105#1:234,2\n106#1:236,2\n111#1:238,2\n112#1:240,2\n117#1:242,2\n118#1:244,2\n85#1:159,2\n93#1:161\n93#1:162\n93#1:163\n93#1:165\n93#1:169,12\n93#1:181\n93#1:182,5\n93#1:187,2\n93#1:189\n93#1:191,2\n93#1:196,17\n93#1:216,8\n93#1:224\n93#1:225,8\n93#1:233\n93#1:164\n93#1:190\n93#1:193,3\n93#1:213,3\n*E\n"})
/* loaded from: classes.dex */
public final class h {

    /* renamed from: g, reason: collision with root package name */
    public static final int f19133g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final p1 owner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<androidx.compose.ui.node.c> inserted = new androidx.compose.runtime.collection.g<>(new androidx.compose.ui.node.c[16], 0);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<c<?>> insertedLocal = new androidx.compose.runtime.collection.g<>(new c[16], 0);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<h0> removed = new androidx.compose.runtime.collection.g<>(new h0[16], 0);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<c<?>> removedLocal = new androidx.compose.runtime.collection.g<>(new c[16], 0);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean invalidated;

    /* compiled from: ModifierLocalManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<k2> {
        a() {
            super(0);
        }

        public final void a() {
            h.this.f();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    public h(@fg.l p1 p1Var) {
        this.owner = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.Set, java.util.Set<androidx.compose.ui.node.c>] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    private final void d(q.d node, c<?> key, Set<androidx.compose.ui.node.c> set) {
        if (!node.getNode().getIsAttached()) {
            throw new IllegalStateException("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.g gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
        q.d child = node.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.k.c(gVar, node.getNode());
        } else {
            gVar.b(child);
        }
        while (gVar.V()) {
            q.d dVar = (q.d) androidx.compose.foundation.gestures.i.a(gVar, 1);
            if ((dVar.getAggregateChildKindSet() & 32) != 0) {
                for (q.d dVar2 = dVar; dVar2 != null; dVar2 = dVar2.getChild()) {
                    if ((dVar2.getKindSet() & 32) != 0) {
                        androidx.compose.ui.node.l lVar = dVar2;
                        androidx.compose.runtime.collection.g gVar2 = null;
                        while (lVar != 0) {
                            if (lVar instanceof j) {
                                j jVar = (j) lVar;
                                if (jVar instanceof androidx.compose.ui.node.c) {
                                    androidx.compose.ui.node.c cVar = (androidx.compose.ui.node.c) jVar;
                                    if ((cVar.getElement() instanceof d) && cVar.A7().contains(key)) {
                                        set.add(jVar);
                                    }
                                }
                                if (jVar.getProvidedValues().a(key)) {
                                    break;
                                }
                            } else if ((lVar.getKindSet() & 32) != 0 && (lVar instanceof androidx.compose.ui.node.l)) {
                                q.d delegate = lVar.getDelegate();
                                int i4 = 0;
                                lVar = lVar;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & 32) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            lVar = delegate;
                                        } else {
                                            if (gVar2 == null) {
                                                gVar2 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                            }
                                            if (lVar != 0) {
                                                gVar2.b(lVar);
                                                lVar = 0;
                                            }
                                            gVar2.b(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    lVar = lVar;
                                }
                                if (i4 == 1) {
                                }
                            }
                            lVar = androidx.compose.ui.node.k.l(gVar2);
                        }
                    }
                }
            }
            androidx.compose.ui.node.k.c(gVar, dVar);
        }
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final p1 getOwner() {
        return this.owner;
    }

    public final void b(@fg.l androidx.compose.ui.node.c node, @fg.l c<?> key) {
        this.inserted.b(node);
        this.insertedLocal.b(key);
        c();
    }

    public final void c() {
        if (this.invalidated) {
            return;
        }
        this.invalidated = true;
        this.owner.g0(new a());
    }

    public final void e(@fg.l androidx.compose.ui.node.c node, @fg.l c<?> key) {
        this.removed.b(androidx.compose.ui.node.k.p(node));
        this.removedLocal.b(key);
        c();
    }

    public final void f() {
        int i4 = 0;
        this.invalidated = false;
        HashSet hashSet = new HashSet();
        androidx.compose.runtime.collection.g<h0> gVar = this.removed;
        int size = gVar.getSize();
        if (size > 0) {
            h0[] L = gVar.L();
            int i5 = 0;
            do {
                h0 h0Var = L[i5];
                c<?> cVar = this.removedLocal.L()[i5];
                if (h0Var.getNodes().getHead().getIsAttached()) {
                    d(h0Var.getNodes().getHead(), cVar, hashSet);
                }
                i5++;
            } while (i5 < size);
        }
        this.removed.m();
        this.removedLocal.m();
        androidx.compose.runtime.collection.g<androidx.compose.ui.node.c> gVar2 = this.inserted;
        int size2 = gVar2.getSize();
        if (size2 > 0) {
            androidx.compose.ui.node.c[] L2 = gVar2.L();
            do {
                androidx.compose.ui.node.c cVar2 = L2[i4];
                c<?> cVar3 = this.insertedLocal.L()[i4];
                if (cVar2.getIsAttached()) {
                    d(cVar2, cVar3, hashSet);
                }
                i4++;
            } while (i4 < size2);
        }
        this.inserted.m();
        this.insertedLocal.m();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((androidx.compose.ui.node.c) it.next()).H7();
        }
    }

    public final void g(@fg.l androidx.compose.ui.node.c node, @fg.l c<?> key) {
        this.inserted.b(node);
        this.insertedLocal.b(key);
        c();
    }
}
