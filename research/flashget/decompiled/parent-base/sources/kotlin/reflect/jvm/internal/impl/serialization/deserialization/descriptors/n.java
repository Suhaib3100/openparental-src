package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.f0;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: DeserializedTypeParameterDescriptor.kt */
@r1({"SMAP\nDeserializedTypeParameterDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedTypeParameterDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedTypeParameterDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,58:1\n1549#2:59\n1620#2,3:60\n*S KotlinDebug\n*F\n+ 1 DeserializedTypeParameterDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedTypeParameterDescriptor\n*L\n51#1:59\n51#1:60,3\n*E\n"})
/* loaded from: classes7.dex */
public final class n extends kotlin.reflect.jvm.internal.impl.descriptors.impl.b {

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m f78184l;

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private final a.s f78185m;

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private final b f78186n;

    /* compiled from: DeserializedTypeParameterDescriptor.kt */
    static final class a extends n0 implements ld.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
            return w.V5(n.this.f78184l.c().d().g(n.this.P0(), n.this.f78184l.g()));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(@fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r12, @fg.l kotlin.reflect.jvm.internal.impl.metadata.a.s r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "簌\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r12, r0)
            java.lang.String r0 = "簍\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r13, r0)
            kotlin.reflect.jvm.internal.impl.storage.n r2 = r12.h()
            kotlin.reflect.jvm.internal.impl.descriptors.m r3 = r12.e()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r0.b()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r0 = r12.g()
            int r1 = r13.O()
            kotlin.reflect.jvm.internal.impl.name.f r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.z.b(r0, r1)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.c0 r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.c0.f78056a
            kotlin.reflect.jvm.internal.impl.metadata.a$s$c r1 = r13.U()
            java.lang.String r6 = "簎\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            kotlin.jvm.internal.l0.o(r1, r6)
            kotlin.reflect.jvm.internal.impl.types.x1 r6 = r0.d(r1)
            boolean r7 = r13.P()
            kotlin.reflect.jvm.internal.impl.descriptors.a1 r9 = kotlin.reflect.jvm.internal.impl.descriptors.a1.f75900a
            kotlin.reflect.jvm.internal.impl.descriptors.d1$a r10 = kotlin.reflect.jvm.internal.impl.descriptors.d1.a.f75932a
            r1 = r11
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f78184l = r12
            r11.f78185m = r13
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b r13 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b
            kotlin.reflect.jvm.internal.impl.storage.n r12 = r12.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$a r14 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$a
            r14.<init>()
            r13.<init>(r12, r14)
            r11.f78186n = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.m, kotlin.reflect.jvm.internal.impl.metadata.a$s, int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.e
    @fg.l
    protected List<h0> M0() {
        List<a.q> s4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.s(this.f78185m, this.f78184l.j());
        if (s4.isEmpty()) {
            return w.k(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(this).y());
        }
        List<a.q> list = s4;
        f0 i4 = this.f78184l.i();
        ArrayList arrayList = new ArrayList(w.b0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i4.q((a.q) it.next()));
        }
        return arrayList;
    }

    @fg.l
    public b O0() {
        return this.f78186n;
    }

    @fg.l
    public final a.s P0() {
        return this.f78185m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.e
    @fg.l
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public Void L0(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("簏\u0001"));
        throw new IllegalStateException(ProtectedSandApp.s("簐\u0001") + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.f78186n;
    }
}
