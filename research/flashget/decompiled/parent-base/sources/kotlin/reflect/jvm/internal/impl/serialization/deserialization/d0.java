package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: ProtoEnumFlagsUtils.kt */
/* loaded from: classes7.dex */
public final class d0 {

    /* compiled from: ProtoEnumFlagsUtils.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78068a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f78069b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f78070c;

        static {
            int[] iArr = new int[a.j.values().length];
            try {
                iArr[a.j.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.j.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.j.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.j.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f78068a = iArr;
            int[] iArr2 = new int[b.a.values().length];
            try {
                iArr2[b.a.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[b.a.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[b.a.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[b.a.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f78069b = iArr2;
            int[] iArr3 = new int[a.x.values().length];
            try {
                iArr3[a.x.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[a.x.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[a.x.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[a.x.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[a.x.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[a.x.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f78070c = iArr3;
        }
    }

    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.descriptors.u a(@fg.l c0 c0Var, @fg.m a.x xVar) {
        l0.p(c0Var, ProtectedSandApp.s("笶\u0001"));
        int i4 = xVar == null ? -1 : a.f78070c[xVar.ordinal()];
        String s4 = ProtectedSandApp.s("笷\u0001");
        switch (i4) {
            case 1:
                kotlin.reflect.jvm.internal.impl.descriptors.u uVar = kotlin.reflect.jvm.internal.impl.descriptors.t.f76289d;
                l0.o(uVar, ProtectedSandApp.s("笼\u0001"));
                return uVar;
            case 2:
                kotlin.reflect.jvm.internal.impl.descriptors.u uVar2 = kotlin.reflect.jvm.internal.impl.descriptors.t.f76286a;
                l0.o(uVar2, s4);
                return uVar2;
            case 3:
                kotlin.reflect.jvm.internal.impl.descriptors.u uVar3 = kotlin.reflect.jvm.internal.impl.descriptors.t.f76287b;
                l0.o(uVar3, ProtectedSandApp.s("笻\u0001"));
                return uVar3;
            case 4:
                kotlin.reflect.jvm.internal.impl.descriptors.u uVar4 = kotlin.reflect.jvm.internal.impl.descriptors.t.f76288c;
                l0.o(uVar4, ProtectedSandApp.s("笺\u0001"));
                return uVar4;
            case 5:
                kotlin.reflect.jvm.internal.impl.descriptors.u uVar5 = kotlin.reflect.jvm.internal.impl.descriptors.t.f76290e;
                l0.o(uVar5, ProtectedSandApp.s("笹\u0001"));
                return uVar5;
            case 6:
                kotlin.reflect.jvm.internal.impl.descriptors.u uVar6 = kotlin.reflect.jvm.internal.impl.descriptors.t.f76291f;
                l0.o(uVar6, ProtectedSandApp.s("笸\u0001"));
                return uVar6;
            default:
                kotlin.reflect.jvm.internal.impl.descriptors.u uVar7 = kotlin.reflect.jvm.internal.impl.descriptors.t.f76286a;
                l0.o(uVar7, s4);
                return uVar7;
        }
    }

    @fg.l
    public static final b.a b(@fg.l c0 c0Var, @fg.m a.j jVar) {
        l0.p(c0Var, ProtectedSandApp.s("笶\u0001"));
        int i4 = jVar == null ? -1 : a.f78068a[jVar.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? b.a.DECLARATION : b.a.SYNTHESIZED : b.a.DELEGATION : b.a.FAKE_OVERRIDE : b.a.DECLARATION;
    }
}
