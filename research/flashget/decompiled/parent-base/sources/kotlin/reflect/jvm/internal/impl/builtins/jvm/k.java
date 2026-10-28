package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.InputStream;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.o;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.s;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.u;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.w;
import kotlin.reflect.jvm.internal.impl.storage.n;
import ud.c;

/* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
/* loaded from: classes7.dex */
public final class k extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.a {

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    public static final a f75803f = new a();

    /* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@fg.l n nVar, @fg.l r rVar, @fg.l h0 h0Var, @fg.l k0 k0Var, @fg.l rd.a aVar, @fg.l rd.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.l lVar, @fg.l kotlin.reflect.jvm.internal.impl.types.checker.l lVar2, @fg.l zd.a aVar2) {
        super(nVar, rVar, h0Var);
        l0.p(nVar, ProtectedSandApp.s("榯\u0001"));
        l0.p(rVar, ProtectedSandApp.s("榰\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("榱\u0001"));
        l0.p(k0Var, ProtectedSandApp.s("榲\u0001"));
        l0.p(aVar, ProtectedSandApp.s("榳\u0001"));
        l0.p(cVar, ProtectedSandApp.s("榴\u0001"));
        l0.p(lVar, ProtectedSandApp.s("榵\u0001"));
        l0.p(lVar2, ProtectedSandApp.s("榶\u0001"));
        l0.p(aVar2, ProtectedSandApp.s("榷\u0001"));
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.n nVar2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.n(this);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a aVar3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.f78052r;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.d dVar = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.d(h0Var, k0Var, aVar3);
        w.a aVar4 = w.a.f78273a;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.r rVar2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.f78264a;
        l0.o(rVar2, ProtectedSandApp.s("榸\u0001"));
        i(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.k(nVar, h0Var, lVar, nVar2, dVar, this, aVar4, rVar2, c.a.f92759a, s.a.f78265a, kotlin.collections.w.O(new kotlin.reflect.jvm.internal.impl.builtins.functions.a(nVar, h0Var), new e(nVar, h0Var, null, 4, null)), k0Var, kotlin.reflect.jvm.internal.impl.serialization.deserialization.j.f78219a.a(), aVar, cVar, aVar3.e(), lVar2, aVar2, null, u.f78272a, 262144, null));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.a
    @fg.m
    protected o d(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("榹\u0001"));
        InputStream c5 = f().c(cVar);
        if (c5 != null) {
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.c.f78054p.a(cVar, h(), g(), c5, false);
        }
        return null;
    }
}
