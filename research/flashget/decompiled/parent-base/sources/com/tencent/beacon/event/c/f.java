package com.tencent.beacon.event.c;

import com.tencent.beacon.event.open.EventType;

/* compiled from: LogIDGenerator.java */
/* loaded from: classes6.dex */
/* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f71494a;

    static {
        int[] iArr = new int[EventType.values().length];
        f71494a = iArr;
        try {
            iArr[EventType.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f71494a[EventType.DT_NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f71494a[EventType.REALTIME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f71494a[EventType.DT_REALTIME.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f71494a[EventType.IMMEDIATE_MSF.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f71494a[EventType.IMMEDIATE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
