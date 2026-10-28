package com.tencent.beacon.pack;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class ValueType implements Serializable {
    public static final int BYTE_VAL = 1;
    public static final int MAP_VAL = 0;
    public static final int UNKNOWN_VAL = 2;

    /* renamed from: t, reason: collision with root package name */
    private String f71674t;
    private int value;
    public static final ValueType MAP = new ValueType(0, 0, ProtectedSandApp.s("㐟\u0001"));
    public static final ValueType BYTE = new ValueType(1, 1, ProtectedSandApp.s("㐠\u0001"));
    public static final ValueType UNKNOWN = new ValueType(2, 2, ProtectedSandApp.s("㐡\u0001"));
    private static ValueType[] values = new ValueType[3];

    private ValueType(int i4, int i5, String str) {
        this.f71674t = str;
        this.value = i5;
        values[i4] = this;
    }

    public static ValueType convert(int i4) {
        for (ValueType valueType : values) {
            if (valueType.value() == i4) {
                return valueType;
            }
        }
        return null;
    }

    public String toString() {
        return this.f71674t;
    }

    public int value() {
        return this.value;
    }

    public static ValueType convert(String str) {
        for (ValueType valueType : values) {
            if (valueType.toString().equals(str)) {
                return valueType;
            }
        }
        return null;
    }
}
