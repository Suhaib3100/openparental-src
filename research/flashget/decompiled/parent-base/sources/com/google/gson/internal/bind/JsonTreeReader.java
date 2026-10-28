package com.google.gson.internal.bind;

import androidx.compose.ui.graphics.colorspace.b0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class JsonTreeReader extends JsonReader {
    private int[] pathIndices;
    private String[] pathNames;
    private Object[] stack;
    private int stackSize;
    private static final Reader UNREADABLE_READER = new Reader() { // from class: com.google.gson.internal.bind.JsonTreeReader.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i4, int i5) throws IOException {
            throw new AssertionError();
        }
    };
    private static final Object SENTINEL_CLOSED = new Object();

    public JsonTreeReader(JsonElement jsonElement) {
        super(UNREADABLE_READER);
        this.stack = new Object[32];
        this.stackSize = 0;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        push(jsonElement);
    }

    private void expect(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException(ProtectedSandApp.s("\u05f6\u0001") + jsonToken + ProtectedSandApp.s("\u05f7\u0001") + peek() + locationString());
    }

    private String locationString() {
        return ProtectedSandApp.s("\u05f8\u0001") + getPath();
    }

    private Object peekStack() {
        return this.stack[this.stackSize - 1];
    }

    private Object popStack() {
        Object[] objArr = this.stack;
        int i4 = this.stackSize - 1;
        this.stackSize = i4;
        Object obj = objArr[i4];
        objArr[i4] = null;
        return obj;
    }

    private void push(Object obj) {
        int i4 = this.stackSize;
        Object[] objArr = this.stack;
        if (i4 == objArr.length) {
            int i5 = i4 * 2;
            this.stack = Arrays.copyOf(objArr, i5);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i5);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i5);
        }
        Object[] objArr2 = this.stack;
        int i6 = this.stackSize;
        this.stackSize = i6 + 1;
        objArr2[i6] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        expect(JsonToken.BEGIN_ARRAY);
        push(((JsonArray) peekStack()).iterator());
        this.pathIndices[this.stackSize - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        expect(JsonToken.BEGIN_OBJECT);
        push(((JsonObject) peekStack()).entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.stack = new Object[]{SENTINEL_CLOSED};
        this.stackSize = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        expect(JsonToken.END_ARRAY);
        popStack();
        popStack();
        int i4 = this.stackSize;
        if (i4 > 0) {
            int[] iArr = this.pathIndices;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        expect(JsonToken.END_OBJECT);
        popStack();
        popStack();
        int i4 = this.stackSize;
        if (i4 > 0) {
            int[] iArr = this.pathIndices;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\u05f9\u0001"));
        int i4 = 0;
        while (i4 < this.stackSize) {
            Object[] objArr = this.stack;
            Object obj = objArr[i4];
            if (obj instanceof JsonArray) {
                i4++;
                if (objArr[i4] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.pathIndices[i4]);
                    sb.append(']');
                }
            } else if (obj instanceof JsonObject) {
                i4++;
                if (objArr[i4] instanceof Iterator) {
                    sb.append('.');
                    String str = this.pathNames[i4];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i4++;
        }
        return sb.toString();
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        expect(JsonToken.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) popStack()).getAsBoolean();
        int i4 = this.stackSize;
        if (i4 > 0) {
            int[] iArr = this.pathIndices;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return asBoolean;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException(ProtectedSandApp.s("\u05f6\u0001") + jsonToken + ProtectedSandApp.s("\u05f7\u0001") + peek + locationString());
        }
        double asDouble = ((JsonPrimitive) peekStack()).getAsDouble();
        if (!isLenient() && (Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
            throw new NumberFormatException(b0.a(ProtectedSandApp.s("\u05fa\u0001"), asDouble));
        }
        popStack();
        int i4 = this.stackSize;
        if (i4 > 0) {
            int[] iArr = this.pathIndices;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return asDouble;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException(ProtectedSandApp.s("\u05f6\u0001") + jsonToken + ProtectedSandApp.s("\u05f7\u0001") + peek + locationString());
        }
        int asInt = ((JsonPrimitive) peekStack()).getAsInt();
        popStack();
        int i4 = this.stackSize;
        if (i4 > 0) {
            int[] iArr = this.pathIndices;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return asInt;
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException(ProtectedSandApp.s("\u05f6\u0001") + jsonToken + ProtectedSandApp.s("\u05f7\u0001") + peek + locationString());
        }
        long asLong = ((JsonPrimitive) peekStack()).getAsLong();
        popStack();
        int i4 = this.stackSize;
        if (i4 > 0) {
            int[] iArr = this.pathIndices;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return asLong;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        String str = (String) entry.getKey();
        this.pathNames[this.stackSize - 1] = str;
        push(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        expect(JsonToken.NULL);
        popStack();
        int i4 = this.stackSize;
        if (i4 > 0) {
            int[] iArr = this.pathIndices;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek != jsonToken && peek != JsonToken.NUMBER) {
            throw new IllegalStateException(ProtectedSandApp.s("\u05f6\u0001") + jsonToken + ProtectedSandApp.s("\u05f7\u0001") + peek + locationString());
        }
        String asString = ((JsonPrimitive) popStack()).getAsString();
        int i4 = this.stackSize;
        if (i4 > 0) {
            int[] iArr = this.pathIndices;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return asString;
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.stackSize == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object peekStack = peekStack();
        if (peekStack instanceof Iterator) {
            boolean z4 = this.stack[this.stackSize - 2] instanceof JsonObject;
            Iterator it = (Iterator) peekStack;
            if (!it.hasNext()) {
                return z4 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z4) {
                return JsonToken.NAME;
            }
            push(it.next());
            return peek();
        }
        if (peekStack instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (peekStack instanceof JsonArray) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (!(peekStack instanceof JsonPrimitive)) {
            if (peekStack instanceof JsonNull) {
                return JsonToken.NULL;
            }
            if (peekStack == SENTINEL_CLOSED) {
                throw new IllegalStateException(ProtectedSandApp.s("\u05fb\u0001"));
            }
            throw new AssertionError();
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) peekStack;
        if (jsonPrimitive.isString()) {
            return JsonToken.STRING;
        }
        if (jsonPrimitive.isBoolean()) {
            return JsonToken.BOOLEAN;
        }
        if (jsonPrimitive.isNumber()) {
            return JsonToken.NUMBER;
        }
        throw new AssertionError();
    }

    public void promoteNameToValue() throws IOException {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        push(entry.getValue());
        push(new JsonPrimitive((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NAME;
        String s4 = ProtectedSandApp.s("\u05fc\u0001");
        if (peek == jsonToken) {
            nextName();
            this.pathNames[this.stackSize - 2] = s4;
        } else {
            popStack();
            int i4 = this.stackSize;
            if (i4 > 0) {
                this.pathNames[i4 - 1] = s4;
            }
        }
        int i5 = this.stackSize;
        if (i5 > 0) {
            int[] iArr = this.pathIndices;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return ProtectedSandApp.s("\u05fd\u0001");
    }
}
