package androidx.compose.ui.focus;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: FocusTransactionManager.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J6\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\b¢\u0006\u0004\b\f\u0010\rJ6\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\b¢\u0006\u0004\b\u000e\u0010\rR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR,\u0010\"\u001a\u0004\u0018\u00010\u0011*\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/compose/ui/focus/o0;", "", "<init>", "()V", "Lkotlin/k2;", "f", "h", "g", "T", "Lkotlin/Function0;", "onCancelled", "block", "m", "(Lld/a;Lld/a;)Ljava/lang/Object;", "k", "", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/k0;", "a", "Ljava/util/Map;", "states", "Landroidx/compose/runtime/collection/g;", "b", "Landroidx/compose/runtime/collection/g;", "cancellationListener", "", "c", "Z", "ongoingTransaction", "value", "i", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/k0;", "j", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/k0;)V", "uncommittedFocusState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFocusTransactionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,100:1\n1208#2:101\n1187#2,2:102\n1#3:104\n728#4,2:105\n728#4,2:107\n460#4,11:109\n*S KotlinDebug\n*F\n+ 1 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n*L\n30#1:101\n30#1:102,2\n45#1:105,2\n62#1:107,2\n94#1:109,11\n*E\n"})
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f17557d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<FocusTargetNode, k0> states = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<ld.a<k2>> cancellationListener = new androidx.compose.runtime.collection.g<>(new ld.a[16], 0);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean ongoingTransaction;

    public static final void a(o0 o0Var) {
        o0Var.ongoingTransaction = true;
    }

    private final void f() {
        this.ongoingTransaction = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        androidx.compose.runtime.collection.g<ld.a<k2>> gVar = this.cancellationListener;
        int size = gVar.getSize();
        if (size > 0) {
            ld.a<k2>[] L = gVar.L();
            int i4 = 0;
            do {
                L[i4].invoke();
                i4++;
            } while (i4 < size);
        }
        this.cancellationListener.m();
        this.states.clear();
        this.ongoingTransaction = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        Iterator<FocusTargetNode> it = this.states.keySet().iterator();
        while (it.hasNext()) {
            it.next().C7();
        }
        this.states.clear();
        this.ongoingTransaction = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object l(o0 o0Var, ld.a aVar, ld.a aVar2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = null;
        }
        if (aVar != null) {
            o0Var.cancellationListener.b(aVar);
        }
        if (o0Var.ongoingTransaction) {
            return aVar2.invoke();
        }
        try {
            o0Var.ongoingTransaction = true;
            return aVar2.invoke();
        } finally {
            o0Var.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object n(o0 o0Var, ld.a aVar, ld.a aVar2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = null;
        }
        try {
            if (o0Var.ongoingTransaction) {
                o0Var.g();
            }
            o0Var.ongoingTransaction = true;
            if (aVar != null) {
                o0Var.cancellationListener.b(aVar);
            }
            Object invoke = aVar2.invoke();
            o0Var.h();
            return invoke;
        } catch (Throwable th) {
            o0Var.h();
            throw th;
        }
    }

    @fg.m
    public final k0 i(@fg.l FocusTargetNode focusTargetNode) {
        return this.states.get(focusTargetNode);
    }

    public final void j(@fg.l FocusTargetNode focusTargetNode, @fg.m k0 k0Var) {
        Map<FocusTargetNode, k0> map = this.states;
        if (k0Var == null) {
            throw new IllegalStateException("requires a non-null focus state");
        }
        map.put(focusTargetNode, k0Var);
    }

    public final <T> T k(@fg.m ld.a<k2> onCancelled, @fg.l ld.a<? extends T> block) {
        if (onCancelled != null) {
            this.cancellationListener.b(onCancelled);
        }
        if (this.ongoingTransaction) {
            return block.invoke();
        }
        try {
            this.ongoingTransaction = true;
            return block.invoke();
        } finally {
            h();
        }
    }

    public final <T> T m(@fg.m ld.a<k2> onCancelled, @fg.l ld.a<? extends T> block) {
        try {
            if (this.ongoingTransaction) {
                g();
            }
            this.ongoingTransaction = true;
            if (onCancelled != null) {
                this.cancellationListener.b(onCancelled);
            }
            T invoke = block.invoke();
            h();
            return invoke;
        } catch (Throwable th) {
            h();
            throw th;
        }
    }
}
