package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b4.p;
import b4.q;
import b4.r;
import b4.w;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.b0;
import kotlin.collections.e1;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.sequences.Sequence;
import kotlin.sequences.v;

/* compiled from: DeclaredMemberIndex.kt */
/* loaded from: classes5.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final b4.g f24635a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final q3.l<q, Boolean> f24636b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final q3.l<r, Boolean> f24637c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final Map<kotlin.reflect.jvm.internal.impl.name.f, List<r>> f24638d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final Map<kotlin.reflect.jvm.internal.impl.name.f, b4.n> f24639e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private final Map<kotlin.reflect.jvm.internal.impl.name.f, w> f24640f;

    /* compiled from: DeclaredMemberIndex.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a$a, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C0285a extends Lambda implements q3.l<r, Boolean> {
        C0285a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d r rVar) {
            l0.p(rVar, ProtectedSandApp.s("葦"));
            return Boolean.valueOf(((Boolean) a.this.f24636b.N(rVar)).booleanValue() && !p.c(rVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@d5.d b4.g gVar, @d5.d q3.l<? super q, Boolean> lVar) {
        Sequence A1;
        Sequence p02;
        Sequence A12;
        Sequence p03;
        int b02;
        int j5;
        l0.p(gVar, ProtectedSandApp.s("䩖"));
        l0.p(lVar, ProtectedSandApp.s("䩗"));
        this.f24635a = gVar;
        this.f24636b = lVar;
        C0285a c0285a = new C0285a();
        this.f24637c = c0285a;
        A1 = j0.A1(gVar.P());
        p02 = v.p0(A1, c0285a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : p02) {
            kotlin.reflect.jvm.internal.impl.name.f name = ((r) obj).getName();
            Object obj2 = linkedHashMap.get(name);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(name, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f24638d = linkedHashMap;
        A12 = j0.A1(this.f24635a.v());
        p03 = v.p0(A12, this.f24636b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : p03) {
            linkedHashMap2.put(((b4.n) obj3).getName(), obj3);
        }
        this.f24639e = linkedHashMap2;
        Collection<w> w5 = this.f24635a.w();
        q3.l<q, Boolean> lVar2 = this.f24636b;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : w5) {
            if (((Boolean) lVar2.N(obj4)).booleanValue()) {
                arrayList.add(obj4);
            }
        }
        b02 = b0.b0(arrayList, 10);
        j5 = e1.j(b02);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(j5 < 16 ? 16 : j5);
        for (Object obj5 : arrayList) {
            linkedHashMap3.put(((w) obj5).getName(), obj5);
        }
        this.f24640f = linkedHashMap3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
        Sequence A1;
        Sequence p02;
        A1 = j0.A1(this.f24635a.P());
        p02 = v.p0(A1, this.f24637c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = p02.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((r) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
    @d5.e
    public w b(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("䩘"));
        return this.f24640f.get(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
    @d5.e
    public b4.n c(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("䩙"));
        return this.f24639e.get(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        return this.f24640f.keySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> e() {
        Sequence A1;
        Sequence p02;
        A1 = j0.A1(this.f24635a.v());
        p02 = v.p0(A1, this.f24636b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = p02.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((b4.n) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
    @d5.d
    public Collection<r> f(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("䩚"));
        List<r> list = this.f24638d.get(fVar);
        return list != null ? list : EmptyList.f23167o;
    }
}
