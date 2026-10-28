package com.android.volley;

import androidx.annotation.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: NetworkResponse.java */
/* loaded from: classes3.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f40899a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f40900b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    public final Map<String, String> f40901c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    public final List<i> f40902d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f40903e;

    /* renamed from: f, reason: collision with root package name */
    public final long f40904f;

    @Deprecated
    public l(int i4, byte[] bArr, @q0 Map<String, String> map, boolean z4, long j4) {
        this(i4, bArr, map, a(map), z4, j4);
    }

    @q0
    private static List<i> a(@q0 Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new i(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @q0
    private static Map<String, String> b(@q0 List<i> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (i iVar : list) {
            treeMap.put(iVar.a(), iVar.b());
        }
        return treeMap;
    }

    public l(int i4, byte[] bArr, boolean z4, long j4, @q0 List<i> list) {
        this(i4, bArr, b(list), list, z4, j4);
    }

    @Deprecated
    public l(int i4, byte[] bArr, @q0 Map<String, String> map, boolean z4) {
        this(i4, bArr, map, z4, 0L);
    }

    public l(byte[] bArr) {
        this(200, bArr, false, 0L, (List<i>) Collections.emptyList());
    }

    @Deprecated
    public l(byte[] bArr, @q0 Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    private l(int i4, byte[] bArr, @q0 Map<String, String> map, @q0 List<i> list, boolean z4, long j4) {
        this.f40899a = i4;
        this.f40900b = bArr;
        this.f40901c = map;
        if (list == null) {
            this.f40902d = null;
        } else {
            this.f40902d = Collections.unmodifiableList(list);
        }
        this.f40903e = z4;
        this.f40904f = j4;
    }
}
