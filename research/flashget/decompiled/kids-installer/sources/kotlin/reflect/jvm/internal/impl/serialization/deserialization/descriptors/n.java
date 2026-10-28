package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.collections.z;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.e0;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: DeserializedTypeParameterDescriptor.kt */
/* loaded from: classes6.dex */
public final class n extends kotlin.reflect.jvm.internal.impl.descriptors.impl.b {

    @d5.d
    private final b A;

    /* renamed from: y, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m f26178y;

    /* renamed from: z, reason: collision with root package name */
    @d5.d
    private final a.s f26179z;

    /* compiled from: DeserializedTypeParameterDescriptor.kt */
    static final class a extends Lambda implements q3.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {
        a() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> n() {
            List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> V5;
            V5 = j0.V5(n.this.f26178y.c().d().a(n.this.V0(), n.this.f26178y.g()));
            return V5;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(@d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r12, @d5.d kotlin.reflect.jvm.internal.impl.metadata.a.s r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "蠑"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r12, r0)
            java.lang.String r0 = "蠒"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r13, r0)
            kotlin.reflect.jvm.internal.impl.storage.n r2 = r12.h()
            kotlin.reflect.jvm.internal.impl.descriptors.m r3 = r12.e()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r0.b()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r0 = r12.g()
            int r1 = r13.N()
            kotlin.reflect.jvm.internal.impl.name.f r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.y.b(r0, r1)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0 r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0.f26063a
            kotlin.reflect.jvm.internal.impl.metadata.a$s$c r1 = r13.T()
            java.lang.String r6 = "蠓"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            kotlin.jvm.internal.l0.o(r1, r6)
            kotlin.reflect.jvm.internal.impl.types.x1 r6 = r0.d(r1)
            boolean r7 = r13.O()
            kotlin.reflect.jvm.internal.impl.descriptors.a1 r9 = kotlin.reflect.jvm.internal.impl.descriptors.a1.f24103a
            kotlin.reflect.jvm.internal.impl.descriptors.d1$a r10 = kotlin.reflect.jvm.internal.impl.descriptors.d1.a.f24134a
            r1 = r11
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f26178y = r12
            r11.f26179z = r13
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b r13 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b
            kotlin.reflect.jvm.internal.impl.storage.n r12 = r12.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$a r14 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$a
            r14.<init>()
            r13.<init>(r12, r14)
            r11.A = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.m, kotlin.reflect.jvm.internal.impl.metadata.a$s, int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.e
    @d5.d
    protected List<h0> S0() {
        int b02;
        List<h0> k5;
        List<a.q> s5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.s(this.f26179z, this.f26178y.j());
        if (s5.isEmpty()) {
            k5 = z.k(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(this).y());
            return k5;
        }
        e0 i5 = this.f26178y.i();
        b02 = b0.b0(s5, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = s5.iterator();
        while (it.hasNext()) {
            arrayList.add(i5.q((a.q) it.next()));
        }
        return arrayList;
    }

    @d5.d
    public b U0() {
        return this.A;
    }

    @d5.d
    public final a.s V0() {
        return this.f26179z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.e
    @d5.d
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public Void R0(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("蠔"));
        throw new IllegalStateException(ProtectedSandApp.s("蠕") + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.A;
    }
}
