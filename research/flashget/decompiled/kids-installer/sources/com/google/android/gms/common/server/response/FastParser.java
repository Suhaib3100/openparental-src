package com.google.android.gms.common.server.response;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.firebase.remoteconfig.p;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import kotlin.text.Typography;
import v4.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaa = {'u', 'l', 'l'};
    private static final char[] zab = {'r', 'u', 'e'};
    private static final char[] zac = {'r', 'u', 'e', Typography.f27126b};
    private static final char[] zad = {'a', 'l', 's', 'e'};
    private static final char[] zae = {'a', 'l', 's', 'e', Typography.f27126b};
    private static final char[] zaf = {'\n'};
    private static final zai<Integer> zag = new zaa();
    private static final zai<Long> zah = new zab();
    private static final zai<Float> zai = new zac();
    private static final zai<Double> zaj = new zad();
    private static final zai<Boolean> zak = new zae();
    private static final zai<String> zal = new zaf();
    private static final zai<BigInteger> zam = new zag();
    private static final zai<BigDecimal> zan = new zah();
    private final char[] zao = new char[1];
    private final char[] zap = new char[32];
    private final char[] zaq = new char[1024];
    private final StringBuilder zar = new StringBuilder(32);
    private final StringBuilder zas = new StringBuilder(1024);
    private final Stack<Integer> zat = new Stack<>();

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @ShowFirstParty
    @KeepForSdk
    public static class ParseException extends Exception {
        public ParseException(@o0 String str) {
            super(str);
        }

        public ParseException(@o0 String str, @o0 Throwable th) {
            super(ProtectedSandApp.s("\u0bfb"), th);
        }

        public ParseException(@o0 Throwable th) {
            super(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        throw new com.google.android.gms.common.server.response.FastParser.ParseException(com.flashget.kidsdownloader.ProtectedSandApp.s("\u0bfc"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String zaA(java.io.BufferedReader r8, char[] r9, java.lang.StringBuilder r10, @androidx.annotation.q0 char[] r11) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            r0 = 0
            r10.setLength(r0)
            int r1 = r9.length
            r8.mark(r1)
            r1 = r0
            r2 = r1
        La:
            int r3 = r8.read(r9)
            r4 = -1
            if (r3 == r4) goto L6c
            r4 = r0
        L12:
            if (r4 >= r3) goto L64
            char r5 = r9[r4]
            boolean r6 = java.lang.Character.isISOControl(r5)
            if (r6 == 0) goto L35
            if (r11 == 0) goto L29
            r6 = r0
        L1f:
            if (r6 > 0) goto L29
            char r7 = r11[r6]
            if (r7 != r5) goto L26
            goto L35
        L26:
            int r6 = r6 + 1
            goto L1f
        L29:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "\u0bfc"
            java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
            r8.<init>(r9)
            throw r8
        L35:
            r6 = 34
            r7 = 1
            if (r5 != r6) goto L57
            if (r2 != 0) goto L60
            r10.append(r9, r0, r4)
            r8.reset()
            int r4 = r4 + r7
            long r2 = (long) r4
            r8.skip(r2)
            if (r1 == 0) goto L52
            java.lang.String r8 = r10.toString()
            java.lang.String r8 = com.google.android.gms.common.util.JsonUtils.unescapeString(r8)
            return r8
        L52:
            java.lang.String r8 = r10.toString()
            return r8
        L57:
            r6 = 92
            if (r5 != r6) goto L60
            r1 = r2 ^ 1
            r2 = r1
            r1 = r7
            goto L61
        L60:
            r2 = r0
        L61:
            int r4 = r4 + 1
            goto L12
        L64:
            r10.append(r9, r0, r3)
            int r3 = r9.length
            r8.mark(r3)
            goto La
        L6c:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "\u0bfd"
            java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaA(java.io.BufferedReader, char[], java.lang.StringBuilder, char[]):java.lang.String");
    }

    private final char zai(BufferedReader bufferedReader) throws ParseException, IOException {
        if (bufferedReader.read(this.zao) == -1) {
            return (char) 0;
        }
        while (Character.isWhitespace(this.zao[0])) {
            if (bufferedReader.read(this.zao) == -1) {
                return (char) 0;
            }
        }
        return this.zao[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zaj(BufferedReader bufferedReader) throws ParseException, IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        return zam2 == 0 ? p.f18289o : Double.parseDouble(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zak(BufferedReader bufferedReader) throws ParseException, IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zal(BufferedReader bufferedReader) throws ParseException, IOException {
        int i5;
        int i6;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (zam2 <= 0) {
            throw new ParseException(ProtectedSandApp.s("ఁ"));
        }
        char c6 = cArr[0];
        int i7 = c6 == '-' ? Integer.MIN_VALUE : -2147483647;
        int i8 = c6 == '-' ? 1 : 0;
        String s5 = ProtectedSandApp.s("\u0bfe");
        if (i8 < zam2) {
            i6 = i8 + 1;
            int digit = Character.digit(cArr[i8], 10);
            if (digit < 0) {
                throw new ParseException(s5);
            }
            i5 = -digit;
        } else {
            i5 = 0;
            i6 = i8;
        }
        while (i6 < zam2) {
            int i9 = i6 + 1;
            int digit2 = Character.digit(cArr[i6], 10);
            if (digit2 < 0) {
                throw new ParseException(s5);
            }
            String s6 = ProtectedSandApp.s("\u0bff");
            if (i5 < -214748364) {
                throw new ParseException(s6);
            }
            int i10 = i5 * 10;
            if (i10 < i7 + digit2) {
                throw new ParseException(s6);
            }
            i5 = i10 - digit2;
            i6 = i9;
        }
        if (i8 == 0) {
            return -i5;
        }
        if (i6 > 1) {
            return i5;
        }
        throw new ParseException(ProtectedSandApp.s("ఀ"));
    }

    private final int zam(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i5;
        char zai2 = zai(bufferedReader);
        String s5 = ProtectedSandApp.s("ం");
        if (zai2 == 0) {
            throw new ParseException(s5);
        }
        if (zai2 == ',') {
            throw new ParseException(ProtectedSandApp.s("అ"));
        }
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return 0;
        }
        bufferedReader.mark(1024);
        if (zai2 == '\"') {
            i5 = 0;
            boolean z5 = false;
            while (i5 < 1024 && bufferedReader.read(cArr, i5, 1) != -1) {
                char c6 = cArr[i5];
                if (Character.isISOControl(c6)) {
                    throw new ParseException(ProtectedSandApp.s("ః"));
                }
                if (c6 == '\"') {
                    if (!z5) {
                        bufferedReader.reset();
                        bufferedReader.skip(i5 + 1);
                        return i5;
                    }
                } else if (c6 == '\\') {
                    z5 = !z5;
                    i5++;
                }
                z5 = false;
                i5++;
            }
        } else {
            cArr[0] = zai2;
            i5 = 1;
            while (i5 < 1024 && bufferedReader.read(cArr, i5, 1) != -1) {
                char c7 = cArr[i5];
                if (c7 == '}' || c7 == ',' || Character.isWhitespace(c7) || cArr[i5] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i5 - 1);
                    cArr[i5] = 0;
                    return i5;
                }
                i5++;
            }
        }
        if (i5 == 1024) {
            throw new ParseException(ProtectedSandApp.s("ఄ"));
        }
        throw new ParseException(s5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zan(BufferedReader bufferedReader) throws ParseException, IOException {
        long j5;
        int i5;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (zam2 <= 0) {
            throw new ParseException(ProtectedSandApp.s("ఉ"));
        }
        char c6 = cArr[0];
        long j6 = c6 == '-' ? Long.MIN_VALUE : -9223372036854775807L;
        int i6 = c6 == '-' ? 1 : 0;
        String s5 = ProtectedSandApp.s("ఆ");
        if (i6 < zam2) {
            i5 = i6 + 1;
            int digit = Character.digit(cArr[i6], 10);
            if (digit < 0) {
                throw new ParseException(s5);
            }
            j5 = -digit;
        } else {
            j5 = 0;
            i5 = i6;
        }
        while (i5 < zam2) {
            int i7 = i5 + 1;
            int digit2 = Character.digit(cArr[i5], 10);
            if (digit2 < 0) {
                throw new ParseException(s5);
            }
            String s6 = ProtectedSandApp.s("ఇ");
            if (j5 < a.f33895c) {
                throw new ParseException(s6);
            }
            long j7 = j5 * 10;
            int i8 = zam2;
            long j8 = digit2;
            if (j7 < j6 + j8) {
                throw new ParseException(s6);
            }
            j5 = j7 - j8;
            zam2 = i8;
            i5 = i7;
        }
        if (i6 == 0) {
            return -j5;
        }
        if (i5 > 1) {
            return j5;
        }
        throw new ParseException(ProtectedSandApp.s("ఈ"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @q0
    public final String zao(BufferedReader bufferedReader) throws ParseException, IOException {
        return zap(bufferedReader, this.zap, this.zar, null);
    }

    @q0
    private final String zap(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @q0 char[] cArr2) throws ParseException, IOException {
        char zai2 = zai(bufferedReader);
        if (zai2 == '\"') {
            return zaA(bufferedReader, cArr, sb, cArr2);
        }
        if (zai2 != 'n') {
            throw new ParseException(ProtectedSandApp.s("ఊ"));
        }
        zax(bufferedReader, zaa);
        return null;
    }

    @q0
    private final String zaq(BufferedReader bufferedReader) throws ParseException, IOException {
        this.zat.push(2);
        char zai2 = zai(bufferedReader);
        if (zai2 == '\"') {
            this.zat.push(3);
            String zaA = zaA(bufferedReader, this.zap, this.zar, null);
            zaw(3);
            if (zai(bufferedReader) == ':') {
                return zaA;
            }
            throw new ParseException(ProtectedSandApp.s("ఌ"));
        }
        if (zai2 == ']') {
            zaw(2);
            zaw(1);
            zaw(5);
            return null;
        }
        if (zai2 == '}') {
            zaw(2);
            return null;
        }
        StringBuilder sb = new StringBuilder(19);
        sb.append(ProtectedSandApp.s("ఋ"));
        sb.append(zai2);
        throw new ParseException(sb.toString());
    }

    @q0
    private final String zar(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(1024);
        char zai2 = zai(bufferedReader);
        String s5 = ProtectedSandApp.s("\u0c0d");
        int i5 = 1;
        if (zai2 == '\"') {
            int read = bufferedReader.read(this.zao);
            String s6 = ProtectedSandApp.s("\u0c11");
            if (read == -1) {
                throw new ParseException(s6);
            }
            char c6 = this.zao[0];
            boolean z5 = false;
            do {
                if (c6 == '\"') {
                    if (z5) {
                        c6 = '\"';
                        z5 = true;
                    }
                }
                z5 = c6 == '\\' ? !z5 : false;
                if (bufferedReader.read(this.zao) == -1) {
                    throw new ParseException(s6);
                }
                c6 = this.zao[0];
            } while (!Character.isISOControl(c6));
            throw new ParseException(ProtectedSandApp.s("ఒ"));
        }
        if (zai2 == ',') {
            throw new ParseException(ProtectedSandApp.s("ఐ"));
        }
        if (zai2 == '[') {
            this.zat.push(5);
            bufferedReader.mark(32);
            if (zai(bufferedReader) == ']') {
                zaw(5);
            } else {
                bufferedReader.reset();
                boolean z6 = false;
                boolean z7 = false;
                while (i5 > 0) {
                    char zai3 = zai(bufferedReader);
                    if (zai3 == 0) {
                        throw new ParseException(ProtectedSandApp.s("ఏ"));
                    }
                    if (Character.isISOControl(zai3)) {
                        throw new ParseException(ProtectedSandApp.s("ఎ"));
                    }
                    if (zai3 == '\"') {
                        if (!z7) {
                            z6 = !z6;
                        }
                        zai3 = '\"';
                    }
                    if (zai3 == '[') {
                        if (!z6) {
                            i5++;
                        }
                        zai3 = '[';
                    }
                    if (zai3 == ']' && !z6) {
                        i5--;
                    }
                    z7 = (zai3 == '\\' && z6) ? !z7 : false;
                }
                zaw(5);
            }
        } else if (zai2 != '{') {
            bufferedReader.reset();
            zam(bufferedReader, this.zaq);
        } else {
            this.zat.push(1);
            bufferedReader.mark(32);
            char zai4 = zai(bufferedReader);
            if (zai4 == '}') {
                zaw(1);
            } else {
                if (zai4 != '\"') {
                    StringBuilder sb = new StringBuilder(18);
                    sb.append(s5);
                    sb.append(zai4);
                    throw new ParseException(sb.toString());
                }
                bufferedReader.reset();
                zaq(bufferedReader);
                while (zar(bufferedReader) != null) {
                }
                zaw(1);
            }
        }
        char zai5 = zai(bufferedReader);
        if (zai5 == ',') {
            zaw(2);
            return zaq(bufferedReader);
        }
        if (zai5 == '}') {
            zaw(2);
            return null;
        }
        StringBuilder sb2 = new StringBuilder(18);
        sb2.append(s5);
        sb2.append(zai5);
        throw new ParseException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @q0
    public final BigDecimal zas(BufferedReader bufferedReader) throws ParseException, IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @q0
    public final BigInteger zat(BufferedReader bufferedReader) throws ParseException, IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new BigInteger(new String(this.zaq, 0, zam2));
    }

    @q0
    private final <O> ArrayList<O> zau(BufferedReader bufferedReader, zai<O> zaiVar) throws ParseException, IOException {
        char zai2 = zai(bufferedReader);
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return null;
        }
        if (zai2 != '[') {
            throw new ParseException(ProtectedSandApp.s("ఔ"));
        }
        this.zat.push(5);
        ArrayList<O> arrayList = new ArrayList<>();
        while (true) {
            bufferedReader.mark(1024);
            char zai3 = zai(bufferedReader);
            if (zai3 == 0) {
                throw new ParseException(ProtectedSandApp.s("ఓ"));
            }
            if (zai3 != ',') {
                if (zai3 == ']') {
                    zaw(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(zaiVar.zaa(this, bufferedReader));
            }
        }
    }

    @q0
    private final <T extends FastJsonResponse> ArrayList<T> zav(BufferedReader bufferedReader, FastJsonResponse.Field<?, ?> field) throws ParseException, IOException {
        String s5 = ProtectedSandApp.s("క");
        h4.a aVar = (ArrayList<T>) new ArrayList();
        char zai2 = zai(bufferedReader);
        if (zai2 == ']') {
            zaw(5);
            return aVar;
        }
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            zaw(5);
            return null;
        }
        String s6 = ProtectedSandApp.s("ఖ");
        if (zai2 != '{') {
            StringBuilder sb = new StringBuilder(19);
            sb.append(s6);
            sb.append(zai2);
            throw new ParseException(sb.toString());
        }
        this.zat.push(1);
        while (true) {
            try {
                FastJsonResponse zad2 = field.zad();
                if (!zaz(bufferedReader, zad2)) {
                    return aVar;
                }
                aVar.add(zad2);
                char zai3 = zai(bufferedReader);
                if (zai3 != ',') {
                    if (zai3 == ']') {
                        zaw(5);
                        return aVar;
                    }
                    StringBuilder sb2 = new StringBuilder(19);
                    sb2.append(s6);
                    sb2.append(zai3);
                    throw new ParseException(sb2.toString());
                }
                if (zai(bufferedReader) != '{') {
                    throw new ParseException(ProtectedSandApp.s("గ"));
                }
                this.zat.push(1);
            } catch (IllegalAccessException e6) {
                throw new ParseException(s5, e6);
            } catch (InstantiationException e7) {
                throw new ParseException(s5, e7);
            }
        }
    }

    private final void zaw(int i5) throws ParseException {
        boolean isEmpty = this.zat.isEmpty();
        String s5 = ProtectedSandApp.s("ఘ");
        if (isEmpty) {
            StringBuilder sb = new StringBuilder(46);
            sb.append(s5);
            sb.append(i5);
            sb.append(ProtectedSandApp.s("చ"));
            throw new ParseException(sb.toString());
        }
        int intValue = this.zat.pop().intValue();
        if (intValue == i5) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(s5);
        sb2.append(i5);
        sb2.append(ProtectedSandApp.s("ఙ"));
        sb2.append(intValue);
        throw new ParseException(sb2.toString());
    }

    private final void zax(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i5 = 0;
        while (true) {
            int length = cArr.length;
            if (i5 >= length) {
                return;
            }
            int read = bufferedReader.read(this.zap, 0, length - i5);
            if (read == -1) {
                throw new ParseException(ProtectedSandApp.s("జ"));
            }
            for (int i6 = 0; i6 < read; i6++) {
                if (cArr[i6 + i5] != this.zap[i6]) {
                    throw new ParseException(ProtectedSandApp.s("ఛ"));
                }
            }
            i5 += read;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zay(BufferedReader bufferedReader, boolean z5) throws ParseException, IOException {
        char zai2 = zai(bufferedReader);
        if (zai2 == '\"') {
            if (z5) {
                throw new ParseException(ProtectedSandApp.s("ఞ"));
            }
            return zay(bufferedReader, true);
        }
        if (zai2 == 'f') {
            zax(bufferedReader, z5 ? zae : zad);
            return false;
        }
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return false;
        }
        if (zai2 == 't') {
            zax(bufferedReader, z5 ? zac : zab);
            return true;
        }
        StringBuilder sb = new StringBuilder(19);
        sb.append(ProtectedSandApp.s("ఝ"));
        sb.append(zai2);
        throw new ParseException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0285 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zaz(java.io.BufferedReader r14, com.google.android.gms.common.server.response.FastJsonResponse r15) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaz(java.io.BufferedReader, com.google.android.gms.common.server.response.FastJsonResponse):boolean");
    }

    @KeepForSdk
    public void parse(@o0 InputStream inputStream, @o0 T t5) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zat.push(0);
                char zai2 = zai(bufferedReader);
                if (zai2 == 0) {
                    throw new ParseException(ProtectedSandApp.s("ఫ"));
                }
                if (zai2 == '[') {
                    this.zat.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t5.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new ParseException(ProtectedSandApp.s("ప"));
                    }
                    FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t5.addConcreteTypeArrayInternal(value, value.zae, zav(bufferedReader, value));
                } else {
                    if (zai2 != '{') {
                        StringBuilder sb = new StringBuilder(19);
                        sb.append(ProtectedSandApp.s("\u0c29"));
                        sb.append(zai2);
                        throw new ParseException(sb.toString());
                    }
                    this.zat.push(1);
                    zaz(bufferedReader, t5);
                }
                zaw(0);
            } catch (IOException e6) {
                throw new ParseException(e6);
            }
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException unused) {
            }
        }
    }
}
