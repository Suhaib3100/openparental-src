package com.cby.shareboard.utils;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import fg.l;
import fg.m;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.jvm.internal.l0;

/* compiled from: JsonUtil.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0019\u001a\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ9\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\rj\b\u0012\u0004\u0012\u00028\u0000`\u000e\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/cby/shareboard/utils/JsonUtil;", "", "<init>", "()V", "T", "", "jsonData", "Ljava/lang/Class;", "type", "parseJsonWithGson", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "json", "clazz", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "jsonToArrayList", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/ArrayList;", "parseJson", "(Ljava/lang/String;)Ljava/lang/Object;", "Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/b0;", "getGson", "()Lcom/google/gson/Gson;", "gson", "DoubleDefaultAdapter", "IntegerDefaultAdapter", "LongDefaultAdapter", "StringDefaultAdapter", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonUtil {

    @l
    public static final JsonUtil INSTANCE = new JsonUtil();

    /* renamed from: gson$delegate, reason: from kotlin metadata */
    @l
    private static final b0 gson = c0.c(JsonUtil$gson$2.INSTANCE);

    /* compiled from: JsonUtil.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ'\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/cby/shareboard/utils/JsonUtil$DoubleDefaultAdapter;", "Lcom/google/gson/JsonSerializer;", "", "Lcom/google/gson/JsonDeserializer;", "()V", "deserialize", "jsonElement", "Lcom/google/gson/JsonElement;", "type", "Ljava/lang/reflect/Type;", "jsonDeserializationContext", "Lcom/google/gson/JsonDeserializationContext;", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Double;", "serialize", "mDouble", "jsonSerializationContext", "Lcom/google/gson/JsonSerializationContext;", "(Ljava/lang/Double;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DoubleDefaultAdapter implements JsonSerializer<Double>, JsonDeserializer<Double> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        @l
        public Double deserialize(@l JsonElement jsonElement, @l Type type, @l JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            l0.p(jsonElement, ProtectedSandApp.s("ಛ"));
            l0.p(type, ProtectedSandApp.s("ಜ"));
            l0.p(jsonDeserializationContext, ProtectedSandApp.s("ಝ"));
            try {
                if (l0.g(jsonElement.getAsString(), "") || l0.g(jsonElement.getAsString(), ProtectedSandApp.s("ಞ"))) {
                    return Double.valueOf(p.f60679p);
                }
            } catch (Exception unused) {
            }
            try {
                return Double.valueOf(jsonElement.getAsDouble());
            } catch (NumberFormatException e4) {
                throw new JsonSyntaxException(e4);
            }
        }

        @Override // com.google.gson.JsonSerializer
        @l
        public JsonElement serialize(@m Double mDouble, @l Type type, @l JsonSerializationContext jsonSerializationContext) {
            l0.p(type, ProtectedSandApp.s("ಜ"));
            l0.p(jsonSerializationContext, ProtectedSandApp.s("ಟ"));
            return new JsonPrimitive(mDouble);
        }
    }

    /* compiled from: JsonUtil.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ'\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/cby/shareboard/utils/JsonUtil$IntegerDefaultAdapter;", "Lcom/google/gson/JsonSerializer;", "", "Lcom/google/gson/JsonDeserializer;", "()V", "deserialize", "jsonElement", "Lcom/google/gson/JsonElement;", "type", "Ljava/lang/reflect/Type;", "jsonDeserializationContext", "Lcom/google/gson/JsonDeserializationContext;", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Integer;", "serialize", "integer", "jsonSerializationContext", "Lcom/google/gson/JsonSerializationContext;", "(Ljava/lang/Integer;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IntegerDefaultAdapter implements JsonSerializer<Integer>, JsonDeserializer<Integer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        @l
        public Integer deserialize(@l JsonElement jsonElement, @l Type type, @l JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            l0.p(jsonElement, ProtectedSandApp.s("ಠ"));
            l0.p(type, ProtectedSandApp.s("ಡ"));
            l0.p(jsonDeserializationContext, ProtectedSandApp.s("ಢ"));
            try {
                if (l0.g(jsonElement.getAsString(), "") || l0.g(jsonElement.getAsString(), ProtectedSandApp.s("ಣ"))) {
                    return 0;
                }
            } catch (Exception unused) {
            }
            try {
                return Integer.valueOf(jsonElement.getAsInt());
            } catch (NumberFormatException e4) {
                throw new JsonSyntaxException(e4);
            }
        }

        @Override // com.google.gson.JsonSerializer
        @l
        public JsonElement serialize(@m Integer integer, @l Type type, @l JsonSerializationContext jsonSerializationContext) {
            l0.p(type, ProtectedSandApp.s("ಡ"));
            l0.p(jsonSerializationContext, ProtectedSandApp.s("ತ"));
            return new JsonPrimitive(integer);
        }
    }

    /* compiled from: JsonUtil.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ'\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/cby/shareboard/utils/JsonUtil$LongDefaultAdapter;", "Lcom/google/gson/JsonSerializer;", "", "Lcom/google/gson/JsonDeserializer;", "()V", "deserialize", "jsonElement", "Lcom/google/gson/JsonElement;", "type", "Ljava/lang/reflect/Type;", "jsonDeserializationContext", "Lcom/google/gson/JsonDeserializationContext;", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Long;", "serialize", "mLong", "jsonSerializationContext", "Lcom/google/gson/JsonSerializationContext;", "(Ljava/lang/Long;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LongDefaultAdapter implements JsonSerializer<Long>, JsonDeserializer<Long> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        @l
        public Long deserialize(@l JsonElement jsonElement, @l Type type, @l JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            l0.p(jsonElement, ProtectedSandApp.s("ಥ"));
            l0.p(type, ProtectedSandApp.s("ದ"));
            l0.p(jsonDeserializationContext, ProtectedSandApp.s("ಧ"));
            try {
                if (l0.g(jsonElement.getAsString(), "") || l0.g(jsonElement.getAsString(), ProtectedSandApp.s("ನ"))) {
                    return 0L;
                }
            } catch (Exception unused) {
            }
            try {
                return Long.valueOf(jsonElement.getAsLong());
            } catch (NumberFormatException e4) {
                throw new JsonSyntaxException(e4);
            }
        }

        @Override // com.google.gson.JsonSerializer
        @l
        public JsonElement serialize(@m Long mLong, @l Type type, @l JsonSerializationContext jsonSerializationContext) {
            l0.p(type, ProtectedSandApp.s("ದ"));
            l0.p(jsonSerializationContext, ProtectedSandApp.s("\u0ca9"));
            return new JsonPrimitive(mLong);
        }
    }

    /* compiled from: JsonUtil.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/cby/shareboard/utils/JsonUtil$StringDefaultAdapter;", "Lcom/google/gson/JsonSerializer;", "", "Lcom/google/gson/JsonDeserializer;", "()V", "deserialize", "jsonElement", "Lcom/google/gson/JsonElement;", "type", "Ljava/lang/reflect/Type;", "jsonDeserializationContext", "Lcom/google/gson/JsonDeserializationContext;", "serialize", "str", "jsonSerializationContext", "Lcom/google/gson/JsonSerializationContext;", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StringDefaultAdapter implements JsonSerializer<String>, JsonDeserializer<String> {
        @Override // com.google.gson.JsonDeserializer
        @l
        public String deserialize(@l JsonElement jsonElement, @l Type type, @l JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            l0.p(jsonElement, ProtectedSandApp.s("ಪ"));
            l0.p(type, ProtectedSandApp.s("ಫ"));
            l0.p(jsonDeserializationContext, ProtectedSandApp.s("ಬ"));
            try {
                if (l0.g(jsonElement.getAsString(), ProtectedSandApp.s("ಭ"))) {
                    return "";
                }
            } catch (Exception unused) {
            }
            try {
                String asString = jsonElement.getAsString();
                l0.m(asString);
                return asString;
            } catch (NumberFormatException e4) {
                throw new JsonSyntaxException(e4);
            }
        }

        @Override // com.google.gson.JsonSerializer
        @l
        public JsonElement serialize(@m String str, @l Type type, @l JsonSerializationContext jsonSerializationContext) {
            l0.p(type, ProtectedSandApp.s("ಫ"));
            l0.p(jsonSerializationContext, ProtectedSandApp.s("ಮ"));
            return new JsonPrimitive(str);
        }
    }

    private JsonUtil() {
    }

    @l
    public final Gson getGson() {
        Object value = gson.getValue();
        l0.o(value, ProtectedSandApp.s("ಯ"));
        return (Gson) value;
    }

    @l
    public final <T> ArrayList<T> jsonToArrayList(@l String json, @l Class<T> clazz) {
        l0.p(json, ProtectedSandApp.s("ರ"));
        l0.p(clazz, ProtectedSandApp.s("ಱ"));
        ArrayList arrayList = (ArrayList) new Gson().fromJson(json, new TypeToken<ArrayList<JsonObject>>() { // from class: com.cby.shareboard.utils.JsonUtil$jsonToArrayList$type$1
        }.getType());
        net.minidev.json.a aVar = (ArrayList<T>) new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVar.add(new Gson().fromJson((JsonElement) it.next(), (Class) clazz));
        }
        return aVar;
    }

    public final <T> T parseJson(String json) {
        l0.p(json, ProtectedSandApp.s("ರ"));
        l0.P();
        return (T) getGson().fromJson(json, kotlin.reflect.b0.f(null));
    }

    public final <T> T parseJsonWithGson(@l String jsonData, @l Class<T> type) {
        l0.p(jsonData, ProtectedSandApp.s("ಲ"));
        l0.p(type, ProtectedSandApp.s("ಳ"));
        return (T) getGson().fromJson(jsonData, (Class) type);
    }
}
