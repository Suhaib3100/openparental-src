package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ReceiverParameterDescriptorImpl.java */
/* loaded from: classes7.dex */
public class f0 extends c {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ boolean f76018f = false;

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.m f76019d;

    /* renamed from: e, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h f76020e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        this(mVar, hVar, gVar, kotlin.reflect.jvm.internal.impl.name.h.f77595h);
        if (mVar == null) {
            j0(0);
        }
        if (hVar == null) {
            j0(1);
        }
        if (gVar == null) {
            j0(2);
        }
    }

    private static /* synthetic */ void j0(int i4) {
        String s4 = (i4 == 7 || i4 == 8) ? ProtectedSandApp.s("沃\u0001") : ProtectedSandApp.s("沂\u0001");
        Object[] objArr = new Object[(i4 == 7 || i4 == 8) ? 2 : 3];
        String s5 = ProtectedSandApp.s("沄\u0001");
        switch (i4) {
            case 1:
            case 4:
                objArr[0] = ProtectedSandApp.s("沊\u0001");
                break;
            case 2:
            case 5:
                objArr[0] = ProtectedSandApp.s("沉\u0001");
                break;
            case 3:
            default:
                objArr[0] = ProtectedSandApp.s("沅\u0001");
                break;
            case 6:
                objArr[0] = ProtectedSandApp.s("沈\u0001");
                break;
            case 7:
            case 8:
                objArr[0] = s5;
                break;
            case 9:
                objArr[0] = ProtectedSandApp.s("沇\u0001");
                break;
            case 10:
                objArr[0] = ProtectedSandApp.s("沆\u0001");
                break;
        }
        if (i4 == 7) {
            objArr[1] = ProtectedSandApp.s("沌\u0001");
        } else if (i4 != 8) {
            objArr[1] = s5;
        } else {
            objArr[1] = ProtectedSandApp.s("沋\u0001");
        }
        switch (i4) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = ProtectedSandApp.s("沏\u0001");
                break;
            case 10:
                objArr[2] = ProtectedSandApp.s("沎\u0001");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("沍\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        if (i4 != 7 && i4 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.m c() {
        kotlin.reflect.jvm.internal.impl.descriptors.m mVar = this.f76019d;
        if (mVar == null) {
            j0(8);
        }
        return mVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.x0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h getValue() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar = this.f76020e;
        if (hVar == null) {
            j0(7);
        }
        return hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        super(gVar, fVar);
        if (mVar == null) {
            j0(3);
        }
        if (hVar == null) {
            j0(4);
        }
        if (gVar == null) {
            j0(5);
        }
        if (fVar == null) {
            j0(6);
        }
        this.f76019d = mVar;
        this.f76020e = hVar;
    }
}
