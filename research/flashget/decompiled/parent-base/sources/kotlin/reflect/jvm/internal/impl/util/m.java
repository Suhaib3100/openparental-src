package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.util.f;

/* compiled from: modifierChecks.kt */
@r1({"SMAP\nmodifierChecks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/NoDefaultAndVarargsCheck\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,264:1\n1726#2,3:265\n*S KotlinDebug\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/NoDefaultAndVarargsCheck\n*L\n105#1:265,3\n*E\n"})
/* loaded from: classes7.dex */
final class m implements f {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final String f78609b = ProtectedSandApp.s("胐\u0001");

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final m f78608a = new m();

    private m() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @fg.l
    public String a() {
        return f78609b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @fg.m
    public String b(@fg.l z zVar) {
        return f.a.a(this, zVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    public boolean c(@fg.l z zVar) {
        l0.p(zVar, ProtectedSandApp.s("胑\u0001"));
        List<j1> i4 = zVar.i();
        l0.o(i4, ProtectedSandApp.s("胒\u0001"));
        List<j1> list = i4;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (j1 j1Var : list) {
            l0.m(j1Var);
            if (kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.c(j1Var) || j1Var.x0() != null) {
                return false;
            }
        }
        return true;
    }
}
