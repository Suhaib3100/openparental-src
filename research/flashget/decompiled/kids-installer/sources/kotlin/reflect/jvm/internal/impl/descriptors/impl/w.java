package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import java.util.Set;

/* compiled from: ModuleDescriptorImpl.kt */
/* loaded from: classes5.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final List<x> f24303a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final Set<x> f24304b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final List<x> f24305c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final Set<x> f24306d;

    public w(@d5.d List<x> list, @d5.d Set<x> set, @d5.d List<x> list2, @d5.d Set<x> set2) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("䟯"));
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("䟰"));
        kotlin.jvm.internal.l0.p(list2, ProtectedSandApp.s("䟱"));
        kotlin.jvm.internal.l0.p(set2, ProtectedSandApp.s("䟲"));
        this.f24303a = list;
        this.f24304b = set;
        this.f24305c = list2;
        this.f24306d = set2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.v
    @d5.d
    public List<x> a() {
        return this.f24303a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.v
    @d5.d
    public Set<x> b() {
        return this.f24304b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.v
    @d5.d
    public List<x> c() {
        return this.f24305c;
    }
}
