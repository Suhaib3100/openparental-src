package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: ProtoEnumFlags.kt */
/* loaded from: classes7.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final c0 f78056a = new c0();

    /* compiled from: ProtoEnumFlags.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78057a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f78058b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f78059c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f78060d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f78061e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f78062f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f78063g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f78064h;

        static {
            int[] iArr = new int[a.k.values().length];
            try {
                iArr[a.k.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.k.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.k.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.k.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f78057a = iArr;
            int[] iArr2 = new int[kotlin.reflect.jvm.internal.impl.descriptors.e0.values().length];
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.descriptors.e0.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.descriptors.e0.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.descriptors.e0.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f78058b = iArr2;
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
            f78059c = iArr3;
            int[] iArr4 = new int[a.c.EnumC1120c.values().length];
            try {
                iArr4[a.c.EnumC1120c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[a.c.EnumC1120c.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[a.c.EnumC1120c.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[a.c.EnumC1120c.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[a.c.EnumC1120c.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[a.c.EnumC1120c.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[a.c.EnumC1120c.COMPANION_OBJECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            f78060d = iArr4;
            int[] iArr5 = new int[kotlin.reflect.jvm.internal.impl.descriptors.f.values().length];
            try {
                iArr5[kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[kotlin.reflect.jvm.internal.impl.descriptors.f.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[kotlin.reflect.jvm.internal.impl.descriptors.f.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            f78061e = iArr5;
            int[] iArr6 = new int[a.s.c.values().length];
            try {
                iArr6[a.s.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[a.s.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[a.s.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            f78062f = iArr6;
            int[] iArr7 = new int[a.q.b.c.values().length];
            try {
                iArr7[a.q.b.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[a.q.b.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[a.q.b.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[a.q.b.c.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            f78063g = iArr7;
            int[] iArr8 = new int[x1.values().length];
            try {
                iArr8[x1.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[x1.OUT_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[x1.INVARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            f78064h = iArr8;
        }
    }

    private c0() {
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.f a(@fg.m a.c.EnumC1120c enumC1120c) {
        switch (enumC1120c == null ? -1 : a.f78060d[enumC1120c.ordinal()]) {
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.e0 b(@fg.m a.k kVar) {
        int i4 = kVar == null ? -1 : a.f78057a[kVar.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL : kotlin.reflect.jvm.internal.impl.descriptors.e0.SEALED : kotlin.reflect.jvm.internal.impl.descriptors.e0.ABSTRACT : kotlin.reflect.jvm.internal.impl.descriptors.e0.OPEN : kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL;
    }

    @fg.l
    public final x1 c(@fg.l a.q.b.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("笳\u0001"));
        int i4 = a.f78063g[cVar.ordinal()];
        if (i4 == 1) {
            return x1.IN_VARIANCE;
        }
        if (i4 == 2) {
            return x1.OUT_VARIANCE;
        }
        if (i4 == 3) {
            return x1.INVARIANT;
        }
        if (i4 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("笴\u0001") + cVar);
    }

    @fg.l
    public final x1 d(@fg.l a.s.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("笵\u0001"));
        int i4 = a.f78062f[cVar.ordinal()];
        if (i4 == 1) {
            return x1.IN_VARIANCE;
        }
        if (i4 == 2) {
            return x1.OUT_VARIANCE;
        }
        if (i4 == 3) {
            return x1.INVARIANT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
