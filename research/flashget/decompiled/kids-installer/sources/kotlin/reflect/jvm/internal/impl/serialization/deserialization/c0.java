package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: ProtoEnumFlagsUtils.kt */
/* loaded from: classes5.dex */
public final class c0 {

    /* compiled from: ProtoEnumFlagsUtils.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26074a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f26075b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f26076c;

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
            f26074a = iArr;
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
            f26075b = iArr2;
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
            f26076c = iArr3;
        }
    }

    @d5.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.u a(@d5.d b0 b0Var, @d5.e a.x xVar) {
        l0.p(b0Var, ProtectedSandApp.s("厒"));
        int i5 = xVar == null ? -1 : a.f26076c[xVar.ordinal()];
        String s5 = ProtectedSandApp.s("厓");
        switch (i5) {
            case 1:
                kotlin.reflect.jvm.internal.impl.descriptors.u uVar = kotlin.reflect.jvm.internal.impl.descriptors.t.f24439d;
                l0.o(uVar, ProtectedSandApp.s("厘"));
                return uVar;
            case 2:
                kotlin.reflect.jvm.internal.impl.descriptors.u uVar2 = kotlin.reflect.jvm.internal.impl.descriptors.t.f24436a;
                l0.o(uVar2, s5);
                return uVar2;
            case 3:
                kotlin.reflect.jvm.internal.impl.descriptors.u uVar3 = kotlin.reflect.jvm.internal.impl.descriptors.t.f24437b;
                l0.o(uVar3, ProtectedSandApp.s("厗"));
                return uVar3;
            case 4:
                kotlin.reflect.jvm.internal.impl.descriptors.u uVar4 = kotlin.reflect.jvm.internal.impl.descriptors.t.f24438c;
                l0.o(uVar4, ProtectedSandApp.s("厖"));
                return uVar4;
            case 5:
                kotlin.reflect.jvm.internal.impl.descriptors.u uVar5 = kotlin.reflect.jvm.internal.impl.descriptors.t.f24440e;
                l0.o(uVar5, ProtectedSandApp.s("厕"));
                return uVar5;
            case 6:
                kotlin.reflect.jvm.internal.impl.descriptors.u uVar6 = kotlin.reflect.jvm.internal.impl.descriptors.t.f24441f;
                l0.o(uVar6, ProtectedSandApp.s("厔"));
                return uVar6;
            default:
                kotlin.reflect.jvm.internal.impl.descriptors.u uVar7 = kotlin.reflect.jvm.internal.impl.descriptors.t.f24436a;
                l0.o(uVar7, s5);
                return uVar7;
        }
    }

    @d5.d
    public static final b.a b(@d5.d b0 b0Var, @d5.e a.j jVar) {
        l0.p(b0Var, ProtectedSandApp.s("厙"));
        int i5 = jVar == null ? -1 : a.f26074a[jVar.ordinal()];
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? b.a.DECLARATION : b.a.SYNTHESIZED : b.a.DELEGATION : b.a.FAKE_OVERRIDE : b.a.DECLARATION;
    }
}
