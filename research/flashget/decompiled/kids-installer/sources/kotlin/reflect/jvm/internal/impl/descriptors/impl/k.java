package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;

/* compiled from: DeclarationDescriptorNonRootImpl.java */
/* loaded from: classes6.dex */
public abstract class k extends j implements kotlin.reflect.jvm.internal.impl.descriptors.n {

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.m f24213q;

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    private final a1 f24214r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected k(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d a1 a1Var) {
        super(gVar, fVar);
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
        this.f24213q = mVar;
        this.f24214r = a1Var;
    }

    private static /* synthetic */ void Q(int i5) {
        String s5 = (i5 == 4 || i5 == 5 || i5 == 6) ? ProtectedSandApp.s("肁") : ProtectedSandApp.s("肀");
        Object[] objArr = new Object[(i5 == 4 || i5 == 5 || i5 == 6) ? 2 : 3];
        String s6 = ProtectedSandApp.s("肂");
        switch (i5) {
            case 1:
                objArr[0] = ProtectedSandApp.s("肆");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("肅");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("肄");
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = s6;
                break;
            default:
                objArr[0] = ProtectedSandApp.s("肃");
                break;
        }
        if (i5 == 4) {
            objArr[1] = ProtectedSandApp.s("肉");
        } else if (i5 == 5) {
            objArr[1] = ProtectedSandApp.s("肈");
        } else if (i5 != 6) {
            objArr[1] = s6;
        } else {
            objArr[1] = ProtectedSandApp.s("肇");
        }
        if (i5 != 4 && i5 != 5 && i5 != 6) {
            objArr[2] = ProtectedSandApp.s("肊");
        }
        String format = String.format(s5, objArr);
        if (i5 != 4 && i5 != 5 && i5 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.p a() {
        return this;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.m b() {
        kotlin.reflect.jvm.internal.impl.descriptors.m mVar = this.f24213q;
        if (mVar == null) {
            Q(5);
        }
        return mVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    @d5.d
    public a1 k() {
        a1 a1Var = this.f24214r;
        if (a1Var == null) {
            Q(6);
        }
        return a1Var;
    }
}
