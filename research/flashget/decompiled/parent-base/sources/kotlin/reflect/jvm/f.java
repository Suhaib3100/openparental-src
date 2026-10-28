package kotlin.reflect.jvm;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.h;
import kotlin.reflect.i;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.y;
import kotlin.reflect.jvm.internal.j;
import kotlin.reflect.jvm.internal.p0;
import kotlin.reflect.jvm.internal.s;
import kotlin.v;
import ld.p;

/* compiled from: reflectLambda.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"R", "Lkotlin/v;", "Lkotlin/reflect/i;", "a", "(Lkotlin/v;)Lkotlin/reflect/i;", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nreflectLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 reflectLambda.kt\nkotlin/reflect/jvm/ReflectLambdaKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* loaded from: classes7.dex */
public final class f {

    /* compiled from: reflectLambda.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class a extends g0 implements p<y, a.i, z0> {

        /* renamed from: d, reason: collision with root package name */
        public static final a f75542d = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final z0 invoke(@l y yVar, @l a.i iVar) {
            l0.p(yVar, ProtectedSandApp.s("晜\u0001"));
            l0.p(iVar, ProtectedSandApp.s("晝\u0001"));
            return yVar.j(iVar);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @l
        public final String getName() {
            return ProtectedSandApp.s("晞\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @l
        public final h getOwner() {
            return l1.d(y.class);
        }

        @Override // kotlin.jvm.internal.q
        @l
        public final String getSignature() {
            return ProtectedSandApp.s("晟\u0001");
        }
    }

    @kotlin.reflect.jvm.a
    @m
    public static final <R> i<R> a(@l v<? extends R> vVar) {
        l0.p(vVar, ProtectedSandApp.s("晠\u0001"));
        Metadata metadata = (Metadata) vVar.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] d12 = metadata.d1();
        if (d12.length == 0) {
            d12 = null;
        }
        if (d12 == null) {
            return null;
        }
        q0<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f, a.i> j4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.j(d12, metadata.d2());
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f a5 = j4.a();
        a.i b5 = j4.b();
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e eVar = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e(metadata.mv(), (metadata.xi() & 8) != 0);
        Class<?> cls = vVar.getClass();
        a.t n02 = b5.n0();
        l0.o(n02, ProtectedSandApp.s("晡\u0001"));
        return new s(j.f78693e, (z0) p0.h(cls, b5, a5, new g(n02), eVar, a.f75542d));
    }
}
