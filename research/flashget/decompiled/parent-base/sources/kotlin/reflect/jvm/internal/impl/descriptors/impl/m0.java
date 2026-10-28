package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.l1;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.types.q1;

/* compiled from: VariableDescriptorImpl.java */
/* loaded from: classes7.dex */
public abstract class m0 extends k implements l1 {

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ boolean f76052g = false;

    /* renamed from: f, reason: collision with root package name */
    protected kotlin.reflect.jvm.internal.impl.types.h0 f76053f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.m kotlin.reflect.jvm.internal.impl.types.h0 h0Var, @fg.l a1 a1Var) {
        super(mVar, gVar, fVar, a1Var);
        if (mVar == null) {
            j0(0);
        }
        if (gVar == null) {
            j0(1);
        }
        if (fVar == null) {
            j0(2);
        }
        if (a1Var == null) {
            j0(3);
        }
        this.f76053f = h0Var;
    }

    private static /* synthetic */ void j0(int i4) {
        String s4;
        int i5;
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                s4 = ProtectedSandApp.s("毦\u0001");
                break;
            default:
                s4 = ProtectedSandApp.s("毥\u0001");
                break;
        }
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i5 = 2;
                break;
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        String s5 = ProtectedSandApp.s("毧\u0001");
        switch (i4) {
            case 1:
                objArr[0] = ProtectedSandApp.s("毫\u0001");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("毪\u0001");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("毩\u0001");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = s5;
                break;
            default:
                objArr[0] = ProtectedSandApp.s("毨\u0001");
                break;
        }
        switch (i4) {
            case 4:
                objArr[1] = ProtectedSandApp.s("毲\u0001");
                break;
            case 5:
                objArr[1] = ProtectedSandApp.s("毱\u0001");
                break;
            case 6:
                objArr[1] = ProtectedSandApp.s("毰\u0001");
                break;
            case 7:
                objArr[1] = ProtectedSandApp.s("毯\u0001");
                break;
            case 8:
                objArr[1] = ProtectedSandApp.s("毮\u0001");
                break;
            case 9:
                objArr[1] = ProtectedSandApp.s("毭\u0001");
                break;
            case 10:
                objArr[1] = ProtectedSandApp.s("毬\u0001");
                break;
            default:
                objArr[1] = s5;
                break;
        }
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = ProtectedSandApp.s("毳\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        switch (i4) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public l1 a() {
        return this;
    }

    public void L0(kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        this.f76053f = h0Var;
    }

    public x0 O() {
        return null;
    }

    public x0 S() {
        return null;
    }

    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.n d(q1 q1Var) {
        return d(q1Var);
    }

    @fg.l
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> e() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            j0(7);
        }
        return emptySet;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.types.h0 getReturnType() {
        kotlin.reflect.jvm.internal.impl.types.h0 type = getType();
        if (type == null) {
            j0(10);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i1
    @fg.l
    public kotlin.reflect.jvm.internal.impl.types.h0 getType() {
        kotlin.reflect.jvm.internal.impl.types.h0 h0Var = this.f76053f;
        if (h0Var == null) {
            j0(4);
        }
        return h0Var;
    }

    @fg.l
    public List<f1> getTypeParameters() {
        List<f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            j0(8);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public List<j1> i() {
        List<j1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            j0(6);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean i0() {
        return false;
    }

    public boolean isConst() {
        return false;
    }

    @fg.m
    public <V> V w0(a.InterfaceC1077a<V> interfaceC1077a) {
        return null;
    }

    @fg.l
    public List<x0> z0() {
        List<x0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            j0(9);
        }
        return emptyList;
    }
}
