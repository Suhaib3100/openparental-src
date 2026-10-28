package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: TypeSubstitution.kt */
@kotlin.jvm.internal.r1({"SMAP\nTypeSubstitution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/IndexedParametersSubstitution\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,207:1\n37#2,2:208\n*S KotlinDebug\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/IndexedParametersSubstitution\n*L\n127#1:208,2\n*E\n"})
/* loaded from: classes7.dex */
public final class f0 extends o1 {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.f1[] f78424c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final l1[] f78425d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f78426e;

    public /* synthetic */ f0(kotlin.reflect.jvm.internal.impl.descriptors.f1[] f1VarArr, l1[] l1VarArr, boolean z4, int i4, kotlin.jvm.internal.w wVar) {
        this(f1VarArr, l1VarArr, (i4 & 4) != 0 ? false : z4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    public boolean b() {
        return this.f78426e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    @fg.m
    public l1 e(@fg.l h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("缧\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var.O0().c();
        kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1 ? (kotlin.reflect.jvm.internal.impl.descriptors.f1) c5 : null;
        if (f1Var == null) {
            return null;
        }
        int index = f1Var.getIndex();
        kotlin.reflect.jvm.internal.impl.descriptors.f1[] f1VarArr = this.f78424c;
        if (index >= f1VarArr.length || !kotlin.jvm.internal.l0.g(f1VarArr[index].j(), f1Var.j())) {
            return null;
        }
        return this.f78425d[index];
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    public boolean f() {
        return this.f78425d.length == 0;
    }

    @fg.l
    public final l1[] i() {
        return this.f78425d;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.f1[] j() {
        return this.f78424c;
    }

    public f0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.f1[] f1VarArr, @fg.l l1[] l1VarArr, boolean z4) {
        kotlin.jvm.internal.l0.p(f1VarArr, ProtectedSandApp.s("缤\u0001"));
        kotlin.jvm.internal.l0.p(l1VarArr, ProtectedSandApp.s("缦\u0001"));
        this.f78424c = f1VarArr;
        this.f78425d = l1VarArr;
        this.f78426e = z4;
        int length = f1VarArr.length;
        int length2 = l1VarArr.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(@fg.l List<? extends kotlin.reflect.jvm.internal.impl.descriptors.f1> list, @fg.l List<? extends l1> list2) {
        this((kotlin.reflect.jvm.internal.impl.descriptors.f1[]) list.toArray(new kotlin.reflect.jvm.internal.impl.descriptors.f1[0]), (l1[]) list2.toArray(new l1[0]), false, 4, null);
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("缤\u0001"));
        kotlin.jvm.internal.l0.p(list2, ProtectedSandApp.s("缥\u0001"));
    }
}
