package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: predefinedEnhancementInfo.kt */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @fg.m
    private final q f76761a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final List<q> f76762b;

    public k() {
        this(null, null, 3, null);
    }

    @fg.l
    public final List<q> a() {
        return this.f76762b;
    }

    @fg.m
    public final q b() {
        return this.f76761a;
    }

    public k(@fg.m q qVar, @fg.l List<q> list) {
        l0.p(list, ProtectedSandApp.s("狶\u0001"));
        this.f76761a = qVar;
        this.f76762b = list;
    }

    public k(q qVar, List list, int i4, w wVar) {
        this((i4 & 1) != 0 ? null : qVar, (i4 & 2) != 0 ? j0.f74919b : list);
    }
}
