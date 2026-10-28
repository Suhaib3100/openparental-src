package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes5.dex */
public final class f0 extends o1 {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.f1[] f26415c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final l1[] f26416d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f26417e;

    public /* synthetic */ f0(kotlin.reflect.jvm.internal.impl.descriptors.f1[] f1VarArr, l1[] l1VarArr, boolean z5, int i5, kotlin.jvm.internal.w wVar) {
        this(f1VarArr, l1VarArr, (i5 & 4) != 0 ? false : z5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    public boolean b() {
        return this.f26417e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    @d5.e
    public l1 e(@d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("圄"));
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h0Var.U0().b();
        kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var = b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1 ? (kotlin.reflect.jvm.internal.impl.descriptors.f1) b6 : null;
        if (f1Var == null) {
            return null;
        }
        int index = f1Var.getIndex();
        kotlin.reflect.jvm.internal.impl.descriptors.f1[] f1VarArr = this.f26415c;
        if (index >= f1VarArr.length || !kotlin.jvm.internal.l0.g(f1VarArr[index].m(), f1Var.m())) {
            return null;
        }
        return this.f26416d[index];
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    public boolean f() {
        return this.f26416d.length == 0;
    }

    @d5.d
    public final l1[] i() {
        return this.f26416d;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.f1[] j() {
        return this.f26415c;
    }

    public f0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.f1[] f1VarArr, @d5.d l1[] l1VarArr, boolean z5) {
        kotlin.jvm.internal.l0.p(f1VarArr, ProtectedSandApp.s("圂"));
        kotlin.jvm.internal.l0.p(l1VarArr, ProtectedSandApp.s("圃"));
        this.f26415c = f1VarArr;
        this.f26416d = l1VarArr;
        this.f26417e = z5;
        int length = f1VarArr.length;
        int length2 = l1VarArr.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(@d5.d List<? extends kotlin.reflect.jvm.internal.impl.descriptors.f1> list, @d5.d List<? extends l1> list2) {
        this((kotlin.reflect.jvm.internal.impl.descriptors.f1[]) list.toArray(new kotlin.reflect.jvm.internal.impl.descriptors.f1[0]), (l1[]) list2.toArray(new l1[0]), false, 4, null);
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("圀"));
        kotlin.jvm.internal.l0.p(list2, ProtectedSandApp.s("圁"));
    }
}
