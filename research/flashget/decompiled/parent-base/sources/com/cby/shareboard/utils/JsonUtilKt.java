package com.cby.shareboard.utils;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.gson.reflect.TypeToken;
import fg.l;
import fg.m;
import java.util.Map;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlin.z0;

/* compiled from: JsonUtil.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a$\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006*\u00020\u0001¨\u0006\u0007"}, d2 = {"toJson", "", "", "toMap", "", "K", "V", "SharedBoard_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonUtilKt {
    @l
    public static final String toJson(@l Object obj) {
        Object a5;
        String str;
        l0.p(obj, ProtectedSandApp.s("\u0cb4"));
        try {
            z0.Companion companion = z0.INSTANCE;
            a5 = JsonUtil.INSTANCE.getGson().toJson(obj);
        } catch (Throwable th) {
            z0.Companion companion2 = z0.INSTANCE;
            a5 = a1.a(th);
        }
        if (z0.j(a5)) {
            str = (String) a5;
            l0.m(str);
        } else {
            str = "";
        }
        Throwable e4 = z0.e(a5);
        if (e4 != null) {
            e4.printStackTrace();
        }
        return str;
    }

    @m
    public static final <K, V> Map<K, V> toMap(@l String str) {
        Object a5;
        l0.p(str, ProtectedSandApp.s("\u0cb4"));
        Object obj = null;
        try {
            z0.Companion companion = z0.INSTANCE;
            obj = JsonUtil.INSTANCE.getGson().fromJson(str, new TypeToken<Map<K, ? extends V>>() { // from class: com.cby.shareboard.utils.JsonUtilKt$toMap$1$type$1
            }.getType());
            a5 = k2.f75408a;
        } catch (Throwable th) {
            z0.Companion companion2 = z0.INSTANCE;
            a5 = a1.a(th);
        }
        Throwable e4 = z0.e(a5);
        if (e4 != null) {
            e4.printStackTrace();
        }
        return (Map) obj;
    }
}
