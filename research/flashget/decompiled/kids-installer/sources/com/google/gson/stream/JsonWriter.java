package com.google.gson.stream;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class JsonWriter implements Closeable, Flushable {
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
    private String deferredName;
    private boolean htmlSafe;
    private String indent;
    private boolean lenient;
    private final Writer out;
    private String separator;
    private boolean serializeNulls;
    private int[] stack = new int[32];
    private int stackSize = 0;
    private static final Pattern VALID_JSON_NUMBER_PATTERN = Pattern.compile(ProtectedSandApp.s("㐢"));
    private static final String[] REPLACEMENT_CHARS = new String[128];

    static {
        for (int i5 = 0; i5 <= 31; i5++) {
            REPLACEMENT_CHARS[i5] = String.format(ProtectedSandApp.s("㐣"), Integer.valueOf(i5));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = ProtectedSandApp.s("㐤");
        strArr[92] = ProtectedSandApp.s("㐥");
        strArr[9] = ProtectedSandApp.s("㐦");
        strArr[8] = ProtectedSandApp.s("㐧");
        strArr[10] = ProtectedSandApp.s("㐨");
        strArr[13] = ProtectedSandApp.s("㐩");
        strArr[12] = ProtectedSandApp.s("㐪");
        String[] strArr2 = (String[]) strArr.clone();
        HTML_SAFE_REPLACEMENT_CHARS = strArr2;
        strArr2[60] = ProtectedSandApp.s("㐫");
        strArr2[62] = ProtectedSandApp.s("㐬");
        strArr2[38] = ProtectedSandApp.s("㐭");
        strArr2[61] = ProtectedSandApp.s("㐮");
        strArr2[39] = ProtectedSandApp.s("㐯");
    }

    public JsonWriter(Writer writer) {
        push(6);
        this.separator = ProtectedSandApp.s("㐰");
        this.serializeNulls = true;
        if (writer == null) {
            throw new NullPointerException(ProtectedSandApp.s("㐱"));
        }
        this.out = writer;
    }

    private void beforeName() throws IOException {
        int peek = peek();
        if (peek == 5) {
            this.out.write(44);
        } else if (peek != 3) {
            throw new IllegalStateException(ProtectedSandApp.s("㐲"));
        }
        newline();
        replaceTop(4);
    }

    private void beforeValue() throws IOException {
        int peek = peek();
        if (peek == 1) {
            replaceTop(2);
            newline();
            return;
        }
        if (peek == 2) {
            this.out.append(',');
            newline();
        } else {
            if (peek == 4) {
                this.out.append((CharSequence) this.separator);
                replaceTop(5);
                return;
            }
            if (peek != 6) {
                if (peek != 7) {
                    throw new IllegalStateException(ProtectedSandApp.s("㐴"));
                }
                if (!this.lenient) {
                    throw new IllegalStateException(ProtectedSandApp.s("㐳"));
                }
            }
            replaceTop(7);
        }
    }

    private JsonWriter close(int i5, int i6, char c6) throws IOException {
        int peek = peek();
        if (peek != i6 && peek != i5) {
            throw new IllegalStateException(ProtectedSandApp.s("㐵"));
        }
        if (this.deferredName != null) {
            throw new IllegalStateException(ProtectedSandApp.s("㐶") + this.deferredName);
        }
        this.stackSize--;
        if (peek == i6) {
            newline();
        }
        this.out.write(c6);
        return this;
    }

    private static boolean isTrustedNumberType(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void newline() throws IOException {
        if (this.indent == null) {
            return;
        }
        this.out.write(10);
        int i5 = this.stackSize;
        for (int i6 = 1; i6 < i5; i6++) {
            this.out.write(this.indent);
        }
    }

    private JsonWriter open(int i5, char c6) throws IOException {
        beforeValue();
        push(i5);
        this.out.write(c6);
        return this;
    }

    private int peek() {
        int i5 = this.stackSize;
        if (i5 != 0) {
            return this.stack[i5 - 1];
        }
        throw new IllegalStateException(ProtectedSandApp.s("㐷"));
    }

    private void push(int i5) {
        int i6 = this.stackSize;
        int[] iArr = this.stack;
        if (i6 == iArr.length) {
            this.stack = Arrays.copyOf(iArr, i6 * 2);
        }
        int[] iArr2 = this.stack;
        int i7 = this.stackSize;
        this.stackSize = i7 + 1;
        iArr2[i7] = i5;
    }

    private void replaceTop(int i5) {
        this.stack[this.stackSize - 1] = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void string(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.htmlSafe
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.HTML_SAFE_REPLACEMENT_CHARS
            goto L9
        L7:
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.REPLACEMENT_CHARS
        L9:
            java.io.Writer r1 = r8.out
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L4d
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L3a
            goto L4a
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L30
            java.lang.String r5 = "㐸"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            goto L3a
        L30:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L4a
            java.lang.String r5 = "㐹"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
        L3a:
            if (r4 >= r3) goto L43
            java.io.Writer r6 = r8.out
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L43:
            java.io.Writer r4 = r8.out
            r4.write(r5)
            int r4 = r3 + 1
        L4a:
            int r3 = r3 + 1
            goto L16
        L4d:
            if (r4 >= r1) goto L55
            java.io.Writer r0 = r8.out
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L55:
            java.io.Writer r9 = r8.out
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonWriter.string(java.lang.String):void");
    }

    private void writeDeferredName() throws IOException {
        if (this.deferredName != null) {
            beforeName();
            string(this.deferredName);
            this.deferredName = null;
        }
    }

    public JsonWriter beginArray() throws IOException {
        writeDeferredName();
        return open(1, '[');
    }

    public JsonWriter beginObject() throws IOException {
        writeDeferredName();
        return open(3, '{');
    }

    public JsonWriter endArray() throws IOException {
        return close(1, 2, ']');
    }

    public JsonWriter endObject() throws IOException {
        return close(3, 5, '}');
    }

    public void flush() throws IOException {
        if (this.stackSize == 0) {
            throw new IllegalStateException(ProtectedSandApp.s("㐻"));
        }
        this.out.flush();
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public final boolean isHtmlSafe() {
        return this.htmlSafe;
    }

    public boolean isLenient() {
        return this.lenient;
    }

    public JsonWriter jsonValue(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.append((CharSequence) str);
        return this;
    }

    public JsonWriter name(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("㐽"));
        }
        if (this.deferredName != null) {
            throw new IllegalStateException();
        }
        if (this.stackSize == 0) {
            throw new IllegalStateException(ProtectedSandApp.s("㐼"));
        }
        this.deferredName = str;
        return this;
    }

    public JsonWriter nullValue() throws IOException {
        if (this.deferredName != null) {
            if (!this.serializeNulls) {
                this.deferredName = null;
                return this;
            }
            writeDeferredName();
        }
        beforeValue();
        this.out.write(ProtectedSandApp.s("㐾"));
        return this;
    }

    public final void setHtmlSafe(boolean z5) {
        this.htmlSafe = z5;
    }

    public final void setIndent(String str) {
        if (str.length() == 0) {
            this.indent = null;
            this.separator = ProtectedSandApp.s("㐿");
        } else {
            this.indent = str;
            this.separator = ProtectedSandApp.s("㑀");
        }
    }

    public final void setLenient(boolean z5) {
        this.lenient = z5;
    }

    public final void setSerializeNulls(boolean z5) {
        this.serializeNulls = z5;
    }

    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        string(str);
        return this;
    }

    public JsonWriter value(boolean z5) throws IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(z5 ? ProtectedSandApp.s("㑊") : ProtectedSandApp.s("㑋"));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
        int i5 = this.stackSize;
        if (i5 <= 1 && (i5 != 1 || this.stack[i5 - 1] == 7)) {
            this.stackSize = 0;
            return;
        }
        throw new IOException(ProtectedSandApp.s("㐺"));
    }

    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.write(bool.booleanValue() ? ProtectedSandApp.s("㑂") : ProtectedSandApp.s("㑃"));
        return this;
    }

    public JsonWriter value(double d6) throws IOException {
        writeDeferredName();
        if (!this.lenient && (Double.isNaN(d6) || Double.isInfinite(d6))) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㑁") + d6);
        }
        beforeValue();
        this.out.append((CharSequence) Double.toString(d6));
        return this;
    }

    public JsonWriter value(long j5) throws IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(Long.toString(j5));
        return this;
    }

    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        writeDeferredName();
        String obj = number.toString();
        if (!obj.equals(ProtectedSandApp.s("㑄")) && !obj.equals(ProtectedSandApp.s("㑅")) && !obj.equals(ProtectedSandApp.s("㑆"))) {
            Class<?> cls = number.getClass();
            if (!isTrustedNumberType(cls) && !VALID_JSON_NUMBER_PATTERN.matcher(obj).matches()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("㑇") + cls + ProtectedSandApp.s("㑈") + obj);
            }
        } else if (!this.lenient) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㑉").concat(obj));
        }
        beforeValue();
        this.out.append((CharSequence) obj);
        return this;
    }
}
