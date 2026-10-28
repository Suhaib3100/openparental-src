package com.google.android.gms.common.server.response;

import androidx.annotation.q0;
import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
final class zag implements zai<BigInteger> {
    zag() {
    }

    @Override // com.google.android.gms.common.server.response.zai
    @q0
    public final /* synthetic */ BigInteger zaa(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        BigInteger zat;
        zat = fastParser.zat(bufferedReader);
        return zat;
    }
}
