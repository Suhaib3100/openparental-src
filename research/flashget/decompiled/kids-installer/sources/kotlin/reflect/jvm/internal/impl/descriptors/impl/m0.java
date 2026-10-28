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
import kotlin.reflect.jvm.internal.impl.descriptors.l1;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.types.q1;

/* compiled from: VariableDescriptorImpl.java */
/* loaded from: classes6.dex */
public abstract class m0 extends k implements l1 {

    /* renamed from: t, reason: collision with root package name */
    static final /* synthetic */ boolean f24224t = false;

    /* renamed from: s, reason: collision with root package name */
    protected kotlin.reflect.jvm.internal.impl.types.h0 f24225s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.e kotlin.reflect.jvm.internal.impl.types.h0 h0Var, @d5.d a1 a1Var) {
        super(mVar, gVar, fVar, a1Var);
        if (mVar == null) {
            Q(0);
        }
        if (gVar == null) {
            Q(1);
        }
        if (fVar == null) {
            Q(2);
        }
        if (a1Var == null) {
            Q(3);
        }
        this.f24225s = h0Var;
    }

    private static /* synthetic */ void Q(int i5) {
        String s5;
        int i6;
        switch (i5) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                s5 = ProtectedSandApp.s("腘");
                break;
            default:
                s5 = ProtectedSandApp.s("腗");
                break;
        }
        switch (i5) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i6 = 2;
                break;
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        String s6 = ProtectedSandApp.s("腙");
        switch (i5) {
            case 1:
                objArr[0] = ProtectedSandApp.s("腝");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("腜");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("腛");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = s6;
                break;
            default:
                objArr[0] = ProtectedSandApp.s("腚");
                break;
        }
        switch (i5) {
            case 4:
                objArr[1] = ProtectedSandApp.s("腤");
                break;
            case 5:
                objArr[1] = ProtectedSandApp.s("腣");
                break;
            case 6:
                objArr[1] = ProtectedSandApp.s("腢");
                break;
            case 7:
                objArr[1] = ProtectedSandApp.s("腡");
                break;
            case 8:
                objArr[1] = ProtectedSandApp.s("腠");
                break;
            case 9:
                objArr[1] = ProtectedSandApp.s("腟");
                break;
            case 10:
                objArr[1] = ProtectedSandApp.s("腞");
                break;
            default:
                objArr[1] = s6;
                break;
        }
        switch (i5) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = ProtectedSandApp.s("腥");
                break;
        }
        String format = String.format(s5, objArr);
        switch (i5) {
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
    @d5.d
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public l1 a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean P() {
        return false;
    }

    public void R0(kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        this.f24225s = h0Var;
    }

    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.n d(q1 q1Var) {
        return d(q1Var);
    }

    @d5.d
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> g() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            Q(7);
        }
        return emptySet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i1
    @d5.d
    public kotlin.reflect.jvm.internal.impl.types.h0 getType() {
        kotlin.reflect.jvm.internal.impl.types.h0 h0Var = this.f24225s;
        if (h0Var == null) {
            Q(4);
        }
        return h0Var;
    }

    @d5.d
    public List<f1> getTypeParameters() {
        List<f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            Q(8);
        }
        return emptyList;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.types.h0 i() {
        kotlin.reflect.jvm.internal.impl.types.h0 type = getType();
        if (type == null) {
            Q(10);
        }
        return type;
    }

    public x0 m0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    public List<j1> n() {
        List<j1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            Q(6);
        }
        return emptyList;
    }

    @d5.e
    public <V> V p0(a.InterfaceC0274a<V> interfaceC0274a) {
        return null;
    }

    public boolean s() {
        return false;
    }

    public x0 t0() {
        return null;
    }

    @d5.d
    public List<x0> y0() {
        List<x0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            Q(9);
        }
        return emptyList;
    }
}
