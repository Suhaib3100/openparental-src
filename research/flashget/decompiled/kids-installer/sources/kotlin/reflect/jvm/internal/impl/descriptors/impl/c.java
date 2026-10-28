package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes6.dex */
public abstract class c extends j implements x0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        super(gVar, kotlin.reflect.jvm.internal.impl.name.h.f25613i);
        if (gVar == null) {
            Q(0);
        }
    }

    private static /* synthetic */ void Q(int i5) {
        String s5;
        int i6;
        switch (i5) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                s5 = ProtectedSandApp.s("膞");
                break;
            default:
                s5 = ProtectedSandApp.s("膝");
                break;
        }
        switch (i5) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i6 = 2;
                break;
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        String s6 = ProtectedSandApp.s("膟");
        switch (i5) {
            case 1:
                objArr[0] = ProtectedSandApp.s("膡");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[0] = s6;
                break;
            default:
                objArr[0] = ProtectedSandApp.s("膠");
                break;
        }
        switch (i5) {
            case 2:
                objArr[1] = ProtectedSandApp.s("膩");
                break;
            case 3:
                objArr[1] = ProtectedSandApp.s("膨");
                break;
            case 4:
                objArr[1] = ProtectedSandApp.s("膧");
                break;
            case 5:
                objArr[1] = ProtectedSandApp.s("膦");
                break;
            case 6:
                objArr[1] = ProtectedSandApp.s("膥");
                break;
            case 7:
                objArr[1] = ProtectedSandApp.s("膤");
                break;
            case 8:
                objArr[1] = ProtectedSandApp.s("膣");
                break;
            case 9:
                objArr[1] = ProtectedSandApp.s("膢");
                break;
            default:
                objArr[1] = s6;
                break;
        }
        switch (i5) {
            case 1:
                objArr[2] = ProtectedSandApp.s("膫");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = ProtectedSandApp.s("膪");
                break;
        }
        String format = String.format(s5, objArr);
        switch (i5) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public r0 a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean P() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R T(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d6) {
        return oVar.l(this, d6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.u c() {
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar = kotlin.reflect.jvm.internal.impl.descriptors.t.f24441f;
        if (uVar == null) {
            Q(7);
        }
        return uVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> g() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            Q(6);
        }
        return emptySet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i1
    @d5.d
    public kotlin.reflect.jvm.internal.impl.types.h0 getType() {
        kotlin.reflect.jvm.internal.impl.types.h0 type = getValue().getType();
        if (type == null) {
            Q(4);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public List<f1> getTypeParameters() {
        List<f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            Q(3);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.e
    public kotlin.reflect.jvm.internal.impl.types.h0 i() {
        return getType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    @d5.d
    public a1 k() {
        a1 a1Var = a1.f24103a;
        if (a1Var == null) {
            Q(9);
        }
        return a1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.e
    public x0 m0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public List<j1> n() {
        List<j1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            Q(5);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.e
    public <V> V p0(a.InterfaceC0274a<V> interfaceC0274a) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.e
    public x0 t0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public List<x0> y0() {
        List<x0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            Q(2);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c1
    @d5.e
    public x0 d(@d5.d q1 q1Var) {
        if (q1Var == null) {
            Q(1);
        }
        if (q1Var.k()) {
            return this;
        }
        kotlin.reflect.jvm.internal.impl.types.h0 p5 = b() instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? q1Var.p(getType(), x1.OUT_VARIANCE) : q1Var.p(getType(), x1.INVARIANT);
        if (p5 == null) {
            return null;
        }
        return p5 == getType() ? this : new f0(b(), new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.k(p5), getAnnotations());
    }
}
