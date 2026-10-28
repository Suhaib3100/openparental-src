package kotlin.reflect.jvm.internal.impl.descriptors;

import ce.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.r1;

/* compiled from: ValueClassRepresentation.kt */
@r1({"SMAP\nValueClassRepresentation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/ValueClassRepresentation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1549#2:51\n1620#2,3:52\n*S KotlinDebug\n*F\n+ 1 ValueClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/ValueClassRepresentation\n*L\n22#1:51\n22#1:52,3\n*E\n"})
/* loaded from: classes7.dex */
public abstract class h1<Type extends ce.j> {
    public /* synthetic */ h1(kotlin.jvm.internal.w wVar) {
        this();
    }

    public abstract boolean a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar);

    @fg.l
    public abstract List<kotlin.q0<kotlin.reflect.jvm.internal.impl.name.f, Type>> b();

    @fg.l
    public final <Other extends ce.j> h1<Other> c(@fg.l ld.l<? super Type, ? extends Other> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("櫐\u0001"));
        if (this instanceof a0) {
            a0 a0Var = (a0) this;
            return new a0(a0Var.d(), lVar.invoke(a0Var.e()));
        }
        if (!(this instanceof i0)) {
            throw new NoWhenBranchMatchedException();
        }
        List<kotlin.q0<kotlin.reflect.jvm.internal.impl.name.f, Type>> b5 = b();
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(b5, 10));
        Iterator<T> it = b5.iterator();
        while (it.hasNext()) {
            kotlin.q0 q0Var = (kotlin.q0) it.next();
            arrayList.add(new kotlin.q0((kotlin.reflect.jvm.internal.impl.name.f) q0Var.a(), lVar.invoke((ce.j) q0Var.b())));
        }
        return new i0(arrayList);
    }

    private h1() {
    }
}
