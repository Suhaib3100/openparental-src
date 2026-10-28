package com.tencent.cos.xml.model.tag.eventstreaming;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.s3.Base64;
import com.tencent.cos.xml.s3.Base64Codec;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;
import kotlin.text.m0;

/* loaded from: classes7.dex */
public abstract class HeaderValue {

    /* renamed from: com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType;

        static {
            int[] iArr = new int[HeaderType.values().length];
            $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType = iArr;
            try {
                iArr[HeaderType.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.INTEGER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.LONG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.BYTE_ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.TIMESTAMP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.UUID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private static final class BooleanValue extends HeaderValue {
        private final boolean value;

        /* synthetic */ BooleanValue(boolean z4, AnonymousClass1 anonymousClass1) {
            this(z4);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        void encodeValue(DataOutputStream dataOutputStream) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && BooleanValue.class == obj.getClass() && this.value == ((BooleanValue) obj).value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public boolean getBoolean() {
            return this.value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public HeaderType getType() {
            return this.value ? HeaderType.TRUE : HeaderType.FALSE;
        }

        public int hashCode() {
            return this.value ? 1 : 0;
        }

        public String toString() {
            return String.valueOf(this.value);
        }

        private BooleanValue(boolean z4) {
            this.value = z4;
        }
    }

    private static final class ByteArrayValue extends HeaderValue {
        private Base64Codec codec;
        private final byte[] value;

        /* synthetic */ ByteArrayValue(byte[] bArr, AnonymousClass1 anonymousClass1) {
            this(bArr);
        }

        private String toStringDirect(byte[] bArr) {
            char[] cArr = new char[bArr.length];
            int length = bArr.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                cArr[i5] = (char) bArr[i4];
                i4++;
                i5++;
            }
            return new String(cArr);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        void encodeValue(DataOutputStream dataOutputStream) throws IOException {
            Utils.writeBytes(dataOutputStream, this.value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ByteArrayValue.class != obj.getClass()) {
                return false;
            }
            return Arrays.equals(this.value, ((ByteArrayValue) obj).value);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public byte[] getByteArray() {
            return this.value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public HeaderType getType() {
            return HeaderType.BYTE_ARRAY;
        }

        public int hashCode() {
            return Arrays.hashCode(this.value);
        }

        public String toString() {
            return Base64.encodeAsString(this.value);
        }

        private ByteArrayValue(byte[] bArr) {
            this.value = (byte[]) ValidationUtils.assertNotNull(bArr, ProtectedSandApp.s("习\u0001"));
        }
    }

    private static final class ByteValue extends HeaderValue {
        private final byte value;

        /* synthetic */ ByteValue(byte b5, AnonymousClass1 anonymousClass1) {
            this(b5);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        void encodeValue(DataOutputStream dataOutputStream) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && ByteValue.class == obj.getClass() && this.value == ((ByteValue) obj).value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public byte getByte() {
            return this.value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public HeaderType getType() {
            return HeaderType.BYTE;
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return String.valueOf((int) this.value);
        }

        private ByteValue(byte b5) {
            this.value = b5;
        }
    }

    private static final class IntegerValue extends HeaderValue {
        private final int value;

        /* synthetic */ IntegerValue(int i4, AnonymousClass1 anonymousClass1) {
            this(i4);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        void encodeValue(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(this.value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && IntegerValue.class == obj.getClass() && this.value == ((IntegerValue) obj).value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public int getInteger() {
            return this.value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public HeaderType getType() {
            return HeaderType.INTEGER;
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return String.valueOf(this.value);
        }

        private IntegerValue(int i4) {
            this.value = i4;
        }
    }

    private static final class LongValue extends HeaderValue {
        private final long value;

        /* synthetic */ LongValue(long j4, AnonymousClass1 anonymousClass1) {
            this(j4);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        void encodeValue(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeLong(this.value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && LongValue.class == obj.getClass() && this.value == ((LongValue) obj).value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public long getLong() {
            return this.value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public HeaderType getType() {
            return HeaderType.LONG;
        }

        public int hashCode() {
            long j4 = this.value;
            return (int) (j4 ^ (j4 >>> 32));
        }

        public String toString() {
            return String.valueOf(this.value);
        }

        private LongValue(long j4) {
            this.value = j4;
        }
    }

    private static final class ShortValue extends HeaderValue {
        private final short value;

        /* synthetic */ ShortValue(short s4, AnonymousClass1 anonymousClass1) {
            this(s4);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        void encodeValue(DataOutputStream dataOutputStream) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && ShortValue.class == obj.getClass() && this.value == ((ShortValue) obj).value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public short getShort() {
            return this.value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public HeaderType getType() {
            return HeaderType.SHORT;
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return String.valueOf((int) this.value);
        }

        private ShortValue(short s4) {
            this.value = s4;
        }
    }

    private static final class StringValue extends HeaderValue {
        private final String value;

        /* synthetic */ StringValue(String str, AnonymousClass1 anonymousClass1) {
            this(str);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        void encodeValue(DataOutputStream dataOutputStream) throws IOException {
            Utils.writeString(dataOutputStream, this.value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || StringValue.class != obj.getClass()) {
                return false;
            }
            return this.value.equals(((StringValue) obj).value);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public String getString() {
            return this.value;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public HeaderType getType() {
            return HeaderType.STRING;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return f3.a(new StringBuilder(ProtectedSandApp.s("乢\u0001")), this.value, m0.quote);
        }

        private StringValue(String str) {
            this.value = (String) ValidationUtils.assertNotNull(str, ProtectedSandApp.s("乡\u0001"));
        }
    }

    private static final class TimestampValue extends HeaderValue {
        private final Date value;

        /* synthetic */ TimestampValue(Date date, AnonymousClass1 anonymousClass1) {
            this(date);
        }

        static TimestampValue decode(ByteBuffer byteBuffer) {
            return new TimestampValue(new Date(byteBuffer.getLong()));
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        void encodeValue(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeLong(this.value.getTime());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || TimestampValue.class != obj.getClass()) {
                return false;
            }
            return this.value.equals(((TimestampValue) obj).value);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public long getTimestamp() {
            return this.value.getTime();
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public HeaderType getType() {
            return HeaderType.TIMESTAMP;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return this.value.toString();
        }

        private TimestampValue(Date date) {
            this.value = (Date) ValidationUtils.assertNotNull(date, ProtectedSandApp.s("乣\u0001"));
        }
    }

    private static final class UuidValue extends HeaderValue {
        private final UUID value;

        /* synthetic */ UuidValue(UUID uuid, AnonymousClass1 anonymousClass1) {
            this(uuid);
        }

        static UuidValue decode(ByteBuffer byteBuffer) {
            return new UuidValue(new UUID(byteBuffer.getLong(), byteBuffer.getLong()));
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        void encodeValue(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeLong(this.value.getMostSignificantBits());
            dataOutputStream.writeLong(this.value.getLeastSignificantBits());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || UuidValue.class != obj.getClass()) {
                return false;
            }
            return this.value.equals(((UuidValue) obj).value);
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public HeaderType getType() {
            return HeaderType.UUID;
        }

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.HeaderValue
        public UUID getUuid() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return this.value.toString();
        }

        private UuidValue(UUID uuid) {
            this.value = (UUID) ValidationUtils.assertNotNull(uuid, ProtectedSandApp.s("乤\u0001"));
        }
    }

    protected HeaderValue() {
    }

    static HeaderValue decode(ByteBuffer byteBuffer) {
        AnonymousClass1 anonymousClass1 = null;
        switch (AnonymousClass1.$SwitchMap$com$tencent$cos$xml$model$tag$eventstreaming$HeaderType[HeaderType.fromTypeId(byteBuffer.get()).ordinal()]) {
            case 1:
                return new BooleanValue(true, anonymousClass1);
            case 2:
                return new BooleanValue(false, anonymousClass1);
            case 3:
                return new ByteValue(byteBuffer.get(), anonymousClass1);
            case 4:
                return new ShortValue(byteBuffer.getShort(), anonymousClass1);
            case 5:
                return fromInteger(byteBuffer.getInt());
            case 6:
                return new LongValue(byteBuffer.getLong(), anonymousClass1);
            case 7:
                return fromByteArray(Utils.readBytes(byteBuffer));
            case 8:
                try {
                    return fromString(Utils.readString(byteBuffer));
                } catch (UnsupportedEncodingException e4) {
                    e4.printStackTrace();
                    throw new IllegalStateException();
                }
            case 9:
                return TimestampValue.decode(byteBuffer);
            case 10:
                return UuidValue.decode(byteBuffer);
            default:
                throw new IllegalStateException();
        }
    }

    public static HeaderValue fromBoolean(boolean z4) {
        return new BooleanValue(z4, null);
    }

    public static HeaderValue fromByte(byte b5) {
        return new ByteValue(b5, null);
    }

    public static HeaderValue fromByteArray(byte[] bArr) {
        return new ByteArrayValue(bArr, null);
    }

    public static HeaderValue fromByteBuffer(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        byte[] bArr = new byte[duplicate.remaining()];
        duplicate.get(bArr);
        return fromByteArray(bArr);
    }

    public static HeaderValue fromDate(Date date) {
        return new TimestampValue(date, null);
    }

    public static HeaderValue fromInteger(int i4) {
        return new IntegerValue(i4, null);
    }

    public static HeaderValue fromLong(long j4) {
        return new LongValue(j4, null);
    }

    public static HeaderValue fromShort(short s4) {
        return new ShortValue(s4, null);
    }

    public static HeaderValue fromString(String str) {
        return new StringValue(str, null);
    }

    public static HeaderValue fromTimestamp(long j4) {
        return new TimestampValue(new Date(j4), null);
    }

    public static HeaderValue fromUuid(UUID uuid) {
        return new UuidValue(uuid, null);
    }

    void encode(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(getType().headerTypeId);
        encodeValue(dataOutputStream);
    }

    abstract void encodeValue(DataOutputStream dataOutputStream) throws IOException;

    public boolean getBoolean() {
        throw new IllegalStateException();
    }

    public byte getByte() {
        throw new IllegalStateException(ProtectedSandApp.s("乚\u0001") + getType().name());
    }

    public byte[] getByteArray() {
        throw new IllegalStateException();
    }

    public final ByteBuffer getByteBuffer() {
        return ByteBuffer.wrap(getByteArray());
    }

    public Date getDate() {
        return new Date(getTimestamp());
    }

    public int getInteger() {
        throw new IllegalStateException(ProtectedSandApp.s("乛\u0001") + getType().name());
    }

    public long getLong() {
        throw new IllegalStateException(ProtectedSandApp.s("乜\u0001") + getType().name());
    }

    public short getShort() {
        throw new IllegalStateException(ProtectedSandApp.s("九\u0001") + getType().name());
    }

    public String getString() {
        throw new IllegalStateException();
    }

    public long getTimestamp() {
        throw new IllegalStateException(ProtectedSandApp.s("乞\u0001") + getType().name());
    }

    public abstract HeaderType getType();

    public UUID getUuid() {
        throw new IllegalStateException(ProtectedSandApp.s("也\u0001") + getType().name());
    }
}
