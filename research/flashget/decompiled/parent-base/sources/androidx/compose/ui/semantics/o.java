package androidx.compose.ui.semantics;

import androidx.compose.ui.platform.a2;
import androidx.compose.ui.platform.n5;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.q0;

/* compiled from: SemanticsModifier.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a4\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\r\u001a\u00020\u0003*\u00020\u00032\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0012\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0018\u001a\u00060\u0014j\u0002`\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"", "d", "()I", "Landroidx/compose/ui/q;", "", "mergeDescendants", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "Lkotlin/u;", "properties", "e", "(Landroidx/compose/ui/q;ZLld/l;)Landroidx/compose/ui/q;", "c", "(Landroidx/compose/ui/q;Lld/l;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/platform/a2;", "Landroidx/compose/ui/semantics/l;", "semanticsConfiguration", "b", "(Landroidx/compose/ui/platform/a2;Landroidx/compose/ui/semantics/l;)V", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/compose/ui/platform/AtomicInt;", "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "lastIdentifier", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSemanticsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,209:1\n1179#2,2:210\n1253#2,4:212\n*S KotlinDebug\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n*L\n205#1:210,2\n205#1:212,4\n*E\n"})
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static AtomicInteger f20352a = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a2 a2Var, l lVar) {
        n5 properties = a2Var.getProperties();
        int j4 = z0.j(kotlin.collections.w.b0(lVar, 10));
        if (j4 < 16) {
            j4 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j4);
        for (Map.Entry<? extends y<?>, ? extends Object> entry : lVar) {
            q0 q0Var = new q0(entry.getKey().getName(), entry.getValue());
            linkedHashMap.put(q0Var.e(), q0Var.f());
        }
        properties.c("properties", linkedHashMap);
    }

    @fg.l
    public static final androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super z, k2> lVar) {
        return qVar.w3(new ClearAndSetSemanticsElement(lVar));
    }

    public static final int d() {
        return f20352a.addAndGet(1);
    }

    @fg.l
    public static final androidx.compose.ui.q e(@fg.l androidx.compose.ui.q qVar, boolean z4, @fg.l ld.l<? super z, k2> lVar) {
        return qVar.w3(new AppendedSemanticsElement(z4, lVar));
    }

    public static /* synthetic */ androidx.compose.ui.q f(androidx.compose.ui.q qVar, boolean z4, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return e(qVar, z4, lVar);
    }
}
