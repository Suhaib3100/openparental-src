package com.google.gson;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class JsonStreamParser implements Iterator<JsonElement> {
    private final Object lock;
    private final JsonReader parser;

    public JsonStreamParser(String str) {
        this(new StringReader(str));
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z4;
        synchronized (this.lock) {
            try {
                try {
                    try {
                        z4 = this.parser.peek() != JsonToken.END_DOCUMENT;
                    } catch (IOException e4) {
                        throw new JsonIOException(e4);
                    }
                } catch (MalformedJsonException e5) {
                    throw new JsonSyntaxException(e5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public JsonStreamParser(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        this.parser = jsonReader;
        jsonReader.setLenient(true);
        this.lock = new Object();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public JsonElement next() throws JsonParseException {
        String s4 = ProtectedSandApp.s("֝\u0001");
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            return Streams.parse(this.parser);
        } catch (JsonParseException e4) {
            if (e4.getCause() instanceof EOFException) {
                throw new NoSuchElementException();
            }
            throw e4;
        } catch (OutOfMemoryError e5) {
            throw new JsonParseException(s4, e5);
        } catch (StackOverflowError e6) {
            throw new JsonParseException(s4, e6);
        }
    }
}
