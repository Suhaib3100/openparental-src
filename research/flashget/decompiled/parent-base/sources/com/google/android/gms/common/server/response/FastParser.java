package com.google.android.gms.common.server.response;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.r2;
import androidx.compose.foundation.text.q;
import androidx.compose.ui.graphics.vector.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.JsonUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
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
import kotlin.text.m0;
import ve.a;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaa = {'u', 'l', 'l'};
    private static final char[] zab = {'r', 'u', 'e'};
    private static final char[] zac = {'r', 'u', 'e', m0.quote};
    private static final char[] zad = {'a', 'l', 's', 'e'};
    private static final char[] zae = {'a', 'l', 's', 'e', m0.quote};
    private static final char[] zaf = {'\n'};
    private static final zai zag = new zaa();
    private static final zai zah = new zab();
    private static final zai zai = new zac();
    private static final zai zaj = new zad();
    private static final zai zak = new zae();
    private static final zai zal = new zaf();
    private static final zai zam = new zag();
    private static final zai zan = new zah();
    private final char[] zao = new char[1];
    private final char[] zap = new char[32];
    private final char[] zaq = new char[1024];
    private final StringBuilder zar = new StringBuilder(32);
    private final StringBuilder zas = new StringBuilder(1024);
    private final Stack zat = new Stack();

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @ShowFirstParty
    @KeepForSdk
    public static class ParseException extends Exception {
        public ParseException(@o0 String str) {
            super(str);
        }

        public ParseException(@o0 String str, @o0 Throwable th) {
            super(ProtectedSandApp.s("쮈"), th);
        }

        public ParseException(@o0 Throwable th) {
            super(th);
        }
    }

    private static final String zaA(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @q0 char[] cArr2) throws ParseException, IOException {
        sb.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z4 = false;
        boolean z5 = false;
        loop0: while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                throw new ParseException(ProtectedSandApp.s("쮊"));
            }
            int i4 = 0;
            while (i4 < read) {
                char c5 = cArr[i4];
                if (!Character.isISOControl(c5) || (cArr2 != null && cArr2[0] == c5)) {
                    int i5 = i4 + 1;
                    if (c5 == '\"') {
                        if (!z4) {
                            sb.append(cArr, 0, i4);
                            bufferedReader.reset();
                            bufferedReader.skip(i5);
                            return z5 ? JsonUtils.unescapeString(sb.toString()) : sb.toString();
                        }
                    } else if (c5 == '\\') {
                        z4 = !z4;
                        z5 = true;
                        i4 = i5;
                    }
                    z4 = false;
                    i4 = i5;
                }
            }
            sb.append(cArr, 0, read);
            bufferedReader.mark(cArr.length);
        }
        throw new ParseException(ProtectedSandApp.s("쮉"));
    }

    private final char zai(BufferedReader bufferedReader) throws ParseException, IOException {
        if (bufferedReader.read(this.zao) != -1) {
            while (Character.isWhitespace(this.zao[0])) {
                if (bufferedReader.read(this.zao) == -1) {
                }
            }
            return this.zao[0];
        }
        return (char) 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zaj(BufferedReader bufferedReader) throws ParseException, IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        return zam2 == 0 ? p.f60679p : Double.parseDouble(new String(this.zaq, 0, zam2));
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
        int i4;
        int i5;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (zam2 <= 0) {
            throw new ParseException(ProtectedSandApp.s("쮎"));
        }
        char c5 = cArr[0];
        int i6 = c5 == '-' ? Integer.MIN_VALUE : -2147483647;
        int i7 = c5 == '-' ? 1 : 0;
        String s4 = ProtectedSandApp.s("쮋");
        if (i7 < zam2) {
            i5 = i7 + 1;
            int digit = Character.digit(cArr[i7], 10);
            if (digit < 0) {
                throw new ParseException(s4);
            }
            i4 = -digit;
        } else {
            i4 = 0;
            i5 = i7;
        }
        while (i5 < zam2) {
            int i10 = i5 + 1;
            int digit2 = Character.digit(cArr[i5], 10);
            if (digit2 < 0) {
                throw new ParseException(s4);
            }
            String s5 = ProtectedSandApp.s("쮌");
            if (i4 < -214748364) {
                throw new ParseException(s5);
            }
            int i11 = i4 * 10;
            if (i11 < i6 + digit2) {
                throw new ParseException(s5);
            }
            i4 = i11 - digit2;
            i5 = i10;
        }
        if (i7 == 0) {
            return -i4;
        }
        if (i5 > 1) {
            return i4;
        }
        throw new ParseException(ProtectedSandApp.s("쮍"));
    }

    @ResultIgnorabilityUnspecified
    private final int zam(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i4;
        char zai2 = zai(bufferedReader);
        String s4 = ProtectedSandApp.s("쮏");
        if (zai2 == 0) {
            throw new ParseException(s4);
        }
        if (zai2 == ',') {
            throw new ParseException(ProtectedSandApp.s("쮑"));
        }
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return 0;
        }
        bufferedReader.mark(1024);
        if (zai2 == '\"') {
            i4 = 0;
            boolean z4 = false;
            while (i4 < 1024 && bufferedReader.read(cArr, i4, 1) != -1) {
                char c5 = cArr[i4];
                if (Character.isISOControl(c5)) {
                    throw new ParseException(ProtectedSandApp.s("쮉"));
                }
                int i5 = i4 + 1;
                if (c5 == '\"') {
                    if (!z4) {
                        bufferedReader.reset();
                        bufferedReader.skip(i5);
                        return i4;
                    }
                } else if (c5 == '\\') {
                    z4 = !z4;
                    i4 = i5;
                }
                z4 = false;
                i4 = i5;
            }
        } else {
            cArr[0] = zai2;
            i4 = 1;
            while (i4 < 1024 && bufferedReader.read(cArr, i4, 1) != -1) {
                char c6 = cArr[i4];
                if (c6 == '}' || c6 == ',' || Character.isWhitespace(c6) || cArr[i4] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i4 - 1);
                    cArr[i4] = 0;
                    return i4;
                }
                i4++;
            }
        }
        if (i4 == 1024) {
            throw new ParseException(ProtectedSandApp.s("쮐"));
        }
        throw new ParseException(s4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zan(BufferedReader bufferedReader) throws ParseException, IOException {
        long j4;
        int i4;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (zam2 <= 0) {
            throw new ParseException(ProtectedSandApp.s("쮎"));
        }
        char c5 = cArr[0];
        long j5 = c5 == '-' ? Long.MIN_VALUE : -9223372036854775807L;
        int i5 = c5 == '-' ? 1 : 0;
        String s4 = ProtectedSandApp.s("쮋");
        if (i5 < zam2) {
            i4 = i5 + 1;
            int digit = Character.digit(cArr[i5], 10);
            if (digit < 0) {
                throw new ParseException(s4);
            }
            j4 = -digit;
        } else {
            j4 = 0;
            i4 = i5;
        }
        while (i4 < zam2) {
            int i6 = i4 + 1;
            int digit2 = Character.digit(cArr[i4], 10);
            if (digit2 < 0) {
                throw new ParseException(s4);
            }
            String s5 = ProtectedSandApp.s("쮌");
            if (j4 < a.f92845c) {
                throw new ParseException(s5);
            }
            long j6 = j4 * 10;
            int i7 = zam2;
            long j7 = digit2;
            if (j6 < j5 + j7) {
                throw new ParseException(s5);
            }
            j4 = j6 - j7;
            zam2 = i7;
            i4 = i6;
        }
        if (i5 == 0) {
            return -j4;
        }
        if (i4 > 1) {
            return j4;
        }
        throw new ParseException(ProtectedSandApp.s("쮍"));
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
            throw new ParseException(ProtectedSandApp.s("쮒"));
        }
        zax(bufferedReader, zaa);
        return null;
    }

    @q0
    @ResultIgnorabilityUnspecified
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
            throw new ParseException(ProtectedSandApp.s("쮔"));
        }
        if (zai2 != ']') {
            if (zai2 != '}') {
                throw new ParseException(j.a(ProtectedSandApp.s("쮓"), zai2));
            }
            zaw(2);
            return null;
        }
        zaw(2);
        zaw(1);
        zaw(5);
        return null;
    }

    @q0
    private final String zar(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(1024);
        char zai2 = zai(bufferedReader);
        String s4 = ProtectedSandApp.s("쮕");
        int i4 = 1;
        if (zai2 == '\"') {
            int read = bufferedReader.read(this.zao);
            String s5 = ProtectedSandApp.s("쮊");
            if (read == -1) {
                throw new ParseException(s5);
            }
            char c5 = this.zao[0];
            boolean z4 = false;
            do {
                if (c5 == '\"') {
                    if (z4) {
                        c5 = '\"';
                        z4 = true;
                    }
                }
                z4 = c5 == '\\' ? !z4 : false;
                if (bufferedReader.read(this.zao) == -1) {
                    throw new ParseException(s5);
                }
                c5 = this.zao[0];
            } while (!Character.isISOControl(c5));
            throw new ParseException(ProtectedSandApp.s("쮉"));
        }
        if (zai2 == ',') {
            throw new ParseException(ProtectedSandApp.s("쮑"));
        }
        if (zai2 == '[') {
            this.zat.push(5);
            bufferedReader.mark(32);
            if (zai(bufferedReader) == ']') {
                zaw(5);
            } else {
                bufferedReader.reset();
                boolean z5 = false;
                boolean z6 = false;
                while (i4 > 0) {
                    char zai3 = zai(bufferedReader);
                    if (zai3 == 0) {
                        throw new ParseException(ProtectedSandApp.s("쮗"));
                    }
                    if (Character.isISOControl(zai3)) {
                        throw new ParseException(ProtectedSandApp.s("쮖"));
                    }
                    if (zai3 == '\"') {
                        if (!z6) {
                            z5 = !z5;
                        }
                        zai3 = '\"';
                    }
                    if (zai3 == '[') {
                        if (!z5) {
                            i4++;
                        }
                        zai3 = '[';
                    }
                    if (zai3 == ']' && !z5) {
                        i4--;
                    }
                    z6 = (zai3 == '\\' && z5) ? !z6 : false;
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
                    throw new ParseException(j.a(s4, zai4));
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
        if (zai5 != '}') {
            throw new ParseException(j.a(s4, zai5));
        }
        zaw(2);
        return null;
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
    private final ArrayList zau(BufferedReader bufferedReader, zai zaiVar) throws ParseException, IOException {
        char zai2 = zai(bufferedReader);
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return null;
        }
        if (zai2 != '[') {
            throw new ParseException(ProtectedSandApp.s("쮘"));
        }
        this.zat.push(5);
        ArrayList arrayList = new ArrayList();
        while (true) {
            bufferedReader.mark(1024);
            char zai3 = zai(bufferedReader);
            if (zai3 == 0) {
                throw new ParseException(ProtectedSandApp.s("쮏"));
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
    private final ArrayList zav(BufferedReader bufferedReader, FastJsonResponse.Field field) throws ParseException, IOException {
        String s4 = ProtectedSandApp.s("쮙");
        ArrayList arrayList = new ArrayList();
        char zai2 = zai(bufferedReader);
        if (zai2 == ']') {
            zaw(5);
            return arrayList;
        }
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            zaw(5);
            return null;
        }
        String s5 = ProtectedSandApp.s("쮓");
        if (zai2 != '{') {
            throw new ParseException(j.a(s5, zai2));
        }
        this.zat.push(1);
        while (true) {
            try {
                FastJsonResponse zad2 = field.zad();
                if (!zaz(bufferedReader, zad2)) {
                    return arrayList;
                }
                arrayList.add(zad2);
                char zai3 = zai(bufferedReader);
                if (zai3 != ',') {
                    if (zai3 != ']') {
                        throw new ParseException(j.a(s5, zai3));
                    }
                    zaw(5);
                    return arrayList;
                }
                if (zai(bufferedReader) != '{') {
                    throw new ParseException(ProtectedSandApp.s("쮚"));
                }
                this.zat.push(1);
            } catch (IllegalAccessException e4) {
                throw new ParseException(s4, e4);
            } catch (InstantiationException e5) {
                throw new ParseException(s4, e5);
            }
        }
    }

    private final void zaw(int i4) throws ParseException {
        boolean isEmpty = this.zat.isEmpty();
        String s4 = ProtectedSandApp.s("쮛");
        if (isEmpty) {
            throw new ParseException(r2.a(s4, i4, ProtectedSandApp.s("쮝")));
        }
        int intValue = ((Integer) this.zat.pop()).intValue();
        if (intValue != i4) {
            throw new ParseException(q.a(s4, i4, ProtectedSandApp.s("쮜"), intValue));
        }
    }

    private final void zax(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i4 = 0;
        while (true) {
            int length = cArr.length;
            if (i4 >= length) {
                return;
            }
            int read = bufferedReader.read(this.zap, 0, length - i4);
            if (read == -1) {
                throw new ParseException(ProtectedSandApp.s("쮏"));
            }
            for (int i5 = 0; i5 < read; i5++) {
                if (cArr[i5 + i4] != this.zap[i5]) {
                    throw new ParseException(ProtectedSandApp.s("쮞"));
                }
            }
            i4 += read;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zay(BufferedReader bufferedReader, boolean z4) throws ParseException, IOException {
        char zai2 = zai(bufferedReader);
        if (zai2 == '\"') {
            if (z4) {
                throw new ParseException(ProtectedSandApp.s("쮟"));
            }
            return zay(bufferedReader, true);
        }
        if (zai2 == 'f') {
            zax(bufferedReader, z4 ? zae : zad);
            return false;
        }
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return false;
        }
        if (zai2 != 't') {
            throw new ParseException(j.a(ProtectedSandApp.s("쮓"), zai2));
        }
        zax(bufferedReader, z4 ? zac : zab);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0283 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x026e A[SYNTHETIC] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zaz(java.io.BufferedReader r17, com.google.android.gms.common.server.response.FastJsonResponse r18) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaz(java.io.BufferedReader, com.google.android.gms.common.server.response.FastJsonResponse):boolean");
    }

    @KeepForSdk
    public void parse(@o0 InputStream inputStream, @o0 T t4) throws ParseException {
        String s4 = ProtectedSandApp.s("쮓");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zat.push(0);
                char zai2 = zai(bufferedReader);
                if (zai2 == 0) {
                    throw new ParseException(ProtectedSandApp.s("쮩"));
                }
                if (zai2 == '[') {
                    this.zat.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t4.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new ParseException(ProtectedSandApp.s("쮨"));
                    }
                    FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t4.addConcreteTypeArrayInternal(value, value.zae, zav(bufferedReader, value));
                } else {
                    if (zai2 != '{') {
                        throw new ParseException(s4 + zai2);
                    }
                    this.zat.push(1);
                    zaz(bufferedReader, t4);
                }
                zaw(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
            } catch (IOException e4) {
                throw new ParseException(e4);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }
}
