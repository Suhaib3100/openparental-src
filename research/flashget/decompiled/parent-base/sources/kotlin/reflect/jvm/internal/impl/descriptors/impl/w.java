package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.Set;

/* compiled from: ModuleDescriptorImpl.kt */
/* loaded from: classes7.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final List<x> f76146a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final Set<x> f76147b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final List<x> f76148c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final Set<x> f76149d;

    public w(@fg.l List<x> list, @fg.l Set<x> set, @fg.l List<x> list2, @fg.l Set<x> set2) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("淒\u0001"));
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("淓\u0001"));
        kotlin.jvm.internal.l0.p(list2, ProtectedSandApp.s("淔\u0001"));
        kotlin.jvm.internal.l0.p(set2, ProtectedSandApp.s("淕\u0001"));
        this.f76146a = list;
        this.f76147b = set;
        this.f76148c = list2;
        this.f76149d = set2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.v
    @fg.l
    public List<x> a() {
        return this.f76146a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.v
    @fg.l
    public List<x> b() {
        return this.f76148c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.v
    @fg.l
    public Set<x> c() {
        return this.f76147b;
    }
}
