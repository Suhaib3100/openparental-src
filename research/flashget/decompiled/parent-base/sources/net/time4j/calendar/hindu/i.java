package net.time4j.calendar.hindu;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HinduRule.java */
/* loaded from: classes7.dex */
public abstract class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i AMANTA;
    public static final i AMANTA_ASHADHA;
    public static final i AMANTA_KARTIKA;
    public static final i MADRAS;
    public static final i MALAYALI;
    public static final i ORISSA;
    public static final i PURNIMANTA;
    public static final i TAMIL;

    /* compiled from: HinduRule.java */
    enum a extends i {
        a(String str, int i4) {
            super(str, i4, null);
        }

        @Override // net.time4j.calendar.hindu.i
        net.time4j.calendar.hindu.f getDefaultEra() {
            return net.time4j.calendar.hindu.f.SAKA;
        }
    }

    static {
        a aVar = new a(ProtectedSandApp.s("郍\u0001"), 0);
        ORISSA = aVar;
        i iVar = new i(ProtectedSandApp.s("郎\u0001"), 1) { // from class: net.time4j.calendar.hindu.i.b
            {
                a aVar2 = null;
            }

            @Override // net.time4j.calendar.hindu.i
            net.time4j.calendar.hindu.f getDefaultEra() {
                return net.time4j.calendar.hindu.f.SAKA;
            }
        };
        TAMIL = iVar;
        i iVar2 = new i(ProtectedSandApp.s("郏\u0001"), 2) { // from class: net.time4j.calendar.hindu.i.c
            {
                a aVar2 = null;
            }

            @Override // net.time4j.calendar.hindu.i
            net.time4j.calendar.hindu.f getDefaultEra() {
                return net.time4j.calendar.hindu.f.KOLLAM;
            }
        };
        MALAYALI = iVar2;
        i iVar3 = new i(ProtectedSandApp.s("郐\u0001"), 3) { // from class: net.time4j.calendar.hindu.i.d
            {
                a aVar2 = null;
            }

            @Override // net.time4j.calendar.hindu.i
            net.time4j.calendar.hindu.f getDefaultEra() {
                return net.time4j.calendar.hindu.f.SAKA;
            }
        };
        MADRAS = iVar3;
        i iVar4 = new i(ProtectedSandApp.s("郑\u0001"), 4) { // from class: net.time4j.calendar.hindu.i.e
            {
                a aVar2 = null;
            }

            @Override // net.time4j.calendar.hindu.i
            net.time4j.calendar.hindu.f getDefaultEra() {
                return net.time4j.calendar.hindu.f.VIKRAMA;
            }
        };
        AMANTA = iVar4;
        i iVar5 = new i(ProtectedSandApp.s("郒\u0001"), 5) { // from class: net.time4j.calendar.hindu.i.f
            {
                a aVar2 = null;
            }

            @Override // net.time4j.calendar.hindu.i
            net.time4j.calendar.hindu.f getDefaultEra() {
                return net.time4j.calendar.hindu.f.VIKRAMA;
            }
        };
        AMANTA_ASHADHA = iVar5;
        i iVar6 = new i(ProtectedSandApp.s("郓\u0001"), 6) { // from class: net.time4j.calendar.hindu.i.g
            {
                a aVar2 = null;
            }

            @Override // net.time4j.calendar.hindu.i
            net.time4j.calendar.hindu.f getDefaultEra() {
                return net.time4j.calendar.hindu.f.VIKRAMA;
            }
        };
        AMANTA_KARTIKA = iVar6;
        i iVar7 = new i(ProtectedSandApp.s("郔\u0001"), 7) { // from class: net.time4j.calendar.hindu.i.h
            {
                a aVar2 = null;
            }

            @Override // net.time4j.calendar.hindu.i
            net.time4j.calendar.hindu.f getDefaultEra() {
                return net.time4j.calendar.hindu.f.VIKRAMA;
            }
        };
        PURNIMANTA = iVar7;
        $VALUES = new i[]{aVar, iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7};
    }

    private i(String str, int i4) {
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    abstract net.time4j.calendar.hindu.f getDefaultEra();

    public j variant() {
        return new j(this, getDefaultEra());
    }

    /* synthetic */ i(String str, int i4, a aVar) {
        this(str, i4);
    }
}
