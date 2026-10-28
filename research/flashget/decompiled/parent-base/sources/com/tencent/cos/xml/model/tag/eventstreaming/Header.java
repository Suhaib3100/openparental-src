package com.tencent.cos.xml.model.tag.eventstreaming;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes7.dex */
class Header {
    private final String name;
    private final HeaderValue value;

    Header(String str, HeaderValue headerValue) {
        this.name = str;
        this.value = headerValue;
    }

    static Header decode(ByteBuffer byteBuffer) {
        String str;
        try {
            str = Utils.readShortString(byteBuffer);
        } catch (UnsupportedEncodingException e4) {
            e4.printStackTrace();
            str = null;
        }
        return new Header(str, HeaderValue.decode(byteBuffer));
    }

    static void encode(Map.Entry<String, HeaderValue> entry, DataOutputStream dataOutputStream) throws IOException {
        new Header(entry.getKey(), entry.getValue()).encode(dataOutputStream);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Header header = (Header) obj;
        if (this.name.equals(header.name)) {
            return this.value.equals(header.value);
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public HeaderValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return ProtectedSandApp.s("乍\u0001") + this.name + ProtectedSandApp.s("乎\u0001") + this.value + '}';
    }

    void encode(DataOutputStream dataOutputStream) throws IOException {
        Utils.writeShortString(dataOutputStream, this.name);
        this.value.encode(dataOutputStream);
    }

    Header(String str, String str2) {
        this(str, HeaderValue.fromString(str2));
    }
}
