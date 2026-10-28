package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.f1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.v;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: annotationUtil.kt */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.f f24108a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.f f24109b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.f f24110c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.f f24111d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.f f24112e;

    /* compiled from: annotationUtil.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<h0, kotlin.reflect.jvm.internal.impl.types.h0> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.h f24113p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.jvm.internal.impl.builtins.h hVar) {
            super(1);
            this.f24113p = hVar;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.types.h0 N(@d5.d h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("脆"));
            p0 l5 = h0Var.A().l(x1.INVARIANT, this.f24113p.W());
            l0.o(l5, ProtectedSandApp.s("脇"));
            return l5;
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䛷"));
        l0.o(p5, ProtectedSandApp.s("䛸"));
        f24108a = p5;
        kotlin.reflect.jvm.internal.impl.name.f p6 = kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䛹"));
        l0.o(p6, ProtectedSandApp.s("䛺"));
        f24109b = p6;
        kotlin.reflect.jvm.internal.impl.name.f p7 = kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䛻"));
        l0.o(p7, ProtectedSandApp.s("䛼"));
        f24110c = p7;
        kotlin.reflect.jvm.internal.impl.name.f p8 = kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䛽"));
        l0.o(p8, ProtectedSandApp.s("䛾"));
        f24111d = p8;
        kotlin.reflect.jvm.internal.impl.name.f p9 = kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䛿"));
        l0.o(p9, ProtectedSandApp.s("䜀"));
        f24112e = p9;
    }

    @d5.d
    public static final c a(@d5.d kotlin.reflect.jvm.internal.impl.builtins.h hVar, @d5.d String str, @d5.d String str2, @d5.d String str3) {
        Map W;
        Map W2;
        l0.p(hVar, ProtectedSandApp.s("䜁"));
        l0.p(str, ProtectedSandApp.s("䜂"));
        l0.p(str2, ProtectedSandApp.s("䜃"));
        l0.p(str3, ProtectedSandApp.s("䜄"));
        kotlin.reflect.jvm.internal.impl.name.c cVar = l.a.B;
        W = f1.W(new Pair(f24111d, new v(str2)), new Pair(f24112e, new kotlin.reflect.jvm.internal.impl.resolve.constants.b(EmptyList.f23167o, new a(hVar))));
        j jVar = new j(hVar, cVar, W);
        kotlin.reflect.jvm.internal.impl.name.c cVar2 = l.a.f24089y;
        kotlin.reflect.jvm.internal.impl.name.f fVar = f24110c;
        kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.A);
        l0.o(m5, ProtectedSandApp.s("䜅"));
        kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(str3);
        l0.o(p5, ProtectedSandApp.s("䜆"));
        W2 = f1.W(new Pair(f24108a, new v(str)), new Pair(f24109b, new kotlin.reflect.jvm.internal.impl.resolve.constants.a(jVar)), new Pair(fVar, new kotlin.reflect.jvm.internal.impl.resolve.constants.j(m5, p5)));
        return new j(hVar, cVar2, W2);
    }

    public static /* synthetic */ c b(kotlin.reflect.jvm.internal.impl.builtins.h hVar, String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str2 = "";
        }
        if ((i5 & 4) != 0) {
            str3 = ProtectedSandApp.s("䜇");
        }
        return a(hVar, str, str2, str3);
    }
}
