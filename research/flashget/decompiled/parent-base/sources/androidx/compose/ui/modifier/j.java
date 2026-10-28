package androidx.compose.ui.modifier;

import androidx.compose.ui.node.c1;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: ModifierLocalModifierNode.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u00012\u00020\u0002J+\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR$\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/modifier/j;", "Landroidx/compose/ui/modifier/n;", "Landroidx/compose/ui/node/j;", "T", "Landroidx/compose/ui/modifier/c;", "key", "value", "Lkotlin/k2;", "x4", "(Landroidx/compose/ui/modifier/c;Ljava/lang/Object;)V", "Landroidx/compose/ui/modifier/i;", "A1", "()Landroidx/compose/ui/modifier/i;", "providedValues", "v", "(Landroidx/compose/ui/modifier/c;)Ljava/lang/Object;", "current", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,209:1\n1#2:210\n1#2:218\n80#3:211\n230#4,5:212\n58#4:217\n59#4,8:219\n385#4,6:227\n395#4,2:234\n397#4,8:239\n405#4,9:250\n414#4,8:262\n68#4,7:270\n261#5:233\n234#6,3:236\n237#6,3:259\n1208#7:247\n1187#7,2:248\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNode\n*L\n164#1:218\n164#1:211\n164#1:212,5\n164#1:217\n164#1:219,8\n164#1:227,6\n164#1:234,2\n164#1:239,8\n164#1:250,9\n164#1:262,8\n164#1:270,7\n164#1:233\n164#1:236,3\n164#1:259,3\n164#1:247\n164#1:248,2\n*E\n"})
/* loaded from: classes.dex */
public interface j extends n, androidx.compose.ui.node.j {
    @fg.l
    /* renamed from: A1 */
    default i getProvidedValues() {
        return b.f19127b;
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
    @Override // androidx.compose.ui.modifier.n
    default <T> T v(@fg.l c<T> cVar) {
        c1 nodes;
        if (!getNode().getIsAttached()) {
            throw new IllegalArgumentException("ModifierLocal accessed from an unattached node");
        }
        if (!getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d parent = getNode().getParent();
        h0 p4 = androidx.compose.ui.node.k.p(this);
        while (p4 != null) {
            if ((androidx.compose.ui.focus.a.a(p4) & 32) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & 32) != 0) {
                        androidx.compose.ui.node.l lVar = parent;
                        ?? r4 = 0;
                        while (lVar != 0) {
                            if (lVar instanceof j) {
                                j jVar = (j) lVar;
                                if (jVar.getProvidedValues().a(cVar)) {
                                    return (T) jVar.getProvidedValues().b(cVar);
                                }
                            } else if ((lVar.getKindSet() & 32) != 0 && (lVar instanceof androidx.compose.ui.node.l)) {
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
                            lVar = androidx.compose.ui.node.k.l(r4);
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

    default <T> void x4(@fg.l c<T> key, T value) {
        if (getProvidedValues() == b.f19127b) {
            throw new IllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (getProvidedValues().a(key)) {
            getProvidedValues().c(key, value);
            return;
        }
        throw new IllegalArgumentException(("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + key + " was not found.").toString());
    }
}
