package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: predefinedEnhancementInfo.kt */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @d5.e
    private final q f24885a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final List<q> f24886b;

    public k() {
        this(null, null, 3, null);
    }

    @d5.d
    public final List<q> a() {
        return this.f24886b;
    }

    @d5.e
    public final q b() {
        return this.f24885a;
    }

    public k(@d5.e q qVar, @d5.d List<q> list) {
        l0.p(list, ProtectedSandApp.s("䬩"));
        this.f24885a = qVar;
        this.f24886b = list;
    }

    public k(q qVar, List list, int i5, w wVar) {
        this((i5 & 1) != 0 ? null : qVar, (i5 & 2) != 0 ? EmptyList.f23167o : list);
    }
}
