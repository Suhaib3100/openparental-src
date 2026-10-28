package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: ConstantValueFactory.kt */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final h f25899a = new h();

    /* compiled from: ConstantValueFactory.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<h0, kotlin.reflect.jvm.internal.impl.types.h0> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.h0 f25900p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
            super(1);
            this.f25900p = h0Var;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.types.h0 N(@d5.d h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("虣"));
            return this.f25900p;
        }
    }

    /* compiled from: ConstantValueFactory.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l<h0, kotlin.reflect.jvm.internal.impl.types.h0> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.i f25901p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.reflect.jvm.internal.impl.builtins.i iVar) {
            super(1);
            this.f25901p = iVar;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.types.h0 N(@d5.d h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("虤"));
            p0 O = h0Var.A().O(this.f25901p);
            l0.o(O, ProtectedSandApp.s("虥"));
            return O;
        }
    }

    private h() {
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.b a(List<?> list, kotlin.reflect.jvm.internal.impl.builtins.i iVar) {
        List V5;
        V5 = j0.V5(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = V5.iterator();
        while (it.hasNext()) {
            g<?> c6 = c(it.next());
            if (c6 != null) {
                arrayList.add(c6);
            }
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.b(arrayList, new b(iVar));
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.b b(@d5.d List<? extends g<?>> list, @d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        l0.p(list, ProtectedSandApp.s("兽"));
        l0.p(h0Var, ProtectedSandApp.s("兾"));
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.b(list, new a(h0Var));
    }

    @d5.e
    public final g<?> c(@d5.e Object obj) {
        List<?> Ly;
        List<?> Fy;
        List<?> Gy;
        List<?> Ey;
        List<?> Iy;
        List<?> Hy;
        List<?> Ky;
        List<?> Dy;
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
            return new e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new l(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new i(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new v((String) obj);
        }
        if (obj instanceof byte[]) {
            Dy = kotlin.collections.t.Dy((byte[]) obj);
            return a(Dy, kotlin.reflect.jvm.internal.impl.builtins.i.BYTE);
        }
        if (obj instanceof short[]) {
            Ky = kotlin.collections.t.Ky((short[]) obj);
            return a(Ky, kotlin.reflect.jvm.internal.impl.builtins.i.SHORT);
        }
        if (obj instanceof int[]) {
            Hy = kotlin.collections.t.Hy((int[]) obj);
            return a(Hy, kotlin.reflect.jvm.internal.impl.builtins.i.INT);
        }
        if (obj instanceof long[]) {
            Iy = kotlin.collections.t.Iy((long[]) obj);
            return a(Iy, kotlin.reflect.jvm.internal.impl.builtins.i.LONG);
        }
        if (obj instanceof char[]) {
            Ey = kotlin.collections.t.Ey((char[]) obj);
            return a(Ey, kotlin.reflect.jvm.internal.impl.builtins.i.CHAR);
        }
        if (obj instanceof float[]) {
            Gy = kotlin.collections.t.Gy((float[]) obj);
            return a(Gy, kotlin.reflect.jvm.internal.impl.builtins.i.FLOAT);
        }
        if (obj instanceof double[]) {
            Fy = kotlin.collections.t.Fy((double[]) obj);
            return a(Fy, kotlin.reflect.jvm.internal.impl.builtins.i.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            Ly = kotlin.collections.t.Ly((boolean[]) obj);
            return a(Ly, kotlin.reflect.jvm.internal.impl.builtins.i.BOOLEAN);
        }
        if (obj == null) {
            return new s();
        }
        return null;
    }
}
