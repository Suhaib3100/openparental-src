package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import h4.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: ValueClassRepresentation.kt */
/* loaded from: classes5.dex */
public abstract class h1<Type extends h4.k> {
    public /* synthetic */ h1(kotlin.jvm.internal.w wVar) {
        this();
    }

    @d5.d
    public abstract List<Pair<kotlin.reflect.jvm.internal.impl.name.f, Type>> a();

    @d5.d
    public final <Other extends h4.k> h1<Other> b(@d5.d q3.l<? super Type, ? extends Other> lVar) {
        int b02;
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("䛐"));
        if (this instanceof a0) {
            a0 a0Var = (a0) this;
            return new a0(a0Var.c(), lVar.N(a0Var.d()));
        }
        if (!(this instanceof i0)) {
            throw new NoWhenBranchMatchedException();
        }
        List<Pair<kotlin.reflect.jvm.internal.impl.name.f, Type>> a6 = a();
        b02 = kotlin.collections.b0.b0(a6, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = a6.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(new Pair((kotlin.reflect.jvm.internal.impl.name.f) pair.a(), lVar.N((h4.k) pair.b())));
        }
        return new i0(arrayList);
    }

    private h1() {
    }
}
