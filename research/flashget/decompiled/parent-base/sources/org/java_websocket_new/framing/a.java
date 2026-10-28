package org.java_websocket_new.framing;

import org.java_websocket_new.exceptions.InvalidDataException;
import org.java_websocket_new.exceptions.InvalidFrameException;

/* compiled from: CloseFrame.java */
/* loaded from: classes6.dex */
public interface a extends d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f86980a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f86981b = 1001;

    /* renamed from: c, reason: collision with root package name */
    public static final int f86982c = 1002;

    /* renamed from: d, reason: collision with root package name */
    public static final int f86983d = 1003;

    /* renamed from: e, reason: collision with root package name */
    public static final int f86984e = 1005;

    /* renamed from: f, reason: collision with root package name */
    public static final int f86985f = 1006;

    /* renamed from: g, reason: collision with root package name */
    public static final int f86986g = 1007;

    /* renamed from: h, reason: collision with root package name */
    public static final int f86987h = 1008;

    /* renamed from: i, reason: collision with root package name */
    public static final int f86988i = 1009;

    /* renamed from: j, reason: collision with root package name */
    public static final int f86989j = 1010;

    /* renamed from: k, reason: collision with root package name */
    public static final int f86990k = 1011;

    /* renamed from: l, reason: collision with root package name */
    public static final int f86991l = 1015;

    /* renamed from: m, reason: collision with root package name */
    public static final int f86992m = -1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f86993n = -2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f86994o = -3;

    int g() throws InvalidFrameException;

    String getMessage() throws InvalidDataException;
}
