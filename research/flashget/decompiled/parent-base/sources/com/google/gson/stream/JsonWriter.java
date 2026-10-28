package com.google.gson.stream;

import androidx.compose.ui.graphics.colorspace.b0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class JsonWriter implements Closeable, Flushable {
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
    private static final String[] REPLACEMENT_CHARS = new String[128];
    private String deferredName;
    private boolean htmlSafe;
    private String indent;
    private boolean lenient;
    private final Writer out;
    private String separator;
    private boolean serializeNulls;
    private int[] stack = new int[32];
    private int stackSize = 0;

    static {
        for (int i4 = 0; i4 <= 31; i4++) {
            REPLACEMENT_CHARS[i4] = String.format(ProtectedSandApp.s("\u05fe\u0001"), Integer.valueOf(i4));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = ProtectedSandApp.s("\u05ff\u0001");
        strArr[92] = ProtectedSandApp.s("\u0600\u0001");
        strArr[9] = ProtectedSandApp.s("\u0601\u0001");
        strArr[8] = ProtectedSandApp.s("\u0602\u0001");
        strArr[10] = ProtectedSandApp.s("\u0603\u0001");
        strArr[13] = ProtectedSandApp.s("\u0604\u0001");
        strArr[12] = ProtectedSandApp.s("\u0605\u0001");
        String[] strArr2 = (String[]) strArr.clone();
        HTML_SAFE_REPLACEMENT_CHARS = strArr2;
        strArr2[60] = ProtectedSandApp.s("؆\u0001");
        strArr2[62] = ProtectedSandApp.s("؇\u0001");
        strArr2[38] = ProtectedSandApp.s("؈\u0001");
        strArr2[61] = ProtectedSandApp.s("؉\u0001");
        strArr2[39] = ProtectedSandApp.s("؊\u0001");
    }

    public JsonWriter(Writer writer) {
        push(6);
        this.separator = ProtectedSandApp.s("؋\u0001");
        this.serializeNulls = true;
        if (writer == null) {
            throw new NullPointerException(ProtectedSandApp.s("،\u0001"));
        }
        this.out = writer;
    }

    private void beforeName() throws IOException {
        int peek = peek();
        if (peek == 5) {
            this.out.write(44);
        } else if (peek != 3) {
            throw new IllegalStateException(ProtectedSandApp.s("؍\u0001"));
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
                    throw new IllegalStateException(ProtectedSandApp.s("؍\u0001"));
                }
                if (!this.lenient) {
                    throw new IllegalStateException(ProtectedSandApp.s("؎\u0001"));
                }
            }
            replaceTop(7);
        }
    }

    private JsonWriter close(int i4, int i5, char c5) throws IOException {
        int peek = peek();
        if (peek != i5 && peek != i4) {
            throw new IllegalStateException(ProtectedSandApp.s("؍\u0001"));
        }
        if (this.deferredName != null) {
            throw new IllegalStateException(ProtectedSandApp.s("؏\u0001") + this.deferredName);
        }
        this.stackSize--;
        if (peek == i5) {
            newline();
        }
        this.out.write(c5);
        return this;
    }

    private void newline() throws IOException {
        if (this.indent == null) {
            return;
        }
        this.out.write(10);
        int i4 = this.stackSize;
        for (int i5 = 1; i5 < i4; i5++) {
            this.out.write(this.indent);
        }
    }

    private JsonWriter open(int i4, char c5) throws IOException {
        beforeValue();
        push(i4);
        this.out.write(c5);
        return this;
    }

    private int peek() {
        int i4 = this.stackSize;
        if (i4 != 0) {
            return this.stack[i4 - 1];
        }
        throw new IllegalStateException(ProtectedSandApp.s("ؐ\u0001"));
    }

    private void push(int i4) {
        int i5 = this.stackSize;
        int[] iArr = this.stack;
        if (i5 == iArr.length) {
            this.stack = Arrays.copyOf(iArr, i5 * 2);
        }
        int[] iArr2 = this.stack;
        int i6 = this.stackSize;
        this.stackSize = i6 + 1;
        iArr2[i6] = i4;
    }

    private void replaceTop(int i4) {
        this.stack[this.stackSize - 1] = i4;
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
            java.lang.String r5 = "ؑ\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            goto L3a
        L30:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L4a
            java.lang.String r5 = "ؒ\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
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
            throw new IllegalStateException(ProtectedSandApp.s("ؐ\u0001"));
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
            throw new NullPointerException(ProtectedSandApp.s("ؔ\u0001"));
        }
        if (this.deferredName != null) {
            throw new IllegalStateException();
        }
        if (this.stackSize == 0) {
            throw new IllegalStateException(ProtectedSandApp.s("ؐ\u0001"));
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
        this.out.write(ProtectedSandApp.s("ؕ\u0001"));
        return this;
    }

    public final void setHtmlSafe(boolean z4) {
        this.htmlSafe = z4;
    }

    public final void setIndent(String str) {
        if (str.length() == 0) {
            this.indent = null;
            this.separator = ProtectedSandApp.s("؋\u0001");
        } else {
            this.indent = str;
            this.separator = ProtectedSandApp.s("ؖ\u0001");
        }
    }

    public final void setLenient(boolean z4) {
        this.lenient = z4;
    }

    public final void setSerializeNulls(boolean z4) {
        this.serializeNulls = z4;
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

    public JsonWriter value(boolean z4) throws IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(z4 ? ProtectedSandApp.s("ؘ\u0001") : ProtectedSandApp.s("ؙ\u0001"));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
        int i4 = this.stackSize;
        if (i4 <= 1 && (i4 != 1 || this.stack[i4 - 1] == 7)) {
            this.stackSize = 0;
            return;
        }
        throw new IOException(ProtectedSandApp.s("ؓ\u0001"));
    }

    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.write(bool.booleanValue() ? ProtectedSandApp.s("ؘ\u0001") : ProtectedSandApp.s("ؙ\u0001"));
        return this;
    }

    public JsonWriter value(double d5) throws IOException {
        writeDeferredName();
        if (!this.lenient && (Double.isNaN(d5) || Double.isInfinite(d5))) {
            throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("ؗ\u0001"), d5));
        }
        beforeValue();
        this.out.append((CharSequence) Double.toString(d5));
        return this;
    }

    public JsonWriter value(long j4) throws IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(Long.toString(j4));
        return this;
    }

    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        writeDeferredName();
        String obj = number.toString();
        if (!this.lenient && (obj.equals(ProtectedSandApp.s("ؚ\u0001")) || obj.equals(ProtectedSandApp.s("؛\u0001")) || obj.equals(ProtectedSandApp.s("\u061c\u0001")))) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ؗ\u0001") + number);
        }
        beforeValue();
        this.out.append((CharSequence) obj);
        return this;
    }
}
