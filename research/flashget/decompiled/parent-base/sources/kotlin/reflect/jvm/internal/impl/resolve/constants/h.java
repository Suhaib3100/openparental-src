package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: ConstantValueFactory.kt */
@r1({"SMAP\nConstantValueFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstantValueFactory.kt\norg/jetbrains/kotlin/resolve/constants/ConstantValueFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1603#2,9:104\n1855#2:113\n1856#2:115\n1612#2:116\n1#3:114\n*S KotlinDebug\n*F\n+ 1 ConstantValueFactory.kt\norg/jetbrains/kotlin/resolve/constants/ConstantValueFactory\n*L\n64#1:104,9\n64#1:113\n64#1:115\n64#1:116\n64#1:114\n*E\n"})
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final h f77876a = new h();

    /* compiled from: ConstantValueFactory.kt */
    static final class a extends n0 implements ld.l<h0, kotlin.reflect.jvm.internal.impl.types.h0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.i f77877b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.jvm.internal.impl.builtins.i iVar) {
            super(1);
            this.f77877b = iVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.types.h0 invoke(@fg.l h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("碬\u0001"));
            p0 O = h0Var.p().O(this.f77877b);
            l0.o(O, ProtectedSandApp.s("碭\u0001"));
            return O;
        }
    }

    private h() {
    }

    private final b a(List<?> list, h0 h0Var, kotlin.reflect.jvm.internal.impl.builtins.i iVar) {
        List V5 = kotlin.collections.w.V5(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = V5.iterator();
        while (it.hasNext()) {
            g d5 = d(this, it.next(), null, 2, null);
            if (d5 != null) {
                arrayList.add(d5);
            }
        }
        if (h0Var == null) {
            return new b(arrayList, new a(iVar));
        }
        p0 O = h0Var.p().O(iVar);
        l0.o(O, ProtectedSandApp.s("碮\u0001"));
        return new w(arrayList, O);
    }

    public static /* synthetic */ g d(h hVar, Object obj, h0 h0Var, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            h0Var = null;
        }
        return hVar.c(obj, h0Var);
    }

    @fg.l
    public final b b(@fg.l List<? extends g<?>> list, @fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        l0.p(list, ProtectedSandApp.s("碯\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("碰\u0001"));
        return new w(list, h0Var);
    }

    @fg.m
    public final g<?> c(@fg.m Object obj, @fg.m h0 h0Var) {
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new u(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new m(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new r(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            Character ch = (Character) obj;
            ch.charValue();
            return new e(ch);
        }
        if (obj instanceof Float) {
            return new l(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new i(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return new c(bool);
        }
        if (obj instanceof String) {
            return new v((String) obj);
        }
        if (obj instanceof byte[]) {
            return a(kotlin.collections.l.Ey((byte[]) obj), h0Var, kotlin.reflect.jvm.internal.impl.builtins.i.BYTE);
        }
        if (obj instanceof short[]) {
            return a(kotlin.collections.l.Ly((short[]) obj), h0Var, kotlin.reflect.jvm.internal.impl.builtins.i.SHORT);
        }
        if (obj instanceof int[]) {
            return a(kotlin.collections.l.Iy((int[]) obj), h0Var, kotlin.reflect.jvm.internal.impl.builtins.i.INT);
        }
        if (obj instanceof long[]) {
            return a(kotlin.collections.l.Jy((long[]) obj), h0Var, kotlin.reflect.jvm.internal.impl.builtins.i.LONG);
        }
        if (obj instanceof char[]) {
            return a(kotlin.collections.l.Fy((char[]) obj), h0Var, kotlin.reflect.jvm.internal.impl.builtins.i.CHAR);
        }
        if (obj instanceof float[]) {
            return a(kotlin.collections.l.Hy((float[]) obj), h0Var, kotlin.reflect.jvm.internal.impl.builtins.i.FLOAT);
        }
        if (obj instanceof double[]) {
            return a(kotlin.collections.l.Gy((double[]) obj), h0Var, kotlin.reflect.jvm.internal.impl.builtins.i.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return a(kotlin.collections.l.My((boolean[]) obj), h0Var, kotlin.reflect.jvm.internal.impl.builtins.i.BOOLEAN);
        }
        if (obj == null) {
            return new s(null);
        }
        return null;
    }
}
