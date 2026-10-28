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
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.types.q1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: AbstractReceiverParameterDescriptor.java */
/* loaded from: classes7.dex */
public abstract class c extends j implements x0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        super(gVar, kotlin.reflect.jvm.internal.impl.name.h.f77595h);
        if (gVar == null) {
            j0(0);
        }
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
            case 11:
                s4 = ProtectedSandApp.s("氬\u0001");
                break;
            default:
                s4 = ProtectedSandApp.s("氫\u0001");
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
            case 11:
                i5 = 2;
                break;
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        String s5 = ProtectedSandApp.s("氭\u0001");
        switch (i4) {
            case 2:
                objArr[0] = ProtectedSandApp.s("氰\u0001");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("氯\u0001");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = s5;
                break;
            default:
                objArr[0] = ProtectedSandApp.s("氮\u0001");
                break;
        }
        switch (i4) {
            case 4:
                objArr[1] = ProtectedSandApp.s("永\u0001");
                break;
            case 5:
                objArr[1] = ProtectedSandApp.s("氷\u0001");
                break;
            case 6:
                objArr[1] = ProtectedSandApp.s("氶\u0001");
                break;
            case 7:
                objArr[1] = ProtectedSandApp.s("氵\u0001");
                break;
            case 8:
                objArr[1] = ProtectedSandApp.s("水\u0001");
                break;
            case 9:
                objArr[1] = ProtectedSandApp.s("氳\u0001");
                break;
            case 10:
                objArr[1] = ProtectedSandApp.s("氲\u0001");
                break;
            case 11:
                objArr[1] = ProtectedSandApp.s("氱\u0001");
                break;
            default:
                objArr[1] = s5;
                break;
        }
        switch (i4) {
            case 3:
                objArr[2] = ProtectedSandApp.s("氺\u0001");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = ProtectedSandApp.s("氹\u0001");
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
            case 11:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R E(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d5) {
        return oVar.l(this, d5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public r0 a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.m
    public x0 O() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.m
    public x0 S() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> e() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            j0(8);
        }
        return emptySet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    @fg.l
    public a1 f() {
        a1 a1Var = a1.f75900a;
        if (a1Var == null) {
            j0(11);
        }
        return a1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.m
    public kotlin.reflect.jvm.internal.impl.types.h0 getReturnType() {
        return getType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i1
    @fg.l
    public kotlin.reflect.jvm.internal.impl.types.h0 getType() {
        kotlin.reflect.jvm.internal.impl.types.h0 type = getValue().getType();
        if (type == null) {
            j0(6);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public List<f1> getTypeParameters() {
        List<f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            j0(5);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.u getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar = kotlin.reflect.jvm.internal.impl.descriptors.t.f76291f;
        if (uVar == null) {
            j0(9);
        }
        return uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public List<j1> i() {
        List<j1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            j0(7);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean i0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.m
    public <V> V w0(a.InterfaceC1077a<V> interfaceC1077a) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    public List<x0> z0() {
        List<x0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            j0(4);
        }
        return emptyList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        super(gVar, fVar);
        if (gVar == null) {
            j0(1);
        }
        if (fVar == null) {
            j0(2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c1
    @fg.m
    public x0 d(@fg.l q1 q1Var) {
        if (q1Var == null) {
            j0(3);
        }
        if (q1Var.k()) {
            return this;
        }
        kotlin.reflect.jvm.internal.impl.types.h0 p4 = c() instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? q1Var.p(getType(), x1.OUT_VARIANCE) : q1Var.p(getType(), x1.INVARIANT);
        if (p4 == null) {
            return null;
        }
        return p4 == getType() ? this : new f0(c(), new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.k(p4), getAnnotations());
    }
}
