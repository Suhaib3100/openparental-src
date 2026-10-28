package com.cby.shareboard.utils;

import com.cby.shareboard.utils.JsonUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;

/* compiled from: JsonUtil.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class JsonUtil$gson$2 extends n0 implements ld.a<Gson> {
    public static final JsonUtil$gson$2 INSTANCE = new JsonUtil$gson$2();

    JsonUtil$gson$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ld.a
    public final Gson invoke() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Class cls = Integer.TYPE;
        GsonBuilder registerTypeAdapter = gsonBuilder.registerTypeAdapter(cls, new JsonUtil.IntegerDefaultAdapter()).registerTypeAdapter(cls, new JsonUtil.IntegerDefaultAdapter());
        Class cls2 = Long.TYPE;
        GsonBuilder registerTypeAdapter2 = registerTypeAdapter.registerTypeAdapter(cls2, new JsonUtil.LongDefaultAdapter()).registerTypeAdapter(cls2, new JsonUtil.LongDefaultAdapter());
        Class cls3 = Double.TYPE;
        return registerTypeAdapter2.registerTypeAdapter(cls3, new JsonUtil.DoubleDefaultAdapter()).registerTypeAdapter(cls3, new JsonUtil.DoubleDefaultAdapter()).registerTypeAdapter(String.class, new JsonUtil.StringDefaultAdapter()).registerTypeAdapter(Character.TYPE, new JsonUtil.StringDefaultAdapter()).create();
    }
}
