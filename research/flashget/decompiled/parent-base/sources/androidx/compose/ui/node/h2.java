package androidx.compose.ui.node;

import android.view.View;
import androidx.annotation.c1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ViewInterop.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a3\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\r*\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/g2;", "T", "Landroid/view/View;", "", "id", "Lkotlin/Function0;", "factory", "a", "(Landroid/view/View;ILld/a;)Landroidx/compose/ui/node/g2;", "", "key", "d", "(Ljava/lang/String;)I", "Landroidx/compose/ui/node/x0;", "c", "(Landroid/view/View;)Landroidx/compose/ui/node/x0;", "b", "I", "viewAdaptersKey", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n+ 2 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,92:1\n48#2:93\n49#2,4:103\n116#3,2:94\n33#3,6:96\n118#3:102\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n*L\n39#1:93\n39#1:103,4\n39#1:94,2\n39#1:96,6\n39#1:102\n*E\n"})
/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f19332a = d("ViewAdapter");

    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public static final <T extends g2> T a(@fg.l View view, int i4, @fg.l ld.a<? extends T> aVar) {
        g2 g2Var;
        x0 b5 = b(view);
        List<g2> f4 = b5.f();
        int size = f4.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                g2Var = null;
                break;
            }
            g2Var = f4.get(i5);
            if (g2Var.getId() == i4) {
                break;
            }
            i5++;
        }
        T t4 = g2Var instanceof g2 ? (T) g2Var : null;
        if (t4 != null) {
            return t4;
        }
        T invoke = aVar.invoke();
        b5.f().add(invoke);
        return invoke;
    }

    @fg.l
    public static final x0 b(@fg.l View view) {
        int i4 = f19332a;
        Object tag = view.getTag(i4);
        x0 x0Var = tag instanceof x0 ? (x0) tag : null;
        if (x0Var != null) {
            return x0Var;
        }
        x0 x0Var2 = new x0();
        view.setTag(i4, x0Var2);
        return x0Var2;
    }

    @fg.m
    public static final x0 c(@fg.l View view) {
        Object tag = view.getTag(f19332a);
        if (tag instanceof x0) {
            return (x0) tag;
        }
        return null;
    }

    public static final int d(@fg.l String str) {
        return str.hashCode() | 50331648;
    }
}
