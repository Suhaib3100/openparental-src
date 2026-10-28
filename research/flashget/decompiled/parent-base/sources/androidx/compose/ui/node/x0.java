package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ViewInterop.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\b¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/node/x0;", "Landroidx/compose/ui/node/g2;", "<init>", "()V", "T", "", "id", "Lkotlin/Function0;", "factory", "e", "(ILld/a;)Landroidx/compose/ui/node/g2;", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "parent", "Lkotlin/k2;", "c", "(Landroid/view/View;Landroid/view/ViewGroup;)V", "b", "d", "a", "I", "()I", "", "Ljava/util/List;", "f", "()Ljava/util/List;", "adapters", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,92:1\n116#2,2:93\n33#2,6:95\n118#2:101\n33#2,6:102\n33#2,6:108\n33#2,6:114\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n*L\n48#1:93,2\n48#1:95,6\n48#1:101\n56#1:102,6\n60#1:108,6\n64#1:114,6\n*E\n"})
/* loaded from: classes.dex */
public final class x0 implements g2 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f19526c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<g2> adapters = new ArrayList();

    @Override // androidx.compose.ui.node.g2
    /* renamed from: a, reason: from getter */
    public int getId() {
        return this.id;
    }

    @Override // androidx.compose.ui.node.g2
    public void b(@fg.l View view, @fg.l ViewGroup parent) {
        List<g2> list = this.adapters;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            list.get(i4).b(view, parent);
        }
    }

    @Override // androidx.compose.ui.node.g2
    public void c(@fg.l View view, @fg.l ViewGroup parent) {
        List<g2> list = this.adapters;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            list.get(i4).c(view, parent);
        }
    }

    @Override // androidx.compose.ui.node.g2
    public void d(@fg.l View view, @fg.l ViewGroup parent) {
        List<g2> list = this.adapters;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            list.get(i4).d(view, parent);
        }
    }

    @fg.l
    public final <T extends g2> T e(int id2, @fg.l ld.a<? extends T> factory) {
        g2 g2Var;
        List<g2> list = this.adapters;
        int size = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                g2Var = null;
                break;
            }
            g2Var = list.get(i4);
            if (g2Var.getId() == id2) {
                break;
            }
            i4++;
        }
        T t4 = g2Var instanceof g2 ? (T) g2Var : null;
        if (t4 != null) {
            return t4;
        }
        T invoke = factory.invoke();
        this.adapters.add(invoke);
        return invoke;
    }

    @fg.l
    public final List<g2> f() {
        return this.adapters;
    }
}
