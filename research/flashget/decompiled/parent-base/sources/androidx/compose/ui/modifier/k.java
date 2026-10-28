package androidx.compose.ui.modifier;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.q0;

/* compiled from: ModifierLocalModifierNode.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a!\u0010\u0006\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\n\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00032\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\u000e\u001a\u00020\u00002\u001a\u0010\r\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\f\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u000e\u0010\u000f\u001aA\u0010\u0012\u001a\u00020\u000022\u0010\u0011\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00100\b0\f\"\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00100\b¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/modifier/i;", "a", "()Landroidx/compose/ui/modifier/i;", "T", "Landroidx/compose/ui/modifier/c;", "key", "b", "(Landroidx/compose/ui/modifier/c;)Landroidx/compose/ui/modifier/i;", "Lkotlin/q0;", "entry", "c", "(Lkotlin/q0;)Landroidx/compose/ui/modifier/i;", "", "keys", "d", "([Landroidx/compose/ui/modifier/c;)Landroidx/compose/ui/modifier/i;", "", "entries", "e", "([Lkotlin/q0;)Landroidx/compose/ui/modifier/i;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,209:1\n1#2:210\n11335#3:211\n11670#3,3:212\n37#4,2:215\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNodeKt\n*L\n199#1:211\n199#1:212,3\n199#1:215,2\n*E\n"})
/* loaded from: classes.dex */
public final class k {
    @fg.l
    public static final i a() {
        return b.f19127b;
    }

    @fg.l
    public static final <T> i b(@fg.l c<T> cVar) {
        return new q(cVar);
    }

    @fg.l
    public static final <T> i c(@fg.l q0<? extends c<T>, ? extends T> q0Var) {
        q qVar = new q(q0Var.e());
        qVar.c(q0Var.e(), q0Var.f());
        return qVar;
    }

    @fg.l
    public static final i d(@fg.l c<?>... cVarArr) {
        ArrayList arrayList = new ArrayList(cVarArr.length);
        for (c<?> cVar : cVarArr) {
            arrayList.add(new q0(cVar, null));
        }
        q0[] q0VarArr = (q0[]) arrayList.toArray(new q0[0]);
        return new o((q0[]) Arrays.copyOf(q0VarArr, q0VarArr.length));
    }

    @fg.l
    public static final i e(@fg.l q0<? extends c<?>, ? extends Object>... q0VarArr) {
        return new o((q0[]) Arrays.copyOf(q0VarArr, q0VarArr.length));
    }
}
