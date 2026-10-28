package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.w;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.l0;

/* compiled from: DeserializedPackageMemberScope.kt */
@r1({"SMAP\nDeserializedPackageMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedPackageMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedPackageMemberScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n1360#2:82\n1446#2,5:83\n1747#2,3:88\n*S KotlinDebug\n*F\n+ 1 DeserializedPackageMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedPackageMemberScope\n*L\n55#1:82\n55#1:83,5\n58#1:88,3\n*E\n"})
/* loaded from: classes7.dex */
public class j extends i {

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private final l0 f78172g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private final String f78173h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.c f78174i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.l0 r17, @fg.l kotlin.reflect.jvm.internal.impl.metadata.a.l r18, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r19, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r20, @fg.m kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g r21, @fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.k r22, @fg.l java.lang.String r23, @fg.l ld.a<? extends java.util.Collection<kotlin.reflect.jvm.internal.impl.name.f>> r24) {
        /*
            r16 = this;
            r6 = r16
            r14 = r17
            r15 = r23
            java.lang.String r0 = "篌\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r14, r0)
            java.lang.String r0 = "篍\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r1 = r18
            kotlin.jvm.internal.l0.p(r1, r0)
            java.lang.String r0 = "篎\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r2 = r19
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = "篏\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r3 = r20
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.String r0 = "篐\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r4 = r22
            kotlin.jvm.internal.l0.p(r4, r0)
            java.lang.String r0 = "篑\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r15, r0)
            java.lang.String r0 = "篒\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r5 = r24
            kotlin.jvm.internal.l0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.g r10 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.g
            kotlin.reflect.jvm.internal.impl.metadata.a$t r0 = r18.W()
            java.lang.String r7 = "篓\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            kotlin.jvm.internal.l0.o(r0, r7)
            r10.<init>(r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h$a r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f77444b
            kotlin.reflect.jvm.internal.impl.metadata.a$w r7 = r18.X()
            java.lang.String r8 = "篔\u0001"
            java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
            kotlin.jvm.internal.l0.o(r7, r8)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r11 = r0.a(r7)
            r7 = r22
            r8 = r17
            r9 = r19
            r12 = r20
            r13 = r21
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2 = r7.a(r8, r9, r10, r11, r12, r13)
            java.util.List r3 = r18.P()
            java.lang.String r0 = "篕\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r3, r0)
            java.util.List r4 = r18.S()
            java.lang.String r0 = "篖\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r4, r0)
            java.util.List r7 = r18.V()
            java.lang.String r0 = "篗\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r7, r0)
            r0 = r16
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f78172g = r14
            r6.f78173h = r15
            kotlin.reflect.jvm.internal.impl.name.c r0 = r17.g()
            r6.f78174i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.j.<init>(kotlin.reflect.jvm.internal.impl.descriptors.l0, kotlin.reflect.jvm.internal.impl.metadata.a$l, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c, kotlin.reflect.jvm.internal.impl.metadata.deserialization.a, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g, kotlin.reflect.jvm.internal.impl.serialization.deserialization.k, java.lang.String, ld.a):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public void e(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("篘\u0001"));
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("篙\u0001"));
        td.a.b(q().c().p(), bVar, this.f78172g, fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.h f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("篘\u0001"));
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("篙\u0001"));
        e(fVar, bVar);
        return super.f(fVar, bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
    protected void j(@fg.l Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> collection, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("篚\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("篛\u0001"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
    @fg.l
    protected kotlin.reflect.jvm.internal.impl.name.b n(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("篘\u0001"));
        return new kotlin.reflect.jvm.internal.impl.name.b(this.f78174i, fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
    @fg.m
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> t() {
        return kotlin.collections.l0.f74939b;
    }

    @fg.l
    public String toString() {
        return this.f78173h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
    @fg.l
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> u() {
        return kotlin.collections.l0.f74939b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
    @fg.l
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> v() {
        return kotlin.collections.l0.f74939b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
    protected boolean x(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("篘\u0001"));
        if (!super.x(fVar)) {
            Iterable<rd.b> l4 = q().c().l();
            if (!(l4 instanceof Collection) || !((Collection) l4).isEmpty()) {
                Iterator<rd.b> it = l4.iterator();
                while (it.hasNext()) {
                    if (it.next().b(this.f78174i, fVar)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(dVar, ProtectedSandApp.s("篜\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("篛\u0001"));
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> k4 = k(dVar, lVar, ud.d.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<rd.b> l4 = q().c().l();
        ArrayList arrayList = new ArrayList();
        Iterator<rd.b> it = l4.iterator();
        while (it.hasNext()) {
            w.q0(arrayList, it.next().a(this.f78174i));
        }
        return w.D4(k4, arrayList);
    }
}
