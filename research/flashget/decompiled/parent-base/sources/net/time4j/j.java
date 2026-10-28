package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import net.time4j.engine.n0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClockUnit.java */
/* loaded from: classes7.dex */
public abstract class j implements y {
    private static final /* synthetic */ j[] $VALUES;
    private static final long[] FACTORS;
    public static final j HOURS;
    public static final j MICROS;
    public static final j MILLIS;
    public static final j MINUTES;
    public static final j NANOS;
    public static final j SECONDS;

    /* compiled from: ClockUnit.java */
    enum a extends j {
        a(String str, int i4) {
            super(str, i4, null);
        }

        @Override // net.time4j.engine.w
        public double getLength() {
            return 3600.0d;
        }

        @Override // net.time4j.z
        public char getSymbol() {
            return 'H';
        }
    }

    static {
        a aVar = new a(ProtectedSandApp.s("靼\u0001"), 0);
        HOURS = aVar;
        j jVar = new j(ProtectedSandApp.s("靽\u0001"), 1) { // from class: net.time4j.j.b
            {
                a aVar2 = null;
            }

            @Override // net.time4j.engine.w
            public double getLength() {
                return 60.0d;
            }

            @Override // net.time4j.z
            public char getSymbol() {
                return 'M';
            }
        };
        MINUTES = jVar;
        j jVar2 = new j(ProtectedSandApp.s("靾\u0001"), 2) { // from class: net.time4j.j.c
            {
                a aVar2 = null;
            }

            @Override // net.time4j.engine.w
            public double getLength() {
                return 1.0d;
            }

            @Override // net.time4j.z
            public char getSymbol() {
                return 'S';
            }
        };
        SECONDS = jVar2;
        j jVar3 = new j(ProtectedSandApp.s("靿\u0001"), 3) { // from class: net.time4j.j.d
            {
                a aVar2 = null;
            }

            @Override // net.time4j.engine.w
            public double getLength() {
                return 0.001d;
            }

            @Override // net.time4j.z
            public char getSymbol() {
                return '3';
            }
        };
        MILLIS = jVar3;
        j jVar4 = new j(ProtectedSandApp.s("鞀\u0001"), 4) { // from class: net.time4j.j.e
            {
                a aVar2 = null;
            }

            @Override // net.time4j.engine.w
            public double getLength() {
                return 1.0E-6d;
            }

            @Override // net.time4j.z
            public char getSymbol() {
                return '6';
            }
        };
        MICROS = jVar4;
        j jVar5 = new j(ProtectedSandApp.s("鞁\u0001"), 5) { // from class: net.time4j.j.f
            {
                a aVar2 = null;
            }

            @Override // net.time4j.engine.w
            public double getLength() {
                return 1.0E-9d;
            }

            @Override // net.time4j.z
            public char getSymbol() {
                return '9';
            }
        };
        NANOS = jVar5;
        $VALUES = new j[]{aVar, jVar, jVar2, jVar3, jVar4, jVar5};
        FACTORS = new long[]{1, 60, 3600, org.apache.commons.lang3.time.e.f86241c, 3600000000L, 3600000000000L};
    }

    private j(String str, int i4) {
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public <T extends net.time4j.engine.m0<? super j, T>> long between(T t4, T t5) {
        return t4.Y(t5, this);
    }

    public long convert(long j4, j jVar) {
        if (j4 == 0) {
            return 0L;
        }
        int ordinal = ordinal();
        int ordinal2 = jVar.ordinal();
        if (ordinal == ordinal2) {
            return j4;
        }
        if (ordinal > ordinal2) {
            long[] jArr = FACTORS;
            return net.time4j.base.c.i(j4, jArr[ordinal] / jArr[ordinal2]);
        }
        long[] jArr2 = FACTORS;
        return j4 / (jArr2[ordinal2] / jArr2[ordinal]);
    }

    @Override // net.time4j.engine.w
    public boolean isCalendrical() {
        return false;
    }

    public net.time4j.engine.f0<j> only() {
        return i.c(this);
    }

    public net.time4j.engine.f0<j> rounded() {
        return i.e(this);
    }

    public net.time4j.engine.f0<j> truncated() {
        return i.f(this);
    }

    /* synthetic */ j(String str, int i4, a aVar) {
        this(str, i4);
    }

    public long convert(net.time4j.engine.n0<? extends j> n0Var) {
        long j4 = 0;
        if (n0Var.isEmpty()) {
            return 0L;
        }
        j jVar = null;
        for (int size = n0Var.f().size() - 1; size >= 0; size--) {
            n0.a<? extends j> aVar = n0Var.f().get(size);
            j b5 = aVar.b();
            if (jVar == null) {
                j4 = aVar.a();
                jVar = b5;
            } else {
                j4 = net.time4j.base.c.f(j4, jVar.convert(aVar.a(), b5));
            }
        }
        if (n0Var.d()) {
            j4 = net.time4j.base.c.k(j4);
        }
        return convert(j4, jVar);
    }
}
