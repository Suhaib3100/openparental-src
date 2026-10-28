package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: ProtoEnumFlags.kt */
/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final b0 f26063a = new b0();

    /* compiled from: ProtoEnumFlags.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26064a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f26065b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f26066c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f26067d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f26068e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f26069f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f26070g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f26071h;

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
            f26064a = iArr;
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
            f26065b = iArr2;
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
            f26066c = iArr3;
            int[] iArr4 = new int[a.c.EnumC0315c.values().length];
            try {
                iArr4[a.c.EnumC0315c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[a.c.EnumC0315c.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[a.c.EnumC0315c.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[a.c.EnumC0315c.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[a.c.EnumC0315c.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[a.c.EnumC0315c.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[a.c.EnumC0315c.COMPANION_OBJECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            f26067d = iArr4;
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
            f26068e = iArr5;
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
            f26069f = iArr6;
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
            f26070g = iArr7;
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
            f26071h = iArr8;
        }
    }

    private b0() {
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.f a(@d5.e a.c.EnumC0315c enumC0315c) {
        switch (enumC0315c == null ? -1 : a.f26067d[enumC0315c.ordinal()]) {
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.e0 b(@d5.e a.k kVar) {
        int i5 = kVar == null ? -1 : a.f26064a[kVar.ordinal()];
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL : kotlin.reflect.jvm.internal.impl.descriptors.e0.SEALED : kotlin.reflect.jvm.internal.impl.descriptors.e0.ABSTRACT : kotlin.reflect.jvm.internal.impl.descriptors.e0.OPEN : kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL;
    }

    @d5.d
    public final x1 c(@d5.d a.q.b.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("卢"));
        int i5 = a.f26070g[cVar.ordinal()];
        if (i5 == 1) {
            return x1.IN_VARIANCE;
        }
        if (i5 == 2) {
            return x1.OUT_VARIANCE;
        }
        if (i5 == 3) {
            return x1.INVARIANT;
        }
        if (i5 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("卣") + cVar);
    }

    @d5.d
    public final x1 d(@d5.d a.s.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("卤"));
        int i5 = a.f26069f[cVar.ordinal()];
        if (i5 == 1) {
            return x1.IN_VARIANCE;
        }
        if (i5 == 2) {
            return x1.OUT_VARIANCE;
        }
        if (i5 == 3) {
            return x1.INVARIANT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
