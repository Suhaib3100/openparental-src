package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.InputStream;
import java.util.List;
import kotlin.collections.a0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.p;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.o;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.r;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.s;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.v;
import kotlin.reflect.jvm.internal.impl.storage.n;
import z3.c;

/* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
/* loaded from: classes6.dex */
public final class j extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.a {

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    public static final a f24007f = new a(null);

    /* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@d5.d n nVar, @d5.d p pVar, @d5.d h0 h0Var, @d5.d k0 k0Var, @d5.d w3.a aVar, @d5.d w3.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.l lVar, @d5.d kotlin.reflect.jvm.internal.impl.types.checker.l lVar2, @d5.d e4.a aVar2) {
        super(nVar, pVar, h0Var);
        List O;
        l0.p(nVar, ProtectedSandApp.s("胻"));
        l0.p(pVar, ProtectedSandApp.s("胼"));
        l0.p(h0Var, ProtectedSandApp.s("能"));
        l0.p(k0Var, ProtectedSandApp.s("胾"));
        l0.p(aVar, ProtectedSandApp.s("胿"));
        l0.p(cVar, ProtectedSandApp.s("脀"));
        l0.p(lVar, ProtectedSandApp.s("脁"));
        l0.p(lVar2, ProtectedSandApp.s("脂"));
        l0.p(aVar2, ProtectedSandApp.s("脃"));
        o oVar = new o(this);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a aVar3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.f26072n;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.d dVar = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.d(h0Var, k0Var, aVar3);
        v.a aVar4 = v.a.f26261a;
        r rVar = r.f26255a;
        l0.o(rVar, ProtectedSandApp.s("脄"));
        c.a aVar5 = c.a.f34404a;
        s.a aVar6 = s.a.f26256a;
        O = a0.O(new kotlin.reflect.jvm.internal.impl.builtins.functions.a(nVar, h0Var), new e(nVar, h0Var, null, 4, null));
        i(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.k(nVar, h0Var, lVar, oVar, dVar, this, aVar4, rVar, aVar5, aVar6, O, k0Var, kotlin.reflect.jvm.internal.impl.serialization.deserialization.j.f26210a.a(), aVar, cVar, aVar3.e(), lVar2, aVar2, null, null, 786432, null));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.a
    @d5.e
    protected kotlin.reflect.jvm.internal.impl.serialization.deserialization.p d(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("脅"));
        InputStream a6 = f().a(cVar);
        if (a6 != null) {
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.c.C.a(cVar, h(), g(), a6, false);
        }
        return null;
    }
}
