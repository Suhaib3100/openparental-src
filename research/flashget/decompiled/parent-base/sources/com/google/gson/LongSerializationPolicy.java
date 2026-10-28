package com.google.gson;

/* loaded from: classes6.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l4) {
            return new JsonPrimitive(l4);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l4) {
            return new JsonPrimitive(String.valueOf(l4));
        }
    };

    public abstract JsonElement serialize(Long l4);
}
